interface interface1 {
    void show();

}

// class B implements interface1
// {
// public void show()
// {
// System.out.println("Print Anything ");
// }
// }

class Check {
    /**
     * @param args
     */
    public static void main(String[] args) {
        interface1 obj = new interface1() {
            public void show() {
                System.out.println("Print Anything ");
            }
        };

        obj.show();

    }
}

