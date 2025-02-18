import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Dado {

    private int numero;

    public void lanzar(Random r) {
       numero = r.nextInt(6) + 1;
    }

    public int getNumero() {
        return numero;
    }

    public void mostrar(JLabel lbl) {
        String nombreImagen = "/img/"+ String.valueOf(numero) +".jpg";
        ImageIcon imagen = new ImageIcon(getClass().getResource(nombreImagen)); //Esto nos sirve para obtener recursos del proyecto
        lbl.setIcon(imagen);
    }
}
