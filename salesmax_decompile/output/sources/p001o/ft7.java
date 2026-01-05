package p001o;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* loaded from: classes5.dex */
public class ft7 implements ic9 {

    /* renamed from: b */
    public final vx7 f24052b;

    /* renamed from: c */
    public final URL f24053c;

    /* renamed from: d */
    public final String f24054d;

    /* renamed from: e */
    public String f24055e;

    /* renamed from: f */
    public URL f24056f;

    /* renamed from: g */
    public volatile byte[] f24057g;

    /* renamed from: h */
    public int f24058h;

    public ft7(URL url) {
        this(url, vx7.f50990b);
    }

    @Override // p001o.ic9
    /* renamed from: a */
    public void mo19806a(MessageDigest messageDigest) {
        messageDigest.update(m27461d());
    }

    /* renamed from: c */
    public String m27460c() {
        String str = this.f24054d;
        return str != null ? str : ((URL) bgd.m18886d(this.f24053c)).toString();
    }

    /* renamed from: d */
    public final byte[] m27461d() {
        if (this.f24057g == null) {
            this.f24057g = m27460c().getBytes(ic9.f28450a);
        }
        return this.f24057g;
    }

    /* renamed from: e */
    public Map m27462e() {
        return this.f24052b.getHeaders();
    }

    @Override // p001o.ic9
    public boolean equals(Object obj) {
        if (!(obj instanceof ft7)) {
            return false;
        }
        ft7 ft7Var = (ft7) obj;
        return m27460c().equals(ft7Var.m27460c()) && this.f24052b.equals(ft7Var.f24052b);
    }

    /* renamed from: f */
    public final String m27463f() {
        if (TextUtils.isEmpty(this.f24055e)) {
            String string = this.f24054d;
            if (TextUtils.isEmpty(string)) {
                string = ((URL) bgd.m18886d(this.f24053c)).toString();
            }
            this.f24055e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f24055e;
    }

    /* renamed from: g */
    public final URL m27464g() {
        if (this.f24056f == null) {
            this.f24056f = new URL(m27463f());
        }
        return this.f24056f;
    }

    /* renamed from: h */
    public URL m27465h() {
        return m27464g();
    }

    @Override // p001o.ic9
    public int hashCode() {
        if (this.f24058h == 0) {
            int iHashCode = m27460c().hashCode();
            this.f24058h = iHashCode;
            this.f24058h = (iHashCode * 31) + this.f24052b.hashCode();
        }
        return this.f24058h;
    }

    public String toString() {
        return m27460c();
    }

    public ft7(String str) {
        this(str, vx7.f50990b);
    }

    public ft7(URL url, vx7 vx7Var) {
        this.f24053c = (URL) bgd.m18886d(url);
        this.f24054d = null;
        this.f24052b = (vx7) bgd.m18886d(vx7Var);
    }

    public ft7(String str, vx7 vx7Var) {
        this.f24053c = null;
        this.f24054d = bgd.m18884b(str);
        this.f24052b = (vx7) bgd.m18886d(vx7Var);
    }
}
