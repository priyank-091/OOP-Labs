class Variable {
    static int c = 30; // static variable
    int a; // instance variable

    public static void main(String args[]) {
        int b = 20; // local variables
        System.out.println(c); // directly accessible
        System.out.println(b); // directly accessible
        Variable obj = new Variable();
        // System.out.println(a) // This will give an error
        System.out.println(obj.a); // called through the object obj.
    }
}