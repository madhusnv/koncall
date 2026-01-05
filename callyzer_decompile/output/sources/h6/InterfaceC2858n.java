package h6;

import android.content.Context;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h6.n */
/* loaded from: classes.dex */
public interface InterfaceC2858n {
    boolean isAvailableOnDevice();

    void onCreateCredential(Context context, AbstractC2846b abstractC2846b, CancellationSignal cancellationSignal, Executor executor, InterfaceC2855k interfaceC2855k);

    void onGetCredential(Context context, C2863s c2863s, CancellationSignal cancellationSignal, Executor executor, InterfaceC2855k interfaceC2855k);
}
