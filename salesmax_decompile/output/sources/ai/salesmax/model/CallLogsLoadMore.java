package ai.salesmax.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class CallLogsLoadMore implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<CallLogsLoadMore> CREATOR = new Creator();
    private List<CallLogs> callLogs;
    private int count;

    public static final class Creator implements Parcelable.Creator<CallLogsLoadMore> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CallLogsLoadMore createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(CallLogs.CREATOR.createFromParcel(parcel));
            }
            return new CallLogsLoadMore(arrayList, parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CallLogsLoadMore[] newArray(int i) {
            return new CallLogsLoadMore[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CallLogsLoadMore() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CallLogsLoadMore copy$default(CallLogsLoadMore callLogsLoadMore, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = callLogsLoadMore.callLogs;
        }
        if ((i2 & 2) != 0) {
            i = callLogsLoadMore.count;
        }
        return callLogsLoadMore.copy(list, i);
    }

    public final List<CallLogs> component1() {
        return this.callLogs;
    }

    public final int component2() {
        return this.count;
    }

    public final CallLogsLoadMore copy(List<CallLogs> list, int i) {
        sq8.m48649h(list, "callLogs");
        return new CallLogsLoadMore(list, i);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallLogsLoadMore)) {
            return false;
        }
        CallLogsLoadMore callLogsLoadMore = (CallLogsLoadMore) obj;
        return sq8.m48644c(this.callLogs, callLogsLoadMore.callLogs) && this.count == callLogsLoadMore.count;
    }

    public final List<CallLogs> getCallLogs() {
        return this.callLogs;
    }

    public final int getCount() {
        return this.count;
    }

    public int hashCode() {
        return (this.callLogs.hashCode() * 31) + Integer.hashCode(this.count);
    }

    public final void setCallLogs(List<CallLogs> list) {
        sq8.m48649h(list, "<set-?>");
        this.callLogs = list;
    }

    public final void setCount(int i) {
        this.count = i;
    }

    public String toString() {
        return "CallLogsLoadMore(callLogs=" + this.callLogs + ", count=" + this.count + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        List<CallLogs> list = this.callLogs;
        parcel.writeInt(list.size());
        Iterator<CallLogs> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.count);
    }

    public CallLogsLoadMore(List<CallLogs> list, int i) {
        sq8.m48649h(list, "callLogs");
        this.callLogs = list;
        this.count = i;
    }

    public /* synthetic */ CallLogsLoadMore(List list, int i, int i2, id5 id5Var) {
        this((i2 & 1) != 0 ? new ArrayList() : list, (i2 & 2) != 0 ? 0 : i);
    }
}
