package ai.salesmax.model;

import android.os.Parcel;
import android.os.Parcelable;
import p001o.id5;
import p001o.sq8;
import p001o.yfe;

/* loaded from: classes.dex */
public final class DocSubTypeDefinition extends yfe implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<DocSubTypeDefinition> CREATOR = new Creator();
    private boolean selected;
    private String value;

    public static final class Creator implements Parcelable.Creator<DocSubTypeDefinition> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DocSubTypeDefinition createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new DocSubTypeDefinition(parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DocSubTypeDefinition[] newArray(int i) {
            return new DocSubTypeDefinition[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DocSubTypeDefinition() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DocSubTypeDefinition copy$default(DocSubTypeDefinition docSubTypeDefinition, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = docSubTypeDefinition.value;
        }
        if ((i & 2) != 0) {
            z = docSubTypeDefinition.selected;
        }
        return docSubTypeDefinition.copy(str, z);
    }

    public final String component1() {
        return this.value;
    }

    public final boolean component2() {
        return this.selected;
    }

    public final DocSubTypeDefinition copy(String str, boolean z) {
        sq8.m48649h(str, "value");
        return new DocSubTypeDefinition(str, z);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocSubTypeDefinition)) {
            return false;
        }
        DocSubTypeDefinition docSubTypeDefinition = (DocSubTypeDefinition) obj;
        return sq8.m48644c(this.value, docSubTypeDefinition.value) && this.selected == docSubTypeDefinition.selected;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final String getValue() {
        return this.value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.value.hashCode() * 31;
        boolean z = this.selected;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iHashCode + i;
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }

    public final void setValue(String str) {
        sq8.m48649h(str, "<set-?>");
        this.value = str;
    }

    public String toString() {
        return "DocSubTypeDefinition(value=" + this.value + ", selected=" + this.selected + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.value);
        parcel.writeInt(this.selected ? 1 : 0);
    }

    public /* synthetic */ DocSubTypeDefinition(String str, boolean z, int i, id5 id5Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z);
    }

    public DocSubTypeDefinition(String str, boolean z) {
        sq8.m48649h(str, "value");
        this.value = str;
        this.selected = z;
    }
}
