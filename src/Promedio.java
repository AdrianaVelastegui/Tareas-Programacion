
package src;


public class Promedio {

    public static void main(String[] args) {

        float not1 = 22.5f, not2 = 33.5f, not3 = 42.5f;
        float prom = (not1 + not2 + not3 / 3);

        if (prom >= 70) {
            System.out.println("El estudiante aprobo la materia con el promedio " + prom);
        } else {
            System.out.println("El estudiante no aprobo la materia");
        }
    }

}
