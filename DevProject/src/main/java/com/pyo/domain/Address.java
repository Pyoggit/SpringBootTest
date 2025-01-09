package com.pyo.domain;

import java.util.Date;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

// 롬복 애너테이션
@Data

public class Address {
	private String postCode;
	private String location;
}
