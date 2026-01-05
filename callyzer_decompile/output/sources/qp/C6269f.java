package qp;

import a2.AbstractC0030c;
import android.content.Context;
import com.sun.mail.util.AbstractC1452a;
import i0.m0;
import j$.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import tq.EnumC7204p;
import zp.C9006f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qp.f */
/* loaded from: classes3.dex */
public final class C6269f {

    /* renamed from: a */
    public final Context f30403a;

    /* renamed from: b */
    public final C9006f f30404b;

    /* renamed from: c */
    public final EnumC7204p f30405c;

    /* renamed from: d */
    public final LocalDateTime f30406d;

    /* renamed from: e */
    public final LocalDateTime f30407e;

    /* renamed from: f */
    public final List f30408f;

    /* renamed from: g */
    public final boolean f30409g;

    /* renamed from: h */
    public final boolean f30410h;

    /* renamed from: i */
    public final boolean f30411i;

    public C6269f(Context context, C9006f c9006f, EnumC7204p simSelectionMode, LocalDateTime localDateTime, LocalDateTime localDateTime2, List excludeNumbers, boolean z6, boolean z10, boolean z11) {
        AbstractC4154l.m8923f(simSelectionMode, "simSelectionMode");
        AbstractC4154l.m8923f(excludeNumbers, "excludeNumbers");
        this.f30403a = context;
        this.f30404b = c9006f;
        this.f30405c = simSelectionMode;
        this.f30406d = localDateTime;
        this.f30407e = localDateTime2;
        this.f30408f = excludeNumbers;
        this.f30409g = z6;
        this.f30410h = z10;
        this.f30411i = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.List] */
    /* renamed from: a */
    public static C6269f m12273a(C6269f c6269f, C9006f c9006f, EnumC7204p simSelectionMode, LocalDateTime startDate, LocalDateTime endDate, ArrayList arrayList, boolean z6, boolean z10, boolean z11, int i10) {
        C9006f c9006f2 = c9006f;
        Context context = c6269f.f30403a;
        if ((i10 & 2) != 0) {
            c9006f2 = c6269f.f30404b;
        }
        if ((i10 & 4) != 0) {
            simSelectionMode = c6269f.f30405c;
        }
        if ((i10 & 8) != 0) {
            startDate = c6269f.f30406d;
        }
        if ((i10 & 16) != 0) {
            endDate = c6269f.f30407e;
        }
        ArrayList excludeNumbers = arrayList;
        if ((i10 & 32) != 0) {
            excludeNumbers = c6269f.f30408f;
        }
        if ((i10 & 64) != 0) {
            z6 = c6269f.f30409g;
        }
        if ((i10 & 128) != 0) {
            z10 = c6269f.f30410h;
        }
        if ((i10 & 256) != 0) {
            z11 = c6269f.f30411i;
        }
        boolean z12 = z11;
        c6269f.getClass();
        AbstractC4154l.m8923f(simSelectionMode, "simSelectionMode");
        AbstractC4154l.m8923f(startDate, "startDate");
        AbstractC4154l.m8923f(endDate, "endDate");
        AbstractC4154l.m8923f(excludeNumbers, "excludeNumbers");
        boolean z13 = z10;
        boolean z14 = z6;
        ArrayList arrayList2 = excludeNumbers;
        LocalDateTime localDateTime = endDate;
        LocalDateTime localDateTime2 = startDate;
        return new C6269f(context, c9006f2, simSelectionMode, localDateTime2, localDateTime, arrayList2, z14, z13, z12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6269f)) {
            return false;
        }
        C6269f c6269f = (C6269f) obj;
        return AbstractC4154l.m8918a(this.f30403a, c6269f.f30403a) && AbstractC4154l.m8918a(this.f30404b, c6269f.f30404b) && this.f30405c == c6269f.f30405c && AbstractC4154l.m8918a(this.f30406d, c6269f.f30406d) && AbstractC4154l.m8918a(this.f30407e, c6269f.f30407e) && AbstractC4154l.m8918a(this.f30408f, c6269f.f30408f) && this.f30409g == c6269f.f30409g && this.f30410h == c6269f.f30410h && this.f30411i == c6269f.f30411i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f30411i) + AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4559f(this.f30408f, m0.m7370c(this.f30407e, m0.m7370c(this.f30406d, (this.f30405c.hashCode() + ((this.f30404b.hashCode() + (this.f30403a.hashCode() * 31)) * 31)) * 31, 31), 31), 31), 31, this.f30409g), 31, this.f30410h);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LongestCallState(context=");
        sb2.append(this.f30403a);
        sb2.append(", topCaller=");
        sb2.append(this.f30404b);
        sb2.append(", simSelectionMode=");
        sb2.append(this.f30405c);
        sb2.append(", startDate=");
        sb2.append(this.f30406d);
        sb2.append(", endDate=");
        sb2.append(this.f30407e);
        sb2.append(", excludeNumbers=");
        sb2.append(this.f30408f);
        sb2.append(", isLoading=");
        AbstractC0030c.m133x(sb2, this.f30409g, ", isEmpty=", this.f30410h, ", isExclude=");
        return AbstractC5601a.m11242m(sb2, this.f30411i, ")");
    }
}
