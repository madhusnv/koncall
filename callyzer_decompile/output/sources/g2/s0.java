package g2;

import ex.InterfaceC2137a;
import ex.InterfaceC2141e;
import ex.InterfaceC2142f;
import k2.C3953b;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4155m;
import s2.C6734c;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class s0 extends AbstractC4155m implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f12639a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2137a f12640b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC7879r f12641c;

    /* renamed from: d */
    public final /* synthetic */ boolean f12642d;

    /* renamed from: e */
    public final /* synthetic */ d3.l0 f12643e;

    /* renamed from: f */
    public final /* synthetic */ int f12644f;

    /* renamed from: g */
    public final /* synthetic */ int f12645g;

    /* renamed from: h */
    public final /* synthetic */ Object f12646h;

    /* renamed from: j */
    public final /* synthetic */ Object f12647j;

    /* renamed from: k */
    public final /* synthetic */ InterfaceC2142f f12648k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(InterfaceC2137a interfaceC2137a, InterfaceC7879r interfaceC7879r, boolean z6, d3.l0 l0Var, Object obj, Object obj2, InterfaceC2142f interfaceC2142f, int i10, int i11, int i12) {
        super(2);
        this.f12639a = i12;
        this.f12640b = interfaceC2137a;
        this.f12641c = interfaceC7879r;
        this.f12642d = z6;
        this.f12643e = l0Var;
        this.f12646h = obj;
        this.f12647j = obj2;
        this.f12648k = interfaceC2142f;
        this.f12644f = i10;
        this.f12645g = i11;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12639a) {
            case 0:
                ((Number) obj2).intValue();
                j0 j0Var = (j0) this.f12646h;
                o1.h1 h1Var = (o1.h1) this.f12647j;
                p9.m6251o(this.f12640b, this.f12641c, this.f12642d, this.f12643e, j0Var, h1Var, this.f12648k, (InterfaceC3962k) obj, C3953b.m8496A(this.f12644f | 1), this.f12645g);
                break;
            default:
                ((Number) obj2).intValue();
                u0 u0Var = (u0) this.f12646h;
                v0 v0Var = (v0) this.f12647j;
                C6734c c6734c = (C6734c) this.f12648k;
                p9.m6239c(this.f12640b, this.f12641c, this.f12642d, this.f12643e, u0Var, v0Var, c6734c, (InterfaceC3962k) obj, C3953b.m8496A(this.f12644f | 1), this.f12645g);
                break;
        }
        return qw.a0.f30746a;
    }
}
