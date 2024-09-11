import java.util.Date;
import java.time.LocalTime;

public class DetalleEnvio {
	private Direccion direccion;
	private EstadoEnvio estado;
	private Date fechaEntrega;
	private LocalTime horaEntrega;

	public DetalleEnvio(Direccion direccion, EstadoEnvio estado, Date fechaEntrega,
			   LocalTime horaEntrega) {
		this.direccion = direccion;
		this.estado = estado;
		this.fechaEntrega = fechaEntrega;
		this.horaEntrega = horaEntrega;
	}
	public void modificarDetalleEnvio(DetalleEnvio detalleEnvio){
		//Un técnico C3 llama a esta función pasando un nuevo Detalle de Envío y copia este nuevo
	}
}
