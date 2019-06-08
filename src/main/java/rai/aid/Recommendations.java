
package rai.aid;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Recommendations {

    @SerializedName("api_version")
    @Expose
    private String apiVersion;
    @SerializedName("bugged_versions")
    @Expose
    private List<Object> buggedVersions = null;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("body")
    @Expose
    private Body body;
    @SerializedName("status")
    @Expose
    private String status;

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<Object> getBuggedVersions() {
        return buggedVersions;
    }

    public void setBuggedVersions(List<Object> buggedVersions) {
        this.buggedVersions = buggedVersions;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
