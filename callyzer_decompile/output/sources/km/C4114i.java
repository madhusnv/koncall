package km;

import uw.InterfaceC7559c;
import ww.AbstractC8193c;

/* renamed from: km.i */
/* loaded from: classes3.dex */
public final class C4114i extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f21028a;

    /* renamed from: b */
    public int f21029b;

    /* renamed from: c */
    public final /* synthetic */ C4110e f21030c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4114i(C4110e c4110e, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f21030c = c4110e;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f21028a = obj;
        this.f21029b |= Integer.MIN_VALUE;
        return this.f21030c.emit(null, this);
    }
}
