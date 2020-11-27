package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Article
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-27T12:32:16.940Z[GMT]")


public class Article   {
  @JsonProperty("example")
  private String example = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("price")
  private BigDecimal price = null;

  public Article example(String example) {
    this.example = example;
    return this;
  }

  /**
   * Name of the article
   * @return example
   **/
  @Schema(example = "Test", description = "Name of the article")
  
    public String getExample() {
    return example;
  }

  public void setExample(String example) {
    this.example = example;
  }

  public Article name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(example = "testname", required = true, description = "")
      @NotNull

  @Size(max=20)   public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Article price(BigDecimal price) {
    this.price = price;
    return this;
  }

  /**
   * Price of the article
   * minimum: 0
   * @return price
   **/
  @Schema(example = "4.55", description = "Price of the article")
  
    @Valid
  @DecimalMin("0")  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Article article = (Article) o;
    return Objects.equals(this.example, article.example) &&
        Objects.equals(this.name, article.name) &&
        Objects.equals(this.price, article.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(example, name, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Article {\n");
    
    sb.append("    example: ").append(toIndentedString(example)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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
