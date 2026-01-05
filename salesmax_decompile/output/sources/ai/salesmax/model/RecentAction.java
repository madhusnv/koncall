package ai.salesmax.model;

import android.os.Parcel;
import android.os.Parcelable;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class RecentAction implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<RecentAction> CREATOR = new Creator();
    private String callConnectStatus;
    private String callDirection;
    private String createdAt;
    private String engagementType;

    public static final class Creator implements Parcelable.Creator<RecentAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecentAction createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new RecentAction(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecentAction[] newArray(int i) {
            return new RecentAction[i];
        }
    }

    public RecentAction() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ RecentAction copy$default(RecentAction recentAction, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recentAction.engagementType;
        }
        if ((i & 2) != 0) {
            str2 = recentAction.callDirection;
        }
        if ((i & 4) != 0) {
            str3 = recentAction.callConnectStatus;
        }
        if ((i & 8) != 0) {
            str4 = recentAction.createdAt;
        }
        return recentAction.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.engagementType;
    }

    public final String component2() {
        return this.callDirection;
    }

    public final String component3() {
        return this.callConnectStatus;
    }

    public final String component4() {
        return this.createdAt;
    }

    public final RecentAction copy(String str, String str2, String str3, String str4) {
        sq8.m48649h(str, "engagementType");
        sq8.m48649h(str2, "callDirection");
        sq8.m48649h(str3, "callConnectStatus");
        return new RecentAction(str, str2, str3, str4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecentAction)) {
            return false;
        }
        RecentAction recentAction = (RecentAction) obj;
        return sq8.m48644c(this.engagementType, recentAction.engagementType) && sq8.m48644c(this.callDirection, recentAction.callDirection) && sq8.m48644c(this.callConnectStatus, recentAction.callConnectStatus) && sq8.m48644c(this.createdAt, recentAction.createdAt);
    }

    public final String getCallConnectStatus() {
        return this.callConnectStatus;
    }

    public final String getCallDirection() {
        return this.callDirection;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getEngagementType() {
        return this.engagementType;
    }

    public int hashCode() {
        int iHashCode = ((((this.engagementType.hashCode() * 31) + this.callDirection.hashCode()) * 31) + this.callConnectStatus.hashCode()) * 31;
        String str = this.createdAt;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final void setCallConnectStatus(String str) {
        sq8.m48649h(str, "<set-?>");
        this.callConnectStatus = str;
    }

    public final void setCallDirection(String str) {
        sq8.m48649h(str, "<set-?>");
        this.callDirection = str;
    }

    public final void setCreatedAt(String str) {
        this.createdAt = str;
    }

    public final void setEngagementType(String str) {
        sq8.m48649h(str, "<set-?>");
        this.engagementType = str;
    }

    public String toString() {
        return "RecentAction(engagementType=" + this.engagementType + ", callDirection=" + this.callDirection + ", callConnectStatus=" + this.callConnectStatus + ", createdAt=" + this.createdAt + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.engagementType);
        parcel.writeString(this.callDirection);
        parcel.writeString(this.callConnectStatus);
        parcel.writeString(this.createdAt);
    }

    public RecentAction(String str, String str2, String str3, String str4) {
        sq8.m48649h(str, "engagementType");
        sq8.m48649h(str2, "callDirection");
        sq8.m48649h(str3, "callConnectStatus");
        this.engagementType = str;
        this.callDirection = str2;
        this.callConnectStatus = str3;
        this.createdAt = str4;
    }

    public /* synthetic */ RecentAction(String str, String str2, String str3, String str4, int i, id5 id5Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : str4);
    }
}
