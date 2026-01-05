package p001o;

import com.amazonaws.amplify.generated.graphql.CreateTeamMutation;
import com.amazonaws.amplify.generated.graphql.DeleteTeamMutation;
import com.amazonaws.amplify.generated.graphql.GetTeamQuery;
import com.amazonaws.amplify.generated.graphql.TeamsByAccountQuery;
import com.amazonaws.amplify.generated.graphql.UpdateTeamMutation;
import com.amazonaws.util.StringUtils;
import com.amplifyframework.api.aws.GsonVariablesSerializer;
import com.amplifyframework.api.graphql.GraphQLResponse;
import com.amplifyframework.api.graphql.SimpleGraphQLRequest;
import com.amplifyframework.datastore.generated.model.ModelTeamConnection;
import com.amplifyframework.datastore.generated.model.Team;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import type.CreateTeamInput;
import type.DeleteTeamInput;
import type.UpdateTeamInput;

/* loaded from: classes.dex */
public interface hdh extends me1 {
    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default Team Zc(GetTeamQuery.GetTeam getTeam) {
        return (Team) sf(getTeam, Team.class);
    }

    /* renamed from: p */
    static /* synthetic */ boolean m30277p(String str) {
        return !StringUtils.isBlank(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default ModelTeamConnection qb(TeamsByAccountQuery.TeamsByAccount teamsByAccount) {
        return (ModelTeamConnection) sf(teamsByAccount, ModelTeamConnection.class);
    }

    default x6c Ag(String str) {
        return graphqlMutation(DeleteTeamMutation.builder().input(DeleteTeamInput.builder().id(str).build()).build(), DeleteTeamMutation.Data.class, new Function() { // from class: o.wch
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DeleteTeamMutation.Data) obj).deleteTeam();
            }
        }, Team.class);
    }

    default x6c Hl(String str, String str2, String str3, boolean z) {
        return graphqlMutation(CreateTeamMutation.builder().input(CreateTeamInput.builder().accountId(on()).teamName(str).teamLeadUserId(str2).description(str3).includeAsTL(Boolean.valueOf(z)).build()).build(), CreateTeamMutation.Data.class, new Function() { // from class: o.xch
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((CreateTeamMutation.Data) obj).createTeam();
            }
        }, Team.class);
    }

    default x6c Ko(String str, int i) {
        TeamsByAccountQuery teamsByAccountQueryBuild = TeamsByAccountQuery.builder().accountId(str).limit(Integer.valueOf(i)).build();
        return executeGraphQL(new SimpleGraphQLRequest(teamsByAccountQueryBuild.queryDocument(), toVariablesMap(teamsByAccountQueryBuild), TeamsByAccountQuery.Data.class, new GsonVariablesSerializer())).m55014i(new tch(this)).m27844k(new rl7() { // from class: o.fdh
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return (TeamsByAccountQuery.Data) ((GraphQLResponse) obj).getData();
            }
        }).m27844k(new rl7() { // from class: o.gdh
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return ((TeamsByAccountQuery.Data) obj).teamsByAccount();
            }
        }).m27844k(new rl7() { // from class: o.uch
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f48725a.qb((TeamsByAccountQuery.TeamsByAccount) obj);
            }
        }).m27844k(new rl7() { // from class: o.vch
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return ((ModelTeamConnection) obj).getItems();
            }
        }).m27846n();
    }

    default x6c l2(String str, String str2, String str3) {
        if (!Optional.ofNullable(str).filter(new Predicate() { // from class: o.bdh
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return hdh.m30277p((String) obj);
            }
        }).isPresent()) {
            return x6c.m55694H(new RuntimeException("Team doesn't exists, please create team before update"));
        }
        final UpdateTeamInput.Builder builderId = UpdateTeamInput.builder().id(str);
        Optional optionalOfNullable = Optional.ofNullable(str2);
        Objects.requireNonNull(builderId);
        optionalOfNullable.ifPresent(new Consumer() { // from class: o.cdh
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderId.teamName((String) obj);
            }
        });
        Optional.ofNullable(str3).ifPresent(new Consumer() { // from class: o.ddh
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderId.description((String) obj);
            }
        });
        return graphqlMutation(UpdateTeamMutation.builder().input(builderId.build()).build(), UpdateTeamMutation.Data.class, new Function() { // from class: o.edh
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((UpdateTeamMutation.Data) obj).updateTeam();
            }
        }, Team.class);
    }

    default x6c s5(String str) {
        GetTeamQuery getTeamQueryBuild = GetTeamQuery.builder().id(str).build();
        return executeGraphQL(new SimpleGraphQLRequest(getTeamQueryBuild.queryDocument(), toVariablesMap(getTeamQueryBuild), GetTeamQuery.Data.class, new GsonVariablesSerializer())).m55014i(new tch(this)).m27844k(new rl7() { // from class: o.ych
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return (GetTeamQuery.Data) ((GraphQLResponse) obj).getData();
            }
        }).m27844k(new rl7() { // from class: o.zch
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return ((GetTeamQuery.Data) obj).getTeam();
            }
        }).m27844k(new rl7() { // from class: o.adh
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f14553a.Zc((GetTeamQuery.GetTeam) obj);
            }
        }).m27846n();
    }
}
