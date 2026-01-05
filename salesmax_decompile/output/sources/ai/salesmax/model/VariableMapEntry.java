package ai.salesmax.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class VariableMapEntry implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<VariableMapEntry> CREATOR = new Creator();
    private final String fallBackValue;
    private boolean isSelected;
    private final String key;
    private final String object;
    private final String value;

    public static final class Creator implements Parcelable.Creator<VariableMapEntry> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VariableMapEntry createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new VariableMapEntry(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VariableMapEntry[] newArray(int i) {
            return new VariableMapEntry[i];
        }
    }

    public VariableMapEntry(String str, String str2, String str3, String str4, boolean z) {
        sq8.m48649h(str, "object");
        sq8.m48649h(str2, TransferTable.COLUMN_KEY);
        sq8.m48649h(str3, "value");
        sq8.m48649h(str4, "fallBackValue");
        this.object = str;
        this.key = str2;
        this.value = str3;
        this.fallBackValue = str4;
        this.isSelected = z;
    }

    public static /* synthetic */ VariableMapEntry copy$default(VariableMapEntry variableMapEntry, String str, String str2, String str3, String str4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = variableMapEntry.object;
        }
        if ((i & 2) != 0) {
            str2 = variableMapEntry.key;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = variableMapEntry.value;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = variableMapEntry.fallBackValue;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            z = variableMapEntry.isSelected;
        }
        return variableMapEntry.copy(str, str5, str6, str7, z);
    }

    public final String component1() {
        return this.object;
    }

    public final String component2() {
        return this.key;
    }

    public final String component3() {
        return this.value;
    }

    public final String component4() {
        return this.fallBackValue;
    }

    public final boolean component5() {
        return this.isSelected;
    }

    public final VariableMapEntry copy(String str, String str2, String str3, String str4, boolean z) {
        sq8.m48649h(str, "object");
        sq8.m48649h(str2, TransferTable.COLUMN_KEY);
        sq8.m48649h(str3, "value");
        sq8.m48649h(str4, "fallBackValue");
        return new VariableMapEntry(str, str2, str3, str4, z);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VariableMapEntry)) {
            return false;
        }
        VariableMapEntry variableMapEntry = (VariableMapEntry) obj;
        return sq8.m48644c(this.object, variableMapEntry.object) && sq8.m48644c(this.key, variableMapEntry.key) && sq8.m48644c(this.value, variableMapEntry.value) && sq8.m48644c(this.fallBackValue, variableMapEntry.fallBackValue) && this.isSelected == variableMapEntry.isSelected;
    }

    public final String getFallBackValue() {
        return this.fallBackValue;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getObject() {
        return this.object;
    }

    public final String getValue() {
        return this.value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = ((((((this.object.hashCode() * 31) + this.key.hashCode()) * 31) + this.value.hashCode()) * 31) + this.fallBackValue.hashCode()) * 31;
        boolean z = this.isSelected;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iHashCode + i;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    public String toString() {
        return "VariableMapEntry(object=" + this.object + ", key=" + this.key + ", value=" + this.value + ", fallBackValue=" + this.fallBackValue + ", isSelected=" + this.isSelected + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.object);
        parcel.writeString(this.key);
        parcel.writeString(this.value);
        parcel.writeString(this.fallBackValue);
        parcel.writeInt(this.isSelected ? 1 : 0);
    }

    public /* synthetic */ VariableMapEntry(String str, String str2, String str3, String str4, boolean z, int i, id5 id5Var) {
        this(str, str2, str3, str4, (i & 16) != 0 ? false : z);
    }
}
