package com.amplifyframework.rx;

import com.amplifyframework.analytics.UserProfile;
import com.amplifyframework.core.Action;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.notifications.NotificationsCategoryBehavior;
import com.amplifyframework.notifications.pushnotifications.PushNotificationsException;
import com.amplifyframework.rx.RxAdapters;
import java.util.Objects;
import p001o.xk3;

/* loaded from: classes5.dex */
final class RxNotificationsBinding implements RxNotificationsCategoryBehavior {
    private final NotificationsCategoryBehavior delegate;

    public RxNotificationsBinding() {
        this(Amplify.Notifications);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$identifyUser$0(String str, Action action, Consumer consumer) {
        this.delegate.identifyUser(str, action, consumer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$identifyUser$1(String str, UserProfile userProfile, Action action, Consumer consumer) {
        this.delegate.identifyUser(str, userProfile, action, consumer);
    }

    private xk3 toCompletable(RxAdapters.VoidBehaviors.ActionEmitter<PushNotificationsException> actionEmitter) {
        return RxAdapters.VoidBehaviors.toCompletable(actionEmitter);
    }

    @Override // com.amplifyframework.rx.RxNotificationsCategoryBehavior
    public xk3 identifyUser(final String str) {
        return toCompletable(new RxAdapters.VoidBehaviors.ActionEmitter() { // from class: com.amplifyframework.rx.a3
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ActionEmitter
            public final void emitTo(Action action, Consumer consumer) {
                this.f10808a.lambda$identifyUser$0(str, action, consumer);
            }
        });
    }

    public RxNotificationsBinding(NotificationsCategoryBehavior notificationsCategoryBehavior) {
        Objects.requireNonNull(notificationsCategoryBehavior);
        this.delegate = notificationsCategoryBehavior;
    }

    @Override // com.amplifyframework.rx.RxNotificationsCategoryBehavior
    public xk3 identifyUser(final String str, final UserProfile userProfile) {
        return toCompletable(new RxAdapters.VoidBehaviors.ActionEmitter() { // from class: com.amplifyframework.rx.b3
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ActionEmitter
            public final void emitTo(Action action, Consumer consumer) {
                this.f10822a.lambda$identifyUser$1(str, userProfile, action, consumer);
            }
        });
    }
}
