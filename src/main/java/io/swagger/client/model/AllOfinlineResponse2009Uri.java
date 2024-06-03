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

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.DateMentionAggr;
import io.swagger.client.model.Event;
import io.swagger.client.model.KeywordAggr;
import io.swagger.client.model.SourceExAggr;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * AllOfinlineResponse2009Uri
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-06-03T18:38:48.218840542Z[GMT]")

public class AllOfinlineResponse2009Uri {
  @SerializedName("info")
  private Event info = null;

  @SerializedName("articles")
  private Object articles = null;

  @SerializedName("articleUris")
  private Object articleUris = null;

  @SerializedName("keywordAggr")
  private Object keywordAggr = null;

  @SerializedName("sourceAggr")
  private Object sourceAggr = null;

  @SerializedName("dateMentionAggr")
  private Object dateMentionAggr = null;

  @SerializedName("articleTrend")
  private Object articleTrend = null;

  @SerializedName("similarEvents")
  private Object similarEvents = null;

  public AllOfinlineResponse2009Uri info(Event info) {
    this.info = info;
    return this;
  }

   /**
   * Get info
   * @return info
  **/
  @Schema(description = "")
  public Event getInfo() {
    return info;
  }

  public void setInfo(Event info) {
    this.info = info;
  }

  public AllOfinlineResponse2009Uri articles(Object articles) {
    this.articles = articles;
    return this;
  }

   /**
   * Get articles
   * @return articles
  **/
  @Schema(description = "")
  public Object getArticles() {
    return articles;
  }

  public void setArticles(Object articles) {
    this.articles = articles;
  }

  public AllOfinlineResponse2009Uri articleUris(Object articleUris) {
    this.articleUris = articleUris;
    return this;
  }

   /**
   * Get articleUris
   * @return articleUris
  **/
  @Schema(description = "")
  public Object getArticleUris() {
    return articleUris;
  }

  public void setArticleUris(Object articleUris) {
    this.articleUris = articleUris;
  }

  public AllOfinlineResponse2009Uri keywordAggr(Object keywordAggr) {
    this.keywordAggr = keywordAggr;
    return this;
  }

   /**
   * Get keywordAggr
   * @return keywordAggr
  **/
  @Schema(description = "")
  public Object getKeywordAggr() {
    return keywordAggr;
  }

  public void setKeywordAggr(Object keywordAggr) {
    this.keywordAggr = keywordAggr;
  }

  public AllOfinlineResponse2009Uri sourceAggr(Object sourceAggr) {
    this.sourceAggr = sourceAggr;
    return this;
  }

   /**
   * Get sourceAggr
   * @return sourceAggr
  **/
  @Schema(description = "")
  public Object getSourceAggr() {
    return sourceAggr;
  }

  public void setSourceAggr(Object sourceAggr) {
    this.sourceAggr = sourceAggr;
  }

  public AllOfinlineResponse2009Uri dateMentionAggr(Object dateMentionAggr) {
    this.dateMentionAggr = dateMentionAggr;
    return this;
  }

   /**
   * Get dateMentionAggr
   * @return dateMentionAggr
  **/
  @Schema(description = "")
  public Object getDateMentionAggr() {
    return dateMentionAggr;
  }

  public void setDateMentionAggr(Object dateMentionAggr) {
    this.dateMentionAggr = dateMentionAggr;
  }

  public AllOfinlineResponse2009Uri articleTrend(Object articleTrend) {
    this.articleTrend = articleTrend;
    return this;
  }

   /**
   * Get articleTrend
   * @return articleTrend
  **/
  @Schema(description = "")
  public Object getArticleTrend() {
    return articleTrend;
  }

  public void setArticleTrend(Object articleTrend) {
    this.articleTrend = articleTrend;
  }

  public AllOfinlineResponse2009Uri similarEvents(Object similarEvents) {
    this.similarEvents = similarEvents;
    return this;
  }

   /**
   * Get similarEvents
   * @return similarEvents
  **/
  @Schema(description = "")
  public Object getSimilarEvents() {
    return similarEvents;
  }

  public void setSimilarEvents(Object similarEvents) {
    this.similarEvents = similarEvents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllOfinlineResponse2009Uri allOfinlineResponse2009Uri = (AllOfinlineResponse2009Uri) o;
    return Objects.equals(this.info, allOfinlineResponse2009Uri.info) &&
        Objects.equals(this.articles, allOfinlineResponse2009Uri.articles) &&
        Objects.equals(this.articleUris, allOfinlineResponse2009Uri.articleUris) &&
        Objects.equals(this.keywordAggr, allOfinlineResponse2009Uri.keywordAggr) &&
        Objects.equals(this.sourceAggr, allOfinlineResponse2009Uri.sourceAggr) &&
        Objects.equals(this.dateMentionAggr, allOfinlineResponse2009Uri.dateMentionAggr) &&
        Objects.equals(this.articleTrend, allOfinlineResponse2009Uri.articleTrend) &&
        Objects.equals(this.similarEvents, allOfinlineResponse2009Uri.similarEvents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(info, articles, articleUris, keywordAggr, sourceAggr, dateMentionAggr, articleTrend, similarEvents);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllOfinlineResponse2009Uri {\n");
    
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    articles: ").append(toIndentedString(articles)).append("\n");
    sb.append("    articleUris: ").append(toIndentedString(articleUris)).append("\n");
    sb.append("    keywordAggr: ").append(toIndentedString(keywordAggr)).append("\n");
    sb.append("    sourceAggr: ").append(toIndentedString(sourceAggr)).append("\n");
    sb.append("    dateMentionAggr: ").append(toIndentedString(dateMentionAggr)).append("\n");
    sb.append("    articleTrend: ").append(toIndentedString(articleTrend)).append("\n");
    sb.append("    similarEvents: ").append(toIndentedString(similarEvents)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}