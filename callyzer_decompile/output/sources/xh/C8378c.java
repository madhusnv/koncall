package xh;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xh.c */
/* loaded from: classes.dex */
public final class C8378c extends AbstractC8377b {

    /* renamed from: a */
    public final Object f40050a;

    public C8378c(Object obj) {
        this.f40050a = obj;
    }

    @Override // xh.AbstractC8377b
    /* renamed from: a */
    public final Object mo15548a() {
        return this.f40050a;
    }

    @Override // xh.AbstractC8377b
    /* renamed from: b */
    public final boolean mo15549b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8378c) {
            return this.f40050a.equals(((C8378c) obj).f40050a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f40050a.hashCode() + 1502476572;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f40050a);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 13);
        sb2.append("Optional.of(");
        sb2.append(strValueOf);
        sb2.append(")");
        return sb2.toString();
    }
}
