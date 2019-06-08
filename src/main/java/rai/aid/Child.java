
package rai.aid;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Child {

    @SerializedName("selected")
    @Expose
    private Integer selected;
    @SerializedName("quantity")
    @Expose
    private Integer quantity;
    @SerializedName("warning")
    @Expose
    private List<Object> warning = null;
    @SerializedName("instruction")
    @Expose
    private String instruction;
    @SerializedName("children")
    @Expose
    private List<Child_> children = null;
    @SerializedName("entity")
    @Expose
    private List<String> entity = null;
    @SerializedName("instruction_index")
    @Expose
    private Integer instructionIndex;
    @SerializedName("score")
    @Expose
    private Double score;
    @SerializedName("not_found")
    @Expose
    private List<Object> notFound = null;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("price")
    @Expose
    private Integer price;
    @SerializedName("increment")
    @Expose
    private String increment;
    @SerializedName("max_qty")
    @Expose
    private String maxQty;
    @SerializedName("min_qty")
    @Expose
    private String minQty;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("max_price")
    @Expose
    private String maxPrice;

    public Integer getSelected() {
        return selected;
    }

    public void setSelected(Integer selected) {
        this.selected = selected;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public List<Object> getWarning() {
        return warning;
    }

    public void setWarning(List<Object> warning) {
        this.warning = warning;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public List<Child_> getChildren() {
        return children;
    }

    public void setChildren(List<Child_> children) {
        this.children = children;
    }

    public List<String> getEntity() {
        return entity;
    }

    public void setEntity(List<String> entity) {
        this.entity = entity;
    }

    public Integer getInstructionIndex() {
        return instructionIndex;
    }

    public void setInstructionIndex(Integer instructionIndex) {
        this.instructionIndex = instructionIndex;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public List<Object> getNotFound() {
        return notFound;
    }

    public void setNotFound(List<Object> notFound) {
        this.notFound = notFound;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getIncrement() {
        return increment;
    }

    public void setIncrement(String increment) {
        this.increment = increment;
    }

    public String getMaxQty() {
        return maxQty;
    }

    public void setMaxQty(String maxQty) {
        this.maxQty = maxQty;
    }

    public String getMinQty() {
        return minQty;
    }

    public void setMinQty(String minQty) {
        this.minQty = minQty;
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

}
