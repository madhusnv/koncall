package p001o;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class p42 implements q92 {

    /* renamed from: a */
    public final Context f39300a;

    /* renamed from: b */
    public final b92 f39301b;

    /* renamed from: c */
    public final ua2 f39302c;

    /* renamed from: d */
    public final ta2 f39303d;

    /* renamed from: e */
    public final z92 f39304e;

    /* renamed from: f */
    public final List f39305f;

    /* renamed from: g */
    public final qu5 f39306g;

    /* renamed from: h */
    public final long f39307h;

    /* renamed from: i */
    public final Map f39308i = new HashMap();

    public p42(Context context, ua2 ua2Var, oa2 oa2Var, long j) {
        this.f39300a = context;
        this.f39302c = ua2Var;
        z92 z92VarM58951b = z92.m58951b(context, ua2Var.mo20193c());
        this.f39304e = z92VarM58951b;
        this.f39306g = qu5.m45842c(context);
        this.f39305f = m42956e(na2.m40264b(this, oa2Var));
        o42 o42Var = new o42(z92VarM58951b);
        this.f39301b = o42Var;
        ta2 ta2Var = new ta2(o42Var, 1);
        this.f39303d = ta2Var;
        o42Var.mo18285a(ta2Var);
        this.f39307h = j;
    }

    @Override // p001o.q92
    /* renamed from: a */
    public v92 mo42952a(String str) {
        if (this.f39305f.contains(str)) {
            return new f52(this.f39300a, this.f39304e, str, m42957f(str), this.f39301b, this.f39303d, this.f39302c.mo20192b(), this.f39302c.mo20193c(), this.f39306g, this.f39307h);
        }
        throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
    }

    @Override // p001o.q92
    /* renamed from: b */
    public Set mo42953b() {
        return new LinkedHashSet(this.f39305f);
    }

    @Override // p001o.q92
    /* renamed from: d */
    public b92 mo42955d() {
        return this.f39301b;
    }

    /* renamed from: e */
    public final List m42956e(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.equals("0") || str.equals("1")) {
                arrayList.add(str);
            } else if (s92.m48031a(this.f39304e, str)) {
                arrayList.add(str);
            } else {
                wja.m54627a("Camera2CameraFactory", "Camera " + str + " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE.");
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public m52 m42957f(String str) throws va2 {
        try {
            m52 m52Var = (m52) this.f39308i.get(str);
            if (m52Var != null) {
                return m52Var;
            }
            m52 m52Var2 = new m52(str, this.f39304e);
            this.f39308i.put(str, m52Var2);
            return m52Var2;
        } catch (h72 e) {
            throw wa2.m54130a(e);
        }
    }

    @Override // p001o.q92
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public z92 mo42954c() {
        return this.f39304e;
    }
}
