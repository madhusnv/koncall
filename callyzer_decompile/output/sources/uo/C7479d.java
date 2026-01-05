package uo;

import io.C3328c;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: uo.d */
/* loaded from: classes3.dex */
public final class C7479d extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f36107a;

    /* renamed from: b */
    public final /* synthetic */ C3328c f36108b;

    /* renamed from: c */
    public int f36109c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7479d(C3328c c3328c, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f36108b = c3328c;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f36107a = obj;
        this.f36109c |= Integer.MIN_VALUE;
        return this.f36108b.m7652g(null, this);
    }
}
