package ai.salesmax.model;

import ai.salesmax.model.PaymentDataSummary;
import com.amplifyframework.core.model.temporal.Temporal;
import com.amplifyframework.datastore.generated.model.Contact;
import com.amplifyframework.datastore.generated.model.PaymentData;
import com.amplifyframework.datastore.generated.model.PaymentLink;
import com.amplifyframework.datastore.generated.model.PaymentOrder;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import p001o.a81;
import p001o.id5;
import p001o.lpi;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes.dex */
public final class PaymentDataSummary {
    private Double __amountInput;
    private PaymentLinkSummary __underlyingPaymentLinkSummary;
    private PaymentOrderSummary __underlyingPaymentOrderSummary;
    private PaymentData underlyingPaymentData;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final PaymentData newInstance() {
            PaymentData paymentDataBuild = PaymentData.builder().accountId("").id("").build();
            sq8.m48648g(paymentDataBuild, "build(...)");
            return paymentDataBuild;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentDataSummary() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long _get_createdAt_$lambda$3(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Long) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long _get_updatedAt_$lambda$1(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Long) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _set_createdBy_$lambda$14(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _set_updatedBy_$lambda$15(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(obj);
    }

    public final String getAccountId() {
        return this.underlyingPaymentData.getAccountId();
    }

    public final Integer getAmount() {
        return this.underlyingPaymentData.getAmount();
    }

    public final Double getAmountInput() {
        Double d = this.__amountInput;
        if (d != null) {
            return d;
        }
        if (getAmount() != null) {
            return Double.valueOf(r0.intValue());
        }
        return null;
    }

    public final Integer getAmountPaid() {
        return this.underlyingPaymentData.getAmountPaid();
    }

    public final LeadsSummary getContact() {
        Contact contact = this.underlyingPaymentData.getContact();
        if (contact != null) {
            return new LeadsSummary(contact);
        }
        return null;
    }

    public final Long getCreatedAt() {
        Optional optionalOfNullable = Optional.ofNullable(this.underlyingPaymentData.getCreatedAt());
        final PaymentDataSummary$createdAt$1 paymentDataSummary$createdAt$1 = PaymentDataSummary$createdAt$1.INSTANCE;
        return (Long) optionalOfNullable.map(new Function() { // from class: o.n0d
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return PaymentDataSummary._get_createdAt_$lambda$3(paymentDataSummary$createdAt$1, obj);
            }
        }).orElse(null);
    }

    public final Optional<LeadsUser> getCreatedBy() {
        Optional<LeadsUser> optionalOfNullable = Optional.ofNullable(lpi.a0(this.underlyingPaymentData.getCreatedById()));
        sq8.m48648g(optionalOfNullable, "ofNullable(...)");
        return optionalOfNullable;
    }

    public final String getCreatedById() {
        return this.underlyingPaymentData.getCreatedById();
    }

    public final String getCurrency() {
        return this.underlyingPaymentData.getCurrency();
    }

    public final String getEngagementId() {
        return this.underlyingPaymentData.getPaymentLinkId();
    }

    public final Long getFinalPaymentDate() {
        Temporal.DateTime finalPaymentDate = this.underlyingPaymentData.getFinalPaymentDate();
        if (finalPaymentDate != null) {
            return a81.m16645F(finalPaymentDate);
        }
        return null;
    }

    public final String getId() {
        return this.underlyingPaymentData.getId();
    }

    public final String getNote() {
        return this.underlyingPaymentData.getNote();
    }

    public final PaymentOrderSummary getOrder() {
        PaymentOrderSummary paymentOrderSummary = this.__underlyingPaymentOrderSummary;
        if (paymentOrderSummary != null) {
            return paymentOrderSummary;
        }
        PaymentOrder order = this.underlyingPaymentData.getOrder();
        if (order != null) {
            return new PaymentOrderSummary(order);
        }
        return null;
    }

    public final String getOrderId() {
        return this.underlyingPaymentData.getOrderId();
    }

    public final String getOrderIdInPaymentProvider() {
        return this.underlyingPaymentData.getOrderIdInPaymentProvider();
    }

    public final PaymentLinkSummary getPaymentLink() {
        PaymentLinkSummary paymentLinkSummary = this.__underlyingPaymentLinkSummary;
        if (paymentLinkSummary != null) {
            return paymentLinkSummary;
        }
        PaymentLink paymentLink = this.underlyingPaymentData.getPaymentLink();
        if (paymentLink != null) {
            return new PaymentLinkSummary(paymentLink);
        }
        return null;
    }

    public final String getPaymentLinkId() {
        return this.underlyingPaymentData.getPaymentLinkId();
    }

    public final String getPaymentLinkUrl() {
        return this.underlyingPaymentData.getPaymentLinkUrl();
    }

    public final String getPaymentProvider() {
        return this.underlyingPaymentData.getPaymentProvider();
    }

    public final String getPaymentRequestType() {
        return this.underlyingPaymentData.getPaymentRequestType();
    }

    public final String getStatus() {
        return this.underlyingPaymentData.getStatus();
    }

    public final PaymentData getUnderlyingPaymentData() {
        return this.underlyingPaymentData;
    }

    public final Long getUpdatedAt() {
        Optional optionalOfNullable = Optional.ofNullable(this.underlyingPaymentData.getUpdatedAt());
        final PaymentDataSummary$updatedAt$1 paymentDataSummary$updatedAt$1 = PaymentDataSummary$updatedAt$1.INSTANCE;
        return (Long) optionalOfNullable.map(new Function() { // from class: o.l0d
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return PaymentDataSummary._get_updatedAt_$lambda$1(paymentDataSummary$updatedAt$1, obj);
            }
        }).orElse(null);
    }

