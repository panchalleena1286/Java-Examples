package OverridingConcept;

// #Method Oveeriding 
//Modifying a super class method in the sub class is called method overriding. Using method overriding,
 //we can change super class method according to the requirements of sub class.

public class Example {
    // Case 1: Normal Overriding (Works Fine)
        // class Parent1 {
        //     void display() {
        //         System.out.println("Parent1 display");
        //     }
        // }

        // class Child1 extends Parent1 {
        //     void display() {   // override
        //         System.out.println("Child1 display");
        //     }
        // }

// Case 2: Static Method Hiding (No Overriding, Hiding Happens)
class Parent2 {
    static void show() {
        System.out.println("Parent2 show");
    }
}

class Child2 extends Parent2 {
    static void show() {   // hides Parent2.show()
        System.out.println("Child2 show");
    }
}

// Case 3: Compile-time Error (Mixing static and non-static)
// class Parent3 {
//     void test() {   // non-static
//         System.out.println("Parent3 test");
//     }
// }

// class Child3 extends Parent3 {
//     // ❌ ERROR: cannot override non-static with static
//     static void test() {
//         System.out.println("Child3 test");
//     }
}

// public class TestAll {
//     public static void main(String[] args) {
//         // Case 1: Overriding
//         Parent1 p1 = new Child1();
//         p1.display(); // Output: Child1 display

//         // Case 2: Static Method Hiding
//         Parent2 p2 = new Child2();
//         p2.show();    // Output: Parent2 show (depends on reference type)

//         Child2.show(); // Output: Child2 show (class name call)

//         // Case 3 will not compile if uncommented
//         // Parent3 p3 = new Child3();
//         // p3.test(); 
//     }
// }

