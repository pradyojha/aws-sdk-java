/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The request object for the <code>DeleteConfigurationRecorder</code> action.
 * </p>
 */
public class DeleteConfigurationRecorderRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the configuration recorder to be deleted. You can retrieve the name of your configuration recorder by
     * using the <code>DescribeConfigurationRecorders</code> action.
     * </p>
     */
    private String configurationRecorderName;

    /**
     * <p>
     * The name of the configuration recorder to be deleted. You can retrieve the name of your configuration recorder by
     * using the <code>DescribeConfigurationRecorders</code> action.
     * </p>
     * 
     * @param configurationRecorderName
     *        The name of the configuration recorder to be deleted. You can retrieve the name of your configuration
     *        recorder by using the <code>DescribeConfigurationRecorders</code> action.
     */

    public void setConfigurationRecorderName(String configurationRecorderName) {
        this.configurationRecorderName = configurationRecorderName;
    }

    /**
     * <p>
     * The name of the configuration recorder to be deleted. You can retrieve the name of your configuration recorder by
     * using the <code>DescribeConfigurationRecorders</code> action.
     * </p>
     * 
     * @return The name of the configuration recorder to be deleted. You can retrieve the name of your configuration
     *         recorder by using the <code>DescribeConfigurationRecorders</code> action.
     */

    public String getConfigurationRecorderName() {
        return this.configurationRecorderName;
    }

    /**
     * <p>
     * The name of the configuration recorder to be deleted. You can retrieve the name of your configuration recorder by
     * using the <code>DescribeConfigurationRecorders</code> action.
     * </p>
     * 
     * @param configurationRecorderName
     *        The name of the configuration recorder to be deleted. You can retrieve the name of your configuration
     *        recorder by using the <code>DescribeConfigurationRecorders</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteConfigurationRecorderRequest withConfigurationRecorderName(String configurationRecorderName) {
        setConfigurationRecorderName(configurationRecorderName);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getConfigurationRecorderName() != null)
            sb.append("ConfigurationRecorderName: ").append(getConfigurationRecorderName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteConfigurationRecorderRequest == false)
            return false;
        DeleteConfigurationRecorderRequest other = (DeleteConfigurationRecorderRequest) obj;
        if (other.getConfigurationRecorderName() == null ^ this.getConfigurationRecorderName() == null)
            return false;
        if (other.getConfigurationRecorderName() != null && other.getConfigurationRecorderName().equals(this.getConfigurationRecorderName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationRecorderName() == null) ? 0 : getConfigurationRecorderName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteConfigurationRecorderRequest clone() {
        return (DeleteConfigurationRecorderRequest) super.clone();
    }

}