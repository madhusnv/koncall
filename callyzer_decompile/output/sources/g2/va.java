package g2;

import ex.InterfaceC2141e;
import k2.C3953b;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4155m;
import s2.C6734c;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class va extends AbstractC4155m implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f13015a = 0;

    /* renamed from: b */
    public final /* synthetic */ long f13016b;

    /* renamed from: c */
    public final /* synthetic */ long f13017c;

    /* renamed from: d */
    public final /* synthetic */ C6734c f13018d;

    /* renamed from: e */
    public final /* synthetic */ int f13019e;

    /* renamed from: f */
    public final /* synthetic */ Object f13020f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC2141e f13021g;

    /* renamed from: h */
    public final /* synthetic */ Object f13022h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va(C6734c c6734c, InterfaceC2141e interfaceC2141e, InterfaceC2141e interfaceC2141e2, g4.o0 o0Var, long j6, long j10, int i10) {
        super(2);
        this.f13018d = c6734c;
        this.f13020f = interfaceC2141e;
        this.f13021g = interfaceC2141e2;
        this.f13022h = o0Var;
        this.f13016b = j6;
        this.f13017c = j10;
        this.f13019e = i10;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f13015a) {
            case 0:
                ((Number) obj2).intValue();
                InterfaceC2141e interfaceC2141e = (InterfaceC2141e) this.f13020f;
                g4.o0 o0Var = (g4.o0) this.f13022h;
                ab.m6119c(this.f13018d, interfaceC2141e, this.f13021g, o0Var, this.f13016b, this.f13017c, (InterfaceC3962k) obj, C3953b.m8496A(this.f13019e | 1));
                break;
            default:
                ((Number) obj2).intValue();
                InterfaceC7879r interfaceC7879r = (InterfaceC7879r) this.f13020f;
                C6734c c6734c = (C6734c) this.f13021g;
                C6734c c6734c2 = (C6734c) this.f13022h;
                dc.m6127d(interfaceC7879r, this.f13016b, this.f13017c, this.f13018d, c6734c, c6734c2, (InterfaceC3962k) obj, C3953b.m8496A(this.f13019e | 1));
                break;
        }
        return qw.a0.f30746a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va(InterfaceC7879r interfaceC7879r, long j6, long j10, C6734c c6734c, C6734c c6734c2, C6734c c6734c3, int i10) {
        super(2);
        this.f13020f = interfaceC7879r;
        this.f13016b = j6;
        this.f13017c = j10;
        this.f13018d = c6734c;
        this.f13021g = c6734c2;
        this.f13022h = c6734c3;
        this.f13019e = i10;
    }
}
