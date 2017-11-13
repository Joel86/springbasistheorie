package be.vdab;

import java.util.Properties;

class HelpDeskMedewerkers {
	private final Properties medewerkers;
	HelpDeskMedewerkers(Properties medewerkers) {
		this.medewerkers = medewerkers;
	}
	@Override
	public String toString() {
		return medewerkers.toString();
	}
}
