package p001o;

import ai.salesmax.model.PaginatedTokenResults;
import com.amazonaws.amplify.generated.graphql.GetCommentQuery;
import com.amazonaws.amplify.generated.graphql.GetCommentsByMentionedUserQuery;
import com.amplifyframework.api.aws.GsonVariablesSerializer;
import com.amplifyframework.api.aws.LazyTypeDeserializersKt;
import com.amplifyframework.api.graphql.SimpleGraphQLRequest;
import com.amplifyframework.datastore.generated.model.Comment;
import com.amplifyframework.datastore.generated.model.ModelCommentConnection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.apache.http.cookie.ClientCookie;
import type.C19176xbc4e5ffd;
import type.ModelMentionUserMembershipByMentionedUserIdCompositeKeyInput;
import type.ModelSortDirection;

/* loaded from: classes.dex */
public interface kkc extends me1 {
    static /* synthetic */ Map I5(Map map) {
        return (Map) map.get("getCommentsByMentionedUser");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default ModelCommentConnection Lw(Map map) {
        return (ModelCommentConnection) sf(map, ModelCommentConnection.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default Map Nu(Map map) {
        List list = (List) map.get("items");
        String str = (String) map.get(LazyTypeDeserializersKt.NEXT_TOKEN_KEY);
        List list2 = (List) list.stream().map(new Function() { // from class: o.zjc
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return kkc.f8((Map) obj);
            }
        }).map(new Function() { // from class: o.akc
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f14900a.ls((Map) obj);
            }
        }).collect(Collectors.toList());
        HashMap map2 = new HashMap();
        map2.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str);
        map2.put("items", list2);
        return map2;
    }

    static /* synthetic */ ryh Rb(ModelCommentConnection modelCommentConnection) {
        return uyh.of(modelCommentConnection.getItems(), modelCommentConnection.getNextToken());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default Comment Z8(Map map) {
        return (Comment) sf(map, Comment.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default PaginatedTokenResults cm(String str, String str2, int i) {
        return new PaginatedTokenResults(new ekc(this), uyh.of(str, str2), i);
    }

    static /* synthetic */ Map f8(Map map) {
        return (Map) map.get(ClientCookie.COMMENT_ATTR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default Comment ls(Map map) {
        return (Comment) sf(map, Comment.class);
    }

    static /* synthetic */ Map rb(Map map) {
        return (Map) map.get("getComment");
    }

    static /* synthetic */ GetCommentsByMentionedUserQuery xo(GetCommentsByMentionedUserQuery.Builder builder, int i, String str) {
        return builder.nextToken(str).limit(Integer.valueOf(i)).build();
    }

    default x6c Cc(String str) {
        return executeGraphQL(new SimpleGraphQLRequest("query GetComment($id: ID!) {\n  getComment(id: $id) {\n         __typename\n         id\n         accountId\n         ownerId\n         mentioned {\n             __typename\n             entityType\n             entityId\n         }\n         body\n         engagementId\n         parentEngagementId\n         activityId\n         createdAt\n         updatedAt\n         engagement {\n             __typename\n             id\n             engagementType\n         }\n         activity {\n             __typename\n             id\n             activityType\n         }\n  }\n}", toVariablesMap(GetCommentQuery.builder().id(str).build()), Map.class, new GsonVariablesSerializer())).m55014i(new bkc(this)).m27844k(new ml()).m27844k(new rl7() { // from class: o.ckc
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return kkc.rb((Map) obj);
            }
        }).m27844k(new rl7() { // from class: o.dkc
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f20144a.Z8((Map) obj);
            }
        }).m27846n();
    }

    default SimpleGraphQLRequest Cv(String str, String str2, Optional optional, final int i) {
        if (Objects.isNull(str) && !optional.isPresent()) {
            return null;
        }
        final GetCommentsByMentionedUserQuery.Builder builderSortDirection = GetCommentsByMentionedUserQuery.builder().mentionedUserId(str).accountIdUpdatedAt(C19176xbc4e5ffd.builder().beginsWith(ModelMentionUserMembershipByMentionedUserIdCompositeKeyInput.builder().accountId(on()).build()).build()).sortDirection(ModelSortDirection.DESC);
        return new SimpleGraphQLRequest("query GetCommentsByMentionedUser($mentionedUserId: ID, $accountIdUpdatedAt: ModelMentionUserMembershipByMentionedUserIdCompositeKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelMentionUserMembershipFilterInput, $limit: Int, $nextToken: String) {\n  getCommentsByMentionedUser(mentionedUserId: $mentionedUserId, accountIdUpdatedAt: $accountIdUpdatedAt, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      commentId\n      comment {\n         __typename\n         id\n         accountId\n         ownerId\n         mentioned {\n             __typename\n             entityType\n             entityId\n         }\n         body\n         engagementId\n         parentEngagementId\n         activityId\n         createdAt\n         updatedAt\n         engagement {\n             __typename\n             id\n             engagementType\n         }\n         activity {\n             __typename\n             id\n             activityType\n         }\n      }\n      mentionedUserId\n      commentedById\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}", toVariablesMap((GetCommentsByMentionedUserQuery) optional.map(new Function() { // from class: o.gkc
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return kkc.xo(builderSortDirection, i, (String) obj);
            }
        }).orElse(builderSortDirection.limit(Integer.valueOf(i)).build())), Map.class, new GsonVariablesSerializer());
    }

    default SimpleGraphQLRequest L4(String str, String str2, Optional optional, int i) {
        return Cv(str, str2, optional, i);
    }

    default ModelCommentConnection M8() {
        return ModelCommentConnection.builder().items(Collections.emptyList()).nextToken(null).build();
    }

    default s47 g1(final String str, final String str2, final int i) {
        return s47.m47669H(new Callable() { // from class: o.yjc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f55609a.cm(str, str2, i);
            }
        });
    }

    default s47 qr(ryh ryhVar, String str, int i) {
        return yy(L4((String) ryhVar.f44265a, (String) ryhVar.f44266b, Optional.ofNullable(str), i)).m47686M(new rl7() { // from class: o.fkc
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return kkc.Rb((ModelCommentConnection) obj);
            }
        });
    }

    default s47 yy(SimpleGraphQLRequest simpleGraphQLRequest) {
        return Objects.isNull(simpleGraphQLRequest) ? s47.m47673L(M8()) : executeGraphQL(simpleGraphQLRequest).m55014i(new bkc(this)).m27844k(new ml()).m27844k(new rl7() { // from class: o.hkc
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return kkc.I5((Map) obj);
            }
        }).m27844k(new rl7() { // from class: o.ikc
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f28785a.Nu((Map) obj);
            }
        }).m27844k(new rl7() { // from class: o.jkc
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f30548a.Lw((Map) obj);
            }
        }).m27845m();
    }
}
