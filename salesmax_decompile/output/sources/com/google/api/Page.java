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
public final class Page extends wn7 implements PageOrBuilder {
    public static final int CONTENT_FIELD_NUMBER = 2;
    private static final Page DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile hxc PARSER = null;
    public static final int SUBPAGES_FIELD_NUMBER = 3;
    private String name_ = "";
    private String content_ = "";
    private yn8.InterfaceC18446j subpages_ = wn7.emptyProtobufList();

    /* renamed from: com.google.api.Page$1 */
    public static /* synthetic */ class C112261 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f13318xa1df5c61;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f13318xa1df5c61 = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13318xa1df5c61[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13318xa1df5c61[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13318xa1df5c61[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13318xa1df5c61[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13318xa1df5c61[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13318xa1df5c61[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends wn7.AbstractC17934a implements PageOrBuilder {
        public /* synthetic */ Builder(C112261 c112261) {
            this();
        }

        public Builder addAllSubpages(Iterable<? extends Page> iterable) {
            copyOnWrite();
            ((Page) this.instance).addAllSubpages(iterable);
            return this;
        }

        public Builder addSubpages(Page page) {
            copyOnWrite();
            ((Page) this.instance).addSubpages(page);
            return this;
        }

        public Builder clearContent() {
            copyOnWrite();
            ((Page) this.instance).clearContent();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((Page) this.instance).clearName();
            return this;
        }

        public Builder clearSubpages() {
            copyOnWrite();
            ((Page) this.instance).clearSubpages();
            return this;
        }

        @Override // com.google.api.PageOrBuilder
        public String getContent() {
            return ((Page) this.instance).getContent();
        }

        @Override // com.google.api.PageOrBuilder
        public xq1 getContentBytes() {
            return ((Page) this.instance).getContentBytes();
        }

        @Override // com.google.api.PageOrBuilder
        public String getName() {
            return ((Page) this.instance).getName();
        }

        @Override // com.google.api.PageOrBuilder
        public xq1 getNameBytes() {
            return ((Page) this.instance).getNameBytes();
        }

        @Override // com.google.api.PageOrBuilder
        public Page getSubpages(int i) {
            return ((Page) this.instance).getSubpages(i);
        }

        @Override // com.google.api.PageOrBuilder
        public int getSubpagesCount() {
            return ((Page) this.instance).getSubpagesCount();
        }

        @Override // com.google.api.PageOrBuilder
        public List<Page> getSubpagesList() {
            return Collections.unmodifiableList(((Page) this.instance).getSubpagesList());
        }

        public Builder removeSubpages(int i) {
            copyOnWrite();
            ((Page) this.instance).removeSubpages(i);
            return this;
        }

        public Builder setContent(String str) {
            copyOnWrite();
            ((Page) this.instance).setContent(str);
            return this;
        }

        public Builder setContentBytes(xq1 xq1Var) {
            copyOnWrite();
            ((Page) this.instance).setContentBytes(xq1Var);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((Page) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(xq1 xq1Var) {
            copyOnWrite();
            ((Page) this.instance).setNameBytes(xq1Var);
            return this;
        }

        public Builder setSubpages(int i, Page page) {
            copyOnWrite();
            ((Page) this.instance).setSubpages(i, page);
            return this;
        }

        private Builder() {
            super(Page.DEFAULT_INSTANCE);
        }

        public Builder addSubpages(int i, Page page) {
            copyOnWrite();
            ((Page) this.instance).addSubpages(i, page);
            return this;
        }

        public Builder setSubpages(int i, Builder builder) {
            copyOnWrite();
            ((Page) this.instance).setSubpages(i, (Page) builder.build());
            return this;
        }

        public Builder addSubpages(Builder builder) {
            copyOnWrite();
            ((Page) this.instance).addSubpages((Page) builder.build());
            return this;
        }

        public Builder addSubpages(int i, Builder builder) {
            copyOnWrite();
            ((Page) this.instance).addSubpages(i, (Page) builder.build());
            return this;
        }
    }

    static {
        Page page = new Page();
        DEFAULT_INSTANCE = page;
        wn7.registerDefaultInstance(Page.class, page);
    }

    private Page() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSubpages(Iterable<? extends Page> iterable) {
        ensureSubpagesIsMutable();
        r8.addAll((Iterable) iterable, (List) this.subpages_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSubpages(Page page) {
        page.getClass();
        ensureSubpagesIsMutable();
        this.subpages_.add(page);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContent() {
        this.content_ = getDefaultInstance().getContent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubpages() {
        this.subpages_ = wn7.emptyProtobufList();
    }

    private void ensureSubpagesIsMutable() {
        yn8.InterfaceC18446j interfaceC18446j = this.subpages_;
        if (interfaceC18446j.mo28212k()) {
            return;
        }
        this.subpages_ = wn7.mutableCopy(interfaceC18446j);
    }

    public static Page getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Page parseDelimitedFrom(InputStream inputStream) {
        return (Page) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Page parseFrom(ByteBuffer byteBuffer) {
        return (Page) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hxc parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSubpages(int i) {
        ensureSubpagesIsMutable();
        this.subpages_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContent(String str) {
        str.getClass();
        this.content_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContentBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        this.content_ = xq1Var.m56593N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        this.name_ = xq1Var.m56593N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubpages(int i, Page page) {
        page.getClass();
        ensureSubpagesIsMutable();
        this.subpages_.set(i, page);
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C112261 c112261 = null;
        switch (C112261.f13318xa1df5c61[enumC17940g.ordinal()]) {
            case 1:
                return new Page();
            case 2:
                return new Builder(c112261);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b", new Object[]{"name_", "content_", "subpages_", Page.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (Page.class) {
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

    @Override // com.google.api.PageOrBuilder
    public String getContent() {
        return this.content_;
    }

    @Override // com.google.api.PageOrBuilder
    public xq1 getContentBytes() {
        return xq1.m56589q(this.content_);
    }

    @Override // com.google.api.PageOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.google.api.PageOrBuilder
    public xq1 getNameBytes() {
        return xq1.m56589q(this.name_);
    }

    @Override // com.google.api.PageOrBuilder
    public Page getSubpages(int i) {
        return (Page) this.subpages_.get(i);
    }

    @Override // com.google.api.PageOrBuilder
    public int getSubpagesCount() {
        return this.subpages_.size();
    }

    @Override // com.google.api.PageOrBuilder
    public List<Page> getSubpagesList() {
        return this.subpages_;
    }

    public PageOrBuilder getSubpagesOrBuilder(int i) {
        return (PageOrBuilder) this.subpages_.get(i);
    }

    public List<? extends PageOrBuilder> getSubpagesOrBuilderList() {
        return this.subpages_;
    }

    public static Builder newBuilder(Page page) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(page);
    }

    public static Page parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
        return (Page) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static Page parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
        return (Page) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
    }

    public static Page parseFrom(xq1 xq1Var) {
        return (Page) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSubpages(int i, Page page) {
        page.getClass();
        ensureSubpagesIsMutable();
        this.subpages_.add(i, page);
    }

    public static Page parseFrom(xq1 xq1Var, qp6 qp6Var) {
        return (Page) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
    }

    public static Page parseFrom(byte[] bArr) {
        return (Page) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Page parseFrom(byte[] bArr, qp6 qp6Var) {
        return (Page) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
    }

    public static Page parseFrom(InputStream inputStream) {
        return (Page) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Page parseFrom(InputStream inputStream, qp6 qp6Var) {
        return (Page) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static Page parseFrom(jf3 jf3Var) {
        return (Page) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
    }

    public static Page parseFrom(jf3 jf3Var, qp6 qp6Var) {
        return (Page) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
    }
}
