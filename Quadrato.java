public class Quadrato extends FormaGeometrica{

    public double dimLato;

    public double getDimLato() {
        return dimLato;
    }

    public void setDimLato(double dimLato) {
        this.dimLato = dimLato;
    }

    @Override
    public double calcolaArea() {
        this.ris=this.dimLato*this.dimLato;
        return super.calcolaArea();
    }

    @Override
    public double calcolaPerimetro() {
        this.ris=this.dimLato*4;
        return super.calcolaPerimetro();
    }

    
    
    
}
