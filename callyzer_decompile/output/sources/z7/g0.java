package z7;

import g2.e4;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class g0 extends AbstractC8193c {

    /* renamed from: a */
    public e4 f42729a;

    /* renamed from: b */
    public int[] f42730b;

    /* renamed from: c */
    public /* synthetic */ Object f42731c;

    /* renamed from: d */
    public final /* synthetic */ e4 f42732d;

    /* renamed from: e */
    public int f42733e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(e4 e4Var, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f42732d = e4Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f42731c = obj;
        this.f42733e |= Integer.MIN_VALUE;
        return this.f42732d.m6131e(null, this);
    }
}
