package wx;

import bt.C0778w;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class i0 extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f39236a;

    /* renamed from: b */
    public final /* synthetic */ C0778w f39237b;

    /* renamed from: c */
    public int f39238c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(C0778w c0778w, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f39237b = c0778w;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f39236a = obj;
        this.f39238c |= Integer.MIN_VALUE;
        return this.f39237b.m2112c(null, this);
    }
}
