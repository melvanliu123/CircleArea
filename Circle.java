import java.io.*;
public class demo4{    
	public static void main(String args[]) throws Exception
	{  
		String getbr;
		double radius,area;
		double pi=3.14159;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.print("請輸入圓形半徑：");
		getbr = br.readLine();
		radius=Double.parseDouble(getbr);
		area=pi*radius*radius;
		System.out.println("圓形面積等於："+area);  
		
	}
}
