package ai.salesmax.model;

import android.os.Parcel;
import android.os.Parcelable;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class ReminderData implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ReminderData> CREATOR = new Creator();
    private int id;
    private boolean isSelected;
    private String name;

    public static final class Creator implements Parcelable.Creator<ReminderData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReminderData createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new ReminderData(parcel.readString(), parcel.readInt(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReminderData[] newArray(int i) {
            return new ReminderData[i];
        }
    }

    public ReminderData() {
        this(null, 0, false, 7, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final void setName(String str) {
        sq8.m48649h(str, "<set-?>");
        this.name = str;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.name);
        parcel.writeInt(this.id);
        parcel.writeInt(this.isSelected ? 1 : 0);
    }

    public ReminderData(String str, int i, boolean z) {
        sq8.m48649h(str, "name");
        this.name = str;
        this.id = i;
        this.isSelected = z;
    }

    public /* synthetic */ ReminderData(String str, int i, boolean z, int i2, id5 id5Var) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? -1 : i, (i2 & 4) != 0 ? false : z);
    }
}
