
public class kvadratKrugValjak {
public static void main(String[] args) {
	int broj=7;
	double stranica;
	double povrsinaKvadrata=broj*broj;
	int obimKvadrata=4*broj;
	double povrsinaKruga=broj*broj*Math.PI;
	double obimKruga=2*broj*Math.PI;
	int razlikaPovrsine=(int)(povrsinaKruga/povrsinaKvadrata);
	System.out.println("Krug moze stati "+razlikaPovrsine+" puta u kvadrat");
	stranica=(0.5+Math.random()*36.7-0.5+1);
	double zapreminaValjka=povrsinaKruga*stranica;
	System.out.println("Povrsina valjka je: "+zapreminaValjka);

}
}
