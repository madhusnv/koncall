package fo;

import java.util.List;
import tq.EnumC7204p;
import wj.C8090p;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fo.v */
/* loaded from: classes3.dex */
public final class C2358v extends AbstractC8193c {

    /* renamed from: a */
    public EnumC7204p f10726a;

    /* renamed from: b */
    public List f10727b;

    /* renamed from: c */
    public /* synthetic */ Object f10728c;

    /* renamed from: d */
    public final /* synthetic */ C8090p f10729d;

    /* renamed from: e */
    public int f10730e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2358v(C8090p c8090p, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f10729d = c8090p;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f10728c = obj;
        this.f10730e |= Integer.MIN_VALUE;
        return this.f10729d.m15232I(null, this);
    }
}
