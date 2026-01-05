package w4;

import android.os.Handler;
import android.os.Looper;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import qw.a0;
import s4.C6756l;
import t3.InterfaceC7033t;
import v4.RunnableC7655a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w4.h */
/* loaded from: classes.dex */
public final class C7916h extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f38096a;

    /* renamed from: b */
    public final /* synthetic */ C7927s f38097b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7916h(C7927s c7927s, int i10) {
        super(1);
        this.f38096a = i10;
        this.f38097b = c7927s;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f38096a) {
            case 0:
                InterfaceC7033t interfaceC7033tMo13296D = ((InterfaceC7033t) obj).mo13296D();
                AbstractC4154l.m8920c(interfaceC7033tMo13296D);
                this.f38097b.m15056i(interfaceC7033tMo13296D);
                break;
            case 1:
                C6756l c6756l = new C6756l(((C6756l) obj).f32210a);
                C7927s c7927s = this.f38097b;
                c7927s.m16705setPopupContentSizefhxjrPA(c6756l);
                c7927s.m15057j();
                break;
            default:
                InterfaceC2137a interfaceC2137a = (InterfaceC2137a) obj;
                C7927s c7927s2 = this.f38097b;
                Handler handler = c7927s2.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    interfaceC2137a.invoke();
                } else {
                    Handler handler2 = c7927s2.getHandler();
                    if (handler2 != null) {
                        handler2.post(new RunnableC7655a(4, interfaceC2137a));
                    }
                }
                break;
        }
        return a0.f30746a;
    }
}
