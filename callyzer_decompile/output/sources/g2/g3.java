package g2;

import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import h2.AbstractC2808m;
import h2.C2810o;
import k2.C3953b;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4155m;
import kx.C4266h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class g3 extends AbstractC4155m implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f11621a = 1;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2139c f11622b;

    /* renamed from: c */
    public final /* synthetic */ long f11623c;

    /* renamed from: d */
    public final /* synthetic */ Long f11624d;

    /* renamed from: e */
    public final /* synthetic */ z2 f11625e;

    /* renamed from: f */
    public final /* synthetic */ z9 f11626f;

    /* renamed from: g */
    public final /* synthetic */ u2 f11627g;

    /* renamed from: h */
    public final /* synthetic */ int f11628h;

    /* renamed from: j */
    public final /* synthetic */ Object f11629j;

    /* renamed from: k */
    public final /* synthetic */ Object f11630k;

    /* renamed from: l */
    public final /* synthetic */ Object f11631l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(C2810o c2810o, InterfaceC2139c interfaceC2139c, long j6, Long l9, Long l10, aa aaVar, z2 z2Var, z9 z9Var, u2 u2Var, int i10) {
        super(2);
        this.f11629j = c2810o;
        this.f11622b = interfaceC2139c;
        this.f11623c = j6;
        this.f11624d = l9;
        this.f11630k = l10;
        this.f11631l = aaVar;
        this.f11625e = z2Var;
        this.f11626f = z9Var;
        this.f11627g = u2Var;
        this.f11628h = i10;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11621a) {
            case 0:
                ((Number) obj2).intValue();
                InterfaceC2139c interfaceC2139c = (InterfaceC2139c) this.f11629j;
                AbstractC2808m abstractC2808m = (AbstractC2808m) this.f11630k;
                C4266h c4266h = (C4266h) this.f11631l;
                f4.m6151k(this.f11624d, this.f11623c, this.f11622b, interfaceC2139c, abstractC2808m, c4266h, this.f11625e, this.f11626f, this.f11627g, (InterfaceC3962k) obj, C3953b.m8496A(this.f11628h | 1));
                break;
            default:
                ((Number) obj2).intValue();
                C2810o c2810o = (C2810o) this.f11629j;
                Long l9 = (Long) this.f11630k;
                aa aaVar = (aa) this.f11631l;
                f4.m6148h(c2810o, this.f11622b, this.f11623c, this.f11624d, l9, aaVar, this.f11625e, this.f11626f, this.f11627g, (InterfaceC3962k) obj, C3953b.m8496A(this.f11628h | 1));
                break;
        }
        return qw.a0.f30746a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(Long l9, long j6, InterfaceC2139c interfaceC2139c, InterfaceC2139c interfaceC2139c2, AbstractC2808m abstractC2808m, C4266h c4266h, z2 z2Var, z9 z9Var, u2 u2Var, int i10) {
        super(2);
        this.f11624d = l9;
        this.f11623c = j6;
        this.f11622b = interfaceC2139c;
        this.f11629j = interfaceC2139c2;
        this.f11630k = abstractC2808m;
        this.f11631l = c4266h;
        this.f11625e = z2Var;
        this.f11626f = z9Var;
        this.f11627g = u2Var;
        this.f11628h = i10;
    }
}
