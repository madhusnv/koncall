package com.amplifyframework.datastore.generated.model;

import com.amazonaws.regions.ServiceAbbreviations;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.core.model.temporal.Temporal;
import com.google.android.gms.cast.MediaTrack;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@Index(fields = {"idInPaymentProvider", "paymentProvider"}, name = "linkByExternalId")
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM)}, pluralName = "PaymentLinks")
/* loaded from: classes5.dex */
public final class PaymentLink implements Model {

    @ModelField(targetType = "Boolean")
    private final Boolean acceptPartial;

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @ModelField(targetType = "Int")
    private final Integer amount;

    @ModelField(targetType = "Int")
    private final Integer amountPaid;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime cancelledAt;

    @ModelField(targetType = "ID")
    private final String contactId;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(targetType = "ID")
    private final String createdById;

    @ModelField(targetType = "String")
    private final String currency;

    @ModelField(targetType = "String")
    private final String description;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime expireBy;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime expiredAt;

    @ModelField(targetType = "String")
    private final String externalUserReference;

    @ModelField(targetType = "Int")
    private final Integer firstMinPartialAmount;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "String")
    private final String idInPaymentProvider;

    @ModelField(targetType = "String")
    private final String note;

    @ModelField(targetType = "ID")
    private final String orderId;

    @ModelField(targetType = "String")
    private final String paymentProvider;

    @ModelField(targetType = "String")
    private final String shortUrl;

    @ModelField(targetType = "String")
    private final String status;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;

    @ModelField(targetType = "ID")
    private final String updatedById;

    @ModelField(targetType = "String")
    private final String upiLink;
    public static final QueryField ID = QueryField.field("PaymentLink", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("PaymentLink", "accountId");
    public static final QueryField CONTACT_ID = QueryField.field("PaymentLink", "contactId");
    public static final QueryField PAYMENT_PROVIDER = QueryField.field("PaymentLink", "paymentProvider");
    public static final QueryField ID_IN_PAYMENT_PROVIDER = QueryField.field("PaymentLink", "idInPaymentProvider");
    public static final QueryField ORDER_ID = QueryField.field("PaymentLink", "orderId");
    public static final QueryField ACCEPT_PARTIAL = QueryField.field("PaymentLink", "acceptPartial");
    public static final QueryField FIRST_MIN_PARTIAL_AMOUNT = QueryField.field("PaymentLink", "firstMinPartialAmount");
    public static final QueryField CURRENCY = QueryField.field("PaymentLink", FirebaseAnalytics.Param.CURRENCY);
    public static final QueryField AMOUNT = QueryField.field("PaymentLink", "amount");
    public static final QueryField AMOUNT_PAID = QueryField.field("PaymentLink", "amountPaid");
    public static final QueryField DESCRIPTION = QueryField.field("PaymentLink", MediaTrack.ROLE_DESCRIPTION);
    public static final QueryField NOTE = QueryField.field("PaymentLink", "note");
    public static final QueryField SHORT_URL = QueryField.field("PaymentLink", "shortUrl");
    public static final QueryField UPI_LINK = QueryField.field("PaymentLink", "upiLink");
    public static final QueryField STATUS = QueryField.field("PaymentLink", "status");
    public static final QueryField EXPIRE_BY = QueryField.field("PaymentLink", "expireBy");
    public static final QueryField EXPIRED_AT = QueryField.field("PaymentLink", "expiredAt");
    public static final QueryField CANCELLED_AT = QueryField.field("PaymentLink", "cancelledAt");
    public static final QueryField CREATED_AT = QueryField.field("PaymentLink", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("PaymentLink", "updatedAt");
    public static final QueryField EXTERNAL_USER_REFERENCE = QueryField.field("PaymentLink", "externalUserReference");
    public static final QueryField CREATED_BY_ID = QueryField.field("PaymentLink", "createdById");
    public static final QueryField UPDATED_BY_ID = QueryField.field("PaymentLink", "updatedById");

    public interface AccountIdStep {
        BuildStep accountId(String str);
    }

    public interface BuildStep {
        BuildStep acceptPartial(Boolean bool);

        BuildStep amount(Integer num);

        BuildStep amountPaid(Integer num);

        PaymentLink build();

        BuildStep cancelledAt(Temporal.DateTime dateTime);

        BuildStep contactId(String str);

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep createdById(String str);

        BuildStep currency(String str);

        BuildStep description(String str);

        BuildStep expireBy(Temporal.DateTime dateTime);

        BuildStep expiredAt(Temporal.DateTime dateTime);

        BuildStep externalUserReference(String str);

        BuildStep firstMinPartialAmount(Integer num);

        BuildStep id(String str);

        BuildStep idInPaymentProvider(String str);

        BuildStep note(String str);

        BuildStep orderId(String str);

        BuildStep paymentProvider(String str);

        BuildStep shortUrl(String str);

        BuildStep status(String str);

        BuildStep updatedAt(Temporal.DateTime dateTime);

        BuildStep updatedById(String str);

        BuildStep upiLink(String str);
    }

    public static class Builder implements AccountIdStep, BuildStep {
        private Boolean acceptPartial;
        private String accountId;
        private Integer amount;
        private Integer amountPaid;
        private Temporal.DateTime cancelledAt;
        private String contactId;
        private Temporal.DateTime createdAt;
        private String createdById;
        private String currency;
        private String description;
        private Temporal.DateTime expireBy;
        private Temporal.DateTime expiredAt;
        private String externalUserReference;
        private Integer firstMinPartialAmount;
        private String id;
        private String idInPaymentProvider;
        private String note;
        private String orderId;
        private String paymentProvider;
        private String shortUrl;
        private String status;
        private Temporal.DateTime updatedAt;
        private String updatedById;
        private String upiLink;

        @Override // com.amplifyframework.datastore.generated.model.PaymentLink.BuildStep
        public BuildStep acceptPartial(Boolean bool) {
            this.acceptPartial = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentLink.AccountIdStep
        public BuildStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentLink.BuildStep
        public BuildStep amount(Integer num) {
            this.amount = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentLink.BuildStep
        public BuildStep amountPaid(Integer num) {
            this.amountPaid = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentLink.BuildStep
        public PaymentLink build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new PaymentLink(string, this.accountId, this.contactId, this.paymentProvider, this.idInPaymentProvider, this.orderId, this.acceptPartial, this.firstMinPartialAmount, this.currency, this.amount, this.amountPaid, this.description, this.note, this.shortUrl, this.upiLink, this.status, this.expireBy, this.expiredAt, this.cancelledAt, this.createdAt, this.updatedAt, this.externalUserReference, this.createdById, this.updatedById);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentLink.BuildStep
        public BuildStep cancelledAt(Temporal.DateTime dateTime) {
            this.cancelledAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentLink.BuildStep
        public BuildStep contactId(String str) {
            this.contactId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentLink.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentLink.BuildStep
        public BuildStep createdById(String str) {
            this.createdById = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentLink.BuildStep
        public BuildStep currency(String str) {
            this.currency = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentLink.BuildStep
        public BuildStep description(String str) {
            this.description = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentLink.BuildStep
        public BuildStep expireBy(Temporal.DateTime dateTime) {
            this.expireBy = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentLink.BuildStep
        public BuildStep expiredAt(Temporal.DateTime dateTime) {
            this.expiredAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentLink.BuildStep
        public BuildStep externalUserReference(String str) {
            this.externalUserReference = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentLink.BuildStep
        public BuildStep firstMinPartialAmount(Integer num) {
            this.firstMinPartialAmount = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentLink.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentLink.BuildStep
        public BuildStep idInPaymentProvider(String str) {
            this.idInPaymentProvider = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentLink.BuildStep
        public BuildStep note(String str) {
            this.note = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentLink.BuildStep
        public BuildStep orderId(String str) {
            this.orderId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentLink.BuildStep
        public BuildStep paymentProvider(String str) {
            this.paymentProvider = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentLink.BuildStep
        public BuildStep shortUrl(String str) {
            this.shortUrl = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentLink.BuildStep
        public BuildStep status(String str) {
            this.status = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentLink.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentLink.BuildStep
        public BuildStep updatedById(String str) {
            this.updatedById = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentLink.BuildStep
        public BuildStep upiLink(String str) {
            this.upiLink = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Integer num, String str7, Integer num2, Integer num3, String str8, String str9, String str10, String str11, String str12, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3, Temporal.DateTime dateTime4, Temporal.DateTime dateTime5, String str13, String str14, String str15) {
            this.id = str;
            this.accountId = str2;
            this.contactId = str3;
            this.paymentProvider = str4;
            this.idInPaymentProvider = str5;
            this.orderId = str6;
            this.acceptPartial = bool;
            this.firstMinPartialAmount = num;
            this.currency = str7;
            this.amount = num2;
            this.amountPaid = num3;
            this.description = str8;
            this.note = str9;
            this.shortUrl = str10;
            this.upiLink = str11;
            this.status = str12;
            this.expireBy = dateTime;
            this.expiredAt = dateTime2;
            this.cancelledAt = dateTime3;
            this.createdAt = dateTime4;
            this.updatedAt = dateTime5;
            this.externalUserReference = str13;
            this.createdById = str14;
            this.updatedById = str15;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Integer num, String str7, Integer num2, Integer num3, String str8, String str9, String str10, String str11, String str12, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3, Temporal.DateTime dateTime4, Temporal.DateTime dateTime5, String str13, String str14, String str15) {
            super(str, str2, str3, str4, str5, str6, bool, num, str7, num2, num3, str8, str9, str10, str11, str12, dateTime, dateTime2, dateTime3, dateTime4, dateTime5, str13, str14, str15);
            Objects.requireNonNull(str2);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentLink.Builder, com.amplifyframework.datastore.generated.model.PaymentLink.BuildStep
        public CopyOfBuilder acceptPartial(Boolean bool) {
            return (CopyOfBuilder) super.acceptPartial(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentLink.Builder, com.amplifyframework.datastore.generated.model.PaymentLink.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentLink.Builder, com.amplifyframework.datastore.generated.model.PaymentLink.BuildStep
        public CopyOfBuilder amount(Integer num) {
            return (CopyOfBuilder) super.amount(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentLink.Builder, com.amplifyframework.datastore.generated.model.PaymentLink.BuildStep
        public CopyOfBuilder amountPaid(Integer num) {
            return (CopyOfBuilder) super.amountPaid(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentLink.Builder, com.amplifyframework.datastore.generated.model.PaymentLink.BuildStep
        public CopyOfBuilder cancelledAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.cancelledAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentLink.Builder, com.amplifyframework.datastore.generated.model.PaymentLink.BuildStep
        public CopyOfBuilder contactId(String str) {
            return (CopyOfBuilder) super.contactId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentLink.Builder, com.amplifyframework.datastore.generated.model.PaymentLink.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentLink.Builder, com.amplifyframework.datastore.generated.model.PaymentLink.BuildStep
        public CopyOfBuilder createdById(String str) {
            return (CopyOfBuilder) super.createdById(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentLink.Builder, com.amplifyframework.datastore.generated.model.PaymentLink.BuildStep
        public CopyOfBuilder currency(String str) {
            return (CopyOfBuilder) super.currency(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentLink.Builder, com.amplifyframework.datastore.generated.model.PaymentLink.BuildStep
        public CopyOfBuilder description(String str) {
            return (CopyOfBuilder) super.description(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentLink.Builder, com.amplifyframework.datastore.generated.model.PaymentLink.BuildStep
        public CopyOfBuilder expireBy(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.expireBy(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentLink.Builder, com.amplifyframework.datastore.generated.model.PaymentLink.BuildStep
        public CopyOfBuilder expiredAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.expiredAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentLink.Builder, com.amplifyframework.datastore.generated.model.PaymentLink.BuildStep
        public CopyOfBuilder externalUserReference(String str) {
            return (CopyOfBuilder) super.externalUserReference(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentLink.Builder, com.amplifyframework.datastore.generated.model.PaymentLink.BuildStep
        public CopyOfBuilder firstMinPartialAmount(Integer num) {
            return (CopyOfBuilder) super.firstMinPartialAmount(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentLink.Builder, com.amplifyframework.datastore.generated.model.PaymentLink.BuildStep
        public CopyOfBuilder idInPaymentProvider(String str) {
            return (CopyOfBuilder) super.idInPaymentProvider(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentLink.Builder, com.amplifyframework.datastore.generated.model.PaymentLink.BuildStep
        public CopyOfBuilder note(String str) {
            return (CopyOfBuilder) super.note(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentLink.Builder, com.amplifyframework.datastore.generated.model.PaymentLink.BuildStep
        public CopyOfBuilder orderId(String str) {
            return (CopyOfBuilder) super.orderId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentLink.Builder, com.amplifyframework.datastore.generated.model.PaymentLink.BuildStep
        public CopyOfBuilder paymentProvider(String str) {
            return (CopyOfBuilder) super.paymentProvider(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentLink.Builder, com.amplifyframework.datastore.generated.model.PaymentLink.BuildStep
        public CopyOfBuilder shortUrl(String str) {
            return (CopyOfBuilder) super.shortUrl(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentLink.Builder, com.amplifyframework.datastore.generated.model.PaymentLink.BuildStep
        public CopyOfBuilder status(String str) {
            return (CopyOfBuilder) super.status(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentLink.Builder, com.amplifyframework.datastore.generated.model.PaymentLink.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentLink.Builder, com.amplifyframework.datastore.generated.model.PaymentLink.BuildStep
        public CopyOfBuilder updatedById(String str) {
            return (CopyOfBuilder) super.updatedById(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentLink.Builder, com.amplifyframework.datastore.generated.model.PaymentLink.BuildStep
        public CopyOfBuilder upiLink(String str) {
            return (CopyOfBuilder) super.upiLink(str);
        }
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static PaymentLink justId(String str) {
        return new PaymentLink(str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.contactId, this.paymentProvider, this.idInPaymentProvider, this.orderId, this.acceptPartial, this.firstMinPartialAmount, this.currency, this.amount, this.amountPaid, this.description, this.note, this.shortUrl, this.upiLink, this.status, this.expireBy, this.expiredAt, this.cancelledAt, this.createdAt, this.updatedAt, this.externalUserReference, this.createdById, this.updatedById);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PaymentLink.class != obj.getClass()) {
            return false;
        }
        PaymentLink paymentLink = (PaymentLink) obj;
        return s6c.m47909a(getId(), paymentLink.getId()) && s6c.m47909a(getAccountId(), paymentLink.getAccountId()) && s6c.m47909a(getContactId(), paymentLink.getContactId()) && s6c.m47909a(getPaymentProvider(), paymentLink.getPaymentProvider()) && s6c.m47909a(getIdInPaymentProvider(), paymentLink.getIdInPaymentProvider()) && s6c.m47909a(getOrderId(), paymentLink.getOrderId()) && s6c.m47909a(getAcceptPartial(), paymentLink.getAcceptPartial()) && s6c.m47909a(getFirstMinPartialAmount(), paymentLink.getFirstMinPartialAmount()) && s6c.m47909a(getCurrency(), paymentLink.getCurrency()) && s6c.m47909a(getAmount(), paymentLink.getAmount()) && s6c.m47909a(getAmountPaid(), paymentLink.getAmountPaid()) && s6c.m47909a(getDescription(), paymentLink.getDescription()) && s6c.m47909a(getNote(), paymentLink.getNote()) && s6c.m47909a(getShortUrl(), paymentLink.getShortUrl()) && s6c.m47909a(getUpiLink(), paymentLink.getUpiLink()) && s6c.m47909a(getStatus(), paymentLink.getStatus()) && s6c.m47909a(getExpireBy(), paymentLink.getExpireBy()) && s6c.m47909a(getExpiredAt(), paymentLink.getExpiredAt()) && s6c.m47909a(getCancelledAt(), paymentLink.getCancelledAt()) && s6c.m47909a(getCreatedAt(), paymentLink.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), paymentLink.getUpdatedAt()) && s6c.m47909a(getExternalUserReference(), paymentLink.getExternalUserReference()) && s6c.m47909a(getCreatedById(), paymentLink.getCreatedById()) && s6c.m47909a(getUpdatedById(), paymentLink.getUpdatedById());
    }

    public Boolean getAcceptPartial() {
        return this.acceptPartial;
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

    public Temporal.DateTime getCancelledAt() {
        return this.cancelledAt;
    }

    public String getContactId() {
        return this.contactId;
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

    public String getDescription() {
        return this.description;
    }

    public Temporal.DateTime getExpireBy() {
        return this.expireBy;
    }

    public Temporal.DateTime getExpiredAt() {
        return this.expiredAt;
    }

    public String getExternalUserReference() {
        return this.externalUserReference;
    }

    public Integer getFirstMinPartialAmount() {
        return this.firstMinPartialAmount;
    }

    public String getId() {
        return this.id;
    }

    public String getIdInPaymentProvider() {
        return this.idInPaymentProvider;
    }

    public String getNote() {
        return this.note;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public String getPaymentProvider() {
        return this.paymentProvider;
    }

    public String getShortUrl() {
        return this.shortUrl;
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

    public String getUpiLink() {
        return this.upiLink;
    }

    public int hashCode() {
        return (getId() + getAccountId() + getContactId() + getPaymentProvider() + getIdInPaymentProvider() + getOrderId() + getAcceptPartial() + getFirstMinPartialAmount() + getCurrency() + getAmount() + getAmountPaid() + getDescription() + getNote() + getShortUrl() + getUpiLink() + getStatus() + getExpireBy() + getExpiredAt() + getCancelledAt() + getCreatedAt() + getUpdatedAt() + getExternalUserReference() + getCreatedById() + getUpdatedById()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PaymentLink {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("contactId=" + String.valueOf(getContactId()) + ", ");
        sb.append("paymentProvider=" + String.valueOf(getPaymentProvider()) + ", ");
        sb.append("idInPaymentProvider=" + String.valueOf(getIdInPaymentProvider()) + ", ");
        sb.append("orderId=" + String.valueOf(getOrderId()) + ", ");
        sb.append("acceptPartial=" + String.valueOf(getAcceptPartial()) + ", ");
        sb.append("firstMinPartialAmount=" + String.valueOf(getFirstMinPartialAmount()) + ", ");
        sb.append("currency=" + String.valueOf(getCurrency()) + ", ");
        sb.append("amount=" + String.valueOf(getAmount()) + ", ");
        sb.append("amountPaid=" + String.valueOf(getAmountPaid()) + ", ");
        sb.append("description=" + String.valueOf(getDescription()) + ", ");
        sb.append("note=" + String.valueOf(getNote()) + ", ");
        sb.append("shortUrl=" + String.valueOf(getShortUrl()) + ", ");
        sb.append("upiLink=" + String.valueOf(getUpiLink()) + ", ");
        sb.append("status=" + String.valueOf(getStatus()) + ", ");
        sb.append("expireBy=" + String.valueOf(getExpireBy()) + ", ");
        sb.append("expiredAt=" + String.valueOf(getExpiredAt()) + ", ");
        sb.append("cancelledAt=" + String.valueOf(getCancelledAt()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        sb.append("updatedAt=" + String.valueOf(getUpdatedAt()) + ", ");
        sb.append("externalUserReference=" + String.valueOf(getExternalUserReference()) + ", ");
        sb.append("createdById=" + String.valueOf(getCreatedById()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedById=");
        sb2.append(String.valueOf(getUpdatedById()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private PaymentLink(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Integer num, String str7, Integer num2, Integer num3, String str8, String str9, String str10, String str11, String str12, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3, Temporal.DateTime dateTime4, Temporal.DateTime dateTime5, String str13, String str14, String str15) {
        this.id = str;
        this.accountId = str2;
        this.contactId = str3;
        this.paymentProvider = str4;
        this.idInPaymentProvider = str5;
        this.orderId = str6;
        this.acceptPartial = bool;
        this.firstMinPartialAmount = num;
        this.currency = str7;
        this.amount = num2;
        this.amountPaid = num3;
        this.description = str8;
        this.note = str9;
        this.shortUrl = str10;
        this.upiLink = str11;
        this.status = str12;
        this.expireBy = dateTime;
        this.expiredAt = dateTime2;
        this.cancelledAt = dateTime3;
        this.createdAt = dateTime4;
        this.updatedAt = dateTime5;
        this.externalUserReference = str13;
        this.createdById = str14;
        this.updatedById = str15;
    }
}
