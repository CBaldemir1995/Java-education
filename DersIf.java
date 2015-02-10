import java.util.Scanner;

import javax.swing.InputVerifier;


public class DersIf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input= new Scanner(System.in);
		int sayi;
		
		boolean durum = true;
		
		if(durum)
			
		{
			
			System.out.println("Durum True");
			
		}
		
		System.out.println("Final Notunuzu Giriniz: ");
		sayi=input.nextInt();
		
		
		
		
		
		;
		String harf;
		
		if(sayi>=90)
			
		{
			harf="AA";
			
			System.out.println("Başarı Harfiniz" + " " + harf );
			
			
		}
		
		else if(sayi>60)
			
		
		{
			
			harf="BB";
			System.out.println("Başarı Harfiniz"+ " "+ harf);
			
		}
		else if(sayi>50)
			
			
		{
			
			harf="CC";
			System.out.println("Başarı Harfiniz"+ " "+ harf);
			
		}
		
		else if(sayi>40)
			
			
		{
			
			harf="DD";
			System.out.println("Başarı Harfiniz"+ " "+ harf);
			
		}
		
		else
			
			harf="FF";
		System.out.println("Başarı Harfiniz"+ " "+ harf);
		
			
		
	}

}
