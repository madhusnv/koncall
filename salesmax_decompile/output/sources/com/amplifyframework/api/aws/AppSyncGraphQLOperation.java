package com.amplifyframework.api.aws;

import android.annotation.SuppressLint;
import com.amplifyframework.api.ApiException;
import com.amplifyframework.api.aws.auth.ApiRequestDecoratorFactory;
import com.amplifyframework.api.graphql.GraphQLRequest;
import com.amplifyframework.api.graphql.GraphQLResponse;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.logging.Logger;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import p001o.bt1;
import p001o.cre;
import p001o.hac;
import p001o.ule;
import p001o.xle;
import p001o.y9b;
import p001o.z22;
import p001o.zqe;

/* loaded from: classes5.dex */
public final class AppSyncGraphQLOperation<R> extends AWSGraphQLOperation<R> {
    private static final String CONTENT_TYPE = "application/json";
    private static final int END_OF_CLIENT_ERROR_CODE = 499;
    private static final Logger LOG = Amplify.Logging.logger(CategoryType.API, "amplify:aws-api");
    private static final int START_OF_CLIENT_ERROR_CODE = 400;
    private final ApiRequestDecoratorFactory apiRequestDecoratorFactory;
    private final hac client;
    private final String endpoint;
    private final ExecutorService executorService;
    private final Consumer<ApiException> onFailure;
    private final Consumer<GraphQLResponse<R>> onResponse;
    private bt1 ongoingCall;

    public static final class Builder<R> {
        private String apiName;
        private ApiRequestDecoratorFactory apiRequestDecoratorFactory;
        private hac client;
        private String endpoint;
        private ExecutorService executorService;
        private Consumer<ApiException> onFailure;
        private Consumer<GraphQLResponse<R>> onResponse;
        private GraphQLRequest<R> request;
        private GraphQLResponse.Factory responseFactory;

        public Builder<R> apiName(String str) {
            this.apiName = str;
            return this;
        }

        public Builder<R> apiRequestDecoratorFactory(ApiRequestDecoratorFactory apiRequestDecoratorFactory) {
            Objects.requireNonNull(apiRequestDecoratorFactory);
            this.apiRequestDecoratorFactory = apiRequestDecoratorFactory;
            return this;
        }

        @SuppressLint({"SyntheticAccessor"})
        public AppSyncGraphQLOperation<R> build() {
            return new AppSyncGraphQLOperation<>(this);
        }

        public Builder<R> client(hac hacVar) {
            Objects.requireNonNull(hacVar);
            this.client = hacVar;
            return this;
        }

        public Builder<R> endpoint(String str) {
            Objects.requireNonNull(str);
            this.endpoint = str;
            return this;
        }

        public Builder<R> executorService(ExecutorService executorService) {
            this.executorService = executorService;
            return this;
        }

        public Builder<R> onFailure(Consumer<ApiException> consumer) {
            Objects.requireNonNull(consumer);
            this.onFailure = consumer;
            return this;
        }

        public Builder<R> onResponse(Consumer<GraphQLResponse<R>> consumer) {
            Objects.requireNonNull(consumer);
            this.onResponse = consumer;
            return this;
        }

        public Builder<R> request(GraphQLRequest<R> graphQLRequest) {
            Objects.requireNonNull(graphQLRequest);
            this.request = graphQLRequest;
            return this;
        }

        public Builder<R> responseFactory(GraphQLResponse.Factory factory) {
            Objects.requireNonNull(factory);
            this.responseFactory = factory;
            return this;
        }
    }

    @SuppressLint({"SyntheticAccessor"})
    public class OkHttpCallback implements z22 {
        public OkHttpCallback() {
        }

        @Override // p001o.z22
        public void onFailure(bt1 bt1Var, IOException iOException) {
            if (bt1Var.isCanceled()) {
                return;
            }
            AppSyncGraphQLOperation.this.onFailure.accept(new ApiException("OkHttp client request failed.", iOException, "See attached exception for more details."));
        }

