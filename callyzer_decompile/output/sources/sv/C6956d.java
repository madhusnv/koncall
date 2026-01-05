package sv;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import j$.time.LocalDateTime;
import kotlin.jvm.internal.AbstractC4154l;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sv.d */
/* loaded from: classes3.dex */
public final class C6956d {

    /* renamed from: a */
    public final int f33683a;

    /* renamed from: b */
    public final String f33684b;

    /* renamed from: c */
    public final String f33685c;

    /* renamed from: d */
    public final LocalDateTime f33686d;

    /* renamed from: e */
    public final boolean f33687e;

    /* renamed from: f */
    public final boolean f33688f;

    public C6956d(int i10, String str, String str2, LocalDateTime localDateTime, boolean z6, boolean z10) {
        this.f33683a = i10;
        this.f33684b = str;
        this.f33685c = str2;
        this.f33686d = localDateTime;
        this.f33687e = z6;
        this.f33688f = z10;
    }

    /* renamed from: a */
    public static C6956d m13208a(C6956d c6956d, int i10, String str, String str2, LocalDateTime localDateTime, boolean z6, int i11) {
        if ((i11 & 1) != 0) {
            i10 = c6956d.f33683a;
        }
        int i12 = i10;
        if ((i11 & 2) != 0) {
            str = c6956d.f33684b;
        }
        String quoteOnScreen = str;
        if ((i11 & 4) != 0) {
            str2 = c6956d.f33685c;
        }
        String customerName = str2;
        if ((i11 & 8) != 0) {
            localDateTime = c6956d.f33686d;
        }
        LocalDateTime localDateTime2 = localDateTime;
        if ((i11 & 16) != 0) {
            z6 = c6956d.f33687e;
        }
        boolean z10 = z6;
        boolean z11 = (i11 & 32) != 0 ? c6956d.f33688f : true;
        c6956d.getClass();
        AbstractC4154l.m8923f(quoteOnScreen, "quoteOnScreen");
        AbstractC4154l.m8923f(customerName, "customerName");
        return new C6956d(i12, quoteOnScreen, customerName, localDateTime2, z10, z11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6956d)) {
            return false;
        }
        C6956d c6956d = (C6956d) obj;
        return this.f33683a == c6956d.f33683a && AbstractC4154l.m8918a(this.f33684b, c6956d.f33684b) && AbstractC4154l.m8918a(this.f33685c, c6956d.f33685c) && AbstractC4154l.m8918a(this.f33686d, c6956d.f33686d) && this.f33687e == c6956d.f33687e && this.f33688f == c6956d.f33688f;
    }

    public final int hashCode() {
        int iM113d = AbstractC0030c.m113d(AbstractC0030c.m113d(Integer.hashCode(this.f33683a) * 31, 31, this.f33684b), 31, this.f33685c);
        LocalDateTime localDateTime = this.f33686d;
        return Boolean.hashCode(this.f33688f) + AbstractC1452a.m4558e((iM113d + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31, 31, this.f33687e);
    }

    public final String toString() {
        StringBuilder sbM14337q = a1.m14337q(this.f33683a, "SyncedUIState(progressPercentage=", ", quoteOnScreen=", this.f33684b, ", customerName=");
        sbM14337q.append(this.f33685c);
        sbM14337q.append(", synFromDate=");
        sbM14337q.append(this.f33686d);
        sbM14337q.append(", showConfirmCustomer=");
        sbM14337q.append(this.f33687e);
        sbM14337q.append(", isSyncData=");
        sbM14337q.append(this.f33688f);
        sbM14337q.append(")");
        return sbM14337q.toString();
    }
}
