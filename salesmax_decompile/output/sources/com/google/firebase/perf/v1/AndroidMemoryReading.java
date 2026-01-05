package com.google.firebase.perf.v1;

import java.io.InputStream;
import java.nio.ByteBuffer;
import p001o.hxc;
import p001o.jf3;
import p001o.qp6;
import p001o.wn7;
import p001o.xq1;

/* loaded from: classes6.dex */
public final class AndroidMemoryReading extends wn7 implements AndroidMemoryReadingOrBuilder {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final AndroidMemoryReading DEFAULT_INSTANCE;
    private static volatile hxc PARSER = null;
    public static final int USED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private int usedAppJavaHeapMemoryKb_;

    /* renamed from: com.google.firebase.perf.v1.AndroidMemoryReading$1 */
    public static /* synthetic */ class C114491 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f13431xa1df5c61;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f13431xa1df5c61 = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13431xa1df5c61[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13431xa1df5c61[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13431xa1df5c61[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13431xa1df5c61[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13431xa1df5c61[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13431xa1df5c61[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends wn7.AbstractC17934a implements AndroidMemoryReadingOrBuilder {
        public /* synthetic */ Builder(C114491 c114491) {
            this();
        }

        public Builder clearClientTimeUs() {
            copyOnWrite();
            ((AndroidMemoryReading) this.instance).clearClientTimeUs();
            return this;
        }

        public Builder clearUsedAppJavaHeapMemoryKb() {
            copyOnWrite();
            ((AndroidMemoryReading) this.instance).clearUsedAppJavaHeapMemoryKb();
            return this;
        }

        @Override // com.google.firebase.perf.v1.AndroidMemoryReadingOrBuilder
        public long getClientTimeUs() {
            return ((AndroidMemoryReading) this.instance).getClientTimeUs();
        }

        @Override // com.google.firebase.perf.v1.AndroidMemoryReadingOrBuilder
        public int getUsedAppJavaHeapMemoryKb() {
            return ((AndroidMemoryReading) this.instance).getUsedAppJavaHeapMemoryKb();
        }

        @Override // com.google.firebase.perf.v1.AndroidMemoryReadingOrBuilder
        public boolean hasClientTimeUs() {
            return ((AndroidMemoryReading) this.instance).hasClientTimeUs();
        }

        @Override // com.google.firebase.perf.v1.AndroidMemoryReadingOrBuilder
        public boolean hasUsedAppJavaHeapMemoryKb() {
            return ((AndroidMemoryReading) this.instance).hasUsedAppJavaHeapMemoryKb();
        }

        public Builder setClientTimeUs(long j) {
            copyOnWrite();
            ((AndroidMemoryReading) this.instance).setClientTimeUs(j);
            return this;
        }

        public Builder setUsedAppJavaHeapMemoryKb(int i) {
            copyOnWrite();
            ((AndroidMemoryReading) this.instance).setUsedAppJavaHeapMemoryKb(i);
            return this;
        }

        private Builder() {
            super(AndroidMemoryReading.DEFAULT_INSTANCE);
        }
    }

    static {
        AndroidMemoryReading androidMemoryReading = new AndroidMemoryReading();
        DEFAULT_INSTANCE = androidMemoryReading;
        wn7.registerDefaultInstance(AndroidMemoryReading.class, androidMemoryReading);
    }

    private AndroidMemoryReading() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientTimeUs() {
        this.bitField0_ &= -2;
        this.clientTimeUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUsedAppJavaHeapMemoryKb() {
        this.bitField0_ &= -3;
        this.usedAppJavaHeapMemoryKb_ = 0;
    }

    public static AndroidMemoryReading getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static AndroidMemoryReading parseDelimitedFrom(InputStream inputStream) {
        return (AndroidMemoryReading) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AndroidMemoryReading parseFrom(ByteBuffer byteBuffer) {
        return (AndroidMemoryReading) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void setUsedAppJavaHeapMemoryKb(int i) {
        this.bitField0_ |= 2;
        this.usedAppJavaHeapMemoryKb_ = i;
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C114491 c114491 = null;
        switch (C114491.f13431xa1df5c61[enumC17940g.ordinal()]) {
            case 1:
                return new AndroidMemoryReading();
            case 2:
                return new Builder(c114491);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001", new Object[]{"bitField0_", "clientTimeUs_", "usedAppJavaHeapMemoryKb_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (AndroidMemoryReading.class) {
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

    @Override // com.google.firebase.perf.v1.AndroidMemoryReadingOrBuilder
    public long getClientTimeUs() {
        return this.clientTimeUs_;
    }

    @Override // com.google.firebase.perf.v1.AndroidMemoryReadingOrBuilder
    public int getUsedAppJavaHeapMemoryKb() {
        return this.usedAppJavaHeapMemoryKb_;
    }

    @Override // com.google.firebase.perf.v1.AndroidMemoryReadingOrBuilder
    public boolean hasClientTimeUs() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.firebase.perf.v1.AndroidMemoryReadingOrBuilder
    public boolean hasUsedAppJavaHeapMemoryKb() {
        return (this.bitField0_ & 2) != 0;
    }

    public static Builder newBuilder(AndroidMemoryReading androidMemoryReading) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(androidMemoryReading);
    }

    public static AndroidMemoryReading parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
        return (AndroidMemoryReading) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static AndroidMemoryReading parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
        return (AndroidMemoryReading) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
    }

    public static AndroidMemoryReading parseFrom(xq1 xq1Var) {
        return (AndroidMemoryReading) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
    }

    public static AndroidMemoryReading parseFrom(xq1 xq1Var, qp6 qp6Var) {
        return (AndroidMemoryReading) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
    }

    public static AndroidMemoryReading parseFrom(byte[] bArr) {
        return (AndroidMemoryReading) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AndroidMemoryReading parseFrom(byte[] bArr, qp6 qp6Var) {
        return (AndroidMemoryReading) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
    }

    public static AndroidMemoryReading parseFrom(InputStream inputStream) {
        return (AndroidMemoryReading) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AndroidMemoryReading parseFrom(InputStream inputStream, qp6 qp6Var) {
        return (AndroidMemoryReading) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static AndroidMemoryReading parseFrom(jf3 jf3Var) {
        return (AndroidMemoryReading) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
    }

    public static AndroidMemoryReading parseFrom(jf3 jf3Var, qp6 qp6Var) {
        return (AndroidMemoryReading) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
    }
}
