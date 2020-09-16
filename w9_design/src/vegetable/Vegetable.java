
package vegetable;

/** This class +++Insert Description Here+++
 *
 * @author Megha Patel
 */
public abstract class Vegetable {
    private String name; //name of the vegetable
    private String color; //color of the vegetable

    
    protected Vegetable(String n,String c)
    {
        name=n;
        color=c;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
    
    public abstract boolean isTasty();
    
    
}
