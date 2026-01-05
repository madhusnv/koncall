package wx;

import uw.InterfaceC7559c;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wx.f */
/* loaded from: classes3.dex */
public final class C8205f extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f39216a;

    /* renamed from: b */
    public final /* synthetic */ C8206g f39217b;

    /* renamed from: c */
    public int f39218c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8205f(C8206g c8206g, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f39217b = c8206g;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f39216a = obj;
        this.f39218c |= Integer.MIN_VALUE;
        return this.f39217b.emit(null, this);
    }
}
