/*
 * Directory-v3
 * Welcome on the documentation for the Directory v3 API. 
 *
 * The version of the OpenAPI document: 1.0
 * Contact: developers@lucca.fr
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.ModelNull;
import com.konfigthis.client.model.UsersListExcludedFormerResponseItemsInnerCalendar;
import com.konfigthis.client.model.UsersListExcludedFormerResponseItemsInnerCulture;
import com.konfigthis.client.model.UsersListExcludedFormerResponseItemsInnerPicture;
import com.konfigthis.client.model.UsersListExcludedFormerResponseItemsInnerUserWorkCyclesInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * UsersListExcludedFormerResponseItemsInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class UsersListExcludedFormerResponseItemsInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_MODIFIED_ON = "modifiedOn";
  @SerializedName(SERIALIZED_NAME_MODIFIED_ON)
  private String modifiedOn;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LOGIN = "login";
  @SerializedName(SERIALIZED_NAME_LOGIN)
  private String login;

  public static final String SERIALIZED_NAME_MAIL = "mail";
  @SerializedName(SERIALIZED_NAME_MAIL)
  private String mail;

  public static final String SERIALIZED_NAME_DT_CONTRACT_START = "dtContractStart";
  @SerializedName(SERIALIZED_NAME_DT_CONTRACT_START)
  private String dtContractStart;

  public static final String SERIALIZED_NAME_DT_CONTRACT_END = "dtContractEnd";
  @SerializedName(SERIALIZED_NAME_DT_CONTRACT_END)
  private ModelNull dtContractEnd = null;

  public static final String SERIALIZED_NAME_BIRTH_DATE = "birthDate";
  @SerializedName(SERIALIZED_NAME_BIRTH_DATE)
  private String birthDate;

  public static final String SERIALIZED_NAME_EMPLOYEE_NUMBER = "employeeNumber";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_NUMBER)
  private String employeeNumber;

  public static final String SERIALIZED_NAME_CALENDAR = "calendar";
  @SerializedName(SERIALIZED_NAME_CALENDAR)
  private UsersListExcludedFormerResponseItemsInnerCalendar calendar;

  public static final String SERIALIZED_NAME_CULTURE = "culture";
  @SerializedName(SERIALIZED_NAME_CULTURE)
  private UsersListExcludedFormerResponseItemsInnerCulture culture;

  public static final String SERIALIZED_NAME_PICTURE = "picture";
  @SerializedName(SERIALIZED_NAME_PICTURE)
  private UsersListExcludedFormerResponseItemsInnerPicture picture;

  public static final String SERIALIZED_NAME_APPLICATION_DATA = "applicationData";
  @SerializedName(SERIALIZED_NAME_APPLICATION_DATA)
  private Object applicationData;

  public static final String SERIALIZED_NAME_LEGAL_ENTITY = "legalEntity";
  @SerializedName(SERIALIZED_NAME_LEGAL_ENTITY)
  private UsersListExcludedFormerResponseItemsInnerCulture legalEntity;

  public static final String SERIALIZED_NAME_DEPARTMENT = "department";
  @SerializedName(SERIALIZED_NAME_DEPARTMENT)
  private UsersListExcludedFormerResponseItemsInnerCulture department;

  public static final String SERIALIZED_NAME_MANAGER = "manager";
  @SerializedName(SERIALIZED_NAME_MANAGER)
  private UsersListExcludedFormerResponseItemsInnerCulture manager;

  public static final String SERIALIZED_NAME_ROLE_PRINCIPAL = "rolePrincipal";
  @SerializedName(SERIALIZED_NAME_ROLE_PRINCIPAL)
  private UsersListExcludedFormerResponseItemsInnerCulture rolePrincipal;

  public static final String SERIALIZED_NAME_HABILITED_ROLES = "habilitedRoles";
  @SerializedName(SERIALIZED_NAME_HABILITED_ROLES)
  private List<UsersListExcludedFormerResponseItemsInnerCulture> habilitedRoles = null;

  public static final String SERIALIZED_NAME_USER_WORK_CYCLES = "userWorkCycles";
  @SerializedName(SERIALIZED_NAME_USER_WORK_CYCLES)
  private List<UsersListExcludedFormerResponseItemsInnerUserWorkCyclesInner> userWorkCycles = null;

  public UsersListExcludedFormerResponseItemsInner() {
  }

  public UsersListExcludedFormerResponseItemsInner id(Integer id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    
    
    
    this.id = id;
  }


  public UsersListExcludedFormerResponseItemsInner name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public UsersListExcludedFormerResponseItemsInner url(String url) {
    
    
    
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    
    
    
    this.url = url;
  }


  public UsersListExcludedFormerResponseItemsInner displayName(String displayName) {
    
    
    
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    
    
    
    this.displayName = displayName;
  }


  public UsersListExcludedFormerResponseItemsInner modifiedOn(String modifiedOn) {
    
    
    
    
    this.modifiedOn = modifiedOn;
    return this;
  }

   /**
   * Get modifiedOn
   * @return modifiedOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModifiedOn() {
    return modifiedOn;
  }


  public void setModifiedOn(String modifiedOn) {
    
    
    
    this.modifiedOn = modifiedOn;
  }


  public UsersListExcludedFormerResponseItemsInner lastName(String lastName) {
    
    
    
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    
    
    
    this.lastName = lastName;
  }


  public UsersListExcludedFormerResponseItemsInner firstName(String firstName) {
    
    
    
    
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    
    
    
    this.firstName = firstName;
  }


  public UsersListExcludedFormerResponseItemsInner login(String login) {
    
    
    
    
    this.login = login;
    return this;
  }

   /**
   * Get login
   * @return login
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLogin() {
    return login;
  }


  public void setLogin(String login) {
    
    
    
    this.login = login;
  }


  public UsersListExcludedFormerResponseItemsInner mail(String mail) {
    
    
    
    
    this.mail = mail;
    return this;
  }

   /**
   * Get mail
   * @return mail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMail() {
    return mail;
  }


  public void setMail(String mail) {
    
    
    
    this.mail = mail;
  }


  public UsersListExcludedFormerResponseItemsInner dtContractStart(String dtContractStart) {
    
    
    
    
    this.dtContractStart = dtContractStart;
    return this;
  }

   /**
   * Get dtContractStart
   * @return dtContractStart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDtContractStart() {
    return dtContractStart;
  }


  public void setDtContractStart(String dtContractStart) {
    
    
    
    this.dtContractStart = dtContractStart;
  }


  public UsersListExcludedFormerResponseItemsInner dtContractEnd(ModelNull dtContractEnd) {
    
    
    
    
    this.dtContractEnd = dtContractEnd;
    return this;
  }

   /**
   * Get dtContractEnd
   * @return dtContractEnd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ModelNull getDtContractEnd() {
    return dtContractEnd;
  }


  public void setDtContractEnd(ModelNull dtContractEnd) {
    
    
    
    this.dtContractEnd = dtContractEnd;
  }


  public UsersListExcludedFormerResponseItemsInner birthDate(String birthDate) {
    
    
    
    
    this.birthDate = birthDate;
    return this;
  }

   /**
   * Get birthDate
   * @return birthDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBirthDate() {
    return birthDate;
  }


  public void setBirthDate(String birthDate) {
    
    
    
    this.birthDate = birthDate;
  }


  public UsersListExcludedFormerResponseItemsInner employeeNumber(String employeeNumber) {
    
    
    
    
    this.employeeNumber = employeeNumber;
    return this;
  }

   /**
   * Get employeeNumber
   * @return employeeNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmployeeNumber() {
    return employeeNumber;
  }


  public void setEmployeeNumber(String employeeNumber) {
    
    
    
    this.employeeNumber = employeeNumber;
  }


  public UsersListExcludedFormerResponseItemsInner calendar(UsersListExcludedFormerResponseItemsInnerCalendar calendar) {
    
    
    
    
    this.calendar = calendar;
    return this;
  }

   /**
   * Get calendar
   * @return calendar
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UsersListExcludedFormerResponseItemsInnerCalendar getCalendar() {
    return calendar;
  }


  public void setCalendar(UsersListExcludedFormerResponseItemsInnerCalendar calendar) {
    
    
    
    this.calendar = calendar;
  }


  public UsersListExcludedFormerResponseItemsInner culture(UsersListExcludedFormerResponseItemsInnerCulture culture) {
    
    
    
    
    this.culture = culture;
    return this;
  }

   /**
   * Get culture
   * @return culture
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UsersListExcludedFormerResponseItemsInnerCulture getCulture() {
    return culture;
  }


  public void setCulture(UsersListExcludedFormerResponseItemsInnerCulture culture) {
    
    
    
    this.culture = culture;
  }


  public UsersListExcludedFormerResponseItemsInner picture(UsersListExcludedFormerResponseItemsInnerPicture picture) {
    
    
    
    
    this.picture = picture;
    return this;
  }

   /**
   * Get picture
   * @return picture
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UsersListExcludedFormerResponseItemsInnerPicture getPicture() {
    return picture;
  }


  public void setPicture(UsersListExcludedFormerResponseItemsInnerPicture picture) {
    
    
    
    this.picture = picture;
  }


  public UsersListExcludedFormerResponseItemsInner applicationData(Object applicationData) {
    
    
    
    
    this.applicationData = applicationData;
    return this;
  }

   /**
   * Get applicationData
   * @return applicationData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getApplicationData() {
    return applicationData;
  }


  public void setApplicationData(Object applicationData) {
    
    
    
    this.applicationData = applicationData;
  }


  public UsersListExcludedFormerResponseItemsInner legalEntity(UsersListExcludedFormerResponseItemsInnerCulture legalEntity) {
    
    
    
    
    this.legalEntity = legalEntity;
    return this;
  }

   /**
   * Get legalEntity
   * @return legalEntity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UsersListExcludedFormerResponseItemsInnerCulture getLegalEntity() {
    return legalEntity;
  }


  public void setLegalEntity(UsersListExcludedFormerResponseItemsInnerCulture legalEntity) {
    
    
    
    this.legalEntity = legalEntity;
  }


  public UsersListExcludedFormerResponseItemsInner department(UsersListExcludedFormerResponseItemsInnerCulture department) {
    
    
    
    
    this.department = department;
    return this;
  }

   /**
   * Get department
   * @return department
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UsersListExcludedFormerResponseItemsInnerCulture getDepartment() {
    return department;
  }


  public void setDepartment(UsersListExcludedFormerResponseItemsInnerCulture department) {
    
    
    
    this.department = department;
  }


  public UsersListExcludedFormerResponseItemsInner manager(UsersListExcludedFormerResponseItemsInnerCulture manager) {
    
    
    
    
    this.manager = manager;
    return this;
  }

   /**
   * Get manager
   * @return manager
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UsersListExcludedFormerResponseItemsInnerCulture getManager() {
    return manager;
  }


  public void setManager(UsersListExcludedFormerResponseItemsInnerCulture manager) {
    
    
    
    this.manager = manager;
  }


  public UsersListExcludedFormerResponseItemsInner rolePrincipal(UsersListExcludedFormerResponseItemsInnerCulture rolePrincipal) {
    
    
    
    
    this.rolePrincipal = rolePrincipal;
    return this;
  }

   /**
   * Get rolePrincipal
   * @return rolePrincipal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UsersListExcludedFormerResponseItemsInnerCulture getRolePrincipal() {
    return rolePrincipal;
  }


  public void setRolePrincipal(UsersListExcludedFormerResponseItemsInnerCulture rolePrincipal) {
    
    
    
    this.rolePrincipal = rolePrincipal;
  }


  public UsersListExcludedFormerResponseItemsInner habilitedRoles(List<UsersListExcludedFormerResponseItemsInnerCulture> habilitedRoles) {
    
    
    
    
    this.habilitedRoles = habilitedRoles;
    return this;
  }

  public UsersListExcludedFormerResponseItemsInner addHabilitedRolesItem(UsersListExcludedFormerResponseItemsInnerCulture habilitedRolesItem) {
    if (this.habilitedRoles == null) {
      this.habilitedRoles = new ArrayList<>();
    }
    this.habilitedRoles.add(habilitedRolesItem);
    return this;
  }

   /**
   * Get habilitedRoles
   * @return habilitedRoles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UsersListExcludedFormerResponseItemsInnerCulture> getHabilitedRoles() {
    return habilitedRoles;
  }


  public void setHabilitedRoles(List<UsersListExcludedFormerResponseItemsInnerCulture> habilitedRoles) {
    
    
    
    this.habilitedRoles = habilitedRoles;
  }


  public UsersListExcludedFormerResponseItemsInner userWorkCycles(List<UsersListExcludedFormerResponseItemsInnerUserWorkCyclesInner> userWorkCycles) {
    
    
    
    
    this.userWorkCycles = userWorkCycles;
    return this;
  }

  public UsersListExcludedFormerResponseItemsInner addUserWorkCyclesItem(UsersListExcludedFormerResponseItemsInnerUserWorkCyclesInner userWorkCyclesItem) {
    if (this.userWorkCycles == null) {
      this.userWorkCycles = new ArrayList<>();
    }
    this.userWorkCycles.add(userWorkCyclesItem);
    return this;
  }

   /**
   * Get userWorkCycles
   * @return userWorkCycles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UsersListExcludedFormerResponseItemsInnerUserWorkCyclesInner> getUserWorkCycles() {
    return userWorkCycles;
  }


  public void setUserWorkCycles(List<UsersListExcludedFormerResponseItemsInnerUserWorkCyclesInner> userWorkCycles) {
    
    
    
    this.userWorkCycles = userWorkCycles;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the UsersListExcludedFormerResponseItemsInner instance itself
   */
  public UsersListExcludedFormerResponseItemsInner putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsersListExcludedFormerResponseItemsInner usersListExcludedFormerResponseItemsInner = (UsersListExcludedFormerResponseItemsInner) o;
    return Objects.equals(this.id, usersListExcludedFormerResponseItemsInner.id) &&
        Objects.equals(this.name, usersListExcludedFormerResponseItemsInner.name) &&
        Objects.equals(this.url, usersListExcludedFormerResponseItemsInner.url) &&
        Objects.equals(this.displayName, usersListExcludedFormerResponseItemsInner.displayName) &&
        Objects.equals(this.modifiedOn, usersListExcludedFormerResponseItemsInner.modifiedOn) &&
        Objects.equals(this.lastName, usersListExcludedFormerResponseItemsInner.lastName) &&
        Objects.equals(this.firstName, usersListExcludedFormerResponseItemsInner.firstName) &&
        Objects.equals(this.login, usersListExcludedFormerResponseItemsInner.login) &&
        Objects.equals(this.mail, usersListExcludedFormerResponseItemsInner.mail) &&
        Objects.equals(this.dtContractStart, usersListExcludedFormerResponseItemsInner.dtContractStart) &&
        Objects.equals(this.dtContractEnd, usersListExcludedFormerResponseItemsInner.dtContractEnd) &&
        Objects.equals(this.birthDate, usersListExcludedFormerResponseItemsInner.birthDate) &&
        Objects.equals(this.employeeNumber, usersListExcludedFormerResponseItemsInner.employeeNumber) &&
        Objects.equals(this.calendar, usersListExcludedFormerResponseItemsInner.calendar) &&
        Objects.equals(this.culture, usersListExcludedFormerResponseItemsInner.culture) &&
        Objects.equals(this.picture, usersListExcludedFormerResponseItemsInner.picture) &&
        Objects.equals(this.applicationData, usersListExcludedFormerResponseItemsInner.applicationData) &&
        Objects.equals(this.legalEntity, usersListExcludedFormerResponseItemsInner.legalEntity) &&
        Objects.equals(this.department, usersListExcludedFormerResponseItemsInner.department) &&
        Objects.equals(this.manager, usersListExcludedFormerResponseItemsInner.manager) &&
        Objects.equals(this.rolePrincipal, usersListExcludedFormerResponseItemsInner.rolePrincipal) &&
        Objects.equals(this.habilitedRoles, usersListExcludedFormerResponseItemsInner.habilitedRoles) &&
        Objects.equals(this.userWorkCycles, usersListExcludedFormerResponseItemsInner.userWorkCycles)&&
        Objects.equals(this.additionalProperties, usersListExcludedFormerResponseItemsInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, url, displayName, modifiedOn, lastName, firstName, login, mail, dtContractStart, dtContractEnd, birthDate, employeeNumber, calendar, culture, picture, applicationData, legalEntity, department, manager, rolePrincipal, habilitedRoles, userWorkCycles, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersListExcludedFormerResponseItemsInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    mail: ").append(toIndentedString(mail)).append("\n");
    sb.append("    dtContractStart: ").append(toIndentedString(dtContractStart)).append("\n");
    sb.append("    dtContractEnd: ").append(toIndentedString(dtContractEnd)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    employeeNumber: ").append(toIndentedString(employeeNumber)).append("\n");
    sb.append("    calendar: ").append(toIndentedString(calendar)).append("\n");
    sb.append("    culture: ").append(toIndentedString(culture)).append("\n");
    sb.append("    picture: ").append(toIndentedString(picture)).append("\n");
    sb.append("    applicationData: ").append(toIndentedString(applicationData)).append("\n");
    sb.append("    legalEntity: ").append(toIndentedString(legalEntity)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
    sb.append("    rolePrincipal: ").append(toIndentedString(rolePrincipal)).append("\n");
    sb.append("    habilitedRoles: ").append(toIndentedString(habilitedRoles)).append("\n");
    sb.append("    userWorkCycles: ").append(toIndentedString(userWorkCycles)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("url");
    openapiFields.add("displayName");
    openapiFields.add("modifiedOn");
    openapiFields.add("lastName");
    openapiFields.add("firstName");
    openapiFields.add("login");
    openapiFields.add("mail");
    openapiFields.add("dtContractStart");
    openapiFields.add("dtContractEnd");
    openapiFields.add("birthDate");
    openapiFields.add("employeeNumber");
    openapiFields.add("calendar");
    openapiFields.add("culture");
    openapiFields.add("picture");
    openapiFields.add("applicationData");
    openapiFields.add("legalEntity");
    openapiFields.add("department");
    openapiFields.add("manager");
    openapiFields.add("rolePrincipal");
    openapiFields.add("habilitedRoles");
    openapiFields.add("userWorkCycles");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UsersListExcludedFormerResponseItemsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UsersListExcludedFormerResponseItemsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UsersListExcludedFormerResponseItemsInner is not found in the empty JSON string", UsersListExcludedFormerResponseItemsInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if ((jsonObj.get("displayName") != null && !jsonObj.get("displayName").isJsonNull()) && !jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if ((jsonObj.get("modifiedOn") != null && !jsonObj.get("modifiedOn").isJsonNull()) && !jsonObj.get("modifiedOn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modifiedOn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modifiedOn").toString()));
      }
      if ((jsonObj.get("lastName") != null && !jsonObj.get("lastName").isJsonNull()) && !jsonObj.get("lastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastName").toString()));
      }
      if ((jsonObj.get("firstName") != null && !jsonObj.get("firstName").isJsonNull()) && !jsonObj.get("firstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstName").toString()));
      }
      if ((jsonObj.get("login") != null && !jsonObj.get("login").isJsonNull()) && !jsonObj.get("login").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `login` to be a primitive type in the JSON string but got `%s`", jsonObj.get("login").toString()));
      }
      if ((jsonObj.get("mail") != null && !jsonObj.get("mail").isJsonNull()) && !jsonObj.get("mail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mail").toString()));
      }
      if ((jsonObj.get("dtContractStart") != null && !jsonObj.get("dtContractStart").isJsonNull()) && !jsonObj.get("dtContractStart").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dtContractStart` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dtContractStart").toString()));
      }
      if ((jsonObj.get("birthDate") != null && !jsonObj.get("birthDate").isJsonNull()) && !jsonObj.get("birthDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `birthDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("birthDate").toString()));
      }
      if ((jsonObj.get("employeeNumber") != null && !jsonObj.get("employeeNumber").isJsonNull()) && !jsonObj.get("employeeNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employeeNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employeeNumber").toString()));
      }
      // validate the optional field `calendar`
      if (jsonObj.get("calendar") != null && !jsonObj.get("calendar").isJsonNull()) {
        UsersListExcludedFormerResponseItemsInnerCalendar.validateJsonObject(jsonObj.getAsJsonObject("calendar"));
      }
      // validate the optional field `culture`
      if (jsonObj.get("culture") != null && !jsonObj.get("culture").isJsonNull()) {
        UsersListExcludedFormerResponseItemsInnerCulture.validateJsonObject(jsonObj.getAsJsonObject("culture"));
      }
      // validate the optional field `picture`
      if (jsonObj.get("picture") != null && !jsonObj.get("picture").isJsonNull()) {
        UsersListExcludedFormerResponseItemsInnerPicture.validateJsonObject(jsonObj.getAsJsonObject("picture"));
      }
      // validate the optional field `legalEntity`
      if (jsonObj.get("legalEntity") != null && !jsonObj.get("legalEntity").isJsonNull()) {
        UsersListExcludedFormerResponseItemsInnerCulture.validateJsonObject(jsonObj.getAsJsonObject("legalEntity"));
      }
      // validate the optional field `department`
      if (jsonObj.get("department") != null && !jsonObj.get("department").isJsonNull()) {
        UsersListExcludedFormerResponseItemsInnerCulture.validateJsonObject(jsonObj.getAsJsonObject("department"));
      }
      // validate the optional field `manager`
      if (jsonObj.get("manager") != null && !jsonObj.get("manager").isJsonNull()) {
        UsersListExcludedFormerResponseItemsInnerCulture.validateJsonObject(jsonObj.getAsJsonObject("manager"));
      }
      // validate the optional field `rolePrincipal`
      if (jsonObj.get("rolePrincipal") != null && !jsonObj.get("rolePrincipal").isJsonNull()) {
        UsersListExcludedFormerResponseItemsInnerCulture.validateJsonObject(jsonObj.getAsJsonObject("rolePrincipal"));
      }
      if (jsonObj.get("habilitedRoles") != null && !jsonObj.get("habilitedRoles").isJsonNull()) {
        JsonArray jsonArrayhabilitedRoles = jsonObj.getAsJsonArray("habilitedRoles");
        if (jsonArrayhabilitedRoles != null) {
          // ensure the json data is an array
          if (!jsonObj.get("habilitedRoles").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `habilitedRoles` to be an array in the JSON string but got `%s`", jsonObj.get("habilitedRoles").toString()));
          }

          // validate the optional field `habilitedRoles` (array)
          for (int i = 0; i < jsonArrayhabilitedRoles.size(); i++) {
            UsersListExcludedFormerResponseItemsInnerCulture.validateJsonObject(jsonArrayhabilitedRoles.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("userWorkCycles") != null && !jsonObj.get("userWorkCycles").isJsonNull()) {
        JsonArray jsonArrayuserWorkCycles = jsonObj.getAsJsonArray("userWorkCycles");
        if (jsonArrayuserWorkCycles != null) {
          // ensure the json data is an array
          if (!jsonObj.get("userWorkCycles").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `userWorkCycles` to be an array in the JSON string but got `%s`", jsonObj.get("userWorkCycles").toString()));
          }

          // validate the optional field `userWorkCycles` (array)
          for (int i = 0; i < jsonArrayuserWorkCycles.size(); i++) {
            UsersListExcludedFormerResponseItemsInnerUserWorkCyclesInner.validateJsonObject(jsonArrayuserWorkCycles.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UsersListExcludedFormerResponseItemsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UsersListExcludedFormerResponseItemsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UsersListExcludedFormerResponseItemsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UsersListExcludedFormerResponseItemsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<UsersListExcludedFormerResponseItemsInner>() {
           @Override
           public void write(JsonWriter out, UsersListExcludedFormerResponseItemsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public UsersListExcludedFormerResponseItemsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             UsersListExcludedFormerResponseItemsInner instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UsersListExcludedFormerResponseItemsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UsersListExcludedFormerResponseItemsInner
  * @throws IOException if the JSON string is invalid with respect to UsersListExcludedFormerResponseItemsInner
  */
  public static UsersListExcludedFormerResponseItemsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UsersListExcludedFormerResponseItemsInner.class);
  }

 /**
  * Convert an instance of UsersListExcludedFormerResponseItemsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

