package dev.omega.githubactionsmaven;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int sum = addNumbers(2,6);
        System.out.println("Sum is : "+sum);
    }

    public static int addNumbers(int a,int b){
        return a+b;
    }
}