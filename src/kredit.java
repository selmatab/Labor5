
public class kredit {
	public static void main(String[] args) {
		int iznos=10000;
		double kamata=(Math.random()*16);
		double dug=iznos+iznos*kamata;
		System.out.println("Iznos:"+iznos+" ,kamata:"+kamata+" ,ukupno duga:"+dug);
	}

}
