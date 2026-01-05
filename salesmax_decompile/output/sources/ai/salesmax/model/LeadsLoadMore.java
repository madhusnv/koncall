package ai.salesmax.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class LeadsLoadMore implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<LeadsLoadMore> CREATOR = new Creator();
    private int count;
    private List<Leads> leads;

    public static final class Creator implements Parcelable.Creator<LeadsLoadMore> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LeadsLoadMore createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(Leads.CREATOR.createFromParcel(parcel));
            }
            return new LeadsLoadMore(arrayList, parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LeadsLoadMore[] newArray(int i) {
            return new LeadsLoadMore[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LeadsLoadMore() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LeadsLoadMore copy$default(LeadsLoadMore leadsLoadMore, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = leadsLoadMore.leads;
        }
        if ((i2 & 2) != 0) {
            i = leadsLoadMore.count;
        }
        return leadsLoadMore.copy(list, i);
    }

    public final List<Leads> component1() {
        return this.leads;
    }

    public final int component2() {
        return this.count;
    }

    public final LeadsLoadMore copy(List<Leads> list, int i) {
        sq8.m48649h(list, "leads");
        return new LeadsLoadMore(list, i);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeadsLoadMore)) {
            return false;
        }
        LeadsLoadMore leadsLoadMore = (LeadsLoadMore) obj;
        return sq8.m48644c(this.leads, leadsLoadMore.leads) && this.count == leadsLoadMore.count;
    }

    public final int getCount() {
        return this.count;
    }

    public final List<Leads> getLeads() {
        return this.leads;
    }

    public int hashCode() {
        return (this.leads.hashCode() * 31) + Integer.hashCode(this.count);
    }

    public final void setCount(int i) {
        this.count = i;
    }

    public final void setLeads(List<Leads> list) {
        sq8.m48649h(list, "<set-?>");
        this.leads = list;
    }

    public String toString() {
        return "LeadsLoadMore(leads=" + this.leads + ", count=" + this.count + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        List<Leads> list = this.leads;
        parcel.writeInt(list.size());
        Iterator<Leads> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.count);
    }

    public LeadsLoadMore(List<Leads> list, int i) {
        sq8.m48649h(list, "leads");
        this.leads = list;
        this.count = i;
    }

    public /* synthetic */ LeadsLoadMore(List list, int i, int i2, id5 id5Var) {
        this((i2 & 1) != 0 ? new ArrayList() : list, (i2 & 2) != 0 ? 0 : i);
    }
}
