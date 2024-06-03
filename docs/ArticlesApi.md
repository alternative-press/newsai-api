# ArticlesApi

All URIs are relative to *https://eventregistry.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**articleMapper**](ArticlesApi.md#articleMapper) | **GET** /api/v1/articleMapper | Mapping of the article URLs to the internal article URIs
[**getArticle**](ArticlesApi.md#getArticle) | **GET** /api/v1/article/getArticle | Obtain details about a single or multiple news articles
[**getArticles**](ArticlesApi.md#getArticles) | **GET** /api/v1/article/getArticles | Obtain articles that match one or more search conditions
[**getArticlesForTopicPage**](ArticlesApi.md#getArticlesForTopicPage) | **GET** /api/v1/article/getArticlesForTopicPage | Obtain articles that match a user generated topic page
[**minuteStreamArticles**](ArticlesApi.md#minuteStreamArticles) | **GET** /api/v1/minuteStreamArticles | The minute stream of news articles added to Event Registry

<a name="articleMapper"></a>
# **articleMapper**
> InlineResponse2006 articleMapper(apiKey, articleUrl, includeAllVersions, deep)

Mapping of the article URLs to the internal article URIs

You can use this API call if you need to map an article URL to the article URI that is used internally in Event Registry. Using the article URI you can then retrieve article information using the endpoint &#x60;/getArticle&#x60;.  Examples of use are provided on the **[examples page](https://eventregistry.org/documentation/examples#event-registry-api-examples-articles-article-mapper)**. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ArticlesApi;


ArticlesApi apiInstance = new ArticlesApi();
String apiKey = "apiKey_example"; // String | Your API key
String articleUrl = "articleUrl_example"; // String | Define the requested article URL.
Boolean includeAllVersions = true; // Boolean | Set this parameter to true to include all versions of the article.
Boolean deep = true; // Boolean | 
try {
    InlineResponse2006 result = apiInstance.articleMapper(apiKey, articleUrl, includeAllVersions, deep);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArticlesApi#articleMapper");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**| Your API key |
 **articleUrl** | **String**| Define the requested article URL. |
 **includeAllVersions** | **Boolean**| Set this parameter to true to include all versions of the article. | [optional]
 **deep** | **Boolean**|  | [optional]

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getArticle"></a>
# **getArticle**
> InlineResponse2004 getArticle(apiKey, articleUri, resultType, infoArticleBodyLen, includeArticleTitle, includeArticleBasicInfo, includeArticleBody, includeArticleEventUri, includeArticleSocialScore, includeArticleSentiment, includeArticleConcepts, includeArticleCategories, includeArticleLocation, includeArticleImage, includeArticleVideos, includeArticleLinks, includeArticleExtractedDates, includeArticleDuplicateList, includeArticleOriginalArticle, includeConceptLabel, includeConceptImage, includeConceptSynonyms, includeConceptTrendingScore, conceptLang, includeSourceTitle, includeSourceDescription, includeSourceLocation, includeSourceRanking, includeLocationPopulation, includeLocationGeoNamesId, includeLocationCountryArea, includeLocationCountryContinent)

Obtain details about a single or multiple news articles

Given a list of article URIs, obtain article details with all available meta-information.  Examples of use are provided on the **[examples page](https://eventregistry.org/documentation/examples#event-registry-api-examples-articles-get-article)**. Details about the returned information is available on the **[data model page](https://github.com/EventRegistry/event-registry-python/wiki/Data-models)**. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ArticlesApi;


ArticlesApi apiInstance = new ArticlesApi();
String apiKey = "apiKey_example"; // String | Your API key
List<String> articleUri = Arrays.asList("articleUri_example"); // List<String> | Articles are identifiable by their unique IDs (called URIs) that are assigned by Event Registry. Provide URI or a set of URIs.
List<String> resultType = Arrays.asList("resultType_example"); // List<String> | Define what kind of results you would like to get.
Integer infoArticleBodyLen = 300; // Integer | Set the size of the article body that'll be returned in the response. Use -1 for full article body.
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
Boolean includeArticleVideos = false; // Boolean | Set this parameter to true to include the article videos in the response.
Boolean includeArticleLinks = false; // Boolean | Set this parameter to true to include the article links in the response.
Boolean includeArticleExtractedDates = false; // Boolean | Set this parameter to true to include article extracted dates in the response.
Boolean includeArticleDuplicateList = false; // Boolean | Set this parameter to true to include the list of duplicate articles in the response.
Boolean includeArticleOriginalArticle = false; // Boolean | Set this parameter to true to include the original article in the response.
Boolean includeConceptLabel = true; // Boolean | Set this parameter to true to include the concept label in the response.
Boolean includeConceptImage = false; // Boolean | Set this parameter to true to include the concept image in the response.
Boolean includeConceptSynonyms = false; // Boolean | Set this parameter to true to include the concept synonyms in the response.
Boolean includeConceptTrendingScore = false; // Boolean | Set this parameter to true to include concept trending score in the response.
String conceptLang = "eng"; // String | Define the language of the concept label.
Boolean includeSourceTitle = true; // Boolean | Set this parameter to true to include the source title in the response.
Boolean includeSourceDescription = false; // Boolean | Set this parameter to true to include the source description in the response.
Boolean includeSourceLocation = false; // Boolean | Set this parameter to true to include the source location in the response.
Boolean includeSourceRanking = false; // Boolean | Set this parameter to true to include the source ranking in the response.
Boolean includeLocationPopulation = false; // Boolean | Set to true to include the population size of the location
Boolean includeLocationGeoNamesId = false; // Boolean | Set to true to include the GeoNames id of the location
Boolean includeLocationCountryArea = false; // Boolean | Set to true to include the are of the location in squared km.
Boolean includeLocationCountryContinent = false; // Boolean | Set to true to get the continent of the country for location objects.
try {
    InlineResponse2004 result = apiInstance.getArticle(apiKey, articleUri, resultType, infoArticleBodyLen, includeArticleTitle, includeArticleBasicInfo, includeArticleBody, includeArticleEventUri, includeArticleSocialScore, includeArticleSentiment, includeArticleConcepts, includeArticleCategories, includeArticleLocation, includeArticleImage, includeArticleVideos, includeArticleLinks, includeArticleExtractedDates, includeArticleDuplicateList, includeArticleOriginalArticle, includeConceptLabel, includeConceptImage, includeConceptSynonyms, includeConceptTrendingScore, conceptLang, includeSourceTitle, includeSourceDescription, includeSourceLocation, includeSourceRanking, includeLocationPopulation, includeLocationGeoNamesId, includeLocationCountryArea, includeLocationCountryContinent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArticlesApi#getArticle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**| Your API key |
 **articleUri** | [**List&lt;String&gt;**](String.md)| Articles are identifiable by their unique IDs (called URIs) that are assigned by Event Registry. Provide URI or a set of URIs. |
 **resultType** | [**List&lt;String&gt;**](String.md)| Define what kind of results you would like to get. | [optional] [enum: info, duplicatedArticles, originalArticle]
 **infoArticleBodyLen** | **Integer**| Set the size of the article body that&#x27;ll be returned in the response. Use -1 for full article body. | [optional] [default to 300]
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
 **includeArticleVideos** | **Boolean**| Set this parameter to true to include the article videos in the response. | [optional] [default to false]
 **includeArticleLinks** | **Boolean**| Set this parameter to true to include the article links in the response. | [optional] [default to false]
 **includeArticleExtractedDates** | **Boolean**| Set this parameter to true to include article extracted dates in the response. | [optional] [default to false]
 **includeArticleDuplicateList** | **Boolean**| Set this parameter to true to include the list of duplicate articles in the response. | [optional] [default to false]
 **includeArticleOriginalArticle** | **Boolean**| Set this parameter to true to include the original article in the response. | [optional] [default to false]
 **includeConceptLabel** | **Boolean**| Set this parameter to true to include the concept label in the response. | [optional] [default to true]
 **includeConceptImage** | **Boolean**| Set this parameter to true to include the concept image in the response. | [optional] [default to false]
 **includeConceptSynonyms** | **Boolean**| Set this parameter to true to include the concept synonyms in the response. | [optional] [default to false]
 **includeConceptTrendingScore** | **Boolean**| Set this parameter to true to include concept trending score in the response. | [optional] [default to false]
 **conceptLang** | **String**| Define the language of the concept label. | [optional] [default to eng]
 **includeSourceTitle** | **Boolean**| Set this parameter to true to include the source title in the response. | [optional] [default to true]
 **includeSourceDescription** | **Boolean**| Set this parameter to true to include the source description in the response. | [optional] [default to false]
 **includeSourceLocation** | **Boolean**| Set this parameter to true to include the source location in the response. | [optional] [default to false]
 **includeSourceRanking** | **Boolean**| Set this parameter to true to include the source ranking in the response. | [optional] [default to false]
 **includeLocationPopulation** | **Boolean**| Set to true to include the population size of the location | [optional] [default to false]
 **includeLocationGeoNamesId** | **Boolean**| Set to true to include the GeoNames id of the location | [optional] [default to false]
 **includeLocationCountryArea** | **Boolean**| Set to true to include the are of the location in squared km. | [optional] [default to false]
 **includeLocationCountryContinent** | **Boolean**| Set to true to get the continent of the country for location objects. | [optional] [default to false]

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getArticles"></a>
# **getArticles**
> InlineResponse2002 getArticles(apiKey, resultType, articlesPage, articlesCount, articlesSortBy, articlesSortByAsc, articleBodyLen, dataType, query, keyword, conceptUri, categoryUri, sourceUri, sourceLocationUri, sourceGroupUri, authorUri, locationUri, lang, dateStart, dateEnd, dateMentionStart, dateMentionEnd, keywordLoc, keywordOper, conceptOper, categoryOper, ignoreKeyword, ignoreConceptUri, ignoreCategoryUri, ignoreSourceUri, ignoreSourceLocationUri, ignoreSourceGroupUri, ignoreLocationUri, ignoreAuthorUri, ignoreLang, ignoreKeywordLoc, startSourceRankPercentile, endSourceRankPercentile, minSentimentArticle, maxSentimentArticle, isDuplicateFilter, hasDuplicateFilter, eventFilter, includeArticleTitle, includeArticleBasicInfo, includeArticleBody, includeArticleEventUri, includeArticleSocialScore, includeArticleSentiment, includeArticleConcepts, includeArticleCategories, includeArticleLocation, includeArticleImage, includeArticleVideos, includeArticleLinks, includeArticleExtractedDates, includeArticleDuplicateList, includeArticleOriginalArticle, includeSourceTitle, includeSourceDescription, includeSourceLocation, includeSourceRanking, includeConceptLabel, includeConceptImage, includeConceptSynonyms, includeConceptTrendingScore, conceptLang, includeCategoryParentUri, includeLocationGeoLocation, includeLocationPopulation, includeLocationGeoNamesId, includeLocationCountryArea, includeLocationCountryContinent)

Obtain articles that match one or more search conditions

Identify the news articles that match a certain set of search criteria.  The search conditions can be specified by setting the &#x60;query&#x60; parameter, or by specifying one or multiple search parameters, such as &#x60;keyword&#x60;, &#x60;conceptUri&#x60;, &#x60;sourceUri&#x60;, etc. To remove some of the results matching the *positive* conditions, you can specify some *negative* conditions using &#x60;ignoreKeyword&#x60;, &#x60;ignoreSourceUri&#x60;, and other &#x60;ignore*&#x60; parameters.  The results of the search can be the list of matching articles (when &#x60;resultType &#x3D; articles&#x60;) or one of the various aggregates (summaries) of the matching articles. In case of &#x60;resultType &#x3D; timeAggr&#x60;, for example, the returned data will contain information *when* were the articles matching the search criteria published.  Examples of use are provided on the **[examples page](https://eventregistry.org/documentation/examples#event-registry-api-examples-articles-get-articles)**. Details about the returned information is available on the **[data model page](https://github.com/EventRegistry/event-registry-python/wiki/Data-models)**. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ArticlesApi;


ArticlesApi apiInstance = new ArticlesApi();
String apiKey = "apiKey_example"; // String | Your API key
String resultType = "articles"; // String | Define what kind of results of the search you would like to get. Default value: articles.
Integer articlesPage = 1; // Integer | Determines the page of the results to return (starting from 1). Relevant when `resultType = articles`.
Integer articlesCount = 100; // Integer | Define how many articles (up to 100) will be returned. Relevant when `resultType = articles`.
String articlesSortBy = "date"; // String | Choose the criteria for sorting the news articles. `rel` (relevance to the query), `date` (publishing date), `sourceImportance` (manually curated score of source importance - high value, high importance), `sourceImportanceRank` (reverse of sourceImportance), `sourceAlexaGlobalRank` (global rank of the news source), `sourceAlexaCountryRank` (country rank of the news source), `socialScore` (total shares on social media), `facebookShares` (shares on Facebook only). Relevant when `resultType = articles`. 
Boolean articlesSortByAsc = false; // Boolean | Should the results be ordered in ascending order or descending order (default). Relevant when `resultType = articles`.
Integer articleBodyLen = -1; // Integer | Set the size of the article body that'll be returned in the response. Use -1 for full article body.
List<String> dataType = Arrays.asList("dataType_example"); // List<String> | What data types should we search? news content (default, `news`), press releases (`pr`) or blogs (`blog`).
Query query = new Query(); // Query | Query object with one or more search conditions. The `query` object should match the [Advanced Query Language](https://github.com/EventRegistry/event-registry-python/wiki/Searching-for-articles#advanced-query-language) format. If you specify the `query` parameter, then the query parameters specified directly (`keyword`, `conceptUri`, `sourceUri`, `categoryUri`, etc) will be ignored.
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
List<String> ignoreKeyword = Arrays.asList("ignoreKeyword_example"); // List<String> | Ignore articles that mention the specified keyword or phrase. You can specify at most 60 keywords in a single search. If you specify multiple `ignoreKeyword` parameters, then articles that mention any of these keywords will be ignored. 
List<String> ignoreConceptUri = Arrays.asList("ignoreConceptUri_example"); // List<String> | Ignore articles that mention the concept with concept uri. You can specify at most 50 concepts in a single search. If you specify multiple `ignoreConceptUri` parameters then articles that mention any of them will be ignored. Check [autosuggest methods](https://eventregistry.org/documentation?tab=suggConcepts) to get value for a specified concept label. 
List<String> ignoreCategoryUri = Arrays.asList("ignoreCategoryUri_example"); // List<String> | Ignore articles that are assigned into a particular category. You can specify at most 20 categories in a single search. If you specify multiple `ignoreCategoryUri` parameters then articles that mention any of them will be ignored. Check [autosuggest methods](https://eventregistry.org/documentation?tab=suggCategories) to get value for a specified category name. 
List<String> ignoreSourceUri = Arrays.asList("ignoreSourceUri_example"); // List<String> | Ignore articles that have been published by a news source. If you specify multiple `ignoreSourceUri` parameters, then articles from any of the specified sources will be ignored. Check [autosuggest methods](https://eventregistry.org/documentation?tab=suggSources) to get value for a source name. 
List<String> ignoreSourceLocationUri = Arrays.asList("ignoreSourceLocationUri_example"); // List<String> | Ignore articles that were published by news sources located at the given geographic location (city or country). If you specify multiple `ignoreSourceLocationUri` parameters, then articles from sources from any of the specified sources will be ignored. Check [autosuggest methods](https://eventregistry.org/documentation?tab=suggLocations) to get value for a location name. 
List<String> ignoreSourceGroupUri = Arrays.asList("ignoreSourceGroupUri_example"); // List<String> | Ignore articles that were published by news sources that are assigned to some predefined group of news sources. Check [autosuggest methods](https://eventregistry.org/documentation?tab=suggSourceGroups) to get value for a source group or find the uri. 
List<String> ignoreLocationUri = Arrays.asList("ignoreLocationUri_example"); // List<String> | Ignore articles that describe something that occured at a particular location (based on the location mentioned in the dateline). Check [autosuggest methods](https://eventregistry.org/documentation?tab=suggLocations) to get value for a location name.
List<String> ignoreAuthorUri = Arrays.asList("ignoreAuthorUri_example"); // List<String> | Ignore articles that were written by a particular author. Check [autosuggest methods](https://eventregistry.org/documentation?tab=suggAuthors) to get value for author uri based on the author name (and potentially source url).
List<String> ignoreLang = Arrays.asList("ignoreLang_example"); // List<String> | Ignore articles in the specified language(s). You can specify at most 5 languages in a single search.
String ignoreKeywordLoc = "ignoreKeywordLoc_example"; // String | What data should be used when searching using the keywords provided by `ignoreKeywords` parameter.
Integer startSourceRankPercentile = 56; // Integer | starting [ranking percentile of the sources](https://github.com/EventRegistry/event-registry-python/wiki/Source-filtering#filtering-of-sources-based-on-their-ranking) to consider in the results (default: 0). Value should be in range 0-90 and divisible by 10.
Integer endSourceRankPercentile = 56; // Integer | ending [ranking percentile of the sources](https://github.com/EventRegistry/event-registry-python/wiki/Source-filtering#filtering-of-sources-based-on-their-ranking) to consider in the results (default: 100). Value should be in range 10-100 and divisible by 10.
Integer minSentimentArticle = 56; // Integer | the minimum value of the sentiment, the article should have. Valid value is any floating number between -1 (very negative) to 1 (very positive). 0 represents neutral sentiment. Note that setting the value will automatically reduce results to just English articles, since the sentiment can only be computed for English language.
Integer maxSentimentArticle = 56; // Integer | the maximum value of the sentiment, the article should have. Valid value is any floating number between -1 (very negative) to 1 (very positive). 0 represents neutral sentiment. Note that setting the value will automatically reduce results to just English articles, since the sentiment can only be computed for English language.
String isDuplicateFilter = "keepAll"; // String | Some articles can be duplicates of other articles. What should be done with them.
String hasDuplicateFilter = "keepAll"; // String | Some articles are later copied by others. What should be done with such articles.
String eventFilter = "keepAll"; // String | Some articles describe a known event and some don't. This filter allows you to filter the resulting articles based on this criteria.
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
Boolean includeArticleVideos = false; // Boolean | Set this parameter to true to include the article videos in the response.
Boolean includeArticleLinks = false; // Boolean | Set this parameter to true to include the article links in the response.
Boolean includeArticleExtractedDates = false; // Boolean | Set this parameter to true to include article extracted dates in the response.
Boolean includeArticleDuplicateList = false; // Boolean | Set this parameter to true to include the list of duplicate articles in the response.
Boolean includeArticleOriginalArticle = false; // Boolean | Set this parameter to true to include the original article in the response.
Boolean includeSourceTitle = true; // Boolean | Set this parameter to true to include the source title in the response.
Boolean includeSourceDescription = false; // Boolean | Set this parameter to true to include the source description in the response.
Boolean includeSourceLocation = false; // Boolean | Set this parameter to true to include the source location in the response.
Boolean includeSourceRanking = false; // Boolean | Set this parameter to true to include the source ranking in the response.
Boolean includeConceptLabel = true; // Boolean | Set this parameter to true to include the concept label in the response.
Boolean includeConceptImage = false; // Boolean | Set this parameter to true to include the concept image in the response.
Boolean includeConceptSynonyms = false; // Boolean | Set this parameter to true to include the concept synonyms in the response.
Boolean includeConceptTrendingScore = false; // Boolean | Set this parameter to true to include concept trending score in the response.
String conceptLang = "eng"; // String | Define the language of the concept label.
Boolean includeCategoryParentUri = false; // Boolean | Set this parameter to true to include category parent uri in the response.
Boolean includeLocationGeoLocation = false; // Boolean | Set to true to include the geo location (latitude, longitude) for items that are locations
Boolean includeLocationPopulation = false; // Boolean | Set to true to include the population size of the location
Boolean includeLocationGeoNamesId = false; // Boolean | Set to true to include the GeoNames id of the location
Boolean includeLocationCountryArea = false; // Boolean | Set to true to include the are of the location in squared km.
Boolean includeLocationCountryContinent = false; // Boolean | Set to true to get the continent of the country for location objects.
try {
    InlineResponse2002 result = apiInstance.getArticles(apiKey, resultType, articlesPage, articlesCount, articlesSortBy, articlesSortByAsc, articleBodyLen, dataType, query, keyword, conceptUri, categoryUri, sourceUri, sourceLocationUri, sourceGroupUri, authorUri, locationUri, lang, dateStart, dateEnd, dateMentionStart, dateMentionEnd, keywordLoc, keywordOper, conceptOper, categoryOper, ignoreKeyword, ignoreConceptUri, ignoreCategoryUri, ignoreSourceUri, ignoreSourceLocationUri, ignoreSourceGroupUri, ignoreLocationUri, ignoreAuthorUri, ignoreLang, ignoreKeywordLoc, startSourceRankPercentile, endSourceRankPercentile, minSentimentArticle, maxSentimentArticle, isDuplicateFilter, hasDuplicateFilter, eventFilter, includeArticleTitle, includeArticleBasicInfo, includeArticleBody, includeArticleEventUri, includeArticleSocialScore, includeArticleSentiment, includeArticleConcepts, includeArticleCategories, includeArticleLocation, includeArticleImage, includeArticleVideos, includeArticleLinks, includeArticleExtractedDates, includeArticleDuplicateList, includeArticleOriginalArticle, includeSourceTitle, includeSourceDescription, includeSourceLocation, includeSourceRanking, includeConceptLabel, includeConceptImage, includeConceptSynonyms, includeConceptTrendingScore, conceptLang, includeCategoryParentUri, includeLocationGeoLocation, includeLocationPopulation, includeLocationGeoNamesId, includeLocationCountryArea, includeLocationCountryContinent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArticlesApi#getArticles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**| Your API key |
 **resultType** | **String**| Define what kind of results of the search you would like to get. Default value: articles. | [optional] [default to articles] [enum: articles, uriWgtList, langAggr, timeAggr, sourceAggr, sourceExAggr, authorAggr, keywordAggr, locAggr, conceptAggr, conceptGraph, categoryAggr, dateMentionAggr, sentimentAggr, recentActivityArticles]
 **articlesPage** | **Integer**| Determines the page of the results to return (starting from 1). Relevant when &#x60;resultType &#x3D; articles&#x60;. | [optional] [default to 1]
 **articlesCount** | **Integer**| Define how many articles (up to 100) will be returned. Relevant when &#x60;resultType &#x3D; articles&#x60;. | [optional] [default to 100]
 **articlesSortBy** | **String**| Choose the criteria for sorting the news articles. &#x60;rel&#x60; (relevance to the query), &#x60;date&#x60; (publishing date), &#x60;sourceImportance&#x60; (manually curated score of source importance - high value, high importance), &#x60;sourceImportanceRank&#x60; (reverse of sourceImportance), &#x60;sourceAlexaGlobalRank&#x60; (global rank of the news source), &#x60;sourceAlexaCountryRank&#x60; (country rank of the news source), &#x60;socialScore&#x60; (total shares on social media), &#x60;facebookShares&#x60; (shares on Facebook only). Relevant when &#x60;resultType &#x3D; articles&#x60;.  | [optional] [default to date] [enum: date, rel, sourceImportance, sourceAlexaGlobalRank, sourceAlexaCountryRank, socialScore, facebookShares]
 **articlesSortByAsc** | **Boolean**| Should the results be ordered in ascending order or descending order (default). Relevant when &#x60;resultType &#x3D; articles&#x60;. | [optional] [default to false]
 **articleBodyLen** | **Integer**| Set the size of the article body that&#x27;ll be returned in the response. Use -1 for full article body. | [optional] [default to -1]
 **dataType** | [**List&lt;String&gt;**](String.md)| What data types should we search? news content (default, &#x60;news&#x60;), press releases (&#x60;pr&#x60;) or blogs (&#x60;blog&#x60;). | [optional]
 **query** | [**Query**](.md)| Query object with one or more search conditions. The &#x60;query&#x60; object should match the [Advanced Query Language](https://github.com/EventRegistry/event-registry-python/wiki/Searching-for-articles#advanced-query-language) format. If you specify the &#x60;query&#x60; parameter, then the query parameters specified directly (&#x60;keyword&#x60;, &#x60;conceptUri&#x60;, &#x60;sourceUri&#x60;, &#x60;categoryUri&#x60;, etc) will be ignored. | [optional]
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
 **ignoreKeyword** | [**List&lt;String&gt;**](String.md)| Ignore articles that mention the specified keyword or phrase. You can specify at most 60 keywords in a single search. If you specify multiple &#x60;ignoreKeyword&#x60; parameters, then articles that mention any of these keywords will be ignored.  | [optional]
 **ignoreConceptUri** | [**List&lt;String&gt;**](String.md)| Ignore articles that mention the concept with concept uri. You can specify at most 50 concepts in a single search. If you specify multiple &#x60;ignoreConceptUri&#x60; parameters then articles that mention any of them will be ignored. Check [autosuggest methods](https://eventregistry.org/documentation?tab&#x3D;suggConcepts) to get value for a specified concept label.  | [optional]
 **ignoreCategoryUri** | [**List&lt;String&gt;**](String.md)| Ignore articles that are assigned into a particular category. You can specify at most 20 categories in a single search. If you specify multiple &#x60;ignoreCategoryUri&#x60; parameters then articles that mention any of them will be ignored. Check [autosuggest methods](https://eventregistry.org/documentation?tab&#x3D;suggCategories) to get value for a specified category name.  | [optional]
 **ignoreSourceUri** | [**List&lt;String&gt;**](String.md)| Ignore articles that have been published by a news source. If you specify multiple &#x60;ignoreSourceUri&#x60; parameters, then articles from any of the specified sources will be ignored. Check [autosuggest methods](https://eventregistry.org/documentation?tab&#x3D;suggSources) to get value for a source name.  | [optional]
 **ignoreSourceLocationUri** | [**List&lt;String&gt;**](String.md)| Ignore articles that were published by news sources located at the given geographic location (city or country). If you specify multiple &#x60;ignoreSourceLocationUri&#x60; parameters, then articles from sources from any of the specified sources will be ignored. Check [autosuggest methods](https://eventregistry.org/documentation?tab&#x3D;suggLocations) to get value for a location name.  | [optional]
 **ignoreSourceGroupUri** | [**List&lt;String&gt;**](String.md)| Ignore articles that were published by news sources that are assigned to some predefined group of news sources. Check [autosuggest methods](https://eventregistry.org/documentation?tab&#x3D;suggSourceGroups) to get value for a source group or find the uri.  | [optional]
 **ignoreLocationUri** | [**List&lt;String&gt;**](String.md)| Ignore articles that describe something that occured at a particular location (based on the location mentioned in the dateline). Check [autosuggest methods](https://eventregistry.org/documentation?tab&#x3D;suggLocations) to get value for a location name. | [optional]
 **ignoreAuthorUri** | [**List&lt;String&gt;**](String.md)| Ignore articles that were written by a particular author. Check [autosuggest methods](https://eventregistry.org/documentation?tab&#x3D;suggAuthors) to get value for author uri based on the author name (and potentially source url). | [optional]
 **ignoreLang** | [**List&lt;String&gt;**](String.md)| Ignore articles in the specified language(s). You can specify at most 5 languages in a single search. | [optional] [enum: eng, spa, deu, zho, slv, cat, por, ita, fra, rus, ara, tur, hrv, srp, ind, ces, slk, pol, eus, hun, nld, swe, fin, dan, ell, ron, bul, ukr, fas, hin, urd, vie]
 **ignoreKeywordLoc** | **String**| What data should be used when searching using the keywords provided by &#x60;ignoreKeywords&#x60; parameter. | [optional] [enum: body, title, body,title]
 **startSourceRankPercentile** | **Integer**| starting [ranking percentile of the sources](https://github.com/EventRegistry/event-registry-python/wiki/Source-filtering#filtering-of-sources-based-on-their-ranking) to consider in the results (default: 0). Value should be in range 0-90 and divisible by 10. | [optional]
 **endSourceRankPercentile** | **Integer**| ending [ranking percentile of the sources](https://github.com/EventRegistry/event-registry-python/wiki/Source-filtering#filtering-of-sources-based-on-their-ranking) to consider in the results (default: 100). Value should be in range 10-100 and divisible by 10. | [optional]
 **minSentimentArticle** | **Integer**| the minimum value of the sentiment, the article should have. Valid value is any floating number between -1 (very negative) to 1 (very positive). 0 represents neutral sentiment. Note that setting the value will automatically reduce results to just English articles, since the sentiment can only be computed for English language. | [optional]
 **maxSentimentArticle** | **Integer**| the maximum value of the sentiment, the article should have. Valid value is any floating number between -1 (very negative) to 1 (very positive). 0 represents neutral sentiment. Note that setting the value will automatically reduce results to just English articles, since the sentiment can only be computed for English language. | [optional]
 **isDuplicateFilter** | **String**| Some articles can be duplicates of other articles. What should be done with them. | [optional] [default to keepAll] [enum: skipDuplicates, keepOnlyDuplicates, keepAll]
 **hasDuplicateFilter** | **String**| Some articles are later copied by others. What should be done with such articles. | [optional] [default to keepAll] [enum: skipHasDuplicates, keepOnlyHasDuplicates, keepAll]
 **eventFilter** | **String**| Some articles describe a known event and some don&#x27;t. This filter allows you to filter the resulting articles based on this criteria. | [optional] [default to keepAll] [enum: skipArticlesWithoutEvent, keepOnlyArticlesWithoutEvent, keepAll]
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
 **includeArticleVideos** | **Boolean**| Set this parameter to true to include the article videos in the response. | [optional] [default to false]
 **includeArticleLinks** | **Boolean**| Set this parameter to true to include the article links in the response. | [optional] [default to false]
 **includeArticleExtractedDates** | **Boolean**| Set this parameter to true to include article extracted dates in the response. | [optional] [default to false]
 **includeArticleDuplicateList** | **Boolean**| Set this parameter to true to include the list of duplicate articles in the response. | [optional] [default to false]
 **includeArticleOriginalArticle** | **Boolean**| Set this parameter to true to include the original article in the response. | [optional] [default to false]
 **includeSourceTitle** | **Boolean**| Set this parameter to true to include the source title in the response. | [optional] [default to true]
 **includeSourceDescription** | **Boolean**| Set this parameter to true to include the source description in the response. | [optional] [default to false]
 **includeSourceLocation** | **Boolean**| Set this parameter to true to include the source location in the response. | [optional] [default to false]
 **includeSourceRanking** | **Boolean**| Set this parameter to true to include the source ranking in the response. | [optional] [default to false]
 **includeConceptLabel** | **Boolean**| Set this parameter to true to include the concept label in the response. | [optional] [default to true]
 **includeConceptImage** | **Boolean**| Set this parameter to true to include the concept image in the response. | [optional] [default to false]
 **includeConceptSynonyms** | **Boolean**| Set this parameter to true to include the concept synonyms in the response. | [optional] [default to false]
 **includeConceptTrendingScore** | **Boolean**| Set this parameter to true to include concept trending score in the response. | [optional] [default to false]
 **conceptLang** | **String**| Define the language of the concept label. | [optional] [default to eng]
 **includeCategoryParentUri** | **Boolean**| Set this parameter to true to include category parent uri in the response. | [optional] [default to false]
 **includeLocationGeoLocation** | **Boolean**| Set to true to include the geo location (latitude, longitude) for items that are locations | [optional] [default to false]
 **includeLocationPopulation** | **Boolean**| Set to true to include the population size of the location | [optional] [default to false]
 **includeLocationGeoNamesId** | **Boolean**| Set to true to include the GeoNames id of the location | [optional] [default to false]
 **includeLocationCountryArea** | **Boolean**| Set to true to include the are of the location in squared km. | [optional] [default to false]
 **includeLocationCountryContinent** | **Boolean**| Set to true to get the continent of the country for location objects. | [optional] [default to false]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getArticlesForTopicPage"></a>
# **getArticlesForTopicPage**
> InlineResponse2003 getArticlesForTopicPage(apiKey, uri, resultType, maxDaysBack, onlyAfterTm, articlesPage, articlesCount, articlesSortBy, articlesSortByAsc, dataType, articleBodyLen, includeArticleTitle, includeArticleBasicInfo, includeArticleBody, includeArticleEventUri, includeArticleSocialScore, includeArticleSentiment, includeArticleConcepts, includeArticleCategories, includeArticleLocation, includeArticleImage, includeArticleVideos, includeArticleLinks, includeArticleExtractedDates, includeArticleDuplicateList, includeArticleOriginalArticle, includeSourceTitle, includeSourceDescription, includeSourceLocation, includeSourceRanking, includeConceptLabel, includeConceptImage, includeConceptSynonyms, includeConceptTrendingScore, conceptLang, includeCategoryParentUri, includeLocationPopulation, includeLocationGeoNamesId, includeLocationCountryArea, includeLocationCountryContinent)

Obtain articles that match a user generated topic page

Retrieve the news articles that match the topic page that the user generated on the [monitoring page](https://eventregistry.org/monitoring).  The topic page has to be created using the web interface and can be defined by a list of concepts, keywords, news sources, categories and other available conditions. Each topic page has a unique id, called a URI. When you open the topic page, the URI is displayed in the url in the browser. Use that URI as the &#x60;uri&#x60; parameter when making the API calls.  Compared to the &#x60;getArticles&#x60; endpoint, this endpoint is well suited when you want to find articles that match a broader topic that can be defined using a set of concepts and keywords. These concepts and keywords don&#x27;t all need to be mentioned in an article, but the more of them are mentioned, the higher will the article be in the list of results. By default, the returned articles are sorted based on how well they match the topic, but you can also change the sorting by setting the &#x60;articlesSortBy&#x60; parameter.  The results of the search can be the list of matching articles (when &#x60;resultType &#x3D; articles&#x60;, default) or one of the various aggregates (summaries) of the matching articles. In case of &#x60;resultType &#x3D; timeAggr&#x60;, for example, the returned data will contain information *when* were the articles matching the topic were published.  Details about the returned information is available on the **[data model page](https://github.com/EventRegistry/event-registry-python/wiki/Data-models)**. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ArticlesApi;


ArticlesApi apiInstance = new ArticlesApi();
String apiKey = "apiKey_example"; // String | Your API key
String uri = "uri_example"; // String | URI of the topic page for which you wish to retrieve matching articles. Obtain the URI from the URL on the [monitoring page](https://eventregistry.org/monitoring) when the topic page is opened.
String resultType = "articles"; // String | Define what kind of results of the search you would like to get.
Integer maxDaysBack = 56; // Integer | The returned articles should not be older than this number of days. If the value is not specified, then the value set in the topic definition will be used.
String onlyAfterTm = "onlyAfterTm_example"; // String | Only include in the results articles that were found after the specified date-time. The parameter should be in the format `YYYY-MM-DDTHH:MM:SS`, where the value should be in the UTC timezone. The value is very handy if you want to repeatedly call the API endpoint and make sure that you don't receive the same articles multiple times.
Integer articlesPage = 1; // Integer | Determines the page of the results to return (starting from 1). Relevant when `resultType = articles`.
Integer articlesCount = 100; // Integer | Define how many articles (up to 100) will be returned. Relevant when `resultType = articles`.
String articlesSortBy = "rel"; // String | Choose the criteria for sorting the news articles. `rel` (relevance to the query), `date` (publishing date), `sourceImportance` (manually curated score of source importance - high value, high importance), `sourceImportanceRank` (reverse of sourceImportance), `sourceAlexaGlobalRank` (global rank of the news source), `sourceAlexaCountryRank` (country rank of the news source), `socialScore` (total shares on social media), `facebookShares` (shares on Facebook only). Relevant when `resultType = articles`.
Boolean articlesSortByAsc = false; // Boolean | Should the results be ordered in ascending order or descending order (default). Relevant when `resultType = articles`.
List<String> dataType = Arrays.asList("dataType_example"); // List<String> | What data types should we search? news content (default, `news`), press releases (`pr`) or blogs (`blog`).
Integer articleBodyLen = -1; // Integer | Set the size of the article body that'll be returned in the response. Use -1 for full article body.
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
Boolean includeArticleVideos = false; // Boolean | Set this parameter to true to include the article videos in the response.
Boolean includeArticleLinks = false; // Boolean | Set this parameter to true to include the article links in the response.
Boolean includeArticleExtractedDates = false; // Boolean | Set this parameter to true to include article extracted dates in the response.
Boolean includeArticleDuplicateList = false; // Boolean | Set this parameter to true to include the list of duplicate articles in the response.
Boolean includeArticleOriginalArticle = false; // Boolean | Set this parameter to true to include the original article in the response.
Boolean includeSourceTitle = true; // Boolean | Set this parameter to true to include the source title in the response.
Boolean includeSourceDescription = false; // Boolean | Set this parameter to true to include the source description in the response.
Boolean includeSourceLocation = false; // Boolean | Set this parameter to true to include the source location in the response.
Boolean includeSourceRanking = false; // Boolean | Set this parameter to true to include the source ranking in the response.
Boolean includeConceptLabel = true; // Boolean | Set this parameter to true to include the concept label in the response.
Boolean includeConceptImage = false; // Boolean | Set this parameter to true to include the concept image in the response.
Boolean includeConceptSynonyms = false; // Boolean | Set this parameter to true to include the concept synonyms in the response.
Boolean includeConceptTrendingScore = false; // Boolean | Set this parameter to true to include concept trending score in the response.
String conceptLang = "eng"; // String | Define the language of the concept label.
Boolean includeCategoryParentUri = false; // Boolean | Set this parameter to true to include category parent uri in the response.
Boolean includeLocationPopulation = false; // Boolean | Set to true to include the population size of the location
Boolean includeLocationGeoNamesId = false; // Boolean | Set to true to include the GeoNames id of the location
Boolean includeLocationCountryArea = false; // Boolean | Set to true to include the are of the location in squared km.
Boolean includeLocationCountryContinent = false; // Boolean | Set to true to get the continent of the country for location objects.
try {
    InlineResponse2003 result = apiInstance.getArticlesForTopicPage(apiKey, uri, resultType, maxDaysBack, onlyAfterTm, articlesPage, articlesCount, articlesSortBy, articlesSortByAsc, dataType, articleBodyLen, includeArticleTitle, includeArticleBasicInfo, includeArticleBody, includeArticleEventUri, includeArticleSocialScore, includeArticleSentiment, includeArticleConcepts, includeArticleCategories, includeArticleLocation, includeArticleImage, includeArticleVideos, includeArticleLinks, includeArticleExtractedDates, includeArticleDuplicateList, includeArticleOriginalArticle, includeSourceTitle, includeSourceDescription, includeSourceLocation, includeSourceRanking, includeConceptLabel, includeConceptImage, includeConceptSynonyms, includeConceptTrendingScore, conceptLang, includeCategoryParentUri, includeLocationPopulation, includeLocationGeoNamesId, includeLocationCountryArea, includeLocationCountryContinent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArticlesApi#getArticlesForTopicPage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**| Your API key |
 **uri** | **String**| URI of the topic page for which you wish to retrieve matching articles. Obtain the URI from the URL on the [monitoring page](https://eventregistry.org/monitoring) when the topic page is opened. |
 **resultType** | **String**| Define what kind of results of the search you would like to get. | [optional] [default to articles] [enum: articles, uriWgtList, langAggr, timeAggr, sourceAggr, sourceExAggr, authorAggr, keywordAggr, locAggr, conceptAggr, conceptGraph, categoryAggr, dateMentionAggr, sentimentAggr]
 **maxDaysBack** | **Integer**| The returned articles should not be older than this number of days. If the value is not specified, then the value set in the topic definition will be used. | [optional]
 **onlyAfterTm** | **String**| Only include in the results articles that were found after the specified date-time. The parameter should be in the format &#x60;YYYY-MM-DDTHH:MM:SS&#x60;, where the value should be in the UTC timezone. The value is very handy if you want to repeatedly call the API endpoint and make sure that you don&#x27;t receive the same articles multiple times. | [optional]
 **articlesPage** | **Integer**| Determines the page of the results to return (starting from 1). Relevant when &#x60;resultType &#x3D; articles&#x60;. | [optional] [default to 1]
 **articlesCount** | **Integer**| Define how many articles (up to 100) will be returned. Relevant when &#x60;resultType &#x3D; articles&#x60;. | [optional] [default to 100]
 **articlesSortBy** | **String**| Choose the criteria for sorting the news articles. &#x60;rel&#x60; (relevance to the query), &#x60;date&#x60; (publishing date), &#x60;sourceImportance&#x60; (manually curated score of source importance - high value, high importance), &#x60;sourceImportanceRank&#x60; (reverse of sourceImportance), &#x60;sourceAlexaGlobalRank&#x60; (global rank of the news source), &#x60;sourceAlexaCountryRank&#x60; (country rank of the news source), &#x60;socialScore&#x60; (total shares on social media), &#x60;facebookShares&#x60; (shares on Facebook only). Relevant when &#x60;resultType &#x3D; articles&#x60;. | [optional] [default to rel] [enum: date, rel, sourceImportance, sourceAlexaGlobalRank, sourceAlexaCountryRank, socialScore, facebookShares]
 **articlesSortByAsc** | **Boolean**| Should the results be ordered in ascending order or descending order (default). Relevant when &#x60;resultType &#x3D; articles&#x60;. | [optional] [default to false]
 **dataType** | [**List&lt;String&gt;**](String.md)| What data types should we search? news content (default, &#x60;news&#x60;), press releases (&#x60;pr&#x60;) or blogs (&#x60;blog&#x60;). | [optional]
 **articleBodyLen** | **Integer**| Set the size of the article body that&#x27;ll be returned in the response. Use -1 for full article body. | [optional] [default to -1]
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
 **includeArticleVideos** | **Boolean**| Set this parameter to true to include the article videos in the response. | [optional] [default to false]
 **includeArticleLinks** | **Boolean**| Set this parameter to true to include the article links in the response. | [optional] [default to false]
 **includeArticleExtractedDates** | **Boolean**| Set this parameter to true to include article extracted dates in the response. | [optional] [default to false]
 **includeArticleDuplicateList** | **Boolean**| Set this parameter to true to include the list of duplicate articles in the response. | [optional] [default to false]
 **includeArticleOriginalArticle** | **Boolean**| Set this parameter to true to include the original article in the response. | [optional] [default to false]
 **includeSourceTitle** | **Boolean**| Set this parameter to true to include the source title in the response. | [optional] [default to true]
 **includeSourceDescription** | **Boolean**| Set this parameter to true to include the source description in the response. | [optional] [default to false]
 **includeSourceLocation** | **Boolean**| Set this parameter to true to include the source location in the response. | [optional] [default to false]
 **includeSourceRanking** | **Boolean**| Set this parameter to true to include the source ranking in the response. | [optional] [default to false]
 **includeConceptLabel** | **Boolean**| Set this parameter to true to include the concept label in the response. | [optional] [default to true]
 **includeConceptImage** | **Boolean**| Set this parameter to true to include the concept image in the response. | [optional] [default to false]
 **includeConceptSynonyms** | **Boolean**| Set this parameter to true to include the concept synonyms in the response. | [optional] [default to false]
 **includeConceptTrendingScore** | **Boolean**| Set this parameter to true to include concept trending score in the response. | [optional] [default to false]
 **conceptLang** | **String**| Define the language of the concept label. | [optional] [default to eng]
 **includeCategoryParentUri** | **Boolean**| Set this parameter to true to include category parent uri in the response. | [optional] [default to false]
 **includeLocationPopulation** | **Boolean**| Set to true to include the population size of the location | [optional] [default to false]
 **includeLocationGeoNamesId** | **Boolean**| Set to true to include the GeoNames id of the location | [optional] [default to false]
 **includeLocationCountryArea** | **Boolean**| Set to true to include the are of the location in squared km. | [optional] [default to false]
 **includeLocationCountryContinent** | **Boolean**| Set to true to get the continent of the country for location objects. | [optional] [default to false]

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="minuteStreamArticles"></a>
# **minuteStreamArticles**
> InlineResponse2005 minuteStreamArticles(apiKey, recentActivityArticlesMaxArticleCount, recentActivityArticlesUpdatesAfterUri, recentActivityArticlesUpdatesAfterMinsAgo, recentActivityArticlesUpdatesAfterTm, articleBodyLen, dataType, keyword, conceptUri, categoryUri, sourceUri, sourceLocationUri, sourceGroupUri, authorUri, locationUri, lang, keywordLoc, keywordOper, conceptOper, categoryOper, startSourceRankPercentile, endSourceRankPercentile, minSentimentArticle, maxSentimentArticle, isDuplicateFilter, hasDuplicateFilter, eventFilter)

The minute stream of news articles added to Event Registry

The API endpoint allows the user to obtain the full list of news articles added to Event Registry in the last minute. This is the only API call that also allows returning more than 100 articles per call. If more than 100 articles are returned, then correspondingly higher number of tokens are used per call.  Without any additional filters, the API will return 100 articles added in the last minute. By specifying filters like &#x60;lang&#x60;, &#x60;keyword&#x60;, &#x60;conceptUri&#x60; and others, you can however limit the recently added content to only the subset that matches these filters.  Examples of use are provided on the **[examples page](https://eventregistry.org/documentation/examples#event-registry-api-examples-articles-minute-stream-articles)**. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ArticlesApi;


ArticlesApi apiInstance = new ArticlesApi();
String apiKey = "apiKey_example"; // String | Your API key
Integer recentActivityArticlesMaxArticleCount = 100; // Integer | The maximum number of articles to return. Maximum value specified can be 2.000. The number of used tokens will correspond to the number of returned articles (for 300 returned articles, 3 tokens will be used, etc.). 
String recentActivityArticlesUpdatesAfterUri = "recentActivityArticlesUpdatesAfterUri_example"; // String | The actual names of the parameters should be `recentActivityArticlesNewsUpdatesAfterUri`, `recentActivityArticlesBlogUpdatesAfterUri` and `recentActivityArticlesPrUpdatesAfterUri`, depending on which `dataType` parameters you require. Specifying the parameter(s) will only return articles that were added since the articles with the provided URI were added. If you are repeatedly calling the endpoint, using this parameter is the best way to ensure that all matching content is retrieved. 
Integer recentActivityArticlesUpdatesAfterMinsAgo = 56; // Integer | The parameter can be used to retrieve not only the last minute of articles, but more minutes. When using some filtering parameters below you use can use this parameter to call `minuteStreamArticles` endpoint only every few minutes and still retrieve all added content matching your filters. The value should be at most 240 (4 hours). 
String recentActivityArticlesUpdatesAfterTm = "recentActivityArticlesUpdatesAfterTm_example"; // String | The parameter can be used to retrieve articles that were collected after the specified time. The value should be in format `YYYY-MM-DDTHH:MM:SS` and should represent datetime in UTC timezone. The value should be at most 4 hours in the past. 
Integer articleBodyLen = -1; // Integer | Set the size of the article body that'll be returned in the response. Use -1 for full article body.
List<String> dataType = Arrays.asList("dataType_example"); // List<String> | What data types should we search? news content (default, `news`), press releases (`pr`) or blogs (`blog`).
List<String> keyword = Arrays.asList("keyword_example"); // List<String> | Find articles that mention the specified keyword or a phrase. You can specify at most 60 keywords in a single search. If you specify multiple `keyword` parameters, then only articles that mention all of them will be returned, unless you specify `keywordOper` parameter and set it to 'or'. 
List<String> conceptUri = Arrays.asList("conceptUri_example"); // List<String> | Find articles that mention the concept with a concept uri. You can specify at most 50 concepts in a single search. If multiple `conceptUri` parameters are provided, then only articles that are about all specified concepts will be returned, unless you specify `conceptOper` parameter and set it to 'or'. Check [autosuggest methods](https://eventregistry.org/documentation?tab=suggConcepts) to get concept URI value for a specified concept label. 
List<String> categoryUri = Arrays.asList("categoryUri_example"); // List<String> | Find articles that are assigned to a particular category. You can specify at most 20 categories in a single search. If multiple `categoryUri` parameters are provided, then articles that are about any of the specified categories will be returned, unless you specify `categoryOper` parameter and set it to 'and'. Check [autosuggest methods](https://eventregistry.org/documentation?tab=suggCategories) to get value for a specified category name. 
List<String> sourceUri = Arrays.asList("sourceUri_example"); // List<String> | Find articles that have been published by a news source. If you specify multiple `sourceUri` parameters, then articles from any of the specified sources will be returned. Check [autosuggest methods](https://eventregistry.org/documentation?tab=suggSources) to get value for a source name. 
List<String> sourceLocationUri = Arrays.asList("sourceLocationUri_example"); // List<String> | Find articles that were published by news sources located at the given geographic location (city or country). If you specify multiple `sourceLocationUri` parameters, then articles from sources from any of the specified sources will be returned. Check [autosuggest methods](https://eventregistry.org/documentation?tab=suggLocations) to get value for a location name. 
List<String> sourceGroupUri = Arrays.asList("sourceGroupUri_example"); // List<String> | Find articles that were published by news sources that are assigned to some predefined group of news sources. Check [autosuggest methods](https://eventregistry.org/documentation?tab=suggSourceGroups) to get value for a source group or find the uri. 
List<String> authorUri = Arrays.asList("authorUri_example"); // List<String> | Find articles that were written by a particular author. Check [autosuggest methods](https://eventregistry.org/documentation?tab=suggAuthors) to get value for author uri based on the author name (and potentially source url).
List<String> locationUri = Arrays.asList("locationUri_example"); // List<String> | Find articles that describe something that occured at a particular location (based on the location mentioned in the dateline). Check [autosuggest methods](https://eventregistry.org/documentation?tab=suggLocations) to get value for a location name.
List<String> lang = Arrays.asList("lang_example"); // List<String> | Find articles in the specific language(s). If not specified, all languages will be included. You can specify at most 5 languages in a single search.
String keywordLoc = "body"; // String | What data should be used when searching using the keywords provided by `keywords` parameter.
String keywordOper = "and"; // String | If more keywords are provided with the `keyword` parameter, what should be the Boolean operator used. If 'and' (default) then all of the specified keywords have to be present in the article; if 'or' then an article will be returned if it mentions any of the provided keywords.
String conceptOper = "and"; // String | If more concepts are provided with the `conceptUri` parameter, what should be the Boolean operator used. If 'and' (default) then all of the specified concepts have to be present in the article; if 'or' then an article will be returned if it mentions any of the provided concepts.
String categoryOper = "or"; // String | If more categories are provided with the `categoryUri` parameter, what should be the Boolean operator used. If 'and' then all of the specified categories have to be present in the article; if 'or' then an article will be returned if it mentions any of the provided categories.
Integer startSourceRankPercentile = 56; // Integer | starting [ranking percentile of the sources](https://github.com/EventRegistry/event-registry-python/wiki/Source-filtering#filtering-of-sources-based-on-their-ranking) to consider in the results (default: 0). Value should be in range 0-90 and divisible by 10.
Integer endSourceRankPercentile = 56; // Integer | ending [ranking percentile of the sources](https://github.com/EventRegistry/event-registry-python/wiki/Source-filtering#filtering-of-sources-based-on-their-ranking) to consider in the results (default: 100). Value should be in range 10-100 and divisible by 10.
Integer minSentimentArticle = 56; // Integer | the minimum value of the sentiment, the article should have. Valid value is any floating number between -1 (very negative) to 1 (very positive). 0 represents neutral sentiment. Note that setting the value will automatically reduce results to just English articles, since the sentiment can only be computed for English language.
Integer maxSentimentArticle = 56; // Integer | the maximum value of the sentiment, the article should have. Valid value is any floating number between -1 (very negative) to 1 (very positive). 0 represents neutral sentiment. Note that setting the value will automatically reduce results to just English articles, since the sentiment can only be computed for English language.
String isDuplicateFilter = "keepAll"; // String | Some articles can be duplicates of other articles. What should be done with them.
String hasDuplicateFilter = "keepAll"; // String | Some articles are later copied by others. What should be done with such articles.
String eventFilter = "keepAll"; // String | Some articles describe a known event and some don't. This filter allows you to filter the resulting articles based on this criteria.
try {
    InlineResponse2005 result = apiInstance.minuteStreamArticles(apiKey, recentActivityArticlesMaxArticleCount, recentActivityArticlesUpdatesAfterUri, recentActivityArticlesUpdatesAfterMinsAgo, recentActivityArticlesUpdatesAfterTm, articleBodyLen, dataType, keyword, conceptUri, categoryUri, sourceUri, sourceLocationUri, sourceGroupUri, authorUri, locationUri, lang, keywordLoc, keywordOper, conceptOper, categoryOper, startSourceRankPercentile, endSourceRankPercentile, minSentimentArticle, maxSentimentArticle, isDuplicateFilter, hasDuplicateFilter, eventFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArticlesApi#minuteStreamArticles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**| Your API key |
 **recentActivityArticlesMaxArticleCount** | **Integer**| The maximum number of articles to return. Maximum value specified can be 2.000. The number of used tokens will correspond to the number of returned articles (for 300 returned articles, 3 tokens will be used, etc.).  | [optional] [default to 100] [enum: 2000]
 **recentActivityArticlesUpdatesAfterUri** | **String**| The actual names of the parameters should be &#x60;recentActivityArticlesNewsUpdatesAfterUri&#x60;, &#x60;recentActivityArticlesBlogUpdatesAfterUri&#x60; and &#x60;recentActivityArticlesPrUpdatesAfterUri&#x60;, depending on which &#x60;dataType&#x60; parameters you require. Specifying the parameter(s) will only return articles that were added since the articles with the provided URI were added. If you are repeatedly calling the endpoint, using this parameter is the best way to ensure that all matching content is retrieved.  | [optional]
 **recentActivityArticlesUpdatesAfterMinsAgo** | **Integer**| The parameter can be used to retrieve not only the last minute of articles, but more minutes. When using some filtering parameters below you use can use this parameter to call &#x60;minuteStreamArticles&#x60; endpoint only every few minutes and still retrieve all added content matching your filters. The value should be at most 240 (4 hours).  | [optional]
 **recentActivityArticlesUpdatesAfterTm** | **String**| The parameter can be used to retrieve articles that were collected after the specified time. The value should be in format &#x60;YYYY-MM-DDTHH:MM:SS&#x60; and should represent datetime in UTC timezone. The value should be at most 4 hours in the past.  | [optional]
 **articleBodyLen** | **Integer**| Set the size of the article body that&#x27;ll be returned in the response. Use -1 for full article body. | [optional] [default to -1]
 **dataType** | [**List&lt;String&gt;**](String.md)| What data types should we search? news content (default, &#x60;news&#x60;), press releases (&#x60;pr&#x60;) or blogs (&#x60;blog&#x60;). | [optional]
 **keyword** | [**List&lt;String&gt;**](String.md)| Find articles that mention the specified keyword or a phrase. You can specify at most 60 keywords in a single search. If you specify multiple &#x60;keyword&#x60; parameters, then only articles that mention all of them will be returned, unless you specify &#x60;keywordOper&#x60; parameter and set it to &#x27;or&#x27;.  | [optional]
 **conceptUri** | [**List&lt;String&gt;**](String.md)| Find articles that mention the concept with a concept uri. You can specify at most 50 concepts in a single search. If multiple &#x60;conceptUri&#x60; parameters are provided, then only articles that are about all specified concepts will be returned, unless you specify &#x60;conceptOper&#x60; parameter and set it to &#x27;or&#x27;. Check [autosuggest methods](https://eventregistry.org/documentation?tab&#x3D;suggConcepts) to get concept URI value for a specified concept label.  | [optional]
 **categoryUri** | [**List&lt;String&gt;**](String.md)| Find articles that are assigned to a particular category. You can specify at most 20 categories in a single search. If multiple &#x60;categoryUri&#x60; parameters are provided, then articles that are about any of the specified categories will be returned, unless you specify &#x60;categoryOper&#x60; parameter and set it to &#x27;and&#x27;. Check [autosuggest methods](https://eventregistry.org/documentation?tab&#x3D;suggCategories) to get value for a specified category name.  | [optional]
 **sourceUri** | [**List&lt;String&gt;**](String.md)| Find articles that have been published by a news source. If you specify multiple &#x60;sourceUri&#x60; parameters, then articles from any of the specified sources will be returned. Check [autosuggest methods](https://eventregistry.org/documentation?tab&#x3D;suggSources) to get value for a source name.  | [optional]
 **sourceLocationUri** | [**List&lt;String&gt;**](String.md)| Find articles that were published by news sources located at the given geographic location (city or country). If you specify multiple &#x60;sourceLocationUri&#x60; parameters, then articles from sources from any of the specified sources will be returned. Check [autosuggest methods](https://eventregistry.org/documentation?tab&#x3D;suggLocations) to get value for a location name.  | [optional]
 **sourceGroupUri** | [**List&lt;String&gt;**](String.md)| Find articles that were published by news sources that are assigned to some predefined group of news sources. Check [autosuggest methods](https://eventregistry.org/documentation?tab&#x3D;suggSourceGroups) to get value for a source group or find the uri.  | [optional]
 **authorUri** | [**List&lt;String&gt;**](String.md)| Find articles that were written by a particular author. Check [autosuggest methods](https://eventregistry.org/documentation?tab&#x3D;suggAuthors) to get value for author uri based on the author name (and potentially source url). | [optional]
 **locationUri** | [**List&lt;String&gt;**](String.md)| Find articles that describe something that occured at a particular location (based on the location mentioned in the dateline). Check [autosuggest methods](https://eventregistry.org/documentation?tab&#x3D;suggLocations) to get value for a location name. | [optional]
 **lang** | [**List&lt;String&gt;**](String.md)| Find articles in the specific language(s). If not specified, all languages will be included. You can specify at most 5 languages in a single search. | [optional] [enum: eng, spa, deu, zho, slv, cat, por, ita, fra, rus, ara, tur, hrv, srp, ind, ces, slk, pol, eus, hun, nld, swe, fin, dan, ell, ron, bul, ukr, fas, hin, urd, vie]
 **keywordLoc** | **String**| What data should be used when searching using the keywords provided by &#x60;keywords&#x60; parameter. | [optional] [default to body] [enum: body, title, body,title]
 **keywordOper** | **String**| If more keywords are provided with the &#x60;keyword&#x60; parameter, what should be the Boolean operator used. If &#x27;and&#x27; (default) then all of the specified keywords have to be present in the article; if &#x27;or&#x27; then an article will be returned if it mentions any of the provided keywords. | [optional] [default to and] [enum: and, or]
 **conceptOper** | **String**| If more concepts are provided with the &#x60;conceptUri&#x60; parameter, what should be the Boolean operator used. If &#x27;and&#x27; (default) then all of the specified concepts have to be present in the article; if &#x27;or&#x27; then an article will be returned if it mentions any of the provided concepts. | [optional] [default to and] [enum: and, or]
 **categoryOper** | **String**| If more categories are provided with the &#x60;categoryUri&#x60; parameter, what should be the Boolean operator used. If &#x27;and&#x27; then all of the specified categories have to be present in the article; if &#x27;or&#x27; then an article will be returned if it mentions any of the provided categories. | [optional] [default to or] [enum: and, or]
 **startSourceRankPercentile** | **Integer**| starting [ranking percentile of the sources](https://github.com/EventRegistry/event-registry-python/wiki/Source-filtering#filtering-of-sources-based-on-their-ranking) to consider in the results (default: 0). Value should be in range 0-90 and divisible by 10. | [optional]
 **endSourceRankPercentile** | **Integer**| ending [ranking percentile of the sources](https://github.com/EventRegistry/event-registry-python/wiki/Source-filtering#filtering-of-sources-based-on-their-ranking) to consider in the results (default: 100). Value should be in range 10-100 and divisible by 10. | [optional]
 **minSentimentArticle** | **Integer**| the minimum value of the sentiment, the article should have. Valid value is any floating number between -1 (very negative) to 1 (very positive). 0 represents neutral sentiment. Note that setting the value will automatically reduce results to just English articles, since the sentiment can only be computed for English language. | [optional]
 **maxSentimentArticle** | **Integer**| the maximum value of the sentiment, the article should have. Valid value is any floating number between -1 (very negative) to 1 (very positive). 0 represents neutral sentiment. Note that setting the value will automatically reduce results to just English articles, since the sentiment can only be computed for English language. | [optional]
 **isDuplicateFilter** | **String**| Some articles can be duplicates of other articles. What should be done with them. | [optional] [default to keepAll] [enum: skipDuplicates, keepOnlyDuplicates, keepAll]
 **hasDuplicateFilter** | **String**| Some articles are later copied by others. What should be done with such articles. | [optional] [default to keepAll] [enum: skipHasDuplicates, keepOnlyHasDuplicates, keepAll]
 **eventFilter** | **String**| Some articles describe a known event and some don&#x27;t. This filter allows you to filter the resulting articles based on this criteria. | [optional] [default to keepAll] [enum: skipArticlesWithoutEvent, keepOnlyArticlesWithoutEvent, keepAll]

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

