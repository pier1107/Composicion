public class Musculo {
    private String nombre;
    private Sarcolema sarcolema;
    private Miosina miosina;

public Musculo(String nombre, Miosina miosina, Sarcolema sarcolema){
    this.nombre = nombre;
    this.miosina = new Miosina(nombre);
    this.sarcolema = new Sarcolema(nombre);
}
public String getnombre(){
    return nombre;
}
public Miosina getMiosina(){
    return miosina;
}
public Sarcolema getSarcolema(){
    return sarcolema;
}
public void setMiosina(Miosina miosina){
    this.miosina = miosina;
}
public void setSarcolema(Sarcolema sarcolema){
    this.sarcolema = sarcolema;
}
public void setNombre(String nombre){
    this.nombre = nombre;
}
public String toString(){
    return (this.nombre +this.sarcolema +this.miosina);
}
}