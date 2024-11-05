import java.util.logging.Logger;

public abstract class Bebida {
    private static final Logger logger = Logger.getLogger(Bebida.class.getName());

    public final void prepararBebida() {
        ferverAgua();
        adicionarIngrediente();
        misturar();
        servir();
    }

    protected void ferverAgua() {
        logger.info("Fervendo água...");
    }

    protected abstract void adicionarIngrediente();

    protected void misturar() {
        logger.info("Misturando os ingredientes...");
    }

    protected void servir() {
        logger.info("Servindo a bebida.");
    }
}
