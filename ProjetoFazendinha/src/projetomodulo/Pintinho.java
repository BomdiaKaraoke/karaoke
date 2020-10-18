package projetomodulo;

public class Pintinho extends Galinha{
	private String tiraPijama;
	
	@Override
	public void tipoAnimal() {
		System.out.println("Ave");
	}
	
	@Override
	public void barulhoBicho() {
		System.out.println("_____ _____ _    _   _____ _____ _    _ \r\n"
				+ " |  __ \\_   _| |  | | |  __ \\_   _| |  | |\r\n"
				+ " | |__) || | | |  | | | |__) || | | |  | |\r\n"
				+ " |  ___/ | | | |  | | |  ___/ | | | |  | |\r\n"
				+ " | |    _| |_| |__| | | |    _| |_| |__| |\r\n"
				+ " |_|   |_____|\\____/  |_|   |_____|\\____/ \r\n"
				+ "                                          \r\n"
				+ "                                       ");
	}
	
	public String getTiraPijama() {
		return tiraPijama;
	}

	public void setTiraPijama(String tiraPijama) {
		this.tiraPijama = tiraPijama;
	}
	
	@Override
	public void getImagem() {
		System.out.println(
				" \r\n"
				+ "       .---.\r\n"
				+ "    _ /     ' .---.\r\n"
				+ "    >|  o    `     `\\\r\n"
				+ "    ` \\       .---._ '._ ,\r\n"
				+ "       '-.;         /`  /'\r\n"
				+ "          \\    '._.'   /\r\n"
				+ "           '.        .'\r\n"
				+ "             `\";--\\_/\r\n"
				+ "      	    _/_   |\r\n"
				+ "          -'`/  .--;--\r\n"
				+ "            '    .'\r\n"
				+ "\r\n"
				+ " ");
	}
}
