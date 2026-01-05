package mo;

import c9.C0910e;
import java.io.Serializable;
import qw.C6364n;
import vw.EnumC7794a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mo.a */
/* loaded from: classes3.dex */
public final class C4830a extends AbstractC8193c {

    /* renamed from: a */
    public C0910e f24120a;

    /* renamed from: b */
    public /* synthetic */ Object f24121b;

    /* renamed from: c */
    public final /* synthetic */ C0910e f24122c;

    /* renamed from: d */
    public int f24123d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4830a(C0910e c0910e, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f24122c = c0910e;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f24121b = obj;
        this.f24123d |= Integer.MIN_VALUE;
        Serializable serializableM2613w = this.f24122c.m2613w(0, null, this);
        return serializableM2613w == EnumC7794a.COROUTINE_SUSPENDED ? serializableM2613w : new C6364n(serializableM2613w);
    }
}
