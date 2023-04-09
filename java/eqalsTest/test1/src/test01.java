import java.util.Objects;

public class test01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a==b);
        mytime my = new mytime(10,20);
        mytime my2 = new mytime(10,20);
        //System.out.println(my==my2);
        System.out.println(my.equals(my2));

    }
}
class mytime{
    private int a;
    private int b;

    public mytime(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public mytime() {
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        mytime mytime = (mytime) o;
        return a == mytime.a && b == mytime.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    @Override
    public String toString() {
        return "mytime{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
