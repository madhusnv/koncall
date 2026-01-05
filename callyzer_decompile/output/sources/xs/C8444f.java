package xs;

import java.util.Iterator;
import java.util.List;
import ws.C8176q;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xs.f */
/* loaded from: classes3.dex */
public final class C8444f extends AbstractC8193c {

    /* renamed from: a */
    public List f41186a;

    /* renamed from: b */
    public Iterator f41187b;

    /* renamed from: c */
    public C8176q f41188c;

    /* renamed from: d */
    public Iterator f41189d;

    /* renamed from: e */
    public int f41190e;

    /* renamed from: f */
    public /* synthetic */ Object f41191f;

    /* renamed from: g */
    public final /* synthetic */ C8449k f41192g;

    /* renamed from: h */
    public int f41193h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8444f(C8449k c8449k, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f41192g = c8449k;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f41191f = obj;
        this.f41193h |= Integer.MIN_VALUE;
        return C8449k.m15749e(this.f41192g, null, this);
    }
}
