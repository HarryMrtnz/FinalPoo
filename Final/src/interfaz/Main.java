package interfaz;

import java.util.LinkedList;
import javax.swing.JOptionPane;

import logica.Encargado;
import logica.Apostador;
import logica.Pais;
import logica.Partido;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(" - PROGRAMACION ORIENTADA A OBJETOS - FINAL"
				+ "\n	  - MUNDIAL QATAR 2022 -"
				+ "\n__________________________________________\n");
		
		Apostador a1 = new Apostador ();
		
		System.out.println("...Añadiendo paises que participaran del Mundial.");
		//Grupo A
		Pais qatar  = new Pais ("1", "Qatar", 0,"A", true );
		Pais ecuador = new Pais ("2", "Ecuador", 0, "A", true );
		Pais senegal = new Pais ("3", "Senegal", 0, "A", true );
		Pais netherlands = new Pais ("4", "Netherlands", 0, "A", true );
		//Grupo B
		Pais england = new Pais ("5", "England", 0, "B", true );
		Pais ir_iran = new Pais ("6", "Ir Iran", 0, "B", true );
		Pais usa = new Pais ("7", "USA", 0, "B", true );
		Pais wales = new Pais ("8", "Wales", 0, "B", true );
		//Grupo C
		Pais argentina = new Pais ("9", "Argentina", 0, "C", true );
		Pais saudi_arabia = new Pais ("10", "Saudi Arabia", 0, "C", true );
		Pais mexico = new Pais ("11", "Mexico", 0, "C", true );
		Pais poland = new Pais ("12", "Poland", 0, "C", true );
		//Grupo D
		Pais france = new Pais ("13", "France", 0, "D", true );
		Pais australia = new Pais ("14", "Australia", 0, "D", true );
		Pais denmark = new Pais ("15", "Denmark", 0, "D", true );
		Pais tunisia = new Pais ("16", "Tunisia", 0, "D", true );
		//Grupo E
		Pais spain = new Pais ("17", "Spain", 0, "E", true );
		Pais costa_rica = new Pais ("18", "Costa Rica", 0, "E", true );
		Pais germany = new Pais ("19", "Germany", 0, "E", true );
		Pais japan = new Pais ("20", "Japan", 0, "E", true );
		//Grupo F
		Pais belgium = new Pais ("21", "Belgium", 0, "F", true );
		Pais canada = new Pais ("22", "Canada", 0, "F", true );
		Pais morocco = new Pais ("23", "Morocco", 0, "F", true );
		Pais croatia = new Pais ("24", "Croatia", 0, "F", true );
		//Grupo G
		Pais brazil = new Pais ("25", "Brazil", 0, "G", true );
		Pais serbia = new Pais ("26", "Serbia", 0, "G", true );
		Pais switzerland = new Pais ("27", "Switzerland", 0, "G", true );
		Pais cameroon = new Pais ("28", "Cameroon", 0, "G", true );
		//Grupo H
		Pais portugal = new Pais ("29", "Portugal", 0, "H", true );
		Pais ghana = new Pais ("30", "Ghana", 0, "H", true );
		Pais uruguay = new Pais ("31", "Uruguay", 0, "H", true );
		Pais korea_republic = new Pais ("32", "Korea Republic", 0, "H", true );
		
		LinkedList<Pais> listaPaises = new LinkedList<Pais>();
		/* A */	listaPaises.add(qatar);		listaPaises.add(ecuador);	   listaPaises.add(senegal);	 listaPaises.add(netherlands);
		/* B */	listaPaises.add(england);	listaPaises.add(ir_iran);	   listaPaises.add(usa);		 listaPaises.add(wales);
		/* C */	listaPaises.add(argentina);	listaPaises.add(saudi_arabia); listaPaises.add(mexico);	 	 listaPaises.add(poland);
		/* D */	listaPaises.add(france);	listaPaises.add(australia);	   listaPaises.add(denmark);	 listaPaises.add(tunisia);
		/* E */	listaPaises.add(spain);		listaPaises.add(costa_rica);   listaPaises.add(germany);	 listaPaises.add(japan);
		/* F */	listaPaises.add(belgium);	listaPaises.add(canada);	   listaPaises.add(morocco);	 listaPaises.add(croatia);
		/* G */	listaPaises.add(brazil);	listaPaises.add(serbia);	   listaPaises.add(switzerland); listaPaises.add(cameroon);
		/* H */	listaPaises.add(portugal);	listaPaises.add(ghana);	 	   listaPaises.add(uruguay);	 listaPaises.add(korea_republic);
		
		System.out.println("...Pidiendo info al encargado.");
