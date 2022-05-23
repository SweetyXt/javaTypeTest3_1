public class BitOperate {
    public static void main(String[] args) {
        int w1=0x155,w2=0x1c7,w3=0x52;
        int w4=-128,w5=128;
        System.out.printf("%x %x %x \n",w1&w2,w1|w2,w1^w2);
        System.out.printf("%x %x %x \n",~w1,~w2,~w3);
        System.out.printf("%x %x %x \n",w1^w2,w1&~w2,w1|w2|w3);
        System.out.printf("%x %x  \n",w1|w2&w3,w1&w2|w3);
        System.out.printf("%x %x  \n",~(~w1&~w2),w1|w2);
        System.out.printf("%d %d %x %d \n",w4>>1,w4>>>1,w4>>>1);
        /* Java提供的位运算符有：
        左移( << )、右移( >> ) 、无符号右移( >>> ) 、位与( & ) 、位或( | )、位非( ~ )、位异或( ^ )，
        除了位非( ~ )是一元操作符外，其它的都是二元操作符。
        */
        /*
        正数右移，高位用0补，负数右移，高位用1补，当负数使用无符号右移时，用0进行部位(自然而然的，就由负数变成了正数了)
        注意：笔者在这里说的是右移，高位补位的情况。正数或者负数左移，低位都是用0补。(自行测试)
         */
    }
}
