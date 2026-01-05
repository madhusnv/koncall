package ai.salesmax.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import org.objectweb.asm.Opcodes;
import p001o.id5;
import p001o.sq8;
import p001o.th1;
import p001o.yfe;

/* loaded from: classes.dex */
public final class PaymentDataInfo extends yfe implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<PaymentDataInfo> CREATOR = new Creator();
    private String accountId;
    private Integer amount;
    private Double amountInput;
    private Integer amountPaid;
    private Leads contact;
    private Long createdAt;
    private String createdById;
    private String currency;
    private String engagementId;
    private Long finalPaymentDate;
    private String id;
    private boolean isSelected;
    private String note;
    private PaymentOrderInfo order;
    private String orderId;
    private String orderIdInPaymentProvider;
    private String parentEngagementId;
    private PaymentLinkInfo paymentLink;
    private String paymentLinkId;
    private String paymentLinkUrl;
    private String paymentProvider;
    private boolean showBottom;
    private boolean showSelection;
    private String status;
    private Long updatedAt;
    private String updatedById;

    public static final class Creator implements Parcelable.Creator<PaymentDataInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentDataInfo createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new PaymentDataInfo(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Leads.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : PaymentOrderInfo.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : PaymentLinkInfo.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentDataInfo[] newArray(int i) {
            return new PaymentDataInfo[i];
        }
    }

    public PaymentDataInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, 67108863, null);
    }

    public final String component1() {
        return this.id;
    }

    public final PaymentLinkInfo component10() {
        return this.paymentLink;
    }

    public final String component11() {
        return this.paymentLinkUrl;
    }

    public final Integer component12() {
        return this.amount;
    }

    public final Integer component13() {
        return this.amountPaid;
    }

    public final String component14() {
        return this.currency;
    }

    public final String component15() {
        return this.status;
    }

    public final String component16() {
        return this.note;
    }

    public final Long component17() {
        return this.finalPaymentDate;
    }

    public final String component18() {
        return this.createdById;
    }

    public final String component19() {
        return this.updatedById;
    }

    public final String component2() {
        return this.accountId;
    }

    public final boolean component20() {
        return this.showSelection;
    }

    public final boolean component21() {
        return this.isSelected;
    }

    public final boolean component22() {
        return this.showBottom;
    }

    public final String component23() {
        return this.parentEngagementId;
    }

    public final Double component24() {
        return this.amountInput;
    }

    public final Long component25() {
        return this.updatedAt;
    }

    public final Long component26() {
        return this.createdAt;
    }

    public final Leads component3() {
        return this.contact;
    }

    public final String component4() {
        return this.engagementId;
    }

    public final String component5() {
        return this.paymentProvider;
    }

    public final String component6() {
        return this.orderIdInPaymentProvider;
    }

    public final String component7() {
        return this.orderId;
    }

    public final PaymentOrderInfo component8() {
        return this.order;
    }

    public final String component9() {
        return this.paymentLinkId;
    }

    public final PaymentDataInfo copy(String str, String str2, Leads leads, String str3, String str4, String str5, String str6, PaymentOrderInfo paymentOrderInfo, String str7, PaymentLinkInfo paymentLinkInfo, String str8, Integer num, Integer num2, String str9, String str10, String str11, Long l, String str12, String str13, boolean z, boolean z2, boolean z3, String str14, Double d, Long l2, Long l3) {
        return new PaymentDataInfo(str, str2, leads, str3, str4, str5, str6, paymentOrderInfo, str7, paymentLinkInfo, str8, num, num2, str9, str10, str11, l, str12, str13, z, z2, z3, str14, d, l2, l3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentDataInfo)) {
            return false;
        }
        PaymentDataInfo paymentDataInfo = (PaymentDataInfo) obj;
        return sq8.m48644c(this.id, paymentDataInfo.id) && sq8.m48644c(this.accountId, paymentDataInfo.accountId) && sq8.m48644c(this.contact, paymentDataInfo.contact) && sq8.m48644c(this.engagementId, paymentDataInfo.engagementId) && sq8.m48644c(this.paymentProvider, paymentDataInfo.paymentProvider) && sq8.m48644c(this.orderIdInPaymentProvider, paymentDataInfo.orderIdInPaymentProvider) && sq8.m48644c(this.orderId, paymentDataInfo.orderId) && sq8.m48644c(this.order, paymentDataInfo.order) && sq8.m48644c(this.paymentLinkId, paymentDataInfo.paymentLinkId) && sq8.m48644c(this.paymentLink, paymentDataInfo.paymentLink) && sq8.m48644c(this.paymentLinkUrl, paymentDataInfo.paymentLinkUrl) && sq8.m48644c(this.amount, paymentDataInfo.amount) && sq8.m48644c(this.amountPaid, paymentDataInfo.amountPaid) && sq8.m48644c(this.currency, paymentDataInfo.currency) && sq8.m48644c(this.status, paymentDataInfo.status) && sq8.m48644c(this.note, paymentDataInfo.note) && sq8.m48644c(this.finalPaymentDate, paymentDataInfo.finalPaymentDate) && sq8.m48644c(this.createdById, paymentDataInfo.createdById) && sq8.m48644c(this.updatedById, paymentDataInfo.updatedById) && this.showSelection == paymentDataInfo.showSelection && this.isSelected == paymentDataInfo.isSelected && this.showBottom == paymentDataInfo.showBottom && sq8.m48644c(this.parentEngagementId, paymentDataInfo.parentEngagementId) && sq8.m48644c(this.amountInput, paymentDataInfo.amountInput) && sq8.m48644c(this.updatedAt, paymentDataInfo.updatedAt) && sq8.m48644c(this.createdAt, paymentDataInfo.createdAt);
    }

    public final String getAccountId() {
        return this.accountId;
    }

    public final Integer getAmount() {
        return this.amount;
    }

    public final Double getAmountInput() {
        return this.amountInput;
    }

    public final Integer getAmountPaid() {
        return this.amountPaid;
    }

    public final Leads getContact() {
        return this.contact;
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

    public final String getEngagementId() {
        return this.engagementId;
    }

    public final Long getFinalPaymentDate() {
        return this.finalPaymentDate;
    }

    public final String getId() {
        return this.id;
    }

    public final String getNote() {
        return this.note;
    }

    public final PaymentOrderInfo getOrder() {
        return this.order;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getOrderIdInPaymentProvider() {
        return this.orderIdInPaymentProvider;
    }

    public final String getParentEngagementId() {
        return this.parentEngagementId;
    }

    public final PaymentLinkInfo getPaymentLink() {
        return this.paymentLink;
    }

    public final String getPaymentLinkId() {
        return this.paymentLinkId;
    }

    public final String getPaymentLinkUrl() {
        return this.paymentLinkUrl;
    }

    public final String getPaymentProvider() {
        return this.paymentProvider;
    }

    public final boolean getShowBottom() {
        return this.showBottom;
    }

    public final boolean getShowSelection() {
        return this.showSelection;
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

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.accountId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Leads leads = this.contact;
        int iHashCode3 = (iHashCode2 + (leads == null ? 0 : leads.hashCode())) * 31;
        String str3 = this.engagementId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.paymentProvider;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.orderIdInPaymentProvider;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.orderId;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        PaymentOrderInfo paymentOrderInfo = this.order;
        int iHashCode8 = (iHashCode7 + (paymentOrderInfo == null ? 0 : paymentOrderInfo.hashCode())) * 31;
        String str7 = this.paymentLinkId;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        PaymentLinkInfo paymentLinkInfo = this.paymentLink;
        int iHashCode10 = (iHashCode9 + (paymentLinkInfo == null ? 0 : paymentLinkInfo.hashCode())) * 31;
        String str8 = this.paymentLinkUrl;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.amount;
        int iHashCode12 = (iHashCode11 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.amountPaid;
        int iHashCode13 = (iHashCode12 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str9 = this.currency;
        int iHashCode14 = (iHashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.status;
        int iHashCode15 = (iHashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.note;
        int iHashCode16 = (iHashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Long l = this.finalPaymentDate;
        int iHashCode17 = (iHashCode16 + (l == null ? 0 : l.hashCode())) * 31;
        String str12 = this.createdById;
        int iHashCode18 = (iHashCode17 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.updatedById;
        int iHashCode19 = (iHashCode18 + (str13 == null ? 0 : str13.hashCode())) * 31;
        boolean z = this.showSelection;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (iHashCode19 + i) * 31;
        boolean z2 = this.isSelected;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.showBottom;
        int i5 = (i4 + (z3 ? 1 : z3 ? 1 : 0)) * 31;
        String str14 = this.parentEngagementId;
        int iHashCode20 = (i5 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Double d = this.amountInput;
        int iHashCode21 = (iHashCode20 + (d == null ? 0 : d.hashCode())) * 31;
        Long l2 = this.updatedAt;
        int iHashCode22 = (iHashCode21 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.createdAt;
        return iHashCode22 + (l3 != null ? l3.hashCode() : 0);
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setAccountId(String str) {
        this.accountId = str;
    }

    public final void setAmount(Integer num) {
        this.amount = num;
    }

    public final void setAmountInput(Double d) {
        this.amountInput = d;
    }

    public final void setAmountPaid(Integer num) {
        this.amountPaid = num;
    }

    public final void setContact(Leads leads) {
        this.contact = leads;
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

    public final void setEngagementId(String str) {
        this.engagementId = str;
    }

    public final void setFinalPaymentDate(Long l) {
        this.finalPaymentDate = l;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setNote(String str) {
        this.note = str;
    }

    public final void setOrder(PaymentOrderInfo paymentOrderInfo) {
        this.order = paymentOrderInfo;
    }

    public final void setOrderId(String str) {
        this.orderId = str;
    }

    public final void setOrderIdInPaymentProvider(String str) {
        this.orderIdInPaymentProvider = str;
    }

    public final void setParentEngagementId(String str) {
        this.parentEngagementId = str;
    }

    public final void setPaymentLink(PaymentLinkInfo paymentLinkInfo) {
        this.paymentLink = paymentLinkInfo;
    }

    public final void setPaymentLinkId(String str) {
        this.paymentLinkId = str;
    }

    public final void setPaymentLinkUrl(String str) {
        this.paymentLinkUrl = str;
    }

    public final void setPaymentProvider(String str) {
        this.paymentProvider = str;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    public final void setShowBottom(boolean z) {
        this.showBottom = z;
    }

    public final void setShowSelection(boolean z) {
        this.showSelection = z;
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
    public final PaymentDataSummary toPaymentDataSummary() {
        PaymentDataSummary paymentDataSummary = new PaymentDataSummary(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        paymentDataSummary.setId(this.id);
        paymentDataSummary.setAccountId(this.accountId);
        paymentDataSummary.setAmount(this.amount);
        paymentDataSummary.setAmountPaid(this.amountPaid);
        Leads leads = this.contact;
        paymentDataSummary.setContact(leads != null ? th1.m49865q(leads, null, 1, null) : null);
        paymentDataSummary.setCreatedById(this.createdById);
        paymentDataSummary.setCurrency(this.currency);
        paymentDataSummary.setFinalPaymentDate(this.finalPaymentDate);
        paymentDataSummary.setEngagementId(this.engagementId);
        PaymentOrderInfo paymentOrderInfo = this.order;
        paymentDataSummary.setOrder(paymentOrderInfo != null ? paymentOrderInfo.toPaymentOrderSummary() : null);
        paymentDataSummary.setOrderIdInPaymentProvider(this.orderIdInPaymentProvider);
        PaymentLinkInfo paymentLinkInfo = this.paymentLink;
        paymentDataSummary.setPaymentLink(paymentLinkInfo != null ? paymentLinkInfo.toPaymentLinkSummary() : null);
        paymentDataSummary.setPaymentLinkId(this.paymentLinkId);
        paymentDataSummary.setPaymentLinkUrl(this.paymentLinkUrl);
        paymentDataSummary.setPaymentProvider(this.paymentProvider);
        paymentDataSummary.setOrderId(this.orderId);
        paymentDataSummary.setStatus(this.status);
        paymentDataSummary.setNote(this.note);
        paymentDataSummary.setUpdatedById(this.updatedById);
        paymentDataSummary.setAmountInput(this.amountInput);
        paymentDataSummary.setUpdatedAt(getUpdatedAt());
        paymentDataSummary.setCreatedAt(getCreatedAt());
        return paymentDataSummary;
    }

    public String toString() {
        return "PaymentDataInfo(id=" + this.id + ", accountId=" + this.accountId + ", contact=" + this.contact + ", engagementId=" + this.engagementId + ", paymentProvider=" + this.paymentProvider + ", orderIdInPaymentProvider=" + this.orderIdInPaymentProvider + ", orderId=" + this.orderId + ", order=" + this.order + ", paymentLinkId=" + this.paymentLinkId + ", paymentLink=" + this.paymentLink + ", paymentLinkUrl=" + this.paymentLinkUrl + ", amount=" + this.amount + ", amountPaid=" + this.amountPaid + ", currency=" + this.currency + ", status=" + this.status + ", note=" + this.note + ", finalPaymentDate=" + this.finalPaymentDate + ", createdById=" + this.createdById + ", updatedById=" + this.updatedById + ", showSelection=" + this.showSelection + ", isSelected=" + this.isSelected + ", showBottom=" + this.showBottom + ", parentEngagementId=" + this.parentEngagementId + ", amountInput=" + this.amountInput + ", updatedAt=" + this.updatedAt + ", createdAt=" + this.createdAt + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.accountId);
        Leads leads = this.contact;
        if (leads == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            leads.writeToParcel(parcel, i);
        }
        parcel.writeString(this.engagementId);
        parcel.writeString(this.paymentProvider);
        parcel.writeString(this.orderIdInPaymentProvider);
        parcel.writeString(this.orderId);
        PaymentOrderInfo paymentOrderInfo = this.order;
        if (paymentOrderInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paymentOrderInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.paymentLinkId);
        PaymentLinkInfo paymentLinkInfo = this.paymentLink;
        if (paymentLinkInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paymentLinkInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.paymentLinkUrl);
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
        Long l = this.finalPaymentDate;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.createdById);
        parcel.writeString(this.updatedById);
        parcel.writeInt(this.showSelection ? 1 : 0);
        parcel.writeInt(this.isSelected ? 1 : 0);
        parcel.writeInt(this.showBottom ? 1 : 0);
        parcel.writeString(this.parentEngagementId);
        Double d = this.amountInput;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        Long l2 = this.updatedAt;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        Long l3 = this.createdAt;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l3.longValue());
        }
    }

    public /* synthetic */ PaymentDataInfo(String str, String str2, Leads leads, String str3, String str4, String str5, String str6, PaymentOrderInfo paymentOrderInfo, String str7, PaymentLinkInfo paymentLinkInfo, String str8, Integer num, Integer num2, String str9, String str10, String str11, Long l, String str12, String str13, boolean z, boolean z2, boolean z3, String str14, Double d, Long l2, Long l3, int i, id5 id5Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) == 0 ? str2 : "", (i & 4) != 0 ? null : leads, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : paymentOrderInfo, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : paymentLinkInfo, (i & 1024) != 0 ? null : str8, (i & 2048) != 0 ? null : num, (i & 4096) != 0 ? null : num2, (i & 8192) != 0 ? null : str9, (i & Opcodes.ACC_ENUM) != 0 ? null : str10, (i & 32768) != 0 ? null : str11, (i & 65536) != 0 ? null : l, (i & Opcodes.ACC_DEPRECATED) != 0 ? null : str12, (i & 262144) != 0 ? null : str13, (i & Opcodes.ASM8) != 0 ? false : z, (i & 1048576) != 0 ? false : z2, (i & 2097152) == 0 ? z3 : false, (i & 4194304) != 0 ? null : str14, (i & 8388608) != 0 ? null : d, (i & 16777216) != 0 ? null : l2, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : l3);
    }

    public PaymentDataInfo(String str, String str2, Leads leads, String str3, String str4, String str5, String str6, PaymentOrderInfo paymentOrderInfo, String str7, PaymentLinkInfo paymentLinkInfo, String str8, Integer num, Integer num2, String str9, String str10, String str11, Long l, String str12, String str13, boolean z, boolean z2, boolean z3, String str14, Double d, Long l2, Long l3) {
        this.id = str;
        this.accountId = str2;
        this.contact = leads;
        this.engagementId = str3;
        this.paymentProvider = str4;
        this.orderIdInPaymentProvider = str5;
        this.orderId = str6;
        this.order = paymentOrderInfo;
        this.paymentLinkId = str7;
        this.paymentLink = paymentLinkInfo;
        this.paymentLinkUrl = str8;
        this.amount = num;
        this.amountPaid = num2;
        this.currency = str9;
        this.status = str10;
        this.note = str11;
        this.finalPaymentDate = l;
        this.createdById = str12;
        this.updatedById = str13;
        this.showSelection = z;
        this.isSelected = z2;
        this.showBottom = z3;
        this.parentEngagementId = str14;
        this.amountInput = d;
        this.updatedAt = l2;
        this.createdAt = l3;
    }
}
