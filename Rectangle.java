public class Rectangle {
    int l, w;

    Rectangle(int l, int w) {
        this.l = l;
        this.w = w;
    }

    public int calArea() {
        return l * w;
    }

    public static void main(String[] args) {
        Rectangle rects[] = {new Rectangle(8, 6), new Rectangle(7, 7)};
        for (int i = 0; i < 2; i++) {
            System.out.println("Rectangle" + (i + 1) + "'s area is " + rects[i].calArea());
        }
    }
}
