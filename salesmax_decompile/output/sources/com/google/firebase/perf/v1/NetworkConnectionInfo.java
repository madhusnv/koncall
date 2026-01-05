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
public final class NetworkConnectionInfo extends wn7 implements NetworkConnectionInfoOrBuilder {
    private static final NetworkConnectionInfo DEFAULT_INSTANCE;
    public static final int MOBILE_SUBTYPE_FIELD_NUMBER = 2;
    public static final int NETWORK_TYPE_FIELD_NUMBER = 1;
    private static volatile hxc PARSER;
    private int bitField0_;
    private int mobileSubtype_;
    private int networkType_ = -1;

    /* renamed from: com.google.firebase.perf.v1.NetworkConnectionInfo$1 */
    public static /* synthetic */ class C114551 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f13436xa1df5c61;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f13436xa1df5c61 = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13436xa1df5c61[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13436xa1df5c61[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13436xa1df5c61[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13436xa1df5c61[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13436xa1df5c61[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13436xa1df5c61[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends wn7.AbstractC17934a implements NetworkConnectionInfoOrBuilder {
        public /* synthetic */ Builder(C114551 c114551) {
            this();
        }

        public Builder clearMobileSubtype() {
            copyOnWrite();
            ((NetworkConnectionInfo) this.instance).clearMobileSubtype();
            return this;
        }

        public Builder clearNetworkType() {
            copyOnWrite();
            ((NetworkConnectionInfo) this.instance).clearNetworkType();
            return this;
        }

        @Override // com.google.firebase.perf.v1.NetworkConnectionInfoOrBuilder
        public MobileSubtype getMobileSubtype() {
            return ((NetworkConnectionInfo) this.instance).getMobileSubtype();
        }

        @Override // com.google.firebase.perf.v1.NetworkConnectionInfoOrBuilder
        public NetworkType getNetworkType() {
            return ((NetworkConnectionInfo) this.instance).getNetworkType();
        }

        @Override // com.google.firebase.perf.v1.NetworkConnectionInfoOrBuilder
        public boolean hasMobileSubtype() {
            return ((NetworkConnectionInfo) this.instance).hasMobileSubtype();
        }

        @Override // com.google.firebase.perf.v1.NetworkConnectionInfoOrBuilder
        public boolean hasNetworkType() {
            return ((NetworkConnectionInfo) this.instance).hasNetworkType();
        }

        public Builder setMobileSubtype(MobileSubtype mobileSubtype) {
            copyOnWrite();
            ((NetworkConnectionInfo) this.instance).setMobileSubtype(mobileSubtype);
            return this;
        }

        public Builder setNetworkType(NetworkType networkType) {
            copyOnWrite();
            ((NetworkConnectionInfo) this.instance).setNetworkType(networkType);
            return this;
        }

        private Builder() {
            super(NetworkConnectionInfo.DEFAULT_INSTANCE);
        }
    }

    public enum MobileSubtype implements yn8.InterfaceC18439c {
        UNKNOWN_MOBILE_SUBTYPE(0),
        GPRS(1),
        EDGE(2),
        UMTS(3),
        CDMA(4),
        EVDO_0(5),
        EVDO_A(6),
        RTT(7),
        HSDPA(8),
        HSUPA(9),
        HSPA(10),
        IDEN(11),
        EVDO_B(12),
        LTE(13),
        EHRPD(14),
        HSPAP(15),
        GSM(16),
        TD_SCDMA(17),
        IWLAN(18),
        LTE_CA(19),
        COMBINED(100);

        public static final int CDMA_VALUE = 4;
        public static final int COMBINED_VALUE = 100;
        public static final int EDGE_VALUE = 2;
        public static final int EHRPD_VALUE = 14;
        public static final int EVDO_0_VALUE = 5;
        public static final int EVDO_A_VALUE = 6;
        public static final int EVDO_B_VALUE = 12;
        public static final int GPRS_VALUE = 1;
        public static final int GSM_VALUE = 16;
        public static final int HSDPA_VALUE = 8;
        public static final int HSPAP_VALUE = 15;
        public static final int HSPA_VALUE = 10;
        public static final int HSUPA_VALUE = 9;
        public static final int IDEN_VALUE = 11;
        public static final int IWLAN_VALUE = 18;
        public static final int LTE_CA_VALUE = 19;
        public static final int LTE_VALUE = 13;
        public static final int RTT_VALUE = 7;
        public static final int TD_SCDMA_VALUE = 17;
        public static final int UMTS_VALUE = 3;
        public static final int UNKNOWN_MOBILE_SUBTYPE_VALUE = 0;
        private static final yn8.InterfaceC18440d internalValueMap = new yn8.InterfaceC18440d() { // from class: com.google.firebase.perf.v1.NetworkConnectionInfo.MobileSubtype.1
            @Override // p001o.yn8.InterfaceC18440d
            public MobileSubtype findValueByNumber(int i) {
                return MobileSubtype.forNumber(i);
            }
        };
        private final int value;

        public static final class MobileSubtypeVerifier implements yn8.InterfaceC18441e {
            static final yn8.InterfaceC18441e INSTANCE = new MobileSubtypeVerifier();

            private MobileSubtypeVerifier() {
            }

            @Override // p001o.yn8.InterfaceC18441e
            public boolean isInRange(int i) {
                return MobileSubtype.forNumber(i) != null;
            }
        }

        MobileSubtype(int i) {
            this.value = i;
        }

        public static MobileSubtype forNumber(int i) {
            if (i == 100) {
                return COMBINED;
            }
            switch (i) {
                case 0:
                    return UNKNOWN_MOBILE_SUBTYPE;
                case 1:
                    return GPRS;
                case 2:
                    return EDGE;
                case 3:
                    return UMTS;
                case 4:
                    return CDMA;
                case 5:
                    return EVDO_0;
                case 6:
                    return EVDO_A;
                case 7:
                    return RTT;
                case 8:
                    return HSDPA;
                case 9:
                    return HSUPA;
                case 10:
                    return HSPA;
                case 11:
                    return IDEN;
                case 12:
                    return EVDO_B;
                case 13:
                    return LTE;
                case 14:
                    return EHRPD;
                case 15:
                    return HSPAP;
                case 16:
                    return GSM;
                case 17:
                    return TD_SCDMA;
                case 18:
                    return IWLAN;
                case 19:
                    return LTE_CA;
                default:
                    return null;
            }
        }

        public static yn8.InterfaceC18440d internalGetValueMap() {
            return internalValueMap;
        }

        public static yn8.InterfaceC18441e internalGetVerifier() {
            return MobileSubtypeVerifier.INSTANCE;
        }

        @Override // p001o.yn8.InterfaceC18439c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static MobileSubtype valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum NetworkType implements yn8.InterfaceC18439c {
        NONE(-1),
        MOBILE(0),
        WIFI(1),
        MOBILE_MMS(2),
        MOBILE_SUPL(3),
        MOBILE_DUN(4),
        MOBILE_HIPRI(5),
        WIMAX(6),
        BLUETOOTH(7),
        DUMMY(8),
        ETHERNET(9),
        MOBILE_FOTA(10),
        MOBILE_IMS(11),
        MOBILE_CBS(12),
        WIFI_P2P(13),
        MOBILE_IA(14),
        MOBILE_EMERGENCY(15),
        PROXY(16),
        VPN(17);

        public static final int BLUETOOTH_VALUE = 7;
        public static final int DUMMY_VALUE = 8;
        public static final int ETHERNET_VALUE = 9;
        public static final int MOBILE_CBS_VALUE = 12;
        public static final int MOBILE_DUN_VALUE = 4;
        public static final int MOBILE_EMERGENCY_VALUE = 15;
        public static final int MOBILE_FOTA_VALUE = 10;
        public static final int MOBILE_HIPRI_VALUE = 5;
        public static final int MOBILE_IA_VALUE = 14;
        public static final int MOBILE_IMS_VALUE = 11;
        public static final int MOBILE_MMS_VALUE = 2;
        public static final int MOBILE_SUPL_VALUE = 3;
        public static final int MOBILE_VALUE = 0;
        public static final int NONE_VALUE = -1;
        public static final int PROXY_VALUE = 16;
        public static final int VPN_VALUE = 17;
        public static final int WIFI_P2P_VALUE = 13;
        public static final int WIFI_VALUE = 1;
        public static final int WIMAX_VALUE = 6;
        private static final yn8.InterfaceC18440d internalValueMap = new yn8.InterfaceC18440d() { // from class: com.google.firebase.perf.v1.NetworkConnectionInfo.NetworkType.1
            @Override // p001o.yn8.InterfaceC18440d
            public NetworkType findValueByNumber(int i) {
                return NetworkType.forNumber(i);
            }
        };
        private final int value;

        public static final class NetworkTypeVerifier implements yn8.InterfaceC18441e {
            static final yn8.InterfaceC18441e INSTANCE = new NetworkTypeVerifier();

            private NetworkTypeVerifier() {
            }

            @Override // p001o.yn8.InterfaceC18441e
            public boolean isInRange(int i) {
                return NetworkType.forNumber(i) != null;
            }
        }

        NetworkType(int i) {
            this.value = i;
        }

        public static NetworkType forNumber(int i) {
            switch (i) {
                case -1:
                    return NONE;
                case 0:
                    return MOBILE;
                case 1:
                    return WIFI;
                case 2:
                    return MOBILE_MMS;
                case 3:
                    return MOBILE_SUPL;
                case 4:
                    return MOBILE_DUN;
                case 5:
                    return MOBILE_HIPRI;
                case 6:
                    return WIMAX;
                case 7:
                    return BLUETOOTH;
                case 8:
                    return DUMMY;
                case 9:
                    return ETHERNET;
                case 10:
                    return MOBILE_FOTA;
                case 11:
                    return MOBILE_IMS;
                case 12:
                    return MOBILE_CBS;
                case 13:
                    return WIFI_P2P;
                case 14:
                    return MOBILE_IA;
                case 15:
                    return MOBILE_EMERGENCY;
                case 16:
                    return PROXY;
                case 17:
                    return VPN;
                default:
                    return null;
            }
        }

        public static yn8.InterfaceC18440d internalGetValueMap() {
            return internalValueMap;
        }

        public static yn8.InterfaceC18441e internalGetVerifier() {
            return NetworkTypeVerifier.INSTANCE;
        }

        @Override // p001o.yn8.InterfaceC18439c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static NetworkType valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        NetworkConnectionInfo networkConnectionInfo = new NetworkConnectionInfo();
        DEFAULT_INSTANCE = networkConnectionInfo;
        wn7.registerDefaultInstance(NetworkConnectionInfo.class, networkConnectionInfo);
    }

    private NetworkConnectionInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMobileSubtype() {
        this.bitField0_ &= -3;
        this.mobileSubtype_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNetworkType() {
        this.bitField0_ &= -2;
        this.networkType_ = -1;
    }

    public static NetworkConnectionInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static NetworkConnectionInfo parseDelimitedFrom(InputStream inputStream) {
        return (NetworkConnectionInfo) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NetworkConnectionInfo parseFrom(ByteBuffer byteBuffer) {
        return (NetworkConnectionInfo) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hxc parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMobileSubtype(MobileSubtype mobileSubtype) {
        this.mobileSubtype_ = mobileSubtype.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetworkType(NetworkType networkType) {
        this.networkType_ = networkType.getNumber();
        this.bitField0_ |= 1;
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C114551 c114551 = null;
        switch (C114551.f13436xa1df5c61[enumC17940g.ordinal()]) {
            case 1:
                return new NetworkConnectionInfo();
            case 2:
                return new Builder(c114551);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"bitField0_", "networkType_", NetworkType.internalGetVerifier(), "mobileSubtype_", MobileSubtype.internalGetVerifier()});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (NetworkConnectionInfo.class) {
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

    @Override // com.google.firebase.perf.v1.NetworkConnectionInfoOrBuilder
    public MobileSubtype getMobileSubtype() {
        MobileSubtype mobileSubtypeForNumber = MobileSubtype.forNumber(this.mobileSubtype_);
        return mobileSubtypeForNumber == null ? MobileSubtype.UNKNOWN_MOBILE_SUBTYPE : mobileSubtypeForNumber;
    }

    @Override // com.google.firebase.perf.v1.NetworkConnectionInfoOrBuilder
    public NetworkType getNetworkType() {
        NetworkType networkTypeForNumber = NetworkType.forNumber(this.networkType_);
        return networkTypeForNumber == null ? NetworkType.NONE : networkTypeForNumber;
    }

    @Override // com.google.firebase.perf.v1.NetworkConnectionInfoOrBuilder
    public boolean hasMobileSubtype() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.firebase.perf.v1.NetworkConnectionInfoOrBuilder
    public boolean hasNetworkType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(NetworkConnectionInfo networkConnectionInfo) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(networkConnectionInfo);
    }

    public static NetworkConnectionInfo parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
        return (NetworkConnectionInfo) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static NetworkConnectionInfo parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
        return (NetworkConnectionInfo) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
    }

    public static NetworkConnectionInfo parseFrom(xq1 xq1Var) {
        return (NetworkConnectionInfo) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
    }

    public static NetworkConnectionInfo parseFrom(xq1 xq1Var, qp6 qp6Var) {
        return (NetworkConnectionInfo) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
    }

    public static NetworkConnectionInfo parseFrom(byte[] bArr) {
        return (NetworkConnectionInfo) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NetworkConnectionInfo parseFrom(byte[] bArr, qp6 qp6Var) {
        return (NetworkConnectionInfo) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
    }

    public static NetworkConnectionInfo parseFrom(InputStream inputStream) {
        return (NetworkConnectionInfo) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NetworkConnectionInfo parseFrom(InputStream inputStream, qp6 qp6Var) {
        return (NetworkConnectionInfo) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static NetworkConnectionInfo parseFrom(jf3 jf3Var) {
        return (NetworkConnectionInfo) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
    }

    public static NetworkConnectionInfo parseFrom(jf3 jf3Var, qp6 qp6Var) {
        return (NetworkConnectionInfo) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
    }
}
