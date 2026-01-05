package ai.salesmax.model;

import p001o.id5;
import p001o.sq8;
import type.AuthorizationLevel;

/* loaded from: classes.dex */
public final class AccountMemberInvitation {
    public static final int $stable = 0;
    private final String accountEmailId;
    private final String accountName;
    private final AuthorizationLevel authorizationLevel;
    private final String emailId;
    private final String name;
    private final String phoneNumber;
    private final String profilePic;

    public AccountMemberInvitation(String str, String str2, AuthorizationLevel authorizationLevel, String str3, String str4, String str5, String str6) {
        sq8.m48649h(str, "phoneNumber");
        sq8.m48649h(str2, "name");
        sq8.m48649h(authorizationLevel, "authorizationLevel");
        this.phoneNumber = str;
        this.name = str2;
        this.authorizationLevel = authorizationLevel;
        this.emailId = str3;
        this.accountEmailId = str4;
        this.accountName = str5;
        this.profilePic = str6;
    }

    public final String getAccountEmailId() {
        return this.accountEmailId;
    }

    public final String getAccountName() {
        return this.accountName;
    }

    public final AuthorizationLevel getAuthorizationLevel() {
        return this.authorizationLevel;
    }

    public final String getEmailId() {
        return this.emailId;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final String getProfilePic() {
        return this.profilePic;
    }

    public /* synthetic */ AccountMemberInvitation(String str, String str2, AuthorizationLevel authorizationLevel, String str3, String str4, String str5, String str6, int i, id5 id5Var) {
        this(str, str2, (i & 4) != 0 ? AuthorizationLevel.MEMBER : authorizationLevel, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6);
    }
}
