package projetomodulo;

public class Porquinho extends classeMaezona {
	private String pulaNaLama;
	
	public void imprimir()
	{
		System.out.printf(" ");
	}

	public String getPulaNaLama() {
		return pulaNaLama;
	}

	public void setPulaNaLama(String pulaNaLama) {
		this.pulaNaLama = pulaNaLama;
	}
	
	@Override
	public void tipoAnimal() {
		System.out.println("Mamífero");
	}
	
	@Override
	public void barulhoBicho() {
		System.out.println("  _____   ____ _____ _   _ _  __  _____   ____ _____ _   _ _  __\r\n"
				+ " |  __ \\ / __ \\_   _| \\ | | |/ / |  __ \\ / __ \\_   _| \\ | | |/ /\r\n"
				+ " | |__) | |  | || | |  \\| | ' /  | |__) | |  | || | |  \\| | ' / \r\n"
				+ " |  _  /| |  | || | | . ` |  <   |  _  /| |  | || | | . ` |  <  \r\n"
				+ " | | \\ \\| |__| || |_| |\\  | . \\  | | \\ \\| |__| || |_| |\\  | . \\ \r\n"
				+ " |_|  \\_\\\\____/_____|_| \\_|_|\\_\\ |_|  \\_\\\\____/_____|_| \\_|_|\\_\\\r\n"
				+ "                                                                ");
	}
	
	public void getImagem() {
		System.out.println(""
				+ "              ._     __,\r\n"
				+ "              |\\,../'\\\r\n"
				+ "            ,'. .     `.\r\n"
				+ "           .--         '`.\r\n"
				+ "          ( `' ,          ;\r\n"
				+ "          ,`--' _,       ,'\\\r\n"
				+ "         ,`.____            `.\r\n"
				+ "        /              `,    |\r\n"
				+ "       '                \\,   '\r\n"
				+ "       |                /   /`,\r\n"
				+ "       `,  .           ,` ./  |\r\n"
				+ "       ' `.  ,'        |;,'   ,@\r\n"
				+ " ______|     |      _________,_____jv______\r\n"
				+ "        `.   `.   ,'\r\n"
				+ "         ,'_,','_,\r\n"
				+ "         `'   `'");
	}
	
}


