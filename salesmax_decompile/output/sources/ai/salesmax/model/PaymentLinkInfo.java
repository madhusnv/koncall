package ai.salesmax.model;

import android.os.Parcel;
import android.os.Parcelable;
import org.objectweb.asm.Opcodes;
import p001o.id5;
import p001o.sq8;
import p001o.yfe;

/* loaded from: classes.dex */
public final class PaymentLinkInfo extends yfe implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<PaymentLinkInfo> CREATOR = new Creator();
    private Boolean acceptPartial;
    private String accountId;
    private Integer amount;
    private Integer amountPaid;
    private Long cancelledAt;
    private String contactId;
    private Long createdAt;
    private String createdById;
    private String currency;
    private String description;
    private Long expireBy;
    private Long expiredAt;
    private String externalUserReference;
    private Integer firstMinPartialAmount;
    private String id;
    private String idInPaymentProvider;
    private String note;
    private String orderId;
    private String paymentProvider;
    private String shortUrl;
    private String status;
    private Long updatedAt;
    private String updatedById;
    private String upiLink;

    public static final class Creator implements Parcelable.Creator<PaymentLinkInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentLinkInfo createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            sq8.m48649h(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new PaymentLinkInfo(string, string2, string3, string4, string5, string6, boolValueOf, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentLinkInfo[] newArray(int i) {
            return new PaymentLinkInfo[i];
        }
    }

    public PaymentLinkInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777215, null);
    }

    public final String component1() {
        return this.id;
    }

    public final Integer component10() {
        return this.amountPaid;
    }

    public final String component11() {
        return this.currency;
    }

    public final String component12() {
        return this.description;
    }

    public final String component13() {
        return this.note;
    }

    public final String component14() {
        return this.shortUrl;
    }

    public final String component15() {
        return this.upiLink;
    }

    public final String component16() {
        return this.status;
    }

    public final Long component17() {
        return this.expireBy;
    }

    public final Long component18() {
        return this.expiredAt;
    }

    public final Long component19() {
        return this.cancelledAt;
    }

    public final String component2() {
        return this.accountId;
    }

    public final String component20() {
        return this.externalUserReference;
    }

    public final String component21() {
        return this.createdById;
    }

    public final String component22() {
        return this.updatedById;
    }

    public final Long component23() {
        return this.updatedAt;
    }

    public final Long component24() {
        return this.createdAt;
    }

    public final String component3() {
        return this.contactId;
    }

    public final String component4() {
        return this.paymentProvider;
    }

    public final String component5() {
        return this.idInPaymentProvider;
    }

    public final String component6() {
        return this.orderId;
    }

    public final Boolean component7() {
        return this.acceptPartial;
    }

    public final Integer component8() {
        return this.firstMinPartialAmount;
    }

    public final Integer component9() {
        return this.amount;
    }

    public final PaymentLinkInfo copy(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Integer num, Integer num2, Integer num3, String str7, String str8, String str9, String str10, String str11, String str12, Long l, Long l2, Long l3, String str13, String str14, String str15, Long l4, Long l5) {
        return new PaymentLinkInfo(str, str2, str3, str4, str5, str6, bool, num, num2, num3, str7, str8, str9, str10, str11, str12, l, l2, l3, str13, str14, str15, l4, l5);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentLinkInfo)) {
            return false;
        }
        PaymentLinkInfo paymentLinkInfo = (PaymentLinkInfo) obj;
        return sq8.m48644c(this.id, paymentLinkInfo.id) && sq8.m48644c(this.accountId, paymentLinkInfo.accountId) && sq8.m48644c(this.contactId, paymentLinkInfo.contactId) && sq8.m48644c(this.paymentProvider, paymentLinkInfo.paymentProvider) && sq8.m48644c(this.idInPaymentProvider, paymentLinkInfo.idInPaymentProvider) && sq8.m48644c(this.orderId, paymentLinkInfo.orderId) && sq8.m48644c(this.acceptPartial, paymentLinkInfo.acceptPartial) && sq8.m48644c(this.firstMinPartialAmount, paymentLinkInfo.firstMinPartialAmount) && sq8.m48644c(this.amount, paymentLinkInfo.amount) && sq8.m48644c(this.amountPaid, paymentLinkInfo.amountPaid) && sq8.m48644c(this.currency, paymentLinkInfo.currency) && sq8.m48644c(this.description, paymentLinkInfo.description) && sq8.m48644c(this.note, paymentLinkInfo.note) && sq8.m48644c(this.shortUrl, paymentLinkInfo.shortUrl) && sq8.m48644c(this.upiLink, paymentLinkInfo.upiLink) && sq8.m48644c(this.status, paymentLinkInfo.status) && sq8.m48644c(this.expireBy, paymentLinkInfo.expireBy) && sq8.m48644c(this.expiredAt, paymentLinkInfo.expiredAt) && sq8.m48644c(this.cancelledAt, paymentLinkInfo.cancelledAt) && sq8.m48644c(this.externalUserReference, paymentLinkInfo.externalUserReference) && sq8.m48644c(this.createdById, paymentLinkInfo.createdById) && sq8.m48644c(this.updatedById, paymentLinkInfo.updatedById) && sq8.m48644c(this.updatedAt, paymentLinkInfo.updatedAt) && sq8.m48644c(this.createdAt, paymentLinkInfo.createdAt);
    }

    public final Boolean getAcceptPartial() {
        return this.acceptPartial;
    }

    public final String getAccountId() {
        return this.accountId;
    }

    public final Integer getAmount() {
        return this.amount;
    }

    public final Integer getAmountPaid() {
        return this.amountPaid;
    }

    public final Long getCancelledAt() {
        return this.cancelledAt;
    }

    public final String getContactId() {
        return this.contactId;
    }

    @Override // p001o.yfe
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public final String getCreatedById() {
        return this.createdById;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Long getExpireBy() {
        return this.expireBy;
    }

    public final Long getExpiredAt() {
        return this.expiredAt;
    }

    public final String getExternalUserReference() {
        return this.externalUserReference;
    }

    public final Integer getFirstMinPartialAmount() {
        return this.firstMinPartialAmount;
    }

    public final String getId() {
        return this.id;
    }

    public final String getIdInPaymentProvider() {
        return this.idInPaymentProvider;
    }

    public final String getNote() {
        return this.note;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getPaymentProvider() {
        return this.paymentProvider;
    }

    public final String getShortUrl() {
        return this.shortUrl;
    }

    public final String getStatus() {
        return this.status;
    }

    @Override // p001o.yfe
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    public final String getUpdatedById() {
        return this.updatedById;
    }

    public final String getUpiLink() {
        return this.upiLink;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.accountId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.contactId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.paymentProvider;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.idInPaymentProvider;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.orderId;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.acceptPartial;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.firstMinPartialAmount;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.amount;
        int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.amountPaid;
        int iHashCode10 = (iHashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str7 = this.currency;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.description;
        int iHashCode12 = (iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.note;
        int iHashCode13 = (iHashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.shortUrl;
        int iHashCode14 = (iHashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.upiLink;
        int iHashCode15 = (iHashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.status;
        int iHashCode16 = (iHashCode15 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Long l = this.expireBy;
        int iHashCode17 = (iHashCode16 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.expiredAt;
        int iHashCode18 = (iHashCode17 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.cancelledAt;
        int iHashCode19 = (iHashCode18 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str13 = this.externalUserReference;
        int iHashCode20 = (iHashCode19 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.createdById;
        int iHashCode21 = (iHashCode20 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.updatedById;
        int iHashCode22 = (iHashCode21 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Long l4 = this.updatedAt;
        int iHashCode23 = (iHashCode22 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.createdAt;
        return iHashCode23 + (l5 != null ? l5.hashCode() : 0);
    }

    public final void setAcceptPartial(Boolean bool) {
        this.acceptPartial = bool;
    }

    public final void setAccountId(String str) {
        this.accountId = str;
    }

    public final void setAmount(Integer num) {
        this.amount = num;
    }

    public final void setAmountPaid(Integer num) {
        this.amountPaid = num;
    }

    public final void setCancelledAt(Long l) {
        this.cancelledAt = l;
    }

    public final void setContactId(String str) {
        this.contactId = str;
    }

    @Override // p001o.yfe
    public void setCreatedAt(Long l) {
        this.createdAt = l;
    }

    public final void setCreatedById(String str) {
        this.createdById = str;
    }

    public final void setCurrency(String str) {
        this.currency = str;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final void setExpireBy(Long l) {
        this.expireBy = l;
    }

    public final void setExpiredAt(Long l) {
        this.expiredAt = l;
    }

    public final void setExternalUserReference(String str) {
        this.externalUserReference = str;
    }

    public final void setFirstMinPartialAmount(Integer num) {
        this.firstMinPartialAmount = num;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setIdInPaymentProvider(String str) {
        this.idInPaymentProvider = str;
    }

    public final void setNote(String str) {
        this.note = str;
    }

    public final void setOrderId(String str) {
        this.orderId = str;
    }

    public final void setPaymentProvider(String str) {
        this.paymentProvider = str;
    }

    public final void setShortUrl(String str) {
        this.shortUrl = str;
    }

    public final void setStatus(String str) {
        this.status = str;
    }

    @Override // p001o.yfe
    public void setUpdatedAt(Long l) {
        this.updatedAt = l;
    }

    public final void setUpdatedById(String str) {
        this.updatedById = str;
    }

    public final void setUpiLink(String str) {
        this.upiLink = str;
    }

    public final PaymentLinkSummary toPaymentLinkSummary() {
        PaymentLinkSummary paymentLinkSummary = new PaymentLinkSummary(null, 1, null);
        paymentLinkSummary.setId(this.id);
        paymentLinkSummary.setAccountId(this.accountId);
        paymentLinkSummary.setContactId(this.contactId);
        paymentLinkSummary.setPaymentProvider(this.paymentProvider);
        paymentLinkSummary.setIdInPaymentProvider(this.idInPaymentProvider);
        paymentLinkSummary.setOrderId(this.orderId);
        paymentLinkSummary.setAcceptPartial(this.acceptPartial);
        paymentLinkSummary.setFirstMinPartialAmount(this.firstMinPartialAmount);
        paymentLinkSummary.setAmount(this.amount);
        paymentLinkSummary.setAmountPaid(this.amountPaid);
        paymentLinkSummary.setCurrency(this.currency);
        paymentLinkSummary.setDescription(this.description);
        paymentLinkSummary.setNote(this.note);
        paymentLinkSummary.setShortUrl(this.shortUrl);
        paymentLinkSummary.setUpiLink(this.upiLink);
        paymentLinkSummary.setStatus(this.status);
        paymentLinkSummary.setExpireBy(this.expireBy);
        paymentLinkSummary.setExpiredAt(this.expiredAt);
        paymentLinkSummary.setCancelledAt(this.cancelledAt);
        paymentLinkSummary.setExternalUserReference(this.externalUserReference);
        paymentLinkSummary.setCreatedAt(getCreatedAt());
        paymentLinkSummary.setUpdatedAt(getUpdatedAt());
        return paymentLinkSummary;
    }

    public String toString() {
        return "PaymentLinkInfo(id=" + this.id + ", accountId=" + this.accountId + ", contactId=" + this.contactId + ", paymentProvider=" + this.paymentProvider + ", idInPaymentProvider=" + this.idInPaymentProvider + ", orderId=" + this.orderId + ", acceptPartial=" + this.acceptPartial + ", firstMinPartialAmount=" + this.firstMinPartialAmount + ", amount=" + this.amount + ", amountPaid=" + this.amountPaid + ", currency=" + this.currency + ", description=" + this.description + ", note=" + this.note + ", shortUrl=" + this.shortUrl + ", upiLink=" + this.upiLink + ", status=" + this.status + ", expireBy=" + this.expireBy + ", expiredAt=" + this.expiredAt + ", cancelledAt=" + this.cancelledAt + ", externalUserReference=" + this.externalUserReference + ", createdById=" + this.createdById + ", updatedById=" + this.updatedById + ", updatedAt=" + this.updatedAt + ", createdAt=" + this.createdAt + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.accountId);
        parcel.writeString(this.contactId);
        parcel.writeString(this.paymentProvider);
        parcel.writeString(this.idInPaymentProvider);
        parcel.writeString(this.orderId);
        Boolean bool = this.acceptPartial;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Integer num = this.firstMinPartialAmount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.amount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.amountPaid;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        parcel.writeString(this.currency);
        parcel.writeString(this.description);
        parcel.writeString(this.note);
        parcel.writeString(this.shortUrl);
        parcel.writeString(this.upiLink);
        parcel.writeString(this.status);
        Long l = this.expireBy;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.expiredAt;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        Long l3 = this.cancelledAt;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l3.longValue());
        }
        parcel.writeString(this.externalUserReference);
        parcel.writeString(this.createdById);
        parcel.writeString(this.updatedById);
        Long l4 = this.updatedAt;
        if (l4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l4.longValue());
        }
        Long l5 = this.createdAt;
        if (l5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l5.longValue());
        }
    }

    public /* synthetic */ PaymentLinkInfo(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Integer num, Integer num2, Integer num3, String str7, String str8, String str9, String str10, String str11, String str12, Long l, Long l2, Long l3, String str13, String str14, String str15, Long l4, Long l5, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : num, (i & 256) != 0 ? null : num2, (i & 512) != 0 ? null : num3, (i & 1024) != 0 ? null : str7, (i & 2048) != 0 ? null : str8, (i & 4096) != 0 ? null : str9, (i & 8192) != 0 ? null : str10, (i & Opcodes.ACC_ENUM) != 0 ? null : str11, (i & 32768) != 0 ? null : str12, (i & 65536) != 0 ? null : l, (i & Opcodes.ACC_DEPRECATED) != 0 ? null : l2, (i & 262144) != 0 ? null : l3, (i & Opcodes.ASM8) != 0 ? null : str13, (i & 1048576) != 0 ? null : str14, (i & 2097152) != 0 ? null : str15, (i & 4194304) != 0 ? null : l4, (i & 8388608) != 0 ? null : l5);
    }

    public PaymentLinkInfo(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Integer num, Integer num2, Integer num3, String str7, String str8, String str9, String str10, String str11, String str12, Long l, Long l2, Long l3, String str13, String str14, String str15, Long l4, Long l5) {
        this.id = str;
        this.accountId = str2;
        this.contactId = str3;
        this.paymentProvider = str4;
        this.idInPaymentProvider = str5;
        this.orderId = str6;
        this.acceptPartial = bool;
        this.firstMinPartialAmount = num;
        this.amount = num2;
        this.amountPaid = num3;
        this.currency = str7;
        this.description = str8;
        this.note = str9;
        this.shortUrl = str10;
        this.upiLink = str11;
        this.status = str12;
        this.expireBy = l;
        this.expiredAt = l2;
        this.cancelledAt = l3;
        this.externalUserReference = str13;
        this.createdById = str14;
        this.updatedById = str15;
        this.updatedAt = l4;
        this.createdAt = l5;
    }
}
