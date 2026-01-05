package ai.salesmax.model;

import android.os.Parcel;
import android.os.Parcelable;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class SectionRow implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SectionRow> CREATOR = new Creator();
    private String sectionRowDescription;
    private String sectionRowId;
    private String sectionRowTitle;

    public static final class Creator implements Parcelable.Creator<SectionRow> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SectionRow createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new SectionRow(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SectionRow[] newArray(int i) {
            return new SectionRow[i];
        }
    }

    public SectionRow() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ SectionRow copy$default(SectionRow sectionRow, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sectionRow.sectionRowId;
        }
        if ((i & 2) != 0) {
            str2 = sectionRow.sectionRowTitle;
        }
        if ((i & 4) != 0) {
            str3 = sectionRow.sectionRowDescription;
        }
        return sectionRow.copy(str, str2, str3);
    }

    public final String component1() {
        return this.sectionRowId;
    }

    public final String component2() {
        return this.sectionRowTitle;
    }

    public final String component3() {
        return this.sectionRowDescription;
    }

    public final SectionRow copy(String str, String str2, String str3) {
        return new SectionRow(str, str2, str3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SectionRow)) {
            return false;
        }
        SectionRow sectionRow = (SectionRow) obj;
        return sq8.m48644c(this.sectionRowId, sectionRow.sectionRowId) && sq8.m48644c(this.sectionRowTitle, sectionRow.sectionRowTitle) && sq8.m48644c(this.sectionRowDescription, sectionRow.sectionRowDescription);
    }

    public final String getSectionRowDescription() {
        return this.sectionRowDescription;
    }

    public final String getSectionRowId() {
        return this.sectionRowId;
    }

    public final String getSectionRowTitle() {
        return this.sectionRowTitle;
    }

    public int hashCode() {
        String str = this.sectionRowId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sectionRowTitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sectionRowDescription;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setSectionRowDescription(String str) {
        this.sectionRowDescription = str;
    }

    public final void setSectionRowId(String str) {
        this.sectionRowId = str;
    }

    public final void setSectionRowTitle(String str) {
        this.sectionRowTitle = str;
    }

    public String toString() {
        return "SectionRow(sectionRowId=" + this.sectionRowId + ", sectionRowTitle=" + this.sectionRowTitle + ", sectionRowDescription=" + this.sectionRowDescription + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.sectionRowId);
        parcel.writeString(this.sectionRowTitle);
        parcel.writeString(this.sectionRowDescription);
    }

    public SectionRow(String str, String str2, String str3) {
        this.sectionRowId = str;
        this.sectionRowTitle = str2;
        this.sectionRowDescription = str3;
    }

    public /* synthetic */ SectionRow(String str, String str2, String str3, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
