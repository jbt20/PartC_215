package midterm;

/**
 * A simple class to model shipping Labels for a delivery service. For simplicity, assume that each ShippingLabel 
 * object has a unique tracking number and a destination type. The possible options for destination types are 
 * provided in an array of type Strings.
 *
 * Students are reminded to add themselves as authors when editing the code.
 *
 * @author Ali Hassan
 * @author Paul Bonenfant
 */
public class ShippingLabel {

    protected String trackingNumber;
    protected String destination;
    private String[] destinationTypes = {"Domestic", "US", "International"};

    /**
     * This method checks whether the format of the provided tracking number is valid or not. Assume that the
     * format of a tracking number is 'TWO _CHARACTERS' + 'SIX_DIGITS'. 
     * Example: AB123456
     *
     * @param trackingNum the tracking number for the label.
     * @return the method returns true if the format of the tracking# is valid.
     */
    public boolean isValid(String trackingNum) {
        boolean isValidNumber = false;
        int validLength = 8; // Number of letters+digits on a valid tracking number;
        if (trackingNum.length() == validLength) {
            if (Character.isLetter(trackingNum.charAt(0))
                    && Character.isLetter(trackingNum.charAt(1))) {
                isValidNumber = true;
                for (int k = 2; k < trackingNum.length(); k++) {
                    if (!Character.isDigit(trackingNum.charAt(k))) {
                        isValidNumber = false;
                    }
                }
            }
        }
        return isValidNumber;
    }

    /**
     * A getter method that returns the tracking number of the ShippingLabel.
     *
     * @return the trackingNumber
     */
    public String getTrackingNumber() {
        return trackingNumber;
    }

    /**
     * A setter method to set the tracking number.
     *
     * @param trackingNumber the trackingNumber to set
     */
    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    /**
     * A getter method to return the destination on the label.
     *
     * @return the destination
     */
    public String getDestination() {
        return destination;
    }

    /**
     * A setter method to set type destination.
     *
     * @param destination the destination to set on the label
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }
}
