package wx;

import uw.InterfaceC7559c;
import ww.AbstractC8193c;

/* loaded from: classes3.dex */
public final class g0 extends AbstractC8193c {

    /* renamed from: a */
    public h0 f39227a;

    /* renamed from: b */
    public /* synthetic */ Object f39228b;

    /* renamed from: c */
    public int f39229c;

    /* renamed from: d */
    public final /* synthetic */ h0 f39230d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(h0 h0Var, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f39230d = h0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f39228b = obj;
        this.f39229c |= Integer.MIN_VALUE;
        return this.f39230d.emit(null, this);
    }
}
