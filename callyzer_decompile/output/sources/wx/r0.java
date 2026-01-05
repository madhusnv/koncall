package wx;

import bt.C0778w;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;

/* loaded from: classes3.dex */
public final class r0 extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f39310a;

    /* renamed from: b */
    public int f39311b;

    /* renamed from: c */
    public final /* synthetic */ C0778w f39312c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(C0778w c0778w, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f39312c = c0778w;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f39310a = obj;
        this.f39311b |= Integer.MIN_VALUE;
        return this.f39312c.emit(null, this);
    }
}
