package com.google.firebase.perf.v1;

import com.google.firebase.perf.v1.AndroidMemoryReading;
import com.google.firebase.perf.v1.CpuMetricReading;
import com.google.firebase.perf.v1.GaugeMetadata;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p001o.hxc;
import p001o.jf3;
import p001o.qp6;
import p001o.r8;
import p001o.wn7;
import p001o.xq1;
import p001o.yn8;

/* loaded from: classes6.dex */
public final class GaugeMetric extends wn7 implements GaugeMetricOrBuilder {
    public static final int ANDROID_MEMORY_READINGS_FIELD_NUMBER = 4;
    public static final int CPU_METRIC_READINGS_FIELD_NUMBER = 2;
    private static final GaugeMetric DEFAULT_INSTANCE;
    public static final int GAUGE_METADATA_FIELD_NUMBER = 3;
    private static volatile hxc PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private GaugeMetadata gaugeMetadata_;
    private String sessionId_ = "";
    private yn8.InterfaceC18446j cpuMetricReadings_ = wn7.emptyProtobufList();
    private yn8.InterfaceC18446j androidMemoryReadings_ = wn7.emptyProtobufList();

    /* renamed from: com.google.firebase.perf.v1.GaugeMetric$1 */
    public static /* synthetic */ class C114541 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f13435xa1df5c61;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f13435xa1df5c61 = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13435xa1df5c61[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13435xa1df5c61[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13435xa1df5c61[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13435xa1df5c61[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13435xa1df5c61[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13435xa1df5c61[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends wn7.AbstractC17934a implements GaugeMetricOrBuilder {
        public /* synthetic */ Builder(C114541 c114541) {
            this();
        }

        public Builder addAllAndroidMemoryReadings(Iterable<? extends AndroidMemoryReading> iterable) {
            copyOnWrite();
            ((GaugeMetric) this.instance).addAllAndroidMemoryReadings(iterable);
            return this;
        }

        public Builder addAllCpuMetricReadings(Iterable<? extends CpuMetricReading> iterable) {
            copyOnWrite();
            ((GaugeMetric) this.instance).addAllCpuMetricReadings(iterable);
            return this;
        }

        public Builder addAndroidMemoryReadings(AndroidMemoryReading androidMemoryReading) {
            copyOnWrite();
            ((GaugeMetric) this.instance).addAndroidMemoryReadings(androidMemoryReading);
            return this;
        }

        public Builder addCpuMetricReadings(CpuMetricReading cpuMetricReading) {
            copyOnWrite();
            ((GaugeMetric) this.instance).addCpuMetricReadings(cpuMetricReading);
            return this;
        }

        public Builder clearAndroidMemoryReadings() {
            copyOnWrite();
            ((GaugeMetric) this.instance).clearAndroidMemoryReadings();
            return this;
        }

        public Builder clearCpuMetricReadings() {
            copyOnWrite();
            ((GaugeMetric) this.instance).clearCpuMetricReadings();
            return this;
        }

        public Builder clearGaugeMetadata() {
            copyOnWrite();
            ((GaugeMetric) this.instance).clearGaugeMetadata();
            return this;
        }

        public Builder clearSessionId() {
            copyOnWrite();
            ((GaugeMetric) this.instance).clearSessionId();
            return this;
        }

        @Override // com.google.firebase.perf.v1.GaugeMetricOrBuilder
        public AndroidMemoryReading getAndroidMemoryReadings(int i) {
            return ((GaugeMetric) this.instance).getAndroidMemoryReadings(i);
        }

        @Override // com.google.firebase.perf.v1.GaugeMetricOrBuilder
        public int getAndroidMemoryReadingsCount() {
            return ((GaugeMetric) this.instance).getAndroidMemoryReadingsCount();
        }

        @Override // com.google.firebase.perf.v1.GaugeMetricOrBuilder
        public List<AndroidMemoryReading> getAndroidMemoryReadingsList() {
            return Collections.unmodifiableList(((GaugeMetric) this.instance).getAndroidMemoryReadingsList());
        }

        @Override // com.google.firebase.perf.v1.GaugeMetricOrBuilder
        public CpuMetricReading getCpuMetricReadings(int i) {
            return ((GaugeMetric) this.instance).getCpuMetricReadings(i);
        }

        @Override // com.google.firebase.perf.v1.GaugeMetricOrBuilder
        public int getCpuMetricReadingsCount() {
            return ((GaugeMetric) this.instance).getCpuMetricReadingsCount();
        }

        @Override // com.google.firebase.perf.v1.GaugeMetricOrBuilder
        public List<CpuMetricReading> getCpuMetricReadingsList() {
            return Collections.unmodifiableList(((GaugeMetric) this.instance).getCpuMetricReadingsList());
        }

        @Override // com.google.firebase.perf.v1.GaugeMetricOrBuilder
        public GaugeMetadata getGaugeMetadata() {
            return ((GaugeMetric) this.instance).getGaugeMetadata();
        }

        @Override // com.google.firebase.perf.v1.GaugeMetricOrBuilder
        public String getSessionId() {
            return ((GaugeMetric) this.instance).getSessionId();
        }

        @Override // com.google.firebase.perf.v1.GaugeMetricOrBuilder
        public xq1 getSessionIdBytes() {
            return ((GaugeMetric) this.instance).getSessionIdBytes();
        }

        @Override // com.google.firebase.perf.v1.GaugeMetricOrBuilder
        public boolean hasGaugeMetadata() {
            return ((GaugeMetric) this.instance).hasGaugeMetadata();
        }

        @Override // com.google.firebase.perf.v1.GaugeMetricOrBuilder
        public boolean hasSessionId() {
            return ((GaugeMetric) this.instance).hasSessionId();
        }

        public Builder mergeGaugeMetadata(GaugeMetadata gaugeMetadata) {
            copyOnWrite();
            ((GaugeMetric) this.instance).mergeGaugeMetadata(gaugeMetadata);
            return this;
        }

        public Builder removeAndroidMemoryReadings(int i) {
            copyOnWrite();
            ((GaugeMetric) this.instance).removeAndroidMemoryReadings(i);
            return this;
        }

        public Builder removeCpuMetricReadings(int i) {
            copyOnWrite();
            ((GaugeMetric) this.instance).removeCpuMetricReadings(i);
            return this;
        }

        public Builder setAndroidMemoryReadings(int i, AndroidMemoryReading androidMemoryReading) {
            copyOnWrite();
            ((GaugeMetric) this.instance).setAndroidMemoryReadings(i, androidMemoryReading);
            return this;
        }

        public Builder setCpuMetricReadings(int i, CpuMetricReading cpuMetricReading) {
            copyOnWrite();
            ((GaugeMetric) this.instance).setCpuMetricReadings(i, cpuMetricReading);
            return this;
        }

        public Builder setGaugeMetadata(GaugeMetadata gaugeMetadata) {
            copyOnWrite();
            ((GaugeMetric) this.instance).setGaugeMetadata(gaugeMetadata);
            return this;
        }

        public Builder setSessionId(String str) {
            copyOnWrite();
            ((GaugeMetric) this.instance).setSessionId(str);
            return this;
        }

        public Builder setSessionIdBytes(xq1 xq1Var) {
            copyOnWrite();
            ((GaugeMetric) this.instance).setSessionIdBytes(xq1Var);
            return this;
        }

        private Builder() {
            super(GaugeMetric.DEFAULT_INSTANCE);
        }

        public Builder addAndroidMemoryReadings(int i, AndroidMemoryReading androidMemoryReading) {
            copyOnWrite();
            ((GaugeMetric) this.instance).addAndroidMemoryReadings(i, androidMemoryReading);
            return this;
        }

        public Builder addCpuMetricReadings(int i, CpuMetricReading cpuMetricReading) {
            copyOnWrite();
            ((GaugeMetric) this.instance).addCpuMetricReadings(i, cpuMetricReading);
            return this;
        }

        public Builder setAndroidMemoryReadings(int i, AndroidMemoryReading.Builder builder) {
            copyOnWrite();
            ((GaugeMetric) this.instance).setAndroidMemoryReadings(i, (AndroidMemoryReading) builder.build());
            return this;
        }

        public Builder setCpuMetricReadings(int i, CpuMetricReading.Builder builder) {
            copyOnWrite();
            ((GaugeMetric) this.instance).setCpuMetricReadings(i, (CpuMetricReading) builder.build());
            return this;
        }

        public Builder setGaugeMetadata(GaugeMetadata.Builder builder) {
            copyOnWrite();
            ((GaugeMetric) this.instance).setGaugeMetadata((GaugeMetadata) builder.build());
            return this;
        }

        public Builder addAndroidMemoryReadings(AndroidMemoryReading.Builder builder) {
            copyOnWrite();
            ((GaugeMetric) this.instance).addAndroidMemoryReadings((AndroidMemoryReading) builder.build());
            return this;
        }

        public Builder addCpuMetricReadings(CpuMetricReading.Builder builder) {
            copyOnWrite();
            ((GaugeMetric) this.instance).addCpuMetricReadings((CpuMetricReading) builder.build());
            return this;
        }

        public Builder addAndroidMemoryReadings(int i, AndroidMemoryReading.Builder builder) {
            copyOnWrite();
            ((GaugeMetric) this.instance).addAndroidMemoryReadings(i, (AndroidMemoryReading) builder.build());
            return this;
        }

        public Builder addCpuMetricReadings(int i, CpuMetricReading.Builder builder) {
            copyOnWrite();
            ((GaugeMetric) this.instance).addCpuMetricReadings(i, (CpuMetricReading) builder.build());
            return this;
        }
    }

    static {
        GaugeMetric gaugeMetric = new GaugeMetric();
        DEFAULT_INSTANCE = gaugeMetric;
        wn7.registerDefaultInstance(GaugeMetric.class, gaugeMetric);
    }

    private GaugeMetric() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAndroidMemoryReadings(Iterable<? extends AndroidMemoryReading> iterable) {
        ensureAndroidMemoryReadingsIsMutable();
        r8.addAll((Iterable) iterable, (List) this.androidMemoryReadings_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCpuMetricReadings(Iterable<? extends CpuMetricReading> iterable) {
        ensureCpuMetricReadingsIsMutable();
        r8.addAll((Iterable) iterable, (List) this.cpuMetricReadings_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAndroidMemoryReadings(AndroidMemoryReading androidMemoryReading) {
        androidMemoryReading.getClass();
        ensureAndroidMemoryReadingsIsMutable();
        this.androidMemoryReadings_.add(androidMemoryReading);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCpuMetricReadings(CpuMetricReading cpuMetricReading) {
        cpuMetricReading.getClass();
        ensureCpuMetricReadingsIsMutable();
        this.cpuMetricReadings_.add(cpuMetricReading);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAndroidMemoryReadings() {
        this.androidMemoryReadings_ = wn7.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCpuMetricReadings() {
        this.cpuMetricReadings_ = wn7.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGaugeMetadata() {
        this.gaugeMetadata_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionId() {
        this.bitField0_ &= -2;
        this.sessionId_ = getDefaultInstance().getSessionId();
    }

    private void ensureAndroidMemoryReadingsIsMutable() {
        yn8.InterfaceC18446j interfaceC18446j = this.androidMemoryReadings_;
        if (interfaceC18446j.mo28212k()) {
            return;
        }
        this.androidMemoryReadings_ = wn7.mutableCopy(interfaceC18446j);
    }

    private void ensureCpuMetricReadingsIsMutable() {
        yn8.InterfaceC18446j interfaceC18446j = this.cpuMetricReadings_;
        if (interfaceC18446j.mo28212k()) {
            return;
        }
        this.cpuMetricReadings_ = wn7.mutableCopy(interfaceC18446j);
    }

    public static GaugeMetric getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGaugeMetadata(GaugeMetadata gaugeMetadata) {
        gaugeMetadata.getClass();
        GaugeMetadata gaugeMetadata2 = this.gaugeMetadata_;
        if (gaugeMetadata2 == null || gaugeMetadata2 == GaugeMetadata.getDefaultInstance()) {
            this.gaugeMetadata_ = gaugeMetadata;
        } else {
            this.gaugeMetadata_ = (GaugeMetadata) ((GaugeMetadata.Builder) GaugeMetadata.newBuilder(this.gaugeMetadata_).mergeFrom((wn7) gaugeMetadata)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static GaugeMetric parseDelimitedFrom(InputStream inputStream) {
        return (GaugeMetric) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GaugeMetric parseFrom(ByteBuffer byteBuffer) {
        return (GaugeMetric) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hxc parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAndroidMemoryReadings(int i) {
        ensureAndroidMemoryReadingsIsMutable();
        this.androidMemoryReadings_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeCpuMetricReadings(int i) {
        ensureCpuMetricReadingsIsMutable();
        this.cpuMetricReadings_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAndroidMemoryReadings(int i, AndroidMemoryReading androidMemoryReading) {
        androidMemoryReading.getClass();
        ensureAndroidMemoryReadingsIsMutable();
        this.androidMemoryReadings_.set(i, androidMemoryReading);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCpuMetricReadings(int i, CpuMetricReading cpuMetricReading) {
        cpuMetricReading.getClass();
        ensureCpuMetricReadingsIsMutable();
        this.cpuMetricReadings_.set(i, cpuMetricReading);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGaugeMetadata(GaugeMetadata gaugeMetadata) {
        gaugeMetadata.getClass();
        this.gaugeMetadata_ = gaugeMetadata;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionId(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionIdBytes(xq1 xq1Var) {
        this.sessionId_ = xq1Var.m56593N();
        this.bitField0_ |= 1;
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C114541 c114541 = null;
        switch (C114541.f13435xa1df5c61[enumC17940g.ordinal()]) {
            case 1:
                return new GaugeMetric();
            case 2:
                return new Builder(c114541);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b", new Object[]{"bitField0_", "sessionId_", "cpuMetricReadings_", CpuMetricReading.class, "gaugeMetadata_", "androidMemoryReadings_", AndroidMemoryReading.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (GaugeMetric.class) {
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

    @Override // com.google.firebase.perf.v1.GaugeMetricOrBuilder
    public AndroidMemoryReading getAndroidMemoryReadings(int i) {
        return (AndroidMemoryReading) this.androidMemoryReadings_.get(i);
    }

    @Override // com.google.firebase.perf.v1.GaugeMetricOrBuilder
    public int getAndroidMemoryReadingsCount() {
        return this.androidMemoryReadings_.size();
    }

    @Override // com.google.firebase.perf.v1.GaugeMetricOrBuilder
    public List<AndroidMemoryReading> getAndroidMemoryReadingsList() {
        return this.androidMemoryReadings_;
    }

    public AndroidMemoryReadingOrBuilder getAndroidMemoryReadingsOrBuilder(int i) {
        return (AndroidMemoryReadingOrBuilder) this.androidMemoryReadings_.get(i);
    }

    public List<? extends AndroidMemoryReadingOrBuilder> getAndroidMemoryReadingsOrBuilderList() {
        return this.androidMemoryReadings_;
    }

    @Override // com.google.firebase.perf.v1.GaugeMetricOrBuilder
    public CpuMetricReading getCpuMetricReadings(int i) {
        return (CpuMetricReading) this.cpuMetricReadings_.get(i);
    }

    @Override // com.google.firebase.perf.v1.GaugeMetricOrBuilder
    public int getCpuMetricReadingsCount() {
        return this.cpuMetricReadings_.size();
    }

    @Override // com.google.firebase.perf.v1.GaugeMetricOrBuilder
    public List<CpuMetricReading> getCpuMetricReadingsList() {
        return this.cpuMetricReadings_;
    }

    public CpuMetricReadingOrBuilder getCpuMetricReadingsOrBuilder(int i) {
        return (CpuMetricReadingOrBuilder) this.cpuMetricReadings_.get(i);
    }

    public List<? extends CpuMetricReadingOrBuilder> getCpuMetricReadingsOrBuilderList() {
        return this.cpuMetricReadings_;
    }

    @Override // com.google.firebase.perf.v1.GaugeMetricOrBuilder
    public GaugeMetadata getGaugeMetadata() {
        GaugeMetadata gaugeMetadata = this.gaugeMetadata_;
        return gaugeMetadata == null ? GaugeMetadata.getDefaultInstance() : gaugeMetadata;
    }

    @Override // com.google.firebase.perf.v1.GaugeMetricOrBuilder
    public String getSessionId() {
        return this.sessionId_;
    }

    @Override // com.google.firebase.perf.v1.GaugeMetricOrBuilder
    public xq1 getSessionIdBytes() {
        return xq1.m56589q(this.sessionId_);
    }

    @Override // com.google.firebase.perf.v1.GaugeMetricOrBuilder
    public boolean hasGaugeMetadata() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.firebase.perf.v1.GaugeMetricOrBuilder
    public boolean hasSessionId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(GaugeMetric gaugeMetric) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(gaugeMetric);
    }

    public static GaugeMetric parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
        return (GaugeMetric) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static GaugeMetric parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
        return (GaugeMetric) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
    }

    public static GaugeMetric parseFrom(xq1 xq1Var) {
        return (GaugeMetric) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAndroidMemoryReadings(int i, AndroidMemoryReading androidMemoryReading) {
        androidMemoryReading.getClass();
        ensureAndroidMemoryReadingsIsMutable();
        this.androidMemoryReadings_.add(i, androidMemoryReading);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCpuMetricReadings(int i, CpuMetricReading cpuMetricReading) {
        cpuMetricReading.getClass();
        ensureCpuMetricReadingsIsMutable();
        this.cpuMetricReadings_.add(i, cpuMetricReading);
    }

    public static GaugeMetric parseFrom(xq1 xq1Var, qp6 qp6Var) {
        return (GaugeMetric) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
    }

    public static GaugeMetric parseFrom(byte[] bArr) {
        return (GaugeMetric) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GaugeMetric parseFrom(byte[] bArr, qp6 qp6Var) {
        return (GaugeMetric) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
    }

    public static GaugeMetric parseFrom(InputStream inputStream) {
        return (GaugeMetric) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GaugeMetric parseFrom(InputStream inputStream, qp6 qp6Var) {
        return (GaugeMetric) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static GaugeMetric parseFrom(jf3 jf3Var) {
        return (GaugeMetric) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
    }

    public static GaugeMetric parseFrom(jf3 jf3Var, qp6 qp6Var) {
        return (GaugeMetric) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
    }
}
