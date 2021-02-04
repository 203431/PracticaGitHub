public class CajaFrutas {
    private String nameFruit;
    private int peso;

    public CajaFrutas(String nameFruit, int peso){
this.nameFruit=nameFruit;
this.peso=peso;
    }

public void setNombreFruta(String nameFruit) {
    this.nameFruit = nameFruit;
}
public void setPeso(int peso) {
    this.peso = peso;
}
public String getNombreFruta() {
    return nameFruit;
}
public int getPeso() {
    return peso;
}
}
