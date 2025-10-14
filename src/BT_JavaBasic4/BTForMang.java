package BT_JavaBasic4;

import java.util.ArrayList;

public class BTForMang {
    public static void main(String[] args) {
//    - Tạo vòng lặp FOR để in ra các số chẵn từ 0 đến 50
//    - Tạo mảng để lưu những số chẵn đó vào
//    - Duyệt mảng để in ra kết quả sau khi nạp vào

        int[] mangSoChan = new int[26];
        int index = 0;

        for(int i = 0; i <= 50; i++) {
            if(i % 2 == 0){
                mangSoChan[index] = i;
                index++;
            }
        }
        System.out.print("Các số chắn từ 0 - 50 là: ");
        for (int item: mangSoChan){
            System.out.print(item + " ");
        }

    }


}
