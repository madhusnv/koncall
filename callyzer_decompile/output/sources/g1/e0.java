package g1;

import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import g2.n6;
import h1.InterfaceC2794y;
import h1.p1;
import h1.s1;
import h1.v1;
import k2.C3953b;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4155m;
import og.rf;
import s2.C6734c;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class e0 extends AbstractC4155m implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f10967a = 1;

    /* renamed from: b */
    public final /* synthetic */ Object f10968b;

    /* renamed from: c */
    public final /* synthetic */ int f10969c;

    /* renamed from: d */
    public final /* synthetic */ Object f10970d;

    /* renamed from: e */
    public final /* synthetic */ Object f10971e;

    /* renamed from: f */
    public final /* synthetic */ Object f10972f;

    /* renamed from: g */
    public final /* synthetic */ Object f10973g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(InterfaceC2141e interfaceC2141e, InterfaceC2141e interfaceC2141e2, C6734c c6734c, InterfaceC2141e interfaceC2141e3, InterfaceC2141e interfaceC2141e4, int i10) {
        super(2);
        this.f10970d = interfaceC2141e;
        this.f10971e = interfaceC2141e2;
        this.f10968b = c6734c;
        this.f10972f = interfaceC2141e3;
        this.f10973g = interfaceC2141e4;
        this.f10969c = i10;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10967a) {
            case 0:
                ((Number) obj2).intValue();
                rf.m10880a((s1) this.f10970d, (InterfaceC7879r) this.f10971e, (InterfaceC2794y) this.f10972f, (InterfaceC2139c) this.f10973g, (C6734c) this.f10968b, (InterfaceC3962k) obj, C3953b.m8496A(this.f10969c | 1));
                break;
            case 1:
                ((Number) obj2).intValue();
                n6.m6218b((InterfaceC2141e) this.f10970d, (InterfaceC2141e) this.f10971e, (C6734c) this.f10968b, (InterfaceC2141e) this.f10972f, (InterfaceC2141e) this.f10973g, (InterfaceC3962k) obj, C3953b.m8496A(this.f10969c | 1));
                break;
            default:
                ((Number) obj2).intValue();
                s1 s1Var = (s1) this.f10970d;
                p1 p1Var = (p1) this.f10971e;
                InterfaceC2794y interfaceC2794y = (InterfaceC2794y) this.f10972f;
                v1.m6868a(s1Var, p1Var, this.f10973g, this.f10968b, interfaceC2794y, (InterfaceC3962k) obj, C3953b.m8496A(this.f10969c | 1));
                break;
        }
        return qw.a0.f30746a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(s1 s1Var, p1 p1Var, Object obj, Object obj2, InterfaceC2794y interfaceC2794y, int i10) {
        super(2);
        this.f10970d = s1Var;
        this.f10971e = p1Var;
        this.f10973g = obj;
        this.f10968b = obj2;
        this.f10972f = interfaceC2794y;
        this.f10969c = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(s1 s1Var, InterfaceC7879r interfaceC7879r, InterfaceC2794y interfaceC2794y, InterfaceC2139c interfaceC2139c, C6734c c6734c, int i10) {
        super(2);
        this.f10970d = s1Var;
        this.f10971e = interfaceC7879r;
        this.f10972f = interfaceC2794y;
        this.f10973g = interfaceC2139c;
        this.f10968b = c6734c;
        this.f10969c = i10;
    }
}
