package androidx.graphics.path;

import android.graphics.Path;
import dalvik.annotation.optimization.FastNative;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class PathIteratorPreApi34Impl {
    static {
        System.loadLibrary("androidx.graphics.path");
    }

    private final native long createInternalPathIterator(Path path, int i10, float f6);

    private final native void destroyInternalPathIterator(long j6);

    @FastNative
    private final native boolean internalPathIteratorHasNext(long j6);

    @FastNative
    private final native int internalPathIteratorNext(long j6, float[] fArr, int i10);

    @FastNative
    private final native int internalPathIteratorPeek(long j6);

    @FastNative
    private final native int internalPathIteratorRawSize(long j6);

    @FastNative
    private final native int internalPathIteratorSize(long j6);

    public final void finalize() {
        destroyInternalPathIterator(0L);
    }
}
