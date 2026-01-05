package ai.salesmax.model;

import com.amplifyframework.datastore.generated.model.TeamMember;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes.dex */
public final class LeadsUser$teamMemberId$1 extends kf9 implements xk7 {
    public static final LeadsUser$teamMemberId$1 INSTANCE = new LeadsUser$teamMemberId$1();

    public LeadsUser$teamMemberId$1() {
        super(1);
    }

    @Override // p001o.xk7
    public final String invoke(TeamMember teamMember) {
        sq8.m48649h(teamMember, "obj");
        return teamMember.getId();
    }
}
