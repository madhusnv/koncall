package p001o;

import java.io.Serializable;

/* loaded from: classes6.dex */
public final class vxh implements Serializable {

    /* renamed from: a */
    public final Object f51009a;

    /* renamed from: b */
    public final Object f51010b;

    /* renamed from: c */
    public final Object f51011c;

    public vxh(Object obj, Object obj2, Object obj3) {
        this.f51009a = obj;
        this.f51010b = obj2;
        this.f51011c = obj3;
    }

    /* renamed from: a */
    public final Object m53590a() {
        return this.f51009a;
    }

    /* renamed from: b */
    public final Object m53591b() {
        return this.f51010b;
    }

    /* renamed from: c */
    public final Object m53592c() {
        return this.f51011c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vxh)) {
            return false;
        }
        vxh vxhVar = (vxh) obj;
        return sq8.m48644c(this.f51009a, vxhVar.f51009a) && sq8.m48644c(this.f51010b, vxhVar.f51010b) && sq8.m48644c(this.f51011c, vxhVar.f51011c);
    }

    public int hashCode() {
        Object obj = this.f51009a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f51010b;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f51011c;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f51009a + ", " + this.f51010b + ", " + this.f51011c + ')';
    }
}
