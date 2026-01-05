package wm;

import j$.time.LocalDateTime;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wm.a */
/* loaded from: classes3.dex */
public final class C8105a extends AbstractC8193c {

    /* renamed from: a */
    public String f38774a;

    /* renamed from: b */
    public LocalDateTime f38775b;

    /* renamed from: c */
    public /* synthetic */ Object f38776c;

    /* renamed from: d */
    public final /* synthetic */ C8114j f38777d;

    /* renamed from: e */
    public int f38778e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8105a(C8114j c8114j, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f38777d = c8114j;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f38776c = obj;
        this.f38778e |= Integer.MIN_VALUE;
        return this.f38777d.m15291f(null, null, this);
    }
}
