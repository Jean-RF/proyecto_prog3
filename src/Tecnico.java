import java.util.ArrayList;
public class Tecnico extends Empleado{
	private FarmaciaPropia farmacia;
	private ArrayList<PedidoPropio> pedidosGenerados;

	public Tecnico(int DNI, String nombre, String apellidoPaterno, String apellidoMaterno,
		      int telefono, EstadoUsuario estado) {
		super(DNI,nombre,apellidoPaterno,apellidoMaterno,telefono,estado);
	}

	public void atenderPedido(int ID);
	public void descartarPedido(int ID);
	public void llenarMedicinas();
	public void llenarDatosPoliza();
	public void consultarDatosPoliza();
	public void registrarDireccionEnvio();
	public void subirDocumentoPago();

	@Override
	void consultarDatos();
	public void modificarDetalleEnvio(int idPedidoPropio, DetalleEnvio detalleEnvio){   //AAA
		//EL técnico puede modificar el detalle de envío de un pedido
	}
}
