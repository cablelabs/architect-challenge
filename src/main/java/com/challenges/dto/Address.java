
package com.challenges.dto;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "streetNum",
    "prefix",
    "streetName",
    "streetType",
    "suffix",
    "bldg",
    "city",
    "state",
    "zip",
    "zip4"
})
public class Address {

    @JsonProperty("streetNum")
    private Integer streetNum;
    @JsonProperty("prefix")
    private String prefix;
    @JsonProperty("streetName")
    private String streetName;
    @JsonProperty("streetType")
    private String streetType;
    @JsonProperty("suffix")
    private String suffix;
    @JsonProperty("bldg")
    private String bldg;
    @JsonProperty("city")
    private String city;
    @JsonProperty("state")
    private String state;
    @JsonProperty("zip")
    private Integer zip;
    @JsonProperty("zip4")
    private Integer zip4;

    /**
     * 
     * @return
     *     The streetNum
     */
    @JsonProperty("streetNum")
    public Integer getStreetNum() {
        return streetNum;
    }

    /**
     * 
     * @param streetNum
     *     The streetNum
     */
    @JsonProperty("streetNum")
    public void setStreetNum(Integer streetNum) {
        this.streetNum = streetNum;
    }

    public Address withStreetNum(Integer streetNum) {
        this.streetNum = streetNum;
        return this;
    }

    /**
     * 
     * @return
     *     The prefix
     */
    @JsonProperty("prefix")
    public String getPrefix() {
        return prefix;
    }

    /**
     * 
     * @param prefix
     *     The prefix
     */
    @JsonProperty("prefix")
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public Address withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * 
     * @return
     *     The streetName
     */
    @JsonProperty("streetName")
    public String getStreetName() {
        return streetName;
    }

    /**
     * 
     * @param streetName
     *     The streetName
     */
    @JsonProperty("streetName")
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public Address withStreetName(String streetName) {
        this.streetName = streetName;
        return this;
    }

    /**
     * 
     * @return
     *     The streetType
     */
    @JsonProperty("streetType")
    public String getStreetType() {
        return streetType;
    }

    /**
     * 
     * @param streetType
     *     The streetType
     */
    @JsonProperty("streetType")
    public void setStreetType(String streetType) {
        this.streetType = streetType;
    }

    public Address withStreetType(String streetType) {
        this.streetType = streetType;
        return this;
    }

    /**
     * 
     * @return
     *     The suffix
     */
    @JsonProperty("suffix")
    public String getSuffix() {
        return suffix;
    }

    /**
     * 
     * @param suffix
     *     The suffix
     */
    @JsonProperty("suffix")
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public Address withSuffix(String suffix) {
        this.suffix = suffix;
        return this;
    }

    /**
     * 
     * @return
     *     The bldg
     */
    @JsonProperty("bldg")
    public String getBldg() {
        return bldg;
    }

    /**
     * 
     * @param bldg
     *     The bldg
     */
    @JsonProperty("bldg")
    public void setBldg(String bldg) {
        this.bldg = bldg;
    }

    public Address withBldg(String bldg) {
        this.bldg = bldg;
        return this;
    }

    /**
     * 
     * @return
     *     The city
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * 
     * @param city
     *     The city
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    public Address withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * 
     * @return
     *     The state
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     * 
     * @param state
     *     The state
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    public Address withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 
     * @return
     *     The zip
     */
    @JsonProperty("zip")
    public Integer getZip() {
        return zip;
    }

    /**
     * 
     * @param zip
     *     The zip
     */
    @JsonProperty("zip")
    public void setZip(Integer zip) {
        this.zip = zip;
    }

    public Address withZip(Integer zip) {
        this.zip = zip;
        return this;
    }

    /**
     * 
     * @return
     *     The zip4
     */
    @JsonProperty("zip4")
    public Integer getZip4() {
        return zip4;
    }

    /**
     * 
     * @param zip4
     *     The zip4
     */
    @JsonProperty("zip4")
    public void setZip4(Integer zip4) {
        this.zip4 = zip4;
    }

    public Address withZip4(Integer zip4) {
        this.zip4 = zip4;
        return this;
    }

}
