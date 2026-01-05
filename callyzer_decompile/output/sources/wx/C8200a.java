package wx;

import f9.C2222e;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;
import xx.C8513s;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wx.a */
/* loaded from: classes3.dex */
public final class C8200a extends AbstractC8193c {

    /* renamed from: a */
    public C8513s f39163a;

    /* renamed from: b */
    public /* synthetic */ Object f39164b;

    /* renamed from: c */
    public final /* synthetic */ C2222e f39165c;

    /* renamed from: d */
    public int f39166d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8200a(C2222e c2222e, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f39165c = c2222e;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f39164b = obj;
        this.f39166d |= Integer.MIN_VALUE;
        return this.f39165c.collect(null, this);
    }
}
