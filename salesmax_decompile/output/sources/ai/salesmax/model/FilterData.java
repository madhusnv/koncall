package ai.salesmax.model;

import org.objectweb.asm.Opcodes;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class FilterData {
    public static final int $stable = 8;
    private String dateType;
    private Long endTo;
    private boolean isSelected;
    private final boolean isTitle;
    private Long startFrom;
    private final String text;

    /* renamed from: type, reason: collision with root package name */
    private final String f58053type;

    public FilterData() {
        this(false, null, null, false, null, null, null, Opcodes.LAND, null);
    }

    public static /* synthetic */ FilterData copy$default(FilterData filterData, boolean z, String str, String str2, boolean z2, Long l, Long l2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = filterData.isTitle;
        }
        if ((i & 2) != 0) {
            str = filterData.f58053type;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = filterData.text;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            z2 = filterData.isSelected;
        }
        boolean z3 = z2;
        if ((i & 16) != 0) {
            l = filterData.startFrom;
        }
        Long l3 = l;
        if ((i & 32) != 0) {
            l2 = filterData.endTo;
        }
        Long l4 = l2;
        if ((i & 64) != 0) {
            str3 = filterData.dateType;
        }
        return filterData.copy(z, str4, str5, z3, l3, l4, str3);
    }

    public final boolean component1() {
        return this.isTitle;
    }

    public final String component2() {
        return this.f58053type;
    }

    public final String component3() {
        return this.text;
    }

    public final boolean component4() {
        return this.isSelected;
    }

    public final Long component5() {
        return this.startFrom;
    }

    public final Long component6() {
        return this.endTo;
    }

    public final String component7() {
        return this.dateType;
    }

    public final FilterData copy(boolean z, String str, String str2, boolean z2, Long l, Long l2, String str3) {
        sq8.m48649h(str, "type");
        sq8.m48649h(str2, "text");
        return new FilterData(z, str, str2, z2, l, l2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilterData)) {
            return false;
        }
        FilterData filterData = (FilterData) obj;
        return this.isTitle == filterData.isTitle && sq8.m48644c(this.f58053type, filterData.f58053type) && sq8.m48644c(this.text, filterData.text) && this.isSelected == filterData.isSelected && sq8.m48644c(this.startFrom, filterData.startFrom) && sq8.m48644c(this.endTo, filterData.endTo) && sq8.m48644c(this.dateType, filterData.dateType);
    }

    public final String getDateType() {
        return this.dateType;
    }

    public final Long getEndTo() {
        return this.endTo;
    }

    public final Long getStartFrom() {
        return this.startFrom;
    }

    public final String getText() {
        return this.text;
    }

    public final String getType() {
        return this.f58053type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    public int hashCode() {
        boolean z = this.isTitle;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int iHashCode = ((((r0 * 31) + this.f58053type.hashCode()) * 31) + this.text.hashCode()) * 31;
        boolean z2 = this.isSelected;
        int i = (iHashCode + (z2 ? 1 : z2 ? 1 : 0)) * 31;
        Long l = this.startFrom;
        int iHashCode2 = (i + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.endTo;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.dateType;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final boolean isTitle() {
        return this.isTitle;
    }

    public final void setDateType(String str) {
        this.dateType = str;
    }

    public final void setEndTo(Long l) {
        this.endTo = l;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    public final void setStartFrom(Long l) {
        this.startFrom = l;
    }

    public String toString() {
        return "FilterData(isTitle=" + this.isTitle + ", type=" + this.f58053type + ", text=" + this.text + ", isSelected=" + this.isSelected + ", startFrom=" + this.startFrom + ", endTo=" + this.endTo + ", dateType=" + this.dateType + ")";
    }

    public FilterData(boolean z, String str, String str2, boolean z2, Long l, Long l2, String str3) {
        sq8.m48649h(str, "type");
        sq8.m48649h(str2, "text");
        this.isTitle = z;
        this.f58053type = str;
        this.text = str2;
        this.isSelected = z2;
        this.startFrom = l;
        this.endTo = l2;
        this.dateType = str3;
    }

    public /* synthetic */ FilterData(boolean z, String str, String str2, boolean z2, Long l, Long l2, String str3, int i, id5 id5Var) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) == 0 ? str2 : "", (i & 8) == 0 ? z2 : false, (i & 16) != 0 ? -1L : l, (i & 32) != 0 ? -1L : l2, (i & 64) != 0 ? "createdAt" : str3);
    }
}
