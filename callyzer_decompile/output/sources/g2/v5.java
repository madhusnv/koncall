package g2;

import m1.InterfaceC4628j;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class v5 extends AbstractC8193c {

    /* renamed from: a */
    public x5 f12987a;

    /* renamed from: b */
    public InterfaceC4628j f12988b;

    /* renamed from: c */
    public /* synthetic */ Object f12989c;

    /* renamed from: d */
    public final /* synthetic */ x5 f12990d;

    /* renamed from: e */
    public int f12991e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(x5 x5Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f12990d = x5Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f12989c = obj;
        this.f12991e |= Integer.MIN_VALUE;
        return this.f12990d.m6338a(null, this);
    }
}
