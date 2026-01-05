package p001o;

import android.view.ViewStructure;

/* loaded from: classes2.dex */
public final class b61 {

    /* renamed from: a */
    public static final b61 f15573a = new b61();

    /* renamed from: a */
    public final int m18180a(ViewStructure viewStructure, int i) {
        sq8.m48649h(viewStructure, "structure");
        return viewStructure.addChildCount(i);
    }

    /* renamed from: b */
    public final ViewStructure m18181b(ViewStructure viewStructure, int i) {
        sq8.m48649h(viewStructure, "structure");
        return viewStructure.newChild(i);
    }

    /* renamed from: c */
    public final void m18182c(ViewStructure viewStructure, int i, int i2, int i3, int i4, int i5, int i6) {
        sq8.m48649h(viewStructure, "structure");
        viewStructure.setDimens(i, i2, i3, i4, i5, i6);
    }

    /* renamed from: d */
    public final void m18183d(ViewStructure viewStructure, int i, String str, String str2, String str3) {
        sq8.m48649h(viewStructure, "structure");
        viewStructure.setId(i, str, str2, str3);
    }
}
