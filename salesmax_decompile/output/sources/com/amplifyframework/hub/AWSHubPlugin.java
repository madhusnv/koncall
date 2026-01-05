package com.amplifyframework.hub;

import android.content.Context;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class AWSHubPlugin extends HubPlugin<Void> {
    private final Set<Subscription> subscriptions = new HashSet();
    private final ExecutorService executorService = Executors.newCachedThreadPool();

    public static final class Subscription {
        private final HubChannel channel;
        private final HubEventFilter hubEventFilter;
        private final HubSubscriber hubSubscriber;
        private final SubscriptionToken subscriptionToken;

        public Subscription(SubscriptionToken subscriptionToken, HubChannel hubChannel, HubEventFilter hubEventFilter, HubSubscriber hubSubscriber) {
            Objects.requireNonNull(subscriptionToken);
            this.subscriptionToken = subscriptionToken;
            Objects.requireNonNull(hubChannel);
            this.channel = hubChannel;
            Objects.requireNonNull(hubEventFilter);
            this.hubEventFilter = hubEventFilter;
            Objects.requireNonNull(hubSubscriber);
            this.hubSubscriber = hubSubscriber;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Subscription.class != obj.getClass()) {
                return false;
            }
            Subscription subscription = (Subscription) obj;
            if (s6c.m47909a(this.subscriptionToken, subscription.subscriptionToken) && this.channel == subscription.channel && s6c.m47909a(this.hubEventFilter, subscription.hubEventFilter)) {
                return s6c.m47909a(this.hubSubscriber, subscription.hubSubscriber);
            }
            return false;
        }

        public HubChannel getHubChannel() {
            return this.channel;
        }

        public HubEventFilter getHubEventFilter() {
            return this.hubEventFilter;
        }

        public HubSubscriber getHubSubscriber() {
            return this.hubSubscriber;
        }

        public SubscriptionToken getSubscriptionToken() {
            return this.subscriptionToken;
        }

        public int hashCode() {
            return (((((this.subscriptionToken.hashCode() * 31) + this.channel.hashCode()) * 31) + this.hubEventFilter.hashCode()) * 31) + this.hubSubscriber.hashCode();
        }

        public String toString() {
            return "Subscription{subscriptionToken=" + this.subscriptionToken + ", channel=" + this.channel + ", hubEventFilter=" + this.hubEventFilter + ", hubSubscriber=" + this.hubSubscriber + '}';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$publish$0(Subscription subscription, HubEvent hubEvent) {
        subscription.getHubSubscriber().onEvent(hubEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$publish$1(HubChannel hubChannel, final HubEvent hubEvent) {
        synchronized (this.subscriptions) {
            for (final Subscription subscription : this.subscriptions) {
                if (subscription.getHubChannel().equals(hubChannel) && subscription.getHubEventFilter().filter(hubEvent)) {
                    this.executorService.execute(new Runnable() { // from class: com.amplifyframework.hub.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            AWSHubPlugin.lambda$publish$0(subscription, hubEvent);
                        }
                    });
                }
            }
        }
    }

    @Override // com.amplifyframework.core.plugin.Plugin
    public void configure(JSONObject jSONObject, Context context) {
    }

    @Override // com.amplifyframework.core.plugin.Plugin
    public Void getEscapeHatch() {
        return null;
    }

    @Override // com.amplifyframework.core.plugin.Plugin
    public String getPluginKey() {
        return "awsHubPlugin";
    }

    @Override // com.amplifyframework.core.plugin.Plugin
    public String getVersion() {
        return "2.27.1";
    }

    @Override // com.amplifyframework.hub.HubCategoryBehavior
    public <T> void publish(final HubChannel hubChannel, final HubEvent<T> hubEvent) {
        Objects.requireNonNull(hubChannel);
        Objects.requireNonNull(hubEvent);
        this.executorService.execute(new Runnable() { // from class: o.m3
            @Override // java.lang.Runnable
            public final void run() {
                this.f34683a.lambda$publish$1(hubChannel, hubEvent);
            }
        });
    }

    @Override // com.amplifyframework.hub.HubCategoryBehavior
    public SubscriptionToken subscribe(HubChannel hubChannel, HubSubscriber hubSubscriber) {
        return subscribe(hubChannel, HubEventFilters.always(), hubSubscriber);
    }

    @Override // com.amplifyframework.hub.HubCategoryBehavior
    public void unsubscribe(SubscriptionToken subscriptionToken) {
        Objects.requireNonNull(subscriptionToken);
        synchronized (this.subscriptions) {
            Iterator<Subscription> it = this.subscriptions.iterator();
            while (it.hasNext()) {
                if (it.next().getSubscriptionToken().equals(subscriptionToken)) {
                    it.remove();
                }
            }
        }
    }

    @Override // com.amplifyframework.hub.HubCategoryBehavior
    public SubscriptionToken subscribe(HubChannel hubChannel, HubEventFilter hubEventFilter, HubSubscriber hubSubscriber) {
        Objects.requireNonNull(hubChannel);
        Objects.requireNonNull(hubEventFilter);
        Objects.requireNonNull(hubSubscriber);
        SubscriptionToken subscriptionTokenCreate = SubscriptionToken.create();
        synchronized (this.subscriptions) {
            this.subscriptions.add(new Subscription(subscriptionTokenCreate, hubChannel, hubEventFilter, hubSubscriber));
        }
        return subscriptionTokenCreate;
    }
}
