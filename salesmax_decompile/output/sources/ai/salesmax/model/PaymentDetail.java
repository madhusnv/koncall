package ai.salesmax.model;

import android.os.Parcel;
import android.os.Parcelable;
import org.objectweb.asm.Opcodes;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class PaymentDetail implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<PaymentDetail> CREATOR = new Creator();
    private Integer amount;
    private String createdAt;
    private String currency;
    private String id;
    private String paymentLinkUrl;
    private String paymentProvider;
    private String status;

    public static final class Creator implements Parcelable.Creator<PaymentDetail> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentDetail createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new PaymentDetail(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentDetail[] newArray(int i) {
            return new PaymentDetail[i];
        }
    }

    public PaymentDetail() {
        this(null, null, null, null, null, null, null, Opcodes.LAND, null);
    }

    public static /* synthetic */ PaymentDetail copy$default(PaymentDetail paymentDetail, String str, String str2, String str3, Integer num, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentDetail.id;
        }
        if ((i & 2) != 0) {
            str2 = paymentDetail.paymentProvider;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = paymentDetail.status;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            num = paymentDetail.amount;
        }
        Integer num2 = num;
        if ((i & 16) != 0) {
            str4 = paymentDetail.currency;
        }
        String str9 = str4;
        if ((i & 32) != 0) {
            str5 = paymentDetail.paymentLinkUrl;
        }
        String str10 = str5;
        if ((i & 64) != 0) {
            str6 = paymentDetail.createdAt;
        }
        return paymentDetail.copy(str, str7, str8, num2, str9, str10, str6);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.paymentProvider;
    }

    public final String component3() {
        return this.status;
    }

    public final Integer component4() {
        return this.amount;
    }

    public final String component5() {
        return this.currency;
    }

    public final String component6() {
        return this.paymentLinkUrl;
    }

    public final String component7() {
        return this.createdAt;
    }

    public final PaymentDetail copy(String str, String str2, String str3, Integer num, String str4, String str5, String str6) {
        return new PaymentDetail(str, str2, str3, num, str4, str5, str6);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentDetail)) {
            return false;
        }
        PaymentDetail paymentDetail = (PaymentDetail) obj;
        return sq8.m48644c(this.id, paymentDetail.id) && sq8.m48644c(this.paymentProvider, paymentDetail.paymentProvider) && sq8.m48644c(this.status, paymentDetail.status) && sq8.m48644c(this.amount, paymentDetail.amount) && sq8.m48644c(this.currency, paymentDetail.currency) && sq8.m48644c(this.paymentLinkUrl, paymentDetail.paymentLinkUrl) && sq8.m48644c(this.createdAt, paymentDetail.createdAt);
    }

    public final Integer getAmount() {
        return this.amount;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getId() {
        return this.id;
    }

    public final String getPaymentLinkUrl() {
        return this.paymentLinkUrl;
    }

    public final String getPaymentProvider() {
        return this.paymentProvider;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.paymentProvider;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.status;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.amount;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.currency;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.paymentLinkUrl;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.createdAt;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public final void setAmount(Integer num) {
        this.amount = num;
    }

    public final void setCreatedAt(String str) {
        this.createdAt = str;
    }

    public final void setCurrency(String str) {
        this.currency = str;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setPaymentLinkUrl(String str) {
        this.paymentLinkUrl = str;
    }

    public final void setPaymentProvider(String str) {
        this.paymentProvider = str;
    }

    public final void setStatus(String str) {
        this.status = str;
    }

    public String toString() {
        return "PaymentDetail(id=" + this.id + ", paymentProvider=" + this.paymentProvider + ", status=" + this.status + ", amount=" + this.amount + ", currency=" + this.currency + ", paymentLinkUrl=" + this.paymentLinkUrl + ", createdAt=" + this.createdAt + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.paymentProvider);
        parcel.writeString(this.status);
        Integer num = this.amount;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.currency);
        parcel.writeString(this.paymentLinkUrl);
        parcel.writeString(this.createdAt);
    }

    public PaymentDetail(String str, String str2, String str3, Integer num, String str4, String str5, String str6) {
        this.id = str;
        this.paymentProvider = str2;
        this.status = str3;
        this.amount = num;
        this.currency = str4;
        this.paymentLinkUrl = str5;
        this.createdAt = str6;
    }

    public /* synthetic */ PaymentDetail(String str, String str2, String str3, Integer num, String str4, String str5, String str6, int i, id5 id5Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? 0 : num, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6);
    }
}
