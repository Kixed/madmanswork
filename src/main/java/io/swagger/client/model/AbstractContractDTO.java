/*
 * Business Partner REST API
 * ## Authentication options  ### OAuth2 / OpenID Connect  The supported authentication method is OpenID Connect via Keycloak. For testing APIs via Swaggerhub or Swagger UI, please use **client_id** `swagger`.  When developing applications against this API, a separate client application must be registered in Keycloak.  ### X-Token header authentication  Internal use only, deprecated. The core services use these authentication headers for system account based requests.  
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.AbstractBusinessPartnerDTO;
import io.swagger.client.model.VersionedData;
import java.io.IOException;

/**
 * AbstractContractDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-12T18:44:40.010+01:00")

public class AbstractContractDTO {
  @SerializedName("versionedData")
  private VersionedData versionedData = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("supplier")
  private AbstractBusinessPartnerDTO supplier = null;

  @SerializedName("customer")
  private AbstractBusinessPartnerDTO customer = null;

  public AbstractContractDTO() {

  }
  public AbstractContractDTO versionedData(VersionedData versionedData) {
    this.versionedData = versionedData;
    return this;
  }

   /**
   * Get versionedData
   * @return versionedData
  **/
  @ApiModelProperty(value = "")
  public VersionedData getVersionedData() {
    return versionedData;
  }

  public void setVersionedData(VersionedData versionedData) {
    this.versionedData = versionedData;
  }

  public AbstractContractDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AbstractContractDTO supplier(AbstractBusinessPartnerDTO supplier) {
    this.supplier = supplier;
    return this;
  }

   /**
   * Get supplier
   * @return supplier
  **/
  @ApiModelProperty(required = true, value = "")
  public AbstractBusinessPartnerDTO getSupplier() {
    return supplier;
  }

  public void setSupplier(AbstractBusinessPartnerDTO supplier) {
    this.supplier = supplier;
  }

  public AbstractContractDTO customer(AbstractBusinessPartnerDTO customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @ApiModelProperty(required = true, value = "")
  public AbstractBusinessPartnerDTO getCustomer() {
    return customer;
  }

  public void setCustomer(AbstractBusinessPartnerDTO customer) {
    this.customer = customer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbstractContractDTO abstractContractDTO = (AbstractContractDTO) o;
    return Objects.equals(this.versionedData, abstractContractDTO.versionedData) &&
        Objects.equals(this.name, abstractContractDTO.name) &&
        Objects.equals(this.supplier, abstractContractDTO.supplier) &&
        Objects.equals(this.customer, abstractContractDTO.customer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versionedData, name, supplier, customer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbstractContractDTO {\n");
    
    sb.append("    versionedData: ").append(toIndentedString(versionedData)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    supplier: ").append(toIndentedString(supplier)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

