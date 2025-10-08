package BT_JavaBasic1;

public class BTSinhVien {
    static String lop = "JavaBasic"; //Biến static
    int diemTB = 8; //Biến instance

    public static void main(String[] args) {
        String nganhHoc = "Công nghệ thông tin"; //Biến local
        BTSinhVien sv = new BTSinhVien();
        //Class Thông tin khai báo các biến static và gọi ở class Sinh viên rồi in ra
        System.out.println("Họ và tên: " + BTThongTin.hoTen + "\n" + "Tuổi: " + BTThongTin.tuoi + "\n" +
                "Quê quán: " + BTThongTin.queQuan );
        //Class Sinh viên khai báo 3 loại biến (local, instance, static) và gọi lại ở hàm main
        System.out.println("Ngành học: " + nganhHoc + "\n" + "Lớp: "+lop + "\n" + "Điểm trung bình: "+ sv.diemTB);
    }
}
