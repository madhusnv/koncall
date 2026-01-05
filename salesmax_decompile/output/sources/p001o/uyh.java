package p001o;

import java.util.Objects;

/* loaded from: classes6.dex */
public interface uyh {
    /* renamed from: a */
    static int m52167a(Object obj, Object obj2) {
        return ((m52168c(obj) + 31) * 31) + m52168c(obj2);
    }

    /* renamed from: c */
    static int m52168c(Object obj) {
        return Objects.hashCode(obj);
    }

    /* renamed from: d */
    static int m52169d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return ((((((((m52168c(obj) + 31) * 31) + m52168c(obj2)) * 31) + m52168c(obj3)) * 31) + m52168c(obj4)) * 31) + m52168c(obj5);
    }

    /* renamed from: e */
    static int m52170e(Object obj, Object obj2, Object obj3) {
        return ((((m52168c(obj) + 31) * 31) + m52168c(obj2)) * 31) + m52168c(obj3);
    }

    static ryh of(Object obj, Object obj2) {
        return new ryh(obj, obj2);
    }

    static syh of(Object obj, Object obj2, Object obj3) {
        return new syh(obj, obj2, obj3);
    }

    static tyh of(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return new tyh(obj, obj2, obj3, obj4, obj5);
    }
}
