package com.google.api;

import java.util.List;
import p001o.ei6;
import p001o.k0i;
import p001o.scb;
import p001o.tcb;
import p001o.xq1;
import p001o.yh0;
import p001o.zyh;

/* loaded from: classes3.dex */
public interface ServiceOrBuilder extends tcb {
    yh0 getApis(int i);

    int getApisCount();

    List<yh0> getApisList();

    Authentication getAuthentication();

    Backend getBackend();

    Billing getBilling();

    k0i getConfigVersion();

    Context getContext();

    Control getControl();

    @Override // p001o.tcb
    /* synthetic */ scb getDefaultInstanceForType();

    Documentation getDocumentation();

    Endpoint getEndpoints(int i);

    int getEndpointsCount();

    List<Endpoint> getEndpointsList();

    ei6 getEnums(int i);

    int getEnumsCount();

    List<ei6> getEnumsList();

    Http getHttp();

    String getId();

    xq1 getIdBytes();

    Logging getLogging();

    LogDescriptor getLogs(int i);

    int getLogsCount();

    List<LogDescriptor> getLogsList();

    MetricDescriptor getMetrics(int i);

    int getMetricsCount();

    List<MetricDescriptor> getMetricsList();

    MonitoredResourceDescriptor getMonitoredResources(int i);

    int getMonitoredResourcesCount();

    List<MonitoredResourceDescriptor> getMonitoredResourcesList();

    Monitoring getMonitoring();

    String getName();

    xq1 getNameBytes();

    String getProducerProjectId();

    xq1 getProducerProjectIdBytes();

    Quota getQuota();

    SourceInfo getSourceInfo();

    SystemParameters getSystemParameters();

    String getTitle();

    xq1 getTitleBytes();

    zyh getTypes(int i);

    int getTypesCount();

    List<zyh> getTypesList();

    Usage getUsage();

    boolean hasAuthentication();

    boolean hasBackend();

    boolean hasBilling();

    boolean hasConfigVersion();

    boolean hasContext();

    boolean hasControl();

    boolean hasDocumentation();

    boolean hasHttp();

    boolean hasLogging();

    boolean hasMonitoring();

    boolean hasQuota();

    boolean hasSourceInfo();

    boolean hasSystemParameters();

    boolean hasUsage();

    @Override // p001o.tcb
    /* synthetic */ boolean isInitialized();
}
