/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w10;

/**
 *
 * @author emreduman
 */

public class Circle 
{
    public double radius;
    public Circle(double radius)
    {
        this.radius=radius;
    }
    public double areaCircle()
    {
        return 3.14*radius*radius;
    }
}

