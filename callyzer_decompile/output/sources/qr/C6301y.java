package qr;

import ex.InterfaceC2137a;
import k2.b1;
import u2.C7320q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qr.y */
/* loaded from: classes3.dex */
public final class C6301y implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f30625a = 0;

    /* renamed from: b */
    public final /* synthetic */ int f30626b;

    /* renamed from: c */
    public final /* synthetic */ Object f30627c;

    public C6301y(int i10, b1 b1Var) {
        this.f30626b = i10;
        this.f30627c = b1Var;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f30625a) {
            case 0:
                ((b1) this.f30627c).m8527g(this.f30626b);
                break;
            default:
                C7320q c7320q = (C7320q) this.f30627c;
                int i10 = this.f30626b;
                if (c7320q.contains(Integer.valueOf(i10))) {
                    c7320q.remove(Integer.valueOf(i10));
                } else {
                    c7320q.add(Integer.valueOf(i10));
                }
                break;
        }
        return qw.a0.f30746a;
    }

    public C6301y(C7320q c7320q, int i10) {
        this.f30627c = c7320q;
        this.f30626b = i10;
    }
}
