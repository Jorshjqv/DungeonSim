package com.objetos;

import com.elements.Element;
import com.elements.Trabajador;

public class Amuleto extends ObjetoDecorador{
    Element personaje;
    
    public Amuleto(Element nPersonaje) {
    	this.personaje = nPersonaje;
    }

	@Override
	public int getVida() {
		return this.personaje.getVida();
	}

	@Override
	public int getAtaque() {
		return this.personaje.getAtaque();
	}

	@Override
	public int getDefensa() {
		return this.personaje.getDefensa();
	}

	@Override
	public int getMagia() {
		if(personaje instanceof Trabajador)
		    return this.personaje.getMagia();
		
		return this.personaje.getMagia() + 10;
	}
	

}
