
public class piramidaVolumenPovrsina {
	public static void main(String[] args) {
		double slucajan = Math.random()*50+1;
		double cetiriTrecine = 1.333333333;
		int visina = 8;
		System.out.println(slucajan);
		System.out.println("Volumen piramide= " + slucajan * slucajan * visina / 3);
		System.out.println("Povrsina piramide= "+ (slucajan * slucajan + 2* slucajan* Math.sqrt(((slucajan / 2) * (slucajan / 2) + visina* visina))));
		System.out.println("Volumen sfere= " + Math.PI * slucajan * slucajan * slucajan* cetiriTrecine);
		System.out.println("Povrsina sfere= " + 4 * Math.PI * slucajan * slucajan);

}
}
