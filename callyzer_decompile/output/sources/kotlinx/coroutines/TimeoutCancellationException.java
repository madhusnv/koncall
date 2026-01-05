package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import tx.e1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class TimeoutCancellationException extends CancellationException {

    /* renamed from: a */
    public final transient e1 f21167a;

    public TimeoutCancellationException(String str, e1 e1Var) {
        super(str);
        this.f21167a = e1Var;
    }
}
