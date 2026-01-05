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
public final class DocumentationRule extends wn7 implements DocumentationRuleOrBuilder {
    private static final DocumentationRule DEFAULT_INSTANCE;
    public static final int DEPRECATION_DESCRIPTION_FIELD_NUMBER = 3;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    private static volatile hxc PARSER = null;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private String selector_ = "";
    private String description_ = "";
    private String deprecationDescription_ = "";

    /* renamed from: com.google.api.DocumentationRule$1 */
    public static /* synthetic */ class C112041 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f13301xa1df5c61;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f13301xa1df5c61 = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13301xa1df5c61[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13301xa1df5c61[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13301xa1df5c61[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13301xa1df5c61[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13301xa1df5c61[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13301xa1df5c61[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends wn7.AbstractC17934a implements DocumentationRuleOrBuilder {
        public /* synthetic */ Builder(C112041 c112041) {
            this();
        }

        public Builder clearDeprecationDescription() {
            copyOnWrite();
            ((DocumentationRule) this.instance).clearDeprecationDescription();
            return this;
        }

        public Builder clearDescription() {
            copyOnWrite();
            ((DocumentationRule) this.instance).clearDescription();
            return this;
        }

        public Builder clearSelector() {
            copyOnWrite();
            ((DocumentationRule) this.instance).clearSelector();
            return this;
        }

        @Override // com.google.api.DocumentationRuleOrBuilder
        public String getDeprecationDescription() {
            return ((DocumentationRule) this.instance).getDeprecationDescription();
        }

        @Override // com.google.api.DocumentationRuleOrBuilder
        public xq1 getDeprecationDescriptionBytes() {
            return ((DocumentationRule) this.instance).getDeprecationDescriptionBytes();
        }

        @Override // com.google.api.DocumentationRuleOrBuilder
        public String getDescription() {
            return ((DocumentationRule) this.instance).getDescription();
        }

        @Override // com.google.api.DocumentationRuleOrBuilder
        public xq1 getDescriptionBytes() {
            return ((DocumentationRule) this.instance).getDescriptionBytes();
        }

        @Override // com.google.api.DocumentationRuleOrBuilder
        public String getSelector() {
            return ((DocumentationRule) this.instance).getSelector();
        }

        @Override // com.google.api.DocumentationRuleOrBuilder
        public xq1 getSelectorBytes() {
            return ((DocumentationRule) this.instance).getSelectorBytes();
        }

        public Builder setDeprecationDescription(String str) {
            copyOnWrite();
            ((DocumentationRule) this.instance).setDeprecationDescription(str);
            return this;
        }

        public Builder setDeprecationDescriptionBytes(xq1 xq1Var) {
            copyOnWrite();
            ((DocumentationRule) this.instance).setDeprecationDescriptionBytes(xq1Var);
            return this;
        }

        public Builder setDescription(String str) {
            copyOnWrite();
            ((DocumentationRule) this.instance).setDescription(str);
            return this;
        }

        public Builder setDescriptionBytes(xq1 xq1Var) {
            copyOnWrite();
            ((DocumentationRule) this.instance).setDescriptionBytes(xq1Var);
            return this;
        }

        public Builder setSelector(String str) {
            copyOnWrite();
            ((DocumentationRule) this.instance).setSelector(str);
            return this;
        }

        public Builder setSelectorBytes(xq1 xq1Var) {
            copyOnWrite();
            ((DocumentationRule) this.instance).setSelectorBytes(xq1Var);
            return this;
        }

        private Builder() {
            super(DocumentationRule.DEFAULT_INSTANCE);
        }
    }

    static {
        DocumentationRule documentationRule = new DocumentationRule();
        DEFAULT_INSTANCE = documentationRule;
        wn7.registerDefaultInstance(DocumentationRule.class, documentationRule);
    }

    private DocumentationRule() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeprecationDescription() {
        this.deprecationDescription_ = getDefaultInstance().getDeprecationDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.description_ = getDefaultInstance().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelector() {
        this.selector_ = getDefaultInstance().getSelector();
    }

    public static DocumentationRule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static DocumentationRule parseDelimitedFrom(InputStream inputStream) {
        return (DocumentationRule) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DocumentationRule parseFrom(ByteBuffer byteBuffer) {
        return (DocumentationRule) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hxc parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeprecationDescription(String str) {
        str.getClass();
        this.deprecationDescription_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeprecationDescriptionBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        this.deprecationDescription_ = xq1Var.m56593N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescription(String str) {
        str.getClass();
        this.description_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescriptionBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        this.description_ = xq1Var.m56593N();
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

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C112041 c112041 = null;
        switch (C112041.f13301xa1df5c61[enumC17940g.ordinal()]) {
            case 1:
                return new DocumentationRule();
            case 2:
                return new Builder(c112041);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"selector_", "description_", "deprecationDescription_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (DocumentationRule.class) {
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

    @Override // com.google.api.DocumentationRuleOrBuilder
    public String getDeprecationDescription() {
        return this.deprecationDescription_;
    }

    @Override // com.google.api.DocumentationRuleOrBuilder
    public xq1 getDeprecationDescriptionBytes() {
        return xq1.m56589q(this.deprecationDescription_);
    }

    @Override // com.google.api.DocumentationRuleOrBuilder
    public String getDescription() {
        return this.description_;
    }

    @Override // com.google.api.DocumentationRuleOrBuilder
    public xq1 getDescriptionBytes() {
        return xq1.m56589q(this.description_);
    }

    @Override // com.google.api.DocumentationRuleOrBuilder
    public String getSelector() {
        return this.selector_;
    }

    @Override // com.google.api.DocumentationRuleOrBuilder
    public xq1 getSelectorBytes() {
        return xq1.m56589q(this.selector_);
    }

    public static Builder newBuilder(DocumentationRule documentationRule) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(documentationRule);
    }

    public static DocumentationRule parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
        return (DocumentationRule) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static DocumentationRule parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
        return (DocumentationRule) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
    }

    public static DocumentationRule parseFrom(xq1 xq1Var) {
        return (DocumentationRule) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
    }

    public static DocumentationRule parseFrom(xq1 xq1Var, qp6 qp6Var) {
        return (DocumentationRule) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
    }

    public static DocumentationRule parseFrom(byte[] bArr) {
        return (DocumentationRule) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DocumentationRule parseFrom(byte[] bArr, qp6 qp6Var) {
        return (DocumentationRule) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
    }

    public static DocumentationRule parseFrom(InputStream inputStream) {
        return (DocumentationRule) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DocumentationRule parseFrom(InputStream inputStream, qp6 qp6Var) {
        return (DocumentationRule) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static DocumentationRule parseFrom(jf3 jf3Var) {
        return (DocumentationRule) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
    }

    public static DocumentationRule parseFrom(jf3 jf3Var, qp6 qp6Var) {
        return (DocumentationRule) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
    }
}
