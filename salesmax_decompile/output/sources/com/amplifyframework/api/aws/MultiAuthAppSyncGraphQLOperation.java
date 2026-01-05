package com.amplifyframework.api.aws;

import android.annotation.SuppressLint;
import com.amplifyframework.api.ApiException;
import com.amplifyframework.api.aws.auth.ApiRequestDecoratorFactory;
import com.amplifyframework.api.graphql.GraphQLRequest;
import com.amplifyframework.api.graphql.GraphQLResponse;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.core.model.auth.AuthorizationTypeIterator;
import com.amplifyframework.datastore.appsync.AppSyncExtensions;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.util.Empty;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import p001o.bt1;
import p001o.cre;
import p001o.hac;
import p001o.mnb;
import p001o.ule;
import p001o.xle;
import p001o.y9b;
import p001o.z22;
import p001o.zqe;

/* loaded from: classes5.dex */
public final class MultiAuthAppSyncGraphQLOperation<R> extends AWSGraphQLOperation<R> {
    private static final String CONTENT_TYPE = "application/json";
    private static final Logger LOG = Amplify.Logging.logger(CategoryType.API, "amplify:aws-api");
    private final ApiRequestDecoratorFactory apiRequestDecoratorFactory;
    private AuthorizationTypeIterator authTypes;
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
            this.apiRequestDecoratorFactory = apiRequestDecoratorFactory;
            return this;
        }

        @SuppressLint({"SyntheticAccessor"})
        public MultiAuthAppSyncGraphQLOperation<R> build() {
            return new MultiAuthAppSyncGraphQLOperation<>(this);
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
            MultiAuthAppSyncGraphQLOperation.this.onFailure.accept(new ApiException("OkHttp client request failed.", iOException, "See attached exception for more details."));
        }

        @Override // p001o.z22
        public void onResponse(bt1 bt1Var, zqe zqeVar) {
            String strM21620r;
            cre creVarM59735c = zqeVar.m59735c();
            if (creVarM59735c != null) {
                try {
                    strM21620r = creVarM59735c.m21620r();
                } catch (IOException e) {
                    MultiAuthAppSyncGraphQLOperation.this.onFailure.accept(new ApiException("Could not retrieve the response body from the returned JSON", e, "Sorry, we don’t have a recovery suggestion for this error."));
                    return;
                }
            } else {
                strM21620r = null;
            }
            try {
                GraphQLResponse<R> graphQLResponseWrapResponse = MultiAuthAppSyncGraphQLOperation.this.wrapResponse(strM21620r);
                if (!graphQLResponseWrapResponse.hasErrors() || !MultiAuthAppSyncGraphQLOperation.this.hasAuthRelatedErrors(graphQLResponseWrapResponse)) {
                    MultiAuthAppSyncGraphQLOperation.this.onResponse.accept(graphQLResponseWrapResponse);
                } else {
                    if (!MultiAuthAppSyncGraphQLOperation.this.authTypes.hasNext()) {
                        MultiAuthAppSyncGraphQLOperation.this.onFailure.accept(new ApiException.ApiAuthException("Unable to successfully complete request with any of the compatible auth types.", "Check your application logs for detail."));
                        return;
                    }
                    ExecutorService executorService = MultiAuthAppSyncGraphQLOperation.this.executorService;
                    final MultiAuthAppSyncGraphQLOperation multiAuthAppSyncGraphQLOperation = MultiAuthAppSyncGraphQLOperation.this;
                    executorService.submit(new Runnable() { // from class: com.amplifyframework.api.aws.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            multiAuthAppSyncGraphQLOperation.dispatchRequest();
                        }
                    });
                }
            } catch (ApiException e2) {
                MultiAuthAppSyncGraphQLOperation.this.onFailure.accept(e2);
            }
        }
    }

    public static <R> Builder<R> builder() {
        return new Builder<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchRequest() {
        if (!this.authTypes.hasNext()) {
            this.onFailure.accept(new ApiException.ApiAuthException("Unable to successfully complete request with any of the compatible auth types.", "Check your application logs for detail."));
            return;
        }
        AuthorizationType next = this.authTypes.next();
        try {
            ule uleVarDecorate = this.apiRequestDecoratorFactory.forAuthType(next).decorate(new ule.C17397a().m51769z(this.endpoint).m51745a("accept", CONTENT_TYPE).m51745a("content-type", CONTENT_TYPE).m51761r(xle.m56453c(((GraphQLRequest) getRequest()).getContent(), y9b.m57397g(CONTENT_TYPE))).m51746b());
            LOG.debug("Request: " + ((GraphQLRequest) getRequest()).getContent());
            bt1 bt1VarMo19702a = this.client.mo19702a(uleVarDecorate);
            this.ongoingCall = bt1VarMo19702a;
            FirebasePerfOkHttpClient.enqueue(bt1VarMo19702a, new OkHttpCallback());
        } catch (ApiException e) {
            LOG.warn("Failed to make a successful request with " + next, e);
            if ((e instanceof ApiException.ApiAuthException) && this.authTypes.hasNext()) {
                this.executorService.submit(new mnb(this));
            } else {
                this.onFailure.accept(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasAuthRelatedErrors(GraphQLResponse<R> graphQLResponse) {
        for (GraphQLResponse.Error error : graphQLResponse.getErrors()) {
            if (!Empty.check(error.getExtensions())) {
                return new AppSyncExtensions(error.getExtensions()).isUnauthorizedErrorType();
            }
        }
        return false;
    }

    @Override // com.amplifyframework.core.async.Cancelable
    public void cancel() {
        bt1 bt1Var = this.ongoingCall;
        if (bt1Var != null) {
            bt1Var.cancel();
        }
    }

    @Override // com.amplifyframework.core.async.AmplifyOperation
    public void start() {
        bt1 bt1Var = this.ongoingCall;
        if (bt1Var == null || !bt1Var.isExecuted()) {
            this.executorService.submit(new mnb(this));
        }
    }

    private MultiAuthAppSyncGraphQLOperation(Builder<R> builder) {
        super(((Builder) builder).request, ((Builder) builder).responseFactory, ((Builder) builder).apiName);
        this.apiRequestDecoratorFactory = ((Builder) builder).apiRequestDecoratorFactory;
        this.endpoint = ((Builder) builder).endpoint;
        this.client = ((Builder) builder).client;
        this.onResponse = ((Builder) builder).onResponse;
        Consumer<ApiException> consumer = ((Builder) builder).onFailure;
        this.onFailure = consumer;
        this.executorService = ((Builder) builder).executorService;
        if (!(getRequest() instanceof AppSyncGraphQLRequest)) {
            consumer.accept(new ApiException("Multiauth only supported with AppSyncGraphQLRequest<T>.", "Sorry, we don’t have a recovery suggestion for this error."));
        } else {
            AppSyncGraphQLRequest appSyncGraphQLRequest = (AppSyncGraphQLRequest) getRequest();
            this.authTypes = MultiAuthModeStrategy.getInstance().authTypesFor(appSyncGraphQLRequest.getModelSchema(), appSyncGraphQLRequest.getAuthRuleOperation());
        }
    }
}
