package sv;

import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;
import mm.C4802m;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sv.c */
/* loaded from: classes3.dex */
public final class C6955c {

    /* renamed from: a */
    public final C4802m f33680a;

    /* renamed from: b */
    public boolean f33681b;

    /* renamed from: c */
    public final boolean f33682c;

    public C6955c(C4802m dataModel, boolean z6, boolean z10) {
        AbstractC4154l.m8923f(dataModel, "dataModel");
        this.f33680a = dataModel;
        this.f33681b = z6;
        this.f33682c = z10;
    }

    /* renamed from: a */
    public static C6955c m13207a(C6955c c6955c, C4802m dataModel, boolean z6, boolean z10, int i10) {
        if ((i10 & 1) != 0) {
            dataModel = c6955c.f33680a;
        }
        if ((i10 & 2) != 0) {
            z6 = c6955c.f33681b;
        }
        if ((i10 & 4) != 0) {
            z10 = c6955c.f33682c;
        }
        c6955c.getClass();
        AbstractC4154l.m8923f(dataModel, "dataModel");
        return new C6955c(dataModel, z6, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6955c)) {
            return false;
        }
        C6955c c6955c = (C6955c) obj;
        return AbstractC4154l.m8918a(this.f33680a, c6955c.f33680a) && this.f33681b == c6955c.f33681b && this.f33682c == c6955c.f33682c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f33682c) + AbstractC1452a.m4558e(this.f33680a.hashCode() * 31, 31, this.f33681b);
    }

    public final String toString() {
        boolean z6 = this.f33681b;
        StringBuilder sb2 = new StringBuilder("SimUIModel(dataModel=");
        sb2.append(this.f33680a);
        sb2.append(", isSelected=");
        sb2.append(z6);
        sb2.append(", isMoveToNext=");
        return AbstractC5601a.m11242m(sb2, this.f33682c, ")");
    }
}
