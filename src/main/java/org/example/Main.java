package org.example;

class Main {
    public static void main(String[] args) {

        gugudan(8,1);


    }
    public  static  void gugudan(int dan , int i)
    {
        if(i >= 1000)return;
        {
            System.out.println(dan + "x" +i +"=" + dan * i);
            gugudan(dan, i + 1);
        }
    }
}
