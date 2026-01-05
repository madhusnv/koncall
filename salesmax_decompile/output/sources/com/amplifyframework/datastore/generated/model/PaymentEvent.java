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
import com.google.android.gms.cast.MediaTrack;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@Indexes({@Index(fields = {"idInPaymentProvider", "paymentProvider"}, name = "paymentByExternalId"), @Index(fields = {"orderId"}, name = "paymentByOrderId")})
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM)}, pluralName = "PaymentEvents")
/* loaded from: classes5.dex */
public final class PaymentEvent implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @ModelField(targetType = "AWSJSON")
    private final String acquirerData;

    @ModelField(targetType = "Int")
    private final Integer amount;

    @ModelField(targetType = "Int")
    private final Integer amountRefunded;

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

    @ModelField(targetType = "AWSJSON")
    private final String error;

    @ModelField(targetType = "String")
    private final String externalOrderId;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "String")
    private final String idInPaymentProvider;

    @ModelField(targetType = "Boolean")
    private final Boolean international;

    @ModelField(targetType = "String")
    private final String method;

    @ModelField(targetType = "String")
    private final String note;

    @ModelField(targetType = "ID")
    private final String orderId;

    @ModelField(targetType = "String")
    private final String paymentProvider;

    @ModelField(targetType = "String")
    private final String refundStatus;

    @ModelField(targetType = "String")
    private final String status;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;

    @ModelField(targetType = "ID")
    private final String updatedById;
    public static final QueryField ID = QueryField.field("PaymentEvent", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("PaymentEvent", "accountId");
    public static final QueryField CONTACT_ID = QueryField.field("PaymentEvent", "contactId");
    public static final QueryField ORDER_ID = QueryField.field("PaymentEvent", "orderId");
    public static final QueryField EXTERNAL_ORDER_ID = QueryField.field("PaymentEvent", "externalOrderId");
    public static final QueryField PAYMENT_PROVIDER = QueryField.field("PaymentEvent", "paymentProvider");
    public static final QueryField ID_IN_PAYMENT_PROVIDER = QueryField.field("PaymentEvent", "idInPaymentProvider");
    public static final QueryField CURRENCY = QueryField.field("PaymentEvent", FirebaseAnalytics.Param.CURRENCY);
    public static final QueryField AMOUNT = QueryField.field("PaymentEvent", "amount");
    public static final QueryField STATUS = QueryField.field("PaymentEvent", "status");
    public static final QueryField NOTE = QueryField.field("PaymentEvent", "note");
    public static final QueryField DESCRIPTION = QueryField.field("PaymentEvent", MediaTrack.ROLE_DESCRIPTION);
    public static final QueryField METHOD = QueryField.field("PaymentEvent", FirebaseAnalytics.Param.METHOD);
    public static final QueryField INTERNATIONAL = QueryField.field("PaymentEvent", "international");
    public static final QueryField REFUND_STATUS = QueryField.field("PaymentEvent", "refundStatus");
    public static final QueryField AMOUNT_REFUNDED = QueryField.field("PaymentEvent", "amountRefunded");
    public static final QueryField ERROR = QueryField.field("PaymentEvent", Constants.IPC_BUNDLE_KEY_SEND_ERROR);
    public static final QueryField ACQUIRER_DATA = QueryField.field("PaymentEvent", "acquirerData");
    public static final QueryField CREATED_AT = QueryField.field("PaymentEvent", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("PaymentEvent", "updatedAt");
    public static final QueryField CREATED_BY_ID = QueryField.field("PaymentEvent", "createdById");
    public static final QueryField UPDATED_BY_ID = QueryField.field("PaymentEvent", "updatedById");

    public interface AccountIdStep {
        BuildStep accountId(String str);
    }

    public interface BuildStep {
        BuildStep acquirerData(String str);

        BuildStep amount(Integer num);

        BuildStep amountRefunded(Integer num);

        PaymentEvent build();

        BuildStep contactId(String str);

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep createdById(String str);

        BuildStep currency(String str);

        BuildStep description(String str);

        BuildStep error(String str);

        BuildStep externalOrderId(String str);

        BuildStep id(String str);

        BuildStep idInPaymentProvider(String str);

        BuildStep international(Boolean bool);

        BuildStep method(String str);

        BuildStep note(String str);

        BuildStep orderId(String str);

        BuildStep paymentProvider(String str);

        BuildStep refundStatus(String str);

        BuildStep status(String str);

        BuildStep updatedAt(Temporal.DateTime dateTime);

        BuildStep updatedById(String str);
    }

    public static class Builder implements AccountIdStep, BuildStep {
        private String accountId;
        private String acquirerData;
        private Integer amount;
        private Integer amountRefunded;
        private String contactId;
        private Temporal.DateTime createdAt;
        private String createdById;
        private String currency;
        private String description;
        private String error;
        private String externalOrderId;
        private String id;
        private String idInPaymentProvider;
        private Boolean international;
        private String method;
        private String note;
        private String orderId;
        private String paymentProvider;
        private String refundStatus;
        private String status;
        private Temporal.DateTime updatedAt;
        private String updatedById;

        @Override // com.amplifyframework.datastore.generated.model.PaymentEvent.AccountIdStep
        public BuildStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentEvent.BuildStep
        public BuildStep acquirerData(String str) {
            this.acquirerData = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentEvent.BuildStep
        public BuildStep amount(Integer num) {
            this.amount = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentEvent.BuildStep
        public BuildStep amountRefunded(Integer num) {
            this.amountRefunded = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentEvent.BuildStep
        public PaymentEvent build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new PaymentEvent(string, this.accountId, this.contactId, this.orderId, this.externalOrderId, this.paymentProvider, this.idInPaymentProvider, this.currency, this.amount, this.status, this.note, this.description, this.method, this.international, this.refundStatus, this.amountRefunded, this.error, this.acquirerData, this.createdAt, this.updatedAt, this.createdById, this.updatedById);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentEvent.BuildStep
        public BuildStep contactId(String str) {
            this.contactId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentEvent.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentEvent.BuildStep
        public BuildStep createdById(String str) {
            this.createdById = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentEvent.BuildStep
        public BuildStep currency(String str) {
            this.currency = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentEvent.BuildStep
        public BuildStep description(String str) {
            this.description = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentEvent.BuildStep
        public BuildStep error(String str) {
            this.error = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentEvent.BuildStep
        public BuildStep externalOrderId(String str) {
            this.externalOrderId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentEvent.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentEvent.BuildStep
        public BuildStep idInPaymentProvider(String str) {
            this.idInPaymentProvider = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentEvent.BuildStep
        public BuildStep international(Boolean bool) {
            this.international = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentEvent.BuildStep
        public BuildStep method(String str) {
            this.method = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentEvent.BuildStep
        public BuildStep note(String str) {
            this.note = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentEvent.BuildStep
        public BuildStep orderId(String str) {
            this.orderId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentEvent.BuildStep
        public BuildStep paymentProvider(String str) {
            this.paymentProvider = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentEvent.BuildStep
        public BuildStep refundStatus(String str) {
            this.refundStatus = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentEvent.BuildStep
        public BuildStep status(String str) {
            this.status = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentEvent.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentEvent.BuildStep
        public BuildStep updatedById(String str) {
            this.updatedById = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, String str9, String str10, String str11, String str12, Boolean bool, String str13, Integer num2, String str14, String str15, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, String str16, String str17) {
            this.id = str;
            this.accountId = str2;
            this.contactId = str3;
            this.orderId = str4;
            this.externalOrderId = str5;
            this.paymentProvider = str6;
            this.idInPaymentProvider = str7;
            this.currency = str8;
            this.amount = num;
            this.status = str9;
            this.note = str10;
            this.description = str11;
            this.method = str12;
            this.international = bool;
            this.refundStatus = str13;
            this.amountRefunded = num2;
            this.error = str14;
            this.acquirerData = str15;
            this.createdAt = dateTime;
            this.updatedAt = dateTime2;
            this.createdById = str16;
            this.updatedById = str17;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, String str9, String str10, String str11, String str12, Boolean bool, String str13, Integer num2, String str14, String str15, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, String str16, String str17) {
            super(str, str2, str3, str4, str5, str6, str7, str8, num, str9, str10, str11, str12, bool, str13, num2, str14, str15, dateTime, dateTime2, str16, str17);
            Objects.requireNonNull(str2);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentEvent.Builder, com.amplifyframework.datastore.generated.model.PaymentEvent.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentEvent.Builder, com.amplifyframework.datastore.generated.model.PaymentEvent.BuildStep
        public CopyOfBuilder acquirerData(String str) {
            return (CopyOfBuilder) super.acquirerData(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentEvent.Builder, com.amplifyframework.datastore.generated.model.PaymentEvent.BuildStep
        public CopyOfBuilder amount(Integer num) {
            return (CopyOfBuilder) super.amount(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentEvent.Builder, com.amplifyframework.datastore.generated.model.PaymentEvent.BuildStep
        public CopyOfBuilder amountRefunded(Integer num) {
            return (CopyOfBuilder) super.amountRefunded(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentEvent.Builder, com.amplifyframework.datastore.generated.model.PaymentEvent.BuildStep
        public CopyOfBuilder contactId(String str) {
            return (CopyOfBuilder) super.contactId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentEvent.Builder, com.amplifyframework.datastore.generated.model.PaymentEvent.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentEvent.Builder, com.amplifyframework.datastore.generated.model.PaymentEvent.BuildStep
        public CopyOfBuilder createdById(String str) {
            return (CopyOfBuilder) super.createdById(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentEvent.Builder, com.amplifyframework.datastore.generated.model.PaymentEvent.BuildStep
        public CopyOfBuilder currency(String str) {
            return (CopyOfBuilder) super.currency(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentEvent.Builder, com.amplifyframework.datastore.generated.model.PaymentEvent.BuildStep
        public CopyOfBuilder description(String str) {
            return (CopyOfBuilder) super.description(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentEvent.Builder, com.amplifyframework.datastore.generated.model.PaymentEvent.BuildStep
        public CopyOfBuilder error(String str) {
            return (CopyOfBuilder) super.error(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentEvent.Builder, com.amplifyframework.datastore.generated.model.PaymentEvent.BuildStep
        public CopyOfBuilder externalOrderId(String str) {
            return (CopyOfBuilder) super.externalOrderId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentEvent.Builder, com.amplifyframework.datastore.generated.model.PaymentEvent.BuildStep
        public CopyOfBuilder idInPaymentProvider(String str) {
            return (CopyOfBuilder) super.idInPaymentProvider(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentEvent.Builder, com.amplifyframework.datastore.generated.model.PaymentEvent.BuildStep
        public CopyOfBuilder international(Boolean bool) {
            return (CopyOfBuilder) super.international(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentEvent.Builder, com.amplifyframework.datastore.generated.model.PaymentEvent.BuildStep
        public CopyOfBuilder method(String str) {
            return (CopyOfBuilder) super.method(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentEvent.Builder, com.amplifyframework.datastore.generated.model.PaymentEvent.BuildStep
        public CopyOfBuilder note(String str) {
            return (CopyOfBuilder) super.note(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentEvent.Builder, com.amplifyframework.datastore.generated.model.PaymentEvent.BuildStep
        public CopyOfBuilder orderId(String str) {
            return (CopyOfBuilder) super.orderId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentEvent.Builder, com.amplifyframework.datastore.generated.model.PaymentEvent.BuildStep
        public CopyOfBuilder paymentProvider(String str) {
            return (CopyOfBuilder) super.paymentProvider(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentEvent.Builder, com.amplifyframework.datastore.generated.model.PaymentEvent.BuildStep
        public CopyOfBuilder refundStatus(String str) {
            return (CopyOfBuilder) super.refundStatus(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentEvent.Builder, com.amplifyframework.datastore.generated.model.PaymentEvent.BuildStep
        public CopyOfBuilder status(String str) {
            return (CopyOfBuilder) super.status(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentEvent.Builder, com.amplifyframework.datastore.generated.model.PaymentEvent.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentEvent.Builder, com.amplifyframework.datastore.generated.model.PaymentEvent.BuildStep
        public CopyOfBuilder updatedById(String str) {
            return (CopyOfBuilder) super.updatedById(str);
        }
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static PaymentEvent justId(String str) {
        return new PaymentEvent(str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.contactId, this.orderId, this.externalOrderId, this.paymentProvider, this.idInPaymentProvider, this.currency, this.amount, this.status, this.note, this.description, this.method, this.international, this.refundStatus, this.amountRefunded, this.error, this.acquirerData, this.createdAt, this.updatedAt, this.createdById, this.updatedById);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PaymentEvent.class != obj.getClass()) {
            return false;
        }
        PaymentEvent paymentEvent = (PaymentEvent) obj;
        return s6c.m47909a(getId(), paymentEvent.getId()) && s6c.m47909a(getAccountId(), paymentEvent.getAccountId()) && s6c.m47909a(getContactId(), paymentEvent.getContactId()) && s6c.m47909a(getOrderId(), paymentEvent.getOrderId()) && s6c.m47909a(getExternalOrderId(), paymentEvent.getExternalOrderId()) && s6c.m47909a(getPaymentProvider(), paymentEvent.getPaymentProvider()) && s6c.m47909a(getIdInPaymentProvider(), paymentEvent.getIdInPaymentProvider()) && s6c.m47909a(getCurrency(), paymentEvent.getCurrency()) && s6c.m47909a(getAmount(), paymentEvent.getAmount()) && s6c.m47909a(getStatus(), paymentEvent.getStatus()) && s6c.m47909a(getNote(), paymentEvent.getNote()) && s6c.m47909a(getDescription(), paymentEvent.getDescription()) && s6c.m47909a(getMethod(), paymentEvent.getMethod()) && s6c.m47909a(getInternational(), paymentEvent.getInternational()) && s6c.m47909a(getRefundStatus(), paymentEvent.getRefundStatus()) && s6c.m47909a(getAmountRefunded(), paymentEvent.getAmountRefunded()) && s6c.m47909a(getError(), paymentEvent.getError()) && s6c.m47909a(getAcquirerData(), paymentEvent.getAcquirerData()) && s6c.m47909a(getCreatedAt(), paymentEvent.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), paymentEvent.getUpdatedAt()) && s6c.m47909a(getCreatedById(), paymentEvent.getCreatedById()) && s6c.m47909a(getUpdatedById(), paymentEvent.getUpdatedById());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public String getAcquirerData() {
        return this.acquirerData;
    }

    public Integer getAmount() {
        return this.amount;
    }

    public Integer getAmountRefunded() {
        return this.amountRefunded;
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

    public String getError() {
        return this.error;
    }

    public String getExternalOrderId() {
        return this.externalOrderId;
    }

    public String getId() {
        return this.id;
    }

    public String getIdInPaymentProvider() {
        return this.idInPaymentProvider;
    }

    public Boolean getInternational() {
        return this.international;
    }

    public String getMethod() {
        return this.method;
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

    public String getRefundStatus() {
        return this.refundStatus;
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
        return (getId() + getAccountId() + getContactId() + getOrderId() + getExternalOrderId() + getPaymentProvider() + getIdInPaymentProvider() + getCurrency() + getAmount() + getStatus() + getNote() + getDescription() + getMethod() + getInternational() + getRefundStatus() + getAmountRefunded() + getError() + getAcquirerData() + getCreatedAt() + getUpdatedAt() + getCreatedById() + getUpdatedById()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PaymentEvent {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("contactId=" + String.valueOf(getContactId()) + ", ");
        sb.append("orderId=" + String.valueOf(getOrderId()) + ", ");
        sb.append("externalOrderId=" + String.valueOf(getExternalOrderId()) + ", ");
        sb.append("paymentProvider=" + String.valueOf(getPaymentProvider()) + ", ");
        sb.append("idInPaymentProvider=" + String.valueOf(getIdInPaymentProvider()) + ", ");
        sb.append("currency=" + String.valueOf(getCurrency()) + ", ");
        sb.append("amount=" + String.valueOf(getAmount()) + ", ");
        sb.append("status=" + String.valueOf(getStatus()) + ", ");
        sb.append("note=" + String.valueOf(getNote()) + ", ");
        sb.append("description=" + String.valueOf(getDescription()) + ", ");
        sb.append("method=" + String.valueOf(getMethod()) + ", ");
        sb.append("international=" + String.valueOf(getInternational()) + ", ");
        sb.append("refundStatus=" + String.valueOf(getRefundStatus()) + ", ");
        sb.append("amountRefunded=" + String.valueOf(getAmountRefunded()) + ", ");
        sb.append("error=" + String.valueOf(getError()) + ", ");
        sb.append("acquirerData=" + String.valueOf(getAcquirerData()) + ", ");
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

    private PaymentEvent(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, String str9, String str10, String str11, String str12, Boolean bool, String str13, Integer num2, String str14, String str15, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, String str16, String str17) {
        this.id = str;
        this.accountId = str2;
        this.contactId = str3;
        this.orderId = str4;
        this.externalOrderId = str5;
        this.paymentProvider = str6;
        this.idInPaymentProvider = str7;
        this.currency = str8;
        this.amount = num;
        this.status = str9;
        this.note = str10;
        this.description = str11;
        this.method = str12;
        this.international = bool;
        this.refundStatus = str13;
        this.amountRefunded = num2;
        this.error = str14;
        this.acquirerData = str15;
        this.createdAt = dateTime;
        this.updatedAt = dateTime2;
        this.createdById = str16;
        this.updatedById = str17;
    }
}
