package androidx.room;

import android.os.CancellationSignal;
import p001o.geg;
import p001o.kf9;
import p001o.p69;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes2.dex */
public final class CoroutinesRoom$Companion$execute$4$1 extends kf9 implements xk7 {
    final /* synthetic */ CancellationSignal $cancellationSignal;
    final /* synthetic */ p69 $job;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesRoom$Companion$execute$4$1(CancellationSignal cancellationSignal, p69 p69Var) {
        super(1);
        this.$cancellationSignal = cancellationSignal;
        this.$job = p69Var;
    }

    @Override // p001o.xk7
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return y3i.f54824a;
    }

    public final void invoke(Throwable th) {
        CancellationSignal cancellationSignal = this.$cancellationSignal;
        if (cancellationSignal != null) {
            geg.m28530a(cancellationSignal);
        }
        p69.C15966a.m42999a(this.$job, null, 1, null);
    }
}
