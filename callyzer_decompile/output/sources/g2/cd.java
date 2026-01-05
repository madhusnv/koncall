package g2;

import d4.AbstractC1594v;
import d4.C1573a;
import d4.C1582j;
import d4.C1583k;
import d4.InterfaceC1596x;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4155m;
import lx.InterfaceC4574m;
import tx.InterfaceC7266z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class cd extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ boolean f11331a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC7266z f11332b;

    /* renamed from: c */
    public final /* synthetic */ C2460n f11333c;

    /* renamed from: d */
    public final /* synthetic */ float f11334d;

    /* renamed from: e */
    public final /* synthetic */ boolean f11335e;

    /* renamed from: f */
    public final /* synthetic */ k2.w0 f11336f;

    /* renamed from: g */
    public final /* synthetic */ k2.w0 f11337g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cd(boolean z6, InterfaceC7266z interfaceC7266z, C2460n c2460n, float f6, boolean z10, k2.w0 w0Var, k2.w0 w0Var2) {
        super(1);
        this.f11331a = z6;
        this.f11332b = interfaceC7266z;
        this.f11333c = c2460n;
        this.f11334d = f6;
        this.f11335e = z10;
        this.f11336f = w0Var;
        this.f11337g = w0Var2;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        InterfaceC1596x interfaceC1596x = (InterfaceC1596x) obj;
        bd bdVar = new bd(this.f11332b, this.f11333c, this.f11334d, this.f11335e, this.f11336f, this.f11337g);
        InterfaceC4574m[] interfaceC4574mArr = AbstractC1594v.f7944a;
        ((C1583k) interfaceC1596x).m5202q(C1582j.f7843b, new C1573a(null, bdVar));
        AbstractC1594v.m5231i(interfaceC1596x, this.f11331a);
        return qw.a0.f30746a;
    }
}
