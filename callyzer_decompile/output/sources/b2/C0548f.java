package b2;

import d4.C1583k;
import d4.InterfaceC1596x;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b2.f */
/* loaded from: classes.dex */
public final class C0548f extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC0557o f3731a;

    /* renamed from: b */
    public final /* synthetic */ boolean f3732b;

    /* renamed from: c */
    public final /* synthetic */ boolean f3733c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0548f(InterfaceC0557o interfaceC0557o, boolean z6, boolean z10) {
        super(1);
        this.f3731a = interfaceC0557o;
        this.f3732b = z6;
        this.f3733c = z10;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        InterfaceC1596x interfaceC1596x = (InterfaceC1596x) obj;
        long jMo1652a = this.f3731a.mo1652a();
        ((C1583k) interfaceC1596x).m5202q(g0.f3747c, new f0(this.f3732b ? x1.j0.SelectionStart : x1.j0.SelectionEnd, jMo1652a, this.f3733c ? e0.Left : e0.Right, (9223372034707292159L & jMo1652a) != 9205357640488583168L));
        return qw.a0.f30746a;
    }
}