//		loginEncargado();
	
		System.out.println("...Generando partidos de grupo.");
		LinkedList<Partido> listaPartidos = new LinkedList<Partido>();
		Partido p1 = new Partido (1, qatar, ecuador);				listaPartidos.add(p1);	
		Partido p2 = new Partido (2, senegal, netherlands);			listaPartidos.add(p2);
		Partido p3 = new Partido (3, qatar, senegal);				listaPartidos.add(p3);	
		Partido p4 = new Partido (4, netherlands, ecuador);			listaPartidos.add(p4);	
		Partido p5 = new Partido (5, netherlands, qatar);			listaPartidos.add(p5);	
		Partido p6 = new Partido (6, ecuador, senegal);				listaPartidos.add(p6);
		
		Partido p7 = new Partido (7, england, ir_iran);				listaPartidos.add(p7);
		Partido p8 = new Partido (8, usa, wales);					listaPartidos.add(p8);
		Partido p9 = new Partido (9, england, usa);					listaPartidos.add(p9);
		Partido p10 = new Partido (10, wales, ir_iran);				listaPartidos.add(p10);	
		Partido p11 = new Partido (11, wales, england);				listaPartidos.add(p11);	
		Partido p12 = new Partido (12, ir_iran, usa);				listaPartidos.add(p12);	
		
		Partido p13 = new Partido (13, argentina, saudi_arabia);	listaPartidos.add(p13); 
		Partido p14 = new Partido (14, mexico, poland);				listaPartidos.add(p14);			
		Partido p15 = new Partido (15, argentina, mexico);			listaPartidos.add(p15);	
		Partido p16 = new Partido (16, poland, saudi_arabia);		listaPartidos.add(p16); 
		Partido p17 = new Partido (17, poland, argentina);			listaPartidos.add(p17); 
		Partido p18 = new Partido (18, saudi_arabia, mexico);		listaPartidos.add(p18); 
		
		Partido p19 = new Partido (19, france, australia);			listaPartidos.add(p19); 
		Partido p20 = new Partido (20, denmark, tunisia);			listaPartidos.add(p20);
		Partido p21 = new Partido (21, france, denmark);			listaPartidos.add(p21);
		Partido p22 = new Partido (22, tunisia, australia);			listaPartidos.add(p22);
		Partido p23 = new Partido (23, tunisia, france);			listaPartidos.add(p23);
		Partido p24 = new Partido (24, australia, denmark);			listaPartidos.add(p24);
		
		Partido p25 = new Partido (25, spain, costa_rica);			listaPartidos.add(p25);
		Partido p26 = new Partido (26, germany, japan);				listaPartidos.add(p26);
		Partido p27 = new Partido (27, spain, germany);				listaPartidos.add(p27);
		Partido p28 = new Partido (28, japan, costa_rica);			listaPartidos.add(p28);
		Partido p29 = new Partido (29, japan, spain);				listaPartidos.add(p29);
		Partido p30 = new Partido (30, costa_rica, germany);		listaPartidos.add(p30);
		
		Partido p31 = new Partido (31, belgium, canada);			listaPartidos.add(p31);
		Partido p32 = new Partido (32, morocco, croatia);			listaPartidos.add(p32);
		Partido p33 = new Partido (33, belgium, morocco);			listaPartidos.add(p33);
		Partido p34 = new Partido (34, croatia, canada);			listaPartidos.add(p34);
		Partido p35 = new Partido (35, croatia, belgium);			listaPartidos.add(p35);
		Partido p36 = new Partido (36, canada, morocco);			listaPartidos.add(p36);
		
		Partido p37 = new Partido (37, brazil, serbia);				listaPartidos.add(p37);
		Partido p38 = new Partido (38, switzerland, cameroon);		listaPartidos.add(p38);
		Partido p39 = new Partido (39, brazil, switzerland);		listaPartidos.add(p39);
		Partido p40 = new Partido (40, cameroon, serbia);			listaPartidos.add(p40);
		Partido p41 = new Partido (41, cameroon, brazil);			listaPartidos.add(p41);
		Partido p42 = new Partido (42, serbia, switzerland);		listaPartidos.add(p42);
		
		Partido p43 = new Partido (43, portugal, ghana);			listaPartidos.add(p43);
		Partido p44 = new Partido (44, uruguay, korea_republic);	listaPartidos.add(p44);
		Partido p45 = new Partido (45, portugal, uruguay);			listaPartidos.add(p45);
		Partido p46 = new Partido (46, korea_republic, ghana);		listaPartidos.add(p46);
		Partido p47 = new Partido (47, korea_republic, portugal);	listaPartidos.add(p47);
		Partido p48 = new Partido (48, ghana, uruguay);				listaPartidos.add(p48);
		System.out.println("...Calculando puestos de face de grupos.");
