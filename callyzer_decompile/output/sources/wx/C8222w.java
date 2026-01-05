package wx;

import uw.InterfaceC7559c;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wx.w */
/* loaded from: classes3.dex */
public final class C8222w extends AbstractC8193c {

    /* renamed from: a */
    public C8206g f39336a;

    /* renamed from: b */
    public /* synthetic */ Object f39337b;

    /* renamed from: c */
    public final /* synthetic */ C8206g f39338c;

    /* renamed from: d */
    public int f39339d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8222w(C8206g c8206g, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f39338c = c8206g;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f39337b = obj;
        this.f39339d |= Integer.MIN_VALUE;
        return this.f39338c.emit(null, this);
    }
}
