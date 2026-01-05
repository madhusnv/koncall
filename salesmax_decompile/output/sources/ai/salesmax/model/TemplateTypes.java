package ai.salesmax.model;

import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class TemplateTypes {
    public static final int $stable = 8;
    private boolean isSelected;
    private String value;
    private String viewValue;

    public TemplateTypes() {
        this(null, null, false, 7, null);
    }

    public static /* synthetic */ TemplateTypes copy$default(TemplateTypes templateTypes, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = templateTypes.value;
        }
        if ((i & 2) != 0) {
            str2 = templateTypes.viewValue;
        }
        if ((i & 4) != 0) {
            z = templateTypes.isSelected;
        }
        return templateTypes.copy(str, str2, z);
    }

    public final String component1() {
        return this.value;
    }

    public final String component2() {
        return this.viewValue;
    }

    public final boolean component3() {
        return this.isSelected;
    }

    public final TemplateTypes copy(String str, String str2, boolean z) {
        sq8.m48649h(str, "value");
        sq8.m48649h(str2, "viewValue");
        return new TemplateTypes(str, str2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateTypes)) {
            return false;
        }
        TemplateTypes templateTypes = (TemplateTypes) obj;
        return sq8.m48644c(this.value, templateTypes.value) && sq8.m48644c(this.viewValue, templateTypes.viewValue) && this.isSelected == templateTypes.isSelected;
    }

    public final String getValue() {
        return this.value;
    }

    public final String getViewValue() {
        return this.viewValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = ((this.value.hashCode() * 31) + this.viewValue.hashCode()) * 31;
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

    public final void setValue(String str) {
        sq8.m48649h(str, "<set-?>");
        this.value = str;
    }

    public final void setViewValue(String str) {
        sq8.m48649h(str, "<set-?>");
        this.viewValue = str;
    }

    public String toString() {
        return "TemplateTypes(value=" + this.value + ", viewValue=" + this.viewValue + ", isSelected=" + this.isSelected + ")";
    }

    public TemplateTypes(String str, String str2, boolean z) {
        sq8.m48649h(str, "value");
        sq8.m48649h(str2, "viewValue");
        this.value = str;
        this.viewValue = str2;
        this.isSelected = z;
    }

    public /* synthetic */ TemplateTypes(String str, String str2, boolean z, int i, id5 id5Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z);
    }
}
