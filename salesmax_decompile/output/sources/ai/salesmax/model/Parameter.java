package ai.salesmax.model;

import android.os.Parcel;
import android.os.Parcelable;
import p001o.id5;
import p001o.sq8;
import p001o.yfe;

/* loaded from: classes.dex */
public final class Parameter extends yfe implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<Parameter> CREATOR = new Creator();
    private String parameter_name;

    /* renamed from: type, reason: collision with root package name */
    private String f58054type;
    private String value;

    public static final class Creator implements Parcelable.Creator<Parameter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Parameter createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new Parameter(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Parameter[] newArray(int i) {
            return new Parameter[i];
        }
    }

    public Parameter() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ Parameter copy$default(Parameter parameter, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = parameter.f58054type;
        }
        if ((i & 2) != 0) {
            str2 = parameter.value;
        }
        if ((i & 4) != 0) {
            str3 = parameter.parameter_name;
        }
        return parameter.copy(str, str2, str3);
    }

    public final String component1() {
        return this.f58054type;
    }

    public final String component2() {
        return this.value;
    }

    public final String component3() {
        return this.parameter_name;
    }

    public final Parameter copy(String str, String str2, String str3) {
        return new Parameter(str, str2, str3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Parameter)) {
            return false;
        }
        Parameter parameter = (Parameter) obj;
        return sq8.m48644c(this.f58054type, parameter.f58054type) && sq8.m48644c(this.value, parameter.value) && sq8.m48644c(this.parameter_name, parameter.parameter_name);
    }

    public final String getParameter_name() {
        return this.parameter_name;
    }

    public final String getType() {
        return this.f58054type;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.f58054type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.value;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.parameter_name;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setParameter_name(String str) {
        this.parameter_name = str;
    }

    public final void setType(String str) {
        this.f58054type = str;
    }

    public final void setValue(String str) {
        this.value = str;
    }

    public String toString() {
        return "Parameter(type=" + this.f58054type + ", value=" + this.value + ", parameter_name=" + this.parameter_name + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.f58054type);
        parcel.writeString(this.value);
        parcel.writeString(this.parameter_name);
    }

    public /* synthetic */ Parameter(String str, String str2, String str3, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public Parameter(String str, String str2, String str3) {
        this.f58054type = str;
        this.value = str2;
        this.parameter_name = str3;
    }
}
