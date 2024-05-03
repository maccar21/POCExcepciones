public class Aplicacion {
    public static void main(String[] args) {
        try {
        Negocio negocio = new Negocio();
        int resultado = negocio.sumar(2,0);
        System.out.println(resultado);
    } catch (Exception exception){
            System.out.println("Llgo el momento de dar la cara");
            exception.printStackTrace();
        }

    }
}

