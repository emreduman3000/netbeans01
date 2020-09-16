/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *Yazdığınız program da birbirine benzeyen birden fazla sınıf olabilir. 
 * Bu tür sınıfları oluştururken her seferinde new operatörünü kullanmayın 
 * ya da o sınıflardan sanki birbirinden bağımsızmış gibi kod yazmayalım 
 * diye böyle bir örüntü tasarlamışlar.
 * 
 * @author emreduman
 */
public class Factory
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        try 
        {
            Asus asus = (Asus) ComputerFactory.createComputer(Asus.class);
            asus.since(1234);
            asus.name();

            Mac mac = (Mac) ComputerFactory.createComputer(Mac.class);
            mac.name();
            mac.since(2000);

        }
        catch (IllegalAccessException | InstantiationException e)
        {
        }

    }
    
}

interface computer
        //interface im , classlar burdan methodlarımı alıcak
        //yani classlar özellikleri benzer çünkü methodlara sahipler
{
    void name();
    void since(int year);
}


//MAC  VE ASUS SINIFI DA BENZERLER O ZAMAN FABRİKA SINIFI OLUSTURALIM
class Mac implements computer //mac sınıfım computer interface inden methodları aldı
{

    @Override
    public void name() {
        System.out.println("Bilgisayarın Markası Mac");
    }

    @Override
    public void since(int year) {
        System.out.println(year + " senesinde alınmış.");
    }

}


class Asus implements computer //Asus classım computer interfaceinden methodları cekti
{

    @Override
    public void name() {
        System.out.println("Bilgisayarın Markası Asus");
    }

    @Override
    public void since(int year) {
        System.out.println(year + " senesinde alınmış.");
    }

}

class ComputerFactory //fabrika sınıfım
{
    // method class parametresi alıyor yani mac ve asus un class parametreleri buraya uyacak
    public static computer createComputer(Class aClass) throws IllegalAccessException, InstantiationException
    {
        return (computer) aClass.newInstance();
    }
}