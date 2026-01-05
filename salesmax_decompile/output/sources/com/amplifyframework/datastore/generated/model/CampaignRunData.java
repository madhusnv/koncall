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
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@Indexes({@Index(fields = {"accountId", "campaignRunId", "updatedAt"}, name = "byCampaignRunId"), @Index(fields = {"campaignOutputId", "campaignOutputType"}, name = "byCampaignOutputId")})
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.READ, ModelOperation.CREATE, ModelOperation.UPDATE, ModelOperation.DELETE}), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.READ, ModelOperation.CREATE, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM)}, pluralName = "CampaignRunData")
/* loaded from: classes5.dex */
public final class CampaignRunData implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @ModelField(targetType = "CampaignDefinition")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = CampaignDefinition.class)
    private final CampaignDefinition campaign;

    @ModelField(isRequired = true, targetType = "ID")
    private final String campaignId;

    @ModelField(targetType = "ID")
    private final String campaignOutputId;

    @ModelField(targetType = "String")
    private final String campaignOutputType;

    @ModelField(targetType = "ID")
    private final String campaignResponseId;

    @ModelField(targetType = "String")
    private final String campaignResponseType;

    @ModelField(targetType = "CampaignRun")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = CampaignRun.class)
    private final CampaignRun campaignRun;

    @ModelField(isRequired = true, targetType = "ID")
    private final String campaignRunId;

    @BelongsTo(targetName = "contactId", type = Contact.class)
    @ModelField(targetType = "Contact")
    private final Contact contact;

    @ModelField(targetType = "String")
    private final String contactSource;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime deliveredAt;

    @BelongsTo(targetName = "engagementId", type = Engagement.class)
    @ModelField(targetType = "Engagement")
    private final Engagement engagement;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime messageCreatedAt;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime readAt;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime repliedAt;

    @ModelField(targetType = "String")
    private final String responseBody;

    @ModelField(targetType = "String")
    private final String responseCategory;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime sentAt;

    @ModelField(targetType = "ID")
    private final String sourceId;

    @ModelField(targetType = "String")
    private final String sourceType;

    @ModelField(targetType = "String")
    private final String status;

    @ModelField(targetType = "StatusTransition")
    private final List<StatusTransition> statusTransition;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;
    public static final QueryField ID = QueryField.field("CampaignRunData", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("CampaignRunData", "accountId");
    public static final QueryField CONTACT_SOURCE = QueryField.field("CampaignRunData", "contactSource");
    public static final QueryField CONTACT = QueryField.field("CampaignRunData", "contactId");
    public static final QueryField CAMPAIGN_ID = QueryField.field("CampaignRunData", "campaignId");
    public static final QueryField CAMPAIGN_RUN_ID = QueryField.field("CampaignRunData", "campaignRunId");
    public static final QueryField ENGAGEMENT = QueryField.field("CampaignRunData", "engagementId");
    public static final QueryField CAMPAIGN_OUTPUT_TYPE = QueryField.field("CampaignRunData", "campaignOutputType");
    public static final QueryField CAMPAIGN_OUTPUT_ID = QueryField.field("CampaignRunData", "campaignOutputId");
    public static final QueryField CAMPAIGN_RESPONSE_TYPE = QueryField.field("CampaignRunData", "campaignResponseType");
    public static final QueryField CAMPAIGN_RESPONSE_ID = QueryField.field("CampaignRunData", "campaignResponseId");
    public static final QueryField RESPONSE_CATEGORY = QueryField.field("CampaignRunData", "responseCategory");
    public static final QueryField RESPONSE_BODY = QueryField.field("CampaignRunData", "responseBody");
    public static final QueryField STATUS_TRANSITION = QueryField.field("CampaignRunData", "statusTransition");
    public static final QueryField STATUS = QueryField.field("CampaignRunData", "status");
    public static final QueryField MESSAGE_CREATED_AT = QueryField.field("CampaignRunData", "messageCreatedAt");
    public static final QueryField SENT_AT = QueryField.field("CampaignRunData", "sentAt");
    public static final QueryField DELIVERED_AT = QueryField.field("CampaignRunData", "deliveredAt");
    public static final QueryField READ_AT = QueryField.field("CampaignRunData", "readAt");
    public static final QueryField REPLIED_AT = QueryField.field("CampaignRunData", "repliedAt");
    public static final QueryField SOURCE_ID = QueryField.field("CampaignRunData", "sourceId");
    public static final QueryField SOURCE_TYPE = QueryField.field("CampaignRunData", "sourceType");
    public static final QueryField CREATED_AT = QueryField.field("CampaignRunData", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("CampaignRunData", "updatedAt");

    public interface AccountIdStep {
        CampaignIdStep accountId(String str);
    }

    public interface BuildStep {
        CampaignRunData build();

        BuildStep campaignOutputId(String str);

        BuildStep campaignOutputType(String str);

        BuildStep campaignResponseId(String str);

        BuildStep campaignResponseType(String str);

        BuildStep contact(Contact contact);

        BuildStep contactSource(String str);

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep deliveredAt(Temporal.DateTime dateTime);

        BuildStep engagement(Engagement engagement);

        BuildStep id(String str);

        BuildStep messageCreatedAt(Temporal.DateTime dateTime);

        BuildStep readAt(Temporal.DateTime dateTime);

        BuildStep repliedAt(Temporal.DateTime dateTime);

        BuildStep responseBody(String str);

        BuildStep responseCategory(String str);

        BuildStep sentAt(Temporal.DateTime dateTime);

        BuildStep sourceId(String str);

        BuildStep sourceType(String str);

        BuildStep status(String str);

        BuildStep statusTransition(List<StatusTransition> list);

        BuildStep updatedAt(Temporal.DateTime dateTime);
    }

    public static class Builder implements AccountIdStep, CampaignIdStep, CampaignRunIdStep, BuildStep {
        private String accountId;
        private String campaignId;
        private String campaignOutputId;
        private String campaignOutputType;
        private String campaignResponseId;
        private String campaignResponseType;
        private String campaignRunId;
        private Contact contact;
        private String contactSource;
        private Temporal.DateTime createdAt;
        private Temporal.DateTime deliveredAt;
        private Engagement engagement;
        private String id;
        private Temporal.DateTime messageCreatedAt;
        private Temporal.DateTime readAt;
        private Temporal.DateTime repliedAt;
        private String responseBody;
        private String responseCategory;
        private Temporal.DateTime sentAt;
        private String sourceId;
        private String sourceType;
        private String status;
        private List<StatusTransition> statusTransition;
        private Temporal.DateTime updatedAt;

        @Override // com.amplifyframework.datastore.generated.model.CampaignRunData.AccountIdStep
        public CampaignIdStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRunData.BuildStep
        public CampaignRunData build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new CampaignRunData(string, this.accountId, this.contactSource, this.contact, this.campaignId, this.campaignRunId, this.engagement, this.campaignOutputType, this.campaignOutputId, this.campaignResponseType, this.campaignResponseId, this.responseCategory, this.responseBody, this.statusTransition, this.status, this.messageCreatedAt, this.sentAt, this.deliveredAt, this.readAt, this.repliedAt, this.sourceId, this.sourceType, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRunData.CampaignIdStep
        public CampaignRunIdStep campaignId(String str) {
            Objects.requireNonNull(str);
            this.campaignId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRunData.BuildStep
        public BuildStep campaignOutputId(String str) {
            this.campaignOutputId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRunData.BuildStep
        public BuildStep campaignOutputType(String str) {
            this.campaignOutputType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRunData.BuildStep
        public BuildStep campaignResponseId(String str) {
            this.campaignResponseId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRunData.BuildStep
        public BuildStep campaignResponseType(String str) {
            this.campaignResponseType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRunData.CampaignRunIdStep
        public BuildStep campaignRunId(String str) {
            Objects.requireNonNull(str);
            this.campaignRunId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRunData.BuildStep
        public BuildStep contact(Contact contact) {
            this.contact = contact;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRunData.BuildStep
        public BuildStep contactSource(String str) {
            this.contactSource = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRunData.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRunData.BuildStep
        public BuildStep deliveredAt(Temporal.DateTime dateTime) {
            this.deliveredAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRunData.BuildStep
        public BuildStep engagement(Engagement engagement) {
            this.engagement = engagement;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRunData.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRunData.BuildStep
        public BuildStep messageCreatedAt(Temporal.DateTime dateTime) {
            this.messageCreatedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRunData.BuildStep
        public BuildStep readAt(Temporal.DateTime dateTime) {
            this.readAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRunData.BuildStep
        public BuildStep repliedAt(Temporal.DateTime dateTime) {
            this.repliedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRunData.BuildStep
        public BuildStep responseBody(String str) {
            this.responseBody = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRunData.BuildStep
        public BuildStep responseCategory(String str) {
            this.responseCategory = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRunData.BuildStep
        public BuildStep sentAt(Temporal.DateTime dateTime) {
            this.sentAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRunData.BuildStep
        public BuildStep sourceId(String str) {
            this.sourceId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRunData.BuildStep
        public BuildStep sourceType(String str) {
            this.sourceType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRunData.BuildStep
        public BuildStep status(String str) {
            this.status = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRunData.BuildStep
        public BuildStep statusTransition(List<StatusTransition> list) {
            this.statusTransition = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRunData.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, Contact contact, String str4, String str5, Engagement engagement, String str6, String str7, String str8, String str9, String str10, String str11, List<StatusTransition> list, String str12, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3, Temporal.DateTime dateTime4, Temporal.DateTime dateTime5, String str13, String str14, Temporal.DateTime dateTime6, Temporal.DateTime dateTime7) {
            this.id = str;
            this.accountId = str2;
            this.contactSource = str3;
            this.contact = contact;
            this.campaignId = str4;
            this.campaignRunId = str5;
            this.engagement = engagement;
            this.campaignOutputType = str6;
            this.campaignOutputId = str7;
            this.campaignResponseType = str8;
            this.campaignResponseId = str9;
            this.responseCategory = str10;
            this.responseBody = str11;
            this.statusTransition = list;
            this.status = str12;
            this.messageCreatedAt = dateTime;
            this.sentAt = dateTime2;
            this.deliveredAt = dateTime3;
            this.readAt = dateTime4;
            this.repliedAt = dateTime5;
            this.sourceId = str13;
            this.sourceType = str14;
            this.createdAt = dateTime6;
            this.updatedAt = dateTime7;
        }
    }

    public interface CampaignIdStep {
        CampaignRunIdStep campaignId(String str);
    }

    public interface CampaignRunIdStep {
        BuildStep campaignRunId(String str);
    }

    public final class CopyOfBuilder extends Builder {
        @Override // com.amplifyframework.datastore.generated.model.CampaignRunData.Builder, com.amplifyframework.datastore.generated.model.CampaignRunData.BuildStep
        public /* bridge */ /* synthetic */ BuildStep statusTransition(List list) {
            return statusTransition((List<StatusTransition>) list);
        }

        private CopyOfBuilder(String str, String str2, String str3, Contact contact, String str4, String str5, Engagement engagement, String str6, String str7, String str8, String str9, String str10, String str11, List<StatusTransition> list, String str12, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3, Temporal.DateTime dateTime4, Temporal.DateTime dateTime5, String str13, String str14, Temporal.DateTime dateTime6, Temporal.DateTime dateTime7) {
            super(str, str2, str3, contact, str4, str5, engagement, str6, str7, str8, str9, str10, str11, list, str12, dateTime, dateTime2, dateTime3, dateTime4, dateTime5, str13, str14, dateTime6, dateTime7);
            Objects.requireNonNull(str2);
            Objects.requireNonNull(str4);
            Objects.requireNonNull(str5);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRunData.Builder, com.amplifyframework.datastore.generated.model.CampaignRunData.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRunData.Builder, com.amplifyframework.datastore.generated.model.CampaignRunData.CampaignIdStep
        public CopyOfBuilder campaignId(String str) {
            return (CopyOfBuilder) super.campaignId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRunData.Builder, com.amplifyframework.datastore.generated.model.CampaignRunData.BuildStep
        public CopyOfBuilder campaignOutputId(String str) {
            return (CopyOfBuilder) super.campaignOutputId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRunData.Builder, com.amplifyframework.datastore.generated.model.CampaignRunData.BuildStep
        public CopyOfBuilder campaignOutputType(String str) {
            return (CopyOfBuilder) super.campaignOutputType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRunData.Builder, com.amplifyframework.datastore.generated.model.CampaignRunData.BuildStep
        public CopyOfBuilder campaignResponseId(String str) {
            return (CopyOfBuilder) super.campaignResponseId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRunData.Builder, com.amplifyframework.datastore.generated.model.CampaignRunData.BuildStep
        public CopyOfBuilder campaignResponseType(String str) {
            return (CopyOfBuilder) super.campaignResponseType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRunData.Builder, com.amplifyframework.datastore.generated.model.CampaignRunData.CampaignRunIdStep
        public CopyOfBuilder campaignRunId(String str) {
            return (CopyOfBuilder) super.campaignRunId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRunData.Builder, com.amplifyframework.datastore.generated.model.CampaignRunData.BuildStep
        public CopyOfBuilder contact(Contact contact) {
            return (CopyOfBuilder) super.contact(contact);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRunData.Builder, com.amplifyframework.datastore.generated.model.CampaignRunData.BuildStep
        public CopyOfBuilder contactSource(String str) {
            return (CopyOfBuilder) super.contactSource(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRunData.Builder, com.amplifyframework.datastore.generated.model.CampaignRunData.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRunData.Builder, com.amplifyframework.datastore.generated.model.CampaignRunData.BuildStep
        public CopyOfBuilder deliveredAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.deliveredAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRunData.Builder, com.amplifyframework.datastore.generated.model.CampaignRunData.BuildStep
        public CopyOfBuilder engagement(Engagement engagement) {
            return (CopyOfBuilder) super.engagement(engagement);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRunData.Builder, com.amplifyframework.datastore.generated.model.CampaignRunData.BuildStep
        public CopyOfBuilder messageCreatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.messageCreatedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRunData.Builder, com.amplifyframework.datastore.generated.model.CampaignRunData.BuildStep
        public CopyOfBuilder readAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.readAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRunData.Builder, com.amplifyframework.datastore.generated.model.CampaignRunData.BuildStep
        public CopyOfBuilder repliedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.repliedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRunData.Builder, com.amplifyframework.datastore.generated.model.CampaignRunData.BuildStep
        public CopyOfBuilder responseBody(String str) {
            return (CopyOfBuilder) super.responseBody(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRunData.Builder, com.amplifyframework.datastore.generated.model.CampaignRunData.BuildStep
        public CopyOfBuilder responseCategory(String str) {
            return (CopyOfBuilder) super.responseCategory(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRunData.Builder, com.amplifyframework.datastore.generated.model.CampaignRunData.BuildStep
        public CopyOfBuilder sentAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.sentAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRunData.Builder, com.amplifyframework.datastore.generated.model.CampaignRunData.BuildStep
        public CopyOfBuilder sourceId(String str) {
            return (CopyOfBuilder) super.sourceId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRunData.Builder, com.amplifyframework.datastore.generated.model.CampaignRunData.BuildStep
        public CopyOfBuilder sourceType(String str) {
            return (CopyOfBuilder) super.sourceType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRunData.Builder, com.amplifyframework.datastore.generated.model.CampaignRunData.BuildStep
        public CopyOfBuilder status(String str) {
            return (CopyOfBuilder) super.status(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRunData.Builder, com.amplifyframework.datastore.generated.model.CampaignRunData.BuildStep
        public CopyOfBuilder statusTransition(List<StatusTransition> list) {
            return (CopyOfBuilder) super.statusTransition(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRunData.Builder, com.amplifyframework.datastore.generated.model.CampaignRunData.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static CampaignRunData justId(String str) {
        return new CampaignRunData(str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.contactSource, this.contact, this.campaignId, this.campaignRunId, this.engagement, this.campaignOutputType, this.campaignOutputId, this.campaignResponseType, this.campaignResponseId, this.responseCategory, this.responseBody, this.statusTransition, this.status, this.messageCreatedAt, this.sentAt, this.deliveredAt, this.readAt, this.repliedAt, this.sourceId, this.sourceType, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CampaignRunData.class != obj.getClass()) {
            return false;
        }
        CampaignRunData campaignRunData = (CampaignRunData) obj;
        return s6c.m47909a(getId(), campaignRunData.getId()) && s6c.m47909a(getAccountId(), campaignRunData.getAccountId()) && s6c.m47909a(getContactSource(), campaignRunData.getContactSource()) && s6c.m47909a(getContact(), campaignRunData.getContact()) && s6c.m47909a(getCampaignId(), campaignRunData.getCampaignId()) && s6c.m47909a(getCampaignRunId(), campaignRunData.getCampaignRunId()) && s6c.m47909a(getEngagement(), campaignRunData.getEngagement()) && s6c.m47909a(getCampaignOutputType(), campaignRunData.getCampaignOutputType()) && s6c.m47909a(getCampaignOutputId(), campaignRunData.getCampaignOutputId()) && s6c.m47909a(getCampaignResponseType(), campaignRunData.getCampaignResponseType()) && s6c.m47909a(getCampaignResponseId(), campaignRunData.getCampaignResponseId()) && s6c.m47909a(getResponseCategory(), campaignRunData.getResponseCategory()) && s6c.m47909a(getResponseBody(), campaignRunData.getResponseBody()) && s6c.m47909a(getStatusTransition(), campaignRunData.getStatusTransition()) && s6c.m47909a(getStatus(), campaignRunData.getStatus()) && s6c.m47909a(getMessageCreatedAt(), campaignRunData.getMessageCreatedAt()) && s6c.m47909a(getSentAt(), campaignRunData.getSentAt()) && s6c.m47909a(getDeliveredAt(), campaignRunData.getDeliveredAt()) && s6c.m47909a(getReadAt(), campaignRunData.getReadAt()) && s6c.m47909a(getRepliedAt(), campaignRunData.getRepliedAt()) && s6c.m47909a(getSourceId(), campaignRunData.getSourceId()) && s6c.m47909a(getSourceType(), campaignRunData.getSourceType()) && s6c.m47909a(getCreatedAt(), campaignRunData.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), campaignRunData.getUpdatedAt());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public CampaignDefinition getCampaign() {
        return this.campaign;
    }

    public String getCampaignId() {
        return this.campaignId;
    }

    public String getCampaignOutputId() {
        return this.campaignOutputId;
    }

    public String getCampaignOutputType() {
        return this.campaignOutputType;
    }

    public String getCampaignResponseId() {
        return this.campaignResponseId;
    }

    public String getCampaignResponseType() {
        return this.campaignResponseType;
    }

    public CampaignRun getCampaignRun() {
        return this.campaignRun;
    }

    public String getCampaignRunId() {
        return this.campaignRunId;
    }

    public Contact getContact() {
        return this.contact;
    }

    public String getContactSource() {
        return this.contactSource;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public Temporal.DateTime getDeliveredAt() {
        return this.deliveredAt;
    }

    public Engagement getEngagement() {
        return this.engagement;
    }

    public String getId() {
        return this.id;
    }

    public Temporal.DateTime getMessageCreatedAt() {
        return this.messageCreatedAt;
    }

    public Temporal.DateTime getReadAt() {
        return this.readAt;
    }

    public Temporal.DateTime getRepliedAt() {
        return this.repliedAt;
    }

    public String getResponseBody() {
        return this.responseBody;
    }

    public String getResponseCategory() {
        return this.responseCategory;
    }

    public Temporal.DateTime getSentAt() {
        return this.sentAt;
    }

    public String getSourceId() {
        return this.sourceId;
    }

    public String getSourceType() {
        return this.sourceType;
    }

    public String getStatus() {
        return this.status;
    }

    public List<StatusTransition> getStatusTransition() {
        return this.statusTransition;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        return (getId() + getAccountId() + getContactSource() + getContact() + getCampaignId() + getCampaignRunId() + getEngagement() + getCampaignOutputType() + getCampaignOutputId() + getCampaignResponseType() + getCampaignResponseId() + getResponseCategory() + getResponseBody() + getStatusTransition() + getStatus() + getMessageCreatedAt() + getSentAt() + getDeliveredAt() + getReadAt() + getRepliedAt() + getSourceId() + getSourceType() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CampaignRunData {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("contactSource=" + String.valueOf(getContactSource()) + ", ");
        sb.append("contact=" + String.valueOf(getContact()) + ", ");
        sb.append("campaignId=" + String.valueOf(getCampaignId()) + ", ");
        sb.append("campaignRunId=" + String.valueOf(getCampaignRunId()) + ", ");
        sb.append("engagement=" + String.valueOf(getEngagement()) + ", ");
        sb.append("campaignOutputType=" + String.valueOf(getCampaignOutputType()) + ", ");
        sb.append("campaignOutputId=" + String.valueOf(getCampaignOutputId()) + ", ");
        sb.append("campaignResponseType=" + String.valueOf(getCampaignResponseType()) + ", ");
        sb.append("campaignResponseId=" + String.valueOf(getCampaignResponseId()) + ", ");
        sb.append("responseCategory=" + String.valueOf(getResponseCategory()) + ", ");
        sb.append("responseBody=" + String.valueOf(getResponseBody()) + ", ");
        sb.append("statusTransition=" + String.valueOf(getStatusTransition()) + ", ");
        sb.append("status=" + String.valueOf(getStatus()) + ", ");
        sb.append("messageCreatedAt=" + String.valueOf(getMessageCreatedAt()) + ", ");
        sb.append("sentAt=" + String.valueOf(getSentAt()) + ", ");
        sb.append("deliveredAt=" + String.valueOf(getDeliveredAt()) + ", ");
        sb.append("readAt=" + String.valueOf(getReadAt()) + ", ");
        sb.append("repliedAt=" + String.valueOf(getRepliedAt()) + ", ");
        sb.append("sourceId=" + String.valueOf(getSourceId()) + ", ");
        sb.append("sourceType=" + String.valueOf(getSourceType()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private CampaignRunData(String str, String str2, String str3, Contact contact, String str4, String str5, Engagement engagement, String str6, String str7, String str8, String str9, String str10, String str11, List<StatusTransition> list, String str12, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3, Temporal.DateTime dateTime4, Temporal.DateTime dateTime5, String str13, String str14, Temporal.DateTime dateTime6, Temporal.DateTime dateTime7) {
        this.campaign = null;
        this.campaignRun = null;
        this.id = str;
        this.accountId = str2;
        this.contactSource = str3;
        this.contact = contact;
        this.campaignId = str4;
        this.campaignRunId = str5;
        this.engagement = engagement;
        this.campaignOutputType = str6;
        this.campaignOutputId = str7;
        this.campaignResponseType = str8;
        this.campaignResponseId = str9;
        this.responseCategory = str10;
        this.responseBody = str11;
        this.statusTransition = list;
        this.status = str12;
        this.messageCreatedAt = dateTime;
        this.sentAt = dateTime2;
        this.deliveredAt = dateTime3;
        this.readAt = dateTime4;
        this.repliedAt = dateTime5;
        this.sourceId = str13;
        this.sourceType = str14;
        this.createdAt = dateTime6;
        this.updatedAt = dateTime7;
    }
}
