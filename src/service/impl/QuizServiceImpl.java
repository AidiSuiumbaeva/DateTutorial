package service.impl;

import com.sun.org.apache.xpath.internal.operations.Bool;
import service.DbHelper;
import service.QuizService;

import java.util.*;

public class QuizServiceImpl implements QuizService {

    DbHelper dbHelper=new DbHelperImpl();
    Scanner scanner=new Scanner(System.in);



    @Override
    public void start() {
        dbHelper.getMap();
        int correctAnswer=0;

        for (int i=0;i<5;i++){
            //TODO
            HashMap<String,HashMap<String, Boolean>> option=dbHelper.getQuestion();

            ArrayList<String> cities=new ArrayList<>();
            for(Map.Entry<String,HashMap<String,Boolean>> item:option.entrySet()){
                System.out.println("Угадайте столицу страны: "+item.getKey());

                for(Map.Entry<String,Boolean> city:item.getValue().entrySet()){
                    cities.add(city.getKey());
                }
                Collections.shuffle(cities);
                System.out.println("Варианты ответов ");
                for (String capitals:cities){
                    System.out.println(capitals);
                }

                //TODO Обработать ошибку при написании варианта отличного из предоставленных
                String answer= scanner.next();

                if (item.getValue().get(answer)){
                    correctAnswer++;
                }
            }
        }

        int result=correctAnswer*100/5;

        System.out.println("Правильных ответов "+correctAnswer);
        System.out.println("Процент правильных ответов "+result);


    }
}
