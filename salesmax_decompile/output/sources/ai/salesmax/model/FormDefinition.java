package ai.salesmax.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.perf.util.Constants;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001o.id5;
import p001o.sq8;
import p001o.yfe;

/* loaded from: classes.dex */
public final class FormDefinition extends yfe implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<FormDefinition> CREATOR = new Creator();
    private String accountId;
    private String createdById;
    private String displayName;
    private String formName;
    private List<FormStepSchema> formSchema;
    private String formTitle;
    private String id;
    private String updatedById;

    public static final class Creator implements Parcelable.Creator<FormDefinition> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FormDefinition createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(FormStepSchema.CREATOR.createFromParcel(parcel));
            }
            return new FormDefinition(string, string2, string3, string4, string5, arrayList, parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FormDefinition[] newArray(int i) {
            return new FormDefinition[i];
        }
    }

    public FormDefinition() {
        this(null, null, null, null, null, null, null, null, Constants.MAX_HOST_LENGTH, null);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.accountId;
    }

    public final String component3() {
        return this.formName;
    }

    public final String component4() {
        return this.displayName;
    }

    public final String component5() {
        return this.formTitle;
    }

    public final List<FormStepSchema> component6() {
        return this.formSchema;
    }

    public final String component7() {
        return this.updatedById;
    }

    public final String component8() {
        return this.createdById;
    }

    public final FormDefinition copy(String str, String str2, String str3, String str4, String str5, List<FormStepSchema> list, String str6, String str7) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        sq8.m48649h(str2, "accountId");
        sq8.m48649h(str3, "formName");
        sq8.m48649h(str4, "displayName");
        sq8.m48649h(str5, "formTitle");
        sq8.m48649h(list, "formSchema");
        sq8.m48649h(str6, "updatedById");
        sq8.m48649h(str7, "createdById");
        return new FormDefinition(str, str2, str3, str4, str5, list, str6, str7);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormDefinition)) {
            return false;
        }
        FormDefinition formDefinition = (FormDefinition) obj;
        return sq8.m48644c(this.id, formDefinition.id) && sq8.m48644c(this.accountId, formDefinition.accountId) && sq8.m48644c(this.formName, formDefinition.formName) && sq8.m48644c(this.displayName, formDefinition.displayName) && sq8.m48644c(this.formTitle, formDefinition.formTitle) && sq8.m48644c(this.formSchema, formDefinition.formSchema) && sq8.m48644c(this.updatedById, formDefinition.updatedById) && sq8.m48644c(this.createdById, formDefinition.createdById);
    }

    public final String getAccountId() {
        return this.accountId;
    }

    public final String getCreatedById() {
        return this.createdById;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getFormName() {
        return this.formName;
    }

    public final List<FormStepSchema> getFormSchema() {
        return this.formSchema;
    }

    public final String getFormTitle() {
        return this.formTitle;
    }

    public final String getId() {
        return this.id;
    }

    public final String getUpdatedById() {
        return this.updatedById;
    }

    public int hashCode() {
        return (((((((((((((this.id.hashCode() * 31) + this.accountId.hashCode()) * 31) + this.formName.hashCode()) * 31) + this.displayName.hashCode()) * 31) + this.formTitle.hashCode()) * 31) + this.formSchema.hashCode()) * 31) + this.updatedById.hashCode()) * 31) + this.createdById.hashCode();
    }

    public final void setAccountId(String str) {
        sq8.m48649h(str, "<set-?>");
        this.accountId = str;
    }

    public final void setCreatedById(String str) {
        sq8.m48649h(str, "<set-?>");
        this.createdById = str;
    }

    public final void setDisplayName(String str) {
        sq8.m48649h(str, "<set-?>");
        this.displayName = str;
    }

    public final void setFormName(String str) {
        sq8.m48649h(str, "<set-?>");
        this.formName = str;
    }

    public final void setFormSchema(List<FormStepSchema> list) {
        sq8.m48649h(list, "<set-?>");
        this.formSchema = list;
    }

    public final void setFormTitle(String str) {
        sq8.m48649h(str, "<set-?>");
        this.formTitle = str;
    }

    public final void setId(String str) {
        sq8.m48649h(str, "<set-?>");
        this.id = str;
    }

    public final void setUpdatedById(String str) {
        sq8.m48649h(str, "<set-?>");
        this.updatedById = str;
    }

    public String toString() {
        return "FormDefinition(id=" + this.id + ", accountId=" + this.accountId + ", formName=" + this.formName + ", displayName=" + this.displayName + ", formTitle=" + this.formTitle + ", formSchema=" + this.formSchema + ", updatedById=" + this.updatedById + ", createdById=" + this.createdById + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.accountId);
        parcel.writeString(this.formName);
        parcel.writeString(this.displayName);
        parcel.writeString(this.formTitle);
        List<FormStepSchema> list = this.formSchema;
        parcel.writeInt(list.size());
        Iterator<FormStepSchema> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.updatedById);
        parcel.writeString(this.createdById);
    }

    public /* synthetic */ FormDefinition(String str, String str2, String str3, String str4, String str5, List list, String str6, String str7, int i, id5 id5Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? new ArrayList() : list, (i & 64) != 0 ? "" : str6, (i & 128) == 0 ? str7 : "");
    }

    public FormDefinition(String str, String str2, String str3, String str4, String str5, List<FormStepSchema> list, String str6, String str7) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        sq8.m48649h(str2, "accountId");
        sq8.m48649h(str3, "formName");
        sq8.m48649h(str4, "displayName");
        sq8.m48649h(str5, "formTitle");
        sq8.m48649h(list, "formSchema");
        sq8.m48649h(str6, "updatedById");
        sq8.m48649h(str7, "createdById");
        this.id = str;
        this.accountId = str2;
        this.formName = str3;
        this.displayName = str4;
        this.formTitle = str5;
        this.formSchema = list;
        this.updatedById = str6;
        this.createdById = str7;
    }
}
