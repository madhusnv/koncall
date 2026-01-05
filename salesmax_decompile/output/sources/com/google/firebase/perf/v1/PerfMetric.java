package com.google.firebase.perf.v1;

import com.google.firebase.perf.v1.ApplicationInfo;
import com.google.firebase.perf.v1.GaugeMetric;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import com.google.firebase.perf.v1.TraceMetric;
import com.google.firebase.perf.v1.TransportInfo;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p001o.hxc;
import p001o.jf3;
import p001o.qp6;
import p001o.wn7;
import p001o.xq1;

/* loaded from: classes6.dex */
public final class PerfMetric extends wn7 implements PerfMetricOrBuilder {
    public static final int APPLICATION_INFO_FIELD_NUMBER = 1;
    private static final PerfMetric DEFAULT_INSTANCE;
    public static final int GAUGE_METRIC_FIELD_NUMBER = 4;
    public static final int NETWORK_REQUEST_METRIC_FIELD_NUMBER = 3;
    private static volatile hxc PARSER = null;
    public static final int TRACE_METRIC_FIELD_NUMBER = 2;
    public static final int TRANSPORT_INFO_FIELD_NUMBER = 5;
    private ApplicationInfo applicationInfo_;
    private int bitField0_;
    private GaugeMetric gaugeMetric_;
    private NetworkRequestMetric networkRequestMetric_;
    private TraceMetric traceMetric_;
    private TransportInfo transportInfo_;

