package ai.salesmax.model;

import com.amplifyframework.core.model.temporal.Temporal;
import com.amplifyframework.datastore.generated.model.PaymentLink;
import p001o.a81;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class PaymentLinkSummary {
    private PaymentLink underlyingPaymentLink;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final PaymentLink newInstance() {
            PaymentLink paymentLinkBuild = PaymentLink.builder().accountId("").id("").build();
            sq8.m48648g(paymentLinkBuild, "build(...)");
            return paymentLinkBuild;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentLinkSummary() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final Boolean getAcceptPartial() {
        return this.underlyingPaymentLink.getAcceptPartial();
    }

    public final String getAccountId() {
        return this.underlyingPaymentLink.getAccountId();
    }

    public final Integer getAmount() {
        return this.underlyingPaymentLink.getAmount();
    }

    public final Integer getAmountPaid() {
        return this.underlyingPaymentLink.getAmountPaid();
    }

    public final Long getCancelledAt() {
        Temporal.DateTime cancelledAt = this.underlyingPaymentLink.getCancelledAt();
        if (cancelledAt != null) {
            return a81.m16645F(cancelledAt);
        }
        return null;
    }

    public final String getContactId() {
        return this.underlyingPaymentLink.getContactId();
    }

    public final Long getCreatedAt() {
        Temporal.DateTime createdAt = this.underlyingPaymentLink.getCreatedAt();
        if (createdAt != null) {
            return a81.m16645F(createdAt);
        }
        return null;
    }

    public final String getCreatedById() {
        return this.underlyingPaymentLink.getCreatedById();
    }

    public final String getCurrency() {
        return this.underlyingPaymentLink.getCurrency();
    }

    public final String getDescription() {
        return this.underlyingPaymentLink.getDescription();
    }

    public final Long getExpireBy() {
        Temporal.DateTime expireBy = this.underlyingPaymentLink.getExpireBy();
        if (expireBy != null) {
            return a81.m16645F(expireBy);
        }
        return null;
    }

    public final Long getExpiredAt() {
        Temporal.DateTime expiredAt = this.underlyingPaymentLink.getExpiredAt();
        if (expiredAt != null) {
            return a81.m16645F(expiredAt);
        }
        return null;
    }

    public final String getExternalUserReference() {
        return this.underlyingPaymentLink.getExternalUserReference();
    }

    public final Integer getFirstMinPartialAmount() {
        return this.underlyingPaymentLink.getFirstMinPartialAmount();
    }

    public final String getId() {
        return this.underlyingPaymentLink.getId();
    }

    public final String getIdInPaymentProvider() {
        return this.underlyingPaymentLink.getIdInPaymentProvider();
    }

    public final String getNote() {
        return this.underlyingPaymentLink.getNote();
    }

    public final String getOrderId() {
        return this.underlyingPaymentLink.getOrderId();
    }

    public final String getPaymentProvider() {
        return this.underlyingPaymentLink.getPaymentProvider();
    }

    public final String getShortUrl() {
        return this.underlyingPaymentLink.getShortUrl();
    }

    public final String getStatus() {
        return this.underlyingPaymentLink.getStatus();
    }

    public final PaymentLink getUnderlyingPaymentLink() {
        return this.underlyingPaymentLink;
    }

    public final Long getUpdatedAt() {
        Temporal.DateTime updatedAt = this.underlyingPaymentLink.getUpdatedAt();
        if (updatedAt != null) {
            return a81.m16645F(updatedAt);
        }
        return null;
    }

    public final String getUpdatedById() {
        return this.underlyingPaymentLink.getUpdatedById();
    }

    public final String getUpiLink() {
        return this.underlyingPaymentLink.getUpiLink();
    }

    public final void setAcceptPartial(Boolean bool) {
        PaymentLink paymentLinkBuild = this.underlyingPaymentLink.copyOfBuilder().acceptPartial(bool).build();
        sq8.m48648g(paymentLinkBuild, "build(...)");
        this.underlyingPaymentLink = paymentLinkBuild;
    }

    public final void setAccountId(String str) {
        PaymentLink paymentLinkBuild = this.underlyingPaymentLink.copyOfBuilder().accountId(str).build();
        sq8.m48648g(paymentLinkBuild, "build(...)");
        this.underlyingPaymentLink = paymentLinkBuild;
    }

    public final void setAmount(Integer num) {
        PaymentLink paymentLinkBuild = this.underlyingPaymentLink.copyOfBuilder().amount(num).build();
        sq8.m48648g(paymentLinkBuild, "build(...)");
        this.underlyingPaymentLink = paymentLinkBuild;
    }

    public final void setAmountPaid(Integer num) {
        PaymentLink paymentLinkBuild = this.underlyingPaymentLink.copyOfBuilder().amountPaid(num).build();
        sq8.m48648g(paymentLinkBuild, "build(...)");
        this.underlyingPaymentLink = paymentLinkBuild;
    }

    public final void setCancelledAt(Long l) {
        if (l != null) {
            PaymentLink paymentLinkBuild = this.underlyingPaymentLink.copyOfBuilder().cancelledAt(a81.m16658m(Long.valueOf(l.longValue()))).build();
            sq8.m48648g(paymentLinkBuild, "build(...)");
            this.underlyingPaymentLink = paymentLinkBuild;
        }
    }

    public final void setContactId(String str) {
        PaymentLink paymentLinkBuild = this.underlyingPaymentLink.copyOfBuilder().contactId(str).build();
        sq8.m48648g(paymentLinkBuild, "build(...)");
        this.underlyingPaymentLink = paymentLinkBuild;
    }

    public final void setCreatedAt(Long l) {
        if (l != null) {
            this.underlyingPaymentLink.copyOfBuilder().createdAt(a81.m16658m(Long.valueOf(l.longValue()))).build();
        }
    }

    public final void setCreatedById(String str) {
        PaymentLink paymentLinkBuild = this.underlyingPaymentLink.copyOfBuilder().createdById(str).build();
        sq8.m48648g(paymentLinkBuild, "build(...)");
        this.underlyingPaymentLink = paymentLinkBuild;
    }

    public final void setCurrency(String str) {
        PaymentLink paymentLinkBuild = this.underlyingPaymentLink.copyOfBuilder().currency(str).build();
        sq8.m48648g(paymentLinkBuild, "build(...)");
        this.underlyingPaymentLink = paymentLinkBuild;
    }

    public final void setDescription(String str) {
        PaymentLink paymentLinkBuild = this.underlyingPaymentLink.copyOfBuilder().description(str).build();
        sq8.m48648g(paymentLinkBuild, "build(...)");
        this.underlyingPaymentLink = paymentLinkBuild;
    }

    public final void setExpireBy(Long l) {
        if (l != null) {
            PaymentLink paymentLinkBuild = this.underlyingPaymentLink.copyOfBuilder().expireBy(a81.m16658m(Long.valueOf(l.longValue()))).build();
            sq8.m48648g(paymentLinkBuild, "build(...)");
            this.underlyingPaymentLink = paymentLinkBuild;
        }
    }

    public final void setExpiredAt(Long l) {
        if (l != null) {
            PaymentLink paymentLinkBuild = this.underlyingPaymentLink.copyOfBuilder().expiredAt(a81.m16658m(Long.valueOf(l.longValue()))).build();
            sq8.m48648g(paymentLinkBuild, "build(...)");
            this.underlyingPaymentLink = paymentLinkBuild;
        }
    }

    public final void setExternalUserReference(String str) {
        PaymentLink paymentLinkBuild = this.underlyingPaymentLink.copyOfBuilder().externalUserReference(str).build();
        sq8.m48648g(paymentLinkBuild, "build(...)");
        this.underlyingPaymentLink = paymentLinkBuild;
    }

    public final void setFirstMinPartialAmount(Integer num) {
        PaymentLink paymentLinkBuild = this.underlyingPaymentLink.copyOfBuilder().firstMinPartialAmount(num).build();
        sq8.m48648g(paymentLinkBuild, "build(...)");
        this.underlyingPaymentLink = paymentLinkBuild;
    }

    public final void setId(String str) {
        PaymentLink paymentLinkBuild = this.underlyingPaymentLink.copyOfBuilder().id(str).build();
        sq8.m48648g(paymentLinkBuild, "build(...)");
        this.underlyingPaymentLink = paymentLinkBuild;
    }

    public final void setIdInPaymentProvider(String str) {
        PaymentLink paymentLinkBuild = this.underlyingPaymentLink.copyOfBuilder().idInPaymentProvider(str).build();
        sq8.m48648g(paymentLinkBuild, "build(...)");
        this.underlyingPaymentLink = paymentLinkBuild;
    }

    public final void setNote(String str) {
        PaymentLink paymentLinkBuild = this.underlyingPaymentLink.copyOfBuilder().note(str).build();
        sq8.m48648g(paymentLinkBuild, "build(...)");
        this.underlyingPaymentLink = paymentLinkBuild;
    }

    public final void setOrderId(String str) {
        PaymentLink paymentLinkBuild = this.underlyingPaymentLink.copyOfBuilder().orderId(str).build();
        sq8.m48648g(paymentLinkBuild, "build(...)");
        this.underlyingPaymentLink = paymentLinkBuild;
    }

    public final void setPaymentProvider(String str) {
        PaymentLink paymentLinkBuild = this.underlyingPaymentLink.copyOfBuilder().paymentProvider(str).build();
        sq8.m48648g(paymentLinkBuild, "build(...)");
        this.underlyingPaymentLink = paymentLinkBuild;
    }

    public final void setShortUrl(String str) {
        PaymentLink paymentLinkBuild = this.underlyingPaymentLink.copyOfBuilder().shortUrl(str).build();
        sq8.m48648g(paymentLinkBuild, "build(...)");
        this.underlyingPaymentLink = paymentLinkBuild;
    }

    public final void setStatus(String str) {
        PaymentLink paymentLinkBuild = this.underlyingPaymentLink.copyOfBuilder().status(str).build();
        sq8.m48648g(paymentLinkBuild, "build(...)");
        this.underlyingPaymentLink = paymentLinkBuild;
    }

    public final void setUnderlyingPaymentLink(PaymentLink paymentLink) {
        sq8.m48649h(paymentLink, "<set-?>");
        this.underlyingPaymentLink = paymentLink;
    }

    public final void setUpdatedAt(Long l) {
        if (l != null) {
            this.underlyingPaymentLink.copyOfBuilder().updatedAt(a81.m16658m(Long.valueOf(l.longValue()))).build();
        }
    }

    public final void setUpdatedById(String str) {
        PaymentLink paymentLinkBuild = this.underlyingPaymentLink.copyOfBuilder().updatedById(str).build();
        sq8.m48648g(paymentLinkBuild, "build(...)");
        this.underlyingPaymentLink = paymentLinkBuild;
    }

    public final void setUpiLink(String str) {
        PaymentLink paymentLinkBuild = this.underlyingPaymentLink.copyOfBuilder().upiLink(str).build();
        sq8.m48648g(paymentLinkBuild, "build(...)");
        this.underlyingPaymentLink = paymentLinkBuild;
    }

    public final PaymentLinkInfo toPaymentLinkInfo() {
        return new PaymentLinkInfo(getId(), getAccountId(), getContactId(), getPaymentProvider(), getIdInPaymentProvider(), getOrderId(), getAcceptPartial(), getFirstMinPartialAmount(), getAmount(), getAmountPaid(), getCurrency(), getDescription(), getNote(), getShortUrl(), getUpiLink(), getStatus(), getExpireBy(), getExpiredAt(), getCancelledAt(), getExternalUserReference(), getCreatedById(), getUpdatedById(), getUpdatedAt(), getCreatedAt());
    }

    public PaymentLinkSummary(PaymentLink paymentLink) {
        sq8.m48649h(paymentLink, "underlyingPaymentLink");
        this.underlyingPaymentLink = paymentLink;
    }

    public /* synthetic */ PaymentLinkSummary(PaymentLink paymentLink, int i, id5 id5Var) {
        this((i & 1) != 0 ? Companion.newInstance() : paymentLink);
    }
}
