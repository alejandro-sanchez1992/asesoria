package asesoria;
import javax.swing.JOptionPane;
public class Principal {
    
    public static int Menu()
    {
        int op = Integer.parseInt(JOptionPane.showInputDialog("Digite una opcion:"
                + "\n 1. Ingresar Asesoria"
                + "\n 2. Buscar por tema"
                + "\n 3. Asesorias de estudiante"
                + "\n 4. Total Beneficiarios"
                + "\n 5. Desinteresados"
                + "\n 6. Mostrar"
                + "\n 7. Salir"));
        return op;
    }
           
 
    public static void main(String[] args) {
        ListaDoble L = new ListaDoble();
        ListaDoble desinteresados=null;
        int dia, grupo, op;
        String estudiante,tema;
        
        do{
            op=Menu();
            switch(op)
            {
                case 1:
                    dia = Integer.parseInt(JOptionPane.showInputDialog("Digite dia"));
                    estudiante = JOptionPane.showInputDialog("Digite nombre estudiante");
                    grupo = Integer.parseInt(JOptionPane.showInputDialog("Digite numero de integrantes"));
                    tema = JOptionPane.showInputDialog("Digite el tema");
                    L.InsertarFinal(new Asesoria(estudiante, dia, grupo, tema));
                    JOptionPane.showMessageDialog(null, "Asesoria creada");
                    break;
                case 2:
                    tema = JOptionPane.showInputDialog("Digite el tema a buscar");
                     JOptionPane.showMessageDialog(null, L.BuscarTema(tema));
                     break;
                case 3:
                    estudiante = JOptionPane.showInputDialog("Digite nombre estudiante");
                    JOptionPane.showMessageDialog(null,"La cantidad de "
                            + "asesorias es: " + L.CantidadAsesorias(estudiante));
                     break;
                case 4: 
                    JOptionPane.showMessageDialog(null,"El total de beneficiarios es  "
                            +  L.CantidadBenef());
                    break;
                case 5:
                    desinteresados=L.Desinteresados();
                    JOptionPane.showMessageDialog(null,"Los estudiantes que solo asistieron "
                            + "una vez a asesoria son: \n " + desinteresados.toString());
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Las asesorias son: \n "+ L.toString());
                    break;
            }
            
        }while(op!=7);
    
    }
    
}
