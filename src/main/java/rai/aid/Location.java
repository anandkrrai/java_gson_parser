
package rai.aid;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Location {

    @SerializedName("zip")
    @Expose
    private String zip;
    @SerializedName("distance")
    @Expose
    private Double distance;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("street")
    @Expose
    private String street;
    @SerializedName("state")
    @Expose
    private String state;

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
