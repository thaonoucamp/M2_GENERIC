import java.util.ArrayList;
import java.util.List;

public class Test5 {
    public static void drawShapes(List<? extends Shape> list) {
        for (Shape s : list) {
            s.draw();
        }
    }

    public static void main(String[] args) {
        List<Rectangle> list1 = new ArrayList<Rectangle>();
        list1.add(new Rectangle());

        List<Circle> list2 = new ArrayList<Circle>();
        list2.add(new Circle());
        list2.add(new Circle());

        drawShapes(list1);
        drawShapes(list2);
    }
}
