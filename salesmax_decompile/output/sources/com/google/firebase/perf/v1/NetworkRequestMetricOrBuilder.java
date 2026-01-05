package com.google.firebase.perf.v1;

import com.google.firebase.perf.v1.NetworkRequestMetric;
import java.util.List;
import java.util.Map;
import p001o.scb;
import p001o.tcb;
import p001o.xq1;

/* loaded from: classes6.dex */
public interface NetworkRequestMetricOrBuilder extends tcb {
    boolean containsCustomAttributes(String str);

    long getClientStartTimeUs();

    @Deprecated
    Map<String, String> getCustomAttributes();

    int getCustomAttributesCount();

    Map<String, String> getCustomAttributesMap();

    String getCustomAttributesOrDefault(String str, String str2);

    String getCustomAttributesOrThrow(String str);

    @Override // p001o.tcb
    /* synthetic */ scb getDefaultInstanceForType();

    NetworkRequestMetric.HttpMethod getHttpMethod();

    int getHttpResponseCode();

    NetworkRequestMetric.NetworkClientErrorReason getNetworkClientErrorReason();

    PerfSession getPerfSessions(int i);

    int getPerfSessionsCount();

    List<PerfSession> getPerfSessionsList();

    long getRequestPayloadBytes();

    String getResponseContentType();

    xq1 getResponseContentTypeBytes();

    long getResponsePayloadBytes();

    long getTimeToRequestCompletedUs();

    long getTimeToResponseCompletedUs();

    long getTimeToResponseInitiatedUs();

    String getUrl();

    xq1 getUrlBytes();

    boolean hasClientStartTimeUs();

    boolean hasHttpMethod();

    boolean hasHttpResponseCode();

    boolean hasNetworkClientErrorReason();

    boolean hasRequestPayloadBytes();

    boolean hasResponseContentType();

    boolean hasResponsePayloadBytes();

    boolean hasTimeToRequestCompletedUs();

    boolean hasTimeToResponseCompletedUs();

    boolean hasTimeToResponseInitiatedUs();

    boolean hasUrl();

    @Override // p001o.tcb
    /* synthetic */ boolean isInitialized();
}
