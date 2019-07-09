
package asesoria;

public class ListaDoble {
    private NodoDoble cab;
    private NodoDoble ult;
    
    ListaDoble()
    {
    }
    
    public boolean EsVacia()
    {
        return cab==null;
    }
    
    public boolean InsertarCab(Asesoria as)
    {
        if(EsVacia())
        {
            cab=new NodoDoble(as);
            ult=cab;
        }
        else
        {
            NodoDoble n = new NodoDoble(as, cab);
            cab.setAnt(n);
            cab=n;
        }
        return true;
    }
    
    public boolean InsertarFinal(Asesoria as)
    {
        if(EsVacia())
            InsertarCab(as);
        else
        {
            NodoDoble n = new NodoDoble(as);
            n.setAnt(ult);
            ult.setSig(n);
            ult=n;
        }
        return true;
    }
    
    @Override
    public String toString()
    {
        String res="";
        NodoDoble aux=cab;
        while(aux!=null)
        {
            res+=aux.getDato().toString()+ "\n";
            aux=aux.getSig();
        }
        return res;
    }
    
    public String BuscarTema(String tema)
    {
        String res="";
        NodoDoble aux=cab;
        while(aux!=null)
        {
            if(aux.getDato().getTema().equalsIgnoreCase(tema))
                res=res + aux.getDato().toString() + "\n";
            
            aux=aux.getSig();
        }
        return res;
    }
    
    public int CantidadAsesorias(String estudiante)
    {
        int cant=0;
        NodoDoble aux=cab;
        while(aux!=null)
        {
            if(aux.getDato().getEstudiante().equalsIgnoreCase(estudiante))
                cant++;
            aux=aux.getSig();
        }
        return cant;
    }
    
    public int CantidadBenef()
    {
        int cant=0;
        NodoDoble aux=cab;
        while(aux!=null)
        {
            cant=cant+aux.getDato().getGrupo() + 1;
            aux=aux.getSig();
        }
        return cant;
    }
    
    public ListaDoble Desinteresados()
    {
        ListaDoble des = new ListaDoble();
        NodoDoble aux=cab, aux2=null;
        int cont;
        while(aux!=null)
        {
            aux2=cab;
            cont=0;
            while(aux2!=null)
            {
                if(aux.getDato().getEstudiante().equals(aux2.getDato().getEstudiante()))
                    cont++;
                aux2=aux2.getSig();
            }
            if(cont==1)
                des.InsertarFinal(aux.getDato());
            
            aux=aux.getSig();
        }
        return des;
    }
    
    public boolean EliminarCab()
    {   
        if(EsVacia())
               return false;
        else
        {
            if(cab==ult)
            {
                cab=null;
                ult=null;
            }
            else
            {
                cab=cab.getSig();
                cab.setAnt(null);
            }
            return true;
        }
        
    }
    
    public boolean EliminarFinal()
    {
        if(EsVacia())
            return false;
        else
        {
            if(cab==ult)
                return EliminarCab();
            else
            {
                ult=ult.getAnt();
                ult.setSig(null);
            }
            return true;
        }
    }
    
    public int Cantidad()
    {
        int cant=0;
        NodoDoble aux=cab;
        while(aux!=null)
        {
            cant++;
            aux=aux.getSig();
        }
        return cant;
    }
    
    public boolean Insertar(int pos, Asesoria a)
    {
        if(pos==1)
            return InsertarCab(a);
        else
        {
            if(pos==(Cantidad()+1))
                return InsertarFinal(a);
            else
            {
                if(pos>(Cantidad()+1))
                    return false;
                else
                {
                    NodoDoble aux=cab;
                    int cont=0;
                    while(aux!=null && cont<pos)
                    {
                        cont++;
                        aux=aux.getSig();
                    }
                    NodoDoble n = new NodoDoble(a);
                    n.setAnt(aux.getAnt());
                    n.setSig(aux.getSig());
                    aux.getAnt().setSig(n);
                    aux.getSig().setAnt(n);
                    aux=null;
                    return true;
                }
            }
        }
    }
   
     public boolean Eliminar(int pos)
    {
        if(pos==1)
            return EliminarCab();
        else
        {
            if(pos==Cantidad())
                return EliminarFinal();
            else
            {
                if(pos>Cantidad())
                    return false;
                else
                {
                    NodoDoble aux=cab;
                    int cont=0;
                    while(aux!=null && cont<pos)
                    {
                        cont++;
                        aux=aux.getSig();
                    }
                    aux.getAnt().setSig(aux.getSig());
                    aux.getSig().setAnt(aux.getAnt());
                    aux=null;
                    return true;
                }
            }
        }
    }
    }
    
    
    
    
    
    
    
    
 
