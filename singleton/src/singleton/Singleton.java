/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author emreduman
 */
public class Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SingletonExample singletonExample1 = SingletonExample.getInstance();
        SingletonExample singletonExample2 = SingletonExample.getInstance();

        System.out.println("singletonExample1 ==> " + singletonExample1);
        System.out.println("singletonExample2 ==> " + singletonExample2);

        System.out.println(singletonExample1 == singletonExample2);
        
        
        
        SingletonExampleEagerInitialization singletonExampleEagerInitialization1 = SingletonExampleEagerInitialization.getInstance();
        SingletonExampleEagerInitialization singletonExampleEagerInitialization2 = SingletonExampleEagerInitialization.getInstance();

        System.out.println("singletonExampleEagerInitialization1 ==> " + singletonExampleEagerInitialization1);
        System.out.println("singletonExampleEagerInitialization2 ==> " + singletonExampleEagerInitialization2);

        System.out.println(singletonExampleEagerInitialization1 == singletonExampleEagerInitialization2);
        
        
        
         
        SingletonExampleEagerInitialization22 singletonExampleEagerInitialization3 = SingletonExampleEagerInitialization22.getInstance();
        SingletonExampleEagerInitialization22 singletonExampleEagerInitialization4 = SingletonExampleEagerInitialization22.getInstance();

        System.out.println("singletonExampleEagerInitialization1 ==> " + singletonExampleEagerInitialization3);
        System.out.println("singletonExampleEagerInitialization2 ==> " + singletonExampleEagerInitialization4);

        System.out.println(singletonExampleEagerInitialization3 == singletonExampleEagerInitialization4);
        
    }
    
}
