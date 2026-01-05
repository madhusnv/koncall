package eo;

import tq.EnumC7204p;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: eo.f */
/* loaded from: classes3.dex */
public final class C2080f extends AbstractC8193c {

    /* renamed from: a */
    public EnumC7204p f9733a;

    /* renamed from: b */
    public /* synthetic */ Object f9734b;

    /* renamed from: c */
    public final /* synthetic */ C2082h f9735c;

    /* renamed from: d */
    public int f9736d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2080f(C2082h c2082h, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f9735c = c2082h;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f9734b = obj;
        this.f9736d |= Integer.MIN_VALUE;
        return this.f9735c.m5797f(null, this);
    }
}
