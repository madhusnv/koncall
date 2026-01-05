package ai.salesmax.model;

import ai.salesmax.model.PaymentOrderSummary;
import com.amplifyframework.core.model.temporal.Temporal;
import com.amplifyframework.datastore.generated.model.PaymentOrder;
import java.util.Optional;
import java.util.function.Consumer;
import p001o.a81;
import p001o.id5;
import p001o.lpi;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes.dex */
public final class PaymentOrderSummary {
    private PaymentOrder underlyingPaymentOrder;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final PaymentOrder newInstance() {
            PaymentOrder paymentOrderBuild = PaymentOrder.builder().accountId("").id("").build();
            sq8.m48648g(paymentOrderBuild, "build(...)");
            return paymentOrderBuild;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentOrderSummary() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _set_createdBy_$lambda$0(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _set_updatedBy_$lambda$1(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(obj);
    }

    public final String getAccountId() {
        return this.underlyingPaymentOrder.getAccountId();
    }

    public final Integer getAmount() {
        return this.underlyingPaymentOrder.getAmount();
    }

    public final Integer getAmountPaid() {
        return this.underlyingPaymentOrder.getAmountPaid();
    }

    public final String getContactId() {
        return this.underlyingPaymentOrder.getContactId();
    }

    public final Long getCreatedAt() {
        Temporal.DateTime createdAt = this.underlyingPaymentOrder.getCreatedAt();
        if (createdAt != null) {
            return a81.m16645F(createdAt);
        }
        return null;
    }

    public final Optional<LeadsUser> getCreatedBy() {
        Optional<LeadsUser> optionalOfNullable = Optional.ofNullable(lpi.a0(this.underlyingPaymentOrder.getCreatedById()));
        sq8.m48648g(optionalOfNullable, "ofNullable(...)");
        return optionalOfNullable;
    }

    public final String getCreatedById() {
        return this.underlyingPaymentOrder.getCreatedById();
    }

    public final String getCurrency() {
        return this.underlyingPaymentOrder.getCurrency();
    }

    public final String getId() {
        return this.underlyingPaymentOrder.getId();
    }

    public final String getIdInPaymentProvider() {
        return this.underlyingPaymentOrder.getIdInPaymentProvider();
    }

    public final String getNote() {
        return this.underlyingPaymentOrder.getNote();
    }

    public final String getPaymentProvider() {
        return this.underlyingPaymentOrder.getPaymentProvider();
    }

    public final String getReceipt() {
        return this.underlyingPaymentOrder.getReceipt();
    }

    public final String getStatus() {
        return this.underlyingPaymentOrder.getStatus();
    }

    public final PaymentOrder getUnderlyingPaymentOrder() {
        return this.underlyingPaymentOrder;
    }

    public final Long getUpdatedAt() {
        Temporal.DateTime updatedAt = this.underlyingPaymentOrder.getUpdatedAt();
        if (updatedAt != null) {
            return a81.m16645F(updatedAt);
        }
        return null;
    }

    public final Optional<LeadsUser> getUpdatedBy() {
        Optional<LeadsUser> optionalOfNullable = Optional.ofNullable(lpi.a0(this.underlyingPaymentOrder.getUpdatedById()));
        sq8.m48648g(optionalOfNullable, "ofNullable(...)");
        return optionalOfNullable;
    }

    public final String getUpdatedById() {
        return this.underlyingPaymentOrder.getUpdatedById();
    }

    public final void setAccountId(String str) {
        PaymentOrder paymentOrderBuild = this.underlyingPaymentOrder.copyOfBuilder().accountId(str).build();
        sq8.m48648g(paymentOrderBuild, "build(...)");
        this.underlyingPaymentOrder = paymentOrderBuild;
    }

    public final void setAmount(Integer num) {
        PaymentOrder paymentOrderBuild = this.underlyingPaymentOrder.copyOfBuilder().amount(num).build();
        sq8.m48648g(paymentOrderBuild, "build(...)");
        this.underlyingPaymentOrder = paymentOrderBuild;
    }

    public final void setAmountPaid(Integer num) {
        PaymentOrder paymentOrderBuild = this.underlyingPaymentOrder.copyOfBuilder().amountPaid(num).build();
        sq8.m48648g(paymentOrderBuild, "build(...)");
        this.underlyingPaymentOrder = paymentOrderBuild;
    }

    public final void setContactId(String str) {
        PaymentOrder paymentOrderBuild = this.underlyingPaymentOrder.copyOfBuilder().contactId(str).build();
        sq8.m48648g(paymentOrderBuild, "build(...)");
        this.underlyingPaymentOrder = paymentOrderBuild;
    }

    public final void setCreatedAt(Long l) {
        if (l != null) {
            PaymentOrder paymentOrderBuild = this.underlyingPaymentOrder.copyOfBuilder().createdAt(a81.m16658m(Long.valueOf(l.longValue()))).build();
            sq8.m48648g(paymentOrderBuild, "build(...)");
            this.underlyingPaymentOrder = paymentOrderBuild;
        }
    }

    public final void setCreatedBy(Optional<LeadsUser> optional) {
        sq8.m48649h(optional, "value");
        final PaymentOrderSummary$createdBy$1 paymentOrderSummary$createdBy$1 = new PaymentOrderSummary$createdBy$1(this);
        optional.ifPresent(new Consumer() { // from class: o.z0d
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                PaymentOrderSummary._set_createdBy_$lambda$0(paymentOrderSummary$createdBy$1, obj);
            }
        });
    }

    public final void setCreatedById(String str) {
        PaymentOrder paymentOrderBuild = this.underlyingPaymentOrder.copyOfBuilder().createdById(str).build();
        sq8.m48648g(paymentOrderBuild, "build(...)");
        this.underlyingPaymentOrder = paymentOrderBuild;
    }

    public final void setCurrency(String str) {
        PaymentOrder paymentOrderBuild = this.underlyingPaymentOrder.copyOfBuilder().currency(str).build();
        sq8.m48648g(paymentOrderBuild, "build(...)");
        this.underlyingPaymentOrder = paymentOrderBuild;
    }

    public final void setId(String str) {
        PaymentOrder paymentOrderBuild = this.underlyingPaymentOrder.copyOfBuilder().id(str).build();
        sq8.m48648g(paymentOrderBuild, "build(...)");
        this.underlyingPaymentOrder = paymentOrderBuild;
    }

    public final void setIdInPaymentProvider(String str) {
        PaymentOrder paymentOrderBuild = this.underlyingPaymentOrder.copyOfBuilder().idInPaymentProvider(str).build();
        sq8.m48648g(paymentOrderBuild, "build(...)");
        this.underlyingPaymentOrder = paymentOrderBuild;
    }

    public final void setNote(String str) {
        PaymentOrder paymentOrderBuild = this.underlyingPaymentOrder.copyOfBuilder().note(str).build();
        sq8.m48648g(paymentOrderBuild, "build(...)");
        this.underlyingPaymentOrder = paymentOrderBuild;
    }

    public final void setPaymentProvider(String str) {
        PaymentOrder paymentOrderBuild = this.underlyingPaymentOrder.copyOfBuilder().paymentProvider(str).build();
        sq8.m48648g(paymentOrderBuild, "build(...)");
        this.underlyingPaymentOrder = paymentOrderBuild;
    }

    public final void setReceipt(String str) {
        PaymentOrder paymentOrderBuild = this.underlyingPaymentOrder.copyOfBuilder().receipt(str).build();
        sq8.m48648g(paymentOrderBuild, "build(...)");
        this.underlyingPaymentOrder = paymentOrderBuild;
    }

    public final void setStatus(String str) {
        PaymentOrder paymentOrderBuild = this.underlyingPaymentOrder.copyOfBuilder().status(str).build();
        sq8.m48648g(paymentOrderBuild, "build(...)");
        this.underlyingPaymentOrder = paymentOrderBuild;
    }

    public final void setUnderlyingPaymentOrder(PaymentOrder paymentOrder) {
        sq8.m48649h(paymentOrder, "<set-?>");
        this.underlyingPaymentOrder = paymentOrder;
    }

    public final void setUpdatedAt(Long l) {
        if (l != null) {
            PaymentOrder paymentOrderBuild = this.underlyingPaymentOrder.copyOfBuilder().updatedAt(a81.m16658m(Long.valueOf(l.longValue()))).build();
            sq8.m48648g(paymentOrderBuild, "build(...)");
            this.underlyingPaymentOrder = paymentOrderBuild;
        }
    }

    public final void setUpdatedBy(Optional<LeadsUser> optional) {
        sq8.m48649h(optional, "value");
        final PaymentOrderSummary$updatedBy$1 paymentOrderSummary$updatedBy$1 = new PaymentOrderSummary$updatedBy$1(this);
        optional.ifPresent(new Consumer() { // from class: o.y0d
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                PaymentOrderSummary._set_updatedBy_$lambda$1(paymentOrderSummary$updatedBy$1, obj);
            }
        });
    }

    public final void setUpdatedById(String str) {
        PaymentOrder paymentOrderBuild = this.underlyingPaymentOrder.copyOfBuilder().updatedById(str).build();
        sq8.m48648g(paymentOrderBuild, "build(...)");
        this.underlyingPaymentOrder = paymentOrderBuild;
    }

    public final PaymentOrderInfo toPaymentOrderInfo() {
        return new PaymentOrderInfo(getId(), getAccountId(), getContactId(), getPaymentProvider(), getIdInPaymentProvider(), getAmount(), getAmountPaid(), getCurrency(), getStatus(), getNote(), getReceipt(), getCreatedById(), getUpdatedById(), null, null, 24576, null);
    }

    public PaymentOrderSummary(PaymentOrder paymentOrder) {
        sq8.m48649h(paymentOrder, "underlyingPaymentOrder");
        this.underlyingPaymentOrder = paymentOrder;
    }

    public /* synthetic */ PaymentOrderSummary(PaymentOrder paymentOrder, int i, id5 id5Var) {
        this((i & 1) != 0 ? Companion.newInstance() : paymentOrder);
    }
}
