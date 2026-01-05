package tt;

import aw.C0462b;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;

/* renamed from: tt.b */
/* loaded from: classes3.dex */
public final class C7219b extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f34529a;

    /* renamed from: b */
    public int f34530b;

    /* renamed from: c */
    public final /* synthetic */ C0462b f34531c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7219b(C0462b c0462b, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f34531c = c0462b;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f34529a = obj;
        this.f34530b |= Integer.MIN_VALUE;
        return this.f34531c.emit(null, this);
    }
}
