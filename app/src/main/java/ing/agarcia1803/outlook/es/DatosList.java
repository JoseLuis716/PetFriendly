package ing.agarcia1803.outlook.es;

public class DatosList
{
    private int id;
    private String Titulo;
    private String Detalle;
    private int Imagen;

    public DatosList(int id, String titulo, String detalle, int imagen)
    {
        this.id = id;
        Titulo = titulo;
        Detalle = detalle;
        Imagen = imagen;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getTitulo()
    {
        return Titulo;
    }

    public void setTitulo(String titulo)
    {
        Titulo = titulo;
    }

    public String getDetalle()
    {
        return Detalle;
    }

    public void setDetalle(String detalle)
    {
        Detalle = detalle;
    }

    public int getImagen()
    {
        return Imagen;
    }

    public void setImagen(int imagen)
    {
        Imagen = imagen;
    }
}
