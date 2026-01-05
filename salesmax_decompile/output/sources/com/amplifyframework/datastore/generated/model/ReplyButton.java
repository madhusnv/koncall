package com.amplifyframework.datastore.generated.model;

import p001o.s6c;

/* loaded from: classes5.dex */
public final class ReplyButton {
    private final String idReply;
    private final String titleReply;
    private final String typeReply;

    public interface BuildStep {
        ReplyButton build();

        BuildStep idReply(String str);

        BuildStep titleReply(String str);

        BuildStep typeReply(String str);
    }

    public static class Builder implements BuildStep {
        private String idReply;
        private String titleReply;
        private String typeReply;

        @Override // com.amplifyframework.datastore.generated.model.ReplyButton.BuildStep
        public ReplyButton build() {
            return new ReplyButton(this.typeReply, this.titleReply, this.idReply);
        }

        @Override // com.amplifyframework.datastore.generated.model.ReplyButton.BuildStep
        public BuildStep idReply(String str) {
            this.idReply = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ReplyButton.BuildStep
        public BuildStep titleReply(String str) {
            this.titleReply = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ReplyButton.BuildStep
        public BuildStep typeReply(String str) {
            this.typeReply = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3) {
            this.typeReply = str;
            this.titleReply = str2;
            this.idReply = str3;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, String str3) {
            super(str, str2, str3);
        }

        @Override // com.amplifyframework.datastore.generated.model.ReplyButton.Builder, com.amplifyframework.datastore.generated.model.ReplyButton.BuildStep
        public CopyOfBuilder idReply(String str) {
            return (CopyOfBuilder) super.idReply(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ReplyButton.Builder, com.amplifyframework.datastore.generated.model.ReplyButton.BuildStep
        public CopyOfBuilder titleReply(String str) {
            return (CopyOfBuilder) super.titleReply(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ReplyButton.Builder, com.amplifyframework.datastore.generated.model.ReplyButton.BuildStep
        public CopyOfBuilder typeReply(String str) {
            return (CopyOfBuilder) super.typeReply(str);
        }
    }

    public static BuildStep builder() {
        return new Builder();
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.typeReply, this.titleReply, this.idReply);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ReplyButton.class != obj.getClass()) {
            return false;
        }
        ReplyButton replyButton = (ReplyButton) obj;
        return s6c.m47909a(getTypeReply(), replyButton.getTypeReply()) && s6c.m47909a(getTitleReply(), replyButton.getTitleReply()) && s6c.m47909a(getIdReply(), replyButton.getIdReply());
    }

    public String getIdReply() {
        return this.idReply;
    }

    public String getTitleReply() {
        return this.titleReply;
    }

    public String getTypeReply() {
        return this.typeReply;
    }

    public int hashCode() {
        return (getTypeReply() + getTitleReply() + getIdReply()).hashCode();
    }

    private ReplyButton(String str, String str2, String str3) {
        this.typeReply = str;
        this.titleReply = str2;
        this.idReply = str3;
    }
}
