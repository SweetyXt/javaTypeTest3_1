public class LogicOp {
    public static void main(String[] args) {
        boolean x,y;
        x=5>3||3*4<6&&!(5>3);   //逻辑运算符的运算顺序，以及一些判定仍然存在问题
        y=2==6&&9>8+4||5+6<7+4&&!x;
        System.out.println("x="+x+",y="+y);
    }
}
