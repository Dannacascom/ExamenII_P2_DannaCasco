
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;


class Hilo  extends Thread{
     private JProgressBar barra;
    private double largo;

     public Hilo(JProgressBar barra, double largo) {
        this.barra = barra;
        this.largo = largo;
    }

    @Override
    public void run() {
        int contador = 0;
        barra.setMaximum((int) (Math.round(largo) / 10));
        while (contador <= (int)(Math.round(largo)) / 10) {
            barra.setValue(contador);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            contador+=10;
        }
        JOptionPane.showMessageDialog(null, "Guardado exitosamente");
        barra.setValue(0);
    }
}
