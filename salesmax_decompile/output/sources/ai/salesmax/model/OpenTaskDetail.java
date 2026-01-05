package ai.salesmax.model;

import android.os.Parcel;
import android.os.Parcelable;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class OpenTaskDetail implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<OpenTaskDetail> CREATOR = new Creator();
    private String dueDate;
    private String id;
    private String taskType;

    public static final class Creator implements Parcelable.Creator<OpenTaskDetail> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OpenTaskDetail createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new OpenTaskDetail(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OpenTaskDetail[] newArray(int i) {
            return new OpenTaskDetail[i];
        }
    }

    public OpenTaskDetail() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ OpenTaskDetail copy$default(OpenTaskDetail openTaskDetail, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = openTaskDetail.id;
        }
        if ((i & 2) != 0) {
            str2 = openTaskDetail.taskType;
        }
        if ((i & 4) != 0) {
            str3 = openTaskDetail.dueDate;
        }
        return openTaskDetail.copy(str, str2, str3);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.taskType;
    }

    public final String component3() {
        return this.dueDate;
    }

    public final OpenTaskDetail copy(String str, String str2, String str3) {
        return new OpenTaskDetail(str, str2, str3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenTaskDetail)) {
            return false;
        }
        OpenTaskDetail openTaskDetail = (OpenTaskDetail) obj;
        return sq8.m48644c(this.id, openTaskDetail.id) && sq8.m48644c(this.taskType, openTaskDetail.taskType) && sq8.m48644c(this.dueDate, openTaskDetail.dueDate);
    }

    public final String getDueDate() {
        return this.dueDate;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTaskType() {
        return this.taskType;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.taskType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.dueDate;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setDueDate(String str) {
        this.dueDate = str;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setTaskType(String str) {
        this.taskType = str;
    }

    public String toString() {
        return "OpenTaskDetail(id=" + this.id + ", taskType=" + this.taskType + ", dueDate=" + this.dueDate + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.taskType);
        parcel.writeString(this.dueDate);
    }

    public OpenTaskDetail(String str, String str2, String str3) {
        this.id = str;
        this.taskType = str2;
        this.dueDate = str3;
    }

    public /* synthetic */ OpenTaskDetail(String str, String str2, String str3, int i, id5 id5Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
