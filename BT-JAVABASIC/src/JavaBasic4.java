public class JavaBasic4 {
    public static void main(String[] args) {

        //DÙNG FOR BASIC KHI CÓ ĐIỀU KIỆN
        int arraySoNguyen[] = new int[26]; //khởi tạo mảng chứa số chẵn
        //Nếu cho độ dài mảng là 30, thì giá trị không được khai báo defaul sẽ là 0
        //muốn tránh TH này cần dùng collection
        int index = 0; //khởi tạo biến trung gian cho dòng 11 để làm chỉ mục
        for (int i = 0; i <= 50; i += 2) {
            if (i % 2 == 0) { //Kiểm tra số chẵn
                System.out.print(i + "   "); //in ra số chẵn tìm đc
                //LƯU SỐ CHẴN VÀO MẢNG
                arraySoNguyen[index] = i; //gán số chẵn i vào vị trí chỉ mục index để vòng lặp tiếp diễn tuần tự
                index++; //tăng biến chỉ mục lên 1 đơn vị

        // =>Hễ mà tìm được số chẵn thì sẽ gán số chẵn đó vào index sau đó tăng i lên 1 đơn vị
            }
        }
        System.out.println("   "); //để số 0 xuống hàng

        //DUYỆT MẢNG
        for (int value : arraySoNguyen) {
            System.out.println(value);
            //NẾU CHỈ DÙNG ĐỂ DUYỆT 1 MẢNG THÔI THÌ DÙNG FOR CẢI TIẾN TIỆN HƠN
            //bởi vì kh cần truy xuất vị trí thứ i để làm gì
        }

    }
}
