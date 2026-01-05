package p3;

import ww.AbstractC8191a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class e0 extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f28430a;

    /* renamed from: b */
    public final /* synthetic */ f0 f28431b;

    /* renamed from: c */
    public int f28432c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(f0 f0Var, AbstractC8191a abstractC8191a) {
        super(abstractC8191a);
        this.f28431b = f0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f28430a = obj;
        this.f28432c |= Integer.MIN_VALUE;
        return this.f28431b.m11388j(0L, null, this);
    }
}
