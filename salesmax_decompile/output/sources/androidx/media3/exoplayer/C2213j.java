package androidx.media3.exoplayer;

import p001o.op0;
import p001o.r6c;

/* renamed from: androidx.media3.exoplayer.j */
/* loaded from: classes2.dex */
public final class C2213j {

    /* renamed from: a */
    public final long f8421a;

    /* renamed from: b */
    public final float f8422b;

    /* renamed from: c */
    public final long f8423c;

    /* renamed from: androidx.media3.exoplayer.j$b */
    public static final class b {

        /* renamed from: a */
        public long f8424a;

        /* renamed from: b */
        public float f8425b;

        /* renamed from: c */
        public long f8426c;

        /* renamed from: d */
        public C2213j m7271d() {
            return new C2213j(this);
        }

        /* renamed from: e */
        public b m7272e(long j) {
            op0.m42511a(j >= 0 || j == -9223372036854775807L);
            this.f8426c = j;
            return this;
        }

        /* renamed from: f */
        public b m7273f(long j) {
            this.f8424a = j;
            return this;
        }

        /* renamed from: g */
        public b m7274g(float f) {
            op0.m42511a(f > 0.0f || f == -3.4028235E38f);
            this.f8425b = f;
            return this;
        }

        public b() {
            this.f8424a = -9223372036854775807L;
            this.f8425b = -3.4028235E38f;
            this.f8426c = -9223372036854775807L;
        }

        public b(C2213j c2213j) {
            this.f8424a = c2213j.f8421a;
            this.f8425b = c2213j.f8422b;
            this.f8426c = c2213j.f8423c;
        }
    }

    /* renamed from: a */
    public b m7267a() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2213j)) {
            return false;
        }
        C2213j c2213j = (C2213j) obj;
        return this.f8421a == c2213j.f8421a && this.f8422b == c2213j.f8422b && this.f8423c == c2213j.f8423c;
    }

    public int hashCode() {
        return r6c.m46256b(Long.valueOf(this.f8421a), Float.valueOf(this.f8422b), Long.valueOf(this.f8423c));
    }

    public C2213j(b bVar) {
        this.f8421a = bVar.f8424a;
        this.f8422b = bVar.f8425b;
        this.f8423c = bVar.f8426c;
    }
}
