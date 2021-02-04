public class Main {
    
    public static void main(String[] args) throws Exception {
        ColadeFruta unifila= new ColadeFruta(15);
        PiladeFruta contenedorFresa= new PiladeFruta(15);
        PiladeFruta contenedorManzana= new PiladeFruta(15);
        PiladeFruta contenedorMembrillo= new PiladeFruta(15);
        unifila.enqueue(new CajaFrutas("Strawberry", 2));
        unifila.enqueue(new CajaFrutas("Apple", 8));
        unifila.enqueue(new CajaFrutas("Quince", 1));
        unifila.enqueue(new CajaFrutas("Strawberry", 3));
        unifila.enqueue(new CajaFrutas("Apple", 7));
        unifila.enqueue(new CajaFrutas("Quince",9));
        unifila.enqueue(new CajaFrutas("Strawberry", 5));
        unifila.enqueue(new CajaFrutas("Apple", 6));
        unifila.enqueue(new CajaFrutas("Quince", 4));

        while(!unifila.isEmpty()){
            CajaFrutas f=unifila.dequeue();
           switch(f.getNombreFruta()){
               case "Strawberry": 
               contenedorFresa.push(f);
               break;
               case "Apple": 
               contenedorManzana.push(f);
               break;
               case "Quince": 
               contenedorMembrillo.push(f);
               break;
           }
        }
       imprimirContenedores(contenedorFresa,contenedorManzana,contenedorMembrillo);
    }

    public static void imprimirContenedores(PiladeFruta f, PiladeFruta man, PiladeFruta mem)throws Exception{
       
        System.out.println("the Strawberry container has: ");
        while(!f.isEmpty()){
            CajaFrutas frutas=f.pop();
            System.out.println(frutas.getNombreFruta()+"    weight= "+frutas.getPeso());
         }

         System.out.println("the Apple container has: ");
         while(!man.isEmpty()){
             CajaFrutas frutas=man.pop();
             System.out.println(frutas.getNombreFruta()+"    weight= "+frutas.getPeso());
          }

          System.out.println("the Quince container has: ");
          while(!mem.isEmpty()){
              CajaFrutas frutas=mem.pop();
              System.out.println(frutas.getNombreFruta()+"    weight= "+frutas.getPeso());
           }
    }
}
