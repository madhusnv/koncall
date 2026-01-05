package qp;

import com.sun.mail.util.AbstractC1452a;
import i0.m0;
import j$.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import tq.EnumC7204p;
import zp.C9012l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qp.h */
/* loaded from: classes3.dex */
public final class C6271h {

    /* renamed from: a */
    public final C9012l f30426a;

    /* renamed from: b */
    public final EnumC7204p f30427b;

    /* renamed from: c */
    public final LocalDateTime f30428c;

    /* renamed from: d */
    public final LocalDateTime f30429d;

    /* renamed from: e */
    public final List f30430e;

    /* renamed from: f */
    public final boolean f30431f;

    /* renamed from: g */
    public final boolean f30432g;

    /* renamed from: h */
    public final boolean f30433h;

    public C6271h(C9012l topCaller, EnumC7204p simSelectionMode, LocalDateTime localDateTime, LocalDateTime localDateTime2, List list, boolean z6, boolean z10, boolean z11) {
        AbstractC4154l.m8923f(topCaller, "topCaller");
        AbstractC4154l.m8923f(simSelectionMode, "simSelectionMode");
        this.f30426a = topCaller;
        this.f30427b = simSelectionMode;
        this.f30428c = localDateTime;
        this.f30429d = localDateTime2;
        this.f30430e = list;
        this.f30431f = z6;
        this.f30432g = z10;
        this.f30433h = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.util.List] */
    /* renamed from: a */
    public static C6271h m12275a(C6271h c6271h, C9012l c9012l, EnumC7204p enumC7204p, LocalDateTime localDateTime, LocalDateTime localDateTime2, ArrayList arrayList, boolean z6, boolean z10, boolean z11, int i10) {
        if ((i10 & 1) != 0) {
            c9012l = c6271h.f30426a;
        }
        C9012l topCaller = c9012l;
        if ((i10 & 2) != 0) {
            enumC7204p = c6271h.f30427b;
        }
        EnumC7204p simSelectionMode = enumC7204p;
        if ((i10 & 4) != 0) {
            localDateTime = c6271h.f30428c;
        }
        LocalDateTime startDate = localDateTime;
        if ((i10 & 8) != 0) {
            localDateTime2 = c6271h.f30429d;
        }
        LocalDateTime endDate = localDateTime2;
        ArrayList arrayList2 = arrayList;
        if ((i10 & 16) != 0) {
            arrayList2 = c6271h.f30430e;
        }
        ArrayList excludeNumbers = arrayList2;
        if ((i10 & 32) != 0) {
            z6 = c6271h.f30431f;
        }
        boolean z12 = z6;
        boolean z13 = (i10 & 64) != 0 ? c6271h.f30432g : z10;
        boolean z14 = (i10 & 128) != 0 ? c6271h.f30433h : z11;
        c6271h.getClass();
        AbstractC4154l.m8923f(topCaller, "topCaller");
        AbstractC4154l.m8923f(simSelectionMode, "simSelectionMode");
        AbstractC4154l.m8923f(startDate, "startDate");
        AbstractC4154l.m8923f(endDate, "endDate");
        AbstractC4154l.m8923f(excludeNumbers, "excludeNumbers");
        return new C6271h(topCaller, simSelectionMode, startDate, endDate, excludeNumbers, z12, z13, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6271h)) {
            return false;
        }
        C6271h c6271h = (C6271h) obj;
        return AbstractC4154l.m8918a(this.f30426a, c6271h.f30426a) && this.f30427b == c6271h.f30427b && AbstractC4154l.m8918a(this.f30428c, c6271h.f30428c) && AbstractC4154l.m8918a(this.f30429d, c6271h.f30429d) && AbstractC4154l.m8918a(this.f30430e, c6271h.f30430e) && this.f30431f == c6271h.f30431f && this.f30432g == c6271h.f30432g && this.f30433h == c6271h.f30433h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f30433h) + AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4559f(this.f30430e, m0.m7370c(this.f30429d, m0.m7370c(this.f30428c, (this.f30427b.hashCode() + (this.f30426a.f43413a.hashCode() * 31)) * 31, 31), 31), 31), 31, this.f30431f), 31, this.f30432g);
    }

    public final String toString() {
        return "TopCallerState(topCaller=" + this.f30426a + ", simSelectionMode=" + this.f30427b + ", startDate=" + this.f30428c + ", endDate=" + this.f30429d + ", excludeNumbers=" + this.f30430e + ", isLoading=" + this.f30431f + ", isEmpty=" + this.f30432g + ", isExclude=" + this.f30433h + ")";
    }
}
