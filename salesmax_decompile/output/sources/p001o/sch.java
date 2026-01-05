package p001o;

import com.amazonaws.amplify.generated.graphql.CreateTeamMemberMutation;
import com.amazonaws.amplify.generated.graphql.DeleteTeamMemberMutation;
import com.amazonaws.amplify.generated.graphql.GetTeamMemberQuery;
import com.amazonaws.amplify.generated.graphql.MemberByTeamQuery;
import com.amazonaws.amplify.generated.graphql.UpdateTeamMemberMutation;
import com.amplifyframework.api.aws.GsonVariablesSerializer;
import com.amplifyframework.api.graphql.GraphQLResponse;
import com.amplifyframework.api.graphql.SimpleGraphQLRequest;
import com.amplifyframework.datastore.generated.model.TeamMember;
import com.amplifyframework.rx.RxAmplify;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import type.CreateTeamMemberInput;
import type.DeleteTeamMemberInput;
import type.ModelIDInput;
import type.ModelIDKeyConditionInput;
import type.ModelTeamMemberFilterInput;
import type.TeamMemberType;
import type.TeamRole;
import type.UpdateTeamMemberInput;

/* loaded from: classes.dex */
public interface sch extends ja8 {
    static /* synthetic */ Map Bd(Map map) {
        return (Map) map.get("memberByTeam");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default TeamMember Ef(Map map) {
        return (TeamMember) sf(map, TeamMember.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default List Io(List list) {
        return (List) list.stream().map(new Function() { // from class: o.dch
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f19594a.Rh((Map) obj);
            }
        }).filter(new Predicate() { // from class: o.ech
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return sch.a3((TeamMember) obj);
            }
        }).collect(Collectors.toList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default List Is(List list) {
        return (List) list.stream().map(new Function() { // from class: o.ubh
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f48698a.Ef((Map) obj);
            }
        }).filter(new Predicate() { // from class: o.vbh
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return sch.Wr((TeamMember) obj);
            }
        }).collect(Collectors.toList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default TeamMember J3(UpdateTeamMemberMutation.UpdateTeamMember updateTeamMember) {
        return (TeamMember) sf(updateTeamMember, TeamMember.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default List Jg(List list) {
        return (List) list.stream().map(new Function() { // from class: o.wbh
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f51753a.oj((Map) obj);
            }
        }).collect(Collectors.toList());
    }

    static /* synthetic */ boolean Jw(TeamMember teamMember) {
        return !Objects.isNull(teamMember.getTeam());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default TeamMember Rh(Map map) {
        return (TeamMember) sf(map, TeamMember.class);
    }

    static /* synthetic */ boolean Wr(TeamMember teamMember) {
        return !Objects.isNull(teamMember.getTeam());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default x6c Wx(Map.Entry entry) {
        return Ms((String) entry.getKey(), (TeamRole) entry.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default x8c Xz(SimpleGraphQLRequest simpleGraphQLRequest, Boolean bool) {
        return !bool.booleanValue() ? x6c.m55694H(new RuntimeException("The account subscription has expired")) : RxAmplify.API.mutate(simpleGraphQLRequest).m55014i(new gbh(this)).m27844k(new rl7() { // from class: o.ich
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return (UpdateTeamMemberMutation.Data) ((GraphQLResponse) obj).getData();
            }
        }).m27844k(new rl7() { // from class: o.jch
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return ((UpdateTeamMemberMutation.Data) obj).updateTeamMember();
            }
        }).m27845m().m47686M(new rl7() { // from class: o.kch
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f31930a.J3((UpdateTeamMemberMutation.UpdateTeamMember) obj);
            }
        }).h0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default x8c Yj(SimpleGraphQLRequest simpleGraphQLRequest, Boolean bool) {
        return !bool.booleanValue() ? x6c.m55694H(new RuntimeException("The account subscription has expired")) : RxAmplify.API.mutate(simpleGraphQLRequest).m55014i(new gbh(this)).m27844k(new rl7() { // from class: o.fch
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return (CreateTeamMemberMutation.Data) ((GraphQLResponse) obj).getData();
            }
        }).m27844k(new rl7() { // from class: o.gch
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return ((CreateTeamMemberMutation.Data) obj).createTeamMember();
            }
        }).m27845m().m47686M(new rl7() { // from class: o.hch
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f26666a.m48215m((CreateTeamMemberMutation.CreateTeamMember) obj);
            }
        }).h0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default x8c Zx(TeamMember teamMember) {
        return H6(teamMember.getId());
    }

    static /* synthetic */ boolean a3(TeamMember teamMember) {
        return !Objects.isNull(teamMember.getTeam());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default x8c b5(SimpleGraphQLRequest simpleGraphQLRequest, Boolean bool) {
        return !bool.booleanValue() ? x6c.m55694H(new RuntimeException("The account subscription has expired")) : RxAmplify.API.mutate(simpleGraphQLRequest).m55014i(new gbh(this)).m27844k(new rl7() { // from class: o.xbh
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return (DeleteTeamMemberMutation.Data) ((GraphQLResponse) obj).getData();
            }
        }).m27844k(new rl7() { // from class: o.ybh
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return ((DeleteTeamMemberMutation.Data) obj).deleteTeamMember();
            }
        }).m27845m().m47686M(new rl7() { // from class: o.zbh
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f56918a.xq((DeleteTeamMemberMutation.DeleteTeamMember) obj);
            }
        }).h0();
    }

    static /* synthetic */ Map ck(Map map) {
        return (Map) map.get("memberByTeam");
    }

    static /* synthetic */ List ea(Map map) {
        return (List) Optional.ofNullable(map.get("items")).orElseGet(new bch());
    }

    static /* synthetic */ Map gb(Map map) {
        return (Map) map.get("memberByTeam");
    }

    static /* synthetic */ Iterable l7(List list) {
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    /* synthetic */ default TeamMember m48215m(CreateTeamMemberMutation.CreateTeamMember createTeamMember) {
        return (TeamMember) sf(createTeamMember, TeamMember.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default TeamMember oj(Map map) {
        return (TeamMember) sf(map, TeamMember.class);
    }

    static /* synthetic */ List pf(Map map) {
        return (List) map.get("items");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default TeamMember po(Map map) {
        return (TeamMember) sf(map, TeamMember.class);
    }

    static /* synthetic */ boolean ri(List list, TeamMember teamMember) {
        return list.contains(teamMember.getUserId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default x6c sr(String str, String str2, Map.Entry entry) {
        return Oc(str, (TeamRole) entry.getValue(), str2, (String) entry.getKey());
    }

    static /* synthetic */ Map v9(Map map) {
        return (Map) map.get("getTeamMember");
    }

    static /* synthetic */ List xd(Map map) {
        return (List) map.get("items");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default TeamMember xq(DeleteTeamMemberMutation.DeleteTeamMember deleteTeamMember) {
        return (TeamMember) sf(deleteTeamMember, TeamMember.class);
    }

    default x6c Dt(final String str, final TeamRole teamRole, final String str2, List list) {
        return x6c.e0((List) list.stream().map(new Function() { // from class: o.hbh
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f26594a.Oc(str, teamRole, str2, (String) obj);
            }
        }).collect(Collectors.toList())).m55732l(new rr(), new rch()).m55027y();
    }

    default x6c H6(String str) {
        DeleteTeamMemberMutation deleteTeamMemberMutationBuild = DeleteTeamMemberMutation.builder().input(DeleteTeamMemberInput.builder().id(str).build()).build();
        final SimpleGraphQLRequest simpleGraphQLRequest = new SimpleGraphQLRequest(deleteTeamMemberMutationBuild.queryDocument(), toVariablesMap(deleteTeamMemberMutationBuild), DeleteTeamMemberMutation.Data.class, new GsonVariablesSerializer());
        return isAccountSubscriptionActive().m55717M(new rl7() { // from class: o.pch
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f39830a.b5(simpleGraphQLRequest, (Boolean) obj);
            }
        });
    }

    default x6c Ms(String str, TeamRole teamRole) {
        UpdateTeamMemberMutation updateTeamMemberMutationBuild = UpdateTeamMemberMutation.builder().input(UpdateTeamMemberInput.builder().id(str).teamRole(teamRole).build()).build();
        final SimpleGraphQLRequest simpleGraphQLRequest = new SimpleGraphQLRequest(updateTeamMemberMutationBuild.queryDocument(), toVariablesMap(updateTeamMemberMutationBuild), UpdateTeamMemberMutation.Data.class, new GsonVariablesSerializer());
        return isAccountSubscriptionActive().m55717M(new rl7() { // from class: o.ach
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f14515a.Xz(simpleGraphQLRequest, (Boolean) obj);
            }
        });
    }

    default x6c Qp(String str, String str2) {
        return ti(str, str2, 1000);
    }

    /* renamed from: We, reason: merged with bridge method [inline-methods] */
    default x6c Oc(String str, TeamRole teamRole, String str2, String str3) {
        if (isDummyAccount(str2).booleanValue()) {
            return x6c.m55694H(new RuntimeException(String.format("Can't invite users to personal account", new Object[0])));
        }
        CreateTeamMemberMutation createTeamMemberMutationBuild = CreateTeamMemberMutation.builder().input(CreateTeamMemberInput.builder().accountId(str2).teamId(str).memberType(TeamMemberType.USER).memberId(str3).teamRole(teamRole).build()).build();
        final SimpleGraphQLRequest simpleGraphQLRequest = new SimpleGraphQLRequest(createTeamMemberMutationBuild.queryDocument(), toVariablesMap(createTeamMemberMutationBuild), CreateTeamMemberMutation.Data.class, new GsonVariablesSerializer());
        return isAccountSubscriptionActive().m55717M(new rl7() { // from class: o.tbh
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f46787a.Yj(simpleGraphQLRequest, (Boolean) obj);
            }
        });
    }

    default x6c Yo(final String str, final String str2, Map map) {
        return x6c.e0((List) map.entrySet().stream().map(new Function() { // from class: o.ibh
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f28440a.sr(str, str2, (Map.Entry) obj);
            }
        }).collect(Collectors.toList())).m55732l(new rr(), new rch()).m55027y();
    }

    /* renamed from: n */
    default x6c m48216n(Map map) {
        return x6c.e0((List) map.entrySet().stream().map(new Function() { // from class: o.qch
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f41633a.Wx((Map.Entry) obj);
            }
        }).collect(Collectors.toList())).m55732l(new rr(), new rch()).m55027y();
    }

    default x6c pb(String str, String str2) {
        return executeGraphQL(new SimpleGraphQLRequest("query MemberByTeam($accountId: ID, $teamId: ModelIDKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelTeamMemberFilterInput, $limit: Int, $nextToken: String) {\n  memberByTeam(accountId: $accountId, teamId: $teamId, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      teamId\n       team{\n          id\n          teamName\n          description\n       }\n      accountId\n      teamRole\n      updatedById\n      createdById\n      userId\n      user {\n         id\n         name\n         registeredEmail\n         registeredNumber\n         profilePictureUrl\n       }\n      memberTeamId\n      memberType\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}", toVariablesMap(MemberByTeamQuery.builder().accountId(str2).teamId(ModelIDKeyConditionInput.builder().eq(str).build()).build()), Map.class, new GsonVariablesSerializer())).m55014i(new gbh(this)).m27844k(new ml()).m27844k(new rl7() { // from class: o.mbh
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return sch.Bd((Map) obj);
            }
        }).m27844k(new rl7() { // from class: o.nbh
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return sch.pf((Map) obj);
            }
        }).m27844k(new rl7() { // from class: o.obh
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f38090a.Io((List) obj);
            }
        }).m27846n();
    }

