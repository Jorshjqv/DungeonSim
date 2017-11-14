package com.objetos;

import com.elements.Element;

public class Armadura extends ObjetoDecorador{
    Element personaje;
    
    public Armadura(Element nPersonaje) {
    	this.personaje = nPersonaje;
    }

	@Override
	public int getVida() {
		// TODO Auto-generated method stub
		return this.personaje.getVida() + 20;
	}

	@Override
	public int getAtaque() {
		// TODO Auto-generated method stub
		return this.personaje.getAtaque();
	}

	@Override
	public int getDefensa() {
		// TODO Auto-generated method stub
		return this.personaje.getDefensa() + 20;
	}

	@Override
	public int getMagia() {
		// TODO Auto-generated method stub
		return this.personaje.getMagia();
	}
	
	
    
}
