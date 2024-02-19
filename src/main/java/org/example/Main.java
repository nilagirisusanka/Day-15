package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
Calculate calci=new Calculate();
int sum=calci.calculate(9,9);
System.out.println("sum is : " +sum);
        int difference=calci.calculate(9,5);
        System.out.println("Difference is : " +difference);
    }
}