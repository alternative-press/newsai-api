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
import io.swagger.client.model.Label;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse20013
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-06-03T18:38:48.218840542Z[GMT]")

public class InlineResponse20013 {
  @SerializedName("type")
  private String type = null;

  @SerializedName("wikiUri")
  private String wikiUri = null;

  @SerializedName("label")
  private Label label = null;

  @SerializedName("lat")
  private Integer lat = null;

  @SerializedName("long")
  private Integer _long = null;

  public InlineResponse20013 type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public InlineResponse20013 wikiUri(String wikiUri) {
    this.wikiUri = wikiUri;
    return this;
  }

   /**
   * Get wikiUri
   * @return wikiUri
  **/
  @Schema(description = "")
  public String getWikiUri() {
    return wikiUri;
  }

  public void setWikiUri(String wikiUri) {
    this.wikiUri = wikiUri;
  }

  public InlineResponse20013 label(Label label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @Schema(description = "")
  public Label getLabel() {
    return label;
  }

  public void setLabel(Label label) {
    this.label = label;
  }

  public InlineResponse20013 lat(Integer lat) {
    this.lat = lat;
    return this;
  }

   /**
   * Get lat
   * @return lat
  **/
  @Schema(description = "")
  public Integer getLat() {
    return lat;
  }

  public void setLat(Integer lat) {
    this.lat = lat;
  }

  public InlineResponse20013 _long(Integer _long) {
    this._long = _long;
    return this;
  }

   /**
   * Get _long
   * @return _long
  **/
  @Schema(description = "")
  public Integer getLong() {
    return _long;
  }

  public void setLong(Integer _long) {
    this._long = _long;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20013 inlineResponse20013 = (InlineResponse20013) o;
    return Objects.equals(this.type, inlineResponse20013.type) &&
        Objects.equals(this.wikiUri, inlineResponse20013.wikiUri) &&
        Objects.equals(this.label, inlineResponse20013.label) &&
        Objects.equals(this.lat, inlineResponse20013.lat) &&
        Objects.equals(this._long, inlineResponse20013._long);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, wikiUri, label, lat, _long);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20013 {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    wikiUri: ").append(toIndentedString(wikiUri)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    _long: ").append(toIndentedString(_long)).append("\n");
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