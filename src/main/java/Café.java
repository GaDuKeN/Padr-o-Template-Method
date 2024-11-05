import java.util.logging.Logger;

public class Café extends Bebida {
    private static final Logger logger = Logger.getLogger(Café.class.getName());

    @Override
    protected void adicionarIngrediente() {
        logger.info("Adicionando café à água...");
    }
}
