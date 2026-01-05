package ai.salesmax.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import p001o.id5;
import p001o.sq8;
import p001o.yfe;

/* loaded from: classes.dex */
public final class CallOutcome extends yfe implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<CallOutcome> CREATOR = new Creator();
    private List<String> applicableTemplateIds;
    private boolean createNewDeal;
    private boolean createNewDealManual;
    private Integer displayOrder;
    private boolean isSelected;
    private String linkedFormId;
    private String nature;
    private String outcomeTitle;
    private String outcomeValue;

    public static final class Creator implements Parcelable.Creator<CallOutcome> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CallOutcome createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new CallOutcome(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0, parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CallOutcome[] newArray(int i) {
            return new CallOutcome[i];
        }
    }

    public CallOutcome() {
        this(null, null, null, null, false, false, null, false, null, 511, null);
    }

    public final String component1() {
        return this.outcomeTitle;
    }

    public final String component2() {
        return this.outcomeValue;
    }

    public final String component3() {
        return this.nature;
    }

    public final String component4() {
        return this.linkedFormId;
    }

    public final boolean component5() {
        return this.createNewDeal;
    }

    public final boolean component6() {
        return this.createNewDealManual;
    }

    public final Integer component7() {
        return this.displayOrder;
    }

    public final boolean component8() {
        return this.isSelected;
    }

    public final List<String> component9() {
        return this.applicableTemplateIds;
    }

    public final CallOutcome copy(String str, String str2, String str3, String str4, boolean z, boolean z2, Integer num, boolean z3, List<String> list) {
        sq8.m48649h(str, "outcomeTitle");
        sq8.m48649h(str2, "outcomeValue");
        sq8.m48649h(str3, "nature");
        sq8.m48649h(str4, "linkedFormId");
        return new CallOutcome(str, str2, str3, str4, z, z2, num, z3, list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallOutcome)) {
            return false;
        }
        CallOutcome callOutcome = (CallOutcome) obj;
        return sq8.m48644c(this.outcomeTitle, callOutcome.outcomeTitle) && sq8.m48644c(this.outcomeValue, callOutcome.outcomeValue) && sq8.m48644c(this.nature, callOutcome.nature) && sq8.m48644c(this.linkedFormId, callOutcome.linkedFormId) && this.createNewDeal == callOutcome.createNewDeal && this.createNewDealManual == callOutcome.createNewDealManual && sq8.m48644c(this.displayOrder, callOutcome.displayOrder) && this.isSelected == callOutcome.isSelected && sq8.m48644c(this.applicableTemplateIds, callOutcome.applicableTemplateIds);
    }

    public final List<String> getApplicableTemplateIds() {
        return this.applicableTemplateIds;
    }

    public final boolean getCreateNewDeal() {
        return this.createNewDeal;
    }

    public final boolean getCreateNewDealManual() {
        return this.createNewDealManual;
    }

    public final Integer getDisplayOrder() {
        return this.displayOrder;
    }

    public final String getLinkedFormId() {
        return this.linkedFormId;
    }

    public final String getNature() {
        return this.nature;
    }

    public final String getOutcomeTitle() {
        return this.outcomeTitle;
    }

    public final String getOutcomeValue() {
        return this.outcomeValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = ((((((this.outcomeTitle.hashCode() * 31) + this.outcomeValue.hashCode()) * 31) + this.nature.hashCode()) * 31) + this.linkedFormId.hashCode()) * 31;
        boolean z = this.createNewDeal;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (iHashCode + i) * 31;
        boolean z2 = this.createNewDealManual;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        Integer num = this.displayOrder;
        int iHashCode2 = (i4 + (num == null ? 0 : num.hashCode())) * 31;
        boolean z3 = this.isSelected;
        int i5 = (iHashCode2 + (z3 ? 1 : z3 ? 1 : 0)) * 31;
        List<String> list = this.applicableTemplateIds;
        return i5 + (list != null ? list.hashCode() : 0);
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setApplicableTemplateIds(List<String> list) {
        this.applicableTemplateIds = list;
    }

    public final void setCreateNewDeal(boolean z) {
        this.createNewDeal = z;
    }

    public final void setCreateNewDealManual(boolean z) {
        this.createNewDealManual = z;
    }

    public final void setDisplayOrder(Integer num) {
        this.displayOrder = num;
    }

    public final void setLinkedFormId(String str) {
        sq8.m48649h(str, "<set-?>");
        this.linkedFormId = str;
    }

    public final void setNature(String str) {
        sq8.m48649h(str, "<set-?>");
        this.nature = str;
    }

    public final void setOutcomeTitle(String str) {
        sq8.m48649h(str, "<set-?>");
        this.outcomeTitle = str;
    }

    public final void setOutcomeValue(String str) {
        sq8.m48649h(str, "<set-?>");
        this.outcomeValue = str;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    public String toString() {
        return "CallOutcome(outcomeTitle=" + this.outcomeTitle + ", outcomeValue=" + this.outcomeValue + ", nature=" + this.nature + ", linkedFormId=" + this.linkedFormId + ", createNewDeal=" + this.createNewDeal + ", createNewDealManual=" + this.createNewDealManual + ", displayOrder=" + this.displayOrder + ", isSelected=" + this.isSelected + ", applicableTemplateIds=" + this.applicableTemplateIds + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.outcomeTitle);
        parcel.writeString(this.outcomeValue);
        parcel.writeString(this.nature);
        parcel.writeString(this.linkedFormId);
        parcel.writeInt(this.createNewDeal ? 1 : 0);
        parcel.writeInt(this.createNewDealManual ? 1 : 0);
        Integer num = this.displayOrder;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeInt(this.isSelected ? 1 : 0);
        parcel.writeStringList(this.applicableTemplateIds);
    }

    public /* synthetic */ CallOutcome(String str, String str2, String str3, String str4, boolean z, boolean z2, Integer num, boolean z3, List list, int i, id5 id5Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) == 0 ? str4 : "", (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? null : num, (i & 128) == 0 ? z3 : false, (i & 256) != 0 ? new ArrayList() : list);
    }

    public CallOutcome(String str, String str2, String str3, String str4, boolean z, boolean z2, Integer num, boolean z3, List<String> list) {
        sq8.m48649h(str, "outcomeTitle");
        sq8.m48649h(str2, "outcomeValue");
        sq8.m48649h(str3, "nature");
        sq8.m48649h(str4, "linkedFormId");
        this.outcomeTitle = str;
        this.outcomeValue = str2;
        this.nature = str3;
        this.linkedFormId = str4;
        this.createNewDeal = z;
        this.createNewDealManual = z2;
        this.displayOrder = num;
        this.isSelected = z3;
        this.applicableTemplateIds = list;
    }
}
