package lo;

import k4.C4001v;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: lo.d */
/* loaded from: classes3.dex */
public final class C4498d extends AbstractC8193c {

    /* renamed from: a */
    public String f22381a;

    /* renamed from: b */
    public /* synthetic */ Object f22382b;

    /* renamed from: c */
    public final /* synthetic */ C4001v f22383c;

    /* renamed from: d */
    public int f22384d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4498d(C4001v c4001v, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f22383c = c4001v;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f22382b = obj;
        this.f22384d |= Integer.MIN_VALUE;
        return this.f22383c.m8781v(null, this);
    }
}
