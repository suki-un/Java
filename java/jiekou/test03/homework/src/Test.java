public class Test {
    public static void main(String[] args) {
        ChinaChuShi c = new ChinaChuShi();
        USAChuShi u = new USAChuShi();
        GuKe g = new GuKe(c);
        g.add();
        GuKe h = new GuKe(u);
        h.add();
    }
}
