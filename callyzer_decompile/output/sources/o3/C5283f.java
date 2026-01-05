package o3;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o3.f */
/* loaded from: classes.dex */
public final class C5283f extends AbstractC8193c {

    /* renamed from: a */
    public C5284g f25945a;

    /* renamed from: b */
    public long f25946b;

    /* renamed from: c */
    public /* synthetic */ Object f25947c;

    /* renamed from: d */
    public final /* synthetic */ C5284g f25948d;

    /* renamed from: e */
    public int f25949e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5283f(C5284g c5284g, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f25948d = c5284g;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f25947c = obj;
        this.f25949e |= Integer.MIN_VALUE;
        return this.f25948d.mo6163v(0L, this);
    }
}
