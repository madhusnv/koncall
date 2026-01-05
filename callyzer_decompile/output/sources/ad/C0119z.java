package ad;

import kotlin.jvm.internal.AbstractC4154l;
import sd.C6808b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ad.z */
/* loaded from: classes.dex */
public final class C0119z {

    /* renamed from: c */
    public static final /* synthetic */ int f395c = 0;

    /* renamed from: a */
    public final C6808b f396a;

    /* renamed from: b */
    public final C6808b f397b;

    static {
        C6808b c6808b = C6808b.f32347f;
        new C0119z(c6808b, c6808b);
    }

    public C0119z(C6808b c6808b, C6808b c6808b2) {
        this.f396a = c6808b;
        this.f397b = c6808b2;
        if (!c6808b2.f32351d && !c6808b.f32352e) {
            throw new IllegalArgumentException("Cannot have a password without a user name");
        }
        boolean z6 = c6808b.f32351d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0119z.class != obj.getClass()) {
            return false;
        }
        C0119z c0119z = (C0119z) obj;
        return AbstractC4154l.m8918a(this.f396a, c0119z.f396a) && AbstractC4154l.m8918a(this.f397b, c0119z.f397b);
    }

    public final int hashCode() {
        return this.f397b.hashCode() + (this.f396a.hashCode() * 31);
    }

    public final String toString() {
        C6808b c6808b = this.f396a;
        if (c6808b.f32351d) {
            return "";
        }
        C6808b c6808b2 = this.f397b;
        if (c6808b2.f32351d) {
            return c6808b.f32349b;
        }
        return c6808b.f32349b + ':' + c6808b2.f32349b;
    }
}
