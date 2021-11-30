
import java.io.*;
import java.util.*;


// Rotació vector:

/* Aquest programa consisteix en rotar els elements d'un vector. D'entrada donarem quantes posicions rotarem i si és cap a l'esquerra "e" o cap a la dreta "d", i després introduïm el tamany i els valors del vector d'enters. Cal que aconseguiu rotar tantes posicions com es demani cap a l'esquerra o la dreta i s'imprimeixi el resultat.

Input Format

Introduïm a la primera fila un nombre P: posicions a rotar, i una direcció d: {'e', 'd'} En la segona fila introduïm el tamany N del vector. En la tercera fila introduïm els N elements del vector.

Constraints

No n'hi ha.

Output Format

Mostrem el resultat del vector amb els elements rotats.

Sample Input 0

1 e
4
1 2 3 4
Sample Output 0

2 3 4 1
Sample Input 1

2 d
10
1 2 3 4 5 6 7 8 9 10
Sample Output 1

9 10 1 2 3 4 5 6 7 8
Sample Input 2

0 e
3
1 2 3
Sample Output 2

1 2 3
Sample Input 3

7 e
2
1 2
Sample Output 3

2 1
 */

public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);


        int posiciones = sc.nextInt();

        String direccion = sc.next();

        int grosor1 = sc.nextInt();

        int miArray [] = new int [grosor1];



        for (int i = 0; i < grosor1; i++)
        {
            miArray[i] = sc.nextInt();

            //System.out.print(miArray[i] + " ");


        }

        if(direccion.equals("e"))
        {

            for (int i = 0; i < grosor1; i++)
            {


                System.out.print(miArray[(i + posiciones) % grosor1]);
                System.out.print(" ");
            }
        }

        if(direccion.equals("d"))
        {
            for (int i = 0; i < grosor1; i++)
            {

                System.out.print(miArray[(i - posiciones + grosor1) % grosor1]);
                System.out.print(" ");
            }
        }


    }
}
