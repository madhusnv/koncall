package com.amplifyframework.datastore.generated.model;

import com.amazonaws.regions.ServiceAbbreviations;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM)}, pluralName = "PaymentQrs")
/* loaded from: classes5.dex */
public final class PaymentQr implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;
    public static final QueryField ID = QueryField.field("PaymentQr", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("PaymentQr", "accountId");

    public interface AccountIdStep {
        BuildStep accountId(String str);
    }

    public interface BuildStep {
        PaymentQr build();

        BuildStep id(String str);
    }

    public static class Builder implements AccountIdStep, BuildStep {
        private String accountId;
        private String id;

        @Override // com.amplifyframework.datastore.generated.model.PaymentQr.AccountIdStep
        public BuildStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentQr.BuildStep
        public PaymentQr build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new PaymentQr(string, this.accountId);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentQr.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2) {
            this.id = str;
            this.accountId = str2;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2) {
            super(str, str2);
            Objects.requireNonNull(str2);
        }

        @Override // com.amplifyframework.datastore.generated.model.PaymentQr.Builder, com.amplifyframework.datastore.generated.model.PaymentQr.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static PaymentQr justId(String str) {
        return new PaymentQr(str, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PaymentQr.class != obj.getClass()) {
            return false;
        }
        PaymentQr paymentQr = (PaymentQr) obj;
        return s6c.m47909a(getId(), paymentQr.getId()) && s6c.m47909a(getAccountId(), paymentQr.getAccountId());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public String getId() {
        return this.id;
    }

    public int hashCode() {
        return (getId() + getAccountId()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PaymentQr {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("accountId=");
        sb2.append(String.valueOf(getAccountId()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private PaymentQr(String str, String str2) {
        this.id = str;
        this.accountId = str2;
    }
}
