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
import com.cloudera.cdp.environments.model.AzureFreeIpaCreationRequest;
import com.cloudera.cdp.environments.model.AzureLogStorageRequest;
import com.cloudera.cdp.environments.model.CreateAzureEnvironmentRequestNewNetworkParams;
import com.cloudera.cdp.environments.model.ExistingAzureNetworkRequest;
import com.cloudera.cdp.environments.model.SecurityAccessRequest;
import com.cloudera.cdp.environments.model.TagRequest;
import java.util.*;

/**
 * Request object for a create Azure environment request.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2020-04-07T22:32:18.974-07:00")
public class CreateAzureEnvironmentRequest  {

  /**
   * The name of the environment. Must contain only lowercase letters, numbers and hyphens.
   **/
  private String environmentName = null;

  /**
   * Name of the credential to use for the environment.
   **/
  private String credentialName = null;

  /**
   * The region of the environment.
   **/
  private String region = null;

  /**
   * Public SSH key string. The associated private key can be used to get root-level access to the Data Lake instance and Data Hub cluster instances.
   **/
  private String publicKey = null;

  /**
   * Security control for FreeIPA and Datalake deployment.
   **/
  private SecurityAccessRequest securityAccess = null;

  /**
   * Whether to associate public ip's to the resources within the network.
   **/
  private Boolean usePublicIp = null;

  /**
   * Azure storage configuration for cluster and audit logs.
   **/
  private AzureLogStorageRequest logStorage = null;

  /**
   * Parameters needed to use an existing VNet and Subnets.
   **/
  private ExistingAzureNetworkRequest existingNetworkParams = null;

  /**
   * 
   **/
  private CreateAzureEnvironmentRequestNewNetworkParams newNetworkParams = null;

  /**
   * An description of the environment.
   **/
  private String description = null;

  /**
   * The FreeIPA creation request for the environment
   **/
  private AzureFreeIpaCreationRequest freeIpa = null;

  /**
   * Tags associated with the resources.
   **/
  private List<TagRequest> tags = new ArrayList<TagRequest>();

  /**
   * Getter for environmentName.
   * The name of the environment. Must contain only lowercase letters, numbers and hyphens.
   **/
  @JsonProperty("environmentName")
  public String getEnvironmentName() {
    return environmentName;
  }

  /**
   * Setter for environmentName.
   * The name of the environment. Must contain only lowercase letters, numbers and hyphens.
   **/
  public void setEnvironmentName(String environmentName) {
    this.environmentName = environmentName;
  }

  /**
   * Getter for credentialName.
   * Name of the credential to use for the environment.
   **/
  @JsonProperty("credentialName")
  public String getCredentialName() {
    return credentialName;
  }

  /**
   * Setter for credentialName.
   * Name of the credential to use for the environment.
   **/
  public void setCredentialName(String credentialName) {
    this.credentialName = credentialName;
  }

  /**
   * Getter for region.
   * The region of the environment.
   **/
  @JsonProperty("region")
  public String getRegion() {
    return region;
  }

  /**
   * Setter for region.
   * The region of the environment.
   **/
  public void setRegion(String region) {
    this.region = region;
  }

  /**
   * Getter for publicKey.
   * Public SSH key string. The associated private key can be used to get root-level access to the Data Lake instance and Data Hub cluster instances.
   **/
  @JsonProperty("publicKey")
  public String getPublicKey() {
    return publicKey;
  }

  /**
   * Setter for publicKey.
   * Public SSH key string. The associated private key can be used to get root-level access to the Data Lake instance and Data Hub cluster instances.
   **/
  public void setPublicKey(String publicKey) {
    this.publicKey = publicKey;
  }

  /**
   * Getter for securityAccess.
   * Security control for FreeIPA and Datalake deployment.
   **/
  @JsonProperty("securityAccess")
  public SecurityAccessRequest getSecurityAccess() {
    return securityAccess;
  }

  /**
   * Setter for securityAccess.
   * Security control for FreeIPA and Datalake deployment.
   **/
  public void setSecurityAccess(SecurityAccessRequest securityAccess) {
    this.securityAccess = securityAccess;
  }

  /**
   * Getter for usePublicIp.
   * Whether to associate public ip&#39;s to the resources within the network.
   **/
  @JsonProperty("usePublicIp")
  public Boolean getUsePublicIp() {
    return usePublicIp;
  }

  /**
   * Setter for usePublicIp.
   * Whether to associate public ip&#39;s to the resources within the network.
   **/
  public void setUsePublicIp(Boolean usePublicIp) {
    this.usePublicIp = usePublicIp;
  }

  /**
   * Getter for logStorage.
   * Azure storage configuration for cluster and audit logs.
   **/
  @JsonProperty("logStorage")
  public AzureLogStorageRequest getLogStorage() {
    return logStorage;
  }

  /**
   * Setter for logStorage.
   * Azure storage configuration for cluster and audit logs.
   **/
  public void setLogStorage(AzureLogStorageRequest logStorage) {
    this.logStorage = logStorage;
  }

  /**
   * Getter for existingNetworkParams.
   * Parameters needed to use an existing VNet and Subnets.
   **/
  @JsonProperty("existingNetworkParams")
  public ExistingAzureNetworkRequest getExistingNetworkParams() {
    return existingNetworkParams;
  }

  /**
   * Setter for existingNetworkParams.
   * Parameters needed to use an existing VNet and Subnets.
   **/
  public void setExistingNetworkParams(ExistingAzureNetworkRequest existingNetworkParams) {
    this.existingNetworkParams = existingNetworkParams;
  }

  /**
   * Getter for newNetworkParams.
   * 
   **/
  @JsonProperty("newNetworkParams")
  public CreateAzureEnvironmentRequestNewNetworkParams getNewNetworkParams() {
    return newNetworkParams;
  }

  /**
   * Setter for newNetworkParams.
   * 
   **/
  public void setNewNetworkParams(CreateAzureEnvironmentRequestNewNetworkParams newNetworkParams) {
    this.newNetworkParams = newNetworkParams;
  }

  /**
   * Getter for description.
   * An description of the environment.
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   * An description of the environment.
   **/
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Getter for freeIpa.
   * The FreeIPA creation request for the environment
   **/
  @JsonProperty("freeIpa")
  public AzureFreeIpaCreationRequest getFreeIpa() {
    return freeIpa;
  }

  /**
   * Setter for freeIpa.
   * The FreeIPA creation request for the environment
   **/
  public void setFreeIpa(AzureFreeIpaCreationRequest freeIpa) {
    this.freeIpa = freeIpa;
  }

  /**
   * Getter for tags.
   * Tags associated with the resources.
   **/
  @JsonProperty("tags")
  public List<TagRequest> getTags() {
    return tags;
  }

  /**
   * Setter for tags.
   * Tags associated with the resources.
   **/
  public void setTags(List<TagRequest> tags) {
    this.tags = tags;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAzureEnvironmentRequest createAzureEnvironmentRequest = (CreateAzureEnvironmentRequest) o;
    if (!Objects.equals(this.environmentName, createAzureEnvironmentRequest.environmentName)) {
      return false;
    }
    if (!Objects.equals(this.credentialName, createAzureEnvironmentRequest.credentialName)) {
      return false;
    }
    if (!Objects.equals(this.region, createAzureEnvironmentRequest.region)) {
      return false;
    }
    if (!Objects.equals(this.publicKey, createAzureEnvironmentRequest.publicKey)) {
      return false;
    }
    if (!Objects.equals(this.securityAccess, createAzureEnvironmentRequest.securityAccess)) {
      return false;
    }
    if (!Objects.equals(this.usePublicIp, createAzureEnvironmentRequest.usePublicIp)) {
      return false;
    }
    if (!Objects.equals(this.logStorage, createAzureEnvironmentRequest.logStorage)) {
      return false;
    }
    if (!Objects.equals(this.existingNetworkParams, createAzureEnvironmentRequest.existingNetworkParams)) {
      return false;
    }
    if (!Objects.equals(this.newNetworkParams, createAzureEnvironmentRequest.newNetworkParams)) {
      return false;
    }
    if (!Objects.equals(this.description, createAzureEnvironmentRequest.description)) {
      return false;
    }
    if (!Objects.equals(this.freeIpa, createAzureEnvironmentRequest.freeIpa)) {
      return false;
    }
    if (!Objects.equals(this.tags, createAzureEnvironmentRequest.tags)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentName, credentialName, region, publicKey, securityAccess, usePublicIp, logStorage, existingNetworkParams, newNetworkParams, description, freeIpa, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAzureEnvironmentRequest {\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    credentialName: ").append(toIndentedString(credentialName)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
    sb.append("    securityAccess: ").append(toIndentedString(securityAccess)).append("\n");
    sb.append("    usePublicIp: ").append(toIndentedString(usePublicIp)).append("\n");
    sb.append("    logStorage: ").append(toIndentedString(logStorage)).append("\n");
    sb.append("    existingNetworkParams: ").append(toIndentedString(existingNetworkParams)).append("\n");
    sb.append("    newNetworkParams: ").append(toIndentedString(newNetworkParams)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    freeIpa: ").append(toIndentedString(freeIpa)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

