package ss;

import kotlin.jvm.internal.C4168z;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class h0 extends AbstractC8193c {

    /* renamed from: a */
    public C4168z f33438a;

    /* renamed from: b */
    public C4168z f33439b;

    /* renamed from: c */
    public /* synthetic */ Object f33440c;

    /* renamed from: d */
    public final /* synthetic */ z0 f33441d;

    /* renamed from: e */
    public int f33442e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(z0 z0Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f33441d = z0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f33440c = obj;
        this.f33442e |= Integer.MIN_VALUE;
        return this.f33441d.m13195r(this);
    }
}
