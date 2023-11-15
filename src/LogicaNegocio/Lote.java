package LogicaNegocio;

import java.util.ArrayList;
import java.util.List;

public class Lote {
    private int nroLote;
    private Persona responsable;
    private String codigoUbicacion;
    private String fechaCreacion;

    private List<Producto> productos;

    public Lote(int nroLote, String codigoUbicacion, String fechaCreacion) {
        this.nroLote = nroLote;
        this.codigoUbicacion = codigoUbicacion;
        this.fechaCreacion = fechaCreacion;

        this.productos = new ArrayList<>();
    }
}
