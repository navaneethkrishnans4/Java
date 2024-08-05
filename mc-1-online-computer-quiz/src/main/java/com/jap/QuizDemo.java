package com.jap;

import java.sql.SQLOutput;

import static java.lang.Integer.parseInt;

public class QuizDemo {

    //return the school name which has got the highest score in quiz
    //Handle the NumberFormatException
    public String highestScore(String []nameOfSchool , String[] scores ){

        String name ="";
        try {
            int max = parseInt(scores[0]);
            int i =0;
            for (String score : scores ) {
                if(i< scores.length) {
                    if (max < parseInt(score)) {
                        name = nameOfSchool[i];
                    }
                    i++;
                }
            }
        }catch (NumberFormatException exception)
        {
            return ("java.lang.NumberFormatException: "+exception.getMessage());
        }
        return name;

    }
    //convert all the names in uppercase
    //Handle the NullPointerException
    public String[] convertAllNamesToCapital(String name[]){
        String upperCase[] = new String[0];
        try {
            for (int i = 0; i < name.length; i++) {
                upperCase[i] = name[i].toUpperCase();
            }
        }catch (NullPointerException exception)
        {
            System.out.println(exception.getMessage());
        }
        return upperCase;
    }
}






