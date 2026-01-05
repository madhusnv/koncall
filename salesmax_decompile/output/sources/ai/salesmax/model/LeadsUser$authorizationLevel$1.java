package ai.salesmax.model;

import com.amplifyframework.datastore.generated.model.AccountMembership;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes.dex */
public final class LeadsUser$authorizationLevel$1 extends kf9 implements xk7 {
    public static final LeadsUser$authorizationLevel$1 INSTANCE = new LeadsUser$authorizationLevel$1();

    public LeadsUser$authorizationLevel$1() {
        super(1);
    }

    @Override // p001o.xk7
    public final String invoke(AccountMembership accountMembership) {
        sq8.m48649h(accountMembership, "obj");
        return accountMembership.getAuthorizationLevel().toString();
    }
}
