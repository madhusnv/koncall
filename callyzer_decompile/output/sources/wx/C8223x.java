package wx;

import uw.InterfaceC7559c;
import ww.AbstractC8193c;

/* renamed from: wx.x */
/* loaded from: classes3.dex */
public final class C8223x extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f39341a;

    /* renamed from: b */
    public int f39342b;

    /* renamed from: c */
    public final /* synthetic */ h2.f0 f39343c;

    /* renamed from: d */
    public h2.f0 f39344d;

    /* renamed from: e */
    public InterfaceC8210k f39345e;

    /* renamed from: f */
    public Throwable f39346f;

    /* renamed from: g */
    public long f39347g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8223x(h2.f0 f0Var, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f39343c = f0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f39341a = obj;
        this.f39342b |= Integer.MIN_VALUE;
        return this.f39343c.collect(null, this);
    }
}
