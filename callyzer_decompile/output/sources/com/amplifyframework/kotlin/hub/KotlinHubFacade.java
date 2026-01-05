package com.amplifyframework.kotlin.hub;

import com.amplifyframework.core.Amplify;
import com.amplifyframework.hub.HubCategoryBehavior;
import com.amplifyframework.hub.HubChannel;
import com.amplifyframework.hub.HubEvent;
import com.amplifyframework.hub.HubEventFilter;
import com.amplifyframework.hub.HubSubscriber;
import com.amplifyframework.hub.SubscriptionToken;
import com.amplifyframework.kotlin.hub.KotlinHubFacade;
import ex.InterfaceC2137a;
import ex.InterfaceC2141e;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import og.od;
import pg.p6;
import pg.q6;
import qw.a0;
import uw.C7565i;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import vx.EnumC7799a;
import vx.InterfaceC7819u;
import ww.AbstractC8199i;
import ww.InterfaceC8195e;
import wx.C8202c;
import wx.InterfaceC8209j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class KotlinHubFacade implements Hub {
    private final HubCategoryBehavior delegate;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.kotlin.hub.KotlinHubFacade$subscribe$1", m15344f = "KotlinHubFacade.kt", m15345l = {37}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.kotlin.hub.KotlinHubFacade$subscribe$1 */
    public static final class C12131 extends AbstractC8199i implements InterfaceC2141e {
        final /* synthetic */ HubChannel $channel;
        final /* synthetic */ HubEventFilter $filter;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12131(HubChannel hubChannel, HubEventFilter hubEventFilter, InterfaceC7559c<? super C12131> interfaceC7559c) {
            super(2, interfaceC7559c);
            this.$channel = hubChannel;
            this.$filter = hubEventFilter;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final a0 invokeSuspend$lambda$1(KotlinHubFacade kotlinHubFacade, SubscriptionToken subscriptionToken) {
            kotlinHubFacade.delegate.unsubscribe(subscriptionToken);
            return a0.f30746a;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(Object obj, InterfaceC7559c<?> interfaceC7559c) {
            C12131 c12131 = KotlinHubFacade.this.new C12131(this.$channel, this.$filter, interfaceC7559c);
            c12131.L$0 = obj;
            return c12131;
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            final InterfaceC7819u interfaceC7819u = (InterfaceC7819u) this.L$0;
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 == 0) {
                od.m10798c(obj);
                final SubscriptionToken subscriptionTokenSubscribe = KotlinHubFacade.this.delegate.subscribe(this.$channel, this.$filter, new HubSubscriber() { // from class: com.amplifyframework.kotlin.hub.a
                    @Override // com.amplifyframework.hub.HubSubscriber
                    public final void onEvent(HubEvent hubEvent) {
                        p6.m11817d(interfaceC7819u, hubEvent);
                    }
                });
                AbstractC4154l.m8922e(subscriptionTokenSubscribe, "subscribe(...)");
                final KotlinHubFacade kotlinHubFacade = KotlinHubFacade.this;
                InterfaceC2137a interfaceC2137a = new InterfaceC2137a() { // from class: com.amplifyframework.kotlin.hub.b
                    @Override // ex.InterfaceC2137a
                    public final Object invoke() {
                        return KotlinHubFacade.C12131.invokeSuspend$lambda$1(kotlinHubFacade, subscriptionTokenSubscribe);
                    }
                };
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (q6.m11829a(interfaceC7819u, interfaceC2137a, this) == enumC7794a) {
                    return enumC7794a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
            }
            return a0.f30746a;
        }

        @Override // ex.InterfaceC2141e
        public final Object invoke(InterfaceC7819u interfaceC7819u, InterfaceC7559c<? super a0> interfaceC7559c) {
            return ((C12131) create(interfaceC7819u, interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public KotlinHubFacade() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.amplifyframework.kotlin.hub.Hub
    public void publish(HubChannel channel, HubEvent<?> event) {
        AbstractC4154l.m8923f(channel, "channel");
        AbstractC4154l.m8923f(event, "event");
        this.delegate.publish(channel, event);
    }

    @Override // com.amplifyframework.kotlin.hub.Hub
    public InterfaceC8209j subscribe(HubChannel channel, HubEventFilter filter) {
        AbstractC4154l.m8923f(channel, "channel");
        AbstractC4154l.m8923f(filter, "filter");
        return new C8202c(new C12131(channel, filter, null), C7565i.f36440a, -2, EnumC7799a.SUSPEND);
    }

    public KotlinHubFacade(HubCategoryBehavior delegate) {
        AbstractC4154l.m8923f(delegate, "delegate");
        this.delegate = delegate;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ KotlinHubFacade(HubCategoryBehavior Hub, int i10, AbstractC4148f abstractC4148f) {
        if ((i10 & 1) != 0) {
            Hub = Amplify.Hub;
            AbstractC4154l.m8922e(Hub, "Hub");
        }
        this(Hub);
    }
}
