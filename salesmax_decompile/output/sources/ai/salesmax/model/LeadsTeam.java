package ai.salesmax.model;

import ai.salesmax.model.LeadsTeam;
import com.amplifyframework.datastore.generated.model.Team;
import java.util.Date;
import java.util.Optional;
import java.util.function.Function;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes.dex */
public final class LeadsTeam {
    public static final int $stable = 8;
    private boolean isSelected;
    private final Team team;

    public LeadsTeam(Team team) {
        sq8.m48649h(team, "team");
        this.team = team;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LeadsUser _get_createdBy_$lambda$0(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (LeadsUser) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LeadsUser _get_updatedBy_$lambda$1(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (LeadsUser) xk7Var.invoke(obj);
    }

    public final Date getCreatedAt() {
        Date date = this.team.getCreatedAt().toDate();
        sq8.m48648g(date, "toDate(...)");
        return date;
    }

    public final Optional<LeadsUser> getCreatedBy() {
        Optional optionalOfNullable = Optional.ofNullable(this.team.getCreatedBy());
        final LeadsTeam$createdBy$1 leadsTeam$createdBy$1 = LeadsTeam$createdBy$1.INSTANCE;
        Optional<LeadsUser> map = optionalOfNullable.map(new Function() { // from class: o.u9a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadsTeam._get_createdBy_$lambda$0(leadsTeam$createdBy$1, obj);
            }
        });
        sq8.m48648g(map, "map(...)");
        return map;
    }

    public final String getDescription() {
        String description = this.team.getDescription();
        sq8.m48648g(description, "getDescription(...)");
        return description;
    }

    public final String getId() {
        String id = this.team.getId();
        sq8.m48648g(id, "getId(...)");
        return id;
    }

    public final String getTeamId() {
        String id = this.team.getId();
        sq8.m48648g(id, "getId(...)");
        return id;
    }

    public final String getTeamName() {
        String teamName = this.team.getTeamName();
        if (teamName != null) {
            return teamName;
        }
        String id = this.team.getId();
        sq8.m48648g(id, "getId(...)");
        return id;
    }

    public final Date getUpdatedAt() {
        Date date = this.team.getUpdatedAt().toDate();
        sq8.m48648g(date, "toDate(...)");
        return date;
    }

    public final Optional<LeadsUser> getUpdatedBy() {
        Optional optionalOfNullable = Optional.ofNullable(this.team.getUpdatedBy());
        final LeadsTeam$updatedBy$1 leadsTeam$updatedBy$1 = LeadsTeam$updatedBy$1.INSTANCE;
        Optional<LeadsUser> map = optionalOfNullable.map(new Function() { // from class: o.v9a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadsTeam._get_updatedBy_$lambda$1(leadsTeam$updatedBy$1, obj);
            }
        });
        sq8.m48648g(map, "map(...)");
        return map;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }
}
