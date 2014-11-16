
public class cifreNaopako {
	public static void main(String [] args){
		int broj= (int)(10+(Math.random()*(99999-10+1)));
		System.out.println(broj);
		while (broj!=0){
			System.out.println(broj%10);
			broj=broj/10;
		}
		}

}
