public class AplicacaoTemplateMethod {
    public static void main(String[] args) {
        Bebida bebida1 = new Café();
        bebida1.prepararBebida();

        Bebida bebida2 = new Chá();
        bebida2.prepararBebida();
    }
}
