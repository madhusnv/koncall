package xx;

import g2.e4;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;
import wx.InterfaceC8209j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xx.f */
/* loaded from: classes3.dex */
public final class C8500f extends AbstractC8193c {

    /* renamed from: a */
    public e4 f41406a;

    /* renamed from: b */
    public InterfaceC8209j f41407b;

    /* renamed from: c */
    public /* synthetic */ Object f41408c;

    /* renamed from: d */
    public final /* synthetic */ e4 f41409d;

    /* renamed from: e */
    public int f41410e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8500f(e4 e4Var, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f41409d = e4Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f41408c = obj;
        this.f41410e |= Integer.MIN_VALUE;
        return this.f41409d.m6130d(null, this);
    }
}
