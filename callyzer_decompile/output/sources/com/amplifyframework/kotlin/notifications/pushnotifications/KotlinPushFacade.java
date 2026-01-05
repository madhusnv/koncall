package com.amplifyframework.kotlin.notifications.pushnotifications;

import com.amplifyframework.analytics.UserProfile;
import com.amplifyframework.core.Action;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.notifications.pushnotifications.NotificationPayload;
import com.amplifyframework.notifications.pushnotifications.PushNotificationsCategoryBehavior;
import com.amplifyframework.notifications.pushnotifications.PushNotificationsException;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import og.od;
import org.bouncycastle.crypto.agreement.jpake.JPAKEParticipant;
import pg.n6;
import qw.a0;
import uw.C7566j;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8193c;
import ww.InterfaceC8195e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class KotlinPushFacade implements Push {
    private final PushNotificationsCategoryBehavior delegate;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.kotlin.notifications.pushnotifications.KotlinPushFacade", m15344f = "KotlinPushFacade.kt", m15345l = {JPAKEParticipant.STATE_ROUND_3_VALIDATED}, m15346m = "handleNotificationReceived")
    /* renamed from: com.amplifyframework.kotlin.notifications.pushnotifications.KotlinPushFacade$handleNotificationReceived$1 */
    public static final class C12161 extends AbstractC8193c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C12161(InterfaceC7559c<? super C12161> interfaceC7559c) {
            super(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return KotlinPushFacade.this.handleNotificationReceived(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public KotlinPushFacade() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.amplifyframework.kotlin.notifications.pushnotifications.Push
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object handleNotificationReceived(com.amplifyframework.notifications.pushnotifications.NotificationPayload r5, uw.InterfaceC7559c<? super com.amplifyframework.notifications.pushnotifications.PushNotificationResult> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.amplifyframework.kotlin.notifications.pushnotifications.KotlinPushFacade.C12161
            if (r0 == 0) goto L13
            r0 = r6
            com.amplifyframework.kotlin.notifications.pushnotifications.KotlinPushFacade$handleNotificationReceived$1 r0 = (com.amplifyframework.kotlin.notifications.pushnotifications.KotlinPushFacade.C12161) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.amplifyframework.kotlin.notifications.pushnotifications.KotlinPushFacade$handleNotificationReceived$1 r0 = new com.amplifyframework.kotlin.notifications.pushnotifications.KotlinPushFacade$handleNotificationReceived$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.L$0
            com.amplifyframework.notifications.pushnotifications.NotificationPayload r5 = (com.amplifyframework.notifications.pushnotifications.NotificationPayload) r5
            og.od.m10798c(r6)
            goto L59
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            og.od.m10798c(r6)
            r0.L$0 = r5
            r0.label = r3
            uw.j r6 = new uw.j
            uw.c r0 = pg.n6.m11797c(r0)
            r6.<init>(r0)
            com.amplifyframework.notifications.pushnotifications.PushNotificationsCategoryBehavior r0 = r4.delegate
            com.amplifyframework.kotlin.notifications.pushnotifications.KotlinPushFacade$handleNotificationReceived$2$1 r2 = new com.amplifyframework.kotlin.notifications.pushnotifications.KotlinPushFacade$handleNotificationReceived$2$1
            r2.<init>()
            com.amplifyframework.kotlin.notifications.pushnotifications.KotlinPushFacade$handleNotificationReceived$2$2 r3 = new com.amplifyframework.kotlin.notifications.pushnotifications.KotlinPushFacade$handleNotificationReceived$2$2
            r3.<init>()
            r0.handleNotificationReceived(r5, r2, r3)
            java.lang.Object r6 = r6.m14303a()
            if (r6 != r1) goto L59
            return r1
        L59:
            java.lang.String r5 = "suspendCoroutine(...)"
            kotlin.jvm.internal.AbstractC4154l.m8922e(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.kotlin.notifications.pushnotifications.KotlinPushFacade.handleNotificationReceived(com.amplifyframework.notifications.pushnotifications.NotificationPayload, uw.c):java.lang.Object");
    }

    @Override // com.amplifyframework.kotlin.notifications.Notifications
    public Object identifyUser(String str, InterfaceC7559c<? super a0> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.identifyUser(str, new Action() { // from class: com.amplifyframework.kotlin.notifications.pushnotifications.KotlinPushFacade$identifyUser$2$1
            @Override // com.amplifyframework.core.Action
            public final void call() {
                c7566j.resumeWith(a0.f30746a);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.notifications.pushnotifications.KotlinPushFacade$identifyUser$2$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(PushNotificationsException it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(od.m10796a(it));
            }
        });
        Object objM14303a = c7566j.m14303a();
        return objM14303a == EnumC7794a.COROUTINE_SUSPENDED ? objM14303a : a0.f30746a;
    }

    @Override // com.amplifyframework.kotlin.notifications.pushnotifications.Push
    public Object recordNotificationOpened(NotificationPayload notificationPayload, InterfaceC7559c<? super a0> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.recordNotificationOpened(notificationPayload, new Action() { // from class: com.amplifyframework.kotlin.notifications.pushnotifications.KotlinPushFacade$recordNotificationOpened$2$1
            @Override // com.amplifyframework.core.Action
            public final void call() {
                c7566j.resumeWith(a0.f30746a);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.notifications.pushnotifications.KotlinPushFacade$recordNotificationOpened$2$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(PushNotificationsException it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(od.m10796a(it));
            }
        });
        Object objM14303a = c7566j.m14303a();
        return objM14303a == EnumC7794a.COROUTINE_SUSPENDED ? objM14303a : a0.f30746a;
    }

    @Override // com.amplifyframework.kotlin.notifications.pushnotifications.Push
    public Object recordNotificationReceived(NotificationPayload notificationPayload, InterfaceC7559c<? super a0> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.recordNotificationReceived(notificationPayload, new Action() { // from class: com.amplifyframework.kotlin.notifications.pushnotifications.KotlinPushFacade$recordNotificationReceived$2$1
            @Override // com.amplifyframework.core.Action
            public final void call() {
                c7566j.resumeWith(a0.f30746a);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.notifications.pushnotifications.KotlinPushFacade$recordNotificationReceived$2$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(PushNotificationsException it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(od.m10796a(it));
            }
        });
        Object objM14303a = c7566j.m14303a();
        return objM14303a == EnumC7794a.COROUTINE_SUSPENDED ? objM14303a : a0.f30746a;
    }

    @Override // com.amplifyframework.kotlin.notifications.pushnotifications.Push
    public Object registerDevice(String str, InterfaceC7559c<? super a0> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.registerDevice(str, new Action() { // from class: com.amplifyframework.kotlin.notifications.pushnotifications.KotlinPushFacade$registerDevice$2$1
            @Override // com.amplifyframework.core.Action
            public final void call() {
                c7566j.resumeWith(a0.f30746a);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.notifications.pushnotifications.KotlinPushFacade$registerDevice$2$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(PushNotificationsException it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(od.m10796a(it));
            }
        });
        Object objM14303a = c7566j.m14303a();
        return objM14303a == EnumC7794a.COROUTINE_SUSPENDED ? objM14303a : a0.f30746a;
    }

    @Override // com.amplifyframework.kotlin.notifications.pushnotifications.Push
    public boolean shouldHandleNotification(NotificationPayload payload) {
        AbstractC4154l.m8923f(payload, "payload");
        return this.delegate.shouldHandleNotification(payload);
    }

    public KotlinPushFacade(PushNotificationsCategoryBehavior delegate) {
        AbstractC4154l.m8923f(delegate, "delegate");
        this.delegate = delegate;
    }

    public /* synthetic */ KotlinPushFacade(PushNotificationsCategoryBehavior pushNotificationsCategoryBehavior, int i10, AbstractC4148f abstractC4148f) {
        this((i10 & 1) != 0 ? Amplify.Notifications.Push : pushNotificationsCategoryBehavior);
    }

    @Override // com.amplifyframework.kotlin.notifications.Notifications
    public Object identifyUser(String str, UserProfile userProfile, InterfaceC7559c<? super a0> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.identifyUser(str, userProfile, new Action() { // from class: com.amplifyframework.kotlin.notifications.pushnotifications.KotlinPushFacade$identifyUser$4$1
            @Override // com.amplifyframework.core.Action
            public final void call() {
                c7566j.resumeWith(a0.f30746a);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.notifications.pushnotifications.KotlinPushFacade$identifyUser$4$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(PushNotificationsException it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(od.m10796a(it));
            }
        });
        Object objM14303a = c7566j.m14303a();
        return objM14303a == EnumC7794a.COROUTINE_SUSPENDED ? objM14303a : a0.f30746a;
    }
}
