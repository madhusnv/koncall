package ln;

import android.database.Cursor;
import c4.C0861k;
import j$.time.LocalDateTime;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ln.a */
/* loaded from: classes3.dex */
public final class C4488a extends AbstractC8193c {

    /* renamed from: a */
    public Cursor f22328a;

    /* renamed from: b */
    public String f22329b;

    /* renamed from: c */
    public String f22330c;

    /* renamed from: d */
    public LocalDateTime f22331d;

    /* renamed from: e */
    public /* synthetic */ Object f22332e;

    /* renamed from: f */
    public final /* synthetic */ C0861k f22333f;

    /* renamed from: g */
    public int f22334g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4488a(C0861k c0861k, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f22333f = c0861k;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f22332e = obj;
        this.f22334g |= Integer.MIN_VALUE;
        return this.f22333f.m2309g(null, this);
    }
}
