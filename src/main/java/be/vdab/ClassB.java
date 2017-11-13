package be.vdab;

class ClassB implements InterfaceB {
	private final String telefoonNrHelpDesk;
	private final int aantalPogingenUpdateKlant;
	ClassB(String telefoonNrHelpDesk, int aantalPogingenUpdateKlant) {
		this.telefoonNrHelpDesk = telefoonNrHelpDesk;
		this.aantalPogingenUpdateKlant = aantalPogingenUpdateKlant;
	}
	public String getTelefoonNrHelpDesk() {
		return telefoonNrHelpDesk;
	}
	public int getAantalPogingenUpdateKlant() {
		return aantalPogingenUpdateKlant;
	}
	@Override
	public String getBoodschap() {
		return "ClassB object";
	}
}
