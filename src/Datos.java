public class Datos {
    private int numeroUno;
    private int numeroDos;

    public final int getNumeroUno() {
        return numeroUno;
    }

    public final void setNumeroUno(int numeroUno) {

        if (numeroUno < 0){
            throw new RuntimeException("El numero uno no puede ser menor que 0");
        }

        this.numeroUno = numeroUno;
    }

    public final int getNumeroDos() {
        return numeroDos;
    }

    public final void setNumeroDos(int numeroDos) {

        if (numeroDos < 0){
            throw new RuntimeException("El numero dos no puede ser menor que 0");
        }

        this.numeroDos = numeroDos;
    }
}
