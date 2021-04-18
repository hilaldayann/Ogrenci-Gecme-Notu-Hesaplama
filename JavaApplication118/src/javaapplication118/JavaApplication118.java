/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication118;

import java.util.Scanner;

/**
 *
 * @author Hilal
 */
public class JavaApplication118 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int ogr_no;
        int vize;
        int not_ortalaması;
        int secim;
        String harf;
        while(true)
        {
            Scanner deger = new Scanner(System.in);
            System.out.println("Devam Etmek İçin 1, Çıkmak İ çşn 2' yi Tuşlayınız : ");
            secim = deger.nextInt();
            if(secim == 2)
            {
                break;
            }
            else
            {
                System.out.println("Öğrenci Numarasını Giriniz :");
                ogr_no = deger.nextInt();
                System.out.println("Vize Notunuzu Giriniz :");
                vize = deger.nextInt();
                System.out.println("Not Ortalamasını Giriniz :");
                not_ortalaması = deger.nextInt();
                System.out.println("Hangi Harf Notu İle Geçmek İstersiniz :");
                harf = JavaApplication118.gecme(harf, vize);
            }
        }
    }
    
    public static double gecme(String harf, int vize)
    {
        double gecme = 60;
        double ort = 2;
        double carp = 0.25;
        
        double vizenot = (vize * 40 / 100);
        double sonuc  = gecme - vizenot;
        double finalal = sonuc / 60 * 100;
        System.out.println("Direk Geçmesi İçin Final Notu : " + finalal);
        
        
        double sonuc1 = vizenot * carp;
        double sonuc2 = ort - sonuc1;
        double finalll = sonuc2 * carp;
        System.out.println("Ortalama İle Geçmesi İçin Final Notu : " + finalll);
    }
}
