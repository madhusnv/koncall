package ko;

import c9.C0908c;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ko.e */
/* loaded from: classes3.dex */
public final class C4137e extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f21115a;

    /* renamed from: b */
    public final /* synthetic */ C0908c f21116b;

    /* renamed from: c */
    public int f21117c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4137e(C0908c c0908c, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f21116b = c0908c;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f21115a = obj;
        this.f21117c |= Integer.MIN_VALUE;
        return this.f21116b.m2554G(this);
    }
}
