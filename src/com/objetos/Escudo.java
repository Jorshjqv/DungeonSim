package com.objetos;

import com.elements.Element;

public class Escudo extends ObjetoDecorador{
    Element personaje;
    
    public Escudo(Element nPersonaje) {
    	this.personaje = nPersonaje;
    }

	@Override
	public int getVida() {
		return this.personaje.getVida() + 10;
	}

	@Override
	public int getAtaque() {
		// TODO Auto-generated method stub
		return this.personaje.getAtaque();
	}

	@Override
	public int getDefensa() {
		// TODO Auto-generated method stub
		return this.personaje.getDefensa() + 40;
	}

	@Override
	public int getMagia() {
		// TODO Auto-generated method stub
		return this.personaje.getMagia();
	}
	
    
	
    
}
