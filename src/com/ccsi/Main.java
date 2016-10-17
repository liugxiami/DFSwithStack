package com.ccsi;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(fibo(9));
    }
    //recursion
    public static int fibo(int k){
        if(k==1)return 1;
        else if(k==2)return 2;
        else{
            return fibo(k-1)+fibo(k-2);
        }
    }
    //loop
    public static int fibo1(int k){
        Stack<Integer> stack=new Stack<>();  //将recursion换成非递归的关键就是善于利用Stack
        for (int i = 1; i <=k; i++) {
            if(i==1)stack.push(1);
            else if(i==2)stack.push(2);
            else{
                int temp1=stack.pop();
                int temp2=stack.pop();
                int temp=temp1+temp2;
                stack.push(temp1);
                stack.push(temp);
            }
        }
        return stack.pop();
    }

}




