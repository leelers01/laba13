package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        Tester tester = new Tester("Валерия", "Абабурко", 5, "Нормальный", 4000.0);
        tester.printInfo(true);
        Tester.printing();
    }
}
