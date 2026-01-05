package ai.salesmax.model;

import com.amplifyframework.datastore.generated.model.TeamMember;
import com.amplifyframework.datastore.generated.model.TeamRole;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes.dex */
public final class LeadsUser$teamRole$1 extends kf9 implements xk7 {
    public static final LeadsUser$teamRole$1 INSTANCE = new LeadsUser$teamRole$1();

    public LeadsUser$teamRole$1() {
        super(1);
    }

    @Override // p001o.xk7
    public final TeamRole invoke(TeamMember teamMember) {
        sq8.m48649h(teamMember, "obj");
        return teamMember.getTeamRole();
    }
}
