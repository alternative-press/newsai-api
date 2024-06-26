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
 * ArticleExtractedDates
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-06-03T18:38:48.218840542Z[GMT]")

public class ArticleExtractedDates {
  @SerializedName("amb")
  private Boolean amb = null;

  @SerializedName("imp")
  private Boolean imp = null;

  @SerializedName("date")
  private String date = null;

  @SerializedName("textStart")
  private Integer textStart = null;

  @SerializedName("textEnd")
  private Integer textEnd = null;

  public ArticleExtractedDates amb(Boolean amb) {
    this.amb = amb;
    return this;
  }

   /**
   * Get amb
   * @return amb
  **/
  @Schema(description = "")
  public Boolean isAmb() {
    return amb;
  }

  public void setAmb(Boolean amb) {
    this.amb = amb;
  }

  public ArticleExtractedDates imp(Boolean imp) {
    this.imp = imp;
    return this;
  }

   /**
   * Get imp
   * @return imp
  **/
  @Schema(description = "")
  public Boolean isImp() {
    return imp;
  }

  public void setImp(Boolean imp) {
    this.imp = imp;
  }

  public ArticleExtractedDates date(String date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @Schema(description = "")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public ArticleExtractedDates textStart(Integer textStart) {
    this.textStart = textStart;
    return this;
  }

   /**
   * Get textStart
   * @return textStart
  **/
  @Schema(description = "")
  public Integer getTextStart() {
    return textStart;
  }

  public void setTextStart(Integer textStart) {
    this.textStart = textStart;
  }

  public ArticleExtractedDates textEnd(Integer textEnd) {
    this.textEnd = textEnd;
    return this;
  }

   /**
   * Get textEnd
   * @return textEnd
  **/
  @Schema(description = "")
  public Integer getTextEnd() {
    return textEnd;
  }

  public void setTextEnd(Integer textEnd) {
    this.textEnd = textEnd;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArticleExtractedDates articleExtractedDates = (ArticleExtractedDates) o;
    return Objects.equals(this.amb, articleExtractedDates.amb) &&
        Objects.equals(this.imp, articleExtractedDates.imp) &&
        Objects.equals(this.date, articleExtractedDates.date) &&
        Objects.equals(this.textStart, articleExtractedDates.textStart) &&
        Objects.equals(this.textEnd, articleExtractedDates.textEnd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amb, imp, date, textStart, textEnd);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArticleExtractedDates {\n");
    
    sb.append("    amb: ").append(toIndentedString(amb)).append("\n");
    sb.append("    imp: ").append(toIndentedString(imp)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    textStart: ").append(toIndentedString(textStart)).append("\n");
    sb.append("    textEnd: ").append(toIndentedString(textEnd)).append("\n");
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
