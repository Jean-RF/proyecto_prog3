public abstract class Usuario{
	private int DNI;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private int telefono;
	private EstadoUsuario estado;

	public Usuario(int DNI,String nombre,String apellidoPaterno,String apellidoMaterno,int telefono,EstadoUsuario estado){
		
	}

	void llenarDatosPersonalesUsuario();
	
	void consultarDatos();
	void iniciarSesion(int DNI,String password){   //Un usuario utiliza su DNI y password (creado por el administrador) para iniciar sesión
		
	}
	
}
