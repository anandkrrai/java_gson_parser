
package rai.aid;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Body {

    @SerializedName("Recommendations")
    @Expose
    private List<Recommendation> recommendations = null;
    @SerializedName("special_instructions")
    @Expose
    private List<String> specialInstructions = null;
    @SerializedName("address")
    @Expose
    private Address address;

    public List<Recommendation> getRecommendations() {
        return recommendations;
    }

    public void setRecommendations(List<Recommendation> recommendations) {
        this.recommendations = recommendations;
    }

    public List<String> getSpecialInstructions() {
        return specialInstructions;
    }

    public void setSpecialInstructions(List<String> specialInstructions) {
        this.specialInstructions = specialInstructions;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
