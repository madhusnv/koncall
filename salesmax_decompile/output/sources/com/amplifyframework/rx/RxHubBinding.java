package com.amplifyframework.rx;

import com.amplifyframework.core.Amplify;
import com.amplifyframework.hub.HubCategory;
import com.amplifyframework.hub.HubCategoryBehavior;
import com.amplifyframework.hub.HubChannel;
import com.amplifyframework.hub.HubEvent;
import com.amplifyframework.hub.HubSubscriber;
import com.amplifyframework.hub.SubscriptionToken;
import java.util.Objects;
import p001o.jm;
import p001o.m8c;
import p001o.q7c;
import p001o.su5;
import p001o.x6c;
import p001o.xk3;

/* loaded from: classes5.dex */
final class RxHubBinding implements RxHubCategoryBehavior {
    private final HubCategoryBehavior hub;

    public RxHubBinding() {
        this(Amplify.Hub);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$on$1(SubscriptionToken subscriptionToken) {
        this.hub.unsubscribe(subscriptionToken);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$on$2(HubChannel hubChannel, final q7c q7cVar) {
        HubCategoryBehavior hubCategoryBehavior = this.hub;
        Objects.requireNonNull(q7cVar);
        final SubscriptionToken subscriptionTokenSubscribe = hubCategoryBehavior.subscribe(hubChannel, new HubSubscriber() { // from class: o.ewe
            @Override // com.amplifyframework.hub.HubSubscriber
            public final void onEvent(HubEvent hubEvent) {
                q7cVar.mo16430e(hubEvent);
            }
        });
        q7cVar.mo28141d(su5.m48919g(new jm() { // from class: com.amplifyframework.rx.y2
            @Override // p001o.jm
            public final void run() {
                this.f11115a.lambda$on$1(subscriptionTokenSubscribe);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$publish$0(HubChannel hubChannel, HubEvent hubEvent) {
        this.hub.publish(hubChannel, hubEvent);
    }

    @Override // com.amplifyframework.rx.RxHubCategoryBehavior
    public x6c on(final HubChannel hubChannel) {
        return x6c.m55706q(new m8c() { // from class: com.amplifyframework.rx.z2
            @Override // p001o.m8c
            /* renamed from: a */
            public final void mo12393a(q7c q7cVar) {
                this.f11126a.lambda$on$2(hubChannel, q7cVar);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxHubCategoryBehavior
    public <T> xk3 publish(final HubChannel hubChannel, final HubEvent<T> hubEvent) {
        return xk3.m56392q(new jm() { // from class: com.amplifyframework.rx.x2
            @Override // p001o.jm
            public final void run() {
                this.f11101a.lambda$publish$0(hubChannel, hubEvent);
            }
        });
    }

    public RxHubBinding(HubCategory hubCategory) {
        this.hub = hubCategory;
    }
}
