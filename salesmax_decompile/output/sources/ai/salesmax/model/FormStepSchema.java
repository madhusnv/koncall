package ai.salesmax.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class FormStepSchema implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<FormStepSchema> CREATOR = new Creator();
    private List<Field> fields;
    private String stepTitle;

    public static final class Creator implements Parcelable.Creator<FormStepSchema> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FormStepSchema createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(Field.CREATOR.createFromParcel(parcel));
            }
            return new FormStepSchema(string, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FormStepSchema[] newArray(int i) {
            return new FormStepSchema[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FormStepSchema() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FormStepSchema copy$default(FormStepSchema formStepSchema, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = formStepSchema.stepTitle;
        }
        if ((i & 2) != 0) {
            list = formStepSchema.fields;
        }
        return formStepSchema.copy(str, list);
    }

    public final String component1() {
        return this.stepTitle;
    }

    public final List<Field> component2() {
        return this.fields;
    }

    public final FormStepSchema copy(String str, List<Field> list) {
        sq8.m48649h(list, "fields");
        return new FormStepSchema(str, list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormStepSchema)) {
            return false;
        }
        FormStepSchema formStepSchema = (FormStepSchema) obj;
        return sq8.m48644c(this.stepTitle, formStepSchema.stepTitle) && sq8.m48644c(this.fields, formStepSchema.fields);
    }

    public final List<Field> getFields() {
        return this.fields;
    }

    public final String getStepTitle() {
        return this.stepTitle;
    }

    public int hashCode() {
        String str = this.stepTitle;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.fields.hashCode();
    }

    public final void setFields(List<Field> list) {
        sq8.m48649h(list, "<set-?>");
        this.fields = list;
    }

    public final void setStepTitle(String str) {
        this.stepTitle = str;
    }

    public String toString() {
        return "FormStepSchema(stepTitle=" + this.stepTitle + ", fields=" + this.fields + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.stepTitle);
        List<Field> list = this.fields;
        parcel.writeInt(list.size());
        Iterator<Field> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public FormStepSchema(String str, List<Field> list) {
        sq8.m48649h(list, "fields");
        this.stepTitle = str;
        this.fields = list;
    }

    public /* synthetic */ FormStepSchema(String str, List list, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? new ArrayList() : list);
    }
}
