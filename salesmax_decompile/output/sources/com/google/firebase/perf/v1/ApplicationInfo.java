package com.google.firebase.perf.v1;

import com.google.firebase.perf.v1.AndroidApplicationInfo;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import p001o.fbj;
import p001o.hxc;
import p001o.jf3;
import p001o.nra;
import p001o.ora;
import p001o.qp6;
import p001o.wn7;
import p001o.xq1;

/* loaded from: classes6.dex */
public final class ApplicationInfo extends wn7 implements ApplicationInfoOrBuilder {
    public static final int ANDROID_APP_INFO_FIELD_NUMBER = 3;
    public static final int APPLICATION_PROCESS_STATE_FIELD_NUMBER = 5;
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 6;
    private static final ApplicationInfo DEFAULT_INSTANCE;
    public static final int GOOGLE_APP_ID_FIELD_NUMBER = 1;
    private static volatile hxc PARSER;
    private AndroidApplicationInfo androidAppInfo_;
    private int applicationProcessState_;
    private int bitField0_;
    private ora customAttributes_ = ora.m42592g();
    private String googleAppId_ = "";
    private String appInstanceId_ = "";

    /* renamed from: com.google.firebase.perf.v1.ApplicationInfo$1 */
    public static /* synthetic */ class C114501 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f13432xa1df5c61;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f13432xa1df5c61 = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13432xa1df5c61[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13432xa1df5c61[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13432xa1df5c61[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13432xa1df5c61[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13432xa1df5c61[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13432xa1df5c61[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends wn7.AbstractC17934a implements ApplicationInfoOrBuilder {
        public /* synthetic */ Builder(C114501 c114501) {
            this();
        }

        public Builder clearAndroidAppInfo() {
            copyOnWrite();
            ((ApplicationInfo) this.instance).clearAndroidAppInfo();
            return this;
        }

        public Builder clearAppInstanceId() {
            copyOnWrite();
            ((ApplicationInfo) this.instance).clearAppInstanceId();
            return this;
        }

        public Builder clearApplicationProcessState() {
            copyOnWrite();
            ((ApplicationInfo) this.instance).clearApplicationProcessState();
            return this;
        }

        public Builder clearCustomAttributes() {
            copyOnWrite();
            ((ApplicationInfo) this.instance).getMutableCustomAttributesMap().clear();
            return this;
        }

        public Builder clearGoogleAppId() {
            copyOnWrite();
            ((ApplicationInfo) this.instance).clearGoogleAppId();
            return this;
        }

        @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
        public boolean containsCustomAttributes(String str) {
            str.getClass();
            return ((ApplicationInfo) this.instance).getCustomAttributesMap().containsKey(str);
        }

        @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
        public AndroidApplicationInfo getAndroidAppInfo() {
            return ((ApplicationInfo) this.instance).getAndroidAppInfo();
        }

        @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
        public String getAppInstanceId() {
            return ((ApplicationInfo) this.instance).getAppInstanceId();
        }

        @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
        public xq1 getAppInstanceIdBytes() {
            return ((ApplicationInfo) this.instance).getAppInstanceIdBytes();
        }

        @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
        public ApplicationProcessState getApplicationProcessState() {
            return ((ApplicationInfo) this.instance).getApplicationProcessState();
        }

        @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
        @Deprecated
        public Map<String, String> getCustomAttributes() {
            return getCustomAttributesMap();
        }

        @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
        public int getCustomAttributesCount() {
            return ((ApplicationInfo) this.instance).getCustomAttributesMap().size();
        }

        @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
        public Map<String, String> getCustomAttributesMap() {
            return Collections.unmodifiableMap(((ApplicationInfo) this.instance).getCustomAttributesMap());
        }

        @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
        public String getCustomAttributesOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> customAttributesMap = ((ApplicationInfo) this.instance).getCustomAttributesMap();
            return customAttributesMap.containsKey(str) ? customAttributesMap.get(str) : str2;
        }

        @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
        public String getCustomAttributesOrThrow(String str) {
            str.getClass();
            Map<String, String> customAttributesMap = ((ApplicationInfo) this.instance).getCustomAttributesMap();
            if (customAttributesMap.containsKey(str)) {
                return customAttributesMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
        public String getGoogleAppId() {
            return ((ApplicationInfo) this.instance).getGoogleAppId();
        }

        @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
        public xq1 getGoogleAppIdBytes() {
            return ((ApplicationInfo) this.instance).getGoogleAppIdBytes();
        }

        @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
        public boolean hasAndroidAppInfo() {
            return ((ApplicationInfo) this.instance).hasAndroidAppInfo();
        }

        @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
        public boolean hasAppInstanceId() {
            return ((ApplicationInfo) this.instance).hasAppInstanceId();
        }

        @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
        public boolean hasApplicationProcessState() {
            return ((ApplicationInfo) this.instance).hasApplicationProcessState();
        }

        @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
        public boolean hasGoogleAppId() {
            return ((ApplicationInfo) this.instance).hasGoogleAppId();
        }

        public Builder mergeAndroidAppInfo(AndroidApplicationInfo androidApplicationInfo) {
            copyOnWrite();
            ((ApplicationInfo) this.instance).mergeAndroidAppInfo(androidApplicationInfo);
            return this;
        }

        public Builder putAllCustomAttributes(Map<String, String> map) {
            copyOnWrite();
            ((ApplicationInfo) this.instance).getMutableCustomAttributesMap().putAll(map);
            return this;
        }

        public Builder putCustomAttributes(String str, String str2) {
            str.getClass();
            str2.getClass();
            copyOnWrite();
            ((ApplicationInfo) this.instance).getMutableCustomAttributesMap().put(str, str2);
            return this;
        }

        public Builder removeCustomAttributes(String str) {
            str.getClass();
            copyOnWrite();
            ((ApplicationInfo) this.instance).getMutableCustomAttributesMap().remove(str);
            return this;
        }

        public Builder setAndroidAppInfo(AndroidApplicationInfo androidApplicationInfo) {
            copyOnWrite();
            ((ApplicationInfo) this.instance).setAndroidAppInfo(androidApplicationInfo);
            return this;
        }

        public Builder setAppInstanceId(String str) {
            copyOnWrite();
            ((ApplicationInfo) this.instance).setAppInstanceId(str);
            return this;
        }

        public Builder setAppInstanceIdBytes(xq1 xq1Var) {
            copyOnWrite();
            ((ApplicationInfo) this.instance).setAppInstanceIdBytes(xq1Var);
            return this;
        }

        public Builder setApplicationProcessState(ApplicationProcessState applicationProcessState) {
            copyOnWrite();
            ((ApplicationInfo) this.instance).setApplicationProcessState(applicationProcessState);
            return this;
        }

        public Builder setGoogleAppId(String str) {
            copyOnWrite();
            ((ApplicationInfo) this.instance).setGoogleAppId(str);
            return this;
        }

        public Builder setGoogleAppIdBytes(xq1 xq1Var) {
            copyOnWrite();
            ((ApplicationInfo) this.instance).setGoogleAppIdBytes(xq1Var);
            return this;
        }

        private Builder() {
            super(ApplicationInfo.DEFAULT_INSTANCE);
        }

        public Builder setAndroidAppInfo(AndroidApplicationInfo.Builder builder) {
            copyOnWrite();
            ((ApplicationInfo) this.instance).setAndroidAppInfo((AndroidApplicationInfo) builder.build());
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

    static {
        ApplicationInfo applicationInfo = new ApplicationInfo();
        DEFAULT_INSTANCE = applicationInfo;
        wn7.registerDefaultInstance(ApplicationInfo.class, applicationInfo);
    }

    private ApplicationInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAndroidAppInfo() {
        this.androidAppInfo_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppInstanceId() {
        this.bitField0_ &= -3;
        this.appInstanceId_ = getDefaultInstance().getAppInstanceId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearApplicationProcessState() {
        this.bitField0_ &= -9;
        this.applicationProcessState_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoogleAppId() {
        this.bitField0_ &= -2;
        this.googleAppId_ = getDefaultInstance().getGoogleAppId();
    }

    public static ApplicationInfo getDefaultInstance() {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAndroidAppInfo(AndroidApplicationInfo androidApplicationInfo) {
        androidApplicationInfo.getClass();
        AndroidApplicationInfo androidApplicationInfo2 = this.androidAppInfo_;
        if (androidApplicationInfo2 == null || androidApplicationInfo2 == AndroidApplicationInfo.getDefaultInstance()) {
            this.androidAppInfo_ = androidApplicationInfo;
        } else {
            this.androidAppInfo_ = (AndroidApplicationInfo) ((AndroidApplicationInfo.Builder) AndroidApplicationInfo.newBuilder(this.androidAppInfo_).mergeFrom((wn7) androidApplicationInfo)).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ApplicationInfo parseDelimitedFrom(InputStream inputStream) {
        return (ApplicationInfo) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ApplicationInfo parseFrom(ByteBuffer byteBuffer) {
        return (ApplicationInfo) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hxc parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAndroidAppInfo(AndroidApplicationInfo androidApplicationInfo) {
        androidApplicationInfo.getClass();
        this.androidAppInfo_ = androidApplicationInfo;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppInstanceId(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.appInstanceId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppInstanceIdBytes(xq1 xq1Var) {
        this.appInstanceId_ = xq1Var.m56593N();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApplicationProcessState(ApplicationProcessState applicationProcessState) {
        this.applicationProcessState_ = applicationProcessState.getNumber();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoogleAppId(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.googleAppId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoogleAppIdBytes(xq1 xq1Var) {
        this.googleAppId_ = xq1Var.m56593N();
        this.bitField0_ |= 1;
    }

    @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
    public boolean containsCustomAttributes(String str) {
        str.getClass();
        return internalGetCustomAttributes().containsKey(str);
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C114501 c114501 = null;
        switch (C114501.f13432xa1df5c61[enumC17940g.ordinal()]) {
            case 1:
                return new ApplicationInfo();
            case 2:
                return new Builder(c114501);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0005ဌ\u0003\u00062", new Object[]{"bitField0_", "googleAppId_", "appInstanceId_", "androidAppInfo_", "applicationProcessState_", ApplicationProcessState.internalGetVerifier(), "customAttributes_", CustomAttributesDefaultEntryHolder.defaultEntry});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (ApplicationInfo.class) {
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

    @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
    public AndroidApplicationInfo getAndroidAppInfo() {
        AndroidApplicationInfo androidApplicationInfo = this.androidAppInfo_;
        return androidApplicationInfo == null ? AndroidApplicationInfo.getDefaultInstance() : androidApplicationInfo;
    }

    @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
    public String getAppInstanceId() {
        return this.appInstanceId_;
    }

    @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
    public xq1 getAppInstanceIdBytes() {
        return xq1.m56589q(this.appInstanceId_);
    }

    @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
    public ApplicationProcessState getApplicationProcessState() {
        ApplicationProcessState applicationProcessStateForNumber = ApplicationProcessState.forNumber(this.applicationProcessState_);
        return applicationProcessStateForNumber == null ? ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN : applicationProcessStateForNumber;
    }

    @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
    @Deprecated
    public Map<String, String> getCustomAttributes() {
        return getCustomAttributesMap();
    }

    @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
    public int getCustomAttributesCount() {
        return internalGetCustomAttributes().size();
    }

    @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
    public Map<String, String> getCustomAttributesMap() {
        return Collections.unmodifiableMap(internalGetCustomAttributes());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
    public String getCustomAttributesOrDefault(String str, String str2) {
        str.getClass();
        ora oraVarInternalGetCustomAttributes = internalGetCustomAttributes();
        return oraVarInternalGetCustomAttributes.containsKey(str) ? (String) oraVarInternalGetCustomAttributes.get(str) : str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
    public String getCustomAttributesOrThrow(String str) {
        str.getClass();
        ora oraVarInternalGetCustomAttributes = internalGetCustomAttributes();
        if (oraVarInternalGetCustomAttributes.containsKey(str)) {
            return (String) oraVarInternalGetCustomAttributes.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
    public String getGoogleAppId() {
        return this.googleAppId_;
    }

    @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
    public xq1 getGoogleAppIdBytes() {
        return xq1.m56589q(this.googleAppId_);
    }

    @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
    public boolean hasAndroidAppInfo() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
    public boolean hasAppInstanceId() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
    public boolean hasApplicationProcessState() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
    public boolean hasGoogleAppId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(ApplicationInfo applicationInfo) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(applicationInfo);
    }

    public static ApplicationInfo parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
        return (ApplicationInfo) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static ApplicationInfo parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
        return (ApplicationInfo) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
    }

    public static ApplicationInfo parseFrom(xq1 xq1Var) {
        return (ApplicationInfo) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
    }

    public static ApplicationInfo parseFrom(xq1 xq1Var, qp6 qp6Var) {
        return (ApplicationInfo) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
    }

    public static ApplicationInfo parseFrom(byte[] bArr) {
        return (ApplicationInfo) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ApplicationInfo parseFrom(byte[] bArr, qp6 qp6Var) {
        return (ApplicationInfo) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
    }

    public static ApplicationInfo parseFrom(InputStream inputStream) {
        return (ApplicationInfo) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ApplicationInfo parseFrom(InputStream inputStream, qp6 qp6Var) {
        return (ApplicationInfo) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static ApplicationInfo parseFrom(jf3 jf3Var) {
        return (ApplicationInfo) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
    }

    public static ApplicationInfo parseFrom(jf3 jf3Var, qp6 qp6Var) {
        return (ApplicationInfo) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
    }
}
