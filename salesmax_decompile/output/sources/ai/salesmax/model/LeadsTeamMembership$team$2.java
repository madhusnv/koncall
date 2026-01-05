package ai.salesmax.model;

import com.amplifyframework.datastore.generated.model.Team;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes.dex */
public final class LeadsTeamMembership$team$2 extends kf9 implements xk7 {
    public static final LeadsTeamMembership$team$2 INSTANCE = new LeadsTeamMembership$team$2();

    public LeadsTeamMembership$team$2() {
        super(1);
    }

    @Override // p001o.xk7
    public final LeadsTeam invoke(Team team) {
        sq8.m48646e(team);
        return new LeadsTeam(team);
    }
}
