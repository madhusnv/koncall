package g1;

import ex.InterfaceC2141e;
import h1.InterfaceC2794y;
import k2.C3953b;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4155m;
import o1.AbstractC5244c;
import o1.InterfaceC5247f;
import o1.InterfaceC5249h;
import og.rf;
import s2.C6734c;
import w2.InterfaceC7865d;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b0 extends AbstractC4155m implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f10922a = 0;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC7879r f10923b;

    /* renamed from: c */
    public final /* synthetic */ int f10924c;

    /* renamed from: d */
    public final /* synthetic */ int f10925d;

    /* renamed from: e */
    public final /* synthetic */ C6734c f10926e;

    /* renamed from: f */
    public final /* synthetic */ Object f10927f;

    /* renamed from: g */
    public final /* synthetic */ Object f10928g;

    /* renamed from: h */
    public final /* synthetic */ Object f10929h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(Object obj, InterfaceC7879r interfaceC7879r, InterfaceC2794y interfaceC2794y, String str, C6734c c6734c, int i10, int i11) {
        super(2);
        this.f10927f = obj;
        this.f10923b = interfaceC7879r;
        this.f10928g = interfaceC2794y;
        this.f10929h = str;
        this.f10926e = c6734c;
        this.f10924c = i10;
        this.f10925d = i11;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10922a) {
            case 0:
                ((Number) obj2).intValue();
                InterfaceC2794y interfaceC2794y = (InterfaceC2794y) this.f10928g;
                String str = (String) this.f10929h;
                rf.m10881b(this.f10927f, this.f10923b, interfaceC2794y, str, this.f10926e, (InterfaceC3962k) obj, C3953b.m8496A(this.f10924c | 1), this.f10925d);
                break;
            case 1:
                ((Number) obj2).intValue();
                InterfaceC5249h interfaceC5249h = (InterfaceC5249h) this.f10927f;
                InterfaceC5247f interfaceC5247f = (InterfaceC5247f) this.f10928g;
                InterfaceC7865d interfaceC7865d = (InterfaceC7865d) this.f10929h;
                AbstractC5244c.m10319c(this.f10923b, interfaceC5249h, interfaceC5247f, interfaceC7865d, this.f10924c, this.f10925d, this.f10926e, (InterfaceC3962k) obj, C3953b.m8496A(1572865));
                break;
            default:
                ((Number) obj2).intValue();
                InterfaceC5247f interfaceC5247f2 = (InterfaceC5247f) this.f10927f;
                InterfaceC5249h interfaceC5249h2 = (InterfaceC5249h) this.f10928g;
                o1.t0 t0Var = (o1.t0) this.f10929h;
                AbstractC5244c.m10320d(this.f10923b, interfaceC5247f2, interfaceC5249h2, this.f10924c, t0Var, this.f10926e, (InterfaceC3962k) obj, C3953b.m8496A(this.f10925d | 1));
                break;
        }
        return qw.a0.f30746a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(InterfaceC7879r interfaceC7879r, InterfaceC5247f interfaceC5247f, InterfaceC5249h interfaceC5249h, int i10, o1.t0 t0Var, C6734c c6734c, int i11) {
        super(2);
        this.f10923b = interfaceC7879r;
        this.f10927f = interfaceC5247f;
        this.f10928g = interfaceC5249h;
        this.f10924c = i10;
        this.f10929h = t0Var;
        this.f10926e = c6734c;
        this.f10925d = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(InterfaceC7879r interfaceC7879r, InterfaceC5249h interfaceC5249h, InterfaceC5247f interfaceC5247f, InterfaceC7865d interfaceC7865d, int i10, int i11, C6734c c6734c, int i12) {
        super(2);
        this.f10923b = interfaceC7879r;
        this.f10927f = interfaceC5249h;
        this.f10928g = interfaceC5247f;
        this.f10929h = interfaceC7865d;
        this.f10924c = i10;
        this.f10925d = i11;
        this.f10926e = c6734c;
    }
}
