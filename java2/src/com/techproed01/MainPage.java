/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techproed01;

import java.util.Scanner;

/**
 *
 * @author emreduman
 */
public class MainPage {
    
    public static void main(String [] args)
    {
        DataBase veriTabani = new DataBase();
        Scanner input = new Scanner(System.in);
        while(true) 
        {
            System.out.println("Lütfen seçim yapınız : ");
            System.out.println("1-Araba Kayıt");
            System.out.println("2-Araba Satış");
            System.out.println("3-Araba Güncelleme");
            System.out.println("4-Tüm Arabaları Görüntüleme");
            System.out.println("5-Sistemden Çıkış Yap.");
            int secim = input.nextInt(); // kullanıcıdan seçim yapmasını istedik.
            if(secim == 5)
            {
                System.out.println("Sistemden başarıyla çıktınız.");
                break;
            }
            else if(secim == 1) 
            {
                //	id , maxHiz, yil;
                //  marka, renk, vites;
                System.out.println("id giriniz : ");
                int id = input.nextInt();
                System.out.println("maxHiz giriniz : ");
                int maxHiz = input.nextInt();
                System.out.println("yil giriniz : ");
                int yil = input.nextInt();
                System.out.println("marka giriniz : ");
                String marka = input.next();
                System.out.println("renk giriniz : ");
                String renk = input.next();
                System.out.println("vites giriniz : ");
                String vites = input.next();
                Car araba = new Car(id,maxHiz, yil, marka, renk, vites);
                veriTabani.carRegisteration(araba);
                }
            
                else if(secim == 2)
                {
                    System.out.println("Lütfen satılan aracın id'sini giriniz : ");
                    int id = input.nextInt();
                    veriTabani.carSelling(id);
                }
                else if(secim == 3)
                {
                    System.out.println("Lütfen güncellemek istediğiniz aracın id'sini giriniz : ");
                    int id = input.nextInt();
                    System.out.println("maxHiz giriniz : ");
                    int maxHiz = input.nextInt();
                    System.out.println("yil giriniz : ");
                    int yil = input.nextInt();
                    System.out.println("marka giriniz : ");
                    String marka = input.next();
                    System.out.println("renk giriniz : ");
                    String renk = input.next();
                    System.out.println("vites giriniz : ");
                    String vites = input.next();
                    Car araba = new Car(id,maxHiz, yil, marka, renk, vites);
                    veriTabani.carUpdating(id, araba);
                }
                
                else if(secim == 4) 
                {
                        veriTabani.carDisplay();
                }
        }
    }
    
}
