package com.google.firebase.perf.v1;

import java.io.InputStream;
import java.nio.ByteBuffer;
import p001o.hxc;
import p001o.jf3;
import p001o.qp6;
import p001o.wn7;
import p001o.xq1;

/* loaded from: classes6.dex */
public final class CpuMetricReading extends wn7 implements CpuMetricReadingOrBuilder {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final CpuMetricReading DEFAULT_INSTANCE;
    private static volatile hxc PARSER = null;
    public static final int SYSTEM_TIME_US_FIELD_NUMBER = 3;
    public static final int USER_TIME_US_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private long systemTimeUs_;
    private long userTimeUs_;

    /* renamed from: com.google.firebase.perf.v1.CpuMetricReading$1 */
    public static /* synthetic */ class C114521 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f13433xa1df5c61;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f13433xa1df5c61 = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13433xa1df5c61[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13433xa1df5c61[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13433xa1df5c61[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13433xa1df5c61[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13433xa1df5c61[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13433xa1df5c61[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends wn7.AbstractC17934a implements CpuMetricReadingOrBuilder {
        public /* synthetic */ Builder(C114521 c114521) {
            this();
        }

        public Builder clearClientTimeUs() {
            copyOnWrite();
            ((CpuMetricReading) this.instance).clearClientTimeUs();
            return this;
        }

        public Builder clearSystemTimeUs() {
            copyOnWrite();
            ((CpuMetricReading) this.instance).clearSystemTimeUs();
            return this;
        }

        public Builder clearUserTimeUs() {
            copyOnWrite();
            ((CpuMetricReading) this.instance).clearUserTimeUs();
            return this;
        }

        @Override // com.google.firebase.perf.v1.CpuMetricReadingOrBuilder
        public long getClientTimeUs() {
            return ((CpuMetricReading) this.instance).getClientTimeUs();
        }

        @Override // com.google.firebase.perf.v1.CpuMetricReadingOrBuilder
        public long getSystemTimeUs() {
            return ((CpuMetricReading) this.instance).getSystemTimeUs();
        }

        @Override // com.google.firebase.perf.v1.CpuMetricReadingOrBuilder
        public long getUserTimeUs() {
            return ((CpuMetricReading) this.instance).getUserTimeUs();
        }

        @Override // com.google.firebase.perf.v1.CpuMetricReadingOrBuilder
        public boolean hasClientTimeUs() {
            return ((CpuMetricReading) this.instance).hasClientTimeUs();
        }

        @Override // com.google.firebase.perf.v1.CpuMetricReadingOrBuilder
        public boolean hasSystemTimeUs() {
            return ((CpuMetricReading) this.instance).hasSystemTimeUs();
        }

        @Override // com.google.firebase.perf.v1.CpuMetricReadingOrBuilder
        public boolean hasUserTimeUs() {
            return ((CpuMetricReading) this.instance).hasUserTimeUs();
        }

        public Builder setClientTimeUs(long j) {
            copyOnWrite();
            ((CpuMetricReading) this.instance).setClientTimeUs(j);
            return this;
        }

        public Builder setSystemTimeUs(long j) {
            copyOnWrite();
            ((CpuMetricReading) this.instance).setSystemTimeUs(j);
            return this;
        }

        public Builder setUserTimeUs(long j) {
            copyOnWrite();
            ((CpuMetricReading) this.instance).setUserTimeUs(j);
            return this;
        }

        private Builder() {
            super(CpuMetricReading.DEFAULT_INSTANCE);
        }
    }

    static {
        CpuMetricReading cpuMetricReading = new CpuMetricReading();
        DEFAULT_INSTANCE = cpuMetricReading;
        wn7.registerDefaultInstance(CpuMetricReading.class, cpuMetricReading);
    }

    private CpuMetricReading() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientTimeUs() {
        this.bitField0_ &= -2;
        this.clientTimeUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSystemTimeUs() {
        this.bitField0_ &= -5;
        this.systemTimeUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserTimeUs() {
        this.bitField0_ &= -3;
        this.userTimeUs_ = 0L;
    }

    public static CpuMetricReading getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static CpuMetricReading parseDelimitedFrom(InputStream inputStream) {
        return (CpuMetricReading) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CpuMetricReading parseFrom(ByteBuffer byteBuffer) {
        return (CpuMetricReading) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hxc parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientTimeUs(long j) {
        this.bitField0_ |= 1;
        this.clientTimeUs_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSystemTimeUs(long j) {
        this.bitField0_ |= 4;
        this.systemTimeUs_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserTimeUs(long j) {
        this.bitField0_ |= 2;
        this.userTimeUs_ = j;
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C114521 c114521 = null;
        switch (C114521.f13433xa1df5c61[enumC17940g.ordinal()]) {
            case 1:
                return new CpuMetricReading();
            case 2:
                return new Builder(c114521);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"bitField0_", "clientTimeUs_", "userTimeUs_", "systemTimeUs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (CpuMetricReading.class) {
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

    @Override // com.google.firebase.perf.v1.CpuMetricReadingOrBuilder
    public long getClientTimeUs() {
        return this.clientTimeUs_;
    }

    @Override // com.google.firebase.perf.v1.CpuMetricReadingOrBuilder
    public long getSystemTimeUs() {
        return this.systemTimeUs_;
    }

    @Override // com.google.firebase.perf.v1.CpuMetricReadingOrBuilder
    public long getUserTimeUs() {
        return this.userTimeUs_;
    }

    @Override // com.google.firebase.perf.v1.CpuMetricReadingOrBuilder
    public boolean hasClientTimeUs() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.firebase.perf.v1.CpuMetricReadingOrBuilder
    public boolean hasSystemTimeUs() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.firebase.perf.v1.CpuMetricReadingOrBuilder
    public boolean hasUserTimeUs() {
        return (this.bitField0_ & 2) != 0;
    }

    public static Builder newBuilder(CpuMetricReading cpuMetricReading) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(cpuMetricReading);
    }

    public static CpuMetricReading parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
        return (CpuMetricReading) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static CpuMetricReading parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
        return (CpuMetricReading) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
    }

    public static CpuMetricReading parseFrom(xq1 xq1Var) {
        return (CpuMetricReading) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
    }

    public static CpuMetricReading parseFrom(xq1 xq1Var, qp6 qp6Var) {
        return (CpuMetricReading) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
    }

    public static CpuMetricReading parseFrom(byte[] bArr) {
        return (CpuMetricReading) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CpuMetricReading parseFrom(byte[] bArr, qp6 qp6Var) {
        return (CpuMetricReading) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
    }

    public static CpuMetricReading parseFrom(InputStream inputStream) {
        return (CpuMetricReading) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CpuMetricReading parseFrom(InputStream inputStream, qp6 qp6Var) {
        return (CpuMetricReading) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static CpuMetricReading parseFrom(jf3 jf3Var) {
        return (CpuMetricReading) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
    }

    public static CpuMetricReading parseFrom(jf3 jf3Var, qp6 qp6Var) {
        return (CpuMetricReading) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
    }
}
