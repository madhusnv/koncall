package ai.salesmax.model;

import android.os.Parcel;
import android.os.Parcelable;
import org.objectweb.asm.Opcodes;
import p001o.id5;
import p001o.sq8;
import p001o.yfe;

/* loaded from: classes.dex */
public final class VisitOutcome extends yfe implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<VisitOutcome> CREATOR = new Creator();
    private boolean createNewDeal;
    private boolean createNewDealManual;
    private Integer displayOrder;
    private boolean isSelected;
    private String linkedFormId;
    private String nature;
    private String outcomeTitle;

    public static final class Creator implements Parcelable.Creator<VisitOutcome> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VisitOutcome createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new VisitOutcome(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VisitOutcome[] newArray(int i) {
            return new VisitOutcome[i];
        }
    }

    public VisitOutcome() {
        this(null, null, null, false, false, null, false, Opcodes.LAND, null);
    }

    public static /* synthetic */ VisitOutcome copy$default(VisitOutcome visitOutcome, String str, String str2, String str3, boolean z, boolean z2, Integer num, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = visitOutcome.outcomeTitle;
        }
        if ((i & 2) != 0) {
            str2 = visitOutcome.nature;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = visitOutcome.linkedFormId;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            z = visitOutcome.createNewDeal;
        }
        boolean z4 = z;
        if ((i & 16) != 0) {
            z2 = visitOutcome.createNewDealManual;
        }
        boolean z5 = z2;
        if ((i & 32) != 0) {
            num = visitOutcome.displayOrder;
        }
        Integer num2 = num;
        if ((i & 64) != 0) {
            z3 = visitOutcome.isSelected;
        }
        return visitOutcome.copy(str, str4, str5, z4, z5, num2, z3);
    }

    public final String component1() {
        return this.outcomeTitle;
    }

    public final String component2() {
        return this.nature;
    }

    public final String component3() {
        return this.linkedFormId;
    }

    public final boolean component4() {
        return this.createNewDeal;
    }

    public final boolean component5() {
        return this.createNewDealManual;
    }

    public final Integer component6() {
        return this.displayOrder;
    }

    public final boolean component7() {
        return this.isSelected;
    }

    public final VisitOutcome copy(String str, String str2, String str3, boolean z, boolean z2, Integer num, boolean z3) {
        sq8.m48649h(str, "outcomeTitle");
        sq8.m48649h(str2, "nature");
        sq8.m48649h(str3, "linkedFormId");
        return new VisitOutcome(str, str2, str3, z, z2, num, z3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisitOutcome)) {
            return false;
        }
        VisitOutcome visitOutcome = (VisitOutcome) obj;
        return sq8.m48644c(this.outcomeTitle, visitOutcome.outcomeTitle) && sq8.m48644c(this.nature, visitOutcome.nature) && sq8.m48644c(this.linkedFormId, visitOutcome.linkedFormId) && this.createNewDeal == visitOutcome.createNewDeal && this.createNewDealManual == visitOutcome.createNewDealManual && sq8.m48644c(this.displayOrder, visitOutcome.displayOrder) && this.isSelected == visitOutcome.isSelected;
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

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = ((((this.outcomeTitle.hashCode() * 31) + this.nature.hashCode()) * 31) + this.linkedFormId.hashCode()) * 31;
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
        return iHashCode2 + (z3 ? 1 : z3 ? 1 : 0);
    }

    public final boolean isSelected() {
        return this.isSelected;
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

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    public String toString() {
        return "VisitOutcome(outcomeTitle=" + this.outcomeTitle + ", nature=" + this.nature + ", linkedFormId=" + this.linkedFormId + ", createNewDeal=" + this.createNewDeal + ", createNewDealManual=" + this.createNewDealManual + ", displayOrder=" + this.displayOrder + ", isSelected=" + this.isSelected + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.outcomeTitle);
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
    }

    public /* synthetic */ VisitOutcome(String str, String str2, String str3, boolean z, boolean z2, Integer num, boolean z3, int i, id5 id5Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) == 0 ? str3 : "", (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? null : num, (i & 64) != 0 ? false : z3);
    }

    public VisitOutcome(String str, String str2, String str3, boolean z, boolean z2, Integer num, boolean z3) {
        sq8.m48649h(str, "outcomeTitle");
        sq8.m48649h(str2, "nature");
        sq8.m48649h(str3, "linkedFormId");
        this.outcomeTitle = str;
        this.nature = str2;
        this.linkedFormId = str3;
        this.createNewDeal = z;
        this.createNewDealManual = z2;
        this.displayOrder = num;
        this.isSelected = z3;
    }
}