    public final Optional<LeadsUser> getUpdatedBy() {
        Optional<LeadsUser> optionalOfNullable = Optional.ofNullable(lpi.a0(this.underlyingPaymentData.getUpdatedById()));
        sq8.m48648g(optionalOfNullable, "ofNullable(...)");
        return optionalOfNullable;
    }

    public final String getUpdatedById() {
        return this.underlyingPaymentData.getUpdatedById();
    }

    public final Double get__amountInput() {
        return this.__amountInput;
    }

    public final PaymentLinkSummary get__underlyingPaymentLinkSummary() {
        return this.__underlyingPaymentLinkSummary;
    }

    public final PaymentOrderSummary get__underlyingPaymentOrderSummary() {
        return this.__underlyingPaymentOrderSummary;
    }

    public final void setAccountId(String str) {
        if (str != null) {
            PaymentData paymentDataBuild = this.underlyingPaymentData.copyOfBuilder().accountId(str).build();
            sq8.m48648g(paymentDataBuild, "build(...)");
            this.underlyingPaymentData = paymentDataBuild;
        }
    }

    public final void setAmount(Integer num) {
        PaymentData paymentDataBuild = this.underlyingPaymentData.copyOfBuilder().amount(num).build();
        sq8.m48648g(paymentDataBuild, "build(...)");
        this.underlyingPaymentData = paymentDataBuild;
    }

    public final void setAmountInput(Double d) {
        this.__amountInput = d;
    }

    public final void setAmountPaid(Integer num) {
        PaymentData paymentDataBuild = this.underlyingPaymentData.copyOfBuilder().amountPaid(num).build();
        sq8.m48648g(paymentDataBuild, "build(...)");
        this.underlyingPaymentData = paymentDataBuild;
    }

    public final void setContact(LeadsSummary leadsSummary) {
        if (leadsSummary != null) {
            PaymentData paymentDataBuild = this.underlyingPaymentData.copyOfBuilder().contact(leadsSummary.getUnderlyingContact()).build();
            sq8.m48648g(paymentDataBuild, "build(...)");
            this.underlyingPaymentData = paymentDataBuild;
        }
    }

    public final void setCreatedAt(Long l) {
        if (l != null) {
            PaymentData paymentDataBuild = this.underlyingPaymentData.copyOfBuilder().createdAt(a81.m16658m(Long.valueOf(l.longValue()))).build();
            sq8.m48648g(paymentDataBuild, "build(...)");
            this.underlyingPaymentData = paymentDataBuild;
        }
    }

