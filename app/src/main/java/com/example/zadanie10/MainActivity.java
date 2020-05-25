package com.example.zadanie10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view)
    {
        int[][] massivchek =new int[10][10];
        for (int i = 0; i < massivchek.length; i++)
        {
            for (int j = 0; j < massivchek[i].length; j++)
            {
                massivchek [i][j] = j + 1;
            }
        }
        for (int[] an : massivchek)
        {
            for (int anAn : an) {
                System.out.print(anAn + " ");
            }
            System.out.println();
        }
        int max = massivchek[0][0];
        for (int i = 1; i < massivchek.length; i++)
        {
            max = Math.max(max, massivchek[i].length);
        }
        int x=massivchek.length;
        int a1 = 0;
        int a2 = 0;
        int a3 = 0;
        int a4 = 0;
        int a5 = 0;
        int a6 = 0;
        int a7 = 0;
        int a8 = 0;
        int a9 = 0;
        int a10 = 0;
        for (int i=0;i<x;i++)
        {
            a1+=i+massivchek[i][0];
        }
        System.out.println(a1);
        for (int i=0;i<x;i++)
        {
            a2+=i+massivchek[i][1];
        }
        System.out.println(a2);
        for (int i=0;i<x;i++)
        {
            a3+=i+massivchek[i][2];
        }
        System.out.println(a3);
        for (int i=0;i<x;i++)
        {
            a4+=i+massivchek[i][3];
        }
        System.out.println(a4);
        for (int i=0;i<x;i++)
        {
            a5+=i+massivchek[i][4];
        }
        System.out.println(a5);
        for (int i=0;i<x;i++)
        {
            a6+=i+massivchek[i][5];
        }
        System.out.println(a6);
        for (int i=0;i<x;i++)
        {
            a7+=i+massivchek[i][0];
        }
        System.out.println(a7);
        for (int i=0;i<x;i++)
        {
            a8+=i+massivchek[i][0];
        }
        System.out.println(a8);
        for (int i=0;i<x;i++)
        {
            a9+=i+massivchek[i][0];
        }
        System.out.println(a9);
        for (int i=0;i<x;i++)
        {
            a10+=i+massivchek[i][0];
        }
        System.out.println(a10);
    }
}
