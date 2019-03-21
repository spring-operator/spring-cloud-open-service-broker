/*
 * Copyright 2002-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.servicebroker.exception;

public class ServiceBrokerApiVersionErrorMessage {

	private static final String MESSAGE_TEMPLATE = "The provided service broker API version is not supported: " +
			"expected version=%s, provided version=%s";

	private final String message;

	public ServiceBrokerApiVersionErrorMessage(String expectedVersion, String providedVersion) {
		this.message = String.format(MESSAGE_TEMPLATE, expectedVersion, providedVersion);
	}

	@Override
	public String toString() {
		return message;
	}

	public static ServiceBrokerApiVersionErrorMessage from(String expectedVersion, String providedVersion) {
		return new ServiceBrokerApiVersionErrorMessage(expectedVersion, providedVersion);
	}

}
