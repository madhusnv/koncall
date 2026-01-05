package ai.salesmax.model;

import com.amplifyframework.datastore.generated.model.Team;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes.dex */
public final class LeadsSummary$teamAssignedTo$1 extends kf9 implements xk7 {
    public static final LeadsSummary$teamAssignedTo$1 INSTANCE = new LeadsSummary$teamAssignedTo$1();

    public LeadsSummary$teamAssignedTo$1() {
        super(1);
    }

    @Override // p001o.xk7
    public final String invoke(Team team) {
        sq8.m48649h(team, "obj");
        return team.getTeamName();
    }
}
