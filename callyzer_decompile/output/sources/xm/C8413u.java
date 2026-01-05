package xm;

import bt.C0778w;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;

/* renamed from: xm.u */
/* loaded from: classes3.dex */
public final class C8413u extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f40876a;

    /* renamed from: b */
    public int f40877b;

    /* renamed from: c */
    public final /* synthetic */ C0778w f40878c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8413u(C0778w c0778w, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f40878c = c0778w;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f40876a = obj;
        this.f40877b |= Integer.MIN_VALUE;
        return this.f40878c.emit(null, this);
    }
}
