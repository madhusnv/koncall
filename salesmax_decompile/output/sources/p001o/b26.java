package p001o;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public final class b26 {

    /* renamed from: a */
    public final s82 f15476a;

    /* renamed from: b */
    public final f26 f15477b;

    /* renamed from: c */
    public final boolean f15478c;

    /* renamed from: o.b26$a */
    public static final class C12278a {
        /* renamed from: a */
        public static y16 m18113a(s82 s82Var) {
            Long l = (Long) s82Var.m47965a(CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE);
            if (l != null) {
                return a26.m16356b(l.longValue());
            }
            return null;
        }
    }

    public b26(s82 s82Var) {
        this.f15476a = s82Var;
        this.f15477b = f26.m25951a(s82Var);
        int[] iArr = (int[]) s82Var.m47965a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        boolean z = false;
        if (iArr != null) {
            int length = iArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (iArr[i] == 18) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.f15478c = z;
    }

    /* renamed from: a */
    public static boolean m18103a(y16 y16Var, y16 y16Var2) {
        fgd.m26666j(y16Var2.m57105e(), "Fully specified range is not actually fully specified.");
        if (y16Var.m57103b() == 2 && y16Var2.m57103b() == 1) {
            return false;
        }
        if (y16Var.m57103b() == 2 || y16Var.m57103b() == 0 || y16Var.m57103b() == y16Var2.m57103b()) {
            return y16Var.m57102a() == 0 || y16Var.m57102a() == y16Var2.m57102a();
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m18104b(y16 y16Var, y16 y16Var2, Set set) {
        if (set.contains(y16Var2)) {
            return m18103a(y16Var, y16Var2);
        }
        wja.m54627a("DynamicRangeResolver", String.format("Candidate Dynamic range is not within constraints.\nDynamic range to resolve:\n  %s\nCandidate dynamic range:\n  %s", y16Var, y16Var2));
        return false;
    }

    /* renamed from: c */
    public static y16 m18105c(y16 y16Var, Collection collection, Set set) {
        if (y16Var.m57103b() == 1) {
            return null;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            y16 y16Var2 = (y16) it.next();
            fgd.m26664h(y16Var2, "Fully specified DynamicRange cannot be null.");
            int iM57103b = y16Var2.m57103b();
            fgd.m26666j(y16Var2.m57105e(), "Fully specified DynamicRange must have fully defined encoding.");
            if (iM57103b != 1 && m18104b(y16Var, y16Var2, set)) {
                return y16Var2;
            }
        }
        return null;
    }

    /* renamed from: e */
    public static boolean m18106e(y16 y16Var) {
        return Objects.equals(y16Var, y16.f54702c);
    }

    /* renamed from: f */
    public static boolean m18107f(y16 y16Var) {
        return y16Var.m57103b() == 2 || (y16Var.m57103b() != 0 && y16Var.m57102a() == 0) || (y16Var.m57103b() == 0 && y16Var.m57102a() != 0);
    }

    /* renamed from: j */
    public static void m18108j(Set set, y16 y16Var, f26 f26Var) {
        fgd.m26666j(!set.isEmpty(), "Cannot update already-empty constraints.");
        Set setM25953b = f26Var.m25953b(y16Var);
        if (setM25953b.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet(set);
        set.retainAll(setM25953b);
        if (set.isEmpty()) {
            throw new IllegalArgumentException(String.format("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  %s\nConstraints:\n  %s\nExisting constraints:\n  %s", y16Var, TextUtils.join("\n  ", setM25953b), TextUtils.join("\n  ", hashSet)));
        }
    }

    /* renamed from: d */
    public boolean m18109d() {
        return this.f15478c;
    }

    /* renamed from: g */
    public Map m18110g(List list, List list2, List list3) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((os0) it.next()).mo42614c());
        }
        Set setM25954c = this.f15477b.m25954c();
        HashSet hashSet = new HashSet(setM25954c);
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            m18108j(hashSet, (y16) it2.next(), this.f15477b);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            c9i c9iVar = (c9i) list2.get(((Integer) it3.next()).intValue());
            y16 y16VarM35425E = c9iVar.m35425E();
            if (m18106e(y16VarM35425E)) {
                arrayList3.add(c9iVar);
            } else if (m18107f(y16VarM35425E)) {
                arrayList2.add(c9iVar);
            } else {
                arrayList.add(c9iVar);
            }
        }
        HashMap map = new HashMap();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ArrayList<c9i> arrayList4 = new ArrayList();
        arrayList4.addAll(arrayList);
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList3);
        for (c9i c9iVar2 : arrayList4) {
            y16 y16VarM18112i = m18112i(setM25954c, linkedHashSet, linkedHashSet2, c9iVar2, hashSet);
            map.put(c9iVar2, y16VarM18112i);
            if (!linkedHashSet.contains(y16VarM18112i)) {
                linkedHashSet2.add(y16VarM18112i);
            }
        }
        return map;
    }

    /* renamed from: h */
    public final y16 m18111h(y16 y16Var, Set set, Set set2, Set set3, String str) {
        y16 y16VarM18113a;
        if (y16Var.m57105e()) {
            if (set.contains(y16Var)) {
                return y16Var;
            }
            return null;
        }
        int iM57103b = y16Var.m57103b();
        int iM57102a = y16Var.m57102a();
        if (iM57103b == 1 && iM57102a == 0) {
            y16 y16Var2 = y16.f54703d;
            if (set.contains(y16Var2)) {
                return y16Var2;
            }
            return null;
        }
        y16 y16VarM18105c = m18105c(y16Var, set2, set);
        if (y16VarM18105c != null) {
            wja.m54627a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s from existing attached surface.\n%s\n->\n%s", str, y16Var, y16VarM18105c));
            return y16VarM18105c;
        }
        y16 y16VarM18105c2 = m18105c(y16Var, set3, set);
        if (y16VarM18105c2 != null) {
            wja.m54627a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s from concurrently bound use case.\n%s\n->\n%s", str, y16Var, y16VarM18105c2));
            return y16VarM18105c2;
        }
        y16 y16Var3 = y16.f54703d;
        if (m18104b(y16Var, y16Var3, set)) {
            wja.m54627a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s to no compatible HDR dynamic ranges.\n%s\n->\n%s", str, y16Var, y16Var3));
            return y16Var3;
        }
        if (iM57103b == 2 && (iM57102a == 10 || iM57102a == 0)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (Build.VERSION.SDK_INT >= 33) {
                y16VarM18113a = C12278a.m18113a(this.f15476a);
                if (y16VarM18113a != null) {
                    linkedHashSet.add(y16VarM18113a);
                }
            } else {
                y16VarM18113a = null;
            }
            linkedHashSet.add(y16.f54705f);
            y16 y16VarM18105c3 = m18105c(y16Var, linkedHashSet, set);
            if (y16VarM18105c3 != null) {
                Object[] objArr = new Object[4];
                objArr[0] = str;
                objArr[1] = y16VarM18105c3.equals(y16VarM18113a) ? "recommended" : "required";
                objArr[2] = y16Var;
                objArr[3] = y16VarM18105c3;
                wja.m54627a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s from %s 10-bit supported dynamic range.\n%s\n->\n%s", objArr));
                return y16VarM18105c3;
            }
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            y16 y16Var4 = (y16) it.next();
            fgd.m26666j(y16Var4.m57105e(), "Candidate dynamic range must be fully specified.");
            if (!y16Var4.equals(y16.f54703d) && m18103a(y16Var, y16Var4)) {
                wja.m54627a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s from validated dynamic range constraints or supported HDR dynamic ranges.\n%s\n->\n%s", str, y16Var, y16Var4));
                return y16Var4;
            }
        }
        return null;
    }

    /* renamed from: i */
    public final y16 m18112i(Set set, Set set2, Set set3, c9i c9iVar, Set set4) {
        y16 y16VarM35425E = c9iVar.m35425E();
        y16 y16VarM18111h = m18111h(y16VarM35425E, set4, set2, set3, c9iVar.m48393O());
        if (y16VarM18111h == null) {
            throw new IllegalArgumentException(String.format("Unable to resolve supported dynamic range. The dynamic range may not be supported on the device or may not be allowed concurrently with other attached use cases.\nUse case:\n  %s\nRequested dynamic range:\n  %s\nSupported dynamic ranges:\n  %s\nConstrained set of concurrent dynamic ranges:\n  %s", c9iVar.m48393O(), y16VarM35425E, TextUtils.join("\n  ", set), TextUtils.join("\n  ", set4)));
        }
        m18108j(set4, y16VarM18111h, this.f15477b);
        return y16VarM18111h;
    }
}
