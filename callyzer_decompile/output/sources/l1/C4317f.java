package l1;

import com.skydoves.balloon.internals.DefinitionKt;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l1.f */
/* loaded from: classes.dex */
public final class C4317f extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f21757a;

    /* renamed from: b */
    public final /* synthetic */ C4319h f21758b;

    /* renamed from: c */
    public int f21759c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4317f(C4319h c4319h, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f21758b = c4319h;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f21757a = obj;
        this.f21759c |= Integer.MIN_VALUE;
        return this.f21758b.m9040d(null, DefinitionKt.NO_Float_VALUE, null, this);
    }
}
