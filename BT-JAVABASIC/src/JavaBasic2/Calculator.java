package JavaBasic2;

public class Calculator {
    public long sum;
    public double mul;

    public long cong2songuyen (int a, int b) {
        sum = a + b;
        return sum;
    }

    public double nhan2sothuc (double c, double d) {
        mul = c * d;
        return mul;
    }

    public static void main(String[] args) {
        Calculator Maytinh = new Calculator();

        //CÁCH 1
        Maytinh.cong2songuyen(11,500); //GỌI HÀM CHẠY TRƯỚC
        Maytinh.nhan2sothuc(5.5,13.12);
        System.out.println(Maytinh.sum); //THÌ LÚC NÀY GỌI BIẾN RA MỚI CÓ GIÁ TRỊ
        System.out.println(Maytinh.mul);

        //CÁCH 2
        System.out.println(Maytinh.cong2songuyen(11,500) - 10);
        System.out.println(Maytinh.nhan2sothuc(5.5,13.12) + 0.84);
    }

}
