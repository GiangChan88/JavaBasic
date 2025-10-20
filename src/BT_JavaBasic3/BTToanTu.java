package BT_JavaBasic3;


public class BTToanTu {
    //- Tạo ra ít nhất 3 biến bất kỳ lưu giá trị trong class đó (static - static thuộc class)
    static int a = 10;
    static int b = 15;
    static int c = 5;

    public void onToanTu(){
        System.out.println("Số a = "+ a);
        System.out.println("Số b = "+ b);
        System.out.println("Số c = "+ c);
        System.out.println("==================================");
        System.out.println("(a > b) && (a > c) là: "+ ((a > b) && (a > c))); //false
        System.out.println("(a > b) || (a > c) là: "+ ((a > b) || (a > c))); //true
        System.out.println("a < b là: " + (a < b));//true
        System.out.println("b > c là: " + (b > c));//true
        System.out.println("a == c là: " + (a == c));//false
        System.out.println("==================================");
    }

    static int number = 100;
    public void check(int n){
        if(n == number){
            System.out.println(n+" == " +number);
        } else if (n < number) {
            System.out.println(n+" nhỏ hơn " +number);
        } else {
            System.out.println(n+" lớn hơn " +number);
        }
    }
    public static void main(String[] args) {
        BTToanTu toanTu = new BTToanTu();
        toanTu.onToanTu();

        toanTu.check(-100);
        toanTu.check(99);
        toanTu.check(100);
        toanTu.check(101);

    }
}
