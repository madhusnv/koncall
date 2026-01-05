package com.amplifyframework.datastore.generated.model;

import com.amazonaws.regions.ServiceAbbreviations;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.HasOne;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.core.model.temporal.Temporal;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@Index(fields = {"accountId", "phoneNumber"}, name = "phoneByAccount")
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE})}, pluralName = "WabaPhoneNumbers")
/* loaded from: classes5.dex */
public final class WabaPhoneNumber implements Model {

    @ModelField(targetType = "String")
    private final String accessToken;

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(targetType = "ID")
    private final String createdById;

    @ModelField(targetType = "String")
    private final String currentLimitCategory;

    @ModelField(targetType = "String")
    private final String displayNameUpdate;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime displayNameUpdateDateTime;

    @ModelField(targetType = "EntityList")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = EntityList.class)
    private final EntityList entityList;

    @ModelField(targetType = "ID")
    private final String entityListId;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "String")
    private final String internalName;

    @ModelField(targetType = "Boolean")
    private final Boolean isDefault;

    @ModelField(targetType = "String")
    private final String name;

    @ModelField(isRequired = true, targetType = "String")
    private final String phoneNumber;

    @ModelField(isRequired = true, targetType = "ID")
    private final String phoneNumberId;

    @ModelField(targetType = "String")
    private final String phoneNumberQualityUpdate;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime phoneNumberQualityUpdateTime;

    @ModelField(targetType = "String")
    private final String qualityRating;

    @ModelField(targetType = "Int")
    private final Integer quota;

    @ModelField(targetType = "String")
    private final String rejectionReason;

    @ModelField(targetType = "String")
    private final String requestedDisplayName;

    @ModelField(targetType = "String")
    private final String status;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;

    @ModelField(targetType = "ID")
    private final String updatedById;

    @ModelField(isRequired = true, targetType = "ID")
    private final String wabaAccountId;

    @ModelField(targetType = "String")
    private final String wabaNumberDecision;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime wabaNumberDecisionTime;

    @ModelField(targetType = "AWSJSON")
    private final String welcomeMessage;
    public static final QueryField ID = QueryField.field("WabaPhoneNumber", OutcomeConstants.OUTCOME_ID);
    public static final QueryField WABA_ACCOUNT_ID = QueryField.field("WabaPhoneNumber", "wabaAccountId");
    public static final QueryField ACCOUNT_ID = QueryField.field("WabaPhoneNumber", "accountId");
    public static final QueryField PHONE_NUMBER_ID = QueryField.field("WabaPhoneNumber", "phoneNumberId");
    public static final QueryField PHONE_NUMBER = QueryField.field("WabaPhoneNumber", "phoneNumber");
    public static final QueryField IS_DEFAULT = QueryField.field("WabaPhoneNumber", "isDefault");
    public static final QueryField ACCESS_TOKEN = QueryField.field("WabaPhoneNumber", "accessToken");
    public static final QueryField NAME = QueryField.field("WabaPhoneNumber", "name");
    public static final QueryField INTERNAL_NAME = QueryField.field("WabaPhoneNumber", "internalName");
    public static final QueryField QUOTA = QueryField.field("WabaPhoneNumber", "quota");
    public static final QueryField CURRENT_LIMIT_CATEGORY = QueryField.field("WabaPhoneNumber", "currentLimitCategory");
    public static final QueryField STATUS = QueryField.field("WabaPhoneNumber", "status");
    public static final QueryField QUALITY_RATING = QueryField.field("WabaPhoneNumber", "qualityRating");
    public static final QueryField ENTITY_LIST_ID = QueryField.field("WabaPhoneNumber", "entityListId");
    public static final QueryField CREATED_AT = QueryField.field("WabaPhoneNumber", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("WabaPhoneNumber", "updatedAt");
    public static final QueryField WELCOME_MESSAGE = QueryField.field("WabaPhoneNumber", "welcomeMessage");
    public static final QueryField REQUESTED_DISPLAY_NAME = QueryField.field("WabaPhoneNumber", "requestedDisplayName");
    public static final QueryField DISPLAY_NAME_UPDATE = QueryField.field("WabaPhoneNumber", "displayNameUpdate");
    public static final QueryField DISPLAY_NAME_UPDATE_DATE_TIME = QueryField.field("WabaPhoneNumber", "displayNameUpdateDateTime");
    public static final QueryField WABA_NUMBER_DECISION = QueryField.field("WabaPhoneNumber", "wabaNumberDecision");
    public static final QueryField WABA_NUMBER_DECISION_TIME = QueryField.field("WabaPhoneNumber", "wabaNumberDecisionTime");
    public static final QueryField REJECTION_REASON = QueryField.field("WabaPhoneNumber", "rejectionReason");
    public static final QueryField PHONE_NUMBER_QUALITY_UPDATE = QueryField.field("WabaPhoneNumber", "phoneNumberQualityUpdate");
    public static final QueryField PHONE_NUMBER_QUALITY_UPDATE_TIME = QueryField.field("WabaPhoneNumber", "phoneNumberQualityUpdateTime");
    public static final QueryField CREATED_BY_ID = QueryField.field("WabaPhoneNumber", "createdById");
    public static final QueryField UPDATED_BY_ID = QueryField.field("WabaPhoneNumber", "updatedById");

    public interface AccountIdStep {
        PhoneNumberIdStep accountId(String str);
    }

    public interface BuildStep {
        BuildStep accessToken(String str);

        WabaPhoneNumber build();

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep createdById(String str);

        BuildStep currentLimitCategory(String str);

        BuildStep displayNameUpdate(String str);

        BuildStep displayNameUpdateDateTime(Temporal.DateTime dateTime);

        BuildStep entityListId(String str);

        BuildStep id(String str);

        BuildStep internalName(String str);

        BuildStep isDefault(Boolean bool);

        BuildStep name(String str);

        BuildStep phoneNumberQualityUpdate(String str);

        BuildStep phoneNumberQualityUpdateTime(Temporal.DateTime dateTime);

        BuildStep qualityRating(String str);

        BuildStep quota(Integer num);

        BuildStep rejectionReason(String str);

        BuildStep requestedDisplayName(String str);

        BuildStep status(String str);

        BuildStep updatedAt(Temporal.DateTime dateTime);

        BuildStep updatedById(String str);

        BuildStep wabaNumberDecision(String str);

        BuildStep wabaNumberDecisionTime(Temporal.DateTime dateTime);

        BuildStep welcomeMessage(String str);
    }

    public static class Builder implements WabaAccountIdStep, AccountIdStep, PhoneNumberIdStep, PhoneNumberStep, BuildStep {
        private String accessToken;
        private String accountId;
        private Temporal.DateTime createdAt;
        private String createdById;
        private String currentLimitCategory;
        private String displayNameUpdate;
        private Temporal.DateTime displayNameUpdateDateTime;
        private String entityListId;
        private String id;
        private String internalName;
        private Boolean isDefault;
        private String name;
        private String phoneNumber;
        private String phoneNumberId;
        private String phoneNumberQualityUpdate;
        private Temporal.DateTime phoneNumberQualityUpdateTime;
        private String qualityRating;
        private Integer quota;
        private String rejectionReason;
        private String requestedDisplayName;
        private String status;
        private Temporal.DateTime updatedAt;
        private String updatedById;
        private String wabaAccountId;
        private String wabaNumberDecision;
        private Temporal.DateTime wabaNumberDecisionTime;
        private String welcomeMessage;

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumber.BuildStep
        public BuildStep accessToken(String str) {
            this.accessToken = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumber.AccountIdStep
        public PhoneNumberIdStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumber.BuildStep
        public WabaPhoneNumber build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new WabaPhoneNumber(string, this.wabaAccountId, this.accountId, this.phoneNumberId, this.phoneNumber, this.isDefault, this.accessToken, this.name, this.internalName, this.quota, this.currentLimitCategory, this.status, this.qualityRating, this.entityListId, this.createdAt, this.updatedAt, this.welcomeMessage, this.requestedDisplayName, this.displayNameUpdate, this.displayNameUpdateDateTime, this.wabaNumberDecision, this.wabaNumberDecisionTime, this.rejectionReason, this.phoneNumberQualityUpdate, this.phoneNumberQualityUpdateTime, this.createdById, this.updatedById);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumber.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumber.BuildStep
        public BuildStep createdById(String str) {
            this.createdById = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumber.BuildStep
        public BuildStep currentLimitCategory(String str) {
            this.currentLimitCategory = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumber.BuildStep
        public BuildStep displayNameUpdate(String str) {
            this.displayNameUpdate = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumber.BuildStep
        public BuildStep displayNameUpdateDateTime(Temporal.DateTime dateTime) {
            this.displayNameUpdateDateTime = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumber.BuildStep
        public BuildStep entityListId(String str) {
            this.entityListId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumber.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumber.BuildStep
        public BuildStep internalName(String str) {
            this.internalName = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumber.BuildStep
        public BuildStep isDefault(Boolean bool) {
            this.isDefault = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumber.BuildStep
        public BuildStep name(String str) {
            this.name = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumber.PhoneNumberStep
        public BuildStep phoneNumber(String str) {
            Objects.requireNonNull(str);
            this.phoneNumber = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumber.PhoneNumberIdStep
        public PhoneNumberStep phoneNumberId(String str) {
            Objects.requireNonNull(str);
            this.phoneNumberId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumber.BuildStep
        public BuildStep phoneNumberQualityUpdate(String str) {
            this.phoneNumberQualityUpdate = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumber.BuildStep
        public BuildStep phoneNumberQualityUpdateTime(Temporal.DateTime dateTime) {
            this.phoneNumberQualityUpdateTime = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumber.BuildStep
        public BuildStep qualityRating(String str) {
            this.qualityRating = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumber.BuildStep
        public BuildStep quota(Integer num) {
            this.quota = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumber.BuildStep
        public BuildStep rejectionReason(String str) {
            this.rejectionReason = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumber.BuildStep
        public BuildStep requestedDisplayName(String str) {
            this.requestedDisplayName = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumber.BuildStep
        public BuildStep status(String str) {
            this.status = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumber.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumber.BuildStep
        public BuildStep updatedById(String str) {
            this.updatedById = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumber.WabaAccountIdStep
        public AccountIdStep wabaAccountId(String str) {
            Objects.requireNonNull(str);
            this.wabaAccountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumber.BuildStep
        public BuildStep wabaNumberDecision(String str) {
            this.wabaNumberDecision = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumber.BuildStep
        public BuildStep wabaNumberDecisionTime(Temporal.DateTime dateTime) {
            this.wabaNumberDecisionTime = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumber.BuildStep
        public BuildStep welcomeMessage(String str) {
            this.welcomeMessage = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, String str7, String str8, Integer num, String str9, String str10, String str11, String str12, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, String str13, String str14, String str15, Temporal.DateTime dateTime3, String str16, Temporal.DateTime dateTime4, String str17, String str18, Temporal.DateTime dateTime5, String str19, String str20) {
            this.id = str;
            this.wabaAccountId = str2;
            this.accountId = str3;
            this.phoneNumberId = str4;
            this.phoneNumber = str5;
            this.isDefault = bool;
            this.accessToken = str6;
            this.name = str7;
            this.internalName = str8;
            this.quota = num;
            this.currentLimitCategory = str9;
            this.status = str10;
            this.qualityRating = str11;
            this.entityListId = str12;
            this.createdAt = dateTime;
            this.updatedAt = dateTime2;
            this.welcomeMessage = str13;
            this.requestedDisplayName = str14;
            this.displayNameUpdate = str15;
            this.displayNameUpdateDateTime = dateTime3;
            this.wabaNumberDecision = str16;
            this.wabaNumberDecisionTime = dateTime4;
            this.rejectionReason = str17;
            this.phoneNumberQualityUpdate = str18;
            this.phoneNumberQualityUpdateTime = dateTime5;
            this.createdById = str19;
            this.updatedById = str20;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, String str7, String str8, Integer num, String str9, String str10, String str11, String str12, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, String str13, String str14, String str15, Temporal.DateTime dateTime3, String str16, Temporal.DateTime dateTime4, String str17, String str18, Temporal.DateTime dateTime5, String str19, String str20) {
            super(str, str2, str3, str4, str5, bool, str6, str7, str8, num, str9, str10, str11, str12, dateTime, dateTime2, str13, str14, str15, dateTime3, str16, dateTime4, str17, str18, dateTime5, str19, str20);
            Objects.requireNonNull(str2);
            Objects.requireNonNull(str3);
            Objects.requireNonNull(str4);
            Objects.requireNonNull(str5);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumber.Builder, com.amplifyframework.datastore.generated.model.WabaPhoneNumber.BuildStep
        public CopyOfBuilder accessToken(String str) {
            return (CopyOfBuilder) super.accessToken(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumber.Builder, com.amplifyframework.datastore.generated.model.WabaPhoneNumber.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumber.Builder, com.amplifyframework.datastore.generated.model.WabaPhoneNumber.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumber.Builder, com.amplifyframework.datastore.generated.model.WabaPhoneNumber.BuildStep
        public CopyOfBuilder createdById(String str) {
            return (CopyOfBuilder) super.createdById(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumber.Builder, com.amplifyframework.datastore.generated.model.WabaPhoneNumber.BuildStep
        public CopyOfBuilder currentLimitCategory(String str) {
            return (CopyOfBuilder) super.currentLimitCategory(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumber.Builder, com.amplifyframework.datastore.generated.model.WabaPhoneNumber.BuildStep
        public CopyOfBuilder displayNameUpdate(String str) {
            return (CopyOfBuilder) super.displayNameUpdate(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumber.Builder, com.amplifyframework.datastore.generated.model.WabaPhoneNumber.BuildStep
        public CopyOfBuilder displayNameUpdateDateTime(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.displayNameUpdateDateTime(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumber.Builder, com.amplifyframework.datastore.generated.model.WabaPhoneNumber.BuildStep
        public CopyOfBuilder entityListId(String str) {
            return (CopyOfBuilder) super.entityListId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumber.Builder, com.amplifyframework.datastore.generated.model.WabaPhoneNumber.BuildStep
        public CopyOfBuilder internalName(String str) {
            return (CopyOfBuilder) super.internalName(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumber.Builder, com.amplifyframework.datastore.generated.model.WabaPhoneNumber.BuildStep
        public CopyOfBuilder isDefault(Boolean bool) {
            return (CopyOfBuilder) super.isDefault(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumber.Builder, com.amplifyframework.datastore.generated.model.WabaPhoneNumber.BuildStep
        public CopyOfBuilder name(String str) {
            return (CopyOfBuilder) super.name(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumber.Builder, com.amplifyframework.datastore.generated.model.WabaPhoneNumber.PhoneNumberStep
        public CopyOfBuilder phoneNumber(String str) {
            return (CopyOfBuilder) super.phoneNumber(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumber.Builder, com.amplifyframework.datastore.generated.model.WabaPhoneNumber.PhoneNumberIdStep
        public CopyOfBuilder phoneNumberId(String str) {
            return (CopyOfBuilder) super.phoneNumberId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumber.Builder, com.amplifyframework.datastore.generated.model.WabaPhoneNumber.BuildStep
        public CopyOfBuilder phoneNumberQualityUpdate(String str) {
            return (CopyOfBuilder) super.phoneNumberQualityUpdate(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumber.Builder, com.amplifyframework.datastore.generated.model.WabaPhoneNumber.BuildStep
        public CopyOfBuilder phoneNumberQualityUpdateTime(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.phoneNumberQualityUpdateTime(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumber.Builder, com.amplifyframework.datastore.generated.model.WabaPhoneNumber.BuildStep
        public CopyOfBuilder qualityRating(String str) {
            return (CopyOfBuilder) super.qualityRating(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumber.Builder, com.amplifyframework.datastore.generated.model.WabaPhoneNumber.BuildStep
        public CopyOfBuilder quota(Integer num) {
            return (CopyOfBuilder) super.quota(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumber.Builder, com.amplifyframework.datastore.generated.model.WabaPhoneNumber.BuildStep
        public CopyOfBuilder rejectionReason(String str) {
            return (CopyOfBuilder) super.rejectionReason(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumber.Builder, com.amplifyframework.datastore.generated.model.WabaPhoneNumber.BuildStep
        public CopyOfBuilder requestedDisplayName(String str) {
            return (CopyOfBuilder) super.requestedDisplayName(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumber.Builder, com.amplifyframework.datastore.generated.model.WabaPhoneNumber.BuildStep
        public CopyOfBuilder status(String str) {
            return (CopyOfBuilder) super.status(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumber.Builder, com.amplifyframework.datastore.generated.model.WabaPhoneNumber.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumber.Builder, com.amplifyframework.datastore.generated.model.WabaPhoneNumber.BuildStep
        public CopyOfBuilder updatedById(String str) {
            return (CopyOfBuilder) super.updatedById(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumber.Builder, com.amplifyframework.datastore.generated.model.WabaPhoneNumber.WabaAccountIdStep
        public CopyOfBuilder wabaAccountId(String str) {
            return (CopyOfBuilder) super.wabaAccountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumber.Builder, com.amplifyframework.datastore.generated.model.WabaPhoneNumber.BuildStep
        public CopyOfBuilder wabaNumberDecision(String str) {
            return (CopyOfBuilder) super.wabaNumberDecision(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumber.Builder, com.amplifyframework.datastore.generated.model.WabaPhoneNumber.BuildStep
        public CopyOfBuilder wabaNumberDecisionTime(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.wabaNumberDecisionTime(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumber.Builder, com.amplifyframework.datastore.generated.model.WabaPhoneNumber.BuildStep
        public CopyOfBuilder welcomeMessage(String str) {
            return (CopyOfBuilder) super.welcomeMessage(str);
        }
    }

    public interface PhoneNumberIdStep {
        PhoneNumberStep phoneNumberId(String str);
    }

    public interface PhoneNumberStep {
        BuildStep phoneNumber(String str);
    }

    public interface WabaAccountIdStep {
        AccountIdStep wabaAccountId(String str);
    }

    public static WabaAccountIdStep builder() {
        return new Builder();
    }

    public static WabaPhoneNumber justId(String str) {
        return new WabaPhoneNumber(str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.wabaAccountId, this.accountId, this.phoneNumberId, this.phoneNumber, this.isDefault, this.accessToken, this.name, this.internalName, this.quota, this.currentLimitCategory, this.status, this.qualityRating, this.entityListId, this.createdAt, this.updatedAt, this.welcomeMessage, this.requestedDisplayName, this.displayNameUpdate, this.displayNameUpdateDateTime, this.wabaNumberDecision, this.wabaNumberDecisionTime, this.rejectionReason, this.phoneNumberQualityUpdate, this.phoneNumberQualityUpdateTime, this.createdById, this.updatedById);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WabaPhoneNumber.class != obj.getClass()) {
            return false;
        }
        WabaPhoneNumber wabaPhoneNumber = (WabaPhoneNumber) obj;
        return s6c.m47909a(getId(), wabaPhoneNumber.getId()) && s6c.m47909a(getWabaAccountId(), wabaPhoneNumber.getWabaAccountId()) && s6c.m47909a(getAccountId(), wabaPhoneNumber.getAccountId()) && s6c.m47909a(getPhoneNumberId(), wabaPhoneNumber.getPhoneNumberId()) && s6c.m47909a(getPhoneNumber(), wabaPhoneNumber.getPhoneNumber()) && s6c.m47909a(getIsDefault(), wabaPhoneNumber.getIsDefault()) && s6c.m47909a(getAccessToken(), wabaPhoneNumber.getAccessToken()) && s6c.m47909a(getName(), wabaPhoneNumber.getName()) && s6c.m47909a(getInternalName(), wabaPhoneNumber.getInternalName()) && s6c.m47909a(getQuota(), wabaPhoneNumber.getQuota()) && s6c.m47909a(getCurrentLimitCategory(), wabaPhoneNumber.getCurrentLimitCategory()) && s6c.m47909a(getStatus(), wabaPhoneNumber.getStatus()) && s6c.m47909a(getQualityRating(), wabaPhoneNumber.getQualityRating()) && s6c.m47909a(getEntityListId(), wabaPhoneNumber.getEntityListId()) && s6c.m47909a(getCreatedAt(), wabaPhoneNumber.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), wabaPhoneNumber.getUpdatedAt()) && s6c.m47909a(getWelcomeMessage(), wabaPhoneNumber.getWelcomeMessage()) && s6c.m47909a(getRequestedDisplayName(), wabaPhoneNumber.getRequestedDisplayName()) && s6c.m47909a(getDisplayNameUpdate(), wabaPhoneNumber.getDisplayNameUpdate()) && s6c.m47909a(getDisplayNameUpdateDateTime(), wabaPhoneNumber.getDisplayNameUpdateDateTime()) && s6c.m47909a(getWabaNumberDecision(), wabaPhoneNumber.getWabaNumberDecision()) && s6c.m47909a(getWabaNumberDecisionTime(), wabaPhoneNumber.getWabaNumberDecisionTime()) && s6c.m47909a(getRejectionReason(), wabaPhoneNumber.getRejectionReason()) && s6c.m47909a(getPhoneNumberQualityUpdate(), wabaPhoneNumber.getPhoneNumberQualityUpdate()) && s6c.m47909a(getPhoneNumberQualityUpdateTime(), wabaPhoneNumber.getPhoneNumberQualityUpdateTime()) && s6c.m47909a(getCreatedById(), wabaPhoneNumber.getCreatedById()) && s6c.m47909a(getUpdatedById(), wabaPhoneNumber.getUpdatedById());
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public String getAccountId() {
        return this.accountId;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getCreatedById() {
        return this.createdById;
    }

    public String getCurrentLimitCategory() {
        return this.currentLimitCategory;
    }

    public String getDisplayNameUpdate() {
        return this.displayNameUpdate;
    }

    public Temporal.DateTime getDisplayNameUpdateDateTime() {
        return this.displayNameUpdateDateTime;
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

    public String getInternalName() {
        return this.internalName;
    }

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public String getName() {
        return this.name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getPhoneNumberId() {
        return this.phoneNumberId;
    }

    public String getPhoneNumberQualityUpdate() {
        return this.phoneNumberQualityUpdate;
    }

    public Temporal.DateTime getPhoneNumberQualityUpdateTime() {
        return this.phoneNumberQualityUpdateTime;
    }

    public String getQualityRating() {
        return this.qualityRating;
    }

    public Integer getQuota() {
        return this.quota;
    }

    public String getRejectionReason() {
        return this.rejectionReason;
    }

    public String getRequestedDisplayName() {
        return this.requestedDisplayName;
    }

    public String getStatus() {
        return this.status;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public String getUpdatedById() {
        return this.updatedById;
    }

    public String getWabaAccountId() {
        return this.wabaAccountId;
    }

    public String getWabaNumberDecision() {
        return this.wabaNumberDecision;
    }

    public Temporal.DateTime getWabaNumberDecisionTime() {
        return this.wabaNumberDecisionTime;
    }

    public String getWelcomeMessage() {
        return this.welcomeMessage;
    }

    public int hashCode() {
        return (getId() + getWabaAccountId() + getAccountId() + getPhoneNumberId() + getPhoneNumber() + getIsDefault() + getAccessToken() + getName() + getInternalName() + getQuota() + getCurrentLimitCategory() + getStatus() + getQualityRating() + getEntityListId() + getCreatedAt() + getUpdatedAt() + getWelcomeMessage() + getRequestedDisplayName() + getDisplayNameUpdate() + getDisplayNameUpdateDateTime() + getWabaNumberDecision() + getWabaNumberDecisionTime() + getRejectionReason() + getPhoneNumberQualityUpdate() + getPhoneNumberQualityUpdateTime() + getCreatedById() + getUpdatedById()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("WabaPhoneNumber {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("wabaAccountId=" + String.valueOf(getWabaAccountId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("phoneNumberId=" + String.valueOf(getPhoneNumberId()) + ", ");
        sb.append("phoneNumber=" + String.valueOf(getPhoneNumber()) + ", ");
        sb.append("isDefault=" + String.valueOf(getIsDefault()) + ", ");
        sb.append("accessToken=" + String.valueOf(getAccessToken()) + ", ");
        sb.append("name=" + String.valueOf(getName()) + ", ");
        sb.append("internalName=" + String.valueOf(getInternalName()) + ", ");
        sb.append("quota=" + String.valueOf(getQuota()) + ", ");
        sb.append("currentLimitCategory=" + String.valueOf(getCurrentLimitCategory()) + ", ");
        sb.append("status=" + String.valueOf(getStatus()) + ", ");
        sb.append("qualityRating=" + String.valueOf(getQualityRating()) + ", ");
        sb.append("entityListId=" + String.valueOf(getEntityListId()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        sb.append("updatedAt=" + String.valueOf(getUpdatedAt()) + ", ");
        sb.append("welcomeMessage=" + String.valueOf(getWelcomeMessage()) + ", ");
        sb.append("requestedDisplayName=" + String.valueOf(getRequestedDisplayName()) + ", ");
        sb.append("displayNameUpdate=" + String.valueOf(getDisplayNameUpdate()) + ", ");
        sb.append("displayNameUpdateDateTime=" + String.valueOf(getDisplayNameUpdateDateTime()) + ", ");
        sb.append("wabaNumberDecision=" + String.valueOf(getWabaNumberDecision()) + ", ");
        sb.append("wabaNumberDecisionTime=" + String.valueOf(getWabaNumberDecisionTime()) + ", ");
        sb.append("rejectionReason=" + String.valueOf(getRejectionReason()) + ", ");
        sb.append("phoneNumberQualityUpdate=" + String.valueOf(getPhoneNumberQualityUpdate()) + ", ");
        sb.append("phoneNumberQualityUpdateTime=" + String.valueOf(getPhoneNumberQualityUpdateTime()) + ", ");
        sb.append("createdById=" + String.valueOf(getCreatedById()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedById=");
        sb2.append(String.valueOf(getUpdatedById()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private WabaPhoneNumber(String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, String str7, String str8, Integer num, String str9, String str10, String str11, String str12, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, String str13, String str14, String str15, Temporal.DateTime dateTime3, String str16, Temporal.DateTime dateTime4, String str17, String str18, Temporal.DateTime dateTime5, String str19, String str20) {
        this.entityList = null;
        this.id = str;
        this.wabaAccountId = str2;
        this.accountId = str3;
        this.phoneNumberId = str4;
        this.phoneNumber = str5;
        this.isDefault = bool;
        this.accessToken = str6;
        this.name = str7;
        this.internalName = str8;
        this.quota = num;
        this.currentLimitCategory = str9;
        this.status = str10;
        this.qualityRating = str11;
        this.entityListId = str12;
        this.createdAt = dateTime;
        this.updatedAt = dateTime2;
        this.welcomeMessage = str13;
        this.requestedDisplayName = str14;
        this.displayNameUpdate = str15;
        this.displayNameUpdateDateTime = dateTime3;
        this.wabaNumberDecision = str16;
        this.wabaNumberDecisionTime = dateTime4;
        this.rejectionReason = str17;
        this.phoneNumberQualityUpdate = str18;
        this.phoneNumberQualityUpdateTime = dateTime5;
        this.createdById = str19;
        this.updatedById = str20;
    }
}
