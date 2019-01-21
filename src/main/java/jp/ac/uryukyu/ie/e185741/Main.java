package jp.ac.uryukyu.ie.e185741;

public class Main{
    public static void main(String[] args){
        Field field = new Field(6,6);
        field.prepare();
        field.putKoma(2,2,"B");
        field.putKoma(3,3,"B");
        field.putKoma(3,2,"W");
        field.putKoma(2,3,"W");
        field.feature();
    }
}
