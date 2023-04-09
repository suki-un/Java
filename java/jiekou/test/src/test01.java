public class test01 {
    public static void main(String[] args) {

    }
}
//定义一个接口
interface i{

}
interface j {

}
//继承
interface i2 extends i {

}
//接口支持多继承
interface i3 extends i,j{

}

//类也能多继承
class i4 implements i, j, i2,i3 {

}