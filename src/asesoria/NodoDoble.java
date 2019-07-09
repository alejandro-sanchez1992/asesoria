
package asesoria;

public class NodoDoble {
    private Asesoria dato;
    private NodoDoble ant;
    private NodoDoble sig;

    public NodoDoble() {
    }

    public NodoDoble(Asesoria dato) {
        this.dato = dato;
    }

   
    public NodoDoble(Asesoria dato, NodoDoble sig) {
        this.dato = dato;
        this.sig = sig;
    }

    public Asesoria getDato() {
        return dato;
    }

    public void setDato(Asesoria dato) {
        this.dato = dato;
    }

    public NodoDoble getAnt() {
        return ant;
    }

    public void setAnt(NodoDoble ant) {
        this.ant = ant;
    }

    public NodoDoble getSig() {
        return sig;
    }

    public void setSig(NodoDoble sig) {
        this.sig = sig;
    }
    
    
}
