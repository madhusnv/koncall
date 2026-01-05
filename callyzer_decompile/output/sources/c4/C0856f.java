package c4;

import android.os.CancellationSignal;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4155m;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c4.f */
/* loaded from: classes.dex */
public final class C0856f extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f5391a;

    /* renamed from: b */
    public final /* synthetic */ CancellationSignal f5392b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0856f(CancellationSignal cancellationSignal, int i10) {
        super(1);
        this.f5391a = i10;
        this.f5392b = cancellationSignal;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f5391a) {
            case 0:
                if (((Throwable) obj) != null) {
                    this.f5392b.cancel();
                }
                break;
            case 1:
                this.f5392b.cancel();
                break;
            default:
                this.f5392b.cancel();
                break;
        }
        return a0.f30746a;
    }
}
