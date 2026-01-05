package ai.salesmax.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001o.id5;
import p001o.sq8;
import p001o.yfe;

/* loaded from: classes.dex */
public final class TemplateParameter extends yfe implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<TemplateParameter> CREATOR = new Creator();
    private List<Parameter> parameters;
    private String taType;

    public static final class Creator implements Parcelable.Creator<TemplateParameter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TemplateParameter createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(Parameter.CREATOR.createFromParcel(parcel));
            }
            return new TemplateParameter(string, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TemplateParameter[] newArray(int i) {
            return new TemplateParameter[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TemplateParameter() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TemplateParameter copy$default(TemplateParameter templateParameter, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = templateParameter.taType;
        }
        if ((i & 2) != 0) {
            list = templateParameter.parameters;
        }
        return templateParameter.copy(str, list);
    }

    public final String component1() {
        return this.taType;
    }

    public final List<Parameter> component2() {
        return this.parameters;
    }

    public final TemplateParameter copy(String str, List<Parameter> list) {
        sq8.m48649h(list, "parameters");
        return new TemplateParameter(str, list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateParameter)) {
            return false;
        }
        TemplateParameter templateParameter = (TemplateParameter) obj;
        return sq8.m48644c(this.taType, templateParameter.taType) && sq8.m48644c(this.parameters, templateParameter.parameters);
    }

    public final List<Parameter> getParameters() {
        return this.parameters;
    }

    public final String getTaType() {
        return this.taType;
    }

    public int hashCode() {
        String str = this.taType;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.parameters.hashCode();
    }

    public final void setParameters(List<Parameter> list) {
        sq8.m48649h(list, "<set-?>");
        this.parameters = list;
    }

    public final void setTaType(String str) {
        this.taType = str;
    }

    public String toString() {
        return "TemplateParameter(taType=" + this.taType + ", parameters=" + this.parameters + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.taType);
        List<Parameter> list = this.parameters;
        parcel.writeInt(list.size());
        Iterator<Parameter> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ TemplateParameter(String str, List list, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? new ArrayList() : list);
    }

    public TemplateParameter(String str, List<Parameter> list) {
        sq8.m48649h(list, "parameters");
        this.taType = str;
        this.parameters = list;
    }
}
