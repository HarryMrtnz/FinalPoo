package logica;

import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Apostador {
	
	private String tres, dos, uno;
	private int dinero = 1000, apuesta1, apuesta2, apuesta3;

	
	
	public void apostar (LinkedList<Pais> listaPaises) {
		String [] equipos = new String[listaPaises.size()];
		
		for (Pais pais : listaPaises) {
			equipos [listaPaises.indexOf(pais)]= pais.getNombre();
		}
		
		tres = (String) JOptionPane.showInputDialog(
				null // para que se muestre centrado
				,"Debes elegir que tres paises crees que estarán en el podio"
				+ "\nDuplicarás lo que apuestes si el pais sale en el podio y triplicarás si eliges"
				+ "\nel puesto correcto por cada pais que elijas."
				+ "\nSi aciertas el campeon ganarás 10 veces los apostado."
				+ "\n"
				+ "\nElija cual equipo ganará el TERCER puesto: " // Mensaje de la ventana
				,"Menu de apuestas" // Titulo de la ventana
				,JOptionPane.QUESTION_MESSAGE // Icono
				,null //null para icono defecto de la ventana
				,equipos// el objeto
				,equipos[0] // posicion del que va aparecer seleccionado
				);
			apuesta3 = Integer.parseInt(JOptionPane.showInputDialog(null
					, "Tienes $"+dinero+"\n"
					+ "¿Cuanto dinero desea apostar por "+tres+"?"));
		
			if (dinero >= apuesta3) {
				dinero = dinero - apuesta3;
			} else {
				JOptionPane.showMessageDialog(null, "No tienes dinero suficiente para realizar esa apuesta. F\n"
						+ "Vuelve a realizar la apuesta.");
				apostar(listaPaises);
			}
			
		dos = (String) JOptionPane.showInputDialog(
				null, "Elija cual equipo ganará el SEGUNDO puesto: ","Menu de apuestas"
				,JOptionPane.QUESTION_MESSAGE ,null ,equipos, equipos[0]);
			apuesta2 = Integer.parseInt(JOptionPane.showInputDialog(null
					, "Tienes $"+dinero+"\n"
					+ "¿Cuanto dinero desea apostar por "+dos+"?"));
		
			if (dinero >= apuesta2) {
				dinero = dinero - apuesta2;
			} else {
				JOptionPane.showMessageDialog(null, "No tienes dinero suficiente para realizar esa apuesta. F\n"
						+ "Vuelve a realizar tus apuestas.");
				apostar(listaPaises);
			}
			
		uno = (String) JOptionPane.showInputDialog(
				null, "Elija cual equipo sera el CAMPEON: ","Menu de apuestas"
				,JOptionPane.QUESTION_MESSAGE ,null ,equipos, equipos[0]);
			apuesta1 = Integer.parseInt(JOptionPane.showInputDialog(null
					, "Tienes $"+dinero+"\n"
					+ "¿Cuanto dinero desea apostar por "+uno+"?"));
			
			if (dinero >= apuesta1) {
				dinero = dinero - apuesta1;
			} else {
				JOptionPane.showMessageDialog(null, "No tienes dinero suficiente para realizar esa apuesta. F\n"
						+ "Vuelve a realizar tus apuestas.");
				apostar(listaPaises);
			}
			
			JOptionPane.showMessageDialog(null, "Apostaste por "+tres+", "+dos+" y "+uno
					+ "\nPronto comenzará el mundial, mucha suerte!");
	}
	
	public void calcularRecompenza(LinkedList<Pais> tercero, LinkedList<Pais> segundo, LinkedList<Pais> ganador) {
		
		for (Pais pais3 : tercero) {			
		
			for (Pais pais2 : segundo) {
					
				for (Pais pais1 : ganador) {
					
					if (tres == pais2.getNombre() || tres == pais1.getNombre()) {
						apuesta3 = apuesta3*2; //duplica la apuesta
						dinero = dinero + apuesta3;
					}else if(tres == pais3.getNombre() ){
						apuesta3 = apuesta3 *3; //triplica la apuesta
						dinero = dinero + apuesta3;
					}else{
						apuesta3 = 0;
					}
					
					if (dos == pais3.getNombre() || dos == pais1.getNombre()) {
						apuesta2 = apuesta2*2; //duplica la apuesta
						dinero = dinero + apuesta2;
					}else if(dos == pais2.getNombre() ){
						apuesta2 = apuesta2 *3; //triplica la apuesta
						dinero = dinero + apuesta2;
					}else{
						apuesta2 = 0;
					}
					
					if (uno == pais3.getNombre() || uno == pais2.getNombre() ){
						apuesta1 = apuesta1*2; //duplica la apuesta
						dinero = dinero + apuesta3;
					}else if(uno == pais1.getNombre() ){
						apuesta1 = apuesta1 * 10; //Ganador maximo
						dinero = dinero + apuesta1;
					}else{
						apuesta1 = 0;
					}
					
					JOptionPane.showMessageDialog(null, "Resultado de tu apuesta:"
							+ "\nPor "+tres+" has ganado $"+apuesta3
							+ "\nPor "+dos+" has ganado $"+apuesta2
							+ "\nPor "+uno+" has ganado $"+apuesta1
							+ "\n\nGracias por participar! Nos vemos en 4 años xD");				
				}
			}
		}
			

	}
	
	
	
}
