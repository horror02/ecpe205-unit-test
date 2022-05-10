package com.ecpe205;

public class Calculator {
    public double sum( double a, double b ) {
        return a + b;
    }
    public boolean isEven (int value) {
        return value % 2 == 0;
    }
    public boolean isOdd (int value) {
        return value % 2 == 1;
    }

    //create a method that computes base x power of y
    //use parameterizedTest methodsource - 5 sets to test
    public double pow( double x, double y ){
        double pow = 1;
        for(int i = 1; i<=y; i++){
            pow = pow * x;
        }
        return pow;
    }

    //create a method that computes for the factorial of a value
    //use parameterizedTest- 5 values to test
    public double factorial(double value) {
        int n;
        if (value >= 0) {
            n = 1;
            for (int i = 1; i <= value; i++) {
                n = n * i;
            }
            return n;
        }
    }

    //create a method that checks if a given string is a palindrome
    //use parameterizedTest - 5 values to test
        public boolean Palindrome(String value) {
            int i = 0, j = value.length() - 1;

            while (i < j) {

                if (value.charAt(i) != value.charAt(j))
                    return false;
                i++;
                j--;
            }


            //create a method that accepts an array of integer values, the method then sorts the value in ascending order
            //** you may choose whatever sort data structure (bubble sort, shell sort,...)
            //use parameterizedTest methodSource

            public int[] Sort ( int[] arr){
                int temp;

                for (int i = 0; i < arr.length; i++) {
                    for (int j = i + 1; j < arr.length; j++) {
                        if (arr[i] > arr[j]) {
                            temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;
                        }
                    } return arr;
          }

            }


        }