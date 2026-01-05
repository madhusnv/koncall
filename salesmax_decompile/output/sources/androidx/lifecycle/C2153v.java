package androidx.lifecycle;

import androidx.lifecycle.AbstractC2139h;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.io.Closeable;
import p001o.f1f;
import p001o.sq8;
import p001o.xca;

/* renamed from: androidx.lifecycle.v */
/* loaded from: classes2.dex */
public final class C2153v implements InterfaceC2142k, Closeable {

    /* renamed from: a */
    public final String f7759a;

    /* renamed from: b */
    public final C2151t f7760b;

    /* renamed from: c */
    public boolean f7761c;

    public C2153v(String str, C2151t c2151t) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        sq8.m48649h(c2151t, "handle");
        this.f7759a = str;
        this.f7760b = c2151t;
    }

    /* renamed from: a */
    public final void m6593a(f1f f1fVar, AbstractC2139h abstractC2139h) {
        sq8.m48649h(f1fVar, "registry");
        sq8.m48649h(abstractC2139h, "lifecycle");
        if (!(!this.f7761c)) {
            throw new IllegalStateException("Already attached to lifecycleOwner".toString());
        }
        this.f7761c = true;
        abstractC2139h.mo6521a(this);
        f1fVar.m25946h(this.f7759a, this.f7760b.m6588h());
    }

    /* renamed from: c */
    public final C2151t m6594c() {
        return this.f7760b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    /* renamed from: d */
    public final boolean m6595d() {
        return this.f7761c;
    }

    @Override // androidx.lifecycle.InterfaceC2142k
    /* renamed from: o */
    public void mo3717o(xca xcaVar, AbstractC2139h.a aVar) {
        sq8.m48649h(xcaVar, "source");
        sq8.m48649h(aVar, "event");
        if (aVar == AbstractC2139h.a.ON_DESTROY) {
            this.f7761c = false;
            xcaVar.getLifecycle().mo6524d(this);
        }
    }
}
