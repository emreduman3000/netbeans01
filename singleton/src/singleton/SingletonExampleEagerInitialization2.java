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
 class SingletonExampleEagerInitialization22 
{
    private static SingletonExampleEagerInitialization22 instance;

    static
    {
        instance = new SingletonExampleEagerInitialization22();
    }

    private SingletonExampleEagerInitialization22()
    {
        
    }

    public static SingletonExampleEagerInitialization22 getInstance()
    {
        return instance;
    }
}
