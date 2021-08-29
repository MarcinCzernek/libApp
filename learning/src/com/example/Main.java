package com.example;

public class Main {
    public static void main(String[] args) {
	int num1 = 324;
	int num2 = 264;
	int result = add(num1,num2);
	System.out.println(result);
    }

    public static int add(int a, int b){
    	return a + b;
    }
}

/*
Stack<String> stack = new Stack<>();
	stack.push("Zielona herbata");
	stack.push("Melisa");
	stack.push("Herbata ekspresowa");
	stack.push("Mięta");
	stack.push("Herbata czerwona");
	String herbataNaGorze = stack.pop();
	System.out.println(herbataNaGorze);
	System.out.println(stack);
	for(int i = 0; i <23;i++){
	    stack.push("Mięta");
    }
        System.out.println(stack);
 */