package com.amplifyframework.datastore.generated.model;

import com.amazonaws.regions.ServiceAbbreviations;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.BelongsTo;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.core.model.temporal.Temporal;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@Index(fields = {"dealId", "updatedAt"}, name = "transitionsByLinkedDeal")
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM)}, pluralName = "DealTransitions")
/* loaded from: classes5.dex */
public final class DealTransition implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @BelongsTo(targetName = "dealId", type = Deal.class)
    @ModelField(targetType = "Deal")
    private final Deal deal;

    @ModelField(targetType = "String")
    private final String dealStage;

    @BelongsTo(targetName = "engagementId", type = Engagement.class)
    @ModelField(targetType = "Engagement")
    private final Engagement engagement;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "Int")
    private final Integer numberOfDaysToMakeTransition;

    @ModelField(targetType = "String")
    private final String previousDealStage;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;
    public static final QueryField ID = QueryField.field("DealTransition", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("DealTransition", "accountId");
    public static final QueryField DEAL = QueryField.field("DealTransition", "dealId");
    public static final QueryField DEAL_STAGE = QueryField.field("DealTransition", "dealStage");
    public static final QueryField PREVIOUS_DEAL_STAGE = QueryField.field("DealTransition", "previousDealStage");
    public static final QueryField NUMBER_OF_DAYS_TO_MAKE_TRANSITION = QueryField.field("DealTransition", "numberOfDaysToMakeTransition");
    public static final QueryField ENGAGEMENT = QueryField.field("DealTransition", "engagementId");
    public static final QueryField CREATED_AT = QueryField.field("DealTransition", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("DealTransition", "updatedAt");

    public interface AccountIdStep {
        BuildStep accountId(String str);
    }

    public interface BuildStep {
        DealTransition build();

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep deal(Deal deal);

        BuildStep dealStage(String str);

        BuildStep engagement(Engagement engagement);

        BuildStep id(String str);

        BuildStep numberOfDaysToMakeTransition(Integer num);

        BuildStep previousDealStage(String str);

        BuildStep updatedAt(Temporal.DateTime dateTime);
    }

    public static class Builder implements AccountIdStep, BuildStep {
        private String accountId;
        private Temporal.DateTime createdAt;
        private Deal deal;
        private String dealStage;
        private Engagement engagement;
        private String id;
        private Integer numberOfDaysToMakeTransition;
        private String previousDealStage;
        private Temporal.DateTime updatedAt;

        @Override // com.amplifyframework.datastore.generated.model.DealTransition.AccountIdStep
        public BuildStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DealTransition.BuildStep
        public DealTransition build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new DealTransition(string, this.accountId, this.deal, this.dealStage, this.previousDealStage, this.numberOfDaysToMakeTransition, this.engagement, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.DealTransition.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DealTransition.BuildStep
        public BuildStep deal(Deal deal) {
            this.deal = deal;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DealTransition.BuildStep
        public BuildStep dealStage(String str) {
            this.dealStage = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DealTransition.BuildStep
        public BuildStep engagement(Engagement engagement) {
            this.engagement = engagement;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DealTransition.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DealTransition.BuildStep
        public BuildStep numberOfDaysToMakeTransition(Integer num) {
            this.numberOfDaysToMakeTransition = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DealTransition.BuildStep
        public BuildStep previousDealStage(String str) {
            this.previousDealStage = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DealTransition.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, Deal deal, String str3, String str4, Integer num, Engagement engagement, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            this.id = str;
            this.accountId = str2;
            this.deal = deal;
            this.dealStage = str3;
            this.previousDealStage = str4;
            this.numberOfDaysToMakeTransition = num;
            this.engagement = engagement;
            this.createdAt = dateTime;
            this.updatedAt = dateTime2;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, Deal deal, String str3, String str4, Integer num, Engagement engagement, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            super(str, str2, deal, str3, str4, num, engagement, dateTime, dateTime2);
            Objects.requireNonNull(str2);
        }

        @Override // com.amplifyframework.datastore.generated.model.DealTransition.Builder, com.amplifyframework.datastore.generated.model.DealTransition.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.DealTransition.Builder, com.amplifyframework.datastore.generated.model.DealTransition.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.DealTransition.Builder, com.amplifyframework.datastore.generated.model.DealTransition.BuildStep
        public CopyOfBuilder deal(Deal deal) {
            return (CopyOfBuilder) super.deal(deal);
        }

        @Override // com.amplifyframework.datastore.generated.model.DealTransition.Builder, com.amplifyframework.datastore.generated.model.DealTransition.BuildStep
        public CopyOfBuilder dealStage(String str) {
            return (CopyOfBuilder) super.dealStage(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.DealTransition.Builder, com.amplifyframework.datastore.generated.model.DealTransition.BuildStep
        public CopyOfBuilder engagement(Engagement engagement) {
            return (CopyOfBuilder) super.engagement(engagement);
        }

        @Override // com.amplifyframework.datastore.generated.model.DealTransition.Builder, com.amplifyframework.datastore.generated.model.DealTransition.BuildStep
        public CopyOfBuilder numberOfDaysToMakeTransition(Integer num) {
            return (CopyOfBuilder) super.numberOfDaysToMakeTransition(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.DealTransition.Builder, com.amplifyframework.datastore.generated.model.DealTransition.BuildStep
        public CopyOfBuilder previousDealStage(String str) {
            return (CopyOfBuilder) super.previousDealStage(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.DealTransition.Builder, com.amplifyframework.datastore.generated.model.DealTransition.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static DealTransition justId(String str) {
        return new DealTransition(str, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.deal, this.dealStage, this.previousDealStage, this.numberOfDaysToMakeTransition, this.engagement, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DealTransition.class != obj.getClass()) {
            return false;
        }
        DealTransition dealTransition = (DealTransition) obj;
        return s6c.m47909a(getId(), dealTransition.getId()) && s6c.m47909a(getAccountId(), dealTransition.getAccountId()) && s6c.m47909a(getDeal(), dealTransition.getDeal()) && s6c.m47909a(getDealStage(), dealTransition.getDealStage()) && s6c.m47909a(getPreviousDealStage(), dealTransition.getPreviousDealStage()) && s6c.m47909a(getNumberOfDaysToMakeTransition(), dealTransition.getNumberOfDaysToMakeTransition()) && s6c.m47909a(getEngagement(), dealTransition.getEngagement()) && s6c.m47909a(getCreatedAt(), dealTransition.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), dealTransition.getUpdatedAt());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public Deal getDeal() {
        return this.deal;
    }

    public String getDealStage() {
        return this.dealStage;
    }

    public Engagement getEngagement() {
        return this.engagement;
    }

    public String getId() {
        return this.id;
    }

    public Integer getNumberOfDaysToMakeTransition() {
        return this.numberOfDaysToMakeTransition;
    }

    public String getPreviousDealStage() {
        return this.previousDealStage;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        return (getId() + getAccountId() + getDeal() + getDealStage() + getPreviousDealStage() + getNumberOfDaysToMakeTransition() + getEngagement() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DealTransition {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("deal=" + String.valueOf(getDeal()) + ", ");
        sb.append("dealStage=" + String.valueOf(getDealStage()) + ", ");
        sb.append("previousDealStage=" + String.valueOf(getPreviousDealStage()) + ", ");
        sb.append("numberOfDaysToMakeTransition=" + String.valueOf(getNumberOfDaysToMakeTransition()) + ", ");
        sb.append("engagement=" + String.valueOf(getEngagement()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private DealTransition(String str, String str2, Deal deal, String str3, String str4, Integer num, Engagement engagement, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
        this.id = str;
        this.accountId = str2;
        this.deal = deal;
        this.dealStage = str3;
        this.previousDealStage = str4;
        this.numberOfDaysToMakeTransition = num;
        this.engagement = engagement;
        this.createdAt = dateTime;
        this.updatedAt = dateTime2;
    }
}
