
package rai.aid;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Child____ {

    @SerializedName("selected")
    @Expose
    private Integer selected;
    @SerializedName("children")
    @Expose
    private List<Object> children = null;
    @SerializedName("entity")
    @Expose
    private List<String> entity = null;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("max_price")
    @Expose
    private String maxPrice;
    @SerializedName("description")
    @Expose
    private String description;

    public Integer getSelected() {
        return selected;
    }

    public void setSelected(Integer selected) {
        this.selected = selected;
    }

    public List<Object> getChildren() {
        return children;
    }

    public void setChildren(List<Object> children) {
        this.children = children;
    }

    public List<String> getEntity() {
        return entity;
    }

    public void setEntity(List<String> entity) {
        this.entity = entity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(String maxPrice) {
        this.maxPrice = maxPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
