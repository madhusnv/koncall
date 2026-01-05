package com.facebook;

import com.facebook.C10775e;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Map;
import p001o.rme;
import p001o.sq8;

/* renamed from: com.facebook.i */
/* loaded from: classes5.dex */
public final class C10779i extends FilterOutputStream implements rme {

    /* renamed from: a */
    public final C10775e f11452a;

    /* renamed from: b */
    public final Map f11453b;

    /* renamed from: c */
    public final long f11454c;

    /* renamed from: d */
    public final long f11455d;

    /* renamed from: e */
    public long f11456e;

    /* renamed from: f */
    public long f11457f;

    /* renamed from: g */
    public C10790j f11458g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10779i(OutputStream outputStream, C10775e c10775e, Map map, long j) {
        super(outputStream);
        sq8.m48649h(outputStream, "out");
        sq8.m48649h(c10775e, "requests");
        sq8.m48649h(map, "progressMap");
        this.f11452a = c10775e;
        this.f11453b = map;
        this.f11454c = j;
        this.f11455d = C10773c.m12988B();
    }

    @Override // p001o.rme
    /* renamed from: a */
    public void mo13091a(GraphRequest graphRequest) {
        this.f11458g = graphRequest != null ? (C10790j) this.f11453b.get(graphRequest) : null;
    }

    /* renamed from: c */
    public final void m13092c(long j) {
        C10790j c10790j = this.f11458g;
        if (c10790j != null) {
            c10790j.m13151a(j);
        }
        long j2 = this.f11456e + j;
        this.f11456e = j2;
        if (j2 >= this.f11457f + this.f11455d || j2 >= this.f11454c) {
            m13093d();
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        Iterator it = this.f11453b.values().iterator();
        while (it.hasNext()) {
            ((C10790j) it.next()).m13153c();
        }
        m13093d();
    }

    /* renamed from: d */
    public final void m13093d() {
        if (this.f11456e > this.f11457f) {
            for (C10775e.a aVar : this.f11452a.m13056r()) {
            }
            this.f11457f = this.f11456e;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        sq8.m48649h(bArr, "buffer");
        ((FilterOutputStream) this).out.write(bArr);
        m13092c(bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        sq8.m48649h(bArr, "buffer");
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        m13092c(i2);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) throws IOException {
        ((FilterOutputStream) this).out.write(i);
        m13092c(1L);
    }
}
