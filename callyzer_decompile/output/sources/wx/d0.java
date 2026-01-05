package wx;

import uw.InterfaceC7559c;
import ww.AbstractC8193c;

/* loaded from: classes3.dex */
public final class d0 extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f39203a;

    /* renamed from: b */
    public int f39204b;

    /* renamed from: c */
    public final /* synthetic */ C8219t f39205c;

    /* renamed from: d */
    public f0 f39206d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(C8219t c8219t, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f39205c = c8219t;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f39203a = obj;
        this.f39204b |= Integer.MIN_VALUE;
        return this.f39205c.collect(null, this);
    }
}
