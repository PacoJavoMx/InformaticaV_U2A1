package u2_a1_franciscoalarcon;

//Clase Coche
public class coche {
//Atributos de la clase coche
String modelo;
String color;
double precio;
String marca;
int caballosDeFuerza;
int cilindros;
String motor;
int numPuertas;
boolean estereo;
boolean aireAcondicionado;


//Constructor en base a los atributos

public coche(String modelo, String color, double precio, String marca, int caballosDeFuerza, int cilindros, String motor, int numPuertas, boolean estereo, boolean aireAcondicionado) {
    this.modelo = modelo;
    this.color = color;
    this.precio = precio;
    this.marca = marca;
    this.caballosDeFuerza = caballosDeFuerza;
    this.cilindros = cilindros;
    this.motor = motor;
    this.numPuertas = numPuertas;
    this.estereo = estereo;
    this.aireAcondicionado = aireAcondicionado;
  }

//Setters y Getters 

public void setModelo(String modelo) {
  this.modelo = modelo;
}
public String getModelo() {
  return modelo;
}

public void setColor(String color) {
  this.color = color;
}
public String getColor() {
  return color;
}

public void setPrecio(double precio) {
  this.precio = precio;
}
public double getPrecio() {
  return precio;
}

public void setMarca(String marca) {
  this.marca = marca;
}
public String getMarca() {
  return marca;
}

public void setCaballosDeFuerza(int caballosDeFuerza) {
  this.caballosDeFuerza = caballosDeFuerza;
}
public int getCaballosDeFuerza() {
  return caballosDeFuerza;
}

public void setCilindros(int cilindros) {
  this.cilindros = cilindros;
}
public int getCilindros() {
  return cilindros;
}

public void setMotor(String motor) {
  this.motor = motor;
}
public String getMotor() {
  return motor;
}

public void setNumPuertas(int numPuertas) {
  this.numPuertas = numPuertas;
}
public int getNumPuertas() {
  return numPuertas;
}

public void setEstereo(boolean estereo) {
  this.estereo = estereo;
}
public boolean isEstereo() {
  return estereo;
}

public void setAireAcondicionado(boolean aireAcondicionado) {
  this.aireAcondicionado = aireAcondicionado;
}
public boolean isAireAcondicionado() {
  return aireAcondicionado;
}

//Comportamientos

  public void encender() {
    System.out.println("El coche ha sido encendido.");
  }

  public void apagar() {
    System.out.println("El coche ha sido apagado.");
  }

  public void acelerar(int numVelocidad) {
    System.out.println("El coche está acelerando a " + numVelocidad + " km/h.");
  }

  public void frenar() {
    System.out.println("El coche está frenando.");
  }

  public void abrirPuerta(int numPuertas) {
    System.out.println("La puerta número " + numPuertas + " ha sido abierta.");
  }

  public void cerrarPuerta(int numPuerta) {
    System.out.println("La puerta número " + numPuerta + " ha sido cerrada.");
  }

  public void activarClimatizador() {
    System.out.println("El aire acondicionado ha sido activado.");
  }

  public void desactivarClimatizador() {
    System.out.println("El aire acondicionado ha sido desactivado.");
  }

  public void encenderEstereo() {
    System.out.println("El estéreo ha sido encendido.");
  }

  public void apagarEstereo() {
    System.out.println("El estéreo ha sido apagado.");
  }
}



