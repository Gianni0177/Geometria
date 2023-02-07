public class Triangolo extends FormaGeometrica{
    
    public double baseTria;
    public double altezzaTria;

    public double getBaseTria() {
        return baseTria;
    }
    public void setBaseTria(double baseTria) {
        this.baseTria = baseTria;
    }
    public double getAltezzaTria() {
        return altezzaTria;
    }
    public void setAltezzaTria(double altezzaTria) {
        this.altezzaTria = altezzaTria;
    }

    @Override
    public double calcolaArea() {
        this.ris=(this.baseTria*this.altezzaTria)/2;

        return super.calcolaArea();
    }
    @Override
    public double calcolaPerimetro() {
        this.ris=this.baseTria*3;
        return super.calcolaPerimetro();
    }
    
}
