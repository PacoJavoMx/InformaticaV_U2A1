package u2_a1_franciscoalarcon;

public class main{

    public static void main(String[] args) {
        
        //Coche 1 Ferrari
        coche Ferrari = new coche("Ferrari", "Rojo", 1000000, "Ferrari", 500, 8, "V8", 2, true, true);
        //Coche 2 Porsche
        coche Porsche = new coche("Porsche 911", "Blanco", 800000, "Porsche", 400, 6, "Flat 6", 2, true, true);
        //Coche 3 Lamborghino
        coche Lamborghini = new coche("Lamborghini Aventador", "Amarillo", 1100000, "Lamborghini", 700, 12, "V12", 2, true, true);

       
        /*Empleando los métodos set y get modificamos
        dos valores de atributos y mostramos impresion 
        del valor original establecido desde el constructor (get)
        y despues del valor modificado (set y get)*/
        
        //El ejemplo sera el Ferrari para el uso de setters and getters
        
        //Ocupando Atributo Modelo
        System.out.println("Modelo original: " + Ferrari.getModelo());
        Ferrari.setModelo("Ferrari Enzo");
        System.out.println("Modelo modificado " + Ferrari.getModelo());
        
        //Ocupando Atributo Color
        System.out.println("Color original: " + Ferrari.getColor());
        Ferrari.setColor("Rojo");
        System.out.println("Color modificado: " + Ferrari.getColor());
        
        
    }
}
    

