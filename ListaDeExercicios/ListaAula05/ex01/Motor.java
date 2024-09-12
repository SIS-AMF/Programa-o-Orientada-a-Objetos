
public class Motor {

    private double potencia;
    private String tipoCombustivel;

    public Motor(double potencia, String tipoCombustivel) {
        this.potencia = potencia;
        this.tipoCombustivel = tipoCombustivel;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public void exibir() {
        System.out.println("----Motor----");
        System.out.println("Potencia => " + potencia);
        System.out.println("Combustivel => " + tipoCombustivel);
    }

}
