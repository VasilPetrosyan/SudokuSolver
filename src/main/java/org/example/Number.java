package org.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashSet;

public class Number {
    private HashSet<Character> domain= new HashSet<>();

    public Number()
    {
        for(int i=1;i<=9;i++)
        {
            domain.add((char)(i+'0'));
        }
    }

    public void addToDomain(char num)
    {
        domain.add(num);
    }

   public boolean remove(char num)
   {
       try {
           domain.remove(num);
           return true;
       }
       catch (Exception e)
       {
           return ! domain.isEmpty();
       }

   }

}
