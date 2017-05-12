
package taller2.exercise.pkg6;

/**
 *
 * @author Sebastian Baldion
 */
public class Taller2Exercise6 {

    public static void main(String[] args) {
        Taller2Exercise6 sub = new Taller2Exercise6();
        int arreglo[] = {0, 0, 0, 1, 0, 1, 0, 1};
        int tamaño = arreglo.length;
        sub.EncontrarSubArreglo(arreglo, tamaño);
    }

    int EncontrarSubArreglo(int arreglo[], int n) {
        int suma = 0;
        int maxtamaño = -1, indicein = 0, indicefin = 0;

        for (int i = 0; i < n - 1; i++) {
            suma = (arreglo[i] == 0) ? -1 : 1;

            for (int j = i + 1; j < n; j++) {
                if (arreglo[j] == 0) {
                    suma += -1;
                } else {
                    suma += 1;
                }

                if (suma == 0 && maxtamaño < j - i + 1) {
                    maxtamaño = j - i + 1;
                    indicein = i + 1;
                }
            }
        }
        indicefin = indicein + maxtamaño - 1;
        if (maxtamaño == -1) {
            System.out.println("No se encontro subarreglo");
        } else {
            System.out.println("Desde el indice " + indicein + " Hasta " + indicefin);
        }
        return maxtamaño;
    }
}