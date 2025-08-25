package org.example;
//Question: Use PhantomReference with ReferenceQueue to check when an object is
// about to be collected.

import java.lang.ref.*;
import java.lang.ref.ReferenceQueue;

public class PhantomReference {
    public static void main(String[] args) {
        String strong = new String("Phantom Reference Example");

        ReferenceQueue<String> refQueue = new ReferenceQueue<>();
        java.lang.ref.PhantomReference<String> phantomRef = new java.lang.ref.PhantomReference<>(strong, refQueue);

        strong = null;

        System.gc();

        if (phantomRef.get() == null) {
            System.out.println("Phantom reference always returns null");
        }

        if (refQueue.poll() != null) {
            System.out.println("Object is ready to be garbage collected");
        } else {
            System.out.println("Object not yet collected");
        }
    }
}
