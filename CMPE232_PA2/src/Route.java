//-----------------------------------------------------
// Title: Route Objcet class
// Author: Mustafa Baran Ercan
// ID: 28810555206
// Section: 6
// Assignment: 2
// Description: This class defines the Route object class we want to create in Main class.
//-----------------------------------------------------
public class Route implements Comparable{
    private String source;
    private String destination;

    public Route(String source, String destination) {                           // Constructor for object
        this.source = source;                                                   // which takes 2 string values as input.
        this.destination = destination;
    }

    public String getSource() {                                                 // Getter method for String Source.
        return source;
    }

    public void setSource(String source) {                                      // Setter method for String Source.
        this.source = source;
    }

    public String getDestination() {                                            // Getter method for String Destinaton.
        return destination;
    }

    public void setDestination(String destination) {                            // Setter method for String Destination.
        this.destination = destination;
    }
    
    public int compareTo(Route r2) {                                            // This compareTo method needs a Route object as an input.
        if (this.source.compareTo(r2.source) >= 0) {                            // Compares the source attributes of two Route object.
            if(this.source.compareTo(r2.source) > 0) {                          // If they have the same source value, then compares destination values.
                return +1;
            } else {
                if (this.destination.compareTo(r2.destination) >= 0) {
                    if(this.destination.compareTo(r2.destination) > 0) {
                        return +1;
                    } return 0;
                }
            }
        } return -1;
    }

    @Override                                                                   // Overrided compareTo method which takes any object and cast it as a Route object
    public int compareTo(Object o) {                                            // and recursively calls compareTo(Route r) method.
        return compareTo((Route) o);   
    }

    @Override
    public String toString() {                                                  // Overrided toString method to print out the route object.
        return getSource() + " " + getDestination();
    }
    
    
    
}
