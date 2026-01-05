package ai.salesmax.model;

import com.amplifyframework.datastore.generated.model.Team;
import com.amplifyframework.datastore.generated.model.TeamMember;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes.dex */
public final class LeadsTeamMembership$team$1 extends kf9 implements xk7 {
    public static final LeadsTeamMembership$team$1 INSTANCE = new LeadsTeamMembership$team$1();

    public LeadsTeamMembership$team$1() {
        super(1);
    }

    @Override // p001o.xk7
    public final Team invoke(TeamMember teamMember) {
        sq8.m48649h(teamMember, "obj");
        return teamMember.getTeam();
    }
}
