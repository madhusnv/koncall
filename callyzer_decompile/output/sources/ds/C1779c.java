package ds;

import bt.C0778w;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;

/* renamed from: ds.c */
/* loaded from: classes3.dex */
public final class C1779c extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f8653a;

    /* renamed from: b */
    public int f8654b;

    /* renamed from: c */
    public final /* synthetic */ C0778w f8655c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1779c(C0778w c0778w, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f8655c = c0778w;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f8653a = obj;
        this.f8654b |= Integer.MIN_VALUE;
        return this.f8655c.emit(null, this);
    }
}
