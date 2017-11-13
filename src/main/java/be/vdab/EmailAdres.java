package be.vdab;

import java.util.regex.Pattern;

public class EmailAdres {
	private final static Pattern REG_EXPR = Pattern.compile("^.+@.+\\.[a-z]+$");
	private final String adres;
	public EmailAdres(String adres) {
		if(!REG_EXPR.matcher(adres).matches()) {
			throw new IllegalArgumentException("Verkeerd emailadres: " + adres);
		}
		this.adres = adres;
	}
	@Override
	public String toString() {
		return adres;
	}
}
