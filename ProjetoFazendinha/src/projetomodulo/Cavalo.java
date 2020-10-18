package projetomodulo;


public class Cavalo extends classeMaezona{
	private String pula;
	
	@Override
	public void tipoAnimal() {
		System.out.println("Mamífero");
	}
	
	@Override
	public void barulhoBicho() {
		System.out.println("  _    _ _____ _   _   _    _ _____ _   _   _____  _____ __  __ __  __ __  __ \r\n"
				+ " | |  | |_   _| \\ | | | |  | |_   _| \\ | | |  __ \\|_   _|  \\/  |  \\/  |  \\/  |\r\n"
				+ " | |__| | | | |  \\| | | |__| | | | |  \\| | | |__) | | | | \\  / | \\  / | \\  / |\r\n"
				+ " |  __  | | | | . ` | |  __  | | | | . ` | |  _  /  | | | |\\/| | |\\/| | |\\/| |\r\n"
				+ " | |  | |_| |_| |\\  | | |  | |_| |_| |\\  | | | \\ \\ _| |_| |  | | |  | | |  | |\r\n"
				+ " |_|  |_|_____|_| \\_| |_|  |_|_____|_| \\_| |_|  \\_\\_____|_|  |_|_|  |_|_|  |_|\r\n"
				+ "                                                                              \r\n"
				+ "                                                                               ");
	}
	
	public String getPula() {
		return pula;
	}

	public void setPula(String pula) {
		this.pula = pula;
	}
	
	public void imprimir()
	{
		System.out.printf(" ");
	}
	
	public void getImagem() {
		System.out.println(
				"      ,\r\n"
				+ "                _,,)\\.~,,._\r\n"
				+ "                (()`  ``)\\))),,_\r\n"
				+ "                 |     \\ ''((\\)))),,_          ____\r\n"
				+ "                 |6`   |   ''((\\())) \"-.____.-\"    `-.-,\r\n"
				+ "                 |    .'\\    ''))))'                  \\)))\r\n"
				+ "                 |   |   `.     ''                     ((((\r\n"
				+ "                 \\, _)     \\/                          |))))\r\n"
				+ "                  `'        |                          (((((\r\n"
				+ "                            \\                  |       ))))))\r\n"
				+ "                             `|    |           ,\\     /((((((\r\n"
				+ "                              |   / `-.______.<  \\   |  )))))\r\n"
				+ "                              |   |  /         `. \\  \\  ((((\r\n"
				+ "                              |  / \\ |           `.\\  | (((\r\n"
				+ "                              \\  | | |             )| |  ))\r\n"
				+ "                               | | | |            / | |  '\r\n"
				+ "                               | | /_(           /_(/ /\r\n"
				+ "                          hjw  /_(/__]           \\_/_(\r\n"
				+ "                              /__]                /__]");
	}
}
	
