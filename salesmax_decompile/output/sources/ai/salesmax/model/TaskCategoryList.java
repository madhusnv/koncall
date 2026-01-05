package ai.salesmax.model;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class TaskCategoryList {
    public static final int $stable = 8;
    private String displayWithCount;
    private boolean isSelected;
    private String key;

    public TaskCategoryList() {
        this(null, false, null, 7, null);
    }

    public static /* synthetic */ TaskCategoryList copy$default(TaskCategoryList taskCategoryList, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taskCategoryList.key;
        }
        if ((i & 2) != 0) {
            z = taskCategoryList.isSelected;
        }
        if ((i & 4) != 0) {
            str2 = taskCategoryList.displayWithCount;
        }
        return taskCategoryList.copy(str, z, str2);
    }

    public final String component1() {
        return this.key;
    }

    public final boolean component2() {
        return this.isSelected;
    }

    public final String component3() {
        return this.displayWithCount;
    }

    public final TaskCategoryList copy(String str, boolean z, String str2) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        sq8.m48649h(str2, "displayWithCount");
        return new TaskCategoryList(str, z, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaskCategoryList)) {
            return false;
        }
        TaskCategoryList taskCategoryList = (TaskCategoryList) obj;
        return sq8.m48644c(this.key, taskCategoryList.key) && this.isSelected == taskCategoryList.isSelected && sq8.m48644c(this.displayWithCount, taskCategoryList.displayWithCount);
    }

    public final String getDisplayWithCount() {
        return this.displayWithCount;
    }

    public final String getKey() {
        return this.key;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.key.hashCode() * 31;
        boolean z = this.isSelected;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((iHashCode + i) * 31) + this.displayWithCount.hashCode();
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setDisplayWithCount(String str) {
        sq8.m48649h(str, "<set-?>");
        this.displayWithCount = str;
    }

    public final void setKey(String str) {
        sq8.m48649h(str, "<set-?>");
        this.key = str;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    public String toString() {
        return "TaskCategoryList(key=" + this.key + ", isSelected=" + this.isSelected + ", displayWithCount=" + this.displayWithCount + ")";
    }

    public TaskCategoryList(String str, boolean z, String str2) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        sq8.m48649h(str2, "displayWithCount");
        this.key = str;
        this.isSelected = z;
        this.displayWithCount = str2;
    }

    public /* synthetic */ TaskCategoryList(String str, boolean z, String str2, int i, id5 id5Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? "" : str2);
    }
}
