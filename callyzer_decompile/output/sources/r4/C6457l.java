package r4;

import a2.AbstractC0030c;
import java.util.ArrayList;
import u4.AbstractC7338a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: r4.l */
/* loaded from: classes.dex */
public final class C6457l {

    /* renamed from: b */
    public static final C6457l f31116b = new C6457l(0);

    /* renamed from: c */
    public static final C6457l f31117c = new C6457l(1);

    /* renamed from: d */
    public static final C6457l f31118d = new C6457l(2);

    /* renamed from: a */
    public final int f31119a;

    public C6457l(int i10) {
        this.f31119a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6457l) {
            return this.f31119a == ((C6457l) obj).f31119a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f31119a;
    }

    public final String toString() {
        int i10 = this.f31119a;
        if (i10 == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i10 & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i10 & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() != 1) {
            return AbstractC0030c.m123n(new StringBuilder("TextDecoration["), AbstractC7338a.m13729a(arrayList, ", ", null, 62), ']');
        }
        return "TextDecoration." + ((String) arrayList.get(0));
    }
}
