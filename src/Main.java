import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] students = {"Cường","Thắng","Tú","Minh"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên:");
        String name = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)) {
                System.out.println("Vị trí của " + name + " trong danh sách là " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("không tìm thấy " + name + " trong danh sách");
        }
    }
}