    public final void setCreatedBy(Optional<LeadsUser> optional) {
        sq8.m48649h(optional, "value");
        final PaymentDataSummary$createdBy$1 paymentDataSummary$createdBy$1 = new PaymentDataSummary$createdBy$1(this);
        optional.ifPresent(new Consumer() { // from class: o.o0d
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                PaymentDataSummary._set_createdBy_$lambda$14(paymentDataSummary$createdBy$1, obj);
            }
        });
    }

    public final void setCreatedById(String str) {
        if (str != null) {
            PaymentData paymentDataBuild = this.underlyingPaymentData.copyOfBuilder().createdById(str).build();
            sq8.m48648g(paymentDataBuild, "build(...)");
            this.underlyingPaymentData = paymentDataBuild;
        }
    }

    public final void setCurrency(String str) {
        PaymentData paymentDataBuild = this.underlyingPaymentData.copyOfBuilder().currency(str).build();
        sq8.m48648g(paymentDataBuild, "build(...)");
        this.underlyingPaymentData = paymentDataBuild;
    }

    public final void setEngagementId(String str) {
        PaymentData paymentDataBuild = this.underlyingPaymentData.copyOfBuilder().engagementId(str).build();
        sq8.m48648g(paymentDataBuild, "build(...)");
        this.underlyingPaymentData = paymentDataBuild;
    }

    public final void setFinalPaymentDate(Long l) {
        PaymentData paymentDataBuild = this.underlyingPaymentData.copyOfBuilder().finalPaymentDate(a81.m16658m(l)).build();
        sq8.m48648g(paymentDataBuild, "build(...)");
        this.underlyingPaymentData = paymentDataBuild;
    }

    public final void setId(String str) {
        PaymentData paymentDataBuild = this.underlyingPaymentData.copyOfBuilder().id(str).build();
        sq8.m48648g(paymentDataBuild, "build(...)");
        this.underlyingPaymentData = paymentDataBuild;
    }

    public final void setNote(String str) {
        PaymentData paymentDataBuild = this.underlyingPaymentData.copyOfBuilder().note(str).build();
        sq8.m48648g(paymentDataBuild, "build(...)");
        this.underlyingPaymentData = paymentDataBuild;
    }

    public final void setOrder(PaymentOrderSummary paymentOrderSummary) {
        if (paymentOrderSummary != null) {
            PaymentData paymentDataBuild = this.underlyingPaymentData.copyOfBuilder().orderId(paymentOrderSummary.getId()).build();
            sq8.m48648g(paymentDataBuild, "build(...)");
            this.underlyingPaymentData = paymentDataBuild;
            this.__underlyingPaymentOrderSummary = paymentOrderSummary;
        }
    }

    public final void setOrderId(String str) {
        PaymentData paymentDataBuild = this.underlyingPaymentData.copyOfBuilder().orderId(str).build();
        sq8.m48648g(paymentDataBuild, "build(...)");
        this.underlyingPaymentData = paymentDataBuild;
    }

    public final void setOrderIdInPaymentProvider(String str) {
        PaymentData paymentDataBuild = this.underlyingPaymentData.copyOfBuilder().orderIdInPaymentProvider(str).build();
        sq8.m48648g(paymentDataBuild, "build(...)");
        this.underlyingPaymentData = paymentDataBuild;
    }

    public final void setPaymentLink(PaymentLinkSummary paymentLinkSummary) {
        if (paymentLinkSummary != null) {
            PaymentData paymentDataBuild = this.underlyingPaymentData.copyOfBuilder().paymentLinkId(paymentLinkSummary.getId()).build();
            sq8.m48648g(paymentDataBuild, "build(...)");
            this.underlyingPaymentData = paymentDataBuild;
            this.__underlyingPaymentLinkSummary = paymentLinkSummary;
        }
    }

    public final void setPaymentLinkId(String str) {
        PaymentData paymentDataBuild = this.underlyingPaymentData.copyOfBuilder().paymentLinkId(str).build();
        sq8.m48648g(paymentDataBuild, "build(...)");
        this.underlyingPaymentData = paymentDataBuild;
    }

    public final void setPaymentLinkUrl(String str) {
        PaymentData paymentDataBuild = this.underlyingPaymentData.copyOfBuilder().paymentLinkUrl(str).build();
        sq8.m48648g(paymentDataBuild, "build(...)");
        this.underlyingPaymentData = paymentDataBuild;
    }

    public final void setPaymentProvider(String str) {
        PaymentData paymentDataBuild = this.underlyingPaymentData.copyOfBuilder().paymentProvider(str).build();
        sq8.m48648g(paymentDataBuild, "build(...)");
        this.underlyingPaymentData = paymentDataBuild;
    }

    public final void setPaymentRequestType(String str) {
        PaymentData paymentDataBuild = this.underlyingPaymentData.copyOfBuilder().paymentRequestType(str).build();
        sq8.m48648g(paymentDataBuild, "build(...)");
        this.underlyingPaymentData = paymentDataBuild;
    }

    public final void setStatus(String str) {
        PaymentData paymentDataBuild = this.underlyingPaymentData.copyOfBuilder().status(str).build();
        sq8.m48648g(paymentDataBuild, "build(...)");
        this.underlyingPaymentData = paymentDataBuild;
    }

    public final void setUnderlyingPaymentData(PaymentData paymentData) {
        sq8.m48649h(paymentData, "<set-?>");
        this.underlyingPaymentData = paymentData;
    }

    public final void setUpdatedAt(Long l) {
        if (l != null) {
            PaymentData paymentDataBuild = this.underlyingPaymentData.copyOfBuilder().updatedAt(a81.m16658m(Long.valueOf(l.longValue()))).build();
            sq8.m48648g(paymentDataBuild, "build(...)");
            this.underlyingPaymentData = paymentDataBuild;
        }
    }

    public final void setUpdatedBy(Optional<LeadsUser> optional) {
        sq8.m48649h(optional, "value");
        final PaymentDataSummary$updatedBy$1 paymentDataSummary$updatedBy$1 = new PaymentDataSummary$updatedBy$1(this);
        optional.ifPresent(new Consumer() { // from class: o.m0d
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                PaymentDataSummary._set_updatedBy_$lambda$15(paymentDataSummary$updatedBy$1, obj);
            }
        });
    }

    public final void setUpdatedById(String str) {
        if (str != null) {
            PaymentData paymentDataBuild = this.underlyingPaymentData.copyOfBuilder().updatedById(str).build();
            sq8.m48648g(paymentDataBuild, "build(...)");
            this.underlyingPaymentData = paymentDataBuild;
        }
    }

    public final void set__amountInput(Double d) {
        this.__amountInput = d;
    }

    public final void set__underlyingPaymentLinkSummary(PaymentLinkSummary paymentLinkSummary) {
        this.__underlyingPaymentLinkSummary = paymentLinkSummary;
    }

    public final void set__underlyingPaymentOrderSummary(PaymentOrderSummary paymentOrderSummary) {
        this.__underlyingPaymentOrderSummary = paymentOrderSummary;
    }

    public final PaymentDataInfo toPaymentDataInfo() {
        String id = getId();
        String accountId = getAccountId();
        Integer amount = getAmount();
        Integer amountPaid = getAmountPaid();
        LeadsSummary contact = getContact();
        Leads leads = contact != null ? contact.toLeads() : null;
        String createdById = getCreatedById();
        String currency = getCurrency();
        Long finalPaymentDate = getFinalPaymentDate();
        String engagementId = getEngagementId();
        PaymentOrderSummary order = getOrder();
        PaymentOrderInfo paymentOrderInfo = order != null ? order.toPaymentOrderInfo() : null;
        String orderIdInPaymentProvider = getOrderIdInPaymentProvider();
        PaymentLinkSummary paymentLink = getPaymentLink();
        PaymentLinkInfo paymentLinkInfo = paymentLink != null ? paymentLink.toPaymentLinkInfo() : null;
        return new PaymentDataInfo(id, accountId, leads, engagementId, getPaymentProvider(), orderIdInPaymentProvider, getOrderId(), paymentOrderInfo, getPaymentLinkId(), paymentLinkInfo, getPaymentLinkUrl(), amount, amountPaid, currency, getStatus(), getNote(), finalPaymentDate, createdById, getUpdatedById(), false, false, false, null, getAmountInput(), getUpdatedAt(), getCreatedAt(), 7864320, null);
    }

    public final PaymentDetail toPaymentDetail() {
        String id = getId();
        String str = id == null ? "" : id;
        String paymentProvider = getPaymentProvider();
        String str2 = paymentProvider == null ? "" : paymentProvider;
        String status = getStatus();
        String str3 = status == null ? "" : status;
        Integer amount = getAmount();
        Integer numValueOf = Integer.valueOf(amount != null ? amount.intValue() : 0);
        String currency = getCurrency();
        String str4 = currency == null ? "" : currency;
        String paymentLinkUrl = getPaymentLinkUrl();
        String str5 = paymentLinkUrl == null ? "" : paymentLinkUrl;
        Long createdAt = getCreatedAt();
        String strM16653h = createdAt != null ? a81.m16653h(Long.valueOf(createdAt.longValue())) : null;
        return new PaymentDetail(str, str2, str3, numValueOf, str4, str5, strM16653h == null ? "" : strM16653h);
    }

    public PaymentDataSummary(PaymentData paymentData) {
        sq8.m48649h(paymentData, "underlyingPaymentData");
        this.underlyingPaymentData = paymentData;
    }

    public /* synthetic */ PaymentDataSummary(PaymentData paymentData, int i, id5 id5Var) {
        this((i & 1) != 0 ? Companion.newInstance() : paymentData);
    }
}
