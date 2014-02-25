package com.terrafolio.gradle.plugins.jenkins;

import org.gradle.api.InvalidUserDataException;

class JenkinsConfigurationException extends InvalidUserDataException {

	public JenkinsConfigurationException() {
		super();
	}

	public JenkinsConfigurationException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public JenkinsConfigurationException(String arg0) {
		super(arg0);
	}

}
