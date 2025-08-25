package org.example;
//Question: Create a program using SoftReference and show that objects are
// retained until memory pressure.

import java.lang.ref.*;

public class SoftReference {
    public static void main(String[] args) {
        String strong = new String("Soft Reference Example");

        java.lang.ref.SoftReference<String> softRef = new  java.lang.ref.SoftReference<>(strong);

        System.out.println("Before GC: " + softRef.get());

        strong = null;
        System.gc();

        System.out.println("After GC: " + softRef.get());

        // Simulate memory pressure
        try {
            byte[] memoryFill = new byte[1024 * 1024 * 100]; // Allocate 100MB
        } catch (OutOfMemoryError e) {
            System.out.println("Memory pressure occurred!");
        }

        System.out.println("After memory pressure: " + softRef.get());
    }
}
