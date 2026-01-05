package lq;

import com.sun.mail.util.AbstractC1452a;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import tq.EnumC7204p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: lq.c */
/* loaded from: classes3.dex */
public final class C4508c {

    /* renamed from: a */
    public final List f22428a;

    /* renamed from: b */
    public final boolean f22429b;

    /* renamed from: c */
    public final boolean f22430c;

    /* renamed from: d */
    public final int f22431d;

    /* renamed from: e */
    public final boolean f22432e;

    /* renamed from: f */
    public final int f22433f;

    /* renamed from: g */
    public final boolean f22434g;

    /* renamed from: h */
    public final EnumC7204p f22435h;

    /* renamed from: i */
    public final boolean f22436i;

    /* renamed from: j */
    public final String f22437j;

    /* renamed from: k */
    public final boolean f22438k;

    public C4508c(List list, boolean z6, boolean z10, int i10, boolean z11, int i11, boolean z12, EnumC7204p simSelectionMode, boolean z13, String str) {
        AbstractC4154l.m8923f(simSelectionMode, "simSelectionMode");
        this.f22428a = list;
        this.f22429b = z6;
        this.f22430c = z10;
        this.f22431d = i10;
        this.f22432e = z11;
        this.f22433f = i11;
        this.f22434g = z12;
        this.f22435h = simSelectionMode;
        this.f22436i = z13;
        this.f22437j = str;
        this.f22438k = simSelectionMode != EnumC7204p.DEFAULT;
    }

    /* renamed from: a */
    public static C4508c m9341a(C4508c c4508c, List list, boolean z6, boolean z10, int i10, boolean z11, int i11, boolean z12, EnumC7204p enumC7204p, boolean z13, String str, int i12) {
        if ((i12 & 1) != 0) {
            list = c4508c.f22428a;
        }
        List callHistory = list;
        if ((i12 & 2) != 0) {
            z6 = c4508c.f22429b;
        }
        boolean z14 = z6;
        if ((i12 & 4) != 0) {
            z10 = c4508c.f22430c;
        }
        boolean z15 = z10;
        if ((i12 & 8) != 0) {
            i10 = c4508c.f22431d;
        }
        int i13 = i10;
        boolean z16 = (i12 & 16) != 0 ? c4508c.f22432e : z11;
        int i14 = (i12 & 32) != 0 ? c4508c.f22433f : i11;
        boolean z17 = (i12 & 64) != 0 ? c4508c.f22434g : z12;
        EnumC7204p simSelectionMode = (i12 & 128) != 0 ? c4508c.f22435h : enumC7204p;
        boolean z18 = (i12 & 256) != 0 ? c4508c.f22436i : z13;
        String str2 = (i12 & 512) != 0 ? c4508c.f22437j : str;
        c4508c.getClass();
        AbstractC4154l.m8923f(callHistory, "callHistory");
        AbstractC4154l.m8923f(simSelectionMode, "simSelectionMode");
        return new C4508c(callHistory, z14, z15, i13, z16, i14, z17, simSelectionMode, z18, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4508c)) {
            return false;
        }
        C4508c c4508c = (C4508c) obj;
        return AbstractC4154l.m8918a(this.f22428a, c4508c.f22428a) && this.f22429b == c4508c.f22429b && this.f22430c == c4508c.f22430c && this.f22431d == c4508c.f22431d && this.f22432e == c4508c.f22432e && this.f22433f == c4508c.f22433f && this.f22434g == c4508c.f22434g && this.f22435h == c4508c.f22435h && this.f22436i == c4508c.f22436i && AbstractC4154l.m8918a(this.f22437j, c4508c.f22437j);
    }

    public final int hashCode() {
        return this.f22437j.hashCode() + AbstractC1452a.m4558e((this.f22435h.hashCode() + AbstractC1452a.m4558e(AbstractC1452a.m4556c(this.f22433f, AbstractC1452a.m4558e(AbstractC1452a.m4556c(this.f22431d, AbstractC1452a.m4558e(AbstractC1452a.m4558e(this.f22428a.hashCode() * 31, 31, this.f22429b), 31, this.f22430c), 31), 31, this.f22432e), 31), 31, this.f22434g)) * 31, 31, this.f22436i);
    }

    public final String toString() {
        return "NeverAttendAndNotPickUpState(callHistory=" + this.f22428a + ", endReached=" + this.f22429b + ", isLoading=" + this.f22430c + ", page=" + this.f22431d + ", isData=" + this.f22432e + ", totalFetchedCallHistory=" + this.f22433f + ", isExcludeNumbers=" + this.f22434g + ", simSelectionMode=" + this.f22435h + ", isSubscription=" + this.f22436i + ", empNumber=" + this.f22437j + ")";
    }
}
