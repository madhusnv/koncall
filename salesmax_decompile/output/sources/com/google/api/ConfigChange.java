package com.google.api;

import com.google.api.Advice;
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
public final class ConfigChange extends wn7 implements ConfigChangeOrBuilder {
    public static final int ADVICES_FIELD_NUMBER = 5;
    public static final int CHANGE_TYPE_FIELD_NUMBER = 4;
    private static final ConfigChange DEFAULT_INSTANCE;
    public static final int ELEMENT_FIELD_NUMBER = 1;
    public static final int NEW_VALUE_FIELD_NUMBER = 3;
    public static final int OLD_VALUE_FIELD_NUMBER = 2;
    private static volatile hxc PARSER;
    private int changeType_;
    private String element_ = "";
    private String oldValue_ = "";
    private String newValue_ = "";
    private yn8.InterfaceC18446j advices_ = wn7.emptyProtobufList();

    /* renamed from: com.google.api.ConfigChange$1 */
    public static /* synthetic */ class C111971 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f13294xa1df5c61;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f13294xa1df5c61 = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13294xa1df5c61[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13294xa1df5c61[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13294xa1df5c61[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13294xa1df5c61[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13294xa1df5c61[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13294xa1df5c61[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends wn7.AbstractC17934a implements ConfigChangeOrBuilder {
        public /* synthetic */ Builder(C111971 c111971) {
            this();
        }

        public Builder addAdvices(Advice advice) {
            copyOnWrite();
            ((ConfigChange) this.instance).addAdvices(advice);
            return this;
        }

        public Builder addAllAdvices(Iterable<? extends Advice> iterable) {
            copyOnWrite();
            ((ConfigChange) this.instance).addAllAdvices(iterable);
            return this;
        }

        public Builder clearAdvices() {
            copyOnWrite();
            ((ConfigChange) this.instance).clearAdvices();
            return this;
        }

        public Builder clearChangeType() {
            copyOnWrite();
            ((ConfigChange) this.instance).clearChangeType();
            return this;
        }

        public Builder clearElement() {
            copyOnWrite();
            ((ConfigChange) this.instance).clearElement();
            return this;
        }

        public Builder clearNewValue() {
            copyOnWrite();
            ((ConfigChange) this.instance).clearNewValue();
            return this;
        }

        public Builder clearOldValue() {
            copyOnWrite();
            ((ConfigChange) this.instance).clearOldValue();
            return this;
        }

        @Override // com.google.api.ConfigChangeOrBuilder
        public Advice getAdvices(int i) {
            return ((ConfigChange) this.instance).getAdvices(i);
        }

        @Override // com.google.api.ConfigChangeOrBuilder
        public int getAdvicesCount() {
            return ((ConfigChange) this.instance).getAdvicesCount();
        }

        @Override // com.google.api.ConfigChangeOrBuilder
        public List<Advice> getAdvicesList() {
            return Collections.unmodifiableList(((ConfigChange) this.instance).getAdvicesList());
        }

        @Override // com.google.api.ConfigChangeOrBuilder
        public ChangeType getChangeType() {
            return ((ConfigChange) this.instance).getChangeType();
        }

        @Override // com.google.api.ConfigChangeOrBuilder
        public int getChangeTypeValue() {
            return ((ConfigChange) this.instance).getChangeTypeValue();
        }

        @Override // com.google.api.ConfigChangeOrBuilder
        public String getElement() {
            return ((ConfigChange) this.instance).getElement();
        }

        @Override // com.google.api.ConfigChangeOrBuilder
        public xq1 getElementBytes() {
            return ((ConfigChange) this.instance).getElementBytes();
        }

        @Override // com.google.api.ConfigChangeOrBuilder
        public String getNewValue() {
            return ((ConfigChange) this.instance).getNewValue();
        }

        @Override // com.google.api.ConfigChangeOrBuilder
        public xq1 getNewValueBytes() {
            return ((ConfigChange) this.instance).getNewValueBytes();
        }

        @Override // com.google.api.ConfigChangeOrBuilder
        public String getOldValue() {
            return ((ConfigChange) this.instance).getOldValue();
        }

        @Override // com.google.api.ConfigChangeOrBuilder
        public xq1 getOldValueBytes() {
            return ((ConfigChange) this.instance).getOldValueBytes();
        }

        public Builder removeAdvices(int i) {
            copyOnWrite();
            ((ConfigChange) this.instance).removeAdvices(i);
            return this;
        }

        public Builder setAdvices(int i, Advice advice) {
            copyOnWrite();
            ((ConfigChange) this.instance).setAdvices(i, advice);
            return this;
        }

        public Builder setChangeType(ChangeType changeType) {
            copyOnWrite();
            ((ConfigChange) this.instance).setChangeType(changeType);
            return this;
        }

        public Builder setChangeTypeValue(int i) {
            copyOnWrite();
            ((ConfigChange) this.instance).setChangeTypeValue(i);
            return this;
        }

        public Builder setElement(String str) {
            copyOnWrite();
            ((ConfigChange) this.instance).setElement(str);
            return this;
        }

        public Builder setElementBytes(xq1 xq1Var) {
            copyOnWrite();
            ((ConfigChange) this.instance).setElementBytes(xq1Var);
            return this;
        }

        public Builder setNewValue(String str) {
            copyOnWrite();
            ((ConfigChange) this.instance).setNewValue(str);
            return this;
        }

        public Builder setNewValueBytes(xq1 xq1Var) {
            copyOnWrite();
            ((ConfigChange) this.instance).setNewValueBytes(xq1Var);
            return this;
        }

        public Builder setOldValue(String str) {
            copyOnWrite();
            ((ConfigChange) this.instance).setOldValue(str);
            return this;
        }

        public Builder setOldValueBytes(xq1 xq1Var) {
            copyOnWrite();
            ((ConfigChange) this.instance).setOldValueBytes(xq1Var);
            return this;
        }

        private Builder() {
            super(ConfigChange.DEFAULT_INSTANCE);
        }

        public Builder addAdvices(int i, Advice advice) {
            copyOnWrite();
            ((ConfigChange) this.instance).addAdvices(i, advice);
            return this;
        }

        public Builder setAdvices(int i, Advice.Builder builder) {
            copyOnWrite();
            ((ConfigChange) this.instance).setAdvices(i, (Advice) builder.build());
            return this;
        }

        public Builder addAdvices(Advice.Builder builder) {
            copyOnWrite();
            ((ConfigChange) this.instance).addAdvices((Advice) builder.build());
            return this;
        }

        public Builder addAdvices(int i, Advice.Builder builder) {
            copyOnWrite();
            ((ConfigChange) this.instance).addAdvices(i, (Advice) builder.build());
            return this;
        }
    }

    static {
        ConfigChange configChange = new ConfigChange();
        DEFAULT_INSTANCE = configChange;
        wn7.registerDefaultInstance(ConfigChange.class, configChange);
    }

    private ConfigChange() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAdvices(Advice advice) {
        advice.getClass();
        ensureAdvicesIsMutable();
        this.advices_.add(advice);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAdvices(Iterable<? extends Advice> iterable) {
        ensureAdvicesIsMutable();
        r8.addAll((Iterable) iterable, (List) this.advices_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdvices() {
        this.advices_ = wn7.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChangeType() {
        this.changeType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearElement() {
        this.element_ = getDefaultInstance().getElement();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNewValue() {
        this.newValue_ = getDefaultInstance().getNewValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOldValue() {
        this.oldValue_ = getDefaultInstance().getOldValue();
    }

    private void ensureAdvicesIsMutable() {
        yn8.InterfaceC18446j interfaceC18446j = this.advices_;
        if (interfaceC18446j.mo28212k()) {
            return;
        }
        this.advices_ = wn7.mutableCopy(interfaceC18446j);
    }

    public static ConfigChange getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ConfigChange parseDelimitedFrom(InputStream inputStream) {
        return (ConfigChange) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ConfigChange parseFrom(ByteBuffer byteBuffer) {
        return (ConfigChange) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hxc parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAdvices(int i) {
        ensureAdvicesIsMutable();
        this.advices_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdvices(int i, Advice advice) {
        advice.getClass();
        ensureAdvicesIsMutable();
        this.advices_.set(i, advice);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangeType(ChangeType changeType) {
        this.changeType_ = changeType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangeTypeValue(int i) {
        this.changeType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setElement(String str) {
        str.getClass();
        this.element_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setElementBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        this.element_ = xq1Var.m56593N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewValue(String str) {
        str.getClass();
        this.newValue_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewValueBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        this.newValue_ = xq1Var.m56593N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOldValue(String str) {
        str.getClass();
        this.oldValue_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOldValueBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        this.oldValue_ = xq1Var.m56593N();
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C111971 c111971 = null;
        switch (C111971.f13294xa1df5c61[enumC17940g.ordinal()]) {
            case 1:
                return new ConfigChange();
            case 2:
                return new Builder(c111971);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f\u0005\u001b", new Object[]{"element_", "oldValue_", "newValue_", "changeType_", "advices_", Advice.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (ConfigChange.class) {
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

    @Override // com.google.api.ConfigChangeOrBuilder
    public Advice getAdvices(int i) {
        return (Advice) this.advices_.get(i);
    }

    @Override // com.google.api.ConfigChangeOrBuilder
    public int getAdvicesCount() {
        return this.advices_.size();
    }

    @Override // com.google.api.ConfigChangeOrBuilder
    public List<Advice> getAdvicesList() {
        return this.advices_;
    }

    public AdviceOrBuilder getAdvicesOrBuilder(int i) {
        return (AdviceOrBuilder) this.advices_.get(i);
    }

    public List<? extends AdviceOrBuilder> getAdvicesOrBuilderList() {
        return this.advices_;
    }

    @Override // com.google.api.ConfigChangeOrBuilder
    public ChangeType getChangeType() {
        ChangeType changeTypeForNumber = ChangeType.forNumber(this.changeType_);
        return changeTypeForNumber == null ? ChangeType.UNRECOGNIZED : changeTypeForNumber;
    }

    @Override // com.google.api.ConfigChangeOrBuilder
    public int getChangeTypeValue() {
        return this.changeType_;
    }

    @Override // com.google.api.ConfigChangeOrBuilder
    public String getElement() {
        return this.element_;
    }

    @Override // com.google.api.ConfigChangeOrBuilder
    public xq1 getElementBytes() {
        return xq1.m56589q(this.element_);
    }

    @Override // com.google.api.ConfigChangeOrBuilder
    public String getNewValue() {
        return this.newValue_;
    }

    @Override // com.google.api.ConfigChangeOrBuilder
    public xq1 getNewValueBytes() {
        return xq1.m56589q(this.newValue_);
    }

    @Override // com.google.api.ConfigChangeOrBuilder
    public String getOldValue() {
        return this.oldValue_;
    }

    @Override // com.google.api.ConfigChangeOrBuilder
    public xq1 getOldValueBytes() {
        return xq1.m56589q(this.oldValue_);
    }

    public static Builder newBuilder(ConfigChange configChange) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(configChange);
    }

    public static ConfigChange parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
        return (ConfigChange) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static ConfigChange parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
        return (ConfigChange) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
    }

    public static ConfigChange parseFrom(xq1 xq1Var) {
        return (ConfigChange) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAdvices(int i, Advice advice) {
        advice.getClass();
        ensureAdvicesIsMutable();
        this.advices_.add(i, advice);
    }

    public static ConfigChange parseFrom(xq1 xq1Var, qp6 qp6Var) {
        return (ConfigChange) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
    }

    public static ConfigChange parseFrom(byte[] bArr) {
        return (ConfigChange) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ConfigChange parseFrom(byte[] bArr, qp6 qp6Var) {
        return (ConfigChange) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
    }

    public static ConfigChange parseFrom(InputStream inputStream) {
        return (ConfigChange) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ConfigChange parseFrom(InputStream inputStream, qp6 qp6Var) {
        return (ConfigChange) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static ConfigChange parseFrom(jf3 jf3Var) {
        return (ConfigChange) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
    }

    public static ConfigChange parseFrom(jf3 jf3Var, qp6 qp6Var) {
        return (ConfigChange) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
    }
}
