import java.util.Date;
import java.util.ArrayList;
public class Cliente implements IConsultable {
	private int DNI;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private int telefono;
	private String correo;
	private Date fechaNacimiento;
	private boolean tienePoliza;
	private Poliza poliza;
}
