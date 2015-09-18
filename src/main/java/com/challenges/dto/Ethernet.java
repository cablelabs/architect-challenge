
package com.challenges.dto;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "bandwidth",
    "flag"
})
public class Ethernet {

    @JsonProperty("bandwidth")
    private String bandwidth;
    @JsonProperty("flag")
    private String flag;

    /**
     * 
     * @return
     *     The bandwidth
     */
    @JsonProperty("bandwidth")
    public String getBandwidth() {
        return bandwidth;
    }

    /**
     * 
     * @param bandwidth
     *     The bandwidth
     */
    @JsonProperty("bandwidth")
    public void setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
    }

    public Ethernet withBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    /**
     * 
     * @return
     *     The flag
     */
    @JsonProperty("flag")
    public String getFlag() {
        return flag;
    }

    /**
     * 
     * @param flag
     *     The flag
     */
    @JsonProperty("flag")
    public void setFlag(String flag) {
        this.flag = flag;
    }

    public Ethernet withFlag(String flag) {
        this.flag = flag;
        return this;
    }

}
