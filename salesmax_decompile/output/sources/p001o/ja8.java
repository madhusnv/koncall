package p001o;

import android.net.Uri;
import android.os.Bundle;
import com.amazonaws.util.StringUtils;
import com.amplifyframework.api.aws.GsonVariablesSerializer;
import com.amplifyframework.api.graphql.GraphQLResponse;
import com.amplifyframework.api.graphql.GsonResponseAdapters;
import com.amplifyframework.api.graphql.SimpleGraphQLRequest;
import com.amplifyframework.core.model.query.predicate.GsonPredicateAdapters;
import com.amplifyframework.core.model.temporal.GsonTemporalAdapters;
import com.amplifyframework.core.model.types.GsonJavaTypeAdapters;
import com.amplifyframework.datastore.appsync.ModelWithMetadataAdapter;
import com.amplifyframework.datastore.appsync.SerializedCustomTypeAdapter;
import com.amplifyframework.datastore.appsync.SerializedModelAdapter;
import com.amplifyframework.datastore.generated.model.Account;
import com.amplifyframework.datastore.generated.model.AccountMembership;
import com.amplifyframework.datastore.generated.model.AccountStatus;
import com.amplifyframework.datastore.generated.model.AccountType;
import com.amplifyframework.datastore.generated.model.AuthorizationLevel;
import com.amplifyframework.datastore.generated.model.UserStatus;
import com.amplifyframework.rx.RxAmplify;
import com.amplifyframework.rx.RxOperations;
import com.amplifyframework.util.GsonFactory;
import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.Subscription;
import com.google.android.gms.actions.SearchIntents;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.analytics.ktx.AnalyticsKt;
import com.google.firebase.ktx.Firebase;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.io.IOException;
import java.lang.reflect.Type;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* loaded from: classes.dex */
public interface ja8 {

    /* renamed from: b */
    public static final Gson f30034b = create();

    /* renamed from: c */
    public static final Gson f30035c = GsonFactory.instance();

    /* renamed from: o.ja8$a */
    public static class C14481a implements JsonSerializer, JsonDeserializer {
        @Override // com.google.gson.JsonDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Input deserialize(JsonElement jsonElement, Type type2, JsonDeserializationContext jsonDeserializationContext) {
            return JsonNull.INSTANCE.equals(jsonElement) ? Input.absent() : (Input) ja8.f30035c.fromJson(jsonElement, Input.class);
        }

