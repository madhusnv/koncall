package com.google.api;

import com.google.api.CustomHttpPattern;
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

/* loaded from: classes3.dex */
public final class HttpRule extends wn7 implements HttpRuleOrBuilder {
    public static final int ADDITIONAL_BINDINGS_FIELD_NUMBER = 11;
    public static final int BODY_FIELD_NUMBER = 7;
    public static final int CUSTOM_FIELD_NUMBER = 8;
    private static final HttpRule DEFAULT_INSTANCE;
    public static final int DELETE_FIELD_NUMBER = 5;
    public static final int GET_FIELD_NUMBER = 2;
    private static volatile hxc PARSER = null;
    public static final int PATCH_FIELD_NUMBER = 6;
    public static final int POST_FIELD_NUMBER = 4;
    public static final int PUT_FIELD_NUMBER = 3;
    public static final int RESPONSE_BODY_FIELD_NUMBER = 12;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private Object pattern_;
    private int patternCase_ = 0;
    private String selector_ = "";
    private String body_ = "";
    private String responseBody_ = "";
    private yn8.InterfaceC18446j additionalBindings_ = wn7.emptyProtobufList();

    /* renamed from: com.google.api.HttpRule$1 */
    public static /* synthetic */ class C112091 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f13305xa1df5c61;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f13305xa1df5c61 = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13305xa1df5c61[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13305xa1df5c61[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13305xa1df5c61[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13305xa1df5c61[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13305xa1df5c61[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13305xa1df5c61[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends wn7.AbstractC17934a implements HttpRuleOrBuilder {
        public /* synthetic */ Builder(C112091 c112091) {
            this();
        }

        public Builder addAdditionalBindings(HttpRule httpRule) {
            copyOnWrite();
            ((HttpRule) this.instance).addAdditionalBindings(httpRule);
            return this;
        }

        public Builder addAllAdditionalBindings(Iterable<? extends HttpRule> iterable) {
            copyOnWrite();
            ((HttpRule) this.instance).addAllAdditionalBindings(iterable);
            return this;
        }

        public Builder clearAdditionalBindings() {
            copyOnWrite();
            ((HttpRule) this.instance).clearAdditionalBindings();
            return this;
        }

        public Builder clearBody() {
            copyOnWrite();
            ((HttpRule) this.instance).clearBody();
            return this;
        }

        public Builder clearCustom() {
            copyOnWrite();
            ((HttpRule) this.instance).clearCustom();
            return this;
        }

        public Builder clearDelete() {
            copyOnWrite();
            ((HttpRule) this.instance).clearDelete();
            return this;
        }

        public Builder clearGet() {
            copyOnWrite();
            ((HttpRule) this.instance).clearGet();
            return this;
        }

        public Builder clearPatch() {
            copyOnWrite();
            ((HttpRule) this.instance).clearPatch();
            return this;
        }

        public Builder clearPattern() {
            copyOnWrite();
            ((HttpRule) this.instance).clearPattern();
            return this;
        }

        public Builder clearPost() {
            copyOnWrite();
            ((HttpRule) this.instance).clearPost();
            return this;
        }

        public Builder clearPut() {
            copyOnWrite();
            ((HttpRule) this.instance).clearPut();
            return this;
        }

        public Builder clearResponseBody() {
            copyOnWrite();
            ((HttpRule) this.instance).clearResponseBody();
            return this;
        }

        public Builder clearSelector() {
            copyOnWrite();
            ((HttpRule) this.instance).clearSelector();
            return this;
        }

        @Override // com.google.api.HttpRuleOrBuilder
        public HttpRule getAdditionalBindings(int i) {
            return ((HttpRule) this.instance).getAdditionalBindings(i);
        }

        @Override // com.google.api.HttpRuleOrBuilder
        public int getAdditionalBindingsCount() {
            return ((HttpRule) this.instance).getAdditionalBindingsCount();
        }

        @Override // com.google.api.HttpRuleOrBuilder
        public List<HttpRule> getAdditionalBindingsList() {
            return Collections.unmodifiableList(((HttpRule) this.instance).getAdditionalBindingsList());
        }

        @Override // com.google.api.HttpRuleOrBuilder
        public String getBody() {
            return ((HttpRule) this.instance).getBody();
        }

        @Override // com.google.api.HttpRuleOrBuilder
        public xq1 getBodyBytes() {
            return ((HttpRule) this.instance).getBodyBytes();
        }

        @Override // com.google.api.HttpRuleOrBuilder
        public CustomHttpPattern getCustom() {
            return ((HttpRule) this.instance).getCustom();
        }

        @Override // com.google.api.HttpRuleOrBuilder
        public String getDelete() {
            return ((HttpRule) this.instance).getDelete();
        }

        @Override // com.google.api.HttpRuleOrBuilder
        public xq1 getDeleteBytes() {
            return ((HttpRule) this.instance).getDeleteBytes();
        }

        @Override // com.google.api.HttpRuleOrBuilder
        public String getGet() {
            return ((HttpRule) this.instance).getGet();
        }

        @Override // com.google.api.HttpRuleOrBuilder
        public xq1 getGetBytes() {
            return ((HttpRule) this.instance).getGetBytes();
        }

        @Override // com.google.api.HttpRuleOrBuilder
        public String getPatch() {
            return ((HttpRule) this.instance).getPatch();
        }

        @Override // com.google.api.HttpRuleOrBuilder
        public xq1 getPatchBytes() {
            return ((HttpRule) this.instance).getPatchBytes();
        }

        @Override // com.google.api.HttpRuleOrBuilder
        public PatternCase getPatternCase() {
            return ((HttpRule) this.instance).getPatternCase();
        }

        @Override // com.google.api.HttpRuleOrBuilder
        public String getPost() {
            return ((HttpRule) this.instance).getPost();
        }

        @Override // com.google.api.HttpRuleOrBuilder
        public xq1 getPostBytes() {
            return ((HttpRule) this.instance).getPostBytes();
        }

        @Override // com.google.api.HttpRuleOrBuilder
        public String getPut() {
            return ((HttpRule) this.instance).getPut();
        }

        @Override // com.google.api.HttpRuleOrBuilder
        public xq1 getPutBytes() {
            return ((HttpRule) this.instance).getPutBytes();
        }

        @Override // com.google.api.HttpRuleOrBuilder
        public String getResponseBody() {
            return ((HttpRule) this.instance).getResponseBody();
        }

        @Override // com.google.api.HttpRuleOrBuilder
        public xq1 getResponseBodyBytes() {
            return ((HttpRule) this.instance).getResponseBodyBytes();
        }

        @Override // com.google.api.HttpRuleOrBuilder
        public String getSelector() {
            return ((HttpRule) this.instance).getSelector();
        }

        @Override // com.google.api.HttpRuleOrBuilder
        public xq1 getSelectorBytes() {
            return ((HttpRule) this.instance).getSelectorBytes();
        }

        @Override // com.google.api.HttpRuleOrBuilder
        public boolean hasCustom() {
            return ((HttpRule) this.instance).hasCustom();
        }

        public Builder mergeCustom(CustomHttpPattern customHttpPattern) {
            copyOnWrite();
            ((HttpRule) this.instance).mergeCustom(customHttpPattern);
            return this;
        }

        public Builder removeAdditionalBindings(int i) {
            copyOnWrite();
            ((HttpRule) this.instance).removeAdditionalBindings(i);
            return this;
        }

        public Builder setAdditionalBindings(int i, HttpRule httpRule) {
            copyOnWrite();
            ((HttpRule) this.instance).setAdditionalBindings(i, httpRule);
            return this;
        }

        public Builder setBody(String str) {
            copyOnWrite();
            ((HttpRule) this.instance).setBody(str);
            return this;
        }

        public Builder setBodyBytes(xq1 xq1Var) {
            copyOnWrite();
            ((HttpRule) this.instance).setBodyBytes(xq1Var);
            return this;
        }

        public Builder setCustom(CustomHttpPattern customHttpPattern) {
            copyOnWrite();
            ((HttpRule) this.instance).setCustom(customHttpPattern);
            return this;
        }

        public Builder setDelete(String str) {
            copyOnWrite();
            ((HttpRule) this.instance).setDelete(str);
            return this;
        }

        public Builder setDeleteBytes(xq1 xq1Var) {
            copyOnWrite();
            ((HttpRule) this.instance).setDeleteBytes(xq1Var);
            return this;
        }

        public Builder setGet(String str) {
            copyOnWrite();
            ((HttpRule) this.instance).setGet(str);
            return this;
        }

        public Builder setGetBytes(xq1 xq1Var) {
            copyOnWrite();
            ((HttpRule) this.instance).setGetBytes(xq1Var);
            return this;
        }

        public Builder setPatch(String str) {
            copyOnWrite();
            ((HttpRule) this.instance).setPatch(str);
            return this;
        }

        public Builder setPatchBytes(xq1 xq1Var) {
            copyOnWrite();
            ((HttpRule) this.instance).setPatchBytes(xq1Var);
            return this;
        }

        public Builder setPost(String str) {
            copyOnWrite();
            ((HttpRule) this.instance).setPost(str);
            return this;
        }

        public Builder setPostBytes(xq1 xq1Var) {
            copyOnWrite();
            ((HttpRule) this.instance).setPostBytes(xq1Var);
            return this;
        }

        public Builder setPut(String str) {
            copyOnWrite();
            ((HttpRule) this.instance).setPut(str);
            return this;
        }

        public Builder setPutBytes(xq1 xq1Var) {
            copyOnWrite();
            ((HttpRule) this.instance).setPutBytes(xq1Var);
            return this;
        }

        public Builder setResponseBody(String str) {
            copyOnWrite();
            ((HttpRule) this.instance).setResponseBody(str);
            return this;
        }

        public Builder setResponseBodyBytes(xq1 xq1Var) {
            copyOnWrite();
            ((HttpRule) this.instance).setResponseBodyBytes(xq1Var);
            return this;
        }

        public Builder setSelector(String str) {
            copyOnWrite();
            ((HttpRule) this.instance).setSelector(str);
            return this;
        }

        public Builder setSelectorBytes(xq1 xq1Var) {
            copyOnWrite();
            ((HttpRule) this.instance).setSelectorBytes(xq1Var);
            return this;
        }

        private Builder() {
            super(HttpRule.DEFAULT_INSTANCE);
        }

        public Builder addAdditionalBindings(int i, HttpRule httpRule) {
            copyOnWrite();
            ((HttpRule) this.instance).addAdditionalBindings(i, httpRule);
            return this;
        }

        public Builder setAdditionalBindings(int i, Builder builder) {
            copyOnWrite();
            ((HttpRule) this.instance).setAdditionalBindings(i, (HttpRule) builder.build());
            return this;
        }

        public Builder setCustom(CustomHttpPattern.Builder builder) {
            copyOnWrite();
            ((HttpRule) this.instance).setCustom((CustomHttpPattern) builder.build());
            return this;
        }

        public Builder addAdditionalBindings(Builder builder) {
            copyOnWrite();
            ((HttpRule) this.instance).addAdditionalBindings((HttpRule) builder.build());
            return this;
        }

        public Builder addAdditionalBindings(int i, Builder builder) {
            copyOnWrite();
            ((HttpRule) this.instance).addAdditionalBindings(i, (HttpRule) builder.build());
            return this;
        }
    }

    public enum PatternCase {
        GET(2),
        PUT(3),
        POST(4),
        DELETE(5),
        PATCH(6),
        CUSTOM(8),
        PATTERN_NOT_SET(0);

        private final int value;

        PatternCase(int i) {
            this.value = i;
        }

        public static PatternCase forNumber(int i) {
            if (i == 0) {
                return PATTERN_NOT_SET;
            }
            if (i == 8) {
                return CUSTOM;
            }
            if (i == 2) {
                return GET;
            }
            if (i == 3) {
                return PUT;
            }
            if (i == 4) {
                return POST;
            }
            if (i == 5) {
                return DELETE;
            }
            if (i != 6) {
                return null;
            }
            return PATCH;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static PatternCase valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        HttpRule httpRule = new HttpRule();
        DEFAULT_INSTANCE = httpRule;
        wn7.registerDefaultInstance(HttpRule.class, httpRule);
    }

    private HttpRule() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAdditionalBindings(HttpRule httpRule) {
        httpRule.getClass();
        ensureAdditionalBindingsIsMutable();
        this.additionalBindings_.add(httpRule);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAdditionalBindings(Iterable<? extends HttpRule> iterable) {
        ensureAdditionalBindingsIsMutable();
        r8.addAll((Iterable) iterable, (List) this.additionalBindings_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdditionalBindings() {
        this.additionalBindings_ = wn7.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBody() {
        this.body_ = getDefaultInstance().getBody();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCustom() {
        if (this.patternCase_ == 8) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDelete() {
        if (this.patternCase_ == 5) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGet() {
        if (this.patternCase_ == 2) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPatch() {
        if (this.patternCase_ == 6) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPattern() {
        this.patternCase_ = 0;
        this.pattern_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPost() {
        if (this.patternCase_ == 4) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPut() {
        if (this.patternCase_ == 3) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResponseBody() {
        this.responseBody_ = getDefaultInstance().getResponseBody();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelector() {
        this.selector_ = getDefaultInstance().getSelector();
    }

    private void ensureAdditionalBindingsIsMutable() {
        yn8.InterfaceC18446j interfaceC18446j = this.additionalBindings_;
        if (interfaceC18446j.mo28212k()) {
            return;
        }
        this.additionalBindings_ = wn7.mutableCopy(interfaceC18446j);
    }

    public static HttpRule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCustom(CustomHttpPattern customHttpPattern) {
        customHttpPattern.getClass();
        if (this.patternCase_ != 8 || this.pattern_ == CustomHttpPattern.getDefaultInstance()) {
            this.pattern_ = customHttpPattern;
        } else {
            this.pattern_ = ((CustomHttpPattern.Builder) CustomHttpPattern.newBuilder((CustomHttpPattern) this.pattern_).mergeFrom((wn7) customHttpPattern)).buildPartial();
        }
        this.patternCase_ = 8;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static HttpRule parseDelimitedFrom(InputStream inputStream) {
        return (HttpRule) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HttpRule parseFrom(ByteBuffer byteBuffer) {
        return (HttpRule) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hxc parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAdditionalBindings(int i) {
        ensureAdditionalBindingsIsMutable();
        this.additionalBindings_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdditionalBindings(int i, HttpRule httpRule) {
        httpRule.getClass();
        ensureAdditionalBindingsIsMutable();
        this.additionalBindings_.set(i, httpRule);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBody(String str) {
        str.getClass();
        this.body_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBodyBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        this.body_ = xq1Var.m56593N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCustom(CustomHttpPattern customHttpPattern) {
        customHttpPattern.getClass();
        this.pattern_ = customHttpPattern;
        this.patternCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDelete(String str) {
        str.getClass();
        this.patternCase_ = 5;
        this.pattern_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeleteBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        this.pattern_ = xq1Var.m56593N();
        this.patternCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGet(String str) {
        str.getClass();
        this.patternCase_ = 2;
        this.pattern_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGetBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        this.pattern_ = xq1Var.m56593N();
        this.patternCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPatch(String str) {
        str.getClass();
        this.patternCase_ = 6;
        this.pattern_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPatchBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        this.pattern_ = xq1Var.m56593N();
        this.patternCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPost(String str) {
        str.getClass();
        this.patternCase_ = 4;
        this.pattern_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPostBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        this.pattern_ = xq1Var.m56593N();
        this.patternCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPut(String str) {
        str.getClass();
        this.patternCase_ = 3;
        this.pattern_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPutBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        this.pattern_ = xq1Var.m56593N();
        this.patternCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseBody(String str) {
        str.getClass();
        this.responseBody_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseBodyBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        this.responseBody_ = xq1Var.m56593N();
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
        C112091 c112091 = null;
        switch (C112091.f13305xa1df5c61[enumC17940g.ordinal()]) {
            case 1:
                return new HttpRule();
            case 2:
                return new Builder(c112091);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0001\u0000\u0001\f\n\u0000\u0001\u0000\u0001Ȉ\u0002Ȼ\u0000\u0003Ȼ\u0000\u0004Ȼ\u0000\u0005Ȼ\u0000\u0006Ȼ\u0000\u0007Ȉ\b<\u0000\u000b\u001b\fȈ", new Object[]{"pattern_", "patternCase_", "selector_", "body_", CustomHttpPattern.class, "additionalBindings_", HttpRule.class, "responseBody_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (HttpRule.class) {
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

    @Override // com.google.api.HttpRuleOrBuilder
    public HttpRule getAdditionalBindings(int i) {
        return (HttpRule) this.additionalBindings_.get(i);
    }

    @Override // com.google.api.HttpRuleOrBuilder
    public int getAdditionalBindingsCount() {
        return this.additionalBindings_.size();
    }

    @Override // com.google.api.HttpRuleOrBuilder
    public List<HttpRule> getAdditionalBindingsList() {
        return this.additionalBindings_;
    }

    public HttpRuleOrBuilder getAdditionalBindingsOrBuilder(int i) {
        return (HttpRuleOrBuilder) this.additionalBindings_.get(i);
    }

    public List<? extends HttpRuleOrBuilder> getAdditionalBindingsOrBuilderList() {
        return this.additionalBindings_;
    }

    @Override // com.google.api.HttpRuleOrBuilder
    public String getBody() {
        return this.body_;
    }

    @Override // com.google.api.HttpRuleOrBuilder
    public xq1 getBodyBytes() {
        return xq1.m56589q(this.body_);
    }

    @Override // com.google.api.HttpRuleOrBuilder
    public CustomHttpPattern getCustom() {
        return this.patternCase_ == 8 ? (CustomHttpPattern) this.pattern_ : CustomHttpPattern.getDefaultInstance();
    }

    @Override // com.google.api.HttpRuleOrBuilder
    public String getDelete() {
        return this.patternCase_ == 5 ? (String) this.pattern_ : "";
    }

    @Override // com.google.api.HttpRuleOrBuilder
    public xq1 getDeleteBytes() {
        return xq1.m56589q(this.patternCase_ == 5 ? (String) this.pattern_ : "");
    }

    @Override // com.google.api.HttpRuleOrBuilder
    public String getGet() {
        return this.patternCase_ == 2 ? (String) this.pattern_ : "";
    }

    @Override // com.google.api.HttpRuleOrBuilder
    public xq1 getGetBytes() {
        return xq1.m56589q(this.patternCase_ == 2 ? (String) this.pattern_ : "");
    }

    @Override // com.google.api.HttpRuleOrBuilder
    public String getPatch() {
        return this.patternCase_ == 6 ? (String) this.pattern_ : "";
    }

    @Override // com.google.api.HttpRuleOrBuilder
    public xq1 getPatchBytes() {
        return xq1.m56589q(this.patternCase_ == 6 ? (String) this.pattern_ : "");
    }

    @Override // com.google.api.HttpRuleOrBuilder
    public PatternCase getPatternCase() {
        return PatternCase.forNumber(this.patternCase_);
    }

    @Override // com.google.api.HttpRuleOrBuilder
    public String getPost() {
        return this.patternCase_ == 4 ? (String) this.pattern_ : "";
    }

    @Override // com.google.api.HttpRuleOrBuilder
    public xq1 getPostBytes() {
        return xq1.m56589q(this.patternCase_ == 4 ? (String) this.pattern_ : "");
    }

    @Override // com.google.api.HttpRuleOrBuilder
    public String getPut() {
        return this.patternCase_ == 3 ? (String) this.pattern_ : "";
    }

    @Override // com.google.api.HttpRuleOrBuilder
    public xq1 getPutBytes() {
        return xq1.m56589q(this.patternCase_ == 3 ? (String) this.pattern_ : "");
    }

    @Override // com.google.api.HttpRuleOrBuilder
    public String getResponseBody() {
        return this.responseBody_;
    }

    @Override // com.google.api.HttpRuleOrBuilder
    public xq1 getResponseBodyBytes() {
        return xq1.m56589q(this.responseBody_);
    }

    @Override // com.google.api.HttpRuleOrBuilder
    public String getSelector() {
        return this.selector_;
    }

    @Override // com.google.api.HttpRuleOrBuilder
    public xq1 getSelectorBytes() {
        return xq1.m56589q(this.selector_);
    }

    @Override // com.google.api.HttpRuleOrBuilder
    public boolean hasCustom() {
        return this.patternCase_ == 8;
    }

    public static Builder newBuilder(HttpRule httpRule) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(httpRule);
    }

    public static HttpRule parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
        return (HttpRule) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static HttpRule parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
        return (HttpRule) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
    }

    public static HttpRule parseFrom(xq1 xq1Var) {
        return (HttpRule) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAdditionalBindings(int i, HttpRule httpRule) {
        httpRule.getClass();
        ensureAdditionalBindingsIsMutable();
        this.additionalBindings_.add(i, httpRule);
    }

    public static HttpRule parseFrom(xq1 xq1Var, qp6 qp6Var) {
        return (HttpRule) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
    }

    public static HttpRule parseFrom(byte[] bArr) {
        return (HttpRule) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static HttpRule parseFrom(byte[] bArr, qp6 qp6Var) {
        return (HttpRule) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
    }

    public static HttpRule parseFrom(InputStream inputStream) {
        return (HttpRule) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HttpRule parseFrom(InputStream inputStream, qp6 qp6Var) {
        return (HttpRule) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static HttpRule parseFrom(jf3 jf3Var) {
        return (HttpRule) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
    }

    public static HttpRule parseFrom(jf3 jf3Var, qp6 qp6Var) {
        return (HttpRule) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
    }
}
