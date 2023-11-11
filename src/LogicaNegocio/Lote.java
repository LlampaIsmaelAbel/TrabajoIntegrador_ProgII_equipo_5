package LogicaNegocio;

import java.util.ArrayList;
import java.util.List;

public class Lote {
    private int nroLote;
    private String nombreResponsable;
    private String dniResponsable;
    private int nroLegajoResponsable;
    private String codigoUbicacion;
    private String fechaCreacion;

    private List<Producto> productos;

    public Lote(int nroLote, String nombreResponsable, String dniResponsable, int nroLegajoResponsable, String codigoUbicacion, String fechaCreacion) {
        this.nroLote = nroLote;
        this.nombreResponsable = nombreResponsable;
        this.dniResponsable = dniResponsable;
        this.nroLegajoResponsable = nroLegajoResponsable;
        this.codigoUbicacion = codigoUbicacion;
        this.fechaCreacion = fechaCreacion;

        this.productos = new ArrayList<>();
    }
}
