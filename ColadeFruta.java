public class ColadeFruta {
    public static final int DEFAULT_SIZE=30;
	private CajaFrutas data[];
	private int index;
	public ColadeFruta(){
		data=new CajaFrutas[DEFAULT_SIZE];
	}

	public ColadeFruta(int s){
		data=new CajaFrutas[s];
	}
	
	public boolean isEmpty(){
		return index==0;
	}

	public void enqueue(CajaFrutas obj) throws Exception{
		if(index != DEFAULT_SIZE){
			this.data[index]=obj;
			this.index++;
		}
	}
	
	public CajaFrutas dequeue() throws Exception{
		if(isEmpty());
		CajaFrutas obj=this.data[0];
		for(int i =0; i<this.index-1; i++){
			data[i]=data[i+1];
		}
		this.index--;
		return obj;
	}
}