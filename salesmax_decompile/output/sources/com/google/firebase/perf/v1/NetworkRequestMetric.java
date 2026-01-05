package com.google.firebase.perf.v1;

import com.google.firebase.perf.v1.PerfSession;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p001o.fbj;
import p001o.hxc;
import p001o.jf3;
import p001o.nra;
import p001o.ora;
import p001o.qp6;
import p001o.r8;
import p001o.wn7;
import p001o.xq1;
import p001o.yn8;

/* loaded from: classes6.dex */
public final class NetworkRequestMetric extends wn7 implements NetworkRequestMetricOrBuilder {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 7;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 12;
    private static final NetworkRequestMetric DEFAULT_INSTANCE;
    public static final int HTTP_METHOD_FIELD_NUMBER = 2;
    public static final int HTTP_RESPONSE_CODE_FIELD_NUMBER = 5;
    public static final int NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER = 11;
    private static volatile hxc PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 13;
    public static final int REQUEST_PAYLOAD_BYTES_FIELD_NUMBER = 3;
    public static final int RESPONSE_CONTENT_TYPE_FIELD_NUMBER = 6;
    public static final int RESPONSE_PAYLOAD_BYTES_FIELD_NUMBER = 4;
    public static final int TIME_TO_REQUEST_COMPLETED_US_FIELD_NUMBER = 8;
    public static final int TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER = 10;
    public static final int TIME_TO_RESPONSE_INITIATED_US_FIELD_NUMBER = 9;
    public static final int URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private long clientStartTimeUs_;
    private int httpMethod_;
    private int httpResponseCode_;
    private int networkClientErrorReason_;
    private long requestPayloadBytes_;
    private long responsePayloadBytes_;
    private long timeToRequestCompletedUs_;
    private long timeToResponseCompletedUs_;
    private long timeToResponseInitiatedUs_;
    private ora customAttributes_ = ora.m42592g();
    private String url_ = "";
    private String responseContentType_ = "";
    private yn8.InterfaceC18446j perfSessions_ = wn7.emptyProtobufList();

    /* renamed from: com.google.firebase.perf.v1.NetworkRequestMetric$1 */
    public static /* synthetic */ class C114581 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f13437xa1df5c61;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f13437xa1df5c61 = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13437xa1df5c61[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13437xa1df5c61[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13437xa1df5c61[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13437xa1df5c61[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13437xa1df5c61[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13437xa1df5c61[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends wn7.AbstractC17934a implements NetworkRequestMetricOrBuilder {
        public /* synthetic */ Builder(C114581 c114581) {
            this();
        }

        public Builder addAllPerfSessions(Iterable<? extends PerfSession> iterable) {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).addAllPerfSessions(iterable);
            return this;
        }

        public Builder addPerfSessions(PerfSession perfSession) {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).addPerfSessions(perfSession);
            return this;
        }

        public Builder clearClientStartTimeUs() {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).clearClientStartTimeUs();
            return this;
        }

        public Builder clearCustomAttributes() {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).getMutableCustomAttributesMap().clear();
            return this;
        }

        public Builder clearHttpMethod() {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).clearHttpMethod();
            return this;
        }

        public Builder clearHttpResponseCode() {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).clearHttpResponseCode();
            return this;
        }

        public Builder clearNetworkClientErrorReason() {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).clearNetworkClientErrorReason();
            return this;
        }

