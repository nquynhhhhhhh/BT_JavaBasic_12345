package JavaBasic1;

public class SinhVien {
    String lop = "12A15";
    static String ten = "Như Quỳnh";

    public void khoilop() {
        int n = 12;
        System.out.println("Sinh viên khối lớp: " + n);
        //CÁCH 2: là bỏ dòng 9 thay bằng
        //return n;
    }

    public static void main(String[] args) {

        SinhVien SV = new SinhVien();
        SV.khoilop();
        //chỉ dùng class SinhVien. khi biến khoilop là biến static
        //dùng biến SV. để khởi tạo đối tượng class ngoài hàm main
        //để gọi thành phần ở trong class thông qua đối tượng class (object)

        //CÁCH 2: bỏ dòng 17 thay bằng
        //int n = SV.khoilop();  // lấy giá trị từ phương thức
        //System.out.println("Sinh viên khối lớp: " + n);
        System.out.println(SV.lop);
        System.out.println(SV.ten);

        //KHAI BÁO BIẾN TỪ CLASS KHÁC
        System.out.println(ThongTin.KHOI_LOP); //lấy tên class. tên biến
        System.out.println(ThongTin.LOP);
        System.out.println(ThongTin.TEN);
    }

}
