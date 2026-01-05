package com.amplifyframework.datastore.generated.model;

import com.amazonaws.regions.ServiceAbbreviations;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
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

@Indexes({@Index(fields = {"engagementId"}, name = "allLocationsOnEngagement"), @Index(fields = {"accountId", "ownerId", "updatedAt"}, name = "allLocationsByOwner")})
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM)}, pluralName = "ActivityLocations")
/* loaded from: classes5.dex */
public final class ActivityLocation implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(targetType = "ID")
    private final String engagementId;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "String")
    private final String lat;

    @ModelField(targetType = "String")
    private final String lng;

    @ModelField(isRequired = true, targetType = "ID")
    private final String ownerId;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;

    @ModelField(targetType = "User")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = User.class)
    private final User user;
    public static final QueryField ID = QueryField.field("ActivityLocation", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("ActivityLocation", "accountId");
    public static final QueryField ENGAGEMENT_ID = QueryField.field("ActivityLocation", "engagementId");
    public static final QueryField LAT = QueryField.field("ActivityLocation", "lat");
    public static final QueryField LNG = QueryField.field("ActivityLocation", "lng");
    public static final QueryField OWNER_ID = QueryField.field("ActivityLocation", "ownerId");
    public static final QueryField CREATED_AT = QueryField.field("ActivityLocation", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("ActivityLocation", "updatedAt");

    public interface AccountIdStep {
        OwnerIdStep accountId(String str);
    }

    public interface BuildStep {
        ActivityLocation build();

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep engagementId(String str);

        BuildStep id(String str);

        BuildStep lat(String str);

        BuildStep lng(String str);

        BuildStep updatedAt(Temporal.DateTime dateTime);
    }

    public static class Builder implements AccountIdStep, OwnerIdStep, BuildStep {
        private String accountId;
        private Temporal.DateTime createdAt;
        private String engagementId;
        private String id;
        private String lat;
        private String lng;
        private String ownerId;
        private Temporal.DateTime updatedAt;

        @Override // com.amplifyframework.datastore.generated.model.ActivityLocation.AccountIdStep
        public OwnerIdStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ActivityLocation.BuildStep
        public ActivityLocation build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new ActivityLocation(string, this.accountId, this.engagementId, this.lat, this.lng, this.ownerId, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.ActivityLocation.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ActivityLocation.BuildStep
        public BuildStep engagementId(String str) {
            this.engagementId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ActivityLocation.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ActivityLocation.BuildStep
        public BuildStep lat(String str) {
            this.lat = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ActivityLocation.BuildStep
        public BuildStep lng(String str) {
            this.lng = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ActivityLocation.OwnerIdStep
        public BuildStep ownerId(String str) {
            Objects.requireNonNull(str);
            this.ownerId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ActivityLocation.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, String str4, String str5, String str6, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            this.id = str;
            this.accountId = str2;
            this.engagementId = str3;
            this.lat = str4;
            this.lng = str5;
            this.ownerId = str6;
            this.createdAt = dateTime;
            this.updatedAt = dateTime2;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, String str3, String str4, String str5, String str6, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            super(str, str2, str3, str4, str5, str6, dateTime, dateTime2);
            Objects.requireNonNull(str2);
            Objects.requireNonNull(str6);
        }

        @Override // com.amplifyframework.datastore.generated.model.ActivityLocation.Builder, com.amplifyframework.datastore.generated.model.ActivityLocation.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ActivityLocation.Builder, com.amplifyframework.datastore.generated.model.ActivityLocation.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.ActivityLocation.Builder, com.amplifyframework.datastore.generated.model.ActivityLocation.BuildStep
        public CopyOfBuilder engagementId(String str) {
            return (CopyOfBuilder) super.engagementId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ActivityLocation.Builder, com.amplifyframework.datastore.generated.model.ActivityLocation.BuildStep
        public CopyOfBuilder lat(String str) {
            return (CopyOfBuilder) super.lat(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ActivityLocation.Builder, com.amplifyframework.datastore.generated.model.ActivityLocation.BuildStep
        public CopyOfBuilder lng(String str) {
            return (CopyOfBuilder) super.lng(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ActivityLocation.Builder, com.amplifyframework.datastore.generated.model.ActivityLocation.OwnerIdStep
        public CopyOfBuilder ownerId(String str) {
            return (CopyOfBuilder) super.ownerId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ActivityLocation.Builder, com.amplifyframework.datastore.generated.model.ActivityLocation.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }
    }

    public interface OwnerIdStep {
        BuildStep ownerId(String str);
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static ActivityLocation justId(String str) {
        return new ActivityLocation(str, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.engagementId, this.lat, this.lng, this.ownerId, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ActivityLocation.class != obj.getClass()) {
            return false;
        }
        ActivityLocation activityLocation = (ActivityLocation) obj;
        return s6c.m47909a(getId(), activityLocation.getId()) && s6c.m47909a(getAccountId(), activityLocation.getAccountId()) && s6c.m47909a(getEngagementId(), activityLocation.getEngagementId()) && s6c.m47909a(getLat(), activityLocation.getLat()) && s6c.m47909a(getLng(), activityLocation.getLng()) && s6c.m47909a(getOwnerId(), activityLocation.getOwnerId()) && s6c.m47909a(getCreatedAt(), activityLocation.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), activityLocation.getUpdatedAt());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getEngagementId() {
        return this.engagementId;
    }

    public String getId() {
        return this.id;
    }

    public String getLat() {
        return this.lat;
    }

    public String getLng() {
        return this.lng;
    }

    public String getOwnerId() {
        return this.ownerId;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public User getUser() {
        return this.user;
    }

    public int hashCode() {
        return (getId() + getAccountId() + getEngagementId() + getLat() + getLng() + getOwnerId() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ActivityLocation {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("engagementId=" + String.valueOf(getEngagementId()) + ", ");
        sb.append("lat=" + String.valueOf(getLat()) + ", ");
        sb.append("lng=" + String.valueOf(getLng()) + ", ");
        sb.append("ownerId=" + String.valueOf(getOwnerId()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private ActivityLocation(String str, String str2, String str3, String str4, String str5, String str6, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
        this.user = null;
        this.id = str;
        this.accountId = str2;
        this.engagementId = str3;
        this.lat = str4;
        this.lng = str5;
        this.ownerId = str6;
        this.createdAt = dateTime;
        this.updatedAt = dateTime2;
    }
}
