package ai.salesmax.model;

import ai.salesmax.services.model.SavedTableViewInfo;
import java.util.Collections;
import java.util.List;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class SavedTableViewInfoList {
    public static final int $stable = 8;
    private boolean hasMoreItems;
    private List<SavedTableViewInfo> items;

    /* JADX WARN: Multi-variable type inference failed */
    public SavedTableViewInfoList() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SavedTableViewInfoList copy$default(SavedTableViewInfoList savedTableViewInfoList, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = savedTableViewInfoList.items;
        }
        if ((i & 2) != 0) {
            z = savedTableViewInfoList.hasMoreItems;
        }
        return savedTableViewInfoList.copy(list, z);
    }

    public final List<SavedTableViewInfo> component1() {
        return this.items;
    }

    public final boolean component2() {
        return this.hasMoreItems;
    }

    public final SavedTableViewInfoList copy(List<SavedTableViewInfo> list, boolean z) {
        sq8.m48649h(list, "items");
        return new SavedTableViewInfoList(list, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavedTableViewInfoList)) {
            return false;
        }
        SavedTableViewInfoList savedTableViewInfoList = (SavedTableViewInfoList) obj;
        return sq8.m48644c(this.items, savedTableViewInfoList.items) && this.hasMoreItems == savedTableViewInfoList.hasMoreItems;
    }

    public final boolean getHasMoreItems() {
        return this.hasMoreItems;
    }

    public final List<SavedTableViewInfo> getItems() {
        return this.items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.items.hashCode() * 31;
        boolean z = this.hasMoreItems;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iHashCode + i;
    }

    public final void setHasMoreItems(boolean z) {
        this.hasMoreItems = z;
    }

    public final void setItems(List<SavedTableViewInfo> list) {
        sq8.m48649h(list, "<set-?>");
        this.items = list;
    }

    public String toString() {
        return "SavedTableViewInfoList(items=" + this.items + ", hasMoreItems=" + this.hasMoreItems + ")";
    }

    public SavedTableViewInfoList(List<SavedTableViewInfo> list, boolean z) {
        sq8.m48649h(list, "items");
        this.items = list;
        this.hasMoreItems = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SavedTableViewInfoList(List list, boolean z, int i, id5 id5Var) {
        if ((i & 1) != 0) {
            list = Collections.emptyList();
            sq8.m48648g(list, "emptyList(...)");
        }
        this(list, (i & 2) != 0 ? true : z);
    }
}
