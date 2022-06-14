package com.mtit.order.persistance.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class PageableEntityData<T> {
  private List<T> data;
  private long totalRecords;
}
