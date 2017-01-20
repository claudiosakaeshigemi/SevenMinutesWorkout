package claudioshigemi.com.sevenminutesworkout;

/**
 * Created by claud on 20/01/2017.
 */

public class TreinosDataProvider {

    private  int listaIcones;
    private String listatreinos;
    private String listainiciais;

    public TreinosDataProvider(int listaIcones, String listatreinos, String listainiciais) {
        this.listaIcones = listaIcones;
        this.listatreinos = listatreinos;
        this.listainiciais = listainiciais;
    }

    public int getListaIcones() {
        return listaIcones;
    }

    public void setListaIcones(int listaIcones) {
        this.listaIcones = listaIcones;
    }

    public String getListatreinos() {
        return listatreinos;
    }

    public void setListatreinos(String listatreinos) {
        this.listatreinos = listatreinos;
    }

    public String getListainiciais() {
        return listainiciais;
    }

    public void setListainiciais(String listainiciais) {
        this.listainiciais = listainiciais;
    }
}
