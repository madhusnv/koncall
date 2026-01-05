package t3;

import java.util.ArrayList;
import java.util.List;
import s4.AbstractC6746b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public interface o0 {
    default int maxIntrinsicHeight(InterfaceC7028o interfaceC7028o, List list, int i10) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            List list2 = (List) arrayList.get(i11);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList3.add(new C7024k((i0) list2.get(i12), EnumC7029p.Max, EnumC7030q.Height, 0));
            }
            arrayList2.add(arrayList3);
        }
        return mo16690measure3p2s80s(new C7032s(interfaceC7028o, interfaceC7028o.getLayoutDirection()), arrayList2, AbstractC6746b.m12924b(i10, 0, 13)).getHeight();
    }

    default int maxIntrinsicWidth(InterfaceC7028o interfaceC7028o, List list, int i10) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            List list2 = (List) arrayList.get(i11);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList3.add(new C7024k((i0) list2.get(i12), EnumC7029p.Max, EnumC7030q.Width, 0));
            }
            arrayList2.add(arrayList3);
        }
        return mo16690measure3p2s80s(new C7032s(interfaceC7028o, interfaceC7028o.getLayoutDirection()), arrayList2, AbstractC6746b.m12924b(0, i10, 7)).mo12108b();
    }

    /* renamed from: measure-3p2s80s */
    k0 mo16690measure3p2s80s(l0 l0Var, List list, long j6);

    default int minIntrinsicHeight(InterfaceC7028o interfaceC7028o, List list, int i10) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            List list2 = (List) arrayList.get(i11);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList3.add(new C7024k((i0) list2.get(i12), EnumC7029p.Min, EnumC7030q.Height, 0));
            }
            arrayList2.add(arrayList3);
        }
        return mo16690measure3p2s80s(new C7032s(interfaceC7028o, interfaceC7028o.getLayoutDirection()), arrayList2, AbstractC6746b.m12924b(i10, 0, 13)).getHeight();
    }

    default int minIntrinsicWidth(InterfaceC7028o interfaceC7028o, List list, int i10) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            List list2 = (List) arrayList.get(i11);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList3.add(new C7024k((i0) list2.get(i12), EnumC7029p.Min, EnumC7030q.Width, 0));
            }
            arrayList2.add(arrayList3);
        }
        return mo16690measure3p2s80s(new C7032s(interfaceC7028o, interfaceC7028o.getLayoutDirection()), arrayList2, AbstractC6746b.m12924b(0, i10, 7)).mo12108b();
    }
}
