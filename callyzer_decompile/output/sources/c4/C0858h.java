package c4;

import com.skydoves.balloon.internals.DefinitionKt;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c4.h */
/* loaded from: classes.dex */
public final class C0858h extends AbstractC8193c {

    /* renamed from: a */
    public C0859i f5394a;

    /* renamed from: b */
    public /* synthetic */ Object f5395b;

    /* renamed from: c */
    public final /* synthetic */ C0859i f5396c;

    /* renamed from: d */
    public int f5397d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0858h(C0859i c0859i, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f5396c = c0859i;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f5395b = obj;
        this.f5397d |= Integer.MIN_VALUE;
        return this.f5396c.m2299b(DefinitionKt.NO_Float_VALUE, this);
    }
}
