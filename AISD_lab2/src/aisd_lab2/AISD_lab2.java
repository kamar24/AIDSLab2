/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aisd_lab2;

/**
 *
 * @author Lukasz nr:list4
 */
public class AISD_lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       
{
    final int N = 5; // moc zbioru
    int[] tab = new int[N+1];
    int s = (int)Math.pow(2,N);
    for (int l = 0; l < s; l++)
    {
    System.out.print("{ ");
    for (int i = 0; i < N; i++)
    if (tab[i] == 1) System.out.print(i+1 + " ");
    System.out.println("}");
    int i = 0;
    do
    {
    if (tab[i] == 1)
    {
    tab[i] = 0;
    i++;
    }
    else
    {
    tab[i] = 1;
    break;
    }
    } while (true);
    }
    }
    }
    }
    

