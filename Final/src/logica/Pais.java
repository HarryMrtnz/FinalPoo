package logica;

import java.util.LinkedList;
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
		int i = 0;
		String [] lista = new String [32] ;
		if(paises.isEmpty()) {
			JOptionPane.showMessageDialog(null,"Lista vacia pá");
		
		}else {
			for (Pais pais : paises) {
				lista [i]= "Equipo "+pais.getId()+ " = "+ pais.getNombre() + " | Grupo: " + pais.getGrupo() ;
				i++;
			}
		}
		JOptionPane.showMessageDialog(null,"Estos son los "+ paises.size()+" paises que participarán del Mundial Qatar 2022\n" 
				+"\n"+ lista[0]+"\n"+ lista[1]+"\n"+ lista[2]+"\n"+ lista[3]+"\n"+ lista[4]+"\n"+ lista[5]+"\n"+ lista[6]+"\n"+ lista[7]+"\n"+ lista[8]+"\n"+ lista[9]
				+"\n"+ lista[10]+"\n"+ lista[11]+"\n"+ lista[12]+"\n"+ lista[13]+"\n"+ lista[14]+"\n"+ lista[15]+"\n"+ lista[16]+"\n"+ lista[17]+"\n"+ lista[18]+"\n"+ lista[19]
				+"\n"+ lista[20]+"\n"+ lista[21]+"\n"+ lista[22]+"\n"+ lista[23]+"\n"+ lista[24]+"\n"+ lista[25]+"\n"+ lista[26]+"\n"+ lista[27]+"\n"+ lista[28]+"\n"+ lista[29]
				+"\n"+ lista[30]+"\n"+ lista[31]);
	}
	
	public static void buscarGrupo(LinkedList<Pais> paises) {
		int i = 0;
		String [] lista = new String [4];
		String [] grupos = {"A", "B", "C", "D", "E", "F", "G", "H"};
		
		String grupo = (String) JOptionPane.showInputDialog(
				null, "¿De cual grupo desea ver sus partidos? ","Menu"
				,JOptionPane.QUESTION_MESSAGE ,null ,grupos, grupos[0]);
		
		if(paises.isEmpty()) {
			JOptionPane.showMessageDialog(null,"Lista vacia pá");
		}else {
			for (Pais pais : paises) {
				if(pais.getGrupo().equalsIgnoreCase(grupo)) {
					lista [i] =" → "+pais.getNombre();
					i++;
				}
	        }
		}
		JOptionPane.showMessageDialog(null,  "Paises del grupo "+grupo+":\n"
				+ "\n"+lista[0]+ "\n"+lista[1]+ "\n"+lista[2]+ "\n"+lista[3]);
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
	}
}

