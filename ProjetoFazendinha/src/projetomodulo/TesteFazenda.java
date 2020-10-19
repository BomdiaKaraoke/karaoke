package projetomodulo;

import java.util.Scanner;

public class TesteFazenda {
	public static void main(String[] args) throws InterruptedException {

		int acorda;
		int play=0;
		int dia;
		boolean fim = true;

		Scanner ler = new Scanner(System.in);

		Vaca v = new Vaca();
		Bezerro b = new Bezerro();
		Galinha g = new Galinha();
		Cavalo c = new Cavalo();
		Pintinho p = new Pintinho();
		Porquinho pig = new Porquinho();
		

		
		do {
			System.out.println("Escolha o período do dia: \n");
			System.out.println("Digite 1 se for dia ou digite 2 se for noite: ");
			dia = ler.nextInt();
		switch(dia) {
		
		case 1:
			do {
			Thread.sleep(7000);
			System.out.println("                                                                                                                                                   \r\n"
					+ "                                                                                                                                                   \r\n"
					+ "BBBBBBBBBBBBBBBBB        OOOOOOOOO     MMMMMMMM               MMMMMMMM     DDDDDDDDDDDDD      IIIIIIIIII               AAA                     !!! \r\n"
					+ "B::::::::::::::::B     OO:::::::::OO   M:::::::M             M:::::::M     D::::::::::::DDD   I::::::::I              A:::A                   !!:!!\r\n"
					+ "B::::::BBBBBB:::::B  OO:::::::::::::OO M::::::::M           M::::::::M     D:::::::::::::::DD I::::::::I             A:::::A                  !:::!\r\n"
					+ "BB:::::B     B:::::BO:::::::OOO:::::::OM:::::::::M         M:::::::::M     DDD:::::DDDDD:::::DII::::::II            A:::::::A                 !:::!\r\n"
					+ "  B::::B     B:::::BO::::::O   O::::::OM::::::::::M       M::::::::::M       D:::::D    D:::::D I::::I             A:::::::::A                !:::!\r\n"
					+ "  B::::B     B:::::BO:::::O     O:::::OM:::::::::::M     M:::::::::::M       D:::::D     D:::::DI::::I            A:::::A:::::A               !:::!\r\n"
					+ "  B::::BBBBBB:::::B O:::::O     O:::::OM:::::::M::::M   M::::M:::::::M       D:::::D     D:::::DI::::I           A:::::A A:::::A              !:::!\r\n"
					+ "  B:::::::::::::BB  O:::::O     O:::::OM::::::M M::::M M::::M M::::::M       D:::::D     D:::::DI::::I          A:::::A   A:::::A             !:::!\r\n"
					+ "  B::::BBBBBB:::::B O:::::O     O:::::OM::::::M  M::::M::::M  M::::::M       D:::::D     D:::::DI::::I         A:::::A     A:::::A            !:::!\r\n"
					+ "  B::::B     B:::::BO:::::O     O:::::OM::::::M   M:::::::M   M::::::M       D:::::D     D:::::DI::::I        A:::::AAAAAAAAA:::::A           !:::!\r\n"
					+ "  B::::B     B:::::BO:::::O     O:::::OM::::::M    M:::::M    M::::::M       D:::::D     D:::::DI::::I       A:::::::::::::::::::::A          !!:!!\r\n"
					+ "  B::::B     B:::::BO::::::O   O::::::OM::::::M     MMMMM     M::::::M       D:::::D    D:::::D I::::I      A:::::AAAAAAAAAAAAA:::::A          !!! \r\n"
					+ "BB:::::BBBBBB::::::BO:::::::OOO:::::::OM::::::M               M::::::M     DDD:::::DDDDD:::::DII::::::II   A:::::A             A:::::A             \r\n"
					+ "B:::::::::::::::::B  OO:::::::::::::OO M::::::M               M::::::M     D:::::::::::::::DD I::::::::I  A:::::A               A:::::A        !!! \r\n"
					+ "B::::::::::::::::B     OO:::::::::OO   M::::::M               M::::::M     D::::::::::::DDD   I::::::::I A:::::A                 A:::::A      !!:!!\r\n"
					+ "BBBBBBBBBBBBBBBBB        OOOOOOOOO     MMMMMMMM               MMMMMMMM     DDDDDDDDDDDDD      IIIIIIIIIIAAAAAAA                   AAAAAAA      !!! ");
			System.out.println("          |\r\n"
					+ "                                       \\ _ /\r\n"
					+ "                                     -= (_) =-\r\n"
					+ "    .\\/.                               /   \\\r\n"
					+ " .\\\\//o\\\\                      ,\\/.      |              ,~\r\n"
					+ " //o\\\\|,\\/.   ,.,.,   ,\\/.  ,\\//o\\\\                     |\\\r\n"
					+ "   |  |//o\\  /###/#\\  //o\\  /o\\\\|                      /| \\\r\n"
					+ " ^^|^^|^~|^^^|' '|:|^^^|^^^^^|^^|^^^\"\"\"\"\"\"\"\"(\"~~~~~~~~/_|__\\~~~~~~~~~~\r\n"
					+ "  .|'' . |  '''\"\"'\"''. |`===`|''  '\"\" \"\" \" (\" ~~~~ ~ ~======~~  ~~ ~\r\n"
					+ "  jgs^^   ^^^ ^ ^^^ ^^^^ ^^^ ^^ ^^ \"\" \"\"\"( \" ~~~~~~ ~~~~~  ~~~ ~");
			Thread.sleep(4000);
			System.out.println("O sol já nasceu lá na fazendinha!!! :)");
			
		
			System.out.println("\nDigite: 1 - para acordar o Bezerro e a vaquinha");
			acorda = ler.nextInt();
			
			if (acorda == 1) {
				b.barulhoBicho();
				b.getImagem();
				v.barulhoBicho();
				v.getImagem();
				
				Thread.sleep(3000);
				while(play != 1) {
					System.out.println("\nDigite: 1 - para dar play na galinha");
					play = ler.nextInt();
					
					if(play == 1) {
						System.out.println("Que já cocoricou dona galinha");
						g.barulhoBicho();
						g.getImagem();
					} else {
						System.out.println("Ops!");
						System.out.println("\nDigite: 1 - para dar play na galinha");
						play = ler.nextInt();
					}
				}
				
				Thread.sleep(7000);
				System.out.println("  _                           _        _ \r\n"
						+ " | |                         | |      | |\r\n"
						+ " | |     _____   ____ _ _ __ | |_ __ _| |\r\n"
						+ " | |    / _ \\ \\ / / _` | '_ \\| __/ _` | |\r\n"
						+ " | |___|  __/\\ V / (_| | | | | || (_| |_|\r\n"
						+ " |______\\___| \\_/ \\__,_|_| |_|\\__\\__,_(_)\r\n"
						+ "                                         \r\n"
						+ "                                         ");
				System.out.println("\nDigite: 1 - Para fazer o cavalo pular da cama: ");
				play = ler.nextInt();
				
				if(play == 1) {
					System.out.println("Que o cavalinho já pulou da cama");
					c.barulhoBicho();
					c.getImagem();
				}
				
				Thread.sleep(4000);
				System.out.println("\nDigite: 1 - Para fazer o pintinho tirar o pijama: ");
				play = ler.nextInt();
				
				if(play == 1) {
					System.out.println("Que o pintinho tirou seu pijama");
					p.barulhoBicho();
					p.getImagem();
				}
				
				System.out.println("\nDigite: 1 - Para fazer o porquinho mergulhar na lama: ");
				play = ler.nextInt();
			
				
				if(play == 1) {
					System.out.println("E o porquinho já caiu na lama");
					pig.barulhoBicho();
					pig.getImagem();
					
					Thread.sleep(3000);
					System.out.println(" _____ _____  _____                                                    \r\n"
							+ " |_   _|  __ \\|  __ \\     /\\        /\\        /\\        /\\        /\\    \r\n"
							+ "   | | | |__) | |__) |   /  \\      /  \\      /  \\      /  \\      /  \\   \r\n"
							+ "   | | |  _  /|  _  /   / /\\ \\    / /\\ \\    / /\\ \\    / /\\ \\    / /\\ \\  \r\n"
							+ "  _| |_| | \\ \\| | \\ \\  / ____ \\  / ____ \\  / ____ \\  / ____ \\  / ____ \\ \r\n"
							+ " |_____|_|  \\_\\_|  \\_\\/_/    \\_\\/_/    \\_\\/_/    \\_\\/_/    \\_\\/_/    \\_\\\r\n"
							+ "                                                                        \r\n"
							+ "                                                                        ");
				}
				
				Thread.sleep(4000);
				System.out.println("  _       __                   __                        _ _       _               __                         _      /\\/| \r\n"
						+ " | |     /_/                  / _|                      | (_)     | |             /_/                        | |    |/\\/  \r\n"
						+ " | |     __ _   _ __   __ _  | |_ __ _ _______ _ __   __| |_ _ __ | |__   __ _    ___   _ __ ___   __ _ _ __ | |__   __ _ \r\n"
						+ " | |    / _` | | '_ \\ / _` | |  _/ _` |_  / _ \\ '_ \\ / _` | | '_ \\| '_ \\ / _` |  / _ \\ | '_ ` _ \\ / _` | '_ \\| '_ \\ / _` |\r\n"
						+ " | |___| (_| | | | | | (_| | | || (_| |/ /  __/ | | | (_| | | | | | | | | (_| | |  __/ | | | | | | (_| | | | | | | | (_| |\r\n"
						+ " |______\\__,_| |_| |_|\\__,_| |_| \\__,_/___\\___|_| |_|\\__,_|_|_| |_|_| |_|\\__,_|  \\___| |_| |_| |_|\\__,_|_| |_|_| |_|\\__,_|\r\n"
						+ "                                                                                                                          \r\n"
						+ "                                                                                                                          ");
				Thread.sleep(1000);
				System.out.println("  _____       _                 _                              _                                                                  __  \r\n"
						+ " |  __ \\     (_)               | |                            | |                                                                /_/  \r\n"
						+ " | |  | | ___ ___  ____ _    __| | ___   _ __ ___   __ _ _ __ | |__   __ _    ___  __   _____ _ __ ___    _ __  _ __ __ _    ___ __ _ \r\n"
						+ " | |  | |/ _ \\ \\ \\/ / _` |  / _` |/ _ \\ | '_ ` _ \\ / _` | '_ \\| '_ \\ / _` |  / _ \\ \\ \\ / / _ \\ '_ ` _ \\  | '_ \\| '__/ _` |  / __/ _` |\r\n"
						+ " | |__| |  __/ |>  < (_| | | (_| |  __/ | | | | | | (_| | | | | | | | (_| | |  __/  \\ V /  __/ | | | | | | |_) | | | (_| | | (_| (_| |\r\n"
						+ " |_____/ \\___|_/_/\\_\\__,_|  \\__,_|\\___| |_| |_| |_|\\__,_|_| |_|_| |_|\\__,_|  \\___|   \\_/ \\___|_| |_| |_| | .__/|_|  \\__,_|  \\___\\__,_|\r\n"
						+ "                                                                                                         | |                          \r\n"
						+ "                                                                                                         |_|                          ");
				Thread.sleep(1000);
				System.out.println("   ____                        _____       _             _                                                      __   _                     \r\n"
						+ "  / __ \\                      / ____|     | |           (_)                                                    /_/  | |                    \r\n"
						+ " | |  | |_   _  ___    ___   | (___   ___ | |  _ __ __ _ _  ___  _   _    ___    __ _  __ _  ___  _ __ __ _    ___  | |__   ___  _ __ __ _ \r\n"
						+ " | |  | | | | |/ _ \\  / _ \\   \\___ \\ / _ \\| | | '__/ _` | |/ _ \\| | | |  / _ \\  / _` |/ _` |/ _ \\| '__/ _` |  / _ \\ | '_ \\ / _ \\| '__/ _` |\r\n"
						+ " | |__| | |_| |  __/ | (_) |  ____) | (_) | | | | | (_| | | (_) | |_| | |  __/ | (_| | (_| | (_) | | | (_| | |  __/ | | | | (_) | | | (_| |\r\n"
						+ "  \\___\\_\\\\__,_|\\___|  \\___/  |_____/ \\___/|_| |_|  \\__,_|_|\\___/ \\__,_|  \\___|  \\__,_|\\__, |\\___/|_|  \\__,_|  \\___| |_| |_|\\___/|_|  \\__,_|\r\n"
						+ "                                                                                       __/ |                                               \r\n"
						+ "                                                                                      |___/                                                 ");
				Thread.sleep(1000);
				System.out.println("     _        _          _                      \r\n"
						+ "     | |      | |        (_)                     \r\n"
						+ "   __| | ___  | |__  _ __ _ _ __   ___ __ _ _ __ \r\n"
						+ "  / _` |/ _ \\ | '_ \\| '__| | '_ \\ / __/ _` | '__|\r\n"
						+ " | (_| |  __/ | |_) | |  | | | | | (_| (_| | |   \r\n"
						+ "  \\__,_|\\___| |_.__/|_|  |_|_| |_|\\___\\__,_|_|   \r\n"
						+ "                                                 \r\n"
						+ "                                                 ");
			}
			
			fim = false;
			}while (fim != false);
			System.out.println("Programa finalizado..");
			break;
			
		case 2:
			System.out.println("Volte quando amanhecer. Boa noite!");
			break;
			
		default:
			System.out.println("Ainda não amanheceu na fazendinha! :(\n");

		}
		}while(dia != 0);
	}
}

/*
 * Bom dia O Sol já nasceu lá na fazendinha Acorda o bezerro e a vaquinha Que já
 * cocoricou dona galinha Levanta Que o cavalinho já pulou da cama Que o
 * pintinho tirou seu pijama E o porquinho já caiu na lama Lá na fazendinha é
 * manhã Deixa de manha e vem pra cá Que o Sol raiou e agora é hora de brincar
 */