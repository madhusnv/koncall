package zr;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zr.a */
/* loaded from: classes3.dex */
public final class C9031a {

    /* renamed from: a */
    public final List f43484a;

    /* renamed from: b */
    public final List f43485b;

    /* renamed from: c */
    public final List f43486c;

    /* renamed from: d */
    public final List f43487d;

    /* renamed from: e */
    public final String f43488e;

    /* renamed from: f */
    public final boolean f43489f;

    /* renamed from: g */
    public final boolean f43490g;

    /* renamed from: h */
    public final boolean f43491h;

    public C9031a(List employeeList, List selectedEmployeeList, List list, List tempEmployeeList, String str, boolean z6, boolean z10, boolean z11) {
        AbstractC4154l.m8923f(employeeList, "employeeList");
        AbstractC4154l.m8923f(selectedEmployeeList, "selectedEmployeeList");
        AbstractC4154l.m8923f(tempEmployeeList, "tempEmployeeList");
        this.f43484a = employeeList;
        this.f43485b = selectedEmployeeList;
        this.f43486c = list;
        this.f43487d = tempEmployeeList;
        this.f43488e = str;
        this.f43489f = z6;
        this.f43490g = z10;
        this.f43491h = z11;
    }

    /* renamed from: a */
    public static C9031a m16495a(C9031a c9031a, List list, List list2, List list3, List list4, String str, boolean z6, boolean z10, boolean z11, int i10) {
        if ((i10 & 1) != 0) {
            list = c9031a.f43484a;
        }
        List employeeList = list;
        if ((i10 & 2) != 0) {
            list2 = c9031a.f43485b;
        }
        List selectedEmployeeList = list2;
        if ((i10 & 4) != 0) {
            list3 = c9031a.f43486c;
        }
        List mainEmployeeList = list3;
        if ((i10 & 8) != 0) {
            list4 = c9031a.f43487d;
        }
        List tempEmployeeList = list4;
        if ((i10 & 16) != 0) {
            str = c9031a.f43488e;
        }
        String searchText = str;
        if ((i10 & 32) != 0) {
            z6 = c9031a.f43489f;
        }
        boolean z12 = z6;
        boolean z13 = (i10 & 64) != 0 ? c9031a.f43490g : z10;
        boolean z14 = (i10 & 128) != 0 ? c9031a.f43491h : z11;
        c9031a.getClass();
        AbstractC4154l.m8923f(employeeList, "employeeList");
        AbstractC4154l.m8923f(selectedEmployeeList, "selectedEmployeeList");
        AbstractC4154l.m8923f(mainEmployeeList, "mainEmployeeList");
        AbstractC4154l.m8923f(tempEmployeeList, "tempEmployeeList");
        AbstractC4154l.m8923f(searchText, "searchText");
        return new C9031a(employeeList, selectedEmployeeList, mainEmployeeList, tempEmployeeList, searchText, z12, z13, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9031a)) {
            return false;
        }
        C9031a c9031a = (C9031a) obj;
        return AbstractC4154l.m8918a(this.f43484a, c9031a.f43484a) && AbstractC4154l.m8918a(this.f43485b, c9031a.f43485b) && AbstractC4154l.m8918a(this.f43486c, c9031a.f43486c) && AbstractC4154l.m8918a(this.f43487d, c9031a.f43487d) && AbstractC4154l.m8918a(this.f43488e, c9031a.f43488e) && this.f43489f == c9031a.f43489f && this.f43490g == c9031a.f43490g && this.f43491h == c9031a.f43491h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f43491h) + AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC0030c.m113d(AbstractC1452a.m4559f(this.f43487d, AbstractC1452a.m4559f(this.f43486c, AbstractC1452a.m4559f(this.f43485b, this.f43484a.hashCode() * 31, 31), 31), 31), 31, this.f43488e), 31, this.f43489f), 31, this.f43490g);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EmployeeState(employeeList=");
        sb2.append(this.f43484a);
        sb2.append(", selectedEmployeeList=");
        sb2.append(this.f43485b);
        sb2.append(", mainEmployeeList=");
        sb2.append(this.f43486c);
        sb2.append(", tempEmployeeList=");
        sb2.append(this.f43487d);
        sb2.append(", searchText=");
        AbstractC4801l.m9749w(sb2, this.f43488e, ", isEmployeeLoad=", this.f43489f, ", isSpecificEmployee=");
        sb2.append(this.f43490g);
        sb2.append(", isInternet=");
        sb2.append(this.f43491h);
        sb2.append(")");
        return sb2.toString();
    }
}
