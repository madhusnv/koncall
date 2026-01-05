package ko;

import java.util.Iterator;
import kotlin.jvm.internal.C4166x;
import mm.C4791b;
import wj.C8090p;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ko.b */
/* loaded from: classes3.dex */
public final class C4134b extends AbstractC8193c {

    /* renamed from: a */
    public C4166x f21099a;

    /* renamed from: b */
    public Iterator f21100b;

    /* renamed from: c */
    public C4791b f21101c;

    /* renamed from: d */
    public /* synthetic */ Object f21102d;

    /* renamed from: e */
    public final /* synthetic */ C8090p f21103e;

    /* renamed from: f */
    public int f21104f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4134b(C8090p c8090p, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f21103e = c8090p;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f21102d = obj;
        this.f21104f |= Integer.MIN_VALUE;
        return this.f21103e.m15256j(this);
    }
}
