package go;

import java.util.List;
import tb.C7105p;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: go.a */
/* loaded from: classes3.dex */
public final class C2684a extends AbstractC8193c {

    /* renamed from: a */
    public List f14999a;

    /* renamed from: b */
    public /* synthetic */ Object f15000b;

    /* renamed from: c */
    public final /* synthetic */ C7105p f15001c;

    /* renamed from: d */
    public int f15002d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2684a(C7105p c7105p, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f15001c = c7105p;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f15000b = obj;
        this.f15002d |= Integer.MIN_VALUE;
        return this.f15001c.m13381c(null, null, this);
    }
}
