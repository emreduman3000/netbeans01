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
class SingletonExampleEagerInitialization 
{
 
    private static SingletonExampleEagerInitialization instance = new SingletonExampleEagerInitialization();

    private SingletonExampleEagerInitialization()
    {
        
    }

    public static SingletonExampleEagerInitialization getInstance()
    {
        return instance;
    }
}
