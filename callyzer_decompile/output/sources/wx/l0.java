package wx;

import aw.C0462b;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;

/* loaded from: classes3.dex */
public final class l0 extends AbstractC8193c {

    /* renamed from: a */
    public C0462b f39252a;

    /* renamed from: b */
    public /* synthetic */ Object f39253b;

    /* renamed from: c */
    public int f39254c;

    /* renamed from: d */
    public final /* synthetic */ C0462b f39255d;

    /* renamed from: e */
    public Object f39256e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(C0462b c0462b, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f39255d = c0462b;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f39253b = obj;
        this.f39254c |= Integer.MIN_VALUE;
        return this.f39255d.emit(null, this);
    }
}
