package com.example.thread.callable;

interface Drawable{  
    public void draw(int a); 
}  
  
public class LambdaExpressionExample {  
    public static void main(String[] args) {  
        int width=10;  
          
        //with lambda  
        Drawable d2=(a)->{  
            System.out.println("Drawing "+width);  
        };  
        d2.draw(10);  
    }  
}  