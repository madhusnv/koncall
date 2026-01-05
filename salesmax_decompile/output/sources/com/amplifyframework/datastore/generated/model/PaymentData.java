package com.amplifyframework.datastore.generated.model;

import com.amazonaws.regions.ServiceAbbreviations;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.BelongsTo;
import com.amplifyframework.core.model.annotations.HasMany;
import com.amplifyframework.core.model.annotations.HasOne;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.Indexes;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.core.model.temporal.Temporal;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@Indexes({@Index(fields = {"accountId", "status", "contactId"}, name = "paymentRequestsByContact"), @Index(fields = {"paymentLinkId"}, name = "paymentDataByPaymentLinkId"), @Index(fields = {"orderId", "updatedAt"}, name = "byOrderId")})
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM)}, pluralName = "PaymentData")
/* loaded from: classes5.dex */
public final class PaymentData implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @ModelField(targetType = "Int")
    private final Integer amount;

    @ModelField(targetType = "Int")
    private final Integer amountPaid;

    @BelongsTo(targetName = "contactId", type = Contact.class)
    @ModelField(targetType = "Contact")
    private final Contact contact;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(targetType = "ID")
    private final String createdById;

    @ModelField(targetType = "String")
    private final String currency;

    @ModelField(targetType = "AWSJSON")
    private final String customPaymentData;

    @ModelField(targetType = "ID")
    private final String engagementId;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime finalPaymentDate;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "String")
    private final String lastPaymentStatus;

    @ModelField(targetType = "String")
    private final String note;

    @ModelField(targetType = "PaymentOrder")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = PaymentOrder.class)
    private final PaymentOrder order;

    @ModelField(targetType = "ID")
    private final String orderId;

    @ModelField(targetType = "String")
    private final String orderIdInPaymentProvider;

    @ModelField(targetType = "ID")
    private final List<String> paidByContactIds;

    @ModelField(targetType = "PaymentEvent")
    @HasMany(associatedWith = "orderId", type = PaymentEvent.class)
    private final List<PaymentEvent> paymentEvents;

    @ModelField(targetType = "PaymentLink")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = PaymentLink.class)
    private final PaymentLink paymentLink;

    @ModelField(targetType = "ID")
    private final String paymentLinkId;

    @ModelField(targetType = "String")
    private final String paymentLinkUrl;

    @ModelField(targetType = "String")
    private final String paymentProvider;

    @ModelField(targetType = "String")
    private final String paymentRequestType;

    @ModelField(targetType = "String")
    private final String status;

    @ModelField(targetType = "String")
    private final List<String> transactionId;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;

    @ModelField(targetType = "ID")
    private final String updatedById;
    public static final QueryField ID = QueryField.field("PaymentData", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("PaymentData", "accountId");
    public static final QueryField PAYMENT_REQUEST_TYPE = QueryField.field("PaymentData", "paymentRequestType");
    public static final QueryField CONTACT = QueryField.field("PaymentData", "contactId");
    public static final QueryField ENGAGEMENT_ID = QueryField.field("PaymentData", "engagementId");
    public static final QueryField PAYMENT_PROVIDER = QueryField.field("PaymentData", "paymentProvider");
    public static final QueryField ORDER_ID_IN_PAYMENT_PROVIDER = QueryField.field("PaymentData", "orderIdInPaymentProvider");
    public static final QueryField ORDER_ID = QueryField.field("PaymentData", "orderId");
    public static final QueryField PAYMENT_LINK_ID = QueryField.field("PaymentData", "paymentLinkId");
    public static final QueryField PAYMENT_LINK_URL = QueryField.field("PaymentData", "paymentLinkUrl");
    public static final QueryField AMOUNT = QueryField.field("PaymentData", "amount");
    public static final QueryField AMOUNT_PAID = QueryField.field("PaymentData", "amountPaid");
    public static final QueryField CURRENCY = QueryField.field("PaymentData", FirebaseAnalytics.Param.CURRENCY);
    public static final QueryField STATUS = QueryField.field("PaymentData", "status");
    public static final QueryField LAST_PAYMENT_STATUS = QueryField.field("PaymentData", "lastPaymentStatus");
    public static final QueryField FINAL_PAYMENT_DATE = QueryField.field("PaymentData", "finalPaymentDate");
    public static final QueryField PAID_BY_CONTACT_IDS = QueryField.field("PaymentData", "paidByContactIds");
    public static final QueryField TRANSACTION_ID = QueryField.field("PaymentData", "transactionId");
    public static final QueryField NOTE = QueryField.field("PaymentData", "note");
    public static final QueryField CREATED_AT = QueryField.field("PaymentData", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("PaymentData", "updatedAt");
    public static final QueryField CUSTOM_PAYMENT_DATA = QueryField.field("PaymentData", "customPaymentData");
    public static final QueryField CREATED_BY_ID = QueryField.field("PaymentData", "createdById");
    public static final QueryField UPDATED_BY_ID = QueryField.field("PaymentData", "updatedById");

    public interface AccountIdStep {
        BuildStep accountId(String str);
    }

    public interface BuildStep {
        BuildStep amount(Integer num);

        BuildStep amountPaid(Integer num);

        PaymentData build();

        BuildStep contact(Contact contact);

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep createdById(String str);

        BuildStep currency(String str);

        BuildStep customPaymentData(String str);

        BuildStep engagementId(String str);

        BuildStep finalPaymentDate(Temporal.DateTime dateTime);

        BuildStep id(String str);

        BuildStep lastPaymentStatus(String str);

        BuildStep note(String str);

        BuildStep orderId(String str);

        BuildStep orderIdInPaymentProvider(String str);

        BuildStep paidByContactIds(List<String> list);

        BuildStep paymentLinkId(String str);

        BuildStep paymentLinkUrl(String str);

        BuildStep paymentProvider(String str);

        BuildStep paymentRequestType(String str);

        BuildStep status(String str);

        BuildStep transactionId(List<String> list);

        BuildStep updatedAt(Temporal.DateTime dateTime);

        BuildStep updatedById(String str);
    }

    public static class Builder implements AccountIdStep, BuildStep {
        private String accountId;
        private Integer amount;
        private Integer amountPaid;
        private Contact contact;
        private Temporal.DateTime createdAt;
        private String createdById;
        private String currency;
        private String customPaymentData;
        private String engagementId;
        private Temporal.DateTime finalPaymentDate;
        private String id;
        private String lastPaymentStatus;
        private String note;
        private String orderId;
        private String orderIdInPaymentProvider;
        private List<String> paidByContactIds;
        private String paymentLinkId;
        private String paymentLinkUrl;
        private String paymentProvider;
        private String paymentRequestType;
        private String status;
        private List<String> transactionId;
        private Temporal.DateTime updatedAt;
        private String updatedById;

        @Override // com.amplifyframework.datastore.generated.model.PaymentData.AccountIdStep
        public BuildStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentData.BuildStep
        public BuildStep amount(Integer num) {
            this.amount = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentData.BuildStep
        public BuildStep amountPaid(Integer num) {
            this.amountPaid = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentData.BuildStep
        public PaymentData build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new PaymentData(string, this.accountId, this.paymentRequestType, this.contact, this.engagementId, this.paymentProvider, this.orderIdInPaymentProvider, this.orderId, this.paymentLinkId, this.paymentLinkUrl, this.amount, this.amountPaid, this.currency, this.status, this.lastPaymentStatus, this.finalPaymentDate, this.paidByContactIds, this.transactionId, this.note, this.createdAt, this.updatedAt, this.customPaymentData, this.createdById, this.updatedById);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentData.BuildStep
        public BuildStep contact(Contact contact) {
            this.contact = contact;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentData.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentData.BuildStep
        public BuildStep createdById(String str) {
            this.createdById = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentData.BuildStep
        public BuildStep currency(String str) {
            this.currency = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentData.BuildStep
        public BuildStep customPaymentData(String str) {
            this.customPaymentData = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentData.BuildStep
        public BuildStep engagementId(String str) {
            this.engagementId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentData.BuildStep
        public BuildStep finalPaymentDate(Temporal.DateTime dateTime) {
            this.finalPaymentDate = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentData.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentData.BuildStep
        public BuildStep lastPaymentStatus(String str) {
            this.lastPaymentStatus = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentData.BuildStep
        public BuildStep note(String str) {
            this.note = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentData.BuildStep
        public BuildStep orderId(String str) {
            this.orderId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentData.BuildStep
        public BuildStep orderIdInPaymentProvider(String str) {
            this.orderIdInPaymentProvider = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentData.BuildStep
        public BuildStep paidByContactIds(List<String> list) {
            this.paidByContactIds = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentData.BuildStep
        public BuildStep paymentLinkId(String str) {
            this.paymentLinkId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentData.BuildStep
        public BuildStep paymentLinkUrl(String str) {
            this.paymentLinkUrl = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentData.BuildStep
        public BuildStep paymentProvider(String str) {
            this.paymentProvider = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentData.BuildStep
        public BuildStep paymentRequestType(String str) {
            this.paymentRequestType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentData.BuildStep
        public BuildStep status(String str) {
            this.status = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentData.BuildStep
        public BuildStep transactionId(List<String> list) {
            this.transactionId = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentData.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentData.BuildStep
        public BuildStep updatedById(String str) {
            this.updatedById = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, Contact contact, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, Integer num2, String str10, String str11, String str12, Temporal.DateTime dateTime, List<String> list, List<String> list2, String str13, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3, String str14, String str15, String str16) {
            this.id = str;
            this.accountId = str2;
            this.paymentRequestType = str3;
            this.contact = contact;
            this.engagementId = str4;
            this.paymentProvider = str5;
            this.orderIdInPaymentProvider = str6;
            this.orderId = str7;
            this.paymentLinkId = str8;
            this.paymentLinkUrl = str9;
            this.amount = num;
            this.amountPaid = num2;
            this.currency = str10;
            this.status = str11;
            this.lastPaymentStatus = str12;
            this.finalPaymentDate = dateTime;
            this.paidByContactIds = list;
            this.transactionId = list2;
            this.note = str13;
            this.createdAt = dateTime2;
            this.updatedAt = dateTime3;
            this.customPaymentData = str14;
            this.createdById = str15;
            this.updatedById = str16;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // com.amplifyframework.datastore.generated.model.PaymentData.Builder, com.amplifyframework.datastore.generated.model.PaymentData.BuildStep
        public /* bridge */ /* synthetic */ BuildStep paidByContactIds(List list) {
            return paidByContactIds((List<String>) list);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentData.Builder, com.amplifyframework.datastore.generated.model.PaymentData.BuildStep
        public /* bridge */ /* synthetic */ BuildStep transactionId(List list) {
            return transactionId((List<String>) list);
        }

        private CopyOfBuilder(String str, String str2, String str3, Contact contact, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, Integer num2, String str10, String str11, String str12, Temporal.DateTime dateTime, List<String> list, List<String> list2, String str13, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3, String str14, String str15, String str16) {
            super(str, str2, str3, contact, str4, str5, str6, str7, str8, str9, num, num2, str10, str11, str12, dateTime, list, list2, str13, dateTime2, dateTime3, str14, str15, str16);
            Objects.requireNonNull(str2);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentData.Builder, com.amplifyframework.datastore.generated.model.PaymentData.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentData.Builder, com.amplifyframework.datastore.generated.model.PaymentData.BuildStep
        public CopyOfBuilder amount(Integer num) {
            return (CopyOfBuilder) super.amount(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentData.Builder, com.amplifyframework.datastore.generated.model.PaymentData.BuildStep
        public CopyOfBuilder amountPaid(Integer num) {
            return (CopyOfBuilder) super.amountPaid(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentData.Builder, com.amplifyframework.datastore.generated.model.PaymentData.BuildStep
        public CopyOfBuilder contact(Contact contact) {
            return (CopyOfBuilder) super.contact(contact);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentData.Builder, com.amplifyframework.datastore.generated.model.PaymentData.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentData.Builder, com.amplifyframework.datastore.generated.model.PaymentData.BuildStep
        public CopyOfBuilder createdById(String str) {
            return (CopyOfBuilder) super.createdById(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentData.Builder, com.amplifyframework.datastore.generated.model.PaymentData.BuildStep
        public CopyOfBuilder currency(String str) {
            return (CopyOfBuilder) super.currency(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentData.Builder, com.amplifyframework.datastore.generated.model.PaymentData.BuildStep
        public CopyOfBuilder customPaymentData(String str) {
            return (CopyOfBuilder) super.customPaymentData(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentData.Builder, com.amplifyframework.datastore.generated.model.PaymentData.BuildStep
        public CopyOfBuilder engagementId(String str) {
            return (CopyOfBuilder) super.engagementId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentData.Builder, com.amplifyframework.datastore.generated.model.PaymentData.BuildStep
        public CopyOfBuilder finalPaymentDate(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.finalPaymentDate(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentData.Builder, com.amplifyframework.datastore.generated.model.PaymentData.BuildStep
        public CopyOfBuilder lastPaymentStatus(String str) {
            return (CopyOfBuilder) super.lastPaymentStatus(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentData.Builder, com.amplifyframework.datastore.generated.model.PaymentData.BuildStep
        public CopyOfBuilder note(String str) {
            return (CopyOfBuilder) super.note(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentData.Builder, com.amplifyframework.datastore.generated.model.PaymentData.BuildStep
        public CopyOfBuilder orderId(String str) {
            return (CopyOfBuilder) super.orderId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentData.Builder, com.amplifyframework.datastore.generated.model.PaymentData.BuildStep
        public CopyOfBuilder orderIdInPaymentProvider(String str) {
            return (CopyOfBuilder) super.orderIdInPaymentProvider(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentData.Builder, com.amplifyframework.datastore.generated.model.PaymentData.BuildStep
        public CopyOfBuilder paidByContactIds(List<String> list) {
            return (CopyOfBuilder) super.paidByContactIds(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentData.Builder, com.amplifyframework.datastore.generated.model.PaymentData.BuildStep
        public CopyOfBuilder paymentLinkId(String str) {
            return (CopyOfBuilder) super.paymentLinkId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentData.Builder, com.amplifyframework.datastore.generated.model.PaymentData.BuildStep
        public CopyOfBuilder paymentLinkUrl(String str) {
            return (CopyOfBuilder) super.paymentLinkUrl(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentData.Builder, com.amplifyframework.datastore.generated.model.PaymentData.BuildStep
        public CopyOfBuilder paymentProvider(String str) {
            return (CopyOfBuilder) super.paymentProvider(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentData.Builder, com.amplifyframework.datastore.generated.model.PaymentData.BuildStep
        public CopyOfBuilder paymentRequestType(String str) {
            return (CopyOfBuilder) super.paymentRequestType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentData.Builder, com.amplifyframework.datastore.generated.model.PaymentData.BuildStep
        public CopyOfBuilder status(String str) {
            return (CopyOfBuilder) super.status(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentData.Builder, com.amplifyframework.datastore.generated.model.PaymentData.BuildStep
        public CopyOfBuilder transactionId(List<String> list) {
            return (CopyOfBuilder) super.transactionId(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentData.Builder, com.amplifyframework.datastore.generated.model.PaymentData.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentData.Builder, com.amplifyframework.datastore.generated.model.PaymentData.BuildStep
        public CopyOfBuilder updatedById(String str) {
            return (CopyOfBuilder) super.updatedById(str);
        }
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static PaymentData justId(String str) {
        return new PaymentData(str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.paymentRequestType, this.contact, this.engagementId, this.paymentProvider, this.orderIdInPaymentProvider, this.orderId, this.paymentLinkId, this.paymentLinkUrl, this.amount, this.amountPaid, this.currency, this.status, this.lastPaymentStatus, this.finalPaymentDate, this.paidByContactIds, this.transactionId, this.note, this.createdAt, this.updatedAt, this.customPaymentData, this.createdById, this.updatedById);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PaymentData.class != obj.getClass()) {
            return false;
        }
        PaymentData paymentData = (PaymentData) obj;
        return s6c.m47909a(getId(), paymentData.getId()) && s6c.m47909a(getAccountId(), paymentData.getAccountId()) && s6c.m47909a(getPaymentRequestType(), paymentData.getPaymentRequestType()) && s6c.m47909a(getContact(), paymentData.getContact()) && s6c.m47909a(getEngagementId(), paymentData.getEngagementId()) && s6c.m47909a(getPaymentProvider(), paymentData.getPaymentProvider()) && s6c.m47909a(getOrderIdInPaymentProvider(), paymentData.getOrderIdInPaymentProvider()) && s6c.m47909a(getOrderId(), paymentData.getOrderId()) && s6c.m47909a(getPaymentLinkId(), paymentData.getPaymentLinkId()) && s6c.m47909a(getPaymentLinkUrl(), paymentData.getPaymentLinkUrl()) && s6c.m47909a(getAmount(), paymentData.getAmount()) && s6c.m47909a(getAmountPaid(), paymentData.getAmountPaid()) && s6c.m47909a(getCurrency(), paymentData.getCurrency()) && s6c.m47909a(getStatus(), paymentData.getStatus()) && s6c.m47909a(getLastPaymentStatus(), paymentData.getLastPaymentStatus()) && s6c.m47909a(getFinalPaymentDate(), paymentData.getFinalPaymentDate()) && s6c.m47909a(getPaidByContactIds(), paymentData.getPaidByContactIds()) && s6c.m47909a(getTransactionId(), paymentData.getTransactionId()) && s6c.m47909a(getNote(), paymentData.getNote()) && s6c.m47909a(getCreatedAt(), paymentData.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), paymentData.getUpdatedAt()) && s6c.m47909a(getCustomPaymentData(), paymentData.getCustomPaymentData()) && s6c.m47909a(getCreatedById(), paymentData.getCreatedById()) && s6c.m47909a(getUpdatedById(), paymentData.getUpdatedById());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public Integer getAmount() {
        return this.amount;
    }

    public Integer getAmountPaid() {
        return this.amountPaid;
    }

    public Contact getContact() {
        return this.contact;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getCreatedById() {
        return this.createdById;
    }

    public String getCurrency() {
        return this.currency;
    }

    public String getCustomPaymentData() {
        return this.customPaymentData;
    }

    public String getEngagementId() {
        return this.engagementId;
    }

    public Temporal.DateTime getFinalPaymentDate() {
        return this.finalPaymentDate;
    }

    public String getId() {
        return this.id;
    }

    public String getLastPaymentStatus() {
        return this.lastPaymentStatus;
    }

    public String getNote() {
        return this.note;
    }

    public PaymentOrder getOrder() {
        return this.order;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public String getOrderIdInPaymentProvider() {
        return this.orderIdInPaymentProvider;
    }

    public List<String> getPaidByContactIds() {
        return this.paidByContactIds;
    }

    public List<PaymentEvent> getPaymentEvents() {
        return this.paymentEvents;
    }

    public PaymentLink getPaymentLink() {
        return this.paymentLink;
    }

    public String getPaymentLinkId() {
        return this.paymentLinkId;
    }

    public String getPaymentLinkUrl() {
        return this.paymentLinkUrl;
    }

    public String getPaymentProvider() {
        return this.paymentProvider;
    }

    public String getPaymentRequestType() {
        return this.paymentRequestType;
    }

    public String getStatus() {
        return this.status;
    }

    public List<String> getTransactionId() {
        return this.transactionId;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public String getUpdatedById() {
        return this.updatedById;
    }

    public int hashCode() {
        return (getId() + getAccountId() + getPaymentRequestType() + getContact() + getEngagementId() + getPaymentProvider() + getOrderIdInPaymentProvider() + getOrderId() + getPaymentLinkId() + getPaymentLinkUrl() + getAmount() + getAmountPaid() + getCurrency() + getStatus() + getLastPaymentStatus() + getFinalPaymentDate() + getPaidByContactIds() + getTransactionId() + getNote() + getCreatedAt() + getUpdatedAt() + getCustomPaymentData() + getCreatedById() + getUpdatedById()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PaymentData {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("paymentRequestType=" + String.valueOf(getPaymentRequestType()) + ", ");
        sb.append("contact=" + String.valueOf(getContact()) + ", ");
        sb.append("engagementId=" + String.valueOf(getEngagementId()) + ", ");
        sb.append("paymentProvider=" + String.valueOf(getPaymentProvider()) + ", ");
        sb.append("orderIdInPaymentProvider=" + String.valueOf(getOrderIdInPaymentProvider()) + ", ");
        sb.append("orderId=" + String.valueOf(getOrderId()) + ", ");
        sb.append("paymentLinkId=" + String.valueOf(getPaymentLinkId()) + ", ");
        sb.append("paymentLinkUrl=" + String.valueOf(getPaymentLinkUrl()) + ", ");
        sb.append("amount=" + String.valueOf(getAmount()) + ", ");
        sb.append("amountPaid=" + String.valueOf(getAmountPaid()) + ", ");
        sb.append("currency=" + String.valueOf(getCurrency()) + ", ");
        sb.append("status=" + String.valueOf(getStatus()) + ", ");
        sb.append("lastPaymentStatus=" + String.valueOf(getLastPaymentStatus()) + ", ");
        sb.append("finalPaymentDate=" + String.valueOf(getFinalPaymentDate()) + ", ");
        sb.append("paidByContactIds=" + String.valueOf(getPaidByContactIds()) + ", ");
        sb.append("transactionId=" + String.valueOf(getTransactionId()) + ", ");
        sb.append("note=" + String.valueOf(getNote()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        sb.append("updatedAt=" + String.valueOf(getUpdatedAt()) + ", ");
        sb.append("customPaymentData=" + String.valueOf(getCustomPaymentData()) + ", ");
        sb.append("createdById=" + String.valueOf(getCreatedById()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedById=");
        sb2.append(String.valueOf(getUpdatedById()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private PaymentData(String str, String str2, String str3, Contact contact, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, Integer num2, String str10, String str11, String str12, Temporal.DateTime dateTime, List<String> list, List<String> list2, String str13, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3, String str14, String str15, String str16) {
        this.order = null;
        this.paymentLink = null;
        this.paymentEvents = null;
        this.id = str;
        this.accountId = str2;
        this.paymentRequestType = str3;
        this.contact = contact;
        this.engagementId = str4;
        this.paymentProvider = str5;
        this.orderIdInPaymentProvider = str6;
        this.orderId = str7;
        this.paymentLinkId = str8;
        this.paymentLinkUrl = str9;
        this.amount = num;
        this.amountPaid = num2;
        this.currency = str10;
        this.status = str11;
        this.lastPaymentStatus = str12;
        this.finalPaymentDate = dateTime;
        this.paidByContactIds = list;
        this.transactionId = list2;
        this.note = str13;
        this.createdAt = dateTime2;
        this.updatedAt = dateTime3;
        this.customPaymentData = str14;
        this.createdById = str15;
        this.updatedById = str16;
    }
}
