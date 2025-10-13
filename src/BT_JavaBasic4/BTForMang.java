package BT_JavaBasic4;

import java.util.ArrayList;

public class BTForMang {
    public static void main(String[] args) {
//    - Tạo vòng lặp FOR để in ra các số chẵn từ 0 đến 50
//    - Tạo mảng để lưu những số chẵn đó vào
//    - Duyệt mảng để in ra kết quả sau khi nạp vào

        //Tạo list và add vô list
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i <= 50; i++){
            if(i % 2 == 0){
                list.add(i);
            }
        }
        //Duyệt list và in ra
        System.out.print("Các số chắn từ 0 - 50 là: ");
        for (int item: list){
            System.out.print(item + " ");
        }

    }
}