        public Builder clearPerfSessions() {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).clearPerfSessions();
            return this;
        }

        public Builder clearRequestPayloadBytes() {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).clearRequestPayloadBytes();
            return this;
        }

        public Builder clearResponseContentType() {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).clearResponseContentType();
            return this;
        }

        public Builder clearResponsePayloadBytes() {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).clearResponsePayloadBytes();
            return this;
        }

        public Builder clearTimeToRequestCompletedUs() {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).clearTimeToRequestCompletedUs();
            return this;
        }

        public Builder clearTimeToResponseCompletedUs() {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).clearTimeToResponseCompletedUs();
            return this;
        }

        public Builder clearTimeToResponseInitiatedUs() {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).clearTimeToResponseInitiatedUs();
            return this;
        }

        public Builder clearUrl() {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).clearUrl();
            return this;
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public boolean containsCustomAttributes(String str) {
            str.getClass();
            return ((NetworkRequestMetric) this.instance).getCustomAttributesMap().containsKey(str);
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public long getClientStartTimeUs() {
            return ((NetworkRequestMetric) this.instance).getClientStartTimeUs();
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        @Deprecated
        public Map<String, String> getCustomAttributes() {
            return getCustomAttributesMap();
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public int getCustomAttributesCount() {
            return ((NetworkRequestMetric) this.instance).getCustomAttributesMap().size();
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public Map<String, String> getCustomAttributesMap() {
            return Collections.unmodifiableMap(((NetworkRequestMetric) this.instance).getCustomAttributesMap());
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public String getCustomAttributesOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> customAttributesMap = ((NetworkRequestMetric) this.instance).getCustomAttributesMap();
            return customAttributesMap.containsKey(str) ? customAttributesMap.get(str) : str2;
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public String getCustomAttributesOrThrow(String str) {
            str.getClass();
            Map<String, String> customAttributesMap = ((NetworkRequestMetric) this.instance).getCustomAttributesMap();
            if (customAttributesMap.containsKey(str)) {
                return customAttributesMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public HttpMethod getHttpMethod() {
            return ((NetworkRequestMetric) this.instance).getHttpMethod();
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public int getHttpResponseCode() {
            return ((NetworkRequestMetric) this.instance).getHttpResponseCode();
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public NetworkClientErrorReason getNetworkClientErrorReason() {
            return ((NetworkRequestMetric) this.instance).getNetworkClientErrorReason();
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public PerfSession getPerfSessions(int i) {
            return ((NetworkRequestMetric) this.instance).getPerfSessions(i);
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public int getPerfSessionsCount() {
            return ((NetworkRequestMetric) this.instance).getPerfSessionsCount();
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public List<PerfSession> getPerfSessionsList() {
            return Collections.unmodifiableList(((NetworkRequestMetric) this.instance).getPerfSessionsList());
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public long getRequestPayloadBytes() {
            return ((NetworkRequestMetric) this.instance).getRequestPayloadBytes();
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public String getResponseContentType() {
            return ((NetworkRequestMetric) this.instance).getResponseContentType();
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public xq1 getResponseContentTypeBytes() {
            return ((NetworkRequestMetric) this.instance).getResponseContentTypeBytes();
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public long getResponsePayloadBytes() {
            return ((NetworkRequestMetric) this.instance).getResponsePayloadBytes();
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public long getTimeToRequestCompletedUs() {
            return ((NetworkRequestMetric) this.instance).getTimeToRequestCompletedUs();
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public long getTimeToResponseCompletedUs() {
            return ((NetworkRequestMetric) this.instance).getTimeToResponseCompletedUs();
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public long getTimeToResponseInitiatedUs() {
            return ((NetworkRequestMetric) this.instance).getTimeToResponseInitiatedUs();
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public String getUrl() {
            return ((NetworkRequestMetric) this.instance).getUrl();
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public xq1 getUrlBytes() {
            return ((NetworkRequestMetric) this.instance).getUrlBytes();
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public boolean hasClientStartTimeUs() {
            return ((NetworkRequestMetric) this.instance).hasClientStartTimeUs();
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public boolean hasHttpMethod() {
            return ((NetworkRequestMetric) this.instance).hasHttpMethod();
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public boolean hasHttpResponseCode() {
            return ((NetworkRequestMetric) this.instance).hasHttpResponseCode();
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public boolean hasNetworkClientErrorReason() {
            return ((NetworkRequestMetric) this.instance).hasNetworkClientErrorReason();
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public boolean hasRequestPayloadBytes() {
            return ((NetworkRequestMetric) this.instance).hasRequestPayloadBytes();
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public boolean hasResponseContentType() {
            return ((NetworkRequestMetric) this.instance).hasResponseContentType();
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public boolean hasResponsePayloadBytes() {
            return ((NetworkRequestMetric) this.instance).hasResponsePayloadBytes();
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public boolean hasTimeToRequestCompletedUs() {
            return ((NetworkRequestMetric) this.instance).hasTimeToRequestCompletedUs();
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public boolean hasTimeToResponseCompletedUs() {
            return ((NetworkRequestMetric) this.instance).hasTimeToResponseCompletedUs();
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public boolean hasTimeToResponseInitiatedUs() {
            return ((NetworkRequestMetric) this.instance).hasTimeToResponseInitiatedUs();
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public boolean hasUrl() {
            return ((NetworkRequestMetric) this.instance).hasUrl();
        }

        public Builder putAllCustomAttributes(Map<String, String> map) {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).getMutableCustomAttributesMap().putAll(map);
            return this;
        }

        public Builder putCustomAttributes(String str, String str2) {
            str.getClass();
            str2.getClass();
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).getMutableCustomAttributesMap().put(str, str2);
            return this;
        }

        public Builder removeCustomAttributes(String str) {
            str.getClass();
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).getMutableCustomAttributesMap().remove(str);
            return this;
        }

        public Builder removePerfSessions(int i) {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).removePerfSessions(i);
            return this;
        }

        public Builder setClientStartTimeUs(long j) {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).setClientStartTimeUs(j);
            return this;
        }

        public Builder setHttpMethod(HttpMethod httpMethod) {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).setHttpMethod(httpMethod);
            return this;
        }

        public Builder setHttpResponseCode(int i) {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).setHttpResponseCode(i);
            return this;
        }

        public Builder setNetworkClientErrorReason(NetworkClientErrorReason networkClientErrorReason) {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).setNetworkClientErrorReason(networkClientErrorReason);
            return this;
        }

        public Builder setPerfSessions(int i, PerfSession perfSession) {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).setPerfSessions(i, perfSession);
            return this;
        }

        public Builder setRequestPayloadBytes(long j) {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).setRequestPayloadBytes(j);
            return this;
        }

        public Builder setResponseContentType(String str) {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).setResponseContentType(str);
            return this;
        }

        public Builder setResponseContentTypeBytes(xq1 xq1Var) {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).setResponseContentTypeBytes(xq1Var);
            return this;
        }

        public Builder setResponsePayloadBytes(long j) {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).setResponsePayloadBytes(j);
            return this;
        }

        public Builder setTimeToRequestCompletedUs(long j) {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).setTimeToRequestCompletedUs(j);
            return this;
        }

        public Builder setTimeToResponseCompletedUs(long j) {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).setTimeToResponseCompletedUs(j);
            return this;
        }

        public Builder setTimeToResponseInitiatedUs(long j) {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).setTimeToResponseInitiatedUs(j);
            return this;
        }

        public Builder setUrl(String str) {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).setUrl(str);
            return this;
        }

        public Builder setUrlBytes(xq1 xq1Var) {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).setUrlBytes(xq1Var);
            return this;
        }

        private Builder() {
            super(NetworkRequestMetric.DEFAULT_INSTANCE);
        }

        public Builder addPerfSessions(int i, PerfSession perfSession) {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).addPerfSessions(i, perfSession);
            return this;
        }

        public Builder setPerfSessions(int i, PerfSession.Builder builder) {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).setPerfSessions(i, (PerfSession) builder.build());
            return this;
        }

        public Builder addPerfSessions(PerfSession.Builder builder) {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).addPerfSessions((PerfSession) builder.build());
            return this;
        }

        public Builder addPerfSessions(int i, PerfSession.Builder builder) {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).addPerfSessions(i, (PerfSession) builder.build());
            return this;
        }
    }

    public static final class CustomAttributesDefaultEntryHolder {
        static final nra defaultEntry;

        static {
            fbj.EnumC13396b enumC13396b = fbj.EnumC13396b.STRING;
            defaultEntry = nra.m41005d(enumC13396b, "", enumC13396b, "");
        }

        private CustomAttributesDefaultEntryHolder() {
        }
    }

    public enum HttpMethod implements yn8.InterfaceC18439c {
        HTTP_METHOD_UNKNOWN(0),
        GET(1),
        PUT(2),
        POST(3),
        DELETE(4),
        HEAD(5),
        PATCH(6),
        OPTIONS(7),
        TRACE(8),
        CONNECT(9);

        public static final int CONNECT_VALUE = 9;
        public static final int DELETE_VALUE = 4;
        public static final int GET_VALUE = 1;
        public static final int HEAD_VALUE = 5;
        public static final int HTTP_METHOD_UNKNOWN_VALUE = 0;
        public static final int OPTIONS_VALUE = 7;
        public static final int PATCH_VALUE = 6;
        public static final int POST_VALUE = 3;
        public static final int PUT_VALUE = 2;
        public static final int TRACE_VALUE = 8;
        private static final yn8.InterfaceC18440d internalValueMap = new yn8.InterfaceC18440d() { // from class: com.google.firebase.perf.v1.NetworkRequestMetric.HttpMethod.1
            @Override // p001o.yn8.InterfaceC18440d
            public HttpMethod findValueByNumber(int i) {
                return HttpMethod.forNumber(i);
            }
        };
        private final int value;

        public static final class HttpMethodVerifier implements yn8.InterfaceC18441e {
            static final yn8.InterfaceC18441e INSTANCE = new HttpMethodVerifier();

            private HttpMethodVerifier() {
            }

            @Override // p001o.yn8.InterfaceC18441e
            public boolean isInRange(int i) {
                return HttpMethod.forNumber(i) != null;
            }
        }

        HttpMethod(int i) {
            this.value = i;
        }

        public static HttpMethod forNumber(int i) {
            switch (i) {
                case 0:
                    return HTTP_METHOD_UNKNOWN;
                case 1:
                    return GET;
                case 2:
                    return PUT;
                case 3:
                    return POST;
                case 4:
                    return DELETE;
                case 5:
                    return HEAD;
                case 6:
                    return PATCH;
                case 7:
                    return OPTIONS;
                case 8:
                    return TRACE;
                case 9:
                    return CONNECT;
                default:
                    return null;
            }
        }

        public static yn8.InterfaceC18440d internalGetValueMap() {
            return internalValueMap;
        }

        public static yn8.InterfaceC18441e internalGetVerifier() {
            return HttpMethodVerifier.INSTANCE;
        }

        @Override // p001o.yn8.InterfaceC18439c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static HttpMethod valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum NetworkClientErrorReason implements yn8.InterfaceC18439c {
        NETWORK_CLIENT_ERROR_REASON_UNKNOWN(0),
        GENERIC_CLIENT_ERROR(1);

        public static final int GENERIC_CLIENT_ERROR_VALUE = 1;
        public static final int NETWORK_CLIENT_ERROR_REASON_UNKNOWN_VALUE = 0;
        private static final yn8.InterfaceC18440d internalValueMap = new yn8.InterfaceC18440d() { // from class: com.google.firebase.perf.v1.NetworkRequestMetric.NetworkClientErrorReason.1
            @Override // p001o.yn8.InterfaceC18440d
            public NetworkClientErrorReason findValueByNumber(int i) {
                return NetworkClientErrorReason.forNumber(i);
            }
        };
        private final int value;

        public static final class NetworkClientErrorReasonVerifier implements yn8.InterfaceC18441e {
            static final yn8.InterfaceC18441e INSTANCE = new NetworkClientErrorReasonVerifier();

            private NetworkClientErrorReasonVerifier() {
            }

            @Override // p001o.yn8.InterfaceC18441e
            public boolean isInRange(int i) {
                return NetworkClientErrorReason.forNumber(i) != null;
            }
        }

        NetworkClientErrorReason(int i) {
            this.value = i;
        }

        public static NetworkClientErrorReason forNumber(int i) {
            if (i == 0) {
                return NETWORK_CLIENT_ERROR_REASON_UNKNOWN;
            }
            if (i != 1) {
                return null;
            }
            return GENERIC_CLIENT_ERROR;
        }

        public static yn8.InterfaceC18440d internalGetValueMap() {
            return internalValueMap;
        }

        public static yn8.InterfaceC18441e internalGetVerifier() {
            return NetworkClientErrorReasonVerifier.INSTANCE;
        }

        @Override // p001o.yn8.InterfaceC18439c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static NetworkClientErrorReason valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        NetworkRequestMetric networkRequestMetric = new NetworkRequestMetric();
        DEFAULT_INSTANCE = networkRequestMetric;
        wn7.registerDefaultInstance(NetworkRequestMetric.class, networkRequestMetric);
    }

    private NetworkRequestMetric() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPerfSessions(Iterable<? extends PerfSession> iterable) {
        ensurePerfSessionsIsMutable();
        r8.addAll((Iterable) iterable, (List) this.perfSessions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPerfSessions(PerfSession perfSession) {
        perfSession.getClass();
        ensurePerfSessionsIsMutable();
        this.perfSessions_.add(perfSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientStartTimeUs() {
        this.bitField0_ &= -129;
        this.clientStartTimeUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHttpMethod() {
        this.bitField0_ &= -3;
        this.httpMethod_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHttpResponseCode() {
        this.bitField0_ &= -33;
        this.httpResponseCode_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNetworkClientErrorReason() {
        this.bitField0_ &= -17;
        this.networkClientErrorReason_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPerfSessions() {
        this.perfSessions_ = wn7.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestPayloadBytes() {
        this.bitField0_ &= -5;
        this.requestPayloadBytes_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResponseContentType() {
        this.bitField0_ &= -65;
        this.responseContentType_ = getDefaultInstance().getResponseContentType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResponsePayloadBytes() {
        this.bitField0_ &= -9;
        this.responsePayloadBytes_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeToRequestCompletedUs() {
        this.bitField0_ &= -257;
        this.timeToRequestCompletedUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeToResponseCompletedUs() {
        this.bitField0_ &= -1025;
        this.timeToResponseCompletedUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeToResponseInitiatedUs() {
        this.bitField0_ &= -513;
        this.timeToResponseInitiatedUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrl() {
        this.bitField0_ &= -2;
        this.url_ = getDefaultInstance().getUrl();
    }

    private void ensurePerfSessionsIsMutable() {
        yn8.InterfaceC18446j interfaceC18446j = this.perfSessions_;
        if (interfaceC18446j.mo28212k()) {
            return;
        }
        this.perfSessions_ = wn7.mutableCopy(interfaceC18446j);
    }

    public static NetworkRequestMetric getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getMutableCustomAttributesMap() {
        return internalGetMutableCustomAttributes();
    }

    private ora internalGetCustomAttributes() {
        return this.customAttributes_;
    }

    private ora internalGetMutableCustomAttributes() {
        if (!this.customAttributes_.m42597t()) {
            this.customAttributes_ = this.customAttributes_.m42595A();
        }
        return this.customAttributes_;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static NetworkRequestMetric parseDelimitedFrom(InputStream inputStream) {
        return (NetworkRequestMetric) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NetworkRequestMetric parseFrom(ByteBuffer byteBuffer) {
        return (NetworkRequestMetric) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hxc parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePerfSessions(int i) {
        ensurePerfSessionsIsMutable();
        this.perfSessions_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientStartTimeUs(long j) {
        this.bitField0_ |= 128;
        this.clientStartTimeUs_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHttpMethod(HttpMethod httpMethod) {
        this.httpMethod_ = httpMethod.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHttpResponseCode(int i) {
        this.bitField0_ |= 32;
        this.httpResponseCode_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetworkClientErrorReason(NetworkClientErrorReason networkClientErrorReason) {
        this.networkClientErrorReason_ = networkClientErrorReason.getNumber();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPerfSessions(int i, PerfSession perfSession) {
        perfSession.getClass();
        ensurePerfSessionsIsMutable();
        this.perfSessions_.set(i, perfSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestPayloadBytes(long j) {
        this.bitField0_ |= 4;
        this.requestPayloadBytes_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseContentType(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.responseContentType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseContentTypeBytes(xq1 xq1Var) {
        this.responseContentType_ = xq1Var.m56593N();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponsePayloadBytes(long j) {
        this.bitField0_ |= 8;
        this.responsePayloadBytes_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeToRequestCompletedUs(long j) {
        this.bitField0_ |= 256;
        this.timeToRequestCompletedUs_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeToResponseCompletedUs(long j) {
        this.bitField0_ |= 1024;
        this.timeToResponseCompletedUs_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeToResponseInitiatedUs(long j) {
        this.bitField0_ |= 512;
        this.timeToResponseInitiatedUs_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrl(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.url_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrlBytes(xq1 xq1Var) {
        this.url_ = xq1Var.m56593N();
        this.bitField0_ |= 1;
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public boolean containsCustomAttributes(String str) {
        str.getClass();
        return internalGetCustomAttributes().containsKey(str);
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C114581 c114581 = null;
        switch (C114581.f13437xa1df5c61[enumC17940g.ordinal()]) {
            case 1:
                return new NetworkRequestMetric();
            case 2:
                return new Builder(c114581);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0001\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0005\u0006ဈ\u0006\u0007ဂ\u0007\bဂ\b\tဂ\t\nဂ\n\u000bဌ\u0004\f2\r\u001b", new Object[]{"bitField0_", "url_", "httpMethod_", HttpMethod.internalGetVerifier(), "requestPayloadBytes_", "responsePayloadBytes_", "httpResponseCode_", "responseContentType_", "clientStartTimeUs_", "timeToRequestCompletedUs_", "timeToResponseInitiatedUs_", "timeToResponseCompletedUs_", "networkClientErrorReason_", NetworkClientErrorReason.internalGetVerifier(), "customAttributes_", CustomAttributesDefaultEntryHolder.defaultEntry, "perfSessions_", PerfSession.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (NetworkRequestMetric.class) {
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

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public long getClientStartTimeUs() {
        return this.clientStartTimeUs_;
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    @Deprecated
    public Map<String, String> getCustomAttributes() {
        return getCustomAttributesMap();
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public int getCustomAttributesCount() {
        return internalGetCustomAttributes().size();
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public Map<String, String> getCustomAttributesMap() {
        return Collections.unmodifiableMap(internalGetCustomAttributes());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public String getCustomAttributesOrDefault(String str, String str2) {
        str.getClass();
        ora oraVarInternalGetCustomAttributes = internalGetCustomAttributes();
        return oraVarInternalGetCustomAttributes.containsKey(str) ? (String) oraVarInternalGetCustomAttributes.get(str) : str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public String getCustomAttributesOrThrow(String str) {
        str.getClass();
        ora oraVarInternalGetCustomAttributes = internalGetCustomAttributes();
        if (oraVarInternalGetCustomAttributes.containsKey(str)) {
            return (String) oraVarInternalGetCustomAttributes.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public HttpMethod getHttpMethod() {
        HttpMethod httpMethodForNumber = HttpMethod.forNumber(this.httpMethod_);
        return httpMethodForNumber == null ? HttpMethod.HTTP_METHOD_UNKNOWN : httpMethodForNumber;
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public int getHttpResponseCode() {
        return this.httpResponseCode_;
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public NetworkClientErrorReason getNetworkClientErrorReason() {
        NetworkClientErrorReason networkClientErrorReasonForNumber = NetworkClientErrorReason.forNumber(this.networkClientErrorReason_);
        return networkClientErrorReasonForNumber == null ? NetworkClientErrorReason.NETWORK_CLIENT_ERROR_REASON_UNKNOWN : networkClientErrorReasonForNumber;
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public PerfSession getPerfSessions(int i) {
        return (PerfSession) this.perfSessions_.get(i);
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public int getPerfSessionsCount() {
        return this.perfSessions_.size();
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public List<PerfSession> getPerfSessionsList() {
        return this.perfSessions_;
    }

    public PerfSessionOrBuilder getPerfSessionsOrBuilder(int i) {
        return (PerfSessionOrBuilder) this.perfSessions_.get(i);
    }

    public List<? extends PerfSessionOrBuilder> getPerfSessionsOrBuilderList() {
        return this.perfSessions_;
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public long getRequestPayloadBytes() {
        return this.requestPayloadBytes_;
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public String getResponseContentType() {
        return this.responseContentType_;
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public xq1 getResponseContentTypeBytes() {
        return xq1.m56589q(this.responseContentType_);
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public long getResponsePayloadBytes() {
        return this.responsePayloadBytes_;
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public long getTimeToRequestCompletedUs() {
        return this.timeToRequestCompletedUs_;
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public long getTimeToResponseCompletedUs() {
        return this.timeToResponseCompletedUs_;
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public long getTimeToResponseInitiatedUs() {
        return this.timeToResponseInitiatedUs_;
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public String getUrl() {
        return this.url_;
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public xq1 getUrlBytes() {
        return xq1.m56589q(this.url_);
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public boolean hasClientStartTimeUs() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public boolean hasHttpMethod() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public boolean hasHttpResponseCode() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public boolean hasNetworkClientErrorReason() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public boolean hasRequestPayloadBytes() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public boolean hasResponseContentType() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public boolean hasResponsePayloadBytes() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public boolean hasTimeToRequestCompletedUs() {
        return (this.bitField0_ & 256) != 0;
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public boolean hasTimeToResponseCompletedUs() {
        return (this.bitField0_ & 1024) != 0;
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public boolean hasTimeToResponseInitiatedUs() {
        return (this.bitField0_ & 512) != 0;
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public boolean hasUrl() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(NetworkRequestMetric networkRequestMetric) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(networkRequestMetric);
    }

    public static NetworkRequestMetric parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
        return (NetworkRequestMetric) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static NetworkRequestMetric parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
        return (NetworkRequestMetric) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
    }

    public static NetworkRequestMetric parseFrom(xq1 xq1Var) {
        return (NetworkRequestMetric) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPerfSessions(int i, PerfSession perfSession) {
        perfSession.getClass();
        ensurePerfSessionsIsMutable();
        this.perfSessions_.add(i, perfSession);
    }

    public static NetworkRequestMetric parseFrom(xq1 xq1Var, qp6 qp6Var) {
        return (NetworkRequestMetric) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
    }

    public static NetworkRequestMetric parseFrom(byte[] bArr) {
        return (NetworkRequestMetric) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NetworkRequestMetric parseFrom(byte[] bArr, qp6 qp6Var) {
        return (NetworkRequestMetric) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
    }

    public static NetworkRequestMetric parseFrom(InputStream inputStream) {
        return (NetworkRequestMetric) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NetworkRequestMetric parseFrom(InputStream inputStream, qp6 qp6Var) {
        return (NetworkRequestMetric) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static NetworkRequestMetric parseFrom(jf3 jf3Var) {
        return (NetworkRequestMetric) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
    }

    public static NetworkRequestMetric parseFrom(jf3 jf3Var, qp6 qp6Var) {
        return (NetworkRequestMetric) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
    }
}
