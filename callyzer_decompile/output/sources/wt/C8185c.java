package wt;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wt.c */
/* loaded from: classes3.dex */
public final class C8185c {

    /* renamed from: a */
    public final boolean f39144a;

    /* renamed from: b */
    public final List f39145b;

    /* renamed from: c */
    public final boolean f39146c;

    /* renamed from: d */
    public final boolean f39147d;

    /* renamed from: e */
    public final int f39148e;

    /* renamed from: f */
    public final String f39149f;

    /* renamed from: g */
    public final Integer f39150g;

    /* renamed from: h */
    public final boolean f39151h;

    /* renamed from: i */
    public final String f39152i;

    public C8185c(boolean z6, List connectedExtension, boolean z10, boolean z11, int i10, String str, Integer num, boolean z12, String str2) {
        AbstractC4154l.m8923f(connectedExtension, "connectedExtension");
        this.f39144a = z6;
        this.f39145b = connectedExtension;
        this.f39146c = z10;
        this.f39147d = z11;
        this.f39148e = i10;
        this.f39149f = str;
        this.f39150g = num;
        this.f39151h = z12;
        this.f39152i = str2;
    }

    /* renamed from: a */
    public static C8185c m15342a(C8185c c8185c, boolean z6, List list, boolean z10, boolean z11, int i10, String str, Integer num, boolean z12, String str2, int i11) {
        if ((i11 & 1) != 0) {
            z6 = c8185c.f39144a;
        }
        boolean z13 = z6;
        if ((i11 & 2) != 0) {
            list = c8185c.f39145b;
        }
        List connectedExtension = list;
        if ((i11 & 4) != 0) {
            z10 = c8185c.f39146c;
        }
        boolean z14 = z10;
        if ((i11 & 8) != 0) {
            z11 = c8185c.f39147d;
        }
        boolean z15 = z11;
        if ((i11 & 16) != 0) {
            i10 = c8185c.f39148e;
        }
        int i12 = i10;
        String extensionName = (i11 & 32) != 0 ? c8185c.f39149f : str;
        Integer num2 = (i11 & 64) != 0 ? c8185c.f39150g : num;
        boolean z16 = (i11 & 128) != 0 ? c8185c.f39151h : z12;
        String extensionLink = (i11 & 256) != 0 ? c8185c.f39152i : str2;
        c8185c.getClass();
        AbstractC4154l.m8923f(connectedExtension, "connectedExtension");
        AbstractC4154l.m8923f(extensionName, "extensionName");
        AbstractC4154l.m8923f(extensionLink, "extensionLink");
        return new C8185c(z13, connectedExtension, z14, z15, i12, extensionName, num2, z16, extensionLink);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8185c)) {
            return false;
        }
        C8185c c8185c = (C8185c) obj;
        return this.f39144a == c8185c.f39144a && AbstractC4154l.m8918a(this.f39145b, c8185c.f39145b) && this.f39146c == c8185c.f39146c && this.f39147d == c8185c.f39147d && this.f39148e == c8185c.f39148e && AbstractC4154l.m8918a(this.f39149f, c8185c.f39149f) && AbstractC4154l.m8918a(this.f39150g, c8185c.f39150g) && this.f39151h == c8185c.f39151h && AbstractC4154l.m8918a(this.f39152i, c8185c.f39152i);
    }

    public final int hashCode() {
        int iM113d = AbstractC0030c.m113d(AbstractC1452a.m4556c(this.f39148e, AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4559f(this.f39145b, Boolean.hashCode(this.f39144a) * 31, 31), 31, this.f39146c), 31, this.f39147d), 31), 31, this.f39149f);
        Integer num = this.f39150g;
        return this.f39152i.hashCode() + AbstractC1452a.m4558e((iM113d + (num == null ? 0 : num.hashCode())) * 31, 31, this.f39151h);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("QuickCallState(isNameBottomSheetVisible=");
        sb2.append(this.f39144a);
        sb2.append(", connectedExtension=");
        sb2.append(this.f39145b);
        sb2.append(", disconnectingDialog=");
        AbstractC0030c.m133x(sb2, this.f39146c, ", subscriptionBottomSheet=", this.f39147d, ", editId=");
        AbstractC1452a.m4550A(sb2, this.f39148e, ", extensionName=", this.f39149f, ", validationError=");
        sb2.append(this.f39150g);
        sb2.append(", isNameValid=");
        sb2.append(this.f39151h);
        sb2.append(", extensionLink=");
        return AbstractC1452a.m4564k(sb2, this.f39152i, ")");
    }
}
