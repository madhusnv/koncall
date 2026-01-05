package p001o;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/* loaded from: classes3.dex */
public final class ceh {

    /* renamed from: a */
    public final jx7 f18010a;

    /* renamed from: b */
    public List f18011b;

    /* renamed from: c */
    public List f18012c;

    /* renamed from: d */
    public Map f18013d;

    public ceh(jx7 jx7Var) {
        this.f18010a = jx7Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ Double m21095i(jx7 jx7Var) {
        return (Double) m21102g().get(jx7Var);
    }

    /* renamed from: j */
    public static double m21096j(jx7 jx7Var) {
        double[] dArrM39100j = mi3.m39100j(jx7Var.m34657g());
        return ((Math.pow(Math.hypot(dArrM39100j[1], dArrM39100j[2]), 1.07d) * 0.02d) * Math.cos(Math.toRadians(nza.m41318f(nza.m41318f(Math.toDegrees(Math.atan2(dArrM39100j[2], dArrM39100j[1]))) - 50.0d)))) - 0.5d;
    }

    /* renamed from: b */
    public List m21097b(int i, int i2) {
        int iRound = (int) Math.round(this.f18010a.m34654d());
        jx7 jx7Var = (jx7) m21099d().get(iRound);
        double dM21101f = m21101f(jx7Var);
        ArrayList arrayList = new ArrayList();
        arrayList.add(jx7Var);
        double dAbs = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        double dAbs2 = 0.0d;
        int i3 = 0;
        while (i3 < 360) {
            double dM21101f2 = m21101f((jx7) m21099d().get(nza.m41319g(iRound + i3)));
            dAbs2 += Math.abs(dM21101f2 - dM21101f);
            i3++;
            dM21101f = dM21101f2;
        }
        double d = dAbs2 / i2;
        double dM21101f3 = m21101f(jx7Var);
        int i4 = 1;
        while (true) {
            if (arrayList.size() >= i2) {
                break;
            }
            jx7 jx7Var2 = (jx7) m21099d().get(nza.m41319g(iRound + i4));
            double dM21101f4 = m21101f(jx7Var2);
            dAbs += Math.abs(dM21101f4 - dM21101f3);
            boolean z = dAbs >= ((double) arrayList.size()) * d;
            int i5 = 1;
            while (z && arrayList.size() < i2) {
                arrayList.add(jx7Var2);
                z = dAbs >= ((double) (arrayList.size() + i5)) * d;
                i5++;
            }
            i4++;
            if (i4 > 360) {
                while (arrayList.size() < i2) {
                    arrayList.add(jx7Var2);
                }
            } else {
                dM21101f3 = dM21101f4;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(this.f18010a);
        int iFloor = (int) Math.floor((i - 1.0d) / 2.0d);
        for (int i6 = 1; i6 < iFloor + 1; i6++) {
            int size = 0 - i6;
            while (size < 0) {
                size += arrayList.size();
            }
            if (size >= arrayList.size()) {
                size %= arrayList.size();
            }
            arrayList2.add(0, (jx7) arrayList.get(size));
        }
        int i7 = (i - iFloor) - 1;
        for (int i8 = 1; i8 < i7 + 1; i8++) {
            int size2 = i8;
            while (size2 < 0) {
                size2 += arrayList.size();
            }
            if (size2 >= arrayList.size()) {
                size2 %= arrayList.size();
            }
            arrayList2.add((jx7) arrayList.get(size2));
        }
        return arrayList2;
    }

    /* renamed from: c */
    public final jx7 m21098c() {
        return (jx7) m21100e().get(0);
    }

    /* renamed from: d */
    public final List m21099d() {
        List list = this.f18012c;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (double d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE; d <= 360.0d; d += 1.0d) {
            arrayList.add(jx7.m34651a(d, this.f18010a.m34653c(), this.f18010a.m34655e()));
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        this.f18012c = listUnmodifiableList;
        return listUnmodifiableList;
    }

    /* renamed from: e */
    public final List m21100e() {
        List list = this.f18011b;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList(m21099d());
        arrayList.add(this.f18010a);
        Collections.sort(arrayList, Comparator.comparing(new Function() { // from class: o.aeh
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f14583a.m21095i((jx7) obj);
            }
        }, new Comparator() { // from class: o.beh
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Double) obj).compareTo((Double) obj2);
            }
        }));
        this.f18011b = arrayList;
        return arrayList;
    }

    /* renamed from: f */
    public double m21101f(jx7 jx7Var) {
        double dDoubleValue = ((Double) m21102g().get(m21103h())).doubleValue() - ((Double) m21102g().get(m21098c())).doubleValue();
        double dDoubleValue2 = ((Double) m21102g().get(jx7Var)).doubleValue() - ((Double) m21102g().get(m21098c())).doubleValue();
        if (dDoubleValue == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return 0.5d;
        }
        return dDoubleValue2 / dDoubleValue;
    }

    /* renamed from: g */
    public final Map m21102g() {
        Map map = this.f18013d;
        if (map != null) {
            return map;
        }
        ArrayList<jx7> arrayList = new ArrayList(m21099d());
        arrayList.add(this.f18010a);
        HashMap map2 = new HashMap();
        for (jx7 jx7Var : arrayList) {
            map2.put(jx7Var, Double.valueOf(m21096j(jx7Var)));
        }
        this.f18013d = map2;
        return map2;
    }

    /* renamed from: h */
    public final jx7 m21103h() {
        return (jx7) m21100e().get(m21100e().size() - 1);
    }
}
