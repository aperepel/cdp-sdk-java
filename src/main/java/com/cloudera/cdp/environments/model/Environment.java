/*
 * Copyright (c) 2018 Cloudera, Inc. All Rights Reserved.
 *
 * Portions Copyright (c) Copyright 2013-2018 Amazon.com, Inc. or its
 * affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.cloudera.cdp.environments.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.environments.model.Authentication;
import com.cloudera.cdp.environments.model.EnvironmentAwsDetails;
import com.cloudera.cdp.environments.model.LogStorage;
import com.cloudera.cdp.environments.model.Network;
import com.cloudera.cdp.environments.model.SecurityAccess;

/**
 * The environment.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2019-08-21T14:31:32.070-07:00")
public class Environment  {

  /**
   * Name of the environment.
   **/
  private String environmentName = null;

  /**
   * CRN of the environment.
   **/
  private String crn = null;

  /**
   * Status of the environment.
   **/
  private String status = null;

  /**
   * Region of the environment.
   **/
  private String region = null;

  /**
   * Cloud platform of the environment.
   **/
  private String cloudPlatform = null;

  /**
   * Name of the credential of the environment.
   **/
  private String credentialName = null;

  /**
   * Network related specifics of the environment.
   **/
  private Network network = null;

  /**
   * Storage configuration for cluster and audit logs.
   **/
  private LogStorage logStorage = null;

  /**
   * SSH key for accessing cluster node instances.
   **/
  private Authentication authentication = null;

  /**
   * Security control for FreeIPA and Datalake deployment.
   **/
  private SecurityAccess securityAccess = null;

  /**
   * Description of the environment
   **/
  private String description = null;

  /**
   * The status reason.
   **/
  private String statusReason = null;

  /**
   * 
   **/
  private EnvironmentAwsDetails awsDetails = null;

  /**
   * Getter for environmentName.
   * Name of the environment.
   **/
  @JsonProperty("environmentName")
  public String getEnvironmentName() {
    return environmentName;
  }

  /**
   * Setter for environmentName.
   * Name of the environment.
   **/
  public void setEnvironmentName(String environmentName) {
    this.environmentName = environmentName;
  }

  /**
   * Getter for crn.
   * CRN of the environment.
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * CRN of the environment.
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Getter for status.
   * Status of the environment.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * Status of the environment.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for region.
   * Region of the environment.
   **/
  @JsonProperty("region")
  public String getRegion() {
    return region;
  }

  /**
   * Setter for region.
   * Region of the environment.
   **/
  public void setRegion(String region) {
    this.region = region;
  }

  /**
   * Getter for cloudPlatform.
   * Cloud platform of the environment.
   **/
  @JsonProperty("cloudPlatform")
  public String getCloudPlatform() {
    return cloudPlatform;
  }

  /**
   * Setter for cloudPlatform.
   * Cloud platform of the environment.
   **/
  public void setCloudPlatform(String cloudPlatform) {
    this.cloudPlatform = cloudPlatform;
  }

  /**
   * Getter for credentialName.
   * Name of the credential of the environment.
   **/
  @JsonProperty("credentialName")
  public String getCredentialName() {
    return credentialName;
  }

  /**
   * Setter for credentialName.
   * Name of the credential of the environment.
   **/
  public void setCredentialName(String credentialName) {
    this.credentialName = credentialName;
  }

  /**
   * Getter for network.
   * Network related specifics of the environment.
   **/
  @JsonProperty("network")
  public Network getNetwork() {
    return network;
  }

  /**
   * Setter for network.
   * Network related specifics of the environment.
   **/
  public void setNetwork(Network network) {
    this.network = network;
  }

  /**
   * Getter for logStorage.
   * Storage configuration for cluster and audit logs.
   **/
  @JsonProperty("logStorage")
  public LogStorage getLogStorage() {
    return logStorage;
  }

  /**
   * Setter for logStorage.
   * Storage configuration for cluster and audit logs.
   **/
  public void setLogStorage(LogStorage logStorage) {
    this.logStorage = logStorage;
  }

  /**
   * Getter for authentication.
   * SSH key for accessing cluster node instances.
   **/
  @JsonProperty("authentication")
  public Authentication getAuthentication() {
    return authentication;
  }

  /**
   * Setter for authentication.
   * SSH key for accessing cluster node instances.
   **/
  public void setAuthentication(Authentication authentication) {
    this.authentication = authentication;
  }

  /**
   * Getter for securityAccess.
   * Security control for FreeIPA and Datalake deployment.
   **/
  @JsonProperty("securityAccess")
  public SecurityAccess getSecurityAccess() {
    return securityAccess;
  }

  /**
   * Setter for securityAccess.
   * Security control for FreeIPA and Datalake deployment.
   **/
  public void setSecurityAccess(SecurityAccess securityAccess) {
    this.securityAccess = securityAccess;
  }

  /**
   * Getter for description.
   * Description of the environment
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   * Description of the environment
   **/
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Getter for statusReason.
   * The status reason.
   **/
  @JsonProperty("statusReason")
  public String getStatusReason() {
    return statusReason;
  }

  /**
   * Setter for statusReason.
   * The status reason.
   **/
  public void setStatusReason(String statusReason) {
    this.statusReason = statusReason;
  }

  /**
   * Getter for awsDetails.
   * 
   **/
  @JsonProperty("awsDetails")
  public EnvironmentAwsDetails getAwsDetails() {
    return awsDetails;
  }

  /**
   * Setter for awsDetails.
   * 
   **/
  public void setAwsDetails(EnvironmentAwsDetails awsDetails) {
    this.awsDetails = awsDetails;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Environment environment = (Environment) o;
    if (!Objects.equals(this.environmentName, environment.environmentName)) {
      return false;
    }
    if (!Objects.equals(this.crn, environment.crn)) {
      return false;
    }
    if (!Objects.equals(this.status, environment.status)) {
      return false;
    }
    if (!Objects.equals(this.region, environment.region)) {
      return false;
    }
    if (!Objects.equals(this.cloudPlatform, environment.cloudPlatform)) {
      return false;
    }
    if (!Objects.equals(this.credentialName, environment.credentialName)) {
      return false;
    }
    if (!Objects.equals(this.network, environment.network)) {
      return false;
    }
    if (!Objects.equals(this.logStorage, environment.logStorage)) {
      return false;
    }
    if (!Objects.equals(this.authentication, environment.authentication)) {
      return false;
    }
    if (!Objects.equals(this.securityAccess, environment.securityAccess)) {
      return false;
    }
    if (!Objects.equals(this.description, environment.description)) {
      return false;
    }
    if (!Objects.equals(this.statusReason, environment.statusReason)) {
      return false;
    }
    if (!Objects.equals(this.awsDetails, environment.awsDetails)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentName, crn, status, region, cloudPlatform, credentialName, network, logStorage, authentication, securityAccess, description, statusReason, awsDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Environment {\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    cloudPlatform: ").append(toIndentedString(cloudPlatform)).append("\n");
    sb.append("    credentialName: ").append(toIndentedString(credentialName)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    logStorage: ").append(toIndentedString(logStorage)).append("\n");
    sb.append("    authentication: ").append(toIndentedString(authentication)).append("\n");
    sb.append("    securityAccess: ").append(toIndentedString(securityAccess)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    statusReason: ").append(toIndentedString(statusReason)).append("\n");
    sb.append("    awsDetails: ").append(toIndentedString(awsDetails)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line except the first indented by 4 spaces.
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
