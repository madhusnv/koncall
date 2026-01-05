package com.amplifyframework.kotlin.notifications;

import com.amplifyframework.analytics.UserProfile;
import com.amplifyframework.core.Action;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.kotlin.notifications.pushnotifications.KotlinPushFacade;
import com.amplifyframework.notifications.NotificationsCategoryBehavior;
import com.amplifyframework.notifications.pushnotifications.PushNotificationsException;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import og.od;
import pg.n6;
import qw.a0;
import uw.C7566j;
import uw.InterfaceC7559c;
import vw.EnumC7794a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class KotlinNotificationsFacade implements Notifications {
    private final KotlinPushFacade Push;
    private final NotificationsCategoryBehavior delegate;

    /* JADX WARN: Multi-variable type inference failed */
    public KotlinNotificationsFacade() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final KotlinPushFacade getPush() {
        return this.Push;
    }

    @Override // com.amplifyframework.kotlin.notifications.Notifications
    public Object identifyUser(String str, InterfaceC7559c<? super a0> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.identifyUser(str, new Action() { // from class: com.amplifyframework.kotlin.notifications.KotlinNotificationsFacade$identifyUser$2$1
            @Override // com.amplifyframework.core.Action
            public final void call() {
                c7566j.resumeWith(a0.f30746a);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.notifications.KotlinNotificationsFacade$identifyUser$2$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(PushNotificationsException it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(od.m10796a(it));
            }
        });
        Object objM14303a = c7566j.m14303a();
        return objM14303a == EnumC7794a.COROUTINE_SUSPENDED ? objM14303a : a0.f30746a;
    }

    public KotlinNotificationsFacade(NotificationsCategoryBehavior delegate) {
        AbstractC4154l.m8923f(delegate, "delegate");
        this.delegate = delegate;
        this.Push = new KotlinPushFacade(null, 1, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ KotlinNotificationsFacade(NotificationsCategoryBehavior Notifications, int i10, AbstractC4148f abstractC4148f) {
        if ((i10 & 1) != 0) {
            Notifications = Amplify.Notifications;
            AbstractC4154l.m8922e(Notifications, "Notifications");
        }
        this(Notifications);
    }

    @Override // com.amplifyframework.kotlin.notifications.Notifications
    public Object identifyUser(String str, UserProfile userProfile, InterfaceC7559c<? super a0> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.identifyUser(str, userProfile, new Action() { // from class: com.amplifyframework.kotlin.notifications.KotlinNotificationsFacade$identifyUser$4$1
            @Override // com.amplifyframework.core.Action
            public final void call() {
                c7566j.resumeWith(a0.f30746a);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.notifications.KotlinNotificationsFacade$identifyUser$4$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(PushNotificationsException it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(od.m10796a(it));
            }
        });
        Object objM14303a = c7566j.m14303a();
        return objM14303a == EnumC7794a.COROUTINE_SUSPENDED ? objM14303a : a0.f30746a;
    }

    public static /* synthetic */ void getPush$annotations() {
    }
}
