package jo;

import bt.C0778w;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;

/* renamed from: jo.e */
/* loaded from: classes3.dex */
public final class C3809e extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f19702a;

    /* renamed from: b */
    public int f19703b;

    /* renamed from: c */
    public final /* synthetic */ C0778w f19704c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3809e(C0778w c0778w, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f19704c = c0778w;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f19702a = obj;
        this.f19703b |= Integer.MIN_VALUE;
        return this.f19704c.emit(null, this);
    }
}
