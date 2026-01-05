package t8;

import android.net.Uri;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: t8.d */
/* loaded from: classes.dex */
public final class C7058d {

    /* renamed from: a */
    public final Uri f34124a;

    /* renamed from: b */
    public final boolean f34125b;

    public C7058d(boolean z6, Uri uri) {
        this.f34124a = uri;
        this.f34125b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C7058d.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC4154l.m8921d(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
        C7058d c7058d = (C7058d) obj;
        return AbstractC4154l.m8918a(this.f34124a, c7058d.f34124a) && this.f34125b == c7058d.f34125b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f34125b) + (this.f34124a.hashCode() * 31);
    }
}
