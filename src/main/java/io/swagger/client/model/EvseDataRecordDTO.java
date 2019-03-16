/*
 * Roaming REST API
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
import io.swagger.client.model.AdditionalInfoDTO;
import io.swagger.client.model.AddressDTO;
import io.swagger.client.model.ChargingFacilitiesDTO;
import io.swagger.client.model.GeoChargingPointEntranceDTO;
import io.swagger.client.model.GeoCoordinatesDTO;
import io.swagger.client.model.OpeningTimesDTO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;

/**
 * EvseDataRecordDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-12T18:37:18.317+01:00")
public class EvseDataRecordDTO {
  @SerializedName("additionalInfo")
  private List<AdditionalInfoDTO> additionalInfo = null;

  /**
   * Gets or Sets authenticationModes
   */
  @JsonAdapter(AuthenticationModesEnum.Adapter.class)
  public enum AuthenticationModesEnum {
    NFC_RFID_CLASSIC("NFC_RFID_CLASSIC"),
    
    NFC_RFID_DESFIRE("NFC_RFID_DESFIRE"),
    
    PNC("PNC"),
    
    REMOTE("REMOTE"),
    
    DIRECT_PAYMENT("DIRECT_PAYMENT");

    private String value;

    AuthenticationModesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AuthenticationModesEnum fromValue(String text) {
      for (AuthenticationModesEnum b : AuthenticationModesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AuthenticationModesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AuthenticationModesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AuthenticationModesEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AuthenticationModesEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("authenticationModes")
  private List<AuthenticationModesEnum> authenticationModes = null;

  @SerializedName("chargingFacilities")
  private List<ChargingFacilitiesDTO> chargingFacilities = null;

  /**
   * Gets or Sets chargingModes
   */
  @JsonAdapter(ChargingModesEnum.Adapter.class)
  public enum ChargingModesEnum {
    MODE_1("MODE_1"),
    
    MODE_2("MODE_2"),
    
    MODE_3("MODE_3"),
    
    MODE_4("MODE_4"),
    
    CHADEMO("CHADEMO");

    private String value;

    ChargingModesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ChargingModesEnum fromValue(String text) {
      for (ChargingModesEnum b : ChargingModesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ChargingModesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ChargingModesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ChargingModesEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ChargingModesEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("chargingModes")
  private List<ChargingModesEnum> chargingModes = null;

  @SerializedName("openingTimes")
  private List<OpeningTimesDTO> openingTimes = null;

  /**
   * Gets or Sets paymentOptions
   */
  @JsonAdapter(PaymentOptionsEnum.Adapter.class)
  public enum PaymentOptionsEnum {
    NO_PAYMENT("NO_PAYMENT"),
    
    DIRECT("DIRECT"),
    
    CONTRACT("CONTRACT");

    private String value;

    PaymentOptionsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PaymentOptionsEnum fromValue(String text) {
      for (PaymentOptionsEnum b : PaymentOptionsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PaymentOptionsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PaymentOptionsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PaymentOptionsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PaymentOptionsEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("paymentOptions")
  private List<PaymentOptionsEnum> paymentOptions = null;

  /**
   * Gets or Sets plugs
   */
  @JsonAdapter(PlugsEnum.Adapter.class)
  public enum PlugsEnum {
    SMALL_PADDLE_INDUCTIVE("SMALL_PADDLE_INDUCTIVE"),
    
    LARGE_PADDLE_INDUCTIVE("LARGE_PADDLE_INDUCTIVE"),
    
    AVCON_CONNECTOR("AVCON_CONNECTOR"),
    
    TESLA_CONNECTOR("TESLA_CONNECTOR"),
    
    NEMA_5_20("NEMA_5_20"),
    
    TYPE_E_FRENCH_STANDARD("TYPE_E_FRENCH_STANDARD"),
    
    TYPE_F_SCHUKO("TYPE_F_SCHUKO"),
    
    TYPE_G_BRITISH_STANDARD("TYPE_G_BRITISH_STANDARD"),
    
    TYPE_J_SWISS_STANDARD("TYPE_J_SWISS_STANDARD"),
    
    TYPE_1_CONNECTOR_CABLE_ATTACHED("TYPE_1_CONNECTOR_CABLE_ATTACHED"),
    
    TYPE_2_OUTLET("TYPE_2_OUTLET"),
    
    TYPE_2_CONNECTOR_CABLE_ATTACHED("TYPE_2_CONNECTOR_CABLE_ATTACHED"),
    
    TYPE_3_OUTLET("TYPE_3_OUTLET"),
    
    IEC_60309_SINGLE_PHASE("IEC_60309_SINGLE_PHASE"),
    
    IEC_60309_THREE_PHASE("IEC_60309_THREE_PHASE"),
    
    CCS_COMBO_2_PLUG_CABLE_ATTACHED("CCS_COMBO_2_PLUG_CABLE_ATTACHED"),
    
    CCS_COMBO_1_PLUG_CABLE_ATTACHED("CCS_COMBO_1_PLUG_CABLE_ATTACHED"),
    
    CHADEMO("CHADEMO"),
    
    UNSPECIFIED("UNSPECIFIED");

    private String value;

    PlugsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PlugsEnum fromValue(String text) {
      for (PlugsEnum b : PlugsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PlugsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PlugsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PlugsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PlugsEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("plugs")
  private List<PlugsEnum> plugs = null;

  /**
   * Gets or Sets valueAddedServices
   */
  @JsonAdapter(ValueAddedServicesEnum.Adapter.class)
  public enum ValueAddedServicesEnum {
    RESERVATION("RESERVATION"),
    
    DYNAMICPRICING("DYNAMICPRICING"),
    
    PARKINGSENSORS("PARKINGSENSORS"),
    
    MAXIMUMPOWERCHARGING("MAXIMUMPOWERCHARGING"),
    
    PREDICTIVECHARGEPOINTUSAGE("PREDICTIVECHARGEPOINTUSAGE"),
    
    CHARGINGPLANS("CHARGINGPLANS"),
    
    NONE("NONE");

    private String value;

    ValueAddedServicesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ValueAddedServicesEnum fromValue(String text) {
      for (ValueAddedServicesEnum b : ValueAddedServicesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ValueAddedServicesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ValueAddedServicesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ValueAddedServicesEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ValueAddedServicesEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("valueAddedServices")
  private List<ValueAddedServicesEnum> valueAddedServices = null;

  /**
   * Gets or Sets accessibility
   */
  @JsonAdapter(AccessibilityEnum.Adapter.class)
  public enum AccessibilityEnum {
    UNSPECIFIED("UNSPECIFIED"),
    
    FREE_PUBLICLY_ACCESSIBLE("FREE_PUBLICLY_ACCESSIBLE"),
    
    RESTRICTED_ACCESS("RESTRICTED_ACCESS"),
    
    PAYING_PUBLICLY_ACCESSIBLE("PAYING_PUBLICLY_ACCESSIBLE"),
    
    TEST_STATION("TEST_STATION");

    private String value;

    AccessibilityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AccessibilityEnum fromValue(String text) {
      for (AccessibilityEnum b : AccessibilityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AccessibilityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccessibilityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccessibilityEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AccessibilityEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("accessibility")
  private AccessibilityEnum accessibility = null;

  @SerializedName("address")
  private AddressDTO address = null;

  @SerializedName("chargingPoolId")
  private String chargingPoolId = null;

  @SerializedName("chargingStationId")
  private String chargingStationId = null;

  @SerializedName("chargingStationName")
  private String chargingStationName = null;

  @SerializedName("clearinghouseId")
  private String clearinghouseId = null;

  /**
   * Gets or Sets dynamicInfoAvailable
   */
  @JsonAdapter(DynamicInfoAvailableEnum.Adapter.class)
  public enum DynamicInfoAvailableEnum {
    TRUE("TRUE"),
    
    FALSE("FALSE"),
    
    AUTO("AUTO");

    private String value;

    DynamicInfoAvailableEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DynamicInfoAvailableEnum fromValue(String text) {
      for (DynamicInfoAvailableEnum b : DynamicInfoAvailableEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DynamicInfoAvailableEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DynamicInfoAvailableEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DynamicInfoAvailableEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DynamicInfoAvailableEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("dynamicInfoAvailable")
  private DynamicInfoAvailableEnum dynamicInfoAvailable = null;

  @SerializedName("enChargingStationName")
  private String enChargingStationName = null;

  @SerializedName("evseId")
  private String evseId = null;

  @SerializedName("geoChargingPointEntrance")
  private GeoChargingPointEntranceDTO geoChargingPointEntrance = null;

  @SerializedName("geoCoordinates")
  private GeoCoordinatesDTO geoCoordinates = null;

  @SerializedName("hotlinePhoneNumber")
  private String hotlinePhoneNumber = null;

  @SerializedName("hubOperatorId")
  private String hubOperatorId = null;

  @SerializedName("publishToHubject")
  private Boolean publishToHubject = null;

  @SerializedName("publicStation")
  private Boolean publicStation = null;

  @SerializedName("freeChargingMode")
  private Boolean freeChargingMode = null;

  @SerializedName("chargeAndPayAvailable")
  private Boolean chargeAndPayAvailable = null;

  @SerializedName("open24Hours")
  private Boolean open24Hours = null;

  @SerializedName("maxCapacity")
  private Integer maxCapacity = null;

  /**
   * Gets or Sets deltaType
   */
  @JsonAdapter(DeltaTypeEnum.Adapter.class)
  public enum DeltaTypeEnum {
    INSERT("INSERT"),
    
    UPDATE("UPDATE"),
    
    DELETE("DELETE");

    private String value;

    DeltaTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DeltaTypeEnum fromValue(String text) {
      for (DeltaTypeEnum b : DeltaTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DeltaTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DeltaTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DeltaTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DeltaTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("deltaType")
  private DeltaTypeEnum deltaType = null;

  @SerializedName("lastUpdate")
  private OffsetDateTime lastUpdate = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("chargePointVendor")
  private String chargePointVendor = null;

  @SerializedName("chargePointModel")
  private String chargePointModel = null;

  @SerializedName("installationDate")
  private LocalDate installationDate = null;

  @SerializedName("hubjectCompatible")
  private Boolean hubjectCompatible = null;

  public EvseDataRecordDTO additionalInfo(List<AdditionalInfoDTO> additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  public EvseDataRecordDTO addAdditionalInfoItem(AdditionalInfoDTO additionalInfoItem) {
    if (this.additionalInfo == null) {
      this.additionalInfo = new ArrayList<AdditionalInfoDTO>();
    }
    this.additionalInfo.add(additionalInfoItem);
    return this;
  }

   /**
   * Get additionalInfo
   * @return additionalInfo
  **/
  @ApiModelProperty(value = "")
  public List<AdditionalInfoDTO> getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(List<AdditionalInfoDTO> additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public EvseDataRecordDTO authenticationModes(List<AuthenticationModesEnum> authenticationModes) {
    this.authenticationModes = authenticationModes;
    return this;
  }

  public EvseDataRecordDTO addAuthenticationModesItem(AuthenticationModesEnum authenticationModesItem) {
    if (this.authenticationModes == null) {
      this.authenticationModes = new ArrayList<AuthenticationModesEnum>();
    }
    this.authenticationModes.add(authenticationModesItem);
    return this;
  }

   /**
   * Get authenticationModes
   * @return authenticationModes
  **/
  @ApiModelProperty(value = "")
  public List<AuthenticationModesEnum> getAuthenticationModes() {
    return authenticationModes;
  }

  public void setAuthenticationModes(List<AuthenticationModesEnum> authenticationModes) {
    this.authenticationModes = authenticationModes;
  }

  public EvseDataRecordDTO chargingFacilities(List<ChargingFacilitiesDTO> chargingFacilities) {
    this.chargingFacilities = chargingFacilities;
    return this;
  }

  public EvseDataRecordDTO addChargingFacilitiesItem(ChargingFacilitiesDTO chargingFacilitiesItem) {
    if (this.chargingFacilities == null) {
      this.chargingFacilities = new ArrayList<ChargingFacilitiesDTO>();
    }
    this.chargingFacilities.add(chargingFacilitiesItem);
    return this;
  }

   /**
   * Get chargingFacilities
   * @return chargingFacilities
  **/
  @ApiModelProperty(value = "")
  public List<ChargingFacilitiesDTO> getChargingFacilities() {
    return chargingFacilities;
  }

  public void setChargingFacilities(List<ChargingFacilitiesDTO> chargingFacilities) {
    this.chargingFacilities = chargingFacilities;
  }

  public EvseDataRecordDTO chargingModes(List<ChargingModesEnum> chargingModes) {
    this.chargingModes = chargingModes;
    return this;
  }

  public EvseDataRecordDTO addChargingModesItem(ChargingModesEnum chargingModesItem) {
    if (this.chargingModes == null) {
      this.chargingModes = new ArrayList<ChargingModesEnum>();
    }
    this.chargingModes.add(chargingModesItem);
    return this;
  }

   /**
   * Get chargingModes
   * @return chargingModes
  **/
  @ApiModelProperty(value = "")
  public List<ChargingModesEnum> getChargingModes() {
    return chargingModes;
  }

  public void setChargingModes(List<ChargingModesEnum> chargingModes) {
    this.chargingModes = chargingModes;
  }

  public EvseDataRecordDTO openingTimes(List<OpeningTimesDTO> openingTimes) {
    this.openingTimes = openingTimes;
    return this;
  }

  public EvseDataRecordDTO addOpeningTimesItem(OpeningTimesDTO openingTimesItem) {
    if (this.openingTimes == null) {
      this.openingTimes = new ArrayList<OpeningTimesDTO>();
    }
    this.openingTimes.add(openingTimesItem);
    return this;
  }

   /**
   * Get openingTimes
   * @return openingTimes
  **/
  @ApiModelProperty(value = "")
  public List<OpeningTimesDTO> getOpeningTimes() {
    return openingTimes;
  }

  public void setOpeningTimes(List<OpeningTimesDTO> openingTimes) {
    this.openingTimes = openingTimes;
  }

  public EvseDataRecordDTO paymentOptions(List<PaymentOptionsEnum> paymentOptions) {
    this.paymentOptions = paymentOptions;
    return this;
  }

  public EvseDataRecordDTO addPaymentOptionsItem(PaymentOptionsEnum paymentOptionsItem) {
    if (this.paymentOptions == null) {
      this.paymentOptions = new ArrayList<PaymentOptionsEnum>();
    }
    this.paymentOptions.add(paymentOptionsItem);
    return this;
  }

   /**
   * Get paymentOptions
   * @return paymentOptions
  **/
  @ApiModelProperty(value = "")
  public List<PaymentOptionsEnum> getPaymentOptions() {
    return paymentOptions;
  }

  public void setPaymentOptions(List<PaymentOptionsEnum> paymentOptions) {
    this.paymentOptions = paymentOptions;
  }

  public EvseDataRecordDTO plugs(List<PlugsEnum> plugs) {
    this.plugs = plugs;
    return this;
  }

  public EvseDataRecordDTO addPlugsItem(PlugsEnum plugsItem) {
    if (this.plugs == null) {
      this.plugs = new ArrayList<PlugsEnum>();
    }
    this.plugs.add(plugsItem);
    return this;
  }

   /**
   * Get plugs
   * @return plugs
  **/
  @ApiModelProperty(value = "")
  public List<PlugsEnum> getPlugs() {
    return plugs;
  }

  public void setPlugs(List<PlugsEnum> plugs) {
    this.plugs = plugs;
  }

  public EvseDataRecordDTO valueAddedServices(List<ValueAddedServicesEnum> valueAddedServices) {
    this.valueAddedServices = valueAddedServices;
    return this;
  }

  public EvseDataRecordDTO addValueAddedServicesItem(ValueAddedServicesEnum valueAddedServicesItem) {
    if (this.valueAddedServices == null) {
      this.valueAddedServices = new ArrayList<ValueAddedServicesEnum>();
    }
    this.valueAddedServices.add(valueAddedServicesItem);
    return this;
  }

   /**
   * Get valueAddedServices
   * @return valueAddedServices
  **/
  @ApiModelProperty(value = "")
  public List<ValueAddedServicesEnum> getValueAddedServices() {
    return valueAddedServices;
  }

  public void setValueAddedServices(List<ValueAddedServicesEnum> valueAddedServices) {
    this.valueAddedServices = valueAddedServices;
  }

  public EvseDataRecordDTO accessibility(AccessibilityEnum accessibility) {
    this.accessibility = accessibility;
    return this;
  }

   /**
   * Get accessibility
   * @return accessibility
  **/
  @ApiModelProperty(required = true, value = "")
  public AccessibilityEnum getAccessibility() {
    return accessibility;
  }

  public void setAccessibility(AccessibilityEnum accessibility) {
    this.accessibility = accessibility;
  }

  public EvseDataRecordDTO address(AddressDTO address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(required = true, value = "")
  public AddressDTO getAddress() {
    return address;
  }

  public void setAddress(AddressDTO address) {
    this.address = address;
  }

  public EvseDataRecordDTO chargingPoolId(String chargingPoolId) {
    this.chargingPoolId = chargingPoolId;
    return this;
  }

   /**
   * Get chargingPoolId
   * @return chargingPoolId
  **/
  @ApiModelProperty(value = "")
  public String getChargingPoolId() {
    return chargingPoolId;
  }

  public void setChargingPoolId(String chargingPoolId) {
    this.chargingPoolId = chargingPoolId;
  }

  public EvseDataRecordDTO chargingStationId(String chargingStationId) {
    this.chargingStationId = chargingStationId;
    return this;
  }

   /**
   * Get chargingStationId
   * @return chargingStationId
  **/
  @ApiModelProperty(value = "")
  public String getChargingStationId() {
    return chargingStationId;
  }

  public void setChargingStationId(String chargingStationId) {
    this.chargingStationId = chargingStationId;
  }

  public EvseDataRecordDTO chargingStationName(String chargingStationName) {
    this.chargingStationName = chargingStationName;
    return this;
  }

   /**
   * Get chargingStationName
   * @return chargingStationName
  **/
  @ApiModelProperty(value = "")
  public String getChargingStationName() {
    return chargingStationName;
  }

  public void setChargingStationName(String chargingStationName) {
    this.chargingStationName = chargingStationName;
  }

  public EvseDataRecordDTO clearinghouseId(String clearinghouseId) {
    this.clearinghouseId = clearinghouseId;
    return this;
  }

   /**
   * Get clearinghouseId
   * @return clearinghouseId
  **/
  @ApiModelProperty(value = "")
  public String getClearinghouseId() {
    return clearinghouseId;
  }

  public void setClearinghouseId(String clearinghouseId) {
    this.clearinghouseId = clearinghouseId;
  }

  public EvseDataRecordDTO dynamicInfoAvailable(DynamicInfoAvailableEnum dynamicInfoAvailable) {
    this.dynamicInfoAvailable = dynamicInfoAvailable;
    return this;
  }

   /**
   * Get dynamicInfoAvailable
   * @return dynamicInfoAvailable
  **/
  @ApiModelProperty(required = true, value = "")
  public DynamicInfoAvailableEnum getDynamicInfoAvailable() {
    return dynamicInfoAvailable;
  }

  public void setDynamicInfoAvailable(DynamicInfoAvailableEnum dynamicInfoAvailable) {
    this.dynamicInfoAvailable = dynamicInfoAvailable;
  }

  public EvseDataRecordDTO enChargingStationName(String enChargingStationName) {
    this.enChargingStationName = enChargingStationName;
    return this;
  }

   /**
   * Get enChargingStationName
   * @return enChargingStationName
  **/
  @ApiModelProperty(value = "")
  public String getEnChargingStationName() {
    return enChargingStationName;
  }

  public void setEnChargingStationName(String enChargingStationName) {
    this.enChargingStationName = enChargingStationName;
  }

  public EvseDataRecordDTO evseId(String evseId) {
    this.evseId = evseId;
    return this;
  }

   /**
   * Get evseId
   * @return evseId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getEvseId() {
    return evseId;
  }

  public void setEvseId(String evseId) {
    this.evseId = evseId;
  }

  public EvseDataRecordDTO geoChargingPointEntrance(GeoChargingPointEntranceDTO geoChargingPointEntrance) {
    this.geoChargingPointEntrance = geoChargingPointEntrance;
    return this;
  }

   /**
   * Get geoChargingPointEntrance
   * @return geoChargingPointEntrance
  **/
  @ApiModelProperty(value = "")
  public GeoChargingPointEntranceDTO getGeoChargingPointEntrance() {
    return geoChargingPointEntrance;
  }

  public void setGeoChargingPointEntrance(GeoChargingPointEntranceDTO geoChargingPointEntrance) {
    this.geoChargingPointEntrance = geoChargingPointEntrance;
  }

  public EvseDataRecordDTO geoCoordinates(GeoCoordinatesDTO geoCoordinates) {
    this.geoCoordinates = geoCoordinates;
    return this;
  }

   /**
   * Get geoCoordinates
   * @return geoCoordinates
  **/
  @ApiModelProperty(required = true, value = "")
  public GeoCoordinatesDTO getGeoCoordinates() {
    return geoCoordinates;
  }

  public void setGeoCoordinates(GeoCoordinatesDTO geoCoordinates) {
    this.geoCoordinates = geoCoordinates;
  }

  public EvseDataRecordDTO hotlinePhoneNumber(String hotlinePhoneNumber) {
    this.hotlinePhoneNumber = hotlinePhoneNumber;
    return this;
  }

   /**
   * Get hotlinePhoneNumber
   * @return hotlinePhoneNumber
  **/
  @ApiModelProperty(required = true, value = "")
  public String getHotlinePhoneNumber() {
    return hotlinePhoneNumber;
  }

  public void setHotlinePhoneNumber(String hotlinePhoneNumber) {
    this.hotlinePhoneNumber = hotlinePhoneNumber;
  }

  public EvseDataRecordDTO hubOperatorId(String hubOperatorId) {
    this.hubOperatorId = hubOperatorId;
    return this;
  }

   /**
   * Get hubOperatorId
   * @return hubOperatorId
  **/
  @ApiModelProperty(value = "")
  public String getHubOperatorId() {
    return hubOperatorId;
  }

  public void setHubOperatorId(String hubOperatorId) {
    this.hubOperatorId = hubOperatorId;
  }

  public EvseDataRecordDTO publishToHubject(Boolean publishToHubject) {
    this.publishToHubject = publishToHubject;
    return this;
  }

   /**
   * Get publishToHubject
   * @return publishToHubject
  **/
  @ApiModelProperty(value = "")
  public Boolean isPublishToHubject() {
    return publishToHubject;
  }

  public void setPublishToHubject(Boolean publishToHubject) {
    this.publishToHubject = publishToHubject;
  }

  public EvseDataRecordDTO publicStation(Boolean publicStation) {
    this.publicStation = publicStation;
    return this;
  }

   /**
   * Get publicStation
   * @return publicStation
  **/
  @ApiModelProperty(value = "")
  public Boolean isPublicStation() {
    return publicStation;
  }

  public void setPublicStation(Boolean publicStation) {
    this.publicStation = publicStation;
  }

  public EvseDataRecordDTO freeChargingMode(Boolean freeChargingMode) {
    this.freeChargingMode = freeChargingMode;
    return this;
  }

   /**
   * Get freeChargingMode
   * @return freeChargingMode
  **/
  @ApiModelProperty(value = "")
  public Boolean isFreeChargingMode() {
    return freeChargingMode;
  }

  public void setFreeChargingMode(Boolean freeChargingMode) {
    this.freeChargingMode = freeChargingMode;
  }

  public EvseDataRecordDTO chargeAndPayAvailable(Boolean chargeAndPayAvailable) {
    this.chargeAndPayAvailable = chargeAndPayAvailable;
    return this;
  }

   /**
   * Get chargeAndPayAvailable
   * @return chargeAndPayAvailable
  **/
  @ApiModelProperty(value = "")
  public Boolean isChargeAndPayAvailable() {
    return chargeAndPayAvailable;
  }

  public void setChargeAndPayAvailable(Boolean chargeAndPayAvailable) {
    this.chargeAndPayAvailable = chargeAndPayAvailable;
  }

  public EvseDataRecordDTO open24Hours(Boolean open24Hours) {
    this.open24Hours = open24Hours;
    return this;
  }

   /**
   * Get open24Hours
   * @return open24Hours
  **/
  @ApiModelProperty(value = "")
  public Boolean isOpen24Hours() {
    return open24Hours;
  }

  public void setOpen24Hours(Boolean open24Hours) {
    this.open24Hours = open24Hours;
  }

  public EvseDataRecordDTO maxCapacity(Integer maxCapacity) {
    this.maxCapacity = maxCapacity;
    return this;
  }

   /**
   * Get maxCapacity
   * @return maxCapacity
  **/
  @ApiModelProperty(value = "")
  public Integer getMaxCapacity() {
    return maxCapacity;
  }

  public void setMaxCapacity(Integer maxCapacity) {
    this.maxCapacity = maxCapacity;
  }

  public EvseDataRecordDTO deltaType(DeltaTypeEnum deltaType) {
    this.deltaType = deltaType;
    return this;
  }

   /**
   * Get deltaType
   * @return deltaType
  **/
  @ApiModelProperty(value = "")
  public DeltaTypeEnum getDeltaType() {
    return deltaType;
  }

  public void setDeltaType(DeltaTypeEnum deltaType) {
    this.deltaType = deltaType;
  }

  public EvseDataRecordDTO lastUpdate(OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

   /**
   * Get lastUpdate
   * @return lastUpdate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  public EvseDataRecordDTO status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public EvseDataRecordDTO chargePointVendor(String chargePointVendor) {
    this.chargePointVendor = chargePointVendor;
    return this;
  }

   /**
   * Get chargePointVendor
   * @return chargePointVendor
  **/
  @ApiModelProperty(value = "")
  public String getChargePointVendor() {
    return chargePointVendor;
  }

  public void setChargePointVendor(String chargePointVendor) {
    this.chargePointVendor = chargePointVendor;
  }

  public EvseDataRecordDTO chargePointModel(String chargePointModel) {
    this.chargePointModel = chargePointModel;
    return this;
  }

   /**
   * Get chargePointModel
   * @return chargePointModel
  **/
  @ApiModelProperty(value = "")
  public String getChargePointModel() {
    return chargePointModel;
  }

  public void setChargePointModel(String chargePointModel) {
    this.chargePointModel = chargePointModel;
  }

  public EvseDataRecordDTO installationDate(LocalDate installationDate) {
    this.installationDate = installationDate;
    return this;
  }

   /**
   * Get installationDate
   * @return installationDate
  **/
  @ApiModelProperty(value = "")
  public LocalDate getInstallationDate() {
    return installationDate;
  }

  public void setInstallationDate(LocalDate installationDate) {
    this.installationDate = installationDate;
  }

  public EvseDataRecordDTO hubjectCompatible(Boolean hubjectCompatible) {
    this.hubjectCompatible = hubjectCompatible;
    return this;
  }

   /**
   * Get hubjectCompatible
   * @return hubjectCompatible
  **/
  @ApiModelProperty(value = "")
  public Boolean isHubjectCompatible() {
    return hubjectCompatible;
  }

  public void setHubjectCompatible(Boolean hubjectCompatible) {
    this.hubjectCompatible = hubjectCompatible;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvseDataRecordDTO evseDataRecordDTO = (EvseDataRecordDTO) o;
    return Objects.equals(this.additionalInfo, evseDataRecordDTO.additionalInfo) &&
        Objects.equals(this.authenticationModes, evseDataRecordDTO.authenticationModes) &&
        Objects.equals(this.chargingFacilities, evseDataRecordDTO.chargingFacilities) &&
        Objects.equals(this.chargingModes, evseDataRecordDTO.chargingModes) &&
        Objects.equals(this.openingTimes, evseDataRecordDTO.openingTimes) &&
        Objects.equals(this.paymentOptions, evseDataRecordDTO.paymentOptions) &&
        Objects.equals(this.plugs, evseDataRecordDTO.plugs) &&
        Objects.equals(this.valueAddedServices, evseDataRecordDTO.valueAddedServices) &&
        Objects.equals(this.accessibility, evseDataRecordDTO.accessibility) &&
        Objects.equals(this.address, evseDataRecordDTO.address) &&
        Objects.equals(this.chargingPoolId, evseDataRecordDTO.chargingPoolId) &&
        Objects.equals(this.chargingStationId, evseDataRecordDTO.chargingStationId) &&
        Objects.equals(this.chargingStationName, evseDataRecordDTO.chargingStationName) &&
        Objects.equals(this.clearinghouseId, evseDataRecordDTO.clearinghouseId) &&
        Objects.equals(this.dynamicInfoAvailable, evseDataRecordDTO.dynamicInfoAvailable) &&
        Objects.equals(this.enChargingStationName, evseDataRecordDTO.enChargingStationName) &&
        Objects.equals(this.evseId, evseDataRecordDTO.evseId) &&
        Objects.equals(this.geoChargingPointEntrance, evseDataRecordDTO.geoChargingPointEntrance) &&
        Objects.equals(this.geoCoordinates, evseDataRecordDTO.geoCoordinates) &&
        Objects.equals(this.hotlinePhoneNumber, evseDataRecordDTO.hotlinePhoneNumber) &&
        Objects.equals(this.hubOperatorId, evseDataRecordDTO.hubOperatorId) &&
        Objects.equals(this.publishToHubject, evseDataRecordDTO.publishToHubject) &&
        Objects.equals(this.publicStation, evseDataRecordDTO.publicStation) &&
        Objects.equals(this.freeChargingMode, evseDataRecordDTO.freeChargingMode) &&
        Objects.equals(this.chargeAndPayAvailable, evseDataRecordDTO.chargeAndPayAvailable) &&
        Objects.equals(this.open24Hours, evseDataRecordDTO.open24Hours) &&
        Objects.equals(this.maxCapacity, evseDataRecordDTO.maxCapacity) &&
        Objects.equals(this.deltaType, evseDataRecordDTO.deltaType) &&
        Objects.equals(this.lastUpdate, evseDataRecordDTO.lastUpdate) &&
        Objects.equals(this.status, evseDataRecordDTO.status) &&
        Objects.equals(this.chargePointVendor, evseDataRecordDTO.chargePointVendor) &&
        Objects.equals(this.chargePointModel, evseDataRecordDTO.chargePointModel) &&
        Objects.equals(this.installationDate, evseDataRecordDTO.installationDate) &&
        Objects.equals(this.hubjectCompatible, evseDataRecordDTO.hubjectCompatible);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalInfo, authenticationModes, chargingFacilities, chargingModes, openingTimes, paymentOptions, plugs, valueAddedServices, accessibility, address, chargingPoolId, chargingStationId, chargingStationName, clearinghouseId, dynamicInfoAvailable, enChargingStationName, evseId, geoChargingPointEntrance, geoCoordinates, hotlinePhoneNumber, hubOperatorId, publishToHubject, publicStation, freeChargingMode, chargeAndPayAvailable, open24Hours, maxCapacity, deltaType, lastUpdate, status, chargePointVendor, chargePointModel, installationDate, hubjectCompatible);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvseDataRecordDTO {\n");
    
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    authenticationModes: ").append(toIndentedString(authenticationModes)).append("\n");
    sb.append("    chargingFacilities: ").append(toIndentedString(chargingFacilities)).append("\n");
    sb.append("    chargingModes: ").append(toIndentedString(chargingModes)).append("\n");
    sb.append("    openingTimes: ").append(toIndentedString(openingTimes)).append("\n");
    sb.append("    paymentOptions: ").append(toIndentedString(paymentOptions)).append("\n");
    sb.append("    plugs: ").append(toIndentedString(plugs)).append("\n");
    sb.append("    valueAddedServices: ").append(toIndentedString(valueAddedServices)).append("\n");
    sb.append("    accessibility: ").append(toIndentedString(accessibility)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    chargingPoolId: ").append(toIndentedString(chargingPoolId)).append("\n");
    sb.append("    chargingStationId: ").append(toIndentedString(chargingStationId)).append("\n");
    sb.append("    chargingStationName: ").append(toIndentedString(chargingStationName)).append("\n");
    sb.append("    clearinghouseId: ").append(toIndentedString(clearinghouseId)).append("\n");
    sb.append("    dynamicInfoAvailable: ").append(toIndentedString(dynamicInfoAvailable)).append("\n");
    sb.append("    enChargingStationName: ").append(toIndentedString(enChargingStationName)).append("\n");
    sb.append("    evseId: ").append(toIndentedString(evseId)).append("\n");
    sb.append("    geoChargingPointEntrance: ").append(toIndentedString(geoChargingPointEntrance)).append("\n");
    sb.append("    geoCoordinates: ").append(toIndentedString(geoCoordinates)).append("\n");
    sb.append("    hotlinePhoneNumber: ").append(toIndentedString(hotlinePhoneNumber)).append("\n");
    sb.append("    hubOperatorId: ").append(toIndentedString(hubOperatorId)).append("\n");
    sb.append("    publishToHubject: ").append(toIndentedString(publishToHubject)).append("\n");
    sb.append("    publicStation: ").append(toIndentedString(publicStation)).append("\n");
    sb.append("    freeChargingMode: ").append(toIndentedString(freeChargingMode)).append("\n");
    sb.append("    chargeAndPayAvailable: ").append(toIndentedString(chargeAndPayAvailable)).append("\n");
    sb.append("    open24Hours: ").append(toIndentedString(open24Hours)).append("\n");
    sb.append("    maxCapacity: ").append(toIndentedString(maxCapacity)).append("\n");
    sb.append("    deltaType: ").append(toIndentedString(deltaType)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    chargePointVendor: ").append(toIndentedString(chargePointVendor)).append("\n");
    sb.append("    chargePointModel: ").append(toIndentedString(chargePointModel)).append("\n");
    sb.append("    installationDate: ").append(toIndentedString(installationDate)).append("\n");
    sb.append("    hubjectCompatible: ").append(toIndentedString(hubjectCompatible)).append("\n");
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

