package bancolombia.com.negocio;

import java.util.Comparator;

public class ComparaNumero implements Comparator<Cliente> {
    @Override
    public int compare(Cliente c1, Cliente c2) {
        int resultado=0;
        if(c1.getNumero()<c2.getNumero()) {
            return -1;
        }else if (c1.getNumero()>c2.getNumero()){
            return +1;
        }else return 0;
    }
}
