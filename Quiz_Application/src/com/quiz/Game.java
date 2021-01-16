package com.quiz;

public class Game {

    Question[] question = new Question[3];
    Player player = new Player();

    String[] questionData={"Who is the director of Bahubali","How many characters did prabhas played in Bahubali","Who told katappa to kill Bahubali"};
    String[] option1={"Rajamouli","1","Ballaladev"};
    String[] option2={"Shanker","2","BichalaDev"};
    String[] option3={"Trivikram","3","Shivagami"};
    String[] option4={"Bansali","4","Devasena"};

    int[] answers={1,2,3};

    public void gameInit(){
        for(int i=0;i<3;i++){
            question[i]= new Question();
        }
        for(int i=0;i<3;i++)
        {
            question[i].question=questionData[i];
            question[i].option1=option1[i];
            question[i].option2=option2[i];
            question[i].option3=option3[i];
            question[i].option4=option4[i];
            question[i].correctAnswer=answers[i];
        }


    }

    public void play(){

        player.getDetails();
        for(int i=0;i<3;i++){
            boolean status= question[i].askQuestion();
            if (status==true){
                System.out.println("WOW ITS GREAT, YOU PLAYED VERY WELL");
                player.score= player.score+10;
            }
            else{
                System.out.println("I am sorry, its wrong answer. Better Luck next time");
                player.score = player.score-3;
            }
        }
        System.out.println("MR." +player.name+" Your score is "+player.score);
    }

}
