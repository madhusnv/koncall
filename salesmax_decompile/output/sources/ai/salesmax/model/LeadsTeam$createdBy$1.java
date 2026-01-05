package ai.salesmax.model;

import com.amplifyframework.datastore.generated.model.User;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes.dex */
public final class LeadsTeam$createdBy$1 extends kf9 implements xk7 {
    public static final LeadsTeam$createdBy$1 INSTANCE = new LeadsTeam$createdBy$1();

    public LeadsTeam$createdBy$1() {
        super(1);
    }

    @Override // p001o.xk7
    public final LeadsUser invoke(User user) {
        sq8.m48646e(user);
        return new LeadsUser(user, null, null, null, 14, null);
    }
}
