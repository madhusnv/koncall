package p001o;

import java.util.ArrayList;

/* loaded from: classes6.dex */
public abstract class tbd {
    /* renamed from: a */
    public static final void m49692a(int i, int i2, uef uefVar) {
        sq8.m48649h(uefVar, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(uefVar.mo16763e(i4));
            }
            i3 >>>= 1;
        }
        throw new hgb(arrayList, uefVar.mo16766h());
    }
}
