package ai.salesmax.model;

import android.os.Parcel;
import android.os.Parcelable;
import org.objectweb.asm.Opcodes;
import p001o.id5;
import p001o.sq8;
import p001o.yfe;

/* loaded from: classes.dex */
public final class PaymentOrderInfo extends yfe implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<PaymentOrderInfo> CREATOR = new Creator();
    private String accountId;
    private Integer amount;
    private Integer amountPaid;
    private String contactId;
    private Long createdAt;
    private String createdById;
    private String currency;
    private String id;
    private String idInPaymentProvider;
    private String note;
    private String paymentProvider;
    private String receipt;
    private String status;
    private Long updatedAt;
    private String updatedById;

    public static final class Creator implements Parcelable.Creator<PaymentOrderInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentOrderInfo createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new PaymentOrderInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentOrderInfo[] newArray(int i) {
            return new PaymentOrderInfo[i];
        }
    }

    public PaymentOrderInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }

    public final String component1() {
        return this.id;
    }

    public final String component10() {
        return this.note;
    }

    public final String component11() {
        return this.receipt;
    }

    public final String component12() {
        return this.createdById;
    }

    public final String component13() {
        return this.updatedById;
    }

    public final Long component14() {
        return this.updatedAt;
    }

    public final Long component15() {
        return this.createdAt;
    }

    public final String component2() {
        return this.accountId;
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

    public final Integer component6() {
        return this.amount;
    }

    public final Integer component7() {
        return this.amountPaid;
    }

    public final String component8() {
        return this.currency;
    }

    public final String component9() {
        return this.status;
    }

    public final PaymentOrderInfo copy(String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, String str6, String str7, String str8, String str9, String str10, String str11, Long l, Long l2) {
        return new PaymentOrderInfo(str, str2, str3, str4, str5, num, num2, str6, str7, str8, str9, str10, str11, l, l2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentOrderInfo)) {
            return false;
        }
        PaymentOrderInfo paymentOrderInfo = (PaymentOrderInfo) obj;
        return sq8.m48644c(this.id, paymentOrderInfo.id) && sq8.m48644c(this.accountId, paymentOrderInfo.accountId) && sq8.m48644c(this.contactId, paymentOrderInfo.contactId) && sq8.m48644c(this.paymentProvider, paymentOrderInfo.paymentProvider) && sq8.m48644c(this.idInPaymentProvider, paymentOrderInfo.idInPaymentProvider) && sq8.m48644c(this.amount, paymentOrderInfo.amount) && sq8.m48644c(this.amountPaid, paymentOrderInfo.amountPaid) && sq8.m48644c(this.currency, paymentOrderInfo.currency) && sq8.m48644c(this.status, paymentOrderInfo.status) && sq8.m48644c(this.note, paymentOrderInfo.note) && sq8.m48644c(this.receipt, paymentOrderInfo.receipt) && sq8.m48644c(this.createdById, paymentOrderInfo.createdById) && sq8.m48644c(this.updatedById, paymentOrderInfo.updatedById) && sq8.m48644c(this.updatedAt, paymentOrderInfo.updatedAt) && sq8.m48644c(this.createdAt, paymentOrderInfo.createdAt);
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

    public final String getId() {
        return this.id;
    }

    public final String getIdInPaymentProvider() {
        return this.idInPaymentProvider;
    }

    public final String getNote() {
        return this.note;
    }

    public final String getPaymentProvider() {
        return this.paymentProvider;
    }

    public final String getReceipt() {
        return this.receipt;
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
        Integer num = this.amount;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.amountPaid;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str6 = this.currency;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.status;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.note;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.receipt;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.createdById;
        int iHashCode12 = (iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.updatedById;
        int iHashCode13 = (iHashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Long l = this.updatedAt;
        int iHashCode14 = (iHashCode13 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.createdAt;
        return iHashCode14 + (l2 != null ? l2.hashCode() : 0);
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

    public final void setId(String str) {
        this.id = str;
    }

    public final void setIdInPaymentProvider(String str) {
        this.idInPaymentProvider = str;
    }

    public final void setNote(String str) {
        this.note = str;
    }

    public final void setPaymentProvider(String str) {
        this.paymentProvider = str;
    }

    public final void setReceipt(String str) {
        this.receipt = str;
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

    /* JADX WARN: Multi-variable type inference failed */
    public final PaymentOrderSummary toPaymentOrderSummary() {
        PaymentOrderSummary paymentOrderSummary = new PaymentOrderSummary(null, 1, 0 == true ? 1 : 0);
        paymentOrderSummary.setId(this.id);
        paymentOrderSummary.setAccountId(this.accountId);
        paymentOrderSummary.setContactId(this.contactId);
        paymentOrderSummary.setPaymentProvider(this.paymentProvider);
        paymentOrderSummary.setIdInPaymentProvider(this.idInPaymentProvider);
        paymentOrderSummary.setAmount(this.amount);
        paymentOrderSummary.setAmountPaid(this.amountPaid);
        paymentOrderSummary.setCurrency(this.currency);
        paymentOrderSummary.setStatus(this.status);
        paymentOrderSummary.setNote(this.note);
        paymentOrderSummary.setReceipt(this.receipt);
        paymentOrderSummary.setCreatedById(this.createdById);
        paymentOrderSummary.setUpdatedById(this.updatedById);
        paymentOrderSummary.setCreatedAt(getCreatedAt());
        paymentOrderSummary.setUpdatedAt(getUpdatedAt());
        return paymentOrderSummary;
    }

    public String toString() {
        return "PaymentOrderInfo(id=" + this.id + ", accountId=" + this.accountId + ", contactId=" + this.contactId + ", paymentProvider=" + this.paymentProvider + ", idInPaymentProvider=" + this.idInPaymentProvider + ", amount=" + this.amount + ", amountPaid=" + this.amountPaid + ", currency=" + this.currency + ", status=" + this.status + ", note=" + this.note + ", receipt=" + this.receipt + ", createdById=" + this.createdById + ", updatedById=" + this.updatedById + ", updatedAt=" + this.updatedAt + ", createdAt=" + this.createdAt + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.accountId);
        parcel.writeString(this.contactId);
        parcel.writeString(this.paymentProvider);
        parcel.writeString(this.idInPaymentProvider);
        Integer num = this.amount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.amountPaid;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.currency);
        parcel.writeString(this.status);
        parcel.writeString(this.note);
        parcel.writeString(this.receipt);
        parcel.writeString(this.createdById);
        parcel.writeString(this.updatedById);
        Long l = this.updatedAt;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.createdAt;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
    }

    public /* synthetic */ PaymentOrderInfo(String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, String str6, String str7, String str8, String str9, String str10, String str11, Long l, Long l2, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? null : str9, (i & 2048) != 0 ? null : str10, (i & 4096) != 0 ? null : str11, (i & 8192) != 0 ? null : l, (i & Opcodes.ACC_ENUM) == 0 ? l2 : null);
    }

    public PaymentOrderInfo(String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, String str6, String str7, String str8, String str9, String str10, String str11, Long l, Long l2) {
        this.id = str;
        this.accountId = str2;
        this.contactId = str3;
        this.paymentProvider = str4;
        this.idInPaymentProvider = str5;
        this.amount = num;
        this.amountPaid = num2;
        this.currency = str6;
        this.status = str7;
        this.note = str8;
        this.receipt = str9;
        this.createdById = str10;
        this.updatedById = str11;
        this.updatedAt = l;
        this.createdAt = l2;
    }
}
