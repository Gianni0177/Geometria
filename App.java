public class App {
    public static void main(String[] args) throws Exception {
        
//        FormaGeometrica f1=new FormaGeometrica();

        Quadrato q1=new Quadrato();
        q1.dimLato=2.4;
//        System.out.println("Area : " + q1.calcolaArea());

        Triangolo t1=new Triangolo();
        t1.altezzaTria=3; 
        t1.baseTria=4;
//        System.out.println("Area : " + t1.calcolaArea());

        Rettangolo r1=new Rettangolo();
        r1.altezzaRett=6;
        r1.baseRett=5;
       
        FormaGeometrica[] fg1 = new FormaGeometrica[3];
        fg1[0] = q1;
        fg1[1] = t1;
        fg1[2] = r1;
        for (int i = 0; i < fg1.length; i++) {
            System.out.println("Area di : "+fg1[i].getClass().getName() + ": " + fg1[i].calcolaArea());
        }
        System.out.println(" ");
        for (int i = 0; i < fg1.length; i++) {
            System.out.println("Perimetro di : "+fg1[i].getClass().getName() + ": " + fg1[i].calcolaPerimetro());
        }
    }
}
