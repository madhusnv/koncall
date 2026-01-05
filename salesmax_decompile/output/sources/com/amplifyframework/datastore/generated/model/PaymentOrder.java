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
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@Index(fields = {"idInPaymentProvider", "paymentProvider"}, name = "orderByExternalId")
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM)}, pluralName = "PaymentOrders")
/* loaded from: classes5.dex */
public final class PaymentOrder implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @ModelField(targetType = "Int")
    private final Integer amount;

    @ModelField(targetType = "Int")
    private final Integer amountPaid;

    @ModelField(targetType = "ID")
    private final String contactId;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(targetType = "ID")
    private final String createdById;

    @ModelField(targetType = "String")
    private final String currency;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "String")
    private final String idInPaymentProvider;

    @ModelField(targetType = "String")
    private final String note;

    @ModelField(targetType = "String")
    private final String paymentProvider;

    @ModelField(targetType = "String")
    private final String receipt;

    @ModelField(targetType = "String")
    private final String status;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;

    @ModelField(targetType = "ID")
    private final String updatedById;
    public static final QueryField ID = QueryField.field("PaymentOrder", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("PaymentOrder", "accountId");
    public static final QueryField CONTACT_ID = QueryField.field("PaymentOrder", "contactId");
    public static final QueryField PAYMENT_PROVIDER = QueryField.field("PaymentOrder", "paymentProvider");
    public static final QueryField ID_IN_PAYMENT_PROVIDER = QueryField.field("PaymentOrder", "idInPaymentProvider");
    public static final QueryField CURRENCY = QueryField.field("PaymentOrder", FirebaseAnalytics.Param.CURRENCY);
    public static final QueryField AMOUNT = QueryField.field("PaymentOrder", "amount");
    public static final QueryField AMOUNT_PAID = QueryField.field("PaymentOrder", "amountPaid");
    public static final QueryField STATUS = QueryField.field("PaymentOrder", "status");
    public static final QueryField NOTE = QueryField.field("PaymentOrder", "note");
    public static final QueryField RECEIPT = QueryField.field("PaymentOrder", "receipt");
    public static final QueryField CREATED_AT = QueryField.field("PaymentOrder", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("PaymentOrder", "updatedAt");
    public static final QueryField CREATED_BY_ID = QueryField.field("PaymentOrder", "createdById");
    public static final QueryField UPDATED_BY_ID = QueryField.field("PaymentOrder", "updatedById");

    public interface AccountIdStep {
        BuildStep accountId(String str);
    }

    public interface BuildStep {
        BuildStep amount(Integer num);

        BuildStep amountPaid(Integer num);

        PaymentOrder build();

        BuildStep contactId(String str);

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep createdById(String str);

        BuildStep currency(String str);

        BuildStep id(String str);

        BuildStep idInPaymentProvider(String str);

        BuildStep note(String str);

        BuildStep paymentProvider(String str);

        BuildStep receipt(String str);

        BuildStep status(String str);

        BuildStep updatedAt(Temporal.DateTime dateTime);

        BuildStep updatedById(String str);
    }

    public static class Builder implements AccountIdStep, BuildStep {
        private String accountId;
        private Integer amount;
        private Integer amountPaid;
        private String contactId;
        private Temporal.DateTime createdAt;
        private String createdById;
        private String currency;
        private String id;
        private String idInPaymentProvider;
        private String note;
        private String paymentProvider;
        private String receipt;
        private String status;
        private Temporal.DateTime updatedAt;
        private String updatedById;

        @Override // com.amplifyframework.datastore.generated.model.PaymentOrder.AccountIdStep
        public BuildStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentOrder.BuildStep
        public BuildStep amount(Integer num) {
            this.amount = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentOrder.BuildStep
        public BuildStep amountPaid(Integer num) {
            this.amountPaid = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentOrder.BuildStep
        public PaymentOrder build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new PaymentOrder(string, this.accountId, this.contactId, this.paymentProvider, this.idInPaymentProvider, this.currency, this.amount, this.amountPaid, this.status, this.note, this.receipt, this.createdAt, this.updatedAt, this.createdById, this.updatedById);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentOrder.BuildStep
        public BuildStep contactId(String str) {
            this.contactId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentOrder.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentOrder.BuildStep
        public BuildStep createdById(String str) {
            this.createdById = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentOrder.BuildStep
        public BuildStep currency(String str) {
            this.currency = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentOrder.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentOrder.BuildStep
        public BuildStep idInPaymentProvider(String str) {
            this.idInPaymentProvider = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentOrder.BuildStep
        public BuildStep note(String str) {
            this.note = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentOrder.BuildStep
        public BuildStep paymentProvider(String str) {
            this.paymentProvider = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentOrder.BuildStep
        public BuildStep receipt(String str) {
            this.receipt = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentOrder.BuildStep
        public BuildStep status(String str) {
            this.status = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentOrder.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentOrder.BuildStep
        public BuildStep updatedById(String str) {
            this.updatedById = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, String str4, String str5, String str6, Integer num, Integer num2, String str7, String str8, String str9, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, String str10, String str11) {
            this.id = str;
            this.accountId = str2;
            this.contactId = str3;
            this.paymentProvider = str4;
            this.idInPaymentProvider = str5;
            this.currency = str6;
            this.amount = num;
            this.amountPaid = num2;
            this.status = str7;
            this.note = str8;
            this.receipt = str9;
            this.createdAt = dateTime;
            this.updatedAt = dateTime2;
            this.createdById = str10;
            this.updatedById = str11;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, String str3, String str4, String str5, String str6, Integer num, Integer num2, String str7, String str8, String str9, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, String str10, String str11) {
            super(str, str2, str3, str4, str5, str6, num, num2, str7, str8, str9, dateTime, dateTime2, str10, str11);
            Objects.requireNonNull(str2);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentOrder.Builder, com.amplifyframework.datastore.generated.model.PaymentOrder.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentOrder.Builder, com.amplifyframework.datastore.generated.model.PaymentOrder.BuildStep
        public CopyOfBuilder amount(Integer num) {
            return (CopyOfBuilder) super.amount(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentOrder.Builder, com.amplifyframework.datastore.generated.model.PaymentOrder.BuildStep
        public CopyOfBuilder amountPaid(Integer num) {
            return (CopyOfBuilder) super.amountPaid(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentOrder.Builder, com.amplifyframework.datastore.generated.model.PaymentOrder.BuildStep
        public CopyOfBuilder contactId(String str) {
            return (CopyOfBuilder) super.contactId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentOrder.Builder, com.amplifyframework.datastore.generated.model.PaymentOrder.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentOrder.Builder, com.amplifyframework.datastore.generated.model.PaymentOrder.BuildStep
        public CopyOfBuilder createdById(String str) {
            return (CopyOfBuilder) super.createdById(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentOrder.Builder, com.amplifyframework.datastore.generated.model.PaymentOrder.BuildStep
        public CopyOfBuilder currency(String str) {
            return (CopyOfBuilder) super.currency(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentOrder.Builder, com.amplifyframework.datastore.generated.model.PaymentOrder.BuildStep
        public CopyOfBuilder idInPaymentProvider(String str) {
            return (CopyOfBuilder) super.idInPaymentProvider(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentOrder.Builder, com.amplifyframework.datastore.generated.model.PaymentOrder.BuildStep
        public CopyOfBuilder note(String str) {
            return (CopyOfBuilder) super.note(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentOrder.Builder, com.amplifyframework.datastore.generated.model.PaymentOrder.BuildStep
        public CopyOfBuilder paymentProvider(String str) {
            return (CopyOfBuilder) super.paymentProvider(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentOrder.Builder, com.amplifyframework.datastore.generated.model.PaymentOrder.BuildStep
        public CopyOfBuilder receipt(String str) {
            return (CopyOfBuilder) super.receipt(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentOrder.Builder, com.amplifyframework.datastore.generated.model.PaymentOrder.BuildStep
        public CopyOfBuilder status(String str) {
            return (CopyOfBuilder) super.status(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentOrder.Builder, com.amplifyframework.datastore.generated.model.PaymentOrder.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentOrder.Builder, com.amplifyframework.datastore.generated.model.PaymentOrder.BuildStep
        public CopyOfBuilder updatedById(String str) {
            return (CopyOfBuilder) super.updatedById(str);
        }
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static PaymentOrder justId(String str) {
        return new PaymentOrder(str, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.contactId, this.paymentProvider, this.idInPaymentProvider, this.currency, this.amount, this.amountPaid, this.status, this.note, this.receipt, this.createdAt, this.updatedAt, this.createdById, this.updatedById);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PaymentOrder.class != obj.getClass()) {
            return false;
        }
        PaymentOrder paymentOrder = (PaymentOrder) obj;
        return s6c.m47909a(getId(), paymentOrder.getId()) && s6c.m47909a(getAccountId(), paymentOrder.getAccountId()) && s6c.m47909a(getContactId(), paymentOrder.getContactId()) && s6c.m47909a(getPaymentProvider(), paymentOrder.getPaymentProvider()) && s6c.m47909a(getIdInPaymentProvider(), paymentOrder.getIdInPaymentProvider()) && s6c.m47909a(getCurrency(), paymentOrder.getCurrency()) && s6c.m47909a(getAmount(), paymentOrder.getAmount()) && s6c.m47909a(getAmountPaid(), paymentOrder.getAmountPaid()) && s6c.m47909a(getStatus(), paymentOrder.getStatus()) && s6c.m47909a(getNote(), paymentOrder.getNote()) && s6c.m47909a(getReceipt(), paymentOrder.getReceipt()) && s6c.m47909a(getCreatedAt(), paymentOrder.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), paymentOrder.getUpdatedAt()) && s6c.m47909a(getCreatedById(), paymentOrder.getCreatedById()) && s6c.m47909a(getUpdatedById(), paymentOrder.getUpdatedById());
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

    public String getId() {
        return this.id;
    }

    public String getIdInPaymentProvider() {
        return this.idInPaymentProvider;
    }

    public String getNote() {
        return this.note;
    }

    public String getPaymentProvider() {
        return this.paymentProvider;
    }

    public String getReceipt() {
        return this.receipt;
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

    public int hashCode() {
        return (getId() + getAccountId() + getContactId() + getPaymentProvider() + getIdInPaymentProvider() + getCurrency() + getAmount() + getAmountPaid() + getStatus() + getNote() + getReceipt() + getCreatedAt() + getUpdatedAt() + getCreatedById() + getUpdatedById()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PaymentOrder {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("contactId=" + String.valueOf(getContactId()) + ", ");
        sb.append("paymentProvider=" + String.valueOf(getPaymentProvider()) + ", ");
        sb.append("idInPaymentProvider=" + String.valueOf(getIdInPaymentProvider()) + ", ");
        sb.append("currency=" + String.valueOf(getCurrency()) + ", ");
        sb.append("amount=" + String.valueOf(getAmount()) + ", ");
        sb.append("amountPaid=" + String.valueOf(getAmountPaid()) + ", ");
        sb.append("status=" + String.valueOf(getStatus()) + ", ");
        sb.append("note=" + String.valueOf(getNote()) + ", ");
        sb.append("receipt=" + String.valueOf(getReceipt()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        sb.append("updatedAt=" + String.valueOf(getUpdatedAt()) + ", ");
        sb.append("createdById=" + String.valueOf(getCreatedById()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedById=");
        sb2.append(String.valueOf(getUpdatedById()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private PaymentOrder(String str, String str2, String str3, String str4, String str5, String str6, Integer num, Integer num2, String str7, String str8, String str9, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, String str10, String str11) {
        this.id = str;
        this.accountId = str2;
        this.contactId = str3;
        this.paymentProvider = str4;
        this.idInPaymentProvider = str5;
        this.currency = str6;
        this.amount = num;
        this.amountPaid = num2;
        this.status = str7;
        this.note = str8;
        this.receipt = str9;
        this.createdAt = dateTime;
        this.updatedAt = dateTime2;
        this.createdById = str10;
        this.updatedById = str11;
    }
}
