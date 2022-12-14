package com.example.demo.enumType;

import java.util.Arrays;
import java.util.Optional;

public enum UserStatus {
	ACTIVE("ACTIVE"),

	INACTIVE("INACTIVE"),
	
	OFFLINE("OFFLINE");

	private String value;

	UserStatus(String value) {
		this.value = value;
	}

	public String value() {
		return this.value;
	}

	public static UserStatus toEnum(String value) {
		Optional<UserStatus> optional = Arrays.stream(values()).filter(e -> e.value.equalsIgnoreCase(value))
				.findFirst();
		if (optional.isPresent())
			return optional.get();
		else
			throw new IllegalArgumentException(value + " is not a valid status");
	}
}
