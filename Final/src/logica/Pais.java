package logica;

import java.util.LinkedList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Pais {
	private String id, nombre;
	private int goles;
	private String grupo;
	private boolean calificado;
	private int puntos, puestoGrupo;
	private String partidoOctavos, partidoCuartos, partidoSemifinal, porPartidoTercerPuesto;
	
	public Pais(String id, String nombre, int goles, String grupo, boolean calificado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.goles = goles;
		this.grupo = grupo;
		this.calificado = calificado;
	}

	@Override
	public String toString() {
		return "Pais [id=" + id + ", nombre=" + nombre + ", goles=" + goles + ", grupo=" + grupo + ", calificado="
				+ calificado + ", puntos=" + puntos + ", puestoGrupo=" + puestoGrupo + ", partidoOctavos="
				+ partidoOctavos + ", partidoCuartos=" + partidoCuartos + ", partidoSemifinal=" + partidoSemifinal
				+ ", tercerPuesto=" + porPartidoTercerPuesto + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getGoles() {
		return goles;
	}

	public void setGoles(int goles) {
		this.goles = goles;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	
	public boolean isCalificado() {
		return calificado;
	}

	public void setCalificado(boolean calificado) {
		this.calificado = calificado;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public int getPuestoGrupo() {
		return puestoGrupo;
	}

	public void setPuestoGrupo(int puestoGrupo) {
		this.puestoGrupo = puestoGrupo;
	}

	public String getPartidoOctavos() {
		return partidoOctavos;
	}

	public void setPartidoOctavos(String partidoOctavos) {
		this.partidoOctavos = partidoOctavos;
	}

	public String getPartidoCuartos() {
		return partidoCuartos;
	}

	public void setPartidoCuartos(String partidoCuartos) {
		this.partidoCuartos = partidoCuartos;
	}

	public String getPartidoSemifinal() {
		return partidoSemifinal;
	}

	public void setPartidoSemifinal(String partidoSemifinal) {
		this.partidoSemifinal = partidoSemifinal;
	}

	public String getPorPartidoTercerPuesto() {
		return porPartidoTercerPuesto;
	}

	public void setPorPartidoTercerPuesto(String porPartidoTercerPuesto) {
		this.porPartidoTercerPuesto = porPartidoTercerPuesto;
	}
	
	

	public static void mostrarEquipos(LinkedList<Pais> paises){
		if(paises.isEmpty()) {
			JOptionPane.showMessageDialog(null,"Lista vacia pá");
		
		}else {
			//System.out.println("Estos son los "+ paises.size()+" paises que participarán del Mundial Qatar 2022");
			for (Pais pais : paises) {	
				//System.out.println("Equipo "+pais.getId()+ " = "+ pais.getNombre() + " | Grupo: " + pais.getGrupo());
				JOptionPane.showMessageDialog(null,"Estos son los "+ paises.size()+" paises que participarán del Mundial Qatar 2022"
						+ "\nEquipo "+pais.getId()+ " = "+ pais.getNombre() + " | Grupo: " + pais.getGrupo());
			}
		}
		System.out.println(); //Espacio separador
	}
	
	public static void buscarGrupo(LinkedList<Pais> paises) {
		
		String [] grupos = {"A", "B", "C", "D", "E", "F", "G", "H"};
		
		String grupo = (String) JOptionPane.showInputDialog(
				null, "¿De cual grupo desea ver sus partidos? ","Menu"
				,JOptionPane.QUESTION_MESSAGE ,null ,grupos, grupos[0]);
		
		if(paises.isEmpty()) {
			JOptionPane.showMessageDialog(null,"Lista vacia pá");
		}else {
			//System.out.println("\nPaises del grupo elegido:");
			for (Pais pais : paises) {
				if(pais.getGrupo().equalsIgnoreCase(grupo)) {
					JOptionPane.showMessageDialog(null,"Paises del grupo elegido:\n → "+pais.getNombre());
//				}else {
//					System.out.println("No se ha encontrado ningun resultado"
//							+ "\nVuelve a intentar");
//					buscarGrupo(listaPais);
				}
	        }
		}
		System.out.println(); //Espacio separador
	}
	
	public static void buscarEquipo(LinkedList<Pais> paises){
		
		String equipo = JOptionPane.showInputDialog("ingrese el pais a buscar: ");
		
		if(paises.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Lista vacia pa!");
		}else {
			for (Pais pais : paises) {
				if(pais.getNombre().equalsIgnoreCase(equipo)) {
					JOptionPane.showMessageDialog(null,"RESULTADO ENCONTRADO: \n"
					+pais.getNombre()+ " - Grupo: " +pais.getGrupo() + " - Goles totales: "+pais.getGoles());
				}
	        }
		}
		System.out.println(); //Espacio separador
	}
}

