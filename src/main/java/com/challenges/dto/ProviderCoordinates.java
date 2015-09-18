
package com.challenges.dto;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "latitude",
    "longitude",
    "horizontalCoord",
    "verticalCoord"
})
public class ProviderCoordinates {

    @JsonProperty("latitude")
    private Double latitude;
    @JsonProperty("longitude")
    private Double longitude;
    @JsonProperty("horizontalCoord")
    private Integer horizontalCoord;
    @JsonProperty("verticalCoord")
    private Integer verticalCoord;

    /**
     * 
     * @return
     *     The latitude
     */
    @JsonProperty("latitude")
    public Double getLatitude() {
        return latitude;
    }

    /**
     * 
     * @param latitude
     *     The latitude
     */
    @JsonProperty("latitude")
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public ProviderCoordinates withLatitude(Double latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     * 
     * @return
     *     The longitude
     */
    @JsonProperty("longitude")
    public Double getLongitude() {
        return longitude;
    }

    /**
     * 
     * @param longitude
     *     The longitude
     */
    @JsonProperty("longitude")
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public ProviderCoordinates withLongitude(Double longitude) {
        this.longitude = longitude;
        return this;
    }

    /**
     * 
     * @return
     *     The horizontalCoord
     */
    @JsonProperty("horizontalCoord")
    public Integer getHorizontalCoord() {
        return horizontalCoord;
    }

    /**
     * 
     * @param horizontalCoord
     *     The horizontalCoord
     */
    @JsonProperty("horizontalCoord")
    public void setHorizontalCoord(Integer horizontalCoord) {
        this.horizontalCoord = horizontalCoord;
    }

    public ProviderCoordinates withHorizontalCoord(Integer horizontalCoord) {
        this.horizontalCoord = horizontalCoord;
        return this;
    }

    /**
     * 
     * @return
     *     The verticalCoord
     */
    @JsonProperty("verticalCoord")
    public Integer getVerticalCoord() {
        return verticalCoord;
    }

    /**
     * 
     * @param verticalCoord
     *     The verticalCoord
     */
    @JsonProperty("verticalCoord")
    public void setVerticalCoord(Integer verticalCoord) {
        this.verticalCoord = verticalCoord;
    }

    public ProviderCoordinates withVerticalCoord(Integer verticalCoord) {
        this.verticalCoord = verticalCoord;
        return this;
    }

}
