package Quanlynhanvien;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Nhanvien> listnv = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String input;

        do {
            Nhanvien nv = new Nhanvien();
            System.out.println("Nhập tên nhân viên: ");
            do {
                nv.setName(sc.nextLine());
                if (!nv.getName().matches("[a-z A-Z]+")){
                    System.out.println("tên phải có ký tự từ a-z, mời nhập lại: ");
                } else {
                    nv.setName(nv.getName());
                    break;
                }
            }while(true);

            System.out.println("Nhập tuổi nhân viên: ");
            do {
                try{
                    nv.setAge(Integer.parseInt(sc.nextLine()));
                    break;
                }catch (NumberFormatException ex){
                    System.out.println("Tuổi rõ ràng là phải số rồi: ");
                }
            }while (true);


            System.out.println("Nhập sdt nhân viên: ");
            do {
                nv.setSdt(sc.nextLine());
               if (nv.getSdt().matches("[0-9]+"))
               {
                   if (nv.getSdt().length() == 10)
                   {
                       if (nv.getSdt().startsWith("0"))
                       {
                           nv.setSdt(nv.getSdt());
                           break;
                       } else {
                           System.out.println("sđt must start with 0: ");
                       }
                   } else {
                       System.out.println("sđt have 10 number: ");
                   }
               } else
               {
                   System.out.println("sđt must be number : ");
               }
            }while (true);

            System.out.println("Nhập địa chỉ của sinh viên ");
            nv.setAdd(sc.nextLine());

            listnv.add(nv);
            System.out.println("nhấn Y để nhập tiếp, ấn N để kết thúc ");
            input = sc.nextLine();

        } while (!"N".equalsIgnoreCase(input));
        for (Nhanvien nv : listnv){
            System.out.printf("Ten: %s - Tuoi: %d - SDT: %s - Dia chi: %s\n", nv.getName(), nv.getAge(), nv.getSdt(), nv.getAdd());
        }
    }
}
