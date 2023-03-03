import java.io.Serializable;

public class Vehiculo implements Serializable {
    private String matricula;
    private String marca;
    private transient Double deposito;
    private String modelo;

    public Vehiculo(String matricula, String marca, Double deposito, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.deposito = deposito;
        this.modelo = modelo;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setDeposito(Double deposito) {
        this.deposito = deposito;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public Double getDeposito() {
        return deposito;
    }

    public String getModelo() {
        return modelo;
    }
}
