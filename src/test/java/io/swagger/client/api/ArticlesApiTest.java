/*
 * Event Registry REST API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 8.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.model.InlineResponse2002;
import io.swagger.client.model.InlineResponse2003;
import io.swagger.client.model.InlineResponse2004;
import io.swagger.client.model.InlineResponse2005;
import io.swagger.client.model.InlineResponse2006;
import io.swagger.client.model.Query;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for ArticlesApi
 */
@Ignore
public class ArticlesApiTest {

    private final ArticlesApi api = new ArticlesApi();

    /**
     * Mapping of the article URLs to the internal article URIs
     *
     * You can use this API call if you need to map an article URL to the article URI that is used internally in Event Registry. Using the article URI you can then retrieve article information using the endpoint &#x60;/getArticle&#x60;.  Examples of use are provided on the **[examples page](https://eventregistry.org/documentation/examples#event-registry-api-examples-articles-article-mapper)**. 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void articleMapperTest() throws Exception {
        String apiKey = null;
        String articleUrl = null;
        Boolean includeAllVersions = null;
        Boolean deep = null;
        InlineResponse2006 response = api.articleMapper(apiKey, articleUrl, includeAllVersions, deep);

        // TODO: test validations
    }
    /**
     * Obtain details about a single or multiple news articles
     *
     * Given a list of article URIs, obtain article details with all available meta-information.  Examples of use are provided on the **[examples page](https://eventregistry.org/documentation/examples#event-registry-api-examples-articles-get-article)**. Details about the returned information is available on the **[data model page](https://github.com/EventRegistry/event-registry-python/wiki/Data-models)**. 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getArticleTest() throws Exception {
        String apiKey = null;
        List<String> articleUri = null;
        List<String> resultType = null;
        Integer infoArticleBodyLen = null;
        Boolean includeArticleTitle = null;
        Boolean includeArticleBasicInfo = null;
        Boolean includeArticleBody = null;
        Boolean includeArticleEventUri = null;
        Boolean includeArticleSocialScore = null;
        Boolean includeArticleSentiment = null;
        Boolean includeArticleConcepts = null;
        Boolean includeArticleCategories = null;
        Boolean includeArticleLocation = null;
        Boolean includeArticleImage = null;
        Boolean includeArticleVideos = null;
        Boolean includeArticleLinks = null;
        Boolean includeArticleExtractedDates = null;
        Boolean includeArticleDuplicateList = null;
        Boolean includeArticleOriginalArticle = null;
        Boolean includeConceptLabel = null;
        Boolean includeConceptImage = null;
        Boolean includeConceptSynonyms = null;
        Boolean includeConceptTrendingScore = null;
        String conceptLang = null;
        Boolean includeSourceTitle = null;
        Boolean includeSourceDescription = null;
        Boolean includeSourceLocation = null;
        Boolean includeSourceRanking = null;
        Boolean includeLocationPopulation = null;
        Boolean includeLocationGeoNamesId = null;
        Boolean includeLocationCountryArea = null;
        Boolean includeLocationCountryContinent = null;
        InlineResponse2004 response = api.getArticle(apiKey, articleUri, resultType, infoArticleBodyLen, includeArticleTitle, includeArticleBasicInfo, includeArticleBody, includeArticleEventUri, includeArticleSocialScore, includeArticleSentiment, includeArticleConcepts, includeArticleCategories, includeArticleLocation, includeArticleImage, includeArticleVideos, includeArticleLinks, includeArticleExtractedDates, includeArticleDuplicateList, includeArticleOriginalArticle, includeConceptLabel, includeConceptImage, includeConceptSynonyms, includeConceptTrendingScore, conceptLang, includeSourceTitle, includeSourceDescription, includeSourceLocation, includeSourceRanking, includeLocationPopulation, includeLocationGeoNamesId, includeLocationCountryArea, includeLocationCountryContinent);

        // TODO: test validations
    }
    /**
     * Obtain articles that match one or more search conditions
     *
     * Identify the news articles that match a certain set of search criteria.  The search conditions can be specified by setting the &#x60;query&#x60; parameter, or by specifying one or multiple search parameters, such as &#x60;keyword&#x60;, &#x60;conceptUri&#x60;, &#x60;sourceUri&#x60;, etc. To remove some of the results matching the *positive* conditions, you can specify some *negative* conditions using &#x60;ignoreKeyword&#x60;, &#x60;ignoreSourceUri&#x60;, and other &#x60;ignore*&#x60; parameters.  The results of the search can be the list of matching articles (when &#x60;resultType &#x3D; articles&#x60;) or one of the various aggregates (summaries) of the matching articles. In case of &#x60;resultType &#x3D; timeAggr&#x60;, for example, the returned data will contain information *when* were the articles matching the search criteria published.  Examples of use are provided on the **[examples page](https://eventregistry.org/documentation/examples#event-registry-api-examples-articles-get-articles)**. Details about the returned information is available on the **[data model page](https://github.com/EventRegistry/event-registry-python/wiki/Data-models)**. 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getArticlesTest() throws Exception {
        String apiKey = null;
        String resultType = null;
        Integer articlesPage = null;
        Integer articlesCount = null;
        String articlesSortBy = null;
        Boolean articlesSortByAsc = null;
        Integer articleBodyLen = null;
        List<String> dataType = null;
        Query query = null;
        List<String> keyword = null;
        List<String> conceptUri = null;
        List<String> categoryUri = null;
        List<String> sourceUri = null;
        List<String> sourceLocationUri = null;
        List<String> sourceGroupUri = null;
        List<String> authorUri = null;
        List<String> locationUri = null;
        List<String> lang = null;
        String dateStart = null;
        String dateEnd = null;
        String dateMentionStart = null;
        String dateMentionEnd = null;
        String keywordLoc = null;
        String keywordOper = null;
        String conceptOper = null;
        String categoryOper = null;
        List<String> ignoreKeyword = null;
        List<String> ignoreConceptUri = null;
        List<String> ignoreCategoryUri = null;
        List<String> ignoreSourceUri = null;
        List<String> ignoreSourceLocationUri = null;
        List<String> ignoreSourceGroupUri = null;
        List<String> ignoreLocationUri = null;
        List<String> ignoreAuthorUri = null;
        List<String> ignoreLang = null;
        String ignoreKeywordLoc = null;
        Integer startSourceRankPercentile = null;
        Integer endSourceRankPercentile = null;
        Integer minSentimentArticle = null;
        Integer maxSentimentArticle = null;
        String isDuplicateFilter = null;
        String hasDuplicateFilter = null;
        String eventFilter = null;
        Boolean includeArticleTitle = null;
        Boolean includeArticleBasicInfo = null;
        Boolean includeArticleBody = null;
        Boolean includeArticleEventUri = null;
        Boolean includeArticleSocialScore = null;
        Boolean includeArticleSentiment = null;
        Boolean includeArticleConcepts = null;
        Boolean includeArticleCategories = null;
        Boolean includeArticleLocation = null;
        Boolean includeArticleImage = null;
        Boolean includeArticleVideos = null;
        Boolean includeArticleLinks = null;
        Boolean includeArticleExtractedDates = null;
        Boolean includeArticleDuplicateList = null;
        Boolean includeArticleOriginalArticle = null;
        Boolean includeSourceTitle = null;
        Boolean includeSourceDescription = null;
        Boolean includeSourceLocation = null;
        Boolean includeSourceRanking = null;
        Boolean includeConceptLabel = null;
        Boolean includeConceptImage = null;
        Boolean includeConceptSynonyms = null;
        Boolean includeConceptTrendingScore = null;
        String conceptLang = null;
        Boolean includeCategoryParentUri = null;
        Boolean includeLocationGeoLocation = null;
        Boolean includeLocationPopulation = null;
        Boolean includeLocationGeoNamesId = null;
        Boolean includeLocationCountryArea = null;
        Boolean includeLocationCountryContinent = null;
        InlineResponse2002 response = api.getArticles(apiKey, resultType, articlesPage, articlesCount, articlesSortBy, articlesSortByAsc, articleBodyLen, dataType, query, keyword, conceptUri, categoryUri, sourceUri, sourceLocationUri, sourceGroupUri, authorUri, locationUri, lang, dateStart, dateEnd, dateMentionStart, dateMentionEnd, keywordLoc, keywordOper, conceptOper, categoryOper, ignoreKeyword, ignoreConceptUri, ignoreCategoryUri, ignoreSourceUri, ignoreSourceLocationUri, ignoreSourceGroupUri, ignoreLocationUri, ignoreAuthorUri, ignoreLang, ignoreKeywordLoc, startSourceRankPercentile, endSourceRankPercentile, minSentimentArticle, maxSentimentArticle, isDuplicateFilter, hasDuplicateFilter, eventFilter, includeArticleTitle, includeArticleBasicInfo, includeArticleBody, includeArticleEventUri, includeArticleSocialScore, includeArticleSentiment, includeArticleConcepts, includeArticleCategories, includeArticleLocation, includeArticleImage, includeArticleVideos, includeArticleLinks, includeArticleExtractedDates, includeArticleDuplicateList, includeArticleOriginalArticle, includeSourceTitle, includeSourceDescription, includeSourceLocation, includeSourceRanking, includeConceptLabel, includeConceptImage, includeConceptSynonyms, includeConceptTrendingScore, conceptLang, includeCategoryParentUri, includeLocationGeoLocation, includeLocationPopulation, includeLocationGeoNamesId, includeLocationCountryArea, includeLocationCountryContinent);

        // TODO: test validations
    }
    /**
     * Obtain articles that match a user generated topic page
     *
     * Retrieve the news articles that match the topic page that the user generated on the [monitoring page](https://eventregistry.org/monitoring).  The topic page has to be created using the web interface and can be defined by a list of concepts, keywords, news sources, categories and other available conditions. Each topic page has a unique id, called a URI. When you open the topic page, the URI is displayed in the url in the browser. Use that URI as the &#x60;uri&#x60; parameter when making the API calls.  Compared to the &#x60;getArticles&#x60; endpoint, this endpoint is well suited when you want to find articles that match a broader topic that can be defined using a set of concepts and keywords. These concepts and keywords don&#x27;t all need to be mentioned in an article, but the more of them are mentioned, the higher will the article be in the list of results. By default, the returned articles are sorted based on how well they match the topic, but you can also change the sorting by setting the &#x60;articlesSortBy&#x60; parameter.  The results of the search can be the list of matching articles (when &#x60;resultType &#x3D; articles&#x60;, default) or one of the various aggregates (summaries) of the matching articles. In case of &#x60;resultType &#x3D; timeAggr&#x60;, for example, the returned data will contain information *when* were the articles matching the topic were published.  Details about the returned information is available on the **[data model page](https://github.com/EventRegistry/event-registry-python/wiki/Data-models)**. 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getArticlesForTopicPageTest() throws Exception {
        String apiKey = null;
        String uri = null;
        String resultType = null;
        Integer maxDaysBack = null;
        String onlyAfterTm = null;
        Integer articlesPage = null;
        Integer articlesCount = null;
        String articlesSortBy = null;
        Boolean articlesSortByAsc = null;
        List<String> dataType = null;
        Integer articleBodyLen = null;
        Boolean includeArticleTitle = null;
        Boolean includeArticleBasicInfo = null;
        Boolean includeArticleBody = null;
        Boolean includeArticleEventUri = null;
        Boolean includeArticleSocialScore = null;
        Boolean includeArticleSentiment = null;
        Boolean includeArticleConcepts = null;
        Boolean includeArticleCategories = null;
        Boolean includeArticleLocation = null;
        Boolean includeArticleImage = null;
        Boolean includeArticleVideos = null;
        Boolean includeArticleLinks = null;
        Boolean includeArticleExtractedDates = null;
        Boolean includeArticleDuplicateList = null;
        Boolean includeArticleOriginalArticle = null;
        Boolean includeSourceTitle = null;
        Boolean includeSourceDescription = null;
        Boolean includeSourceLocation = null;
        Boolean includeSourceRanking = null;
        Boolean includeConceptLabel = null;
        Boolean includeConceptImage = null;
        Boolean includeConceptSynonyms = null;
        Boolean includeConceptTrendingScore = null;
        String conceptLang = null;
        Boolean includeCategoryParentUri = null;
        Boolean includeLocationPopulation = null;
        Boolean includeLocationGeoNamesId = null;
        Boolean includeLocationCountryArea = null;
        Boolean includeLocationCountryContinent = null;
        InlineResponse2003 response = api.getArticlesForTopicPage(apiKey, uri, resultType, maxDaysBack, onlyAfterTm, articlesPage, articlesCount, articlesSortBy, articlesSortByAsc, dataType, articleBodyLen, includeArticleTitle, includeArticleBasicInfo, includeArticleBody, includeArticleEventUri, includeArticleSocialScore, includeArticleSentiment, includeArticleConcepts, includeArticleCategories, includeArticleLocation, includeArticleImage, includeArticleVideos, includeArticleLinks, includeArticleExtractedDates, includeArticleDuplicateList, includeArticleOriginalArticle, includeSourceTitle, includeSourceDescription, includeSourceLocation, includeSourceRanking, includeConceptLabel, includeConceptImage, includeConceptSynonyms, includeConceptTrendingScore, conceptLang, includeCategoryParentUri, includeLocationPopulation, includeLocationGeoNamesId, includeLocationCountryArea, includeLocationCountryContinent);

        // TODO: test validations
    }
    /**
     * The minute stream of news articles added to Event Registry
     *
     * The API endpoint allows the user to obtain the full list of news articles added to Event Registry in the last minute. This is the only API call that also allows returning more than 100 articles per call. If more than 100 articles are returned, then correspondingly higher number of tokens are used per call.  Without any additional filters, the API will return 100 articles added in the last minute. By specifying filters like &#x60;lang&#x60;, &#x60;keyword&#x60;, &#x60;conceptUri&#x60; and others, you can however limit the recently added content to only the subset that matches these filters.  Examples of use are provided on the **[examples page](https://eventregistry.org/documentation/examples#event-registry-api-examples-articles-minute-stream-articles)**. 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void minuteStreamArticlesTest() throws Exception {
        String apiKey = null;
        Integer recentActivityArticlesMaxArticleCount = null;
        String recentActivityArticlesUpdatesAfterUri = null;
        Integer recentActivityArticlesUpdatesAfterMinsAgo = null;
        String recentActivityArticlesUpdatesAfterTm = null;
        Integer articleBodyLen = null;
        List<String> dataType = null;
        List<String> keyword = null;
        List<String> conceptUri = null;
        List<String> categoryUri = null;
        List<String> sourceUri = null;
        List<String> sourceLocationUri = null;
        List<String> sourceGroupUri = null;
        List<String> authorUri = null;
        List<String> locationUri = null;
        List<String> lang = null;
        String keywordLoc = null;
        String keywordOper = null;
        String conceptOper = null;
        String categoryOper = null;
        Integer startSourceRankPercentile = null;
        Integer endSourceRankPercentile = null;
        Integer minSentimentArticle = null;
        Integer maxSentimentArticle = null;
        String isDuplicateFilter = null;
        String hasDuplicateFilter = null;
        String eventFilter = null;
        InlineResponse2005 response = api.minuteStreamArticles(apiKey, recentActivityArticlesMaxArticleCount, recentActivityArticlesUpdatesAfterUri, recentActivityArticlesUpdatesAfterMinsAgo, recentActivityArticlesUpdatesAfterTm, articleBodyLen, dataType, keyword, conceptUri, categoryUri, sourceUri, sourceLocationUri, sourceGroupUri, authorUri, locationUri, lang, keywordLoc, keywordOper, conceptOper, categoryOper, startSourceRankPercentile, endSourceRankPercentile, minSentimentArticle, maxSentimentArticle, isDuplicateFilter, hasDuplicateFilter, eventFilter);

        // TODO: test validations
    }
}
