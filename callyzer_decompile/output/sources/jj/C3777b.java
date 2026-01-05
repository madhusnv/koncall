package jj;

import c9.C0908c;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jj.b */
/* loaded from: classes.dex */
public final class C3777b {

    /* renamed from: a */
    public final String f19684a;

    /* renamed from: b */
    public final Map f19685b;

    public C3777b(String str, Map map) {
        this.f19684a = str;
        this.f19685b = map;
    }

    /* renamed from: a */
    public static C0908c m8299a(String str) {
        return new C0908c(8, str);
    }

    /* renamed from: c */
    public static C3777b m8300c(String str) {
        return new C3777b(str, Collections.EMPTY_MAP);
    }

    /* renamed from: b */
    public final Annotation m8301b(Class cls) {
        return (Annotation) this.f19685b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3777b)) {
            return false;
        }
        C3777b c3777b = (C3777b) obj;
        return this.f19684a.equals(c3777b.f19684a) && this.f19685b.equals(c3777b.f19685b);
    }

    public final int hashCode() {
        return this.f19685b.hashCode() + (this.f19684a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f19684a + ", properties=" + this.f19685b.values() + "}";
    }
}
