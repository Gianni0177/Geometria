public class Rettangolo extends FormaGeometrica{
    
    public double baseRett;
    public double altezzaRett;

    

    public double getBaseRett() {
        return baseRett;
    }
    public void setBaseRett(double baseRett) {
        this.baseRett = baseRett;
    }
    public double getAltezzaRett() {
        return altezzaRett;
    }
    public void setAltezzaRett(double altezzaRett) {
        this.altezzaRett = altezzaRett;
    }
    
    @Override
    public double calcolaArea() {
        this.ris=this.baseRett*this.altezzaRett;
        return super.calcolaArea();
    }
    @Override
    public double calcolaPerimetro() {
        this.ris=(this.baseRett*2)+(this.altezzaRett*2);
        return super.calcolaPerimetro();
    }

    
}
