package ai.salesmax.model;

import com.amplifyframework.datastore.generated.model.AccountMemberActivity;
import p001o.kf9;
import p001o.xk7;

/* loaded from: classes.dex */
public final class AccountMemberActivitySummary$lastActivityBody$1 extends kf9 implements xk7 {
    public static final AccountMemberActivitySummary$lastActivityBody$1 INSTANCE = new AccountMemberActivitySummary$lastActivityBody$1();

    public AccountMemberActivitySummary$lastActivityBody$1() {
        super(1);
    }

    @Override // p001o.xk7
    public final String invoke(AccountMemberActivity accountMemberActivity) {
        return accountMemberActivity.getLastActivityBody();
    }
}
