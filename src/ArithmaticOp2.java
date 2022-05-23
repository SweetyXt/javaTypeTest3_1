public class ArithmaticOp2 {
    public static void main(String[] args) {
        int a,b,c;
        a=b=c=5;
        a=++b- ++c;
        System.out.println("a="+a+"b="+b+"c="+c);
        a=b+++c++;
        System.out.println("a="+a+"b="+b+"c="+c);
        a=b--+c--;
        System.out.println("a="+a+"b="+b+"c="+c);
    }
}
