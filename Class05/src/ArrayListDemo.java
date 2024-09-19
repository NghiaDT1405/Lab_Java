import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        //Demo ArrayList
        ArrayList list = new ArrayList();
        //Theem phan tu
        list.add(100);
        list.add(200);
        list.add(300);
        System.out.println("Danh Sach Cac Phan Tu");
        for(var item : list){
            System.out.println(item);
        }
        System.out.println("Danh Sach Cac Phan Tu");
        System.out.println();
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
