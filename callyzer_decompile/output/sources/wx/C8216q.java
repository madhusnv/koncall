package wx;

import uw.InterfaceC7559c;
import ww.AbstractC8193c;

/* renamed from: wx.q */
/* loaded from: classes3.dex */
public final class C8216q extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f39302a;

    /* renamed from: b */
    public int f39303b;

    /* renamed from: c */
    public final /* synthetic */ C8217r f39304c;

    /* renamed from: d */
    public Object f39305d;

    /* renamed from: e */
    public InterfaceC8210k f39306e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8216q(C8217r c8217r, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f39304c = c8217r;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f39302a = obj;
        this.f39303b |= Integer.MIN_VALUE;
        return this.f39304c.collect(null, this);
    }
}
