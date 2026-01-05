package ai.salesmax.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class SectionInteractive implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SectionInteractive> CREATOR = new Creator();
    private List<ProductWa> sectionProductItems;
    private List<SectionRow> sectionRows;
    private String sectionTitle;

    public static final class Creator implements Parcelable.Creator<SectionInteractive> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SectionInteractive createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(ProductWa.CREATOR.createFromParcel(parcel));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(SectionRow.CREATOR.createFromParcel(parcel));
            }
            return new SectionInteractive(arrayList, arrayList2, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SectionInteractive[] newArray(int i) {
            return new SectionInteractive[i];
        }
    }

    public SectionInteractive() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SectionInteractive copy$default(SectionInteractive sectionInteractive, List list, List list2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = sectionInteractive.sectionProductItems;
        }
        if ((i & 2) != 0) {
            list2 = sectionInteractive.sectionRows;
        }
        if ((i & 4) != 0) {
            str = sectionInteractive.sectionTitle;
        }
        return sectionInteractive.copy(list, list2, str);
    }

    public final List<ProductWa> component1() {
        return this.sectionProductItems;
    }

    public final List<SectionRow> component2() {
        return this.sectionRows;
    }

    public final String component3() {
        return this.sectionTitle;
    }

    public final SectionInteractive copy(List<ProductWa> list, List<SectionRow> list2, String str) {
        sq8.m48649h(list, "sectionProductItems");
        sq8.m48649h(list2, "sectionRows");
        return new SectionInteractive(list, list2, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SectionInteractive)) {
            return false;
        }
        SectionInteractive sectionInteractive = (SectionInteractive) obj;
        return sq8.m48644c(this.sectionProductItems, sectionInteractive.sectionProductItems) && sq8.m48644c(this.sectionRows, sectionInteractive.sectionRows) && sq8.m48644c(this.sectionTitle, sectionInteractive.sectionTitle);
    }

    public final List<ProductWa> getSectionProductItems() {
        return this.sectionProductItems;
    }

    public final List<SectionRow> getSectionRows() {
        return this.sectionRows;
    }

    public final String getSectionTitle() {
        return this.sectionTitle;
    }

    public int hashCode() {
        int iHashCode = ((this.sectionProductItems.hashCode() * 31) + this.sectionRows.hashCode()) * 31;
        String str = this.sectionTitle;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final void setSectionProductItems(List<ProductWa> list) {
        sq8.m48649h(list, "<set-?>");
        this.sectionProductItems = list;
    }

    public final void setSectionRows(List<SectionRow> list) {
        sq8.m48649h(list, "<set-?>");
        this.sectionRows = list;
    }

    public final void setSectionTitle(String str) {
        this.sectionTitle = str;
    }

    public String toString() {
        return "SectionInteractive(sectionProductItems=" + this.sectionProductItems + ", sectionRows=" + this.sectionRows + ", sectionTitle=" + this.sectionTitle + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        List<ProductWa> list = this.sectionProductItems;
        parcel.writeInt(list.size());
        Iterator<ProductWa> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        List<SectionRow> list2 = this.sectionRows;
        parcel.writeInt(list2.size());
        Iterator<SectionRow> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.sectionTitle);
    }

    public SectionInteractive(List<ProductWa> list, List<SectionRow> list2, String str) {
        sq8.m48649h(list, "sectionProductItems");
        sq8.m48649h(list2, "sectionRows");
        this.sectionProductItems = list;
        this.sectionRows = list2;
        this.sectionTitle = str;
    }

    public /* synthetic */ SectionInteractive(List list, List list2, String str, int i, id5 id5Var) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? new ArrayList() : list2, (i & 4) != 0 ? null : str);
    }
}
