package ue;

import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ue.c */
/* loaded from: classes.dex */
public final class C7421c {

    /* renamed from: a */
    public final String f35229a;

    public C7421c(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f35229a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7421c)) {
            return false;
        }
        return this.f35229a.equals(((C7421c) obj).f35229a);
    }

    public final int hashCode() {
        return this.f35229a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AbstractC1452a.m4564k(new StringBuilder("Encoding{name=\""), this.f35229a, "\"}");
    }
}
