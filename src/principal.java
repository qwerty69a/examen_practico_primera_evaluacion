/**
 *examen practico
 * @author Alberto O, Salazar 18550300
 */
import java.util.*;
public class principal
{
    @SuppressWarnings("empty-statement")
    public static void main(String[] args)
    {
        Scanner leer=new Scanner(System.in);
        String aux;
        int aux1, auxy, auxy2, auxy3, auxy4;
        float aux2, aux3, aux4;
        memensaje uno=new memensaje();
        System.out.println("escribe la cantidad monetaria");
        aux=leer.nextLine();
        uno.setMansaje(aux);
        System.out.println("el mensaje es: ");uno.getMensaje();
        temperaturas tibio=new temperaturas();
        System.out.println("ingresa la temperatura en grados celcius");
        aux2=leer.nextFloat();
        aux3=(((9/5)*aux2)+32);
        tibio.setCtoF(aux3);
        aux4=(aux2)+273;
        tibio.setCtoK(aux4);
        tibio.setCelcius(aux2);
        System.out.println("ingresa la temperatura en grados farenheit");
        aux2=leer.nextFloat();
        aux3=(aux2-32)*(5/9);
        tibio.setFtoC(aux3);
        aux4=((aux2-32)*(5/9)+273);
        tibio.setFtoK(aux4);
        tibio.setFarenheit(aux2);
        System.out.println("ingresa la temperatura en grados kelvin");
        aux2=leer.nextFloat();
        aux3=(aux2)-273;
        tibio.setKtoC(aux3);
        aux4=(((aux2)-273)*(9/5))+32;
        tibio.setKtoF(aux4);
        tibio.setKelvin(aux2);
        System.out.println("Las temperaturas son:");
        System.out.print("la temperatura en grados celcius es: ");tibio.getCelcius();System.out.print("°C = ");tibio.getCtoF();System.out.print("°F = ");tibio.getCtoK();System.out.println("°K");
        System.out.print("la temperatura en grados farenheit es: ");tibio.getFarenheit();System.out.print("°F = ");tibio.getFtoC();System.out.print("°C = ");tibio.getFtoK();System.out.println("°K");
        System.out.print("la temperatura en grados kelvin es: ");tibio.getKelvin();System.out.print("°K = ");tibio.getKtoF();System.out.print("°F = ");tibio.getKtoC();System.out.println("°C");
        suma primer_serie=new suma();
        System.out.println("ingresa el valor de a1");
        aux1=leer.nextInt();
        primer_serie.setA1(aux1);
        System.out.println("ingresa el valor de n");
        auxy=leer.nextInt();
        primer_serie.setN(auxy);
        auxy3=aux1;
        System.out.println("la serie (sumando 2) es la siguiente:");
        System.out.print(auxy3+", ");
        for(int i=0; i<aux1; i++);
        {
            auxy3=auxy3+3;
            System.out.print(auxy3+", ");
        }
        System.out.println("");
        primer_serie.setAN(auxy3);
        auxy4=((aux1+auxy3)*(auxy))/(2);
        primer_serie.setSerie(auxy4);
        System.out.print("a1  =");primer_serie.getA1();System.out.println("");
        System.out.print("n   =");primer_serie.getN();System.out.println("");
        System.out.print("an  =");primer_serie.getAN();System.out.println("");
        System.out.println("La suma de la serie es: ");primer_serie.getSerie();System.out.println("");
        instituto alumno1=new instituto();
        System.out.println("");
        aux=leer.nextLine();
        System.out.println("ingres tu nombre completo");
        aux=leer.nextLine();
        alumno1.setApeidos(aux);
        System.out.println("de que carrera eres");
        aux=leer.nextLine();
        alumno1.setCarrera(aux);
        System.out.println("cual es tu direccion");
        aux=leer.nextLine();
        alumno1.setDireccion(aux);
        System.out.println("cual es tu correo electronico");
        aux=leer.nextLine();
        alumno1.setEmail(aux);
        System.out.println("cual es tu numero de control");
        aux1=leer.nextInt();
        alumno1.setNum_Control(aux1);
        System.out.println("cuantos años tienes");
        aux1=leer.nextInt();
        alumno1.setEdad(aux1);
        System.out.println("en que año naciste");
        aux1=leer.nextInt();
        alumno1.setAño(aux1);
        System.out.println("en que dia del mes naciste");
        aux1=leer.nextInt();
        alumno1.setDia(aux1);
        System.out.println("en que mes naciste");
        aux1=leer.nextInt();
        switch(aux1)
        {
            case 1: alumno1.setMes("enero");
            break;
            case 2: alumno1.setMes("febrero");
            break;
            case 3: alumno1.setMes("marzo");
            break;
            case 4: alumno1.setMes("abril");
            break;
            case 5: alumno1.setMes("mayo");
            break;
            case 6: alumno1.setMes("junio");
            break;
            case 7: alumno1.setMes("julio");
            break;
            case 8: alumno1.setMes("agosto");
            break;
            case 9: alumno1.setMes("septiembre");
            break;
            case 10: alumno1.setMes("octubre");
            break;
            case 11: alumno1.setMes("noviembre");
            break;
            case 12: alumno1.setMes("diciembre");
            break;
            default: alumno1.setMes("");
        }
        System.out.println("los datos del alumno son:");
        System.out.print("nombre:               ");alumno1.getApeidos();System.out.println("");
        System.out.print("direccion:            ");alumno1.getDireccion();System.out.println("");
        System.out.print("correo:               ");alumno1.getEmail();System.out.println("");
        System.out.print("carrera:              ");alumno1.getCarrera();System.out.println("");
        System.out.print("edad:                 ");alumno1.getEdad();System.out.println("");
        System.out.print("No. control:          ");alumno1.getNum_Control();System.out.println("");
        System.out.print("Fecha de nacimiento:  ");alumno1.getDia();System.out.print(" de ");alumno1.getMes();System.out.print(" del año ");alumno1.getAño();System.out.println("");
    }
}
class memensaje
{
    private String mensajini;
    public void setMansaje(String iVal)
    {
        mensajini=iVal;
    }
    public void getMensaje()
    {
        System.out.println(mensajini);
    }
}
class temperaturas
{
    private float kelvin, farenheit, celcius, cTOk, cTOf, fTOk, fTOc, kTOf, kTOc;
    public void setKelvin(float iVal)
    {
        kelvin=iVal;
    }
    public void setFarenheit(float iVal)
    {
        farenheit=iVal;
    }
    public void setCelcius(float iVal)
    {
        celcius=iVal;
    }
    public void setCtoK(float iVal)
    {
        cTOk=iVal;
    }
    public void setCtoF(float iVal)
    {
        cTOf=iVal;
    }
    public void setFtoC(float iVal)
    {
        fTOc=iVal;
    }
    public void setFtoK(float iVal)
    {
        fTOk=iVal;
    }
    public void setKtoF(float iVal)
    {
        kTOf=iVal;
    }
    public void setKtoC(float iVal)
    {
        kTOc=iVal;
    }
    public void getKelvin()
    {
        System.out.print(kelvin);
    }
    public void getFarenheit()
    {
        System.out.print(farenheit);
    }
    public void getCelcius()
    {
        System.out.print(celcius);
    }
    public void getCtoK()
    {
        System.out.print(cTOk);
    }
    public void getCtoF()
    {
        System.out.print(cTOf);
    }
    public void getFtoC()
    {
        System.out.print(fTOc);
    }
    public void getFtoK()
    {
        System.out.print(fTOk);
    }
    public void getKtoF()
    {
        System.out.print(kTOf);
    }
    public void getKtoC()
    {
        System.out.print(kTOc);
    }
}
class suma
{
    private int n, a1, aN, serie;
    public void setN(int iVal)
    {
        n=iVal;
    }
    public void setA1(int iVal)
    {
        a1=iVal;
    }
    public void setAN(int iVal)
    {
        aN=iVal;
    }
    public void setSerie(int iVal)
    {
        serie=iVal;
    }
    public void getSerie()
    {
        System.out.print(serie);
    }
    public void getN()
    {
        System.out.print(n);
    }
    public void getA1()
    {
        System.out.print(a1);
    }
    public void getAN()
    {
        System.out.print(aN);
    }
}
class instituto
{
    private String nombre, apeidos, direccion, correo, carrera, mes;
    private int num_control, edad, año_nac, dia;
    public void setMes(String iVal)
    {
        mes=iVal;
    }
    public void getMes()
    {
        System.out.print(mes);
    }
    public void setDia(int iVal)
    {
        dia=iVal;
    }
    public void getDia()
    {
        System.out.print(dia);
    }
    public void setAño(int iVal)
    {
        año_nac=iVal;
    }
    public void getAño()
    {
        System.out.print(año_nac);
    }
    public void setNombre(String iVal)
    {
        nombre=iVal;
    }
    public void setApeidos(String iVal)
    {
        apeidos=iVal;
    }
    public void setDireccion(String iVal)
    {
        direccion=iVal;
    }
    public void setEmail(String iVal)
    {
        correo=iVal;
    }
    public void setNum_Control(int iVal)
    {
        num_control=iVal;
    }
    public void setCarrera(String iVal)
    {
        carrera=iVal;
    }
    public void setEdad(int iVal)
    {
        edad=iVal;
    }
    public void getNombre()
    {
        System.out.print(nombre);
    }
    public void getApeidos()
    {
        System.out.print(apeidos);
    }
    public void getDireccion()
    {
        System.out.print(direccion);
    }
    public void getEmail()
    {
        System.out.print(correo);
    }
    public void getNum_Control()
    {
        System.out.print(num_control);
    }
    public void getCarrera()
    {
        System.out.print(carrera);
    }
    public void getEdad()
    {
        System.out.print(edad);
    }
}