package com.amplifyframework.api.aws;

import com.amplifyframework.api.ApiCategory;
import com.amplifyframework.api.ApiException;
import com.amplifyframework.api.graphql.GraphQLRequest;
import com.amplifyframework.api.graphql.GraphQLResponse;
import com.amplifyframework.core.Consumer;
import p001o.a0f;
import p001o.n64;
import p001o.n75;
import p001o.sq8;
import p001o.tq8;
import p001o.uq8;
import p001o.vre;
import p001o.wre;

/* loaded from: classes5.dex */
public final class ApiQueryKt {
    public static final <R> Object query(ApiCategory apiCategory, GraphQLRequest<R> graphQLRequest, String str, n64 n64Var) throws Throwable {
        final a0f a0fVar = new a0f(tq8.m50336c(n64Var));
        if (str != null) {
            apiCategory.query(str, graphQLRequest, new Consumer() { // from class: com.amplifyframework.api.aws.ApiQueryKt$query$2$1
                @Override // com.amplifyframework.core.Consumer
                public final void accept(GraphQLResponse<R> graphQLResponse) {
                    sq8.m48649h(graphQLResponse, "it");
                    a0fVar.resumeWith(vre.m53351b(graphQLResponse));
                }
            }, new Consumer() { // from class: com.amplifyframework.api.aws.ApiQueryKt$query$2$2
                @Override // com.amplifyframework.core.Consumer
                public final void accept(ApiException apiException) {
                    sq8.m48649h(apiException, "it");
                    n64 n64Var2 = a0fVar;
                    vre.C17665a c17665a = vre.f50797b;
                    n64Var2.resumeWith(vre.m53351b(wre.m54933a(apiException)));
                }
            });
        } else {
            apiCategory.query(graphQLRequest, new Consumer() { // from class: com.amplifyframework.api.aws.ApiQueryKt$query$2$3
                @Override // com.amplifyframework.core.Consumer
                public final void accept(GraphQLResponse<R> graphQLResponse) {
                    sq8.m48649h(graphQLResponse, "it");
                    a0fVar.resumeWith(vre.m53351b(graphQLResponse));
                }
            }, new Consumer() { // from class: com.amplifyframework.api.aws.ApiQueryKt$query$2$4
                @Override // com.amplifyframework.core.Consumer
                public final void accept(ApiException apiException) {
                    sq8.m48649h(apiException, "it");
                    n64 n64Var2 = a0fVar;
                    vre.C17665a c17665a = vre.f50797b;
                    n64Var2.resumeWith(vre.m53351b(wre.m54933a(apiException)));
                }
            });
        }
        Object objM16313b = a0fVar.m16313b();
        if (objM16313b == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM16313b;
    }
}
