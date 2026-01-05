package com.amplifyframework.datastore.generated.model;

import com.amazonaws.regions.ServiceAbbreviations;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.core.model.temporal.Temporal;
import com.google.android.gms.cast.MediaTrack;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM)}, pluralName = "EntityActionDefinitions")
/* loaded from: classes5.dex */
public final class EntityActionDefinition implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @ModelField(targetType = "String")
    private final String action;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(targetType = "ID")
    private final String createdBy;

    @ModelField(targetType = "String")
    private final String description;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime endDateTime;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "String")
    private final String name;

    @ModelField(targetType = "ID")
    private final String ownerId;

    @ModelField(targetType = "Int")
    private final Integer periodicFrequency;

    @ModelField(targetType = "String")
    private final String periodicFrequencyUnit;

    @ModelField(targetType = "Segment")
    private final Segment segment;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime startDateTime;

    @ModelField(targetType = "String")
    private final String status;

    @ModelField(targetType = "String")
    private final String subscriptionType;

    @ModelField(targetType = "String")
    private final String target;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;

    @ModelField(targetType = "ID")
    private final String updatedBy;
    public static final QueryField ID = QueryField.field("EntityActionDefinition", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("EntityActionDefinition", "accountId");
    public static final QueryField NAME = QueryField.field("EntityActionDefinition", "name");
    public static final QueryField DESCRIPTION = QueryField.field("EntityActionDefinition", MediaTrack.ROLE_DESCRIPTION);
    public static final QueryField SEGMENT = QueryField.field("EntityActionDefinition", "segment");
    public static final QueryField ACTION = QueryField.field("EntityActionDefinition", "action");
    public static final QueryField TARGET = QueryField.field("EntityActionDefinition", "target");
    public static final QueryField SUBSCRIPTION_TYPE = QueryField.field("EntityActionDefinition", "subscriptionType");
    public static final QueryField PERIODIC_FREQUENCY = QueryField.field("EntityActionDefinition", "periodicFrequency");
    public static final QueryField PERIODIC_FREQUENCY_UNIT = QueryField.field("EntityActionDefinition", "periodicFrequencyUnit");
    public static final QueryField START_DATE_TIME = QueryField.field("EntityActionDefinition", "startDateTime");
    public static final QueryField END_DATE_TIME = QueryField.field("EntityActionDefinition", "endDateTime");
    public static final QueryField STATUS = QueryField.field("EntityActionDefinition", "status");
    public static final QueryField OWNER_ID = QueryField.field("EntityActionDefinition", "ownerId");
    public static final QueryField CREATED_AT = QueryField.field("EntityActionDefinition", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("EntityActionDefinition", "updatedAt");
    public static final QueryField CREATED_BY = QueryField.field("EntityActionDefinition", "createdBy");
    public static final QueryField UPDATED_BY = QueryField.field("EntityActionDefinition", "updatedBy");

    public interface AccountIdStep {
        BuildStep accountId(String str);
    }

    public interface BuildStep {
        BuildStep action(String str);

        EntityActionDefinition build();

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep createdBy(String str);

        BuildStep description(String str);

        BuildStep endDateTime(Temporal.DateTime dateTime);

        BuildStep id(String str);

        BuildStep name(String str);

        BuildStep ownerId(String str);

        BuildStep periodicFrequency(Integer num);

        BuildStep periodicFrequencyUnit(String str);

        BuildStep segment(Segment segment);

        BuildStep startDateTime(Temporal.DateTime dateTime);

        BuildStep status(String str);

        BuildStep subscriptionType(String str);

        BuildStep target(String str);

        BuildStep updatedAt(Temporal.DateTime dateTime);

        BuildStep updatedBy(String str);
    }

    public static class Builder implements AccountIdStep, BuildStep {
        private String accountId;
        private String action;
        private Temporal.DateTime createdAt;
        private String createdBy;
        private String description;
        private Temporal.DateTime endDateTime;
        private String id;
        private String name;
        private String ownerId;
        private Integer periodicFrequency;
        private String periodicFrequencyUnit;
        private Segment segment;
        private Temporal.DateTime startDateTime;
        private String status;
        private String subscriptionType;
        private String target;
        private Temporal.DateTime updatedAt;
        private String updatedBy;

        @Override // com.amplifyframework.datastore.generated.model.EntityActionDefinition.AccountIdStep
        public BuildStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityActionDefinition.BuildStep
        public BuildStep action(String str) {
            this.action = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityActionDefinition.BuildStep
        public EntityActionDefinition build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new EntityActionDefinition(string, this.accountId, this.name, this.description, this.segment, this.action, this.target, this.subscriptionType, this.periodicFrequency, this.periodicFrequencyUnit, this.startDateTime, this.endDateTime, this.status, this.ownerId, this.createdAt, this.updatedAt, this.createdBy, this.updatedBy);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityActionDefinition.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityActionDefinition.BuildStep
        public BuildStep createdBy(String str) {
            this.createdBy = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityActionDefinition.BuildStep
        public BuildStep description(String str) {
            this.description = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityActionDefinition.BuildStep
        public BuildStep endDateTime(Temporal.DateTime dateTime) {
            this.endDateTime = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityActionDefinition.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityActionDefinition.BuildStep
        public BuildStep name(String str) {
            this.name = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityActionDefinition.BuildStep
        public BuildStep ownerId(String str) {
            this.ownerId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityActionDefinition.BuildStep
        public BuildStep periodicFrequency(Integer num) {
            this.periodicFrequency = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityActionDefinition.BuildStep
        public BuildStep periodicFrequencyUnit(String str) {
            this.periodicFrequencyUnit = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityActionDefinition.BuildStep
        public BuildStep segment(Segment segment) {
            this.segment = segment;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityActionDefinition.BuildStep
        public BuildStep startDateTime(Temporal.DateTime dateTime) {
            this.startDateTime = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityActionDefinition.BuildStep
        public BuildStep status(String str) {
            this.status = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityActionDefinition.BuildStep
        public BuildStep subscriptionType(String str) {
            this.subscriptionType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityActionDefinition.BuildStep
        public BuildStep target(String str) {
            this.target = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityActionDefinition.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityActionDefinition.BuildStep
        public BuildStep updatedBy(String str) {
            this.updatedBy = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, String str4, Segment segment, String str5, String str6, String str7, Integer num, String str8, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, String str9, String str10, Temporal.DateTime dateTime3, Temporal.DateTime dateTime4, String str11, String str12) {
            this.id = str;
            this.accountId = str2;
            this.name = str3;
            this.description = str4;
            this.segment = segment;
            this.action = str5;
            this.target = str6;
            this.subscriptionType = str7;
            this.periodicFrequency = num;
            this.periodicFrequencyUnit = str8;
            this.startDateTime = dateTime;
            this.endDateTime = dateTime2;
            this.status = str9;
            this.ownerId = str10;
            this.createdAt = dateTime3;
            this.updatedAt = dateTime4;
            this.createdBy = str11;
            this.updatedBy = str12;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, String str3, String str4, Segment segment, String str5, String str6, String str7, Integer num, String str8, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, String str9, String str10, Temporal.DateTime dateTime3, Temporal.DateTime dateTime4, String str11, String str12) {
            super(str, str2, str3, str4, segment, str5, str6, str7, num, str8, dateTime, dateTime2, str9, str10, dateTime3, dateTime4, str11, str12);
            Objects.requireNonNull(str2);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityActionDefinition.Builder, com.amplifyframework.datastore.generated.model.EntityActionDefinition.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityActionDefinition.Builder, com.amplifyframework.datastore.generated.model.EntityActionDefinition.BuildStep
        public CopyOfBuilder action(String str) {
            return (CopyOfBuilder) super.action(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityActionDefinition.Builder, com.amplifyframework.datastore.generated.model.EntityActionDefinition.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityActionDefinition.Builder, com.amplifyframework.datastore.generated.model.EntityActionDefinition.BuildStep
        public CopyOfBuilder createdBy(String str) {
            return (CopyOfBuilder) super.createdBy(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityActionDefinition.Builder, com.amplifyframework.datastore.generated.model.EntityActionDefinition.BuildStep
        public CopyOfBuilder description(String str) {
            return (CopyOfBuilder) super.description(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityActionDefinition.Builder, com.amplifyframework.datastore.generated.model.EntityActionDefinition.BuildStep
        public CopyOfBuilder endDateTime(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.endDateTime(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityActionDefinition.Builder, com.amplifyframework.datastore.generated.model.EntityActionDefinition.BuildStep
        public CopyOfBuilder name(String str) {
            return (CopyOfBuilder) super.name(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityActionDefinition.Builder, com.amplifyframework.datastore.generated.model.EntityActionDefinition.BuildStep
        public CopyOfBuilder ownerId(String str) {
            return (CopyOfBuilder) super.ownerId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityActionDefinition.Builder, com.amplifyframework.datastore.generated.model.EntityActionDefinition.BuildStep
        public CopyOfBuilder periodicFrequency(Integer num) {
            return (CopyOfBuilder) super.periodicFrequency(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityActionDefinition.Builder, com.amplifyframework.datastore.generated.model.EntityActionDefinition.BuildStep
        public CopyOfBuilder periodicFrequencyUnit(String str) {
            return (CopyOfBuilder) super.periodicFrequencyUnit(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityActionDefinition.Builder, com.amplifyframework.datastore.generated.model.EntityActionDefinition.BuildStep
        public CopyOfBuilder segment(Segment segment) {
            return (CopyOfBuilder) super.segment(segment);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityActionDefinition.Builder, com.amplifyframework.datastore.generated.model.EntityActionDefinition.BuildStep
        public CopyOfBuilder startDateTime(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.startDateTime(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityActionDefinition.Builder, com.amplifyframework.datastore.generated.model.EntityActionDefinition.BuildStep
        public CopyOfBuilder status(String str) {
            return (CopyOfBuilder) super.status(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityActionDefinition.Builder, com.amplifyframework.datastore.generated.model.EntityActionDefinition.BuildStep
        public CopyOfBuilder subscriptionType(String str) {
            return (CopyOfBuilder) super.subscriptionType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityActionDefinition.Builder, com.amplifyframework.datastore.generated.model.EntityActionDefinition.BuildStep
        public CopyOfBuilder target(String str) {
            return (CopyOfBuilder) super.target(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityActionDefinition.Builder, com.amplifyframework.datastore.generated.model.EntityActionDefinition.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.EntityActionDefinition.Builder, com.amplifyframework.datastore.generated.model.EntityActionDefinition.BuildStep
        public CopyOfBuilder updatedBy(String str) {
            return (CopyOfBuilder) super.updatedBy(str);
        }
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static EntityActionDefinition justId(String str) {
        return new EntityActionDefinition(str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.name, this.description, this.segment, this.action, this.target, this.subscriptionType, this.periodicFrequency, this.periodicFrequencyUnit, this.startDateTime, this.endDateTime, this.status, this.ownerId, this.createdAt, this.updatedAt, this.createdBy, this.updatedBy);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || EntityActionDefinition.class != obj.getClass()) {
            return false;
        }
        EntityActionDefinition entityActionDefinition = (EntityActionDefinition) obj;
        return s6c.m47909a(getId(), entityActionDefinition.getId()) && s6c.m47909a(getAccountId(), entityActionDefinition.getAccountId()) && s6c.m47909a(getName(), entityActionDefinition.getName()) && s6c.m47909a(getDescription(), entityActionDefinition.getDescription()) && s6c.m47909a(getSegment(), entityActionDefinition.getSegment()) && s6c.m47909a(getAction(), entityActionDefinition.getAction()) && s6c.m47909a(getTarget(), entityActionDefinition.getTarget()) && s6c.m47909a(getSubscriptionType(), entityActionDefinition.getSubscriptionType()) && s6c.m47909a(getPeriodicFrequency(), entityActionDefinition.getPeriodicFrequency()) && s6c.m47909a(getPeriodicFrequencyUnit(), entityActionDefinition.getPeriodicFrequencyUnit()) && s6c.m47909a(getStartDateTime(), entityActionDefinition.getStartDateTime()) && s6c.m47909a(getEndDateTime(), entityActionDefinition.getEndDateTime()) && s6c.m47909a(getStatus(), entityActionDefinition.getStatus()) && s6c.m47909a(getOwnerId(), entityActionDefinition.getOwnerId()) && s6c.m47909a(getCreatedAt(), entityActionDefinition.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), entityActionDefinition.getUpdatedAt()) && s6c.m47909a(getCreatedBy(), entityActionDefinition.getCreatedBy()) && s6c.m47909a(getUpdatedBy(), entityActionDefinition.getUpdatedBy());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public String getAction() {
        return this.action;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getCreatedBy() {
        return this.createdBy;
    }

    public String getDescription() {
        return this.description;
    }

    public Temporal.DateTime getEndDateTime() {
        return this.endDateTime;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getOwnerId() {
        return this.ownerId;
    }

    public Integer getPeriodicFrequency() {
        return this.periodicFrequency;
    }

    public String getPeriodicFrequencyUnit() {
        return this.periodicFrequencyUnit;
    }

    public Segment getSegment() {
        return this.segment;
    }

    public Temporal.DateTime getStartDateTime() {
        return this.startDateTime;
    }

    public String getStatus() {
        return this.status;
    }

    public String getSubscriptionType() {
        return this.subscriptionType;
    }

    public String getTarget() {
        return this.target;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public String getUpdatedBy() {
        return this.updatedBy;
    }

    public int hashCode() {
        return (getId() + getAccountId() + getName() + getDescription() + getSegment() + getAction() + getTarget() + getSubscriptionType() + getPeriodicFrequency() + getPeriodicFrequencyUnit() + getStartDateTime() + getEndDateTime() + getStatus() + getOwnerId() + getCreatedAt() + getUpdatedAt() + getCreatedBy() + getUpdatedBy()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EntityActionDefinition {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("name=" + String.valueOf(getName()) + ", ");
        sb.append("description=" + String.valueOf(getDescription()) + ", ");
        sb.append("segment=" + String.valueOf(getSegment()) + ", ");
        sb.append("action=" + String.valueOf(getAction()) + ", ");
        sb.append("target=" + String.valueOf(getTarget()) + ", ");
        sb.append("subscriptionType=" + String.valueOf(getSubscriptionType()) + ", ");
        sb.append("periodicFrequency=" + String.valueOf(getPeriodicFrequency()) + ", ");
        sb.append("periodicFrequencyUnit=" + String.valueOf(getPeriodicFrequencyUnit()) + ", ");
        sb.append("startDateTime=" + String.valueOf(getStartDateTime()) + ", ");
        sb.append("endDateTime=" + String.valueOf(getEndDateTime()) + ", ");
        sb.append("status=" + String.valueOf(getStatus()) + ", ");
        sb.append("ownerId=" + String.valueOf(getOwnerId()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        sb.append("updatedAt=" + String.valueOf(getUpdatedAt()) + ", ");
        sb.append("createdBy=" + String.valueOf(getCreatedBy()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedBy=");
        sb2.append(String.valueOf(getUpdatedBy()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private EntityActionDefinition(String str, String str2, String str3, String str4, Segment segment, String str5, String str6, String str7, Integer num, String str8, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, String str9, String str10, Temporal.DateTime dateTime3, Temporal.DateTime dateTime4, String str11, String str12) {
        this.id = str;
        this.accountId = str2;
        this.name = str3;
        this.description = str4;
        this.segment = segment;
        this.action = str5;
        this.target = str6;
        this.subscriptionType = str7;
        this.periodicFrequency = num;
        this.periodicFrequencyUnit = str8;
        this.startDateTime = dateTime;
        this.endDateTime = dateTime2;
        this.status = str9;
        this.ownerId = str10;
        this.createdAt = dateTime3;
        this.updatedAt = dateTime4;
        this.createdBy = str11;
        this.updatedBy = str12;
    }
}
