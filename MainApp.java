package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		Scanner sc = new Scanner(System.in);
		String Name = "Le Hoang Linh";
		 int maSV =sc.nextInt();
		 long cmnd = sc.nextLong();
		 float dtb = sc.nextFloat();
		 String name = "Le Van A";
		 long sdt =sc.nextLong();
		 float hsl = sc.nextFloat();
		 String nameCar = "Maserati M20";
		 float gia = sc.nextFloat();
		 String color = "Blue";
		 //TTSV
		 System.out.println ("hoten:"+Name);
		 System.out.println ("maSv:"+maSV);
		 System.out.println ("cmnd"+cmnd);
		 System.out.println ("dtb:"+dtb);
		 //TTCN
		 System.out.println ("name:"+name);
		 System.out.println ("sdt:"+sdt);
		 System.out.println ("hsl:"+hsl);
		 //TTX
		 System.out.println ("namecar:"+nameCar);
		 System.out.println ("gia:"+gia);
		 System.out.println ( "Color:"+color);
	}

}
