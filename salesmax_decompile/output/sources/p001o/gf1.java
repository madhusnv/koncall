package p001o;

import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* loaded from: classes2.dex */
public final class gf1 {

    /* renamed from: a */
    public final Map f25056a;

    /* renamed from: b */
    public final Map f25057b;

    /* renamed from: c */
    public final Map f25058c;

    /* renamed from: d */
    public final Random f25059d;

    public gf1() {
        this(new Random());
    }

    /* renamed from: b */
    public static void m28539b(Object obj, long j, Map map) {
        if (map.containsKey(obj)) {
            j = Math.max(j, ((Long) sqi.m48729h((Long) map.get(obj))).longValue());
        }
        map.put(obj, Long.valueOf(j));
    }

    /* renamed from: d */
    public static int m28540d(ef1 ef1Var, ef1 ef1Var2) {
        int iCompare = Integer.compare(ef1Var.f21520c, ef1Var2.f21520c);
        return iCompare != 0 ? iCompare : ef1Var.f21519b.compareTo(ef1Var2.f21519b);
    }

    /* renamed from: f */
    public static int m28541f(List list) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < list.size(); i++) {
            hashSet.add(Integer.valueOf(((ef1) list.get(i)).f21520c));
        }
        return hashSet.size();
    }

    /* renamed from: h */
    public static void m28542h(long j, Map map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            map.remove(arrayList.get(i));
        }
    }

    /* renamed from: c */
    public final List m28543c(List list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        m28542h(jElapsedRealtime, this.f25056a);
        m28542h(jElapsedRealtime, this.f25057b);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            ef1 ef1Var = (ef1) list.get(i);
            if (!this.f25056a.containsKey(ef1Var.f21519b) && !this.f25057b.containsKey(Integer.valueOf(ef1Var.f21520c))) {
                arrayList.add(ef1Var);
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public void m28544e(ef1 ef1Var, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j;
        m28539b(ef1Var.f21519b, jElapsedRealtime, this.f25056a);
        int i = ef1Var.f21520c;
        if (i != Integer.MIN_VALUE) {
            m28539b(Integer.valueOf(i), jElapsedRealtime, this.f25057b);
        }
    }

    /* renamed from: g */
    public int m28545g(List list) {
        HashSet hashSet = new HashSet();
        List listM28543c = m28543c(list);
        for (int i = 0; i < listM28543c.size(); i++) {
            hashSet.add(Integer.valueOf(((ef1) listM28543c.get(i)).f21520c));
        }
        return hashSet.size();
    }

    /* renamed from: i */
    public void m28546i() {
        this.f25056a.clear();
        this.f25057b.clear();
        this.f25058c.clear();
    }

    /* renamed from: j */
    public ef1 m28547j(List list) {
        List listM28543c = m28543c(list);
        if (listM28543c.size() < 2) {
            return (ef1) z59.m58772c(listM28543c, null);
        }
        Collections.sort(listM28543c, new Comparator() { // from class: o.ff1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return gf1.m28540d((ef1) obj, (ef1) obj2);
            }
        });
        ArrayList arrayList = new ArrayList();
        int i = ((ef1) listM28543c.get(0)).f21520c;
        int i2 = 0;
        while (true) {
            if (i2 >= listM28543c.size()) {
                break;
            }
            ef1 ef1Var = (ef1) listM28543c.get(i2);
            if (i == ef1Var.f21520c) {
                arrayList.add(new Pair(ef1Var.f21519b, Integer.valueOf(ef1Var.f21521d)));
                i2++;
            } else if (arrayList.size() == 1) {
                return (ef1) listM28543c.get(0);
            }
        }
        ef1 ef1Var2 = (ef1) this.f25058c.get(arrayList);
        if (ef1Var2 != null) {
            return ef1Var2;
        }
        ef1 ef1VarM28548k = m28548k(listM28543c.subList(0, arrayList.size()));
        this.f25058c.put(arrayList, ef1VarM28548k);
        return ef1VarM28548k;
    }

    /* renamed from: k */
    public final ef1 m28548k(List list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            i += ((ef1) list.get(i2)).f21521d;
        }
        int iNextInt = this.f25059d.nextInt(i);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ef1 ef1Var = (ef1) list.get(i4);
            i3 += ef1Var.f21521d;
            if (iNextInt < i3) {
                return ef1Var;
            }
        }
        return (ef1) z59.m58773d(list);
    }

    public gf1(Random random) {
        this.f25058c = new HashMap();
        this.f25059d = random;
        this.f25056a = new HashMap();
        this.f25057b = new HashMap();
    }
}