        @Override // com.google.gson.JsonSerializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JsonElement serialize(Input input, Type type2, JsonSerializationContext jsonSerializationContext) {
            return (input == null || !input.defined) ? JsonNull.INSTANCE : new JsonPrimitive(input.toString());
        }
    }

    /* renamed from: o.ja8$b */
    public static class C14482b implements JsonSerializer, JsonDeserializer {
        @Override // com.google.gson.JsonDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Uri deserialize(JsonElement jsonElement, Type type2, JsonDeserializationContext jsonDeserializationContext) {
            if (JsonNull.INSTANCE.equals(jsonElement)) {
                return null;
            }
            return Uri.parse(jsonElement.getAsString());
        }

        @Override // com.google.gson.JsonSerializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JsonElement serialize(Uri uri, Type type2, JsonSerializationContext jsonSerializationContext) {
            return uri == null ? JsonNull.INSTANCE : new JsonPrimitive(uri.toString());
        }
    }

    static /* synthetic */ xuf Ae(wtf wtfVar) {
        return wtfVar;
    }

    static /* synthetic */ void Ah(final SimpleGraphQLRequest simpleGraphQLRequest, final String str, final FirebaseAnalytics firebaseAnalytics) {
        ayh.Z2(new o83() { // from class: o.v98
            @Override // p001o.o83
            public final void run() {
                ja8.ie(simpleGraphQLRequest, str, firebaseAnalytics);
            }
        });
    }

    static /* synthetic */ void Cp(Subscription subscription, RxOperations.RxSubscriptionOperation rxSubscriptionOperation) {
        StringBuilder sb = new StringBuilder();
        sb.append("ON Dispose Method Called ");
        sb.append(subscription.getClass().getSimpleName());
        rxSubscriptionOperation.cancel();
    }

    static boolean Ea(GraphQLResponse graphQLResponse) {
        final String str = "DynamoDB:ConditionalCheckFailedException";
        return Boolean.valueOf(((List) Optional.ofNullable(graphQLResponse).map(new Function() { // from class: o.x98
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((GraphQLResponse) obj).getErrors();
            }
        }).orElse(Collections.emptyList())).stream().findFirst().map(new Function() { // from class: o.z98
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ja8.Lv((GraphQLResponse.Error) obj);
            }
        }).map(new Function() { // from class: o.aa8
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ja8.gt((Map) obj);
            }
        }).map(new ppd()).filter(new Predicate() { // from class: o.ba8
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return str.equalsIgnoreCase((String) obj);
            }
        }).isPresent()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default x8c H1(Function function, final Class cls, final Subscription subscription, final RxOperations.RxSubscriptionOperation rxSubscriptionOperation) {
        x6c x6cVarD0 = rxSubscriptionOperation.observeSubscriptionData().m55714J(new ggd() { // from class: o.q98
            @Override // p001o.ggd
            public final boolean test(Object obj) {
                return this.f41511a.raiseIfOnlyErrorInResponse((GraphQLResponse) obj);
            }
        }).d0(new y98());
        Objects.requireNonNull(function);
        return x6cVarD0.d0(new da8(function)).d0(new rl7() { // from class: o.r98
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f43235a.Tp(cls, obj);
            }
        }).m55711D(new gu3() { // from class: o.s98
            @Override // p001o.gu3
            public final void accept(Object obj) {
                ja8.sc(subscription, rxSubscriptionOperation, (su5) obj);
            }
        }).m55739w(new jm() { // from class: o.t98
            @Override // p001o.jm
            public final void run() {
                ja8.Cp(subscription, rxSubscriptionOperation);
            }
        });
    }

    static wtf Ji(final SimpleGraphQLRequest simpleGraphQLRequest, final int i) throws Exception {
        try {
            qj(simpleGraphQLRequest, SearchIntents.EXTRA_QUERY);
            return RxAmplify.API.query(simpleGraphQLRequest).m55019p(new rl7() { // from class: o.fa8
                @Override // p001o.rl7
                public final Object apply(Object obj) {
                    return ja8.Ln(i, simpleGraphQLRequest, (GraphQLResponse) obj);
                }
            }).m55015j(new rl7() { // from class: o.ga8
                @Override // p001o.rl7
                public final Object apply(Object obj) {
                    return ja8.Ae((wtf) obj);
                }
            }).m55022s(i, new ggd() { // from class: o.ha8
                @Override // p001o.ggd
                public final boolean test(Object obj) {
                    return ja8.m33440X((Throwable) obj);
                }
            });
        } catch (Exception e) {
            if (i > 0) {
                return Ji(simpleGraphQLRequest, i - 1);
            }
            throw e;
        }
    }

    static /* synthetic */ wtf Ln(int i, SimpleGraphQLRequest simpleGraphQLRequest, GraphQLResponse graphQLResponse) {
        if (!graphQLResponse.hasErrors() || i <= 0) {
            return wtf.m55009o(graphQLResponse);
        }
        String.format("retrying execute from execute graphql method %s", graphQLResponse.getErrors().toString());
        return Ji(simpleGraphQLRequest, i - 1);
    }

    static /* synthetic */ Map Lv(GraphQLResponse.Error error) {
        return (Map) Optional.ofNullable(error.getExtensions()).orElse(Collections.emptyMap());
    }

    static /* synthetic */ String Mk(String str) {
        int iIndexOf = str.indexOf("(");
        return (String) Optional.of(str.substring(str.substring(0, iIndexOf).lastIndexOf(" ") + 1, iIndexOf)).map(new u3c()).orElse("");
    }

    static boolean Nh(GraphQLResponse graphQLResponse) {
        if (graphQLResponse.hasErrors()) {
            throw new RuntimeException((String) graphQLResponse.getErrors().stream().map(new h98()).collect(Collectors.joining("\n")));
        }
        return true;
    }

    static Map Ou(Operation.Variables variables) {
        try {
            kzf kzfVar = new kzf(Comparator.naturalOrder());
            variables.marshaller().marshal(kzfVar);
            return kzfVar.m36376a();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static /* synthetic */ RxOperations.RxSubscriptionOperation Rc(SimpleGraphQLRequest simpleGraphQLRequest) {
        return RxAmplify.API.subscribe(simpleGraphQLRequest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default x8c Ro(String str, final Subscription subscription, Class cls, final Function function, final Class cls2, Boolean bool) {
        if (!bool.booleanValue()) {
            return x6c.m55694H(new RuntimeException("The account subscription has expired"));
        }
        final SimpleGraphQLRequest simpleGraphQLRequest = new SimpleGraphQLRequest(str, toVariablesMap(subscription), cls, new GsonVariablesSerializer());
        qj(simpleGraphQLRequest, "subscription");
        return x6c.m55697U(new Callable() { // from class: o.l98
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ja8.Rc(simpleGraphQLRequest);
            }
        }).m55717M(new rl7() { // from class: o.m98
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f35009a.H1(function, cls2, subscription, (RxOperations.RxSubscriptionOperation) obj);
            }
        });
    }

    static /* synthetic */ void Td(List list, CompletableFuture completableFuture) {
        if (list.isEmpty()) {
            completableFuture.complete("");
        } else {
            completableFuture.complete((String) list.remove(0));
        }
    }

    static /* synthetic */ void Tq(f3e f3eVar, String str) {
        if (StringUtils.isBlank(str)) {
            f3eVar.onComplete();
        } else {
            f3eVar.mo16560e(str);
        }
    }

    static Object Tu(Object obj, Class cls) {
        Gson gson;
        String json;
        if (Objects.isNull(obj)) {
            return null;
        }
        if (obj instanceof String) {
            gson = f30035c;
            json = obj.toString();
        } else {
            gson = f30035c;
            json = gson.toJson(obj);
        }
        return gson.fromJson(json, cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default void Uh(final rl7 rl7Var, final g57 g57Var) {
        final f3e f3eVarN0 = f3e.N0();
        gu3 gu3Var = new gu3() { // from class: o.k98
            @Override // p001o.gu3
            public final void accept(Object obj) {
                this.f31696a.pv(rl7Var, g57Var, f3eVarN0, (String) obj);
            }
        };
        Objects.requireNonNull(g57Var);
        f3eVarN0.w0(gu3Var, new mj4(g57Var), new nj4(g57Var));
        f3eVarN0.mo16560e("");
    }

    /* renamed from: X */
    static /* synthetic */ boolean m33440X(Throwable th) {
        return !an(th);
    }

    static boolean an(Throwable th) {
        while (th != null) {
            if (th instanceof UnknownHostException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    static Gson create() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Uri.class, new C14482b());
        gsonBuilder.registerTypeAdapter(Input.class, new C14481a());
        GsonTemporalAdapters.register(gsonBuilder);
        GsonJavaTypeAdapters.register(gsonBuilder);
        GsonPredicateAdapters.register(gsonBuilder);
        GsonResponseAdapters.register(gsonBuilder);
        ModelWithMetadataAdapter.register(gsonBuilder);
        SerializedModelAdapter.register(gsonBuilder);
        SerializedCustomTypeAdapter.register(gsonBuilder);
        return gsonBuilder.create();
    }

    static /* synthetic */ Object e6(final SimpleGraphQLRequest simpleGraphQLRequest, final String str) {
        Optional.of(AnalyticsKt.getAnalytics(Firebase.INSTANCE)).ifPresent(new Consumer() { // from class: o.u98
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ja8.Ah(simpleGraphQLRequest, str, (FirebaseAnalytics) obj);
            }
        });
        return null;
    }

    static /* synthetic */ Object gt(Map map) {
        return map.getOrDefault("errorType", null);
    }

    static Optional hj(SimpleGraphQLRequest simpleGraphQLRequest, int i) throws Exception {
        try {
            GraphQLResponse graphQLResponse = (GraphQLResponse) Ji(simpleGraphQLRequest, i).m55012d();
            return graphQLResponse.hasErrors() ? Optional.empty() : Optional.ofNullable(graphQLResponse);
        } catch (Exception e) {
            String.format("Exception occurred during blocking call %s", e.getMessage());
            if (i > 0) {
                return hj(simpleGraphQLRequest, i - 1);
            }
            throw e;
        }
    }

    static /* synthetic */ void ie(SimpleGraphQLRequest simpleGraphQLRequest, String str, FirebaseAnalytics firebaseAnalytics) {
        Bundle bundle = new Bundle();
        bundle.putString("service_name", name(simpleGraphQLRequest.getQuery()));
        bundle.putString("service_type", str);
        firebaseAnalytics.logEvent("service_event", bundle);
    }

    static String name(String str) {
        return (String) ayh.H1(new w98(str)).m51980C("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default void pv(rl7 rl7Var, g57 g57Var, final f3e f3eVar, String str) {
        if (StringUtils.isBlank(str)) {
            str = null;
        }
        __emitFromFlowableListWithTokenToEmitter((s47) rl7Var.apply(str), g57Var).thenAccept(new Consumer() { // from class: o.p98
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ja8.Tq(f3eVar, (String) obj);
            }
        });
    }

    static void qj(final SimpleGraphQLRequest simpleGraphQLRequest, final String str) {
        p74.f39487a.m43074b(new uk7() { // from class: o.o98
            @Override // p001o.uk7
            public final Object invoke() {
                return ja8.e6(simpleGraphQLRequest, str);
            }
        });
    }

    static /* synthetic */ void sc(Subscription subscription, RxOperations.RxSubscriptionOperation rxSubscriptionOperation, su5 su5Var) {
        StringBuilder sb = new StringBuilder();
        sb.append("ON Subscribe Method Called ");
        sb.append(subscription.getClass().getSimpleName());
        sb.append(" ");
        sb.append(rxSubscriptionOperation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default x8c vj(String str, Mutation mutation, final Class cls, Function function, final Class cls2, Boolean bool) {
        if (!bool.booleanValue()) {
            return x6c.m55694H(new RuntimeException("The account subscription has expired"));
        }
        SimpleGraphQLRequest simpleGraphQLRequest = new SimpleGraphQLRequest(str, toVariablesMap(mutation), cls, new GsonVariablesSerializer());
        qj(simpleGraphQLRequest, "mutation");
        x6c x6cVarD0 = RxAmplify.API.mutate(simpleGraphQLRequest).m55027y().m55714J(new n98(this)).d0(new y98()).d0(new rl7() { // from class: o.i98
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f28275a.Rd(cls, obj);
            }
        });
        Objects.requireNonNull(function);
        return x6cVarD0.d0(new da8(function)).d0(new rl7() { // from class: o.j98
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f29984a.sf(cls2, obj);
            }
        });
    }

    static Optional z7(SimpleGraphQLRequest simpleGraphQLRequest) {
        return hj(simpleGraphQLRequest, 2);
    }

    static /* synthetic */ void z9(g57 g57Var, List list, ryh ryhVar) {
        List list2 = (List) ryhVar.f44265a;
        Objects.requireNonNull(g57Var);
        list2.forEach(new ij4(g57Var));
        Optional optionalOfNullable = Optional.ofNullable((String) ryhVar.f44266b);
        Objects.requireNonNull(list);
        optionalOfNullable.ifPresent(new hqd(list));
    }

    default CompletableFuture __emitFromFlowableListWithTokenToEmitter(s47 s47Var, final g57 g57Var) {
        final ArrayList arrayList = new ArrayList();
        final CompletableFuture completableFuture = new CompletableFuture();
        s47Var.a0(new gu3() { // from class: o.ia8
            @Override // p001o.gu3
            public final void accept(Object obj) {
                ja8.z9(g57Var, arrayList, (ryh) obj);
            }
        }, new gu3() { // from class: o.d98
            @Override // p001o.gu3
            public final void accept(Object obj) {
                g57Var.onError((Throwable) obj);
            }
        }, new jm() { // from class: o.e98
            @Override // p001o.jm
            public final void run() {
                ja8.Td(arrayList, completableFuture);
            }
        });
        return completableFuture;
    }

    default Object convertGraphQLResponse(GraphQLResponse graphQLResponse, Class cls) {
        raiseIfErrorInResponse(graphQLResponse);
        return sf(graphQLResponse.getData(), cls);
    }

    /* renamed from: convertResponse, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    default Object sf(Object obj, Class cls) {
        return Tu(obj, cls);
    }

    default AccountMembership dummyMembership(String str) {
        Object objBuild = AccountMembership.builder().userId(str).authorizationLevel(AuthorizationLevel.MEMBER).userAccountStatus(UserStatus.ACTIVE).mapRegisteredMobileNumberToAccount(Boolean.TRUE).mapSecondaryMobileNumberToAccount(Boolean.FALSE).accountEmail("").designation("Owner").id(String.format("%s-%s", "Personal", str)).account(Account.justId("Personal")).build();
        Object objBuild2 = Account.builder().accountName("My Personal Account").accountType(AccountType.INDIVIDUAL).accountStatus(AccountStatus.ACTIVE).id("Personal").build();
        Map map = (Map) sf(objBuild, Map.class);
        map.put("account", (Map) sf(objBuild2, Map.class));
        return (AccountMembership) sf(map, AccountMembership.class);
    }

    default wtf executeGraphQL(SimpleGraphQLRequest simpleGraphQLRequest) {
        return Ji(simpleGraphQLRequest, 2);
    }

    default s47 fromFlowableListWithTokenToFlowable(final rl7 rl7Var) {
        return s47.m47679v(new y57() { // from class: o.c98
            @Override // p001o.y57
            /* renamed from: a */
            public final void mo20510a(g57 g57Var) {
                this.f17528a.Uh(rl7Var, g57Var);
            }
        }, la1.BUFFER);
    }

    default x6c graphqlMutation(Mutation mutation, Class cls, Function function, Class cls2) {
        return graphqlMutation(mutation, mutation.queryDocument(), cls, function, cls2);
    }

    default x6c graphqlQuery(Query query, Class cls, Function function, Class cls2) {
        return graphqlQuery(query, query.queryDocument(), cls, function, cls2);
    }

    default x6c graphqlSubscription(Subscription subscription, Class cls, Function function, Class cls2) {
        return graphqlSubscription(subscription, subscription.queryDocument(), cls, function, cls2);
    }

    default x6c isAccountSubscriptionActive() {
        return x6c.c0(Boolean.TRUE);
    }

    default Boolean isDummyAccount(String str) {
        return Boolean.valueOf(Objects.equals(str, "Personal"));
    }

    default Boolean isDummyAccountMembership(AccountMembership accountMembership) {
        return isDummyAccount(accountMembership.getAccount().getId());
    }

    default boolean raiseIfErrorInResponse(GraphQLResponse graphQLResponse) {
        if (graphQLResponse.hasErrors()) {
            throw new RuntimeException((String) graphQLResponse.getErrors().stream().map(new h98()).collect(Collectors.joining("\n")));
        }
        return true;
    }

    default boolean raiseIfOnlyErrorInResponse(GraphQLResponse graphQLResponse) {
        if (Objects.isNull(graphQLResponse.getData()) && graphQLResponse.hasErrors()) {
            throw new RuntimeException((String) graphQLResponse.getErrors().stream().map(new h98()).collect(Collectors.joining("\n")));
        }
        return true;
    }

    default ch9 toLatLongMap(ch9 ch9Var) {
        return ch9Var;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.apollographql.apollo.api.Operation$Variables] */
    default Map toVariablesMap(Query query) {
        return Ou(query.variables());
    }

    default x6c graphqlMutation(final Mutation mutation, final String str, final Class cls, final Function function, final Class cls2) {
        return isAccountSubscriptionActive().m55717M(new rl7() { // from class: o.f98
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f22987a.vj(str, mutation, cls, function, cls2, (Boolean) obj);
            }
        });
    }

    default x6c graphqlQuery(Query query, String str, final Class cls, Function function, final Class cls2) {
        x6c x6cVarD0 = Ji(new SimpleGraphQLRequest(str, toVariablesMap(query), cls, new GsonVariablesSerializer()), 2).m55027y().m55714J(new n98(this)).d0(new y98()).d0(new rl7() { // from class: o.ca8
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f17650a.a2(cls, obj);
            }
        });
        Objects.requireNonNull(function);
        return x6cVarD0.d0(new da8(function)).d0(new rl7() { // from class: o.ea8
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f21255a.m6(cls2, obj);
            }
        });
    }

    default x6c graphqlSubscription(final Subscription subscription, final String str, final Class cls, final Function function, final Class cls2) {
        return isAccountSubscriptionActive().m55717M(new rl7() { // from class: o.g98
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f24757a.Ro(str, subscription, cls, function, cls2, (Boolean) obj);
            }
        });
    }

    default Boolean isDummyAccountMembership(String str) {
        return Boolean.valueOf(str.contains("Personal"));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.apollographql.apollo.api.Operation$Variables] */
    default Map toVariablesMap(Mutation mutation) {
        return Ou(mutation.variables());
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.apollographql.apollo.api.Operation$Variables] */
    default Map toVariablesMap(Subscription subscription) {
        return Ou(subscription.variables());
    }
}
