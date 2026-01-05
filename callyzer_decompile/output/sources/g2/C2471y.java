package g2;

import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import o1.AbstractC5251j;
import o1.C5246e;
import o1.InterfaceC5247f;
import o1.InterfaceC5249h;
import s4.C6745a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g2.y */
/* loaded from: classes.dex */
public final class C2471y extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ t3.w0 f13269a;

    /* renamed from: b */
    public final /* synthetic */ int f13270b;

    /* renamed from: c */
    public final /* synthetic */ t3.w0 f13271c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC5247f f13272d;

    /* renamed from: e */
    public final /* synthetic */ long f13273e;

    /* renamed from: f */
    public final /* synthetic */ t3.w0 f13274f;

    /* renamed from: g */
    public final /* synthetic */ t3.l0 f13275g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC5249h f13276h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2471y(t3.w0 w0Var, int i10, t3.w0 w0Var2, InterfaceC5247f interfaceC5247f, long j6, t3.w0 w0Var3, t3.l0 l0Var, InterfaceC5249h interfaceC5249h, int i11) {
        super(1);
        this.f13269a = w0Var;
        this.f13270b = i10;
        this.f13271c = w0Var2;
        this.f13272d = interfaceC5247f;
        this.f13273e = j6;
        this.f13274f = w0Var3;
        this.f13275g = l0Var;
        this.f13276h = interfaceC5249h;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        int iM12918i;
        int iM12918i2;
        t3.v0 v0Var = (t3.v0) obj;
        t3.w0 w0Var = this.f13269a;
        int i10 = w0Var.f34031b;
        int i11 = this.f13270b;
        int i12 = 0;
        t3.v0.m13319g(v0Var, w0Var, 0, (i11 - i10) / 2);
        C5246e c5246e = AbstractC5251j.f25761e;
        InterfaceC5247f interfaceC5247f = this.f13272d;
        boolean zM8918a = AbstractC4154l.m8918a(interfaceC5247f, c5246e);
        t3.w0 w0Var2 = this.f13274f;
        t3.w0 w0Var3 = this.f13271c;
        long j6 = this.f13273e;
        if (zM8918a) {
            int iM12918i3 = C6745a.m12918i(j6);
            int i13 = w0Var3.f34030a;
            iM12918i = (iM12918i3 - i13) / 2;
            int i14 = w0Var.f34030a;
            if (iM12918i < i14) {
                iM12918i2 = i14 - iM12918i;
            } else if (i13 + iM12918i > C6745a.m12918i(j6) - w0Var2.f34030a) {
                iM12918i2 = (C6745a.m12918i(j6) - w0Var2.f34030a) - (w0Var3.f34030a + iM12918i);
            }
            iM12918i += iM12918i2;
        } else {
            iM12918i = AbstractC4154l.m8918a(interfaceC5247f, AbstractC5251j.f25758b) ? (C6745a.m12918i(j6) - w0Var3.f34030a) - w0Var2.f34030a : Math.max(this.f13275g.e0(a0.f11126b), w0Var.f34030a);
        }
        InterfaceC5249h interfaceC5249h = this.f13276h;
        if (AbstractC4154l.m8918a(interfaceC5249h, c5246e)) {
            i12 = (i11 - w0Var3.f34031b) / 2;
        } else if (AbstractC4154l.m8918a(interfaceC5249h, AbstractC5251j.f25760d)) {
            i12 = i11 - w0Var3.f34031b;
        }
        t3.v0.m13319g(v0Var, w0Var3, iM12918i, i12);
        t3.v0.m13319g(v0Var, w0Var2, C6745a.m12918i(j6) - w0Var2.f34030a, (i11 - w0Var2.f34031b) / 2);
        return qw.a0.f30746a;
    }
}
