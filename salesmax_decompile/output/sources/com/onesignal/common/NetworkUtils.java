package com.onesignal.common;

/* loaded from: classes6.dex */
public final class NetworkUtils {
    public static final NetworkUtils INSTANCE = new NetworkUtils();
    private static int maxNetworkRequestAttemptCount = 3;

    public enum ResponseStatusType {
        INVALID,
        RETRYABLE,
        UNAUTHORIZED,
        MISSING,
        CONFLICT
    }

    private NetworkUtils() {
    }

    public final int getMaxNetworkRequestAttemptCount() {
        return maxNetworkRequestAttemptCount;
    }

    public final ResponseStatusType getResponseStatusType(int i) {
        if (i == 409) {
            return ResponseStatusType.CONFLICT;
        }
        if (i != 410) {
            if (i == 429) {
                return ResponseStatusType.RETRYABLE;
            }
            switch (i) {
                case 400:
                case 402:
                    return ResponseStatusType.INVALID;
                case 401:
                case 403:
                    return ResponseStatusType.UNAUTHORIZED;
                case 404:
                    break;
                default:
                    return ResponseStatusType.RETRYABLE;
            }
        }
        return ResponseStatusType.MISSING;
    }

    public final void setMaxNetworkRequestAttemptCount(int i) {
        maxNetworkRequestAttemptCount = i;
    }
}
