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
 * MultipleItemsForVisualization
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-06-03T18:38:48.218840542Z[GMT]")

public class MultipleItemsForVisualization {
  @SerializedName("warning")
  private String warning = null;

  @SerializedName("usedResults")
  private Integer usedResults = null;

  @SerializedName("totalResults")
  private Integer totalResults = null;

  public MultipleItemsForVisualization warning(String warning) {
    this.warning = warning;
    return this;
  }

   /**
   * Get warning
   * @return warning
  **/
  @Schema(description = "")
  public String getWarning() {
    return warning;
  }

  public void setWarning(String warning) {
    this.warning = warning;
  }

  public MultipleItemsForVisualization usedResults(Integer usedResults) {
    this.usedResults = usedResults;
    return this;
  }

   /**
   * Get usedResults
   * @return usedResults
  **/
  @Schema(description = "")
  public Integer getUsedResults() {
    return usedResults;
  }

  public void setUsedResults(Integer usedResults) {
    this.usedResults = usedResults;
  }

  public MultipleItemsForVisualization totalResults(Integer totalResults) {
    this.totalResults = totalResults;
    return this;
  }

   /**
   * Get totalResults
   * @return totalResults
  **/
  @Schema(description = "")
  public Integer getTotalResults() {
    return totalResults;
  }

  public void setTotalResults(Integer totalResults) {
    this.totalResults = totalResults;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultipleItemsForVisualization multipleItemsForVisualization = (MultipleItemsForVisualization) o;
    return Objects.equals(this.warning, multipleItemsForVisualization.warning) &&
        Objects.equals(this.usedResults, multipleItemsForVisualization.usedResults) &&
        Objects.equals(this.totalResults, multipleItemsForVisualization.totalResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(warning, usedResults, totalResults);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultipleItemsForVisualization {\n");
    
    sb.append("    warning: ").append(toIndentedString(warning)).append("\n");
    sb.append("    usedResults: ").append(toIndentedString(usedResults)).append("\n");
    sb.append("    totalResults: ").append(toIndentedString(totalResults)).append("\n");
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
