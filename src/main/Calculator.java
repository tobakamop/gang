package main;

public class Calculator {
    public int add(int n1, int n2) {
        return n1 + n2;
    }
    public int add(int ...n) {
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum += n[i];
        }
        return sum;
    }

    public int multiply(int ...i) {
        int n = 1;
        for (int j = 0; j < i.length; j++) {
            n *= i[j];
        }
        return n;
    }

   }

