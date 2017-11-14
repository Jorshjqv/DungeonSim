package com.objetos;

import com.elements.Element;

public class Espada extends ObjetoDecorador{
    Element personaje;
    
    public Espada(Element nPersonaje) {
    	this.personaje = nPersonaje;
    }

	@Override
	public int getVida() {
		return this.personaje.getVida() + 1;
	}

	@Override
	public int getAtaque() {
		return this.personaje.getAtaque() + 10;
	}

	@Override
	public int getDefensa() {
		return this.personaje.getDefensa() + 10;
	}

	@Override
	public int getMagia() {
		return this.personaje.getMagia();
	}
	
	

}
