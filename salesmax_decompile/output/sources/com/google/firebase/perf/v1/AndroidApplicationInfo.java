package com.google.firebase.perf.v1;

import java.io.InputStream;
import java.nio.ByteBuffer;
import p001o.hxc;
import p001o.jf3;
import p001o.qp6;
import p001o.wn7;
import p001o.xq1;

/* loaded from: classes6.dex */
public final class AndroidApplicationInfo extends wn7 implements AndroidApplicationInfoOrBuilder {
    private static final AndroidApplicationInfo DEFAULT_INSTANCE;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
    private static volatile hxc PARSER = null;
    public static final int SDK_VERSION_FIELD_NUMBER = 2;
    public static final int VERSION_NAME_FIELD_NUMBER = 3;
    private int bitField0_;
    private String packageName_ = "";
    private String sdkVersion_ = "";
    private String versionName_ = "";

    /* renamed from: com.google.firebase.perf.v1.AndroidApplicationInfo$1 */
    public static /* synthetic */ class C114481 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f13430xa1df5c61;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f13430xa1df5c61 = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13430xa1df5c61[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13430xa1df5c61[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13430xa1df5c61[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13430xa1df5c61[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13430xa1df5c61[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13430xa1df5c61[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends wn7.AbstractC17934a implements AndroidApplicationInfoOrBuilder {
        public /* synthetic */ Builder(C114481 c114481) {
            this();
        }

        public Builder clearPackageName() {
            copyOnWrite();
            ((AndroidApplicationInfo) this.instance).clearPackageName();
            return this;
        }

        public Builder clearSdkVersion() {
            copyOnWrite();
            ((AndroidApplicationInfo) this.instance).clearSdkVersion();
            return this;
        }

        public Builder clearVersionName() {
            copyOnWrite();
            ((AndroidApplicationInfo) this.instance).clearVersionName();
            return this;
        }

        @Override // com.google.firebase.perf.v1.AndroidApplicationInfoOrBuilder
        public String getPackageName() {
            return ((AndroidApplicationInfo) this.instance).getPackageName();
        }

        @Override // com.google.firebase.perf.v1.AndroidApplicationInfoOrBuilder
        public xq1 getPackageNameBytes() {
            return ((AndroidApplicationInfo) this.instance).getPackageNameBytes();
        }

        @Override // com.google.firebase.perf.v1.AndroidApplicationInfoOrBuilder
        public String getSdkVersion() {
            return ((AndroidApplicationInfo) this.instance).getSdkVersion();
        }

        @Override // com.google.firebase.perf.v1.AndroidApplicationInfoOrBuilder
        public xq1 getSdkVersionBytes() {
            return ((AndroidApplicationInfo) this.instance).getSdkVersionBytes();
        }

        @Override // com.google.firebase.perf.v1.AndroidApplicationInfoOrBuilder
        public String getVersionName() {
            return ((AndroidApplicationInfo) this.instance).getVersionName();
        }

        @Override // com.google.firebase.perf.v1.AndroidApplicationInfoOrBuilder
        public xq1 getVersionNameBytes() {
            return ((AndroidApplicationInfo) this.instance).getVersionNameBytes();
        }

        @Override // com.google.firebase.perf.v1.AndroidApplicationInfoOrBuilder
        public boolean hasPackageName() {
            return ((AndroidApplicationInfo) this.instance).hasPackageName();
        }

        @Override // com.google.firebase.perf.v1.AndroidApplicationInfoOrBuilder
        public boolean hasSdkVersion() {
            return ((AndroidApplicationInfo) this.instance).hasSdkVersion();
        }

        @Override // com.google.firebase.perf.v1.AndroidApplicationInfoOrBuilder
        public boolean hasVersionName() {
            return ((AndroidApplicationInfo) this.instance).hasVersionName();
        }

        public Builder setPackageName(String str) {
            copyOnWrite();
            ((AndroidApplicationInfo) this.instance).setPackageName(str);
            return this;
        }

        public Builder setPackageNameBytes(xq1 xq1Var) {
            copyOnWrite();
            ((AndroidApplicationInfo) this.instance).setPackageNameBytes(xq1Var);
            return this;
        }

        public Builder setSdkVersion(String str) {
            copyOnWrite();
            ((AndroidApplicationInfo) this.instance).setSdkVersion(str);
            return this;
        }

        public Builder setSdkVersionBytes(xq1 xq1Var) {
            copyOnWrite();
            ((AndroidApplicationInfo) this.instance).setSdkVersionBytes(xq1Var);
            return this;
        }

        public Builder setVersionName(String str) {
            copyOnWrite();
            ((AndroidApplicationInfo) this.instance).setVersionName(str);
            return this;
        }

        public Builder setVersionNameBytes(xq1 xq1Var) {
            copyOnWrite();
            ((AndroidApplicationInfo) this.instance).setVersionNameBytes(xq1Var);
            return this;
        }

        private Builder() {
            super(AndroidApplicationInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        AndroidApplicationInfo androidApplicationInfo = new AndroidApplicationInfo();
        DEFAULT_INSTANCE = androidApplicationInfo;
        wn7.registerDefaultInstance(AndroidApplicationInfo.class, androidApplicationInfo);
    }

    private AndroidApplicationInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPackageName() {
        this.bitField0_ &= -2;
        this.packageName_ = getDefaultInstance().getPackageName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSdkVersion() {
        this.bitField0_ &= -3;
        this.sdkVersion_ = getDefaultInstance().getSdkVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersionName() {
        this.bitField0_ &= -5;
        this.versionName_ = getDefaultInstance().getVersionName();
    }

    public static AndroidApplicationInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static AndroidApplicationInfo parseDelimitedFrom(InputStream inputStream) {
        return (AndroidApplicationInfo) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AndroidApplicationInfo parseFrom(ByteBuffer byteBuffer) {
        return (AndroidApplicationInfo) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hxc parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPackageName(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.packageName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPackageNameBytes(xq1 xq1Var) {
        this.packageName_ = xq1Var.m56593N();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSdkVersion(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.sdkVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSdkVersionBytes(xq1 xq1Var) {
        this.sdkVersion_ = xq1Var.m56593N();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersionName(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.versionName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersionNameBytes(xq1 xq1Var) {
        this.versionName_ = xq1Var.m56593N();
        this.bitField0_ |= 4;
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C114481 c114481 = null;
        switch (C114481.f13430xa1df5c61[enumC17940g.ordinal()]) {
            case 1:
                return new AndroidApplicationInfo();
            case 2:
                return new Builder(c114481);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "packageName_", "sdkVersion_", "versionName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (AndroidApplicationInfo.class) {
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

    @Override // com.google.firebase.perf.v1.AndroidApplicationInfoOrBuilder
    public String getPackageName() {
        return this.packageName_;
    }

    @Override // com.google.firebase.perf.v1.AndroidApplicationInfoOrBuilder
    public xq1 getPackageNameBytes() {
        return xq1.m56589q(this.packageName_);
    }

    @Override // com.google.firebase.perf.v1.AndroidApplicationInfoOrBuilder
    public String getSdkVersion() {
        return this.sdkVersion_;
    }

    @Override // com.google.firebase.perf.v1.AndroidApplicationInfoOrBuilder
    public xq1 getSdkVersionBytes() {
        return xq1.m56589q(this.sdkVersion_);
    }

    @Override // com.google.firebase.perf.v1.AndroidApplicationInfoOrBuilder
    public String getVersionName() {
        return this.versionName_;
    }

    @Override // com.google.firebase.perf.v1.AndroidApplicationInfoOrBuilder
    public xq1 getVersionNameBytes() {
        return xq1.m56589q(this.versionName_);
    }

    @Override // com.google.firebase.perf.v1.AndroidApplicationInfoOrBuilder
    public boolean hasPackageName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.firebase.perf.v1.AndroidApplicationInfoOrBuilder
    public boolean hasSdkVersion() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.firebase.perf.v1.AndroidApplicationInfoOrBuilder
    public boolean hasVersionName() {
        return (this.bitField0_ & 4) != 0;
    }

    public static Builder newBuilder(AndroidApplicationInfo androidApplicationInfo) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(androidApplicationInfo);
    }

    public static AndroidApplicationInfo parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
        return (AndroidApplicationInfo) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static AndroidApplicationInfo parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
        return (AndroidApplicationInfo) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
    }

    public static AndroidApplicationInfo parseFrom(xq1 xq1Var) {
        return (AndroidApplicationInfo) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
    }

    public static AndroidApplicationInfo parseFrom(xq1 xq1Var, qp6 qp6Var) {
        return (AndroidApplicationInfo) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
    }

    public static AndroidApplicationInfo parseFrom(byte[] bArr) {
        return (AndroidApplicationInfo) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AndroidApplicationInfo parseFrom(byte[] bArr, qp6 qp6Var) {
        return (AndroidApplicationInfo) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
    }

    public static AndroidApplicationInfo parseFrom(InputStream inputStream) {
        return (AndroidApplicationInfo) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AndroidApplicationInfo parseFrom(InputStream inputStream, qp6 qp6Var) {
        return (AndroidApplicationInfo) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static AndroidApplicationInfo parseFrom(jf3 jf3Var) {
        return (AndroidApplicationInfo) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
    }

    public static AndroidApplicationInfo parseFrom(jf3 jf3Var, qp6 qp6Var) {
        return (AndroidApplicationInfo) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
    }
}
