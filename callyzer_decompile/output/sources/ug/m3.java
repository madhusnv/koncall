package ug;

import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import jf.C3758a;
import jf.C3759b;
import zf.C8946a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class m3 extends c4 {

    /* renamed from: d */
    public final HashMap f35619d;

    /* renamed from: e */
    public final c1 f35620e;

    /* renamed from: f */
    public final c1 f35621f;

    /* renamed from: g */
    public final c1 f35622g;

    /* renamed from: h */
    public final c1 f35623h;

    /* renamed from: j */
    public final c1 f35624j;

    /* renamed from: k */
    public final c1 f35625k;

    public m3(h4 h4Var) {
        super(h4Var);
        this.f35619d = new HashMap();
        d1 d1Var = ((n1) this.f482a).f35668e;
        n1.m14083i(d1Var);
        this.f35620e = new c1(d1Var, "last_delete_stale", 0L);
        d1 d1Var2 = ((n1) this.f482a).f35668e;
        n1.m14083i(d1Var2);
        this.f35621f = new c1(d1Var2, "last_delete_stale_batch", 0L);
        d1 d1Var3 = ((n1) this.f482a).f35668e;
        n1.m14083i(d1Var3);
        this.f35622g = new c1(d1Var3, "backoff", 0L);
        d1 d1Var4 = ((n1) this.f482a).f35668e;
        n1.m14083i(d1Var4);
        this.f35623h = new c1(d1Var4, "last_upload", 0L);
        d1 d1Var5 = ((n1) this.f482a).f35668e;
        n1.m14083i(d1Var5);
        this.f35624j = new c1(d1Var5, "last_upload_attempt", 0L);
        d1 d1Var6 = ((n1) this.f482a).f35668e;
        n1.m14083i(d1Var6);
        this.f35625k = new c1(d1Var6, "midnight_offset", 0L);
    }

    /* renamed from: Q */
    public final Pair m14066Q(String str) {
        l3 l3Var;
        C3758a c3758aM8280a;
        mo325M();
        n1 n1Var = (n1) this.f482a;
        C8946a c8946a = n1Var.f35674l;
        C7436g c7436g = n1Var.f35667d;
        c8946a.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = this.f35619d;
        l3 l3Var2 = (l3) map.get(str);
        if (l3Var2 != null && jElapsedRealtime < l3Var2.f35597c) {
            return new Pair(l3Var2.f35595a, Boolean.valueOf(l3Var2.f35596b));
        }
        long jM13886T = c7436g.m13886T(str, f0.f35407b) + jElapsedRealtime;
        try {
            try {
                c3758aM8280a = C3759b.m8280a(n1Var.f35664a);
            } catch (PackageManager.NameNotFoundException unused) {
                if (l3Var2 != null && jElapsedRealtime < l3Var2.f35597c + c7436g.m13886T(str, f0.f35408c)) {
                    return new Pair(l3Var2.f35595a, Boolean.valueOf(l3Var2.f35596b));
                }
                c3758aM8280a = null;
            }
        } catch (Exception e2) {
            v0 v0Var = n1Var.f35669f;
            n1.m14085m(v0Var);
            v0Var.f35869n.m14141b(e2, "Unable to get advertising id");
            l3Var = new l3("", false, jM13886T);
        }
        if (c3758aM8280a == null) {
            return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String str2 = c3758aM8280a.f19626b;
        l3Var = str2 != null ? new l3(str2, c3758aM8280a.f19627c, jM13886T) : new l3("", c3758aM8280a.f19627c, jM13886T);
        map.put(str, l3Var);
        return new Pair(l3Var.f35595a, Boolean.valueOf(l3Var.f35596b));
    }

    /* renamed from: R */
    public final String m14067R(String str, boolean z6) throws NoSuchAlgorithmException {
        mo325M();
        String str2 = z6 ? (String) m14066Q(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest messageDigestD0 = l4.d0();
        if (messageDigestD0 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestD0.digest(str2.getBytes())));
    }

    @Override // ug.c4
    /* renamed from: P */
    public final void mo13847P() {
    }
}
