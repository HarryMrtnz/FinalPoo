package logica;

import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Partido {
	private int id = 0;
	private String nombre;
	private Pais pais1;
	private Pais pais2;
	private String detalle;
	private int duracion;

	public Partido(int id, Pais pais1, Pais pais2) {
		super();
		this.id = id;
		this.pais1 = pais1;
		this.pais2 = pais2;
	}
	
	@Override
	public String toString() {
		return "Partido [id=" + id + ", pais1=" + pais1 + ", pais2=" + pais2 + ", duracion=" + duracion + "]";
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pais getPais1() {
		return pais1;
	}

	public void setPais1(Pais pais1) {
		this.pais1 = pais1;
	}

	public Pais getPais2() {
		return pais2;
	}

	public void setPais2(Pais pais2) {
		this.pais2 = pais2;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	
	//Metodo para jugar en face de Grupos, donde no se desempata y clasificar por puntos
	public void jugar1(Pais pais1, Pais pais2) { 
		int gol1, gol2, tiempoExtra; //Goles de cada equipo
		gol1 =(int) (Math.random()*6 );
		gol2 =(int) (Math.random()*6 );
		tiempoExtra =(int) (Math.random()*10 );
		
		this.setDuracion(90+tiempoExtra);
		this.nombre = pais1.getNombre()+" vs " +pais2.getNombre();
		
		pais1.setGoles(pais1.getGoles()+gol1);
		pais2.setGoles(pais2.getGoles()+gol2);
		//Pais que gana suma 3 puntos, pais que pierde no suma puntos, partido empatado ambos suman 1 punto
		if (gol1 > gol2) {
			pais1.setPuntos(pais1.getPuntos()+3);
			this.detalle = "\n Gano " + pais1.getNombre()+"\n"
					+ " Resultado: "+ pais1.getNombre()+" "+gol1+" | "+ gol2 +" "+ pais2.getNombre()+"\n" 
					+ "Duracion total de partido: "+this.getDuracion()+" minutos.\n" ;		
		} else if(gol1 < gol2){
			pais2.setPuntos(pais2.getPuntos()+3);
			this.detalle = "\n Gano " + pais2.getNombre()+"\n"
					+ " Resultado: "+ pais1.getNombre()+" "+gol1+" | "+ gol2 +" "+ pais2.getNombre()+"\n" 
					+ "Duracion total de partido: "+this.getDuracion()+" minutos.\n" ;
		} else {
			pais1.setPuntos(pais1.getPuntos()+1);
			pais2.setPuntos(pais2.getPuntos()+1);
			this.detalle = "\n Partido empatado \n"
					+ " Resultado: "+ pais1.getNombre()+" "+gol1+" | "+ gol2 +" "+ pais2.getNombre()+"\n" 
					+ "Duracion total de partido: "+this.getDuracion()+" minutos.\n" ;
		}	
	}
	
	//metodo para jugar en octavos, pais que gana pasa de ronda, empate van a penales!
	public void jugar2(Pais pais1, Pais pais2) {
		int gol1, gol2, tiempoExtra; //Goles de cada equipo
		gol1 =(int) (Math.random()*6 );
		gol2 =(int) (Math.random()*6 );
		
		tiempoExtra =(int) (Math.random()*10 );
		this.setDuracion(90+tiempoExtra);
		this.nombre = pais1.getNombre()+" vs " +pais2.getNombre();
		
		pais1.setGoles(pais1.getGoles()+gol1);
		pais2.setGoles(pais2.getGoles()+gol2);
		//Pais que gana suma 3 puntos, pais que pierde no suma puntos, partido empatado ambos suman 1 punto
		if (gol1 > gol2) {
			pais2.setCalificado(false);
			this.detalle = "\n Gano " + pais1.getNombre()+"\n"
					+ " Resultado: "+ pais1.getNombre()+" "+gol1+" | "+ gol2 +" "+ pais2.getNombre()+"\n" 
					+ "Duracion total de partido: "+this.getDuracion()+" minutos." ;	
		} else if(gol1 < gol2){
			pais1.setCalificado(false);
			this.detalle = "\n Gano " + pais2.getNombre()+"\n"
					+ " Resultado: "+ pais1.getNombre()+" "+gol1+" | "+ gol2 +" "+ pais2.getNombre()+"\n" 
					+ "Duracion total de partido: "+this.getDuracion()+" minutos." ;
		} else { //empate
			int gol3, gol4; //Goles de cada equipo
			gol3 =(int) (Math.random()*6 );
			gol4 =(int) (Math.random()*6 );
			tiempoExtra =(int) (Math.random()*5 );
			this.setDuracion(90+tiempoExtra+15);
			
			pais1.setGoles(pais1.getGoles()+gol3);
			pais2.setGoles(pais2.getGoles()+gol4);
			if (gol3 >= gol4) {
				pais2.setCalificado(false);
				this.detalle = "\n Partido empatado.\n Definicion por penales.\n Gano " + pais1.getNombre()+"\n"
						+ " Resultado: "+ pais1.getNombre()+" "+ gol1+" ("+gol3+") | ("+ gol4 +") "+gol2+" "+ pais2.getNombre()+"\n" 
						+ "Duracion total de partido: "+this.getDuracion()+" minutos.\n" ;	
			} else {
				pais1.setCalificado(false);
				this.detalle = "\n Partido empatado.\n Definicion por penales.\n Gano " + pais2.getNombre()+"\n"
						+ " Resultado: "+ pais1.getNombre()+" "+ gol1+" ("+gol3+") | ("+ gol4 +") "+gol2+" "+ pais2.getNombre()+"\n" 
						+ "Duracion total de partido: "+this.getDuracion()+" minutos.\n" ;
			} 
		}
	}
	
	//metodo para jugar por el tercer puesto ya que ambos equipos perdieron tienen getCalificado=false
	public void jugar3(Pais pais1, Pais pais2) {
		int gol1, gol2, tiempoExtra; //Goles de cada equipo
		gol1 =(int) (Math.random()*6 );
		gol2 =(int) (Math.random()*6 );
		
		tiempoExtra =(int) (Math.random()*10 );
		this.setDuracion(90+tiempoExtra);
		this.nombre = pais1.getNombre()+" vs " +pais2.getNombre();
		
		pais1.setGoles(pais1.getGoles()+gol1);
		pais2.setGoles(pais2.getGoles()+gol2);
		//Pais que gana suma 3 puntos, pais que pierde no suma puntos, partido empatado ambos suman 1 punto
		if (gol1 > gol2) {
			pais1.setPorPartidoTercerPuesto("Gano");
			this.detalle = "\n Gano " + pais1.getNombre()+"\n"
					+ " Resultado: "+ pais1.getNombre()+" "+gol1+" | "+ gol2 +" "+ pais2.getNombre()+"\n" 
					+ "Duracion total de partido: "+this.getDuracion()+" minutos." ;	
		} else if(gol1 < gol2){
			pais2.setPorPartidoTercerPuesto("Gano");
			this.detalle = "\n Gano " + pais2.getNombre()+"\n"
					+ " Resultado: "+ pais1.getNombre()+" "+gol1+" | "+ gol2 +" "+ pais2.getNombre()+"\n" 
					+ "Duracion total de partido: "+this.getDuracion()+" minutos." ;
		} else { //empate
			int gol3, gol4; //Goles de cada equipo
			gol3 =(int) (Math.random()*6 );
			gol4 =(int) (Math.random()*6 );
			tiempoExtra =(int) (Math.random()*5 );
			this.setDuracion(90+tiempoExtra+15);
			
			pais1.setGoles(pais1.getGoles()+gol3);
			pais2.setGoles(pais2.getGoles()+gol4);
			if (gol3 >= gol4) {
				pais1.setPorPartidoTercerPuesto("Gano");
				this.detalle = "\n Partido empatado.\n Definicion por penales.\n Gano " + pais1.getNombre()+"\n"
						+ " Resultado: "+ pais1.getNombre()+" "+ gol1+" ("+gol3+") | ("+ gol4 +") "+gol2+" "+ pais2.getNombre()+"\n" 
						+ "Duracion total de partido: "+this.getDuracion()+" minutos.\n" ;	
			} else {
				pais2.setPorPartidoTercerPuesto("Gano");
				this.detalle = "\n Partido empatado.\n Definicion por penales.\n Gano " + pais2.getNombre()+"\n"
						+ " Resultado: "+ pais1.getNombre()+" "+ gol1+" ("+gol3+") | ("+ gol4 +") "+gol2+" "+ pais2.getNombre()+"\n" 
						+ "Duracion total de partido: "+this.getDuracion()+" minutos.\n" ;
			} 
		}
	}

	public static void calcularPuestoGrupos(Pais pais1, Pais pais2, Pais pais3, Pais pais4) {
		/* 01 */if (pais1.getPuntos() >= pais2.getPuntos() && pais2.getPuntos() >= pais3.getPuntos() && pais3.getPuntos() >= pais4.getPuntos()) {
			pais1.setPuestoGrupo(1); pais2.setPuestoGrupo(2); pais3.setPuestoGrupo(3); pais4.setPuestoGrupo(4);
		/* 02 */} else if (pais1.getPuntos() >= pais2.getPuntos() && pais2.getPuntos() >= pais4.getPuntos() && pais4.getPuntos() >= pais3.getPuntos()){
			pais1.setPuestoGrupo(1); pais2.setPuestoGrupo(2); pais4.setPuestoGrupo(3); pais3.setPuestoGrupo(4);
		/* 03 */} else if (pais1.getPuntos() >= pais3.getPuntos() && pais3.getPuntos() >= pais2.getPuntos() && pais2.getPuntos() >= pais4.getPuntos()){
			pais1.setPuestoGrupo(1); pais3.setPuestoGrupo(2); pais2.setPuestoGrupo(3); pais4.setPuestoGrupo(4);
		/* 04 */} else if (pais1.getPuntos() >= pais3.getPuntos() && pais3.getPuntos() >= pais4.getPuntos() && pais4.getPuntos() >= pais2.getPuntos()){
			pais1.setPuestoGrupo(1); pais3.setPuestoGrupo(2); pais4.setPuestoGrupo(3); pais2.setPuestoGrupo(4);
		/* 05 */} else if (pais1.getPuntos() >= pais4.getPuntos() && pais4.getPuntos() >= pais2.getPuntos() && pais2.getPuntos() >= pais3.getPuntos()){
			pais1.setPuestoGrupo(1); pais4.setPuestoGrupo(2); pais2.setPuestoGrupo(3); pais3.setPuestoGrupo(4);
		/* 06 */} else if (pais1.getPuntos() >= pais4.getPuntos() && pais4.getPuntos() >= pais3.getPuntos() && pais3.getPuntos() >= pais2.getPuntos()){
			pais1.setPuestoGrupo(1); pais4.setPuestoGrupo(2); pais3.setPuestoGrupo(3); pais2.setPuestoGrupo(4);
			
		/* 07 */} else if (pais2.getPuntos() >= pais1.getPuntos() && pais1.getPuntos() >= pais3.getPuntos() && pais3.getPuntos() >= pais4.getPuntos()){
			pais2.setPuestoGrupo(1); pais1.setPuestoGrupo(2); pais3.setPuestoGrupo(3); pais4.setPuestoGrupo(4);
		/* 08 */} else if (pais2.getPuntos() >= pais1.getPuntos() && pais1.getPuntos() >= pais4.getPuntos() && pais4.getPuntos() >= pais3.getPuntos()){
			pais2.setPuestoGrupo(1); pais1.setPuestoGrupo(2); pais4.setPuestoGrupo(3); pais3.setPuestoGrupo(4);
		/* 09 */} else if (pais2.getPuntos() >= pais3.getPuntos() && pais3.getPuntos() >= pais1.getPuntos() && pais1.getPuntos() >= pais4.getPuntos()){
			pais2.setPuestoGrupo(1); pais3.setPuestoGrupo(2); pais1.setPuestoGrupo(3); pais4.setPuestoGrupo(4);
		/* 10 */} else if (pais2.getPuntos() >= pais3.getPuntos() && pais3.getPuntos() >= pais4.getPuntos() && pais4.getPuntos() >= pais1.getPuntos()){
			pais2.setPuestoGrupo(1); pais3.setPuestoGrupo(2); pais4.setPuestoGrupo(3); pais1.setPuestoGrupo(4);
		/* 11 */} else if (pais2.getPuntos() >= pais4.getPuntos() && pais4.getPuntos() >= pais1.getPuntos() && pais1.getPuntos() >= pais3.getPuntos()){
			pais2.setPuestoGrupo(1); pais4.setPuestoGrupo(2); pais1.setPuestoGrupo(3); pais3.setPuestoGrupo(4);
		/* 12 */} else if (pais2.getPuntos() >= pais4.getPuntos() && pais4.getPuntos() >= pais3.getPuntos() && pais3.getPuntos() >= pais1.getPuntos()){
			pais2.setPuestoGrupo(1); pais4.setPuestoGrupo(2); pais3.setPuestoGrupo(3); pais1.setPuestoGrupo(4);
		
		/* 13 */} else if (pais3.getPuntos() >= pais1.getPuntos() && pais1.getPuntos() >= pais2.getPuntos() && pais2.getPuntos() >= pais4.getPuntos()){
			pais3.setPuestoGrupo(1); pais1.setPuestoGrupo(2); pais2.setPuestoGrupo(3); pais4.setPuestoGrupo(4);
		/* 14 */} else if (pais3.getPuntos() >= pais1.getPuntos() && pais1.getPuntos() >= pais4.getPuntos() && pais4.getPuntos() >= pais2.getPuntos()){
			pais3.setPuestoGrupo(1); pais1.setPuestoGrupo(2); pais4.setPuestoGrupo(3); pais2.setPuestoGrupo(4);
		/* 15 */} else if (pais3.getPuntos() >= pais2.getPuntos() && pais2.getPuntos() >= pais1.getPuntos() && pais1.getPuntos() >= pais4.getPuntos()){
			pais3.setPuestoGrupo(1); pais2.setPuestoGrupo(2); pais1.setPuestoGrupo(3); pais4.setPuestoGrupo(4);
		/* 16 */} else if (pais3.getPuntos() >= pais2.getPuntos() && pais2.getPuntos() >= pais4.getPuntos() && pais4.getPuntos() >= pais1.getPuntos()){
			pais3.setPuestoGrupo(1); pais2.setPuestoGrupo(2); pais4.setPuestoGrupo(3); pais1.setPuestoGrupo(4);
		/* 17 */} else if (pais3.getPuntos() >= pais4.getPuntos() && pais4.getPuntos() >= pais1.getPuntos() && pais1.getPuntos() >= pais2.getPuntos()){
			pais3.setPuestoGrupo(1); pais4.setPuestoGrupo(2); pais1.setPuestoGrupo(3); pais2.setPuestoGrupo(4);
		/* 18 */} else if (pais3.getPuntos() >= pais4.getPuntos() && pais4.getPuntos() >= pais2.getPuntos() && pais2.getPuntos() >= pais1.getPuntos()){
			pais3.setPuestoGrupo(1); pais4.setPuestoGrupo(2); pais2.setPuestoGrupo(3); pais1.setPuestoGrupo(4);
		
		/* 19 */} else if (pais4.getPuntos() >= pais1.getPuntos() && pais1.getPuntos() >= pais2.getPuntos() && pais2.getPuntos() >= pais3.getPuntos()){
			pais4.setPuestoGrupo(1); pais1.setPuestoGrupo(2); pais2.setPuestoGrupo(3); pais3.setPuestoGrupo(4);
		/* 20 */} else if (pais4.getPuntos() >= pais1.getPuntos() && pais1.getPuntos() >= pais3.getPuntos() && pais3.getPuntos() >= pais2.getPuntos()){
			pais4.setPuestoGrupo(1); pais1.setPuestoGrupo(2); pais3.setPuestoGrupo(3); pais2.setPuestoGrupo(4);
		/* 21 */} else if (pais4.getPuntos() >= pais2.getPuntos() && pais2.getPuntos() >= pais1.getPuntos() && pais1.getPuntos() >= pais3.getPuntos()){
			pais4.setPuestoGrupo(1); pais2.setPuestoGrupo(2); pais1.setPuestoGrupo(3); pais3.setPuestoGrupo(4);
		/* 22 */} else if (pais4.getPuntos() >= pais2.getPuntos() && pais2.getPuntos() >= pais3.getPuntos() && pais3.getPuntos() >= pais1.getPuntos()){
			pais4.setPuestoGrupo(1); pais2.setPuestoGrupo(2); pais3.setPuestoGrupo(3); pais1.setPuestoGrupo(4);
		/* 23 */} else if (pais4.getPuntos() >= pais3.getPuntos() && pais3.getPuntos() >= pais1.getPuntos() && pais1.getPuntos() >= pais2.getPuntos()){
			pais4.setPuestoGrupo(1); pais3.setPuestoGrupo(2); pais1.setPuestoGrupo(3); pais2.setPuestoGrupo(4);
		/* 24 */} else {
			pais4.setPuestoGrupo(1); pais3.setPuestoGrupo(2); pais2.setPuestoGrupo(3); pais1.setPuestoGrupo(4);
				}
		
		if (pais1.getPuestoGrupo() == 3 || pais1.getPuestoGrupo()== 4){
			pais1.setCalificado(false);
		}
		if (pais2.getPuestoGrupo() == 3 || pais2.getPuestoGrupo()== 4){
			pais2.setCalificado(false);
		}
		if (pais3.getPuestoGrupo() == 3 || pais3.getPuestoGrupo()== 4){
			pais3.setCalificado(false);
		}
		if (pais4.getPuestoGrupo() == 3 || pais4.getPuestoGrupo()== 4){
			pais4.setCalificado(false);
		}
	}
	
	
	public static void buscarPartidoGrupo(LinkedList<Partido> partidos, LinkedList <Pais> paises) {
		//System.out.print("ingrese el grupo para ver los partidos: ");
		String [] grupos = {"A", "B", "C", "D", "E", "F", "G", "H"};
		
		String grupo = (String) JOptionPane.showInputDialog(
				null, "¿De cual grupo desea ver sus partidos? ","Menu"
				,JOptionPane.QUESTION_MESSAGE ,null ,grupos, grupos[0]);
			
		for	(Partido partido : partidos) {
			if (partido.getPais1().getGrupo()== grupo && partido.getId() <=48){
				
				JOptionPane.showMessageDialog(null
				,partido.getNombre()+ partido.getDetalle());
			}
		}
	}
	
	public static void clasificadosGrupo(LinkedList<Pais> paises, LinkedList<Partido> partidos, LinkedList<Pais> octavos, 
	LinkedList<Pais> cuartos, LinkedList<Pais> semifinal, LinkedList<Pais> tercerPuesto, LinkedList<Pais> listaFinal,
	LinkedList<Pais> tercero, LinkedList<Pais> segundo, LinkedList<Pais> ganador) {

		String [] grupos = {"A", "B", "C", "D", "E", "F", "G", "H"};
		
		String grupo = (String) JOptionPane.showInputDialog(
				null, "Seleccione de cual grupo quiere ver los paises clasificados: ","Menu"
				,JOptionPane.QUESTION_MESSAGE ,null ,grupos, grupos[0]);
		
		if(paises.isEmpty()) {
			JOptionPane.showMessageDialog(null,"Lista vacia pá");
		
		}else {
			for (Pais pais : paises) {
				if(pais.getGrupo().equalsIgnoreCase(grupo)) {
					JOptionPane.showMessageDialog (null
							,pais.getNombre()+" clasifico en puesto N°: "+pais.getPuestoGrupo()
							+ "\nEn el grupo "+pais.getGrupo()
							+ "\nPuntos totales: "+pais.getPuntos()+" puntos.\n");			
				}
			}
		}
	}

	public static void listaOctavos(LinkedList<Pais> octavos) {
		if(octavos.isEmpty()) {
			JOptionPane.showMessageDialog(null,"Lista vacia pá");
		
		}else {
			for (Pais pais : octavos) {
				JOptionPane.showMessageDialog(null, "Estos son los "+octavos.size()+" equipos que"
					+ "\nparticiparán de la face de Octavos:"	
					+ "\nEquipo "+pais.getId()+ " = "+ pais.getNombre() + " | Grupo: " + pais.getGrupo());
			}
		}
	}
	
	public static void faceOctavos(LinkedList<Pais> octavos, LinkedList<Partido> listaPartidos) {
		if(octavos.isEmpty()) {
			JOptionPane.showMessageDialog(null,"Lista vacia pá");
		
		}else {
			for (Pais pais1 : octavos) {
				for (Pais pais2 : octavos) {
					if (pais1.getPuestoGrupo()==1 && pais1.getGrupo()=="A") {
						if (pais2.getPuestoGrupo()==2 && pais2.getGrupo()=="B") {

							Partido p49 = new Partido(49, pais1, pais2);
							p49.jugar2(pais1, pais2);	listaPartidos.add(p49);
							if (pais1.isCalificado()) {
								pais1.setPartidoOctavos("Gano1");
							} else {
								pais2.setPartidoOctavos("Gano1");
							}
						}
					}
					if (pais1.getPuestoGrupo()==1 && pais1.getGrupo()=="C") {
						if (pais2.getPuestoGrupo()==2 && pais2.getGrupo()=="D") {

							Partido p50 = new Partido(50, pais1, pais2);
							p50.jugar2(pais1, pais2);	listaPartidos.add(p50);
							if (pais1.isCalificado()) {
								pais1.setPartidoOctavos("Gano2");
							} else {
								pais2.setPartidoOctavos("Gano2");
							}
						}
					}
					if (pais1.getPuestoGrupo()==1 && pais1.getGrupo()=="E") {
						if (pais2.getPuestoGrupo()==2 && pais2.getGrupo()=="F") {

							Partido p51 = new Partido(51, pais1, pais2);
							p51.jugar2(pais1, pais2);	listaPartidos.add(p51);
							if (pais1.isCalificado()) {
								pais1.setPartidoOctavos("Gano3");
							} else {
								pais2.setPartidoOctavos("Gano3");
							}
						}
					}
					if (pais1.getPuestoGrupo()==1 && pais1.getGrupo()=="G") {
						if (pais2.getPuestoGrupo()==2 && pais2.getGrupo()=="H") {

							Partido p52 = new Partido(52, pais1, pais2);
							p52.jugar2(pais1, pais2);	listaPartidos.add(p52);
							if (pais1.isCalificado()) {
								pais1.setPartidoOctavos("Gano4");
							} else {
								pais2.setPartidoOctavos("Gano4");
							}
						}
					}
					if (pais1.getPuestoGrupo()==1 && pais1.getGrupo()=="B") {
						if (pais2.getPuestoGrupo()==2 && pais2.getGrupo()=="A") {

							Partido p53 = new Partido(53, pais1, pais2);
							p53.jugar2(pais1, pais2);	listaPartidos.add(p53);
							if (pais1.isCalificado()) {
								pais1.setPartidoOctavos("Gano5");
							} else {
								pais2.setPartidoOctavos("Gano5");
							}
 						}
					}
					if (pais1.getPuestoGrupo()==1 && pais1.getGrupo()=="D") {
						if (pais2.getPuestoGrupo()==2 && pais2.getGrupo()=="C") {

							Partido p54 = new Partido(54, pais1, pais2);
							p54.jugar2(pais1, pais2);	listaPartidos.add(p54);
							if (pais1.isCalificado()) {
								pais1.setPartidoOctavos("Gano6");
							} else {
								pais2.setPartidoOctavos("Gano6");
							}
						}
					}
					if (pais1.getPuestoGrupo()==1 && pais1.getGrupo()=="F") {
						if (pais2.getPuestoGrupo()==2 && pais2.getGrupo()=="E") {

							Partido p55 = new Partido(55, pais1, pais2);
							p55.jugar2(pais1, pais2);	listaPartidos.add(p55);
							if (pais1.isCalificado()) {
								pais1.setPartidoOctavos("Gano7");
							} else {
								pais2.setPartidoOctavos("Gano7");
							}
						}
					}
					if (pais1.getPuestoGrupo()==1 && pais1.getGrupo()=="H") {
						if (pais2.getPuestoGrupo()==2 && pais2.getGrupo()=="G") {

							Partido p56 = new Partido(56, pais1, pais2);
							p56.jugar2(pais1, pais2);	listaPartidos.add(p56);
							if (pais1.isCalificado()) {
								pais1.setPartidoOctavos("Gano8");
							} else {
								pais2.setPartidoOctavos("Gano8");
							}
						}
					}
				}
			}
		}
	}
	
	public static void listaCuartos(LinkedList<Pais> cuartos) {
		if(cuartos.isEmpty()) {
			JOptionPane.showMessageDialog(null,"Lista vacia pá");
		
		}else {
			for (Pais pais : cuartos) {	
				JOptionPane.showMessageDialog(null, "Estos son los "+cuartos.size()+" equipos que\n"
						+ "participarán de la face de Cuartos:"
						+ "\nEquipo "+pais.getId()+ " = "+ pais.getNombre() + " | Grupo: " + pais.getGrupo());
			}
		}
	}
	
	public static void faceCuartos(LinkedList<Pais> cuartos, LinkedList<Partido> listaPartidos) {
		if(cuartos.isEmpty()) {
			JOptionPane.showMessageDialog(null,"Lista vacia pá");
		
		}else {
			for (Pais pais1 : cuartos) {
				for (Pais pais2 : cuartos) {
					if (pais1.getPartidoOctavos()=="Gano1")
						if(pais2.getPartidoOctavos()=="Gano2") {
						Partido p57 = new Partido(57, pais1, pais2);
						p57.jugar2(pais1, pais2);	listaPartidos.add(p57);
						if (pais1.isCalificado()) {
							pais1.setPartidoCuartos("Gano1");

						} else {
							pais2.setPartidoCuartos("Gano1");
						}
					}
					if (pais1.getPartidoOctavos()=="Gano3")
						if(pais2.getPartidoOctavos()=="Gano4") {
						Partido p58 = new Partido(58, pais1, pais2);
						p58.jugar2(pais1, pais2);	listaPartidos.add(p58);
						if (pais1.isCalificado()) {
							pais1.setPartidoCuartos("Gano2");
						} else {
							pais2.setPartidoCuartos("Gano2");

						}
					}
					if (pais1.getPartidoOctavos()=="Gano5")
						if(pais2.getPartidoOctavos()=="Gano6") {
						Partido p59 = new Partido(59, pais1, pais2);
						p59.jugar2(pais1, pais2);	listaPartidos.add(p59);
						if (pais1.isCalificado()) {
							pais1.setPartidoCuartos("Gano3");
						} else {
							pais2.setPartidoCuartos("Gano3");
						}
					}
					if (pais1.getPartidoOctavos()=="Gano7")
						if(pais2.getPartidoOctavos()=="Gano8") {
						Partido p60 = new Partido(60, pais1, pais2);
						p60.jugar2(pais1, pais2);	listaPartidos.add(p60);
						if (pais1.isCalificado()) {
							pais1.setPartidoCuartos("Gano4");
						} else {
							pais2.setPartidoCuartos("Gano4");
						}
					}
				}
			}
		}
	}
	
	public static void listaSemifinal(LinkedList<Pais> semifinal) {
		if(semifinal.isEmpty()) {
			JOptionPane.showMessageDialog(null,"Lista vacia pá");
		
		}else {
			System.out.println("\n");
			for (Pais pais : semifinal) {	
				JOptionPane.showMessageDialog(null, "Estos son los "+semifinal.size()+" equipos que"
						+ "\nparticiparán de la face de Cuartos:"
						+ "\nEquipo "+pais.getId()+ " = "+ pais.getNombre() + " | Grupo: " + pais.getGrupo());
			}
		}
	}
	
	public static void faceSemifinal(LinkedList<Pais> semifinal, LinkedList<Partido> listaPartidos) {
		if(semifinal.isEmpty()) {
			JOptionPane.showMessageDialog(null,"Lista vacia pá");
		
		}else {
			for (Pais pais1 : semifinal) {
				for (Pais pais2 : semifinal) {
					if (pais1.getPartidoCuartos()=="Gano1")
						if(pais2.getPartidoCuartos()=="Gano2") {
						Partido p61 = new Partido(61, pais1, pais2);
						p61.jugar2(pais1, pais2);	listaPartidos.add(p61);
						if (pais1.isCalificado()) {
							pais1.setPartidoSemifinal("Gano1");
							pais2.setPorPartidoTercerPuesto("1");
						} else {
							pais2.setPartidoSemifinal("Gano1");
							pais1.setPorPartidoTercerPuesto("1");
						}
					}
					if (pais1.getPartidoCuartos()=="Gano3")
						if(pais2.getPartidoCuartos()=="Gano4") {
						Partido p62 = new Partido(62, pais1, pais2);
						p62.jugar2(pais1, pais2);	listaPartidos.add(p62);
						if (pais1.isCalificado()) {
							pais1.setPartidoSemifinal("Gano2");
							pais2.setPorPartidoTercerPuesto("2");
						} else {
							pais2.setPartidoSemifinal("Gano2");
							pais1.setPorPartidoTercerPuesto("2");

						}
					}
				}
			}
		}
	}
	
	public static void listaTercerPuesto(LinkedList<Pais> tercerPuesto) {
		if(tercerPuesto.isEmpty()) {
			JOptionPane.showMessageDialog(null,"Lista vacia pá");
		
		}else {
			for (Pais pais : tercerPuesto) {	
				JOptionPane.showMessageDialog(null,"Estos son los "+tercerPuesto.size()+" equipos que\n"
						+ "participarán por el Tercer Puesto:"
						+ "\nEquipo "+pais.getId()+ " = "+ pais.getNombre() + " | Grupo: " + pais.getGrupo());
			}
		}
	}
	
	public static void faceTercerPuesto(LinkedList<Pais> tercerPuesto, LinkedList<Partido> listaPartidos) {
		if(tercerPuesto.isEmpty()) {
			JOptionPane.showMessageDialog(null,"Lista vacia pá");
		
		}else {
			for (Pais pais1 : tercerPuesto) {
				for (Pais pais2 : tercerPuesto) {
					if (pais1.getPorPartidoTercerPuesto()=="1")
						if (pais2.getPorPartidoTercerPuesto()=="2") {
						Partido p63 = new Partido(63, pais1, pais2);
						p63.jugar3(pais1, pais2);	listaPartidos.add(p63);
					}
				}
			}
		}
	}
	
	public static void listaFinal (LinkedList<Pais> listafinal) {
		if(listafinal.isEmpty()) {
			JOptionPane.showMessageDialog(null,"Lista vacia pá");
		
		}else {
			for (Pais pais : listafinal) {	
				JOptionPane.showMessageDialog(null,"Estos son los "+listafinal.size()+" equipos que\n"
						+ "Juegan la Gran Final:"
						+ "\nEquipo "+pais.getId()+ " = "+ pais.getNombre() + " | Grupo: " + pais.getGrupo());
			}
		}
	}
	
	public static void faceFinal(LinkedList<Pais> listaFinal, LinkedList<Partido> listaPartidos) {
		if(listaFinal.isEmpty()) {
			JOptionPane.showMessageDialog(null,"Lista vacia pá");
		
		}else {
			for (Pais pais1 : listaFinal) {
				for (Pais pais2 : listaFinal) {					
					if (pais1.getPartidoSemifinal()=="Gano1")
						if(pais2.getPartidoSemifinal()=="Gano2") {
						Partido p64 = new Partido(64, pais1, pais2);
						p64.jugar2(pais1, pais2);	listaPartidos.add(p64);
					}
				}
			}
		}
	}
	
	public static void verPodio (LinkedList<Pais> tercero, LinkedList<Pais> segundo, LinkedList<Pais> primero) {

		for (Pais pais3 : tercero ) {
			JOptionPane.showMessageDialog(null,"Tercer Puesto de Mundial QATAR 2022:\n"
					+ "  Equipo "+pais3.getId()+ " = "+ pais3.getNombre() + " | Grupo: " + pais3.getGrupo()
					+"\n  Goles totales realizados: "+pais3.getGoles()+"\n");
		}
		for (Pais pais2 : segundo) {
			JOptionPane.showMessageDialog(null,"Segundo Puesto de Mundial QATAR 2022:\n"
					+ "  Equipo "+pais2.getId()+ " = "+ pais2.getNombre() + " | Grupo: " + pais2.getGrupo()
					+"\n  Goles totales realizados: "+pais2.getGoles()+"\n");
		}
		for (Pais pais1 : primero) {	
			JOptionPane.showMessageDialog(null,"El Gran ganador Mundial QATAR 2022:\n"
					+ "  Equipo "+pais1.getId()+ " = "+ pais1.getNombre() + " | Grupo: " + pais1.getGrupo()
					+"\n  Goles totales realizados: "+pais1.getGoles()+"\n"
							+ "  "+pais1.getNombre()+" CAMPEON MUNDIAL QATAR 2022");
		}
	}

	public static void verPartidosOctavos (LinkedList<Partido> partidos) {
		if(partidos.isEmpty()) {
			JOptionPane.showMessageDialog(null,"Lista vacia pá");
		}else {
			for (Partido partido : partidos) {
				if (partido.getId()==49 || partido.getId()==50 || partido.getId()==51 || partido.getId()==52|| partido.getId()==53|| partido.getId()==54||
						partido.getId()==55|| partido.getId()==56  ) {
					JOptionPane.showMessageDialog(null, partido.getNombre()+ partido.getDetalle());
				}
			}
		}
	}
	
	public static void verPartidosCuartos(LinkedList<Partido> partidos) {
		if(partidos.isEmpty()) {
						JOptionPane.showMessageDialog(null,"Lista vacia pá");
		}else {
			for (Partido partido : partidos) {
				if (partido.getId()==57 || partido.getId()==58 || partido.getId()==59 || partido.getId()==60){
					JOptionPane.showMessageDialog(null,partido.getNombre()+ partido.getDetalle());
				}
			}
		}
	}

	public static void verPartidosSemifinales(LinkedList<Partido> partidos) {
		if(partidos.isEmpty()) {
			JOptionPane.showMessageDialog(null,"Lista vacia pá");
		}else {
			for (Partido partido : partidos) {
				if (partido.getId()==61 || partido.getId()==62 ){
					JOptionPane.showMessageDialog(null,partido.getNombre()+ partido.getDetalle());
				}
			}
		}
	}
	
	public static void verPartidoTercerPuesto (LinkedList<Partido> partidos) {
		if(partidos.isEmpty()) {
			JOptionPane.showMessageDialog(null,"Lista vacia pá");
		}else {
			for (Partido partido : partidos) {
				if (partido.getId()==63){
					JOptionPane.showMessageDialog(null,partido.getNombre()+ partido.getDetalle());
				}
			}
		}
	}
	
	public static void verFinal (LinkedList<Partido> partidos) {
		if(partidos.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Lista de final vacia pá");
		}else {
			for (Partido partido : partidos) {
				if (partido.getId()==64){
					JOptionPane.showMessageDialog(null,partido.getNombre()+ partido.getDetalle());
				}
			}
		}
	}

	public static void BuscarPartidoEquipos(LinkedList<Partido> partidos) {
		
		String nombrePais = JOptionPane.showInputDialog(null, "Escriba el pais para ver sus partidos: ");
		
		for(Partido partido: partidos){
		    if(partido.getPais1().getNombre().equalsIgnoreCase(nombrePais) || partido.getPais2().getNombre().equalsIgnoreCase(nombrePais)) {
		    	
		    	JOptionPane.showMessageDialog(null,partido.getNombre()+"\n"+partido.getDetalle());
		    }
		}
	}

	
	
	
	
	

}