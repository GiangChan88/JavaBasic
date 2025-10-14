package BT_JavaBasic5;

import java.util.ArrayList;

public class BTCollection {

    public void nhanVien(String maNhanVien, String tenNhanVien, String chucVu, double luong ){
        //   - Tạo hàm riêng để thêm thông tin cơ bản của một nhân viên vào collection đã học phù hợp
        //   - Trong hàm main gọi lại hàm trên để in ra thông tin nhân viên đó với vòng lặp for CƠ BẢN
        ArrayList<String> list = new ArrayList<>();
        list.add("Mã nhân viên: " +maNhanVien);
        list.add("Tên nhân viên: " +tenNhanVien);
        list.add("Chức vụ: " +chucVu);
        list.add("Lương: " +luong);
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }

    public void mangSoChan(){
        //- Tạo class mới tại bài tập JAVA BASIC 5 để xử lý bài tập Java Basic 4 với ArrayList
        //Tạo list và add vô list
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i <= 50; i++){
            if(i % 2 == 0){
                list.add(i);
            }
        }
        //System.out.println("Các số chắn từ 0 - 50 là: " +list);
        //Duyệt list và in ra
        System.out.print("Các số chắn từ 0 - 50 là: ");
        for (int item: list){
            System.out.print(item + " ");
        }
    }

    public static void main(String[] args) {
        BTCollection clt = new BTCollection();
        clt.mangSoChan();
        clt.nhanVien("NV01", "Nguyễn Giang","Tester", 2000);
    }
}
