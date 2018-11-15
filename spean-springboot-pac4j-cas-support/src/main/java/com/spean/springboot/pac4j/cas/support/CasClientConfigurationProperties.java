package com.spean.springboot.pac4j.cas.support;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "cas", ignoreUnknownFields = false)
public class CasClientConfigurationProperties {

	
	/** 项目工程路径 */
    private String projectUrl;

    /** 项目cas服务路径 */
    private String casServerUrl;

    /** 客户端名称 */
    private String clientName;
    
    private List<String> logout = new ArrayList<String>();
    private List<String> securityFilter = new ArrayList<String>();
    private List<String> customCasFilter = new ArrayList<String>();
    private List<String> callbackFilter = new ArrayList<String>();
    private List<String> anon = new ArrayList<String>();
   
	Map<String, String> filterChainDefinitionMap = new LinkedHashMap<>();

	public String getProjectUrl() {
		return projectUrl;
	}

	public void setProjectUrl(String projectUrl) {
		this.projectUrl = projectUrl;
	}

	public String getCasServerUrl() {
		return casServerUrl;
	}

	public void setCasServerUrl(String casServerUrl) {
		this.casServerUrl = casServerUrl;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public Map<String, String> getFilterChainDefinitionMap() {
		return filterChainDefinitionMap;
	}

	public void setFilterChainDefinitionMap(
			Map<String, String> filterChainDefinitionMap) {
		this.filterChainDefinitionMap = filterChainDefinitionMap;
	}

	
	public void setLogout(List<String> logout) {
		this.logout = logout;
		logout.forEach(v -> filterChainDefinitionMap.put(v, "logout"));
	}

	public void setSecurityFilter(List<String> securityFilter) {
		this.securityFilter = securityFilter;
		securityFilter.forEach(v -> filterChainDefinitionMap.put(v, "securityFilter"));
	}

	public void setCustomCasFilter(List<String> customCasFilter) {
		this.customCasFilter = customCasFilter;
		customCasFilter.forEach(v -> filterChainDefinitionMap.put(v, "customCasFilter"));
	}

	public void setCallbackFilter(List<String> callbackFilter) {
		this.callbackFilter = callbackFilter;
		callbackFilter.forEach(v -> filterChainDefinitionMap.put(v, "callbackFilter"));
	}

	public void setAnon(List<String> anon) {
		this.anon = anon;
		anon.forEach(v -> filterChainDefinitionMap.put(v, "anon"));
	}
	 public List<String> getLogout() {
			return logout;
		}

		public List<String> getSecurityFilter() {
			return securityFilter;
		}

		public List<String> getCustomCasFilter() {
			return customCasFilter;
		}

		public List<String> getCallbackFilter() {
			return callbackFilter;
		}

		public List<String> getAnon() {
			return anon;
		}

    
}