    default x6c ti(String str, String str2, int i) {
        return executeGraphQL(new SimpleGraphQLRequest("query MemberByTeam($accountId: ID, $teamId: ModelIDKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelTeamMemberFilterInput, $limit: Int, $nextToken: String) {\n  memberByTeam(accountId: $accountId, teamId: $teamId, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      teamId\n       team{\n          id\n          teamName\n          description\n       }\n      accountId\n      teamRole\n      updatedById\n      createdById\n      userId\n      user {\n         id\n         name\n         registeredEmail\n         registeredNumber\n         profilePictureUrl\n       }\n      memberTeamId\n      memberType\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}", toVariablesMap(MemberByTeamQuery.builder().accountId(str2).limit(Integer.valueOf(i)).filter(ModelTeamMemberFilterInput.builder().userId(ModelIDInput.builder().eq(str).build()).build()).build()), Map.class, new GsonVariablesSerializer())).m55014i(new gbh(this)).m27844k(new ml()).m27844k(new rl7() { // from class: o.jbh
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return sch.ck((Map) obj);
            }
        }).m27844k(new rl7() { // from class: o.kbh
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return sch.xd((Map) obj);
            }
        }).m27844k(new rl7() { // from class: o.lbh
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f33580a.Is((List) obj);
            }
        }).m27846n();
    }

    default x6c u4(String str, String str2, int i) {
        return executeGraphQL(new SimpleGraphQLRequest("query MemberByTeam($accountId: ID, $teamId: ModelIDKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelTeamMemberFilterInput, $limit: Int, $nextToken: String) {\n    memberByTeam(accountId: $accountId, teamId: $teamId, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n        __typename\n        items {\n            __typename\n            id\n            teamId\n            accountId\n            teamRole\n            memberType\n            createdAt\n            updatedAt\n        }\n        nextToken\n    }\n}\n", toVariablesMap(MemberByTeamQuery.builder().accountId(str2).limit(Integer.valueOf(i)).filter(ModelTeamMemberFilterInput.builder().userId(ModelIDInput.builder().eq(str).build()).build()).build()), Map.class, new GsonVariablesSerializer())).m55014i(new gbh(this)).m27844k(new ml()).m27844k(new rl7() { // from class: o.pbh
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return sch.gb((Map) obj);
            }
        }).m27844k(new rl7() { // from class: o.qbh
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return sch.ea((Map) obj);
            }
        }).m27844k(new rl7() { // from class: o.sbh
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f45161a.Jg((List) obj);
            }
        }).m27846n();
    }

    /* renamed from: y */
    default x6c m48217y(String str) {
        return executeGraphQL(new SimpleGraphQLRequest("query GetTeamMember($id: ID!) {\n  getTeamMember(id: $id) {\n    __typename\n    id\n    teamId\n    team {\n      id\n      teamName\n      description\n    }\n    accountId\n    teamRole\n    updatedById\n    createdById\n    userId\n    user {\n        id\n        name\n        registeredEmail\n        registeredNumber\n        profilePictureUrl\n     }\n    memberType\n    memberTeamId\n    createdAt\n    updatedAt\n  }\n}", toVariablesMap(GetTeamMemberQuery.builder().id(str).build()), Map.class, new GsonVariablesSerializer())).m55014i(new gbh(this)).m27844k(new ml()).m27844k(new rl7() { // from class: o.rbh
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return sch.v9((Map) obj);
            }
        }).m27844k(new rl7() { // from class: o.cch
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f17853a.po((Map) obj);
            }
        }).m27841g(new ggd() { // from class: o.lch
            @Override // p001o.ggd
            public final boolean test(Object obj) {
                return sch.Jw((TeamMember) obj);
            }
        }).m27846n();
    }

    default x6c yc(String str, final List list, String str2) {
        return isDummyAccount(str2).booleanValue() ? x6c.m55694H(new RuntimeException(String.format("Can't remove team meberships from personal account", new Object[0]))) : pb(str, str2).m55723S(new rl7() { // from class: o.mch
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return sch.l7((List) obj);
            }
        }).m55714J(new ggd() { // from class: o.nch
            @Override // p001o.ggd
            public final boolean test(Object obj) {
                return sch.ri(list, (TeamMember) obj);
            }
        }).m55717M(new rl7() { // from class: o.och
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f38129a.Zx((TeamMember) obj);
            }
        });
    }
}
