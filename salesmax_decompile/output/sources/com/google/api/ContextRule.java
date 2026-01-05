package com.google.api;

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
public final class ContextRule extends wn7 implements ContextRuleOrBuilder {
    public static final int ALLOWED_REQUEST_EXTENSIONS_FIELD_NUMBER = 4;
    public static final int ALLOWED_RESPONSE_EXTENSIONS_FIELD_NUMBER = 5;
    private static final ContextRule DEFAULT_INSTANCE;
    private static volatile hxc PARSER = null;
    public static final int PROVIDED_FIELD_NUMBER = 3;
    public static final int REQUESTED_FIELD_NUMBER = 2;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private String selector_ = "";
    private yn8.InterfaceC18446j requested_ = wn7.emptyProtobufList();
    private yn8.InterfaceC18446j provided_ = wn7.emptyProtobufList();
    private yn8.InterfaceC18446j allowedRequestExtensions_ = wn7.emptyProtobufList();
    private yn8.InterfaceC18446j allowedResponseExtensions_ = wn7.emptyProtobufList();

    /* renamed from: com.google.api.ContextRule$1 */
    public static /* synthetic */ class C111991 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f13296xa1df5c61;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f13296xa1df5c61 = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13296xa1df5c61[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13296xa1df5c61[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13296xa1df5c61[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13296xa1df5c61[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13296xa1df5c61[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13296xa1df5c61[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends wn7.AbstractC17934a implements ContextRuleOrBuilder {
        public /* synthetic */ Builder(C111991 c111991) {
            this();
        }

        public Builder addAllAllowedRequestExtensions(Iterable<String> iterable) {
            copyOnWrite();
            ((ContextRule) this.instance).addAllAllowedRequestExtensions(iterable);
            return this;
        }

        public Builder addAllAllowedResponseExtensions(Iterable<String> iterable) {
            copyOnWrite();
            ((ContextRule) this.instance).addAllAllowedResponseExtensions(iterable);
            return this;
        }

        public Builder addAllProvided(Iterable<String> iterable) {
            copyOnWrite();
            ((ContextRule) this.instance).addAllProvided(iterable);
            return this;
        }

        public Builder addAllRequested(Iterable<String> iterable) {
            copyOnWrite();
            ((ContextRule) this.instance).addAllRequested(iterable);
            return this;
        }

        public Builder addAllowedRequestExtensions(String str) {
            copyOnWrite();
            ((ContextRule) this.instance).addAllowedRequestExtensions(str);
            return this;
        }

        public Builder addAllowedRequestExtensionsBytes(xq1 xq1Var) {
            copyOnWrite();
            ((ContextRule) this.instance).addAllowedRequestExtensionsBytes(xq1Var);
            return this;
        }

        public Builder addAllowedResponseExtensions(String str) {
            copyOnWrite();
            ((ContextRule) this.instance).addAllowedResponseExtensions(str);
            return this;
        }

        public Builder addAllowedResponseExtensionsBytes(xq1 xq1Var) {
            copyOnWrite();
            ((ContextRule) this.instance).addAllowedResponseExtensionsBytes(xq1Var);
            return this;
        }

        public Builder addProvided(String str) {
            copyOnWrite();
            ((ContextRule) this.instance).addProvided(str);
            return this;
        }

        public Builder addProvidedBytes(xq1 xq1Var) {
            copyOnWrite();
            ((ContextRule) this.instance).addProvidedBytes(xq1Var);
            return this;
        }

        public Builder addRequested(String str) {
            copyOnWrite();
            ((ContextRule) this.instance).addRequested(str);
            return this;
        }

        public Builder addRequestedBytes(xq1 xq1Var) {
            copyOnWrite();
            ((ContextRule) this.instance).addRequestedBytes(xq1Var);
            return this;
        }

        public Builder clearAllowedRequestExtensions() {
            copyOnWrite();
            ((ContextRule) this.instance).clearAllowedRequestExtensions();
            return this;
        }

        public Builder clearAllowedResponseExtensions() {
            copyOnWrite();
            ((ContextRule) this.instance).clearAllowedResponseExtensions();
            return this;
        }

        public Builder clearProvided() {
            copyOnWrite();
            ((ContextRule) this.instance).clearProvided();
            return this;
        }

        public Builder clearRequested() {
            copyOnWrite();
            ((ContextRule) this.instance).clearRequested();
            return this;
        }

        public Builder clearSelector() {
            copyOnWrite();
            ((ContextRule) this.instance).clearSelector();
            return this;
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public String getAllowedRequestExtensions(int i) {
            return ((ContextRule) this.instance).getAllowedRequestExtensions(i);
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public xq1 getAllowedRequestExtensionsBytes(int i) {
            return ((ContextRule) this.instance).getAllowedRequestExtensionsBytes(i);
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public int getAllowedRequestExtensionsCount() {
            return ((ContextRule) this.instance).getAllowedRequestExtensionsCount();
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public List<String> getAllowedRequestExtensionsList() {
            return Collections.unmodifiableList(((ContextRule) this.instance).getAllowedRequestExtensionsList());
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public String getAllowedResponseExtensions(int i) {
            return ((ContextRule) this.instance).getAllowedResponseExtensions(i);
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public xq1 getAllowedResponseExtensionsBytes(int i) {
            return ((ContextRule) this.instance).getAllowedResponseExtensionsBytes(i);
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public int getAllowedResponseExtensionsCount() {
            return ((ContextRule) this.instance).getAllowedResponseExtensionsCount();
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public List<String> getAllowedResponseExtensionsList() {
            return Collections.unmodifiableList(((ContextRule) this.instance).getAllowedResponseExtensionsList());
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public String getProvided(int i) {
            return ((ContextRule) this.instance).getProvided(i);
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public xq1 getProvidedBytes(int i) {
            return ((ContextRule) this.instance).getProvidedBytes(i);
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public int getProvidedCount() {
            return ((ContextRule) this.instance).getProvidedCount();
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public List<String> getProvidedList() {
            return Collections.unmodifiableList(((ContextRule) this.instance).getProvidedList());
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public String getRequested(int i) {
            return ((ContextRule) this.instance).getRequested(i);
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public xq1 getRequestedBytes(int i) {
            return ((ContextRule) this.instance).getRequestedBytes(i);
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public int getRequestedCount() {
            return ((ContextRule) this.instance).getRequestedCount();
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public List<String> getRequestedList() {
            return Collections.unmodifiableList(((ContextRule) this.instance).getRequestedList());
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public String getSelector() {
            return ((ContextRule) this.instance).getSelector();
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public xq1 getSelectorBytes() {
            return ((ContextRule) this.instance).getSelectorBytes();
        }

        public Builder setAllowedRequestExtensions(int i, String str) {
            copyOnWrite();
            ((ContextRule) this.instance).setAllowedRequestExtensions(i, str);
            return this;
        }

        public Builder setAllowedResponseExtensions(int i, String str) {
            copyOnWrite();
            ((ContextRule) this.instance).setAllowedResponseExtensions(i, str);
            return this;
        }

        public Builder setProvided(int i, String str) {
            copyOnWrite();
            ((ContextRule) this.instance).setProvided(i, str);
            return this;
        }

        public Builder setRequested(int i, String str) {
            copyOnWrite();
            ((ContextRule) this.instance).setRequested(i, str);
            return this;
        }

        public Builder setSelector(String str) {
            copyOnWrite();
            ((ContextRule) this.instance).setSelector(str);
            return this;
        }

        public Builder setSelectorBytes(xq1 xq1Var) {
            copyOnWrite();
            ((ContextRule) this.instance).setSelectorBytes(xq1Var);
            return this;
        }

        private Builder() {
            super(ContextRule.DEFAULT_INSTANCE);
        }
    }

    static {
        ContextRule contextRule = new ContextRule();
        DEFAULT_INSTANCE = contextRule;
        wn7.registerDefaultInstance(ContextRule.class, contextRule);
    }

    private ContextRule() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAllowedRequestExtensions(Iterable<String> iterable) {
        ensureAllowedRequestExtensionsIsMutable();
        r8.addAll((Iterable) iterable, (List) this.allowedRequestExtensions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAllowedResponseExtensions(Iterable<String> iterable) {
        ensureAllowedResponseExtensionsIsMutable();
        r8.addAll((Iterable) iterable, (List) this.allowedResponseExtensions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllProvided(Iterable<String> iterable) {
        ensureProvidedIsMutable();
        r8.addAll((Iterable) iterable, (List) this.provided_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRequested(Iterable<String> iterable) {
        ensureRequestedIsMutable();
        r8.addAll((Iterable) iterable, (List) this.requested_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllowedRequestExtensions(String str) {
        str.getClass();
        ensureAllowedRequestExtensionsIsMutable();
        this.allowedRequestExtensions_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllowedRequestExtensionsBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        ensureAllowedRequestExtensionsIsMutable();
        this.allowedRequestExtensions_.add(xq1Var.m56593N());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllowedResponseExtensions(String str) {
        str.getClass();
        ensureAllowedResponseExtensionsIsMutable();
        this.allowedResponseExtensions_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllowedResponseExtensionsBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        ensureAllowedResponseExtensionsIsMutable();
        this.allowedResponseExtensions_.add(xq1Var.m56593N());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProvided(String str) {
        str.getClass();
        ensureProvidedIsMutable();
        this.provided_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProvidedBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        ensureProvidedIsMutable();
        this.provided_.add(xq1Var.m56593N());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRequested(String str) {
        str.getClass();
        ensureRequestedIsMutable();
        this.requested_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRequestedBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        ensureRequestedIsMutable();
        this.requested_.add(xq1Var.m56593N());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllowedRequestExtensions() {
        this.allowedRequestExtensions_ = wn7.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllowedResponseExtensions() {
        this.allowedResponseExtensions_ = wn7.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProvided() {
        this.provided_ = wn7.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequested() {
        this.requested_ = wn7.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelector() {
        this.selector_ = getDefaultInstance().getSelector();
    }

    private void ensureAllowedRequestExtensionsIsMutable() {
        yn8.InterfaceC18446j interfaceC18446j = this.allowedRequestExtensions_;
        if (interfaceC18446j.mo28212k()) {
            return;
        }
        this.allowedRequestExtensions_ = wn7.mutableCopy(interfaceC18446j);
    }

    private void ensureAllowedResponseExtensionsIsMutable() {
        yn8.InterfaceC18446j interfaceC18446j = this.allowedResponseExtensions_;
        if (interfaceC18446j.mo28212k()) {
            return;
        }
        this.allowedResponseExtensions_ = wn7.mutableCopy(interfaceC18446j);
    }

    private void ensureProvidedIsMutable() {
        yn8.InterfaceC18446j interfaceC18446j = this.provided_;
        if (interfaceC18446j.mo28212k()) {
            return;
        }
        this.provided_ = wn7.mutableCopy(interfaceC18446j);
    }

    private void ensureRequestedIsMutable() {
        yn8.InterfaceC18446j interfaceC18446j = this.requested_;
        if (interfaceC18446j.mo28212k()) {
            return;
        }
        this.requested_ = wn7.mutableCopy(interfaceC18446j);
    }

    public static ContextRule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ContextRule parseDelimitedFrom(InputStream inputStream) {
        return (ContextRule) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ContextRule parseFrom(ByteBuffer byteBuffer) {
        return (ContextRule) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hxc parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowedRequestExtensions(int i, String str) {
        str.getClass();
        ensureAllowedRequestExtensionsIsMutable();
        this.allowedRequestExtensions_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowedResponseExtensions(int i, String str) {
        str.getClass();
        ensureAllowedResponseExtensionsIsMutable();
        this.allowedResponseExtensions_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProvided(int i, String str) {
        str.getClass();
        ensureProvidedIsMutable();
        this.provided_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequested(int i, String str) {
        str.getClass();
        ensureRequestedIsMutable();
        this.requested_.set(i, str);
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
        C111991 c111991 = null;
        switch (C111991.f13296xa1df5c61[enumC17940g.ordinal()]) {
            case 1:
                return new ContextRule();
            case 2:
                return new Builder(c111991);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0004\u0000\u0001Ȉ\u0002Ț\u0003Ț\u0004Ț\u0005Ț", new Object[]{"selector_", "requested_", "provided_", "allowedRequestExtensions_", "allowedResponseExtensions_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (ContextRule.class) {
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

    @Override // com.google.api.ContextRuleOrBuilder
    public String getAllowedRequestExtensions(int i) {
        return (String) this.allowedRequestExtensions_.get(i);
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public xq1 getAllowedRequestExtensionsBytes(int i) {
        return xq1.m56589q((String) this.allowedRequestExtensions_.get(i));
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public int getAllowedRequestExtensionsCount() {
        return this.allowedRequestExtensions_.size();
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public List<String> getAllowedRequestExtensionsList() {
        return this.allowedRequestExtensions_;
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public String getAllowedResponseExtensions(int i) {
        return (String) this.allowedResponseExtensions_.get(i);
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public xq1 getAllowedResponseExtensionsBytes(int i) {
        return xq1.m56589q((String) this.allowedResponseExtensions_.get(i));
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public int getAllowedResponseExtensionsCount() {
        return this.allowedResponseExtensions_.size();
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public List<String> getAllowedResponseExtensionsList() {
        return this.allowedResponseExtensions_;
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public String getProvided(int i) {
        return (String) this.provided_.get(i);
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public xq1 getProvidedBytes(int i) {
        return xq1.m56589q((String) this.provided_.get(i));
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public int getProvidedCount() {
        return this.provided_.size();
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public List<String> getProvidedList() {
        return this.provided_;
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public String getRequested(int i) {
        return (String) this.requested_.get(i);
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public xq1 getRequestedBytes(int i) {
        return xq1.m56589q((String) this.requested_.get(i));
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public int getRequestedCount() {
        return this.requested_.size();
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public List<String> getRequestedList() {
        return this.requested_;
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public String getSelector() {
        return this.selector_;
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public xq1 getSelectorBytes() {
        return xq1.m56589q(this.selector_);
    }

    public static Builder newBuilder(ContextRule contextRule) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(contextRule);
    }

    public static ContextRule parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
        return (ContextRule) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static ContextRule parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
        return (ContextRule) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
    }

    public static ContextRule parseFrom(xq1 xq1Var) {
        return (ContextRule) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
    }

    public static ContextRule parseFrom(xq1 xq1Var, qp6 qp6Var) {
        return (ContextRule) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
    }

    public static ContextRule parseFrom(byte[] bArr) {
        return (ContextRule) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ContextRule parseFrom(byte[] bArr, qp6 qp6Var) {
        return (ContextRule) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
    }

    public static ContextRule parseFrom(InputStream inputStream) {
        return (ContextRule) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ContextRule parseFrom(InputStream inputStream, qp6 qp6Var) {
        return (ContextRule) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static ContextRule parseFrom(jf3 jf3Var) {
        return (ContextRule) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
    }

    public static ContextRule parseFrom(jf3 jf3Var, qp6 qp6Var) {
        return (ContextRule) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
    }
}
