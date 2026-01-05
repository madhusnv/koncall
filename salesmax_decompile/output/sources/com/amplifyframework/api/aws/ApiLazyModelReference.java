package com.amplifyframework.api.aws;

import com.amplifyframework.AmplifyException;
import com.amplifyframework.api.ApiCategory;
import com.amplifyframework.api.ApiException;
import com.amplifyframework.api.graphql.GraphQLRequest;
import com.amplifyframework.api.graphql.GraphQLResponse;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.core.NullableConsumer;
import com.amplifyframework.core.model.LazyModelReference;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelField;
import com.amplifyframework.core.model.ModelSchema;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.objectweb.asm.Opcodes;
import p001o.dh3;
import p001o.eu5;
import p001o.h84;
import p001o.i84;
import p001o.id5;
import p001o.jgg;
import p001o.l75;
import p001o.n64;
import p001o.nl7;
import p001o.nqb;
import p001o.o64;
import p001o.rm1;
import p001o.sq8;
import p001o.tqb;
import p001o.uq8;
import p001o.wre;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class ApiLazyModelReference<M extends Model> implements LazyModelReference<M> {
    private static final Companion Companion = new Companion(null);
    private final ApiCategory apiCategory;
    private final String apiName;
    private final AtomicReference<Companion.LoadedValue<M>> cachedValue;
    private final h84 callbackScope;
    private final Class<M> clazz;
    private final Map<String, Object> keyMap;
    private final nqb mutex;

    public static final class Companion {

        public static final class LoadedValue<M extends Model> {
            private final M value;

            public LoadedValue(M m) {
                this.value = m;
            }

            public final M getValue() {
                return this.value;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    @l75(m36647c = "com.amplifyframework.api.aws.ApiLazyModelReference", m36648f = "ApiLazyModelReference.kt", m36649l = {Opcodes.L2F, Opcodes.LREM}, m36650m = "fetchInternal")
    /* renamed from: com.amplifyframework.api.aws.ApiLazyModelReference$fetchInternal$1 */
    public static final class C102851 extends o64 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ ApiLazyModelReference<M> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C102851(ApiLazyModelReference<M> apiLazyModelReference, n64 n64Var) {
            super(n64Var);
            this.this$0 = apiLazyModelReference;
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.fetchInternal(this);
        }
    }

    @l75(m36647c = "com.amplifyframework.api.aws.ApiLazyModelReference$fetchModel$2", m36648f = "ApiLazyModelReference.kt", m36649l = {77}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.api.aws.ApiLazyModelReference$fetchModel$2 */
    public static final class C102862 extends jgg implements nl7 {
        final /* synthetic */ Consumer<AmplifyException> $onError;
        final /* synthetic */ NullableConsumer<M> $onSuccess;
        int label;
        final /* synthetic */ ApiLazyModelReference<M> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C102862(ApiLazyModelReference<M> apiLazyModelReference, NullableConsumer<M> nullableConsumer, Consumer<AmplifyException> consumer, n64 n64Var) {
            super(2, n64Var);
            this.this$0 = apiLazyModelReference;
            this.$onSuccess = nullableConsumer;
            this.$onError = consumer;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C102862(this.this$0, this.$onSuccess, this.$onError, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            try {
                if (i == 0) {
                    wre.m54934b(obj);
                    ApiLazyModelReference<M> apiLazyModelReference = this.this$0;
                    this.label = 1;
                    obj = apiLazyModelReference.fetchInternal(this);
                    if (obj == objM51918f) {
                        return objM51918f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(obj);
                }
                this.$onSuccess.accept((Model) obj);
            } catch (AmplifyException e) {
                this.$onError.accept(e);
            }
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C102862) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    public ApiLazyModelReference(Class<M> cls, Map<String, ? extends Object> map, String str, ApiCategory apiCategory) {
        sq8.m48649h(cls, "clazz");
        sq8.m48649h(map, "keyMap");
        sq8.m48649h(apiCategory, "apiCategory");
        this.clazz = cls;
        this.keyMap = map;
        this.apiName = str;
        this.apiCategory = apiCategory;
        AtomicReference<Companion.LoadedValue<M>> atomicReference = new AtomicReference<>(null);
        this.cachedValue = atomicReference;
        this.mutex = tqb.m50340b(false, 1, null);
        this.callbackScope = i84.m31707a(eu5.m25611b());
        if (map.isEmpty()) {
            atomicReference.set(new Companion.LoadedValue<>(null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [o.nqb] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchInternal(n64 n64Var) throws Throwable {
        C102851 c102851;
        nqb nqbVar;
        ApiLazyModelReference<M> apiLazyModelReference;
        ApiException e;
        nqb nqbVar2;
        ApiLazyModelReference<M> apiLazyModelReference2;
        String message;
        if (n64Var instanceof C102851) {
            c102851 = (C102851) n64Var;
            int i = c102851.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c102851.label = i - Integer.MIN_VALUE;
            } else {
                c102851 = new C102851(this, n64Var);
            }
        }
        Object obj = c102851.result;
        ?? M51918f = uq8.m51918f();
        int i2 = c102851.label;
        String str = "";
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (i2 == 0) {
                wre.m54934b(obj);
                nqbVar = this.mutex;
                c102851.L$0 = this;
                c102851.L$1 = nqbVar;
                c102851.label = 1;
                if (nqbVar.mo40922b(null, c102851) == M51918f) {
                    return M51918f;
                }
                apiLazyModelReference = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    nqbVar2 = (nqb) c102851.L$1;
                    apiLazyModelReference2 = (ApiLazyModelReference) c102851.L$0;
                    try {
                        wre.m54934b(obj);
                        Model model = (Model) ((GraphQLResponse) obj).getData();
                        apiLazyModelReference2.cachedValue.set(new Companion.LoadedValue<>(model));
                        nqbVar2.mo40923c(null);
                        return model;
                    } catch (ApiException e2) {
                        e = e2;
                        message = e.getMessage();
                        if (message == null) {
                        }
                        throw new AmplifyException("Error lazy loading the model.", e, str);
                    }
                }
                nqb nqbVar3 = (nqb) c102851.L$1;
                apiLazyModelReference = (ApiLazyModelReference) c102851.L$0;
                wre.m54934b(obj);
                nqbVar = nqbVar3;
            }
            Companion.LoadedValue<M> loadedValue = apiLazyModelReference.cachedValue.get();
            if (loadedValue != null) {
                Model value = loadedValue.getValue();
                nqbVar.mo40923c(null);
                return value;
            }
            try {
                ModelSchema modelSchemaFromModelClass = ModelSchema.fromModelClass(apiLazyModelReference.clazz);
                sq8.m48648g(modelSchemaFromModelClass, "fromModelClass(...)");
                List<String> primaryIndexFields = modelSchemaFromModelClass.getPrimaryIndexFields();
                sq8.m48648g(primaryIndexFields, "getPrimaryIndexFields(...)");
                ArrayList arrayList = new ArrayList(dh3.m23088v(primaryIndexFields, 10));
                for (String str2 : primaryIndexFields) {
                    ModelField modelField = modelSchemaFromModelClass.getFields().get(str2);
                    if (modelField == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    ModelField modelField2 = modelField;
                    String str3 = modelField2.isRequired() ? "!" : "";
                    String str4 = modelField2.getTargetType() + str3;
                    Object obj2 = apiLazyModelReference.keyMap.get(str2);
                    if (obj2 == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    sq8.m48646e(str2);
                    arrayList.add(new GraphQLRequestVariable(str2, obj2, str4));
                }
                AppSyncGraphQLRequestFactory appSyncGraphQLRequestFactory = AppSyncGraphQLRequestFactory.INSTANCE;
                Class<M> cls = apiLazyModelReference.clazz;
                GraphQLRequestVariable[] graphQLRequestVariableArr = (GraphQLRequestVariable[]) arrayList.toArray(new GraphQLRequestVariable[0]);
                GraphQLRequest graphQLRequestBuildQueryInternal$aws_api_release = appSyncGraphQLRequestFactory.buildQueryInternal$aws_api_release(cls, null, (GraphQLRequestVariable[]) Arrays.copyOf(graphQLRequestVariableArr, graphQLRequestVariableArr.length));
                ApiCategory apiCategory = apiLazyModelReference.apiCategory;
                String str5 = apiLazyModelReference.apiName;
                c102851.L$0 = apiLazyModelReference;
                c102851.L$1 = nqbVar;
                c102851.label = 2;
                Object objQuery = ApiQueryKt.query(apiCategory, graphQLRequestBuildQueryInternal$aws_api_release, str5, c102851);
                if (objQuery == M51918f) {
                    return M51918f;
                }
                nqbVar2 = nqbVar;
                obj = objQuery;
                apiLazyModelReference2 = apiLazyModelReference;
                Model model2 = (Model) ((GraphQLResponse) obj).getData();
                apiLazyModelReference2.cachedValue.set(new Companion.LoadedValue<>(model2));
                nqbVar2.mo40923c(null);
                return model2;
            } catch (ApiException e3) {
                e = e3;
                message = e.getMessage();
                if (message == null) {
                    str = message;
                }
                throw new AmplifyException("Error lazy loading the model.", e, str);
            }
        } catch (Throwable th2) {
            M51918f = nqbVar;
            th = th2;
            M51918f.mo40923c(null);
            throw th;
        }
    }

    @Override // com.amplifyframework.core.model.LazyModelReference
    public Object fetchModel(n64 n64Var) {
        Companion.LoadedValue<M> loadedValue = this.cachedValue.get();
        return loadedValue != null ? loadedValue.getValue() : fetchInternal(n64Var);
    }

    @Override // com.amplifyframework.core.model.ModelReference
    public Map<String, Object> getIdentifier() {
        return this.keyMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amplifyframework.core.model.LazyModelReference
    public void fetchModel(NullableConsumer<M> nullableConsumer, Consumer<AmplifyException> consumer) {
        sq8.m48649h(nullableConsumer, "onSuccess");
        sq8.m48649h(consumer, "onError");
        Companion.LoadedValue<M> loadedValue = this.cachedValue.get();
        if (loadedValue != null) {
            nullableConsumer.accept(loadedValue.getValue());
        }
        rm1.m46952d(this.callbackScope, null, null, new C102862(this, nullableConsumer, consumer, null), 3, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ApiLazyModelReference(Class cls, Map map, String str, ApiCategory apiCategory, int i, id5 id5Var) {
        str = (i & 4) != 0 ? null : str;
        if ((i & 8) != 0) {
            apiCategory = Amplify.API;
            sq8.m48648g(apiCategory, "API");
        }
        this(cls, map, str, apiCategory);
    }
}
