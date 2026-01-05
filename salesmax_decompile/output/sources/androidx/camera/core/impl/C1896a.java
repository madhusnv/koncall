package androidx.camera.core.impl;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* renamed from: androidx.camera.core.impl.a */
/* loaded from: classes2.dex */
public class C1896a {

    /* renamed from: a */
    public final boolean f6119a;

    /* renamed from: b */
    public final Set f6120b;

    /* renamed from: c */
    public final Set f6121c;

    /* renamed from: androidx.camera.core.impl.a$b */
    public static class b {

        /* renamed from: a */
        public boolean f6122a = true;

        /* renamed from: b */
        public Set f6123b;

        /* renamed from: c */
        public Set f6124c;

        /* renamed from: a */
        public C1896a m4698a() {
            return new C1896a(this.f6122a, this.f6123b, this.f6124c);
        }

        /* renamed from: b */
        public b m4699b(Set set) {
            this.f6124c = new HashSet(set);
            return this;
        }

        /* renamed from: c */
        public b m4700c(Set set) {
            this.f6123b = new HashSet(set);
            return this;
        }

        /* renamed from: d */
        public b m4701d(boolean z) {
            this.f6122a = z;
            return this;
        }
    }

    /* renamed from: b */
    public static C1896a m4696b() {
        return new b().m4701d(true).m4698a();
    }

    /* renamed from: a */
    public boolean m4697a(Class cls, boolean z) {
        if (this.f6120b.contains(cls)) {
            return true;
        }
        if (this.f6121c.contains(cls)) {
            return false;
        }
        return this.f6119a && z;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1896a)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C1896a c1896a = (C1896a) obj;
        return this.f6119a == c1896a.f6119a && Objects.equals(this.f6120b, c1896a.f6120b) && Objects.equals(this.f6121c, c1896a.f6121c);
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f6119a), this.f6120b, this.f6121c);
    }

    public String toString() {
        return "QuirkSettings{enabledWhenDeviceHasQuirk=" + this.f6119a + ", forceEnabledQuirks=" + this.f6120b + ", forceDisabledQuirks=" + this.f6121c + '}';
    }

    public C1896a(boolean z, Set set, Set set2) {
        this.f6119a = z;
        this.f6120b = set == null ? Collections.emptySet() : new HashSet(set);
        this.f6121c = set2 == null ? Collections.emptySet() : new HashSet(set2);
    }
}
