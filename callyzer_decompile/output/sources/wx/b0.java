package wx;

import jo.C3810f;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;

/* loaded from: classes3.dex */
public final class b0 extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f39181a;

    /* renamed from: b */
    public int f39182b;

    /* renamed from: c */
    public final /* synthetic */ C3810f f39183c;

    /* renamed from: d */
    public Object f39184d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(C3810f c3810f, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f39183c = c3810f;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f39181a = obj;
        this.f39182b |= Integer.MIN_VALUE;
        return this.f39183c.collect(null, this);
    }
}
