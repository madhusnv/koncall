package com.amplifyframework.datastore.generated.model;

import com.amazonaws.regions.ServiceAbbreviations;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
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

@Indexes({@Index(fields = {"masterBotId", "specializedBotId"}, name = "byMasterBot"), @Index(fields = {"specializedBotId", "masterBotId"}, name = "bySpecializedBot")})
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM)}, pluralName = "MasterBotSpecializedBots")
/* loaded from: classes5.dex */
public final class MasterBotSpecializedBot implements Model {

    @ModelField(isRequired = true, targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(isRequired = true, targetType = "ID")
    private final String masterBotId;

    @ModelField(isRequired = true, targetType = "ID")
    private final String specializedBotId;

    @ModelField(isRequired = true, targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;
    public static final QueryField ID = QueryField.field("MasterBotSpecializedBot", OutcomeConstants.OUTCOME_ID);
    public static final QueryField MASTER_BOT_ID = QueryField.field("MasterBotSpecializedBot", "masterBotId");
    public static final QueryField SPECIALIZED_BOT_ID = QueryField.field("MasterBotSpecializedBot", "specializedBotId");
    public static final QueryField CREATED_AT = QueryField.field("MasterBotSpecializedBot", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("MasterBotSpecializedBot", "updatedAt");

    public interface BuildStep {
        MasterBotSpecializedBot build();

        BuildStep id(String str);
    }

    public static class Builder implements MasterBotIdStep, SpecializedBotIdStep, CreatedAtStep, UpdatedAtStep, BuildStep {
        private Temporal.DateTime createdAt;
        private String id;
        private String masterBotId;
        private String specializedBotId;
        private Temporal.DateTime updatedAt;

        @Override // com.amplifyframework.datastore.generated.model.MasterBotSpecializedBot.BuildStep
        public MasterBotSpecializedBot build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new MasterBotSpecializedBot(string, this.masterBotId, this.specializedBotId, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.MasterBotSpecializedBot.CreatedAtStep
        public UpdatedAtStep createdAt(Temporal.DateTime dateTime) {
            Objects.requireNonNull(dateTime);
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.MasterBotSpecializedBot.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.MasterBotSpecializedBot.MasterBotIdStep
        public SpecializedBotIdStep masterBotId(String str) {
            Objects.requireNonNull(str);
            this.masterBotId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.MasterBotSpecializedBot.SpecializedBotIdStep
        public CreatedAtStep specializedBotId(String str) {
            Objects.requireNonNull(str);
            this.specializedBotId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.MasterBotSpecializedBot.UpdatedAtStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            Objects.requireNonNull(dateTime);
            this.updatedAt = dateTime;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            this.id = str;
            this.masterBotId = str2;
            this.specializedBotId = str3;
            this.createdAt = dateTime;
            this.updatedAt = dateTime2;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, String str3, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            super(str, str2, str3, dateTime, dateTime2);
            Objects.requireNonNull(str2);
            Objects.requireNonNull(str3);
            Objects.requireNonNull(dateTime);
            Objects.requireNonNull(dateTime2);
        }

        @Override // com.amplifyframework.datastore.generated.model.MasterBotSpecializedBot.Builder, com.amplifyframework.datastore.generated.model.MasterBotSpecializedBot.CreatedAtStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.MasterBotSpecializedBot.Builder, com.amplifyframework.datastore.generated.model.MasterBotSpecializedBot.MasterBotIdStep
        public CopyOfBuilder masterBotId(String str) {
            return (CopyOfBuilder) super.masterBotId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.MasterBotSpecializedBot.Builder, com.amplifyframework.datastore.generated.model.MasterBotSpecializedBot.SpecializedBotIdStep
        public CopyOfBuilder specializedBotId(String str) {
            return (CopyOfBuilder) super.specializedBotId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.MasterBotSpecializedBot.Builder, com.amplifyframework.datastore.generated.model.MasterBotSpecializedBot.UpdatedAtStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }
    }

    public interface CreatedAtStep {
        UpdatedAtStep createdAt(Temporal.DateTime dateTime);
    }

    public interface MasterBotIdStep {
        SpecializedBotIdStep masterBotId(String str);
    }

    public interface SpecializedBotIdStep {
        CreatedAtStep specializedBotId(String str);
    }

    public interface UpdatedAtStep {
        BuildStep updatedAt(Temporal.DateTime dateTime);
    }

    public static MasterBotIdStep builder() {
        return new Builder();
    }

    public static MasterBotSpecializedBot justId(String str) {
        return new MasterBotSpecializedBot(str, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.masterBotId, this.specializedBotId, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MasterBotSpecializedBot.class != obj.getClass()) {
            return false;
        }
        MasterBotSpecializedBot masterBotSpecializedBot = (MasterBotSpecializedBot) obj;
        return s6c.m47909a(getId(), masterBotSpecializedBot.getId()) && s6c.m47909a(getMasterBotId(), masterBotSpecializedBot.getMasterBotId()) && s6c.m47909a(getSpecializedBotId(), masterBotSpecializedBot.getSpecializedBotId()) && s6c.m47909a(getCreatedAt(), masterBotSpecializedBot.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), masterBotSpecializedBot.getUpdatedAt());
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getId() {
        return this.id;
    }

    public String getMasterBotId() {
        return this.masterBotId;
    }

    public String getSpecializedBotId() {
        return this.specializedBotId;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        return (getId() + getMasterBotId() + getSpecializedBotId() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MasterBotSpecializedBot {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("masterBotId=" + String.valueOf(getMasterBotId()) + ", ");
        sb.append("specializedBotId=" + String.valueOf(getSpecializedBotId()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private MasterBotSpecializedBot(String str, String str2, String str3, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
        this.id = str;
        this.masterBotId = str2;
        this.specializedBotId = str3;
        this.createdAt = dateTime;
        this.updatedAt = dateTime2;
    }
}
