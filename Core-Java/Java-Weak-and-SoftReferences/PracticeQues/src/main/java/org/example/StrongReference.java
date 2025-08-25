package org.example;

//Que- Write a program to demonstrate a Strong Reference in Java and show that the
// object is not garbage collected until explicitly set to null.
public class StrongReference {
    public static void main(String[] args) {
        String strongRef = new String("Strong Reference Example");

        // The object will not be garbage collected as long as strongRef points to it
        System.out.println("Before GC- " + strongRef);

        System.gc(); // Request GC

        System.out.println("After GC- " + strongRef);

        // Nullify reference
        strongRef = null;

        System.gc();
        System.out.println("After nullifying reference, object is eligible for GC");
    }
}
