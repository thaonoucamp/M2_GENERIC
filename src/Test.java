public class Test {
    public static void main(String[] args) {
        MyGeneric<Integer> m1 = new MyGeneric<Integer>();
        m1.add(2);
        System.out.println(m1.get());

        MyGeneric<String> m2 = new MyGeneric<String>();
        m2.add("Hello");
        System.out.println(m2.get());
    }
}