    /* renamed from: com.google.firebase.perf.v1.PerfMetric$1 */
    public static /* synthetic */ class C114611 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f13438xa1df5c61;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f13438xa1df5c61 = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13438xa1df5c61[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13438xa1df5c61[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13438xa1df5c61[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13438xa1df5c61[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13438xa1df5c61[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13438xa1df5c61[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends wn7.AbstractC17934a implements PerfMetricOrBuilder {
        public /* synthetic */ Builder(C114611 c114611) {
            this();
        }

        public Builder clearApplicationInfo() {
            copyOnWrite();
            ((PerfMetric) this.instance).clearApplicationInfo();
            return this;
        }

        public Builder clearGaugeMetric() {
            copyOnWrite();
            ((PerfMetric) this.instance).clearGaugeMetric();
            return this;
        }

        public Builder clearNetworkRequestMetric() {
            copyOnWrite();
            ((PerfMetric) this.instance).clearNetworkRequestMetric();
            return this;
        }

        public Builder clearTraceMetric() {
            copyOnWrite();
            ((PerfMetric) this.instance).clearTraceMetric();
            return this;
        }

        public Builder clearTransportInfo() {
            copyOnWrite();
            ((PerfMetric) this.instance).clearTransportInfo();
            return this;
        }

        @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
        public ApplicationInfo getApplicationInfo() {
            return ((PerfMetric) this.instance).getApplicationInfo();
        }

        @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
        public GaugeMetric getGaugeMetric() {
            return ((PerfMetric) this.instance).getGaugeMetric();
        }

        @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
        public NetworkRequestMetric getNetworkRequestMetric() {
            return ((PerfMetric) this.instance).getNetworkRequestMetric();
        }

        @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
        public TraceMetric getTraceMetric() {
            return ((PerfMetric) this.instance).getTraceMetric();
        }

        @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
        public TransportInfo getTransportInfo() {
            return ((PerfMetric) this.instance).getTransportInfo();
        }

        @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
        public boolean hasApplicationInfo() {
            return ((PerfMetric) this.instance).hasApplicationInfo();
        }

        @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
        public boolean hasGaugeMetric() {
            return ((PerfMetric) this.instance).hasGaugeMetric();
        }

        @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
        public boolean hasNetworkRequestMetric() {
            return ((PerfMetric) this.instance).hasNetworkRequestMetric();
        }

        @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
        public boolean hasTraceMetric() {
            return ((PerfMetric) this.instance).hasTraceMetric();
        }

        @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
        public boolean hasTransportInfo() {
            return ((PerfMetric) this.instance).hasTransportInfo();
        }

        public Builder mergeApplicationInfo(ApplicationInfo applicationInfo) {
            copyOnWrite();
            ((PerfMetric) this.instance).mergeApplicationInfo(applicationInfo);
            return this;
        }

        public Builder mergeGaugeMetric(GaugeMetric gaugeMetric) {
            copyOnWrite();
            ((PerfMetric) this.instance).mergeGaugeMetric(gaugeMetric);
            return this;
        }

        public Builder mergeNetworkRequestMetric(NetworkRequestMetric networkRequestMetric) {
            copyOnWrite();
            ((PerfMetric) this.instance).mergeNetworkRequestMetric(networkRequestMetric);
            return this;
        }

        public Builder mergeTraceMetric(TraceMetric traceMetric) {
            copyOnWrite();
            ((PerfMetric) this.instance).mergeTraceMetric(traceMetric);
            return this;
        }

        public Builder mergeTransportInfo(TransportInfo transportInfo) {
            copyOnWrite();
            ((PerfMetric) this.instance).mergeTransportInfo(transportInfo);
            return this;
        }

        public Builder setApplicationInfo(ApplicationInfo applicationInfo) {
            copyOnWrite();
            ((PerfMetric) this.instance).setApplicationInfo(applicationInfo);
            return this;
        }

        public Builder setGaugeMetric(GaugeMetric gaugeMetric) {
            copyOnWrite();
            ((PerfMetric) this.instance).setGaugeMetric(gaugeMetric);
            return this;
        }

        public Builder setNetworkRequestMetric(NetworkRequestMetric networkRequestMetric) {
            copyOnWrite();
            ((PerfMetric) this.instance).setNetworkRequestMetric(networkRequestMetric);
            return this;
        }

        public Builder setTraceMetric(TraceMetric traceMetric) {
            copyOnWrite();
            ((PerfMetric) this.instance).setTraceMetric(traceMetric);
            return this;
        }

        public Builder setTransportInfo(TransportInfo transportInfo) {
            copyOnWrite();
            ((PerfMetric) this.instance).setTransportInfo(transportInfo);
            return this;
        }

        private Builder() {
            super(PerfMetric.DEFAULT_INSTANCE);
        }

        public Builder setApplicationInfo(ApplicationInfo.Builder builder) {
            copyOnWrite();
            ((PerfMetric) this.instance).setApplicationInfo((ApplicationInfo) builder.build());
            return this;
        }

        public Builder setGaugeMetric(GaugeMetric.Builder builder) {
            copyOnWrite();
            ((PerfMetric) this.instance).setGaugeMetric((GaugeMetric) builder.build());
            return this;
        }

        public Builder setNetworkRequestMetric(NetworkRequestMetric.Builder builder) {
            copyOnWrite();
            ((PerfMetric) this.instance).setNetworkRequestMetric((NetworkRequestMetric) builder.build());
            return this;
        }

        public Builder setTraceMetric(TraceMetric.Builder builder) {
            copyOnWrite();
            ((PerfMetric) this.instance).setTraceMetric((TraceMetric) builder.build());
            return this;
        }

        public Builder setTransportInfo(TransportInfo.Builder builder) {
            copyOnWrite();
            ((PerfMetric) this.instance).setTransportInfo((TransportInfo) builder.build());
            return this;
        }
    }

    static {
        PerfMetric perfMetric = new PerfMetric();
        DEFAULT_INSTANCE = perfMetric;
        wn7.registerDefaultInstance(PerfMetric.class, perfMetric);
    }

    private PerfMetric() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearApplicationInfo() {
        this.applicationInfo_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGaugeMetric() {
        this.gaugeMetric_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNetworkRequestMetric() {
        this.networkRequestMetric_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTraceMetric() {
        this.traceMetric_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTransportInfo() {
        this.transportInfo_ = null;
        this.bitField0_ &= -17;
    }

    public static PerfMetric getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeApplicationInfo(ApplicationInfo applicationInfo) {
        applicationInfo.getClass();
        ApplicationInfo applicationInfo2 = this.applicationInfo_;
        if (applicationInfo2 == null || applicationInfo2 == ApplicationInfo.getDefaultInstance()) {
            this.applicationInfo_ = applicationInfo;
        } else {
            this.applicationInfo_ = (ApplicationInfo) ((ApplicationInfo.Builder) ApplicationInfo.newBuilder(this.applicationInfo_).mergeFrom((wn7) applicationInfo)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGaugeMetric(GaugeMetric gaugeMetric) {
        gaugeMetric.getClass();
        GaugeMetric gaugeMetric2 = this.gaugeMetric_;
        if (gaugeMetric2 == null || gaugeMetric2 == GaugeMetric.getDefaultInstance()) {
            this.gaugeMetric_ = gaugeMetric;
        } else {
            this.gaugeMetric_ = (GaugeMetric) ((GaugeMetric.Builder) GaugeMetric.newBuilder(this.gaugeMetric_).mergeFrom((wn7) gaugeMetric)).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNetworkRequestMetric(NetworkRequestMetric networkRequestMetric) {
        networkRequestMetric.getClass();
        NetworkRequestMetric networkRequestMetric2 = this.networkRequestMetric_;
        if (networkRequestMetric2 == null || networkRequestMetric2 == NetworkRequestMetric.getDefaultInstance()) {
            this.networkRequestMetric_ = networkRequestMetric;
        } else {
            this.networkRequestMetric_ = (NetworkRequestMetric) ((NetworkRequestMetric.Builder) NetworkRequestMetric.newBuilder(this.networkRequestMetric_).mergeFrom((wn7) networkRequestMetric)).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTraceMetric(TraceMetric traceMetric) {
        traceMetric.getClass();
        TraceMetric traceMetric2 = this.traceMetric_;
        if (traceMetric2 == null || traceMetric2 == TraceMetric.getDefaultInstance()) {
            this.traceMetric_ = traceMetric;
        } else {
            this.traceMetric_ = (TraceMetric) ((TraceMetric.Builder) TraceMetric.newBuilder(this.traceMetric_).mergeFrom((wn7) traceMetric)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTransportInfo(TransportInfo transportInfo) {
        transportInfo.getClass();
        TransportInfo transportInfo2 = this.transportInfo_;
        if (transportInfo2 == null || transportInfo2 == TransportInfo.getDefaultInstance()) {
            this.transportInfo_ = transportInfo;
        } else {
            this.transportInfo_ = (TransportInfo) ((TransportInfo.Builder) TransportInfo.newBuilder(this.transportInfo_).mergeFrom((wn7) transportInfo)).buildPartial();
        }
        this.bitField0_ |= 16;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static PerfMetric parseDelimitedFrom(InputStream inputStream) {
        return (PerfMetric) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PerfMetric parseFrom(ByteBuffer byteBuffer) {
        return (PerfMetric) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hxc parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApplicationInfo(ApplicationInfo applicationInfo) {
        applicationInfo.getClass();
        this.applicationInfo_ = applicationInfo;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGaugeMetric(GaugeMetric gaugeMetric) {
        gaugeMetric.getClass();
        this.gaugeMetric_ = gaugeMetric;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetworkRequestMetric(NetworkRequestMetric networkRequestMetric) {
        networkRequestMetric.getClass();
        this.networkRequestMetric_ = networkRequestMetric;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTraceMetric(TraceMetric traceMetric) {
        traceMetric.getClass();
        this.traceMetric_ = traceMetric;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTransportInfo(TransportInfo transportInfo) {
        transportInfo.getClass();
        this.transportInfo_ = transportInfo;
        this.bitField0_ |= 16;
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C114611 c114611 = null;
        switch (C114611.f13438xa1df5c61[enumC17940g.ordinal()]) {
            case 1:
                return new PerfMetric();
            case 2:
                return new Builder(c114611);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "applicationInfo_", "traceMetric_", "networkRequestMetric_", "gaugeMetric_", "transportInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (PerfMetric.class) {
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

    @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
    public ApplicationInfo getApplicationInfo() {
        ApplicationInfo applicationInfo = this.applicationInfo_;
        return applicationInfo == null ? ApplicationInfo.getDefaultInstance() : applicationInfo;
    }

    @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
    public GaugeMetric getGaugeMetric() {
        GaugeMetric gaugeMetric = this.gaugeMetric_;
        return gaugeMetric == null ? GaugeMetric.getDefaultInstance() : gaugeMetric;
    }

    @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
    public NetworkRequestMetric getNetworkRequestMetric() {
        NetworkRequestMetric networkRequestMetric = this.networkRequestMetric_;
        return networkRequestMetric == null ? NetworkRequestMetric.getDefaultInstance() : networkRequestMetric;
    }

    @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
    public TraceMetric getTraceMetric() {
        TraceMetric traceMetric = this.traceMetric_;
        return traceMetric == null ? TraceMetric.getDefaultInstance() : traceMetric;
    }

    @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
    public TransportInfo getTransportInfo() {
        TransportInfo transportInfo = this.transportInfo_;
        return transportInfo == null ? TransportInfo.getDefaultInstance() : transportInfo;
    }

    @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
    public boolean hasApplicationInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
    public boolean hasGaugeMetric() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
    public boolean hasNetworkRequestMetric() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
    public boolean hasTraceMetric() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
    public boolean hasTransportInfo() {
        return (this.bitField0_ & 16) != 0;
    }

    public static Builder newBuilder(PerfMetric perfMetric) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(perfMetric);
    }

    public static PerfMetric parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
        return (PerfMetric) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static PerfMetric parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
        return (PerfMetric) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
    }

    public static PerfMetric parseFrom(xq1 xq1Var) {
        return (PerfMetric) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
    }

    public static PerfMetric parseFrom(xq1 xq1Var, qp6 qp6Var) {
        return (PerfMetric) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
    }

    public static PerfMetric parseFrom(byte[] bArr) {
        return (PerfMetric) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PerfMetric parseFrom(byte[] bArr, qp6 qp6Var) {
        return (PerfMetric) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
    }

    public static PerfMetric parseFrom(InputStream inputStream) {
        return (PerfMetric) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PerfMetric parseFrom(InputStream inputStream, qp6 qp6Var) {
        return (PerfMetric) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static PerfMetric parseFrom(jf3 jf3Var) {
        return (PerfMetric) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
    }

    public static PerfMetric parseFrom(jf3 jf3Var, qp6 qp6Var) {
        return (PerfMetric) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
    }
}
