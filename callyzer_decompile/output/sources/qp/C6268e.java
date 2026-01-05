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
/* renamed from: qp.e */
/* loaded from: classes3.dex */
public final class C6268e {

    /* renamed from: a */
    public final C9012l f30395a;

    /* renamed from: b */
    public final EnumC7204p f30396b;

    /* renamed from: c */
    public final LocalDateTime f30397c;

    /* renamed from: d */
    public final LocalDateTime f30398d;

    /* renamed from: e */
    public final List f30399e;

    /* renamed from: f */
    public final boolean f30400f;

    /* renamed from: g */
    public final boolean f30401g;

    /* renamed from: h */
    public final boolean f30402h;

    public C6268e(C9012l c9012l, EnumC7204p simSelectionMode, LocalDateTime localDateTime, LocalDateTime localDateTime2, List excludeNumbers, boolean z6, boolean z10, boolean z11) {
        AbstractC4154l.m8923f(simSelectionMode, "simSelectionMode");
        AbstractC4154l.m8923f(excludeNumbers, "excludeNumbers");
        this.f30395a = c9012l;
        this.f30396b = simSelectionMode;
        this.f30397c = localDateTime;
        this.f30398d = localDateTime2;
        this.f30399e = excludeNumbers;
        this.f30400f = z6;
        this.f30401g = z10;
        this.f30402h = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.util.List] */
    /* renamed from: a */
    public static C6268e m12272a(C6268e c6268e, C9012l c9012l, EnumC7204p enumC7204p, LocalDateTime localDateTime, LocalDateTime localDateTime2, ArrayList arrayList, boolean z6, boolean z10, boolean z11, int i10) {
        if ((i10 & 1) != 0) {
            c9012l = c6268e.f30395a;
        }
        C9012l c9012l2 = c9012l;
        if ((i10 & 2) != 0) {
            enumC7204p = c6268e.f30396b;
        }
        EnumC7204p simSelectionMode = enumC7204p;
        if ((i10 & 4) != 0) {
            localDateTime = c6268e.f30397c;
        }
        LocalDateTime startDate = localDateTime;
        if ((i10 & 8) != 0) {
            localDateTime2 = c6268e.f30398d;
        }
        LocalDateTime endDate = localDateTime2;
        ArrayList arrayList2 = arrayList;
        if ((i10 & 16) != 0) {
            arrayList2 = c6268e.f30399e;
        }
        ArrayList excludeNumbers = arrayList2;
        if ((i10 & 32) != 0) {
            z6 = c6268e.f30400f;
        }
        boolean z12 = z6;
        boolean z13 = (i10 & 64) != 0 ? c6268e.f30401g : z10;
        boolean z14 = (i10 & 128) != 0 ? c6268e.f30402h : z11;
        c6268e.getClass();
        AbstractC4154l.m8923f(simSelectionMode, "simSelectionMode");
        AbstractC4154l.m8923f(startDate, "startDate");
        AbstractC4154l.m8923f(endDate, "endDate");
        AbstractC4154l.m8923f(excludeNumbers, "excludeNumbers");
        return new C6268e(c9012l2, simSelectionMode, startDate, endDate, excludeNumbers, z12, z13, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6268e)) {
            return false;
        }
        C6268e c6268e = (C6268e) obj;
        return AbstractC4154l.m8918a(this.f30395a, c6268e.f30395a) && this.f30396b == c6268e.f30396b && AbstractC4154l.m8918a(this.f30397c, c6268e.f30397c) && AbstractC4154l.m8918a(this.f30398d, c6268e.f30398d) && AbstractC4154l.m8918a(this.f30399e, c6268e.f30399e) && this.f30400f == c6268e.f30400f && this.f30401g == c6268e.f30401g && this.f30402h == c6268e.f30402h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f30402h) + AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4559f(this.f30399e, m0.m7370c(this.f30398d, m0.m7370c(this.f30397c, (this.f30396b.hashCode() + (this.f30395a.f43413a.hashCode() * 31)) * 31, 31), 31), 31), 31, this.f30400f), 31, this.f30401g);
    }

    public final String toString() {
        return "HighestCallState(highestCall=" + this.f30395a + ", simSelectionMode=" + this.f30396b + ", startDate=" + this.f30397c + ", endDate=" + this.f30398d + ", excludeNumbers=" + this.f30399e + ", isLoading=" + this.f30400f + ", isEmpty=" + this.f30401g + ", isExclude=" + this.f30402h + ")";
    }
}
