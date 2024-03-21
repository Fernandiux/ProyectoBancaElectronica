package bancolombia.com.negocio;

import java.util.Comparator;

public class ComparaRfc implements Comparator<Cliente> {

    @Override
    public int compare(Cliente c1, Cliente c2) {
        return c1.getRfc().compareTo(c2.getRfc());
    }
}
