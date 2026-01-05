package go;

import or.C5440c;
import tb.C7105p;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: go.c */
/* loaded from: classes3.dex */
public final class C2686c extends AbstractC8193c {

    /* renamed from: a */
    public C5440c f15012a;

    /* renamed from: b */
    public /* synthetic */ Object f15013b;

    /* renamed from: c */
    public final /* synthetic */ C7105p f15014c;

    /* renamed from: d */
    public int f15015d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2686c(C7105p c7105p, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f15014c = c7105p;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f15013b = obj;
        this.f15015d |= Integer.MIN_VALUE;
        return this.f15014c.m13383e(null, null, this);
    }
}