//		JUGAR FACE GRUPOS
		p1.jugar1(qatar, ecuador);			 p2.jugar1(senegal, netherlands);	p3.jugar1(qatar, senegal);
		p4.jugar1(netherlands, ecuador);	 p5.jugar1(netherlands, qatar); 	p6.jugar1(ecuador, senegal);
		Partido.calcularPuestoGrupos(qatar, ecuador, senegal, netherlands);
		
		p7.jugar1(england, ir_iran);		 p8.jugar1(usa, wales);				p9.jugar1(england, usa);	
		p10.jugar1(wales, ir_iran);			 p11.jugar1(wales, england);		p12.jugar1(ir_iran, usa);
		Partido.calcularPuestoGrupos(england, ir_iran, usa, wales);
		
		p13.jugar1(argentina, saudi_arabia); p14.jugar1(mexico, poland);		p15.jugar1(argentina, mexico);
		p16.jugar1(poland, saudi_arabia);	 p17.jugar1(poland, argentina); 	p18.jugar1(saudi_arabia, mexico);
		Partido.calcularPuestoGrupos(argentina, saudi_arabia, mexico, poland);
		
		p19.jugar1(france, australia);		 p20.jugar1(denmark, tunisia);		p21.jugar1(france, denmark);
		p22.jugar1(tunisia, australia);		 p23.jugar1(tunisia, france); 		p24.jugar1(australia, denmark);
		Partido.calcularPuestoGrupos(france, australia, denmark, tunisia);
		
		p25.jugar1(spain, costa_rica);		 p26.jugar1(germany, japan);		p27.jugar1(spain, germany);
		p28.jugar1(japan, costa_rica);		 p29.jugar1(japan, spain); 			p30.jugar1(costa_rica, germany);
		Partido.calcularPuestoGrupos(spain, costa_rica, germany, japan);
		
		p31.jugar1(belgium, canada);		 p32.jugar1(morocco, croatia);		p33.jugar1(belgium, morocco);
		p34.jugar1(croatia, canada);	  	 p35.jugar1(croatia, belgium); 		p36.jugar1(canada, morocco);
		Partido.calcularPuestoGrupos(belgium, canada, morocco, croatia);
		
		p37.jugar1(brazil, serbia);			 p38.jugar1(switzerland, cameroon);	p39.jugar1(brazil, switzerland);
		p40.jugar1(cameroon, serbia);		 p41.jugar1(cameroon, brazil); 		p42.jugar1(serbia, switzerland);
		Partido.calcularPuestoGrupos(brazil, serbia, switzerland, cameroon);
		
		p43.jugar1(portugal, ghana);		 p44.jugar1(uruguay, korea_republic);	p45.jugar1(portugal, uruguay);
		p46.jugar1(korea_republic, ghana);	 p47.jugar1(korea_republic, portugal);   p48.jugar1(ghana, uruguay);
		Partido.calcularPuestoGrupos(portugal, ghana, uruguay, korea_republic);
		
		System.out.println("...Lista de face Octavos terminada.");
		LinkedList<Pais> listaOctavos = new LinkedList<Pais>();
		
		for (Pais pais : listaPaises) {
			if (pais.isCalificado()) {
				listaOctavos.add(pais);
			}
		}
		Partido.faceOctavos(listaOctavos, listaPartidos);
		System.out.println("...Lista de face Cuartos terminada.");
		LinkedList<Pais> listaCuartos = new LinkedList<Pais>();
		for (Pais pais : listaOctavos) {
			if (pais.isCalificado()) {
				listaCuartos.add(pais);
			}
		}
		Partido.faceCuartos(listaCuartos, listaPartidos);
		System.out.println("...Lista de face Semifinal terminada.");
		LinkedList<Pais> listaSemifinal = new LinkedList<Pais>();
		for (Pais pais : listaCuartos) {
			if (pais.isCalificado()) {
				listaSemifinal.add(pais);
			}
		}
		Partido.faceSemifinal(listaSemifinal, listaPartidos);
		System.out.println("...Lista de partido por Tercer Puesto terminada.");
		System.out.println("...Lista de partido final terminada.");
		LinkedList<Pais> listaTercerPuesto = new LinkedList<Pais>();
		LinkedList<Pais> listaFinal = new LinkedList<Pais>();
		System.out.println("...Calculando quienes pasan a la final.");
		for (Pais pais : listaSemifinal) {
			if (pais.isCalificado()) {
				listaFinal.add(pais);
			}else {
				listaTercerPuesto.add(pais);
			}
		}
		Partido.faceTercerPuesto(listaTercerPuesto, listaPartidos);
		
		LinkedList<Pais> tercero = new LinkedList<Pais>();
		
		for (Pais pais : listaTercerPuesto) {
			if (pais.getPorPartidoTercerPuesto()=="Gano") {
				tercero.add(pais);
			}
		}
		Partido.faceFinal(listaFinal, listaPartidos);
		
		LinkedList<Pais> segundo = new LinkedList<Pais>();
		LinkedList<Pais> ganador = new LinkedList<Pais>();
		System.out.println("...Guardando informacion.");
		for (Pais pais : listaFinal) {
			if (pais.isCalificado()) {
				ganador.add(pais);
			}else {
				segundo.add(pais);
			}
		}
		System.out.println("MUNDIAL GENERADO EXITOSAMENTE.");
		
		// Total de 64 partidos:
		// Face de grupos: 1 al 48 | Face octavos: 49 a 56 | Face cuartos 57 a 60 |
		// Semifinales 61 y 62     | Tercer puesto: 63	   | FINAL: 64

			
		///////////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////
		
