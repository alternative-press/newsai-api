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
 * AnnotationSupport
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-06-03T18:38:48.218840542Z[GMT]")

public class AnnotationSupport {
  @SerializedName("chFrom")
  private Integer chFrom = null;

  @SerializedName("chTo")
  private Integer chTo = null;

  @SerializedName("pMentionGivenSurface")
  private Double pMentionGivenSurface = null;

  @SerializedName("text")
  private String text = null;

  @SerializedName("wFrom")
  private Integer wFrom = null;

  @SerializedName("wTo")
  private Integer wTo = null;

  @SerializedName("wikiLang")
  private String wikiLang = null;

  public AnnotationSupport chFrom(Integer chFrom) {
    this.chFrom = chFrom;
    return this;
  }

   /**
   * Get chFrom
   * @return chFrom
  **/
  @Schema(example = "0", description = "")
  public Integer getChFrom() {
    return chFrom;
  }

  public void setChFrom(Integer chFrom) {
    this.chFrom = chFrom;
  }

  public AnnotationSupport chTo(Integer chTo) {
    this.chTo = chTo;
    return this;
  }

   /**
   * Get chTo
   * @return chTo
  **/
  @Schema(example = "8", description = "")
  public Integer getChTo() {
    return chTo;
  }

  public void setChTo(Integer chTo) {
    this.chTo = chTo;
  }

  public AnnotationSupport pMentionGivenSurface(Double pMentionGivenSurface) {
    this.pMentionGivenSurface = pMentionGivenSurface;
    return this;
  }

   /**
   * Get pMentionGivenSurface
   * @return pMentionGivenSurface
  **/
  @Schema(example = "0.255", description = "")
  public Double getPMentionGivenSurface() {
    return pMentionGivenSurface;
  }

  public void setPMentionGivenSurface(Double pMentionGivenSurface) {
    this.pMentionGivenSurface = pMentionGivenSurface;
  }

  public AnnotationSupport text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @Schema(example = "Microsoft", description = "")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public AnnotationSupport wFrom(Integer wFrom) {
    this.wFrom = wFrom;
    return this;
  }

   /**
   * Get wFrom
   * @return wFrom
  **/
  @Schema(example = "0", description = "")
  public Integer getWFrom() {
    return wFrom;
  }

  public void setWFrom(Integer wFrom) {
    this.wFrom = wFrom;
  }

  public AnnotationSupport wTo(Integer wTo) {
    this.wTo = wTo;
    return this;
  }

   /**
   * Get wTo
   * @return wTo
  **/
  @Schema(example = "0", description = "")
  public Integer getWTo() {
    return wTo;
  }

  public void setWTo(Integer wTo) {
    this.wTo = wTo;
  }

  public AnnotationSupport wikiLang(String wikiLang) {
    this.wikiLang = wikiLang;
    return this;
  }

   /**
   * Get wikiLang
   * @return wikiLang
  **/
  @Schema(example = "en", description = "")
  public String getWikiLang() {
    return wikiLang;
  }

  public void setWikiLang(String wikiLang) {
    this.wikiLang = wikiLang;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnnotationSupport annotationSupport = (AnnotationSupport) o;
    return Objects.equals(this.chFrom, annotationSupport.chFrom) &&
        Objects.equals(this.chTo, annotationSupport.chTo) &&
        Objects.equals(this.pMentionGivenSurface, annotationSupport.pMentionGivenSurface) &&
        Objects.equals(this.text, annotationSupport.text) &&
        Objects.equals(this.wFrom, annotationSupport.wFrom) &&
        Objects.equals(this.wTo, annotationSupport.wTo) &&
        Objects.equals(this.wikiLang, annotationSupport.wikiLang);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chFrom, chTo, pMentionGivenSurface, text, wFrom, wTo, wikiLang);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnnotationSupport {\n");
    
    sb.append("    chFrom: ").append(toIndentedString(chFrom)).append("\n");
    sb.append("    chTo: ").append(toIndentedString(chTo)).append("\n");
    sb.append("    pMentionGivenSurface: ").append(toIndentedString(pMentionGivenSurface)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    wFrom: ").append(toIndentedString(wFrom)).append("\n");
    sb.append("    wTo: ").append(toIndentedString(wTo)).append("\n");
    sb.append("    wikiLang: ").append(toIndentedString(wikiLang)).append("\n");
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