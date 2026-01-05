package p001o;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;
import p001o.dsa;
import p001o.euh;
import p001o.nf8;
import p001o.sga;

/* loaded from: classes2.dex */
public abstract class zth {
    /* renamed from: a */
    public static euh m59935a(dsa.C13025a c13025a, List[] listArr) {
        boolean z;
        nf8.C15566a c15566a = new nf8.C15566a();
        for (int i = 0; i < c13025a.m23758d(); i++) {
            sth sthVarM23760f = c13025a.m23760f(i);
            List list = listArr[i];
            for (int i2 = 0; i2 < sthVarM23760f.f45923a; i2++) {
                qth qthVarM48914b = sthVarM23760f.m48914b(i2);
                boolean z2 = c13025a.m23755a(i, i2, false) != 0;
                int i3 = qthVarM48914b.f42400a;
                int[] iArr = new int[i3];
                boolean[] zArr = new boolean[i3];
                for (int i4 = 0; i4 < qthVarM48914b.f42400a; i4++) {
                    iArr[i4] = c13025a.m23761g(i, i2, i4);
                    int i5 = 0;
                    while (true) {
                        if (i5 >= list.size()) {
                            z = false;
                            break;
                        }
                        wth wthVar = (wth) list.get(i5);
                        if (wthVar.mo22953m().equals(qthVarM48914b) && wthVar.mo22952l(i4) != -1) {
                            z = true;
                            break;
                        }
                        i5++;
                    }
                    zArr[i4] = z;
                }
                c15566a.mo32056a(new euh.C13263a(qthVarM48914b, z2, iArr, zArr));
            }
        }
        sth sthVarM23762h = c13025a.m23762h();
        for (int i6 = 0; i6 < sthVarM23762h.f45923a; i6++) {
            qth qthVarM48914b2 = sthVarM23762h.m48914b(i6);
            int[] iArr2 = new int[qthVarM48914b2.f42400a];
            Arrays.fill(iArr2, 0);
            c15566a.mo32056a(new euh.C13263a(qthVarM48914b2, false, iArr2, new boolean[qthVarM48914b2.f42400a]));
        }
        return new euh(c15566a.m40520k());
    }

    /* renamed from: b */
    public static euh m59936b(dsa.C13025a c13025a, wth[] wthVarArr) {
        List[] listArr = new List[wthVarArr.length];
        for (int i = 0; i < wthVarArr.length; i++) {
            wth wthVar = wthVarArr[i];
            listArr[i] = wthVar != null ? nf8.m40500F(wthVar) : nf8.m40499E();
        }
        return m59935a(c13025a, listArr);
    }

    /* renamed from: c */
    public static sga.C16836a m59937c(ko6 ko6Var) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = ko6Var.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (ko6Var.mo22947a(i2, jElapsedRealtime)) {
                i++;
            }
        }
        return new sga.C16836a(1, 0, length, i);
    }
}
