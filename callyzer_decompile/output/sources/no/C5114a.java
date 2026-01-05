package no;

import mm.C4791b;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: no.a */
/* loaded from: classes3.dex */
public final class C5114a extends AbstractC8193c {

    /* renamed from: a */
    public C4791b f25033a;

    /* renamed from: b */
    public /* synthetic */ Object f25034b;

    /* renamed from: c */
    public final /* synthetic */ C5122i f25035c;

    /* renamed from: d */
    public int f25036d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5114a(C5122i c5122i, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f25035c = c5122i;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f25034b = obj;
        this.f25036d |= Integer.MIN_VALUE;
        return this.f25035c.m10046b(null, this);
    }
}
