import java.util.ArrayList;
public class Administrador
{
    private String nombre ;
    private ArrayList<Participante> lista_Participantes ;

    public Administrador(String nombre) {
        this.nombre = nombre;
        lista_Participantes= new ArrayList<>();
    }

    public void  registrarParticipante (Participante p){
        if (p.validarEdad()==true) {
            lista_Participantes.add(p);
        }else
        {

        }
    }

    public String obtenerGanador(){
        int maximo = 0;
        for(Participante p:lista_Participantes ){
            if (p.calcularPuntaje()>maximo){
                maximo = p.calcularPuntaje();//polimorfismo
                String nombreMaximo = p.getNombre();
            }
        }
        return nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Participantes> getLista_Participantes() {
        return lista_Participantes;
    }
    public void setLista_Participantes(ArrayList<Participantes> lista_Participantes) {
        this.lista_Participantes = lista_Participantes;
    }

}

