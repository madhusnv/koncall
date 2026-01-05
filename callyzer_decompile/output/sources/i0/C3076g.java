package i0;

import android.hardware.camera2.CaptureRequest;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i0.g */
/* loaded from: classes.dex */
public final class C3076g {

    /* renamed from: a */
    public final String f16460a;

    /* renamed from: b */
    public final Class f16461b;

    /* renamed from: c */
    public final Object f16462c;

    public C3076g(String str, Class cls, CaptureRequest.Key key) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.f16460a = str;
        if (cls == null) {
            throw new NullPointerException("Null valueClass");
        }
        this.f16461b = cls;
        this.f16462c = key;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3076g) {
            C3076g c3076g = (C3076g) obj;
            Object obj3 = c3076g.f16462c;
            if (this.f16460a.equals(c3076g.f16460a) && this.f16461b.equals(c3076g.f16461b) && ((obj2 = this.f16462c) != null ? obj2.equals(obj3) : obj3 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f16460a.hashCode() ^ 1000003) * 1000003) ^ this.f16461b.hashCode()) * 1000003;
        Object obj = this.f16462c;
        return iHashCode ^ (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "Option{id=" + this.f16460a + ", valueClass=" + this.f16461b + ", token=" + this.f16462c + "}";
    }
}
