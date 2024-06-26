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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Sentiment
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-06-03T18:38:48.218840542Z[GMT]")

public class Sentiment {
  @SerializedName("avgSent")
  private Double avgSent = null;

  @SerializedName("sentimentPerSent")
  private List<Double> sentimentPerSent = null;

  public Sentiment avgSent(Double avgSent) {
    this.avgSent = avgSent;
    return this;
  }

   /**
   * Get avgSent
   * @return avgSent
  **/
  @Schema(description = "")
  public Double getAvgSent() {
    return avgSent;
  }

  public void setAvgSent(Double avgSent) {
    this.avgSent = avgSent;
  }

  public Sentiment sentimentPerSent(List<Double> sentimentPerSent) {
    this.sentimentPerSent = sentimentPerSent;
    return this;
  }

  public Sentiment addSentimentPerSentItem(Double sentimentPerSentItem) {
    if (this.sentimentPerSent == null) {
      this.sentimentPerSent = new ArrayList<Double>();
    }
    this.sentimentPerSent.add(sentimentPerSentItem);
    return this;
  }

   /**
   * Get sentimentPerSent
   * @return sentimentPerSent
  **/
  @Schema(description = "")
  public List<Double> getSentimentPerSent() {
    return sentimentPerSent;
  }

  public void setSentimentPerSent(List<Double> sentimentPerSent) {
    this.sentimentPerSent = sentimentPerSent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sentiment sentiment = (Sentiment) o;
    return Objects.equals(this.avgSent, sentiment.avgSent) &&
        Objects.equals(this.sentimentPerSent, sentiment.sentimentPerSent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avgSent, sentimentPerSent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sentiment {\n");
    
    sb.append("    avgSent: ").append(toIndentedString(avgSent)).append("\n");
    sb.append("    sentimentPerSent: ").append(toIndentedString(sentimentPerSent)).append("\n");
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
