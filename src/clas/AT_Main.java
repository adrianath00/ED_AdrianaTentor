package clas;

public class AT_Main {
	public static void main(String[] args) {
	Persona_AT pers1 = new Persona_AT(1,"Adriana", 85, 1.58, 19);
	Persona_AT pers2 = new Persona_AT(2, "Adrian", 70, 1.70, 20);
	
	AT_GravedadPlaneta plan1 =new AT_GravedadPlaneta(1, "Tierra", 9.81);
	AT_GravedadPlaneta plan2 =new AT_GravedadPlaneta(2, "Marte", 3.72);
	AT_GravedadPlaneta plan3 =new AT_GravedadPlaneta(1, "Jupiter", 24.79);
	
	//Calculo peso persona TIERRA PESO=MASA * ACELERACION
	double masaPersona_AT =pers1.getMasa();
	double gravedadTierra = plan1.getGravedadPlaneta();
	double pesoTierra = masaPersona_AT*gravedadTierra;
	
	//Calculo peso persona MARTE PESO=MASA * ACELERACION
	double pesoMarte = extracted(pers1, plan1, masaPersona_AT);
	
	//Calculo peso persona JUPITER PESO=MASA * ACELERACION
	double pesoJupiter = extracted(pers1, plan1, masaPersona_AT);
	
	//Imprimir informacion
	System.out.println(pers1);
	System.out.println("El IMC de la persona"+pers1.getNombre()+"es ...");
	System.out.println(pers2);
	System.out.println("El IMC de la persona"+pers2.getNombre()+"es ...");
	System.out.println(plan1);
	System.out.println(plan2);
	System.out.println(plan3);
	System.out.println("Peso"+pers1.getNombre()+"en tierra:"+pesoTierra);
	System.out.println("Peso"+pers1.getNombre()+"en marte:"+pesoMarte);
	System.out.println("Peso"+pers1.getNombre()+"en tierra:"+pesoJupiter);
	
	//Mostrar tambien pesos de la persona2 en tierra, marte y jupiter
	
}

	/**
	 * @param pers1
	 * @param plan1
	 * @param masaPersona_AT
	 * @return
	 */
	private static double extracted(Persona_AT pers1, AT_GravedadPlaneta plan1, double masaPersona_AT) {
		double masaPersona3_AT = pers1.getMasa();
		double gravedadJupiter =plan1.getGravedadPlaneta();
		double pesoJupiter =masaPersona_AT*gravedadJupiter;
		return pesoJupiter;
	}

	/**
	 * @param pers1
	 * @param plan1
	 * @param masaPersona_AT
	 * @return
	 */
	private static double extracted(Persona_AT pers1, AT_GravedadPlaneta plan1, double masaPersona_AT) {
		double masaPersona2_AT =pers1.getMasa();
		double gravedadMarte = plan1.getGravedadPlaneta();
		double pesoMarte = masaPersona_AT*gravedadMarte;
		return pesoMarte;
	}
