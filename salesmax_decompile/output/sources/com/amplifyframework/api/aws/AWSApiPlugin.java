package com.amplifyframework.api.aws;

import android.content.Context;
import com.amplifyframework.annotations.InternalAmplifyApi;
import com.amplifyframework.api.ApiException;
import com.amplifyframework.api.ApiPlugin;
import com.amplifyframework.api.aws.AWSApiPlugin;
import com.amplifyframework.api.aws.UserAgentInterceptor;
import com.amplifyframework.api.aws.auth.ApiRequestDecoratorFactory;
import com.amplifyframework.api.aws.auth.AuthRuleRequestDecorator;
import com.amplifyframework.api.aws.operation.AWSRestOperation;
import com.amplifyframework.api.events.ApiEndpointStatusChangeEvent;
import com.amplifyframework.api.graphql.GraphQLOperation;
import com.amplifyframework.api.graphql.GraphQLRequest;
import com.amplifyframework.api.graphql.GraphQLResponse;
import com.amplifyframework.api.rest.HttpMethod;
import com.amplifyframework.api.rest.RestOperation;
import com.amplifyframework.api.rest.RestOperationRequest;
import com.amplifyframework.api.rest.RestOptions;
import com.amplifyframework.api.rest.RestResponse;
import com.amplifyframework.core.Action;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.core.configuration.AmplifyOutputsData;
import com.amplifyframework.hub.HubChannel;
import com.amplifyframework.util.Immutable;
import com.amplifyframework.util.UserAgent;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import p001o.a2e;
import p001o.bt1;
import p001o.dk6;
import p001o.hac;
import p001o.s6c;
import p001o.tn8;
import p001o.xr3;
import p001o.zqe;

/* loaded from: classes5.dex */
public final class AWSApiPlugin extends ApiPlugin<Map<String, hac>> {
    public static final String DEFAULT_GRAPHQL_API = "defaultGraphQLApi";
    private final Map<String, ClientDetails> apiDetails;
    private final Map<String, OkHttpConfigurator> apiHttpClientConfigurators;
    private final Map<String, OkHttpConfigurator> apiWebsocketUpgradeClientConfigurators;
    private final ApiAuthProviders authProvider;
    private final ExecutorService executorService;
    private final Set<String> gqlApis;
    private final GraphQLResponse.Factory gqlResponseFactory;
    private final AuthRuleRequestDecorator requestDecorator;
    private final Set<String> restApis;

