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
public final class Control extends wn7 implements ControlOrBuilder {
    private static final Control DEFAULT_INSTANCE;
    public static final int ENVIRONMENT_FIELD_NUMBER = 1;
    private static volatile hxc PARSER;
    private String environment_ = "";

    /* renamed from: com.google.api.Control$1 */
    public static /* synthetic */ class C112001 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f13297xa1df5c61;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f13297xa1df5c61 = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13297xa1df5c61[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13297xa1df5c61[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13297xa1df5c61[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13297xa1df5c61[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13297xa1df5c61[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13297xa1df5c61[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends wn7.AbstractC17934a implements ControlOrBuilder {
        public /* synthetic */ Builder(C112001 c112001) {
            this();
        }

        public Builder clearEnvironment() {
            copyOnWrite();
            ((Control) this.instance).clearEnvironment();
            return this;
        }

        @Override // com.google.api.ControlOrBuilder
        public String getEnvironment() {
            return ((Control) this.instance).getEnvironment();
        }

        @Override // com.google.api.ControlOrBuilder
        public xq1 getEnvironmentBytes() {
            return ((Control) this.instance).getEnvironmentBytes();
        }

        public Builder setEnvironment(String str) {
            copyOnWrite();
            ((Control) this.instance).setEnvironment(str);
            return this;
        }

        public Builder setEnvironmentBytes(xq1 xq1Var) {
            copyOnWrite();
            ((Control) this.instance).setEnvironmentBytes(xq1Var);
            return this;
        }

        private Builder() {
            super(Control.DEFAULT_INSTANCE);
        }
    }

    static {
        Control control = new Control();
        DEFAULT_INSTANCE = control;
        wn7.registerDefaultInstance(Control.class, control);
    }

    private Control() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnvironment() {
        this.environment_ = getDefaultInstance().getEnvironment();
    }

    public static Control getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Control parseDelimitedFrom(InputStream inputStream) {
        return (Control) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Control parseFrom(ByteBuffer byteBuffer) {
        return (Control) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hxc parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnvironment(String str) {
        str.getClass();
        this.environment_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnvironmentBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        this.environment_ = xq1Var.m56593N();
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C112001 c112001 = null;
        switch (C112001.f13297xa1df5c61[enumC17940g.ordinal()]) {
            case 1:
                return new Control();
            case 2:
                return new Builder(c112001);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"environment_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (Control.class) {
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

    @Override // com.google.api.ControlOrBuilder
    public String getEnvironment() {
        return this.environment_;
    }

    @Override // com.google.api.ControlOrBuilder
    public xq1 getEnvironmentBytes() {
        return xq1.m56589q(this.environment_);
    }

    public static Builder newBuilder(Control control) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(control);
    }

    public static Control parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
        return (Control) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static Control parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
        return (Control) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
    }

    public static Control parseFrom(xq1 xq1Var) {
        return (Control) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
    }

    public static Control parseFrom(xq1 xq1Var, qp6 qp6Var) {
        return (Control) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
    }

    public static Control parseFrom(byte[] bArr) {
        return (Control) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Control parseFrom(byte[] bArr, qp6 qp6Var) {
        return (Control) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
    }

    public static Control parseFrom(InputStream inputStream) {
        return (Control) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Control parseFrom(InputStream inputStream, qp6 qp6Var) {
        return (Control) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static Control parseFrom(jf3 jf3Var) {
        return (Control) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
    }

    public static Control parseFrom(jf3 jf3Var, qp6 qp6Var) {
        return (Control) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
    }
}
