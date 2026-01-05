package com.google.firebase.perf.v1;

import java.io.InputStream;
import java.nio.ByteBuffer;
import p001o.hxc;
import p001o.jf3;
import p001o.qp6;
import p001o.wn7;
import p001o.xq1;
import p001o.yn8;

/* loaded from: classes6.dex */
public final class TransportInfo extends wn7 implements TransportInfoOrBuilder {
    private static final TransportInfo DEFAULT_INSTANCE;
    public static final int DISPATCH_DESTINATION_FIELD_NUMBER = 1;
    private static volatile hxc PARSER;
    private int bitField0_;
    private int dispatchDestination_;

    /* renamed from: com.google.firebase.perf.v1.TransportInfo$1 */
    public static /* synthetic */ class C114661 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f13441xa1df5c61;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f13441xa1df5c61 = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13441xa1df5c61[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13441xa1df5c61[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13441xa1df5c61[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13441xa1df5c61[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13441xa1df5c61[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13441xa1df5c61[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends wn7.AbstractC17934a implements TransportInfoOrBuilder {
        public /* synthetic */ Builder(C114661 c114661) {
            this();
        }

        public Builder clearDispatchDestination() {
            copyOnWrite();
            ((TransportInfo) this.instance).clearDispatchDestination();
            return this;
        }

        @Override // com.google.firebase.perf.v1.TransportInfoOrBuilder
        public DispatchDestination getDispatchDestination() {
            return ((TransportInfo) this.instance).getDispatchDestination();
        }

        @Override // com.google.firebase.perf.v1.TransportInfoOrBuilder
        public boolean hasDispatchDestination() {
            return ((TransportInfo) this.instance).hasDispatchDestination();
        }

        public Builder setDispatchDestination(DispatchDestination dispatchDestination) {
            copyOnWrite();
            ((TransportInfo) this.instance).setDispatchDestination(dispatchDestination);
            return this;
        }

        private Builder() {
            super(TransportInfo.DEFAULT_INSTANCE);
        }
    }

    public enum DispatchDestination implements yn8.InterfaceC18439c {
        SOURCE_UNKNOWN(0),
        FL_LEGACY_V1(1);

        public static final int FL_LEGACY_V1_VALUE = 1;
        public static final int SOURCE_UNKNOWN_VALUE = 0;
        private static final yn8.InterfaceC18440d internalValueMap = new yn8.InterfaceC18440d() { // from class: com.google.firebase.perf.v1.TransportInfo.DispatchDestination.1
            @Override // p001o.yn8.InterfaceC18440d
            public DispatchDestination findValueByNumber(int i) {
                return DispatchDestination.forNumber(i);
            }
        };
        private final int value;

        public static final class DispatchDestinationVerifier implements yn8.InterfaceC18441e {
            static final yn8.InterfaceC18441e INSTANCE = new DispatchDestinationVerifier();

            private DispatchDestinationVerifier() {
            }

            @Override // p001o.yn8.InterfaceC18441e
            public boolean isInRange(int i) {
                return DispatchDestination.forNumber(i) != null;
            }
        }

        DispatchDestination(int i) {
            this.value = i;
        }

        public static DispatchDestination forNumber(int i) {
            if (i == 0) {
                return SOURCE_UNKNOWN;
            }
            if (i != 1) {
                return null;
            }
            return FL_LEGACY_V1;
        }

        public static yn8.InterfaceC18440d internalGetValueMap() {
            return internalValueMap;
        }

        public static yn8.InterfaceC18441e internalGetVerifier() {
            return DispatchDestinationVerifier.INSTANCE;
        }

        @Override // p001o.yn8.InterfaceC18439c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static DispatchDestination valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        TransportInfo transportInfo = new TransportInfo();
        DEFAULT_INSTANCE = transportInfo;
        wn7.registerDefaultInstance(TransportInfo.class, transportInfo);
    }

    private TransportInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDispatchDestination() {
        this.bitField0_ &= -2;
        this.dispatchDestination_ = 0;
    }

    public static TransportInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static TransportInfo parseDelimitedFrom(InputStream inputStream) {
        return (TransportInfo) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TransportInfo parseFrom(ByteBuffer byteBuffer) {
        return (TransportInfo) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hxc parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDispatchDestination(DispatchDestination dispatchDestination) {
        this.dispatchDestination_ = dispatchDestination.getNumber();
        this.bitField0_ |= 1;
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C114661 c114661 = null;
        switch (C114661.f13441xa1df5c61[enumC17940g.ordinal()]) {
            case 1:
                return new TransportInfo();
            case 2:
                return new Builder(c114661);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"bitField0_", "dispatchDestination_", DispatchDestination.internalGetVerifier()});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (TransportInfo.class) {
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

    @Override // com.google.firebase.perf.v1.TransportInfoOrBuilder
    public DispatchDestination getDispatchDestination() {
        DispatchDestination dispatchDestinationForNumber = DispatchDestination.forNumber(this.dispatchDestination_);
        return dispatchDestinationForNumber == null ? DispatchDestination.SOURCE_UNKNOWN : dispatchDestinationForNumber;
    }

    @Override // com.google.firebase.perf.v1.TransportInfoOrBuilder
    public boolean hasDispatchDestination() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(TransportInfo transportInfo) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(transportInfo);
    }

    public static TransportInfo parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
        return (TransportInfo) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static TransportInfo parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
        return (TransportInfo) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
    }

    public static TransportInfo parseFrom(xq1 xq1Var) {
        return (TransportInfo) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
    }

    public static TransportInfo parseFrom(xq1 xq1Var, qp6 qp6Var) {
        return (TransportInfo) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
    }

    public static TransportInfo parseFrom(byte[] bArr) {
        return (TransportInfo) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TransportInfo parseFrom(byte[] bArr, qp6 qp6Var) {
        return (TransportInfo) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
    }

    public static TransportInfo parseFrom(InputStream inputStream) {
        return (TransportInfo) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TransportInfo parseFrom(InputStream inputStream, qp6 qp6Var) {
        return (TransportInfo) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static TransportInfo parseFrom(jf3 jf3Var) {
        return (TransportInfo) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
    }

    public static TransportInfo parseFrom(jf3 jf3Var, qp6 qp6Var) {
        return (TransportInfo) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
    }
}
