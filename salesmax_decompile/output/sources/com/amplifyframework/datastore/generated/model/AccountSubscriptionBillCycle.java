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

@Index(fields = {"accountId", "productAccountId"}, name = "byAccount")
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.READ, ModelOperation.CREATE, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE})}, pluralName = "AccountSubscriptionBillCycles")
/* loaded from: classes5.dex */
public final class AccountSubscriptionBillCycle implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @ModelField(isRequired = true, targetType = "ID")
    private final String addedById;

    @ModelField(isRequired = true, targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(isRequired = true, targetType = "AWSDateTime")
    private final Temporal.DateTime lastBillDate;

    @ModelField(isRequired = true, targetType = "AWSDateTime")
    private final Temporal.DateTime nextBillDate;

    @ModelField(targetType = "String")
    private final String period;

    @BelongsTo(targetName = "productAccountId", type = Account.class)
    @ModelField(targetType = "Account")
    private final Account productAccount;

    @ModelField(isRequired = true, targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;
    public static final QueryField ID = QueryField.field("AccountSubscriptionBillCycle", OutcomeConstants.OUTCOME_ID);
    public static final QueryField PRODUCT_ACCOUNT = QueryField.field("AccountSubscriptionBillCycle", "productAccountId");
    public static final QueryField ACCOUNT_ID = QueryField.field("AccountSubscriptionBillCycle", "accountId");
    public static final QueryField ADDED_BY_ID = QueryField.field("AccountSubscriptionBillCycle", "addedById");
    public static final QueryField PERIOD = QueryField.field("AccountSubscriptionBillCycle", "period");
    public static final QueryField LAST_BILL_DATE = QueryField.field("AccountSubscriptionBillCycle", "lastBillDate");
    public static final QueryField NEXT_BILL_DATE = QueryField.field("AccountSubscriptionBillCycle", "nextBillDate");
    public static final QueryField CREATED_AT = QueryField.field("AccountSubscriptionBillCycle", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("AccountSubscriptionBillCycle", "updatedAt");

    public interface AccountIdStep {
        AddedByIdStep accountId(String str);
    }

    public interface AddedByIdStep {
        LastBillDateStep addedById(String str);
    }

    public interface BuildStep {
        AccountSubscriptionBillCycle build();

        BuildStep id(String str);

        BuildStep period(String str);

        BuildStep productAccount(Account account);
    }

    public static class Builder implements AccountIdStep, AddedByIdStep, LastBillDateStep, NextBillDateStep, CreatedAtStep, UpdatedAtStep, BuildStep {
        private String accountId;
        private String addedById;
        private Temporal.DateTime createdAt;
        private String id;
        private Temporal.DateTime lastBillDate;
        private Temporal.DateTime nextBillDate;
        private String period;
        private Account productAccount;
        private Temporal.DateTime updatedAt;

        @Override // com.amplifyframework.datastore.generated.model.AccountSubscriptionBillCycle.AccountIdStep
        public AddedByIdStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountSubscriptionBillCycle.AddedByIdStep
        public LastBillDateStep addedById(String str) {
            Objects.requireNonNull(str);
            this.addedById = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountSubscriptionBillCycle.BuildStep
        public AccountSubscriptionBillCycle build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new AccountSubscriptionBillCycle(string, this.productAccount, this.accountId, this.addedById, this.period, this.lastBillDate, this.nextBillDate, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountSubscriptionBillCycle.CreatedAtStep
        public UpdatedAtStep createdAt(Temporal.DateTime dateTime) {
            Objects.requireNonNull(dateTime);
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountSubscriptionBillCycle.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountSubscriptionBillCycle.LastBillDateStep
        public NextBillDateStep lastBillDate(Temporal.DateTime dateTime) {
            Objects.requireNonNull(dateTime);
            this.lastBillDate = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountSubscriptionBillCycle.NextBillDateStep
        public CreatedAtStep nextBillDate(Temporal.DateTime dateTime) {
            Objects.requireNonNull(dateTime);
            this.nextBillDate = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountSubscriptionBillCycle.BuildStep
        public BuildStep period(String str) {
            this.period = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountSubscriptionBillCycle.BuildStep
        public BuildStep productAccount(Account account) {
            this.productAccount = account;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountSubscriptionBillCycle.UpdatedAtStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            Objects.requireNonNull(dateTime);
            this.updatedAt = dateTime;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, Account account, String str2, String str3, String str4, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3, Temporal.DateTime dateTime4) {
            this.id = str;
            this.productAccount = account;
            this.accountId = str2;
            this.addedById = str3;
            this.period = str4;
            this.lastBillDate = dateTime;
            this.nextBillDate = dateTime2;
            this.createdAt = dateTime3;
            this.updatedAt = dateTime4;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, Account account, String str2, String str3, String str4, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3, Temporal.DateTime dateTime4) {
            super(str, account, str2, str3, str4, dateTime, dateTime2, dateTime3, dateTime4);
            Objects.requireNonNull(str2);
            Objects.requireNonNull(str3);
            Objects.requireNonNull(dateTime);
            Objects.requireNonNull(dateTime2);
            Objects.requireNonNull(dateTime3);
            Objects.requireNonNull(dateTime4);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountSubscriptionBillCycle.Builder, com.amplifyframework.datastore.generated.model.AccountSubscriptionBillCycle.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountSubscriptionBillCycle.Builder, com.amplifyframework.datastore.generated.model.AccountSubscriptionBillCycle.AddedByIdStep
        public CopyOfBuilder addedById(String str) {
            return (CopyOfBuilder) super.addedById(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountSubscriptionBillCycle.Builder, com.amplifyframework.datastore.generated.model.AccountSubscriptionBillCycle.CreatedAtStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountSubscriptionBillCycle.Builder, com.amplifyframework.datastore.generated.model.AccountSubscriptionBillCycle.LastBillDateStep
        public CopyOfBuilder lastBillDate(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.lastBillDate(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountSubscriptionBillCycle.Builder, com.amplifyframework.datastore.generated.model.AccountSubscriptionBillCycle.NextBillDateStep
        public CopyOfBuilder nextBillDate(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.nextBillDate(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountSubscriptionBillCycle.Builder, com.amplifyframework.datastore.generated.model.AccountSubscriptionBillCycle.BuildStep
        public CopyOfBuilder period(String str) {
            return (CopyOfBuilder) super.period(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountSubscriptionBillCycle.Builder, com.amplifyframework.datastore.generated.model.AccountSubscriptionBillCycle.BuildStep
        public CopyOfBuilder productAccount(Account account) {
            return (CopyOfBuilder) super.productAccount(account);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountSubscriptionBillCycle.Builder, com.amplifyframework.datastore.generated.model.AccountSubscriptionBillCycle.UpdatedAtStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }
    }

    public interface CreatedAtStep {
        UpdatedAtStep createdAt(Temporal.DateTime dateTime);
    }

    public interface LastBillDateStep {
        NextBillDateStep lastBillDate(Temporal.DateTime dateTime);
    }

    public interface NextBillDateStep {
        CreatedAtStep nextBillDate(Temporal.DateTime dateTime);
    }

    public interface UpdatedAtStep {
        BuildStep updatedAt(Temporal.DateTime dateTime);
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static AccountSubscriptionBillCycle justId(String str) {
        return new AccountSubscriptionBillCycle(str, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.productAccount, this.accountId, this.addedById, this.period, this.lastBillDate, this.nextBillDate, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AccountSubscriptionBillCycle.class != obj.getClass()) {
            return false;
        }
        AccountSubscriptionBillCycle accountSubscriptionBillCycle = (AccountSubscriptionBillCycle) obj;
        return s6c.m47909a(getId(), accountSubscriptionBillCycle.getId()) && s6c.m47909a(getProductAccount(), accountSubscriptionBillCycle.getProductAccount()) && s6c.m47909a(getAccountId(), accountSubscriptionBillCycle.getAccountId()) && s6c.m47909a(getAddedById(), accountSubscriptionBillCycle.getAddedById()) && s6c.m47909a(getPeriod(), accountSubscriptionBillCycle.getPeriod()) && s6c.m47909a(getLastBillDate(), accountSubscriptionBillCycle.getLastBillDate()) && s6c.m47909a(getNextBillDate(), accountSubscriptionBillCycle.getNextBillDate()) && s6c.m47909a(getCreatedAt(), accountSubscriptionBillCycle.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), accountSubscriptionBillCycle.getUpdatedAt());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public String getAddedById() {
        return this.addedById;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getId() {
        return this.id;
    }

    public Temporal.DateTime getLastBillDate() {
        return this.lastBillDate;
    }

    public Temporal.DateTime getNextBillDate() {
        return this.nextBillDate;
    }

    public String getPeriod() {
        return this.period;
    }

    public Account getProductAccount() {
        return this.productAccount;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        return (getId() + getProductAccount() + getAccountId() + getAddedById() + getPeriod() + getLastBillDate() + getNextBillDate() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AccountSubscriptionBillCycle {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("productAccount=" + String.valueOf(getProductAccount()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("addedById=" + String.valueOf(getAddedById()) + ", ");
        sb.append("period=" + String.valueOf(getPeriod()) + ", ");
        sb.append("lastBillDate=" + String.valueOf(getLastBillDate()) + ", ");
        sb.append("nextBillDate=" + String.valueOf(getNextBillDate()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private AccountSubscriptionBillCycle(String str, Account account, String str2, String str3, String str4, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3, Temporal.DateTime dateTime4) {
        this.id = str;
        this.productAccount = account;
        this.accountId = str2;
        this.addedById = str3;
        this.period = str4;
        this.lastBillDate = dateTime;
        this.nextBillDate = dateTime2;
        this.createdAt = dateTime3;
        this.updatedAt = dateTime4;
    }
}
