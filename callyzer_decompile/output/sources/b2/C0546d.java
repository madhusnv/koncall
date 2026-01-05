package b2;

import ex.InterfaceC2141e;
import k2.C3953b;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4155m;
import s2.AbstractC6740i;
import w2.InterfaceC7879r;
import w3.k1;
import w3.t2;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b2.d */
/* loaded from: classes.dex */
public final class C0546d extends AbstractC4155m implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ t2 f3711a;

    /* renamed from: b */
    public final /* synthetic */ long f3712b;

    /* renamed from: c */
    public final /* synthetic */ boolean f3713c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC7879r f3714d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC0557o f3715e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0546d(t2 t2Var, long j6, boolean z6, InterfaceC7879r interfaceC7879r, InterfaceC0557o interfaceC0557o) {
        super(2);
        this.f3711a = t2Var;
        this.f3712b = j6;
        this.f3713c = z6;
        this.f3714d = interfaceC7879r;
        this.f3715e = interfaceC0557o;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
        int iIntValue = ((Number) obj2).intValue();
        C3966o c3966o = (C3966o) interfaceC3962k;
        if (c3966o.m8598P(iIntValue & 1, (iIntValue & 3) != 2)) {
            C3953b.m8498a(k1.f37847s.mo8541a(this.f3711a), AbstractC6740i.m12902d(1260045569, new C0545c(this.f3712b, this.f3713c, this.f3714d, this.f3715e), c3966o), c3966o, 56);
        } else {
            c3966o.m8601S();
        }
        return qw.a0.f30746a;
    }
}
