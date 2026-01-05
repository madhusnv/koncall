package km;

import uw.InterfaceC7559c;
import ww.AbstractC8193c;

/* renamed from: km.d */
/* loaded from: classes3.dex */
public final class C4109d extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f21011a;

    /* renamed from: b */
    public int f21012b;

    /* renamed from: c */
    public final /* synthetic */ C4110e f21013c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4109d(C4110e c4110e, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f21013c = c4110e;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f21011a = obj;
        this.f21012b |= Integer.MIN_VALUE;
        return this.f21013c.emit(null, this);
    }
}
