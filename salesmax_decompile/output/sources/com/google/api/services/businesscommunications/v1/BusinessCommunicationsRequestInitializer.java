package com.google.api.services.businesscommunications.v1;

import com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest;
import com.google.api.client.googleapis.services.json.CommonGoogleJsonClientRequestInitializer;

/* loaded from: classes3.dex */
public class BusinessCommunicationsRequestInitializer extends CommonGoogleJsonClientRequestInitializer {
    public BusinessCommunicationsRequestInitializer() {
    }

    public void initializeBusinessCommunicationsRequest(BusinessCommunicationsRequest<?> businessCommunicationsRequest) {
    }

    @Override // com.google.api.client.googleapis.services.json.CommonGoogleJsonClientRequestInitializer
    public final void initializeJsonRequest(AbstractGoogleJsonClientRequest<?> abstractGoogleJsonClientRequest) {
        super.initializeJsonRequest(abstractGoogleJsonClientRequest);
        initializeBusinessCommunicationsRequest((BusinessCommunicationsRequest) abstractGoogleJsonClientRequest);
    }

    public BusinessCommunicationsRequestInitializer(String str) {
        super(str);
    }

    public BusinessCommunicationsRequestInitializer(String str, String str2) {
        super(str, str2);
    }
}
