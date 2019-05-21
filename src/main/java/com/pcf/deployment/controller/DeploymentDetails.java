package com.pcf.deployment.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
public class DeploymentDetails {

	@Value("${url:not found}")
	private String url;

	@Value("${user:not found}")
	private String user;

	@Value("${password: not found}")
	private String password;

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public String getUser() {
		return user;
	}

	public String getPassword() {
		return password;
	}

	@Override
	public String toString() {
		return "DeploymentDetails [url=" + url + ", user=" + user + ", password=" + password + "]";
	}

}
