package g2;

import d3.C1559m;
import ex.InterfaceC2141e;
import ex.InterfaceC2142f;
import i3.AbstractC3166c;
import k2.C3953b;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4155m;
import s2.C6734c;
import t3.InterfaceC7023j;
import w2.InterfaceC7866e;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g2.x */
/* loaded from: classes.dex */
public final class C2470x extends AbstractC4155m implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f13184a = 1;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC7879r f13185b;

    /* renamed from: c */
    public final /* synthetic */ float f13186c;

    /* renamed from: d */
    public final /* synthetic */ int f13187d;

    /* renamed from: e */
    public final /* synthetic */ int f13188e;

    /* renamed from: f */
    public final /* synthetic */ Object f13189f;

    /* renamed from: g */
    public final /* synthetic */ Object f13190g;

    /* renamed from: h */
    public final /* synthetic */ Object f13191h;

    /* renamed from: j */
    public final /* synthetic */ Object f13192j;

    /* renamed from: k */
    public final /* synthetic */ Object f13193k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2470x(AbstractC3166c abstractC3166c, String str, InterfaceC7879r interfaceC7879r, InterfaceC7866e interfaceC7866e, InterfaceC7023j interfaceC7023j, float f6, C1559m c1559m, int i10, int i11) {
        super(2);
        this.f13189f = abstractC3166c;
        this.f13190g = str;
        this.f13185b = interfaceC7879r;
        this.f13191h = interfaceC7866e;
        this.f13192j = interfaceC7023j;
        this.f13186c = f6;
        this.f13193k = c1559m;
        this.f13187d = i10;
        this.f13188e = i11;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f13184a) {
            case 0:
                ((Number) obj2).intValue();
                C6734c c6734c = (C6734c) this.f13189f;
                InterfaceC2141e interfaceC2141e = (InterfaceC2141e) this.f13190g;
                InterfaceC2142f interfaceC2142f = (InterfaceC2142f) this.f13191h;
                o1.v1 v1Var = (o1.v1) this.f13192j;
                td tdVar = (td) this.f13193k;
                a0.m6111b(c6734c, this.f13185b, interfaceC2141e, interfaceC2142f, this.f13186c, v1Var, tdVar, (InterfaceC3962k) obj, C3953b.m8496A(this.f13187d | 1), this.f13188e);
                break;
            default:
                ((Number) obj2).intValue();
                AbstractC3166c abstractC3166c = (AbstractC3166c) this.f13189f;
                String str = (String) this.f13190g;
                InterfaceC7866e interfaceC7866e = (InterfaceC7866e) this.f13191h;
                InterfaceC7023j interfaceC7023j = (InterfaceC7023j) this.f13192j;
                C1559m c1559m = (C1559m) this.f13193k;
                pg.i0.m11693a(abstractC3166c, str, this.f13185b, interfaceC7866e, interfaceC7023j, this.f13186c, c1559m, (InterfaceC3962k) obj, C3953b.m8496A(this.f13187d | 1), this.f13188e);
                break;
        }
        return qw.a0.f30746a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2470x(C6734c c6734c, InterfaceC7879r interfaceC7879r, InterfaceC2141e interfaceC2141e, InterfaceC2142f interfaceC2142f, float f6, o1.v1 v1Var, td tdVar, int i10, int i11) {
        super(2);
        this.f13189f = c6734c;
        this.f13185b = interfaceC7879r;
        this.f13190g = interfaceC2141e;
        this.f13191h = interfaceC2142f;
        this.f13186c = f6;
        this.f13192j = v1Var;
        this.f13193k = tdVar;
        this.f13187d = i10;
        this.f13188e = i11;
    }
}
