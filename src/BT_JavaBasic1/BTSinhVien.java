package BT_JavaBasic1;

public class BTSinhVien {
    static String nganhHoc = "Công nghệ thông tin";
     String lop = "JavaBasic";

    public void student(){
        String hoTen = "Nguyễn Thị Hương Giang";
        int tuoi = 21;
        String queQuan = "Hòa Bình";
        int diemTB = 8;
        //Class Sinh viên khai báo 3 loại biến (local, instance, static) và gọi lại ở hàm main
        System.out.println("Họ và tên: " + hoTen);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Quê quán: " + queQuan);
        System.out.println("Điểm trung bình: "+ diemTB);
    }

    public void thongTin(){
        System.out.println("Ngành học: "+nganhHoc);
        System.out.println("Lớp học: "+lop);
    }

    public static void main(String[] args) {
        BTSinhVien sv = new BTSinhVien();
        //Class Thông tin khai báo các biến static và gọi ở class Sinh viên rồi in ra
        System.out.println("Trường: "+BTThongTin.truong);
        sv.thongTin();
        sv.student();
    }
}
