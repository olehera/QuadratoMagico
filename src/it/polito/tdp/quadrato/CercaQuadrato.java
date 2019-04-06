package it.polito.tdp.quadrato;

import java.util.List;

public class CercaQuadrato {
	
	List<Quadrato> soluzioni;
	
	private void cerca(Quadrato parziale, int L) {
		// le L caselle da 0 a L-1 sono piene
		// devo trovare un valore per la casella in posizione L
		
		if (L == parziale.getSize()*parziale.getSize()) {
			// il quadrato � tutto pieno, devo verificare se � 'magico'
			
			if (parziale.isMagic())
				soluzioni.add(parziale.clone());
			
			return ;	
		}
		
		for (int i=1; i<=parziale.getSize()*parziale.getSize(); i++) {
			// provo a mettere il valore 'i' nella casella L
			
			if (!parziale.contains(i)) {
				parziale.add(i);
			
			    cerca(parziale, L+i);
			
			    parziale.remove(i); 
			}
		}
		
	}

}
