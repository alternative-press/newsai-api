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

import io.swagger.client.model.Annotation;
import io.swagger.client.model.Categorization;
import io.swagger.client.model.DetectLanguage;
import io.swagger.client.model.ExtractArticleInfo;
import io.swagger.client.model.InlineResponse200;
import io.swagger.client.model.InlineResponse2001;
import io.swagger.client.model.Sentiment;
import io.swagger.client.model.Similarity;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for TextAnalyticsApi
 */
@Ignore
public class TextAnalyticsApiTest {

    private final TextAnalyticsApi api = new TextAnalyticsApi();

    /**
     * identify people, locations, organizations and things mentioned in the document
     *
     * The endpoint is able to semantically annotate the provided document. The semantic annotation includes identification of people, locations, organizations and things mentioned in the document. The annotations all have a unique URI that is a url to the Wikipedia page for the concept. 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void annotateTest() throws Exception {
        String apiKey = null;
        String text = null;
        Integer minLinkFrequency = null;
        Double minLinkRelFrequency = null;
        Integer nWordsToIgnoreFromList = null;
        Double minPMentionGivenPhrase = null;
        Double pageRankSqThreshold = null;
        Boolean applyPageRankSqThreshold = null;
        Annotation response = api.annotate(apiKey, text, minLinkFrequency, minLinkRelFrequency, nWordsToIgnoreFromList, minPMentionGivenPhrase, pageRankSqThreshold, applyPageRankSqThreshold);

        // TODO: test validations
    }
    /**
     * Categorize the content into a set of predefined categories
     *
     * The categorization of your content into a predefined set of categories. The &#x60;dmoz&#x60; taxonomy contains over 5000 categories and can only be used for documents in English languge. The &#x60;news&#x60; taxonomy contains only 8 top level categories commonly used to categorize the news content, but can be applied for any language. The categorization into both taxonomies can work well only on documents of decent size (like news articles). 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void categorizeTest() throws Exception {
        String apiKey = null;
        String text = null;
        String taxonomy = null;
        Categorization response = api.categorize(apiKey, text, taxonomy);

        // TODO: test validations
    }
    /**
     * Detect the language of the input text
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void detectLanguageTest() throws Exception {
        String apiKey = null;
        String text = null;
        DetectLanguage response = api.detectLanguage(apiKey, text);

        // TODO: test validations
    }
    /**
     * Extract article information (title, body, authors, ...) from article URL
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void extractArticleInfoTest() throws Exception {
        String apiKey = null;
        String url = null;
        ExtractArticleInfo response = api.extractArticleInfo(apiKey, url);

        // TODO: test validations
    }
    /**
     * Compute semantic similarity of two documents, potentially in different languages
     *
     * This API endpoint allows you to compare two documents, potentially in different languages, and compute the semantic similarity between them.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void semanticSimilarityTest() throws Exception {
        String apiKey = null;
        String text1 = null;
        String text2 = null;
        Similarity response = api.semanticSimilarity(apiKey, text1, text2);

        // TODO: test validations
    }
    /**
     * Vocabulary based sentiment detection
     *
     * Compute the sentiment using a vocabulary based approach. The sentiment classification only works for English language. 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void sentimentTest() throws Exception {
        String apiKey = null;
        String text = null;
        Integer sentences = null;
        Sentiment response = api.sentiment(apiKey, text, sentences);

        // TODO: test validations
    }
    /**
     * Neural networks based approach to sentiment detection
     *
     * Compute the sentiment using a neural network model. The sentiment classification only works for English language. 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void sentiment_0Test() throws Exception {
        String apiKey = null;
        String text = null;
        Integer sentences = null;
        Sentiment response = api.sentiment_0(apiKey, text, sentences);

        // TODO: test validations
    }
    /**
     * Train a topic (concepts and categories) based on tweets matching your search filter
     *
     * You can train a definition of a topic by analyzing the tweets that match a particular search filter. The collection of tweets that will be analyzed can be identified based on a Twitter username, a hashtag or a regular keyword. The chosen number of tweets matching the criteria will be identified and analyzed by identifying the concepts mentioned in them and the content will be categorizer. In addition to analyzing the content of the tweets, the articles linked in the tweets will also be analyzed and information will be extracted from them in the same way. The concepts and categories that will be found more commonly in the tweets will receive a higher weight in your final topic. Once the topic is trained, you can use the endpoint &#x60;/trainTopic&#x60; with &#x60;action&#x3D;getTrainedTopic&#x60; and your topic &#x60;uri&#x60; to retrieve the topic definition. 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void trainTopicOnTwitterTest() throws Exception {
        String apiKey = null;
        String twitterQuery = null;
        Boolean useTweetText = null;
        Integer maxTweets = null;
        String normalization = null;
        String ignoreConceptTypes = null;
        Integer maxConcepts = null;
        Integer maxCategories = null;
        String notifyEmailAddress = null;
        InlineResponse200 response = api.trainTopicOnTwitter(apiKey, twitterQuery, useTweetText, maxTweets, normalization, ignoreConceptTypes, maxConcepts, maxCategories, notifyEmailAddress);

        // TODO: test validations
    }
    /**
     * Train a topic (concepts and categories) using your own documents
     *
     * The API endpoint can be used to train a definition of a topic by analyzing several documents that you can provide. The documents will be annotated and categorized and the topic will be then defined by identifying commonly mentioned concepts and categories. The concepts and categories that will be found more commonly in your documents will receive a higher weight in your topic.  Training of the topic can be done in several steps, which are triggered based on the specified &#x60;action&#x60; parameter. The initial step has to be a call with &#x60;action &#x3D; createTopic&#x60;. In the response you will receive a &#x60;uri&#x60; parameter that has to be specified in the followup calls.  In order to add documents to the topic specify &#x60;action &#x3D; addDocument&#x60;. The topic will be finished once you call the endpoint with &#x60;action &#x3D; finishTraining&#x60;. At that time, the returned information will also include the &#x60;topic&#x60; property containing the trained topic.  If you wish to retrieve the topic at some later point, you can retrieve it again by using &#x60;action &#x3D; getTrainedTopic&#x60;. 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void trainTopicOnTwitter_0Test() throws Exception {
        String apiKey = null;
        String action = null;
        String name = null;
        String uri = null;
        String text = null;
        Integer maxConcepts = null;
        Integer maxCategories = null;
        Boolean idfNormalization = null;
        InlineResponse2001 response = api.trainTopicOnTwitter_0(apiKey, action, name, uri, text, maxConcepts, maxCategories, idfNormalization);

        // TODO: test validations
    }
}