import java.util.Scanner;

class Person {
    private String name;
    private String address;
    private double salary;

    // nhập thông tin
    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên: ");
        name = sc.nextLine();

        System.out.print("Nhập địa chỉ: ");
        address = sc.nextLine();

        System.out.print("Nhập lương: ");
        salary = sc.nextDouble();
    }

    // hiển thị thông tin
    public void view() {
        System.out.println("Tên: " + name);
        System.out.println("Địa chỉ: " + address);
        System.out.println("Lương: " + salary);
    }

    // Main
    public static void main(String[] args) {
        Person person = new Person();
        person.input();
        person.view();
    }
}
