package com.amplifyframework.api.aws;

import com.amplifyframework.AmplifyException;
import com.amplifyframework.api.ApiCategory;
import com.amplifyframework.api.graphql.GraphQLRequest;
import com.amplifyframework.api.graphql.GraphQLResponse;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.core.model.LazyModelList;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelPage;
import com.amplifyframework.core.model.PaginationToken;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.core.model.query.predicate.QueryPredicate;
import com.amplifyframework.core.model.query.predicate.QueryPredicates;
import java.util.Map;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.TypeReference;
import p001o.eu5;
import p001o.h84;
import p001o.i84;
import p001o.id5;
import p001o.jgg;
import p001o.l75;
import p001o.n64;
import p001o.nl7;
import p001o.o64;
import p001o.rm1;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class ApiLazyModelList<M extends Model> implements LazyModelList<M> {
    public static final Companion Companion = new Companion(null);
    private final ApiCategory apiCategory;
    private final String apiName;
    private final h84 callbackScope;
    private final Class<M> clazz;
    private final QueryPredicate queryPredicate;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final <M extends Model> QueryPredicate createPredicate(Class<M> cls, Map<String, ? extends Object> map) {
            sq8.m48649h(cls, "clazz");
            sq8.m48649h(map, "keyMap");
            QueryPredicate queryPredicateAll = QueryPredicates.all();
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                queryPredicateAll = queryPredicateAll.and(QueryField.field(cls.getSimpleName(), entry.getKey()).eq(entry.getValue()));
            }
            sq8.m48648g(queryPredicateAll, "element");
            return queryPredicateAll;
        }
    }

    @l75(m36647c = "com.amplifyframework.api.aws.ApiLazyModelList", m36648f = "ApiModelListTypes.kt", m36649l = {Opcodes.V16}, m36650m = "fetchPage")
    /* renamed from: com.amplifyframework.api.aws.ApiLazyModelList$fetchPage$1 */
    public static final class C102821 extends o64 {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ ApiLazyModelList<M> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C102821(ApiLazyModelList<? extends M> apiLazyModelList, n64 n64Var) {
            super(n64Var);
            this.this$0 = apiLazyModelList;
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.fetchPage((PaginationToken) null, this);
        }
    }

    @l75(m36647c = "com.amplifyframework.api.aws.ApiLazyModelList$fetchPage$2", m36648f = "ApiModelListTypes.kt", m36649l = {TypeReference.METHOD_REFERENCE}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.api.aws.ApiLazyModelList$fetchPage$2 */
    public static final class C102832 extends jgg implements nl7 {
        final /* synthetic */ Consumer<AmplifyException> $onError;
        final /* synthetic */ Consumer<ModelPage<M>> $onSuccess;
        int label;
        final /* synthetic */ ApiLazyModelList<M> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C102832(ApiLazyModelList<? extends M> apiLazyModelList, Consumer<ModelPage<M>> consumer, Consumer<AmplifyException> consumer2, n64 n64Var) {
            super(2, n64Var);
            this.this$0 = apiLazyModelList;
            this.$onSuccess = consumer;
            this.$onError = consumer2;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C102832(this.this$0, this.$onSuccess, this.$onError, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            try {
                if (i == 0) {
                    wre.m54934b(obj);
                    ApiLazyModelList<M> apiLazyModelList = this.this$0;
                    this.label = 1;
                    obj = LazyModelList.DefaultImpls.fetchPage$default(apiLazyModelList, null, this, 1, null);
                    if (obj == objM51918f) {
                        return objM51918f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(obj);
                }
                this.$onSuccess.accept((ModelPage) obj);
            } catch (AmplifyException e) {
                this.$onError.accept(e);
            }
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C102832) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.api.aws.ApiLazyModelList$fetchPage$3", m36648f = "ApiModelListTypes.kt", m36649l = {Opcodes.CASTORE}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.api.aws.ApiLazyModelList$fetchPage$3 */
    public static final class C102843 extends jgg implements nl7 {
        final /* synthetic */ Consumer<AmplifyException> $onError;
        final /* synthetic */ Consumer<ModelPage<M>> $onSuccess;
        final /* synthetic */ PaginationToken $paginationToken;
        int label;
        final /* synthetic */ ApiLazyModelList<M> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C102843(ApiLazyModelList<? extends M> apiLazyModelList, PaginationToken paginationToken, Consumer<ModelPage<M>> consumer, Consumer<AmplifyException> consumer2, n64 n64Var) {
            super(2, n64Var);
            this.this$0 = apiLazyModelList;
            this.$paginationToken = paginationToken;
            this.$onSuccess = consumer;
            this.$onError = consumer2;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C102843(this.this$0, this.$paginationToken, this.$onSuccess, this.$onError, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            try {
                if (i == 0) {
                    wre.m54934b(obj);
                    ApiLazyModelList<M> apiLazyModelList = this.this$0;
                    PaginationToken paginationToken = this.$paginationToken;
                    this.label = 1;
                    obj = apiLazyModelList.fetchPage(paginationToken, this);
                    if (obj == objM51918f) {
                        return objM51918f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(obj);
                }
                this.$onSuccess.accept((ModelPage) obj);
            } catch (AmplifyException e) {
                this.$onError.accept(e);
            }
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C102843) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    public ApiLazyModelList(Class<M> cls, Map<String, ? extends Object> map, String str, ApiCategory apiCategory) {
        sq8.m48649h(cls, "clazz");
        sq8.m48649h(map, "keyMap");
        sq8.m48649h(apiCategory, "apiCategory");
        this.clazz = cls;
        this.apiName = str;
        this.apiCategory = apiCategory;
        this.callbackScope = i84.m31707a(eu5.m25611b());
        this.queryPredicate = Companion.createPredicate(cls, map);
    }

    private final AmplifyException createLazyException(AmplifyException amplifyException) {
        String message = amplifyException.getMessage();
        if (message == null) {
            message = "";
        }
        return new AmplifyException("Error lazy loading the model list.", amplifyException, message);
    }

    private final GraphQLRequest<ModelPage<M>> createRequest(PaginationToken paginationToken) {
        AppSyncGraphQLRequestFactory appSyncGraphQLRequestFactory = AppSyncGraphQLRequestFactory.INSTANCE;
        Class<M> cls = this.clazz;
        QueryPredicate queryPredicate = this.queryPredicate;
        ApiPaginationToken apiPaginationToken = paginationToken instanceof ApiPaginationToken ? (ApiPaginationToken) paginationToken : null;
        return appSyncGraphQLRequestFactory.buildModelPageQuery$aws_api_release(cls, queryPredicate, apiPaginationToken != null ? apiPaginationToken.getNextToken() : null);
    }

    public static /* synthetic */ GraphQLRequest createRequest$default(ApiLazyModelList apiLazyModelList, PaginationToken paginationToken, int i, Object obj) {
        if ((i & 1) != 0) {
            paginationToken = null;
        }
        return apiLazyModelList.createRequest(paginationToken);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.amplifyframework.core.model.LazyModelList
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object fetchPage(PaginationToken paginationToken, n64 n64Var) throws Throwable {
        C102821 c102821;
        ApiLazyModelList<M> apiLazyModelList;
        if (n64Var instanceof C102821) {
            c102821 = (C102821) n64Var;
            int i = c102821.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c102821.label = i - Integer.MIN_VALUE;
            } else {
                c102821 = new C102821(this, n64Var);
            }
        }
        Object objQuery = c102821.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c102821.label;
        if (i2 == 0) {
            wre.m54934b(objQuery);
            try {
                ApiCategory apiCategory = this.apiCategory;
                GraphQLRequest<ModelPage<M>> graphQLRequestCreateRequest = createRequest(paginationToken);
                String str = this.apiName;
                c102821.L$0 = this;
                c102821.label = 1;
                objQuery = ApiQueryKt.query(apiCategory, graphQLRequestCreateRequest, str, c102821);
                if (objQuery == objM51918f) {
                    return objM51918f;
                }
                apiLazyModelList = this;
            } catch (AmplifyException e) {
                e = e;
                apiLazyModelList = this;
                throw apiLazyModelList.createLazyException(e);
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apiLazyModelList = (ApiLazyModelList) c102821.L$0;
            try {
                wre.m54934b(objQuery);
            } catch (AmplifyException e2) {
                e = e2;
                throw apiLazyModelList.createLazyException(e);
            }
        }
        Object data = ((GraphQLResponse) objQuery).getData();
        sq8.m48648g(data, "getData(...)");
        return data;
    }

    @Override // com.amplifyframework.core.model.LazyModelList
    public void fetchPage(Consumer<ModelPage<M>> consumer, Consumer<AmplifyException> consumer2) {
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        rm1.m46952d(this.callbackScope, null, null, new C102832(this, consumer, consumer2, null), 3, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ApiLazyModelList(Class cls, Map map, String str, ApiCategory apiCategory, int i, id5 id5Var) {
        if ((i & 8) != 0) {
            apiCategory = Amplify.API;
            sq8.m48648g(apiCategory, "API");
        }
        this(cls, map, str, apiCategory);
    }

    @Override // com.amplifyframework.core.model.LazyModelList
    public void fetchPage(PaginationToken paginationToken, Consumer<ModelPage<M>> consumer, Consumer<AmplifyException> consumer2) {
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        rm1.m46952d(this.callbackScope, null, null, new C102843(this, paginationToken, consumer, consumer2, null), 3, null);
    }
}
