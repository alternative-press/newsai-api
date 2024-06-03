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
import io.swagger.client.model.AnnotationSupport;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * AnnotationAnnotations
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-06-03T18:38:48.218840542Z[GMT]")

public class AnnotationAnnotations {
  @SerializedName("url")
  private String url = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("lang")
  private String lang = null;

  @SerializedName("secUrl")
  private String secUrl = null;

  @SerializedName("secTitle")
  private String secTitle = null;

  @SerializedName("secLang")
  private String secLang = null;

  @SerializedName("dbPediaIri")
  private String dbPediaIri = null;

  @SerializedName("dbPediaTypes")
  private List<String> dbPediaTypes = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("wgt")
  private Double wgt = null;

  @SerializedName("pageRank")
  private Double pageRank = null;

  @SerializedName("wikiDataItemId")
  private String wikiDataItemId = null;

  @SerializedName("wikiDataClassIds")
  private List<String> wikiDataClassIds = null;

  @SerializedName("support")
  private List<AnnotationSupport> support = null;

  public AnnotationAnnotations url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @Schema(example = "http://en.wikipedia.org/wiki/Microsoft", description = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public AnnotationAnnotations title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @Schema(example = "Microsoft", description = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public AnnotationAnnotations lang(String lang) {
    this.lang = lang;
    return this;
  }

   /**
   * Get lang
   * @return lang
  **/
  @Schema(example = "eng", description = "")
  public String getLang() {
    return lang;
  }

  public void setLang(String lang) {
    this.lang = lang;
  }

  public AnnotationAnnotations secUrl(String secUrl) {
    this.secUrl = secUrl;
    return this;
  }

   /**
   * Get secUrl
   * @return secUrl
  **/
  @Schema(example = "http://en.wikipedia.org/wiki/Microsoft", description = "")
  public String getSecUrl() {
    return secUrl;
  }

  public void setSecUrl(String secUrl) {
    this.secUrl = secUrl;
  }

  public AnnotationAnnotations secTitle(String secTitle) {
    this.secTitle = secTitle;
    return this;
  }

   /**
   * Get secTitle
   * @return secTitle
  **/
  @Schema(example = "Microsoft", description = "")
  public String getSecTitle() {
    return secTitle;
  }

  public void setSecTitle(String secTitle) {
    this.secTitle = secTitle;
  }

  public AnnotationAnnotations secLang(String secLang) {
    this.secLang = secLang;
    return this;
  }

   /**
   * Get secLang
   * @return secLang
  **/
  @Schema(example = "eng", description = "")
  public String getSecLang() {
    return secLang;
  }

  public void setSecLang(String secLang) {
    this.secLang = secLang;
  }

  public AnnotationAnnotations dbPediaIri(String dbPediaIri) {
    this.dbPediaIri = dbPediaIri;
    return this;
  }

   /**
   * Get dbPediaIri
   * @return dbPediaIri
  **/
  @Schema(example = "http://dbpedia.org/resource/Microsoft", description = "")
  public String getDbPediaIri() {
    return dbPediaIri;
  }

  public void setDbPediaIri(String dbPediaIri) {
    this.dbPediaIri = dbPediaIri;
  }

  public AnnotationAnnotations dbPediaTypes(List<String> dbPediaTypes) {
    this.dbPediaTypes = dbPediaTypes;
    return this;
  }

  public AnnotationAnnotations addDbPediaTypesItem(String dbPediaTypesItem) {
    if (this.dbPediaTypes == null) {
      this.dbPediaTypes = new ArrayList<String>();
    }
    this.dbPediaTypes.add(dbPediaTypesItem);
    return this;
  }

   /**
   * Get dbPediaTypes
   * @return dbPediaTypes
  **/
  @Schema(description = "")
  public List<String> getDbPediaTypes() {
    return dbPediaTypes;
  }

  public void setDbPediaTypes(List<String> dbPediaTypes) {
    this.dbPediaTypes = dbPediaTypes;
  }

  public AnnotationAnnotations type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(example = "org", description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public AnnotationAnnotations wgt(Double wgt) {
    this.wgt = wgt;
    return this;
  }

   /**
   * Get wgt
   * @return wgt
  **/
  @Schema(example = "0.9", description = "")
  public Double getWgt() {
    return wgt;
  }

  public void setWgt(Double wgt) {
    this.wgt = wgt;
  }

  public AnnotationAnnotations pageRank(Double pageRank) {
    this.pageRank = pageRank;
    return this;
  }

   /**
   * Get pageRank
   * @return pageRank
  **/
  @Schema(example = "0.254", description = "")
  public Double getPageRank() {
    return pageRank;
  }

  public void setPageRank(Double pageRank) {
    this.pageRank = pageRank;
  }

  public AnnotationAnnotations wikiDataItemId(String wikiDataItemId) {
    this.wikiDataItemId = wikiDataItemId;
    return this;
  }

   /**
   * Get wikiDataItemId
   * @return wikiDataItemId
  **/
  @Schema(example = "Q2283", description = "")
  public String getWikiDataItemId() {
    return wikiDataItemId;
  }

  public void setWikiDataItemId(String wikiDataItemId) {
    this.wikiDataItemId = wikiDataItemId;
  }

  public AnnotationAnnotations wikiDataClassIds(List<String> wikiDataClassIds) {
    this.wikiDataClassIds = wikiDataClassIds;
    return this;
  }

  public AnnotationAnnotations addWikiDataClassIdsItem(String wikiDataClassIdsItem) {
    if (this.wikiDataClassIds == null) {
      this.wikiDataClassIds = new ArrayList<String>();
    }
    this.wikiDataClassIds.add(wikiDataClassIdsItem);
    return this;
  }

   /**
   * Get wikiDataClassIds
   * @return wikiDataClassIds
  **/
  @Schema(description = "")
  public List<String> getWikiDataClassIds() {
    return wikiDataClassIds;
  }

  public void setWikiDataClassIds(List<String> wikiDataClassIds) {
    this.wikiDataClassIds = wikiDataClassIds;
  }

  public AnnotationAnnotations support(List<AnnotationSupport> support) {
    this.support = support;
    return this;
  }

  public AnnotationAnnotations addSupportItem(AnnotationSupport supportItem) {
    if (this.support == null) {
      this.support = new ArrayList<AnnotationSupport>();
    }
    this.support.add(supportItem);
    return this;
  }

   /**
   * Get support
   * @return support
  **/
  @Schema(description = "")
  public List<AnnotationSupport> getSupport() {
    return support;
  }

  public void setSupport(List<AnnotationSupport> support) {
    this.support = support;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnnotationAnnotations annotationAnnotations = (AnnotationAnnotations) o;
    return Objects.equals(this.url, annotationAnnotations.url) &&
        Objects.equals(this.title, annotationAnnotations.title) &&
        Objects.equals(this.lang, annotationAnnotations.lang) &&
        Objects.equals(this.secUrl, annotationAnnotations.secUrl) &&
        Objects.equals(this.secTitle, annotationAnnotations.secTitle) &&
        Objects.equals(this.secLang, annotationAnnotations.secLang) &&
        Objects.equals(this.dbPediaIri, annotationAnnotations.dbPediaIri) &&
        Objects.equals(this.dbPediaTypes, annotationAnnotations.dbPediaTypes) &&
        Objects.equals(this.type, annotationAnnotations.type) &&
        Objects.equals(this.wgt, annotationAnnotations.wgt) &&
        Objects.equals(this.pageRank, annotationAnnotations.pageRank) &&
        Objects.equals(this.wikiDataItemId, annotationAnnotations.wikiDataItemId) &&
        Objects.equals(this.wikiDataClassIds, annotationAnnotations.wikiDataClassIds) &&
        Objects.equals(this.support, annotationAnnotations.support);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, title, lang, secUrl, secTitle, secLang, dbPediaIri, dbPediaTypes, type, wgt, pageRank, wikiDataItemId, wikiDataClassIds, support);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnnotationAnnotations {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    secUrl: ").append(toIndentedString(secUrl)).append("\n");
    sb.append("    secTitle: ").append(toIndentedString(secTitle)).append("\n");
    sb.append("    secLang: ").append(toIndentedString(secLang)).append("\n");
    sb.append("    dbPediaIri: ").append(toIndentedString(dbPediaIri)).append("\n");
    sb.append("    dbPediaTypes: ").append(toIndentedString(dbPediaTypes)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    wgt: ").append(toIndentedString(wgt)).append("\n");
    sb.append("    pageRank: ").append(toIndentedString(pageRank)).append("\n");
    sb.append("    wikiDataItemId: ").append(toIndentedString(wikiDataItemId)).append("\n");
    sb.append("    wikiDataClassIds: ").append(toIndentedString(wikiDataClassIds)).append("\n");
    sb.append("    support: ").append(toIndentedString(support)).append("\n");
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