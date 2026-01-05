package androidx.datastore.core;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class NativeSharedCounter {
    public final native long nativeCreateSharedCounter(int i10);

    public final native int nativeGetCounterValue(long j6);

    public final native int nativeIncrementAndGetCounterValue(long j6);

    public final native int nativeTruncateFile(int i10);
}
