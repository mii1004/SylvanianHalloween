package com.example.sylvanianhalloween.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * コラボメニュー（ドリンク）のモデルです
 */
@ApiModel(description = "コラボメニュー（ドリンク）のモデルです")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-10-31T00:07:21.774983+09:00[Asia/Tokyo]")
public class Drink   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("storeName")
  private String storeName;

  @JsonProperty("price")
  private Integer price;

  public Drink name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(example = "ふわふわキャラメルマロンカフェラテ", value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Drink storeName(String storeName) {
    this.storeName = storeName;
    return this;
  }

  /**
   * Get storeName
   * @return storeName
  */
  @ApiModelProperty(example = "THE CAMP CAFE & GRILL", value = "")


  public String getStoreName() {
    return storeName;
  }

  public void setStoreName(String storeName) {
    this.storeName = storeName;
  }

  public Drink price(Integer price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  */
  @ApiModelProperty(example = "715", value = "")


  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Drink drink = (Drink) o;
    return Objects.equals(this.name, drink.name) &&
        Objects.equals(this.storeName, drink.storeName) &&
        Objects.equals(this.price, drink.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, storeName, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Drink {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    storeName: ").append(toIndentedString(storeName)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

