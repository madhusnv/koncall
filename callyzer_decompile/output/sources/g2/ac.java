package g2;

import ex.InterfaceC2141e;
import k2.C3953b;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4155m;
import s2.C6734c;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ac extends AbstractC4155m implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f11201a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC7879r f11202b;

    /* renamed from: c */
    public final /* synthetic */ long f11203c;

    /* renamed from: d */
    public final /* synthetic */ long f11204d;

    /* renamed from: e */
    public final /* synthetic */ float f11205e;

    /* renamed from: f */
    public final /* synthetic */ i1.p1 f11206f;

    /* renamed from: g */
    public final /* synthetic */ C6734c f11207g;

    /* renamed from: h */
    public final /* synthetic */ C6734c f11208h;

    /* renamed from: j */
    public final /* synthetic */ C6734c f11209j;

    /* renamed from: k */
    public final /* synthetic */ int f11210k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac(float f6, int i10, int i11, long j6, long j10, i1.p1 p1Var, C6734c c6734c, C6734c c6734c2, C6734c c6734c3, InterfaceC7879r interfaceC7879r) {
        super(2);
        this.f11201a = i10;
        this.f11202b = interfaceC7879r;
        this.f11203c = j6;
        this.f11204d = j10;
        this.f11205e = f6;
        this.f11206f = p1Var;
        this.f11207g = c6734c;
        this.f11208h = c6734c2;
        this.f11209j = c6734c3;
        this.f11210k = i11;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iM8496A = C3953b.m8496A(this.f11210k | 1);
        dc.m6126c(this.f11205e, this.f11201a, iM8496A, this.f11203c, this.f11204d, this.f11206f, (InterfaceC3962k) obj, this.f11207g, this.f11208h, this.f11209j, this.f11202b);
        return qw.a0.f30746a;
    }
}
