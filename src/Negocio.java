public class Negocio {

    public int sumar( int numeroUno, int numeroDos) {
        try {
            Datos datos = new Datos();
            datos.setNumeroUno(numeroUno);
            datos.setNumeroDos(numeroDos);

            if((datos.getNumeroUno() + datos.getNumeroDos()) % 2 == 0) {
                throw new RuntimeException("El resultado de la suma no puede ser un numero par");
            }

        } catch (Exception exception) {
            System.out.println("Que lastima que fallo");
            throw exception;
        }
        return 0;
    }
}