    /* renamed from: com.amplifyframework.api.aws.AWSApiPlugin$1 */
    public static /* synthetic */ class C102801 {
        static final /* synthetic */ int[] $SwitchMap$com$amplifyframework$api$aws$EndpointType;
        static final /* synthetic */ int[] $SwitchMap$com$amplifyframework$api$rest$HttpMethod;

        static {
            int[] iArr = new int[HttpMethod.values().length];
            $SwitchMap$com$amplifyframework$api$rest$HttpMethod = iArr;
            try {
                iArr[HttpMethod.HEAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amplifyframework$api$rest$HttpMethod[HttpMethod.GET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amplifyframework$api$rest$HttpMethod[HttpMethod.DELETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amplifyframework$api$rest$HttpMethod[HttpMethod.PUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amplifyframework$api$rest$HttpMethod[HttpMethod.POST.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$amplifyframework$api$rest$HttpMethod[HttpMethod.PATCH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[EndpointType.values().length];
            $SwitchMap$com$amplifyframework$api$aws$EndpointType = iArr2;
            try {
                iArr2[EndpointType.REST.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$amplifyframework$api$aws$EndpointType[EndpointType.GRAPHQL.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static final class ApiConnectionEventListener extends dk6 {
        private final AtomicReference<ApiEndpointStatusChangeEvent.ApiEndpointStatus> currentNetworkStatus = new AtomicReference<>(ApiEndpointStatusChangeEvent.ApiEndpointStatus.UNKOWN);

        private void transitionTo(ApiEndpointStatusChangeEvent.ApiEndpointStatus apiEndpointStatus) {
            ApiEndpointStatusChangeEvent.ApiEndpointStatus andSet = this.currentNetworkStatus.getAndSet(apiEndpointStatus);
            if (andSet != apiEndpointStatus) {
                Amplify.Hub.publish(HubChannel.API, andSet.transitionTo(apiEndpointStatus).toHubEvent());
            }
        }

        @Override // p001o.dk6
        public void connectFailed(bt1 bt1Var, InetSocketAddress inetSocketAddress, Proxy proxy, a2e a2eVar, IOException iOException) {
            super.connectFailed(bt1Var, inetSocketAddress, proxy, a2eVar, iOException);
            transitionTo(ApiEndpointStatusChangeEvent.ApiEndpointStatus.NOT_REACHABLE);
        }

        @Override // p001o.dk6
        public void connectionAcquired(bt1 bt1Var, xr3 xr3Var) {
            super.connectionAcquired(bt1Var, xr3Var);
            transitionTo(ApiEndpointStatusChangeEvent.ApiEndpointStatus.REACHABLE);
        }
    }

    public static final class Builder {
        private ApiAuthProviders apiAuthProviders;
        private final Map<String, OkHttpConfigurator> apiHttpClientConfigurators;
        private final Map<String, OkHttpConfigurator> apiWebsocketUpgradeClientConfigurators;

        public Builder apiAuthProviders(ApiAuthProviders apiAuthProviders) {
            Objects.requireNonNull(apiAuthProviders);
            this.apiAuthProviders = apiAuthProviders;
            return this;
        }

        public AWSApiPlugin build() {
            return new AWSApiPlugin(this);
        }

        public Builder configureClient(String str, OkHttpConfigurator okHttpConfigurator) {
            this.apiHttpClientConfigurators.put(str, okHttpConfigurator);
            return this;
        }

        public Builder configureWebSocketUpgradeClient(String str, OkHttpConfigurator okHttpConfigurator) {
            this.apiWebsocketUpgradeClientConfigurators.put(str, okHttpConfigurator);
            return this;
        }

        private Builder() {
            this.apiAuthProviders = ApiAuthProviders.noProviderOverrides();
            this.apiHttpClientConfigurators = new HashMap();
            this.apiWebsocketUpgradeClientConfigurators = new HashMap();
        }
    }

    public static final class ClientDetails {
        private final ApiConfiguration apiConfiguration;
        private final ApiRequestDecoratorFactory apiRequestDecoratorFactory;
        private final hac okHttpClient;
        private final SubscriptionEndpoint subscriptionEndpoint;

        public ClientDetails(ApiConfiguration apiConfiguration, hac hacVar, SubscriptionEndpoint subscriptionEndpoint, ApiRequestDecoratorFactory apiRequestDecoratorFactory) {
            this.apiConfiguration = apiConfiguration;
            this.okHttpClient = hacVar;
            this.subscriptionEndpoint = subscriptionEndpoint;
            this.apiRequestDecoratorFactory = apiRequestDecoratorFactory;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || ClientDetails.class != obj.getClass()) {
                return false;
            }
            ClientDetails clientDetails = (ClientDetails) obj;
            if (s6c.m47909a(this.apiConfiguration, clientDetails.apiConfiguration) && s6c.m47909a(this.okHttpClient, clientDetails.okHttpClient)) {
                return s6c.m47909a(this.subscriptionEndpoint, clientDetails.subscriptionEndpoint);
            }
            return false;
        }

        public ApiConfiguration getApiConfiguration() {
            return this.apiConfiguration;
        }

        public ApiRequestDecoratorFactory getApiRequestDecoratorFactory() {
            return this.apiRequestDecoratorFactory;
        }

        public hac getOkHttpClient() {
            return this.okHttpClient;
        }

        public SubscriptionEndpoint getSubscriptionEndpoint() {
            return this.subscriptionEndpoint;
        }

        public int hashCode() {
            ApiConfiguration apiConfiguration = this.apiConfiguration;
            int iHashCode = (apiConfiguration != null ? apiConfiguration.hashCode() : 0) * 31;
            hac hacVar = this.okHttpClient;
            int iHashCode2 = (iHashCode + (hacVar != null ? hacVar.hashCode() : 0)) * 31;
            SubscriptionEndpoint subscriptionEndpoint = this.subscriptionEndpoint;
            return iHashCode2 + (subscriptionEndpoint != null ? subscriptionEndpoint.hashCode() : 0);
        }
    }

    private <R> GraphQLOperation<R> buildAppSyncGraphQLOperation(String str, GraphQLRequest<R> graphQLRequest, Consumer<GraphQLResponse<R>> consumer, Consumer<ApiException> consumer2) throws ApiException {
        ClientDetails clientDetails = this.apiDetails.get(str);
        if (clientDetails != null) {
            return AuthModeStrategyType.MULTIAUTH.equals(getAuthModeStrategyType(graphQLRequest)) ? MultiAuthAppSyncGraphQLOperation.builder().apiName(str).endpoint(clientDetails.getApiConfiguration().getEndpoint()).client(clientDetails.getOkHttpClient()).request(graphQLRequest).apiRequestDecoratorFactory(clientDetails.getApiRequestDecoratorFactory()).responseFactory(this.gqlResponseFactory).onResponse(consumer).onFailure(consumer2).executorService(this.executorService).build() : AppSyncGraphQLOperation.builder().apiName(str).endpoint(clientDetails.getApiConfiguration().getEndpoint()).client(clientDetails.getOkHttpClient()).request(graphQLRequest).apiRequestDecoratorFactory(clientDetails.getApiRequestDecoratorFactory()).responseFactory(this.gqlResponseFactory).executorService(this.executorService).onResponse(consumer).onFailure(consumer2).build();
        }
        throw new ApiException("No client information for API named " + str, "Check your amplify configuration to make sure there is a correctly configured section for " + str);
    }

    private <R> GraphQLOperation<R> buildSubscriptionOperation(String str, GraphQLRequest<R> graphQLRequest, Consumer<String> consumer, Consumer<GraphQLResponse<R>> consumer2, Consumer<ApiException> consumer3, Action action) throws ApiException {
        ClientDetails clientDetails = this.apiDetails.get(str);
        if (clientDetails == null) {
            throw new ApiException("No client information for API named " + str, "Check your amplify configuration to make sure there is a correctly configured section for " + str);
        }
        if (AuthModeStrategyType.MULTIAUTH.equals(getAuthModeStrategyType(graphQLRequest))) {
            return MultiAuthSubscriptionOperation.builder().apiName(str).subscriptionEndpoint(clientDetails.getSubscriptionEndpoint()).graphQlRequest((AppSyncGraphQLRequest) graphQLRequest).responseFactory(this.gqlResponseFactory).executorService(this.executorService).onSubscriptionStart(consumer).onNextItem(consumer2).onSubscriptionError(consumer3).onSubscriptionComplete(action).requestDecorator(this.requestDecorator).build();
        }
        AuthorizationType authorizationType = clientDetails.getApiConfiguration().getAuthorizationType();
        if (graphQLRequest instanceof AppSyncGraphQLRequest) {
            AppSyncGraphQLRequest appSyncGraphQLRequest = (AppSyncGraphQLRequest) graphQLRequest;
            if (appSyncGraphQLRequest.getAuthorizationType() != null) {
                authorizationType = appSyncGraphQLRequest.getAuthorizationType();
            }
        }
        return SubscriptionOperation.builder().apiName(str).subscriptionEndpoint(clientDetails.getSubscriptionEndpoint()).graphQlRequest(this.requestDecorator.decorate(graphQLRequest, authorizationType)).responseFactory(this.gqlResponseFactory).executorService(this.executorService).onSubscriptionStart(consumer).onNextItem(consumer2).onSubscriptionError(consumer3).onSubscriptionComplete(action).authorizationType(authorizationType).build();
    }

    public static Builder builder() {
        return new Builder();
    }

    private RestOperation createRestOperation(String str, HttpMethod httpMethod, RestOptions restOptions, Consumer<RestResponse> consumer, Consumer<ApiException> consumer2) throws ApiException {
        RestOperationRequest restOperationRequest;
        ClientDetails clientDetails = this.apiDetails.get(str);
        if (clientDetails == null) {
            throw new ApiException("No client information for API named " + str, "Check your amplify configuration to make sure there is a correctly configured section for " + str);
        }
        switch (C102801.$SwitchMap$com$amplifyframework$api$rest$HttpMethod[httpMethod.ordinal()]) {
            case 1:
            case 2:
                if (!restOptions.hasData()) {
                    restOperationRequest = new RestOperationRequest(httpMethod, restOptions.getPath(), restOptions.getHeaders(), restOptions.getQueryParameters());
                    break;
                } else {
                    throw new ApiException("HTTP method does not support data object! " + httpMethod, "Try sending the request without any data in the options.");
                }
            case 3:
                if (!restOptions.hasData()) {
                    restOperationRequest = new RestOperationRequest(httpMethod, restOptions.getPath(), restOptions.getHeaders(), restOptions.getQueryParameters());
                    break;
                } else {
                    restOperationRequest = new RestOperationRequest(httpMethod, restOptions.getPath(), restOptions.getData(), restOptions.getHeaders(), restOptions.getQueryParameters());
                    break;
                }
            case 4:
            case 5:
            case 6:
                restOperationRequest = new RestOperationRequest(httpMethod, restOptions.getPath(), restOptions.getData() == null ? new byte[0] : restOptions.getData(), restOptions.getHeaders(), restOptions.getQueryParameters());
                break;
            default:
                throw new ApiException("Unknown REST operation type: " + httpMethod, "Send support type for the request.");
        }
        AWSRestOperation aWSRestOperation = new AWSRestOperation(restOperationRequest, clientDetails.apiConfiguration.getEndpoint(), clientDetails.okHttpClient, consumer, consumer2);
        aWSRestOperation.start();
        return aWSRestOperation;
    }

    private <R> AuthModeStrategyType getAuthModeStrategyType(GraphQLRequest<R> graphQLRequest) {
        if (graphQLRequest instanceof AppSyncGraphQLRequest) {
            AppSyncGraphQLRequest appSyncGraphQLRequest = (AppSyncGraphQLRequest) graphQLRequest;
            if (appSyncGraphQLRequest.getAuthorizationType() == null && appSyncGraphQLRequest.getAuthModeStrategyType() != null && appSyncGraphQLRequest.getModelSchema().hasModelLevelRules()) {
                return appSyncGraphQLRequest.getAuthModeStrategyType();
            }
        }
        return AuthModeStrategyType.DEFAULT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ zqe lambda$configure$0(ApiRequestDecoratorFactory apiRequestDecoratorFactory, AuthorizationType authorizationType, tn8.InterfaceC17165a interfaceC17165a) throws IOException {
        try {
            return interfaceC17165a.mo20972a(apiRequestDecoratorFactory.forAuthType(authorizationType).decorate(interfaceC17165a.request()));
        } catch (ApiException.ApiAuthException e) {
            throw new IOException("Failed to decorate request for authorization.", e);
        } catch (Exception e2) {
            throw new IOException("An error occurred while making the request.", e2);
        }
    }

    private String selectApiName(Set<String> set) throws ApiException {
        if (set.isEmpty()) {
            throw new ApiException("There is no API configured for this plugin with matching endpoint type.", "Please add at least one API in amplifyconfiguration.json.");
        }
        if (set.size() <= 1) {
            return set.iterator().next();
        }
        throw new ApiException("There is more than one API configured for this plugin with matching endpoint type.", "Please specify the name of API to invoke in the API method.");
    }

    @Override // com.amplifyframework.core.plugin.Plugin
    public void configure(JSONObject jSONObject, Context context) {
        configure(AWSApiPluginConfigurationReader.readFrom(jSONObject));
    }

    @Override // com.amplifyframework.api.rest.RestBehavior
    public RestOperation delete(RestOptions restOptions, Consumer<RestResponse> consumer, Consumer<ApiException> consumer2) {
        try {
            return delete(getSelectedApiName(EndpointType.REST), restOptions, consumer, consumer2);
        } catch (ApiException e) {
            consumer2.accept(e);
            return null;
        }
    }

    @Override // com.amplifyframework.api.rest.RestBehavior
    public RestOperation get(RestOptions restOptions, Consumer<RestResponse> consumer, Consumer<ApiException> consumer2) {
        try {
            return get(getSelectedApiName(EndpointType.REST), restOptions, consumer, consumer2);
        } catch (ApiException e) {
            consumer2.accept(e);
            return null;
        }
    }

    @Override // com.amplifyframework.core.plugin.Plugin
    public String getPluginKey() {
        return "awsAPIPlugin";
    }

    public String getSelectedApiName(EndpointType endpointType) throws ApiException {
        int i = C102801.$SwitchMap$com$amplifyframework$api$aws$EndpointType[endpointType.ordinal()];
        if (i == 1) {
            return selectApiName(this.restApis);
        }
        if (i == 2) {
            return selectApiName(this.gqlApis);
        }
        throw new ApiException(endpointType.name() + " is not a supported endpoint type.", "Please use REST or GraphQL as endpoint type.");
    }

    @Override // com.amplifyframework.core.plugin.Plugin
    public String getVersion() {
        return "2.27.1";
    }

    @Override // com.amplifyframework.api.rest.RestBehavior
    public RestOperation head(RestOptions restOptions, Consumer<RestResponse> consumer, Consumer<ApiException> consumer2) {
        try {
            return head(getSelectedApiName(EndpointType.REST), restOptions, consumer, consumer2);
        } catch (ApiException e) {
            consumer2.accept(e);
            return null;
        }
    }

    @Override // com.amplifyframework.api.graphql.GraphQLBehavior
    public <R> GraphQLOperation<R> mutate(GraphQLRequest<R> graphQLRequest, Consumer<GraphQLResponse<R>> consumer, Consumer<ApiException> consumer2) {
        try {
            return mutate(getSelectedApiName(EndpointType.GRAPHQL), graphQLRequest, consumer, consumer2);
        } catch (ApiException e) {
            consumer2.accept(e);
            return null;
        }
    }

    @Override // com.amplifyframework.api.rest.RestBehavior
    public RestOperation patch(RestOptions restOptions, Consumer<RestResponse> consumer, Consumer<ApiException> consumer2) {
        try {
            return patch(getSelectedApiName(EndpointType.REST), restOptions, consumer, consumer2);
        } catch (ApiException e) {
            consumer2.accept(e);
            return null;
        }
    }

    @Override // com.amplifyframework.api.rest.RestBehavior
    public RestOperation post(RestOptions restOptions, Consumer<RestResponse> consumer, Consumer<ApiException> consumer2) {
        try {
            return post(getSelectedApiName(EndpointType.REST), restOptions, consumer, consumer2);
        } catch (ApiException e) {
            consumer2.accept(e);
            return null;
        }
    }

    @Override // com.amplifyframework.api.rest.RestBehavior
    public RestOperation put(RestOptions restOptions, Consumer<RestResponse> consumer, Consumer<ApiException> consumer2) {
        try {
            return put(getSelectedApiName(EndpointType.REST), restOptions, consumer, consumer2);
        } catch (ApiException e) {
            consumer2.accept(e);
            return null;
        }
    }

    @Override // com.amplifyframework.api.graphql.GraphQLBehavior
    public <R> GraphQLOperation<R> query(GraphQLRequest<R> graphQLRequest, Consumer<GraphQLResponse<R>> consumer, Consumer<ApiException> consumer2) {
        try {
            return query(getSelectedApiName(EndpointType.GRAPHQL), graphQLRequest, consumer, consumer2);
        } catch (ApiException e) {
            consumer2.accept(e);
            return null;
        }
    }

    @Override // com.amplifyframework.api.graphql.GraphQLBehavior
    public <R> GraphQLOperation<R> subscribe(GraphQLRequest<R> graphQLRequest, Consumer<String> consumer, Consumer<GraphQLResponse<R>> consumer2, Consumer<ApiException> consumer3, Action action) {
        try {
            return subscribe(getSelectedApiName(EndpointType.GRAPHQL), graphQLRequest, consumer, consumer2, consumer3, action);
        } catch (ApiException e) {
            consumer3.accept(e);
            return null;
        }
    }

    public AWSApiPlugin() {
        this(builder());
    }

    @Override // com.amplifyframework.core.plugin.Plugin
    public Map<String, hac> getEscapeHatch() {
        HashMap map = new HashMap();
        for (Map.Entry<String, ClientDetails> entry : this.apiDetails.entrySet()) {
            map.put(entry.getKey(), entry.getValue().getOkHttpClient());
        }
        return Collections.unmodifiableMap(map);
    }

    @Deprecated
    public AWSApiPlugin(ApiAuthProviders apiAuthProviders) {
        this(builder().apiAuthProviders(apiAuthProviders));
    }

    @Override // com.amplifyframework.core.plugin.Plugin
    @InternalAmplifyApi
    public void configure(AmplifyOutputsData amplifyOutputsData, Context context) {
        configure(AWSApiPluginConfigurationReader.from(amplifyOutputsData));
    }

    private AWSApiPlugin(Builder builder) {
        this.apiDetails = new HashMap();
        this.gqlResponseFactory = new GsonGraphQLResponseFactory();
        ApiAuthProviders apiAuthProviders = builder.apiAuthProviders;
        this.authProvider = apiAuthProviders;
        this.restApis = new HashSet();
        this.gqlApis = new HashSet();
        this.executorService = Executors.newCachedThreadPool();
        this.requestDecorator = new AuthRuleRequestDecorator(apiAuthProviders);
        this.apiHttpClientConfigurators = Immutable.of(builder.apiHttpClientConfigurators);
        this.apiWebsocketUpgradeClientConfigurators = Immutable.of(builder.apiWebsocketUpgradeClientConfigurators);
    }

    @Override // com.amplifyframework.api.rest.RestBehavior
    public RestOperation delete(String str, RestOptions restOptions, Consumer<RestResponse> consumer, Consumer<ApiException> consumer2) {
        try {
            return createRestOperation(str, HttpMethod.DELETE, restOptions, consumer, consumer2);
        } catch (ApiException e) {
            consumer2.accept(e);
            return null;
        }
    }

    @Override // com.amplifyframework.api.rest.RestBehavior
    public RestOperation get(String str, RestOptions restOptions, Consumer<RestResponse> consumer, Consumer<ApiException> consumer2) {
        try {
            return createRestOperation(str, HttpMethod.GET, restOptions, consumer, consumer2);
        } catch (ApiException e) {
            consumer2.accept(e);
            return null;
        }
    }

    @Override // com.amplifyframework.api.rest.RestBehavior
    public RestOperation head(String str, RestOptions restOptions, Consumer<RestResponse> consumer, Consumer<ApiException> consumer2) {
        try {
            return createRestOperation(str, HttpMethod.HEAD, restOptions, consumer, consumer2);
        } catch (ApiException e) {
            consumer2.accept(e);
            return null;
        }
    }

    @Override // com.amplifyframework.api.graphql.GraphQLBehavior
    public <R> GraphQLOperation<R> mutate(String str, GraphQLRequest<R> graphQLRequest, Consumer<GraphQLResponse<R>> consumer, Consumer<ApiException> consumer2) {
        try {
            GraphQLOperation<R> graphQLOperationBuildAppSyncGraphQLOperation = buildAppSyncGraphQLOperation(str, graphQLRequest, consumer, consumer2);
            graphQLOperationBuildAppSyncGraphQLOperation.start();
            return graphQLOperationBuildAppSyncGraphQLOperation;
        } catch (ApiException e) {
            consumer2.accept(e);
            return null;
        }
    }

    @Override // com.amplifyframework.api.rest.RestBehavior
    public RestOperation patch(String str, RestOptions restOptions, Consumer<RestResponse> consumer, Consumer<ApiException> consumer2) {
        try {
            return createRestOperation(str, HttpMethod.PATCH, restOptions, consumer, consumer2);
        } catch (ApiException e) {
            consumer2.accept(e);
            return null;
        }
    }

    @Override // com.amplifyframework.api.rest.RestBehavior
    public RestOperation post(String str, RestOptions restOptions, Consumer<RestResponse> consumer, Consumer<ApiException> consumer2) {
        try {
            return createRestOperation(str, HttpMethod.POST, restOptions, consumer, consumer2);
        } catch (ApiException e) {
            consumer2.accept(e);
            return null;
        }
    }

    @Override // com.amplifyframework.api.rest.RestBehavior
    public RestOperation put(String str, RestOptions restOptions, Consumer<RestResponse> consumer, Consumer<ApiException> consumer2) {
        try {
            return createRestOperation(str, HttpMethod.PUT, restOptions, consumer, consumer2);
        } catch (ApiException e) {
            consumer2.accept(e);
            return null;
        }
    }

    @Override // com.amplifyframework.api.graphql.GraphQLBehavior
    public <R> GraphQLOperation<R> query(String str, GraphQLRequest<R> graphQLRequest, Consumer<GraphQLResponse<R>> consumer, Consumer<ApiException> consumer2) {
        try {
            GraphQLOperation<R> graphQLOperationBuildAppSyncGraphQLOperation = buildAppSyncGraphQLOperation(str, graphQLRequest, consumer, consumer2);
            graphQLOperationBuildAppSyncGraphQLOperation.start();
            return graphQLOperationBuildAppSyncGraphQLOperation;
        } catch (ApiException e) {
            consumer2.accept(e);
            return null;
        }
    }

    @Override // com.amplifyframework.api.graphql.GraphQLBehavior
    public <R> GraphQLOperation<R> subscribe(String str, GraphQLRequest<R> graphQLRequest, Consumer<String> consumer, Consumer<GraphQLResponse<R>> consumer2, Consumer<ApiException> consumer3, Action action) {
        try {
            GraphQLOperation<R> graphQLOperationBuildSubscriptionOperation = buildSubscriptionOperation(str, graphQLRequest, consumer, consumer2, consumer3, action);
            graphQLOperationBuildSubscriptionOperation.start();
            return graphQLOperationBuildSubscriptionOperation;
        } catch (ApiException e) {
            consumer3.accept(e);
            return null;
        }
    }

    private void configure(AWSApiPluginConfiguration aWSApiPluginConfiguration) {
        for (Map.Entry<String, ApiConfiguration> entry : aWSApiPluginConfiguration.getApis().entrySet()) {
            String key = entry.getKey();
            ApiConfiguration value = entry.getValue();
            EndpointType endpointType = value.getEndpointType();
            hac.C13902a c13902a = new hac.C13902a();
            c13902a.m30115b(UserAgentInterceptor.using(new UserAgentInterceptor.UserAgentProvider() { // from class: com.amplifyframework.api.aws.a
                @Override // com.amplifyframework.api.aws.UserAgentInterceptor.UserAgentProvider
                public final String getUserAgent() {
                    return UserAgent.string();
                }
            }));
            c13902a.m30123j(new ApiConnectionEventListener());
            OkHttpConfigurator okHttpConfigurator = this.apiHttpClientConfigurators.get(key);
            if (okHttpConfigurator != null) {
                okHttpConfigurator.applyConfiguration(c13902a);
            }
            final ApiRequestDecoratorFactory apiRequestDecoratorFactory = new ApiRequestDecoratorFactory(this.authProvider, value.getAuthorizationType(), value.getRegion(), value.getEndpointType(), value.getApiKey());
            ClientDetails clientDetails = null;
            if (EndpointType.REST.equals(endpointType)) {
                if (value.getAuthorizationType() != AuthorizationType.NONE) {
                    final AuthorizationType authorizationType = value.getAuthorizationType();
                    c13902a.m30114a(new tn8() { // from class: o.n1
                        @Override // p001o.tn8
                        public final zqe intercept(tn8.InterfaceC17165a interfaceC17165a) {
                            return AWSApiPlugin.lambda$configure$0(apiRequestDecoratorFactory, authorizationType, interfaceC17165a);
                        }
                    });
                }
                ClientDetails clientDetails2 = new ClientDetails(value, c13902a.m30116c(), null, apiRequestDecoratorFactory);
                this.restApis.add(key);
                clientDetails = clientDetails2;
            } else if (EndpointType.GRAPHQL.equals(endpointType)) {
                clientDetails = new ClientDetails(value, c13902a.m30116c(), new SubscriptionEndpoint(value, this.apiWebsocketUpgradeClientConfigurators.get(key), this.gqlResponseFactory, new SubscriptionAuthorizer(value, this.authProvider), key), apiRequestDecoratorFactory);
                this.gqlApis.add(key);
            }
            if (clientDetails != null) {
                this.apiDetails.put(key, clientDetails);
            }
        }
    }
}
