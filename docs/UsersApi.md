# UsersApi

All URIs are relative to *https://example.ilucca.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewUser**](UsersApi.md#createNewUser) | **POST** /api/v3/users | Create a new User |
| [**getById**](UsersApi.md#getById) | **GET** /api/v3/users/{userId} | Get a User by Id |
| [**listExcludedFormer**](UsersApi.md#listExcludedFormer) | **GET** /api/v3/users | List Users |
| [**updateById**](UsersApi.md#updateById) | **PUT** /api/v3/users/{userId} | Update a User by id |


<a name="createNewUser"></a>
# **createNewUser**
> UsersCreateNewUserResponse createNewUser().execute();

Create a new User



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.LuccaDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://example.ilucca.net";
    
    configuration.authorization  = "YOUR API KEY";
    LuccaDirectory client = new LuccaDirectory(configuration);
    try {
      UsersCreateNewUserResponse result = client
              .users
              .createNewUser()
              .execute();
      System.out.println(result);
      System.out.println(result.getFirstName());
      System.out.println(result.getLastName());
      System.out.println(result.getMail());
      System.out.println(result.getLogin());
      System.out.println(result.getLegalEntityId());
      System.out.println(result.getDtContractStart());
      System.out.println(result.getDtContractEnd());
      System.out.println(result.getCspId());
      System.out.println(result.getCalendarId());
      System.out.println(result.getEmployeeNumber());
      System.out.println(result.getBirthDate());
      System.out.println(result.getUserWorkCycles());
      System.out.println(result.getDepartmentId());
      System.out.println(result.getManagerId());
      System.out.println(result.getRolePrincipalId());
      System.out.println(result.getHabilitedRoles());
      System.out.println(result.getCultureId());
      System.out.println(result.getAddress());
      System.out.println(result.getBankName());
      System.out.println(result.getDirectLine());
      System.out.println(result.getJobTitle());
      System.out.println(result.getGender());
      System.out.println(result.getNationality());
      System.out.println(result.getPersonalEmail());
      System.out.println(result.getPersonalMobile());
      System.out.println(result.getProfessionalMobile());
      System.out.println(result.getQuote());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#createNewUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersCreateNewUserResponse> response = client
              .users
              .createNewUser()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#createNewUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UsersCreateNewUserResponse**](UsersCreateNewUserResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |

<a name="getById"></a>
# **getById**
> UsersGetByIdResponse getById(userId).fields(fields).execute();

Get a User by Id

Retrieve a single User identified by its unique identifier.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.LuccaDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://example.ilucca.net";
    
    configuration.authorization  = "YOUR API KEY";
    LuccaDirectory client = new LuccaDirectory(configuration);
    String userId = "userId_example";
    List<Object> fields = null; // Comma-separated list of fields of the user to include in responses. Extended data can be retrieved with `?fields=extendedData`. 
    try {
      UsersGetByIdResponse result = client
              .users
              .getById(userId)
              .fields(fields)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getUrl());
      System.out.println(result.getDisplayName());
      System.out.println(result.getModifiedOn());
      System.out.println(result.getLastName());
      System.out.println(result.getFirstName());
      System.out.println(result.getLogin());
      System.out.println(result.getMail());
      System.out.println(result.getDtContractStart());
      System.out.println(result.getDtContractEnd());
      System.out.println(result.getBirthDate());
      System.out.println(result.getEmployeeNumber());
      System.out.println(result.getCalendar());
      System.out.println(result.getCulture());
      System.out.println(result.getPicture());
      System.out.println(result.getApplicationData());
      System.out.println(result.getLegalEntity());
      System.out.println(result.getDepartment());
      System.out.println(result.getManager());
      System.out.println(result.getRolePrincipal());
      System.out.println(result.getHabilitedRoles());
      System.out.println(result.getUserWorkCycles());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersGetByIdResponse> response = client
              .users
              .getById(userId)
              .fields(fields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **String**|  | |
| **fields** | [**List&lt;Object&gt;**](Object.md)| Comma-separated list of fields of the user to include in responses. Extended data can be retrieved with &#x60;?fields&#x3D;extendedData&#x60;.  | [optional] |

### Return type

[**UsersGetByIdResponse**](UsersGetByIdResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **500** | User Not Found |  -  |

<a name="listExcludedFormer"></a>
# **listExcludedFormer**
> UsersListExcludedFormerResponse listExcludedFormer().dtContractEnd(dtContractEnd).dtContractStart(dtContractStart).id(id).modifiedAt(modifiedAt).paging(paging).fields(fields).mail(mail).login(login).body(body).execute();

List Users

Retrieve a list of Users.  By default, former employees are excluded from the response. In order to retrieve them, you may add the &#x60;?dtContractEnd&#x3D;notequal,null&#x60; query parameter to your request. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.LuccaDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://example.ilucca.net";
    
    configuration.authorization  = "YOUR API KEY";
    LuccaDirectory client = new LuccaDirectory(configuration);
    String dtContractEnd = "dtContractEnd_example"; // `{comparator},{date-time}`. 
    String dtContractStart = "dtContractStart_example"; // {comparator},{date-time}
    List<Object> id = null; // User's identifier
    String modifiedAt = "modifiedAt_example"; // {comparator},{date-time}
    String paging = "paging_example"; // {offset},{limit}. Defaults to 0,1000.
    List<Object> fields = null;
    String mail = "mail_example"; // User's mail
    String login = "login_example"; // User's login
    try {
      UsersListExcludedFormerResponse result = client
              .users
              .listExcludedFormer()
              .dtContractEnd(dtContractEnd)
              .dtContractStart(dtContractStart)
              .id(id)
              .modifiedAt(modifiedAt)
              .paging(paging)
              .fields(fields)
              .mail(mail)
              .login(login)
              .execute();
      System.out.println(result);
      System.out.println(result.getItems());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#listExcludedFormer");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersListExcludedFormerResponse> response = client
              .users
              .listExcludedFormer()
              .dtContractEnd(dtContractEnd)
              .dtContractStart(dtContractStart)
              .id(id)
              .modifiedAt(modifiedAt)
              .paging(paging)
              .fields(fields)
              .mail(mail)
              .login(login)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#listExcludedFormer");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **dtContractEnd** | **String**| &#x60;{comparator},{date-time}&#x60;.  | [optional] |
| **dtContractStart** | **String**| {comparator},{date-time} | [optional] |
| **id** | [**List&lt;Object&gt;**](Object.md)| User&#39;s identifier | [optional] |
| **modifiedAt** | **String**| {comparator},{date-time} | [optional] |
| **paging** | **String**| {offset},{limit}. Defaults to 0,1000. | [optional] |
| **fields** | [**List&lt;Object&gt;**](Object.md)|  | [optional] |
| **mail** | **String**| User&#39;s mail | [optional] |
| **login** | **String**| User&#39;s login | [optional] |
| **body** | **Object**|  | [optional] |

### Return type

[**UsersListExcludedFormerResponse**](UsersListExcludedFormerResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **500** | User Not Found |  -  |

<a name="updateById"></a>
# **updateById**
> updateById(userId).fields(fields).usersUpdateByIdRequest(usersUpdateByIdRequest).execute();

Update a User by id

Update fields of a single User identified by its unique id.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.LuccaDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://example.ilucca.net";
    
    configuration.authorization  = "YOUR API KEY";
    LuccaDirectory client = new LuccaDirectory(configuration);
    String userId = "userId_example";
    String firstName = "firstName_example";
    String lastName = "lastName_example";
    String mail = "mail_example";
    String login = "login_example";
    Integer legalEntityId = 56;
    Integer cspId = 56;
    ModelNull calendarId = new ModelNull();
    String employeeNumber = "employeeNumber_example";
    String birthDate = "birthDate_example";
    List<UsersUpdateByIdRequestUserWorkCyclesInner> userWorkCycles = Arrays.asList();
    Integer departmentId = 56;
    Integer managerId = 56;
    Integer rolePrincipalId = 56;
    List<UsersUpdateByIdRequestHabilitedRolesInner> habilitedRoles = Arrays.asList();
    Integer cultureId = 56;
    String address = "address_example";
    String bankName = "bankName_example";
    String directLine = "directLine_example";
    String jobTitle = "jobTitle_example";
    String gender = "gender_example";
    String nationality = "nationality_example";
    String personalEmail = "personalEmail_example";
    String personalMobile = "personalMobile_example";
    String professionalMobile = "professionalMobile_example";
    String quote = "quote_example";
    List<Object> fields = null; // Fields of the user, comma separated
    try {
      client
              .users
              .updateById(userId)
              .firstName(firstName)
              .lastName(lastName)
              .mail(mail)
              .login(login)
              .legalEntityId(legalEntityId)
              .cspId(cspId)
              .calendarId(calendarId)
              .employeeNumber(employeeNumber)
              .birthDate(birthDate)
              .userWorkCycles(userWorkCycles)
              .departmentId(departmentId)
              .managerId(managerId)
              .rolePrincipalId(rolePrincipalId)
              .habilitedRoles(habilitedRoles)
              .cultureId(cultureId)
              .address(address)
              .bankName(bankName)
              .directLine(directLine)
              .jobTitle(jobTitle)
              .gender(gender)
              .nationality(nationality)
              .personalEmail(personalEmail)
              .personalMobile(personalMobile)
              .professionalMobile(professionalMobile)
              .quote(quote)
              .fields(fields)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#updateById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .users
              .updateById(userId)
              .firstName(firstName)
              .lastName(lastName)
              .mail(mail)
              .login(login)
              .legalEntityId(legalEntityId)
              .cspId(cspId)
              .calendarId(calendarId)
              .employeeNumber(employeeNumber)
              .birthDate(birthDate)
              .userWorkCycles(userWorkCycles)
              .departmentId(departmentId)
              .managerId(managerId)
              .rolePrincipalId(rolePrincipalId)
              .habilitedRoles(habilitedRoles)
              .cultureId(cultureId)
              .address(address)
              .bankName(bankName)
              .directLine(directLine)
              .jobTitle(jobTitle)
              .gender(gender)
              .nationality(nationality)
              .personalEmail(personalEmail)
              .personalMobile(personalMobile)
              .professionalMobile(professionalMobile)
              .quote(quote)
              .fields(fields)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#updateById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **String**|  | |
| **fields** | [**List&lt;Object&gt;**](Object.md)| Fields of the user, comma separated | [optional] |
| **usersUpdateByIdRequest** | [**UsersUpdateByIdRequest**](UsersUpdateByIdRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

