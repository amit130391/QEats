
/*
 *
 *  * Copyright (c) Crio.Do 2019. All rights reserved
 *
 */

package com.crio.qeats.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
//import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
//import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// TODO: CRIO_TASK_MODULE_SERIALIZATION
//  Implement Restaurant class.
// Complete the class such that it produces the following JSON during serialization.
// {
//  "restaurantId": "10",
//  "name": "A2B",
//  "city": "Hsr Layout",
//  "imageUrl": "www.google.com",
//  "latitude": 20.027,
//  "longitude": 30.0,
//  "opensAt": "18:00",
//  "closesAt": "23:00",
//  "attributes": [
//    "Tamil",
//    "South Indian"
//  ]
// }

@JsonInclude(value = Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Restaurant {
  @JsonIgnore
  private String id;
  @NotNull
  private String restaurantId;
  @NotNull
  private String name;
  @NotNull
  private String city;
  @NotNull
  private String imageUrl;
  @NotNull
  private double latitude;
  @NotNull
  private double longitude;
  @NotNull
  private String opensAt;
  @NotNull
  private String closesAt;
  @NotNull
  private List<String> attributes=new ArrayList<>();
  
  public void setId(String id) {
    this.id = id;
  }
  public void setRestaurantId(String restaurantId) {
    this.restaurantId = restaurantId;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setCity(String city) {
    this.city = city;
  }
  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }
  public void setLatitude(double latitude) {
    this.latitude = latitude;
  }
  public void setLongitude(double longitude) {
    this.longitude = longitude;
  }
  public void setOpensAt(String opensAt) {
    this.opensAt = opensAt;
  }
  public void setClosesAt(String closesAt) {
    this.closesAt = closesAt;
  }
  public void setAttributes(List<String> attributes) {
    this.attributes = attributes;
  }
  public String getId() {
    return id;
  }
  public String getRestaurantId() {
    return restaurantId;
  }
  public String getName() {
    return name;
  }
  public String getCity() {
    return city;
  }
  public String getImageUrl() {
    return imageUrl;
  }
  public double getLatitude() {
    return latitude;
  }
  public double getLongitude() {
    return longitude;
  }
  public String getOpensAt() {
    return opensAt;
  }
  public String getClosesAt() {
    return closesAt;
  }
  public List<String> getAttributes() {
    return attributes;
  }

}

