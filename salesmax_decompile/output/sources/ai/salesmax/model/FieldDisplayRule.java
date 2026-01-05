package ai.salesmax.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import java.util.Map;
import p001o.f9g;
import p001o.id5;
import p001o.kh3;
import p001o.sq8;

/* loaded from: classes.dex */
public final class FieldDisplayRule implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<FieldDisplayRule> CREATOR = new Creator();
    private String field;
    private String operator;
    private Object value;

    public static final class Creator implements Parcelable.Creator<FieldDisplayRule> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FieldDisplayRule createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new FieldDisplayRule(parcel.readString(), parcel.readString(), parcel.readValue(FieldDisplayRule.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FieldDisplayRule[] newArray(int i) {
            return new FieldDisplayRule[i];
        }
    }

    public FieldDisplayRule() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ FieldDisplayRule copy$default(FieldDisplayRule fieldDisplayRule, String str, String str2, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = fieldDisplayRule.field;
        }
        if ((i & 2) != 0) {
            str2 = fieldDisplayRule.operator;
        }
        if ((i & 4) != 0) {
            obj = fieldDisplayRule.value;
        }
        return fieldDisplayRule.copy(str, str2, obj);
    }

    public final String component1() {
        return this.field;
    }

    public final String component2() {
        return this.operator;
    }

    public final Object component3() {
        return this.value;
    }

    public final FieldDisplayRule copy(String str, String str2, Object obj) {
        return new FieldDisplayRule(str, str2, obj);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FieldDisplayRule)) {
            return false;
        }
        FieldDisplayRule fieldDisplayRule = (FieldDisplayRule) obj;
        return sq8.m48644c(this.field, fieldDisplayRule.field) && sq8.m48644c(this.operator, fieldDisplayRule.operator) && sq8.m48644c(this.value, fieldDisplayRule.value);
    }

    public final boolean evaluateRule(Map<String, ? extends Object> map) {
        List listD0;
        sq8.m48649h(map, "submittedValues");
        String str = this.field;
        String str2 = (str == null || (listD0 = f9g.D0(str, new String[]{"__"}, false, 0, 6, null)) == null) ? null : (String) kh3.r0(listD0);
        Object obj = map.get(str2);
        boolean z__evaluateRule = FormDefinitionKt.__evaluateRule(obj, this.operator, this.value);
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(" ");
        sb.append(map);
        String str3 = this.operator;
        Object obj2 = this.value;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(" ");
        sb2.append(obj);
        sb2.append(" ");
        sb2.append(str3);
        sb2.append(" ");
        sb2.append(obj2);
        sb2.append(" = ");
        sb2.append(z__evaluateRule);
        return z__evaluateRule;
    }

    public final String getField() {
        return this.field;
    }

    public final String getOperator() {
        return this.operator;
    }

    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.field;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.operator;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Object obj = this.value;
        return iHashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    public final void setField(String str) {
        this.field = str;
    }

    public final void setOperator(String str) {
        this.operator = str;
    }

    public final void setValue(Object obj) {
        this.value = obj;
    }

    public String toString() {
        return "FieldDisplayRule(field=" + this.field + ", operator=" + this.operator + ", value=" + this.value + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.field);
        parcel.writeString(this.operator);
        parcel.writeValue(this.value);
    }

    public FieldDisplayRule(String str, String str2, Object obj) {
        this.field = str;
        this.operator = str2;
        this.value = obj;
    }

    public /* synthetic */ FieldDisplayRule(String str, String str2, Object obj, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : obj);
    }
}
