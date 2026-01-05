package xd;

import bt.C0778w;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xd.i */
/* loaded from: classes.dex */
public final class C8338i extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f39933a;

    /* renamed from: b */
    public int f39934b;

    /* renamed from: c */
    public final /* synthetic */ C0778w f39935c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8338i(C0778w c0778w, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f39935c = c0778w;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f39933a = obj;
        this.f39934b |= Integer.MIN_VALUE;
        return this.f39935c.emit(null, this);
    }
}
