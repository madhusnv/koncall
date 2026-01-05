package ai.salesmax.model;

import android.os.Parcel;
import android.os.Parcelable;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class FlowActionPayload implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<FlowActionPayload> CREATOR = new Creator();
    private String flowData;
    private String screen;

    public static final class Creator implements Parcelable.Creator<FlowActionPayload> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FlowActionPayload createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new FlowActionPayload(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FlowActionPayload[] newArray(int i) {
            return new FlowActionPayload[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FlowActionPayload() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ FlowActionPayload copy$default(FlowActionPayload flowActionPayload, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = flowActionPayload.screen;
        }
        if ((i & 2) != 0) {
            str2 = flowActionPayload.flowData;
        }
        return flowActionPayload.copy(str, str2);
    }

    public final String component1() {
        return this.screen;
    }

    public final String component2() {
        return this.flowData;
    }

    public final FlowActionPayload copy(String str, String str2) {
        return new FlowActionPayload(str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlowActionPayload)) {
            return false;
        }
        FlowActionPayload flowActionPayload = (FlowActionPayload) obj;
        return sq8.m48644c(this.screen, flowActionPayload.screen) && sq8.m48644c(this.flowData, flowActionPayload.flowData);
    }

    public final String getFlowData() {
        return this.flowData;
    }

    public final String getScreen() {
        return this.screen;
    }

    public int hashCode() {
        String str = this.screen;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.flowData;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setFlowData(String str) {
        this.flowData = str;
    }

    public final void setScreen(String str) {
        this.screen = str;
    }

    public String toString() {
        return "FlowActionPayload(screen=" + this.screen + ", flowData=" + this.flowData + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.screen);
        parcel.writeString(this.flowData);
    }

    public FlowActionPayload(String str, String str2) {
        this.screen = str;
        this.flowData = str2;
    }

    public /* synthetic */ FlowActionPayload(String str, String str2, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
