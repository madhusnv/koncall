package com.onesignal.user.internal.subscriptions;

import p001o.id5;

/* loaded from: classes6.dex */
public enum SubscriptionStatus {
    SUBSCRIBED(1),
    NO_PERMISSION(0),
    UNSUBSCRIBE(-2),
    MISSING_JETPACK_LIBRARY(-3),
    MISSING_FIREBASE_FCM_LIBRARY(-4),
    OUTDATED_JETPACK_LIBRARY(-5),
    INVALID_FCM_SENDER_ID(-6),
    OUTDATED_GOOGLE_PLAY_SERVICES_APP(-7),
    FIREBASE_FCM_INIT_ERROR(-8),
    FIREBASE_FCM_ERROR_IOEXCEPTION_SERVICE_NOT_AVAILABLE(-9),
    FIREBASE_FCM_ERROR_IOEXCEPTION_OTHER(-11),
    FIREBASE_FCM_ERROR_MISC_EXCEPTION(-12),
    HMS_TOKEN_TIMEOUT(-25),
    HMS_ARGUMENTS_INVALID(-26),
    HMS_API_EXCEPTION_OTHER(-27),
    MISSING_HMS_PUSHKIT_LIBRARY(-28),
    FIREBASE_FCM_ERROR_IOEXCEPTION_AUTHENTICATION_FAILED(-29),
    DISABLED_FROM_REST_API_DEFAULT_REASON(-30),
    ERROR(9999);

    public static final Companion Companion = new Companion(null);
    private final int value;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final SubscriptionStatus fromInt(int i) {
            for (SubscriptionStatus subscriptionStatus : SubscriptionStatus.values()) {
                if (subscriptionStatus.getValue() == i) {
                    return subscriptionStatus;
                }
            }
            return null;
        }
    }

    SubscriptionStatus(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
