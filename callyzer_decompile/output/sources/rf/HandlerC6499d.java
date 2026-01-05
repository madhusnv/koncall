package rf;

import android.os.Message;
import android.util.Log;
import android.util.Pair;
import ci.C0973a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.internal.measurement.h0;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rf.d */
/* loaded from: classes.dex */
public final class HandlerC6499d extends h0 {
    @Override // com.google.android.gms.internal.measurement.h0, android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            if (i10 != 2) {
                Log.wtf("BasePendingResult", AbstractC4801l.m9730d(i10, "Don't know how to handle message: "), new Exception());
                return;
            } else {
                ((BasePendingResult) message.obj).m3095c(Status.f6005h);
                return;
            }
        }
        Pair pair = (Pair) message.obj;
        if (pair.first != null) {
            throw new ClassCastException();
        }
        try {
            throw null;
        } catch (RuntimeException e2) {
            C0973a c0973a = BasePendingResult.f6012k;
            throw e2;
        }
    }
}
