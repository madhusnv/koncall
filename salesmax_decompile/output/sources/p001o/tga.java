package p001o;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class tga {

    /* renamed from: h */
    public static final AtomicLong f47098h = new AtomicLong();

    /* renamed from: a */
    public final long f47099a;

    /* renamed from: b */
    public final iz4 f47100b;

    /* renamed from: c */
    public final Uri f47101c;

    /* renamed from: d */
    public final Map f47102d;

    /* renamed from: e */
    public final long f47103e;

    /* renamed from: f */
    public final long f47104f;

    /* renamed from: g */
    public final long f47105g;

    public tga(long j, iz4 iz4Var, long j2) {
        this(j, iz4Var, iz4Var.f29380a, Collections.emptyMap(), j2, 0L, 0L);
    }

    /* renamed from: a */
    public static long m49830a() {
        return f47098h.getAndIncrement();
    }

    public tga(long j, iz4 iz4Var, Uri uri, Map map, long j2, long j3, long j4) {
        this.f47099a = j;
        this.f47100b = iz4Var;
        this.f47101c = uri;
        this.f47102d = map;
        this.f47103e = j2;
        this.f47104f = j3;
        this.f47105g = j4;
    }
}
