package qw;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qw.n */
/* loaded from: classes3.dex */
public final class C6364n implements Serializable {

    /* renamed from: a */
    public final Object f30758a;

    public /* synthetic */ C6364n(Object obj) {
        this.f30758a = obj;
    }

    /* renamed from: a */
    public static final Throwable m12363a(Object obj) {
        if (obj instanceof C6363m) {
            return ((C6363m) obj).f30757a;
        }
        return null;
    }

    /* renamed from: b */
    public static String m12364b(Object obj) {
        if (obj instanceof C6363m) {
            return ((C6363m) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6364n) {
            return AbstractC4154l.m8918a(this.f30758a, ((C6364n) obj).f30758a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f30758a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return m12364b(this.f30758a);
    }
}
