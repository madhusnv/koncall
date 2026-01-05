package dd;

import dy.C1855c;
import ed.EnumC2030f;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dd.d */
/* loaded from: classes.dex */
public final class C1686d extends AbstractC8193c {

    /* renamed from: a */
    public EnumC2030f f8245a;

    /* renamed from: b */
    public C1855c f8246b;

    /* renamed from: c */
    public /* synthetic */ Object f8247c;

    /* renamed from: d */
    public final /* synthetic */ C1687e f8248d;

    /* renamed from: e */
    public int f8249e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1686d(C1687e c1687e, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f8248d = c1687e;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f8247c = obj;
        this.f8249e |= Integer.MIN_VALUE;
        return this.f8248d.m5386c(null, this);
    }
}
