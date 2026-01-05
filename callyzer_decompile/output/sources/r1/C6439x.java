package r1;

import i1.y0;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: r1.x */
/* loaded from: classes.dex */
public final class C6439x extends AbstractC8193c {

    /* renamed from: a */
    public C6440y f31067a;

    /* renamed from: b */
    public y0 f31068b;

    /* renamed from: c */
    public AbstractC8199i f31069c;

    /* renamed from: d */
    public /* synthetic */ Object f31070d;

    /* renamed from: e */
    public final /* synthetic */ C6440y f31071e;

    /* renamed from: f */
    public int f31072f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6439x(C6440y c6440y, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f31071e = c6440y;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f31070d = obj;
        this.f31072f |= Integer.MIN_VALUE;
        return this.f31071e.mo7521b(null, null, this);
    }
}
