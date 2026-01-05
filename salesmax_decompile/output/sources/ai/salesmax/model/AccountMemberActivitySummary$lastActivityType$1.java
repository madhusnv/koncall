package ai.salesmax.model;

import com.amplifyframework.datastore.generated.model.AccountMemberActivity;
import com.amplifyframework.datastore.generated.model.ActivityType;
import p001o.kf9;
import p001o.xk7;

/* loaded from: classes.dex */
public final class AccountMemberActivitySummary$lastActivityType$1 extends kf9 implements xk7 {
    public static final AccountMemberActivitySummary$lastActivityType$1 INSTANCE = new AccountMemberActivitySummary$lastActivityType$1();

    public AccountMemberActivitySummary$lastActivityType$1() {
        super(1);
    }

    @Override // p001o.xk7
    public final String invoke(AccountMemberActivity accountMemberActivity) {
        ActivityType lastActivityType = accountMemberActivity.getLastActivityType();
        if (lastActivityType != null) {
            return lastActivityType.name();
        }
        return null;
    }
}
