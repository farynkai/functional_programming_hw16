package app;

import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        // 1. Anonymous class - MathOperation
        System.out.println("1. MathOperation (Anonymous Class):");
        MathOperation add = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };
        System.out.println("   5 + 3 = " + add.operate(5, 3) + "\n");

        // 2. Lambda - StringManipulator
        System.out.println("2. StringManipulator (Lambda):");
        StringManipulator toUpperCase = input -> input.toUpperCase();
        System.out.println("   \"hello world\" -> \"" + toUpperCase.manipulate("hello world") + "\"\n");

        // 3. Method reference - Function
        System.out.println("3. StringListProcessor (Method Reference):");
        Function<String, Integer> counter = StringListProcessor::countUppercase;
        System.out.println("   \"Hello World\" has " + counter.apply("Hello World") + " uppercase letters\n");

        // 4. Supplier
        System.out.println("4. RandomNumberGenerator (Supplier):");
        Supplier<Integer> randomSupplier = () -> RandomNumberGenerator.generateRandomNumber(20, 50);
        for (int i = 1; i <= 3; i++) {
            System.out.println("   Random #" + i + ": " + randomSupplier.get());
        }
    }
}
