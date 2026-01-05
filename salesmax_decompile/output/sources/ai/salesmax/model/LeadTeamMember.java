package ai.salesmax.model;

import com.amplifyframework.datastore.generated.model.AccountMembership;
import com.amplifyframework.datastore.generated.model.Team;
import com.amplifyframework.datastore.generated.model.TeamMember;
import com.amplifyframework.datastore.generated.model.TeamRole;
import com.amplifyframework.datastore.generated.model.User;
import java.util.Optional;
import p001o.a81;
import p001o.lpi;
import p001o.sq8;

/* loaded from: classes.dex */
public final class LeadTeamMember {
    public static final int $stable = 8;
    private final TeamMember teamMember;

    public LeadTeamMember(TeamMember teamMember) {
        sq8.m48649h(teamMember, "teamMember");
        this.teamMember = teamMember;
    }

    public final long getCreatedAt() {
        Long lM16645F = a81.m16645F(this.teamMember.getCreatedAt());
        sq8.m48648g(lM16645F, "toEpochMillis(...)");
        return lM16645F.longValue();
    }

    public final String getDescription() {
        Team team = this.teamMember.getTeam();
        String description = team != null ? team.getDescription() : null;
        return description == null ? "" : description;
    }

    public final String getId() {
        String id = this.teamMember.getId();
        sq8.m48648g(id, "getId(...)");
        return id;
    }

    public final String getMemberType() {
        return this.teamMember.getMemberType().name();
    }

    public final LeadsUser getMemberUser() {
        LeadsUser leadsUserA0 = lpi.a0(getUserId());
        sq8.m48648g(leadsUserA0, "getUserById(...)");
        return leadsUserA0;
    }

    public final String getProfilePic() {
        return this.teamMember.getUser().getProfilePictureUrl();
    }

    public final String getTeamID() {
        return this.teamMember.getTeamId();
    }

    public final TeamMember getTeamMember() {
        return this.teamMember;
    }

    public final String getTeamName() {
        Team team = this.teamMember.getTeam();
        if (team != null) {
            return team.getTeamName();
        }
        return null;
    }

    public final String getTeamRole() {
        TeamRole teamRole = this.teamMember.getTeamRole();
        if (teamRole != null) {
            return teamRole.name();
        }
        return null;
    }

    public final long getUpdatedAt() {
        Long lM16645F = a81.m16645F(this.teamMember.getUpdatedAt());
        sq8.m48648g(lM16645F, "toEpochMillis(...)");
        return lM16645F.longValue();
    }

    public final String getUserId() {
        String id = this.teamMember.getUser().getId();
        sq8.m48648g(id, "getId(...)");
        return id;
    }

    public final String getUserName() {
        return this.teamMember.getUser().getName();
    }

    public final LeadsUser toLeadsUser() {
        User user = getMemberUser().getUser();
        Optional<AccountMembership> accountMembership = getMemberUser().getAccountMembership();
        Optional optionalOf = Optional.of(this.teamMember);
        sq8.m48648g(optionalOf, "of(...)");
        return new LeadsUser(user, accountMembership, optionalOf, getMemberUser().get__accountMemberActivity());
    }
}
