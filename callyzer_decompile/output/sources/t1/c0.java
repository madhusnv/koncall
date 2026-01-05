package t1;

import com.skydoves.balloon.internals.DefinitionKt;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c0 extends AbstractC8193c {

    /* renamed from: a */
    public d0 f33762a;

    /* renamed from: b */
    public /* synthetic */ Object f33763b;

    /* renamed from: c */
    public final /* synthetic */ d0 f33764c;

    /* renamed from: d */
    public int f33765d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(d0 d0Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f33764c = d0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f33763b = obj;
        this.f33765d |= Integer.MIN_VALUE;
        return this.f33764c.mo8465a(null, DefinitionKt.NO_Float_VALUE, this);
    }
}
