package hd;

import com.amplifyframework.core.model.ModelIdentifier;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5185w;
import og.pe;
import og.wd;
import pf.C5904d;
import pg.AbstractC5932m;
import rf.InterfaceC6505j;
import rw.AbstractC6662l;
import rw.AbstractC6663m;
import sf.AbstractC6840z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hd.e */
/* loaded from: classes.dex */
public final class C2893e {

    /* renamed from: a */
    public boolean f15922a;

    /* renamed from: b */
    public int f15923b;

    /* renamed from: c */
    public Object f15924c = new StringBuilder();

    /* renamed from: d */
    public Object f15925d = pe.m10835j(EnumC2908t.Initial);

    public C2893e(boolean z6) {
        this.f15922a = z6;
    }

    /* renamed from: b */
    public static C2893e m7007b() {
        C2893e c2893e = new C2893e();
        c2893e.f15922a = true;
        c2893e.f15923b = 0;
        return c2893e;
    }

    /* renamed from: a */
    public C2893e m7008a() {
        AbstractC6840z.m13030a("execute parameter required", ((InterfaceC6505j) this.f15924c) != null);
        C5904d[] c5904dArr = (C5904d[]) this.f15925d;
        boolean z6 = this.f15922a;
        int i10 = this.f15923b;
        C2893e c2893e = new C2893e();
        c2893e.f15925d = this;
        c2893e.f15924c = c5904dArr;
        boolean z10 = false;
        if (c5904dArr != null && z6) {
            z10 = true;
        }
        c2893e.f15922a = z10;
        c2893e.f15923b = i10;
        return c2893e;
    }

    /* renamed from: c */
    public void m7009c(String str, EnumC2908t... enumC2908tArr) {
        StringBuilder sb2 = (StringBuilder) this.f15924c;
        if (this.f15922a) {
            sb2.append('\n');
        }
        this.f15923b--;
        m7013g();
        sb2.append(str);
        ArrayList arrayList = (ArrayList) this.f15925d;
        AbstractC4154l.m8923f(arrayList, "<this>");
        EnumC2908t enumC2908t = (EnumC2908t) AbstractC6663m.m12757U(arrayList);
        if (AbstractC6662l.m12713c(enumC2908tArr, enumC2908t)) {
            return;
        }
        throw new IllegalStateException(("Invalid JSON encoder state " + enumC2908t + "; expected one of " + AbstractC6662l.m12702E(enumC2908tArr, null, null, 63)).toString());
    }

    /* renamed from: d */
    public void m7010d(String str) {
        boolean z6 = this.f15922a;
        StringBuilder sb2 = (StringBuilder) this.f15924c;
        ArrayList arrayList = (ArrayList) this.f15925d;
        int i10 = AbstractC2892d.f15921a[((EnumC2908t) wd.m11034b(arrayList)).ordinal()];
        if (i10 == 1) {
            wd.m11033a(arrayList, EnumC2908t.ArrayNextValueOrEnd);
            m7013g();
        } else if (i10 == 2) {
            sb2.append(",");
            if (z6) {
                sb2.append('\n');
            }
            m7013g();
        } else if (i10 == 3) {
            sb2.append(":");
            if (z6) {
                sb2.append(" ");
            }
            wd.m11033a(arrayList, EnumC2908t.ObjectNextKeyOrEnd);
        }
        sb2.append(str);
    }

    /* renamed from: e */
    public void m7011e() {
        m7009c("}", EnumC2908t.ObjectFirstKeyOrEnd, EnumC2908t.ObjectNextKeyOrEnd);
    }

    /* renamed from: f */
    public byte[] m7012f() {
        String string = ((StringBuilder) this.f15924c).toString();
        AbstractC4154l.m8922e(string, "toString(...)");
        return AbstractC5185w.m10128j(string);
    }

    /* renamed from: g */
    public void m7013g() {
        int i10;
        if (!this.f15922a || (i10 = this.f15923b) <= 0) {
            return;
        }
        ((StringBuilder) this.f15924c).append(AbstractC5185w.m10134p(i10 * 4, " "));
    }

    /* renamed from: h */
    public void m7014h(String name) {
        StringBuilder sb2 = (StringBuilder) this.f15924c;
        AbstractC4154l.m8923f(name, "name");
        ArrayList arrayList = (ArrayList) this.f15925d;
        if (wd.m11034b(arrayList) == EnumC2908t.ObjectNextKeyOrEnd) {
            sb2.append(",");
            if (this.f15922a) {
                sb2.append('\n');
            }
        }
        m7013g();
        String strM11773a = AbstractC5932m.m11773a(name);
        sb2.append(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
        sb2.append(strM11773a);
        sb2.append(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
        wd.m11033a(arrayList, EnumC2908t.ObjectFieldValue);
    }

    /* renamed from: i */
    public void m7015i(String value) {
        AbstractC4154l.m8923f(value, "value");
        m7010d(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR + AbstractC5932m.m11773a(value) + '\"');
    }
}
