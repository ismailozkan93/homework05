package day12forvewhileloop;

public class ForLoop01 {

	public static void main(String[] args) {
		//Ilk 30 sayma sayisinin toplamini ekrana yazdiran program yaziniz.
		
		int sum = 0;
		for(int i=1; i<=30;i++) {
			sum = sum+i;
		}
		System.out.println(sum);
	
	//sadece final sonucu görmek istersek syso(sum);ifadesini for-loop döngüsünün disina
	//her loop dan sonraki toplami görmek istersek syso(sum); ifadesini	for-loop`un icine yaziniz.
		
		
		
	//Ilk 10 sayma sayisinin carpimini ekrana yazan programi yazdiriniz.
	// 7 faktöriyel = ilk 7 sayma sayisi	
		int product = 1;
		for(int i=1; i<=10 ;i++) {
			product = product*i;
		}
	System.out.println("Carpim: " + product);
//100 ile 200 arasindaki 3 ile bölünebilen sayilarin toplamini bulan bir programm yaziniz
	int sum1=0;
	for(int i=101; i<200; i++) {
		if(i%3==0) {
			sum1 = sum1+i; 
		}
	}
	System.out.println("toplam: "+sum1);
	
	}
}
