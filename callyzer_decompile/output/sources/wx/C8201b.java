package wx;

import vx.InterfaceC7819u;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wx.b */
/* loaded from: classes3.dex */
public final class C8201b extends AbstractC8193c {

    /* renamed from: a */
    public InterfaceC7819u f39177a;

    /* renamed from: b */
    public /* synthetic */ Object f39178b;

    /* renamed from: c */
    public final /* synthetic */ C8202c f39179c;

    /* renamed from: d */
    public int f39180d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8201b(C8202c c8202c, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f39179c = c8202c;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f39178b = obj;
        this.f39180d |= Integer.MIN_VALUE;
        return this.f39179c.mo15368e(null, this);
    }
}
