package lw;

import androidx.datastore.preferences.protobuf.o1;
import ex.InterfaceC2141e;
import f3.C2202h;
import g4.o0;
import k2.C3953b;
import k2.InterfaceC3962k;
import sq.g2;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: lw.p */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4551p implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f22636a = 1;

    /* renamed from: b */
    public final /* synthetic */ long f22637b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC7879r f22638c;

    /* renamed from: d */
    public final /* synthetic */ int f22639d;

    /* renamed from: e */
    public final /* synthetic */ Object f22640e;

    /* renamed from: f */
    public final /* synthetic */ Object f22641f;

    public /* synthetic */ C4551p(int i10, long j6, o0 o0Var, String str, InterfaceC7879r interfaceC7879r) {
        this.f22640e = str;
        this.f22637b = j6;
        this.f22641f = o0Var;
        this.f22638c = interfaceC7879r;
        this.f22639d = i10;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f22636a) {
            case 0:
                ((Integer) obj2).getClass();
                o1.m1028f((C4543h) this.f22640e, this.f22638c, this.f22637b, (C2202h) this.f22641f, (InterfaceC3962k) obj, C3953b.m8496A(this.f22639d | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                g2.m13129G((String) this.f22640e, this.f22637b, (o0) this.f22641f, this.f22638c, (InterfaceC3962k) obj, C3953b.m8496A(this.f22639d | 1));
                break;
        }
        return qw.a0.f30746a;
    }

    public /* synthetic */ C4551p(C4543h c4543h, InterfaceC7879r interfaceC7879r, long j6, C2202h c2202h, int i10) {
        this.f22640e = c4543h;
        this.f22638c = interfaceC7879r;
        this.f22637b = j6;
        this.f22641f = c2202h;
        this.f22639d = i10;
    }
}
