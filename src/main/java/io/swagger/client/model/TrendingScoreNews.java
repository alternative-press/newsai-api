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
/**
 * TrendingScoreNews
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-06-03T18:38:48.218840542Z[GMT]")

public class TrendingScoreNews {
  @SerializedName("score")
  private Double score = null;

  @SerializedName("testPopFq")
  private Integer testPopFq = null;

  @SerializedName("nullPopFq")
  private Integer nullPopFq = null;

  public TrendingScoreNews score(Double score) {
    this.score = score;
    return this;
  }

   /**
   * Get score
   * @return score
  **/
  @Schema(description = "")
  public Double getScore() {
    return score;
  }

  public void setScore(Double score) {
    this.score = score;
  }

  public TrendingScoreNews testPopFq(Integer testPopFq) {
    this.testPopFq = testPopFq;
    return this;
  }

   /**
   * Get testPopFq
   * @return testPopFq
  **/
  @Schema(description = "")
  public Integer getTestPopFq() {
    return testPopFq;
  }

  public void setTestPopFq(Integer testPopFq) {
    this.testPopFq = testPopFq;
  }

  public TrendingScoreNews nullPopFq(Integer nullPopFq) {
    this.nullPopFq = nullPopFq;
    return this;
  }

   /**
   * Get nullPopFq
   * @return nullPopFq
  **/
  @Schema(description = "")
  public Integer getNullPopFq() {
    return nullPopFq;
  }

  public void setNullPopFq(Integer nullPopFq) {
    this.nullPopFq = nullPopFq;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrendingScoreNews trendingScoreNews = (TrendingScoreNews) o;
    return Objects.equals(this.score, trendingScoreNews.score) &&
        Objects.equals(this.testPopFq, trendingScoreNews.testPopFq) &&
        Objects.equals(this.nullPopFq, trendingScoreNews.nullPopFq);
  }

  @Override
  public int hashCode() {
    return Objects.hash(score, testPopFq, nullPopFq);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrendingScoreNews {\n");
    
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    testPopFq: ").append(toIndentedString(testPopFq)).append("\n");
    sb.append("    nullPopFq: ").append(toIndentedString(nullPopFq)).append("\n");
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
