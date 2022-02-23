package com.example.mypackage;

public class Series {
    public static long nSum(int n){
//        long sum = 0;
//        for(int i = 0; i <= n; i++){
//            sum += i;
//        }
//
//        return sum;
        return (n * (n +1) /2);
    }

    public static long factorial(int n){
        if(n == 0){
            return 1;
        }
        long product = 1;
        for(int i = 1; i <= n; i++){
            product *= i;
        }

        return product;
    }

    public static long fibonacci(int n){
        if(n == 0){
            return 0;
        } else if(n ==1){
            return 1;
        }
        long nMinus1 = 1;
        long nMinus2 = 0;
        long fib = 0;
        for (int i = 1; i<n; i++){
            fib = (nMinus2 + nMinus1);
            nMinus2 = nMinus1;
            nMinus1 = fib;
        }
return fib;
//        return fibonacci(n-1) + fibonacci(n-2);
    }
}