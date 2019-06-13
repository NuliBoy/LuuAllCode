package cn.sxt.exception;

public class B1  extends A1 {

        public  int a = 40;
        public int b= 60;
        public void add(){

            System.out.println(a+b+"_____");

        }

    public static void main(String[] args) {

            A1  a = new B1();
        System.out.println(a.a);
    }

}
