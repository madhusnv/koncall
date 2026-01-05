package ai.salesmax.model;

import ai.salesmax.model.LeadsUser;
import com.amplifyframework.datastore.generated.model.AccountMembership;
import com.amplifyframework.datastore.generated.model.AddedSourceType;
import com.amplifyframework.datastore.generated.model.TeamMember;
import com.amplifyframework.datastore.generated.model.TeamRole;
import com.amplifyframework.datastore.generated.model.User;
import com.amplifyframework.datastore.generated.model.UserRegistrationStatus;
import com.amplifyframework.datastore.generated.model.UserStatus;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import p001o.f9g;
import p001o.id5;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes.dex */
public final class LeadsUser {
    private AccountMemberActivitySummary __accountMemberActivity;
    private final Optional<AccountMembership> accountMembership;
    private boolean isSelected;
    private boolean showBottom;
    private boolean showSelection;
    private final Optional<TeamMember> teamMember;
    private User user;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final User newInstance() {
            User userBuild = User.builder().addedSourceType(AddedSourceType.ADMIN_ADDED).name("").registeredNumber("").userRegistrationStatus(UserRegistrationStatus.CONFIRMED).id("").build();
            sq8.m48648g(userBuild, "build(...)");
            return userBuild;
        }
    }

    public LeadsUser() {
        this(null, null, null, null, 15, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_accountMembershipId_$lambda$8(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_authorizationLevel_$lambda$7(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_designation_$lambda$4(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_email_$lambda$2(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_id_$lambda$13(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_name_$lambda$0(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_profilePic_$lambda$9(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_registeredNumber_$lambda$1(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_secondaryNumber_$lambda$3(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_signature_$lambda$5(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_teamMemberId_$lambda$12(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TeamRole _get_teamRole_$lambda$10(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (TeamRole) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_teamRole_$lambda$11(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_userAccountStatus_$lambda$6(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof LeadsUser)) {
            return false;
        }
        String id = this.user.getId();
        String id2 = ((LeadsUser) obj).user.getId();
        if (id2 == null) {
            id2 = "";
        }
        return Objects.equals(id, id2);
    }

    public final AccountMemberActivitySummary getAccountMemberActivity() {
        return this.__accountMemberActivity;
    }

    public final Optional<AccountMembership> getAccountMembership() {
        return this.accountMembership;
    }

    public final String getAccountMembershipId() {
        Optional<AccountMembership> optional = this.accountMembership;
        final LeadsUser$accountMembershipId$1 leadsUser$accountMembershipId$1 = LeadsUser$accountMembershipId$1.INSTANCE;
        return (String) optional.map(new Function() { // from class: o.paa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadsUser._get_accountMembershipId_$lambda$8(leadsUser$accountMembershipId$1, obj);
            }
        }).orElse(null);
    }

    public final String getAuthorizationLevel() {
        Optional<AccountMembership> optional = this.accountMembership;
        final LeadsUser$authorizationLevel$1 leadsUser$authorizationLevel$1 = LeadsUser$authorizationLevel$1.INSTANCE;
        return (String) optional.map(new Function() { // from class: o.vaa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadsUser._get_authorizationLevel_$lambda$7(leadsUser$authorizationLevel$1, obj);
            }
        }).orElse(null);
    }

    public final String getDesignation() {
        Optional<AccountMembership> optional = this.accountMembership;
        final LeadsUser$designation$1 leadsUser$designation$1 = LeadsUser$designation$1.INSTANCE;
        Object objOrElse = optional.map(new Function() { // from class: o.laa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadsUser._get_designation_$lambda$4(leadsUser$designation$1, obj);
            }
        }).orElse("");
        sq8.m48648g(objOrElse, "orElse(...)");
        return (String) objOrElse;
    }

    public final String getEmail() {
        Optional optionalOfNullable = Optional.ofNullable(this.user);
        final LeadsUser$email$1 leadsUser$email$1 = LeadsUser$email$1.INSTANCE;
        Object objOrElse = optionalOfNullable.map(new Function() { // from class: o.qaa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadsUser._get_email_$lambda$2(leadsUser$email$1, obj);
            }
        }).orElse("");
        sq8.m48648g(objOrElse, "orElse(...)");
        return (String) objOrElse;
    }

    public final String getId() {
        Optional optionalOfNullable = Optional.ofNullable(this.user);
        final LeadsUser$id$1 leadsUser$id$1 = LeadsUser$id$1.INSTANCE;
        return (String) optionalOfNullable.map(new Function() { // from class: o.maa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadsUser._get_id_$lambda$13(leadsUser$id$1, obj);
            }
        }).orElse(null);
    }

    public final String getInCallStatus() {
        AccountMemberActivitySummary accountMemberActivity = getAccountMemberActivity();
        String inCallStatus = accountMemberActivity != null ? accountMemberActivity.getInCallStatus() : null;
        return inCallStatus == null ? "" : inCallStatus;
    }

    public final long getInCallUpdateTime() {
        AccountMemberActivitySummary accountMemberActivity = getAccountMemberActivity();
        Object objOrElse = Optional.ofNullable(accountMemberActivity != null ? accountMemberActivity.getInCallUpdatetime() : null).orElse(0L);
        sq8.m48648g(objOrElse, "orElse(...)");
        return ((Number) objOrElse).longValue();
    }

    public final String getLastActivityBody() {
        AccountMemberActivitySummary accountMemberActivity = getAccountMemberActivity();
        String lastActivityBody = accountMemberActivity != null ? accountMemberActivity.getLastActivityBody() : null;
        return lastActivityBody == null ? "" : lastActivityBody;
    }

    public final Long getLastActivityTime() {
        AccountMemberActivitySummary accountMemberActivity = getAccountMemberActivity();
        if ((accountMemberActivity != null ? accountMemberActivity.getLastActivityTime() : null) == null) {
            return 0L;
        }
        AccountMemberActivitySummary accountMemberActivity2 = getAccountMemberActivity();
        if (accountMemberActivity2 != null) {
            return accountMemberActivity2.getLastActivityTime();
        }
        return null;
    }

    public final String getLastActivityType() {
        AccountMemberActivitySummary accountMemberActivity = getAccountMemberActivity();
        String lastActivityType = accountMemberActivity != null ? accountMemberActivity.getLastActivityType() : null;
        return lastActivityType == null ? "" : lastActivityType;
    }

    public final String getName() {
        Optional optionalOfNullable = Optional.ofNullable(this.user);
        final LeadsUser$name$1 leadsUser$name$1 = LeadsUser$name$1.INSTANCE;
        Object objOrElse = optionalOfNullable.map(new Function() { // from class: o.xaa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadsUser._get_name_$lambda$0(leadsUser$name$1, obj);
            }
        }).orElse("");
        sq8.m48648g(objOrElse, "orElse(...)");
        return (String) objOrElse;
    }

    public final String getProfilePic() {
        Optional optionalOfNullable = Optional.ofNullable(this.user);
        final LeadsUser$profilePic$1 leadsUser$profilePic$1 = LeadsUser$profilePic$1.INSTANCE;
        Object objOrElse = optionalOfNullable.map(new Function() { // from class: o.oaa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadsUser._get_profilePic_$lambda$9(leadsUser$profilePic$1, obj);
            }
        }).orElse("");
        sq8.m48648g(objOrElse, "orElse(...)");
        return (String) objOrElse;
    }

    public final String getRegisteredNumber() {
        Optional optionalOfNullable = Optional.ofNullable(this.user);
        final LeadsUser$registeredNumber$1 leadsUser$registeredNumber$1 = LeadsUser$registeredNumber$1.INSTANCE;
        Object objOrElse = optionalOfNullable.map(new Function() { // from class: o.raa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadsUser._get_registeredNumber_$lambda$1(leadsUser$registeredNumber$1, obj);
            }
        }).orElse("");
        sq8.m48648g(objOrElse, "orElse(...)");
        return (String) objOrElse;
    }

    public final String getSecondaryNumber() {
        Optional optionalOfNullable = Optional.ofNullable(this.user);
        final LeadsUser$secondaryNumber$1 leadsUser$secondaryNumber$1 = LeadsUser$secondaryNumber$1.INSTANCE;
        Object objOrElse = optionalOfNullable.map(new Function() { // from class: o.naa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadsUser._get_secondaryNumber_$lambda$3(leadsUser$secondaryNumber$1, obj);
            }
        }).orElse("");
        sq8.m48648g(objOrElse, "orElse(...)");
        return (String) objOrElse;
    }

    public final boolean getShowBottom() {
        return this.showBottom;
    }

    public final boolean getShowSelection() {
        return this.showSelection;
    }

    public final String getSignature() {
        Optional<AccountMembership> optional = this.accountMembership;
        final LeadsUser$signature$1 leadsUser$signature$1 = LeadsUser$signature$1.INSTANCE;
        Object objOrElse = optional.map(new Function() { // from class: o.saa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadsUser._get_signature_$lambda$5(leadsUser$signature$1, obj);
            }
        }).orElse("");
        sq8.m48648g(objOrElse, "orElse(...)");
        return (String) objOrElse;
    }

    public final Optional<TeamMember> getTeamMember() {
        return this.teamMember;
    }

    public final String getTeamMemberId() {
        Optional<TeamMember> optional = this.teamMember;
        final LeadsUser$teamMemberId$1 leadsUser$teamMemberId$1 = LeadsUser$teamMemberId$1.INSTANCE;
        return (String) optional.map(new Function() { // from class: o.waa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadsUser._get_teamMemberId_$lambda$12(leadsUser$teamMemberId$1, obj);
            }
        }).orElse(null);
    }

    public final Optional<String> getTeamRole() {
        Optional<TeamMember> optional = this.teamMember;
        final LeadsUser$teamRole$1 leadsUser$teamRole$1 = LeadsUser$teamRole$1.INSTANCE;
        Optional<U> map = optional.map(new Function() { // from class: o.taa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadsUser._get_teamRole_$lambda$10(leadsUser$teamRole$1, obj);
            }
        });
        final LeadsUser$teamRole$2 leadsUser$teamRole$2 = LeadsUser$teamRole$2.INSTANCE;
        Optional<String> map2 = map.map(new Function() { // from class: o.uaa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadsUser._get_teamRole_$lambda$11(leadsUser$teamRole$2, obj);
            }
        });
        sq8.m48648g(map2, "map(...)");
        return map2;
    }

    public final User getUser() {
        return this.user;
    }

    public final String getUserAccountStatus() {
        Optional<AccountMembership> optional = this.accountMembership;
        final LeadsUser$userAccountStatus$1 leadsUser$userAccountStatus$1 = LeadsUser$userAccountStatus$1.INSTANCE;
        return (String) optional.map(new Function() { // from class: o.kaa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadsUser._get_userAccountStatus_$lambda$6(leadsUser$userAccountStatus$1, obj);
            }
        }).orElse(null);
    }

    public final String getUserActivityStatus() {
        String userAccountStatus = getUserAccountStatus();
        if (userAccountStatus == null) {
            userAccountStatus = "";
        }
        if (sq8.m48644c(userAccountStatus, "APPROVED")) {
            return "INVITED";
        }
        if (UserStatus.REQUESTED.name().equals(userAccountStatus)) {
            return "REQUESTED";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long lastActivityTime = getLastActivityTime();
        Long lValueOf = lastActivityTime != null ? Long.valueOf(lastActivityTime.longValue() | 0) : null;
        sq8.m48646e(lValueOf);
        long jLongValue = jCurrentTimeMillis - lValueOf.longValue();
        long inCallUpdateTime = jCurrentTimeMillis - getInCallUpdateTime();
        if (jLongValue > 900000.0d) {
            return "INACTIVE";
        }
        return (!(getInCallStatus().length() > 0) || ((double) inCallUpdateTime) >= 30000.0d || f9g.m26304N(getInCallStatus(), "Completed", true)) ? "ACTIVE" : "IN CALL";
    }

    public final AccountMemberActivitySummary get__accountMemberActivity() {
        return this.__accountMemberActivity;
    }

    public int hashCode() {
        return this.user.getId().hashCode();
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void refreshUnderlyingUser(User user) {
        sq8.m48649h(user, "newUser");
        this.user = user;
    }

    public final void setAccountMemberActivity(AccountMemberActivitySummary accountMemberActivitySummary) {
        this.__accountMemberActivity = accountMemberActivitySummary;
    }

    public final void setEmail(String str) {
        sq8.m48649h(str, "value");
        if (f9g.d0(str)) {
            return;
        }
        User userBuild = this.user.copyOfBuilder().registeredEmail(str).build();
        sq8.m48648g(userBuild, "build(...)");
        this.user = userBuild;
    }

    public final void setName(String str) {
        sq8.m48649h(str, "value");
        if (!f9g.d0(str)) {
            User userBuild = this.user.copyOfBuilder().name(str).build();
            sq8.m48648g(userBuild, "build(...)");
            this.user = userBuild;
        }
    }

    public final void setProfilePic(String str) {
        sq8.m48649h(str, "value");
        if (f9g.d0(str)) {
            return;
        }
        User userBuild = this.user.copyOfBuilder().profilePictureUrl(str).build();
        sq8.m48648g(userBuild, "build(...)");
        this.user = userBuild;
    }

    public final void setRegisteredNumber(String str) {
        sq8.m48649h(str, "value");
        if (f9g.d0(str)) {
            return;
        }
        User userBuild = this.user.copyOfBuilder().registeredNumber(str).build();
        sq8.m48648g(userBuild, "build(...)");
        this.user = userBuild;
    }

    public final void setSecondaryNumber(String str) {
        sq8.m48649h(str, "value");
        if (f9g.d0(str)) {
            return;
        }
        User userBuild = this.user.copyOfBuilder().secondaryNumber(str).build();
        sq8.m48648g(userBuild, "build(...)");
        this.user = userBuild;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    public final void setShowBottom(boolean z) {
        this.showBottom = z;
    }

    public final void setShowSelection(boolean z) {
        this.showSelection = z;
    }

    public final void setUser(User user) {
        sq8.m48649h(user, "<set-?>");
        this.user = user;
    }

    public final void set__accountMemberActivity(AccountMemberActivitySummary accountMemberActivitySummary) {
        this.__accountMemberActivity = accountMemberActivitySummary;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LeadsUser(User user) {
        this(user, null, null, null, 14, null);
        sq8.m48649h(user, "user");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LeadsUser(User user, Optional<AccountMembership> optional) {
        this(user, optional, null, null, 12, null);
        sq8.m48649h(user, "user");
        sq8.m48649h(optional, "accountMembership");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LeadsUser(User user, Optional<AccountMembership> optional, Optional<TeamMember> optional2) {
        this(user, optional, optional2, null, 8, null);
        sq8.m48649h(user, "user");
        sq8.m48649h(optional, "accountMembership");
        sq8.m48649h(optional2, "teamMember");
    }

    public LeadsUser(User user, Optional<AccountMembership> optional, Optional<TeamMember> optional2, AccountMemberActivitySummary accountMemberActivitySummary) {
        sq8.m48649h(user, "user");
        sq8.m48649h(optional, "accountMembership");
        sq8.m48649h(optional2, "teamMember");
        this.user = user;
        this.accountMembership = optional;
        this.teamMember = optional2;
        this.__accountMemberActivity = accountMemberActivitySummary;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LeadsUser(User user, Optional optional, Optional optional2, AccountMemberActivitySummary accountMemberActivitySummary, int i, id5 id5Var) {
        user = (i & 1) != 0 ? Companion.newInstance() : user;
        if ((i & 2) != 0) {
            optional = Optional.empty();
            sq8.m48648g(optional, "empty(...)");
        }
        if ((i & 4) != 0) {
            optional2 = Optional.empty();
            sq8.m48648g(optional2, "empty(...)");
        }
        this(user, optional, optional2, (i & 8) != 0 ? null : accountMemberActivitySummary);
    }
}
