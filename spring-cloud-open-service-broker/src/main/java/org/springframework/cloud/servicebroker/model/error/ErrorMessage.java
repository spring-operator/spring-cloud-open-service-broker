/*
 * Copyright 2002-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.servicebroker.model.error;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Used to send errors back to the cloud controller.
 *
 * @author sgreenberg@pivotal.io
 */
public class ErrorMessage {
	@JsonProperty("description")
	private final String message;

	public ErrorMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return this.message;
	}

	@Override
	public final boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof ErrorMessage)) return false;
		ErrorMessage that = (ErrorMessage) o;
		return Objects.equals(message, that.message);
	}

	@Override
	public final int hashCode() {
		return Objects.hash(message);
	}

	@Override
	public final String toString() {
		return "ErrorMessage{" +
				"message='" + message + '\'' +
				'}';
	}

}
