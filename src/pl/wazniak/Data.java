package pl.wazniak;

public class Data {
	private int dzien;
	private int miesiac;
	private int rok;

	public Data(int dzien, int miesiac, int rok) {
		this.dzien = dzien;
		this.miesiac = miesiac;
		this.rok = rok;
	}

	public String pokazDate() {
		return dzien + "." + miesiac + "." + rok;
	}

	public void przesunDoPrzoduO7() {
		dzien = dzien + 7;
	}

}
