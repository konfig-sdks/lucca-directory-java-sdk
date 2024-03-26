<div align="left">

[![Visit Lucca](./header.png)](https://lucca-hr.com)

# [Lucca](https://lucca-hr.com)

Welcome on the documentation for the Directory v3 API.


</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Lucca&serviceName=Directory&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>lucca-directory-java-sdk</artifactId>
  <version>1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:lucca-directory-java-sdk:1.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/lucca-directory-java-sdk-1.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://example.ilucca.net*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*UsersApi* | [**createNewUser**](docs/UsersApi.md#createNewUser) | **POST** /api/v3/users | Create a new User
*UsersApi* | [**getById**](docs/UsersApi.md#getById) | **GET** /api/v3/users/{userId} | Get a User by Id
*UsersApi* | [**listExcludedFormer**](docs/UsersApi.md#listExcludedFormer) | **GET** /api/v3/users | List Users
*UsersApi* | [**updateById**](docs/UsersApi.md#updateById) | **PUT** /api/v3/users/{userId} | Update a User by id


## Documentation for Models

 - [User](docs/User.md)
 - [UserApplicationData](docs/UserApplicationData.md)
 - [UserApplicationDataProfileFiggo](docs/UserApplicationDataProfileFiggo.md)
 - [UserApplicationDataProfileUtime](docs/UserApplicationDataProfileUtime.md)
 - [UserCalendar](docs/UserCalendar.md)
 - [UserCulture](docs/UserCulture.md)
 - [UserDepartment](docs/UserDepartment.md)
 - [UserHabilitedRolesInner](docs/UserHabilitedRolesInner.md)
 - [UserLegalEntity](docs/UserLegalEntity.md)
 - [UserManager](docs/UserManager.md)
 - [UserPicture](docs/UserPicture.md)
 - [UserRolePrincipal](docs/UserRolePrincipal.md)
 - [UserUserWorkCyclesInner](docs/UserUserWorkCyclesInner.md)
 - [UsersCreateNewUserResponse](docs/UsersCreateNewUserResponse.md)
 - [UsersGetByIdResponse](docs/UsersGetByIdResponse.md)
 - [UsersGetByIdResponseCalendar](docs/UsersGetByIdResponseCalendar.md)
 - [UsersGetByIdResponseCulture](docs/UsersGetByIdResponseCulture.md)
 - [UsersGetByIdResponseDepartment](docs/UsersGetByIdResponseDepartment.md)
 - [UsersGetByIdResponseLegalEntity](docs/UsersGetByIdResponseLegalEntity.md)
 - [UsersGetByIdResponseManager](docs/UsersGetByIdResponseManager.md)
 - [UsersGetByIdResponsePicture](docs/UsersGetByIdResponsePicture.md)
 - [UsersGetByIdResponseRolePrincipal](docs/UsersGetByIdResponseRolePrincipal.md)
 - [UsersListExcludedFormerResponse](docs/UsersListExcludedFormerResponse.md)
 - [UsersListExcludedFormerResponseItemsInner](docs/UsersListExcludedFormerResponseItemsInner.md)
 - [UsersListExcludedFormerResponseItemsInnerCalendar](docs/UsersListExcludedFormerResponseItemsInnerCalendar.md)
 - [UsersListExcludedFormerResponseItemsInnerCulture](docs/UsersListExcludedFormerResponseItemsInnerCulture.md)
 - [UsersListExcludedFormerResponseItemsInnerPicture](docs/UsersListExcludedFormerResponseItemsInnerPicture.md)
 - [UsersListExcludedFormerResponseItemsInnerUserWorkCyclesInner](docs/UsersListExcludedFormerResponseItemsInnerUserWorkCyclesInner.md)
 - [UsersUpdateByIdRequest](docs/UsersUpdateByIdRequest.md)
 - [UsersUpdateByIdRequestHabilitedRolesInner](docs/UsersUpdateByIdRequestHabilitedRolesInner.md)
 - [UsersUpdateByIdRequestUserWorkCyclesInner](docs/UsersUpdateByIdRequestUserWorkCyclesInner.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
