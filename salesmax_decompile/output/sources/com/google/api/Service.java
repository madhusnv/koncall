package com.google.api;

import com.google.api.Authentication;
import com.google.api.Backend;
import com.google.api.Billing;
import com.google.api.Context;
import com.google.api.Control;
import com.google.api.Documentation;
import com.google.api.Endpoint;
import com.google.api.Http;
import com.google.api.LogDescriptor;
import com.google.api.Logging;
import com.google.api.MetricDescriptor;
import com.google.api.MonitoredResourceDescriptor;
import com.google.api.Monitoring;
import com.google.api.Quota;
import com.google.api.SourceInfo;
import com.google.api.SystemParameters;
import com.google.api.Usage;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p001o.bzh;
import p001o.ei6;
import p001o.hxc;
import p001o.jf3;
import p001o.k0i;
import p001o.ki0;
import p001o.ki6;
import p001o.qp6;
import p001o.r8;
import p001o.wn7;
import p001o.xq1;
import p001o.yh0;
import p001o.yn8;
import p001o.zyh;

/* loaded from: classes3.dex */
public final class Service extends wn7 implements ServiceOrBuilder {
    public static final int APIS_FIELD_NUMBER = 3;
    public static final int AUTHENTICATION_FIELD_NUMBER = 11;
    public static final int BACKEND_FIELD_NUMBER = 8;
    public static final int BILLING_FIELD_NUMBER = 26;
    public static final int CONFIG_VERSION_FIELD_NUMBER = 20;
    public static final int CONTEXT_FIELD_NUMBER = 12;
    public static final int CONTROL_FIELD_NUMBER = 21;
    private static final Service DEFAULT_INSTANCE;
    public static final int DOCUMENTATION_FIELD_NUMBER = 6;
    public static final int ENDPOINTS_FIELD_NUMBER = 18;
    public static final int ENUMS_FIELD_NUMBER = 5;
    public static final int HTTP_FIELD_NUMBER = 9;
    public static final int ID_FIELD_NUMBER = 33;
    public static final int LOGGING_FIELD_NUMBER = 27;
    public static final int LOGS_FIELD_NUMBER = 23;
    public static final int METRICS_FIELD_NUMBER = 24;
    public static final int MONITORED_RESOURCES_FIELD_NUMBER = 25;
    public static final int MONITORING_FIELD_NUMBER = 28;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile hxc PARSER = null;
    public static final int PRODUCER_PROJECT_ID_FIELD_NUMBER = 22;
    public static final int QUOTA_FIELD_NUMBER = 10;
    public static final int SOURCE_INFO_FIELD_NUMBER = 37;
    public static final int SYSTEM_PARAMETERS_FIELD_NUMBER = 29;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int TYPES_FIELD_NUMBER = 4;
    public static final int USAGE_FIELD_NUMBER = 15;
    private Authentication authentication_;
    private Backend backend_;
    private Billing billing_;
    private k0i configVersion_;
    private Context context_;
    private Control control_;
    private Documentation documentation_;
    private Http http_;
    private Logging logging_;
    private Monitoring monitoring_;
    private Quota quota_;
    private SourceInfo sourceInfo_;
    private SystemParameters systemParameters_;
    private Usage usage_;
    private String name_ = "";
    private String id_ = "";
    private String title_ = "";
    private String producerProjectId_ = "";
    private yn8.InterfaceC18446j apis_ = wn7.emptyProtobufList();
    private yn8.InterfaceC18446j types_ = wn7.emptyProtobufList();
    private yn8.InterfaceC18446j enums_ = wn7.emptyProtobufList();
    private yn8.InterfaceC18446j endpoints_ = wn7.emptyProtobufList();
    private yn8.InterfaceC18446j logs_ = wn7.emptyProtobufList();
    private yn8.InterfaceC18446j metrics_ = wn7.emptyProtobufList();
    private yn8.InterfaceC18446j monitoredResources_ = wn7.emptyProtobufList();

