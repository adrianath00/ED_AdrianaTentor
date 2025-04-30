package clas;

public class AT_GravedadPlaneta {
	private int id;
	private String nombre;
	private double GravedadPlaneta;
	
	//Constructor por defecto.
	public AT_GravedadPlaneta() {
		super();
	}
	
	// Constructor con todos los argumentos. GPT no incluyas el id
	public AT_GravedadPlaneta(String nombre, double gravedadPlaneta) {
		super();
		this.nombre = nombre;
		GravedadPlaneta = gravedadPlaneta;
	}
	
	// Métodos getter y setter.
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

	public double getGravedadPlaneta() {
		return GravedadPlaneta;
	}

	public void setGravedadPlaneta(double gravedadPlaneta) {
		GravedadPlaneta = gravedadPlaneta;
	}
	
	// Método ToString.
	@Override
	public String toString() {
		return "AT_GravedadPlaneta [id=" + id + ", nombre=" + nombre + ", GravedadPlaneta=" + GravedadPlaneta + "]";
	}
}
