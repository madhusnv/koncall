package com.google.api;

import com.google.api.DocumentationRule;
import com.google.api.Page;
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
public final class Documentation extends wn7 implements DocumentationOrBuilder {
    private static final Documentation DEFAULT_INSTANCE;
    public static final int DOCUMENTATION_ROOT_URL_FIELD_NUMBER = 4;
    public static final int OVERVIEW_FIELD_NUMBER = 2;
    public static final int PAGES_FIELD_NUMBER = 5;
    private static volatile hxc PARSER = null;
    public static final int RULES_FIELD_NUMBER = 3;
    public static final int SUMMARY_FIELD_NUMBER = 1;
    private String summary_ = "";
    private yn8.InterfaceC18446j pages_ = wn7.emptyProtobufList();
    private yn8.InterfaceC18446j rules_ = wn7.emptyProtobufList();
    private String documentationRootUrl_ = "";
    private String overview_ = "";

    /* renamed from: com.google.api.Documentation$1 */
    public static /* synthetic */ class C112031 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f13300xa1df5c61;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f13300xa1df5c61 = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13300xa1df5c61[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13300xa1df5c61[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13300xa1df5c61[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13300xa1df5c61[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13300xa1df5c61[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13300xa1df5c61[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends wn7.AbstractC17934a implements DocumentationOrBuilder {
        public /* synthetic */ Builder(C112031 c112031) {
            this();
        }

        public Builder addAllPages(Iterable<? extends Page> iterable) {
            copyOnWrite();
            ((Documentation) this.instance).addAllPages(iterable);
            return this;
        }

        public Builder addAllRules(Iterable<? extends DocumentationRule> iterable) {
            copyOnWrite();
            ((Documentation) this.instance).addAllRules(iterable);
            return this;
        }

        public Builder addPages(Page page) {
            copyOnWrite();
            ((Documentation) this.instance).addPages(page);
            return this;
        }

        public Builder addRules(DocumentationRule documentationRule) {
            copyOnWrite();
            ((Documentation) this.instance).addRules(documentationRule);
            return this;
        }

        public Builder clearDocumentationRootUrl() {
            copyOnWrite();
            ((Documentation) this.instance).clearDocumentationRootUrl();
            return this;
        }

        public Builder clearOverview() {
            copyOnWrite();
            ((Documentation) this.instance).clearOverview();
            return this;
        }

        public Builder clearPages() {
            copyOnWrite();
            ((Documentation) this.instance).clearPages();
            return this;
        }

        public Builder clearRules() {
            copyOnWrite();
            ((Documentation) this.instance).clearRules();
            return this;
        }

        public Builder clearSummary() {
            copyOnWrite();
            ((Documentation) this.instance).clearSummary();
            return this;
        }

        @Override // com.google.api.DocumentationOrBuilder
        public String getDocumentationRootUrl() {
            return ((Documentation) this.instance).getDocumentationRootUrl();
        }

        @Override // com.google.api.DocumentationOrBuilder
        public xq1 getDocumentationRootUrlBytes() {
            return ((Documentation) this.instance).getDocumentationRootUrlBytes();
        }

        @Override // com.google.api.DocumentationOrBuilder
        public String getOverview() {
            return ((Documentation) this.instance).getOverview();
        }

        @Override // com.google.api.DocumentationOrBuilder
        public xq1 getOverviewBytes() {
            return ((Documentation) this.instance).getOverviewBytes();
        }

        @Override // com.google.api.DocumentationOrBuilder
        public Page getPages(int i) {
            return ((Documentation) this.instance).getPages(i);
        }

        @Override // com.google.api.DocumentationOrBuilder
        public int getPagesCount() {
            return ((Documentation) this.instance).getPagesCount();
        }

        @Override // com.google.api.DocumentationOrBuilder
        public List<Page> getPagesList() {
            return Collections.unmodifiableList(((Documentation) this.instance).getPagesList());
        }

        @Override // com.google.api.DocumentationOrBuilder
        public DocumentationRule getRules(int i) {
            return ((Documentation) this.instance).getRules(i);
        }

        @Override // com.google.api.DocumentationOrBuilder
        public int getRulesCount() {
            return ((Documentation) this.instance).getRulesCount();
        }

        @Override // com.google.api.DocumentationOrBuilder
        public List<DocumentationRule> getRulesList() {
            return Collections.unmodifiableList(((Documentation) this.instance).getRulesList());
        }

        @Override // com.google.api.DocumentationOrBuilder
        public String getSummary() {
            return ((Documentation) this.instance).getSummary();
        }

        @Override // com.google.api.DocumentationOrBuilder
        public xq1 getSummaryBytes() {
            return ((Documentation) this.instance).getSummaryBytes();
        }

        public Builder removePages(int i) {
            copyOnWrite();
            ((Documentation) this.instance).removePages(i);
            return this;
        }

        public Builder removeRules(int i) {
            copyOnWrite();
            ((Documentation) this.instance).removeRules(i);
            return this;
        }

        public Builder setDocumentationRootUrl(String str) {
            copyOnWrite();
            ((Documentation) this.instance).setDocumentationRootUrl(str);
            return this;
        }

        public Builder setDocumentationRootUrlBytes(xq1 xq1Var) {
            copyOnWrite();
            ((Documentation) this.instance).setDocumentationRootUrlBytes(xq1Var);
            return this;
        }

        public Builder setOverview(String str) {
            copyOnWrite();
            ((Documentation) this.instance).setOverview(str);
            return this;
        }

        public Builder setOverviewBytes(xq1 xq1Var) {
            copyOnWrite();
            ((Documentation) this.instance).setOverviewBytes(xq1Var);
            return this;
        }

        public Builder setPages(int i, Page page) {
            copyOnWrite();
            ((Documentation) this.instance).setPages(i, page);
            return this;
        }

        public Builder setRules(int i, DocumentationRule documentationRule) {
            copyOnWrite();
            ((Documentation) this.instance).setRules(i, documentationRule);
            return this;
        }

        public Builder setSummary(String str) {
            copyOnWrite();
            ((Documentation) this.instance).setSummary(str);
            return this;
        }

        public Builder setSummaryBytes(xq1 xq1Var) {
            copyOnWrite();
            ((Documentation) this.instance).setSummaryBytes(xq1Var);
            return this;
        }

        private Builder() {
            super(Documentation.DEFAULT_INSTANCE);
        }

        public Builder addPages(int i, Page page) {
            copyOnWrite();
            ((Documentation) this.instance).addPages(i, page);
            return this;
        }

        public Builder addRules(int i, DocumentationRule documentationRule) {
            copyOnWrite();
            ((Documentation) this.instance).addRules(i, documentationRule);
            return this;
        }

        public Builder setPages(int i, Page.Builder builder) {
            copyOnWrite();
            ((Documentation) this.instance).setPages(i, (Page) builder.build());
            return this;
        }

        public Builder setRules(int i, DocumentationRule.Builder builder) {
            copyOnWrite();
            ((Documentation) this.instance).setRules(i, (DocumentationRule) builder.build());
            return this;
        }

        public Builder addPages(Page.Builder builder) {
            copyOnWrite();
            ((Documentation) this.instance).addPages((Page) builder.build());
            return this;
        }

        public Builder addRules(DocumentationRule.Builder builder) {
            copyOnWrite();
            ((Documentation) this.instance).addRules((DocumentationRule) builder.build());
            return this;
        }

        public Builder addPages(int i, Page.Builder builder) {
            copyOnWrite();
            ((Documentation) this.instance).addPages(i, (Page) builder.build());
            return this;
        }

        public Builder addRules(int i, DocumentationRule.Builder builder) {
            copyOnWrite();
            ((Documentation) this.instance).addRules(i, (DocumentationRule) builder.build());
            return this;
        }
    }

    static {
        Documentation documentation = new Documentation();
        DEFAULT_INSTANCE = documentation;
        wn7.registerDefaultInstance(Documentation.class, documentation);
    }

    private Documentation() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPages(Iterable<? extends Page> iterable) {
        ensurePagesIsMutable();
        r8.addAll((Iterable) iterable, (List) this.pages_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRules(Iterable<? extends DocumentationRule> iterable) {
        ensureRulesIsMutable();
        r8.addAll((Iterable) iterable, (List) this.rules_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPages(Page page) {
        page.getClass();
        ensurePagesIsMutable();
        this.pages_.add(page);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRules(DocumentationRule documentationRule) {
        documentationRule.getClass();
        ensureRulesIsMutable();
        this.rules_.add(documentationRule);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDocumentationRootUrl() {
        this.documentationRootUrl_ = getDefaultInstance().getDocumentationRootUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOverview() {
        this.overview_ = getDefaultInstance().getOverview();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPages() {
        this.pages_ = wn7.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRules() {
        this.rules_ = wn7.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSummary() {
        this.summary_ = getDefaultInstance().getSummary();
    }

    private void ensurePagesIsMutable() {
        yn8.InterfaceC18446j interfaceC18446j = this.pages_;
        if (interfaceC18446j.mo28212k()) {
            return;
        }
        this.pages_ = wn7.mutableCopy(interfaceC18446j);
    }

    private void ensureRulesIsMutable() {
        yn8.InterfaceC18446j interfaceC18446j = this.rules_;
        if (interfaceC18446j.mo28212k()) {
            return;
        }
        this.rules_ = wn7.mutableCopy(interfaceC18446j);
    }

    public static Documentation getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Documentation parseDelimitedFrom(InputStream inputStream) {
        return (Documentation) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Documentation parseFrom(ByteBuffer byteBuffer) {
        return (Documentation) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hxc parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePages(int i) {
        ensurePagesIsMutable();
        this.pages_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRules(int i) {
        ensureRulesIsMutable();
        this.rules_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDocumentationRootUrl(String str) {
        str.getClass();
        this.documentationRootUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDocumentationRootUrlBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        this.documentationRootUrl_ = xq1Var.m56593N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOverview(String str) {
        str.getClass();
        this.overview_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOverviewBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        this.overview_ = xq1Var.m56593N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPages(int i, Page page) {
        page.getClass();
        ensurePagesIsMutable();
        this.pages_.set(i, page);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRules(int i, DocumentationRule documentationRule) {
        documentationRule.getClass();
        ensureRulesIsMutable();
        this.rules_.set(i, documentationRule);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSummary(String str) {
        str.getClass();
        this.summary_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSummaryBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        this.summary_ = xq1Var.m56593N();
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C112031 c112031 = null;
        switch (C112031.f13300xa1df5c61[enumC17940g.ordinal()]) {
            case 1:
                return new Documentation();
            case 2:
                return new Builder(c112031);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004Ȉ\u0005\u001b", new Object[]{"summary_", "overview_", "rules_", DocumentationRule.class, "documentationRootUrl_", "pages_", Page.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (Documentation.class) {
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

    @Override // com.google.api.DocumentationOrBuilder
    public String getDocumentationRootUrl() {
        return this.documentationRootUrl_;
    }

    @Override // com.google.api.DocumentationOrBuilder
    public xq1 getDocumentationRootUrlBytes() {
        return xq1.m56589q(this.documentationRootUrl_);
    }

    @Override // com.google.api.DocumentationOrBuilder
    public String getOverview() {
        return this.overview_;
    }

    @Override // com.google.api.DocumentationOrBuilder
    public xq1 getOverviewBytes() {
        return xq1.m56589q(this.overview_);
    }

    @Override // com.google.api.DocumentationOrBuilder
    public Page getPages(int i) {
        return (Page) this.pages_.get(i);
    }

    @Override // com.google.api.DocumentationOrBuilder
    public int getPagesCount() {
        return this.pages_.size();
    }

    @Override // com.google.api.DocumentationOrBuilder
    public List<Page> getPagesList() {
        return this.pages_;
    }

    public PageOrBuilder getPagesOrBuilder(int i) {
        return (PageOrBuilder) this.pages_.get(i);
    }

    public List<? extends PageOrBuilder> getPagesOrBuilderList() {
        return this.pages_;
    }

    @Override // com.google.api.DocumentationOrBuilder
    public DocumentationRule getRules(int i) {
        return (DocumentationRule) this.rules_.get(i);
    }

    @Override // com.google.api.DocumentationOrBuilder
    public int getRulesCount() {
        return this.rules_.size();
    }

    @Override // com.google.api.DocumentationOrBuilder
    public List<DocumentationRule> getRulesList() {
        return this.rules_;
    }

    public DocumentationRuleOrBuilder getRulesOrBuilder(int i) {
        return (DocumentationRuleOrBuilder) this.rules_.get(i);
    }

    public List<? extends DocumentationRuleOrBuilder> getRulesOrBuilderList() {
        return this.rules_;
    }

    @Override // com.google.api.DocumentationOrBuilder
    public String getSummary() {
        return this.summary_;
    }

    @Override // com.google.api.DocumentationOrBuilder
    public xq1 getSummaryBytes() {
        return xq1.m56589q(this.summary_);
    }

    public static Builder newBuilder(Documentation documentation) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(documentation);
    }

    public static Documentation parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
        return (Documentation) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static Documentation parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
        return (Documentation) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
    }

    public static Documentation parseFrom(xq1 xq1Var) {
        return (Documentation) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPages(int i, Page page) {
        page.getClass();
        ensurePagesIsMutable();
        this.pages_.add(i, page);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRules(int i, DocumentationRule documentationRule) {
        documentationRule.getClass();
        ensureRulesIsMutable();
        this.rules_.add(i, documentationRule);
    }

    public static Documentation parseFrom(xq1 xq1Var, qp6 qp6Var) {
        return (Documentation) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
    }

    public static Documentation parseFrom(byte[] bArr) {
        return (Documentation) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Documentation parseFrom(byte[] bArr, qp6 qp6Var) {
        return (Documentation) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
    }

    public static Documentation parseFrom(InputStream inputStream) {
        return (Documentation) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Documentation parseFrom(InputStream inputStream, qp6 qp6Var) {
        return (Documentation) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static Documentation parseFrom(jf3 jf3Var) {
        return (Documentation) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
    }

    public static Documentation parseFrom(jf3 jf3Var, qp6 qp6Var) {
        return (Documentation) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
    }
}
