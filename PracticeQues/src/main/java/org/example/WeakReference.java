package org.example;


public class WeakReference {
    public static void main(String[] args) {
        String strong = new String("Weak Reference Example");

        java.lang.ref.WeakReference<String> weakRef = new java.lang.ref.WeakReference<>(strong);

        System.out.println("Before GC: " + weakRef.get());

        // Remove strong reference
        strong = null;

        System.gc(); // Force GC

        if (weakRef.get() == null) {
            System.out.println("Object has been garbage collected");
        } else {
            System.out.println("Object is still alive: " + weakRef.get());
        }
    }
}
