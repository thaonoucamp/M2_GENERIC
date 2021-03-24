public class TestGeneric {
    public static <E> void printArray(E[] elements) {
        for (E element :
                elements) {
            System.out.printf(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {10, 20, 30, 40, 50};
        Character[] charArray = {'J', 'A', 'V', 'A'};

        System.out.println("In mang do nguyen");
        printArray(intArray);

        System.out.println("In mang ky tu");
        printArray(charArray);
    }
}
