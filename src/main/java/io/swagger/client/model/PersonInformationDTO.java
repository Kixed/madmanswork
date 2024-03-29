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
import io.swagger.client.model.AbstractUserDTO;
import io.swagger.client.model.LanguageDTO;
import io.swagger.client.model.PersonSimpleDTO;
import java.io.IOException;

/**
 * PersonInformationDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-12T18:44:40.010+01:00")
public class PersonInformationDTO {
  @SerializedName("personData")
  private PersonSimpleDTO personData = null;

  @SerializedName("userData")
  private AbstractUserDTO userData = null;

  @SerializedName("language")
  private LanguageDTO language = null;

  public PersonInformationDTO personData(PersonSimpleDTO personData) {
    this.personData = personData;
    return this;
  }

   /**
   * Get personData
   * @return personData
  **/
  @ApiModelProperty(value = "")
  public PersonSimpleDTO getPersonData() {
    return personData;
  }

  public void setPersonData(PersonSimpleDTO personData) {
    this.personData = personData;
  }

  public PersonInformationDTO userData(AbstractUserDTO userData) {
    this.userData = userData;
    return this;
  }

   /**
   * Get userData
   * @return userData
  **/
  @ApiModelProperty(value = "")
  public AbstractUserDTO getUserData() {
    return userData;
  }

  public void setUserData(AbstractUserDTO userData) {
    this.userData = userData;
  }

  public PersonInformationDTO language(LanguageDTO language) {
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @ApiModelProperty(value = "")
  public LanguageDTO getLanguage() {
    return language;
  }

  public void setLanguage(LanguageDTO language) {
    this.language = language;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonInformationDTO personInformationDTO = (PersonInformationDTO) o;
    return Objects.equals(this.personData, personInformationDTO.personData) &&
        Objects.equals(this.userData, personInformationDTO.userData) &&
        Objects.equals(this.language, personInformationDTO.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personData, userData, language);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonInformationDTO {\n");
    
    sb.append("    personData: ").append(toIndentedString(personData)).append("\n");
    sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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

