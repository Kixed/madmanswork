/*
 * CS Communicator REST API
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
import io.swagger.client.model.ChargingScheduleDTO;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * ChargingProfileDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-12T19:06:01.588+01:00")
public class ChargingProfileDTO {
  @SerializedName("chargingProfileId")
  private Integer chargingProfileId = null;

  @SerializedName("transactionId")
  private Integer transactionId = null;

  @SerializedName("stackLevel")
  private Integer stackLevel = null;

  /**
   * Gets or Sets chargingProfilePurpose
   */
  @JsonAdapter(ChargingProfilePurposeEnum.Adapter.class)
  public enum ChargingProfilePurposeEnum {
    CHARGE_POINT_MAX_PROFILE("CHARGE_POINT_MAX_PROFILE"),
    
    TX_DEFAULT_PROFILE("TX_DEFAULT_PROFILE"),
    
    TX_PROFILE("TX_PROFILE");

    private String value;

    ChargingProfilePurposeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ChargingProfilePurposeEnum fromValue(String text) {
      for (ChargingProfilePurposeEnum b : ChargingProfilePurposeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ChargingProfilePurposeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ChargingProfilePurposeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ChargingProfilePurposeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ChargingProfilePurposeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("chargingProfilePurpose")
  private ChargingProfilePurposeEnum chargingProfilePurpose = null;

  /**
   * Gets or Sets chargingProfileKind
   */
  @JsonAdapter(ChargingProfileKindEnum.Adapter.class)
  public enum ChargingProfileKindEnum {
    ABSOLUTE("ABSOLUTE"),
    
    RECURRING("RECURRING"),
    
    RELATIVE("RELATIVE");

    private String value;

    ChargingProfileKindEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ChargingProfileKindEnum fromValue(String text) {
      for (ChargingProfileKindEnum b : ChargingProfileKindEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ChargingProfileKindEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ChargingProfileKindEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ChargingProfileKindEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ChargingProfileKindEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("chargingProfileKind")
  private ChargingProfileKindEnum chargingProfileKind = null;

  /**
   * Gets or Sets recurrencyKind
   */
  @JsonAdapter(RecurrencyKindEnum.Adapter.class)
  public enum RecurrencyKindEnum {
    DAILY("DAILY"),
    
    WEEKLY("WEEKLY");

    private String value;

    RecurrencyKindEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RecurrencyKindEnum fromValue(String text) {
      for (RecurrencyKindEnum b : RecurrencyKindEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<RecurrencyKindEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RecurrencyKindEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RecurrencyKindEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RecurrencyKindEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("recurrencyKind")
  private RecurrencyKindEnum recurrencyKind = null;

  @SerializedName("validFrom")
  private OffsetDateTime validFrom = null;

  @SerializedName("validTo")
  private OffsetDateTime validTo = null;

  @SerializedName("chargingSchedule")
  private ChargingScheduleDTO chargingSchedule = null;

  public ChargingProfileDTO chargingProfileId(Integer chargingProfileId) {
    this.chargingProfileId = chargingProfileId;
    return this;
  }

   /**
   * Get chargingProfileId
   * @return chargingProfileId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getChargingProfileId() {
    return chargingProfileId;
  }

  public void setChargingProfileId(Integer chargingProfileId) {
    this.chargingProfileId = chargingProfileId;
  }

  public ChargingProfileDTO transactionId(Integer transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Get transactionId
   * @return transactionId
  **/
  @ApiModelProperty(value = "")
  public Integer getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(Integer transactionId) {
    this.transactionId = transactionId;
  }

  public ChargingProfileDTO stackLevel(Integer stackLevel) {
    this.stackLevel = stackLevel;
    return this;
  }

   /**
   * Get stackLevel
   * @return stackLevel
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getStackLevel() {
    return stackLevel;
  }

  public void setStackLevel(Integer stackLevel) {
    this.stackLevel = stackLevel;
  }

  public ChargingProfileDTO chargingProfilePurpose(ChargingProfilePurposeEnum chargingProfilePurpose) {
    this.chargingProfilePurpose = chargingProfilePurpose;
    return this;
  }

   /**
   * Get chargingProfilePurpose
   * @return chargingProfilePurpose
  **/
  @ApiModelProperty(required = true, value = "")
  public ChargingProfilePurposeEnum getChargingProfilePurpose() {
    return chargingProfilePurpose;
  }

  public void setChargingProfilePurpose(ChargingProfilePurposeEnum chargingProfilePurpose) {
    this.chargingProfilePurpose = chargingProfilePurpose;
  }

  public ChargingProfileDTO chargingProfileKind(ChargingProfileKindEnum chargingProfileKind) {
    this.chargingProfileKind = chargingProfileKind;
    return this;
  }

   /**
   * Get chargingProfileKind
   * @return chargingProfileKind
  **/
  @ApiModelProperty(required = true, value = "")
  public ChargingProfileKindEnum getChargingProfileKind() {
    return chargingProfileKind;
  }

  public void setChargingProfileKind(ChargingProfileKindEnum chargingProfileKind) {
    this.chargingProfileKind = chargingProfileKind;
  }

  public ChargingProfileDTO recurrencyKind(RecurrencyKindEnum recurrencyKind) {
    this.recurrencyKind = recurrencyKind;
    return this;
  }

   /**
   * Get recurrencyKind
   * @return recurrencyKind
  **/
  @ApiModelProperty(value = "")
  public RecurrencyKindEnum getRecurrencyKind() {
    return recurrencyKind;
  }

  public void setRecurrencyKind(RecurrencyKindEnum recurrencyKind) {
    this.recurrencyKind = recurrencyKind;
  }

  public ChargingProfileDTO validFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
    return this;
  }

   /**
   * Get validFrom
   * @return validFrom
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getValidFrom() {
    return validFrom;
  }

  public void setValidFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
  }

  public ChargingProfileDTO validTo(OffsetDateTime validTo) {
    this.validTo = validTo;
    return this;
  }

   /**
   * Get validTo
   * @return validTo
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getValidTo() {
    return validTo;
  }

  public void setValidTo(OffsetDateTime validTo) {
    this.validTo = validTo;
  }

  public ChargingProfileDTO chargingSchedule(ChargingScheduleDTO chargingSchedule) {
    this.chargingSchedule = chargingSchedule;
    return this;
  }

   /**
   * Get chargingSchedule
   * @return chargingSchedule
  **/
  @ApiModelProperty(required = true, value = "")
  public ChargingScheduleDTO getChargingSchedule() {
    return chargingSchedule;
  }

  public void setChargingSchedule(ChargingScheduleDTO chargingSchedule) {
    this.chargingSchedule = chargingSchedule;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargingProfileDTO chargingProfileDTO = (ChargingProfileDTO) o;
    return Objects.equals(this.chargingProfileId, chargingProfileDTO.chargingProfileId) &&
        Objects.equals(this.transactionId, chargingProfileDTO.transactionId) &&
        Objects.equals(this.stackLevel, chargingProfileDTO.stackLevel) &&
        Objects.equals(this.chargingProfilePurpose, chargingProfileDTO.chargingProfilePurpose) &&
        Objects.equals(this.chargingProfileKind, chargingProfileDTO.chargingProfileKind) &&
        Objects.equals(this.recurrencyKind, chargingProfileDTO.recurrencyKind) &&
        Objects.equals(this.validFrom, chargingProfileDTO.validFrom) &&
        Objects.equals(this.validTo, chargingProfileDTO.validTo) &&
        Objects.equals(this.chargingSchedule, chargingProfileDTO.chargingSchedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargingProfileId, transactionId, stackLevel, chargingProfilePurpose, chargingProfileKind, recurrencyKind, validFrom, validTo, chargingSchedule);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargingProfileDTO {\n");
    
    sb.append("    chargingProfileId: ").append(toIndentedString(chargingProfileId)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    stackLevel: ").append(toIndentedString(stackLevel)).append("\n");
    sb.append("    chargingProfilePurpose: ").append(toIndentedString(chargingProfilePurpose)).append("\n");
    sb.append("    chargingProfileKind: ").append(toIndentedString(chargingProfileKind)).append("\n");
    sb.append("    recurrencyKind: ").append(toIndentedString(recurrencyKind)).append("\n");
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    validTo: ").append(toIndentedString(validTo)).append("\n");
    sb.append("    chargingSchedule: ").append(toIndentedString(chargingSchedule)).append("\n");
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
