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
import java.util.ArrayList;
import java.util.List;
/**
 * AnnotationSettings
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-06-03T18:38:48.218840542Z[GMT]")

public class AnnotationSettings {
  @SerializedName("pageRankSqThreshold")
  private Integer pageRankSqThreshold = null;

  @SerializedName("applyPageRankSqThreshold")
  private Boolean applyPageRankSqThreshold = null;

  @SerializedName("minPMentionGivenPhrase")
  private Integer minPMentionGivenPhrase = null;

  @SerializedName("maxMentionEntropy")
  private Integer maxMentionEntropy = null;

  @SerializedName("maxTargetsPerMention")
  private Integer maxTargetsPerMention = null;

  @SerializedName("useLogLinkCounts")
  private Boolean useLogLinkCounts = null;

  @SerializedName("candSelectionUseLinearizedPageRank")
  private Boolean candSelectionUseLinearizedPageRank = null;

  @SerializedName("candSelectionPageRankThreshold")
  private Integer candSelectionPageRankThreshold = null;

  @SerializedName("candSelectionCosineWeight")
  private Integer candSelectionCosineWeight = null;

  @SerializedName("candSelectionLinkCtxCosineWeight")
  private Integer candSelectionLinkCtxCosineWeight = null;

  @SerializedName("candSelectionUseLinkProb")
  private String candSelectionUseLinkProb = null;

  @SerializedName("semanticSimilarity")
  private String semanticSimilarity = null;

  @SerializedName("secondaryAnnotLanguage")
  private String secondaryAnnotLanguage = null;

  @SerializedName("minLinkFrequency")
  private Integer minLinkFrequency = null;

  @SerializedName("minLinkRelFrequency")
  private Integer minLinkRelFrequency = null;

  @SerializedName("nWordsToIgnoreFromList")
  private Integer nWordsToIgnoreFromList = null;

  @SerializedName("extraVocabsToInclude")
  private List<Object> extraVocabsToInclude = null;

  @SerializedName("altLabelSetsToUse")
  private List<String> altLabelSetsToUse = null;

  public AnnotationSettings pageRankSqThreshold(Integer pageRankSqThreshold) {
    this.pageRankSqThreshold = pageRankSqThreshold;
    return this;
  }

   /**
   * Get pageRankSqThreshold
   * @return pageRankSqThreshold
  **/
  @Schema(description = "")
  public Integer getPageRankSqThreshold() {
    return pageRankSqThreshold;
  }

  public void setPageRankSqThreshold(Integer pageRankSqThreshold) {
    this.pageRankSqThreshold = pageRankSqThreshold;
  }

  public AnnotationSettings applyPageRankSqThreshold(Boolean applyPageRankSqThreshold) {
    this.applyPageRankSqThreshold = applyPageRankSqThreshold;
    return this;
  }

   /**
   * Get applyPageRankSqThreshold
   * @return applyPageRankSqThreshold
  **/
  @Schema(description = "")
  public Boolean isApplyPageRankSqThreshold() {
    return applyPageRankSqThreshold;
  }

  public void setApplyPageRankSqThreshold(Boolean applyPageRankSqThreshold) {
    this.applyPageRankSqThreshold = applyPageRankSqThreshold;
  }

  public AnnotationSettings minPMentionGivenPhrase(Integer minPMentionGivenPhrase) {
    this.minPMentionGivenPhrase = minPMentionGivenPhrase;
    return this;
  }

   /**
   * Get minPMentionGivenPhrase
   * @return minPMentionGivenPhrase
  **/
  @Schema(description = "")
  public Integer getMinPMentionGivenPhrase() {
    return minPMentionGivenPhrase;
  }

  public void setMinPMentionGivenPhrase(Integer minPMentionGivenPhrase) {
    this.minPMentionGivenPhrase = minPMentionGivenPhrase;
  }

  public AnnotationSettings maxMentionEntropy(Integer maxMentionEntropy) {
    this.maxMentionEntropy = maxMentionEntropy;
    return this;
  }

   /**
   * Get maxMentionEntropy
   * @return maxMentionEntropy
  **/
  @Schema(description = "")
  public Integer getMaxMentionEntropy() {
    return maxMentionEntropy;
  }

  public void setMaxMentionEntropy(Integer maxMentionEntropy) {
    this.maxMentionEntropy = maxMentionEntropy;
  }

  public AnnotationSettings maxTargetsPerMention(Integer maxTargetsPerMention) {
    this.maxTargetsPerMention = maxTargetsPerMention;
    return this;
  }

   /**
   * Get maxTargetsPerMention
   * @return maxTargetsPerMention
  **/
  @Schema(description = "")
  public Integer getMaxTargetsPerMention() {
    return maxTargetsPerMention;
  }

  public void setMaxTargetsPerMention(Integer maxTargetsPerMention) {
    this.maxTargetsPerMention = maxTargetsPerMention;
  }

  public AnnotationSettings useLogLinkCounts(Boolean useLogLinkCounts) {
    this.useLogLinkCounts = useLogLinkCounts;
    return this;
  }

   /**
   * Get useLogLinkCounts
   * @return useLogLinkCounts
  **/
  @Schema(description = "")
  public Boolean isUseLogLinkCounts() {
    return useLogLinkCounts;
  }

  public void setUseLogLinkCounts(Boolean useLogLinkCounts) {
    this.useLogLinkCounts = useLogLinkCounts;
  }

  public AnnotationSettings candSelectionUseLinearizedPageRank(Boolean candSelectionUseLinearizedPageRank) {
    this.candSelectionUseLinearizedPageRank = candSelectionUseLinearizedPageRank;
    return this;
  }

   /**
   * Get candSelectionUseLinearizedPageRank
   * @return candSelectionUseLinearizedPageRank
  **/
  @Schema(description = "")
  public Boolean isCandSelectionUseLinearizedPageRank() {
    return candSelectionUseLinearizedPageRank;
  }

  public void setCandSelectionUseLinearizedPageRank(Boolean candSelectionUseLinearizedPageRank) {
    this.candSelectionUseLinearizedPageRank = candSelectionUseLinearizedPageRank;
  }

  public AnnotationSettings candSelectionPageRankThreshold(Integer candSelectionPageRankThreshold) {
    this.candSelectionPageRankThreshold = candSelectionPageRankThreshold;
    return this;
  }

   /**
   * Get candSelectionPageRankThreshold
   * @return candSelectionPageRankThreshold
  **/
  @Schema(description = "")
  public Integer getCandSelectionPageRankThreshold() {
    return candSelectionPageRankThreshold;
  }

  public void setCandSelectionPageRankThreshold(Integer candSelectionPageRankThreshold) {
    this.candSelectionPageRankThreshold = candSelectionPageRankThreshold;
  }

  public AnnotationSettings candSelectionCosineWeight(Integer candSelectionCosineWeight) {
    this.candSelectionCosineWeight = candSelectionCosineWeight;
    return this;
  }

   /**
   * Get candSelectionCosineWeight
   * @return candSelectionCosineWeight
  **/
  @Schema(description = "")
  public Integer getCandSelectionCosineWeight() {
    return candSelectionCosineWeight;
  }

  public void setCandSelectionCosineWeight(Integer candSelectionCosineWeight) {
    this.candSelectionCosineWeight = candSelectionCosineWeight;
  }

  public AnnotationSettings candSelectionLinkCtxCosineWeight(Integer candSelectionLinkCtxCosineWeight) {
    this.candSelectionLinkCtxCosineWeight = candSelectionLinkCtxCosineWeight;
    return this;
  }

   /**
   * Get candSelectionLinkCtxCosineWeight
   * @return candSelectionLinkCtxCosineWeight
  **/
  @Schema(description = "")
  public Integer getCandSelectionLinkCtxCosineWeight() {
    return candSelectionLinkCtxCosineWeight;
  }

  public void setCandSelectionLinkCtxCosineWeight(Integer candSelectionLinkCtxCosineWeight) {
    this.candSelectionLinkCtxCosineWeight = candSelectionLinkCtxCosineWeight;
  }

  public AnnotationSettings candSelectionUseLinkProb(String candSelectionUseLinkProb) {
    this.candSelectionUseLinkProb = candSelectionUseLinkProb;
    return this;
  }

   /**
   * Get candSelectionUseLinkProb
   * @return candSelectionUseLinkProb
  **/
  @Schema(description = "")
  public String getCandSelectionUseLinkProb() {
    return candSelectionUseLinkProb;
  }

  public void setCandSelectionUseLinkProb(String candSelectionUseLinkProb) {
    this.candSelectionUseLinkProb = candSelectionUseLinkProb;
  }

  public AnnotationSettings semanticSimilarity(String semanticSimilarity) {
    this.semanticSimilarity = semanticSimilarity;
    return this;
  }

   /**
   * Get semanticSimilarity
   * @return semanticSimilarity
  **/
  @Schema(description = "")
  public String getSemanticSimilarity() {
    return semanticSimilarity;
  }

  public void setSemanticSimilarity(String semanticSimilarity) {
    this.semanticSimilarity = semanticSimilarity;
  }

  public AnnotationSettings secondaryAnnotLanguage(String secondaryAnnotLanguage) {
    this.secondaryAnnotLanguage = secondaryAnnotLanguage;
    return this;
  }

   /**
   * Get secondaryAnnotLanguage
   * @return secondaryAnnotLanguage
  **/
  @Schema(description = "")
  public String getSecondaryAnnotLanguage() {
    return secondaryAnnotLanguage;
  }

  public void setSecondaryAnnotLanguage(String secondaryAnnotLanguage) {
    this.secondaryAnnotLanguage = secondaryAnnotLanguage;
  }

  public AnnotationSettings minLinkFrequency(Integer minLinkFrequency) {
    this.minLinkFrequency = minLinkFrequency;
    return this;
  }

   /**
   * Get minLinkFrequency
   * @return minLinkFrequency
  **/
  @Schema(description = "")
  public Integer getMinLinkFrequency() {
    return minLinkFrequency;
  }

  public void setMinLinkFrequency(Integer minLinkFrequency) {
    this.minLinkFrequency = minLinkFrequency;
  }

  public AnnotationSettings minLinkRelFrequency(Integer minLinkRelFrequency) {
    this.minLinkRelFrequency = minLinkRelFrequency;
    return this;
  }

   /**
   * Get minLinkRelFrequency
   * @return minLinkRelFrequency
  **/
  @Schema(description = "")
  public Integer getMinLinkRelFrequency() {
    return minLinkRelFrequency;
  }

  public void setMinLinkRelFrequency(Integer minLinkRelFrequency) {
    this.minLinkRelFrequency = minLinkRelFrequency;
  }

  public AnnotationSettings nWordsToIgnoreFromList(Integer nWordsToIgnoreFromList) {
    this.nWordsToIgnoreFromList = nWordsToIgnoreFromList;
    return this;
  }

   /**
   * Get nWordsToIgnoreFromList
   * @return nWordsToIgnoreFromList
  **/
  @Schema(description = "")
  public Integer getNWordsToIgnoreFromList() {
    return nWordsToIgnoreFromList;
  }

  public void setNWordsToIgnoreFromList(Integer nWordsToIgnoreFromList) {
    this.nWordsToIgnoreFromList = nWordsToIgnoreFromList;
  }

  public AnnotationSettings extraVocabsToInclude(List<Object> extraVocabsToInclude) {
    this.extraVocabsToInclude = extraVocabsToInclude;
    return this;
  }

  public AnnotationSettings addExtraVocabsToIncludeItem(Object extraVocabsToIncludeItem) {
    if (this.extraVocabsToInclude == null) {
      this.extraVocabsToInclude = new ArrayList<Object>();
    }
    this.extraVocabsToInclude.add(extraVocabsToIncludeItem);
    return this;
  }

   /**
   * Get extraVocabsToInclude
   * @return extraVocabsToInclude
  **/
  @Schema(description = "")
  public List<Object> getExtraVocabsToInclude() {
    return extraVocabsToInclude;
  }

  public void setExtraVocabsToInclude(List<Object> extraVocabsToInclude) {
    this.extraVocabsToInclude = extraVocabsToInclude;
  }

  public AnnotationSettings altLabelSetsToUse(List<String> altLabelSetsToUse) {
    this.altLabelSetsToUse = altLabelSetsToUse;
    return this;
  }

  public AnnotationSettings addAltLabelSetsToUseItem(String altLabelSetsToUseItem) {
    if (this.altLabelSetsToUse == null) {
      this.altLabelSetsToUse = new ArrayList<String>();
    }
    this.altLabelSetsToUse.add(altLabelSetsToUseItem);
    return this;
  }

   /**
   * Get altLabelSetsToUse
   * @return altLabelSetsToUse
  **/
  @Schema(description = "")
  public List<String> getAltLabelSetsToUse() {
    return altLabelSetsToUse;
  }

  public void setAltLabelSetsToUse(List<String> altLabelSetsToUse) {
    this.altLabelSetsToUse = altLabelSetsToUse;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnnotationSettings annotationSettings = (AnnotationSettings) o;
    return Objects.equals(this.pageRankSqThreshold, annotationSettings.pageRankSqThreshold) &&
        Objects.equals(this.applyPageRankSqThreshold, annotationSettings.applyPageRankSqThreshold) &&
        Objects.equals(this.minPMentionGivenPhrase, annotationSettings.minPMentionGivenPhrase) &&
        Objects.equals(this.maxMentionEntropy, annotationSettings.maxMentionEntropy) &&
        Objects.equals(this.maxTargetsPerMention, annotationSettings.maxTargetsPerMention) &&
        Objects.equals(this.useLogLinkCounts, annotationSettings.useLogLinkCounts) &&
        Objects.equals(this.candSelectionUseLinearizedPageRank, annotationSettings.candSelectionUseLinearizedPageRank) &&
        Objects.equals(this.candSelectionPageRankThreshold, annotationSettings.candSelectionPageRankThreshold) &&
        Objects.equals(this.candSelectionCosineWeight, annotationSettings.candSelectionCosineWeight) &&
        Objects.equals(this.candSelectionLinkCtxCosineWeight, annotationSettings.candSelectionLinkCtxCosineWeight) &&
        Objects.equals(this.candSelectionUseLinkProb, annotationSettings.candSelectionUseLinkProb) &&
        Objects.equals(this.semanticSimilarity, annotationSettings.semanticSimilarity) &&
        Objects.equals(this.secondaryAnnotLanguage, annotationSettings.secondaryAnnotLanguage) &&
        Objects.equals(this.minLinkFrequency, annotationSettings.minLinkFrequency) &&
        Objects.equals(this.minLinkRelFrequency, annotationSettings.minLinkRelFrequency) &&
        Objects.equals(this.nWordsToIgnoreFromList, annotationSettings.nWordsToIgnoreFromList) &&
        Objects.equals(this.extraVocabsToInclude, annotationSettings.extraVocabsToInclude) &&
        Objects.equals(this.altLabelSetsToUse, annotationSettings.altLabelSetsToUse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageRankSqThreshold, applyPageRankSqThreshold, minPMentionGivenPhrase, maxMentionEntropy, maxTargetsPerMention, useLogLinkCounts, candSelectionUseLinearizedPageRank, candSelectionPageRankThreshold, candSelectionCosineWeight, candSelectionLinkCtxCosineWeight, candSelectionUseLinkProb, semanticSimilarity, secondaryAnnotLanguage, minLinkFrequency, minLinkRelFrequency, nWordsToIgnoreFromList, extraVocabsToInclude, altLabelSetsToUse);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnnotationSettings {\n");
    
    sb.append("    pageRankSqThreshold: ").append(toIndentedString(pageRankSqThreshold)).append("\n");
    sb.append("    applyPageRankSqThreshold: ").append(toIndentedString(applyPageRankSqThreshold)).append("\n");
    sb.append("    minPMentionGivenPhrase: ").append(toIndentedString(minPMentionGivenPhrase)).append("\n");
    sb.append("    maxMentionEntropy: ").append(toIndentedString(maxMentionEntropy)).append("\n");
    sb.append("    maxTargetsPerMention: ").append(toIndentedString(maxTargetsPerMention)).append("\n");
    sb.append("    useLogLinkCounts: ").append(toIndentedString(useLogLinkCounts)).append("\n");
    sb.append("    candSelectionUseLinearizedPageRank: ").append(toIndentedString(candSelectionUseLinearizedPageRank)).append("\n");
    sb.append("    candSelectionPageRankThreshold: ").append(toIndentedString(candSelectionPageRankThreshold)).append("\n");
    sb.append("    candSelectionCosineWeight: ").append(toIndentedString(candSelectionCosineWeight)).append("\n");
    sb.append("    candSelectionLinkCtxCosineWeight: ").append(toIndentedString(candSelectionLinkCtxCosineWeight)).append("\n");
    sb.append("    candSelectionUseLinkProb: ").append(toIndentedString(candSelectionUseLinkProb)).append("\n");
    sb.append("    semanticSimilarity: ").append(toIndentedString(semanticSimilarity)).append("\n");
    sb.append("    secondaryAnnotLanguage: ").append(toIndentedString(secondaryAnnotLanguage)).append("\n");
    sb.append("    minLinkFrequency: ").append(toIndentedString(minLinkFrequency)).append("\n");
    sb.append("    minLinkRelFrequency: ").append(toIndentedString(minLinkRelFrequency)).append("\n");
    sb.append("    nWordsToIgnoreFromList: ").append(toIndentedString(nWordsToIgnoreFromList)).append("\n");
    sb.append("    extraVocabsToInclude: ").append(toIndentedString(extraVocabsToInclude)).append("\n");
    sb.append("    altLabelSetsToUse: ").append(toIndentedString(altLabelSetsToUse)).append("\n");
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