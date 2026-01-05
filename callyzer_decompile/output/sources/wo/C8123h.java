package wo;

import mm.C4802m;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wo.h */
/* loaded from: classes3.dex */
public final class C8123h extends AbstractC8193c {

    /* renamed from: a */
    public C4802m f38882a;

    /* renamed from: b */
    public /* synthetic */ Object f38883b;

    /* renamed from: c */
    public final /* synthetic */ C8134s f38884c;

    /* renamed from: d */
    public int f38885d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8123h(C8134s c8134s, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f38884c = c8134s;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f38883b = obj;
        this.f38885d |= Integer.MIN_VALUE;
        return this.f38884c.m15310m(null, this);
    }
}
