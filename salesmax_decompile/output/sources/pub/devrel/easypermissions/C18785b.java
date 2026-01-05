package pub.devrel.easypermissions;

import android.R;
import androidx.fragment.app.Fragment;
import java.util.Arrays;
import p001o.m3d;
import p001o.x9e;

/* renamed from: pub.devrel.easypermissions.b */
/* loaded from: classes6.dex */
public final class C18785b {

    /* renamed from: a */
    public final m3d f57978a;

    /* renamed from: b */
    public final String[] f57979b;

    /* renamed from: c */
    public final int f57980c;

    /* renamed from: d */
    public final String f57981d;

    /* renamed from: e */
    public final String f57982e;

    /* renamed from: f */
    public final String f57983f;

    /* renamed from: g */
    public final int f57984g;

    /* renamed from: pub.devrel.easypermissions.b$b */
    public static final class b {

        /* renamed from: a */
        public final m3d f57985a;

        /* renamed from: b */
        public final int f57986b;

        /* renamed from: c */
        public final String[] f57987c;

        /* renamed from: d */
        public String f57988d;

        /* renamed from: e */
        public String f57989e;

        /* renamed from: f */
        public String f57990f;

        /* renamed from: g */
        public int f57991g = -1;

        public b(Fragment fragment, int i, String... strArr) {
            this.f57985a = m3d.m38238e(fragment);
            this.f57986b = i;
            this.f57987c = strArr;
        }

        /* renamed from: a */
        public C18785b m60221a() {
            if (this.f57988d == null) {
                this.f57988d = this.f57985a.mo37853b().getString(x9e.rationale_ask);
            }
            if (this.f57989e == null) {
                this.f57989e = this.f57985a.mo37853b().getString(R.string.ok);
            }
            if (this.f57990f == null) {
                this.f57990f = this.f57985a.mo37853b().getString(R.string.cancel);
            }
            return new C18785b(this.f57985a, this.f57987c, this.f57986b, this.f57988d, this.f57989e, this.f57990f, this.f57991g);
        }

        /* renamed from: b */
        public b m60222b(String str) {
            this.f57988d = str;
            return this;
        }

        /* renamed from: c */
        public b m60223c(int i) {
            this.f57991g = i;
            return this;
        }
    }

    /* renamed from: a */
    public m3d m60214a() {
        return this.f57978a;
    }

    /* renamed from: b */
    public String m60215b() {
        return this.f57983f;
    }

    /* renamed from: c */
    public String[] m60216c() {
        return (String[]) this.f57979b.clone();
    }

    /* renamed from: d */
    public String m60217d() {
        return this.f57982e;
    }

    /* renamed from: e */
    public String m60218e() {
        return this.f57981d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18785b.class != obj.getClass()) {
            return false;
        }
        C18785b c18785b = (C18785b) obj;
        return Arrays.equals(this.f57979b, c18785b.f57979b) && this.f57980c == c18785b.f57980c;
    }

    /* renamed from: f */
    public int m60219f() {
        return this.f57980c;
    }

    /* renamed from: g */
    public int m60220g() {
        return this.f57984g;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f57979b) * 31) + this.f57980c;
    }

    public String toString() {
        return "PermissionRequest{mHelper=" + this.f57978a + ", mPerms=" + Arrays.toString(this.f57979b) + ", mRequestCode=" + this.f57980c + ", mRationale='" + this.f57981d + "', mPositiveButtonText='" + this.f57982e + "', mNegativeButtonText='" + this.f57983f + "', mTheme=" + this.f57984g + '}';
    }

    public C18785b(m3d m3dVar, String[] strArr, int i, String str, String str2, String str3, int i2) {
        this.f57978a = m3dVar;
        this.f57979b = (String[]) strArr.clone();
        this.f57980c = i;
        this.f57981d = str;
        this.f57982e = str2;
        this.f57983f = str3;
        this.f57984g = i2;
    }
}
