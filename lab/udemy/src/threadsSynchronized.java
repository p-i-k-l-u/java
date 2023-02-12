class threadsSynchronized {
    public synchronized void printTable(int a) // two threads are come into the synchronized method

    {
        for (int i = 1; i <= 10; i++)
            System.out.println("Table is :" + a * i);
    }
}

class threads1 extends Thread {
    // now we create a threadsSynchronized class reference
    threadsSynchronized ref;

    // inside the threads1 class now create constructor
    threads1(threadsSynchronized ref)// pass the object reference -> threadsSynchronized ref
    {
        // now we store the value of ref in the ref
        this.ref = ref;// that reference will now act like an object
        // this -> keyword work refer to the current object
    }

    // method
    public void run() {
        // PrintTable call
        // ref -> now an object
        ref.printTable(5);// now we not call printTable method because printTable method in
        // threadsSynchronized class

    }

}

class threads2 extends Thread {
    threadsSynchronized ref;

    threads2(threadsSynchronized ref) {
        this.ref = ref;
    }

    public void run() {
        ref.printTable(6);
    }
}

class Main {
    public static void main(String args[]) {
        threadsSynchronized obj1 = new threadsSynchronized();// now obj1 have -> one lock

        threads1 t1 = new threads1(obj1);
        threads2 t2 = new threads2(obj1);
        // start method run
        t1.start();
        t2.start();
    }
}
