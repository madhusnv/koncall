package com.amplifyframework.api.aws;

import android.net.Uri;
import com.amplifyframework.AmplifyException;
import com.amplifyframework.api.ApiException;
import com.amplifyframework.api.aws.SubscriptionEndpoint;
import com.amplifyframework.api.aws.utils.JSONObjectExtensionsKt;
import com.amplifyframework.api.graphql.GraphQLRequest;
import com.amplifyframework.api.graphql.GraphQLResponse;
import com.amplifyframework.core.Action;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.util.UserAgent;
import com.google.firebase.messaging.Constants;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.lang.reflect.Type;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.b6j;
import p001o.d6j;
import p001o.hac;
import p001o.s6c;
import p001o.ule;
import p001o.zqe;

/* loaded from: classes5.dex */
final class SubscriptionEndpoint {
    private static final int CONNECTION_ACKNOWLEDGEMENT_TIMEOUT = 30;
    private static final Logger LOG = Amplify.Logging.logger(CategoryType.API, "amplify:aws-api");
    private static final int NORMAL_CLOSURE_STATUS = 1000;
    private static final String UNAUTHORIZED_EXCEPTION = "UnauthorizedException";
    private final ApiConfiguration apiConfiguration;
    private String apiName;
    private final SubscriptionAuthorizer authorizer;
    private final hac okHttpClient;
    private final Set<String> pendingSubscriptionIds;
    private final GraphQLResponse.Factory responseFactory;
    private final Map<String, Subscription<?>> subscriptions;
    private final TimeoutWatchdog timeoutWatchdog;
    private b6j webSocket;
    private AmplifyWebSocketListener webSocketListener;
    private final Object webSocketLock = new Object();

