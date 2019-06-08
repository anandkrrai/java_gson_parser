
package rai.aid;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Child_ {

    @SerializedName("selected")
    @Expose
    private Integer selected;
    @SerializedName("children")
    @Expose
    private List<Child__> children = null;
    @SerializedName("entity")
    @Expose
    private List<String> entity = null;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("max_selection")
    @Expose
    private String maxSelection;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("sel_dep")
    @Expose
    private String selDep;
    @SerializedName("min_selection")
    @Expose
    private String minSelection;
    @SerializedName("description")
    @Expose
    private String description;

    public Integer getSelected() {
        return selected;
    }

    public void setSelected(Integer selected) {
        this.selected = selected;
    }

    public List<Child__> getChildren() {
        return children;
    }

    public void setChildren(List<Child__> children) {
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

    public String getMaxSelection() {
        return maxSelection;
    }

    public void setMaxSelection(String maxSelection) {
        this.maxSelection = maxSelection;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSelDep() {
        return selDep;
    }

    public void setSelDep(String selDep) {
        this.selDep = selDep;
    }

    public String getMinSelection() {
        return minSelection;
    }

    public void setMinSelection(String minSelection) {
        this.minSelection = minSelection;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
