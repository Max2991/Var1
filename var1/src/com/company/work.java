package com.company;

import java.util.HashMap;

public class work
{
    //Создается коллекция , где ключем является id клиента ,а значение еще одна коллекция ,где ключ это его имя , а значение это почта
    HashMap<Integer,HashMap<String,String>> customers =new HashMap<>();
    //Создается коллекция , где ключем является id заказа ,а значение еще одна коллекция ,где ключ это его id клиента , а значение это описание заказа
    HashMap<Integer,HashMap<Integer,String>> orders=new HashMap<>();

    public void add_customer(int id,String name,String email)
    {
        HashMap<String,String> customer=new HashMap<String,String>();
        customer.put(name,email);
        customers.put(id,customer);
    }
    public void add_order(int order_id,int customer_id,String description)
    {
        HashMap <Integer,String> order=new HashMap<>();
        order.put(customer_id,description);
        orders.put(order_id,order);
    }
    public HashMap<String,String> get_customer(int id)
    {
        return customers.get(id);
    }
    public HashMap<Integer,String> get_order(int id)
    {
        return orders.get(id);
    }
}
