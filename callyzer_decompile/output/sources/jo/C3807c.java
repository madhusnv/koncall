package jo;

import cj.C0979e;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jo.c */
/* loaded from: classes3.dex */
public final class C3807c extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f19696a;

    /* renamed from: b */
    public final /* synthetic */ C0979e f19697b;

    /* renamed from: c */
    public int f19698c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3807c(C0979e c0979e, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f19697b = c0979e;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f19696a = obj;
        this.f19698c |= Integer.MIN_VALUE;
        return this.f19697b.m2774h(this);
    }
}
