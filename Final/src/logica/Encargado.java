package logica;

public class Encargado {
	
	private String dni;
	private String nombre;
	private String apellido;
	private String usuario;
	private String contraseña;
	


	public Encargado(String dni, String nombre, String apellido, String usuario, String contraseña) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.usuario = usuario;
		this.contraseña = contraseña;
	}

	@Override
	public String toString() {
		return "Encargado [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", usuario=" + usuario
				+ ", contraseña=" + contraseña + "]";
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	

	public boolean ingreso(String usuario, String contraseña) {
			
		if (usuario.equals(this.usuario)) { //usuario = Pikachu
			if (contraseña.equals(this.contraseña)) { //contraseña = asd123
				System.out.println("...Encargado "+this.apellido+" ingreso correctamente");
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	
	
	
}

