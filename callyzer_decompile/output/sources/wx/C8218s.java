package wx;

import uw.InterfaceC7559c;
import ww.AbstractC8193c;
import xx.C8513s;

/* renamed from: wx.s */
/* loaded from: classes3.dex */
public final class C8218s extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f39313a;

    /* renamed from: b */
    public int f39314b;

    /* renamed from: c */
    public final /* synthetic */ C8219t f39315c;

    /* renamed from: d */
    public C8219t f39316d;

    /* renamed from: e */
    public InterfaceC8210k f39317e;

    /* renamed from: f */
    public C8513s f39318f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8218s(C8219t c8219t, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f39315c = c8219t;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f39313a = obj;
        this.f39314b |= Integer.MIN_VALUE;
        return this.f39315c.collect(null, this);
    }
}
