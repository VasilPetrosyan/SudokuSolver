package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static  ArrayList<ArrayList<Object>> intitliser() throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("sudoku.txt"));
        ArrayList<ArrayList<Object>> board = new ArrayList<>();
        int c=0;
        String sr="";
        while((sr=in.readLine()) != null) {

            ArrayList<Object> row=new ArrayList<>();
            for(char a: sr.toCharArray())
            {
                if(a=='.')
                {
                    row.add(new Number());
                }
                else
                {
                    row.add(a);
                }

            }
            board.add(row);
        }
        return board;
    }

    public static void main(String[] args)  {

        ArrayList<ArrayList<Object>> board;
        try {
           board=intitliser();
            //restrictDomain(board);

        }
        catch (Exception e)
        {
            System.out.println("error");
        }



    }

    private static void restrictDomain(ArrayList<ArrayList<Object>> board, int i, int j) {

        for(int k=0;k<9;k++)
        {
            if(board.get(i).get(k) instanceof Character)
            {
                (Number)(board.get(i).get(j)).remove(board.get(i).get(k));
                //return false;
            }

        }
        for(int k=0;k<9;k++)
        {
            if(board.get(k).get(j).equals(val))//[k][j]==val)
            {
                return false;
            }
            else
            {
                if(board.get(k).get(j) instanceof Number)
                {
                    ((Number) board.get(k).get(j)).remove(val);
                }
            }
        }
        for(int k=(i/3)*3;k<(i/3)*3+3;k++)
        {
            for(int l=(j/3)*3;l<(j/3)*3+3;l++)
            {
                if(board.get(k).get(l).equals(val))
                {
                    return false;
                }
                else
                {
                    if(board.get(k).get(l) instanceof Number)
                    {
                        ((Number) board.get(k).get(l)).remove(val);
                    }
                }
            }
        }
    }

    public boolean checkvalid(char val, int i, int j, ArrayList<ArrayList<Object>> board)
    {
        for(int k=0;k<9;k++)
        {
            if(board.get(i).get(k).equals(val))
            {
                return false;
            }
            else
            {
                if(board.get(i).get(k) instanceof Number)
                {
                    ((Number) board.get(i).get(k)).remove(val);
                }
            }
        }
        for(int k=0;k<9;k++)
        {
            if(board.get(k).get(j).equals(val))//[k][j]==val)
            {
                return false;
            }
            else
            {
                if(board.get(k).get(j) instanceof Number)
                {
                    ((Number) board.get(k).get(j)).remove(val);
                }
            }
        }
        for(int k=(i/3)*3;k<(i/3)*3+3;k++)
        {
            for(int l=(j/3)*3;l<(j/3)*3+3;l++)
            {
                if(board.get(k).get(l).equals(val))
                {
                    return false;
                }
                else
                {
                    if(board.get(k).get(l) instanceof Number)
                    {
                        ((Number) board.get(k).get(l)).remove(val);
                    }
                }
            }
        }


        return true;
    }


}