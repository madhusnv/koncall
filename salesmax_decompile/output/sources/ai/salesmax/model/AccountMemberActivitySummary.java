package ai.salesmax.model;

import ai.salesmax.model.AccountMemberActivitySummary;
import com.amplifyframework.datastore.generated.model.AccountMemberActivity;
import java.util.Optional;
import java.util.function.Function;
import p001o.id5;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes.dex */
public final class AccountMemberActivitySummary {
    public static final int $stable = 8;
    private AccountMemberActivity accountMemberActivity;

    /* JADX WARN: Multi-variable type inference failed */
    public AccountMemberActivitySummary() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_accountId_$lambda$2(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_id_$lambda$0(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long _get_inCallUpdatetime_$lambda$6(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Long) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_lastActivityBody_$lambda$5(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long _get_lastActivityTime_$lambda$3(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Long) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_lastActivityType_$lambda$4(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_userId_$lambda$1(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    public final String getAccountId() {
        Optional optionalOfNullable = Optional.ofNullable(this.accountMemberActivity);
        final AccountMemberActivitySummary$accountId$1 accountMemberActivitySummary$accountId$1 = AccountMemberActivitySummary$accountId$1.INSTANCE;
        return (String) optionalOfNullable.map(new Function() { // from class: o.ef
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return AccountMemberActivitySummary._get_accountId_$lambda$2(accountMemberActivitySummary$accountId$1, obj);
            }
        }).orElse(null);
    }

    public final AccountMemberActivity getAccountMemberActivity() {
        return this.accountMemberActivity;
    }

    public final String getId() {
        Optional optionalOfNullable = Optional.ofNullable(this.accountMemberActivity);
        final AccountMemberActivitySummary$id$1 accountMemberActivitySummary$id$1 = AccountMemberActivitySummary$id$1.INSTANCE;
        Object objOrElse = optionalOfNullable.map(new Function() { // from class: o.af
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return AccountMemberActivitySummary._get_id_$lambda$0(accountMemberActivitySummary$id$1, obj);
            }
        }).orElse("");
        sq8.m48648g(objOrElse, "orElse(...)");
        return (String) objOrElse;
    }

    public final String getInCallStatus() {
        AccountMemberActivity accountMemberActivity = this.accountMemberActivity;
        String inCall = accountMemberActivity != null ? accountMemberActivity.getInCall() : null;
        return inCall == null ? "" : inCall;
    }

    public final Long getInCallUpdatetime() {
        AccountMemberActivity accountMemberActivity = this.accountMemberActivity;
        Optional optionalOfNullable = Optional.ofNullable(accountMemberActivity != null ? accountMemberActivity.getLastInCallUpdatedAt() : null);
        final AccountMemberActivitySummary$inCallUpdatetime$1 accountMemberActivitySummary$inCallUpdatetime$1 = AccountMemberActivitySummary$inCallUpdatetime$1.INSTANCE;
        return (Long) optionalOfNullable.map(new Function() { // from class: o.ye
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return AccountMemberActivitySummary._get_inCallUpdatetime_$lambda$6(accountMemberActivitySummary$inCallUpdatetime$1, obj);
            }
        }).orElse(null);
    }

    public final String getLastActivityBody() {
        Optional optionalOfNullable = Optional.ofNullable(this.accountMemberActivity);
        final AccountMemberActivitySummary$lastActivityBody$1 accountMemberActivitySummary$lastActivityBody$1 = AccountMemberActivitySummary$lastActivityBody$1.INSTANCE;
        return (String) optionalOfNullable.map(new Function() { // from class: o.cf
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return AccountMemberActivitySummary._get_lastActivityBody_$lambda$5(accountMemberActivitySummary$lastActivityBody$1, obj);
            }
        }).orElse(null);
    }

    public final Long getLastActivityTime() {
        AccountMemberActivity accountMemberActivity = this.accountMemberActivity;
        Optional optionalOfNullable = Optional.ofNullable(accountMemberActivity != null ? accountMemberActivity.getLastActivityTime() : null);
        final AccountMemberActivitySummary$lastActivityTime$1 accountMemberActivitySummary$lastActivityTime$1 = AccountMemberActivitySummary$lastActivityTime$1.INSTANCE;
        return (Long) optionalOfNullable.map(new Function() { // from class: o.df
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return AccountMemberActivitySummary._get_lastActivityTime_$lambda$3(accountMemberActivitySummary$lastActivityTime$1, obj);
            }
        }).orElse(null);
    }

    public final String getLastActivityType() {
        Optional optionalOfNullable = Optional.ofNullable(this.accountMemberActivity);
        final AccountMemberActivitySummary$lastActivityType$1 accountMemberActivitySummary$lastActivityType$1 = AccountMemberActivitySummary$lastActivityType$1.INSTANCE;
        return (String) optionalOfNullable.map(new Function() { // from class: o.ze
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return AccountMemberActivitySummary._get_lastActivityType_$lambda$4(accountMemberActivitySummary$lastActivityType$1, obj);
            }
        }).orElse(null);
    }

    public final String getUserId() {
        Optional optionalOfNullable = Optional.ofNullable(this.accountMemberActivity);
        final AccountMemberActivitySummary$userId$1 accountMemberActivitySummary$userId$1 = AccountMemberActivitySummary$userId$1.INSTANCE;
        return (String) optionalOfNullable.map(new Function() { // from class: o.bf
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return AccountMemberActivitySummary._get_userId_$lambda$1(accountMemberActivitySummary$userId$1, obj);
            }
        }).orElse(null);
    }

    public final void setAccountMemberActivity(AccountMemberActivity accountMemberActivity) {
        sq8.m48649h(accountMemberActivity, "<set-?>");
        this.accountMemberActivity = accountMemberActivity;
    }

    public AccountMemberActivitySummary(AccountMemberActivity accountMemberActivity) {
        sq8.m48649h(accountMemberActivity, "accountMemberActivity");
        this.accountMemberActivity = accountMemberActivity;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AccountMemberActivitySummary(AccountMemberActivity accountMemberActivity, int i, id5 id5Var) {
        if ((i & 1) != 0) {
            accountMemberActivity = AccountMemberActivity.justId("");
            sq8.m48648g(accountMemberActivity, "justId(...)");
        }
        this(accountMemberActivity);
    }
}
