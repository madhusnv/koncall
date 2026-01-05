package p001o;

import com.amazonaws.amplify.generated.graphql.GetAuthorizationByUserAccountQuery;
import com.amplifyframework.api.aws.GsonVariablesSerializer;
import com.amplifyframework.api.graphql.GraphQLResponse;
import com.amplifyframework.api.graphql.SimpleGraphQLRequest;
import com.amplifyframework.datastore.generated.model.UserAuthorization;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import type.ModelIDKeyConditionInput;

/* loaded from: classes.dex */
public interface bci extends ja8 {
    static /* synthetic */ Optional Fw(List list) {
        return list.stream().findFirst();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default UserAuthorization nr(GetAuthorizationByUserAccountQuery.Item item) {
        return (UserAuthorization) sf(item, UserAuthorization.class);
    }

    default UserAuthorization Mh(String str, String str2) {
        GetAuthorizationByUserAccountQuery getAuthorizationByUserAccountQueryBuild = GetAuthorizationByUserAccountQuery.builder().accountId(str).userId(ModelIDKeyConditionInput.builder().eq(str2).build()).build();
        return (UserAuthorization) ja8.z7(new SimpleGraphQLRequest(getAuthorizationByUserAccountQueryBuild.queryDocument(), toVariablesMap(getAuthorizationByUserAccountQueryBuild), GetAuthorizationByUserAccountQuery.Data.class, new GsonVariablesSerializer())).filter(new Predicate() { // from class: o.vbi
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return this.f50094a.raiseIfErrorInResponse((GraphQLResponse) obj);
            }
        }).map(new Function() { // from class: o.wbi
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (GetAuthorizationByUserAccountQuery.Data) ((GraphQLResponse) obj).getData();
            }
        }).map(new Function() { // from class: o.xbi
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((GetAuthorizationByUserAccountQuery.Data) obj).getAuthorizationByUserAccount();
            }
        }).map(new Function() { // from class: o.ybi
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((GetAuthorizationByUserAccountQuery.GetAuthorizationByUserAccount) obj).items();
            }
        }).map(new Function() { // from class: o.zbi
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return bci.Fw((List) obj);
            }
        }).flatMap(Function.identity()).map(new Function() { // from class: o.aci
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f14517a.nr((GetAuthorizationByUserAccountQuery.Item) obj);
            }
        }).orElse(null);
    }
}
