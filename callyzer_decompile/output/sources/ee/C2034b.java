package ee;

import android.graphics.Bitmap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ee.b */
/* loaded from: classes.dex */
public final class C2034b {

    /* renamed from: a */
    public final Bitmap f9591a;

    /* renamed from: b */
    public final Map f9592b;

    public C2034b(Bitmap bitmap, Map map) {
        this.f9591a = bitmap;
        this.f9592b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2034b)) {
            return false;
        }
        C2034b c2034b = (C2034b) obj;
        return AbstractC4154l.m8918a(this.f9591a, c2034b.f9591a) && AbstractC4154l.m8918a(this.f9592b, c2034b.f9592b);
    }

    public final int hashCode() {
        return this.f9592b.hashCode() + (this.f9591a.hashCode() * 31);
    }

    public final String toString() {
        return "Value(bitmap=" + this.f9591a + ", extras=" + this.f9592b + ')';
    }
}
