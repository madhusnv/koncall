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
public final class ResourceDescriptor extends wn7 implements ResourceDescriptorOrBuilder {
    private static final ResourceDescriptor DEFAULT_INSTANCE;
    public static final int HISTORY_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_FIELD_NUMBER = 3;
    private static volatile hxc PARSER = null;
    public static final int PATTERN_FIELD_NUMBER = 2;
    public static final int PLURAL_FIELD_NUMBER = 5;
    public static final int SINGULAR_FIELD_NUMBER = 6;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int history_;
    private String type_ = "";
    private yn8.InterfaceC18446j pattern_ = wn7.emptyProtobufList();
    private String nameField_ = "";
    private String plural_ = "";
    private String singular_ = "";

    /* renamed from: com.google.api.ResourceDescriptor$1 */
    public static /* synthetic */ class C112321 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f13323xa1df5c61;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f13323xa1df5c61 = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13323xa1df5c61[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13323xa1df5c61[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13323xa1df5c61[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13323xa1df5c61[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13323xa1df5c61[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13323xa1df5c61[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends wn7.AbstractC17934a implements ResourceDescriptorOrBuilder {
        public /* synthetic */ Builder(C112321 c112321) {
            this();
        }

        public Builder addAllPattern(Iterable<String> iterable) {
            copyOnWrite();
            ((ResourceDescriptor) this.instance).addAllPattern(iterable);
            return this;
        }

        public Builder addPattern(String str) {
            copyOnWrite();
            ((ResourceDescriptor) this.instance).addPattern(str);
            return this;
        }

        public Builder addPatternBytes(xq1 xq1Var) {
            copyOnWrite();
            ((ResourceDescriptor) this.instance).addPatternBytes(xq1Var);
            return this;
        }

        public Builder clearHistory() {
            copyOnWrite();
            ((ResourceDescriptor) this.instance).clearHistory();
            return this;
        }

        public Builder clearNameField() {
            copyOnWrite();
            ((ResourceDescriptor) this.instance).clearNameField();
            return this;
        }

        public Builder clearPattern() {
            copyOnWrite();
            ((ResourceDescriptor) this.instance).clearPattern();
            return this;
        }

        public Builder clearPlural() {
            copyOnWrite();
            ((ResourceDescriptor) this.instance).clearPlural();
            return this;
        }

        public Builder clearSingular() {
            copyOnWrite();
            ((ResourceDescriptor) this.instance).clearSingular();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((ResourceDescriptor) this.instance).clearType();
            return this;
        }

        @Override // com.google.api.ResourceDescriptorOrBuilder
        public History getHistory() {
            return ((ResourceDescriptor) this.instance).getHistory();
        }

        @Override // com.google.api.ResourceDescriptorOrBuilder
        public int getHistoryValue() {
            return ((ResourceDescriptor) this.instance).getHistoryValue();
        }

        @Override // com.google.api.ResourceDescriptorOrBuilder
        public String getNameField() {
            return ((ResourceDescriptor) this.instance).getNameField();
        }

        @Override // com.google.api.ResourceDescriptorOrBuilder
        public xq1 getNameFieldBytes() {
            return ((ResourceDescriptor) this.instance).getNameFieldBytes();
        }

        @Override // com.google.api.ResourceDescriptorOrBuilder
        public String getPattern(int i) {
            return ((ResourceDescriptor) this.instance).getPattern(i);
        }

        @Override // com.google.api.ResourceDescriptorOrBuilder
        public xq1 getPatternBytes(int i) {
            return ((ResourceDescriptor) this.instance).getPatternBytes(i);
        }

        @Override // com.google.api.ResourceDescriptorOrBuilder
        public int getPatternCount() {
            return ((ResourceDescriptor) this.instance).getPatternCount();
        }

        @Override // com.google.api.ResourceDescriptorOrBuilder
        public List<String> getPatternList() {
            return Collections.unmodifiableList(((ResourceDescriptor) this.instance).getPatternList());
        }

        @Override // com.google.api.ResourceDescriptorOrBuilder
        public String getPlural() {
            return ((ResourceDescriptor) this.instance).getPlural();
        }

        @Override // com.google.api.ResourceDescriptorOrBuilder
        public xq1 getPluralBytes() {
            return ((ResourceDescriptor) this.instance).getPluralBytes();
        }

        @Override // com.google.api.ResourceDescriptorOrBuilder
        public String getSingular() {
            return ((ResourceDescriptor) this.instance).getSingular();
        }

        @Override // com.google.api.ResourceDescriptorOrBuilder
        public xq1 getSingularBytes() {
            return ((ResourceDescriptor) this.instance).getSingularBytes();
        }

        @Override // com.google.api.ResourceDescriptorOrBuilder
        public String getType() {
            return ((ResourceDescriptor) this.instance).getType();
        }

        @Override // com.google.api.ResourceDescriptorOrBuilder
        public xq1 getTypeBytes() {
            return ((ResourceDescriptor) this.instance).getTypeBytes();
        }

        public Builder setHistory(History history) {
            copyOnWrite();
            ((ResourceDescriptor) this.instance).setHistory(history);
            return this;
        }

        public Builder setHistoryValue(int i) {
            copyOnWrite();
            ((ResourceDescriptor) this.instance).setHistoryValue(i);
            return this;
        }

        public Builder setNameField(String str) {
            copyOnWrite();
            ((ResourceDescriptor) this.instance).setNameField(str);
            return this;
        }

        public Builder setNameFieldBytes(xq1 xq1Var) {
            copyOnWrite();
            ((ResourceDescriptor) this.instance).setNameFieldBytes(xq1Var);
            return this;
        }

        public Builder setPattern(int i, String str) {
            copyOnWrite();
            ((ResourceDescriptor) this.instance).setPattern(i, str);
            return this;
        }

        public Builder setPlural(String str) {
            copyOnWrite();
            ((ResourceDescriptor) this.instance).setPlural(str);
            return this;
        }

        public Builder setPluralBytes(xq1 xq1Var) {
            copyOnWrite();
            ((ResourceDescriptor) this.instance).setPluralBytes(xq1Var);
            return this;
        }

        public Builder setSingular(String str) {
            copyOnWrite();
            ((ResourceDescriptor) this.instance).setSingular(str);
            return this;
        }

        public Builder setSingularBytes(xq1 xq1Var) {
            copyOnWrite();
            ((ResourceDescriptor) this.instance).setSingularBytes(xq1Var);
            return this;
        }

        public Builder setType(String str) {
            copyOnWrite();
            ((ResourceDescriptor) this.instance).setType(str);
            return this;
        }

        public Builder setTypeBytes(xq1 xq1Var) {
            copyOnWrite();
            ((ResourceDescriptor) this.instance).setTypeBytes(xq1Var);
            return this;
        }

        private Builder() {
            super(ResourceDescriptor.DEFAULT_INSTANCE);
        }
    }

    public enum History implements yn8.InterfaceC18439c {
        HISTORY_UNSPECIFIED(0),
        ORIGINALLY_SINGLE_PATTERN(1),
        FUTURE_MULTI_PATTERN(2),
        UNRECOGNIZED(-1);

        public static final int FUTURE_MULTI_PATTERN_VALUE = 2;
        public static final int HISTORY_UNSPECIFIED_VALUE = 0;
        public static final int ORIGINALLY_SINGLE_PATTERN_VALUE = 1;
        private static final yn8.InterfaceC18440d internalValueMap = new yn8.InterfaceC18440d() { // from class: com.google.api.ResourceDescriptor.History.1
            @Override // p001o.yn8.InterfaceC18440d
            public History findValueByNumber(int i) {
                return History.forNumber(i);
            }
        };
        private final int value;

        public static final class HistoryVerifier implements yn8.InterfaceC18441e {
            static final yn8.InterfaceC18441e INSTANCE = new HistoryVerifier();

            private HistoryVerifier() {
            }

            @Override // p001o.yn8.InterfaceC18441e
            public boolean isInRange(int i) {
                return History.forNumber(i) != null;
            }
        }

        History(int i) {
            this.value = i;
        }

        public static History forNumber(int i) {
            if (i == 0) {
                return HISTORY_UNSPECIFIED;
            }
            if (i == 1) {
                return ORIGINALLY_SINGLE_PATTERN;
            }
            if (i != 2) {
                return null;
            }
            return FUTURE_MULTI_PATTERN;
        }

        public static yn8.InterfaceC18440d internalGetValueMap() {
            return internalValueMap;
        }

        public static yn8.InterfaceC18441e internalGetVerifier() {
            return HistoryVerifier.INSTANCE;
        }

        @Override // p001o.yn8.InterfaceC18439c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static History valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        ResourceDescriptor resourceDescriptor = new ResourceDescriptor();
        DEFAULT_INSTANCE = resourceDescriptor;
        wn7.registerDefaultInstance(ResourceDescriptor.class, resourceDescriptor);
    }

    private ResourceDescriptor() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPattern(Iterable<String> iterable) {
        ensurePatternIsMutable();
        r8.addAll((Iterable) iterable, (List) this.pattern_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPattern(String str) {
        str.getClass();
        ensurePatternIsMutable();
        this.pattern_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPatternBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        ensurePatternIsMutable();
        this.pattern_.add(xq1Var.m56593N());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHistory() {
        this.history_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNameField() {
        this.nameField_ = getDefaultInstance().getNameField();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPattern() {
        this.pattern_ = wn7.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlural() {
        this.plural_ = getDefaultInstance().getPlural();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSingular() {
        this.singular_ = getDefaultInstance().getSingular();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = getDefaultInstance().getType();
    }

    private void ensurePatternIsMutable() {
        yn8.InterfaceC18446j interfaceC18446j = this.pattern_;
        if (interfaceC18446j.mo28212k()) {
            return;
        }
        this.pattern_ = wn7.mutableCopy(interfaceC18446j);
    }

    public static ResourceDescriptor getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ResourceDescriptor parseDelimitedFrom(InputStream inputStream) {
        return (ResourceDescriptor) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ResourceDescriptor parseFrom(ByteBuffer byteBuffer) {
        return (ResourceDescriptor) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hxc parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHistory(History history) {
        this.history_ = history.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHistoryValue(int i) {
        this.history_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameField(String str) {
        str.getClass();
        this.nameField_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameFieldBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        this.nameField_ = xq1Var.m56593N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPattern(int i, String str) {
        str.getClass();
        ensurePatternIsMutable();
        this.pattern_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlural(String str) {
        str.getClass();
        this.plural_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPluralBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        this.plural_ = xq1Var.m56593N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSingular(String str) {
        str.getClass();
        this.singular_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSingularBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        this.singular_ = xq1Var.m56593N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(String str) {
        str.getClass();
        this.type_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        this.type_ = xq1Var.m56593N();
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C112321 c112321 = null;
        switch (C112321.f13323xa1df5c61[enumC17940g.ordinal()]) {
            case 1:
                return new ResourceDescriptor();
            case 2:
                return new Builder(c112321);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ț\u0003Ȉ\u0004\f\u0005Ȉ\u0006Ȉ", new Object[]{"type_", "pattern_", "nameField_", "history_", "plural_", "singular_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (ResourceDescriptor.class) {
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

    @Override // com.google.api.ResourceDescriptorOrBuilder
    public History getHistory() {
        History historyForNumber = History.forNumber(this.history_);
        return historyForNumber == null ? History.UNRECOGNIZED : historyForNumber;
    }

    @Override // com.google.api.ResourceDescriptorOrBuilder
    public int getHistoryValue() {
        return this.history_;
    }

    @Override // com.google.api.ResourceDescriptorOrBuilder
    public String getNameField() {
        return this.nameField_;
    }

    @Override // com.google.api.ResourceDescriptorOrBuilder
    public xq1 getNameFieldBytes() {
        return xq1.m56589q(this.nameField_);
    }

    @Override // com.google.api.ResourceDescriptorOrBuilder
    public String getPattern(int i) {
        return (String) this.pattern_.get(i);
    }

    @Override // com.google.api.ResourceDescriptorOrBuilder
    public xq1 getPatternBytes(int i) {
        return xq1.m56589q((String) this.pattern_.get(i));
    }

    @Override // com.google.api.ResourceDescriptorOrBuilder
    public int getPatternCount() {
        return this.pattern_.size();
    }

    @Override // com.google.api.ResourceDescriptorOrBuilder
    public List<String> getPatternList() {
        return this.pattern_;
    }

    @Override // com.google.api.ResourceDescriptorOrBuilder
    public String getPlural() {
        return this.plural_;
    }

    @Override // com.google.api.ResourceDescriptorOrBuilder
    public xq1 getPluralBytes() {
        return xq1.m56589q(this.plural_);
    }

    @Override // com.google.api.ResourceDescriptorOrBuilder
    public String getSingular() {
        return this.singular_;
    }

    @Override // com.google.api.ResourceDescriptorOrBuilder
    public xq1 getSingularBytes() {
        return xq1.m56589q(this.singular_);
    }

    @Override // com.google.api.ResourceDescriptorOrBuilder
    public String getType() {
        return this.type_;
    }

    @Override // com.google.api.ResourceDescriptorOrBuilder
    public xq1 getTypeBytes() {
        return xq1.m56589q(this.type_);
    }

    public static Builder newBuilder(ResourceDescriptor resourceDescriptor) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(resourceDescriptor);
    }

    public static ResourceDescriptor parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
        return (ResourceDescriptor) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static ResourceDescriptor parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
        return (ResourceDescriptor) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
    }

    public static ResourceDescriptor parseFrom(xq1 xq1Var) {
        return (ResourceDescriptor) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
    }

    public static ResourceDescriptor parseFrom(xq1 xq1Var, qp6 qp6Var) {
        return (ResourceDescriptor) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
    }

    public static ResourceDescriptor parseFrom(byte[] bArr) {
        return (ResourceDescriptor) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ResourceDescriptor parseFrom(byte[] bArr, qp6 qp6Var) {
        return (ResourceDescriptor) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
    }

    public static ResourceDescriptor parseFrom(InputStream inputStream) {
        return (ResourceDescriptor) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ResourceDescriptor parseFrom(InputStream inputStream, qp6 qp6Var) {
        return (ResourceDescriptor) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static ResourceDescriptor parseFrom(jf3 jf3Var) {
        return (ResourceDescriptor) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
    }

    public static ResourceDescriptor parseFrom(jf3 jf3Var, qp6 qp6Var) {
        return (ResourceDescriptor) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
    }
}
