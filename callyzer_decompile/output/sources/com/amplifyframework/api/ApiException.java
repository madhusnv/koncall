package com.amplifyframework.api;

import com.amplifyframework.AmplifyException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class ApiException extends AmplifyException {
    private static final long serialVersionUID = 1;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class ApiAuthException extends ApiException {
        private static final long serialVersionUID = 1;

        public ApiAuthException(String str, Throwable th2, String str2) {
            super(str, th2, str2);
        }

        public ApiAuthException(String str, String str2) {
            super(str, str2);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class NonRetryableException extends ApiException {
        private static final long serialVersionUID = 1;

        public NonRetryableException(String str, String str2) {
            super(str, str2);
        }
    }

    public ApiException(String str, Throwable th2, String str2) {
        super(str, th2, str2);
    }

    public ApiException(String str, String str2) {
        super(str, str2);
    }
}
