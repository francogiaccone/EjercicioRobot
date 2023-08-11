/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciorobot;

/**
 *
 * @author Ivan
 */
public class Hombre {
    
    public void jugarConRobot(Robot robot1) {
        robot1.avanzar(500);
        robot1.retroceder(20);
        System.out.println("Energia actual: " + robot1.energiaActual());
        robot1.dormir();
    }
    
}