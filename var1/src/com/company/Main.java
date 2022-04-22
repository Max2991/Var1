package com.company;

public class Main
{

    public static void main(String[] args)
    {
        work example =new work();
        example.add_customer(1,"Vova","Vova@mail.ru");
        System.out.println(example.get_customer(1));
    }
}
