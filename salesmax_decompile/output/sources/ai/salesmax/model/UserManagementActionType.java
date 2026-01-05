package ai.salesmax.model;

import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class UserManagementActionType {
    public static final int $stable = 8;
    private Integer color;
    private Integer icon;
    private String title;

    public UserManagementActionType() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ UserManagementActionType copy$default(UserManagementActionType userManagementActionType, String str, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userManagementActionType.title;
        }
        if ((i & 2) != 0) {
            num = userManagementActionType.icon;
        }
        if ((i & 4) != 0) {
            num2 = userManagementActionType.color;
        }
        return userManagementActionType.copy(str, num, num2);
    }

    public final String component1() {
        return this.title;
    }

    public final Integer component2() {
        return this.icon;
    }

    public final Integer component3() {
        return this.color;
    }

    public final UserManagementActionType copy(String str, Integer num, Integer num2) {
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_TITLE);
        return new UserManagementActionType(str, num, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserManagementActionType)) {
            return false;
        }
        UserManagementActionType userManagementActionType = (UserManagementActionType) obj;
        return sq8.m48644c(this.title, userManagementActionType.title) && sq8.m48644c(this.icon, userManagementActionType.icon) && sq8.m48644c(this.color, userManagementActionType.color);
    }

    public final Integer getColor() {
        return this.color;
    }

    public final Integer getIcon() {
        return this.icon;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        Integer num = this.icon;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.color;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final void setColor(Integer num) {
        this.color = num;
    }

    public final void setIcon(Integer num) {
        this.icon = num;
    }

    public final void setTitle(String str) {
        sq8.m48649h(str, "<set-?>");
        this.title = str;
    }

    public String toString() {
        return "UserManagementActionType(title=" + this.title + ", icon=" + this.icon + ", color=" + this.color + ")";
    }

    public UserManagementActionType(String str, Integer num, Integer num2) {
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_TITLE);
        this.title = str;
        this.icon = num;
        this.color = num2;
    }

    public /* synthetic */ UserManagementActionType(String str, Integer num, Integer num2, int i, id5 id5Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2);
    }
}
