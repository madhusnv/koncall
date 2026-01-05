package ai.salesmax.model;

import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class ProfileView {
    public static final int $stable = 8;
    private String accountName;
    private String businessLogo;
    private String fullName;

    public ProfileView() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ ProfileView copy$default(ProfileView profileView, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = profileView.fullName;
        }
        if ((i & 2) != 0) {
            str2 = profileView.accountName;
        }
        if ((i & 4) != 0) {
            str3 = profileView.businessLogo;
        }
        return profileView.copy(str, str2, str3);
    }

    public final String component1() {
        return this.fullName;
    }

    public final String component2() {
        return this.accountName;
    }

    public final String component3() {
        return this.businessLogo;
    }

    public final ProfileView copy(String str, String str2, String str3) {
        sq8.m48649h(str, "fullName");
        sq8.m48649h(str2, "accountName");
        return new ProfileView(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileView)) {
            return false;
        }
        ProfileView profileView = (ProfileView) obj;
        return sq8.m48644c(this.fullName, profileView.fullName) && sq8.m48644c(this.accountName, profileView.accountName) && sq8.m48644c(this.businessLogo, profileView.businessLogo);
    }

    public final String getAccountName() {
        return this.accountName;
    }

    public final String getBusinessLogo() {
        return this.businessLogo;
    }

    public final String getFullName() {
        return this.fullName;
    }

    public int hashCode() {
        int iHashCode = ((this.fullName.hashCode() * 31) + this.accountName.hashCode()) * 31;
        String str = this.businessLogo;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final void setAccountName(String str) {
        sq8.m48649h(str, "<set-?>");
        this.accountName = str;
    }

    public final void setBusinessLogo(String str) {
        this.businessLogo = str;
    }

    public final void setFullName(String str) {
        sq8.m48649h(str, "<set-?>");
        this.fullName = str;
    }

    public String toString() {
        return "ProfileView(fullName=" + this.fullName + ", accountName=" + this.accountName + ", businessLogo=" + this.businessLogo + ")";
    }

    public ProfileView(String str, String str2, String str3) {
        sq8.m48649h(str, "fullName");
        sq8.m48649h(str2, "accountName");
        this.fullName = str;
        this.accountName = str2;
        this.businessLogo = str3;
    }

    public /* synthetic */ ProfileView(String str, String str2, String str3, int i, id5 id5Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3);
    }
}
