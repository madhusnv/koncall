package p001o;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class t4f {

    /* renamed from: a */
    public final String f46365a;

    /* renamed from: b */
    public int f46366b;

    public t4f(String str) {
        sq8.m48649h(str, "text");
        this.f46365a = str;
    }

    /* renamed from: a */
    public final hwc m49292a(String[] strArr) {
        Object obj;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(vyh.m53620a(str, Integer.valueOf(f9g.b0(this.f46365a, str, this.f46366b, false, 4, null))));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((Number) ((hwc) obj2).m31228b()).intValue() != -1) {
                arrayList2.add(obj2);
            }
        }
        Iterator it = arrayList2.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int iIntValue = ((Number) ((hwc) next).m31228b()).intValue();
                do {
                    Object next2 = it.next();
                    int iIntValue2 = ((Number) ((hwc) next2).m31228b()).intValue();
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
        return (hwc) obj;
    }

    /* renamed from: b */
    public final void m49293b(String str, uk7 uk7Var) {
        sq8.m48649h(str, "prefix");
        sq8.m48649h(uk7Var, "handler");
        if (m49299h(str)) {
            uk7Var.invoke();
        }
    }

    /* renamed from: c */
    public final void m49294c(String str, uk7 uk7Var) {
        sq8.m48649h(str, "prefix");
        sq8.m48649h(uk7Var, "handler");
        if (m49299h(str)) {
            this.f46366b += str.length();
            uk7Var.invoke();
        }
    }

    /* renamed from: d */
    public final void m49295d(String[] strArr, xk7 xk7Var) {
        sq8.m48649h(strArr, "literals");
        sq8.m48649h(xk7Var, "handler");
        hwc hwcVarM49292a = m49292a(strArr);
        if (hwcVarM49292a != null) {
            m49297f((String) hwcVarM49292a.m31227a(), ((Number) hwcVarM49292a.m31228b()).intValue(), xk7Var);
        }
    }

    /* renamed from: e */
    public final void m49296e(int i, xk7 xk7Var) {
        String strSubstring = this.f46365a.substring(this.f46366b, i);
        sq8.m48648g(strSubstring, "substring(...)");
        this.f46366b = i;
        xk7Var.invoke(strSubstring);
    }

    /* renamed from: f */
    public final void m49297f(String str, int i, xk7 xk7Var) {
        m49296e(i, xk7Var);
        this.f46366b += str.length();
    }

    /* renamed from: g */
    public final void m49298g(String[] strArr, xk7 xk7Var) {
        sq8.m48649h(strArr, "literals");
        sq8.m48649h(xk7Var, "handler");
        hwc hwcVarM49292a = m49292a(strArr);
        if (hwcVarM49292a != null) {
            m49297f((String) hwcVarM49292a.m31227a(), ((Number) hwcVarM49292a.m31228b()).intValue(), xk7Var);
            return;
        }
        throw new IllegalArgumentException(("Cannot find any of " + gp0.D0(strArr)).toString());
    }

    /* renamed from: h */
    public final boolean m49299h(String str) {
        sq8.m48649h(str, "prefix");
        return e9g.m24588B(this.f46365a, this.f46366b, str, 0, str.length(), false, 16, null);
    }

    /* renamed from: i */
    public final void m49300i(String[] strArr, xk7 xk7Var) {
        sq8.m48649h(strArr, "literals");
        sq8.m48649h(xk7Var, "handler");
        hwc hwcVarM49292a = m49292a(strArr);
        m49296e(hwcVarM49292a != null ? ((Number) hwcVarM49292a.m31230d()).intValue() : this.f46365a.length(), xk7Var);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Scanner(remainingText='");
        String strSubstring = this.f46365a.substring(this.f46366b);
        sq8.m48648g(strSubstring, "substring(...)");
        sb.append(strSubstring);
        sb.append("')");
        return sb.toString();
    }
}
