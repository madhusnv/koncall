package ai.salesmax.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.perf.util.Constants;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class AssignmentOutcome implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<AssignmentOutcome> CREATOR = new Creator();
    private boolean assignChats;
    private boolean assignOpenDeals;
    private boolean assignOpenTasks;
    private String assignedDistributionId;
    private String assignedTeamId;
    private String assignedUserId;
    private String assignmentType;
    private boolean transferLead;

    public static final class Creator implements Parcelable.Creator<AssignmentOutcome> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssignmentOutcome createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new AssignmentOutcome(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssignmentOutcome[] newArray(int i) {
            return new AssignmentOutcome[i];
        }
    }

    public AssignmentOutcome() {
        this(null, null, null, null, false, false, false, false, Constants.MAX_HOST_LENGTH, null);
    }

    public final String component1() {
        return this.assignmentType;
    }

    public final String component2() {
        return this.assignedUserId;
    }

    public final String component3() {
        return this.assignedTeamId;
    }

    public final String component4() {
        return this.assignedDistributionId;
    }

    public final boolean component5() {
        return this.assignOpenTasks;
    }

    public final boolean component6() {
        return this.assignOpenDeals;
    }

    public final boolean component7() {
        return this.assignChats;
    }

    public final boolean component8() {
        return this.transferLead;
    }

    public final AssignmentOutcome copy(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        return new AssignmentOutcome(str, str2, str3, str4, z, z2, z3, z4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssignmentOutcome)) {
            return false;
        }
        AssignmentOutcome assignmentOutcome = (AssignmentOutcome) obj;
        return sq8.m48644c(this.assignmentType, assignmentOutcome.assignmentType) && sq8.m48644c(this.assignedUserId, assignmentOutcome.assignedUserId) && sq8.m48644c(this.assignedTeamId, assignmentOutcome.assignedTeamId) && sq8.m48644c(this.assignedDistributionId, assignmentOutcome.assignedDistributionId) && this.assignOpenTasks == assignmentOutcome.assignOpenTasks && this.assignOpenDeals == assignmentOutcome.assignOpenDeals && this.assignChats == assignmentOutcome.assignChats && this.transferLead == assignmentOutcome.transferLead;
    }

    public final boolean getAssignChats() {
        return this.assignChats;
    }

    public final boolean getAssignOpenDeals() {
        return this.assignOpenDeals;
    }

    public final boolean getAssignOpenTasks() {
        return this.assignOpenTasks;
    }

    public final String getAssignedDistributionId() {
        return this.assignedDistributionId;
    }

    public final String getAssignedTeamId() {
        return this.assignedTeamId;
    }

    public final String getAssignedUserId() {
        return this.assignedUserId;
    }

    public final String getAssignmentType() {
        return this.assignmentType;
    }

    public final boolean getTransferLead() {
        return this.transferLead;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.assignmentType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.assignedUserId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.assignedTeamId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.assignedDistributionId;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        boolean z = this.assignOpenTasks;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (iHashCode4 + i) * 31;
        boolean z2 = this.assignOpenDeals;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.assignChats;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        boolean z4 = this.transferLead;
        return i6 + (z4 ? 1 : z4 ? 1 : 0);
    }

    public final void setAssignChats(boolean z) {
        this.assignChats = z;
    }

    public final void setAssignOpenDeals(boolean z) {
        this.assignOpenDeals = z;
    }

    public final void setAssignOpenTasks(boolean z) {
        this.assignOpenTasks = z;
    }

    public final void setAssignedDistributionId(String str) {
        this.assignedDistributionId = str;
    }

    public final void setAssignedTeamId(String str) {
        this.assignedTeamId = str;
    }

    public final void setAssignedUserId(String str) {
        this.assignedUserId = str;
    }

    public final void setAssignmentType(String str) {
        this.assignmentType = str;
    }

    public final void setTransferLead(boolean z) {
        this.transferLead = z;
    }

    public String toString() {
        return "AssignmentOutcome(assignmentType=" + this.assignmentType + ", assignedUserId=" + this.assignedUserId + ", assignedTeamId=" + this.assignedTeamId + ", assignedDistributionId=" + this.assignedDistributionId + ", assignOpenTasks=" + this.assignOpenTasks + ", assignOpenDeals=" + this.assignOpenDeals + ", assignChats=" + this.assignChats + ", transferLead=" + this.transferLead + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.assignmentType);
        parcel.writeString(this.assignedUserId);
        parcel.writeString(this.assignedTeamId);
        parcel.writeString(this.assignedDistributionId);
        parcel.writeInt(this.assignOpenTasks ? 1 : 0);
        parcel.writeInt(this.assignOpenDeals ? 1 : 0);
        parcel.writeInt(this.assignChats ? 1 : 0);
        parcel.writeInt(this.transferLead ? 1 : 0);
    }

    public AssignmentOutcome(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.assignmentType = str;
        this.assignedUserId = str2;
        this.assignedTeamId = str3;
        this.assignedDistributionId = str4;
        this.assignOpenTasks = z;
        this.assignOpenDeals = z2;
        this.assignChats = z3;
        this.transferLead = z4;
    }

    public /* synthetic */ AssignmentOutcome(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) == 0 ? str4 : null, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? false : z3, (i & 128) == 0 ? z4 : false);
    }
}
