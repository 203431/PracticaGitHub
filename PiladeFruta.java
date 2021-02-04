public class PiladeFruta{ 
	private CajaFrutas pile[];
	private int stopped;
	
	public PiladeFruta(int capacidad){ 
		pile = new CajaFrutas[capacidad];
		stopped = -1;
	} 
	
	public boolean isEmpty(){
		return stopped == -1;
	}
	
	public void push(CajaFrutas i){
		if(stopped+1 < pile.length)
		pile[++stopped] = i;
        
	}
	public CajaFrutas pop() throws Exception{
		if(isEmpty());
		return 
		pile[stopped--];
	}
}
	