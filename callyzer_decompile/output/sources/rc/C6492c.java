package rc;

import pc.C5884l;
import qw.C6364n;
import sc.C6802v;
import tc.C7122g;
import vw.EnumC7794a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rc.c */
/* loaded from: classes.dex */
public final class C6492c extends AbstractC8193c {

    /* renamed from: a */
    public C6802v f31182a;

    /* renamed from: b */
    public C5884l f31183b;

    /* renamed from: c */
    public C7122g f31184c;

    /* renamed from: d */
    public int f31185d;

    /* renamed from: e */
    public /* synthetic */ Object f31186e;

    /* renamed from: f */
    public final /* synthetic */ C6493d f31187f;

    /* renamed from: g */
    public int f31188g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6492c(C6493d c6493d, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f31187f = c6493d;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f31186e = obj;
        this.f31188g |= Integer.MIN_VALUE;
        Object objM12498b = C6493d.m12498b(this.f31187f, null, null, 0, this);
        return objM12498b == EnumC7794a.COROUTINE_SUSPENDED ? objM12498b : new C6364n(objM12498b);
    }
}
