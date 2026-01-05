package sc;

import pc.C5884l;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sc.d */
/* loaded from: classes.dex */
public final class C6784d extends AbstractC8193c {

    /* renamed from: a */
    public C6802v f32271a;

    /* renamed from: b */
    public C5884l f32272b;

    /* renamed from: c */
    public C5884l f32273c;

    /* renamed from: d */
    public /* synthetic */ Object f32274d;

    /* renamed from: e */
    public final /* synthetic */ C6785e f32275e;

    /* renamed from: f */
    public int f32276f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6784d(C6785e c6785e, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f32275e = c6785e;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f32274d = obj;
        this.f32276f |= Integer.MIN_VALUE;
        return this.f32275e.m12978b(null, this);
    }
}
