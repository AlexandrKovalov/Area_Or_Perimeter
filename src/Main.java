public class Main {
    public static void main(String[] args) {
        System.out.println(areaOrPerimeter(12, 23));
        System.out.println(areaOrPerimeter(12, 12));
    }
    public static int areaOrPerimeter (int l, int w) {
        if ( l == w) {
            return l  * w;
        } else {
            return 2*l + 2*w;
        }
    }
}