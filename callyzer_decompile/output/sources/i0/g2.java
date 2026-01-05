package i0;

import android.hardware.camera2.params.InputConfiguration;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class g2 {

    /* renamed from: j */
    public static final List f16466j = Arrays.asList(1, 5, 3);

    /* renamed from: a */
    public final ArrayList f16467a;

    /* renamed from: b */
    public final C3080k f16468b;

    /* renamed from: c */
    public final List f16469c;

    /* renamed from: d */
    public final List f16470d;

    /* renamed from: e */
    public final List f16471e;

    /* renamed from: f */
    public final d2 f16472f;

    /* renamed from: g */
    public final q0 f16473g;

    /* renamed from: h */
    public final int f16474h;

    /* renamed from: i */
    public final InputConfiguration f16475i;

    public g2(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, q0 q0Var, d2 d2Var, InputConfiguration inputConfiguration, int i10, C3080k c3080k) {
        this.f16467a = arrayList;
        this.f16469c = Collections.unmodifiableList(arrayList2);
        this.f16470d = Collections.unmodifiableList(arrayList3);
        this.f16471e = Collections.unmodifiableList(arrayList4);
        this.f16472f = d2Var;
        this.f16473g = q0Var;
        this.f16475i = inputConfiguration;
        this.f16474h = i10;
        this.f16468b = c3080k;
    }

    /* renamed from: a */
    public static g2 m7340a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(0);
        ArrayList arrayList3 = new ArrayList(0);
        ArrayList arrayList4 = new ArrayList(0);
        HashSet hashSet = new HashSet();
        j1 j1VarM7349b = j1.m7349b();
        ArrayList arrayList5 = new ArrayList();
        l1 l1VarM7361a = l1.m7361a();
        ArrayList arrayList6 = new ArrayList(hashSet);
        o1 o1VarM7399a = o1.m7399a(j1VarM7349b);
        ArrayList arrayList7 = new ArrayList(arrayList5);
        r2 r2Var = r2.f16576b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = l1VarM7361a.f16577a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        return new g2(arrayList, arrayList2, arrayList3, arrayList4, new q0(arrayList6, o1VarM7399a, -1, arrayList7, false, new r2(arrayMap), null), null, null, 0, null);
    }

    /* renamed from: b */
    public final List m7341b() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f16467a;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            C3080k c3080k = (C3080k) obj;
            arrayList.add(c3080k.f16501a);
            Iterator it = c3080k.f16502b.iterator();
            while (it.hasNext()) {
                arrayList.add((v0) it.next());
            }
        }
        return Collections.unmodifiableList(arrayList);
    }
}
