package p005f;

import b3.C0587s;
import b3.C0592x;
import ex.InterfaceC2137a;
import kotlin.jvm.internal.AbstractC4155m;
import qw.a0;
import wx.b1;
import wx.t0;
import z1.C8843c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: f.e */
/* loaded from: classes.dex */
public final class C2156e extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f10008a;

    /* renamed from: b */
    public final /* synthetic */ boolean f10009b;

    /* renamed from: c */
    public final /* synthetic */ Object f10010c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2156e(C2158g c2158g, boolean z6) {
        super(0);
        this.f10008a = 0;
        this.f10010c = c2158g;
        this.f10009b = z6;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [ex.a, kotlin.jvm.internal.j] */
    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        t0 t0VarM16307i;
        switch (this.f10008a) {
            case 0:
                C2158g c2158g = (C2158g) this.f10010c;
                c2158g.f8901a = this.f10009b;
                ?? r02 = c2158g.f8903c;
                if (r02 != 0) {
                    r02.invoke();
                }
                return a0.f30746a;
            case 1:
                if (this.f10009b) {
                    C0592x c0592x = (C0592x) this.f10010c;
                    c0592x.getClass();
                    c0592x.m1758a(new C0587s(1, 3));
                }
                return a0.f30746a;
            default:
                boolean z6 = this.f10009b;
                a0 a0Var = a0.f30746a;
                if (z6 && (t0VarM16307i = ((C8843c) this.f10010c).m16307i()) != null) {
                    ((b1) t0VarM16307i).mo15352b(a0Var);
                }
                return a0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2156e(boolean z6, Object obj, int i10) {
        super(0);
        this.f10008a = i10;
        this.f10009b = z6;
        this.f10010c = obj;
    }
}
