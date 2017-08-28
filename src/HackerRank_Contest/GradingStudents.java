package HackerRank_Contest;


import java.util.Scanner;

public class GradingStudents {

    static int[] solve(int[] grades){
        for(int j=0;j<grades.length;j++){

            int newAmount=increaseAmount(grades[j]);
            int differ=newAmount-grades[j];
            if(differ<3 && grades[j]>=38) grades[j]=newAmount;
        }
        // Complete this function
        return grades;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


    }


    private static int increaseAmount(int existingAmount){
        int newAmount=0;
        if(existingAmount>0 && existingAmount<=5) newAmount=5;
        else if(existingAmount>5 && existingAmount<=10) newAmount=10;
        else if(existingAmount>10 && existingAmount<=15) newAmount=15;
        else if(existingAmount>15 && existingAmount<=20) newAmount=20;
        else if(existingAmount>20 && existingAmount<=25) newAmount=25;
        else if(existingAmount>25 && existingAmount<=30) newAmount=30;
        else if(existingAmount>30 && existingAmount<=35) newAmount=35;
        else if(existingAmount>35 && existingAmount<=40) newAmount=40;
        else if(existingAmount>40 && existingAmount<=45) newAmount=45;
        else if(existingAmount>45 && existingAmount<=50) newAmount=50;
        else if(existingAmount>50 && existingAmount<=55) newAmount=55;
        else if(existingAmount>55 && existingAmount<=60) newAmount=60;
        else if(existingAmount>60 && existingAmount<=65) newAmount=65;
        else if(existingAmount>65 && existingAmount<=70) newAmount=70;
        else if(existingAmount>70 && existingAmount<=75) newAmount=75;
        else if(existingAmount>75 && existingAmount<=80) newAmount=80;
        else if(existingAmount>80 && existingAmount<=85) newAmount=85;
        else if(existingAmount>85 && existingAmount<=90) newAmount=90;
        else if(existingAmount>90 && existingAmount<=95) newAmount=95;
        else if(existingAmount>95 && existingAmount<=100) newAmount=100;

        return newAmount;
    }
}
