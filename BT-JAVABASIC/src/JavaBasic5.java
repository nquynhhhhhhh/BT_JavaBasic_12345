import java.util.ArrayList;
import java.util.List;

//SỬ DỤNG ARRAYLIST ĐỂ KHẮC PHỤC VẤN ĐỀ GIỚI HẠN MẢNG CỦA BT4
public class JavaBasic5 {

    private static List<String> addEmployee(String name, String gender, String birthday, String address, String phoneNumber) {
        //Nếu muốn hàm addEmployee trả về đối tượng gì đó (String, Interger...) thì dùng List và return
        //Còn nếu chỉ cần in ra KQ thôi thì thay bằng void
        List<String> nhanvien = new ArrayList<String>();
        nhanvien.add(name);
        nhanvien.add(gender);
        nhanvien.add(birthday);
        nhanvien.add(address);
        nhanvien.add(phoneNumber);
        //Xóa giá trị cụ thể mang lên thành tham số name, gender...
        //=> Xuống main thì sẽ khai báo được nhiều nhanvien hơn
        return nhanvien; //muốn gọi đối tượng ở trên XUỐNG main thì phải return
    }


    public static void main(String[] args) {
        List<Integer> BT4 = new ArrayList<>();
        //KIỂM TRA SỐ CHẴN, ADD VÀO ARRAYLIST (dùng for basic)
        for (int i = 0; i <= 50; i += 2) {
            if (i % 2 == 0) { //kiểm tra số chẵn
                BT4.add(i); //lấy list để add số chẵn
            }
        }
        System.out.println("===DUYỆT GIÁ TRỊ TRONG ARRAYLIST===");
        //DUYỆT GIÁ TRỊ TRONG ARRAYLIST (dùng for cải tiến)
        for (Integer i : BT4) {
            System.out.print(i + "\t");
        }


        System.out.println(); //XUỐNG DÒNG
        System.out.println("\n===THÔNG TIN NHÂN VIÊN==="); //"\n" dùng để CÁCH DÒNG



        List<String> nhanvien = addEmployee(
                "Như Quỳnh",
                "Nữ",
                "14/01/2002",
                "Q1",
                "0903xxxxxx"
        ); //đã khởi tạo hàm static nên kh cần gọi new
        for (String value : nhanvien) {
            //có thể thay nhanvien thành nguyên cục addEmployee() ở trên nếu kh muốn khai báo biến nhanvien
            System.out.println(value);
        }


        //NẾU KHÔNG TẠO HÀM RIÊNG
//        List<String> nhanvien = new ArrayList<String>();
//        nhanvien.add("Như Quỳnh");
//        nhanvien.add("Nữ");
//        nhanvien.add("14/01/2002");
//        nhanvien.add("Q1");
//        nhanvien.add("0903xxxxxx");

        //CÁCH 2 IN VỚI FOR BASIC
//        for (int i = 0; i < nhanvien.size(); i++){
//            System.out.println(nhanvien.get(i));
//        }


    }
}
