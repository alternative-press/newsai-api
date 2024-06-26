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
 * InlineResponse2001TopicCategories
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-06-03T18:38:48.218840542Z[GMT]")

public class InlineResponse2001TopicCategories {
  @SerializedName("uri")
  private String uri = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("wgt")
  private Float wgt = null;

  public InlineResponse2001TopicCategories uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * Get uri
   * @return uri
  **/
  @Schema(description = "")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public InlineResponse2001TopicCategories label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @Schema(description = "")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public InlineResponse2001TopicCategories wgt(Float wgt) {
    this.wgt = wgt;
    return this;
  }

   /**
   * Get wgt
   * @return wgt
  **/
  @Schema(description = "")
  public Float getWgt() {
    return wgt;
  }

  public void setWgt(Float wgt) {
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
    InlineResponse2001TopicCategories inlineResponse2001TopicCategories = (InlineResponse2001TopicCategories) o;
    return Objects.equals(this.uri, inlineResponse2001TopicCategories.uri) &&
        Objects.equals(this.label, inlineResponse2001TopicCategories.label) &&
        Objects.equals(this.wgt, inlineResponse2001TopicCategories.wgt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uri, label, wgt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001TopicCategories {\n");
    
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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
