package com.dungeonSim;

import com.elements.*;
import com.objetos.*;

public class DungeonSimulator {
    public static void main(String[] args) {
    	Mago mago = new Mago();
    	Guerrero guerrero = new Guerrero();
    	Trabajador trabajador = new Trabajador();
    	
    	Espada espada1 = new Espada(mago); 
    	Espada espada2 = new Espada(guerrero);
    	Espada espada3 = new Espada(trabajador);
    	
    	Armadura armadura1 = new Armadura(mago);
    	Armadura armadura2 = new Armadura(guerrero);
    	Armadura armadura3 = new Armadura(trabajador);
    	
    	Escudo escudo1 = new Escudo(mago);
    	Escudo escudo2 = new Escudo(guerrero);
    	Escudo escudo3 = new Escudo(trabajador);
    	
    	Amuleto amuleto1 = new Amuleto(mago);
    	Amuleto amuleto2 = new Amuleto(guerrero);
    	Amuleto amuleto3 = new Amuleto(trabajador);
    	
    	System.out.println("Los stats con espada son: \n"
    			         + "Mago: \nVida: " + espada1.getVida() + "\n"
    			         + "Ataque: " + espada1.getAtaque() + "\n"
    			         + "Defensa: " + espada1.getDefensa() + "\n"
    			         + "Magia: " + espada1.getMagia() + "\n"
    			         + "Guerrero: \nVida: " + espada2.getVida() + "\n"
    			         + "Ataque: " + espada2.getAtaque() + "\n"
    			         + "Defensa: " + espada2.getDefensa() + "\n"
    			         + "Magia: " + espada2.getVida() + "\n"
    			         + "Trabajador: \nVida: " + espada3.getVida() + "\n"
    			         + "Ataque: " + espada3.getAtaque() + "\n"
    			         + "Defensa: " + espada3.getDefensa() + "\n"
    			         + "Magia: " + espada3.getMagia() + "\n");
    	
    	System.out.println(" ");
    	
    	System.out.println("Los stats con armadura son: \n"
		         + "Mago: \nVida: " + armadura1.getVida() + "\n"
		         + "Ataque: " + armadura1.getAtaque() + "\n"
		         + "Defensa: " + armadura1.getDefensa() + "\n"
		         + "Magia: " + armadura1.getMagia() + "\n"
		         + "Guerrero: \nVida: " + armadura2.getVida() + "\n"
		         + "Ataque: " + armadura2.getAtaque() + "\n"
		         + "Defensa: " + armadura2.getDefensa() + "\n"
		         + "Magia: " + armadura2.getVida() + "\n"
		         + "Trabajador: \nVida: " + armadura3.getVida() + "\n"
		         + "Ataque: " + armadura3.getAtaque() + "\n"
		         + "Defensa: " + armadura3.getDefensa() + "\n"
		         + "Magia: " + armadura3.getMagia() + "\n");
    	
    	System.out.println(" ");
    	
    	System.out.println("Los stats con escudo son: \n"
		         + "Mago: \nVida: " + escudo1.getVida() + "\n"
		         + "Ataque: " + escudo1.getAtaque() + "\n"
		         + "Defensa: " + escudo1.getDefensa() + "\n"
		         + "Magia: " + escudo1.getMagia() + "\n"
		         + "Guerrero: \nVida: " + escudo2.getVida() + "\n"
		         + "Ataque: " + escudo2.getAtaque() + "\n"
		         + "Defensa: " + escudo2.getDefensa() + "\n"
		         + "Magia: " + escudo2.getVida() + "\n"
		         + "Trabajador: \nVida: " + escudo3.getVida() + "\n"
		         + "Ataque: " + escudo3.getAtaque() + "\n"
		         + "Defensa: " + escudo3.getDefensa() + "\n"
		         + "Magia: " + escudo3.getMagia() + "\n");
    	
    	System.out.println(" ");
    	
    	System.out.println("Los stats con amuleto son: \n"
		         + "Mago: \nVida: " + amuleto1.getVida() + "\n"
		         + "Ataque: " + amuleto1.getAtaque() + "\n"
		         + "Defensa: " + amuleto1.getDefensa() + "\n"
		         + "Magia: " + amuleto1.getMagia() + "\n"
		         + "Guerrero: \nVida: " + espada2.getVida() + "\n"
		         + "Ataque: " + amuleto2.getAtaque() + "\n"
		         + "Defensa: " + amuleto2.getDefensa() + "\n"
		         + "Magia: " + amuleto2.getVida() + "\n"
		         + "Trabajador: \nVida: " + amuleto3.getVida() + "\n"
		         + "Ataque: " + amuleto3.getAtaque() + "\n"
		         + "Defensa: " + amuleto3.getDefensa() + "\n"
		         + "Magia: " + amuleto3.getMagia() + "\n");
    }
}