//		if (menuApostar(listaPaises, a1) ) {
//			menuConApuesta(listaPaises, listaPartidos, listaOctavos, listaCuartos, listaSemifinal, listaTercerPuesto, listaFinal, tercero, segundo, ganador, a1);
//		} else {
			menuSinApuesta(listaPaises, listaPartidos, listaOctavos, listaCuartos, listaSemifinal, listaTercerPuesto, listaFinal, tercero, segundo, ganador);
//		}
		
	}
	
	public static boolean menuApostar(LinkedList<Pais> listaPaises, Apostador a1) {
		String [] opciones = {"SI", "NO"};
		int opcion = JOptionPane.showOptionDialog(null, "¿Desea realizar una apuesta antes de ver el mundial?", "Menu"
				,0, JOptionPane.QUESTION_MESSAGE,null, opciones, opciones [0]);
		if (opcion == 0) {
			a1.apostar(listaPaises);
			return true;
		}else{
			JOptionPane.showMessageDialog(null, "No se ha realizado ninguna apuesta.\nDisfruta del Munial 2022");
			return false;
		}
	}
	
	public static void menuConApuesta(LinkedList<Pais> listaPaises, LinkedList<Partido> listaPartidos, 
			LinkedList<Pais> listaOctavos, LinkedList<Pais> listaCuartos, LinkedList<Pais> listaSemifinal, 
			LinkedList<Pais> listaTercerPuesto,	LinkedList<Pais> listaFinal, LinkedList<Pais> tercero,
			LinkedList<Pais> segundo, LinkedList<Pais> ganador, Apostador a1) {
		
		String [] opciones = {"VER MUNDIAL", "VER RESULTADO DE APUESTA"};
		int opcion = JOptionPane.showOptionDialog(null, "El mundial ha terminado."
				+ "\nYa puedes ver todos los partidos, resultados"
				+ "\ny ver si has ganado alguna apuesta.", "Menu"
				,0, JOptionPane.QUESTION_MESSAGE,null, opciones, opciones [0]);
		
		if (opcion == 0) {
			menuMundial(listaPaises, listaPartidos, listaOctavos, listaCuartos, listaSemifinal, listaTercerPuesto, listaFinal, tercero, segundo, ganador);
			menuConApuesta(listaPaises, listaPartidos, listaOctavos, listaCuartos, listaSemifinal, listaTercerPuesto, listaFinal, tercero, segundo, ganador, a1);
		
		}else if(opcion == 1){
			a1.calcularRecompenza(tercero, segundo, ganador);
			menuConApuesta(listaPaises, listaPartidos, listaOctavos, listaCuartos, listaSemifinal, listaTercerPuesto, listaFinal, tercero, segundo, ganador, a1);
		}
	}
	
	public static void menuSinApuesta(LinkedList<Pais> listaPaises, LinkedList<Partido> listaPartidos, 
			LinkedList<Pais> listaOctavos, LinkedList<Pais> listaCuartos, LinkedList<Pais> listaSemifinal, 
			LinkedList<Pais> listaTercerPuesto,	LinkedList<Pais> listaFinal, LinkedList<Pais> tercero,
			LinkedList<Pais> segundo, LinkedList<Pais> ganador) {
		
		String [] opciones = {"VER MUNDIAL"};
		int opcion = JOptionPane.showOptionDialog(null, "El mundial ha terminado."
				+ "\nYa puedes ver todos los partidos, resultados, etc.", "Menu"
				,0, JOptionPane.QUESTION_MESSAGE,null, opciones, opciones [0]);
		
		if (opcion == 0) {
			menuMundial(listaPaises, listaPartidos, listaOctavos, listaCuartos, listaSemifinal, listaTercerPuesto, listaFinal, tercero, segundo, ganador);
			menuSinApuesta(listaPaises, listaPartidos, listaOctavos, listaCuartos, listaSemifinal, listaTercerPuesto, listaFinal, tercero, segundo, ganador);
		}
	}
	
	public static void loginEncargado() {
		String usu = JOptionPane.showInputDialog("Hola, debes ser Encargado Oficial para generar el mundial."
				+ "\n\nIngrese su USUARIO:");
		String pass = JOptionPane.showInputDialog("Ingrese su CONTRASEÑA:");

		Encargado e1 = new Encargado ("11222333", "Gamaliel Natanael", "Quiroz", "Pikachu", "asd123");
		
		if (e1.Ingreso(usu, pass)) {
			JOptionPane.showMessageDialog(null, "Sesion iniciada correctamente!"
					+ "\n Bienvenido Encargado "+e1.getNombre()+" "+e1.getApellido()
					+ "\n\nAl aceptar comenzará el Mundial 2022");
		} else {
			JOptionPane.showMessageDialog(null, "Datos incorrectos, vuelve a ingresar tus datos.");
			loginEncargado();
		}
	}
	
	public static void menuMundial(LinkedList<Pais> listaPaises, LinkedList<Partido> listaPartidos, 
				LinkedList<Pais> listaOctavos, LinkedList<Pais> listaCuartos, LinkedList<Pais> listaSemifinal, 
				LinkedList<Pais> listaTercerPuesto,	LinkedList<Pais> listaFinal, LinkedList<Pais> tercero,
				LinkedList<Pais> segundo, LinkedList<Pais> ganador){
		
		int opcion =  Integer.parseInt(JOptionPane.showInputDialog(null
				, " -  Menu - Mundial Qatar 2022\n"
				+ " - ESCOJA LA OPCION DESEADA:\n"
				+ "   1- Mostrar todos los equipos.\n"
				+ "   2- Buscar equipos por nombre.\n"
				+ "   3- Buscar equipos por grupo.\n"
				+ "\n"
				+ " - FASE DE GRUPOS, VER: \n"
				+ "   4- Partidos por grupo.\n"
				+ "   5- Equipos clasificados.\n"
				+ "\n"
				+ " - FASE DE OCTAVOS, VER: \n"
				+ "   6- Equipos clasificados a Octavos.\n"
				+ "   7- Partidos de Octavos.\n"
				+ "\n"
				+ " - FASE DE CUARTOS, VER: \n"
				+ "   8- Equipos clasificados a Cuartos.\n"
				+ "   9- Partidos de Cuartos.\n"
				+ "\n"
				+ " -FASE SEMIFINAL, VER: \n"
				+ "  10- Equipos clasificados a Semifinales.\n"
				+ "  11- Partidos de Semifinal\n"
				+ "\n"
				+ " - FASE FINAL, VER: \n"
				+ "  12- Clasificados a Tercer Puesto.\n"
				+ "  13- Partido por Tercer Puesto\n"
				+ "  14- Clasificados a la Final.\n"
				+ "  15- Partido final.\n"
				+ "  16- Podio Mundial Qatar 2022\n"
				+ "\n"
				+ "  17- Buscar partidos por pais\n" ));
		
		switch (opcion) {
		case 1:
			Pais.mostrarEquipos(listaPaises);
			menuMundial(listaPaises, listaPartidos, listaOctavos, listaCuartos, listaSemifinal, listaTercerPuesto, listaFinal, tercero, segundo, ganador);
			break;
			
		case 2:
			Pais.buscarEquipo(listaPaises);
			menuMundial(listaPaises, listaPartidos, listaOctavos, listaCuartos, listaSemifinal, listaTercerPuesto, listaFinal, tercero, segundo, ganador);
			break;

		case 3:
			Pais.buscarGrupo(listaPaises);
			menuMundial(listaPaises, listaPartidos, listaOctavos, listaCuartos, listaSemifinal, listaTercerPuesto, listaFinal, tercero, segundo, ganador);
			break;
			
		case 4:
			Partido.buscarPartidoGrupo(listaPartidos, listaPaises);
			menuMundial(listaPaises, listaPartidos, listaOctavos, listaCuartos, listaSemifinal, listaTercerPuesto, listaFinal, tercero, segundo, ganador);
			break;
		
		case 5:
			Partido.clasificadosGrupo(listaPaises, listaPartidos, listaOctavos, listaCuartos, listaSemifinal, listaTercerPuesto, listaFinal, tercero, segundo, ganador);
			menuMundial(listaPaises, listaPartidos, listaOctavos, listaCuartos, listaSemifinal, listaTercerPuesto, listaFinal, tercero, segundo, ganador);
			break;
			
		case 6:
			Partido.listaOctavos(listaOctavos);
			menuMundial(listaPaises, listaPartidos, listaOctavos, listaCuartos, listaSemifinal, listaTercerPuesto, listaFinal, tercero, segundo, ganador);
			break;
			
		case 7:
			Partido.verPartidosOctavos(listaPartidos);
			menuMundial(listaPaises, listaPartidos, listaOctavos, listaCuartos, listaSemifinal, listaTercerPuesto, listaFinal, tercero, segundo, ganador);
			break;
			
		case 8:
			Partido.listaCuartos(listaCuartos);
			menuMundial(listaPaises, listaPartidos, listaOctavos, listaCuartos, listaSemifinal, listaTercerPuesto, listaFinal, tercero, segundo, ganador);
			break;
			
		case 9:
			Partido.verPartidosCuartos(listaPartidos);
			menuMundial(listaPaises, listaPartidos, listaOctavos, listaCuartos, listaSemifinal, listaTercerPuesto, listaFinal, tercero, segundo, ganador);
			break;
			
		case 10:
			Partido.listaSemifinal(listaSemifinal); 
			menuMundial(listaPaises, listaPartidos, listaOctavos, listaCuartos, listaSemifinal, listaTercerPuesto, listaFinal, tercero, segundo, ganador);
			break;
			
		case 11:
			Partido.verPartidosSemifinales(listaPartidos); 
			menuMundial(listaPaises, listaPartidos, listaOctavos, listaCuartos, listaSemifinal, listaTercerPuesto, listaFinal, tercero, segundo, ganador);
			break;
			
		case 12:
			Partido.listaTercerPuesto(listaTercerPuesto);
			menuMundial(listaPaises, listaPartidos, listaOctavos, listaCuartos, listaSemifinal, listaTercerPuesto, listaFinal, tercero, segundo, ganador);
			break;
			
		case 13:
			Partido.verPartidoTercerPuesto(listaPartidos);
			menuMundial(listaPaises, listaPartidos, listaOctavos, listaCuartos, listaSemifinal, listaTercerPuesto, listaFinal, tercero, segundo, ganador);
			break;
			
		case 14:
			Partido.listaFinal(listaFinal);
			menuMundial(listaPaises, listaPartidos, listaOctavos, listaCuartos, listaSemifinal, listaTercerPuesto, listaFinal, tercero, segundo, ganador);
			break;
			
		case 15:
			Partido.verFinal(listaPartidos);
			menuMundial(listaPaises, listaPartidos, listaOctavos, listaCuartos, listaSemifinal, listaTercerPuesto, listaFinal, tercero, segundo, ganador);
			break;
			
		case 16:
			Partido.verPodio(tercero, segundo, ganador);	
			menuMundial(listaPaises, listaPartidos, listaOctavos, listaCuartos, listaSemifinal, listaTercerPuesto, listaFinal, tercero, segundo, ganador);
			break;
			
		case 17:
			Partido.BuscarPartidoEquipos(listaPartidos, listaPaises);
			menuMundial(listaPaises, listaPartidos, listaOctavos, listaCuartos, listaSemifinal, listaTercerPuesto, listaFinal, tercero, segundo, ganador);
			break;
			
		default:
			menuMundial(listaPaises, listaPartidos, listaOctavos, listaCuartos, listaSemifinal, listaTercerPuesto, listaFinal, tercero, segundo, ganador);
			break;
		}
	}
	
	
	
}
