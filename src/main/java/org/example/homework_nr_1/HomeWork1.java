package org.example.homework_nr_1;

public class HomeWork1 {
    public static void main(String[] args) {
       System.out.println("Hello world!");
       int CurrentWorldPopulation = 781108815;
       int CarsProducedThisYear = 55235358;
       char FirstLetterInAlphabet ='A';
       boolean JavaIsAmazing = true;
       float PI = 3.14F;

       System.out.println(CurrentWorldPopulation);
       System.out.println(CarsProducedThisYear);
       System.out.println(FirstLetterInAlphabet);
       System.out.println(JavaIsAmazing);
       System.out.println(PI);

       double Price = 32.234;
       double Tax = 1245.464634;
       int Quantity = 4345;
       double Sum = 0;

       System.out.println(Price);
       System.out.println(Tax);
       System.out.println(Quantity);
       System.out.println(Sum);

       int total = (int) (Price + Tax * Quantity + Sum);
       System.out.println(total);

    }
}
