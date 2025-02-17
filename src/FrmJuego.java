import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class FrmJuego extends JFrame {

    public FrmJuego() {
        setSize(500, 300); //Tamaño de la Interfaz
        setTitle("Daditos Locos"); //Titulo
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //Predeterminado para terminar ejecución cuando se cierre la interfaz (X)
        setLayout(null);

        //DADO 1

        JLabel lblDado1 = new JLabel(); //Declaración para mostrar la imagen del dado
        String nombreImagen = "/img/1.jpg";
        ImageIcon imagen = new ImageIcon(getClass().getResource(nombreImagen)); //Esto nos sirve para obtener recursos del proyecto
        lblDado1.setIcon(imagen); //Asignar la imagen

        lblDado1.setBounds(10, 10, imagen.getIconWidth(), imagen.getIconHeight()); //Agregar las coordenadas y las dimensiones (Siempre se requieren para ponerlas en las interfaz grafica)
        getContentPane().add(lblDado1); //Se agrega a la interfaz

        //DADO 2
        JLabel lblDado2 = new JLabel();
        lblDado2.setIcon(imagen);
        lblDado2.setBounds(10 + imagen.getIconWidth(), 10, imagen.getIconWidth(), imagen.getIconHeight());
        getContentPane().add(lblDado2);

        //TITULOS LANZAMIENTOS
        JLabel lblTitulo1 = new JLabel("Lanzamientos");
        lblTitulo1.setBounds(50 + 2 * imagen.getIconWidth(), 10, 100, 25);
        getContentPane().add(lblTitulo1);

        JLabel lblTitulo2 = new JLabel("Cenas");
        lblTitulo2.setBounds(160 + 2 * imagen.getIconWidth(), 10, 100, 25);
        getContentPane().add(lblTitulo2);

    }
}