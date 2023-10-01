package Actividad4.Ejercicio3;

public class Gato extends Felino{
    @Override
    public String getNombreCientifico() {
        return "Felis silvestris catus";
    }
    @Override
    public String getAlimentos() {
        return "Ratones";
    }
    @Override
    public String getSonidos() {
        return "Maullido";
    }
    @Override
    public String getHabitat() {
        return "Doméstico";
    }
}
