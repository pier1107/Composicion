public class Tendon {
    private String nombre;
    private Fibra fibra;

public Tendon(String nombre, Fibra fibra ){
    this.nombre = nombre;
    this.fibra = new Fibra(nombre);
}
public String getnombre(){
    return nombre;
}
public Fibra getFibra(){
    return fibra;
}
public void setFibra(Fibra fibra){
    this.fibra = fibra;
}
public void setNombre(String nombre){
    this.nombre = nombre;
}
public String toString(){
    return (this.fibra+this.nombre);
}
}