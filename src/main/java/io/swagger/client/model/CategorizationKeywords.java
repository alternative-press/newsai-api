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
 * CategorizationKeywords
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-06-03T18:38:48.218840542Z[GMT]")

public class CategorizationKeywords {
  @SerializedName("keyword")
  private String keyword = null;

  @SerializedName("wgt")
  private Double wgt = null;

  public CategorizationKeywords keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

   /**
   * Get keyword
   * @return keyword
  **/
  @Schema(example = "Investing", description = "")
  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }

  public CategorizationKeywords wgt(Double wgt) {
    this.wgt = wgt;
    return this;
  }

   /**
   * Get wgt
   * @return wgt
  **/
  @Schema(example = "0.24", description = "")
  public Double getWgt() {
    return wgt;
  }

  public void setWgt(Double wgt) {
    this.wgt = wgt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CategorizationKeywords categorizationKeywords = (CategorizationKeywords) o;
    return Objects.equals(this.keyword, categorizationKeywords.keyword) &&
        Objects.equals(this.wgt, categorizationKeywords.wgt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyword, wgt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategorizationKeywords {\n");
    
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    wgt: ").append(toIndentedString(wgt)).append("\n");
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