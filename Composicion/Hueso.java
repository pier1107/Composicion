public class Hueso {
    private String nombre;
    private Cartilago cartilago;
    private Medula medula;

public Hueso(String nombre, Cartilago cartilago, Medula medula){
    this.nombre = nombre;
    this.cartilago = new Cartilago(nombre);
    this.medula = new Medula(nombre);
}
public String getnombre(){
    return nombre;
}
public Cartilago getCartilago(){
    return cartilago;
}
public Medula getMedula(){
    return medula;
}
public void setCartilago(Cartilago cartilago){
    this.cartilago = cartilago;
}
public void setMedula(Medula medula){
    this.medula = medula;
}
public void setNombre(String nombre){
    this.nombre = nombre;
}
public String toString(){
    return(this.nombre +this.cartilago +this.medula);
}
}