package k2;

import androidx.compose.runtime.internal.PlatformOptimizedCancellationException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class h0 extends PlatformOptimizedCancellationException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(int i10) {
        super("rememberCoroutineScope left the composition");
        switch (i10) {
            case 1:
                super("The coroutine scope left the composition");
                break;
            default:
                break;
        }
    }
}
