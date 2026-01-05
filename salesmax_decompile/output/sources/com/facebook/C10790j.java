package com.facebook;

import android.os.Handler;
import p001o.sq8;

/* renamed from: com.facebook.j */
/* loaded from: classes5.dex */
public final class C10790j {

    /* renamed from: a */
    public final Handler f11498a;

    /* renamed from: b */
    public final GraphRequest f11499b;

    /* renamed from: c */
    public final long f11500c;

    /* renamed from: d */
    public long f11501d;

    /* renamed from: e */
    public long f11502e;

    /* renamed from: f */
    public long f11503f;

    public C10790j(Handler handler, GraphRequest graphRequest) {
        sq8.m48649h(graphRequest, "request");
        this.f11498a = handler;
        this.f11499b = graphRequest;
        this.f11500c = C10773c.m12988B();
    }

    /* renamed from: a */
    public final void m13151a(long j) {
        long j2 = this.f11501d + j;
        this.f11501d = j2;
        if (j2 >= this.f11502e + this.f11500c || j2 >= this.f11503f) {
            m13153c();
        }
    }

    /* renamed from: b */
    public final void m13152b(long j) {
        this.f11503f += j;
    }

    /* renamed from: c */
    public final void m13153c() {
        if (this.f11501d > this.f11502e) {
            this.f11499b.m12855o();
        }
    }
}
