package xv;

import android.database.Cursor;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xv.n */
/* loaded from: classes3.dex */
public final class C8487n extends AbstractC8193c {

    /* renamed from: a */
    public Cursor f41333a;

    /* renamed from: b */
    public int f41334b;

    /* renamed from: c */
    public long f41335c;

    /* renamed from: d */
    public /* synthetic */ Object f41336d;

    /* renamed from: e */
    public final /* synthetic */ C8489p f41337e;

    /* renamed from: f */
    public int f41338f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8487n(C8489p c8489p, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f41337e = c8489p;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f41336d = obj;
        this.f41338f |= Integer.MIN_VALUE;
        return C8489p.m15781j(this.f41337e, this);
    }
}
