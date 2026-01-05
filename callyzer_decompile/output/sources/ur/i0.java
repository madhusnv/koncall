package ur;

import com.sun.mail.util.AbstractC1452a;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import or.C5440c;
import qw.C6361k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class i0 {

    /* renamed from: a */
    public final List f36224a;

    /* renamed from: b */
    public final List f36225b;

    /* renamed from: c */
    public final C5440c f36226c;

    /* renamed from: d */
    public final qr.g0 f36227d;

    /* renamed from: e */
    public final C6361k f36228e;

    public i0(List filterItems, List leadFilterItems, C5440c c5440c, qr.g0 g0Var, C6361k c6361k) {
        AbstractC4154l.m8923f(filterItems, "filterItems");
        AbstractC4154l.m8923f(leadFilterItems, "leadFilterItems");
        this.f36224a = filterItems;
        this.f36225b = leadFilterItems;
        this.f36226c = c5440c;
        this.f36227d = g0Var;
        this.f36228e = c6361k;
    }

    /* renamed from: a */
    public static i0 m14293a(i0 i0Var, List list, List list2, C5440c c5440c, qr.g0 g0Var, C6361k c6361k, int i10) {
        if ((i10 & 1) != 0) {
            list = i0Var.f36224a;
        }
        List filterItems = list;
        if ((i10 & 2) != 0) {
            list2 = i0Var.f36225b;
        }
        List leadFilterItems = list2;
        if ((i10 & 4) != 0) {
            c5440c = i0Var.f36226c;
        }
        C5440c c5440c2 = c5440c;
        if ((i10 & 8) != 0) {
            g0Var = i0Var.f36227d;
        }
        qr.g0 g0Var2 = g0Var;
        if ((i10 & 16) != 0) {
            c6361k = i0Var.f36228e;
        }
        i0Var.getClass();
        AbstractC4154l.m8923f(filterItems, "filterItems");
        AbstractC4154l.m8923f(leadFilterItems, "leadFilterItems");
        return new i0(filterItems, leadFilterItems, c5440c2, g0Var2, c6361k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return AbstractC4154l.m8918a(this.f36224a, i0Var.f36224a) && AbstractC4154l.m8918a(this.f36225b, i0Var.f36225b) && AbstractC4154l.m8918a(this.f36226c, i0Var.f36226c) && AbstractC4154l.m8918a(this.f36227d, i0Var.f36227d) && AbstractC4154l.m8918a(this.f36228e, i0Var.f36228e);
    }

    public final int hashCode() {
        int iM4559f = AbstractC1452a.m4559f(this.f36225b, this.f36224a.hashCode() * 31, 31);
        C5440c c5440c = this.f36226c;
        int iHashCode = (iM4559f + (c5440c == null ? 0 : c5440c.hashCode())) * 31;
        qr.g0 g0Var = this.f36227d;
        return this.f36228e.hashCode() + ((iHashCode + (g0Var != null ? g0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "FilterState(filterItems=" + this.f36224a + ", leadFilterItems=" + this.f36225b + ", openMultiSelectionFor=" + this.f36226c + ", sortItems=" + this.f36227d + ", isOpenValidationSheetWithMsg=" + this.f36228e + ")";
    }
}
