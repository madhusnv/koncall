package iz;

import eb.i3;
import fx.InterfaceC2395a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import kz.AbstractC4297c;
import pg.h9;
import qw.C6361k;
import rw.AbstractC6662l;
import rw.C6668r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: iz.v */
/* loaded from: classes3.dex */
public final class C3389v implements Iterable, InterfaceC2395a {

    /* renamed from: b */
    public static final C3389v f17980b = new C3389v(new String[0]);

    /* renamed from: a */
    public final String[] f17981a;

    public C3389v(String[] namesAndValues) {
        AbstractC4154l.m8923f(namesAndValues, "namesAndValues");
        this.f17981a = namesAndValues;
    }

    /* renamed from: b */
    public final String m7787b(String name) {
        AbstractC4154l.m8923f(name, "name");
        String[] namesAndValues = this.f17981a;
        AbstractC4154l.m8923f(namesAndValues, "namesAndValues");
        int length = namesAndValues.length - 2;
        int iM11687a = h9.m11687a(length, 0, -2);
        if (iM11687a > length) {
            return null;
        }
        while (!name.equalsIgnoreCase(namesAndValues[length])) {
            if (length == iM11687a) {
                return null;
            }
            length -= 2;
        }
        return namesAndValues[length + 1];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3389v) {
            return Arrays.equals(this.f17981a, ((C3389v) obj).f17981a);
        }
        return false;
    }

    /* renamed from: h */
    public final String m7788h(int i10) {
        String str = (String) AbstractC6662l.m12736z(i10 * 2, this.f17981a);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("name[" + i10 + ']');
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f17981a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        C6361k[] c6361kArr = new C6361k[size];
        for (int i10 = 0; i10 < size; i10++) {
            c6361kArr[i10] = new C6361k(m7788h(i10), m7790q(i10));
        }
        return AbstractC4154l.m8925h(c6361kArr);
    }

    /* renamed from: j */
    public final i3 m7789j() {
        i3 i3Var = new i3(2);
        ArrayList arrayList = i3Var.f9339a;
        AbstractC4154l.m8923f(arrayList, "<this>");
        String[] elements = this.f17981a;
        AbstractC4154l.m8923f(elements, "elements");
        arrayList.addAll(AbstractC6662l.m12711a(elements));
        return i3Var;
    }

    /* renamed from: q */
    public final String m7790q(int i10) {
        String str = (String) AbstractC6662l.m12736z((i10 * 2) + 1, this.f17981a);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("value[" + i10 + ']');
    }

    /* renamed from: r */
    public final List m7791r(String name) {
        AbstractC4154l.m8923f(name, "name");
        int size = size();
        List listUnmodifiableList = null;
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            if (name.equalsIgnoreCase(m7788h(i10))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(m7790q(i10));
            }
        }
        if (arrayList != null) {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            AbstractC4154l.m8922e(listUnmodifiableList, "unmodifiableList(...)");
        }
        return listUnmodifiableList == null ? C6668r.f31943a : listUnmodifiableList;
    }

    public final int size() {
        return this.f17981a.length / 2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            String strM7788h = m7788h(i10);
            String strM7790q = m7790q(i10);
            sb2.append(strM7788h);
            sb2.append(": ");
            if (AbstractC4297c.m9006j(strM7788h)) {
                strM7790q = "██";
            }
            sb2.append(strM7790q);
            sb2.append("\n");
        }
        return sb2.toString();
    }
}
