package guardia;

public class Gorilla extends Mammal{
		
	//METODOS
	
	//-5 energia
	public void throwSomething(int lanzarBanana) {
		
		int NivelEnergiaLanzar = 5;
		int energiaActual;
		energiaActual = nivelEnergia - (lanzarBanana*NivelEnergiaLanzar);
		System.out.println("el gorila lanzo algo " + lanzarBanana + " veces " +", Nivel de energia disminuyo en: " + energiaActual);
	}
	
	//+10 energia
	public void eatBananas(int comerBanana) {
		int NivelEnergiaComer = 10;
		int energiaActual;
		energiaActual = nivelEnergia + (comerBanana*NivelEnergiaComer);
		
		System.out.println("El gorilla comio " + comerBanana + " veces, la satisfaccion del gorila e incrementar su nivel de energia en: " + energiaActual);	
	}
	//-10 energia
	public void climb(int treparArbol) {
		
		int NivelEnergiaTrepar = 10;
		int energiaActual;
		energiaActual = nivelEnergia - (treparArbol*NivelEnergiaTrepar);
		
		System.out.println("el gorila ha trepado "+ treparArbol + " vez, a la cima de un arbol y disminuye su nivel de energia en: " + energiaActual);
	}
	
	
	
	
	

}
