package p001o;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes2.dex */
public final class o2b extends IOException {

    /* renamed from: a */
    public final iz4 f37550a;

    /* renamed from: b */
    public final Uri f37551b;

    /* renamed from: c */
    public final Map f37552c;

    /* renamed from: d */
    public final long f37553d;

    public o2b(iz4 iz4Var, Uri uri, Map map, long j, Throwable th) {
        super(th);
        this.f37550a = iz4Var;
        this.f37551b = uri;
        this.f37552c = map;
        this.f37553d = j;
    }
}
