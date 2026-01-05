package wx;

import aw.C0462b;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wx.y */
/* loaded from: classes3.dex */
public final class C8224y extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f39348a;

    /* renamed from: b */
    public final /* synthetic */ C0462b f39349b;

    /* renamed from: c */
    public int f39350c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8224y(C0462b c0462b, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f39349b = c0462b;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f39348a = obj;
        this.f39350c |= Integer.MIN_VALUE;
        return this.f39349b.emit(null, this);
    }
}
