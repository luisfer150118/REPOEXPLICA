public class prueba {
     private String NomProducto;
    private double PrecioProducto;
    private int cantitdad;
    
    public objmatrices(String nomProducto, double precioProducto, int cantitdad) {
        NomProducto = nomProducto;
        PrecioProducto = precioProducto;
        this.cantitdad = cantitdad;
    }

    public objmatrices() {
    }

    public String getNomProducto() {
        return NomProducto;
    }

    public void setNomProducto(String nomProducto) {
        NomProducto = nomProducto;
    }

    public double getPrecioProducto() {
        return PrecioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        PrecioProducto = precioProducto;
    }

    public int getCantitdad() {
        return cantitdad;
    }

    public void setCantitdad(int cantitdad) {
        this.cantitdad = cantitdad;
    }
    

}
