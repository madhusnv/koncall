package ai.salesmax.model;

import android.R;
import android.os.Parcel;
import android.os.Parcelable;
import p001o.id5;
import p001o.sq8;
import p001o.w7e;

/* loaded from: classes.dex */
public final class HomeActivity implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<HomeActivity> CREATOR = new Creator();
    private int icon;
    private int id;
    private boolean isLastItems;
    private String name;
    private String percentage;
    private boolean positive;
    private int tintColor;
    private String value;
    private int viewType;

    public static final class Creator implements Parcelable.Creator<HomeActivity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HomeActivity createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new HomeActivity(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HomeActivity[] newArray(int i) {
            return new HomeActivity[i];
        }
    }

    public HomeActivity() {
        this(0, null, null, null, false, 0, false, 0, 0, 511, null);
    }

    public final int component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.value;
    }

    public final String component4() {
        return this.percentage;
    }

    public final boolean component5() {
        return this.positive;
    }

    public final int component6() {
        return this.viewType;
    }

    public final boolean component7() {
        return this.isLastItems;
    }

    public final int component8() {
        return this.tintColor;
    }

    public final int component9() {
        return this.icon;
    }

    public final HomeActivity copy(int i, String str, String str2, String str3, boolean z, int i2, boolean z2, int i3, int i4) {
        sq8.m48649h(str, "name");
        sq8.m48649h(str2, "value");
        sq8.m48649h(str3, "percentage");
        return new HomeActivity(i, str, str2, str3, z, i2, z2, i3, i4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeActivity)) {
            return false;
        }
        HomeActivity homeActivity = (HomeActivity) obj;
        return this.id == homeActivity.id && sq8.m48644c(this.name, homeActivity.name) && sq8.m48644c(this.value, homeActivity.value) && sq8.m48644c(this.percentage, homeActivity.percentage) && this.positive == homeActivity.positive && this.viewType == homeActivity.viewType && this.isLastItems == homeActivity.isLastItems && this.tintColor == homeActivity.tintColor && this.icon == homeActivity.icon;
    }

    public final int getIcon() {
        return this.icon;
    }

    public final int getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPercentage() {
        return this.percentage;
    }

    public final boolean getPositive() {
        return this.positive;
    }

    public final int getTintColor() {
        return this.tintColor;
    }

    public final String getValue() {
        return this.value;
    }

    public final int getViewType() {
        return this.viewType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = ((((((Integer.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + this.value.hashCode()) * 31) + this.percentage.hashCode()) * 31;
        boolean z = this.positive;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int iHashCode2 = (((iHashCode + i) * 31) + Integer.hashCode(this.viewType)) * 31;
        boolean z2 = this.isLastItems;
        return ((((iHashCode2 + (z2 ? 1 : z2 ? 1 : 0)) * 31) + Integer.hashCode(this.tintColor)) * 31) + Integer.hashCode(this.icon);
    }

    public final boolean isLastItems() {
        return this.isLastItems;
    }

    public final void setIcon(int i) {
        this.icon = i;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final void setLastItems(boolean z) {
        this.isLastItems = z;
    }

    public final void setName(String str) {
        sq8.m48649h(str, "<set-?>");
        this.name = str;
    }

    public final void setPercentage(String str) {
        sq8.m48649h(str, "<set-?>");
        this.percentage = str;
    }

    public final void setPositive(boolean z) {
        this.positive = z;
    }

    public final void setTintColor(int i) {
        this.tintColor = i;
    }

    public final void setValue(String str) {
        sq8.m48649h(str, "<set-?>");
        this.value = str;
    }

    public final void setViewType(int i) {
        this.viewType = i;
    }

    public String toString() {
        return "HomeActivity(id=" + this.id + ", name=" + this.name + ", value=" + this.value + ", percentage=" + this.percentage + ", positive=" + this.positive + ", viewType=" + this.viewType + ", isLastItems=" + this.isLastItems + ", tintColor=" + this.tintColor + ", icon=" + this.icon + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.value);
        parcel.writeString(this.percentage);
        parcel.writeInt(this.positive ? 1 : 0);
        parcel.writeInt(this.viewType);
        parcel.writeInt(this.isLastItems ? 1 : 0);
        parcel.writeInt(this.tintColor);
        parcel.writeInt(this.icon);
    }

    public HomeActivity(int i, String str, String str2, String str3, boolean z, int i2, boolean z2, int i3, int i4) {
        sq8.m48649h(str, "name");
        sq8.m48649h(str2, "value");
        sq8.m48649h(str3, "percentage");
        this.id = i;
        this.name = str;
        this.value = str2;
        this.percentage = str3;
        this.positive = z;
        this.viewType = i2;
        this.isLastItems = z2;
        this.tintColor = i3;
        this.icon = i4;
    }

    public /* synthetic */ HomeActivity(int i, String str, String str2, String str3, boolean z, int i2, boolean z2, int i3, int i4, int i5, id5 id5Var) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? "" : str, (i5 & 4) != 0 ? "" : str2, (i5 & 8) == 0 ? str3 : "", (i5 & 16) != 0 ? true : z, (i5 & 32) == 0 ? i2 : 1, (i5 & 64) == 0 ? z2 : false, (i5 & 128) != 0 ? R.color.transparent : i3, (i5 & 256) != 0 ? w7e.ic_add_visit : i4);
    }
}
