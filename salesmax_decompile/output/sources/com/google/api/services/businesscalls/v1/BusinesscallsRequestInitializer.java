package com.google.api.services.businesscalls.v1;

import com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest;
import com.google.api.client.googleapis.services.json.CommonGoogleJsonClientRequestInitializer;

/* loaded from: classes3.dex */
public class BusinesscallsRequestInitializer extends CommonGoogleJsonClientRequestInitializer {
    public BusinesscallsRequestInitializer() {
    }

    public void initializeBusinesscallsRequest(BusinesscallsRequest<?> businesscallsRequest) {
    }

    @Override // com.google.api.client.googleapis.services.json.CommonGoogleJsonClientRequestInitializer
    public final void initializeJsonRequest(AbstractGoogleJsonClientRequest<?> abstractGoogleJsonClientRequest) {
        super.initializeJsonRequest(abstractGoogleJsonClientRequest);
        initializeBusinesscallsRequest((BusinesscallsRequest) abstractGoogleJsonClientRequest);
    }

    public BusinesscallsRequestInitializer(String str) {
        super(str);
    }

    public BusinesscallsRequestInitializer(String str, String str2) {
        super(str, str2);
    }
}
