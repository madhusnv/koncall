package qp;

import com.sun.mail.util.AbstractC1452a;
import i0.m0;
import j$.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import tq.EnumC7204p;
import zp.C9003c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qp.b */
/* loaded from: classes3.dex */
public final class C6265b {

    /* renamed from: a */
    public final C9003c f30366a;

    /* renamed from: b */
    public final LocalDateTime f30367b;

    /* renamed from: c */
    public final EnumC7204p f30368c;

    /* renamed from: d */
    public final LocalDateTime f30369d;

    /* renamed from: e */
    public final List f30370e;

    /* renamed from: f */
    public final boolean f30371f;

    /* renamed from: g */
    public final boolean f30372g;

    /* renamed from: h */
    public final boolean f30373h;

    public C6265b(C9003c c9003c, LocalDateTime localDateTime, EnumC7204p simSelectionMode, LocalDateTime localDateTime2, List excludeNumbers, boolean z6, boolean z10, boolean z11) {
        AbstractC4154l.m8923f(simSelectionMode, "simSelectionMode");
        AbstractC4154l.m8923f(excludeNumbers, "excludeNumbers");
        this.f30366a = c9003c;
        this.f30367b = localDateTime;
        this.f30368c = simSelectionMode;
        this.f30369d = localDateTime2;
        this.f30370e = excludeNumbers;
        this.f30371f = z6;
        this.f30372g = z10;
        this.f30373h = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.util.List] */
    /* renamed from: a */
    public static C6265b m12270a(C6265b c6265b, C9003c c9003c, LocalDateTime localDateTime, EnumC7204p enumC7204p, LocalDateTime localDateTime2, ArrayList arrayList, boolean z6, boolean z10, int i10) {
        if ((i10 & 1) != 0) {
            c9003c = c6265b.f30366a;
        }
        C9003c averageCallDuration = c9003c;
        if ((i10 & 2) != 0) {
            localDateTime = c6265b.f30367b;
        }
        LocalDateTime startDate = localDateTime;
        if ((i10 & 4) != 0) {
            enumC7204p = c6265b.f30368c;
        }
        EnumC7204p simSelectionMode = enumC7204p;
        if ((i10 & 8) != 0) {
            localDateTime2 = c6265b.f30369d;
        }
        LocalDateTime endDate = localDateTime2;
        ArrayList arrayList2 = arrayList;
        if ((i10 & 16) != 0) {
            arrayList2 = c6265b.f30370e;
        }
        ArrayList excludeNumbers = arrayList2;
        if ((i10 & 32) != 0) {
            z6 = c6265b.f30371f;
        }
        boolean z11 = z6;
        boolean z12 = (i10 & 64) != 0 ? c6265b.f30372g : false;
        boolean z13 = (i10 & 128) != 0 ? c6265b.f30373h : z10;
        c6265b.getClass();
        AbstractC4154l.m8923f(averageCallDuration, "averageCallDuration");
        AbstractC4154l.m8923f(startDate, "startDate");
        AbstractC4154l.m8923f(simSelectionMode, "simSelectionMode");
        AbstractC4154l.m8923f(endDate, "endDate");
        AbstractC4154l.m8923f(excludeNumbers, "excludeNumbers");
        return new C6265b(averageCallDuration, startDate, simSelectionMode, endDate, excludeNumbers, z11, z12, z13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6265b)) {
            return false;
        }
        C6265b c6265b = (C6265b) obj;
        return AbstractC4154l.m8918a(this.f30366a, c6265b.f30366a) && AbstractC4154l.m8918a(this.f30367b, c6265b.f30367b) && this.f30368c == c6265b.f30368c && AbstractC4154l.m8918a(this.f30369d, c6265b.f30369d) && AbstractC4154l.m8918a(this.f30370e, c6265b.f30370e) && this.f30371f == c6265b.f30371f && this.f30372g == c6265b.f30372g && this.f30373h == c6265b.f30373h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f30373h) + AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4559f(this.f30370e, m0.m7370c(this.f30369d, (this.f30368c.hashCode() + m0.m7370c(this.f30367b, this.f30366a.hashCode() * 31, 31)) * 31, 31), 31), 31, this.f30371f), 31, this.f30372g);
    }

    public final String toString() {
        return "AverageCallDurationState(averageCallDuration=" + this.f30366a + ", startDate=" + this.f30367b + ", simSelectionMode=" + this.f30368c + ", endDate=" + this.f30369d + ", excludeNumbers=" + this.f30370e + ", isLoading=" + this.f30371f + ", isEmpty=" + this.f30372g + ", isExclude=" + this.f30373h + ")";
    }
}
