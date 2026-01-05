package p001o;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes5.dex */
public class tma implements mi1 {

    /* renamed from: k */
    public static final Bitmap.Config f47424k = Bitmap.Config.ARGB_8888;

    /* renamed from: a */
    public final ana f47425a;

    /* renamed from: b */
    public final Set f47426b;

    /* renamed from: c */
    public final long f47427c;

    /* renamed from: d */
    public final InterfaceC17159a f47428d;

    /* renamed from: e */
    public long f47429e;

    /* renamed from: f */
    public long f47430f;

    /* renamed from: g */
    public int f47431g;

    /* renamed from: h */
    public int f47432h;

    /* renamed from: i */
    public int f47433i;

    /* renamed from: j */
    public int f47434j;

    /* renamed from: o.tma$a */
    public interface InterfaceC17159a {
        /* renamed from: a */
        void mo50197a(Bitmap bitmap);

        /* renamed from: b */
        void mo50198b(Bitmap bitmap);
    }

    /* renamed from: o.tma$b */
    public static final class C17160b implements InterfaceC17159a {
        @Override // p001o.tma.InterfaceC17159a
        /* renamed from: a */
        public void mo50197a(Bitmap bitmap) {
        }

        @Override // p001o.tma.InterfaceC17159a
        /* renamed from: b */
        public void mo50198b(Bitmap bitmap) {
        }
    }

    public tma(long j, ana anaVar, Set set) {
        this.f47427c = j;
        this.f47429e = j;
        this.f47425a = anaVar;
        this.f47426b = set;
        this.f47428d = new C17160b();
    }

    /* renamed from: f */
    public static void m50185f(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    /* renamed from: g */
    public static Bitmap m50186g(int i, int i2, Bitmap.Config config) {
        if (config == null) {
            config = f47424k;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    /* renamed from: k */
    public static Set m50187k() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: l */
    public static ana m50188l() {
        return new ivf();
    }

    /* renamed from: o */
    public static void m50189o(Bitmap bitmap) {
        new String(1);
    }

    /* renamed from: p */
    public static void m50190p(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        m50189o(bitmap);
    }

    @Override // p001o.mi1
    /* renamed from: a */
    public void mo39087a(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("trimMemory, level=");
            sb.append(i);
        }
        if (i >= 40 || i >= 20) {
            mo39088b();
        } else if (i >= 20 || i == 15) {
            m50196q(m50195n() / 2);
        }
    }

    @Override // p001o.mi1
    /* renamed from: b */
    public void mo39088b() {
        m50196q(0L);
    }

    @Override // p001o.mi1
    /* renamed from: c */
    public synchronized void mo38104c(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && this.f47425a.mo17518f(bitmap) <= this.f47429e && this.f47426b.contains(bitmap.getConfig())) {
                int iMo17518f = this.f47425a.mo17518f(bitmap);
                this.f47425a.mo17515c(bitmap);
                this.f47428d.mo50198b(bitmap);
                this.f47433i++;
                this.f47430f += iMo17518f;
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Put bitmap in pool=");
                    sb.append(this.f47425a.mo17513a(bitmap));
                }
                m50191h();
                m50193j();
                return;
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Reject bitmap from pool, bitmap: ");
                sb2.append(this.f47425a.mo17513a(bitmap));
                sb2.append(", is mutable: ");
                sb2.append(bitmap.isMutable());
                sb2.append(", is allowed config: ");
                sb2.append(this.f47426b.contains(bitmap.getConfig()));
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p001o.mi1
    /* renamed from: d */
    public Bitmap mo39089d(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapM50194m = m50194m(i, i2, config);
        if (bitmapM50194m == null) {
            return m50186g(i, i2, config);
        }
        bitmapM50194m.eraseColor(0);
        return bitmapM50194m;
    }

    @Override // p001o.mi1
    /* renamed from: e */
    public Bitmap mo39090e(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapM50194m = m50194m(i, i2, config);
        return bitmapM50194m == null ? m50186g(i, i2, config) : bitmapM50194m;
    }

    /* renamed from: h */
    public final void m50191h() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            m50192i();
        }
    }

    /* renamed from: i */
    public final void m50192i() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hits=");
        sb.append(this.f47431g);
        sb.append(", misses=");
        sb.append(this.f47432h);
        sb.append(", puts=");
        sb.append(this.f47433i);
        sb.append(", evictions=");
        sb.append(this.f47434j);
        sb.append(", currentSize=");
        sb.append(this.f47430f);
        sb.append(", maxSize=");
        sb.append(this.f47429e);
        sb.append("\nStrategy=");
        sb.append(this.f47425a);
    }

    /* renamed from: j */
    public final void m50193j() {
        m50196q(this.f47429e);
    }

    /* renamed from: m */
    public final synchronized Bitmap m50194m(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapMo17516d;
        m50185f(config);
        bitmapMo17516d = this.f47425a.mo17516d(i, i2, config != null ? config : f47424k);
        if (bitmapMo17516d == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Missing bitmap=");
                sb.append(this.f47425a.mo17517e(i, i2, config));
            }
            this.f47432h++;
        } else {
            this.f47431g++;
            this.f47430f -= this.f47425a.mo17518f(bitmapMo17516d);
            this.f47428d.mo50197a(bitmapMo17516d);
            m50190p(bitmapMo17516d);
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Get bitmap=");
            sb2.append(this.f47425a.mo17517e(i, i2, config));
        }
        m50191h();
        return bitmapMo17516d;
    }

    /* renamed from: n */
    public long m50195n() {
        return this.f47429e;
    }

    /* renamed from: q */
    public final synchronized void m50196q(long j) {
        while (this.f47430f > j) {
            Bitmap bitmapMo17514b = this.f47425a.mo17514b();
            if (bitmapMo17514b == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    m50192i();
                }
                this.f47430f = 0L;
                return;
            }
            this.f47428d.mo50197a(bitmapMo17514b);
            this.f47430f -= this.f47425a.mo17518f(bitmapMo17514b);
            this.f47434j++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Evicting bitmap=");
                sb.append(this.f47425a.mo17513a(bitmapMo17514b));
            }
            m50191h();
            bitmapMo17514b.recycle();
        }
    }

    public tma(long j) {
        this(j, m50188l(), m50187k());
    }
}
