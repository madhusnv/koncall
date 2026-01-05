package com.google.api;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p001o.hxc;
import p001o.jf3;
import p001o.qp6;
import p001o.r8;
import p001o.wh0;
import p001o.wn7;
import p001o.xh0;
import p001o.xq1;
import p001o.yn8;

/* loaded from: classes3.dex */
public final class SourceInfo extends wn7 implements SourceInfoOrBuilder {
    private static final SourceInfo DEFAULT_INSTANCE;
    private static volatile hxc PARSER = null;
    public static final int SOURCE_FILES_FIELD_NUMBER = 1;
    private yn8.InterfaceC18446j sourceFiles_ = wn7.emptyProtobufList();

    /* renamed from: com.google.api.SourceInfo$1 */
    public static /* synthetic */ class C112361 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f13326xa1df5c61;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f13326xa1df5c61 = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13326xa1df5c61[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13326xa1df5c61[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13326xa1df5c61[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13326xa1df5c61[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13326xa1df5c61[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13326xa1df5c61[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends wn7.AbstractC17934a implements SourceInfoOrBuilder {
        public /* synthetic */ Builder(C112361 c112361) {
            this();
        }

        public Builder addAllSourceFiles(Iterable<? extends wh0> iterable) {
            copyOnWrite();
            ((SourceInfo) this.instance).addAllSourceFiles(iterable);
            return this;
        }

        public Builder addSourceFiles(wh0 wh0Var) {
            copyOnWrite();
            ((SourceInfo) this.instance).addSourceFiles(wh0Var);
            return this;
        }

        public Builder clearSourceFiles() {
            copyOnWrite();
            ((SourceInfo) this.instance).clearSourceFiles();
            return this;
        }

        @Override // com.google.api.SourceInfoOrBuilder
        public wh0 getSourceFiles(int i) {
            return ((SourceInfo) this.instance).getSourceFiles(i);
        }

        @Override // com.google.api.SourceInfoOrBuilder
        public int getSourceFilesCount() {
            return ((SourceInfo) this.instance).getSourceFilesCount();
        }

        @Override // com.google.api.SourceInfoOrBuilder
        public List<wh0> getSourceFilesList() {
            return Collections.unmodifiableList(((SourceInfo) this.instance).getSourceFilesList());
        }

        public Builder removeSourceFiles(int i) {
            copyOnWrite();
            ((SourceInfo) this.instance).removeSourceFiles(i);
            return this;
        }

        public Builder setSourceFiles(int i, wh0 wh0Var) {
            copyOnWrite();
            ((SourceInfo) this.instance).setSourceFiles(i, wh0Var);
            return this;
        }

        private Builder() {
            super(SourceInfo.DEFAULT_INSTANCE);
        }

        public Builder addSourceFiles(int i, wh0 wh0Var) {
            copyOnWrite();
            ((SourceInfo) this.instance).addSourceFiles(i, wh0Var);
            return this;
        }

        public Builder setSourceFiles(int i, wh0.C17863b c17863b) {
            copyOnWrite();
            ((SourceInfo) this.instance).setSourceFiles(i, (wh0) c17863b.build());
            return this;
        }

        public Builder addSourceFiles(wh0.C17863b c17863b) {
            copyOnWrite();
            ((SourceInfo) this.instance).addSourceFiles((wh0) c17863b.build());
            return this;
        }

        public Builder addSourceFiles(int i, wh0.C17863b c17863b) {
            copyOnWrite();
            ((SourceInfo) this.instance).addSourceFiles(i, (wh0) c17863b.build());
            return this;
        }
    }

    static {
        SourceInfo sourceInfo = new SourceInfo();
        DEFAULT_INSTANCE = sourceInfo;
        wn7.registerDefaultInstance(SourceInfo.class, sourceInfo);
    }

    private SourceInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSourceFiles(Iterable<? extends wh0> iterable) {
        ensureSourceFilesIsMutable();
        r8.addAll((Iterable) iterable, (List) this.sourceFiles_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSourceFiles(wh0 wh0Var) {
        wh0Var.getClass();
        ensureSourceFilesIsMutable();
        this.sourceFiles_.add(wh0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSourceFiles() {
        this.sourceFiles_ = wn7.emptyProtobufList();
    }

    private void ensureSourceFilesIsMutable() {
        yn8.InterfaceC18446j interfaceC18446j = this.sourceFiles_;
        if (interfaceC18446j.mo28212k()) {
            return;
        }
        this.sourceFiles_ = wn7.mutableCopy(interfaceC18446j);
    }

    public static SourceInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static SourceInfo parseDelimitedFrom(InputStream inputStream) {
        return (SourceInfo) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SourceInfo parseFrom(ByteBuffer byteBuffer) {
        return (SourceInfo) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hxc parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSourceFiles(int i) {
        ensureSourceFilesIsMutable();
        this.sourceFiles_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceFiles(int i, wh0 wh0Var) {
        wh0Var.getClass();
        ensureSourceFilesIsMutable();
        this.sourceFiles_.set(i, wh0Var);
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C112361 c112361 = null;
        switch (C112361.f13326xa1df5c61[enumC17940g.ordinal()]) {
            case 1:
                return new SourceInfo();
            case 2:
                return new Builder(c112361);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"sourceFiles_", wh0.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (SourceInfo.class) {
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

    @Override // com.google.api.SourceInfoOrBuilder
    public wh0 getSourceFiles(int i) {
        return (wh0) this.sourceFiles_.get(i);
    }

    @Override // com.google.api.SourceInfoOrBuilder
    public int getSourceFilesCount() {
        return this.sourceFiles_.size();
    }

    @Override // com.google.api.SourceInfoOrBuilder
    public List<wh0> getSourceFilesList() {
        return this.sourceFiles_;
    }

    public xh0 getSourceFilesOrBuilder(int i) {
        return (xh0) this.sourceFiles_.get(i);
    }

    public List<? extends xh0> getSourceFilesOrBuilderList() {
        return this.sourceFiles_;
    }

    public static Builder newBuilder(SourceInfo sourceInfo) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(sourceInfo);
    }

    public static SourceInfo parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
        return (SourceInfo) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static SourceInfo parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
        return (SourceInfo) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
    }

    public static SourceInfo parseFrom(xq1 xq1Var) {
        return (SourceInfo) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSourceFiles(int i, wh0 wh0Var) {
        wh0Var.getClass();
        ensureSourceFilesIsMutable();
        this.sourceFiles_.add(i, wh0Var);
    }

    public static SourceInfo parseFrom(xq1 xq1Var, qp6 qp6Var) {
        return (SourceInfo) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
    }

    public static SourceInfo parseFrom(byte[] bArr) {
        return (SourceInfo) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SourceInfo parseFrom(byte[] bArr, qp6 qp6Var) {
        return (SourceInfo) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
    }

    public static SourceInfo parseFrom(InputStream inputStream) {
        return (SourceInfo) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SourceInfo parseFrom(InputStream inputStream, qp6 qp6Var) {
        return (SourceInfo) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static SourceInfo parseFrom(jf3 jf3Var) {
        return (SourceInfo) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
    }

    public static SourceInfo parseFrom(jf3 jf3Var, qp6 qp6Var) {
        return (SourceInfo) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
    }
}
