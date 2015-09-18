
package com.challenges.dto;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "id",
    "providerName",
    "address",
    "icsc",
    "system",
    "bldgClli",
    "lata",
    "siteType",
    "providerCoordinates",
    "ethernet",
    "building",
    "enniNode",
    "switchedEthMin",
    "switchedEthMax"
})
public class LitBuilding {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("providerName")
    private String providerName;
    @JsonProperty("address")
    private Address address;
    @JsonProperty("icsc")
    private String icsc;
    @JsonProperty("system")
    private String system;
    @JsonProperty("bldgClli")
    private String bldgClli;
    @JsonProperty("lata")
    private Lata lata;
    @JsonProperty("siteType")
    private String siteType;
    @JsonProperty("providerCoordinates")
    private ProviderCoordinates providerCoordinates;
    @JsonProperty("ethernet")
    private List<Ethernet> ethernet = new ArrayList<Ethernet>();
    @JsonProperty("building")
    private String building;
    @JsonProperty("enniNode")
    private String enniNode;
    @JsonProperty("switchedEthMin")
    private String switchedEthMin;
    @JsonProperty("switchedEthMax")
    private String switchedEthMax;

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    public LitBuilding withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The providerName
     */
    @JsonProperty("providerName")
    public String getProviderName() {
        return providerName;
    }

    /**
     * 
     * @param providerName
     *     The providerName
     */
    @JsonProperty("providerName")
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public LitBuilding withProviderName(String providerName) {
        this.providerName = providerName;
        return this;
    }

    /**
     * 
     * @return
     *     The address
     */
    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    /**
     * 
     * @param address
     *     The address
     */
    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    public LitBuilding withAddress(Address address) {
        this.address = address;
        return this;
    }

    /**
     * 
     * @return
     *     The icsc
     */
    @JsonProperty("icsc")
    public String getIcsc() {
        return icsc;
    }

    /**
     * 
     * @param icsc
     *     The icsc
     */
    @JsonProperty("icsc")
    public void setIcsc(String icsc) {
        this.icsc = icsc;
    }

    public LitBuilding withIcsc(String icsc) {
        this.icsc = icsc;
        return this;
    }

    /**
     * 
     * @return
     *     The system
     */
    @JsonProperty("system")
    public String getSystem() {
        return system;
    }

    /**
     * 
     * @param system
     *     The system
     */
    @JsonProperty("system")
    public void setSystem(String system) {
        this.system = system;
    }

    public LitBuilding withSystem(String system) {
        this.system = system;
        return this;
    }

    /**
     * 
     * @return
     *     The bldgClli
     */
    @JsonProperty("bldgClli")
    public String getBldgClli() {
        return bldgClli;
    }

    /**
     * 
     * @param bldgClli
     *     The bldgClli
     */
    @JsonProperty("bldgClli")
    public void setBldgClli(String bldgClli) {
        this.bldgClli = bldgClli;
    }

    public LitBuilding withBldgClli(String bldgClli) {
        this.bldgClli = bldgClli;
        return this;
    }

    /**
     * 
     * @return
     *     The lata
     */
    @JsonProperty("lata")
    public Lata getLata() {
        return lata;
    }

    /**
     * 
     * @param lata
     *     The lata
     */
    @JsonProperty("lata")
    public void setLata(Lata lata) {
        this.lata = lata;
    }

    public LitBuilding withLata(Lata lata) {
        this.lata = lata;
        return this;
    }

    /**
     * 
     * @return
     *     The siteType
     */
    @JsonProperty("siteType")
    public String getSiteType() {
        return siteType;
    }

    /**
     * 
     * @param siteType
     *     The siteType
     */
    @JsonProperty("siteType")
    public void setSiteType(String siteType) {
        this.siteType = siteType;
    }

    public LitBuilding withSiteType(String siteType) {
        this.siteType = siteType;
        return this;
    }

    /**
     * 
     * @return
     *     The providerCoordinates
     */
    @JsonProperty("providerCoordinates")
    public ProviderCoordinates getProviderCoordinates() {
        return providerCoordinates;
    }

    /**
     * 
     * @param providerCoordinates
     *     The providerCoordinates
     */
    @JsonProperty("providerCoordinates")
    public void setProviderCoordinates(ProviderCoordinates providerCoordinates) {
        this.providerCoordinates = providerCoordinates;
    }

    public LitBuilding withProviderCoordinates(ProviderCoordinates providerCoordinates) {
        this.providerCoordinates = providerCoordinates;
        return this;
    }

    /**
     * 
     * @return
     *     The ethernet
     */
    @JsonProperty("ethernet")
    public List<Ethernet> getEthernet() {
        return ethernet;
    }

    /**
     * 
     * @param ethernet
     *     The ethernet
     */
    @JsonProperty("ethernet")
    public void setEthernet(List<Ethernet> ethernet) {
        this.ethernet = ethernet;
    }

    public LitBuilding withEthernet(List<Ethernet> ethernet) {
        this.ethernet = ethernet;
        return this;
    }

    /**
     * 
     * @return
     *     The building
     */
    @JsonProperty("building")
    public String getBuilding() {
        return building;
    }

    /**
     * 
     * @param building
     *     The building
     */
    @JsonProperty("building")
    public void setBuilding(String building) {
        this.building = building;
    }

    public LitBuilding withBuilding(String building) {
        this.building = building;
        return this;
    }

    /**
     * 
     * @return
     *     The enniNode
     */
    @JsonProperty("enniNode")
    public String getEnniNode() {
        return enniNode;
    }

    /**
     * 
     * @param enniNode
     *     The enniNode
     */
    @JsonProperty("enniNode")
    public void setEnniNode(String enniNode) {
        this.enniNode = enniNode;
    }

    public LitBuilding withEnniNode(String enniNode) {
        this.enniNode = enniNode;
        return this;
    }

    /**
     * 
     * @return
     *     The switchedEthMin
     */
    @JsonProperty("switchedEthMin")
    public String getSwitchedEthMin() {
        return switchedEthMin;
    }

    /**
     * 
     * @param switchedEthMin
     *     The switchedEthMin
     */
    @JsonProperty("switchedEthMin")
    public void setSwitchedEthMin(String switchedEthMin) {
        this.switchedEthMin = switchedEthMin;
    }

    public LitBuilding withSwitchedEthMin(String switchedEthMin) {
        this.switchedEthMin = switchedEthMin;
        return this;
    }

    /**
     * 
     * @return
     *     The switchedEthMax
     */
    @JsonProperty("switchedEthMax")
    public String getSwitchedEthMax() {
        return switchedEthMax;
    }

    /**
     * 
     * @param switchedEthMax
     *     The switchedEthMax
     */
    @JsonProperty("switchedEthMax")
    public void setSwitchedEthMax(String switchedEthMax) {
        this.switchedEthMax = switchedEthMax;
    }

    public LitBuilding withSwitchedEthMax(String switchedEthMax) {
        this.switchedEthMax = switchedEthMax;
        return this;
    }

}
