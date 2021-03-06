/*
 * Axesso Api
 * Use this api to fetch information to Amazon products and more.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@axesso.de
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SortOptionResponseSortOptions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-21T15:33:25.535Z")
public class SortOptionResponseSortOptions {
  @SerializedName("order")
  private Long order = null;

  @SerializedName("sortName")
  private String sortName = null;

  @SerializedName("strategy")
  private String strategy = null;

  public SortOptionResponseSortOptions order(Long order) {
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @ApiModelProperty(value = "")
  public Long getOrder() {
    return order;
  }

  public void setOrder(Long order) {
    this.order = order;
  }

  public SortOptionResponseSortOptions sortName(String sortName) {
    this.sortName = sortName;
    return this;
  }

   /**
   * Get sortName
   * @return sortName
  **/
  @ApiModelProperty(example = "relevanceblender", value = "")
  public String getSortName() {
    return sortName;
  }

  public void setSortName(String sortName) {
    this.sortName = sortName;
  }

  public SortOptionResponseSortOptions strategy(String strategy) {
    this.strategy = strategy;
    return this;
  }

   /**
   * Get strategy
   * @return strategy
  **/
  @ApiModelProperty(example = "AMAZON_FEATURED", value = "")
  public String getStrategy() {
    return strategy;
  }

  public void setStrategy(String strategy) {
    this.strategy = strategy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SortOptionResponseSortOptions sortOptionResponseSortOptions = (SortOptionResponseSortOptions) o;
    return Objects.equals(this.order, sortOptionResponseSortOptions.order) &&
        Objects.equals(this.sortName, sortOptionResponseSortOptions.sortName) &&
        Objects.equals(this.strategy, sortOptionResponseSortOptions.strategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(order, sortName, strategy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SortOptionResponseSortOptions {\n");
    
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    sortName: ").append(toIndentedString(sortName)).append("\n");
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
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

