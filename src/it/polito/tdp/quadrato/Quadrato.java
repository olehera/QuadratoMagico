package it.polito.tdp.quadrato;

import java.util.ArrayList;
import java.util.List;

public class Quadrato {

	private int size;
	private List<Integer> mappa;
	
	public Quadrato(int size) {
		this.size = size;
		mappa = new ArrayList<Integer>();
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public List<Integer> getMappa() {
		return mappa;
	}

	public void setMappa(List<Integer> mappa) {
		this.mappa = mappa;
	}
	
}
