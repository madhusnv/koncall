package p001o;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* loaded from: classes2.dex */
public final class mz0 {

    /* renamed from: a */
    public final C15450a f36105a;

    /* renamed from: b */
    public int f36106b;

    /* renamed from: c */
    public long f36107c;

    /* renamed from: d */
    public long f36108d;

    /* renamed from: e */
    public long f36109e;

    /* renamed from: f */
    public long f36110f;

    /* renamed from: o.mz0$a */
    public static final class C15450a {

        /* renamed from: a */
        public final AudioTrack f36111a;

        /* renamed from: b */
        public final AudioTimestamp f36112b = new AudioTimestamp();

        /* renamed from: c */
        public long f36113c;

        /* renamed from: d */
        public long f36114d;

        /* renamed from: e */
        public long f36115e;

        /* renamed from: f */
        public boolean f36116f;

        /* renamed from: g */
        public long f36117g;

        public C15450a(AudioTrack audioTrack) {
            this.f36111a = audioTrack;
        }

        /* renamed from: a */
        public void m39885a() {
            this.f36116f = true;
        }

        /* renamed from: b */
        public long m39886b() {
            return this.f36115e;
        }

        /* renamed from: c */
        public long m39887c() {
            return this.f36112b.nanoTime / 1000;
        }

        /* renamed from: d */
        public boolean m39888d() {
            boolean timestamp = this.f36111a.getTimestamp(this.f36112b);
            if (timestamp) {
                long j = this.f36112b.framePosition;
                long j2 = this.f36114d;
                if (j2 > j) {
                    if (this.f36116f) {
                        this.f36117g += j2;
                        this.f36116f = false;
                    } else {
                        this.f36113c++;
                    }
                }
                this.f36114d = j;
                this.f36115e = j + this.f36117g + (this.f36113c << 32);
            }
            return timestamp;
        }
    }

    public mz0(AudioTrack audioTrack) {
        this.f36105a = new C15450a(audioTrack);
        m39883h();
    }

    /* renamed from: a */
    public void m39876a() {
        if (this.f36106b == 4) {
            m39883h();
        }
    }

    /* renamed from: b */
    public void m39877b() {
        C15450a c15450a = this.f36105a;
        if (c15450a != null) {
            c15450a.m39885a();
        }
    }

    /* renamed from: c */
    public long m39878c() {
        C15450a c15450a = this.f36105a;
        if (c15450a != null) {
            return c15450a.m39886b();
        }
        return -1L;
    }

    /* renamed from: d */
    public long m39879d() {
        C15450a c15450a = this.f36105a;
        if (c15450a != null) {
            return c15450a.m39887c();
        }
        return -9223372036854775807L;
    }

    /* renamed from: e */
    public boolean m39880e() {
        return this.f36106b == 2;
    }

    /* renamed from: f */
    public boolean m39881f(long j) {
        C15450a c15450a = this.f36105a;
        if (c15450a == null || j - this.f36109e < this.f36108d) {
            return false;
        }
        this.f36109e = j;
        boolean zM39888d = c15450a.m39888d();
        int i = this.f36106b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (zM39888d) {
                        m39883h();
                    }
                } else if (!zM39888d) {
                    m39883h();
                }
            } else if (!zM39888d) {
                m39883h();
            } else if (this.f36105a.m39886b() > this.f36110f) {
                m39884i(2);
            }
        } else if (zM39888d) {
            if (this.f36105a.m39887c() < this.f36107c) {
                return false;
            }
            this.f36110f = this.f36105a.m39886b();
            m39884i(1);
        } else if (j - this.f36107c > 500000) {
            m39884i(3);
        }
        return zM39888d;
    }

    /* renamed from: g */
    public void m39882g() {
        m39884i(4);
    }

    /* renamed from: h */
    public void m39883h() {
        if (this.f36105a != null) {
            m39884i(0);
        }
    }

    /* renamed from: i */
    public final void m39884i(int i) {
        this.f36106b = i;
        if (i == 0) {
            this.f36109e = 0L;
            this.f36110f = -1L;
            this.f36107c = System.nanoTime() / 1000;
            this.f36108d = 10000L;
            return;
        }
        if (i == 1) {
            this.f36108d = 10000L;
            return;
        }
        if (i == 2 || i == 3) {
            this.f36108d = 10000000L;
        } else {
            if (i != 4) {
                throw new IllegalStateException();
            }
            this.f36108d = 500000L;
        }
    }
}
