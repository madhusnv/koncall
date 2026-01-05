package ai.salesmax.model;

import com.amplifyframework.datastore.generated.model.User;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes.dex */
public final class LeadsTeamMembership$member$1 extends kf9 implements xk7 {
    public static final LeadsTeamMembership$member$1 INSTANCE = new LeadsTeamMembership$member$1();

    public LeadsTeamMembership$member$1() {
        super(1);
    }

    @Override // p001o.xk7
    public final LeadsUser invoke(User user) {
        sq8.m48646e(user);
        return new LeadsUser(user, null, null, null, 14, null);
    }
}
