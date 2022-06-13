
public class Main {
public static void main(String[] args) {
    Cartilago c = new Cartilago("Cartilaginosis");
    Medula med = new Medula("medula osea");
    Miosina mio = new Miosina("Miosina 6");
    Sarcolema sarco = new Sarcolema("Sarcolema 4");
    Fibra fib = new Fibra("Fibrositos");
    Hueso hueso = new Hueso("Metatarso -->", c, med);
    Musculo musculo = new Musculo("Musculo Pedio -->", mio, sarco);
    Tendon tendon = new Tendon("Retinaculo -->", fib);
    Pie pie = new Pie(musculo, hueso, tendon, "Pie Izquierdo -->");
    System.out.println(pie);
    }
}
