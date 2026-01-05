package ai.salesmax.model;

import com.amplifyframework.datastore.generated.model.Team;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes.dex */
public final class ActivitySummary$primaryTeam$1 extends kf9 implements xk7 {
    public static final ActivitySummary$primaryTeam$1 INSTANCE = new ActivitySummary$primaryTeam$1();

    public ActivitySummary$primaryTeam$1() {
        super(1);
    }

    @Override // p001o.xk7
    public final LeadsTeam invoke(Team team) {
        sq8.m48649h(team, "team");
        return new LeadsTeam(team);
    }
}
