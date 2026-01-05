package b8;

import java.io.Serializable;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b8.t */
/* loaded from: classes.dex */
public final class C0625t extends AbstractC8193c {

    /* renamed from: a */
    public Object f4073a;

    /* renamed from: b */
    public Serializable f4074b;

    /* renamed from: c */
    public int f4075c;

    /* renamed from: d */
    public /* synthetic */ Object f4076d;

    /* renamed from: e */
    public final /* synthetic */ C0627v f4077e;

    /* renamed from: f */
    public int f4078f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0625t(C0627v c0627v, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f4077e = c0627v;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f4076d = obj;
        this.f4078f |= Integer.MIN_VALUE;
        return this.f4077e.m1786g(null, null, this);
    }
}
