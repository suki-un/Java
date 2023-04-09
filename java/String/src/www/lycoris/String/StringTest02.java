package www.lycoris.String;

public class StringTest02 {
    public static void main(String[] args) {
        //1，charAt
        char c = "中国人".charAt(1);
        System.out.println(c);

        //2，compareTo比较的是字典，前小后大就是-1，前大后小就是1，前后相等就是0
        int a = "abc".compareTo("abc");
        System.out.println(a);//结果是0

        int b = "abcd".compareTo("abce");
        System.out.println(b);//结果是-1

        int n = "abce".compareTo("abcd");
        System.out.println(n);//结果是1

        //3，contains判断前面的字符串是否包含后面的字符串结果返回Boolean值
        System.out.println("helloworld.java".contains("java"));
        System.out.println("https://www.leaderkang.fun/".contains("http://"));

        //4，endsWith判断字符串是否以某个字符串结尾返回值是boolean
        System.out.println("leaderkang".endsWith("kang"));

        //5，equals比较两个字符串必须用equals不能用“==”
        System.out.println("kang".equals("kang"));
        System.out.println("kangk".equals("kang"));


        //6，equalsIgnoreCase判断两个字符串是否相等，而且忽略大小写
        System.out.println("abcd".equalsIgnoreCase("Abcd"));
        System.out.println("abcd".equalsIgnoreCase("abcd"));

        //7，getBytes将字符串对象转换成字节数据
        byte[] bytes = "abcd".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        //8，indexOf返回指定字符第一次出现的字符串内的索引。
        System.out.println("javac++javac++".indexOf("java"));

        //9，isEmpty判断某个字符串是否为空字符串，不是null
        String str = "";
        //String str1 = null;
        //System.out.println(str1.isEmpty());//java.lang.NullPointerException
        System.out.println(str.isEmpty()?"空":"不空");

        //10，length()返回此字符串的长度。
        String str7= "shshshsh";
        System.out.println(str7.length());

        //11lastIndexOf(String str)
        //返回指定子字符串最后一次出现的字符串中的索引。
        System.out.println("javac++pythonphp".lastIndexOf("java"));

        //12 replace(CharSequence target, CharSequence replacement)
        //将与字面目标序列匹配的字符串的每个子字符串替换为指定的字面替换序列。
        //String的父接口就是CharSequence
        String s = "https://www.leaderkang.fun/".replace("https","http");
        System.out.println(s);
        //将下列字符串的=替换为:
        String s88 = "lycoriskang=kang=lovehanhan=oo";
        String jiu = s88.replace("=",":");
        System.out.println(jiu);

        //13,split(String regex)
        //将此字符串分割为给定的 regular expression的匹配。
        String[] stt = "1999-11-23".split("-");//"1999-11-23"这个字符串以-分割进行拆分
        for (int i = 0; i < stt.length; i++) {
            System.out.println(stt[i]);
        }
        String[] stt1 = "lycoris&kang=kang=love&hanhan=oo".split("=");
        for (int i = 0; i < stt1.length; i++){
            //System.out.println(stt1[i]);
            //继续拆分
            String[] temp = stt1[i].split("&");
            for (int j = 0; j < temp.length; j++) {
                System.out.println(temp[j]);
            }
        }

        //14,startsWith(String prefix)
        //测试此字符串是否以指定的前缀开头。
        boolean b1 = "lycoriskang=kang=lovehanhan=oo".startsWith("lycoris");
        System.out.println(b1);

        //15 substring(int beginIndex)
        //返回一个字符串，该字符串是此字符串的子字符串。
        System.out.println("https://www.leaderkang.fun/".substring(8));

        //16,substring(int beginIndex, int endIndex)开始到结束
        //返回一个字符串，该字符串是此字符串的子字符串。
        //beginIndex包括
        //endIndex不包括
        System.out.println("https://www.leaderkang.fun/".substring(8,25));//包含8但不包含25

        //17,toCharArray()
        //将此字符串转换为新的字符数组。
        char[] cha = "我是中国人".toCharArray();
        for (int i = 0; i < cha.length; i++) {
            System.out.println(cha[i]);
        }

        //18,toLowerCase()
        //将所有在此字符 String使用默认语言环境的规则，以小写。
        String you = "ABCdeF".toLowerCase();
        System.out.println(you);

        //19,toUpperCase()
        //将所有在此字符 String使用默认语言环境的规则大写。
        System.out.println("abcdEfG".toUpperCase());

        //20，trim()
        //返回一个字符串，其值为此字符串，并删除任何前导和尾随空格。
        System.out.println("   HelloWorlf hh josi   ".trim());

        //21,String中只有一个是静态方法，不需要new对象
        //这个方法叫valueOf()
        //作用：将”非字符串“转换为”字符串“

        //String s1 = String.valueOf(true);
        //String s1 = String.valueOf(1100);
        String s2 = String.valueOf(new Custom());//调用Custom的同string
        System.out.println(s2);
    }
}

class Custom{
    @Override
    public String toString() {
        return "Custom().toString运行";
    }
}