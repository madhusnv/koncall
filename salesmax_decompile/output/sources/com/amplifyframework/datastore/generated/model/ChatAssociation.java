package com.amplifyframework.datastore.generated.model;

import com.amazonaws.regions.ServiceAbbreviations;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.BelongsTo;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.core.model.temporal.Temporal;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE})}, pluralName = "ChatAssociations")
/* loaded from: classes5.dex */
public final class ChatAssociation implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @BelongsTo(targetName = "channelId", type = ChatChannel.class)
    @ModelField(targetType = "ChatChannel")
    private final ChatChannel channel;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(isRequired = true, targetType = "ID")
    private final String relatedObjectId;

    @ModelField(isRequired = true, targetType = "String")
    private final String relatedObjectType;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;
    public static final QueryField ID = QueryField.field("ChatAssociation", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("ChatAssociation", "accountId");
    public static final QueryField CHANNEL = QueryField.field("ChatAssociation", "channelId");
    public static final QueryField RELATED_OBJECT_ID = QueryField.field("ChatAssociation", "relatedObjectId");
    public static final QueryField RELATED_OBJECT_TYPE = QueryField.field("ChatAssociation", "relatedObjectType");
    public static final QueryField CREATED_AT = QueryField.field("ChatAssociation", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("ChatAssociation", "updatedAt");

    public interface AccountIdStep {
        RelatedObjectIdStep accountId(String str);
    }

    public interface BuildStep {
        ChatAssociation build();

        BuildStep channel(ChatChannel chatChannel);

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep id(String str);

        BuildStep updatedAt(Temporal.DateTime dateTime);
    }

    public static class Builder implements AccountIdStep, RelatedObjectIdStep, RelatedObjectTypeStep, BuildStep {
        private String accountId;
        private ChatChannel channel;
        private Temporal.DateTime createdAt;
        private String id;
        private String relatedObjectId;
        private String relatedObjectType;
        private Temporal.DateTime updatedAt;

        @Override // com.amplifyframework.datastore.generated.model.ChatAssociation.AccountIdStep
        public RelatedObjectIdStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatAssociation.BuildStep
        public ChatAssociation build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new ChatAssociation(string, this.accountId, this.channel, this.relatedObjectId, this.relatedObjectType, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatAssociation.BuildStep
        public BuildStep channel(ChatChannel chatChannel) {
            this.channel = chatChannel;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatAssociation.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatAssociation.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatAssociation.RelatedObjectIdStep
        public RelatedObjectTypeStep relatedObjectId(String str) {
            Objects.requireNonNull(str);
            this.relatedObjectId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatAssociation.RelatedObjectTypeStep
        public BuildStep relatedObjectType(String str) {
            Objects.requireNonNull(str);
            this.relatedObjectType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatAssociation.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, ChatChannel chatChannel, String str3, String str4, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            this.id = str;
            this.accountId = str2;
            this.channel = chatChannel;
            this.relatedObjectId = str3;
            this.relatedObjectType = str4;
            this.createdAt = dateTime;
            this.updatedAt = dateTime2;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, ChatChannel chatChannel, String str3, String str4, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            super(str, str2, chatChannel, str3, str4, dateTime, dateTime2);
            Objects.requireNonNull(str2);
            Objects.requireNonNull(str3);
            Objects.requireNonNull(str4);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatAssociation.Builder, com.amplifyframework.datastore.generated.model.ChatAssociation.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatAssociation.Builder, com.amplifyframework.datastore.generated.model.ChatAssociation.BuildStep
        public CopyOfBuilder channel(ChatChannel chatChannel) {
            return (CopyOfBuilder) super.channel(chatChannel);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatAssociation.Builder, com.amplifyframework.datastore.generated.model.ChatAssociation.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatAssociation.Builder, com.amplifyframework.datastore.generated.model.ChatAssociation.RelatedObjectIdStep
        public CopyOfBuilder relatedObjectId(String str) {
            return (CopyOfBuilder) super.relatedObjectId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatAssociation.Builder, com.amplifyframework.datastore.generated.model.ChatAssociation.RelatedObjectTypeStep
        public CopyOfBuilder relatedObjectType(String str) {
            return (CopyOfBuilder) super.relatedObjectType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ChatAssociation.Builder, com.amplifyframework.datastore.generated.model.ChatAssociation.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }
    }

    public interface RelatedObjectIdStep {
        RelatedObjectTypeStep relatedObjectId(String str);
    }

    public interface RelatedObjectTypeStep {
        BuildStep relatedObjectType(String str);
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static ChatAssociation justId(String str) {
        return new ChatAssociation(str, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.channel, this.relatedObjectId, this.relatedObjectType, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChatAssociation.class != obj.getClass()) {
            return false;
        }
        ChatAssociation chatAssociation = (ChatAssociation) obj;
        return s6c.m47909a(getId(), chatAssociation.getId()) && s6c.m47909a(getAccountId(), chatAssociation.getAccountId()) && s6c.m47909a(getChannel(), chatAssociation.getChannel()) && s6c.m47909a(getRelatedObjectId(), chatAssociation.getRelatedObjectId()) && s6c.m47909a(getRelatedObjectType(), chatAssociation.getRelatedObjectType()) && s6c.m47909a(getCreatedAt(), chatAssociation.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), chatAssociation.getUpdatedAt());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public ChatChannel getChannel() {
        return this.channel;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getId() {
        return this.id;
    }

    public String getRelatedObjectId() {
        return this.relatedObjectId;
    }

    public String getRelatedObjectType() {
        return this.relatedObjectType;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        return (getId() + getAccountId() + getChannel() + getRelatedObjectId() + getRelatedObjectType() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChatAssociation {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("channel=" + String.valueOf(getChannel()) + ", ");
        sb.append("relatedObjectId=" + String.valueOf(getRelatedObjectId()) + ", ");
        sb.append("relatedObjectType=" + String.valueOf(getRelatedObjectType()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private ChatAssociation(String str, String str2, ChatChannel chatChannel, String str3, String str4, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
        this.id = str;
        this.accountId = str2;
        this.channel = chatChannel;
        this.relatedObjectId = str3;
        this.relatedObjectType = str4;
        this.createdAt = dateTime;
        this.updatedAt = dateTime2;
    }
}
