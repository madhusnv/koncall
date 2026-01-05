package go;

import tb.C7105p;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: go.e */
/* loaded from: classes3.dex */
public final class C2688e extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f15020a;

    /* renamed from: b */
    public final /* synthetic */ C7105p f15021b;

    /* renamed from: c */
    public int f15022c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2688e(C7105p c7105p, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f15021b = c7105p;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f15020a = obj;
        this.f15022c |= Integer.MIN_VALUE;
        return this.f15021b.m13386j(null, this);
    }
}
