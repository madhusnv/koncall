package mn;

import java.io.Serializable;
import qw.C6364n;
import vw.EnumC7794a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mn.a */
/* loaded from: classes3.dex */
public final class C4804a extends AbstractC8193c {

    /* renamed from: a */
    public long f23920a;

    /* renamed from: b */
    public /* synthetic */ Object f23921b;

    /* renamed from: c */
    public final /* synthetic */ C4812i f23922c;

    /* renamed from: d */
    public int f23923d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4804a(C4812i c4812i, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f23922c = c4812i;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f23921b = obj;
        this.f23923d |= Integer.MIN_VALUE;
        Serializable serializableM9778a = this.f23922c.m9778a(null, null, null, null, this, false);
        return serializableM9778a == EnumC7794a.COROUTINE_SUSPENDED ? serializableM9778a : new C6364n(serializableM9778a);
    }
}