    /* renamed from: com.google.api.Service$1 */
    public static /* synthetic */ class C112351 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f13325xa1df5c61;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f13325xa1df5c61 = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13325xa1df5c61[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13325xa1df5c61[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13325xa1df5c61[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13325xa1df5c61[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13325xa1df5c61[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13325xa1df5c61[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends wn7.AbstractC17934a implements ServiceOrBuilder {
        public /* synthetic */ Builder(C112351 c112351) {
            this();
        }

        public Builder addAllApis(Iterable<? extends yh0> iterable) {
            copyOnWrite();
            ((Service) this.instance).addAllApis(iterable);
            return this;
        }

        public Builder addAllEndpoints(Iterable<? extends Endpoint> iterable) {
            copyOnWrite();
            ((Service) this.instance).addAllEndpoints(iterable);
            return this;
        }

        public Builder addAllEnums(Iterable<? extends ei6> iterable) {
            copyOnWrite();
            ((Service) this.instance).addAllEnums(iterable);
            return this;
        }

        public Builder addAllLogs(Iterable<? extends LogDescriptor> iterable) {
            copyOnWrite();
            ((Service) this.instance).addAllLogs(iterable);
            return this;
        }

        public Builder addAllMetrics(Iterable<? extends MetricDescriptor> iterable) {
            copyOnWrite();
            ((Service) this.instance).addAllMetrics(iterable);
            return this;
        }

        public Builder addAllMonitoredResources(Iterable<? extends MonitoredResourceDescriptor> iterable) {
            copyOnWrite();
            ((Service) this.instance).addAllMonitoredResources(iterable);
            return this;
        }

        public Builder addAllTypes(Iterable<? extends zyh> iterable) {
            copyOnWrite();
            ((Service) this.instance).addAllTypes(iterable);
            return this;
        }

        public Builder addApis(yh0 yh0Var) {
            copyOnWrite();
            ((Service) this.instance).addApis(yh0Var);
            return this;
        }

        public Builder addEndpoints(Endpoint endpoint) {
            copyOnWrite();
            ((Service) this.instance).addEndpoints(endpoint);
            return this;
        }

        public Builder addEnums(ei6 ei6Var) {
            copyOnWrite();
            ((Service) this.instance).addEnums(ei6Var);
            return this;
        }

        public Builder addLogs(LogDescriptor logDescriptor) {
            copyOnWrite();
            ((Service) this.instance).addLogs(logDescriptor);
            return this;
        }

        public Builder addMetrics(MetricDescriptor metricDescriptor) {
            copyOnWrite();
            ((Service) this.instance).addMetrics(metricDescriptor);
            return this;
        }

        public Builder addMonitoredResources(MonitoredResourceDescriptor monitoredResourceDescriptor) {
            copyOnWrite();
            ((Service) this.instance).addMonitoredResources(monitoredResourceDescriptor);
            return this;
        }

        public Builder addTypes(zyh zyhVar) {
            copyOnWrite();
            ((Service) this.instance).addTypes(zyhVar);
            return this;
        }

        public Builder clearApis() {
            copyOnWrite();
            ((Service) this.instance).clearApis();
            return this;
        }

        public Builder clearAuthentication() {
            copyOnWrite();
            ((Service) this.instance).clearAuthentication();
            return this;
        }

        public Builder clearBackend() {
            copyOnWrite();
            ((Service) this.instance).clearBackend();
            return this;
        }

        public Builder clearBilling() {
            copyOnWrite();
            ((Service) this.instance).clearBilling();
            return this;
        }

        public Builder clearConfigVersion() {
            copyOnWrite();
            ((Service) this.instance).clearConfigVersion();
            return this;
        }

        public Builder clearContext() {
            copyOnWrite();
            ((Service) this.instance).clearContext();
            return this;
        }

        public Builder clearControl() {
            copyOnWrite();
            ((Service) this.instance).clearControl();
            return this;
        }

        public Builder clearDocumentation() {
            copyOnWrite();
            ((Service) this.instance).clearDocumentation();
            return this;
        }

        public Builder clearEndpoints() {
            copyOnWrite();
            ((Service) this.instance).clearEndpoints();
            return this;
        }

        public Builder clearEnums() {
            copyOnWrite();
            ((Service) this.instance).clearEnums();
            return this;
        }

        public Builder clearHttp() {
            copyOnWrite();
            ((Service) this.instance).clearHttp();
            return this;
        }

        public Builder clearId() {
            copyOnWrite();
            ((Service) this.instance).clearId();
            return this;
        }

        public Builder clearLogging() {
            copyOnWrite();
            ((Service) this.instance).clearLogging();
            return this;
        }

        public Builder clearLogs() {
            copyOnWrite();
            ((Service) this.instance).clearLogs();
            return this;
        }

        public Builder clearMetrics() {
            copyOnWrite();
            ((Service) this.instance).clearMetrics();
            return this;
        }

        public Builder clearMonitoredResources() {
            copyOnWrite();
            ((Service) this.instance).clearMonitoredResources();
            return this;
        }

        public Builder clearMonitoring() {
            copyOnWrite();
            ((Service) this.instance).clearMonitoring();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((Service) this.instance).clearName();
            return this;
        }

        public Builder clearProducerProjectId() {
            copyOnWrite();
            ((Service) this.instance).clearProducerProjectId();
            return this;
        }

        public Builder clearQuota() {
            copyOnWrite();
            ((Service) this.instance).clearQuota();
            return this;
        }

        public Builder clearSourceInfo() {
            copyOnWrite();
            ((Service) this.instance).clearSourceInfo();
            return this;
        }

        public Builder clearSystemParameters() {
            copyOnWrite();
            ((Service) this.instance).clearSystemParameters();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((Service) this.instance).clearTitle();
            return this;
        }

        public Builder clearTypes() {
            copyOnWrite();
            ((Service) this.instance).clearTypes();
            return this;
        }

        public Builder clearUsage() {
            copyOnWrite();
            ((Service) this.instance).clearUsage();
            return this;
        }

        @Override // com.google.api.ServiceOrBuilder
        public yh0 getApis(int i) {
            return ((Service) this.instance).getApis(i);
        }

        @Override // com.google.api.ServiceOrBuilder
        public int getApisCount() {
            return ((Service) this.instance).getApisCount();
        }

        @Override // com.google.api.ServiceOrBuilder
        public List<yh0> getApisList() {
            return Collections.unmodifiableList(((Service) this.instance).getApisList());
        }

        @Override // com.google.api.ServiceOrBuilder
        public Authentication getAuthentication() {
            return ((Service) this.instance).getAuthentication();
        }

        @Override // com.google.api.ServiceOrBuilder
        public Backend getBackend() {
            return ((Service) this.instance).getBackend();
        }

        @Override // com.google.api.ServiceOrBuilder
        public Billing getBilling() {
            return ((Service) this.instance).getBilling();
        }

        @Override // com.google.api.ServiceOrBuilder
        public k0i getConfigVersion() {
            return ((Service) this.instance).getConfigVersion();
        }

        @Override // com.google.api.ServiceOrBuilder
        public Context getContext() {
            return ((Service) this.instance).getContext();
        }

        @Override // com.google.api.ServiceOrBuilder
        public Control getControl() {
            return ((Service) this.instance).getControl();
        }

        @Override // com.google.api.ServiceOrBuilder
        public Documentation getDocumentation() {
            return ((Service) this.instance).getDocumentation();
        }

        @Override // com.google.api.ServiceOrBuilder
        public Endpoint getEndpoints(int i) {
            return ((Service) this.instance).getEndpoints(i);
        }

        @Override // com.google.api.ServiceOrBuilder
        public int getEndpointsCount() {
            return ((Service) this.instance).getEndpointsCount();
        }

        @Override // com.google.api.ServiceOrBuilder
        public List<Endpoint> getEndpointsList() {
            return Collections.unmodifiableList(((Service) this.instance).getEndpointsList());
        }

        @Override // com.google.api.ServiceOrBuilder
        public ei6 getEnums(int i) {
            return ((Service) this.instance).getEnums(i);
        }

        @Override // com.google.api.ServiceOrBuilder
        public int getEnumsCount() {
            return ((Service) this.instance).getEnumsCount();
        }

        @Override // com.google.api.ServiceOrBuilder
        public List<ei6> getEnumsList() {
            return Collections.unmodifiableList(((Service) this.instance).getEnumsList());
        }

        @Override // com.google.api.ServiceOrBuilder
        public Http getHttp() {
            return ((Service) this.instance).getHttp();
        }

        @Override // com.google.api.ServiceOrBuilder
        public String getId() {
            return ((Service) this.instance).getId();
        }

        @Override // com.google.api.ServiceOrBuilder
        public xq1 getIdBytes() {
            return ((Service) this.instance).getIdBytes();
        }

        @Override // com.google.api.ServiceOrBuilder
        public Logging getLogging() {
            return ((Service) this.instance).getLogging();
        }

        @Override // com.google.api.ServiceOrBuilder
        public LogDescriptor getLogs(int i) {
            return ((Service) this.instance).getLogs(i);
        }

        @Override // com.google.api.ServiceOrBuilder
        public int getLogsCount() {
            return ((Service) this.instance).getLogsCount();
        }

        @Override // com.google.api.ServiceOrBuilder
        public List<LogDescriptor> getLogsList() {
            return Collections.unmodifiableList(((Service) this.instance).getLogsList());
        }

        @Override // com.google.api.ServiceOrBuilder
        public MetricDescriptor getMetrics(int i) {
            return ((Service) this.instance).getMetrics(i);
        }

        @Override // com.google.api.ServiceOrBuilder
        public int getMetricsCount() {
            return ((Service) this.instance).getMetricsCount();
        }

        @Override // com.google.api.ServiceOrBuilder
        public List<MetricDescriptor> getMetricsList() {
            return Collections.unmodifiableList(((Service) this.instance).getMetricsList());
        }

        @Override // com.google.api.ServiceOrBuilder
        public MonitoredResourceDescriptor getMonitoredResources(int i) {
            return ((Service) this.instance).getMonitoredResources(i);
        }

        @Override // com.google.api.ServiceOrBuilder
        public int getMonitoredResourcesCount() {
            return ((Service) this.instance).getMonitoredResourcesCount();
        }

        @Override // com.google.api.ServiceOrBuilder
        public List<MonitoredResourceDescriptor> getMonitoredResourcesList() {
            return Collections.unmodifiableList(((Service) this.instance).getMonitoredResourcesList());
        }

        @Override // com.google.api.ServiceOrBuilder
        public Monitoring getMonitoring() {
            return ((Service) this.instance).getMonitoring();
        }

        @Override // com.google.api.ServiceOrBuilder
        public String getName() {
            return ((Service) this.instance).getName();
        }

        @Override // com.google.api.ServiceOrBuilder
        public xq1 getNameBytes() {
            return ((Service) this.instance).getNameBytes();
        }

        @Override // com.google.api.ServiceOrBuilder
        public String getProducerProjectId() {
            return ((Service) this.instance).getProducerProjectId();
        }

        @Override // com.google.api.ServiceOrBuilder
        public xq1 getProducerProjectIdBytes() {
            return ((Service) this.instance).getProducerProjectIdBytes();
        }

        @Override // com.google.api.ServiceOrBuilder
        public Quota getQuota() {
            return ((Service) this.instance).getQuota();
        }

        @Override // com.google.api.ServiceOrBuilder
        public SourceInfo getSourceInfo() {
            return ((Service) this.instance).getSourceInfo();
        }

        @Override // com.google.api.ServiceOrBuilder
        public SystemParameters getSystemParameters() {
            return ((Service) this.instance).getSystemParameters();
        }

        @Override // com.google.api.ServiceOrBuilder
        public String getTitle() {
            return ((Service) this.instance).getTitle();
        }

        @Override // com.google.api.ServiceOrBuilder
        public xq1 getTitleBytes() {
            return ((Service) this.instance).getTitleBytes();
        }

        @Override // com.google.api.ServiceOrBuilder
        public zyh getTypes(int i) {
            return ((Service) this.instance).getTypes(i);
        }

        @Override // com.google.api.ServiceOrBuilder
        public int getTypesCount() {
            return ((Service) this.instance).getTypesCount();
        }

        @Override // com.google.api.ServiceOrBuilder
        public List<zyh> getTypesList() {
            return Collections.unmodifiableList(((Service) this.instance).getTypesList());
        }

        @Override // com.google.api.ServiceOrBuilder
        public Usage getUsage() {
            return ((Service) this.instance).getUsage();
        }

        @Override // com.google.api.ServiceOrBuilder
        public boolean hasAuthentication() {
            return ((Service) this.instance).hasAuthentication();
        }

        @Override // com.google.api.ServiceOrBuilder
        public boolean hasBackend() {
            return ((Service) this.instance).hasBackend();
        }

        @Override // com.google.api.ServiceOrBuilder
        public boolean hasBilling() {
            return ((Service) this.instance).hasBilling();
        }

        @Override // com.google.api.ServiceOrBuilder
        public boolean hasConfigVersion() {
            return ((Service) this.instance).hasConfigVersion();
        }

        @Override // com.google.api.ServiceOrBuilder
        public boolean hasContext() {
            return ((Service) this.instance).hasContext();
        }

        @Override // com.google.api.ServiceOrBuilder
        public boolean hasControl() {
            return ((Service) this.instance).hasControl();
        }

        @Override // com.google.api.ServiceOrBuilder
        public boolean hasDocumentation() {
            return ((Service) this.instance).hasDocumentation();
        }

        @Override // com.google.api.ServiceOrBuilder
        public boolean hasHttp() {
            return ((Service) this.instance).hasHttp();
        }

        @Override // com.google.api.ServiceOrBuilder
        public boolean hasLogging() {
            return ((Service) this.instance).hasLogging();
        }

        @Override // com.google.api.ServiceOrBuilder
        public boolean hasMonitoring() {
            return ((Service) this.instance).hasMonitoring();
        }

        @Override // com.google.api.ServiceOrBuilder
        public boolean hasQuota() {
            return ((Service) this.instance).hasQuota();
        }

        @Override // com.google.api.ServiceOrBuilder
        public boolean hasSourceInfo() {
            return ((Service) this.instance).hasSourceInfo();
        }

        @Override // com.google.api.ServiceOrBuilder
        public boolean hasSystemParameters() {
            return ((Service) this.instance).hasSystemParameters();
        }

        @Override // com.google.api.ServiceOrBuilder
        public boolean hasUsage() {
            return ((Service) this.instance).hasUsage();
        }

        public Builder mergeAuthentication(Authentication authentication) {
            copyOnWrite();
            ((Service) this.instance).mergeAuthentication(authentication);
            return this;
        }

        public Builder mergeBackend(Backend backend) {
            copyOnWrite();
            ((Service) this.instance).mergeBackend(backend);
            return this;
        }

        public Builder mergeBilling(Billing billing) {
            copyOnWrite();
            ((Service) this.instance).mergeBilling(billing);
            return this;
        }

        public Builder mergeConfigVersion(k0i k0iVar) {
            copyOnWrite();
            ((Service) this.instance).mergeConfigVersion(k0iVar);
            return this;
        }

        public Builder mergeContext(Context context) {
            copyOnWrite();
            ((Service) this.instance).mergeContext(context);
            return this;
        }

        public Builder mergeControl(Control control) {
            copyOnWrite();
            ((Service) this.instance).mergeControl(control);
            return this;
        }

        public Builder mergeDocumentation(Documentation documentation) {
            copyOnWrite();
            ((Service) this.instance).mergeDocumentation(documentation);
            return this;
        }

        public Builder mergeHttp(Http http) {
            copyOnWrite();
            ((Service) this.instance).mergeHttp(http);
            return this;
        }

        public Builder mergeLogging(Logging logging) {
            copyOnWrite();
            ((Service) this.instance).mergeLogging(logging);
            return this;
        }

        public Builder mergeMonitoring(Monitoring monitoring) {
            copyOnWrite();
            ((Service) this.instance).mergeMonitoring(monitoring);
            return this;
        }

        public Builder mergeQuota(Quota quota) {
            copyOnWrite();
            ((Service) this.instance).mergeQuota(quota);
            return this;
        }

        public Builder mergeSourceInfo(SourceInfo sourceInfo) {
            copyOnWrite();
            ((Service) this.instance).mergeSourceInfo(sourceInfo);
            return this;
        }

        public Builder mergeSystemParameters(SystemParameters systemParameters) {
            copyOnWrite();
            ((Service) this.instance).mergeSystemParameters(systemParameters);
            return this;
        }

        public Builder mergeUsage(Usage usage) {
            copyOnWrite();
            ((Service) this.instance).mergeUsage(usage);
            return this;
        }

        public Builder removeApis(int i) {
            copyOnWrite();
            ((Service) this.instance).removeApis(i);
            return this;
        }

        public Builder removeEndpoints(int i) {
            copyOnWrite();
            ((Service) this.instance).removeEndpoints(i);
            return this;
        }

        public Builder removeEnums(int i) {
            copyOnWrite();
            ((Service) this.instance).removeEnums(i);
            return this;
        }

        public Builder removeLogs(int i) {
            copyOnWrite();
            ((Service) this.instance).removeLogs(i);
            return this;
        }

        public Builder removeMetrics(int i) {
            copyOnWrite();
            ((Service) this.instance).removeMetrics(i);
            return this;
        }

        public Builder removeMonitoredResources(int i) {
            copyOnWrite();
            ((Service) this.instance).removeMonitoredResources(i);
            return this;
        }

        public Builder removeTypes(int i) {
            copyOnWrite();
            ((Service) this.instance).removeTypes(i);
            return this;
        }

        public Builder setApis(int i, yh0 yh0Var) {
            copyOnWrite();
            ((Service) this.instance).setApis(i, yh0Var);
            return this;
        }

        public Builder setAuthentication(Authentication authentication) {
            copyOnWrite();
            ((Service) this.instance).setAuthentication(authentication);
            return this;
        }

        public Builder setBackend(Backend backend) {
            copyOnWrite();
            ((Service) this.instance).setBackend(backend);
            return this;
        }

        public Builder setBilling(Billing billing) {
            copyOnWrite();
            ((Service) this.instance).setBilling(billing);
            return this;
        }

        public Builder setConfigVersion(k0i k0iVar) {
            copyOnWrite();
            ((Service) this.instance).setConfigVersion(k0iVar);
            return this;
        }

        public Builder setContext(Context context) {
            copyOnWrite();
            ((Service) this.instance).setContext(context);
            return this;
        }

        public Builder setControl(Control control) {
            copyOnWrite();
            ((Service) this.instance).setControl(control);
            return this;
        }

        public Builder setDocumentation(Documentation documentation) {
            copyOnWrite();
            ((Service) this.instance).setDocumentation(documentation);
            return this;
        }

        public Builder setEndpoints(int i, Endpoint endpoint) {
            copyOnWrite();
            ((Service) this.instance).setEndpoints(i, endpoint);
            return this;
        }

        public Builder setEnums(int i, ei6 ei6Var) {
            copyOnWrite();
            ((Service) this.instance).setEnums(i, ei6Var);
            return this;
        }

        public Builder setHttp(Http http) {
            copyOnWrite();
            ((Service) this.instance).setHttp(http);
            return this;
        }

        public Builder setId(String str) {
            copyOnWrite();
            ((Service) this.instance).setId(str);
            return this;
        }

        public Builder setIdBytes(xq1 xq1Var) {
            copyOnWrite();
            ((Service) this.instance).setIdBytes(xq1Var);
            return this;
        }

        public Builder setLogging(Logging logging) {
            copyOnWrite();
            ((Service) this.instance).setLogging(logging);
            return this;
        }

        public Builder setLogs(int i, LogDescriptor logDescriptor) {
            copyOnWrite();
            ((Service) this.instance).setLogs(i, logDescriptor);
            return this;
        }

        public Builder setMetrics(int i, MetricDescriptor metricDescriptor) {
            copyOnWrite();
            ((Service) this.instance).setMetrics(i, metricDescriptor);
            return this;
        }

        public Builder setMonitoredResources(int i, MonitoredResourceDescriptor monitoredResourceDescriptor) {
            copyOnWrite();
            ((Service) this.instance).setMonitoredResources(i, monitoredResourceDescriptor);
            return this;
        }

        public Builder setMonitoring(Monitoring monitoring) {
            copyOnWrite();
            ((Service) this.instance).setMonitoring(monitoring);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((Service) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(xq1 xq1Var) {
            copyOnWrite();
            ((Service) this.instance).setNameBytes(xq1Var);
            return this;
        }

        public Builder setProducerProjectId(String str) {
            copyOnWrite();
            ((Service) this.instance).setProducerProjectId(str);
            return this;
        }

        public Builder setProducerProjectIdBytes(xq1 xq1Var) {
            copyOnWrite();
            ((Service) this.instance).setProducerProjectIdBytes(xq1Var);
            return this;
        }

        public Builder setQuota(Quota quota) {
            copyOnWrite();
            ((Service) this.instance).setQuota(quota);
            return this;
        }

        public Builder setSourceInfo(SourceInfo sourceInfo) {
            copyOnWrite();
            ((Service) this.instance).setSourceInfo(sourceInfo);
            return this;
        }

        public Builder setSystemParameters(SystemParameters systemParameters) {
            copyOnWrite();
            ((Service) this.instance).setSystemParameters(systemParameters);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((Service) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(xq1 xq1Var) {
            copyOnWrite();
            ((Service) this.instance).setTitleBytes(xq1Var);
            return this;
        }

        public Builder setTypes(int i, zyh zyhVar) {
            copyOnWrite();
            ((Service) this.instance).setTypes(i, zyhVar);
            return this;
        }

        public Builder setUsage(Usage usage) {
            copyOnWrite();
            ((Service) this.instance).setUsage(usage);
            return this;
        }

        private Builder() {
            super(Service.DEFAULT_INSTANCE);
        }

        public Builder addApis(int i, yh0 yh0Var) {
            copyOnWrite();
            ((Service) this.instance).addApis(i, yh0Var);
            return this;
        }

        public Builder addEndpoints(int i, Endpoint endpoint) {
            copyOnWrite();
            ((Service) this.instance).addEndpoints(i, endpoint);
            return this;
        }

        public Builder addEnums(int i, ei6 ei6Var) {
            copyOnWrite();
            ((Service) this.instance).addEnums(i, ei6Var);
            return this;
        }

        public Builder addLogs(int i, LogDescriptor logDescriptor) {
            copyOnWrite();
            ((Service) this.instance).addLogs(i, logDescriptor);
            return this;
        }

        public Builder addMetrics(int i, MetricDescriptor metricDescriptor) {
            copyOnWrite();
            ((Service) this.instance).addMetrics(i, metricDescriptor);
            return this;
        }

        public Builder addMonitoredResources(int i, MonitoredResourceDescriptor monitoredResourceDescriptor) {
            copyOnWrite();
            ((Service) this.instance).addMonitoredResources(i, monitoredResourceDescriptor);
            return this;
        }

        public Builder addTypes(int i, zyh zyhVar) {
            copyOnWrite();
            ((Service) this.instance).addTypes(i, zyhVar);
            return this;
        }

        public Builder setApis(int i, yh0.C18405b c18405b) {
            copyOnWrite();
            ((Service) this.instance).setApis(i, (yh0) c18405b.build());
            return this;
        }

        public Builder setAuthentication(Authentication.Builder builder) {
            copyOnWrite();
            ((Service) this.instance).setAuthentication((Authentication) builder.build());
            return this;
        }

        public Builder setBackend(Backend.Builder builder) {
            copyOnWrite();
            ((Service) this.instance).setBackend((Backend) builder.build());
            return this;
        }

        public Builder setBilling(Billing.Builder builder) {
            copyOnWrite();
            ((Service) this.instance).setBilling((Billing) builder.build());
            return this;
        }

        public Builder setConfigVersion(k0i.C14699b c14699b) {
            copyOnWrite();
            ((Service) this.instance).setConfigVersion((k0i) c14699b.build());
            return this;
        }

        public Builder setContext(Context.Builder builder) {
            copyOnWrite();
            ((Service) this.instance).setContext((Context) builder.build());
            return this;
        }

        public Builder setControl(Control.Builder builder) {
            copyOnWrite();
            ((Service) this.instance).setControl((Control) builder.build());
            return this;
        }

        public Builder setDocumentation(Documentation.Builder builder) {
            copyOnWrite();
            ((Service) this.instance).setDocumentation((Documentation) builder.build());
            return this;
        }

        public Builder setEndpoints(int i, Endpoint.Builder builder) {
            copyOnWrite();
            ((Service) this.instance).setEndpoints(i, (Endpoint) builder.build());
            return this;
        }

        public Builder setEnums(int i, ei6.C13200b c13200b) {
            copyOnWrite();
            ((Service) this.instance).setEnums(i, (ei6) c13200b.build());
            return this;
        }

        public Builder setHttp(Http.Builder builder) {
            copyOnWrite();
            ((Service) this.instance).setHttp((Http) builder.build());
            return this;
        }

        public Builder setLogging(Logging.Builder builder) {
            copyOnWrite();
            ((Service) this.instance).setLogging((Logging) builder.build());
            return this;
        }

        public Builder setLogs(int i, LogDescriptor.Builder builder) {
            copyOnWrite();
            ((Service) this.instance).setLogs(i, (LogDescriptor) builder.build());
            return this;
        }

        public Builder setMetrics(int i, MetricDescriptor.Builder builder) {
            copyOnWrite();
            ((Service) this.instance).setMetrics(i, (MetricDescriptor) builder.build());
            return this;
        }

        public Builder setMonitoredResources(int i, MonitoredResourceDescriptor.Builder builder) {
            copyOnWrite();
            ((Service) this.instance).setMonitoredResources(i, (MonitoredResourceDescriptor) builder.build());
            return this;
        }

        public Builder setMonitoring(Monitoring.Builder builder) {
            copyOnWrite();
            ((Service) this.instance).setMonitoring((Monitoring) builder.build());
            return this;
        }

        public Builder setQuota(Quota.Builder builder) {
            copyOnWrite();
            ((Service) this.instance).setQuota((Quota) builder.build());
            return this;
        }

        public Builder setSourceInfo(SourceInfo.Builder builder) {
            copyOnWrite();
            ((Service) this.instance).setSourceInfo((SourceInfo) builder.build());
            return this;
        }

        public Builder setSystemParameters(SystemParameters.Builder builder) {
            copyOnWrite();
            ((Service) this.instance).setSystemParameters((SystemParameters) builder.build());
            return this;
        }

        public Builder setTypes(int i, zyh.C18734b c18734b) {
            copyOnWrite();
            ((Service) this.instance).setTypes(i, (zyh) c18734b.build());
            return this;
        }

        public Builder setUsage(Usage.Builder builder) {
            copyOnWrite();
            ((Service) this.instance).setUsage((Usage) builder.build());
            return this;
        }

        public Builder addApis(yh0.C18405b c18405b) {
            copyOnWrite();
            ((Service) this.instance).addApis((yh0) c18405b.build());
            return this;
        }

        public Builder addEndpoints(Endpoint.Builder builder) {
            copyOnWrite();
            ((Service) this.instance).addEndpoints((Endpoint) builder.build());
            return this;
        }

        public Builder addEnums(ei6.C13200b c13200b) {
            copyOnWrite();
            ((Service) this.instance).addEnums((ei6) c13200b.build());
            return this;
        }

        public Builder addLogs(LogDescriptor.Builder builder) {
            copyOnWrite();
            ((Service) this.instance).addLogs((LogDescriptor) builder.build());
            return this;
        }

        public Builder addMetrics(MetricDescriptor.Builder builder) {
            copyOnWrite();
            ((Service) this.instance).addMetrics((MetricDescriptor) builder.build());
            return this;
        }

        public Builder addMonitoredResources(MonitoredResourceDescriptor.Builder builder) {
            copyOnWrite();
            ((Service) this.instance).addMonitoredResources((MonitoredResourceDescriptor) builder.build());
            return this;
        }

        public Builder addTypes(zyh.C18734b c18734b) {
            copyOnWrite();
            ((Service) this.instance).addTypes((zyh) c18734b.build());
            return this;
        }

        public Builder addApis(int i, yh0.C18405b c18405b) {
            copyOnWrite();
            ((Service) this.instance).addApis(i, (yh0) c18405b.build());
            return this;
        }

        public Builder addEndpoints(int i, Endpoint.Builder builder) {
            copyOnWrite();
            ((Service) this.instance).addEndpoints(i, (Endpoint) builder.build());
            return this;
        }

        public Builder addEnums(int i, ei6.C13200b c13200b) {
            copyOnWrite();
            ((Service) this.instance).addEnums(i, (ei6) c13200b.build());
            return this;
        }

        public Builder addLogs(int i, LogDescriptor.Builder builder) {
            copyOnWrite();
            ((Service) this.instance).addLogs(i, (LogDescriptor) builder.build());
            return this;
        }

        public Builder addMetrics(int i, MetricDescriptor.Builder builder) {
            copyOnWrite();
            ((Service) this.instance).addMetrics(i, (MetricDescriptor) builder.build());
            return this;
        }

        public Builder addMonitoredResources(int i, MonitoredResourceDescriptor.Builder builder) {
            copyOnWrite();
            ((Service) this.instance).addMonitoredResources(i, (MonitoredResourceDescriptor) builder.build());
            return this;
        }

        public Builder addTypes(int i, zyh.C18734b c18734b) {
            copyOnWrite();
            ((Service) this.instance).addTypes(i, (zyh) c18734b.build());
            return this;
        }
    }

    static {
        Service service = new Service();
        DEFAULT_INSTANCE = service;
        wn7.registerDefaultInstance(Service.class, service);
    }

    private Service() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllApis(Iterable<? extends yh0> iterable) {
        ensureApisIsMutable();
        r8.addAll((Iterable) iterable, (List) this.apis_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEndpoints(Iterable<? extends Endpoint> iterable) {
        ensureEndpointsIsMutable();
        r8.addAll((Iterable) iterable, (List) this.endpoints_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEnums(Iterable<? extends ei6> iterable) {
        ensureEnumsIsMutable();
        r8.addAll((Iterable) iterable, (List) this.enums_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLogs(Iterable<? extends LogDescriptor> iterable) {
        ensureLogsIsMutable();
        r8.addAll((Iterable) iterable, (List) this.logs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMetrics(Iterable<? extends MetricDescriptor> iterable) {
        ensureMetricsIsMutable();
        r8.addAll((Iterable) iterable, (List) this.metrics_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMonitoredResources(Iterable<? extends MonitoredResourceDescriptor> iterable) {
        ensureMonitoredResourcesIsMutable();
        r8.addAll((Iterable) iterable, (List) this.monitoredResources_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTypes(Iterable<? extends zyh> iterable) {
        ensureTypesIsMutable();
        r8.addAll((Iterable) iterable, (List) this.types_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addApis(yh0 yh0Var) {
        yh0Var.getClass();
        ensureApisIsMutable();
        this.apis_.add(yh0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEndpoints(Endpoint endpoint) {
        endpoint.getClass();
        ensureEndpointsIsMutable();
        this.endpoints_.add(endpoint);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEnums(ei6 ei6Var) {
        ei6Var.getClass();
        ensureEnumsIsMutable();
        this.enums_.add(ei6Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLogs(LogDescriptor logDescriptor) {
        logDescriptor.getClass();
        ensureLogsIsMutable();
        this.logs_.add(logDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMetrics(MetricDescriptor metricDescriptor) {
        metricDescriptor.getClass();
        ensureMetricsIsMutable();
        this.metrics_.add(metricDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMonitoredResources(MonitoredResourceDescriptor monitoredResourceDescriptor) {
        monitoredResourceDescriptor.getClass();
        ensureMonitoredResourcesIsMutable();
        this.monitoredResources_.add(monitoredResourceDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTypes(zyh zyhVar) {
        zyhVar.getClass();
        ensureTypesIsMutable();
        this.types_.add(zyhVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearApis() {
        this.apis_ = wn7.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAuthentication() {
        this.authentication_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBackend() {
        this.backend_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBilling() {
        this.billing_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConfigVersion() {
        this.configVersion_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContext() {
        this.context_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearControl() {
        this.control_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDocumentation() {
        this.documentation_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndpoints() {
        this.endpoints_ = wn7.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnums() {
        this.enums_ = wn7.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHttp() {
        this.http_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLogging() {
        this.logging_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLogs() {
        this.logs_ = wn7.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetrics() {
        this.metrics_ = wn7.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMonitoredResources() {
        this.monitoredResources_ = wn7.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMonitoring() {
        this.monitoring_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProducerProjectId() {
        this.producerProjectId_ = getDefaultInstance().getProducerProjectId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuota() {
        this.quota_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSourceInfo() {
        this.sourceInfo_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSystemParameters() {
        this.systemParameters_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTypes() {
        this.types_ = wn7.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUsage() {
        this.usage_ = null;
    }

    private void ensureApisIsMutable() {
        yn8.InterfaceC18446j interfaceC18446j = this.apis_;
        if (interfaceC18446j.mo28212k()) {
            return;
        }
        this.apis_ = wn7.mutableCopy(interfaceC18446j);
    }

    private void ensureEndpointsIsMutable() {
        yn8.InterfaceC18446j interfaceC18446j = this.endpoints_;
        if (interfaceC18446j.mo28212k()) {
            return;
        }
        this.endpoints_ = wn7.mutableCopy(interfaceC18446j);
    }

    private void ensureEnumsIsMutable() {
        yn8.InterfaceC18446j interfaceC18446j = this.enums_;
        if (interfaceC18446j.mo28212k()) {
            return;
        }
        this.enums_ = wn7.mutableCopy(interfaceC18446j);
    }

    private void ensureLogsIsMutable() {
        yn8.InterfaceC18446j interfaceC18446j = this.logs_;
        if (interfaceC18446j.mo28212k()) {
            return;
        }
        this.logs_ = wn7.mutableCopy(interfaceC18446j);
    }

    private void ensureMetricsIsMutable() {
        yn8.InterfaceC18446j interfaceC18446j = this.metrics_;
        if (interfaceC18446j.mo28212k()) {
            return;
        }
        this.metrics_ = wn7.mutableCopy(interfaceC18446j);
    }

    private void ensureMonitoredResourcesIsMutable() {
        yn8.InterfaceC18446j interfaceC18446j = this.monitoredResources_;
        if (interfaceC18446j.mo28212k()) {
            return;
        }
        this.monitoredResources_ = wn7.mutableCopy(interfaceC18446j);
    }

    private void ensureTypesIsMutable() {
        yn8.InterfaceC18446j interfaceC18446j = this.types_;
        if (interfaceC18446j.mo28212k()) {
            return;
        }
        this.types_ = wn7.mutableCopy(interfaceC18446j);
    }

    public static Service getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAuthentication(Authentication authentication) {
        authentication.getClass();
        Authentication authentication2 = this.authentication_;
        if (authentication2 == null || authentication2 == Authentication.getDefaultInstance()) {
            this.authentication_ = authentication;
        } else {
            this.authentication_ = (Authentication) ((Authentication.Builder) Authentication.newBuilder(this.authentication_).mergeFrom((wn7) authentication)).buildPartial();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBackend(Backend backend) {
        backend.getClass();
        Backend backend2 = this.backend_;
        if (backend2 == null || backend2 == Backend.getDefaultInstance()) {
            this.backend_ = backend;
        } else {
            this.backend_ = (Backend) ((Backend.Builder) Backend.newBuilder(this.backend_).mergeFrom((wn7) backend)).buildPartial();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBilling(Billing billing) {
        billing.getClass();
        Billing billing2 = this.billing_;
        if (billing2 == null || billing2 == Billing.getDefaultInstance()) {
            this.billing_ = billing;
        } else {
            this.billing_ = (Billing) ((Billing.Builder) Billing.newBuilder(this.billing_).mergeFrom((wn7) billing)).buildPartial();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeConfigVersion(k0i k0iVar) {
        k0iVar.getClass();
        k0i k0iVar2 = this.configVersion_;
        if (k0iVar2 == null || k0iVar2 == k0i.m34849h()) {
            this.configVersion_ = k0iVar;
        } else {
            this.configVersion_ = (k0i) ((k0i.C14699b) k0i.m34850i(this.configVersion_).mergeFrom((wn7) k0iVar)).buildPartial();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeContext(Context context) {
        context.getClass();
        Context context2 = this.context_;
        if (context2 == null || context2 == Context.getDefaultInstance()) {
            this.context_ = context;
        } else {
            this.context_ = (Context) ((Context.Builder) Context.newBuilder(this.context_).mergeFrom((wn7) context)).buildPartial();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeControl(Control control) {
        control.getClass();
        Control control2 = this.control_;
        if (control2 == null || control2 == Control.getDefaultInstance()) {
            this.control_ = control;
        } else {
            this.control_ = (Control) ((Control.Builder) Control.newBuilder(this.control_).mergeFrom((wn7) control)).buildPartial();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDocumentation(Documentation documentation) {
        documentation.getClass();
        Documentation documentation2 = this.documentation_;
        if (documentation2 == null || documentation2 == Documentation.getDefaultInstance()) {
            this.documentation_ = documentation;
        } else {
            this.documentation_ = (Documentation) ((Documentation.Builder) Documentation.newBuilder(this.documentation_).mergeFrom((wn7) documentation)).buildPartial();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHttp(Http http) {
        http.getClass();
        Http http2 = this.http_;
        if (http2 == null || http2 == Http.getDefaultInstance()) {
            this.http_ = http;
        } else {
            this.http_ = (Http) ((Http.Builder) Http.newBuilder(this.http_).mergeFrom((wn7) http)).buildPartial();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLogging(Logging logging) {
        logging.getClass();
        Logging logging2 = this.logging_;
        if (logging2 == null || logging2 == Logging.getDefaultInstance()) {
            this.logging_ = logging;
        } else {
            this.logging_ = (Logging) ((Logging.Builder) Logging.newBuilder(this.logging_).mergeFrom((wn7) logging)).buildPartial();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMonitoring(Monitoring monitoring) {
        monitoring.getClass();
        Monitoring monitoring2 = this.monitoring_;
        if (monitoring2 == null || monitoring2 == Monitoring.getDefaultInstance()) {
            this.monitoring_ = monitoring;
        } else {
            this.monitoring_ = (Monitoring) ((Monitoring.Builder) Monitoring.newBuilder(this.monitoring_).mergeFrom((wn7) monitoring)).buildPartial();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeQuota(Quota quota) {
        quota.getClass();
        Quota quota2 = this.quota_;
        if (quota2 == null || quota2 == Quota.getDefaultInstance()) {
            this.quota_ = quota;
        } else {
            this.quota_ = (Quota) ((Quota.Builder) Quota.newBuilder(this.quota_).mergeFrom((wn7) quota)).buildPartial();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSourceInfo(SourceInfo sourceInfo) {
        sourceInfo.getClass();
        SourceInfo sourceInfo2 = this.sourceInfo_;
        if (sourceInfo2 == null || sourceInfo2 == SourceInfo.getDefaultInstance()) {
            this.sourceInfo_ = sourceInfo;
        } else {
            this.sourceInfo_ = (SourceInfo) ((SourceInfo.Builder) SourceInfo.newBuilder(this.sourceInfo_).mergeFrom((wn7) sourceInfo)).buildPartial();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSystemParameters(SystemParameters systemParameters) {
        systemParameters.getClass();
        SystemParameters systemParameters2 = this.systemParameters_;
        if (systemParameters2 == null || systemParameters2 == SystemParameters.getDefaultInstance()) {
            this.systemParameters_ = systemParameters;
        } else {
            this.systemParameters_ = (SystemParameters) ((SystemParameters.Builder) SystemParameters.newBuilder(this.systemParameters_).mergeFrom((wn7) systemParameters)).buildPartial();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUsage(Usage usage) {
        usage.getClass();
        Usage usage2 = this.usage_;
        if (usage2 == null || usage2 == Usage.getDefaultInstance()) {
            this.usage_ = usage;
        } else {
            this.usage_ = (Usage) ((Usage.Builder) Usage.newBuilder(this.usage_).mergeFrom((wn7) usage)).buildPartial();
        }
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Service parseDelimitedFrom(InputStream inputStream) {
        return (Service) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Service parseFrom(ByteBuffer byteBuffer) {
        return (Service) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hxc parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeApis(int i) {
        ensureApisIsMutable();
        this.apis_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEndpoints(int i) {
        ensureEndpointsIsMutable();
        this.endpoints_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEnums(int i) {
        ensureEnumsIsMutable();
        this.enums_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLogs(int i) {
        ensureLogsIsMutable();
        this.logs_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMetrics(int i) {
        ensureMetricsIsMutable();
        this.metrics_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMonitoredResources(int i) {
        ensureMonitoredResourcesIsMutable();
        this.monitoredResources_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTypes(int i) {
        ensureTypesIsMutable();
        this.types_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApis(int i, yh0 yh0Var) {
        yh0Var.getClass();
        ensureApisIsMutable();
        this.apis_.set(i, yh0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAuthentication(Authentication authentication) {
        authentication.getClass();
        this.authentication_ = authentication;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBackend(Backend backend) {
        backend.getClass();
        this.backend_ = backend;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBilling(Billing billing) {
        billing.getClass();
        this.billing_ = billing;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConfigVersion(k0i k0iVar) {
        k0iVar.getClass();
        this.configVersion_ = k0iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContext(Context context) {
        context.getClass();
        this.context_ = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setControl(Control control) {
        control.getClass();
        this.control_ = control;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDocumentation(Documentation documentation) {
        documentation.getClass();
        this.documentation_ = documentation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndpoints(int i, Endpoint endpoint) {
        endpoint.getClass();
        ensureEndpointsIsMutable();
        this.endpoints_.set(i, endpoint);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnums(int i, ei6 ei6Var) {
        ei6Var.getClass();
        ensureEnumsIsMutable();
        this.enums_.set(i, ei6Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHttp(Http http) {
        http.getClass();
        this.http_ = http;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        str.getClass();
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        this.id_ = xq1Var.m56593N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogging(Logging logging) {
        logging.getClass();
        this.logging_ = logging;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogs(int i, LogDescriptor logDescriptor) {
        logDescriptor.getClass();
        ensureLogsIsMutable();
        this.logs_.set(i, logDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetrics(int i, MetricDescriptor metricDescriptor) {
        metricDescriptor.getClass();
        ensureMetricsIsMutable();
        this.metrics_.set(i, metricDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMonitoredResources(int i, MonitoredResourceDescriptor monitoredResourceDescriptor) {
        monitoredResourceDescriptor.getClass();
        ensureMonitoredResourcesIsMutable();
        this.monitoredResources_.set(i, monitoredResourceDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMonitoring(Monitoring monitoring) {
        monitoring.getClass();
        this.monitoring_ = monitoring;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        this.name_ = xq1Var.m56593N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProducerProjectId(String str) {
        str.getClass();
        this.producerProjectId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProducerProjectIdBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        this.producerProjectId_ = xq1Var.m56593N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuota(Quota quota) {
        quota.getClass();
        this.quota_ = quota;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceInfo(SourceInfo sourceInfo) {
        sourceInfo.getClass();
        this.sourceInfo_ = sourceInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSystemParameters(SystemParameters systemParameters) {
        systemParameters.getClass();
        this.systemParameters_ = systemParameters;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(String str) {
        str.getClass();
        this.title_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        this.title_ = xq1Var.m56593N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypes(int i, zyh zyhVar) {
        zyhVar.getClass();
        ensureTypesIsMutable();
        this.types_.set(i, zyhVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUsage(Usage usage) {
        usage.getClass();
        this.usage_ = usage;
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C112351 c112351 = null;
        switch (C112351.f13325xa1df5c61[enumC17940g.ordinal()]) {
            case 1:
                return new Service();
            case 2:
                return new Builder(c112351);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0019\u0000\u0000\u0001%\u0019\u0000\u0007\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004\u001b\u0005\u001b\u0006\t\b\t\t\t\n\t\u000b\t\f\t\u000f\t\u0012\u001b\u0014\t\u0015\t\u0016Ȉ\u0017\u001b\u0018\u001b\u0019\u001b\u001a\t\u001b\t\u001c\t\u001d\t!Ȉ%\t", new Object[]{"name_", "title_", "apis_", yh0.class, "types_", zyh.class, "enums_", ei6.class, "documentation_", "backend_", "http_", "quota_", "authentication_", "context_", "usage_", "endpoints_", Endpoint.class, "configVersion_", "control_", "producerProjectId_", "logs_", LogDescriptor.class, "metrics_", MetricDescriptor.class, "monitoredResources_", MonitoredResourceDescriptor.class, "billing_", "logging_", "monitoring_", "systemParameters_", "id_", "sourceInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (Service.class) {
                        c17935b = PARSER;
                        if (c17935b == null) {
                            c17935b = new wn7.C17935b(DEFAULT_INSTANCE);
                            PARSER = c17935b;
                        }
                    }
                }
                return c17935b;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.api.ServiceOrBuilder
    public yh0 getApis(int i) {
        return (yh0) this.apis_.get(i);
    }

    @Override // com.google.api.ServiceOrBuilder
    public int getApisCount() {
        return this.apis_.size();
    }

    @Override // com.google.api.ServiceOrBuilder
    public List<yh0> getApisList() {
        return this.apis_;
    }

    public ki0 getApisOrBuilder(int i) {
        return (ki0) this.apis_.get(i);
    }

    public List<? extends ki0> getApisOrBuilderList() {
        return this.apis_;
    }

    @Override // com.google.api.ServiceOrBuilder
    public Authentication getAuthentication() {
        Authentication authentication = this.authentication_;
        return authentication == null ? Authentication.getDefaultInstance() : authentication;
    }

    @Override // com.google.api.ServiceOrBuilder
    public Backend getBackend() {
        Backend backend = this.backend_;
        return backend == null ? Backend.getDefaultInstance() : backend;
    }

    @Override // com.google.api.ServiceOrBuilder
    public Billing getBilling() {
        Billing billing = this.billing_;
        return billing == null ? Billing.getDefaultInstance() : billing;
    }

    @Override // com.google.api.ServiceOrBuilder
    public k0i getConfigVersion() {
        k0i k0iVar = this.configVersion_;
        return k0iVar == null ? k0i.m34849h() : k0iVar;
    }

    @Override // com.google.api.ServiceOrBuilder
    public Context getContext() {
        Context context = this.context_;
        return context == null ? Context.getDefaultInstance() : context;
    }

    @Override // com.google.api.ServiceOrBuilder
    public Control getControl() {
        Control control = this.control_;
        return control == null ? Control.getDefaultInstance() : control;
    }

    @Override // com.google.api.ServiceOrBuilder
    public Documentation getDocumentation() {
        Documentation documentation = this.documentation_;
        return documentation == null ? Documentation.getDefaultInstance() : documentation;
    }

    @Override // com.google.api.ServiceOrBuilder
    public Endpoint getEndpoints(int i) {
        return (Endpoint) this.endpoints_.get(i);
    }

    @Override // com.google.api.ServiceOrBuilder
    public int getEndpointsCount() {
        return this.endpoints_.size();
    }

    @Override // com.google.api.ServiceOrBuilder
    public List<Endpoint> getEndpointsList() {
        return this.endpoints_;
    }

    public EndpointOrBuilder getEndpointsOrBuilder(int i) {
        return (EndpointOrBuilder) this.endpoints_.get(i);
    }

    public List<? extends EndpointOrBuilder> getEndpointsOrBuilderList() {
        return this.endpoints_;
    }

    @Override // com.google.api.ServiceOrBuilder
    public ei6 getEnums(int i) {
        return (ei6) this.enums_.get(i);
    }

    @Override // com.google.api.ServiceOrBuilder
    public int getEnumsCount() {
        return this.enums_.size();
    }

    @Override // com.google.api.ServiceOrBuilder
    public List<ei6> getEnumsList() {
        return this.enums_;
    }

    public ki6 getEnumsOrBuilder(int i) {
        return (ki6) this.enums_.get(i);
    }

    public List<? extends ki6> getEnumsOrBuilderList() {
        return this.enums_;
    }

    @Override // com.google.api.ServiceOrBuilder
    public Http getHttp() {
        Http http = this.http_;
        return http == null ? Http.getDefaultInstance() : http;
    }

    @Override // com.google.api.ServiceOrBuilder
    public String getId() {
        return this.id_;
    }

    @Override // com.google.api.ServiceOrBuilder
    public xq1 getIdBytes() {
        return xq1.m56589q(this.id_);
    }

    @Override // com.google.api.ServiceOrBuilder
    public Logging getLogging() {
        Logging logging = this.logging_;
        return logging == null ? Logging.getDefaultInstance() : logging;
    }

    @Override // com.google.api.ServiceOrBuilder
    public LogDescriptor getLogs(int i) {
        return (LogDescriptor) this.logs_.get(i);
    }

    @Override // com.google.api.ServiceOrBuilder
    public int getLogsCount() {
        return this.logs_.size();
    }

    @Override // com.google.api.ServiceOrBuilder
    public List<LogDescriptor> getLogsList() {
        return this.logs_;
    }

    public LogDescriptorOrBuilder getLogsOrBuilder(int i) {
        return (LogDescriptorOrBuilder) this.logs_.get(i);
    }

    public List<? extends LogDescriptorOrBuilder> getLogsOrBuilderList() {
        return this.logs_;
    }

    @Override // com.google.api.ServiceOrBuilder
    public MetricDescriptor getMetrics(int i) {
        return (MetricDescriptor) this.metrics_.get(i);
    }

    @Override // com.google.api.ServiceOrBuilder
    public int getMetricsCount() {
        return this.metrics_.size();
    }

    @Override // com.google.api.ServiceOrBuilder
    public List<MetricDescriptor> getMetricsList() {
        return this.metrics_;
    }

    public MetricDescriptorOrBuilder getMetricsOrBuilder(int i) {
        return (MetricDescriptorOrBuilder) this.metrics_.get(i);
    }

    public List<? extends MetricDescriptorOrBuilder> getMetricsOrBuilderList() {
        return this.metrics_;
    }

    @Override // com.google.api.ServiceOrBuilder
    public MonitoredResourceDescriptor getMonitoredResources(int i) {
        return (MonitoredResourceDescriptor) this.monitoredResources_.get(i);
    }

    @Override // com.google.api.ServiceOrBuilder
    public int getMonitoredResourcesCount() {
        return this.monitoredResources_.size();
    }

    @Override // com.google.api.ServiceOrBuilder
    public List<MonitoredResourceDescriptor> getMonitoredResourcesList() {
        return this.monitoredResources_;
    }

    public MonitoredResourceDescriptorOrBuilder getMonitoredResourcesOrBuilder(int i) {
        return (MonitoredResourceDescriptorOrBuilder) this.monitoredResources_.get(i);
    }

    public List<? extends MonitoredResourceDescriptorOrBuilder> getMonitoredResourcesOrBuilderList() {
        return this.monitoredResources_;
    }

    @Override // com.google.api.ServiceOrBuilder
    public Monitoring getMonitoring() {
        Monitoring monitoring = this.monitoring_;
        return monitoring == null ? Monitoring.getDefaultInstance() : monitoring;
    }

    @Override // com.google.api.ServiceOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.google.api.ServiceOrBuilder
    public xq1 getNameBytes() {
        return xq1.m56589q(this.name_);
    }

    @Override // com.google.api.ServiceOrBuilder
    public String getProducerProjectId() {
        return this.producerProjectId_;
    }

    @Override // com.google.api.ServiceOrBuilder
    public xq1 getProducerProjectIdBytes() {
        return xq1.m56589q(this.producerProjectId_);
    }

    @Override // com.google.api.ServiceOrBuilder
    public Quota getQuota() {
        Quota quota = this.quota_;
        return quota == null ? Quota.getDefaultInstance() : quota;
    }

    @Override // com.google.api.ServiceOrBuilder
    public SourceInfo getSourceInfo() {
        SourceInfo sourceInfo = this.sourceInfo_;
        return sourceInfo == null ? SourceInfo.getDefaultInstance() : sourceInfo;
    }

    @Override // com.google.api.ServiceOrBuilder
    public SystemParameters getSystemParameters() {
        SystemParameters systemParameters = this.systemParameters_;
        return systemParameters == null ? SystemParameters.getDefaultInstance() : systemParameters;
    }

    @Override // com.google.api.ServiceOrBuilder
    public String getTitle() {
        return this.title_;
    }

    @Override // com.google.api.ServiceOrBuilder
    public xq1 getTitleBytes() {
        return xq1.m56589q(this.title_);
    }

    @Override // com.google.api.ServiceOrBuilder
    public zyh getTypes(int i) {
        return (zyh) this.types_.get(i);
    }

    @Override // com.google.api.ServiceOrBuilder
    public int getTypesCount() {
        return this.types_.size();
    }

    @Override // com.google.api.ServiceOrBuilder
    public List<zyh> getTypesList() {
        return this.types_;
    }

    public bzh getTypesOrBuilder(int i) {
        return (bzh) this.types_.get(i);
    }

    public List<? extends bzh> getTypesOrBuilderList() {
        return this.types_;
    }

    @Override // com.google.api.ServiceOrBuilder
    public Usage getUsage() {
        Usage usage = this.usage_;
        return usage == null ? Usage.getDefaultInstance() : usage;
    }

    @Override // com.google.api.ServiceOrBuilder
    public boolean hasAuthentication() {
        return this.authentication_ != null;
    }

    @Override // com.google.api.ServiceOrBuilder
    public boolean hasBackend() {
        return this.backend_ != null;
    }

    @Override // com.google.api.ServiceOrBuilder
    public boolean hasBilling() {
        return this.billing_ != null;
    }

    @Override // com.google.api.ServiceOrBuilder
    public boolean hasConfigVersion() {
        return this.configVersion_ != null;
    }

    @Override // com.google.api.ServiceOrBuilder
    public boolean hasContext() {
        return this.context_ != null;
    }

    @Override // com.google.api.ServiceOrBuilder
    public boolean hasControl() {
        return this.control_ != null;
    }

    @Override // com.google.api.ServiceOrBuilder
    public boolean hasDocumentation() {
        return this.documentation_ != null;
    }

    @Override // com.google.api.ServiceOrBuilder
    public boolean hasHttp() {
        return this.http_ != null;
    }

    @Override // com.google.api.ServiceOrBuilder
    public boolean hasLogging() {
        return this.logging_ != null;
    }

    @Override // com.google.api.ServiceOrBuilder
    public boolean hasMonitoring() {
        return this.monitoring_ != null;
    }

    @Override // com.google.api.ServiceOrBuilder
    public boolean hasQuota() {
        return this.quota_ != null;
    }

    @Override // com.google.api.ServiceOrBuilder
    public boolean hasSourceInfo() {
        return this.sourceInfo_ != null;
    }

    @Override // com.google.api.ServiceOrBuilder
    public boolean hasSystemParameters() {
        return this.systemParameters_ != null;
    }

    @Override // com.google.api.ServiceOrBuilder
    public boolean hasUsage() {
        return this.usage_ != null;
    }

    public static Builder newBuilder(Service service) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(service);
    }

    public static Service parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
        return (Service) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static Service parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
        return (Service) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
    }

    public static Service parseFrom(xq1 xq1Var) {
        return (Service) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addApis(int i, yh0 yh0Var) {
        yh0Var.getClass();
        ensureApisIsMutable();
        this.apis_.add(i, yh0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEndpoints(int i, Endpoint endpoint) {
        endpoint.getClass();
        ensureEndpointsIsMutable();
        this.endpoints_.add(i, endpoint);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEnums(int i, ei6 ei6Var) {
        ei6Var.getClass();
        ensureEnumsIsMutable();
        this.enums_.add(i, ei6Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLogs(int i, LogDescriptor logDescriptor) {
        logDescriptor.getClass();
        ensureLogsIsMutable();
        this.logs_.add(i, logDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMetrics(int i, MetricDescriptor metricDescriptor) {
        metricDescriptor.getClass();
        ensureMetricsIsMutable();
        this.metrics_.add(i, metricDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMonitoredResources(int i, MonitoredResourceDescriptor monitoredResourceDescriptor) {
        monitoredResourceDescriptor.getClass();
        ensureMonitoredResourcesIsMutable();
        this.monitoredResources_.add(i, monitoredResourceDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTypes(int i, zyh zyhVar) {
        zyhVar.getClass();
        ensureTypesIsMutable();
        this.types_.add(i, zyhVar);
    }

    public static Service parseFrom(xq1 xq1Var, qp6 qp6Var) {
        return (Service) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
    }

    public static Service parseFrom(byte[] bArr) {
        return (Service) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Service parseFrom(byte[] bArr, qp6 qp6Var) {
        return (Service) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
    }

    public static Service parseFrom(InputStream inputStream) {
        return (Service) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Service parseFrom(InputStream inputStream, qp6 qp6Var) {
        return (Service) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static Service parseFrom(jf3 jf3Var) {
        return (Service) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
    }

    public static Service parseFrom(jf3 jf3Var, qp6 qp6Var) {
        return (Service) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
    }
}
