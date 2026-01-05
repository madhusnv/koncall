package q1;

import s1.C6729x;
import s4.AbstractC6746b;
import s4.C6745a;
import w2.C7870i;
import w2.InterfaceC7865d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: q1.m */
/* loaded from: classes.dex */
public final class C6085m implements s1.a0 {

    /* renamed from: a */
    public final C6082j f29681a;

    /* renamed from: b */
    public final C6729x f29682b;

    /* renamed from: c */
    public final long f29683c;

    /* renamed from: d */
    public final /* synthetic */ boolean f29684d;

    /* renamed from: e */
    public final /* synthetic */ C6729x f29685e;

    /* renamed from: f */
    public final /* synthetic */ int f29686f;

    /* renamed from: g */
    public final /* synthetic */ int f29687g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC7865d f29688h;

    /* renamed from: i */
    public final /* synthetic */ C7870i f29689i;

    /* renamed from: j */
    public final /* synthetic */ int f29690j;

    /* renamed from: k */
    public final /* synthetic */ int f29691k;

    /* renamed from: l */
    public final /* synthetic */ long f29692l;

    /* renamed from: m */
    public final /* synthetic */ C6097y f29693m;

    public C6085m(long j6, boolean z6, C6082j c6082j, C6729x c6729x, int i10, int i11, InterfaceC7865d interfaceC7865d, C7870i c7870i, int i12, int i13, long j10, C6097y c6097y) {
        this.f29684d = z6;
        this.f29685e = c6729x;
        this.f29686f = i10;
        this.f29687g = i11;
        this.f29688h = interfaceC7865d;
        this.f29689i = c7870i;
        this.f29690j = i12;
        this.f29691k = i13;
        this.f29692l = j10;
        this.f29693m = c6097y;
        this.f29681a = c6082j;
        this.f29682b = c6729x;
        this.f29683c = AbstractC6746b.m12924b(z6 ? C6745a.m12918i(j6) : Integer.MAX_VALUE, z6 ? Integer.MAX_VALUE : C6745a.m12917h(j6), 5);
    }

    /* renamed from: a */
    public final C6091s m12106a(int i10, long j6) {
        C6082j c6082j = this.f29681a;
        Object objMo12102b = c6082j.mo12102b(i10);
        Object objM12886j = c6082j.f29658b.m12886j(i10);
        return new C6091s(i10, this.f29682b.m12875b(i10, j6), this.f29684d, this.f29688h, this.f29689i, this.f29685e.f32165b.getLayoutDirection(), this.f29690j, this.f29691k, i10 == this.f29686f + (-1) ? 0 : this.f29687g, this.f29692l, objMo12102b, objM12886j, this.f29693m.f29782m, j6);
    }
}
