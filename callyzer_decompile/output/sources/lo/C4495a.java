package lo;

import l4.C4367l;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: lo.a */
/* loaded from: classes3.dex */
public final class C4495a extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f22372a;

    /* renamed from: b */
    public final /* synthetic */ C4367l f22373b;

    /* renamed from: c */
    public int f22374c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4495a(C4367l c4367l, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f22373b = c4367l;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f22372a = obj;
        this.f22374c |= Integer.MIN_VALUE;
        return this.f22373b.m9141u(this);
    }
}
