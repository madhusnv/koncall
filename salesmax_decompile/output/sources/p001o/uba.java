package p001o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class uba implements r92 {

    /* renamed from: b */
    public final int f48668b;

    public uba(int i) {
        this.f48668b = i;
    }

    @Override // p001o.r92
    /* renamed from: a */
    public List mo46366a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            t92 t92Var = (t92) it.next();
            fgd.m26658b(t92Var instanceof u92, "The camera info doesn't contain internal implementation.");
            if (t92Var.mo38382d() == this.f48668b) {
                arrayList.add(t92Var);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public int m51335b() {
        return this.f48668b;
    }
}
