package com.google.firebase.perf.v1;

import java.io.InputStream;
import java.nio.ByteBuffer;
import p001o.hxc;
import p001o.jf3;
import p001o.qp6;
import p001o.wn7;
import p001o.xq1;

/* loaded from: classes6.dex */
public final class GaugeMetadata extends wn7 implements GaugeMetadataOrBuilder {
    public static final int CPU_CLOCK_RATE_KHZ_FIELD_NUMBER = 2;
    public static final int CPU_PROCESSOR_COUNT_FIELD_NUMBER = 6;
    private static final GaugeMetadata DEFAULT_INSTANCE;
    public static final int DEVICE_RAM_SIZE_KB_FIELD_NUMBER = 3;
    public static final int MAX_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 4;
    public static final int MAX_ENCOURAGED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 5;
    private static volatile hxc PARSER = null;
    public static final int PROCESS_NAME_FIELD_NUMBER = 1;
    private int bitField0_;
    private int cpuClockRateKhz_;
    private int cpuProcessorCount_;
    private int deviceRamSizeKb_;
    private int maxAppJavaHeapMemoryKb_;
    private int maxEncouragedAppJavaHeapMemoryKb_;
    private String processName_ = "";

    /* renamed from: com.google.firebase.perf.v1.GaugeMetadata$1 */
    public static /* synthetic */ class C114531 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f13434xa1df5c61;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f13434xa1df5c61 = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13434xa1df5c61[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13434xa1df5c61[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13434xa1df5c61[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13434xa1df5c61[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13434xa1df5c61[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13434xa1df5c61[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends wn7.AbstractC17934a implements GaugeMetadataOrBuilder {
        public /* synthetic */ Builder(C114531 c114531) {
            this();
        }

        public Builder clearCpuClockRateKhz() {
            copyOnWrite();
            ((GaugeMetadata) this.instance).clearCpuClockRateKhz();
            return this;
        }

        public Builder clearCpuProcessorCount() {
            copyOnWrite();
            ((GaugeMetadata) this.instance).clearCpuProcessorCount();
            return this;
        }

        public Builder clearDeviceRamSizeKb() {
            copyOnWrite();
            ((GaugeMetadata) this.instance).clearDeviceRamSizeKb();
            return this;
        }

        public Builder clearMaxAppJavaHeapMemoryKb() {
            copyOnWrite();
            ((GaugeMetadata) this.instance).clearMaxAppJavaHeapMemoryKb();
            return this;
        }

        public Builder clearMaxEncouragedAppJavaHeapMemoryKb() {
            copyOnWrite();
            ((GaugeMetadata) this.instance).clearMaxEncouragedAppJavaHeapMemoryKb();
            return this;
        }

        @Deprecated
        public Builder clearProcessName() {
            copyOnWrite();
            ((GaugeMetadata) this.instance).clearProcessName();
            return this;
        }

        @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
        public int getCpuClockRateKhz() {
            return ((GaugeMetadata) this.instance).getCpuClockRateKhz();
        }

        @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
        public int getCpuProcessorCount() {
            return ((GaugeMetadata) this.instance).getCpuProcessorCount();
        }

        @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
        public int getDeviceRamSizeKb() {
            return ((GaugeMetadata) this.instance).getDeviceRamSizeKb();
        }

        @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
        public int getMaxAppJavaHeapMemoryKb() {
            return ((GaugeMetadata) this.instance).getMaxAppJavaHeapMemoryKb();
        }

        @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
        public int getMaxEncouragedAppJavaHeapMemoryKb() {
            return ((GaugeMetadata) this.instance).getMaxEncouragedAppJavaHeapMemoryKb();
        }

        @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
        @Deprecated
        public String getProcessName() {
            return ((GaugeMetadata) this.instance).getProcessName();
        }

        @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
        @Deprecated
        public xq1 getProcessNameBytes() {
            return ((GaugeMetadata) this.instance).getProcessNameBytes();
        }

        @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
        public boolean hasCpuClockRateKhz() {
            return ((GaugeMetadata) this.instance).hasCpuClockRateKhz();
        }

        @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
        public boolean hasCpuProcessorCount() {
            return ((GaugeMetadata) this.instance).hasCpuProcessorCount();
        }

        @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
        public boolean hasDeviceRamSizeKb() {
            return ((GaugeMetadata) this.instance).hasDeviceRamSizeKb();
        }

        @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
        public boolean hasMaxAppJavaHeapMemoryKb() {
            return ((GaugeMetadata) this.instance).hasMaxAppJavaHeapMemoryKb();
        }

        @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
        public boolean hasMaxEncouragedAppJavaHeapMemoryKb() {
            return ((GaugeMetadata) this.instance).hasMaxEncouragedAppJavaHeapMemoryKb();
        }

        @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
        @Deprecated
        public boolean hasProcessName() {
            return ((GaugeMetadata) this.instance).hasProcessName();
        }

        public Builder setCpuClockRateKhz(int i) {
            copyOnWrite();
            ((GaugeMetadata) this.instance).setCpuClockRateKhz(i);
            return this;
        }

        public Builder setCpuProcessorCount(int i) {
            copyOnWrite();
            ((GaugeMetadata) this.instance).setCpuProcessorCount(i);
            return this;
        }

        public Builder setDeviceRamSizeKb(int i) {
            copyOnWrite();
            ((GaugeMetadata) this.instance).setDeviceRamSizeKb(i);
            return this;
        }

        public Builder setMaxAppJavaHeapMemoryKb(int i) {
            copyOnWrite();
            ((GaugeMetadata) this.instance).setMaxAppJavaHeapMemoryKb(i);
            return this;
        }

        public Builder setMaxEncouragedAppJavaHeapMemoryKb(int i) {
            copyOnWrite();
            ((GaugeMetadata) this.instance).setMaxEncouragedAppJavaHeapMemoryKb(i);
            return this;
        }

        @Deprecated
        public Builder setProcessName(String str) {
            copyOnWrite();
            ((GaugeMetadata) this.instance).setProcessName(str);
            return this;
        }

        @Deprecated
        public Builder setProcessNameBytes(xq1 xq1Var) {
            copyOnWrite();
            ((GaugeMetadata) this.instance).setProcessNameBytes(xq1Var);
            return this;
        }

        private Builder() {
            super(GaugeMetadata.DEFAULT_INSTANCE);
        }
    }

    static {
        GaugeMetadata gaugeMetadata = new GaugeMetadata();
        DEFAULT_INSTANCE = gaugeMetadata;
        wn7.registerDefaultInstance(GaugeMetadata.class, gaugeMetadata);
    }

    private GaugeMetadata() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCpuClockRateKhz() {
        this.bitField0_ &= -3;
        this.cpuClockRateKhz_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCpuProcessorCount() {
        this.bitField0_ &= -5;
        this.cpuProcessorCount_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceRamSizeKb() {
        this.bitField0_ &= -9;
        this.deviceRamSizeKb_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxAppJavaHeapMemoryKb() {
        this.bitField0_ &= -17;
        this.maxAppJavaHeapMemoryKb_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxEncouragedAppJavaHeapMemoryKb() {
        this.bitField0_ &= -33;
        this.maxEncouragedAppJavaHeapMemoryKb_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProcessName() {
        this.bitField0_ &= -2;
        this.processName_ = getDefaultInstance().getProcessName();
    }

    public static GaugeMetadata getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static GaugeMetadata parseDelimitedFrom(InputStream inputStream) {
        return (GaugeMetadata) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GaugeMetadata parseFrom(ByteBuffer byteBuffer) {
        return (GaugeMetadata) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hxc parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCpuClockRateKhz(int i) {
        this.bitField0_ |= 2;
        this.cpuClockRateKhz_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCpuProcessorCount(int i) {
        this.bitField0_ |= 4;
        this.cpuProcessorCount_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceRamSizeKb(int i) {
        this.bitField0_ |= 8;
        this.deviceRamSizeKb_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxAppJavaHeapMemoryKb(int i) {
        this.bitField0_ |= 16;
        this.maxAppJavaHeapMemoryKb_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxEncouragedAppJavaHeapMemoryKb(int i) {
        this.bitField0_ |= 32;
        this.maxEncouragedAppJavaHeapMemoryKb_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProcessName(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.processName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProcessNameBytes(xq1 xq1Var) {
        this.processName_ = xq1Var.m56593N();
        this.bitField0_ |= 1;
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C114531 c114531 = null;
        switch (C114531.f13434xa1df5c61[enumC17940g.ordinal()]) {
            case 1:
                return new GaugeMetadata();
            case 2:
                return new Builder(c114531);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0003\u0004င\u0004\u0005င\u0005\u0006င\u0002", new Object[]{"bitField0_", "processName_", "cpuClockRateKhz_", "deviceRamSizeKb_", "maxAppJavaHeapMemoryKb_", "maxEncouragedAppJavaHeapMemoryKb_", "cpuProcessorCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (GaugeMetadata.class) {
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

    @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
    public int getCpuClockRateKhz() {
        return this.cpuClockRateKhz_;
    }

    @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
    public int getCpuProcessorCount() {
        return this.cpuProcessorCount_;
    }

    @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
    public int getDeviceRamSizeKb() {
        return this.deviceRamSizeKb_;
    }

    @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
    public int getMaxAppJavaHeapMemoryKb() {
        return this.maxAppJavaHeapMemoryKb_;
    }

    @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
    public int getMaxEncouragedAppJavaHeapMemoryKb() {
        return this.maxEncouragedAppJavaHeapMemoryKb_;
    }

    @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
    @Deprecated
    public String getProcessName() {
        return this.processName_;
    }

    @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
    @Deprecated
    public xq1 getProcessNameBytes() {
        return xq1.m56589q(this.processName_);
    }

    @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
    public boolean hasCpuClockRateKhz() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
    public boolean hasCpuProcessorCount() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
    public boolean hasDeviceRamSizeKb() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
    public boolean hasMaxAppJavaHeapMemoryKb() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
    public boolean hasMaxEncouragedAppJavaHeapMemoryKb() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
    @Deprecated
    public boolean hasProcessName() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(GaugeMetadata gaugeMetadata) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(gaugeMetadata);
    }

    public static GaugeMetadata parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
        return (GaugeMetadata) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static GaugeMetadata parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
        return (GaugeMetadata) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
    }

    public static GaugeMetadata parseFrom(xq1 xq1Var) {
        return (GaugeMetadata) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
    }

    public static GaugeMetadata parseFrom(xq1 xq1Var, qp6 qp6Var) {
        return (GaugeMetadata) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
    }

    public static GaugeMetadata parseFrom(byte[] bArr) {
        return (GaugeMetadata) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GaugeMetadata parseFrom(byte[] bArr, qp6 qp6Var) {
        return (GaugeMetadata) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
    }

    public static GaugeMetadata parseFrom(InputStream inputStream) {
        return (GaugeMetadata) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GaugeMetadata parseFrom(InputStream inputStream, qp6 qp6Var) {
        return (GaugeMetadata) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static GaugeMetadata parseFrom(jf3 jf3Var) {
        return (GaugeMetadata) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
    }

    public static GaugeMetadata parseFrom(jf3 jf3Var, qp6 qp6Var) {
        return (GaugeMetadata) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
    }
}
