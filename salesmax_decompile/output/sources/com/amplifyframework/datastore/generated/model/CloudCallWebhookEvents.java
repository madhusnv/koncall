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
import java.util.UUID;
import p001o.s6c;

@Index(fields = {"callId", "providerName"}, name = "eventByCallId")
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM)}, pluralName = "CloudCallWebhookEvents")
/* loaded from: classes5.dex */
public final class CloudCallWebhookEvents implements Model {

    @ModelField(targetType = "ID")
    private final String accountId;

    @ModelField(targetType = "Int")
    private final Integer actualCallDuration;

    @ModelField(targetType = "String")
    private final String agentNumber;

    @ModelField(targetType = "String")
    private final String callDirection;

    @ModelField(targetType = "Int")
    private final Integer callDuration;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime callEndTime;

    @ModelField(targetType = "String")
    private final String callId;

    @ModelField(targetType = "String")
    private final String callSessionId;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime callStartTime;

    @ModelField(targetType = "String")
    private final String callerSource;

    @ModelField(targetType = "String")
    private final String connectionId;

    @BelongsTo(targetName = "contactId", type = Contact.class)
    @ModelField(targetType = "Contact")
    private final Contact contact;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(targetType = "String")
    private final String customIdentifier;

    @ModelField(targetType = "String")
    private final String customerNumber;

    @ModelField(targetType = "String")
    private final String destinationNumber;

    @ModelField(targetType = "String")
    private final String displayNumber;

    @ModelField(targetType = "String")
    private final String eventType;

