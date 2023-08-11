package ejerciciorobot;

public class EjercicioRobot {

    
    public static void main(String[] args) {
        Robot robot = new Robot();
        
        Hombre hombre1 = new Hombre();
        
        hombre1.jugarConRobot(robot);
        
        Hombre hombre2 = new Hombre();
        
        hombre2.jugarConRobot(robot);
    }
    
}
