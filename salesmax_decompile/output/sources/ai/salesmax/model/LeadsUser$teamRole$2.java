package ai.salesmax.model;

import com.amplifyframework.datastore.generated.model.TeamRole;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes.dex */
public final class LeadsUser$teamRole$2 extends kf9 implements xk7 {
    public static final LeadsUser$teamRole$2 INSTANCE = new LeadsUser$teamRole$2();

    public LeadsUser$teamRole$2() {
        super(1);
    }

    @Override // p001o.xk7
    public final String invoke(TeamRole teamRole) {
        sq8.m48649h(teamRole, "obj");
        return teamRole.name();
    }
}
