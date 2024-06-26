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
 * ConceptGraph
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-06-03T18:38:48.218840542Z[GMT]")

public class ConceptGraph {
  @SerializedName("conceptGraph")
  private AllOfConceptGraphConceptGraph conceptGraph = null;

  public ConceptGraph conceptGraph(AllOfConceptGraphConceptGraph conceptGraph) {
    this.conceptGraph = conceptGraph;
    return this;
  }

   /**
   * Get conceptGraph
   * @return conceptGraph
  **/
  @Schema(description = "")
  public AllOfConceptGraphConceptGraph getConceptGraph() {
    return conceptGraph;
  }

  public void setConceptGraph(AllOfConceptGraphConceptGraph conceptGraph) {
    this.conceptGraph = conceptGraph;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConceptGraph conceptGraph = (ConceptGraph) o;
    return Objects.equals(this.conceptGraph, conceptGraph.conceptGraph);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conceptGraph);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConceptGraph {\n");
    
    sb.append("    conceptGraph: ").append(toIndentedString(conceptGraph)).append("\n");
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
