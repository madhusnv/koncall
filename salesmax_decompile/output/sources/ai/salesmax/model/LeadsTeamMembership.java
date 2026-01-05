package ai.salesmax.model;

import ai.salesmax.model.LeadsTeamMembership;
import com.amplifyframework.datastore.generated.model.Team;
import com.amplifyframework.datastore.generated.model.TeamMember;
import com.amplifyframework.datastore.generated.model.TeamRole;
import java.util.Optional;
import java.util.function.Function;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes.dex */
public final class LeadsTeamMembership {
    public static final int $stable = 8;
    private final TeamMember teamMember;

    public LeadsTeamMembership(TeamMember teamMember) {
        sq8.m48649h(teamMember, "teamMember");
        this.teamMember = teamMember;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LeadsUser _get_member_$lambda$2(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (LeadsUser) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_teamRole_$lambda$3(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Team _get_team_$lambda$0(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Team) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LeadsTeam _get_team_$lambda$1(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (LeadsTeam) xk7Var.invoke(obj);
    }

    public final Optional<LeadsUser> getMember() {
        Optional optionalOfNullable = Optional.ofNullable(this.teamMember.getUser());
        final LeadsTeamMembership$member$1 leadsTeamMembership$member$1 = LeadsTeamMembership$member$1.INSTANCE;
        Optional<LeadsUser> map = optionalOfNullable.map(new Function() { // from class: o.faa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadsTeamMembership._get_member_$lambda$2(leadsTeamMembership$member$1, obj);
            }
        });
        sq8.m48648g(map, "map(...)");
        return map;
    }

    public final Optional<LeadsTeam> getTeam() {
        Optional optionalOfNullable = Optional.ofNullable(this.teamMember);
        final LeadsTeamMembership$team$1 leadsTeamMembership$team$1 = LeadsTeamMembership$team$1.INSTANCE;
        Optional map = optionalOfNullable.map(new Function() { // from class: o.gaa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadsTeamMembership._get_team_$lambda$0(leadsTeamMembership$team$1, obj);
            }
        });
        final LeadsTeamMembership$team$2 leadsTeamMembership$team$2 = LeadsTeamMembership$team$2.INSTANCE;
        Optional<LeadsTeam> map2 = map.map(new Function() { // from class: o.haa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadsTeamMembership._get_team_$lambda$1(leadsTeamMembership$team$2, obj);
            }
        });
        sq8.m48648g(map2, "map(...)");
        return map2;
    }

    public final String getTeamRole() {
        Optional optionalOfNullable = Optional.ofNullable(this.teamMember.getTeamRole());
        final LeadsTeamMembership$teamRole$1 leadsTeamMembership$teamRole$1 = LeadsTeamMembership$teamRole$1.INSTANCE;
        Object objOrElse = optionalOfNullable.map(new Function() { // from class: o.eaa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadsTeamMembership._get_teamRole_$lambda$3(leadsTeamMembership$teamRole$1, obj);
            }
        }).orElse(TeamRole.REPORTEE.name());
        sq8.m48648g(objOrElse, "orElse(...)");
        return (String) objOrElse;
    }
}
