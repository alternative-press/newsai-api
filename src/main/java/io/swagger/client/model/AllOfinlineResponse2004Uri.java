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
import io.swagger.client.model.Article;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * AllOfinlineResponse2004Uri
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-06-03T18:38:48.218840542Z[GMT]")

public class AllOfinlineResponse2004Uri {
  @SerializedName("info")
  private Article info = null;

  @SerializedName("duplicatedArticles")
  private Object duplicatedArticles = null;

  @SerializedName("originalArticle")
  private Article originalArticle = null;

  public AllOfinlineResponse2004Uri info(Article info) {
    this.info = info;
    return this;
  }

   /**
   * Get info
   * @return info
  **/
  @Schema(description = "")
  public Article getInfo() {
    return info;
  }

  public void setInfo(Article info) {
    this.info = info;
  }

  public AllOfinlineResponse2004Uri duplicatedArticles(Object duplicatedArticles) {
    this.duplicatedArticles = duplicatedArticles;
    return this;
  }

   /**
   * Get duplicatedArticles
   * @return duplicatedArticles
  **/
  @Schema(description = "")
  public Object getDuplicatedArticles() {
    return duplicatedArticles;
  }

  public void setDuplicatedArticles(Object duplicatedArticles) {
    this.duplicatedArticles = duplicatedArticles;
  }

  public AllOfinlineResponse2004Uri originalArticle(Article originalArticle) {
    this.originalArticle = originalArticle;
    return this;
  }

   /**
   * Get originalArticle
   * @return originalArticle
  **/
  @Schema(description = "")
  public Article getOriginalArticle() {
    return originalArticle;
  }

  public void setOriginalArticle(Article originalArticle) {
    this.originalArticle = originalArticle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllOfinlineResponse2004Uri allOfinlineResponse2004Uri = (AllOfinlineResponse2004Uri) o;
    return Objects.equals(this.info, allOfinlineResponse2004Uri.info) &&
        Objects.equals(this.duplicatedArticles, allOfinlineResponse2004Uri.duplicatedArticles) &&
        Objects.equals(this.originalArticle, allOfinlineResponse2004Uri.originalArticle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(info, duplicatedArticles, originalArticle);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllOfinlineResponse2004Uri {\n");
    
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    duplicatedArticles: ").append(toIndentedString(duplicatedArticles)).append("\n");
    sb.append("    originalArticle: ").append(toIndentedString(originalArticle)).append("\n");
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
