public class Promotion {
    public static void main(String[] args) {
        byte b=10;
        char c='a';
        int i=90;
        long l=555l;
        float f=3.5f;
        double d=1.234;
        float f1=f*b;
        int i1=c+i;
        long l1=l+i1;
        double d1=f1/i1-d;
        System.out.println("f1="+f1);//float*byte->float
        //f1=34.0
        System.out.println("i1="+i1);//char+int->int
        //i1=187
        System.out.println("l1="+l1);//long+int->long
        //l1=742
        System.out.println("d1="+d1);//float/int->float,float-double->doule
        //d1=-1.0468342181444168

    }
}
