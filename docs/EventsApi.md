# EventsApi

All URIs are relative to *https://eventregistry.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBreakingEvents**](EventsApi.md#getBreakingEvents) | **GET** /api/v1/event/getBreakingEvents | Retrieve the list of breaking events
[**getEvent**](EventsApi.md#getEvent) | **GET** /api/v1/event/getEvent | Obtain details about a single event
[**getEvents**](EventsApi.md#getEvents) | **GET** /api/v1/event/getEvents | Retrieve a list of events that match one or more search conditions
[**getEventsForTopicPage**](EventsApi.md#getEventsForTopicPage) | **GET** /api/v1/event/getEventsForTopicPage | Obtain events that match a user generated topic page
[**minuteStreamEvents**](EventsApi.md#minuteStreamEvents) | **GET** /api/v1/minuteStreamEvents | The stream of events that were added or updated in the last minute

<a name="getBreakingEvents"></a>
# **getBreakingEvents**
> InlineResponse2008 getBreakingEvents(apiKey, breakingEventsCount, breakingEventsPage, breakingEventsMinBreakingScore, includeEventTitle, includeEventSummary, includeEventSocialScore, includeEventSentiment, includeEventLocation, includeEventDate, includeEventArticleCounts, includeEventConcepts, includeEventCategories, includeEventCommonDates, includeEventStories, eventImageCount, includeConceptLabel, includeConceptImage, includeConceptSynonyms, conceptLang, includeStoryBasicStats, includeStoryTitle, includeStoryLocation, includeStoryDate, includeStoryConcepts, includeStoryCategories, includeStoryMedoidArticle, includeStoryCommonDates, storyImageCount, includeCategoryParentUri, includeLocationPopulation, includeLocationGeoNamesId, includeLocationCountryArea, includeLocationCountryContinent)

Retrieve the list of breaking events

Use this API endpoint to obtain a list of breaking events and their breaking score. The breaking events are events (a) that occured very recently, (b) for which we have collected many articles about them in a short time span and (c) for which the intensity of reporting is increasing.  Examples of use are provided on the **[examples page](https://eventregistry.org/documentation/examples#event-registry-api-examples-events-get-breaking-events)**. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EventsApi;


EventsApi apiInstance = new EventsApi();
String apiKey = "apiKey_example"; // String | Your API key
Integer breakingEventsCount = 100; // Integer | Number of breaking events to return (at most 100)
Integer breakingEventsPage = 1; // Integer | Page of the results to return
Double breakingEventsMinBreakingScore = 3.4D; // Double | Score of how much should event at least be \"breaking\" in order to return it. Minimum value is 0.
Boolean includeEventTitle = true; // Boolean | Set this parameter to true to include the event title in the response.
Boolean includeEventSummary = false; // Boolean | Set this parameter to true to include the event summary in the response.
Boolean includeEventSocialScore = false; // Boolean | Set this parameter to true to include the event social score in the response.
Boolean includeEventSentiment = true; // Boolean | Set this parameter to true to include the event sentiment in the response.
Boolean includeEventLocation = true; // Boolean | Set this parameter to true to include the event location in the response.
Boolean includeEventDate = true; // Boolean | Set this parameter to true to include the event date in the response.
Boolean includeEventArticleCounts = true; // Boolean | Set this parameter to true to include the article counts for events in the response.
Boolean includeEventConcepts = true; // Boolean | Set this parameter to true to include the event concepts in the response.
Boolean includeEventCategories = true; // Boolean | Set this parameter to true to include the event categories in the response.
Boolean includeEventCommonDates = false; // Boolean | Set this parameter to true to include the event commmon dates in the response.
Boolean includeEventStories = false; // Boolean | Set this parameter to true to include the event stories in the response.
Integer eventImageCount = 56; // Integer | Define how many images you would like to have in the response.
Boolean includeConceptLabel = true; // Boolean | Set this parameter to true to include the concept label in the response.
Boolean includeConceptImage = false; // Boolean | Set this parameter to true to include the concept image in the response.
Boolean includeConceptSynonyms = false; // Boolean | Set this parameter to true to include the concept synonyms in the response.
String conceptLang = "eng"; // String | Define the language of the concept label.
Boolean includeStoryBasicStats = false; // Boolean | Set this parameter to true to include story basic stats in the response.
Boolean includeStoryTitle = false; // Boolean | Set this parameter to true to include the story title in the response.
Boolean includeStoryLocation = false; // Boolean | Set this parameter to true to include the story location in the response.
Boolean includeStoryDate = false; // Boolean | Set this parameter to true to include the story date in the response.
Boolean includeStoryConcepts = false; // Boolean | Set this parameter to true to include the story concepts in the response.
Boolean includeStoryCategories = false; // Boolean | Set this parameter to true to include the story categories in the response.
Boolean includeStoryMedoidArticle = false; // Boolean | Set this parameter to true to include story medoid article in the response.
Boolean includeStoryCommonDates = false; // Boolean | Set this parameter to true to include story common dates in the response.
Integer storyImageCount = 56; // Integer | Define how many images you would like to have in the response.
Boolean includeCategoryParentUri = false; // Boolean | Set this parameter to true to include category parent uri in the response.
Boolean includeLocationPopulation = false; // Boolean | Set to true to include the population size of the location
Boolean includeLocationGeoNamesId = false; // Boolean | Set to true to include the GeoNames id of the location
Boolean includeLocationCountryArea = false; // Boolean | Set to true to include the are of the location in squared km.
Boolean includeLocationCountryContinent = false; // Boolean | Set to true to get the continent of the country for location objects.
try {
    InlineResponse2008 result = apiInstance.getBreakingEvents(apiKey, breakingEventsCount, breakingEventsPage, breakingEventsMinBreakingScore, includeEventTitle, includeEventSummary, includeEventSocialScore, includeEventSentiment, includeEventLocation, includeEventDate, includeEventArticleCounts, includeEventConcepts, includeEventCategories, includeEventCommonDates, includeEventStories, eventImageCount, includeConceptLabel, includeConceptImage, includeConceptSynonyms, conceptLang, includeStoryBasicStats, includeStoryTitle, includeStoryLocation, includeStoryDate, includeStoryConcepts, includeStoryCategories, includeStoryMedoidArticle, includeStoryCommonDates, storyImageCount, includeCategoryParentUri, includeLocationPopulation, includeLocationGeoNamesId, includeLocationCountryArea, includeLocationCountryContinent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#getBreakingEvents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**| Your API key |
 **breakingEventsCount** | **Integer**| Number of breaking events to return (at most 100) | [optional] [default to 100]
 **breakingEventsPage** | **Integer**| Page of the results to return | [optional] [default to 1]
 **breakingEventsMinBreakingScore** | **Double**| Score of how much should event at least be \&quot;breaking\&quot; in order to return it. Minimum value is 0. | [optional] [default to 0.2]
 **includeEventTitle** | **Boolean**| Set this parameter to true to include the event title in the response. | [optional] [default to true]
 **includeEventSummary** | **Boolean**| Set this parameter to true to include the event summary in the response. | [optional] [default to false]
 **includeEventSocialScore** | **Boolean**| Set this parameter to true to include the event social score in the response. | [optional] [default to false]
 **includeEventSentiment** | **Boolean**| Set this parameter to true to include the event sentiment in the response. | [optional] [default to true]
 **includeEventLocation** | **Boolean**| Set this parameter to true to include the event location in the response. | [optional] [default to true]
 **includeEventDate** | **Boolean**| Set this parameter to true to include the event date in the response. | [optional] [default to true]
 **includeEventArticleCounts** | **Boolean**| Set this parameter to true to include the article counts for events in the response. | [optional] [default to true]
 **includeEventConcepts** | **Boolean**| Set this parameter to true to include the event concepts in the response. | [optional] [default to true]
 **includeEventCategories** | **Boolean**| Set this parameter to true to include the event categories in the response. | [optional] [default to true]
 **includeEventCommonDates** | **Boolean**| Set this parameter to true to include the event commmon dates in the response. | [optional] [default to false]
 **includeEventStories** | **Boolean**| Set this parameter to true to include the event stories in the response. | [optional] [default to false]
 **eventImageCount** | **Integer**| Define how many images you would like to have in the response. | [optional]
 **includeConceptLabel** | **Boolean**| Set this parameter to true to include the concept label in the response. | [optional] [default to true]
 **includeConceptImage** | **Boolean**| Set this parameter to true to include the concept image in the response. | [optional] [default to false]
 **includeConceptSynonyms** | **Boolean**| Set this parameter to true to include the concept synonyms in the response. | [optional] [default to false]
 **conceptLang** | **String**| Define the language of the concept label. | [optional] [default to eng]
 **includeStoryBasicStats** | **Boolean**| Set this parameter to true to include story basic stats in the response. | [optional] [default to false]
 **includeStoryTitle** | **Boolean**| Set this parameter to true to include the story title in the response. | [optional] [default to false]
 **includeStoryLocation** | **Boolean**| Set this parameter to true to include the story location in the response. | [optional] [default to false]
 **includeStoryDate** | **Boolean**| Set this parameter to true to include the story date in the response. | [optional] [default to false]
 **includeStoryConcepts** | **Boolean**| Set this parameter to true to include the story concepts in the response. | [optional] [default to false]
 **includeStoryCategories** | **Boolean**| Set this parameter to true to include the story categories in the response. | [optional] [default to false]
 **includeStoryMedoidArticle** | **Boolean**| Set this parameter to true to include story medoid article in the response. | [optional] [default to false]
 **includeStoryCommonDates** | **Boolean**| Set this parameter to true to include story common dates in the response. | [optional] [default to false]
 **storyImageCount** | **Integer**| Define how many images you would like to have in the response. | [optional]
 **includeCategoryParentUri** | **Boolean**| Set this parameter to true to include category parent uri in the response. | [optional] [default to false]
 **includeLocationPopulation** | **Boolean**| Set to true to include the population size of the location | [optional] [default to false]
 **includeLocationGeoNamesId** | **Boolean**| Set to true to include the GeoNames id of the location | [optional] [default to false]
 **includeLocationCountryArea** | **Boolean**| Set to true to include the are of the location in squared km. | [optional] [default to false]
 **includeLocationCountryContinent** | **Boolean**| Set to true to get the continent of the country for location objects. | [optional] [default to false]

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEvent"></a>
# **getEvent**
> InlineResponse2009 getEvent(apiKey, eventUri, resultType, articlesLang, articlesIncludeDuplicates, keyword, conceptUri, categoryUri, sourceUri, sourceLocationUri, sourceGroupUri, authorUri, locationUri, lang, dateStart, dateEnd, dateMentionStart, dateMentionEnd, keywordLoc, keywordOper, conceptOper, categoryOper, startSourceRankPercentile, endSourceRankPercentile, minSentimentArticle, maxSentimentArticle, includeEventTitle, includeEventSummary, includeEventSocialScore, includeEventSentiment, includeEventLocation, includeEventDate, includeEventArticleCounts, includeEventConcepts, includeEventCategories, includeEventCommonDates, includeEventStories, eventImageCount, includeConceptLabel, includeConceptImage, includeConceptSynonyms, includeConceptTrendingScore, conceptLang, includeStoryBasicStats, includeStoryTitle, includeStoryLocation, includeStoryDate, includeStoryConcepts, includeStoryCategories, includeStoryMedoidArticle, includeStoryCommonDates, storyImageCount, includeArticleTitle, includeArticleBasicInfo, includeArticleBody, includeArticleEventUri, includeArticleSocialScore, includeArticleSentiment, includeArticleConcepts, includeArticleCategories, includeArticleLocation, includeArticleImage, includeArticleAuthors, includeArticleVideos, includeArticleLinks, includeArticleExtractedDates, includeArticleDuplicateList, includeArticleOriginalArticle, articleBodyLen, includeSourceTitle, includeSourceDescription, includeSourceLocation, includeSourceRanking, includeLocationPopulation, includeLocationGeoNamesId, includeLocationCountryArea, includeLocationCountryContinent)

Obtain details about a single event

The endpoint can be used to retrieve detailed information about a single event of interest. The event of interest should be provided with the &#x60;eventUri&#x60; parameter.  For each event you can retrieve multiple properties. The most common is retrieving the list of articles that discuss the event. Alternatively, you can also generate various summaries, by using some other &#x60;returnType&#x60; value. The &#x60;keywordAggr&#x60; return type will, for example, return the top keywords that are mentioned in the articles about the event.  If you would like retrieve only a subset of articles assigned to the event, you can do so by specifying one of the available filters (&#x60;keyword&#x60;, &#x60;conceptUri&#x60;, etc.).  Examples of use are provided on the **[examples page](https://eventregistry.org/documentation/examples#event-registry-api-examples-events-get-event)**. Details about the returned information is available on the **[data model page](https://github.com/EventRegistry/event-registry-python/wiki/Data-models)**. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EventsApi;


EventsApi apiInstance = new EventsApi();
String apiKey = "apiKey_example"; // String | Your API key
String eventUri = "eventUri_example"; // String | Specify the URI of the event you would like to see returned.
String resultType = "info"; // String | Define what kind of results you would like to get. Each result type corresponds to the prefix that'll be used for other parameters.
List<String> articlesLang = Arrays.asList("articlesLang_example"); // List<String> | if resultType is `articles` then use this parameter if you wish to obtain only articles about the event in specific language(s).
Boolean articlesIncludeDuplicates = false; // Boolean | if resultType is `articles` then set this value to `true` in order to return also articles that are copies of other articles (possibly from other news sources). 
List<String> keyword = Arrays.asList("keyword_example"); // List<String> | Find articles that mention the specified keyword or a phrase. You can specify at most 60 keywords in a single search. If you specify multiple `keyword` parameters, then only articles that mention all of them will be returned, unless you specify `keywordOper` parameter and set it to 'or'. 
List<String> conceptUri = Arrays.asList("conceptUri_example"); // List<String> | Find articles that mention the concept with a concept uri. You can specify at most 50 concepts in a single search. If multiple `conceptUri` parameters are provided, then only articles that are about all specified concepts will be returned, unless you specify `conceptOper` parameter and set it to 'or'. Check [autosuggest methods](https://eventregistry.org/documentation?tab=suggConcepts) to get concept URI value for a specified concept label. 
List<String> categoryUri = Arrays.asList("categoryUri_example"); // List<String> | Find articles that are assigned to a particular category. You can specify at most 20 categories in a single search. If multiple `categoryUri` parameters are provided, then articles that are about any of the specified categories will be returned, unless you specify `categoryOper` parameter and set it to 'and'. Check [autosuggest methods](https://eventregistry.org/documentation?tab=suggCategories) to get value for a specified category name. 
List<String> sourceUri = Arrays.asList("sourceUri_example"); // List<String> | Find articles that have been published by a news source. If you specify multiple `sourceUri` parameters, then articles from any of the specified sources will be returned. Check [autosuggest methods](https://eventregistry.org/documentation?tab=suggSources) to get value for a source name. 
List<String> sourceLocationUri = Arrays.asList("sourceLocationUri_example"); // List<String> | Find articles that were published by news sources located at the given geographic location (city or country). If you specify multiple `sourceLocationUri` parameters, then articles from sources from any of the specified sources will be returned. Check [autosuggest methods](https://eventregistry.org/documentation?tab=suggLocations) to get value for a location name. 
List<String> sourceGroupUri = Arrays.asList("sourceGroupUri_example"); // List<String> | Find articles that were published by news sources that are assigned to some predefined group of news sources. Check [autosuggest methods](https://eventregistry.org/documentation?tab=suggSourceGroups) to get value for a source group or find the uri. 
List<String> authorUri = Arrays.asList("authorUri_example"); // List<String> | Find articles that were written by a particular author. Check [autosuggest methods](https://eventregistry.org/documentation?tab=suggAuthors) to get value for author uri based on the author name (and potentially source url).
List<String> locationUri = Arrays.asList("locationUri_example"); // List<String> | Find articles that describe something that occured at a particular location (based on the location mentioned in the dateline). Check [autosuggest methods](https://eventregistry.org/documentation?tab=suggLocations) to get value for a location name.
List<String> lang = Arrays.asList("lang_example"); // List<String> | Find articles in the specific language(s). If not specified, all languages will be included. You can specify at most 5 languages in a single search.
String dateStart = "dateStart_example"; // String | The starting date on or after the articles of interest were published.
String dateEnd = "dateEnd_example"; // String | The last date on which the articles of interest were published.
String dateMentionStart = "dateMentionStart_example"; // String | Ignore events (that contain one or more articles) or articles that explicitly mention a date that is equal or greater than `dateMentionStart`.
String dateMentionEnd = "dateMentionEnd_example"; // String | Ignore events (that contain one or more articles) or articles that explicitly mention a date that is lower or equal to `dateMentionEnd`.
String keywordLoc = "body"; // String | What data should be used when searching using the keywords provided by `keywords` parameter.
String keywordOper = "and"; // String | If more keywords are provided with the `keyword` parameter, what should be the Boolean operator used. If 'and' (default) then all of the specified keywords have to be present in the article; if 'or' then an article will be returned if it mentions any of the provided keywords.
String conceptOper = "and"; // String | If more concepts are provided with the `conceptUri` parameter, what should be the Boolean operator used. If 'and' (default) then all of the specified concepts have to be present in the article; if 'or' then an article will be returned if it mentions any of the provided concepts.
String categoryOper = "or"; // String | If more categories are provided with the `categoryUri` parameter, what should be the Boolean operator used. If 'and' then all of the specified categories have to be present in the article; if 'or' then an article will be returned if it mentions any of the provided categories.
Integer startSourceRankPercentile = 56; // Integer | starting [ranking percentile of the sources](https://github.com/EventRegistry/event-registry-python/wiki/Source-filtering#filtering-of-sources-based-on-their-ranking) to consider in the results (default: 0). Value should be in range 0-90 and divisible by 10.
Integer endSourceRankPercentile = 56; // Integer | ending [ranking percentile of the sources](https://github.com/EventRegistry/event-registry-python/wiki/Source-filtering#filtering-of-sources-based-on-their-ranking) to consider in the results (default: 100). Value should be in range 10-100 and divisible by 10.
Integer minSentimentArticle = 56; // Integer | the minimum value of the sentiment, the article should have. Valid value is any floating number between -1 (very negative) to 1 (very positive). 0 represents neutral sentiment. Note that setting the value will automatically reduce results to just English articles, since the sentiment can only be computed for English language.
Integer maxSentimentArticle = 56; // Integer | the maximum value of the sentiment, the article should have. Valid value is any floating number between -1 (very negative) to 1 (very positive). 0 represents neutral sentiment. Note that setting the value will automatically reduce results to just English articles, since the sentiment can only be computed for English language.
Boolean includeEventTitle = true; // Boolean | Set this parameter to true to include the event title in the response.
Boolean includeEventSummary = false; // Boolean | Set this parameter to true to include the event summary in the response.
Boolean includeEventSocialScore = false; // Boolean | Set this parameter to true to include the event social score in the response.
Boolean includeEventSentiment = true; // Boolean | Set this parameter to true to include the event sentiment in the response.
Boolean includeEventLocation = true; // Boolean | Set this parameter to true to include the event location in the response.
Boolean includeEventDate = true; // Boolean | Set this parameter to true to include the event date in the response.
Boolean includeEventArticleCounts = true; // Boolean | Set this parameter to true to include the article counts for events in the response.
Boolean includeEventConcepts = true; // Boolean | Set this parameter to true to include the event concepts in the response.
Boolean includeEventCategories = true; // Boolean | Set this parameter to true to include the event categories in the response.
Boolean includeEventCommonDates = false; // Boolean | Set this parameter to true to include the event commmon dates in the response.
Boolean includeEventStories = false; // Boolean | Set this parameter to true to include the event stories in the response.
Integer eventImageCount = 56; // Integer | Define how many images you would like to have in the response.
Boolean includeConceptLabel = true; // Boolean | Set this parameter to true to include the concept label in the response.
Boolean includeConceptImage = false; // Boolean | Set this parameter to true to include the concept image in the response.
Boolean includeConceptSynonyms = false; // Boolean | Set this parameter to true to include the concept synonyms in the response.
Boolean includeConceptTrendingScore = false; // Boolean | Set this parameter to true to include concept trending score in the response.
String conceptLang = "eng"; // String | Define the language of the concept label.
Boolean includeStoryBasicStats = false; // Boolean | Set this parameter to true to include story basic stats in the response.
Boolean includeStoryTitle = false; // Boolean | Set this parameter to true to include the story title in the response.
Boolean includeStoryLocation = false; // Boolean | Set this parameter to true to include the story location in the response.
Boolean includeStoryDate = false; // Boolean | Set this parameter to true to include the story date in the response.
Boolean includeStoryConcepts = false; // Boolean | Set this parameter to true to include the story concepts in the response.
Boolean includeStoryCategories = false; // Boolean | Set this parameter to true to include the story categories in the response.
Boolean includeStoryMedoidArticle = false; // Boolean | Set this parameter to true to include story medoid article in the response.
Boolean includeStoryCommonDates = false; // Boolean | Set this parameter to true to include story common dates in the response.
Integer storyImageCount = 56; // Integer | Define how many images you would like to have in the response.
Boolean includeArticleTitle = true; // Boolean | Set this parameter to true to include the article title in the response.
Boolean includeArticleBasicInfo = true; // Boolean | Set this parameter to true to include the core article information in the response.
Boolean includeArticleBody = true; // Boolean | Set this parameter to true to include the article body in the response.
Boolean includeArticleEventUri = true; // Boolean | Set this parameter to true to include the uri of the event (to which the article belongs) in the response.
Boolean includeArticleSocialScore = false; // Boolean | Set this parameter to true to include the information about how many times the article was shared on different social media.
Boolean includeArticleSentiment = true; // Boolean | Set this parameter to true to include the article sentiment in the response (value will be non-null only for English articles).
Boolean includeArticleConcepts = false; // Boolean | Set this parameter to true to include the article concepts in the response.
Boolean includeArticleCategories = false; // Boolean | Set this parameter to true to include the article categories in the response.
Boolean includeArticleLocation = false; // Boolean | Set this parameter to true to include the article location in the response.
Boolean includeArticleImage = true; // Boolean | Set this parameter to true to include the article image in the response.
Boolean includeArticleAuthors = true; // Boolean | Set this parameter to true to include the article authors in the response.
Boolean includeArticleVideos = false; // Boolean | Set this parameter to true to include the article videos in the response.
Boolean includeArticleLinks = false; // Boolean | Set this parameter to true to include the article links in the response.
Boolean includeArticleExtractedDates = false; // Boolean | Set this parameter to true to include article extracted dates in the response.
Boolean includeArticleDuplicateList = false; // Boolean | Set this parameter to true to include the list of duplicate articles in the response.
Boolean includeArticleOriginalArticle = false; // Boolean | Set this parameter to true to include the original article in the response.
Integer articleBodyLen = -1; // Integer | Set the size of the article body that'll be returned in the response. Use -1 for full article body.
Boolean includeSourceTitle = true; // Boolean | Set this parameter to true to include the source title in the response.
Boolean includeSourceDescription = false; // Boolean | Set this parameter to true to include the source description in the response.
Boolean includeSourceLocation = false; // Boolean | Set this parameter to true to include the source location in the response.
Boolean includeSourceRanking = false; // Boolean | Set this parameter to true to include the source ranking in the response.
Boolean includeLocationPopulation = false; // Boolean | Set to true to include the population size of the location
Boolean includeLocationGeoNamesId = false; // Boolean | Set to true to include the GeoNames id of the location
Boolean includeLocationCountryArea = false; // Boolean | Set to true to include the are of the location in squared km.
Boolean includeLocationCountryContinent = false; // Boolean | Set to true to get the continent of the country for location objects.
try {
    InlineResponse2009 result = apiInstance.getEvent(apiKey, eventUri, resultType, articlesLang, articlesIncludeDuplicates, keyword, conceptUri, categoryUri, sourceUri, sourceLocationUri, sourceGroupUri, authorUri, locationUri, lang, dateStart, dateEnd, dateMentionStart, dateMentionEnd, keywordLoc, keywordOper, conceptOper, categoryOper, startSourceRankPercentile, endSourceRankPercentile, minSentimentArticle, maxSentimentArticle, includeEventTitle, includeEventSummary, includeEventSocialScore, includeEventSentiment, includeEventLocation, includeEventDate, includeEventArticleCounts, includeEventConcepts, includeEventCategories, includeEventCommonDates, includeEventStories, eventImageCount, includeConceptLabel, includeConceptImage, includeConceptSynonyms, includeConceptTrendingScore, conceptLang, includeStoryBasicStats, includeStoryTitle, includeStoryLocation, includeStoryDate, includeStoryConcepts, includeStoryCategories, includeStoryMedoidArticle, includeStoryCommonDates, storyImageCount, includeArticleTitle, includeArticleBasicInfo, includeArticleBody, includeArticleEventUri, includeArticleSocialScore, includeArticleSentiment, includeArticleConcepts, includeArticleCategories, includeArticleLocation, includeArticleImage, includeArticleAuthors, includeArticleVideos, includeArticleLinks, includeArticleExtractedDates, includeArticleDuplicateList, includeArticleOriginalArticle, articleBodyLen, includeSourceTitle, includeSourceDescription, includeSourceLocation, includeSourceRanking, includeLocationPopulation, includeLocationGeoNamesId, includeLocationCountryArea, includeLocationCountryContinent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#getEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**| Your API key |
 **eventUri** | **String**| Specify the URI of the event you would like to see returned. |
 **resultType** | **String**| Define what kind of results you would like to get. Each result type corresponds to the prefix that&#x27;ll be used for other parameters. | [optional] [default to info] [enum: info, articles, articleUris, keywordAggr, sourceExAggr, dateMentionAggr, articleTrend, similarEvents]
 **articlesLang** | [**List&lt;String&gt;**](String.md)| if resultType is &#x60;articles&#x60; then use this parameter if you wish to obtain only articles about the event in specific language(s). | [optional]
 **articlesIncludeDuplicates** | **Boolean**| if resultType is &#x60;articles&#x60; then set this value to &#x60;true&#x60; in order to return also articles that are copies of other articles (possibly from other news sources).  | [optional] [default to false]
 **keyword** | [**List&lt;String&gt;**](String.md)| Find articles that mention the specified keyword or a phrase. You can specify at most 60 keywords in a single search. If you specify multiple &#x60;keyword&#x60; parameters, then only articles that mention all of them will be returned, unless you specify &#x60;keywordOper&#x60; parameter and set it to &#x27;or&#x27;.  | [optional]
 **conceptUri** | [**List&lt;String&gt;**](String.md)| Find articles that mention the concept with a concept uri. You can specify at most 50 concepts in a single search. If multiple &#x60;conceptUri&#x60; parameters are provided, then only articles that are about all specified concepts will be returned, unless you specify &#x60;conceptOper&#x60; parameter and set it to &#x27;or&#x27;. Check [autosuggest methods](https://eventregistry.org/documentation?tab&#x3D;suggConcepts) to get concept URI value for a specified concept label.  | [optional]
 **categoryUri** | [**List&lt;String&gt;**](String.md)| Find articles that are assigned to a particular category. You can specify at most 20 categories in a single search. If multiple &#x60;categoryUri&#x60; parameters are provided, then articles that are about any of the specified categories will be returned, unless you specify &#x60;categoryOper&#x60; parameter and set it to &#x27;and&#x27;. Check [autosuggest methods](https://eventregistry.org/documentation?tab&#x3D;suggCategories) to get value for a specified category name.  | [optional]
 **sourceUri** | [**List&lt;String&gt;**](String.md)| Find articles that have been published by a news source. If you specify multiple &#x60;sourceUri&#x60; parameters, then articles from any of the specified sources will be returned. Check [autosuggest methods](https://eventregistry.org/documentation?tab&#x3D;suggSources) to get value for a source name.  | [optional]
 **sourceLocationUri** | [**List&lt;String&gt;**](String.md)| Find articles that were published by news sources located at the given geographic location (city or country). If you specify multiple &#x60;sourceLocationUri&#x60; parameters, then articles from sources from any of the specified sources will be returned. Check [autosuggest methods](https://eventregistry.org/documentation?tab&#x3D;suggLocations) to get value for a location name.  | [optional]
 **sourceGroupUri** | [**List&lt;String&gt;**](String.md)| Find articles that were published by news sources that are assigned to some predefined group of news sources. Check [autosuggest methods](https://eventregistry.org/documentation?tab&#x3D;suggSourceGroups) to get value for a source group or find the uri.  | [optional]
 **authorUri** | [**List&lt;String&gt;**](String.md)| Find articles that were written by a particular author. Check [autosuggest methods](https://eventregistry.org/documentation?tab&#x3D;suggAuthors) to get value for author uri based on the author name (and potentially source url). | [optional]
 **locationUri** | [**List&lt;String&gt;**](String.md)| Find articles that describe something that occured at a particular location (based on the location mentioned in the dateline). Check [autosuggest methods](https://eventregistry.org/documentation?tab&#x3D;suggLocations) to get value for a location name. | [optional]
 **lang** | [**List&lt;String&gt;**](String.md)| Find articles in the specific language(s). If not specified, all languages will be included. You can specify at most 5 languages in a single search. | [optional] [enum: eng, spa, deu, zho, slv, cat, por, ita, fra, rus, ara, tur, hrv, srp, ind, ces, slk, pol, eus, hun, nld, swe, fin, dan, ell, ron, bul, ukr, fas, hin, urd, vie]
 **dateStart** | **String**| The starting date on or after the articles of interest were published. | [optional]
 **dateEnd** | **String**| The last date on which the articles of interest were published. | [optional]
 **dateMentionStart** | **String**| Ignore events (that contain one or more articles) or articles that explicitly mention a date that is equal or greater than &#x60;dateMentionStart&#x60;. | [optional]
 **dateMentionEnd** | **String**| Ignore events (that contain one or more articles) or articles that explicitly mention a date that is lower or equal to &#x60;dateMentionEnd&#x60;. | [optional]
 **keywordLoc** | **String**| What data should be used when searching using the keywords provided by &#x60;keywords&#x60; parameter. | [optional] [default to body] [enum: body, title, body,title]
 **keywordOper** | **String**| If more keywords are provided with the &#x60;keyword&#x60; parameter, what should be the Boolean operator used. If &#x27;and&#x27; (default) then all of the specified keywords have to be present in the article; if &#x27;or&#x27; then an article will be returned if it mentions any of the provided keywords. | [optional] [default to and] [enum: and, or]
 **conceptOper** | **String**| If more concepts are provided with the &#x60;conceptUri&#x60; parameter, what should be the Boolean operator used. If &#x27;and&#x27; (default) then all of the specified concepts have to be present in the article; if &#x27;or&#x27; then an article will be returned if it mentions any of the provided concepts. | [optional] [default to and] [enum: and, or]
 **categoryOper** | **String**| If more categories are provided with the &#x60;categoryUri&#x60; parameter, what should be the Boolean operator used. If &#x27;and&#x27; then all of the specified categories have to be present in the article; if &#x27;or&#x27; then an article will be returned if it mentions any of the provided categories. | [optional] [default to or] [enum: and, or]
 **startSourceRankPercentile** | **Integer**| starting [ranking percentile of the sources](https://github.com/EventRegistry/event-registry-python/wiki/Source-filtering#filtering-of-sources-based-on-their-ranking) to consider in the results (default: 0). Value should be in range 0-90 and divisible by 10. | [optional]
 **endSourceRankPercentile** | **Integer**| ending [ranking percentile of the sources](https://github.com/EventRegistry/event-registry-python/wiki/Source-filtering#filtering-of-sources-based-on-their-ranking) to consider in the results (default: 100). Value should be in range 10-100 and divisible by 10. | [optional]
 **minSentimentArticle** | **Integer**| the minimum value of the sentiment, the article should have. Valid value is any floating number between -1 (very negative) to 1 (very positive). 0 represents neutral sentiment. Note that setting the value will automatically reduce results to just English articles, since the sentiment can only be computed for English language. | [optional]
 **maxSentimentArticle** | **Integer**| the maximum value of the sentiment, the article should have. Valid value is any floating number between -1 (very negative) to 1 (very positive). 0 represents neutral sentiment. Note that setting the value will automatically reduce results to just English articles, since the sentiment can only be computed for English language. | [optional]
 **includeEventTitle** | **Boolean**| Set this parameter to true to include the event title in the response. | [optional] [default to true]
 **includeEventSummary** | **Boolean**| Set this parameter to true to include the event summary in the response. | [optional] [default to false]
 **includeEventSocialScore** | **Boolean**| Set this parameter to true to include the event social score in the response. | [optional] [default to false]
 **includeEventSentiment** | **Boolean**| Set this parameter to true to include the event sentiment in the response. | [optional] [default to true]
 **includeEventLocation** | **Boolean**| Set this parameter to true to include the event location in the response. | [optional] [default to true]
 **includeEventDate** | **Boolean**| Set this parameter to true to include the event date in the response. | [optional] [default to true]
 **includeEventArticleCounts** | **Boolean**| Set this parameter to true to include the article counts for events in the response. | [optional] [default to true]
 **includeEventConcepts** | **Boolean**| Set this parameter to true to include the event concepts in the response. | [optional] [default to true]
 **includeEventCategories** | **Boolean**| Set this parameter to true to include the event categories in the response. | [optional] [default to true]
 **includeEventCommonDates** | **Boolean**| Set this parameter to true to include the event commmon dates in the response. | [optional] [default to false]
 **includeEventStories** | **Boolean**| Set this parameter to true to include the event stories in the response. | [optional] [default to false]
 **eventImageCount** | **Integer**| Define how many images you would like to have in the response. | [optional]
 **includeConceptLabel** | **Boolean**| Set this parameter to true to include the concept label in the response. | [optional] [default to true]
 **includeConceptImage** | **Boolean**| Set this parameter to true to include the concept image in the response. | [optional] [default to false]
 **includeConceptSynonyms** | **Boolean**| Set this parameter to true to include the concept synonyms in the response. | [optional] [default to false]
 **includeConceptTrendingScore** | **Boolean**| Set this parameter to true to include concept trending score in the response. | [optional] [default to false]
 **conceptLang** | **String**| Define the language of the concept label. | [optional] [default to eng]
 **includeStoryBasicStats** | **Boolean**| Set this parameter to true to include story basic stats in the response. | [optional] [default to false]
 **includeStoryTitle** | **Boolean**| Set this parameter to true to include the story title in the response. | [optional] [default to false]
 **includeStoryLocation** | **Boolean**| Set this parameter to true to include the story location in the response. | [optional] [default to false]
 **includeStoryDate** | **Boolean**| Set this parameter to true to include the story date in the response. | [optional] [default to false]
 **includeStoryConcepts** | **Boolean**| Set this parameter to true to include the story concepts in the response. | [optional] [default to false]
 **includeStoryCategories** | **Boolean**| Set this parameter to true to include the story categories in the response. | [optional] [default to false]
 **includeStoryMedoidArticle** | **Boolean**| Set this parameter to true to include story medoid article in the response. | [optional] [default to false]
 **includeStoryCommonDates** | **Boolean**| Set this parameter to true to include story common dates in the response. | [optional] [default to false]
 **storyImageCount** | **Integer**| Define how many images you would like to have in the response. | [optional]
 **includeArticleTitle** | **Boolean**| Set this parameter to true to include the article title in the response. | [optional] [default to true]
 **includeArticleBasicInfo** | **Boolean**| Set this parameter to true to include the core article information in the response. | [optional] [default to true]
 **includeArticleBody** | **Boolean**| Set this parameter to true to include the article body in the response. | [optional] [default to true]
 **includeArticleEventUri** | **Boolean**| Set this parameter to true to include the uri of the event (to which the article belongs) in the response. | [optional] [default to true]
 **includeArticleSocialScore** | **Boolean**| Set this parameter to true to include the information about how many times the article was shared on different social media. | [optional] [default to false]
 **includeArticleSentiment** | **Boolean**| Set this parameter to true to include the article sentiment in the response (value will be non-null only for English articles). | [optional] [default to true]
 **includeArticleConcepts** | **Boolean**| Set this parameter to true to include the article concepts in the response. | [optional] [default to false]
 **includeArticleCategories** | **Boolean**| Set this parameter to true to include the article categories in the response. | [optional] [default to false]
 **includeArticleLocation** | **Boolean**| Set this parameter to true to include the article location in the response. | [optional] [default to false]
 **includeArticleImage** | **Boolean**| Set this parameter to true to include the article image in the response. | [optional] [default to true]
 **includeArticleAuthors** | **Boolean**| Set this parameter to true to include the article authors in the response. | [optional] [default to true]
 **includeArticleVideos** | **Boolean**| Set this parameter to true to include the article videos in the response. | [optional] [default to false]
 **includeArticleLinks** | **Boolean**| Set this parameter to true to include the article links in the response. | [optional] [default to false]
 **includeArticleExtractedDates** | **Boolean**| Set this parameter to true to include article extracted dates in the response. | [optional] [default to false]
 **includeArticleDuplicateList** | **Boolean**| Set this parameter to true to include the list of duplicate articles in the response. | [optional] [default to false]
 **includeArticleOriginalArticle** | **Boolean**| Set this parameter to true to include the original article in the response. | [optional] [default to false]
 **articleBodyLen** | **Integer**| Set the size of the article body that&#x27;ll be returned in the response. Use -1 for full article body. | [optional] [default to -1]
 **includeSourceTitle** | **Boolean**| Set this parameter to true to include the source title in the response. | [optional] [default to true]
 **includeSourceDescription** | **Boolean**| Set this parameter to true to include the source description in the response. | [optional] [default to false]
 **includeSourceLocation** | **Boolean**| Set this parameter to true to include the source location in the response. | [optional] [default to false]
 **includeSourceRanking** | **Boolean**| Set this parameter to true to include the source ranking in the response. | [optional] [default to false]
 **includeLocationPopulation** | **Boolean**| Set to true to include the population size of the location | [optional] [default to false]
 **includeLocationGeoNamesId** | **Boolean**| Set to true to include the GeoNames id of the location | [optional] [default to false]
 **includeLocationCountryArea** | **Boolean**| Set to true to include the are of the location in squared km. | [optional] [default to false]
 **includeLocationCountryContinent** | **Boolean**| Set to true to get the continent of the country for location objects. | [optional] [default to false]

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEvents"></a>
# **getEvents**
> InlineResponse2007 getEvents(apiKey, resultType, eventsPage, eventsCount, eventsSortBy, eventsSortByAsc, query, keyword, conceptUri, categoryUri, sourceUri, sourceLocationUri, sourceGroupUri, authorUri, locationUri, lang, dateStart, dateEnd, minSentimentEvent, maxSentimentEvent, minArticlesInEvent, maxArticlesInEvent, reportingDateStart, reportingDateEnd, dateMentionStart, dateMentionEnd, keywordLoc, keywordOper, conceptOper, categoryOper, ignoreKeyword, ignoreConceptUri, ignoreCategoryUri, ignoreSourceUri, ignoreSourceLocationUri, ignoreSourceGroupUri, ignoreAuthorUri, ignoreLocationUri, ignoreLang, ignoreKeywordLoc, includeEventTitle, includeEventSummary, includeEventSocialScore, includeEventSentiment, includeEventLocation, includeEventDate, includeEventArticleCounts, includeEventConcepts, includeEventCategories, includeEventCommonDates, includeEventStories, eventImageCount, includeConceptLabel, includeConceptImage, includeConceptSynonyms, conceptLang, includeStoryBasicStats, includeStoryTitle, includeStoryLocation, includeStoryDate, includeStoryConcepts, includeStoryCategories, includeStoryMedoidArticle, includeStoryCommonDates, storyImageCount, includeCategoryParentUri, includeLocationPopulation, includeLocationGeoNamesId, includeLocationCountryArea, includeLocationCountryContinent)

Retrieve a list of events that match one or more search conditions

Identify the world events that match a certain set of search criteria.  The search conditions can be specified by setting the &#x60;query&#x60; parameter, or by specifying one or multiple search parameters, such as &#x60;keyword&#x60;, &#x60;conceptUri&#x60;, &#x60;sourceUri&#x60;, etc. To remove some of the results matching the *positive* conditions, you can specify some *negative* conditions using &#x60;ignoreKeyword&#x60;, &#x60;ignoreSourceUri&#x60;, and other &#x60;ignore*&#x60; parameters.  The results of the search can be the list of matching events (when &#x60;resultType &#x3D; events&#x60;) or one of the various aggregates (summaries) of the matching events. In case of &#x60;resultType &#x3D; locAggr&#x60;, for example, the returned data will contain the geographic locations where the events matching criteria occured.  Examples of use are provided on the **[examples page](https://eventregistry.org/documentation/examples#event-registry-api-examples-events-get-events)**. Details about the returned information is available on the **[data model page](https://github.com/EventRegistry/event-registry-python/wiki/Data-models)**. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EventsApi;


EventsApi apiInstance = new EventsApi();
String apiKey = "apiKey_example"; // String | Your API key
List<String> resultType = Arrays.asList("resultType_example"); // List<String> | Define what kind of results you would like to get.
Integer eventsPage = 1; // Integer | Determines the page of the results to return (starting from 1). Relevant when `resultType = events`.
Integer eventsCount = 50; // Integer | Define how many events (up to 50) will be returned. Relevant when `resultType = events`.
String eventsSortBy = "date"; // String | Set how you would like to sort your results. `date` (by event date), `rel` (relevance to the query), `size` (number of articles),     `socialScore` (amount of shares in social media). Relevant when `resultType = events`.
Boolean eventsSortByAsc = false; // Boolean | Should the results be ordered in ascending order or descending order (default) based on the sorting criteria. Relevant when `resultType = events`.
Query1 query = new Query1(); // Query1 | Query object with one or more search conditions. The `query` object should match the [Advanced Query Language](https://github.com/EventRegistry/event-registry-python/wiki/Searching-for-events#advanced-query-language) format. If you specify the `query` parameter, then the query parameters specified directly (`keyword`, `conceptUri`, `sourceUri`, `categoryUri`, etc) will be ignored.
List<String> keyword = Arrays.asList("keyword_example"); // List<String> | Find events in which news articles mention the specified keyword or a phrase. If you specify multiple `keyword` parameters, then only events with articles that mention all of them will be returned, unless you specify `keywordOper` parameter and set it to 'or'.
List<String> conceptUri = Arrays.asList("conceptUri_example"); // List<String> | Find events for which the concept with concept uri is important. You can specify up to 50 concepts in a single search. If multiple `conceptUri` parameters are provided, then only events that are about all specified concepts will be returned, unless you specify `conceptOper` parameter and set it to 'or'. Check [autosuggest methods](https://eventregistry.org/documentation?tab=suggConcepts) to get concept URI value for a specified concept label.
List<String> categoryUri = Arrays.asList("categoryUri_example"); // List<String> | Find events that are about a particular category. You can specify up to 20 categories in a single search. If multiple `categoryUri` parameters are provided, then events that are about any of the specified categories will be returned, unless you specify `categoryOper` parameter and set it to 'and'. Check [autosuggest methods](https://eventregistry.org/documentation?tab=suggCategories) to get value for a specified category name.
List<String> sourceUri = Arrays.asList("sourceUri_example"); // List<String> | Find events that contain one or more articles that have been written by a specific news source. Check [autosuggest methods](https://eventregistry.org/documentation?tab=suggSources) to get value for a source name.
List<String> sourceLocationUri = Arrays.asList("sourceLocationUri_example"); // List<String> | Find events that contain one or more articles by news sources located at the given geographic location (city or a country). Check [autosuggest methods](https://eventregistry.org/documentation?tab=suggLocations) to get value for a location name.
List<String> sourceGroupUri = Arrays.asList("sourceGroupUri_example"); // List<String> | Find events that contain one or more articles by news sources that are assigned to the predefined group of news sources. Check [autosuggest methods](https://eventregistry.org/documentation?tab=suggSourceGroups) to get value for a source group or find the uri.
List<String> authorUri = Arrays.asList("authorUri_example"); // List<String> | Find events that contain articles that were written by a particular author. Check [autosuggest methods](https://eventregistry.org/documentation?tab=suggAuthors) to get value for author uri based on the author name (and potentially source url).
List<String> locationUri = Arrays.asList("locationUri_example"); // List<String> | Find events that occurred at a particular geographic location. Check [autosuggest methods](https://eventregistry.org/documentation?tab=suggLocations) to get URI value for a given location name.
List<String> lang = Arrays.asList("lang_example"); // List<String> | Find events that contain articles in the specified language(s).
String dateStart = "dateStart_example"; // String | Limit the events to those that occured on or after this date. The date of the event is extracted from the news articles about the event and are potentially quite different than the dates when the articles about the event were published.
String dateEnd = "dateEnd_example"; // String | Limit the events to those that occured before or on this date. The date of the event is extracted from the news articles about the event and are potentially quite different than the dates when the articles about the event were published.
Integer minSentimentEvent = 56; // Integer | the minimum value of the sentiment, the event should have. Valid value is any floating number between -1 (very negative) to 1 (very positive). 0 represents neutral sentiment. Note that setting the value will automatically reduce results to events covered in English, since the sentiment can only be computed for English language.
Integer maxSentimentEvent = 56; // Integer | the maximum value of the sentiment, the event should have. Valid value is any floating number between -1 (very negative) to 1 (very positive). 0 represents neutral sentiment. Note that setting the value will automatically reduce results to events covered in English, since the sentiment can only be computed for English language.
Integer minArticlesInEvent = 56; // Integer | Find events that have been reported in at least `minArticlesInEvent` articles (regardless of language).
Integer maxArticlesInEvent = 56; // Integer | Find events that have not been reported in more than `maxArticlesInEvent` articles (regardless of language)
String reportingDateStart = "reportingDateStart_example"; // String | Limit the events to those for which the reporting date was on or after this date. The reporting date is computed by analyzing all the dates when the articles about an event were published and computing the average value.
String reportingDateEnd = "reportingDateEnd_example"; // String | Limit the events to those for which the reporting date was before or on this date. The reporting date is computed by analyzing all the dates when the articles about an event were published and computing the average value.
String dateMentionStart = "dateMentionStart_example"; // String | Ignore events (that contain one or more articles) or articles that explicitly mention a date that is equal or greater than `dateMentionStart`.
String dateMentionEnd = "dateMentionEnd_example"; // String | Ignore events (that contain one or more articles) or articles that explicitly mention a date that is lower or equal to `dateMentionEnd`.
String keywordLoc = "body"; // String | What data should be used when searching using the keywords provided by `keywords` parameter.
String keywordOper = "and"; // String | If more keywords are provided with the `keyword` parameter, what should be the Boolean operator used. If 'and' (default) then all of the specified keywords have to be present in the article about an event; if 'or' then an event will be returned if it's articles mentions any of the provided keywords.
String conceptOper = "and"; // String | If more concepts are provided with the `conceptUri` parameter, what should be the Boolean operator used. If 'and' (default) then all of the specified concepts have to be present in the event; if 'or' then an event will be returned if it mentions any of the provided concepts.
String categoryOper = "or"; // String | If more categories are provided with the `categoryUri` parameter, what should be the Boolean operator used. If 'and' then all of the specified categories have to be present in the event; if 'or' then an event will be returned if it mentions any of the provided categories.
List<String> ignoreKeyword = Arrays.asList("ignoreKeyword_example"); // List<String> | Ignore events in which news articles mention the specified keyword or phrase. If you specify multiple `ignoreKeyword` parameters, then events with articles that mention any of these keywords will be ignored.
List<String> ignoreConceptUri = Arrays.asList("ignoreConceptUri_example"); // List<String> | Ignore events for which the concept with concept uri is important. You can specify up to 50 concepts in a single search. If you specify multiple `ignoreConceptUri` parameters, then events that mention any of them will be ignored. Check [autosuggest methods](https://eventregistry.org/documentation?tab=suggConcepts) to get value for a specified concept label.
List<String> ignoreCategoryUri = Arrays.asList("ignoreCategoryUri_example"); // List<String> | Ignore events that are about a particular category. You can specify up to 20 categories in a single search. If you specify multiple `ignoreCategoryUri` parameters, then events that mention any of them will be ignored. Check [autosuggest methods](https://eventregistry.org/documentation?tab=suggCategories) to get value for a specified category name.
List<String> ignoreSourceUri = Arrays.asList("ignoreSourceUri_example"); // List<String> | Ignore events that contain one or more articles that have been written by a news source. Check [autosuggest methods](https://eventregistry.org/documentation?tab=suggSources) to get value for a source name.
List<String> ignoreSourceLocationUri = Arrays.asList("ignoreSourceLocationUri_example"); // List<String> | Ignore events that contain one or more articles by news sources located at the given geographic location (city or a country). Check [autosuggest methods](https://eventregistry.org/documentation?tab=suggLocations) to get value for a location name.
List<String> ignoreSourceGroupUri = Arrays.asList("ignoreSourceGroupUri_example"); // List<String> | Ignore events that contain one or more articles by news sources that are assigned to the specified group of news sources. Check [autosuggest methods](https://eventregistry.org/documentation?tab=suggSourceGroups) to get value for a source group or find the uri.
List<String> ignoreAuthorUri = Arrays.asList("ignoreAuthorUri_example"); // List<String> | Ignore events that contain articles, which were written by a particular author. Check [autosuggest methods](https://eventregistry.org/documentation?tab=suggAuthors) to get value for author uri based on the author name (and potentially source url).
List<String> ignoreLocationUri = Arrays.asList("ignoreLocationUri_example"); // List<String> | Ignore events that occurred at a particular geographic location. Check [autosuggest methods](https://eventregistry.org/documentation?tab=suggLocations) to get URI value for a given location name.
List<String> ignoreLang = Arrays.asList("ignoreLang_example"); // List<String> | Ignore events that contain articles in the specified language(s).
String ignoreKeywordLoc = "ignoreKeywordLoc_example"; // String | What data should be used when searching using the keywords provided by `ignoreKeywords` parameter.
Boolean includeEventTitle = true; // Boolean | Set this parameter to true to include the event title in the response.
Boolean includeEventSummary = false; // Boolean | Set this parameter to true to include the event summary in the response.
Boolean includeEventSocialScore = false; // Boolean | Set this parameter to true to include the event social score in the response.
Boolean includeEventSentiment = true; // Boolean | Set this parameter to true to include the event sentiment in the response.
Boolean includeEventLocation = true; // Boolean | Set this parameter to true to include the event location in the response.
Boolean includeEventDate = true; // Boolean | Set this parameter to true to include the event date in the response.
Boolean includeEventArticleCounts = true; // Boolean | Set this parameter to true to include the article counts for events in the response.
Boolean includeEventConcepts = true; // Boolean | Set this parameter to true to include the event concepts in the response.
Boolean includeEventCategories = true; // Boolean | Set this parameter to true to include the event categories in the response.
Boolean includeEventCommonDates = false; // Boolean | Set this parameter to true to include the event commmon dates in the response.
Boolean includeEventStories = false; // Boolean | Set this parameter to true to include the event stories in the response.
Integer eventImageCount = 56; // Integer | Define how many images you would like to have in the response.
Boolean includeConceptLabel = true; // Boolean | Set this parameter to true to include the concept label in the response.
Boolean includeConceptImage = false; // Boolean | Set this parameter to true to include the concept image in the response.
Boolean includeConceptSynonyms = false; // Boolean | Set this parameter to true to include the concept synonyms in the response.
String conceptLang = "eng"; // String | Define the language of the concept label.
Boolean includeStoryBasicStats = false; // Boolean | Set this parameter to true to include story basic stats in the response.
Boolean includeStoryTitle = false; // Boolean | Set this parameter to true to include the story title in the response.
Boolean includeStoryLocation = false; // Boolean | Set this parameter to true to include the story location in the response.
Boolean includeStoryDate = false; // Boolean | Set this parameter to true to include the story date in the response.
Boolean includeStoryConcepts = false; // Boolean | Set this parameter to true to include the story concepts in the response.
Boolean includeStoryCategories = false; // Boolean | Set this parameter to true to include the story categories in the response.
Boolean includeStoryMedoidArticle = false; // Boolean | Set this parameter to true to include story medoid article in the response.
Boolean includeStoryCommonDates = false; // Boolean | Set this parameter to true to include story common dates in the response.
Integer storyImageCount = 56; // Integer | Define how many images you would like to have in the response.
Boolean includeCategoryParentUri = false; // Boolean | Set this parameter to true to include category parent uri in the response.
Boolean includeLocationPopulation = false; // Boolean | Set to true to include the population size of the location
Boolean includeLocationGeoNamesId = false; // Boolean | Set to true to include the GeoNames id of the location
Boolean includeLocationCountryArea = false; // Boolean | Set to true to include the are of the location in squared km.
Boolean includeLocationCountryContinent = false; // Boolean | Set to true to get the continent of the country for location objects.
try {
    InlineResponse2007 result = apiInstance.getEvents(apiKey, resultType, eventsPage, eventsCount, eventsSortBy, eventsSortByAsc, query, keyword, conceptUri, categoryUri, sourceUri, sourceLocationUri, sourceGroupUri, authorUri, locationUri, lang, dateStart, dateEnd, minSentimentEvent, maxSentimentEvent, minArticlesInEvent, maxArticlesInEvent, reportingDateStart, reportingDateEnd, dateMentionStart, dateMentionEnd, keywordLoc, keywordOper, conceptOper, categoryOper, ignoreKeyword, ignoreConceptUri, ignoreCategoryUri, ignoreSourceUri, ignoreSourceLocationUri, ignoreSourceGroupUri, ignoreAuthorUri, ignoreLocationUri, ignoreLang, ignoreKeywordLoc, includeEventTitle, includeEventSummary, includeEventSocialScore, includeEventSentiment, includeEventLocation, includeEventDate, includeEventArticleCounts, includeEventConcepts, includeEventCategories, includeEventCommonDates, includeEventStories, eventImageCount, includeConceptLabel, includeConceptImage, includeConceptSynonyms, conceptLang, includeStoryBasicStats, includeStoryTitle, includeStoryLocation, includeStoryDate, includeStoryConcepts, includeStoryCategories, includeStoryMedoidArticle, includeStoryCommonDates, storyImageCount, includeCategoryParentUri, includeLocationPopulation, includeLocationGeoNamesId, includeLocationCountryArea, includeLocationCountryContinent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#getEvents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**| Your API key |
 **resultType** | [**List&lt;String&gt;**](String.md)| Define what kind of results you would like to get. | [optional] [enum: events, uriWgtList, timeAggr, locAggr, locTimeAggr, sourceAggr, authorAggr, keywordAggr, conceptAggr, conceptGraph, categoryAggr, breakingEvents, eventClusters, sentimentAggr, dateMentionAggr, recentActivityEvents]
 **eventsPage** | **Integer**| Determines the page of the results to return (starting from 1). Relevant when &#x60;resultType &#x3D; events&#x60;. | [optional] [default to 1]
 **eventsCount** | **Integer**| Define how many events (up to 50) will be returned. Relevant when &#x60;resultType &#x3D; events&#x60;. | [optional] [default to 50]
 **eventsSortBy** | **String**| Set how you would like to sort your results. &#x60;date&#x60; (by event date), &#x60;rel&#x60; (relevance to the query), &#x60;size&#x60; (number of articles),     &#x60;socialScore&#x60; (amount of shares in social media). Relevant when &#x60;resultType &#x3D; events&#x60;. | [optional] [default to date] [enum: date, rel, size, socialScore]
 **eventsSortByAsc** | **Boolean**| Should the results be ordered in ascending order or descending order (default) based on the sorting criteria. Relevant when &#x60;resultType &#x3D; events&#x60;. | [optional] [default to false]
 **query** | [**Query1**](.md)| Query object with one or more search conditions. The &#x60;query&#x60; object should match the [Advanced Query Language](https://github.com/EventRegistry/event-registry-python/wiki/Searching-for-events#advanced-query-language) format. If you specify the &#x60;query&#x60; parameter, then the query parameters specified directly (&#x60;keyword&#x60;, &#x60;conceptUri&#x60;, &#x60;sourceUri&#x60;, &#x60;categoryUri&#x60;, etc) will be ignored. | [optional]
 **keyword** | [**List&lt;String&gt;**](String.md)| Find events in which news articles mention the specified keyword or a phrase. If you specify multiple &#x60;keyword&#x60; parameters, then only events with articles that mention all of them will be returned, unless you specify &#x60;keywordOper&#x60; parameter and set it to &#x27;or&#x27;. | [optional]
 **conceptUri** | [**List&lt;String&gt;**](String.md)| Find events for which the concept with concept uri is important. You can specify up to 50 concepts in a single search. If multiple &#x60;conceptUri&#x60; parameters are provided, then only events that are about all specified concepts will be returned, unless you specify &#x60;conceptOper&#x60; parameter and set it to &#x27;or&#x27;. Check [autosuggest methods](https://eventregistry.org/documentation?tab&#x3D;suggConcepts) to get concept URI value for a specified concept label. | [optional]
 **categoryUri** | [**List&lt;String&gt;**](String.md)| Find events that are about a particular category. You can specify up to 20 categories in a single search. If multiple &#x60;categoryUri&#x60; parameters are provided, then events that are about any of the specified categories will be returned, unless you specify &#x60;categoryOper&#x60; parameter and set it to &#x27;and&#x27;. Check [autosuggest methods](https://eventregistry.org/documentation?tab&#x3D;suggCategories) to get value for a specified category name. | [optional]
 **sourceUri** | [**List&lt;String&gt;**](String.md)| Find events that contain one or more articles that have been written by a specific news source. Check [autosuggest methods](https://eventregistry.org/documentation?tab&#x3D;suggSources) to get value for a source name. | [optional]
 **sourceLocationUri** | [**List&lt;String&gt;**](String.md)| Find events that contain one or more articles by news sources located at the given geographic location (city or a country). Check [autosuggest methods](https://eventregistry.org/documentation?tab&#x3D;suggLocations) to get value for a location name. | [optional]
 **sourceGroupUri** | [**List&lt;String&gt;**](String.md)| Find events that contain one or more articles by news sources that are assigned to the predefined group of news sources. Check [autosuggest methods](https://eventregistry.org/documentation?tab&#x3D;suggSourceGroups) to get value for a source group or find the uri. | [optional]
 **authorUri** | [**List&lt;String&gt;**](String.md)| Find events that contain articles that were written by a particular author. Check [autosuggest methods](https://eventregistry.org/documentation?tab&#x3D;suggAuthors) to get value for author uri based on the author name (and potentially source url). | [optional]
 **locationUri** | [**List&lt;String&gt;**](String.md)| Find events that occurred at a particular geographic location. Check [autosuggest methods](https://eventregistry.org/documentation?tab&#x3D;suggLocations) to get URI value for a given location name. | [optional]
 **lang** | [**List&lt;String&gt;**](String.md)| Find events that contain articles in the specified language(s). | [optional] [enum: eng, spa, deu, zho, slv, cat, por, ita, fra, rus, ara, tur, hrv, srp, ind, ces, slk, pol, eus, hun, nld, swe, fin, dan, ell, ron, bul, ukr, fas, hin, urd]
 **dateStart** | **String**| Limit the events to those that occured on or after this date. The date of the event is extracted from the news articles about the event and are potentially quite different than the dates when the articles about the event were published. | [optional]
 **dateEnd** | **String**| Limit the events to those that occured before or on this date. The date of the event is extracted from the news articles about the event and are potentially quite different than the dates when the articles about the event were published. | [optional]
 **minSentimentEvent** | **Integer**| the minimum value of the sentiment, the event should have. Valid value is any floating number between -1 (very negative) to 1 (very positive). 0 represents neutral sentiment. Note that setting the value will automatically reduce results to events covered in English, since the sentiment can only be computed for English language. | [optional]
 **maxSentimentEvent** | **Integer**| the maximum value of the sentiment, the event should have. Valid value is any floating number between -1 (very negative) to 1 (very positive). 0 represents neutral sentiment. Note that setting the value will automatically reduce results to events covered in English, since the sentiment can only be computed for English language. | [optional]
 **minArticlesInEvent** | **Integer**| Find events that have been reported in at least &#x60;minArticlesInEvent&#x60; articles (regardless of language). | [optional]
 **maxArticlesInEvent** | **Integer**| Find events that have not been reported in more than &#x60;maxArticlesInEvent&#x60; articles (regardless of language) | [optional]
 **reportingDateStart** | **String**| Limit the events to those for which the reporting date was on or after this date. The reporting date is computed by analyzing all the dates when the articles about an event were published and computing the average value. | [optional]
 **reportingDateEnd** | **String**| Limit the events to those for which the reporting date was before or on this date. The reporting date is computed by analyzing all the dates when the articles about an event were published and computing the average value. | [optional]
 **dateMentionStart** | **String**| Ignore events (that contain one or more articles) or articles that explicitly mention a date that is equal or greater than &#x60;dateMentionStart&#x60;. | [optional]
 **dateMentionEnd** | **String**| Ignore events (that contain one or more articles) or articles that explicitly mention a date that is lower or equal to &#x60;dateMentionEnd&#x60;. | [optional]
 **keywordLoc** | **String**| What data should be used when searching using the keywords provided by &#x60;keywords&#x60; parameter. | [optional] [default to body] [enum: body, title, body,title]
 **keywordOper** | **String**| If more keywords are provided with the &#x60;keyword&#x60; parameter, what should be the Boolean operator used. If &#x27;and&#x27; (default) then all of the specified keywords have to be present in the article about an event; if &#x27;or&#x27; then an event will be returned if it&#x27;s articles mentions any of the provided keywords. | [optional] [default to and] [enum: and, or]
 **conceptOper** | **String**| If more concepts are provided with the &#x60;conceptUri&#x60; parameter, what should be the Boolean operator used. If &#x27;and&#x27; (default) then all of the specified concepts have to be present in the event; if &#x27;or&#x27; then an event will be returned if it mentions any of the provided concepts. | [optional] [default to and] [enum: and, or]
 **categoryOper** | **String**| If more categories are provided with the &#x60;categoryUri&#x60; parameter, what should be the Boolean operator used. If &#x27;and&#x27; then all of the specified categories have to be present in the event; if &#x27;or&#x27; then an event will be returned if it mentions any of the provided categories. | [optional] [default to or] [enum: and, or]
 **ignoreKeyword** | [**List&lt;String&gt;**](String.md)| Ignore events in which news articles mention the specified keyword or phrase. If you specify multiple &#x60;ignoreKeyword&#x60; parameters, then events with articles that mention any of these keywords will be ignored. | [optional]
 **ignoreConceptUri** | [**List&lt;String&gt;**](String.md)| Ignore events for which the concept with concept uri is important. You can specify up to 50 concepts in a single search. If you specify multiple &#x60;ignoreConceptUri&#x60; parameters, then events that mention any of them will be ignored. Check [autosuggest methods](https://eventregistry.org/documentation?tab&#x3D;suggConcepts) to get value for a specified concept label. | [optional]
 **ignoreCategoryUri** | [**List&lt;String&gt;**](String.md)| Ignore events that are about a particular category. You can specify up to 20 categories in a single search. If you specify multiple &#x60;ignoreCategoryUri&#x60; parameters, then events that mention any of them will be ignored. Check [autosuggest methods](https://eventregistry.org/documentation?tab&#x3D;suggCategories) to get value for a specified category name. | [optional]
 **ignoreSourceUri** | [**List&lt;String&gt;**](String.md)| Ignore events that contain one or more articles that have been written by a news source. Check [autosuggest methods](https://eventregistry.org/documentation?tab&#x3D;suggSources) to get value for a source name. | [optional]
 **ignoreSourceLocationUri** | [**List&lt;String&gt;**](String.md)| Ignore events that contain one or more articles by news sources located at the given geographic location (city or a country). Check [autosuggest methods](https://eventregistry.org/documentation?tab&#x3D;suggLocations) to get value for a location name. | [optional]
 **ignoreSourceGroupUri** | [**List&lt;String&gt;**](String.md)| Ignore events that contain one or more articles by news sources that are assigned to the specified group of news sources. Check [autosuggest methods](https://eventregistry.org/documentation?tab&#x3D;suggSourceGroups) to get value for a source group or find the uri. | [optional]
 **ignoreAuthorUri** | [**List&lt;String&gt;**](String.md)| Ignore events that contain articles, which were written by a particular author. Check [autosuggest methods](https://eventregistry.org/documentation?tab&#x3D;suggAuthors) to get value for author uri based on the author name (and potentially source url). | [optional]
 **ignoreLocationUri** | [**List&lt;String&gt;**](String.md)| Ignore events that occurred at a particular geographic location. Check [autosuggest methods](https://eventregistry.org/documentation?tab&#x3D;suggLocations) to get URI value for a given location name. | [optional]
 **ignoreLang** | [**List&lt;String&gt;**](String.md)| Ignore events that contain articles in the specified language(s). | [optional] [enum: eng, spa, deu, zho, slv, cat, por, ita, fra, rus, ara, tur, hrv, srp, ind, ces, slk, pol, eus, hun, nld, swe, fin, dan, ell, ron, bul, ukr, fas, hin, urd]
 **ignoreKeywordLoc** | **String**| What data should be used when searching using the keywords provided by &#x60;ignoreKeywords&#x60; parameter. | [optional] [enum: body, title, body,title]
 **includeEventTitle** | **Boolean**| Set this parameter to true to include the event title in the response. | [optional] [default to true]
 **includeEventSummary** | **Boolean**| Set this parameter to true to include the event summary in the response. | [optional] [default to false]
 **includeEventSocialScore** | **Boolean**| Set this parameter to true to include the event social score in the response. | [optional] [default to false]
 **includeEventSentiment** | **Boolean**| Set this parameter to true to include the event sentiment in the response. | [optional] [default to true]
 **includeEventLocation** | **Boolean**| Set this parameter to true to include the event location in the response. | [optional] [default to true]
 **includeEventDate** | **Boolean**| Set this parameter to true to include the event date in the response. | [optional] [default to true]
 **includeEventArticleCounts** | **Boolean**| Set this parameter to true to include the article counts for events in the response. | [optional] [default to true]
 **includeEventConcepts** | **Boolean**| Set this parameter to true to include the event concepts in the response. | [optional] [default to true]
 **includeEventCategories** | **Boolean**| Set this parameter to true to include the event categories in the response. | [optional] [default to true]
 **includeEventCommonDates** | **Boolean**| Set this parameter to true to include the event commmon dates in the response. | [optional] [default to false]
 **includeEventStories** | **Boolean**| Set this parameter to true to include the event stories in the response. | [optional] [default to false]
 **eventImageCount** | **Integer**| Define how many images you would like to have in the response. | [optional]
 **includeConceptLabel** | **Boolean**| Set this parameter to true to include the concept label in the response. | [optional] [default to true]
 **includeConceptImage** | **Boolean**| Set this parameter to true to include the concept image in the response. | [optional] [default to false]
 **includeConceptSynonyms** | **Boolean**| Set this parameter to true to include the concept synonyms in the response. | [optional] [default to false]
 **conceptLang** | **String**| Define the language of the concept label. | [optional] [default to eng]
 **includeStoryBasicStats** | **Boolean**| Set this parameter to true to include story basic stats in the response. | [optional] [default to false]
 **includeStoryTitle** | **Boolean**| Set this parameter to true to include the story title in the response. | [optional] [default to false]
 **includeStoryLocation** | **Boolean**| Set this parameter to true to include the story location in the response. | [optional] [default to false]
 **includeStoryDate** | **Boolean**| Set this parameter to true to include the story date in the response. | [optional] [default to false]
 **includeStoryConcepts** | **Boolean**| Set this parameter to true to include the story concepts in the response. | [optional] [default to false]
 **includeStoryCategories** | **Boolean**| Set this parameter to true to include the story categories in the response. | [optional] [default to false]
 **includeStoryMedoidArticle** | **Boolean**| Set this parameter to true to include story medoid article in the response. | [optional] [default to false]
 **includeStoryCommonDates** | **Boolean**| Set this parameter to true to include story common dates in the response. | [optional] [default to false]
 **storyImageCount** | **Integer**| Define how many images you would like to have in the response. | [optional]
 **includeCategoryParentUri** | **Boolean**| Set this parameter to true to include category parent uri in the response. | [optional] [default to false]
 **includeLocationPopulation** | **Boolean**| Set to true to include the population size of the location | [optional] [default to false]
 **includeLocationGeoNamesId** | **Boolean**| Set to true to include the GeoNames id of the location | [optional] [default to false]
 **includeLocationCountryArea** | **Boolean**| Set to true to include the are of the location in squared km. | [optional] [default to false]
 **includeLocationCountryContinent** | **Boolean**| Set to true to get the continent of the country for location objects. | [optional] [default to false]

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEventsForTopicPage"></a>
# **getEventsForTopicPage**
> InlineResponse2008 getEventsForTopicPage(apiKey, uri, resultType, eventsPage, eventsCount, eventsSortBy, eventsSortByAsc, includeEventTitle, includeEventSummary, includeEventSocialScore, includeEventSentiment, includeEventLocation, includeEventDate, includeEventArticleCounts, includeEventConcepts, includeEventCategories, includeEventCommonDates, includeEventStories, eventImageCount, includeConceptLabel, includeConceptImage, includeConceptSynonyms, conceptLang, includeStoryBasicStats, includeStoryTitle, includeStoryLocation, includeStoryDate, includeStoryConcepts, includeStoryCategories, includeStoryMedoidArticle, includeStoryCommonDates, storyImageCount, includeCategoryParentUri, includeLocationPopulation, includeLocationGeoNamesId, includeLocationCountryArea, includeLocationCountryContinent)

Obtain events that match a user generated topic page

Retrieve the events that match the topic page the user generated on the [monitoring page](https://eventregistry.org/monitoring).  The topic page has to be created using the web interface and can be defined by a list of concepts, keywords, news sources, categories and other available conditions. Each topic page has a uniqe id, called a URI. When you open the topic page, the URI is displayed in the url in the browser. Use that URI as the &#x60;uri&#x60; parameter when making the API calls.  Compared to the &#x60;getEvents&#x60; endpoint, this endpoint is well suited when you want to find events that match a broader topic that can be defined using a set of concepts and keywords. These concepts and keywords don&#x27;t all need to be mentioned in an event, but the more of them are mentioned, the higher will the event be in the list of results. By default, the returned events are sorted based on how well they match the topic, but you can also change the sorting by setting the &#x60;eventsSortBy&#x60; parameter.  The results of the search can be the list of matching events (when &#x60;resultType &#x3D; events&#x60;, default) or one of the various aggregates (summaries) of the matching events. In case of &#x60;resultType &#x3D; timeAggr&#x60;, for example, the returned data will contain information *when* the matching events occurred.  Details about the returned information is available on the **[data model page](https://github.com/EventRegistry/event-registry-python/wiki/Data-models)**. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EventsApi;


EventsApi apiInstance = new EventsApi();
String apiKey = "apiKey_example"; // String | Your API key
String uri = "uri_example"; // String | URI of the topic page for which you wish to retrieve matching events. Obtain the URI from the URL on the [monitoring page](https://eventregistry.org/monitoring) when the topic page is opened.
String resultType = "events"; // String | Define what kind of results you would like to get.
Integer eventsPage = 1; // Integer | Determines the page of the results to return (starting from 1). Relevant when `resultType = events`.
Integer eventsCount = 50; // Integer | Define how many events (up to 50) will be returned. Relevant when `resultType = events`.
String eventsSortBy = "rel"; // String | Set how you would like to sort your results. `date` (by event date), `rel` (relevance to the query), `size` (number of articles),     `socialScore` (amount of shares in social media). Relevant when `resultType = events`.
Boolean eventsSortByAsc = false; // Boolean | Should the results be ordered in ascending order or descending order (default) based on the sorting criteria. Relevant when `resultType = events`.
Boolean includeEventTitle = true; // Boolean | Set this parameter to true to include the event title in the response.
Boolean includeEventSummary = false; // Boolean | Set this parameter to true to include the event summary in the response.
Boolean includeEventSocialScore = false; // Boolean | Set this parameter to true to include the event social score in the response.
Boolean includeEventSentiment = true; // Boolean | Set this parameter to true to include the event sentiment in the response.
Boolean includeEventLocation = true; // Boolean | Set this parameter to true to include the event location in the response.
Boolean includeEventDate = true; // Boolean | Set this parameter to true to include the event date in the response.
Boolean includeEventArticleCounts = true; // Boolean | Set this parameter to true to include the article counts for events in the response.
Boolean includeEventConcepts = true; // Boolean | Set this parameter to true to include the event concepts in the response.
Boolean includeEventCategories = true; // Boolean | Set this parameter to true to include the event categories in the response.
Boolean includeEventCommonDates = false; // Boolean | Set this parameter to true to include the event commmon dates in the response.
Boolean includeEventStories = false; // Boolean | Set this parameter to true to include the event stories in the response.
Integer eventImageCount = 56; // Integer | Define how many images you would like to have in the response.
Boolean includeConceptLabel = true; // Boolean | Set this parameter to true to include the concept label in the response.
Boolean includeConceptImage = false; // Boolean | Set this parameter to true to include the concept image in the response.
Boolean includeConceptSynonyms = false; // Boolean | Set this parameter to true to include the concept synonyms in the response.
String conceptLang = "eng"; // String | Define the language of the concept label.
Boolean includeStoryBasicStats = false; // Boolean | Set this parameter to true to include story basic stats in the response.
Boolean includeStoryTitle = false; // Boolean | Set this parameter to true to include the story title in the response.
Boolean includeStoryLocation = false; // Boolean | Set this parameter to true to include the story location in the response.
Boolean includeStoryDate = false; // Boolean | Set this parameter to true to include the story date in the response.
Boolean includeStoryConcepts = false; // Boolean | Set this parameter to true to include the story concepts in the response.
Boolean includeStoryCategories = false; // Boolean | Set this parameter to true to include the story categories in the response.
Boolean includeStoryMedoidArticle = false; // Boolean | Set this parameter to true to include story medoid article in the response.
Boolean includeStoryCommonDates = false; // Boolean | Set this parameter to true to include story common dates in the response.
Integer storyImageCount = 56; // Integer | Define how many images you would like to have in the response.
Boolean includeCategoryParentUri = false; // Boolean | Set this parameter to true to include category parent uri in the response.
Boolean includeLocationPopulation = false; // Boolean | Set to true to include the population size of the location
Boolean includeLocationGeoNamesId = false; // Boolean | Set to true to include the GeoNames id of the location
Boolean includeLocationCountryArea = false; // Boolean | Set to true to include the are of the location in squared km.
Boolean includeLocationCountryContinent = false; // Boolean | Set to true to get the continent of the country for location objects.
try {
    InlineResponse2008 result = apiInstance.getEventsForTopicPage(apiKey, uri, resultType, eventsPage, eventsCount, eventsSortBy, eventsSortByAsc, includeEventTitle, includeEventSummary, includeEventSocialScore, includeEventSentiment, includeEventLocation, includeEventDate, includeEventArticleCounts, includeEventConcepts, includeEventCategories, includeEventCommonDates, includeEventStories, eventImageCount, includeConceptLabel, includeConceptImage, includeConceptSynonyms, conceptLang, includeStoryBasicStats, includeStoryTitle, includeStoryLocation, includeStoryDate, includeStoryConcepts, includeStoryCategories, includeStoryMedoidArticle, includeStoryCommonDates, storyImageCount, includeCategoryParentUri, includeLocationPopulation, includeLocationGeoNamesId, includeLocationCountryArea, includeLocationCountryContinent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#getEventsForTopicPage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**| Your API key |
 **uri** | **String**| URI of the topic page for which you wish to retrieve matching events. Obtain the URI from the URL on the [monitoring page](https://eventregistry.org/monitoring) when the topic page is opened. |
 **resultType** | **String**| Define what kind of results you would like to get. | [optional] [default to events] [enum: events, uriWgtList, timeAggr, locAggr, locTimeAggr, sourceAggr, authorAggr, keywordAggr, conceptAggr, conceptGraph, categoryAggr, breakingEvents, eventClusters, sentimentAggr, dateMentionAggr]
 **eventsPage** | **Integer**| Determines the page of the results to return (starting from 1). Relevant when &#x60;resultType &#x3D; events&#x60;. | [optional] [default to 1]
 **eventsCount** | **Integer**| Define how many events (up to 50) will be returned. Relevant when &#x60;resultType &#x3D; events&#x60;. | [optional] [default to 50]
 **eventsSortBy** | **String**| Set how you would like to sort your results. &#x60;date&#x60; (by event date), &#x60;rel&#x60; (relevance to the query), &#x60;size&#x60; (number of articles),     &#x60;socialScore&#x60; (amount of shares in social media). Relevant when &#x60;resultType &#x3D; events&#x60;. | [optional] [default to rel] [enum: date, rel, size, socialScore]
 **eventsSortByAsc** | **Boolean**| Should the results be ordered in ascending order or descending order (default) based on the sorting criteria. Relevant when &#x60;resultType &#x3D; events&#x60;. | [optional] [default to false]
 **includeEventTitle** | **Boolean**| Set this parameter to true to include the event title in the response. | [optional] [default to true]
 **includeEventSummary** | **Boolean**| Set this parameter to true to include the event summary in the response. | [optional] [default to false]
 **includeEventSocialScore** | **Boolean**| Set this parameter to true to include the event social score in the response. | [optional] [default to false]
 **includeEventSentiment** | **Boolean**| Set this parameter to true to include the event sentiment in the response. | [optional] [default to true]
 **includeEventLocation** | **Boolean**| Set this parameter to true to include the event location in the response. | [optional] [default to true]
 **includeEventDate** | **Boolean**| Set this parameter to true to include the event date in the response. | [optional] [default to true]
 **includeEventArticleCounts** | **Boolean**| Set this parameter to true to include the article counts for events in the response. | [optional] [default to true]
 **includeEventConcepts** | **Boolean**| Set this parameter to true to include the event concepts in the response. | [optional] [default to true]
 **includeEventCategories** | **Boolean**| Set this parameter to true to include the event categories in the response. | [optional] [default to true]
 **includeEventCommonDates** | **Boolean**| Set this parameter to true to include the event commmon dates in the response. | [optional] [default to false]
 **includeEventStories** | **Boolean**| Set this parameter to true to include the event stories in the response. | [optional] [default to false]
 **eventImageCount** | **Integer**| Define how many images you would like to have in the response. | [optional]
 **includeConceptLabel** | **Boolean**| Set this parameter to true to include the concept label in the response. | [optional] [default to true]
 **includeConceptImage** | **Boolean**| Set this parameter to true to include the concept image in the response. | [optional] [default to false]
 **includeConceptSynonyms** | **Boolean**| Set this parameter to true to include the concept synonyms in the response. | [optional] [default to false]
 **conceptLang** | **String**| Define the language of the concept label. | [optional] [default to eng]
 **includeStoryBasicStats** | **Boolean**| Set this parameter to true to include story basic stats in the response. | [optional] [default to false]
 **includeStoryTitle** | **Boolean**| Set this parameter to true to include the story title in the response. | [optional] [default to false]
 **includeStoryLocation** | **Boolean**| Set this parameter to true to include the story location in the response. | [optional] [default to false]
 **includeStoryDate** | **Boolean**| Set this parameter to true to include the story date in the response. | [optional] [default to false]
 **includeStoryConcepts** | **Boolean**| Set this parameter to true to include the story concepts in the response. | [optional] [default to false]
 **includeStoryCategories** | **Boolean**| Set this parameter to true to include the story categories in the response. | [optional] [default to false]
 **includeStoryMedoidArticle** | **Boolean**| Set this parameter to true to include story medoid article in the response. | [optional] [default to false]
 **includeStoryCommonDates** | **Boolean**| Set this parameter to true to include story common dates in the response. | [optional] [default to false]
 **storyImageCount** | **Integer**| Define how many images you would like to have in the response. | [optional]
 **includeCategoryParentUri** | **Boolean**| Set this parameter to true to include category parent uri in the response. | [optional] [default to false]
 **includeLocationPopulation** | **Boolean**| Set to true to include the population size of the location | [optional] [default to false]
 **includeLocationGeoNamesId** | **Boolean**| Set to true to include the GeoNames id of the location | [optional] [default to false]
 **includeLocationCountryArea** | **Boolean**| Set to true to include the are of the location in squared km. | [optional] [default to false]
 **includeLocationCountryContinent** | **Boolean**| Set to true to get the continent of the country for location objects. | [optional] [default to false]

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="minuteStreamEvents"></a>
# **minuteStreamEvents**
> InlineResponse20010 minuteStreamEvents(apiKey, recentActivityEventsMaxEventCount, recentActivityEventsUpdatesAfterMinsAgo, recentActivityEventsUpdatesAfterTm, keyword, conceptUri, categoryUri, sourceUri, sourceLocationUri, sourceGroupUri, authorUri, locationUri, keywordLoc, keywordOper, conceptOper, categoryOper, lang, minArticlesInEvent, maxArticlesInEvent)

The stream of events that were added or updated in the last minute

The API endpoint allows the user to obtain the full list of events that were added or updated in Event Registry in the last minute. This is the only API call that also allows returning more than 50 events per call. If more than 50 events are returned, then correspondingly higher number of tokens are used per call.  Without any additional filters, the API will return *all* events added/updated in the last minute. By specifying filters like &#x60;lang&#x60;, &#x60;keyword&#x60;, &#x60;conceptUri&#x60; and others, you can however limit the returned content to only the subset that matches these filters.  Examples of use are provided on the **[examples page](https://eventregistry.org/documentation/examples#event-registry-api-examples-events-minute-stream-events)**. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EventsApi;


EventsApi apiInstance = new EventsApi();
String apiKey = "apiKey_example"; // String | Your API key
Integer recentActivityEventsMaxEventCount = 50; // Integer | The maximum number of events to return. Maximum value specified can be 2.000. The number of used tokens will correspond to the number of returned events. For 200 returned events, for example, 4*5 tokens will be used - 5 tokens for each 50 events. 
Integer recentActivityEventsUpdatesAfterMinsAgo = 56; // Integer | The parameter can be used to retrieve not only the last minute of events, but more minutes. When using some filtering parameters below you use can use this parameter to call `minuteStreamEvents` endpoint only every few minutes and still retrieve all added content matching your filters. The value should be at most 240 (4 hours). 
String recentActivityEventsUpdatesAfterTm = "recentActivityEventsUpdatesAfterTm_example"; // String | The parameter can be used to retrieve events that were updated after the specified time. The value should be in format `YYYY-MM-DDTHH:MM:SS` and should represent datetime in UTC timezone. The value should be at most 4 hours in the past. 
List<String> keyword = Arrays.asList("keyword_example"); // List<String> | Find events in which news articles mention the specified keyword or a phrase. If you specify multiple `keyword` parameters, then only events with articles that mention all of them will be returned, unless you specify `keywordOper` parameter and set it to 'or'.
List<String> conceptUri = Arrays.asList("conceptUri_example"); // List<String> | Find events for which the concept with concept uri is important. You can specify up to 50 concepts in a single search. If multiple `conceptUri` parameters are provided, then only events that are about all specified concepts will be returned, unless you specify `conceptOper` parameter and set it to 'or'. Check [autosuggest methods](https://eventregistry.org/documentation?tab=suggConcepts) to get concept URI value for a specified concept label.
List<String> categoryUri = Arrays.asList("categoryUri_example"); // List<String> | Find events that are about a particular category. You can specify up to 20 categories in a single search. If multiple `categoryUri` parameters are provided, then events that are about any of the specified categories will be returned, unless you specify `categoryOper` parameter and set it to 'and'. Check [autosuggest methods](https://eventregistry.org/documentation?tab=suggCategories) to get value for a specified category name.
List<String> sourceUri = Arrays.asList("sourceUri_example"); // List<String> | Find events that contain one or more articles that have been written by a specific news source. Check [autosuggest methods](https://eventregistry.org/documentation?tab=suggSources) to get value for a source name.
List<String> sourceLocationUri = Arrays.asList("sourceLocationUri_example"); // List<String> | Find events that contain one or more articles by news sources located at the given geographic location (city or a country). Check [autosuggest methods](https://eventregistry.org/documentation?tab=suggLocations) to get value for a location name.
List<String> sourceGroupUri = Arrays.asList("sourceGroupUri_example"); // List<String> | Find events that contain one or more articles by news sources that are assigned to the predefined group of news sources. Check [autosuggest methods](https://eventregistry.org/documentation?tab=suggSourceGroups) to get value for a source group or find the uri.
List<String> authorUri = Arrays.asList("authorUri_example"); // List<String> | Find events that contain articles that were written by a particular author. Check [autosuggest methods](https://eventregistry.org/documentation?tab=suggAuthors) to get value for author uri based on the author name (and potentially source url).
List<String> locationUri = Arrays.asList("locationUri_example"); // List<String> | Find events that occurred at a particular geographic location. Check [autosuggest methods](https://eventregistry.org/documentation?tab=suggLocations) to get URI value for a given location name.
String keywordLoc = "body"; // String | What data should be used when searching using the keywords provided by `keywords` parameter.
String keywordOper = "and"; // String | If more keywords are provided with the `keyword` parameter, what should be the Boolean operator used. If 'and' (default) then all of the specified keywords have to be present in the article about an event; if 'or' then an event will be returned if it's articles mentions any of the provided keywords.
String conceptOper = "and"; // String | If more concepts are provided with the `conceptUri` parameter, what should be the Boolean operator used. If 'and' (default) then all of the specified concepts have to be present in the event; if 'or' then an event will be returned if it mentions any of the provided concepts.
String categoryOper = "or"; // String | If more categories are provided with the `categoryUri` parameter, what should be the Boolean operator used. If 'and' then all of the specified categories have to be present in the event; if 'or' then an event will be returned if it mentions any of the provided categories.
List<String> lang = Arrays.asList("lang_example"); // List<String> | Find events that contain articles in the specified language(s).
Integer minArticlesInEvent = 56; // Integer | Find events that have been reported in at least `minArticlesInEvent` articles (regardless of language).
Integer maxArticlesInEvent = 56; // Integer | Find events that have not been reported in more than `maxArticlesInEvent` articles (regardless of language)
try {
    InlineResponse20010 result = apiInstance.minuteStreamEvents(apiKey, recentActivityEventsMaxEventCount, recentActivityEventsUpdatesAfterMinsAgo, recentActivityEventsUpdatesAfterTm, keyword, conceptUri, categoryUri, sourceUri, sourceLocationUri, sourceGroupUri, authorUri, locationUri, keywordLoc, keywordOper, conceptOper, categoryOper, lang, minArticlesInEvent, maxArticlesInEvent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#minuteStreamEvents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**| Your API key |
 **recentActivityEventsMaxEventCount** | **Integer**| The maximum number of events to return. Maximum value specified can be 2.000. The number of used tokens will correspond to the number of returned events. For 200 returned events, for example, 4*5 tokens will be used - 5 tokens for each 50 events.  | [optional] [default to 50] [enum: 2000]
 **recentActivityEventsUpdatesAfterMinsAgo** | **Integer**| The parameter can be used to retrieve not only the last minute of events, but more minutes. When using some filtering parameters below you use can use this parameter to call &#x60;minuteStreamEvents&#x60; endpoint only every few minutes and still retrieve all added content matching your filters. The value should be at most 240 (4 hours).  | [optional]
 **recentActivityEventsUpdatesAfterTm** | **String**| The parameter can be used to retrieve events that were updated after the specified time. The value should be in format &#x60;YYYY-MM-DDTHH:MM:SS&#x60; and should represent datetime in UTC timezone. The value should be at most 4 hours in the past.  | [optional]
 **keyword** | [**List&lt;String&gt;**](String.md)| Find events in which news articles mention the specified keyword or a phrase. If you specify multiple &#x60;keyword&#x60; parameters, then only events with articles that mention all of them will be returned, unless you specify &#x60;keywordOper&#x60; parameter and set it to &#x27;or&#x27;. | [optional]
 **conceptUri** | [**List&lt;String&gt;**](String.md)| Find events for which the concept with concept uri is important. You can specify up to 50 concepts in a single search. If multiple &#x60;conceptUri&#x60; parameters are provided, then only events that are about all specified concepts will be returned, unless you specify &#x60;conceptOper&#x60; parameter and set it to &#x27;or&#x27;. Check [autosuggest methods](https://eventregistry.org/documentation?tab&#x3D;suggConcepts) to get concept URI value for a specified concept label. | [optional]
 **categoryUri** | [**List&lt;String&gt;**](String.md)| Find events that are about a particular category. You can specify up to 20 categories in a single search. If multiple &#x60;categoryUri&#x60; parameters are provided, then events that are about any of the specified categories will be returned, unless you specify &#x60;categoryOper&#x60; parameter and set it to &#x27;and&#x27;. Check [autosuggest methods](https://eventregistry.org/documentation?tab&#x3D;suggCategories) to get value for a specified category name. | [optional]
 **sourceUri** | [**List&lt;String&gt;**](String.md)| Find events that contain one or more articles that have been written by a specific news source. Check [autosuggest methods](https://eventregistry.org/documentation?tab&#x3D;suggSources) to get value for a source name. | [optional]
 **sourceLocationUri** | [**List&lt;String&gt;**](String.md)| Find events that contain one or more articles by news sources located at the given geographic location (city or a country). Check [autosuggest methods](https://eventregistry.org/documentation?tab&#x3D;suggLocations) to get value for a location name. | [optional]
 **sourceGroupUri** | [**List&lt;String&gt;**](String.md)| Find events that contain one or more articles by news sources that are assigned to the predefined group of news sources. Check [autosuggest methods](https://eventregistry.org/documentation?tab&#x3D;suggSourceGroups) to get value for a source group or find the uri. | [optional]
 **authorUri** | [**List&lt;String&gt;**](String.md)| Find events that contain articles that were written by a particular author. Check [autosuggest methods](https://eventregistry.org/documentation?tab&#x3D;suggAuthors) to get value for author uri based on the author name (and potentially source url). | [optional]
 **locationUri** | [**List&lt;String&gt;**](String.md)| Find events that occurred at a particular geographic location. Check [autosuggest methods](https://eventregistry.org/documentation?tab&#x3D;suggLocations) to get URI value for a given location name. | [optional]
 **keywordLoc** | **String**| What data should be used when searching using the keywords provided by &#x60;keywords&#x60; parameter. | [optional] [default to body] [enum: body, title, body,title]
 **keywordOper** | **String**| If more keywords are provided with the &#x60;keyword&#x60; parameter, what should be the Boolean operator used. If &#x27;and&#x27; (default) then all of the specified keywords have to be present in the article about an event; if &#x27;or&#x27; then an event will be returned if it&#x27;s articles mentions any of the provided keywords. | [optional] [default to and] [enum: and, or]
 **conceptOper** | **String**| If more concepts are provided with the &#x60;conceptUri&#x60; parameter, what should be the Boolean operator used. If &#x27;and&#x27; (default) then all of the specified concepts have to be present in the event; if &#x27;or&#x27; then an event will be returned if it mentions any of the provided concepts. | [optional] [default to and] [enum: and, or]
 **categoryOper** | **String**| If more categories are provided with the &#x60;categoryUri&#x60; parameter, what should be the Boolean operator used. If &#x27;and&#x27; then all of the specified categories have to be present in the event; if &#x27;or&#x27; then an event will be returned if it mentions any of the provided categories. | [optional] [default to or] [enum: and, or]
 **lang** | [**List&lt;String&gt;**](String.md)| Find events that contain articles in the specified language(s). | [optional] [enum: eng, spa, deu, zho, slv, cat, por, ita, fra, rus, ara, tur, hrv, srp, ind, ces, slk, pol, eus, hun, nld, swe, fin, dan, ell, ron, bul, ukr, fas, hin, urd]
 **minArticlesInEvent** | **Integer**| Find events that have been reported in at least &#x60;minArticlesInEvent&#x60; articles (regardless of language). | [optional]
 **maxArticlesInEvent** | **Integer**| Find events that have not been reported in more than &#x60;maxArticlesInEvent&#x60; articles (regardless of language) | [optional]

### Return type

[**InlineResponse20010**](InlineResponse20010.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

