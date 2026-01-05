package xm;

import j$.time.LocalDateTime;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class x5 extends AbstractC8193c {

    /* renamed from: a */
    public String f41018a;

    /* renamed from: b */
    public LocalDateTime f41019b;

    /* renamed from: c */
    public LocalDateTime f41020c;

    /* renamed from: d */
    public /* synthetic */ Object f41021d;

    /* renamed from: e */
    public final /* synthetic */ y5 f41022e;

    /* renamed from: f */
    public int f41023f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(y5 y5Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f41022e = y5Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f41021d = obj;
        this.f41023f |= Integer.MIN_VALUE;
        return this.f41022e.m15685D(null, null, null, this);
    }
}