        @Override // p001o.z22
        public void onResponse(bt1 bt1Var, zqe zqeVar) {
            String strM21620r;
            cre creVarM59735c = zqeVar.m59735c();
            if (creVarM59735c != null) {
                try {
                    strM21620r = creVarM59735c.m21620r();
                } catch (IOException e) {
                    AppSyncGraphQLOperation.LOG.warn("Error retrieving JSON from response.", e);
                    AppSyncGraphQLOperation.this.onFailure.accept(new ApiException("Could not retrieve the response body from the returned JSON", e, "Sorry, we don’t have a recovery suggestion for this error."));
                    return;
                }
            } else {
                strM21620r = null;
            }
            if (zqeVar.m59739h() >= 400 && zqeVar.m59739h() <= AppSyncGraphQLOperation.END_OF_CLIENT_ERROR_CODE) {
                AppSyncGraphQLOperation.this.onFailure.accept(new ApiException.NonRetryableException("OkHttp client request failed.", "Irrecoverable error"));
                return;
            }
            try {
                AppSyncGraphQLOperation.this.onResponse.accept(AppSyncGraphQLOperation.this.wrapResponse(strM21620r));
            } catch (ApiException e2) {
                AppSyncGraphQLOperation.this.onFailure.accept(e2);
            }
        }
    }

    public static <R> Builder<R> builder() {
        return new Builder<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchRequest() {
        try {
            LOG.debug("Request: " + ((GraphQLRequest) getRequest()).getContent());
            bt1 bt1VarMo19702a = this.client.mo19702a(this.apiRequestDecoratorFactory.fromGraphQLRequest((GraphQLRequest) getRequest()).decorate(new ule.C17397a().m51769z(this.endpoint).m51745a("accept", CONTENT_TYPE).m51745a("content-type", CONTENT_TYPE).m51761r(xle.m56453c(((GraphQLRequest) getRequest()).getContent(), y9b.m57397g(CONTENT_TYPE))).m51746b()));
            this.ongoingCall = bt1VarMo19702a;
            FirebasePerfOkHttpClient.enqueue(bt1VarMo19702a, new OkHttpCallback());
        } catch (Exception e) {
            bt1 bt1Var = this.ongoingCall;
            if (bt1Var != null) {
                bt1Var.cancel();
            }
            this.onFailure.accept(new ApiException("OkHttp client failed to make a successful request.", e, "Sorry, we don’t have a recovery suggestion for this error."));
        }
    }

    @Override // com.amplifyframework.core.async.Cancelable
    public synchronized void cancel() {
        bt1 bt1Var = this.ongoingCall;
        if (bt1Var != null) {
            bt1Var.cancel();
        }
    }

    @Override // com.amplifyframework.core.async.AmplifyOperation
    public void start() {
        bt1 bt1Var = this.ongoingCall;
        if (bt1Var == null || !(bt1Var.isExecuted() || this.ongoingCall.isCanceled())) {
            this.executorService.submit(new Runnable() { // from class: o.ym0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f55691a.dispatchRequest();
                }
            });
        }
    }

    private AppSyncGraphQLOperation(Builder<R> builder) {
        super(((Builder) builder).request, ((Builder) builder).responseFactory, ((Builder) builder).apiName);
        String str = ((Builder) builder).endpoint;
        Objects.requireNonNull(str);
        this.endpoint = str;
        hac hacVar = ((Builder) builder).client;
        Objects.requireNonNull(hacVar);
        this.client = hacVar;
        ApiRequestDecoratorFactory apiRequestDecoratorFactory = ((Builder) builder).apiRequestDecoratorFactory;
        Objects.requireNonNull(apiRequestDecoratorFactory);
        this.apiRequestDecoratorFactory = apiRequestDecoratorFactory;
        ExecutorService executorService = ((Builder) builder).executorService;
        Objects.requireNonNull(executorService);
        this.executorService = executorService;
        Consumer<GraphQLResponse<R>> consumer = ((Builder) builder).onResponse;
        Objects.requireNonNull(consumer);
        this.onResponse = consumer;
        Consumer<ApiException> consumer2 = ((Builder) builder).onFailure;
        Objects.requireNonNull(consumer2);
        this.onFailure = consumer2;
    }
}
