
package com.swisscom.ais.client.rest.model.signresp;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "sc.Subcode",
    "sc.Reason",
    "sc.Detail"
})
public class ScMobileIDFault {

    @JsonProperty("sc.Subcode")
    private String scSubcode;
    @JsonProperty("sc.Reason")
    private String scReason;
    @JsonProperty("sc.Detail")
    private ScDetail scDetail;

    @JsonProperty("sc.Subcode")
    public String getScSubcode() {
        return scSubcode;
    }

    @JsonProperty("sc.Subcode")
    public void setScSubcode(String scSubcode) {
        this.scSubcode = scSubcode;
    }

    public ScMobileIDFault withScSubcode(String scSubcode) {
        this.scSubcode = scSubcode;
        return this;
    }

    @JsonProperty("sc.Reason")
    public String getScReason() {
        return scReason;
    }

    @JsonProperty("sc.Reason")
    public void setScReason(String scReason) {
        this.scReason = scReason;
    }

    public ScMobileIDFault withScReason(String scReason) {
        this.scReason = scReason;
        return this;
    }

    @JsonProperty("sc.Detail")
    public ScDetail getScDetail() {
        return scDetail;
    }

    @JsonProperty("sc.Detail")
    public void setScDetail(ScDetail scDetail) {
        this.scDetail = scDetail;
    }

    public ScMobileIDFault withScDetail(ScDetail scDetail) {
        this.scDetail = scDetail;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ScMobileIDFault.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("scSubcode");
        sb.append('=');
        sb.append(((this.scSubcode == null)?"<null>":this.scSubcode));
        sb.append(',');
        sb.append("scReason");
        sb.append('=');
        sb.append(((this.scReason == null)?"<null>":this.scReason));
        sb.append(',');
        sb.append("scDetail");
        sb.append('=');
        sb.append(((this.scDetail == null)?"<null>":this.scDetail));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
