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
import io.swagger.client.model.DetectLanguageChunk;
import io.swagger.client.model.DetectLanguageObject;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * DetectLanguage
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-06-03T18:38:48.218840542Z[GMT]")

public class DetectLanguage {
  @SerializedName("reliable")
  private Boolean reliable = null;

  @SerializedName("textBytes")
  private Integer textBytes = null;

  @SerializedName("languages")
  private List<DetectLanguageObject> languages = null;

  @SerializedName("chunks")
  private List<DetectLanguageChunk> chunks = null;

  public DetectLanguage reliable(Boolean reliable) {
    this.reliable = reliable;
    return this;
  }

   /**
   * Get reliable
   * @return reliable
  **/
  @Schema(description = "")
  public Boolean isReliable() {
    return reliable;
  }

  public void setReliable(Boolean reliable) {
    this.reliable = reliable;
  }

  public DetectLanguage textBytes(Integer textBytes) {
    this.textBytes = textBytes;
    return this;
  }

   /**
   * Get textBytes
   * @return textBytes
  **/
  @Schema(description = "")
  public Integer getTextBytes() {
    return textBytes;
  }

  public void setTextBytes(Integer textBytes) {
    this.textBytes = textBytes;
  }

  public DetectLanguage languages(List<DetectLanguageObject> languages) {
    this.languages = languages;
    return this;
  }

  public DetectLanguage addLanguagesItem(DetectLanguageObject languagesItem) {
    if (this.languages == null) {
      this.languages = new ArrayList<DetectLanguageObject>();
    }
    this.languages.add(languagesItem);
    return this;
  }

   /**
   * Get languages
   * @return languages
  **/
  @Schema(description = "")
  public List<DetectLanguageObject> getLanguages() {
    return languages;
  }

  public void setLanguages(List<DetectLanguageObject> languages) {
    this.languages = languages;
  }

  public DetectLanguage chunks(List<DetectLanguageChunk> chunks) {
    this.chunks = chunks;
    return this;
  }

  public DetectLanguage addChunksItem(DetectLanguageChunk chunksItem) {
    if (this.chunks == null) {
      this.chunks = new ArrayList<DetectLanguageChunk>();
    }
    this.chunks.add(chunksItem);
    return this;
  }

   /**
   * Get chunks
   * @return chunks
  **/
  @Schema(description = "")
  public List<DetectLanguageChunk> getChunks() {
    return chunks;
  }

  public void setChunks(List<DetectLanguageChunk> chunks) {
    this.chunks = chunks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetectLanguage detectLanguage = (DetectLanguage) o;
    return Objects.equals(this.reliable, detectLanguage.reliable) &&
        Objects.equals(this.textBytes, detectLanguage.textBytes) &&
        Objects.equals(this.languages, detectLanguage.languages) &&
        Objects.equals(this.chunks, detectLanguage.chunks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reliable, textBytes, languages, chunks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetectLanguage {\n");
    
    sb.append("    reliable: ").append(toIndentedString(reliable)).append("\n");
    sb.append("    textBytes: ").append(toIndentedString(textBytes)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    chunks: ").append(toIndentedString(chunks)).append("\n");
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
