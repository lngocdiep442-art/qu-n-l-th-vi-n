import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập họ và tên
        System.out.print("Nhập họ và tên của bạn: ");
        String hoTen = scanner.nextLine();

        // In ra họ tên theo thông tin sinh viên
        System.out.println("Sinh viên: " + hoTen + " - Lê Ngọc Diệp - Bài tập 2");

        scanner.close();
    }
}