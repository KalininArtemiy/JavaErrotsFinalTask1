package Lesson_1.Classwork;


public class Task1 {
    public static void main(String[] args) {
        Integer[] mas = {1,2,3,4};
        System.out.println(CheckSize(mas));
    }


    public static Integer CheckSize (Integer[] mas){
        if (mas.length < 5){
            return -1;
        }else{
            return mas.length;
        }
    }
}


