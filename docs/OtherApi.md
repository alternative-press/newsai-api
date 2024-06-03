# OtherApi

All URIs are relative to *https://eventregistry.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEventForTextenqueueRequest**](OtherApi.md#getEventForTextenqueueRequest) | **GET** /api/v1/getEventForText | Identify a recent event that best matches your input text and return a list of articles about the event

<a name="getEventForTextenqueueRequest"></a>
# **getEventForTextenqueueRequest**
> String getEventForTextenqueueRequest(apiKey, text, lang, resultType)

Identify a recent event that best matches your input text and return a list of articles about the event

Given a paragraph or a longer text, the API endpoint can provide you the recent event that best matches the text. The return value will contain the URI of the event that is most related to the text and the value will contain the list of articles about the event. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OtherApi;


OtherApi apiInstance = new OtherApi();
String apiKey = "apiKey_example"; // String | Your API key
String text = "text_example"; // String | Text for which to find the most related event
String lang = "lang_example"; // String | The language in which the provided `text` is.
String resultType = "info"; // String | Choose what kind of information about the events should be returned. Default value: info.
try {
    String result = apiInstance.getEventForTextenqueueRequest(apiKey, text, lang, resultType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OtherApi#getEventForTextenqueueRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**| Your API key |
 **text** | **String**| Text for which to find the most related event |
 **lang** | **String**| The language in which the provided &#x60;text&#x60; is. |
 **resultType** | **String**| Choose what kind of information about the events should be returned. Default value: info. | [optional] [default to info] [enum: info, articles]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

