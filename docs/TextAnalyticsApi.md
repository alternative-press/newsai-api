# TextAnalyticsApi

All URIs are relative to *https://eventregistry.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**annotate**](TextAnalyticsApi.md#annotate) | **GET** /annotate | identify people, locations, organizations and things mentioned in the document
[**categorize**](TextAnalyticsApi.md#categorize) | **GET** /categorize | Categorize the content into a set of predefined categories
[**detectLanguage**](TextAnalyticsApi.md#detectLanguage) | **GET** /detectLanguage | Detect the language of the input text
[**extractArticleInfo**](TextAnalyticsApi.md#extractArticleInfo) | **GET** /extractArticleInfo | Extract article information (title, body, authors, ...) from article URL
[**semanticSimilarity**](TextAnalyticsApi.md#semanticSimilarity) | **GET** /semanticSimilarity | Compute semantic similarity of two documents, potentially in different languages
[**sentiment**](TextAnalyticsApi.md#sentiment) | **GET** /sentiment | Vocabulary based sentiment detection
[**sentiment_0**](TextAnalyticsApi.md#sentiment_0) | **GET** /sentimentRNN | Neural networks based approach to sentiment detection
[**trainTopicOnTwitter**](TextAnalyticsApi.md#trainTopicOnTwitter) | **GET** /trainTopicOnTwitter | Train a topic (concepts and categories) based on tweets matching your search filter
[**trainTopicOnTwitter_0**](TextAnalyticsApi.md#trainTopicOnTwitter_0) | **GET** /trainTopic | Train a topic (concepts and categories) using your own documents

<a name="annotate"></a>
# **annotate**
> Annotation annotate(apiKey, text, minLinkFrequency, minLinkRelFrequency, nWordsToIgnoreFromList, minPMentionGivenPhrase, pageRankSqThreshold, applyPageRankSqThreshold)

identify people, locations, organizations and things mentioned in the document

The endpoint is able to semantically annotate the provided document. The semantic annotation includes identification of people, locations, organizations and things mentioned in the document. The annotations all have a unique URI that is a url to the Wikipedia page for the concept. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TextAnalyticsApi;


TextAnalyticsApi apiInstance = new TextAnalyticsApi();
String apiKey = "apiKey_example"; // String | Your API key
String text = "text_example"; // String | Define a text that you'll like to see annotated.
Integer minLinkFrequency = 3; // Integer | The minimum number of times the phrase should appear in the link in order for use to use it as a candidate for the <a href=\"#\">annotation</a>.
Double minLinkRelFrequency = 3.4D; // Double | Consider the candidate only if the given text points to the candidate with probability above this value. Value between 0 and 1.
Integer nWordsToIgnoreFromList = 200; // Integer | Use this setting to ignore common phrases. If a phrase consists entirely of very frequent words, it will be ignore. A word is considered frequent if it is one of the most frequent words (in terms of document frequency) in the Wikipedia of the corresponding language. If 0 it will disable this heuristic.
Double minPMentionGivenPhrase = 3.4D; // Double | 'Probability that the given phrase, if found on Wikipedia, is annotated with the concept. If non-zero, it can help to remove the common words.'
Double pageRankSqThreshold = 3.4D; // Double | 'Probability that the given phrase, if found on Wikipedia, is annotated with the concept. If non-zero, it can help to remove the common words.'
Boolean applyPageRankSqThreshold = true; // Boolean | 'Apply pageRankSqThreshold to the requested response.'
try {
    Annotation result = apiInstance.annotate(apiKey, text, minLinkFrequency, minLinkRelFrequency, nWordsToIgnoreFromList, minPMentionGivenPhrase, pageRankSqThreshold, applyPageRankSqThreshold);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TextAnalyticsApi#annotate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**| Your API key |
 **text** | **String**| Define a text that you&#x27;ll like to see annotated. |
 **minLinkFrequency** | **Integer**| The minimum number of times the phrase should appear in the link in order for use to use it as a candidate for the &lt;a href&#x3D;\&quot;#\&quot;&gt;annotation&lt;/a&gt;. | [optional] [default to 3]
 **minLinkRelFrequency** | **Double**| Consider the candidate only if the given text points to the candidate with probability above this value. Value between 0 and 1. | [optional] [default to 0.01]
 **nWordsToIgnoreFromList** | **Integer**| Use this setting to ignore common phrases. If a phrase consists entirely of very frequent words, it will be ignore. A word is considered frequent if it is one of the most frequent words (in terms of document frequency) in the Wikipedia of the corresponding language. If 0 it will disable this heuristic. | [optional] [default to 200]
 **minPMentionGivenPhrase** | **Double**| &#x27;Probability that the given phrase, if found on Wikipedia, is annotated with the concept. If non-zero, it can help to remove the common words.&#x27; | [optional] [default to 0.03]
 **pageRankSqThreshold** | **Double**| &#x27;Probability that the given phrase, if found on Wikipedia, is annotated with the concept. If non-zero, it can help to remove the common words.&#x27; | [optional] [default to 0.95]
 **applyPageRankSqThreshold** | **Boolean**| &#x27;Apply pageRankSqThreshold to the requested response.&#x27; | [optional]

### Return type

[**Annotation**](Annotation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="categorize"></a>
# **categorize**
> Categorization categorize(apiKey, text, taxonomy)

Categorize the content into a set of predefined categories

The categorization of your content into a predefined set of categories. The &#x60;dmoz&#x60; taxonomy contains over 5000 categories and can only be used for documents in English languge. The &#x60;news&#x60; taxonomy contains only 8 top level categories commonly used to categorize the news content, but can be applied for any language. The categorization into both taxonomies can work well only on documents of decent size (like news articles). 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TextAnalyticsApi;


TextAnalyticsApi apiInstance = new TextAnalyticsApi();
String apiKey = "apiKey_example"; // String | Your API key
String text = "text_example"; // String | Define a text that you'll like to see categorized.
String taxonomy = "taxonomy_example"; // String | Define the taxonomy in which you'll want to categorize the selected text
try {
    Categorization result = apiInstance.categorize(apiKey, text, taxonomy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TextAnalyticsApi#categorize");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**| Your API key |
 **text** | **String**| Define a text that you&#x27;ll like to see categorized. |
 **taxonomy** | **String**| Define the taxonomy in which you&#x27;ll want to categorize the selected text | [enum: dmoz, news]

### Return type

[**Categorization**](Categorization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="detectLanguage"></a>
# **detectLanguage**
> DetectLanguage detectLanguage(apiKey, text)

Detect the language of the input text

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TextAnalyticsApi;


TextAnalyticsApi apiInstance = new TextAnalyticsApi();
String apiKey = "apiKey_example"; // String | Your API key
String text = "text_example"; // String | Define a text that'll be used to detect the language in which it's written.
try {
    DetectLanguage result = apiInstance.detectLanguage(apiKey, text);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TextAnalyticsApi#detectLanguage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**| Your API key |
 **text** | **String**| Define a text that&#x27;ll be used to detect the language in which it&#x27;s written. |

### Return type

[**DetectLanguage**](DetectLanguage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="extractArticleInfo"></a>
# **extractArticleInfo**
> ExtractArticleInfo extractArticleInfo(apiKey, url)

Extract article information (title, body, authors, ...) from article URL

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TextAnalyticsApi;


TextAnalyticsApi apiInstance = new TextAnalyticsApi();
String apiKey = "apiKey_example"; // String | Your API key
String url = "url_example"; // String | Define an article URL, that'll be used to extract the article information.
try {
    ExtractArticleInfo result = apiInstance.extractArticleInfo(apiKey, url);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TextAnalyticsApi#extractArticleInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**| Your API key |
 **url** | **String**| Define an article URL, that&#x27;ll be used to extract the article information. |

### Return type

[**ExtractArticleInfo**](ExtractArticleInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="semanticSimilarity"></a>
# **semanticSimilarity**
> Similarity semanticSimilarity(apiKey, text1, text2)

Compute semantic similarity of two documents, potentially in different languages

This API endpoint allows you to compare two documents, potentially in different languages, and compute the semantic similarity between them.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TextAnalyticsApi;


TextAnalyticsApi apiInstance = new TextAnalyticsApi();
String apiKey = "apiKey_example"; // String | Your API key
String text1 = "text1_example"; // String | The first text that'll be used in the comparison.
String text2 = "text2_example"; // String | The second text that'll be used in the comparison.
try {
    Similarity result = apiInstance.semanticSimilarity(apiKey, text1, text2);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TextAnalyticsApi#semanticSimilarity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**| Your API key |
 **text1** | **String**| The first text that&#x27;ll be used in the comparison. |
 **text2** | **String**| The second text that&#x27;ll be used in the comparison. |

### Return type

[**Similarity**](Similarity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sentiment"></a>
# **sentiment**
> Sentiment sentiment(apiKey, text, sentences)

Vocabulary based sentiment detection

Compute the sentiment using a vocabulary based approach. The sentiment classification only works for English language. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TextAnalyticsApi;


TextAnalyticsApi apiInstance = new TextAnalyticsApi();
String apiKey = "apiKey_example"; // String | Your API key
String text = "text_example"; // String | The text that will be used to calculate sentiment.
Integer sentences = 10; // Integer | Number of sentences on which to compute the sentiment.
try {
    Sentiment result = apiInstance.sentiment(apiKey, text, sentences);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TextAnalyticsApi#sentiment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**| Your API key |
 **text** | **String**| The text that will be used to calculate sentiment. |
 **sentences** | **Integer**| Number of sentences on which to compute the sentiment. | [optional] [default to 10]

### Return type

[**Sentiment**](Sentiment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sentiment_0"></a>
# **sentiment_0**
> Sentiment sentiment_0(apiKey, text, sentences)

Neural networks based approach to sentiment detection

Compute the sentiment using a neural network model. The sentiment classification only works for English language. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TextAnalyticsApi;


TextAnalyticsApi apiInstance = new TextAnalyticsApi();
String apiKey = "apiKey_example"; // String | Your API key
String text = "text_example"; // String | The text that will be used to calculate sentiment.
Integer sentences = 10; // Integer | Number of sentences on which to compute the sentiment.
try {
    Sentiment result = apiInstance.sentiment_0(apiKey, text, sentences);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TextAnalyticsApi#sentiment_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**| Your API key |
 **text** | **String**| The text that will be used to calculate sentiment. |
 **sentences** | **Integer**| Number of sentences on which to compute the sentiment. | [optional] [default to 10]

### Return type

[**Sentiment**](Sentiment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="trainTopicOnTwitter"></a>
# **trainTopicOnTwitter**
> InlineResponse200 trainTopicOnTwitter(apiKey, twitterQuery, useTweetText, maxTweets, normalization, ignoreConceptTypes, maxConcepts, maxCategories, notifyEmailAddress)

Train a topic (concepts and categories) based on tweets matching your search filter

You can train a definition of a topic by analyzing the tweets that match a particular search filter. The collection of tweets that will be analyzed can be identified based on a Twitter username, a hashtag or a regular keyword. The chosen number of tweets matching the criteria will be identified and analyzed by identifying the concepts mentioned in them and the content will be categorizer. In addition to analyzing the content of the tweets, the articles linked in the tweets will also be analyzed and information will be extracted from them in the same way. The concepts and categories that will be found more commonly in the tweets will receive a higher weight in your final topic. Once the topic is trained, you can use the endpoint &#x60;/trainTopic&#x60; with &#x60;action&#x3D;getTrainedTopic&#x60; and your topic &#x60;uri&#x60; to retrieve the topic definition. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TextAnalyticsApi;


TextAnalyticsApi apiInstance = new TextAnalyticsApi();
String apiKey = "apiKey_example"; // String | Your API key
String twitterQuery = "twitterQuery_example"; // String | string containing the content to search for. It can be a Twitter user account (using \"@\" prefix or user's Twitter url), a hash tag (using \"#\" prefix) or a regular keyword.
Boolean useTweetText = false; // Boolean | Annotate and extract information from the content of the tweets.
Integer maxTweets = 2000; // Integer | Maximum number of matching tweets to analyze.
String normalization = "normalization_example"; // String | The way to normalize the concept weights (\"none\", \"linear\").
String ignoreConceptTypes = "ignoreConceptTypes_example"; // String | If you want to ignore certain concept types from the topic, you can specify them here. The available types to ignore are `person`, `org`, `loc`, or `wiki`. 
Integer maxConcepts = 20; // Integer | Maximum number of top concepts to store in the topic.
Integer maxCategories = 10; // Integer | Maximum number of top categories to store in the topic.
String notifyEmailAddress = "notifyEmailAddress_example"; // String | The email address to which you would like us to send a notification email once the training of the topic is finished.
try {
    InlineResponse200 result = apiInstance.trainTopicOnTwitter(apiKey, twitterQuery, useTweetText, maxTweets, normalization, ignoreConceptTypes, maxConcepts, maxCategories, notifyEmailAddress);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TextAnalyticsApi#trainTopicOnTwitter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**| Your API key |
 **twitterQuery** | **String**| string containing the content to search for. It can be a Twitter user account (using \&quot;@\&quot; prefix or user&#x27;s Twitter url), a hash tag (using \&quot;#\&quot; prefix) or a regular keyword. |
 **useTweetText** | **Boolean**| Annotate and extract information from the content of the tweets. | [optional] [default to false]
 **maxTweets** | **Integer**| Maximum number of matching tweets to analyze. | [optional] [default to 2000] [enum: 5000]
 **normalization** | **String**| The way to normalize the concept weights (\&quot;none\&quot;, \&quot;linear\&quot;). | [optional]
 **ignoreConceptTypes** | **String**| If you want to ignore certain concept types from the topic, you can specify them here. The available types to ignore are &#x60;person&#x60;, &#x60;org&#x60;, &#x60;loc&#x60;, or &#x60;wiki&#x60;.  | [optional]
 **maxConcepts** | **Integer**| Maximum number of top concepts to store in the topic. | [optional] [default to 20]
 **maxCategories** | **Integer**| Maximum number of top categories to store in the topic. | [optional] [default to 10]
 **notifyEmailAddress** | **String**| The email address to which you would like us to send a notification email once the training of the topic is finished. | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="trainTopicOnTwitter_0"></a>
# **trainTopicOnTwitter_0**
> InlineResponse2001 trainTopicOnTwitter_0(apiKey, action, name, uri, text, maxConcepts, maxCategories, idfNormalization)

Train a topic (concepts and categories) using your own documents

The API endpoint can be used to train a definition of a topic by analyzing several documents that you can provide. The documents will be annotated and categorized and the topic will be then defined by identifying commonly mentioned concepts and categories. The concepts and categories that will be found more commonly in your documents will receive a higher weight in your topic.  Training of the topic can be done in several steps, which are triggered based on the specified &#x60;action&#x60; parameter. The initial step has to be a call with &#x60;action &#x3D; createTopic&#x60;. In the response you will receive a &#x60;uri&#x60; parameter that has to be specified in the followup calls.  In order to add documents to the topic specify &#x60;action &#x3D; addDocument&#x60;. The topic will be finished once you call the endpoint with &#x60;action &#x3D; finishTraining&#x60;. At that time, the returned information will also include the &#x60;topic&#x60; property containing the trained topic.  If you wish to retrieve the topic at some later point, you can retrieve it again by using &#x60;action &#x3D; getTrainedTopic&#x60;. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TextAnalyticsApi;


TextAnalyticsApi apiInstance = new TextAnalyticsApi();
String apiKey = "apiKey_example"; // String | Your API key
String action = "action_example"; // String | string containing the content to search for. It can be a Twitter user account (using \"@\" prefix or user's Twitter url), a hash tag (using \"#\" prefix) or a regular keyword.
String name = "name_example"; // String | name of the topic to create. Relevant for action `createTopic`.
String uri = "uri_example"; // String | uri of the topic to update or retrieve information about. Relevant for actions: `addDocument`, `finishTraining`, `getTrainedTopic`.
String text = "text_example"; // String | the content of the document to use for updating the topic definition. The document will be annotated and categorized and the concepts and categories will be used to update the topic.
Integer maxConcepts = 20; // Integer | The maximum number of concepts to use in the final topic. Relevant for action `finishTraining`.
Integer maxCategories = 10; // Integer | The maximum number of categories to use in the final topic. Relevant for action `finishTraining`.
Boolean idfNormalization = true; // Boolean | Should the concepts be normalized to punish the concepts that are more commonly mentioned in general news?
try {
    InlineResponse2001 result = apiInstance.trainTopicOnTwitter_0(apiKey, action, name, uri, text, maxConcepts, maxCategories, idfNormalization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TextAnalyticsApi#trainTopicOnTwitter_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**| Your API key |
 **action** | **String**| string containing the content to search for. It can be a Twitter user account (using \&quot;@\&quot; prefix or user&#x27;s Twitter url), a hash tag (using \&quot;#\&quot; prefix) or a regular keyword. | [enum: createTopic, addDocument, finishTraining, getTrainedTopic]
 **name** | **String**| name of the topic to create. Relevant for action &#x60;createTopic&#x60;. | [optional]
 **uri** | **String**| uri of the topic to update or retrieve information about. Relevant for actions: &#x60;addDocument&#x60;, &#x60;finishTraining&#x60;, &#x60;getTrainedTopic&#x60;. | [optional]
 **text** | **String**| the content of the document to use for updating the topic definition. The document will be annotated and categorized and the concepts and categories will be used to update the topic. | [optional]
 **maxConcepts** | **Integer**| The maximum number of concepts to use in the final topic. Relevant for action &#x60;finishTraining&#x60;. | [optional] [default to 20]
 **maxCategories** | **Integer**| The maximum number of categories to use in the final topic. Relevant for action &#x60;finishTraining&#x60;. | [optional] [default to 10]
 **idfNormalization** | **Boolean**| Should the concepts be normalized to punish the concepts that are more commonly mentioned in general news? | [optional] [default to true]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

