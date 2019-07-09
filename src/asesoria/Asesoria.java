
package asesoria;

public class Asesoria {
    private String estudiante;
    private int dia;
    private int grupo;
    private String tema;

    public Asesoria(String estudiante, int dia, int grupo, String tema) {
        this.estudiante = estudiante;
        this.dia = dia;
        this.grupo = grupo;
        this.tema = tema;
    }

    public String getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(String estudiante) {
        this.estudiante = estudiante;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getGrupo() {
        return grupo;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    @Override
    public String toString() {
        return "Asesoria{" + "estudiante=" + estudiante + ", dia=" + dia + ", grupo=" + grupo + ", tema=" + tema + '}';
    }
    
    
}
