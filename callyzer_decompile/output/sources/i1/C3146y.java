package i1;

import c3.C0847b;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4155m;
import l3.InterfaceC4354a;
import v3.AbstractC7634f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i1.y */
/* loaded from: classes.dex */
public final class C3146y extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f17012a;

    /* renamed from: b */
    public final /* synthetic */ C3147z f17013b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3146y(C3147z c3147z, int i10) {
        super(1);
        this.f17012a = i10;
        this.f17013b = c3147z;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f17012a) {
            case 0:
                long j6 = ((C0847b) obj).f5352a;
                C3147z c3147z = this.f17013b;
                InterfaceC2137a interfaceC2137a = c3147z.f17014M;
                if (interfaceC2137a != null) {
                    interfaceC2137a.invoke();
                }
                if (c3147z.f17015N) {
                    ((InterfaceC4354a) AbstractC7634f.m14548i(c3147z, w3.k1.f37840l)).mo9067a(0);
                }
                break;
            default:
                long j10 = ((C0847b) obj).f5352a;
                C3147z c3147z2 = this.f17013b;
                if (c3147z2.f16845x) {
                    c3147z2.f16846y.invoke();
                }
                break;
        }
        return qw.a0.f30746a;
    }
}
