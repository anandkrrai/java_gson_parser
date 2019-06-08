
package rai.aid;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Recommendation {

    @SerializedName("RestaurantID")
    @Expose
    private String restaurantID;
    @SerializedName("minimum")
    @Expose
    private Integer minimum;
    @SerializedName("payment_types")
    @Expose
    private List<String> paymentTypes = null;
    @SerializedName("delivery_charge")
    @Expose
    private String deliveryCharge;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("num_ratings")
    @Expose
    private String numRatings;
    @SerializedName("overall_rating")
    @Expose
    private String overallRating;
    @SerializedName("merchant_score")
    @Expose
    private String merchantScore;
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("RestaurantName")
    @Expose
    private String restaurantName;
    @SerializedName("items_not_found")
    @Expose
    private List<Object> itemsNotFound = null;
    @SerializedName("delivery_percent")
    @Expose
    private String deliveryPercent;
    @SerializedName("menu")
    @Expose
    private List<Menu> menu = null;

    public String getRestaurantID() {
        return restaurantID;
    }

    public void setRestaurantID(String restaurantID) {
        this.restaurantID = restaurantID;
    }

    public Integer getMinimum() {
        return minimum;
    }

    public void setMinimum(Integer minimum) {
        this.minimum = minimum;
    }

    public List<String> getPaymentTypes() {
        return paymentTypes;
    }

    public void setPaymentTypes(List<String> paymentTypes) {
        this.paymentTypes = paymentTypes;
    }

    public String getDeliveryCharge() {
        return deliveryCharge;
    }

    public void setDeliveryCharge(String deliveryCharge) {
        this.deliveryCharge = deliveryCharge;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNumRatings() {
        return numRatings;
    }

    public void setNumRatings(String numRatings) {
        this.numRatings = numRatings;
    }

    public String getOverallRating() {
        return overallRating;
    }

    public void setOverallRating(String overallRating) {
        this.overallRating = overallRating;
    }

    public String getMerchantScore() {
        return merchantScore;
    }

    public void setMerchantScore(String merchantScore) {
        this.merchantScore = merchantScore;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public List<Object> getItemsNotFound() {
        return itemsNotFound;
    }

    public void setItemsNotFound(List<Object> itemsNotFound) {
        this.itemsNotFound = itemsNotFound;
    }

    public String getDeliveryPercent() {
        return deliveryPercent;
    }

    public void setDeliveryPercent(String deliveryPercent) {
        this.deliveryPercent = deliveryPercent;
    }

    public List<Menu> getMenu() {
        return menu;
    }

    public void setMenu(List<Menu> menu) {
        this.menu = menu;
    }

}
