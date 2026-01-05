package ai.salesmax.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaTrack;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001o.id5;
import p001o.sq8;
import p001o.yfe;

/* loaded from: classes.dex */
public final class PropertyDefinition extends yfe implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<PropertyDefinition> CREATOR = new Creator();
    private String accountId;
    private String createdById;
    private String description;
    private String displayName;
    private Integer displayOrder;
    private String id;
    private boolean isArchived;
    private boolean isMultiple;
    private boolean isSystemProperty;
    private String parentObjectType;
    private List<PropertyOptions> possibleValues;
    private String propertyName;
    private String scalarType;
    private String updatedById;

    public static final class Creator implements Parcelable.Creator<PropertyDefinition> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PropertyDefinition createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(PropertyOptions.CREATOR.createFromParcel(parcel));
            }
            return new PropertyDefinition(string, string2, string3, string4, numValueOf, string5, string6, string7, z, z2, arrayList, parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PropertyDefinition[] newArray(int i) {
            return new PropertyDefinition[i];
        }
    }

    public PropertyDefinition() {
        this(null, null, null, null, null, null, null, null, false, false, null, null, null, false, 16383, null);
    }

    public static /* synthetic */ FormField toDefaultFormField$default(PropertyDefinition propertyDefinition, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return propertyDefinition.toDefaultFormField(str);
    }

    public final String component1() {
        return this.id;
    }

    public final boolean component10() {
        return this.isSystemProperty;
    }

    public final List<PropertyOptions> component11() {
        return this.possibleValues;
    }

    public final String component12() {
        return this.updatedById;
    }

    public final String component13() {
        return this.createdById;
    }

    public final boolean component14() {
        return this.isArchived;
    }

    public final String component2() {
        return this.accountId;
    }

    public final String component3() {
        return this.propertyName;
    }

    public final String component4() {
        return this.displayName;
    }

    public final Integer component5() {
        return this.displayOrder;
    }

    public final String component6() {
        return this.description;
    }

    public final String component7() {
        return this.scalarType;
    }

    public final String component8() {
        return this.parentObjectType;
    }

    public final boolean component9() {
        return this.isMultiple;
    }

    public final PropertyDefinition copy(String str, String str2, String str3, String str4, Integer num, String str5, String str6, String str7, boolean z, boolean z2, List<PropertyOptions> list, String str8, String str9, boolean z3) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        sq8.m48649h(str2, "accountId");
        sq8.m48649h(str3, "propertyName");
        sq8.m48649h(str4, "displayName");
        sq8.m48649h(str5, MediaTrack.ROLE_DESCRIPTION);
        sq8.m48649h(str6, "scalarType");
        sq8.m48649h(str7, "parentObjectType");
        sq8.m48649h(list, "possibleValues");
        sq8.m48649h(str8, "updatedById");
        sq8.m48649h(str9, "createdById");
        return new PropertyDefinition(str, str2, str3, str4, num, str5, str6, str7, z, z2, list, str8, str9, z3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PropertyDefinition)) {
            return false;
        }
        PropertyDefinition propertyDefinition = (PropertyDefinition) obj;
        return sq8.m48644c(this.id, propertyDefinition.id) && sq8.m48644c(this.accountId, propertyDefinition.accountId) && sq8.m48644c(this.propertyName, propertyDefinition.propertyName) && sq8.m48644c(this.displayName, propertyDefinition.displayName) && sq8.m48644c(this.displayOrder, propertyDefinition.displayOrder) && sq8.m48644c(this.description, propertyDefinition.description) && sq8.m48644c(this.scalarType, propertyDefinition.scalarType) && sq8.m48644c(this.parentObjectType, propertyDefinition.parentObjectType) && this.isMultiple == propertyDefinition.isMultiple && this.isSystemProperty == propertyDefinition.isSystemProperty && sq8.m48644c(this.possibleValues, propertyDefinition.possibleValues) && sq8.m48644c(this.updatedById, propertyDefinition.updatedById) && sq8.m48644c(this.createdById, propertyDefinition.createdById) && this.isArchived == propertyDefinition.isArchived;
    }

    public final String getAccountId() {
        return this.accountId;
    }

    public final String getCreatedById() {
        return this.createdById;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final Integer getDisplayOrder() {
        return this.displayOrder;
    }

    public final String getId() {
        return this.id;
    }

    public final String getParentObjectType() {
        return this.parentObjectType;
    }

    public final List<PropertyOptions> getPossibleValues() {
        return this.possibleValues;
    }

    public final String getPropertyName() {
        return this.propertyName;
    }

    public final String getScalarType() {
        return this.scalarType;
    }

    public final String getUpdatedById() {
        return this.updatedById;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = ((((((this.id.hashCode() * 31) + this.accountId.hashCode()) * 31) + this.propertyName.hashCode()) * 31) + this.displayName.hashCode()) * 31;
        Integer num = this.displayOrder;
        int iHashCode2 = (((((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.description.hashCode()) * 31) + this.scalarType.hashCode()) * 31) + this.parentObjectType.hashCode()) * 31;
        boolean z = this.isMultiple;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (iHashCode2 + i) * 31;
        boolean z2 = this.isSystemProperty;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int iHashCode3 = (((((((i2 + i3) * 31) + this.possibleValues.hashCode()) * 31) + this.updatedById.hashCode()) * 31) + this.createdById.hashCode()) * 31;
        boolean z3 = this.isArchived;
        return iHashCode3 + (z3 ? 1 : z3 ? 1 : 0);
    }

    public final boolean isArchived() {
        return this.isArchived;
    }

    public final boolean isMultiple() {
        return this.isMultiple;
    }

    public final boolean isSystemProperty() {
        return this.isSystemProperty;
    }

    public final void setAccountId(String str) {
        sq8.m48649h(str, "<set-?>");
        this.accountId = str;
    }

    public final void setArchived(boolean z) {
        this.isArchived = z;
    }

    public final void setCreatedById(String str) {
        sq8.m48649h(str, "<set-?>");
        this.createdById = str;
    }

    public final void setDescription(String str) {
        sq8.m48649h(str, "<set-?>");
        this.description = str;
    }

    public final void setDisplayName(String str) {
        sq8.m48649h(str, "<set-?>");
        this.displayName = str;
    }

    public final void setDisplayOrder(Integer num) {
        this.displayOrder = num;
    }

    public final void setId(String str) {
        sq8.m48649h(str, "<set-?>");
        this.id = str;
    }

    public final void setMultiple(boolean z) {
        this.isMultiple = z;
    }

    public final void setParentObjectType(String str) {
        sq8.m48649h(str, "<set-?>");
        this.parentObjectType = str;
    }

    public final void setPossibleValues(List<PropertyOptions> list) {
        sq8.m48649h(list, "<set-?>");
        this.possibleValues = list;
    }

    public final void setPropertyName(String str) {
        sq8.m48649h(str, "<set-?>");
        this.propertyName = str;
    }

    public final void setScalarType(String str) {
        sq8.m48649h(str, "<set-?>");
        this.scalarType = str;
    }

    public final void setSystemProperty(boolean z) {
        this.isSystemProperty = z;
    }

    public final void setUpdatedById(String str) {
        sq8.m48649h(str, "<set-?>");
        this.updatedById = str;
    }

    public final FormField toDefaultFormField(String str) {
        String str2 = this.propertyName;
        String str3 = this.parentObjectType;
        String str4 = this.scalarType;
        Boolean bool = Boolean.FALSE;
        return new FormField("Custom Attributes", new Field(str2, str3, str4, bool, bool, this.displayName, null, bool, this.id, this, null, null, 3072, null), str);
    }

    public String toString() {
        return "PropertyDefinition(id=" + this.id + ", accountId=" + this.accountId + ", propertyName=" + this.propertyName + ", displayName=" + this.displayName + ", displayOrder=" + this.displayOrder + ", description=" + this.description + ", scalarType=" + this.scalarType + ", parentObjectType=" + this.parentObjectType + ", isMultiple=" + this.isMultiple + ", isSystemProperty=" + this.isSystemProperty + ", possibleValues=" + this.possibleValues + ", updatedById=" + this.updatedById + ", createdById=" + this.createdById + ", isArchived=" + this.isArchived + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.accountId);
        parcel.writeString(this.propertyName);
        parcel.writeString(this.displayName);
        Integer num = this.displayOrder;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.description);
        parcel.writeString(this.scalarType);
        parcel.writeString(this.parentObjectType);
        parcel.writeInt(this.isMultiple ? 1 : 0);
        parcel.writeInt(this.isSystemProperty ? 1 : 0);
        List<PropertyOptions> list = this.possibleValues;
        parcel.writeInt(list.size());
        Iterator<PropertyOptions> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.updatedById);
        parcel.writeString(this.createdById);
        parcel.writeInt(this.isArchived ? 1 : 0);
    }

    public /* synthetic */ PropertyDefinition(String str, String str2, String str3, String str4, Integer num, String str5, String str6, String str7, boolean z, boolean z2, List list, String str8, String str9, boolean z3, int i, id5 id5Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? null : num, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "text" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? false : z, (i & 512) != 0 ? false : z2, (i & 1024) != 0 ? new ArrayList() : list, (i & 2048) != 0 ? "" : str8, (i & 4096) == 0 ? str9 : "", (i & 8192) == 0 ? z3 : false);
    }

    public PropertyDefinition(String str, String str2, String str3, String str4, Integer num, String str5, String str6, String str7, boolean z, boolean z2, List<PropertyOptions> list, String str8, String str9, boolean z3) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        sq8.m48649h(str2, "accountId");
        sq8.m48649h(str3, "propertyName");
        sq8.m48649h(str4, "displayName");
        sq8.m48649h(str5, MediaTrack.ROLE_DESCRIPTION);
        sq8.m48649h(str6, "scalarType");
        sq8.m48649h(str7, "parentObjectType");
        sq8.m48649h(list, "possibleValues");
        sq8.m48649h(str8, "updatedById");
        sq8.m48649h(str9, "createdById");
        this.id = str;
        this.accountId = str2;
        this.propertyName = str3;
        this.displayName = str4;
        this.displayOrder = num;
        this.description = str5;
        this.scalarType = str6;
        this.parentObjectType = str7;
        this.isMultiple = z;
        this.isSystemProperty = z2;
        this.possibleValues = list;
        this.updatedById = str8;
        this.createdById = str9;
        this.isArchived = z3;
    }
}
