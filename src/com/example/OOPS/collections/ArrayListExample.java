package com.example.OOPS.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {


    public static void main(String[] args) {
        ArrayList list =new ArrayList();
        list.add("VAishu");
        list.add(21);
        list.add(true);
        list.add(12.32);
        System.out.println(list);

        List<String> list1 =new ArrayList();
        list1.add("VAishu");
        list1.add("Harshi");
        list1.add("Chinmayi");
        list1.add("VAISHUUU");
        System.out.println(list1);

        System.out.println(list1);
        list1.remove(1);
        System.out.println(list1);

        List<Book> bookList=new ArrayList();
        Book b2=new Book(100,"Java","James Gosling");
        bookList.add(b2);
        bookList.add(new Book(100,"Tell me your dreams","Sidney Sheldon"));
        System.out.println(bookList);

    }
}
