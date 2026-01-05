package bj;

import ad.C0105l;
import ex.InterfaceC2139c;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;
import qw.C6361k;
import rw.AbstractC6662l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bj.a */
/* loaded from: classes.dex */
public final class C0669a {

    /* renamed from: a */
    public final /* synthetic */ int f4224a;

    /* renamed from: b */
    public int f4225b;

    /* renamed from: c */
    public final String f4226c;

    public /* synthetic */ C0669a(int i10, String str, int i11) {
        this.f4224a = i11;
        this.f4225b = i10;
        this.f4226c = str;
    }

    /* renamed from: a */
    public C6361k m1939a(String[] strArr) {
        Object obj;
        ArrayList arrayList = new ArrayList(strArr.length);
        int i10 = 0;
        for (String str : strArr) {
            arrayList.add(new C6361k(str, Integer.valueOf(AbstractC5178p.m10099J(this.f4226c, str, this.f4225b, false, 4))));
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            if (((Number) ((C6361k) obj2).f30756b).intValue() != -1) {
                arrayList2.add(obj2);
            }
        }
        Iterator it = arrayList2.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int iIntValue = ((Number) ((C6361k) next).f30756b).intValue();
                do {
                    Object next2 = it.next();
                    int iIntValue2 = ((Number) ((C6361k) next2).f30756b).intValue();
                    if (iIntValue > iIntValue2) {
                        next = next2;
                        iIntValue = iIntValue2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (C6361k) obj;
    }

    /* renamed from: b */
    public void m1940b(String[] strArr, C0105l c0105l) {
        C6361k c6361kM1939a = m1939a(strArr);
        if (c6361kM1939a == null) {
            throw new IllegalArgumentException(("Cannot find any of " + AbstractC6662l.m12708K(strArr)).toString());
        }
        String str = (String) c6361kM1939a.f30755a;
        int iIntValue = ((Number) c6361kM1939a.f30756b).intValue();
        String strSubstring = this.f4226c.substring(this.f4225b, iIntValue);
        AbstractC4154l.m8922e(strSubstring, "substring(...)");
        this.f4225b = iIntValue;
        c0105l.invoke(strSubstring);
        this.f4225b = str.length() + this.f4225b;
    }

    /* renamed from: c */
    public void m1941c(String[] strArr, InterfaceC2139c interfaceC2139c) {
        C6361k c6361kM1939a = m1939a(strArr);
        String str = this.f4226c;
        int iIntValue = c6361kM1939a != null ? ((Number) c6361kM1939a.f30756b).intValue() : str.length();
        String strSubstring = str.substring(this.f4225b, iIntValue);
        AbstractC4154l.m8922e(strSubstring, "substring(...)");
        this.f4225b = iIntValue;
        interfaceC2139c.invoke(strSubstring);
    }

    public String toString() {
        switch (this.f4224a) {
            case 2:
                StringBuilder sb2 = new StringBuilder("Scanner(remainingText='");
                String strSubstring = this.f4226c.substring(this.f4225b);
                AbstractC4154l.m8922e(strSubstring, "substring(...)");
                sb2.append(strSubstring);
                sb2.append("')");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public C0669a(String text) {
        this.f4224a = 2;
        AbstractC4154l.m8923f(text, "text");
        this.f4226c = text;
    }
}
