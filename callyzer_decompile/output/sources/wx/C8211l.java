package wx;

import f9.C2222e;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;

/* renamed from: wx.l */
/* loaded from: classes3.dex */
public final class C8211l extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f39245a;

    /* renamed from: b */
    public int f39246b;

    /* renamed from: c */
    public final /* synthetic */ C2222e f39247c;

    /* renamed from: d */
    public C2222e f39248d;

    /* renamed from: e */
    public InterfaceC8210k f39249e;

    /* renamed from: f */
    public int f39250f;

    /* renamed from: g */
    public int f39251g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8211l(C2222e c2222e, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f39247c = c2222e;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f39245a = obj;
        this.f39246b |= Integer.MIN_VALUE;
        return this.f39247c.collect(null, this);
    }
}
