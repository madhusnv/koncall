package ai.salesmax.model;

import android.content.Context;
import p001o.id5;
import p001o.j4d;
import p001o.sq8;
import p001o.t7c;

/* loaded from: classes.dex */
public final class ActiveProfile {
    public static final int $stable = 8;
    private String accountProfileUrl;
    private t7c permissionIssues;
    private String welcomeMessage;
    private String welcomeMessageSubHeading;

    public ActiveProfile() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ ActiveProfile copy$default(ActiveProfile activeProfile, String str, String str2, String str3, t7c t7cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = activeProfile.welcomeMessage;
        }
        if ((i & 2) != 0) {
            str2 = activeProfile.welcomeMessageSubHeading;
        }
        if ((i & 4) != 0) {
            str3 = activeProfile.accountProfileUrl;
        }
        if ((i & 8) != 0) {
            t7cVar = activeProfile.permissionIssues;
        }
        return activeProfile.copy(str, str2, str3, t7cVar);
    }

    public final String component1() {
        return this.welcomeMessage;
    }

    public final String component2() {
        return this.welcomeMessageSubHeading;
    }

    public final String component3() {
        return this.accountProfileUrl;
    }

    public final t7c component4() {
        return this.permissionIssues;
    }

    public final ActiveProfile copy(String str, String str2, String str3, t7c t7cVar) {
        sq8.m48649h(t7cVar, "permissionIssues");
        return new ActiveProfile(str, str2, str3, t7cVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActiveProfile)) {
            return false;
        }
        ActiveProfile activeProfile = (ActiveProfile) obj;
        return sq8.m48644c(this.welcomeMessage, activeProfile.welcomeMessage) && sq8.m48644c(this.welcomeMessageSubHeading, activeProfile.welcomeMessageSubHeading) && sq8.m48644c(this.accountProfileUrl, activeProfile.accountProfileUrl) && sq8.m48644c(this.permissionIssues, activeProfile.permissionIssues);
    }

    public final String getAccountProfileUrl() {
        return this.accountProfileUrl;
    }

    public final t7c getPermissionIssues() {
        return this.permissionIssues;
    }

    public final String getWelcomeMessage() {
        return this.welcomeMessage;
    }

    public final String getWelcomeMessageSubHeading() {
        return this.welcomeMessageSubHeading;
    }

    public int hashCode() {
        String str = this.welcomeMessage;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.welcomeMessageSubHeading;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.accountProfileUrl;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.permissionIssues.hashCode();
    }

    public final void reloadPermissionIssues(Context context) {
        if (context != null) {
            this.permissionIssues.m49536i(new ActiveProfilePermissionIssues(!j4d.m33212S(context), !j4d.a0(context), !j4d.o0(context), null, 8, null));
        }
    }

    public final void setAccountProfileUrl(String str) {
        this.accountProfileUrl = str;
    }

    public final void setPermissionIssues(t7c t7cVar) {
        sq8.m48649h(t7cVar, "<set-?>");
        this.permissionIssues = t7cVar;
    }

    public final void setWelcomeMessage(String str) {
        this.welcomeMessage = str;
    }

    public final void setWelcomeMessageSubHeading(String str) {
        this.welcomeMessageSubHeading = str;
    }

    public String toString() {
        return "ActiveProfile(welcomeMessage=" + this.welcomeMessage + ", welcomeMessageSubHeading=" + this.welcomeMessageSubHeading + ", accountProfileUrl=" + this.accountProfileUrl + ", permissionIssues=" + this.permissionIssues + ")";
    }

    public ActiveProfile(String str, String str2, String str3, t7c t7cVar) {
        sq8.m48649h(t7cVar, "permissionIssues");
        this.welcomeMessage = str;
        this.welcomeMessageSubHeading = str2;
        this.accountProfileUrl = str3;
        this.permissionIssues = t7cVar;
    }

    public /* synthetic */ ActiveProfile(String str, String str2, String str3, t7c t7cVar, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? new t7c(new ActiveProfilePermissionIssues(false, false, false, null, 15, null)) : t7cVar);
    }
}
