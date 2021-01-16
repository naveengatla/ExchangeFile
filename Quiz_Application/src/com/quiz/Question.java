package com.quiz;
import java.util.Scanner;

public class Question {

    Scanner sc= new Scanner(System.in);
    String question, option1, option2, option3, option4;
    int correctAnswer, userAnswer;

    public boolean askQuestion(){

        System.out.println(question);
        System.out.println("1. "+option1);
        System.out.println("2. "+option2);
        System.out.println("3. "+option3);
        System.out.println("4. "+option4);
        System.out.println("Please enter your answer");
        userAnswer= sc.nextInt();
        if(userAnswer==correctAnswer){
            return true;
        }
        return false;

    }

}
