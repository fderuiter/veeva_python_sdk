package org.openapitools.model;


import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class VobjectsObjectNameActionsMergePostRequestInner  {
  
  @ApiModelProperty(value = "")
  private String duplicateRecordId;

  @ApiModelProperty(value = "")
  private String mainRecordId;
 /**
   * Get duplicateRecordId
   * @return duplicateRecordId
  **/
  @JsonProperty("duplicate_record_id")
  public String getDuplicateRecordId() {
    return duplicateRecordId;
  }

  public void setDuplicateRecordId(String duplicateRecordId) {
    this.duplicateRecordId = duplicateRecordId;
  }

  public VobjectsObjectNameActionsMergePostRequestInner duplicateRecordId(String duplicateRecordId) {
    this.duplicateRecordId = duplicateRecordId;
    return this;
  }

 /**
   * Get mainRecordId
   * @return mainRecordId
  **/
  @JsonProperty("main_record_id")
  public String getMainRecordId() {
    return mainRecordId;
  }

  public void setMainRecordId(String mainRecordId) {
    this.mainRecordId = mainRecordId;
  }

  public VobjectsObjectNameActionsMergePostRequestInner mainRecordId(String mainRecordId) {
    this.mainRecordId = mainRecordId;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VobjectsObjectNameActionsMergePostRequestInner vobjectsObjectNameActionsMergePostRequestInner = (VobjectsObjectNameActionsMergePostRequestInner) o;
    return Objects.equals(this.duplicateRecordId, vobjectsObjectNameActionsMergePostRequestInner.duplicateRecordId) &&
        Objects.equals(this.mainRecordId, vobjectsObjectNameActionsMergePostRequestInner.mainRecordId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duplicateRecordId, mainRecordId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VobjectsObjectNameActionsMergePostRequestInner {\n");
    
    sb.append("    duplicateRecordId: ").append(toIndentedString(duplicateRecordId)).append("\n");
    sb.append("    mainRecordId: ").append(toIndentedString(mainRecordId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

