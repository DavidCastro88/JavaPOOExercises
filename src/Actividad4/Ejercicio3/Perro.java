package Actividad4.Ejercicio3;

public class Perro extends Canido{
    @Override
    public String getNombreCientifico() {
        return "Canis lupus familiaris";
    }
    @Override
    public String getAlimentos() {
        return "Carnívoro";
    }
    @Override
    public String getSonidos() {
        return "Ladrido";
    }
    @Override
    public String getHabitat() {
        return "Doméstico";
    }
}
