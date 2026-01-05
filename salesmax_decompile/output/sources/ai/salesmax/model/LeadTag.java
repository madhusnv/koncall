package ai.salesmax.model;

import android.os.Parcel;
import android.os.Parcelable;
import p001o.id5;
import p001o.sq8;
import p001o.yfe;

/* loaded from: classes.dex */
public final class LeadTag extends yfe implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<LeadTag> CREATOR = new Creator();
    private boolean isSelected;
    private String outcomeTitle;
    private String outcomeValue;

    public static final class Creator implements Parcelable.Creator<LeadTag> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LeadTag createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new LeadTag(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LeadTag[] newArray(int i) {
            return new LeadTag[i];
        }
    }

    public LeadTag() {
        this(null, null, false, 7, null);
    }

    public static /* synthetic */ LeadTag copy$default(LeadTag leadTag, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = leadTag.outcomeTitle;
        }
        if ((i & 2) != 0) {
            str2 = leadTag.outcomeValue;
        }
        if ((i & 4) != 0) {
            z = leadTag.isSelected;
        }
        return leadTag.copy(str, str2, z);
    }

    public final String component1() {
        return this.outcomeTitle;
    }

    public final String component2() {
        return this.outcomeValue;
    }

    public final boolean component3() {
        return this.isSelected;
    }

    public final LeadTag copy(String str, String str2, boolean z) {
        sq8.m48649h(str, "outcomeTitle");
        sq8.m48649h(str2, "outcomeValue");
        return new LeadTag(str, str2, z);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeadTag)) {
            return false;
        }
        LeadTag leadTag = (LeadTag) obj;
        return sq8.m48644c(this.outcomeTitle, leadTag.outcomeTitle) && sq8.m48644c(this.outcomeValue, leadTag.outcomeValue) && this.isSelected == leadTag.isSelected;
    }

    public final String getOutcomeTitle() {
        return this.outcomeTitle;
    }

    public final String getOutcomeValue() {
        return this.outcomeValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = ((this.outcomeTitle.hashCode() * 31) + this.outcomeValue.hashCode()) * 31;
        boolean z = this.isSelected;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iHashCode + i;
    }

    public final boolean isSelected() {
        return this.isSelected;
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
        return "LeadTag(outcomeTitle=" + this.outcomeTitle + ", outcomeValue=" + this.outcomeValue + ", isSelected=" + this.isSelected + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.outcomeTitle);
        parcel.writeString(this.outcomeValue);
        parcel.writeInt(this.isSelected ? 1 : 0);
    }

    public /* synthetic */ LeadTag(String str, String str2, boolean z, int i, id5 id5Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z);
    }

    public LeadTag(String str, String str2, boolean z) {
        sq8.m48649h(str, "outcomeTitle");
        sq8.m48649h(str2, "outcomeValue");
        this.outcomeTitle = str;
        this.outcomeValue = str2;
        this.isSelected = z;
    }
}
