package com.amplifyframework.datastore.generated.model;

import com.amazonaws.regions.ServiceAbbreviations;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.BelongsTo;
import com.amplifyframework.core.model.annotations.HasOne;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.Indexes;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.core.model.temporal.Temporal;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@Indexes({@Index(fields = {"accountId", "entityListId", "updatedAt"}, name = "byListId"), @Index(fields = {"accountId", "contactId", "entityListId", "updatedAt"}, name = "byContactId")})
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.READ, ModelOperation.CREATE, ModelOperation.UPDATE, ModelOperation.DELETE}), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.READ, ModelOperation.CREATE, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM)}, pluralName = "EntityListMemberships")
/* loaded from: classes5.dex */
public final class EntityListMembership implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @ModelField(targetType = "ID")
    private final String associatedObjectId;

    @ModelField(targetType = "String")
    private final String associatedObjectType;

    @BelongsTo(targetName = "contactId", type = Contact.class)
    @ModelField(targetType = "Contact")
    private final Contact contact;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(targetType = "EntityList")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = EntityList.class)
    private final EntityList entityList;

    @ModelField(isRequired = true, targetType = "ID")
    private final String entityListId;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;
    public static final QueryField ID = QueryField.field("EntityListMembership", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("EntityListMembership", "accountId");
    public static final QueryField CONTACT = QueryField.field("EntityListMembership", "contactId");
    public static final QueryField ASSOCIATED_OBJECT_ID = QueryField.field("EntityListMembership", "associatedObjectId");
    public static final QueryField ASSOCIATED_OBJECT_TYPE = QueryField.field("EntityListMembership", "associatedObjectType");
    public static final QueryField ENTITY_LIST_ID = QueryField.field("EntityListMembership", "entityListId");
    public static final QueryField CREATED_AT = QueryField.field("EntityListMembership", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("EntityListMembership", "updatedAt");

    public interface AccountIdStep {
        EntityListIdStep accountId(String str);
    }

    public interface BuildStep {
        BuildStep associatedObjectId(String str);

        BuildStep associatedObjectType(String str);

        EntityListMembership build();

        BuildStep contact(Contact contact);

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep id(String str);

        BuildStep updatedAt(Temporal.DateTime dateTime);
    }

    public static class Builder implements AccountIdStep, EntityListIdStep, BuildStep {
        private String accountId;
        private String associatedObjectId;
        private String associatedObjectType;
        private Contact contact;
        private Temporal.DateTime createdAt;
        private String entityListId;
        private String id;
        private Temporal.DateTime updatedAt;

        @Override // com.amplifyframework.datastore.generated.model.EntityListMembership.AccountIdStep
        public EntityListIdStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityListMembership.BuildStep
        public BuildStep associatedObjectId(String str) {
            this.associatedObjectId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityListMembership.BuildStep
        public BuildStep associatedObjectType(String str) {
            this.associatedObjectType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityListMembership.BuildStep
        public EntityListMembership build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new EntityListMembership(string, this.accountId, this.contact, this.associatedObjectId, this.associatedObjectType, this.entityListId, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityListMembership.BuildStep
        public BuildStep contact(Contact contact) {
            this.contact = contact;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityListMembership.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityListMembership.EntityListIdStep
        public BuildStep entityListId(String str) {
            Objects.requireNonNull(str);
            this.entityListId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityListMembership.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityListMembership.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, Contact contact, String str3, String str4, String str5, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            this.id = str;
            this.accountId = str2;
            this.contact = contact;
            this.associatedObjectId = str3;
            this.associatedObjectType = str4;
            this.entityListId = str5;
            this.createdAt = dateTime;
            this.updatedAt = dateTime2;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, Contact contact, String str3, String str4, String str5, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            super(str, str2, contact, str3, str4, str5, dateTime, dateTime2);
            Objects.requireNonNull(str2);
            Objects.requireNonNull(str5);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityListMembership.Builder, com.amplifyframework.datastore.generated.model.EntityListMembership.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityListMembership.Builder, com.amplifyframework.datastore.generated.model.EntityListMembership.BuildStep
        public CopyOfBuilder associatedObjectId(String str) {
            return (CopyOfBuilder) super.associatedObjectId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityListMembership.Builder, com.amplifyframework.datastore.generated.model.EntityListMembership.BuildStep
        public CopyOfBuilder associatedObjectType(String str) {
            return (CopyOfBuilder) super.associatedObjectType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityListMembership.Builder, com.amplifyframework.datastore.generated.model.EntityListMembership.BuildStep
        public CopyOfBuilder contact(Contact contact) {
            return (CopyOfBuilder) super.contact(contact);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityListMembership.Builder, com.amplifyframework.datastore.generated.model.EntityListMembership.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityListMembership.Builder, com.amplifyframework.datastore.generated.model.EntityListMembership.EntityListIdStep
        public CopyOfBuilder entityListId(String str) {
            return (CopyOfBuilder) super.entityListId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityListMembership.Builder, com.amplifyframework.datastore.generated.model.EntityListMembership.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }
    }

    public interface EntityListIdStep {
        BuildStep entityListId(String str);
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static EntityListMembership justId(String str) {
        return new EntityListMembership(str, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.contact, this.associatedObjectId, this.associatedObjectType, this.entityListId, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || EntityListMembership.class != obj.getClass()) {
            return false;
        }
        EntityListMembership entityListMembership = (EntityListMembership) obj;
        return s6c.m47909a(getId(), entityListMembership.getId()) && s6c.m47909a(getAccountId(), entityListMembership.getAccountId()) && s6c.m47909a(getContact(), entityListMembership.getContact()) && s6c.m47909a(getAssociatedObjectId(), entityListMembership.getAssociatedObjectId()) && s6c.m47909a(getAssociatedObjectType(), entityListMembership.getAssociatedObjectType()) && s6c.m47909a(getEntityListId(), entityListMembership.getEntityListId()) && s6c.m47909a(getCreatedAt(), entityListMembership.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), entityListMembership.getUpdatedAt());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public String getAssociatedObjectId() {
        return this.associatedObjectId;
    }

    public String getAssociatedObjectType() {
        return this.associatedObjectType;
    }

    public Contact getContact() {
        return this.contact;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public EntityList getEntityList() {
        return this.entityList;
    }

    public String getEntityListId() {
        return this.entityListId;
    }

    public String getId() {
        return this.id;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        return (getId() + getAccountId() + getContact() + getAssociatedObjectId() + getAssociatedObjectType() + getEntityListId() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EntityListMembership {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("contact=" + String.valueOf(getContact()) + ", ");
        sb.append("associatedObjectId=" + String.valueOf(getAssociatedObjectId()) + ", ");
        sb.append("associatedObjectType=" + String.valueOf(getAssociatedObjectType()) + ", ");
        sb.append("entityListId=" + String.valueOf(getEntityListId()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private EntityListMembership(String str, String str2, Contact contact, String str3, String str4, String str5, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
        this.entityList = null;
        this.id = str;
        this.accountId = str2;
        this.contact = contact;
        this.associatedObjectId = str3;
        this.associatedObjectType = str4;
        this.entityListId = str5;
        this.createdAt = dateTime;
        this.updatedAt = dateTime2;
    }
}
