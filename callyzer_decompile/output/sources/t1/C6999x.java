package t1;

import i1.y0;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: t1.x */
/* loaded from: classes.dex */
public final class C6999x extends AbstractC8193c {

    /* renamed from: a */
    public AbstractC7000y f33885a;

    /* renamed from: b */
    public y0 f33886b;

    /* renamed from: c */
    public AbstractC8199i f33887c;

    /* renamed from: d */
    public /* synthetic */ Object f33888d;

    /* renamed from: e */
    public final /* synthetic */ AbstractC7000y f33889e;

    /* renamed from: f */
    public int f33890f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6999x(AbstractC7000y abstractC7000y, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f33889e = abstractC7000y;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f33888d = obj;
        this.f33890f |= Integer.MIN_VALUE;
        return AbstractC7000y.m13258r(this.f33889e, null, null, this);
    }
}