    @ModelField(targetType = "AWSTimestamp")
    private final Temporal.Timestamp expirationUnixTime;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "String")
    private final String providerName;

    @ModelField(targetType = "AWSJSON")
    private final String rawPayload;

    @ModelField(targetType = "String")
    private final String resourceURL;

    @ModelField(targetType = "String")
    private final String sourceNumber;

    @ModelField(targetType = "String")
    private final String status;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;
    public static final QueryField ID = QueryField.field("CloudCallWebhookEvents", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("CloudCallWebhookEvents", "accountId");
    public static final QueryField CONTACT = QueryField.field("CloudCallWebhookEvents", "contactId");
    public static final QueryField CALL_SESSION_ID = QueryField.field("CloudCallWebhookEvents", "callSessionId");
    public static final QueryField CALL_ID = QueryField.field("CloudCallWebhookEvents", "callId");
    public static final QueryField CUSTOM_IDENTIFIER = QueryField.field("CloudCallWebhookEvents", "customIdentifier");
    public static final QueryField PROVIDER_NAME = QueryField.field("CloudCallWebhookEvents", "providerName");
    public static final QueryField CONNECTION_ID = QueryField.field("CloudCallWebhookEvents", "connectionId");
    public static final QueryField RAW_PAYLOAD = QueryField.field("CloudCallWebhookEvents", "rawPayload");
    public static final QueryField EVENT_TYPE = QueryField.field("CloudCallWebhookEvents", "eventType");
    public static final QueryField SOURCE_NUMBER = QueryField.field("CloudCallWebhookEvents", "sourceNumber");
    public static final QueryField CALLER_SOURCE = QueryField.field("CloudCallWebhookEvents", "callerSource");
    public static final QueryField DESTINATION_NUMBER = QueryField.field("CloudCallWebhookEvents", "destinationNumber");
    public static final QueryField DISPLAY_NUMBER = QueryField.field("CloudCallWebhookEvents", "displayNumber");
    public static final QueryField AGENT_NUMBER = QueryField.field("CloudCallWebhookEvents", "agentNumber");
    public static final QueryField CUSTOMER_NUMBER = QueryField.field("CloudCallWebhookEvents", "customerNumber");
    public static final QueryField CALL_START_TIME = QueryField.field("CloudCallWebhookEvents", "callStartTime");
    public static final QueryField CALL_END_TIME = QueryField.field("CloudCallWebhookEvents", "callEndTime");
    public static final QueryField CALL_DURATION = QueryField.field("CloudCallWebhookEvents", "callDuration");
    public static final QueryField ACTUAL_CALL_DURATION = QueryField.field("CloudCallWebhookEvents", "actualCallDuration");
    public static final QueryField RESOURCE_URL = QueryField.field("CloudCallWebhookEvents", "resourceURL");
    public static final QueryField CALL_DIRECTION = QueryField.field("CloudCallWebhookEvents", "callDirection");
    public static final QueryField STATUS = QueryField.field("CloudCallWebhookEvents", "status");
    public static final QueryField EXPIRATION_UNIX_TIME = QueryField.field("CloudCallWebhookEvents", "expirationUnixTime");
    public static final QueryField CREATED_AT = QueryField.field("CloudCallWebhookEvents", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("CloudCallWebhookEvents", "updatedAt");

    public interface BuildStep {
        BuildStep accountId(String str);

        BuildStep actualCallDuration(Integer num);

        BuildStep agentNumber(String str);

        CloudCallWebhookEvents build();

        BuildStep callDirection(String str);

        BuildStep callDuration(Integer num);

        BuildStep callEndTime(Temporal.DateTime dateTime);

        BuildStep callId(String str);

        BuildStep callSessionId(String str);

        BuildStep callStartTime(Temporal.DateTime dateTime);

        BuildStep callerSource(String str);

        BuildStep connectionId(String str);

        BuildStep contact(Contact contact);

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep customIdentifier(String str);

        BuildStep customerNumber(String str);

        BuildStep destinationNumber(String str);

        BuildStep displayNumber(String str);

        BuildStep eventType(String str);

        BuildStep expirationUnixTime(Temporal.Timestamp timestamp);

        BuildStep id(String str);

        BuildStep providerName(String str);

        BuildStep rawPayload(String str);

        BuildStep resourceUrl(String str);

        BuildStep sourceNumber(String str);

        BuildStep status(String str);

        BuildStep updatedAt(Temporal.DateTime dateTime);
    }

    public static class Builder implements BuildStep {
        private String accountId;
        private Integer actualCallDuration;
        private String agentNumber;
        private String callDirection;
        private Integer callDuration;
        private Temporal.DateTime callEndTime;
        private String callId;
        private String callSessionId;
        private Temporal.DateTime callStartTime;
        private String callerSource;
        private String connectionId;
        private Contact contact;
        private Temporal.DateTime createdAt;
        private String customIdentifier;
        private String customerNumber;
        private String destinationNumber;
        private String displayNumber;
        private String eventType;
        private Temporal.Timestamp expirationUnixTime;
        private String id;
        private String providerName;
        private String rawPayload;
        private String resourceURL;
        private String sourceNumber;
        private String status;
        private Temporal.DateTime updatedAt;

        @Override // com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.BuildStep
        public BuildStep accountId(String str) {
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.BuildStep
        public BuildStep actualCallDuration(Integer num) {
            this.actualCallDuration = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.BuildStep
        public BuildStep agentNumber(String str) {
            this.agentNumber = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.BuildStep
        public CloudCallWebhookEvents build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new CloudCallWebhookEvents(string, this.accountId, this.contact, this.callSessionId, this.callId, this.customIdentifier, this.providerName, this.connectionId, this.rawPayload, this.eventType, this.sourceNumber, this.callerSource, this.destinationNumber, this.displayNumber, this.agentNumber, this.customerNumber, this.callStartTime, this.callEndTime, this.callDuration, this.actualCallDuration, this.resourceURL, this.callDirection, this.status, this.expirationUnixTime, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.BuildStep
        public BuildStep callDirection(String str) {
            this.callDirection = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.BuildStep
        public BuildStep callDuration(Integer num) {
            this.callDuration = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.BuildStep
        public BuildStep callEndTime(Temporal.DateTime dateTime) {
            this.callEndTime = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.BuildStep
        public BuildStep callId(String str) {
            this.callId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.BuildStep
        public BuildStep callSessionId(String str) {
            this.callSessionId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.BuildStep
        public BuildStep callStartTime(Temporal.DateTime dateTime) {
            this.callStartTime = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.BuildStep
        public BuildStep callerSource(String str) {
            this.callerSource = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.BuildStep
        public BuildStep connectionId(String str) {
            this.connectionId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.BuildStep
        public BuildStep contact(Contact contact) {
            this.contact = contact;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.BuildStep
        public BuildStep customIdentifier(String str) {
            this.customIdentifier = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.BuildStep
        public BuildStep customerNumber(String str) {
            this.customerNumber = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.BuildStep
        public BuildStep destinationNumber(String str) {
            this.destinationNumber = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.BuildStep
        public BuildStep displayNumber(String str) {
            this.displayNumber = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.BuildStep
        public BuildStep eventType(String str) {
            this.eventType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.BuildStep
        public BuildStep expirationUnixTime(Temporal.Timestamp timestamp) {
            this.expirationUnixTime = timestamp;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.BuildStep
        public BuildStep providerName(String str) {
            this.providerName = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.BuildStep
        public BuildStep rawPayload(String str) {
            this.rawPayload = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.BuildStep
        public BuildStep resourceUrl(String str) {
            this.resourceURL = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.BuildStep
        public BuildStep sourceNumber(String str) {
            this.sourceNumber = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.BuildStep
        public BuildStep status(String str) {
            this.status = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, Contact contact, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, Integer num, Integer num2, String str16, String str17, String str18, Temporal.Timestamp timestamp, Temporal.DateTime dateTime3, Temporal.DateTime dateTime4) {
            this.id = str;
            this.accountId = str2;
            this.contact = contact;
            this.callSessionId = str3;
            this.callId = str4;
            this.customIdentifier = str5;
            this.providerName = str6;
            this.connectionId = str7;
            this.rawPayload = str8;
            this.eventType = str9;
            this.sourceNumber = str10;
            this.callerSource = str11;
            this.destinationNumber = str12;
            this.displayNumber = str13;
            this.agentNumber = str14;
            this.customerNumber = str15;
            this.callStartTime = dateTime;
            this.callEndTime = dateTime2;
            this.callDuration = num;
            this.actualCallDuration = num2;
            this.resourceURL = str16;
            this.callDirection = str17;
            this.status = str18;
            this.expirationUnixTime = timestamp;
            this.createdAt = dateTime3;
            this.updatedAt = dateTime4;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, Contact contact, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, Integer num, Integer num2, String str16, String str17, String str18, Temporal.Timestamp timestamp, Temporal.DateTime dateTime3, Temporal.DateTime dateTime4) {
            super(str, str2, contact, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, dateTime, dateTime2, num, num2, CloudCallWebhookEvents.this.resourceURL, str17, str18, timestamp, dateTime3, dateTime4);
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.Builder, com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.BuildStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.Builder, com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.BuildStep
        public CopyOfBuilder actualCallDuration(Integer num) {
            return (CopyOfBuilder) super.actualCallDuration(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.Builder, com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.BuildStep
        public CopyOfBuilder agentNumber(String str) {
            return (CopyOfBuilder) super.agentNumber(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.Builder, com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.BuildStep
        public CopyOfBuilder callDirection(String str) {
            return (CopyOfBuilder) super.callDirection(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.Builder, com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.BuildStep
        public CopyOfBuilder callDuration(Integer num) {
            return (CopyOfBuilder) super.callDuration(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.Builder, com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.BuildStep
        public CopyOfBuilder callEndTime(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.callEndTime(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.Builder, com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.BuildStep
        public CopyOfBuilder callId(String str) {
            return (CopyOfBuilder) super.callId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.Builder, com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.BuildStep
        public CopyOfBuilder callSessionId(String str) {
            return (CopyOfBuilder) super.callSessionId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.Builder, com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.BuildStep
        public CopyOfBuilder callStartTime(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.callStartTime(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.Builder, com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.BuildStep
        public CopyOfBuilder callerSource(String str) {
            return (CopyOfBuilder) super.callerSource(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.Builder, com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.BuildStep
        public CopyOfBuilder connectionId(String str) {
            return (CopyOfBuilder) super.connectionId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.Builder, com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.BuildStep
        public CopyOfBuilder contact(Contact contact) {
            return (CopyOfBuilder) super.contact(contact);
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.Builder, com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.Builder, com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.BuildStep
        public CopyOfBuilder customIdentifier(String str) {
            return (CopyOfBuilder) super.customIdentifier(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.Builder, com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.BuildStep
        public CopyOfBuilder customerNumber(String str) {
            return (CopyOfBuilder) super.customerNumber(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.Builder, com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.BuildStep
        public CopyOfBuilder destinationNumber(String str) {
            return (CopyOfBuilder) super.destinationNumber(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.Builder, com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.BuildStep
        public CopyOfBuilder displayNumber(String str) {
            return (CopyOfBuilder) super.displayNumber(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.Builder, com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.BuildStep
        public CopyOfBuilder eventType(String str) {
            return (CopyOfBuilder) super.eventType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.Builder, com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.BuildStep
        public CopyOfBuilder expirationUnixTime(Temporal.Timestamp timestamp) {
            return (CopyOfBuilder) super.expirationUnixTime(timestamp);
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.Builder, com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.BuildStep
        public CopyOfBuilder providerName(String str) {
            return (CopyOfBuilder) super.providerName(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.Builder, com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.BuildStep
        public CopyOfBuilder rawPayload(String str) {
            return (CopyOfBuilder) super.rawPayload(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.Builder, com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.BuildStep
        public CopyOfBuilder resourceUrl(String str) {
            return (CopyOfBuilder) super.resourceUrl(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.Builder, com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.BuildStep
        public CopyOfBuilder sourceNumber(String str) {
            return (CopyOfBuilder) super.sourceNumber(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.Builder, com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.BuildStep
        public CopyOfBuilder status(String str) {
            return (CopyOfBuilder) super.status(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.Builder, com.amplifyframework.datastore.generated.model.CloudCallWebhookEvents.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }
    }

    public static BuildStep builder() {
        return new Builder();
    }

    public static CloudCallWebhookEvents justId(String str) {
        return new CloudCallWebhookEvents(str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.contact, this.callSessionId, this.callId, this.customIdentifier, this.providerName, this.connectionId, this.rawPayload, this.eventType, this.sourceNumber, this.callerSource, this.destinationNumber, this.displayNumber, this.agentNumber, this.customerNumber, this.callStartTime, this.callEndTime, this.callDuration, this.actualCallDuration, this.resourceURL, this.callDirection, this.status, this.expirationUnixTime, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CloudCallWebhookEvents.class != obj.getClass()) {
            return false;
        }
        CloudCallWebhookEvents cloudCallWebhookEvents = (CloudCallWebhookEvents) obj;
        return s6c.m47909a(getId(), cloudCallWebhookEvents.getId()) && s6c.m47909a(getAccountId(), cloudCallWebhookEvents.getAccountId()) && s6c.m47909a(getContact(), cloudCallWebhookEvents.getContact()) && s6c.m47909a(getCallSessionId(), cloudCallWebhookEvents.getCallSessionId()) && s6c.m47909a(getCallId(), cloudCallWebhookEvents.getCallId()) && s6c.m47909a(getCustomIdentifier(), cloudCallWebhookEvents.getCustomIdentifier()) && s6c.m47909a(getProviderName(), cloudCallWebhookEvents.getProviderName()) && s6c.m47909a(getConnectionId(), cloudCallWebhookEvents.getConnectionId()) && s6c.m47909a(getRawPayload(), cloudCallWebhookEvents.getRawPayload()) && s6c.m47909a(getEventType(), cloudCallWebhookEvents.getEventType()) && s6c.m47909a(getSourceNumber(), cloudCallWebhookEvents.getSourceNumber()) && s6c.m47909a(getCallerSource(), cloudCallWebhookEvents.getCallerSource()) && s6c.m47909a(getDestinationNumber(), cloudCallWebhookEvents.getDestinationNumber()) && s6c.m47909a(getDisplayNumber(), cloudCallWebhookEvents.getDisplayNumber()) && s6c.m47909a(getAgentNumber(), cloudCallWebhookEvents.getAgentNumber()) && s6c.m47909a(getCustomerNumber(), cloudCallWebhookEvents.getCustomerNumber()) && s6c.m47909a(getCallStartTime(), cloudCallWebhookEvents.getCallStartTime()) && s6c.m47909a(getCallEndTime(), cloudCallWebhookEvents.getCallEndTime()) && s6c.m47909a(getCallDuration(), cloudCallWebhookEvents.getCallDuration()) && s6c.m47909a(getActualCallDuration(), cloudCallWebhookEvents.getActualCallDuration()) && s6c.m47909a(getResourceUrl(), cloudCallWebhookEvents.getResourceUrl()) && s6c.m47909a(getCallDirection(), cloudCallWebhookEvents.getCallDirection()) && s6c.m47909a(getStatus(), cloudCallWebhookEvents.getStatus()) && s6c.m47909a(getExpirationUnixTime(), cloudCallWebhookEvents.getExpirationUnixTime()) && s6c.m47909a(getCreatedAt(), cloudCallWebhookEvents.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), cloudCallWebhookEvents.getUpdatedAt());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public Integer getActualCallDuration() {
        return this.actualCallDuration;
    }

    public String getAgentNumber() {
        return this.agentNumber;
    }

    public String getCallDirection() {
        return this.callDirection;
    }

    public Integer getCallDuration() {
        return this.callDuration;
    }

    public Temporal.DateTime getCallEndTime() {
        return this.callEndTime;
    }

    public String getCallId() {
        return this.callId;
    }

    public String getCallSessionId() {
        return this.callSessionId;
    }

    public Temporal.DateTime getCallStartTime() {
        return this.callStartTime;
    }

    public String getCallerSource() {
        return this.callerSource;
    }

    public String getConnectionId() {
        return this.connectionId;
    }

    public Contact getContact() {
        return this.contact;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getCustomIdentifier() {
        return this.customIdentifier;
    }

    public String getCustomerNumber() {
        return this.customerNumber;
    }

    public String getDestinationNumber() {
        return this.destinationNumber;
    }

    public String getDisplayNumber() {
        return this.displayNumber;
    }

    public String getEventType() {
        return this.eventType;
    }

    public Temporal.Timestamp getExpirationUnixTime() {
        return this.expirationUnixTime;
    }

    public String getId() {
        return this.id;
    }

    public String getProviderName() {
        return this.providerName;
    }

    public String getRawPayload() {
        return this.rawPayload;
    }

    public String getResourceUrl() {
        return this.resourceURL;
    }

    public String getSourceNumber() {
        return this.sourceNumber;
    }

    public String getStatus() {
        return this.status;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        return (getId() + getAccountId() + getContact() + getCallSessionId() + getCallId() + getCustomIdentifier() + getProviderName() + getConnectionId() + getRawPayload() + getEventType() + getSourceNumber() + getCallerSource() + getDestinationNumber() + getDisplayNumber() + getAgentNumber() + getCustomerNumber() + getCallStartTime() + getCallEndTime() + getCallDuration() + getActualCallDuration() + getResourceUrl() + getCallDirection() + getStatus() + getExpirationUnixTime() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CloudCallWebhookEvents {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("contact=" + String.valueOf(getContact()) + ", ");
        sb.append("callSessionId=" + String.valueOf(getCallSessionId()) + ", ");
        sb.append("callId=" + String.valueOf(getCallId()) + ", ");
        sb.append("customIdentifier=" + String.valueOf(getCustomIdentifier()) + ", ");
        sb.append("providerName=" + String.valueOf(getProviderName()) + ", ");
        sb.append("connectionId=" + String.valueOf(getConnectionId()) + ", ");
        sb.append("rawPayload=" + String.valueOf(getRawPayload()) + ", ");
        sb.append("eventType=" + String.valueOf(getEventType()) + ", ");
        sb.append("sourceNumber=" + String.valueOf(getSourceNumber()) + ", ");
        sb.append("callerSource=" + String.valueOf(getCallerSource()) + ", ");
        sb.append("destinationNumber=" + String.valueOf(getDestinationNumber()) + ", ");
        sb.append("displayNumber=" + String.valueOf(getDisplayNumber()) + ", ");
        sb.append("agentNumber=" + String.valueOf(getAgentNumber()) + ", ");
        sb.append("customerNumber=" + String.valueOf(getCustomerNumber()) + ", ");
        sb.append("callStartTime=" + String.valueOf(getCallStartTime()) + ", ");
        sb.append("callEndTime=" + String.valueOf(getCallEndTime()) + ", ");
        sb.append("callDuration=" + String.valueOf(getCallDuration()) + ", ");
        sb.append("actualCallDuration=" + String.valueOf(getActualCallDuration()) + ", ");
        sb.append("resourceURL=" + String.valueOf(getResourceUrl()) + ", ");
        sb.append("callDirection=" + String.valueOf(getCallDirection()) + ", ");
        sb.append("status=" + String.valueOf(getStatus()) + ", ");
        sb.append("expirationUnixTime=" + String.valueOf(getExpirationUnixTime()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private CloudCallWebhookEvents(String str, String str2, Contact contact, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, Integer num, Integer num2, String str16, String str17, String str18, Temporal.Timestamp timestamp, Temporal.DateTime dateTime3, Temporal.DateTime dateTime4) {
        this.id = str;
        this.accountId = str2;
        this.contact = contact;
        this.callSessionId = str3;
        this.callId = str4;
        this.customIdentifier = str5;
        this.providerName = str6;
        this.connectionId = str7;
        this.rawPayload = str8;
        this.eventType = str9;
        this.sourceNumber = str10;
        this.callerSource = str11;
        this.destinationNumber = str12;
        this.displayNumber = str13;
        this.agentNumber = str14;
        this.customerNumber = str15;
        this.callStartTime = dateTime;
        this.callEndTime = dateTime2;
        this.callDuration = num;
        this.actualCallDuration = num2;
        this.resourceURL = str16;
        this.callDirection = str17;
        this.status = str18;
        this.expirationUnixTime = timestamp;
        this.createdAt = dateTime3;
        this.updatedAt = dateTime4;
    }
}
