package com.amplifyframework.rx;

import com.amplifyframework.analytics.UserProfile;
import com.amplifyframework.core.Action;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.notifications.pushnotifications.NotificationPayload;
import com.amplifyframework.notifications.pushnotifications.PushNotificationsCategoryBehavior;
import com.amplifyframework.notifications.pushnotifications.PushNotificationsException;
import com.amplifyframework.rx.RxAdapters;
import java.util.Objects;
import p001o.wtf;
import p001o.xk3;

/* loaded from: classes5.dex */
final class RxPushNotificationsBinding implements RxPushNotificationsCategoryBehavior {
    private final PushNotificationsCategoryBehavior delegate;

    public RxPushNotificationsBinding() {
        this(Amplify.Notifications.Push);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleNotificationReceived$4(NotificationPayload notificationPayload, Consumer consumer, Consumer consumer2) {
        this.delegate.handleNotificationReceived(notificationPayload, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$identifyUser$0(String str, Action action, Consumer consumer) {
        this.delegate.identifyUser(str, action, consumer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$identifyUser$1(String str, UserProfile userProfile, Action action, Consumer consumer) {
        this.delegate.identifyUser(str, userProfile, action, consumer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$recordNotificationOpened$3(NotificationPayload notificationPayload, Action action, Consumer consumer) {
        this.delegate.recordNotificationOpened(notificationPayload, action, consumer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$recordNotificationReceived$2(NotificationPayload notificationPayload, Action action, Consumer consumer) {
        this.delegate.recordNotificationReceived(notificationPayload, action, consumer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$registerDevice$5(String str, Action action, Consumer consumer) {
        this.delegate.registerDevice(str, action, consumer);
    }

    private xk3 toCompletable(RxAdapters.VoidBehaviors.ActionEmitter<PushNotificationsException> actionEmitter) {
        return RxAdapters.VoidBehaviors.toCompletable(actionEmitter);
    }

    private <T> wtf toSingle(RxAdapters.VoidBehaviors.ResultEmitter<T, PushNotificationsException> resultEmitter) {
        return RxAdapters.VoidBehaviors.toSingle(resultEmitter);
    }

    @Override // com.amplifyframework.rx.RxPushNotificationsCategoryBehavior
    public wtf handleNotificationReceived(final NotificationPayload notificationPayload) {
        return toSingle(new RxAdapters.VoidBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.n3
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ResultEmitter
            public final void emitTo(Consumer consumer, Consumer consumer2) {
                this.f10994a.lambda$handleNotificationReceived$4(notificationPayload, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxNotificationsCategoryBehavior
    public xk3 identifyUser(final String str) {
        return toCompletable(new RxAdapters.VoidBehaviors.ActionEmitter() { // from class: com.amplifyframework.rx.o3
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ActionEmitter
            public final void emitTo(Action action, Consumer consumer) {
                this.f11002a.lambda$identifyUser$0(str, action, consumer);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxPushNotificationsCategoryBehavior
    public xk3 recordNotificationOpened(final NotificationPayload notificationPayload) {
        return toCompletable(new RxAdapters.VoidBehaviors.ActionEmitter() { // from class: com.amplifyframework.rx.r3
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ActionEmitter
            public final void emitTo(Action action, Consumer consumer) {
                this.f11035a.lambda$recordNotificationOpened$3(notificationPayload, action, consumer);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxPushNotificationsCategoryBehavior
    public xk3 recordNotificationReceived(final NotificationPayload notificationPayload) {
        return toCompletable(new RxAdapters.VoidBehaviors.ActionEmitter() { // from class: com.amplifyframework.rx.s3
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ActionEmitter
            public final void emitTo(Action action, Consumer consumer) {
                this.f11047a.lambda$recordNotificationReceived$2(notificationPayload, action, consumer);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxPushNotificationsCategoryBehavior
    public xk3 registerDevice(final String str) {
        return toCompletable(new RxAdapters.VoidBehaviors.ActionEmitter() { // from class: com.amplifyframework.rx.q3
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ActionEmitter
            public final void emitTo(Action action, Consumer consumer) {
                this.f11026a.lambda$registerDevice$5(str, action, consumer);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxPushNotificationsCategoryBehavior
    public Boolean shouldHandleNotification(NotificationPayload notificationPayload) {
        return Boolean.valueOf(this.delegate.shouldHandleNotification(notificationPayload));
    }

    public RxPushNotificationsBinding(PushNotificationsCategoryBehavior pushNotificationsCategoryBehavior) {
        Objects.requireNonNull(pushNotificationsCategoryBehavior);
        this.delegate = pushNotificationsCategoryBehavior;
    }

    @Override // com.amplifyframework.rx.RxNotificationsCategoryBehavior
    public xk3 identifyUser(final String str, final UserProfile userProfile) {
        return toCompletable(new RxAdapters.VoidBehaviors.ActionEmitter() { // from class: com.amplifyframework.rx.p3
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ActionEmitter
            public final void emitTo(Action action, Consumer consumer) {
                this.f11016a.lambda$identifyUser$1(str, userProfile, action, consumer);
            }
        });
    }
}
