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
import io.swagger.client.model.Concept;
import io.swagger.client.model.MultipleItemsForVisualization;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * AllOfConceptAggrConceptAggr
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-06-03T18:38:48.218840542Z[GMT]")

public class AllOfConceptAggrConceptAggr extends MultipleItemsForVisualization {
  @SerializedName("results")
  private List<Concept> results = null;

  public AllOfConceptAggrConceptAggr results(List<Concept> results) {
    this.results = results;
    return this;
  }

  public AllOfConceptAggrConceptAggr addResultsItem(Concept resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<Concept>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @Schema(description = "")
  public List<Concept> getResults() {
    return results;
  }

  public void setResults(List<Concept> results) {
    this.results = results;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllOfConceptAggrConceptAggr allOfConceptAggrConceptAggr = (AllOfConceptAggrConceptAggr) o;
    return Objects.equals(this.results, allOfConceptAggrConceptAggr.results) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllOfConceptAggrConceptAggr {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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