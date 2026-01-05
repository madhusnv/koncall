package b8;

import uw.InterfaceC7559c;
import ww.AbstractC8193c;
import wx.InterfaceC8210k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b8.h */
/* loaded from: classes.dex */
public final class C0613h extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f4023a;

    /* renamed from: b */
    public int f4024b;

    /* renamed from: c */
    public InterfaceC8210k f4025c;

    /* renamed from: d */
    public final /* synthetic */ C0614i f4026d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0613h(C0614i c0614i, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f4026d = c0614i;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f4023a = obj;
        this.f4024b |= Integer.MIN_VALUE;
        return this.f4026d.emit(null, this);
    }
}
