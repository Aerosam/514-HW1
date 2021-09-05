// Hessam Farhat   N20239030
import java.util.Scanner;              //bilgileri kullanicidan almak icin yukluyoruz java.util.scanner
public class Mtv {                    //sinif olusturuyoruz ve ismi belirleniyor, ismi Mtv olarak

	public static void main(String[] args) {
		System.out.println("Tasit vergisi hesaplama programina hosgeldiniz.");                    //hosgeldin mesaji bastiriyoruz, println kullaniyoruz ki satir atlasin.
		System.out.println("Lutfen aracin yasini ve motor silindir hacmini giriniz.");           //aracin yasi ve motor hacmini girdirmek icin mesaj yolluyoruz, println kullaniyoruz ki satir atlasin.
		System.out.println();                                                                   //bos satir yazdirmak
		int year, Msh;                                                                         //verilerin ismini belirleyip ve tipini belirliyoruz, 'year' verisini arac yasi ve 'Msh' verisini motor silindir hacmi verisi olarak ve integer olarak belirledim. 
		Scanner keyboard = new Scanner(System.in);                                            // klavyeden okuma yapmak icin Scanner nesnesi olustur
		System.out.print("Aracin yasi: ");                                                   //aracin yasini girmek icin console da bize bu mesaji yolluyor ve degeri girmemizi bekliyor, burada print kullandim ki satir atlamasin ve girdigimiz sayi cumlenin onunde bulunsun.
		year = keyboard.nextInt();                                                          // nextInt() metodu ile tam sayi turunde deger okumasi yapilir
		System.out.print("Motor silindir hacmi: ");                                        //motor silindir hacmini girmemiz icin console a mesaj yolluyor ve degeri girmemizi bekliyor, burada print kullandim ki satir atlamasin ve girdigimiz sayi cumlenin onunde bulunsun.
		
		Msh = keyboard.nextInt();                                                        
		System.out.println();
		keyboard.close();
		
		
		if ((year>=1) && (year<=3))                                      //1'dan 3 yasina kadar olan araclarin farkli motor hacimlerine gore vergiyi gosteriyor. 
			if (Msh<=1300)
				System.out.println("odeyeceginiz yillik tasit vergisi 861 Tldir.");
			else if ((Msh>=1301) && (Msh<=1600))
				System.out.println("odeyeceginiz yillik tasit vergisi 1500 Tldir.");
			else if ((Msh>=1601) && (Msh<=1800))
				System.out.println("odeyeceginiz yillik tasit vergisi 2647 Tldir.");
			else if ((Msh>=1801) && (Msh<=2000))
				System.out.println("odeyeceginiz yillik tasit vergisi 3011 Tldir.");
			else if ((Msh>=2001) && (Msh<=2500))
				System.out.println("odeyeceginiz yillik tasit vergisi 6254 Tldir.");
			else if ((Msh>=2501) && (Msh<=3000))
				System.out.println("odeyeceginiz yillik tasit vergisi 8720 Tldir.");
			else if ((Msh>=3001) && (Msh<=3500))
				System.out.println("odeyeceginiz yillik tasit vergisi 13280 Tldir.");
			else if ((Msh>=3501) && (Msh<=4000))
				System.out.println("odeyeceginiz yillik tasit vergisi 20878 Tldir.");
			else if (Msh>=4001)
				System.out.println("odeyeceginiz yillik tasit vergisi 34171 Tldir.");
			
		
		 if ((year>=4) && (year<=6))                                     //4'dan 6 yasina kadar olan araclarin farkli motor hacimlerine gore vergiyi gosteriyor.
			if (Msh<=1300)
				System.out.println("odeyeceginiz yillik tasit vergisi 600 Tldir.");
			else if ((Msh>=1301) && (Msh<=1600))
				System.out.println("odeyeceginiz yillik tasit vergisi 1124 Tldir.");
			else if ((Msh>=1601) && (Msh<=1800))
				System.out.println("odeyeceginiz yillik tasit vergisi 2069 Tldir.");
			else if ((Msh>=1801) && (Msh<=2000))
				System.out.println("odeyeceginiz yillik tasit vergisi 3212 Tldir.");
			else if ((Msh>=2001) && (Msh<=2500))
				System.out.println("odeyeceginiz yillik tasit vergisi 4541 Tldir.");
			else if ((Msh>=2501) && (Msh<=3000))
				System.out.println("odeyeceginiz yillik tasit vergisi 7586 Tldir.");
			else if ((Msh>=3001) && (Msh<=3500))
				System.out.println("odeyeceginiz yillik tasit vergisi 11948 Tldir.");
			else if ((Msh>=3501) && (Msh<=4000))
				System.out.println("odeyeceginiz yillik tasit vergisi 18028 Tldir.");
			else if (Msh>=4001)
				System.out.println("odeyeceginiz yillik tasit vergisi 25624 Tldir.");
			
		 if ((year>=7) && (year<=11))                                       //7'dan 11 yasina kadar olan araclarin farkli motor hacimlerine gore vergiyi gosteriyor.
			if (Msh<=1300)
				System.out.println("odeyeceginiz yillik tasit vergisi 336 Tldir.");
			else if ((Msh>=1301) && (Msh<=1600))
				System.out.println("odeyeceginiz yillik tasit vergisi 653 Tldir.");
			else if ((Msh>=1601) && (Msh<=1800))
				System.out.println("odeyeceginiz yillik tasit vergisi 1218 Tldir.");
			else if ((Msh>=1801) && (Msh<=2000))
				System.out.println("odeyeceginiz yillik tasit vergisi 1888 Tldir.");
			else if ((Msh>=2001) && (Msh<=2500))
				System.out.println("odeyeceginiz yillik tasit vergisi 2837 Tldir.");
			else if ((Msh>=2501) && (Msh<=3000))
				System.out.println("odeyeceginiz yillik tasit vergisi 4739 Tldir.");
			else if ((Msh>=3001) && (Msh<=3500))
				System.out.println("odeyeceginiz yillik tasit vergisi 7197 Tldir.");
			else if ((Msh>=3501) && (Msh<=4000))
				System.out.println("odeyeceginiz yillik tasit vergisi 10618 Tldir.");
			else if (Msh>=4001)
				System.out.println("odeyeceginiz yillik tasit vergisi 15176 Tldir.");
			
		
		 if ((year>=12) && (year<=15))                                             //12'dan 15 yasina kadar olan araclarin farkli motor hacimlerine gore vergiyi gosteriyor.
			if (Msh<=1300)
				System.out.println("odeyeceginiz yillik tasit vergisi 255 Tldir.");
			else if ((Msh>=1301) && (Msh<=1600))
				System.out.println("odeyeceginiz yillik tasit vergisi 461 Tldir.");
			else if ((Msh>=1601) && (Msh<=1800))
				System.out.println("odeyeceginiz yillik tasit vergisi 743 Tldir.");
			else if ((Msh>=1801) && (Msh<=2000))
				System.out.println("odeyeceginiz yillik tasit vergisi 1124 Tldir.");
			else if ((Msh>=2001) && (Msh<=2500))
				System.out.println("odeyeceginiz yillik tasit vergisi 1696 Tldir.");
			else if ((Msh>=2501) && (Msh<=3000))
				System.out.println("odeyeceginiz yillik tasit vergisi 2550 Tldir.");
			else if ((Msh>=3001) && (Msh<=3500))
				System.out.println("odeyeceginiz yillik tasit vergisi 3593 Tldir.");
			else if ((Msh>=3501) && (Msh<=4000))
				System.out.println("odeyeceginiz yillik tasit vergisi 4739 Tldir.");
			else if (Msh>=4001)
				System.out.println("odeyeceginiz yillik tasit vergisi 6821 Tldir.");
			
		 if (year>=16)                                                      // 16 yas ve ustu olan araclarin farkli motor hacimlerine gore vergiyi gosteriyor.
			if (Msh<=1300)
				System.out.println("odeyeceginiz yillik tasit vergisi 90 Tldir.");
			else if ((Msh>=1301) && (Msh<=1600))
				System.out.println("odeyeceginiz yillik tasit vergisi 177 Tldir.");
			else if ((Msh>=1601) && (Msh<=1800))
				System.out.println("odeyeceginiz yillik tasit vergisi 289 Tldir.");
			else if ((Msh>=1801) && (Msh<=2000))
				System.out.println("odeyeceginiz yillik tasit vergisi 444 Tldir.");
			else if ((Msh>=2001) && (Msh<=2500))
				System.out.println("odeyeceginiz yillik tasit vergisi 671 Tldir.");
			else if ((Msh>=2501) && (Msh<=3000))
				System.out.println("odeyeceginiz yillik tasit vergisi 936 Tldir.");
			else if ((Msh>=3001) && (Msh<=3500))
				System.out.println("odeyeceginiz yillik tasit vergisi 1319 Tldir.");
			else if ((Msh>=3501) && (Msh<=4000))
				System.out.println("odeyeceginiz yillik tasit vergisi 1888 Tldir.");
			else if (Msh>=4001)
				System.out.println("odeyeceginiz yillik tasit vergisi 2647 Tldir.");

	}

}
