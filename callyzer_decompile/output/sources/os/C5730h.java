package os;

import tq.EnumC7204p;
import ts.C7217d;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: os.h */
/* loaded from: classes3.dex */
public final class C5730h extends AbstractC8193c {

    /* renamed from: a */
    public EnumC7204p f28239a;

    /* renamed from: b */
    public C7217d f28240b;

    /* renamed from: c */
    public /* synthetic */ Object f28241c;

    /* renamed from: d */
    public final /* synthetic */ C5731i f28242d;

    /* renamed from: e */
    public int f28243e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5730h(C5731i c5731i, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f28242d = c5731i;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f28241c = obj;
        this.f28243e |= Integer.MIN_VALUE;
        return C5731i.m11282f(this.f28242d, this);
    }
}
