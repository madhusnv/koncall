package lp;

import j$.time.LocalDateTime;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: lp.c */
/* loaded from: classes3.dex */
public final class C4501c extends AbstractC8193c {

    /* renamed from: a */
    public Object f22390a;

    /* renamed from: b */
    public LocalDateTime f22391b;

    /* renamed from: c */
    public LocalDateTime f22392c;

    /* renamed from: d */
    public /* synthetic */ Object f22393d;

    /* renamed from: e */
    public final /* synthetic */ C4505g f22394e;

    /* renamed from: f */
    public int f22395f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4501c(C4505g c4505g, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f22394e = c4505g;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f22393d = obj;
        this.f22395f |= Integer.MIN_VALUE;
        return C4505g.m9339h(this.f22394e, this);
    }
}
