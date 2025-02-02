/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.applicationinsights.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/DescribeComponentConfigurationRecommendation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeComponentConfigurationRecommendationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the resource group.
     * </p>
     */
    private String resourceGroupName;
    /**
     * <p>
     * The name of the component.
     * </p>
     */
    private String componentName;
    /**
     * <p>
     * The tier of the application component. Supported tiers include <code>DOT_NET_WORKER</code>,
     * <code>DOT_NET_WEB_TIER</code>, <code>SQL_SERVER</code>, and <code>DEFAULT</code>.
     * </p>
     */
    private String tier;

    /**
     * <p>
     * The name of the resource group.
     * </p>
     * 
     * @param resourceGroupName
     *        The name of the resource group.
     */

    public void setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
    }

    /**
     * <p>
     * The name of the resource group.
     * </p>
     * 
     * @return The name of the resource group.
     */

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * <p>
     * The name of the resource group.
     * </p>
     * 
     * @param resourceGroupName
     *        The name of the resource group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeComponentConfigurationRecommendationRequest withResourceGroupName(String resourceGroupName) {
        setResourceGroupName(resourceGroupName);
        return this;
    }

    /**
     * <p>
     * The name of the component.
     * </p>
     * 
     * @param componentName
     *        The name of the component.
     */

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    /**
     * <p>
     * The name of the component.
     * </p>
     * 
     * @return The name of the component.
     */

    public String getComponentName() {
        return this.componentName;
    }

    /**
     * <p>
     * The name of the component.
     * </p>
     * 
     * @param componentName
     *        The name of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeComponentConfigurationRecommendationRequest withComponentName(String componentName) {
        setComponentName(componentName);
        return this;
    }

    /**
     * <p>
     * The tier of the application component. Supported tiers include <code>DOT_NET_WORKER</code>,
     * <code>DOT_NET_WEB_TIER</code>, <code>SQL_SERVER</code>, and <code>DEFAULT</code>.
     * </p>
     * 
     * @param tier
     *        The tier of the application component. Supported tiers include <code>DOT_NET_WORKER</code>,
     *        <code>DOT_NET_WEB_TIER</code>, <code>SQL_SERVER</code>, and <code>DEFAULT</code>.
     */

    public void setTier(String tier) {
        this.tier = tier;
    }

    /**
     * <p>
     * The tier of the application component. Supported tiers include <code>DOT_NET_WORKER</code>,
     * <code>DOT_NET_WEB_TIER</code>, <code>SQL_SERVER</code>, and <code>DEFAULT</code>.
     * </p>
     * 
     * @return The tier of the application component. Supported tiers include <code>DOT_NET_WORKER</code>,
     *         <code>DOT_NET_WEB_TIER</code>, <code>SQL_SERVER</code>, and <code>DEFAULT</code>.
     */

    public String getTier() {
        return this.tier;
    }

    /**
     * <p>
     * The tier of the application component. Supported tiers include <code>DOT_NET_WORKER</code>,
     * <code>DOT_NET_WEB_TIER</code>, <code>SQL_SERVER</code>, and <code>DEFAULT</code>.
     * </p>
     * 
     * @param tier
     *        The tier of the application component. Supported tiers include <code>DOT_NET_WORKER</code>,
     *        <code>DOT_NET_WEB_TIER</code>, <code>SQL_SERVER</code>, and <code>DEFAULT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeComponentConfigurationRecommendationRequest withTier(String tier) {
        setTier(tier);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getResourceGroupName() != null)
            sb.append("ResourceGroupName: ").append(getResourceGroupName()).append(",");
        if (getComponentName() != null)
            sb.append("ComponentName: ").append(getComponentName()).append(",");
        if (getTier() != null)
            sb.append("Tier: ").append(getTier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeComponentConfigurationRecommendationRequest == false)
            return false;
        DescribeComponentConfigurationRecommendationRequest other = (DescribeComponentConfigurationRecommendationRequest) obj;
        if (other.getResourceGroupName() == null ^ this.getResourceGroupName() == null)
            return false;
        if (other.getResourceGroupName() != null && other.getResourceGroupName().equals(this.getResourceGroupName()) == false)
            return false;
        if (other.getComponentName() == null ^ this.getComponentName() == null)
            return false;
        if (other.getComponentName() != null && other.getComponentName().equals(this.getComponentName()) == false)
            return false;
        if (other.getTier() == null ^ this.getTier() == null)
            return false;
        if (other.getTier() != null && other.getTier().equals(this.getTier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceGroupName() == null) ? 0 : getResourceGroupName().hashCode());
        hashCode = prime * hashCode + ((getComponentName() == null) ? 0 : getComponentName().hashCode());
        hashCode = prime * hashCode + ((getTier() == null) ? 0 : getTier().hashCode());
        return hashCode;
    }

    @Override
    public DescribeComponentConfigurationRecommendationRequest clone() {
        return (DescribeComponentConfigurationRecommendationRequest) super.clone();
    }

}
