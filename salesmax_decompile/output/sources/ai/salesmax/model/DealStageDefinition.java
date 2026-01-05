package ai.salesmax.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaTrack;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.ArrayList;
import java.util.List;
import p001o.id5;
import p001o.sq8;
import p001o.yfe;

/* loaded from: classes.dex */
public final class DealStageDefinition extends yfe implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<DealStageDefinition> CREATOR = new Creator();
    private List<String> createIfTaskCompletedInFailure;
    private List<String> createIfTaskCompletedSuccessfully;
    private boolean currentlySelectedLost;
    private boolean currentlySelectedWin;
    private String dealPipelineName;
    private int defaultColor;
    private int defaultDisplayOrder;
    private String description;
    private String id;
    private boolean isTerminalStateInFailure;
    private boolean isTerminalStateInSuccess;
    private String name;
    private boolean selected;

    public static final class Creator implements Parcelable.Creator<DealStageDefinition> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DealStageDefinition createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new DealStageDefinition(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DealStageDefinition[] newArray(int i) {
            return new DealStageDefinition[i];
        }
    }

    public DealStageDefinition() {
        this(null, null, null, null, 0, false, false, null, null, 0, false, false, false, 8191, null);
    }

    public final String component1() {
        return this.id;
    }

    public final int component10() {
        return this.defaultDisplayOrder;
    }

    public final boolean component11() {
        return this.selected;
    }

    public final boolean component12() {
        return this.currentlySelectedWin;
    }

    public final boolean component13() {
        return this.currentlySelectedLost;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.dealPipelineName;
    }

    public final int component5() {
        return this.defaultColor;
    }

    public final boolean component6() {
        return this.isTerminalStateInSuccess;
    }

    public final boolean component7() {
        return this.isTerminalStateInFailure;
    }

    public final List<String> component8() {
        return this.createIfTaskCompletedSuccessfully;
    }

    public final List<String> component9() {
        return this.createIfTaskCompletedInFailure;
    }

    public final DealStageDefinition copy(String str, String str2, String str3, String str4, int i, boolean z, boolean z2, List<String> list, List<String> list2, int i2, boolean z3, boolean z4, boolean z5) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        sq8.m48649h(str2, "name");
        sq8.m48649h(str3, MediaTrack.ROLE_DESCRIPTION);
        sq8.m48649h(str4, "dealPipelineName");
        sq8.m48649h(list, "createIfTaskCompletedSuccessfully");
        sq8.m48649h(list2, "createIfTaskCompletedInFailure");
        return new DealStageDefinition(str, str2, str3, str4, i, z, z2, list, list2, i2, z3, z4, z5);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DealStageDefinition)) {
            return false;
        }
        DealStageDefinition dealStageDefinition = (DealStageDefinition) obj;
        return sq8.m48644c(this.id, dealStageDefinition.id) && sq8.m48644c(this.name, dealStageDefinition.name) && sq8.m48644c(this.description, dealStageDefinition.description) && sq8.m48644c(this.dealPipelineName, dealStageDefinition.dealPipelineName) && this.defaultColor == dealStageDefinition.defaultColor && this.isTerminalStateInSuccess == dealStageDefinition.isTerminalStateInSuccess && this.isTerminalStateInFailure == dealStageDefinition.isTerminalStateInFailure && sq8.m48644c(this.createIfTaskCompletedSuccessfully, dealStageDefinition.createIfTaskCompletedSuccessfully) && sq8.m48644c(this.createIfTaskCompletedInFailure, dealStageDefinition.createIfTaskCompletedInFailure) && this.defaultDisplayOrder == dealStageDefinition.defaultDisplayOrder && this.selected == dealStageDefinition.selected && this.currentlySelectedWin == dealStageDefinition.currentlySelectedWin && this.currentlySelectedLost == dealStageDefinition.currentlySelectedLost;
    }

    public final List<String> getCreateIfTaskCompletedInFailure() {
        return this.createIfTaskCompletedInFailure;
    }

    public final List<String> getCreateIfTaskCompletedSuccessfully() {
        return this.createIfTaskCompletedSuccessfully;
    }

    public final boolean getCurrentlySelectedLost() {
        return this.currentlySelectedLost;
    }

    public final boolean getCurrentlySelectedWin() {
        return this.currentlySelectedWin;
    }

    public final String getDealPipelineName() {
        return this.dealPipelineName;
    }

    public final int getDefaultColor() {
        return this.defaultColor;
    }

    public final int getDefaultDisplayOrder() {
        return this.defaultDisplayOrder;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = ((((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.description.hashCode()) * 31) + this.dealPipelineName.hashCode()) * 31) + Integer.hashCode(this.defaultColor)) * 31;
        boolean z = this.isTerminalStateInSuccess;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (iHashCode + i) * 31;
        boolean z2 = this.isTerminalStateInFailure;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int iHashCode2 = (((((((i2 + i3) * 31) + this.createIfTaskCompletedSuccessfully.hashCode()) * 31) + this.createIfTaskCompletedInFailure.hashCode()) * 31) + Integer.hashCode(this.defaultDisplayOrder)) * 31;
        boolean z3 = this.selected;
        int i4 = z3;
        if (z3 != 0) {
            i4 = 1;
        }
        int i5 = (iHashCode2 + i4) * 31;
        boolean z4 = this.currentlySelectedWin;
        int i6 = z4;
        if (z4 != 0) {
            i6 = 1;
        }
        int i7 = (i5 + i6) * 31;
        boolean z5 = this.currentlySelectedLost;
        return i7 + (z5 ? 1 : z5 ? 1 : 0);
    }

    public final boolean isTerminalStateInFailure() {
        return this.isTerminalStateInFailure;
    }

    public final boolean isTerminalStateInSuccess() {
        return this.isTerminalStateInSuccess;
    }

    public final void setCreateIfTaskCompletedInFailure(List<String> list) {
        sq8.m48649h(list, "<set-?>");
        this.createIfTaskCompletedInFailure = list;
    }

    public final void setCreateIfTaskCompletedSuccessfully(List<String> list) {
        sq8.m48649h(list, "<set-?>");
        this.createIfTaskCompletedSuccessfully = list;
    }

    public final void setCurrentlySelectedLost(boolean z) {
        this.currentlySelectedLost = z;
    }

    public final void setCurrentlySelectedWin(boolean z) {
        this.currentlySelectedWin = z;
    }

    public final void setDealPipelineName(String str) {
        sq8.m48649h(str, "<set-?>");
        this.dealPipelineName = str;
    }

    public final void setDefaultColor(int i) {
        this.defaultColor = i;
    }

    public final void setDefaultDisplayOrder(int i) {
        this.defaultDisplayOrder = i;
    }

    public final void setDescription(String str) {
        sq8.m48649h(str, "<set-?>");
        this.description = str;
    }

    public final void setId(String str) {
        sq8.m48649h(str, "<set-?>");
        this.id = str;
    }

    public final void setName(String str) {
        sq8.m48649h(str, "<set-?>");
        this.name = str;
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }

    public final void setTerminalStateInFailure(boolean z) {
        this.isTerminalStateInFailure = z;
    }

    public final void setTerminalStateInSuccess(boolean z) {
        this.isTerminalStateInSuccess = z;
    }

    public String toString() {
        return "DealStageDefinition(id=" + this.id + ", name=" + this.name + ", description=" + this.description + ", dealPipelineName=" + this.dealPipelineName + ", defaultColor=" + this.defaultColor + ", isTerminalStateInSuccess=" + this.isTerminalStateInSuccess + ", isTerminalStateInFailure=" + this.isTerminalStateInFailure + ", createIfTaskCompletedSuccessfully=" + this.createIfTaskCompletedSuccessfully + ", createIfTaskCompletedInFailure=" + this.createIfTaskCompletedInFailure + ", defaultDisplayOrder=" + this.defaultDisplayOrder + ", selected=" + this.selected + ", currentlySelectedWin=" + this.currentlySelectedWin + ", currentlySelectedLost=" + this.currentlySelectedLost + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.description);
        parcel.writeString(this.dealPipelineName);
        parcel.writeInt(this.defaultColor);
        parcel.writeInt(this.isTerminalStateInSuccess ? 1 : 0);
        parcel.writeInt(this.isTerminalStateInFailure ? 1 : 0);
        parcel.writeStringList(this.createIfTaskCompletedSuccessfully);
        parcel.writeStringList(this.createIfTaskCompletedInFailure);
        parcel.writeInt(this.defaultDisplayOrder);
        parcel.writeInt(this.selected ? 1 : 0);
        parcel.writeInt(this.currentlySelectedWin ? 1 : 0);
        parcel.writeInt(this.currentlySelectedLost ? 1 : 0);
    }

    public /* synthetic */ DealStageDefinition(String str, String str2, String str3, String str4, int i, boolean z, boolean z2, List list, List list2, int i2, boolean z3, boolean z4, boolean z5, int i3, id5 id5Var) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) == 0 ? str4 : "", (i3 & 16) != 0 ? -1 : i, (i3 & 32) != 0 ? false : z, (i3 & 64) != 0 ? false : z2, (i3 & 128) != 0 ? new ArrayList() : list, (i3 & 256) != 0 ? new ArrayList() : list2, (i3 & 512) != 0 ? 0 : i2, (i3 & 1024) != 0 ? false : z3, (i3 & 2048) != 0 ? false : z4, (i3 & 4096) == 0 ? z5 : false);
    }

    public DealStageDefinition(String str, String str2, String str3, String str4, int i, boolean z, boolean z2, List<String> list, List<String> list2, int i2, boolean z3, boolean z4, boolean z5) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        sq8.m48649h(str2, "name");
        sq8.m48649h(str3, MediaTrack.ROLE_DESCRIPTION);
        sq8.m48649h(str4, "dealPipelineName");
        sq8.m48649h(list, "createIfTaskCompletedSuccessfully");
        sq8.m48649h(list2, "createIfTaskCompletedInFailure");
        this.id = str;
        this.name = str2;
        this.description = str3;
        this.dealPipelineName = str4;
        this.defaultColor = i;
        this.isTerminalStateInSuccess = z;
        this.isTerminalStateInFailure = z2;
        this.createIfTaskCompletedSuccessfully = list;
        this.createIfTaskCompletedInFailure = list2;
        this.defaultDisplayOrder = i2;
        this.selected = z3;
        this.currentlySelectedWin = z4;
        this.currentlySelectedLost = z5;
    }
}
