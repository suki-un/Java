package www.lycoris.enum1;
/*
* 使用枚举重写EnumTest01
* */
public class EnumTest02 {
    public static void main(String[] args){
        Result r = EnumTest02.jiSuan(1,0);
        System.out.println(r == Result.zhengQue ? "计算正确":"计算错误");
    }

    public static Result jiSuan(int a, int b){
        try {
            int c = a / b;
            return Result.zhengQue;
        }catch (Exception e) {
            return Result.cuo;
        }
    }
}

enum Result{
    //写法错误，都必须要大写应为枚举类型都是常量
    //应该写成ZHENGQUE,CUO
    zhengQue,cuo
}
