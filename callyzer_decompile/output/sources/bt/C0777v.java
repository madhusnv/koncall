package bt;

import uw.InterfaceC7559c;
import ww.AbstractC8193c;

/* renamed from: bt.v */
/* loaded from: classes3.dex */
public final class C0777v extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f4935a;

    /* renamed from: b */
    public int f4936b;

    /* renamed from: c */
    public final /* synthetic */ C0778w f4937c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0777v(C0778w c0778w, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f4937c = c0778w;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f4935a = obj;
        this.f4936b |= Integer.MIN_VALUE;
        return this.f4937c.emit(null, this);
    }
}
