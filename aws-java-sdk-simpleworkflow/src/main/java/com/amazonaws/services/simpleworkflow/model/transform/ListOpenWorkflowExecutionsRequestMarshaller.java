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
package com.amazonaws.services.simpleworkflow.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simpleworkflow.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListOpenWorkflowExecutionsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListOpenWorkflowExecutionsRequestMarshaller {

    private static final MarshallingInfo<String> DOMAIN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("domain").build();
    private static final MarshallingInfo<StructuredPojo> STARTTIMEFILTER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startTimeFilter").build();
    private static final MarshallingInfo<StructuredPojo> TYPEFILTER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("typeFilter").build();
    private static final MarshallingInfo<StructuredPojo> TAGFILTER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("tagFilter").build();
    private static final MarshallingInfo<String> NEXTPAGETOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("nextPageToken").build();
    private static final MarshallingInfo<Integer> MAXIMUMPAGESIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maximumPageSize").build();
    private static final MarshallingInfo<Boolean> REVERSEORDER_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("reverseOrder").build();
    private static final MarshallingInfo<StructuredPojo> EXECUTIONFILTER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("executionFilter").build();

    private static final ListOpenWorkflowExecutionsRequestMarshaller instance = new ListOpenWorkflowExecutionsRequestMarshaller();

    public static ListOpenWorkflowExecutionsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListOpenWorkflowExecutionsRequest listOpenWorkflowExecutionsRequest, ProtocolMarshaller protocolMarshaller) {

        if (listOpenWorkflowExecutionsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listOpenWorkflowExecutionsRequest.getDomain(), DOMAIN_BINDING);
            protocolMarshaller.marshall(listOpenWorkflowExecutionsRequest.getStartTimeFilter(), STARTTIMEFILTER_BINDING);
            protocolMarshaller.marshall(listOpenWorkflowExecutionsRequest.getTypeFilter(), TYPEFILTER_BINDING);
            protocolMarshaller.marshall(listOpenWorkflowExecutionsRequest.getTagFilter(), TAGFILTER_BINDING);
            protocolMarshaller.marshall(listOpenWorkflowExecutionsRequest.getNextPageToken(), NEXTPAGETOKEN_BINDING);
            protocolMarshaller.marshall(listOpenWorkflowExecutionsRequest.getMaximumPageSize(), MAXIMUMPAGESIZE_BINDING);
            protocolMarshaller.marshall(listOpenWorkflowExecutionsRequest.getReverseOrder(), REVERSEORDER_BINDING);
            protocolMarshaller.marshall(listOpenWorkflowExecutionsRequest.getExecutionFilter(), EXECUTIONFILTER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
