package p001o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/* loaded from: classes6.dex */
public final class p5g {

    /* renamed from: c */
    public static final List f39353c = m42981b();

    /* renamed from: d */
    public static final p5g f39354d = EnumC15958a.OK.toStatus();

    /* renamed from: e */
    public static final p5g f39355e = EnumC15958a.CANCELLED.toStatus();

    /* renamed from: f */
    public static final p5g f39356f = EnumC15958a.UNKNOWN.toStatus();

    /* renamed from: g */
    public static final p5g f39357g = EnumC15958a.INVALID_ARGUMENT.toStatus();

    /* renamed from: h */
    public static final p5g f39358h = EnumC15958a.DEADLINE_EXCEEDED.toStatus();

    /* renamed from: i */
    public static final p5g f39359i = EnumC15958a.NOT_FOUND.toStatus();

    /* renamed from: j */
    public static final p5g f39360j = EnumC15958a.ALREADY_EXISTS.toStatus();

    /* renamed from: k */
    public static final p5g f39361k = EnumC15958a.PERMISSION_DENIED.toStatus();

    /* renamed from: l */
    public static final p5g f39362l = EnumC15958a.UNAUTHENTICATED.toStatus();

    /* renamed from: m */
    public static final p5g f39363m = EnumC15958a.RESOURCE_EXHAUSTED.toStatus();

    /* renamed from: n */
    public static final p5g f39364n = EnumC15958a.FAILED_PRECONDITION.toStatus();

    /* renamed from: o */
    public static final p5g f39365o = EnumC15958a.ABORTED.toStatus();

    /* renamed from: p */
    public static final p5g f39366p = EnumC15958a.OUT_OF_RANGE.toStatus();

    /* renamed from: q */
    public static final p5g f39367q = EnumC15958a.UNIMPLEMENTED.toStatus();

    /* renamed from: r */
    public static final p5g f39368r = EnumC15958a.INTERNAL.toStatus();

    /* renamed from: s */
    public static final p5g f39369s = EnumC15958a.UNAVAILABLE.toStatus();

    /* renamed from: t */
    public static final p5g f39370t = EnumC15958a.DATA_LOSS.toStatus();

    /* renamed from: a */
    public final EnumC15958a f39371a;

    /* renamed from: b */
    public final String f39372b;

    /* renamed from: o.p5g$a */
    public enum EnumC15958a {
        OK(0),
        CANCELLED(1),
        UNKNOWN(2),
        INVALID_ARGUMENT(3),
        DEADLINE_EXCEEDED(4),
        NOT_FOUND(5),
        ALREADY_EXISTS(6),
        PERMISSION_DENIED(7),
        RESOURCE_EXHAUSTED(8),
        FAILED_PRECONDITION(9),
        ABORTED(10),
        OUT_OF_RANGE(11),
        UNIMPLEMENTED(12),
        INTERNAL(13),
        UNAVAILABLE(14),
        DATA_LOSS(15),
        UNAUTHENTICATED(16);

        private final int value;

        EnumC15958a(int i) {
            this.value = i;
        }

        public p5g toStatus() {
            return (p5g) p5g.f39353c.get(this.value);
        }

        public int value() {
            return this.value;
        }
    }

    public p5g(EnumC15958a enumC15958a, String str) {
        this.f39371a = (EnumC15958a) kri.m36136b(enumC15958a, "canonicalCode");
        this.f39372b = str;
    }

    /* renamed from: b */
    public static List m42981b() {
        TreeMap treeMap = new TreeMap();
        for (EnumC15958a enumC15958a : EnumC15958a.values()) {
            p5g p5gVar = (p5g) treeMap.put(Integer.valueOf(enumC15958a.value()), new p5g(enumC15958a, null));
            if (p5gVar != null) {
                throw new IllegalStateException("Code value duplication between " + p5gVar.m42982c().name() + " & " + enumC15958a.name());
            }
        }
        return Collections.unmodifiableList(new ArrayList(treeMap.values()));
    }

    /* renamed from: c */
    public EnumC15958a m42982c() {
        return this.f39371a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p5g)) {
            return false;
        }
        p5g p5gVar = (p5g) obj;
        return this.f39371a == p5gVar.f39371a && kri.m36138d(this.f39372b, p5gVar.f39372b);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f39371a, this.f39372b});
    }

    public String toString() {
        return "Status{canonicalCode=" + this.f39371a + ", description=" + this.f39372b + "}";
    }
}
