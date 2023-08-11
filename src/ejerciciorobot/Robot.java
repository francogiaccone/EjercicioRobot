
package ejerciciorobot;

public class Robot {
    
    private Bateria bateriaRobot;
    private boolean estado = true;
    
    public Robot() {
        this.bateriaRobot = new Bateria();
    }
    
    public void avanzar(int pasos) {
        
        if (estado) {
            double consumo = pasos * 0.1;
        
            if (bateriaRobot.getCarga() > consumo) {
                bateriaRobot.setCarga(bateriaRobot.getCarga() - (int) consumo);
                System.out.println("Avanzaste " + pasos + " pasos");
            } else {
                System.out.println("No tienes suficiente bateria.");
            }
        } else {
            System.out.println("Necesitas despertar al robot");
        }
    }
    
    public void retroceder(int pasos) {
        if (estado) {
            double consumo = pasos * 0.1;
        
            if (bateriaRobot.getCarga() > consumo) {
                bateriaRobot.setCarga(bateriaRobot.getCarga() - (int) consumo);
                System.out.println("Retrocediste " + pasos + " pasos");
            } else {
                System.out.println("No tienes suficiente bateria.");
            }
        } else {
            System.out.println("Necesitas despertar al robot");
        }
    }
    
    
    public void dormir() {
        if (estado) {
            System.out.println("El robot esta durmiendo.");
            estado = false;
        } else {
            System.out.println("El robot ya esta dormido.");
        }
    }
    
    public void despertar() {
        if (estado) {
            System.out.println("El robot ya está despierto.");
        } else {
            System.out.println("El robot esta despierto");
        estado = true;
        }  
    }
    
    public void recargar() {
        if (bateriaRobot.getCarga() == 1000) {
            System.out.println("La bateria ya esta llena.");
        } else {
            bateriaRobot.setCarga(1000);
            System.out.println("La bateria se cargó completo.");
        }
    }
    
    public boolean bateriaLlena() {
        return bateriaRobot.getCarga() == 1000;
    }
    
    public boolean bateriaVacia() {
        return bateriaRobot.getCarga() == 0;
    }
    
    public int energiaActual() {
        return bateriaRobot.getCarga();
    }
}