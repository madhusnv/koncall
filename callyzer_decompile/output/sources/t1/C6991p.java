package t1;

import ex.InterfaceC2139c;
import k1.x0;
import kotlin.jvm.internal.AbstractC4155m;
import og.eg;
import s1.C6729x;
import w2.C7864c;
import w2.C7869h;
import w2.C7870i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: t1.p */
/* loaded from: classes.dex */
public final class C6991p extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f33832a;

    /* renamed from: b */
    public final /* synthetic */ C6729x f33833b;

    /* renamed from: c */
    public final /* synthetic */ long f33834c;

    /* renamed from: d */
    public final /* synthetic */ C6990o f33835d;

    /* renamed from: e */
    public final /* synthetic */ long f33836e;

    /* renamed from: f */
    public final /* synthetic */ x0 f33837f;

    /* renamed from: g */
    public final /* synthetic */ C7870i f33838g;

    /* renamed from: h */
    public final /* synthetic */ int f33839h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6991p(C6729x c6729x, long j6, C6990o c6990o, long j10, x0 x0Var, C7870i c7870i, int i10, int i11) {
        super(1);
        this.f33832a = i11;
        this.f33833b = c6729x;
        this.f33834c = j6;
        this.f33835d = c6990o;
        this.f33836e = j10;
        this.f33837f = x0Var;
        this.f33838g = c7870i;
        this.f33839h = i10;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f33832a) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                C7869h c7869h = C7864c.f37655p;
                C6729x c6729x = this.f33833b;
                return eg.m10636c(c6729x, iIntValue, this.f33834c, this.f33835d, this.f33836e, this.f33837f, c7869h, this.f33838g, c6729x.f32165b.getLayoutDirection(), false, this.f33839h);
            default:
                int iIntValue2 = ((Number) obj).intValue();
                C7869h c7869h2 = C7864c.f37655p;
                C6729x c6729x2 = this.f33833b;
                return eg.m10636c(c6729x2, iIntValue2, this.f33834c, this.f33835d, this.f33836e, this.f33837f, c7869h2, this.f33838g, c6729x2.f32165b.getLayoutDirection(), false, this.f33839h);
        }
    }
}
