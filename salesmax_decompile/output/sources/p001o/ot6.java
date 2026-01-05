package p001o;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import p001o.ht6;

/* loaded from: classes2.dex */
public abstract class ot6 {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final List m42651a(List list, List list2) {
        sq8.m48649h(list, "f1");
        sq8.m48649h(list2, "f2");
        Iterator it = ch3.m21247l(list2).iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        dl8 dl8Var = (dl8) it;
        int iMo23412a = dl8Var.mo23412a();
        if (it.hasNext()) {
            float fM42652b = m42652b(((bnd) list.get(0)).m19450a(), ((bnd) list2.get(iMo23412a)).m19450a());
            do {
                int iMo23412a2 = dl8Var.mo23412a();
                float fM42652b2 = m42652b(((bnd) list.get(0)).m19450a(), ((bnd) list2.get(iMo23412a2)).m19450a());
                if (Float.compare(fM42652b, fM42652b2) > 0) {
                    iMo23412a = iMo23412a2;
                    fM42652b = fM42652b2;
                }
            } while (it.hasNext());
        }
        int size = list.size();
        int size2 = list2.size();
        List listM21252q = ch3.m21252q(list2.get(iMo23412a));
        int i = iMo23412a;
        for (int i2 = 1; i2 < size; i2++) {
            int i3 = iMo23412a - (size - i2);
            if (i3 <= i) {
                i3 += size2;
            }
            Iterator it2 = new kl8(i + 1, i3).iterator();
            if (!it2.hasNext()) {
                throw new NoSuchElementException();
            }
            dl8 dl8Var2 = (dl8) it2;
            int iMo23412a3 = dl8Var2.mo23412a();
            if (it2.hasNext()) {
                float fM42652b3 = m42652b(((bnd) list.get(i2)).m19450a(), ((bnd) list2.get(iMo23412a3 % size2)).m19450a());
                do {
                    int iMo23412a4 = dl8Var2.mo23412a();
                    float fM42652b4 = m42652b(((bnd) list.get(i2)).m19450a(), ((bnd) list2.get(iMo23412a4 % size2)).m19450a());
                    if (Float.compare(fM42652b3, fM42652b4) > 0) {
                        iMo23412a3 = iMo23412a4;
                        fM42652b3 = fM42652b4;
                    }
                } while (it2.hasNext());
            }
            i = iMo23412a3;
            listM21252q.add(list2.get(i % size2));
        }
        return listM21252q;
    }

    /* renamed from: b */
    public static final float m42652b(ht6 ht6Var, ht6 ht6Var2) {
        sq8.m48649h(ht6Var, "f1");
        sq8.m48649h(ht6Var2, "f2");
        if ((ht6Var instanceof ht6.C14063a) && (ht6Var2 instanceof ht6.C14063a) && ((ht6.C14063a) ht6Var).m31111c() != ((ht6.C14063a) ht6Var2).m31111c()) {
            return Float.MAX_VALUE;
        }
        float fM57493b = (((yc4) kh3.f0(ht6Var.m31109a())).m57493b() + ((yc4) kh3.r0(ht6Var.m31109a())).m57495d()) / 2.0f;
        float fM57494c = (((yc4) kh3.f0(ht6Var.m31109a())).m57494c() + ((yc4) kh3.r0(ht6Var.m31109a())).m57496e()) / 2.0f;
        float fM57493b2 = fM57493b - ((((yc4) kh3.f0(ht6Var2.m31109a())).m57493b() + ((yc4) kh3.r0(ht6Var2.m31109a())).m57495d()) / 2.0f);
        float fM57494c2 = fM57494c - ((((yc4) kh3.f0(ht6Var2.m31109a())).m57494c() + ((yc4) kh3.r0(ht6Var2.m31109a())).m57496e()) / 2.0f);
        return (fM57493b2 * fM57493b2) + (fM57494c2 * fM57494c2);
    }

    /* renamed from: c */
    public static final hx5 m42653c(List list, List list2) {
        sq8.m48649h(list, "features1");
        sq8.m48649h(list2, "features2");
        List listM18961c = bh3.m18961c();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((bnd) list.get(i)).m19450a() instanceof ht6.C14063a) {
                listM18961c.add(list.get(i));
            }
        }
        List listM18959a = bh3.m18959a(listM18961c);
        List listM18961c2 = bh3.m18961c();
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((bnd) list2.get(i2)).m19450a() instanceof ht6.C14063a) {
                listM18961c2.add(list2.get(i2));
            }
        }
        List listM18959a2 = bh3.m18959a(listM18961c2);
        hwc hwcVarM53620a = listM18959a.size() > listM18959a2.size() ? vyh.m53620a(m42651a(listM18959a2, listM18959a), listM18959a2) : vyh.m53620a(listM18959a, m42651a(listM18959a, listM18959a2));
        List list3 = (List) hwcVarM53620a.m31227a();
        List list4 = (List) hwcVarM53620a.m31228b();
        List listM18961c3 = bh3.m18961c();
        int size3 = list3.size();
        for (int i3 = 0; i3 < size3 && i3 != list4.size(); i3++) {
            listM18961c3.add(vyh.m53620a(Float.valueOf(((bnd) list3.get(i3)).m19451b()), Float.valueOf(((bnd) list4.get(i3)).m19451b())));
        }
        hwc[] hwcVarArr = (hwc[]) bh3.m18959a(listM18961c3).toArray(new hwc[0]);
        return new hx5((hwc[]) Arrays.copyOf(hwcVarArr, hwcVarArr.length));
    }
}
