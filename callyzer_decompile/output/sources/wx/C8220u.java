package wx;

import uw.InterfaceC7559c;
import ww.AbstractC8193c;

/* renamed from: wx.u */
/* loaded from: classes3.dex */
public final class C8220u extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f39327a;

    /* renamed from: b */
    public int f39328b;

    /* renamed from: c */
    public final /* synthetic */ C8219t f39329c;

    /* renamed from: d */
    public C8219t f39330d;

    /* renamed from: e */
    public InterfaceC8210k f39331e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8220u(C8219t c8219t, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f39329c = c8219t;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f39327a = obj;
        this.f39328b |= Integer.MIN_VALUE;
        return this.f39329c.collect(null, this);
    }
}
