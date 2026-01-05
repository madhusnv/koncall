package com.google.api.client.util.escape;

/* loaded from: classes3.dex */
final class Platform {
    private static final ThreadLocal<char[]> DEST_TL = new ThreadLocal<char[]>() { // from class: com.google.api.client.util.escape.Platform.1
        @Override // java.lang.ThreadLocal
        public char[] initialValue() {
            return new char[1024];
        }
    };

    private Platform() {
    }

    public static char[] charBufferFromThreadLocal() {
        return DEST_TL.get();
    }
}
