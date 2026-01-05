package com.google.api;

import java.io.InputStream;
import java.nio.ByteBuffer;
import p001o.hxc;
import p001o.jf3;
import p001o.qp6;
import p001o.r8;
import p001o.wn7;
import p001o.xq1;

/* loaded from: classes3.dex */
public final class UsageRule extends wn7 implements UsageRuleOrBuilder {
    public static final int ALLOW_UNREGISTERED_CALLS_FIELD_NUMBER = 2;
    private static final UsageRule DEFAULT_INSTANCE;
    private static volatile hxc PARSER = null;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    public static final int SKIP_SERVICE_CONTROL_FIELD_NUMBER = 3;
    private boolean allowUnregisteredCalls_;
    private String selector_ = "";
    private boolean skipServiceControl_;

    /* renamed from: com.google.api.UsageRule$1 */
    public static /* synthetic */ class C112411 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f13331xa1df5c61;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f13331xa1df5c61 = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13331xa1df5c61[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13331xa1df5c61[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13331xa1df5c61[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13331xa1df5c61[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13331xa1df5c61[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13331xa1df5c61[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends wn7.AbstractC17934a implements UsageRuleOrBuilder {
        public /* synthetic */ Builder(C112411 c112411) {
            this();
        }

        public Builder clearAllowUnregisteredCalls() {
            copyOnWrite();
            ((UsageRule) this.instance).clearAllowUnregisteredCalls();
            return this;
        }

        public Builder clearSelector() {
            copyOnWrite();
            ((UsageRule) this.instance).clearSelector();
            return this;
        }

        public Builder clearSkipServiceControl() {
            copyOnWrite();
            ((UsageRule) this.instance).clearSkipServiceControl();
            return this;
        }

        @Override // com.google.api.UsageRuleOrBuilder
        public boolean getAllowUnregisteredCalls() {
            return ((UsageRule) this.instance).getAllowUnregisteredCalls();
        }

        @Override // com.google.api.UsageRuleOrBuilder
        public String getSelector() {
            return ((UsageRule) this.instance).getSelector();
        }

        @Override // com.google.api.UsageRuleOrBuilder
        public xq1 getSelectorBytes() {
            return ((UsageRule) this.instance).getSelectorBytes();
        }

        @Override // com.google.api.UsageRuleOrBuilder
        public boolean getSkipServiceControl() {
            return ((UsageRule) this.instance).getSkipServiceControl();
        }

        public Builder setAllowUnregisteredCalls(boolean z) {
            copyOnWrite();
            ((UsageRule) this.instance).setAllowUnregisteredCalls(z);
            return this;
        }

        public Builder setSelector(String str) {
            copyOnWrite();
            ((UsageRule) this.instance).setSelector(str);
            return this;
        }

        public Builder setSelectorBytes(xq1 xq1Var) {
            copyOnWrite();
            ((UsageRule) this.instance).setSelectorBytes(xq1Var);
            return this;
        }

        public Builder setSkipServiceControl(boolean z) {
            copyOnWrite();
            ((UsageRule) this.instance).setSkipServiceControl(z);
            return this;
        }

        private Builder() {
            super(UsageRule.DEFAULT_INSTANCE);
        }
    }

    static {
        UsageRule usageRule = new UsageRule();
        DEFAULT_INSTANCE = usageRule;
        wn7.registerDefaultInstance(UsageRule.class, usageRule);
    }

    private UsageRule() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllowUnregisteredCalls() {
        this.allowUnregisteredCalls_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelector() {
        this.selector_ = getDefaultInstance().getSelector();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSkipServiceControl() {
        this.skipServiceControl_ = false;
    }

    public static UsageRule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static UsageRule parseDelimitedFrom(InputStream inputStream) {
        return (UsageRule) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UsageRule parseFrom(ByteBuffer byteBuffer) {
        return (UsageRule) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hxc parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowUnregisteredCalls(boolean z) {
        this.allowUnregisteredCalls_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelector(String str) {
        str.getClass();
        this.selector_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectorBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        this.selector_ = xq1Var.m56593N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSkipServiceControl(boolean z) {
        this.skipServiceControl_ = z;
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C112411 c112411 = null;
        switch (C112411.f13331xa1df5c61[enumC17940g.ordinal()]) {
            case 1:
                return new UsageRule();
            case 2:
                return new Builder(c112411);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0003\u0007", new Object[]{"selector_", "allowUnregisteredCalls_", "skipServiceControl_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (UsageRule.class) {
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

    @Override // com.google.api.UsageRuleOrBuilder
    public boolean getAllowUnregisteredCalls() {
        return this.allowUnregisteredCalls_;
    }

    @Override // com.google.api.UsageRuleOrBuilder
    public String getSelector() {
        return this.selector_;
    }

    @Override // com.google.api.UsageRuleOrBuilder
    public xq1 getSelectorBytes() {
        return xq1.m56589q(this.selector_);
    }

    @Override // com.google.api.UsageRuleOrBuilder
    public boolean getSkipServiceControl() {
        return this.skipServiceControl_;
    }

    public static Builder newBuilder(UsageRule usageRule) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(usageRule);
    }

    public static UsageRule parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
        return (UsageRule) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static UsageRule parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
        return (UsageRule) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
    }

    public static UsageRule parseFrom(xq1 xq1Var) {
        return (UsageRule) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
    }

    public static UsageRule parseFrom(xq1 xq1Var, qp6 qp6Var) {
        return (UsageRule) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
    }

    public static UsageRule parseFrom(byte[] bArr) {
        return (UsageRule) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UsageRule parseFrom(byte[] bArr, qp6 qp6Var) {
        return (UsageRule) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
    }

    public static UsageRule parseFrom(InputStream inputStream) {
        return (UsageRule) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UsageRule parseFrom(InputStream inputStream, qp6 qp6Var) {
        return (UsageRule) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static UsageRule parseFrom(jf3 jf3Var) {
        return (UsageRule) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
    }

    public static UsageRule parseFrom(jf3 jf3Var, qp6 qp6Var) {
        return (UsageRule) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
    }
}
