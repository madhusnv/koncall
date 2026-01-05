package xm;

import aw.C0462b;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;

/* loaded from: classes3.dex */
public final class n5 extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f40631a;

    /* renamed from: b */
    public int f40632b;

    /* renamed from: c */
    public final /* synthetic */ C0462b f40633c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(C0462b c0462b, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f40633c = c0462b;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f40631a = obj;
        this.f40632b |= Integer.MIN_VALUE;
        return this.f40633c.emit(null, this);
    }
}
