# AutosuggestApi

All URIs are relative to *https://eventregistry.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**suggestCategoriesFast**](AutosuggestApi.md#suggestCategoriesFast) | **GET** /api/v1/suggestCategoriesFast | Retrieve the category URI for a given category label/prefix
[**suggestConceptsFast**](AutosuggestApi.md#suggestConceptsFast) | **GET** /api/v1/suggestConceptsFast | Retrieve the concept URI for a given concept label/prefix
[**suggestLocationsFast**](AutosuggestApi.md#suggestLocationsFast) | **GET** /api/v1/suggestLocationsFast | Retrieve the location URI for a given location name
[**suggestSourcesFast**](AutosuggestApi.md#suggestSourcesFast) | **GET** /api/v1/suggestSourcesFast | Retrieve the source URI for a given source name or url
[**suggestSourcesFast_0**](AutosuggestApi.md#suggestSourcesFast_0) | **GET** /api/v1/suggestAuthorsFast | Retrieve the author URI for a given author name

<a name="suggestCategoriesFast"></a>
# **suggestCategoriesFast**
> List&lt;InlineResponse20011&gt; suggestCategoriesFast(apiKey, prefix)

Retrieve the category URI for a given category label/prefix

Use the API to map the category label into the category URI that can be used when specifying the &#x60;categoryUri&#x60; filter in various API calls. The label can also be a partial name. The returned value will contain an array of candidates that match the input label. The returned list is sorted based on how frequently the category occurs in Event Registry data. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AutosuggestApi;


AutosuggestApi apiInstance = new AutosuggestApi();
String apiKey = "apiKey_example"; // String | Your API key
String prefix = "prefix_example"; // String | Determine the search condition.
try {
    List<InlineResponse20011> result = apiInstance.suggestCategoriesFast(apiKey, prefix);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutosuggestApi#suggestCategoriesFast");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**| Your API key |
 **prefix** | **String**| Determine the search condition. | [optional]

### Return type

[**List&lt;InlineResponse20011&gt;**](InlineResponse20011.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="suggestConceptsFast"></a>
# **suggestConceptsFast**
> List&lt;ConceptTag&gt; suggestConceptsFast(apiKey, prefix)

Retrieve the concept URI for a given concept label/prefix

Use the API to map the concept label into the concept URI that can be used when specifying the &#x60;conceptUri&#x60; filter in various API calls. The label can also be a partial name. The returned value will contain an array of concepts that match the input label. The concepts are sorted based on how frequently they occur in Event Registry data. Most often, the first candidate is the value you want to use. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AutosuggestApi;


AutosuggestApi apiInstance = new AutosuggestApi();
String apiKey = "apiKey_example"; // String | Your API key
String prefix = "prefix_example"; // String | Determine the search condition.
try {
    List<ConceptTag> result = apiInstance.suggestConceptsFast(apiKey, prefix);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutosuggestApi#suggestConceptsFast");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**| Your API key |
 **prefix** | **String**| Determine the search condition. | [optional]

### Return type

[**List&lt;ConceptTag&gt;**](ConceptTag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="suggestLocationsFast"></a>
# **suggestLocationsFast**
> List&lt;InlineResponse20013&gt; suggestLocationsFast(apiKey, prefix)

Retrieve the location URI for a given location name

Use the API to map the location name (city or country) to a location URI that can be used when specifying the &#x60;locationUri&#x60; filter in various API calls. The location name can also be a partial name. The returned value will contain an array of location candidates that match the input label. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AutosuggestApi;


AutosuggestApi apiInstance = new AutosuggestApi();
String apiKey = "apiKey_example"; // String | Your API key
String prefix = "prefix_example"; // String | Determine the search condition.
try {
    List<InlineResponse20013> result = apiInstance.suggestLocationsFast(apiKey, prefix);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutosuggestApi#suggestLocationsFast");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**| Your API key |
 **prefix** | **String**| Determine the search condition. | [optional]

### Return type

[**List&lt;InlineResponse20013&gt;**](InlineResponse20013.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="suggestSourcesFast"></a>
# **suggestSourcesFast**
> List&lt;InlineResponse20012&gt; suggestSourcesFast(apiKey, prefix)

Retrieve the source URI for a given source name or url

Use the API to map the source name or partial domain name to the source URI that can be used when specifying the &#x60;sourceUri&#x60; filter in various API calls. The source name can also be a partial name. The returned value will contain an array of source candidates that match the input label. The returned list is sorted based on the number of articles that we have collected from this source. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AutosuggestApi;


AutosuggestApi apiInstance = new AutosuggestApi();
String apiKey = "apiKey_example"; // String | Your API key
String prefix = "prefix_example"; // String | Determine the search condition.
try {
    List<InlineResponse20012> result = apiInstance.suggestSourcesFast(apiKey, prefix);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutosuggestApi#suggestSourcesFast");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**| Your API key |
 **prefix** | **String**| Determine the search condition. | [optional]

### Return type

[**List&lt;InlineResponse20012&gt;**](InlineResponse20012.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="suggestSourcesFast_0"></a>
# **suggestSourcesFast_0**
> List&lt;InlineResponse20012&gt; suggestSourcesFast_0(apiKey, prefix)

Retrieve the author URI for a given author name

Use the API to map the author name to the author URI that can be used when specifying the &#x60;authorUri&#x60; filter in various API calls. Since it&#x27;s possible that there are multiple authors with the same name you can also specify the source domain name in the query (e.g. &#x27;amy more nytimes.com&#x27;) to make sure that the returned author will come from the news source of interest. The returned value will contain an array of author candidates that match the input name. The returned list is sorted based on the number of articles that we have collected from the author. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AutosuggestApi;


AutosuggestApi apiInstance = new AutosuggestApi();
String apiKey = "apiKey_example"; // String | Your API key
String prefix = "prefix_example"; // String | Determine the search condition.
try {
    List<InlineResponse20012> result = apiInstance.suggestSourcesFast_0(apiKey, prefix);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutosuggestApi#suggestSourcesFast_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**| Your API key |
 **prefix** | **String**| Determine the search condition. | [optional]

### Return type

[**List&lt;InlineResponse20012&gt;**](InlineResponse20012.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

