package kr;

import d3.l0;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import g2.j0;
import g2.o0;
import j$.time.LocalDateTime;
import k2.C3953b;
import k2.InterfaceC3962k;
import sq.g2;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kr.f */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4191f implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f21241a = 0;

    /* renamed from: b */
    public final /* synthetic */ String f21242b;

    /* renamed from: c */
    public final /* synthetic */ boolean f21243c;

    /* renamed from: d */
    public final /* synthetic */ long f21244d;

    /* renamed from: e */
    public final /* synthetic */ Object f21245e;

    /* renamed from: f */
    public final /* synthetic */ Object f21246f;

    /* renamed from: g */
    public final /* synthetic */ Object f21247g;

    /* renamed from: h */
    public final /* synthetic */ Object f21248h;

    /* renamed from: j */
    public final /* synthetic */ Object f21249j;

    public /* synthetic */ C4191f(String str, InterfaceC2137a interfaceC2137a, InterfaceC7879r interfaceC7879r, boolean z6, long j6, l0 l0Var, j0 j0Var, o0 o0Var, int i10) {
        this.f21242b = str;
        this.f21245e = interfaceC2137a;
        this.f21246f = interfaceC7879r;
        this.f21243c = z6;
        this.f21244d = j6;
        this.f21247g = l0Var;
        this.f21248h = j0Var;
        this.f21249j = o0Var;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f21241a) {
            case 0:
                ((Integer) obj2).getClass();
                int iM8496A = C3953b.m8496A(1);
                AbstractC4189d.m8934b((LocalDateTime) this.f21245e, (LocalDateTime) this.f21246f, this.f21244d, this.f21242b, this.f21243c, (String) this.f21247g, (String) this.f21248h, (InterfaceC2139c) this.f21249j, (InterfaceC3962k) obj, iM8496A);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM8496A2 = C3953b.m8496A(385);
                g2.m13166r(this.f21242b, (InterfaceC2137a) this.f21245e, (InterfaceC7879r) this.f21246f, this.f21243c, this.f21244d, (l0) this.f21247g, (j0) this.f21248h, (o0) this.f21249j, (InterfaceC3962k) obj, iM8496A2);
                break;
        }
        return qw.a0.f30746a;
    }

    public /* synthetic */ C4191f(LocalDateTime localDateTime, LocalDateTime localDateTime2, long j6, String str, boolean z6, String str2, String str3, InterfaceC2139c interfaceC2139c, int i10) {
        this.f21245e = localDateTime;
        this.f21246f = localDateTime2;
        this.f21244d = j6;
        this.f21242b = str;
        this.f21243c = z6;
        this.f21247g = str2;
        this.f21248h = str3;
        this.f21249j = interfaceC2139c;
    }
}
