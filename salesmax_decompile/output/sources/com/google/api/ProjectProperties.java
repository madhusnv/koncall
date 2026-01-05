package com.google.api;

import com.google.api.Property;
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
public final class ProjectProperties extends wn7 implements ProjectPropertiesOrBuilder {
    private static final ProjectProperties DEFAULT_INSTANCE;
    private static volatile hxc PARSER = null;
    public static final int PROPERTIES_FIELD_NUMBER = 1;
    private yn8.InterfaceC18446j properties_ = wn7.emptyProtobufList();

    /* renamed from: com.google.api.ProjectProperties$1 */
    public static /* synthetic */ class C112271 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f13319xa1df5c61;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f13319xa1df5c61 = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13319xa1df5c61[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13319xa1df5c61[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13319xa1df5c61[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13319xa1df5c61[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13319xa1df5c61[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13319xa1df5c61[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends wn7.AbstractC17934a implements ProjectPropertiesOrBuilder {
        public /* synthetic */ Builder(C112271 c112271) {
            this();
        }

        public Builder addAllProperties(Iterable<? extends Property> iterable) {
            copyOnWrite();
            ((ProjectProperties) this.instance).addAllProperties(iterable);
            return this;
        }

        public Builder addProperties(Property property) {
            copyOnWrite();
            ((ProjectProperties) this.instance).addProperties(property);
            return this;
        }

        public Builder clearProperties() {
            copyOnWrite();
            ((ProjectProperties) this.instance).clearProperties();
            return this;
        }

        @Override // com.google.api.ProjectPropertiesOrBuilder
        public Property getProperties(int i) {
            return ((ProjectProperties) this.instance).getProperties(i);
        }

        @Override // com.google.api.ProjectPropertiesOrBuilder
        public int getPropertiesCount() {
            return ((ProjectProperties) this.instance).getPropertiesCount();
        }

        @Override // com.google.api.ProjectPropertiesOrBuilder
        public List<Property> getPropertiesList() {
            return Collections.unmodifiableList(((ProjectProperties) this.instance).getPropertiesList());
        }

        public Builder removeProperties(int i) {
            copyOnWrite();
            ((ProjectProperties) this.instance).removeProperties(i);
            return this;
        }

        public Builder setProperties(int i, Property property) {
            copyOnWrite();
            ((ProjectProperties) this.instance).setProperties(i, property);
            return this;
        }

        private Builder() {
            super(ProjectProperties.DEFAULT_INSTANCE);
        }

        public Builder addProperties(int i, Property property) {
            copyOnWrite();
            ((ProjectProperties) this.instance).addProperties(i, property);
            return this;
        }

        public Builder setProperties(int i, Property.Builder builder) {
            copyOnWrite();
            ((ProjectProperties) this.instance).setProperties(i, (Property) builder.build());
            return this;
        }

        public Builder addProperties(Property.Builder builder) {
            copyOnWrite();
            ((ProjectProperties) this.instance).addProperties((Property) builder.build());
            return this;
        }

        public Builder addProperties(int i, Property.Builder builder) {
            copyOnWrite();
            ((ProjectProperties) this.instance).addProperties(i, (Property) builder.build());
            return this;
        }
    }

    static {
        ProjectProperties projectProperties = new ProjectProperties();
        DEFAULT_INSTANCE = projectProperties;
        wn7.registerDefaultInstance(ProjectProperties.class, projectProperties);
    }

    private ProjectProperties() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllProperties(Iterable<? extends Property> iterable) {
        ensurePropertiesIsMutable();
        r8.addAll((Iterable) iterable, (List) this.properties_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProperties(Property property) {
        property.getClass();
        ensurePropertiesIsMutable();
        this.properties_.add(property);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProperties() {
        this.properties_ = wn7.emptyProtobufList();
    }

    private void ensurePropertiesIsMutable() {
        yn8.InterfaceC18446j interfaceC18446j = this.properties_;
        if (interfaceC18446j.mo28212k()) {
            return;
        }
        this.properties_ = wn7.mutableCopy(interfaceC18446j);
    }

    public static ProjectProperties getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ProjectProperties parseDelimitedFrom(InputStream inputStream) {
        return (ProjectProperties) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ProjectProperties parseFrom(ByteBuffer byteBuffer) {
        return (ProjectProperties) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hxc parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeProperties(int i) {
        ensurePropertiesIsMutable();
        this.properties_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProperties(int i, Property property) {
        property.getClass();
        ensurePropertiesIsMutable();
        this.properties_.set(i, property);
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C112271 c112271 = null;
        switch (C112271.f13319xa1df5c61[enumC17940g.ordinal()]) {
            case 1:
                return new ProjectProperties();
            case 2:
                return new Builder(c112271);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"properties_", Property.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (ProjectProperties.class) {
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

    @Override // com.google.api.ProjectPropertiesOrBuilder
    public Property getProperties(int i) {
        return (Property) this.properties_.get(i);
    }

    @Override // com.google.api.ProjectPropertiesOrBuilder
    public int getPropertiesCount() {
        return this.properties_.size();
    }

    @Override // com.google.api.ProjectPropertiesOrBuilder
    public List<Property> getPropertiesList() {
        return this.properties_;
    }

    public PropertyOrBuilder getPropertiesOrBuilder(int i) {
        return (PropertyOrBuilder) this.properties_.get(i);
    }

    public List<? extends PropertyOrBuilder> getPropertiesOrBuilderList() {
        return this.properties_;
    }

    public static Builder newBuilder(ProjectProperties projectProperties) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(projectProperties);
    }

    public static ProjectProperties parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
        return (ProjectProperties) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static ProjectProperties parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
        return (ProjectProperties) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
    }

    public static ProjectProperties parseFrom(xq1 xq1Var) {
        return (ProjectProperties) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProperties(int i, Property property) {
        property.getClass();
        ensurePropertiesIsMutable();
        this.properties_.add(i, property);
    }

    public static ProjectProperties parseFrom(xq1 xq1Var, qp6 qp6Var) {
        return (ProjectProperties) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
    }

    public static ProjectProperties parseFrom(byte[] bArr) {
        return (ProjectProperties) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ProjectProperties parseFrom(byte[] bArr, qp6 qp6Var) {
        return (ProjectProperties) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
    }

    public static ProjectProperties parseFrom(InputStream inputStream) {
        return (ProjectProperties) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ProjectProperties parseFrom(InputStream inputStream, qp6 qp6Var) {
        return (ProjectProperties) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static ProjectProperties parseFrom(jf3 jf3Var) {
        return (ProjectProperties) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
    }

    public static ProjectProperties parseFrom(jf3 jf3Var, qp6 qp6Var) {
        return (ProjectProperties) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
    }
}