    /* renamed from: com.amplifyframework.api.aws.SubscriptionEndpoint$1 */
    public static /* synthetic */ class C102941 {
        static final /* synthetic */ int[] $SwitchMap$com$amplifyframework$api$aws$SubscriptionMessageType;

        static {
            int[] iArr = new int[SubscriptionMessageType.values().length];
            $SwitchMap$com$amplifyframework$api$aws$SubscriptionMessageType = iArr;
            try {
                iArr[SubscriptionMessageType.CONNECTION_ACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amplifyframework$api$aws$SubscriptionMessageType[SubscriptionMessageType.CONNECTION_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amplifyframework$api$aws$SubscriptionMessageType[SubscriptionMessageType.SUBSCRIPTION_ACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amplifyframework$api$aws$SubscriptionMessageType[SubscriptionMessageType.SUBSCRIPTION_COMPLETE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amplifyframework$api$aws$SubscriptionMessageType[SubscriptionMessageType.CONNECTION_KEEP_ALIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$amplifyframework$api$aws$SubscriptionMessageType[SubscriptionMessageType.SUBSCRIPTION_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$amplifyframework$api$aws$SubscriptionMessageType[SubscriptionMessageType.SUBSCRIPTION_DATA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public final class AmplifyWebSocketListener extends d6j {
        private final CountDownLatch connectionResponse;
        private final AtomicReference<EndpointStatus> endpointStatus;

        public AmplifyWebSocketListener(SubscriptionEndpoint subscriptionEndpoint) {
            this(new CountDownLatch(1));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$processJsonMessage$0(b6j b6jVar) {
            SubscriptionEndpoint.LOG.warn("WebSocket closed due to timeout.");
            b6jVar.mo18204f(1000, "WebSocket closed due to timeout.");
        }

        private void processJsonMessage(final b6j b6jVar, String str) throws ApiException {
            try {
                JSONObject jSONObject = new JSONObject(str);
                SubscriptionMessageType subscriptionMessageTypeFrom = SubscriptionMessageType.from(jSONObject.getString("type"));
                switch (C102941.$SwitchMap$com$amplifyframework$api$aws$SubscriptionMessageType[subscriptionMessageTypeFrom.ordinal()]) {
                    case 1:
                        SubscriptionEndpoint.this.timeoutWatchdog.start(new Runnable() { // from class: com.amplifyframework.api.aws.l
                            @Override // java.lang.Runnable
                            public final void run() {
                                SubscriptionEndpoint.AmplifyWebSocketListener.lambda$processJsonMessage$0(b6jVar);
                            }
                        }, Integer.parseInt(jSONObject.getJSONObject("payload").getString("connectionTimeoutMs")));
                        this.endpointStatus.set(EndpointStatus.CONNECTED);
                        this.connectionResponse.countDown();
                        return;
                    case 2:
                        this.endpointStatus.set(EndpointStatus.CONNECTION_FAILED);
                        SubscriptionEndpoint.LOG.warn("Websocket listener received a CONNECTION_ERROR event. " + str);
                        this.connectionResponse.countDown();
                        return;
                    case 3:
                        SubscriptionEndpoint.this.notifySubscriptionAcknowledged(jSONObject.getString(OutcomeConstants.OUTCOME_ID));
                        return;
                    case 4:
                        SubscriptionEndpoint.this.notifySubscriptionCompleted(jSONObject.getString(OutcomeConstants.OUTCOME_ID));
                        return;
                    case 5:
                        SubscriptionEndpoint.this.timeoutWatchdog.reset();
                        return;
                    case 6:
                        SubscriptionEndpoint.this.notifySubscriptionFailure(jSONObject.getString(OutcomeConstants.OUTCOME_ID));
                        SubscriptionEndpoint.this.notifySubscriptionData(jSONObject.getString(OutcomeConstants.OUTCOME_ID), jSONObject.getString("payload"));
                        return;
                    case 7:
                        SubscriptionEndpoint.this.notifySubscriptionData(jSONObject.getString(OutcomeConstants.OUTCOME_ID), jSONObject.getString("payload"));
                        return;
                    default:
                        SubscriptionEndpoint.this.notifyError(new ApiException("Got unknown message type: " + subscriptionMessageTypeFrom, "Sorry, we don’t have a recovery suggestion for this error."));
                        return;
                }
            } catch (JSONException e) {
                throw new ApiException("Error processing Json message in subscription endpoint.", e, "Sorry, we don’t have a recovery suggestion for this error.");
            }
        }

        private void sendConnectionInit(b6j b6jVar) {
            try {
                b6jVar.mo18202b(new JSONObject().put("type", "connection_init").toString());
            } catch (JSONException e) {
                SubscriptionEndpoint.this.notifyError(e);
            }
        }

        public boolean isDisconnectedState() {
            return this.endpointStatus.get().isDisconnectedState();
        }

        @Override // p001o.d6j
        public void onClosed(b6j b6jVar, int i, String str) {
            super.onClosed(b6jVar, i, str);
            this.endpointStatus.set(EndpointStatus.DISCONNECTED);
        }

        @Override // p001o.d6j
        public void onClosing(b6j b6jVar, int i, String str) {
            SubscriptionEndpoint.this.notifyAllSubscriptionsCompleted();
        }

        @Override // p001o.d6j
        public void onFailure(b6j b6jVar, Throwable th, zqe zqeVar) {
            SubscriptionEndpoint.LOG.warn("Websocket connection failed.", th);
            this.endpointStatus.set(EndpointStatus.CONNECTION_FAILED);
            b6jVar.cancel();
            this.connectionResponse.countDown();
            SubscriptionEndpoint.this.notifyError(th);
        }

        @Override // p001o.d6j
        public void onMessage(b6j b6jVar, String str) {
            try {
                processJsonMessage(b6jVar, str);
            } catch (ApiException e) {
                SubscriptionEndpoint.this.notifyError(e);
            }
        }

        @Override // p001o.d6j
        public void onOpen(b6j b6jVar, zqe zqeVar) {
            sendConnectionInit(b6jVar);
        }

        public Connection waitForConnectionReady() {
            try {
                if (!this.connectionResponse.await(30L, TimeUnit.SECONDS)) {
                    SubscriptionEndpoint.LOG.warn("Timed out waiting for connection acknowledgement.");
                    return new Connection("Timed out waiting for connection acknowledgement.");
                }
                SubscriptionEndpoint.LOG.debug("Current endpoint status: " + this.endpointStatus.get());
                return EndpointStatus.CONNECTION_FAILED.equals(this.endpointStatus.get()) ? new Connection("Connection failed.") : new Connection();
            } catch (InterruptedException unused) {
                SubscriptionEndpoint.LOG.warn("Thread interrupted waiting for connection acknowledgement");
                return new Connection("Thread interrupted waiting for connection acknowledgement");
            }
        }

        public AmplifyWebSocketListener(CountDownLatch countDownLatch) {
            this.connectionResponse = countDownLatch;
            this.endpointStatus = new AtomicReference<>(EndpointStatus.DISCONNECTED);
        }
    }

    public enum EndpointStatus {
        DISCONNECTED,
        CONNECTING,
        CONNECTED,
        CONNECTION_FAILED;

        public boolean isDisconnectedState() {
            return equals(DISCONNECTED) || equals(CONNECTION_FAILED);
        }
    }

    public static final class Subscription<T> {
        private static final int ACKNOWLEDGEMENT_TIMEOUT = 10;
        private String apiName;
        private final Consumer<GraphQLResponse<T>> onNextItem;
        private final Action onSubscriptionComplete;
        private final Consumer<ApiException> onSubscriptionError;
        private final GraphQLRequest<T> request;
        private final GraphQLResponse.Factory responseFactory;
        private final Type responseType;
        private final CountDownLatch subscriptionReadyAcknowledgment = new CountDownLatch(1);
        private final CountDownLatch subscriptionCompletionAcknowledgement = new CountDownLatch(1);
        private boolean failed = false;

        public Subscription(Consumer<GraphQLResponse<T>> consumer, Consumer<ApiException> consumer2, Action action, GraphQLResponse.Factory factory, Type type2, GraphQLRequest<T> graphQLRequest, String str) {
            this.onNextItem = consumer;
            this.onSubscriptionError = consumer2;
            this.onSubscriptionComplete = action;
            this.responseFactory = factory;
            this.responseType = type2;
            this.request = graphQLRequest;
            this.apiName = str;
        }

        private GraphQLResponse<T> buildResponse(String str) throws ApiException {
            GraphQLResponse.Factory factory = this.responseFactory;
            if (!(factory instanceof GsonGraphQLResponseFactory)) {
                throw new ApiException("Amplify encountered an error while deserializing an object. GraphQLResponse.Factory was not of type GsonGraphQLResponseFactory", AmplifyException.REPORT_BUG_TO_AWS_SUGGESTION);
            }
            try {
                return ((GsonGraphQLResponseFactory) factory).buildResponse(this.request, str, this.apiName);
            } catch (ClassCastException unused) {
                throw new ApiException("Amplify encountered an error while deserializing an object", "Sorry, we don’t have a recovery suggestion for this error.");
            }
        }

        public void acknowledgeSubscriptionCompleted() {
            this.subscriptionCompletionAcknowledgement.countDown();
        }

        public void acknowledgeSubscriptionFailure() {
            this.failed = true;
            this.subscriptionReadyAcknowledgment.countDown();
        }

        public void acknowledgeSubscriptionReady() {
            this.subscriptionReadyAcknowledgment.countDown();
        }

        public void awaitSubscriptionCompleted() {
            try {
                if (this.subscriptionCompletionAcknowledgement.await(10L, TimeUnit.SECONDS)) {
                    return;
                }
                dispatchError(new ApiException("Subscription completion not acknowledged.", "Sorry, we don’t have a recovery suggestion for this error."));
            } catch (InterruptedException e) {
                dispatchError(new ApiException("Thread interrupted awaiting subscription completion.", e, "Sorry, we don’t have a recovery suggestion for this error."));
            }
        }

        public boolean awaitSubscriptionReady() {
            try {
                if (this.subscriptionReadyAcknowledgment.await(10L, TimeUnit.SECONDS)) {
                    return !this.failed;
                }
                dispatchError(new ApiException("Timed out waiting for subscription start_ack.", "Check your Internet connection. Is your device online?"));
                return false;
            } catch (InterruptedException e) {
                SubscriptionEndpoint.LOG.warn("Thread interrupted awaiting subscription acknowledgement.", e);
                return false;
            }
        }

        public void dispatchCompleted() {
            this.onSubscriptionComplete.call();
        }

        public void dispatchError(ApiException apiException) {
            this.onSubscriptionError.accept(apiException);
        }

        public void dispatchNextMessage(String str) {
            try {
                this.onNextItem.accept(buildResponse(str));
            } catch (ApiException e) {
                dispatchError(e);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Subscription.class != obj.getClass()) {
                return false;
            }
            Subscription subscription = (Subscription) obj;
            if (s6c.m47909a(this.onNextItem, subscription.onNextItem) && s6c.m47909a(this.onSubscriptionError, subscription.onSubscriptionError) && s6c.m47909a(this.onSubscriptionComplete, subscription.onSubscriptionComplete) && s6c.m47909a(this.responseFactory, subscription.responseFactory) && s6c.m47909a(this.responseType, subscription.responseType) && s6c.m47909a(this.subscriptionReadyAcknowledgment, subscription.subscriptionReadyAcknowledgment)) {
                return s6c.m47909a(this.subscriptionCompletionAcknowledgement, subscription.subscriptionCompletionAcknowledgement);
            }
            return false;
        }

        public int hashCode() {
            return (((((((((((this.onNextItem.hashCode() * 31) + this.onSubscriptionError.hashCode()) * 31) + this.onSubscriptionComplete.hashCode()) * 31) + this.responseFactory.hashCode()) * 31) + this.responseType.hashCode()) * 31) + this.subscriptionReadyAcknowledgment.hashCode()) * 31) + this.subscriptionCompletionAcknowledgement.hashCode();
        }
    }

    public SubscriptionEndpoint(ApiConfiguration apiConfiguration, OkHttpConfigurator okHttpConfigurator, GraphQLResponse.Factory factory, SubscriptionAuthorizer subscriptionAuthorizer, String str) {
        Objects.requireNonNull(apiConfiguration);
        this.apiConfiguration = apiConfiguration;
        this.subscriptions = new ConcurrentHashMap();
        Objects.requireNonNull(factory);
        this.responseFactory = factory;
        Objects.requireNonNull(subscriptionAuthorizer);
        this.authorizer = subscriptionAuthorizer;
        this.timeoutWatchdog = new TimeoutWatchdog();
        this.pendingSubscriptionIds = Collections.synchronizedSet(new HashSet());
        this.apiName = str;
        hac.C13902a c13902aM30113Z = new hac.C13902a().m30113Z(true);
        if (okHttpConfigurator != null) {
            okHttpConfigurator.applyConfiguration(c13902aM30113Z);
        }
        this.okHttpClient = c13902aM30113Z.m30116c();
    }

    private String buildConnectionRequestUrl() throws ApiException {
        URL url;
        try {
            url = new URL(this.apiConfiguration.getEndpoint());
        } catch (MalformedURLException unused) {
            url = null;
        }
        if (url == null) {
            throw new ApiException("Malformed API Url: " + this.apiConfiguration.getEndpoint(), "Verify that GraphQL endpoint is properly formatted.");
        }
        DomainType domainTypeFrom = DomainType.from(this.apiConfiguration.getEndpoint());
        String host = url.getHost();
        if (domainTypeFrom == DomainType.STANDARD) {
            host = host.replace("appsync-api", "appsync-realtime-api");
        }
        String path = url.getPath();
        if (domainTypeFrom == DomainType.CUSTOM) {
            path = path + "/realtime";
        }
        return new Uri.Builder().scheme("wss").authority(host).path(path).build().toString();
    }

    private Map<String, String> getConnectionAuthorizationHeaders(AuthorizationType authorizationType) {
        return JSONObjectExtensionsKt.toStringMap(this.authorizer.createHeadersForConnection(authorizationType));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyAllSubscriptionsCompleted() {
        Iterator it = new HashSet(this.subscriptions.values()).iterator();
        while (it.hasNext()) {
            ((Subscription) it.next()).dispatchCompleted();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyError(Throwable th) {
        Iterator it = new HashSet(this.subscriptions.values()).iterator();
        while (it.hasNext()) {
            ((Subscription) it.next()).dispatchError(new ApiException("Subscription failed.", th, "Check your Internet connection. Is your device online?"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifySubscriptionAcknowledged(String str) throws ApiException {
        Subscription<?> subscription = this.subscriptions.get(str);
        if (subscription != null && this.pendingSubscriptionIds.remove(str)) {
            subscription.acknowledgeSubscriptionReady();
            return;
        }
        throw new ApiException("Acknowledgement for unknown subscription: " + str, "Sorry, we don’t have a recovery suggestion for this error.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifySubscriptionCompleted(String str) throws ApiException {
        Subscription<?> subscription = this.subscriptions.get(str);
        if (subscription != null) {
            subscription.dispatchCompleted();
            subscription.acknowledgeSubscriptionCompleted();
        } else {
            throw new ApiException("Got subscription completion for unknown subscription:" + str, "Sorry, we don’t have a recovery suggestion for this error.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifySubscriptionData(String str, String str2) throws ApiException {
        Subscription<?> subscription = this.subscriptions.get(str);
        if (subscription != null) {
            subscription.dispatchNextMessage(str2);
            return;
        }
        throw new ApiException("Got subscription data for unknown subscription ID: " + str, "Sorry, we don’t have a recovery suggestion for this error.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifySubscriptionFailure(String str) {
        Subscription<?> subscription = this.subscriptions.get(str);
        if (subscription == null || !this.pendingSubscriptionIds.remove(str)) {
            return;
        }
        subscription.acknowledgeSubscriptionFailure();
    }

    public void releaseSubscription(String str) throws ApiException {
        Subscription<?> subscription = this.subscriptions.get(str);
        boolean zRemove = this.pendingSubscriptionIds.remove(str);
        if (subscription == null && !zRemove) {
            throw new ApiException("No existing subscription with the given id.", "Sorry, we don’t have a recovery suggestion for this error.");
        }
        AmplifyWebSocketListener amplifyWebSocketListener = this.webSocketListener;
        if (!zRemove && amplifyWebSocketListener != null && !amplifyWebSocketListener.isDisconnectedState()) {
            try {
                this.webSocket.mo18202b(new JSONObject().put("type", "stop").put(OutcomeConstants.OUTCOME_ID, str).toString());
                subscription.awaitSubscriptionCompleted();
            } catch (JSONException e) {
                throw new ApiException("Failed to construct subscription release message.", e, "Sorry, we don’t have a recovery suggestion for this error.");
            }
        }
        synchronized (this.webSocketLock) {
            this.subscriptions.remove(str);
            if (this.subscriptions.isEmpty() && this.pendingSubscriptionIds.isEmpty()) {
                LOG.info("No more active subscriptions. Closing web socket.");
                this.timeoutWatchdog.stop();
                this.webSocket.mo18204f(1000, "No active subscriptions");
                this.webSocketListener = null;
            }
        }
    }

    public <T> void requestSubscription(GraphQLRequest<T> graphQLRequest, AuthorizationType authorizationType, Consumer<String> consumer, Consumer<GraphQLResponse<T>> consumer2, Consumer<ApiException> consumer3, Action action) {
        Objects.requireNonNull(graphQLRequest);
        Objects.requireNonNull(consumer);
        Objects.requireNonNull(consumer2);
        Objects.requireNonNull(consumer3);
        Objects.requireNonNull(action);
        String string = UUID.randomUUID().toString();
        synchronized (this.webSocketLock) {
            AmplifyWebSocketListener amplifyWebSocketListener = this.webSocketListener;
            if (amplifyWebSocketListener == null || amplifyWebSocketListener.isDisconnectedState()) {
                this.webSocketListener = new AmplifyWebSocketListener(this);
                try {
                    final ule.C17397a c17397aM51757n = new ule.C17397a().m51769z(buildConnectionRequestUrl()).m51745a("Sec-WebSocket-Protocol", "graphql-ws").m51757n("User-Agent", UserAgent.string());
                    Map<String, String> connectionAuthorizationHeaders = getConnectionAuthorizationHeaders(authorizationType);
                    Objects.requireNonNull(c17397aM51757n);
                    connectionAuthorizationHeaders.forEach(new BiConsumer() { // from class: o.uag
                        @Override // java.util.function.BiConsumer
                        public final void accept(Object obj, Object obj2) {
                            c17397aM51757n.m51757n((String) obj, (String) obj2);
                        }
                    });
                    this.webSocket = this.okHttpClient.m30052B(c17397aM51757n.m51746b(), this.webSocketListener);
                } catch (ApiException e) {
                    consumer3.accept(e);
                    return;
                }
            }
            this.pendingSubscriptionIds.add(string);
            AmplifyWebSocketListener amplifyWebSocketListener2 = this.webSocketListener;
            b6j b6jVar = this.webSocket;
            Connection connectionWaitForConnectionReady = amplifyWebSocketListener2.waitForConnectionReady();
            if (connectionWaitForConnectionReady.hasFailure() && this.pendingSubscriptionIds.remove(string)) {
                consumer3.accept(new ApiException(connectionWaitForConnectionReady.getFailureReason(), "Sorry, we don’t have a recovery suggestion for this error."));
                return;
            }
            try {
                b6jVar.mo18202b(new JSONObject().put(OutcomeConstants.OUTCOME_ID, string).put("type", "start").put("payload", new JSONObject().put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, graphQLRequest.getContent()).put("extensions", new JSONObject().put("authorization", this.authorizer.createHeadersForSubscription(graphQLRequest, authorizationType)))).toString());
                Subscription<?> subscription = new Subscription<>(consumer2, consumer3, action, this.responseFactory, graphQLRequest.getResponseType(), graphQLRequest, this.apiName);
                this.subscriptions.put(string, subscription);
                if (subscription.awaitSubscriptionReady()) {
                    this.pendingSubscriptionIds.remove(string);
                    consumer.accept(string);
                }
            } catch (ApiException | JSONException e2) {
                if (this.pendingSubscriptionIds.remove(string)) {
                    if (e2 instanceof ApiException.ApiAuthException) {
                        consumer3.accept((ApiException.ApiAuthException) e2);
                    } else {
                        consumer3.accept(new ApiException("Failed to construct subscription registration message.", e2, "Sorry, we don’t have a recovery suggestion for this error."));
                    }
                }
            }
        }
    }

    public static final class Connection {
        private final String failureReason;

        public Connection() {
            this.failureReason = null;
        }

        public String getFailureReason() {
            return this.failureReason;
        }

        public boolean hasFailure() {
            return this.failureReason != null;
        }

        public Connection(String str) {
            this.failureReason = str;
        }
    }
}
