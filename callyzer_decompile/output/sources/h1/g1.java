package h1;

import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4155m;
import kotlin.jvm.internal.C4168z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class g1 extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ C4168z f15423a;

    /* renamed from: b */
    public final /* synthetic */ Object f15424b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2775f f15425c;

    /* renamed from: d */
    public final /* synthetic */ AbstractC2785p f15426d;

    /* renamed from: e */
    public final /* synthetic */ C2780k f15427e;

    /* renamed from: f */
    public final /* synthetic */ float f15428f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC2139c f15429g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(C4168z c4168z, Object obj, InterfaceC2775f interfaceC2775f, AbstractC2785p abstractC2785p, C2780k c2780k, float f6, InterfaceC2139c interfaceC2139c) {
        super(1);
        this.f15423a = c4168z;
        this.f15424b = obj;
        this.f15425c = interfaceC2775f;
        this.f15426d = abstractC2785p;
        this.f15427e = c2780k;
        this.f15428f = f6;
        this.f15429g = interfaceC2139c;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        long jLongValue = ((Number) obj).longValue();
        InterfaceC2775f interfaceC2775f = this.f15425c;
        C2778i c2778i = new C2778i(this.f15424b, interfaceC2775f.mo6806d(), this.f15426d, jLongValue, interfaceC2775f.mo6810h(), jLongValue, new f1(0, this.f15427e));
        AbstractC2773d.m6790m(c2778i, jLongValue, this.f15428f, this.f15425c, this.f15427e, this.f15429g);
        this.f15423a.f21164a = c2778i;
        return qw.a0.f30746a;
    }
}
