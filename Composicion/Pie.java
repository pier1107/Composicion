
public class Pie {
    private String nombre;
    private Musculo musculo;
    private Hueso hueso;
    private Tendon tendon;
public Pie(Musculo musculo, Hueso hueso, Tendon tendon, String nombre ){
    this.tendon = tendon;
    this.musculo = musculo;
    this.hueso = hueso;
    this.nombre = nombre;
}
public String getNombre(){
    return nombre;
}
public Tendon getTendon(){
 return tendon;
}
public Musculo getMusculo(){
    return musculo;
}
public Hueso getHueso(){
    return hueso;
}
public void setHueso(Hueso hueso){
    this.hueso = hueso;
}
public void setMusculo(Musculo musculo){
    this.musculo = musculo;
}
public void setTendon(Tendon tendon){
    this.tendon = tendon;
}
public void setNombre(String nombre){
    this.nombre = nombre;
}
public String toString(){
    return(this.nombre  +this.hueso +this.musculo +this.tendon);
}
}