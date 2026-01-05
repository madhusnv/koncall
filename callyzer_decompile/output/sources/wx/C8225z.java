package wx;

import b8.C0614i;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wx.z */
/* loaded from: classes3.dex */
public final class C8225z extends AbstractC8193c {

    /* renamed from: a */
    public C0614i f39355a;

    /* renamed from: b */
    public Object f39356b;

    /* renamed from: c */
    public /* synthetic */ Object f39357c;

    /* renamed from: d */
    public final /* synthetic */ C0614i f39358d;

    /* renamed from: e */
    public int f39359e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8225z(C0614i c0614i, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f39358d = c0614i;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f39357c = obj;
        this.f39359e |= Integer.MIN_VALUE;
        return this.f39358d.emit(null, this);
    }
}
