package g1;

import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4155m;
import s4.EnumC6757m;
import w2.InterfaceC7866e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g1.o */
/* loaded from: classes.dex */
public final class C2435o extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ C2437q f11040a;

    /* renamed from: b */
    public final /* synthetic */ t3.w0 f11041b;

    /* renamed from: c */
    public final /* synthetic */ long f11042c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2435o(C2437q c2437q, t3.w0 w0Var, long j6) {
        super(1);
        this.f11040a = c2437q;
        this.f11041b = w0Var;
        this.f11042c = j6;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        InterfaceC7866e interfaceC7866e = this.f11040a.f11053s.f11061b;
        t3.v0.m13318f((t3.v0) obj, this.f11041b, interfaceC7866e.mo14848a((r0.f34031b & 4294967295L) | (r0.f34030a << 32), this.f11042c, EnumC6757m.Ltr));
        return qw.a0.f30746a;
    }
}
