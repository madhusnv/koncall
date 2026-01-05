package ai;

import android.content.Context;
import com.amplifyframework.storage.ObjectMetadata;
import com.amplifyframework.storage.s3.C1230b;
import com.google.crypto.tink.shaded.protobuf.AbstractC1374a;
import com.google.crypto.tink.shaded.protobuf.AbstractC1382i;
import ec.C2007e;
import ec.InterfaceC2023u;
import ex.InterfaceC2137a;
import f00.InterfaceC2173b;
import h1.s1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k2.C3953b;
import kl.C4105a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import ml.AbstractC4787b;
import mm.C4802m;
import nd.EnumC5011b;
import nd.InterfaceC5016g;
import o1.m0;
import o1.n0;
import o1.q0;
import od.AbstractC5337a;
import qw.C6361k;
import rw.AbstractC6662l;
import rw.AbstractC6663m;
import rw.AbstractC6674x;
import sf.AbstractC6840z;
import tb.EnumC7093d;
import tb.o0;
import ug.m1;
import ug.n1;
import ug.u1;
import ug.v0;
import yk.C8687a;
import zf.C8946a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ai.h */
/* loaded from: classes.dex */
public abstract class AbstractC0151h implements InterfaceC5016g, o0, u1 {

    /* renamed from: a */
    public final Object f482a;

    public /* synthetic */ AbstractC0151h(Object obj) {
        this.f482a = obj;
    }

    /* renamed from: A */
    public abstract Object mo313A();

    /* renamed from: B */
    public abstract AbstractC1374a mo314B(AbstractC1382i abstractC1382i);

    /* renamed from: C */
    public void m315C(String name) {
        AbstractC4154l.m8923f(name, "name");
    }

    /* renamed from: D */
    public abstract void mo316D(AbstractC4787b abstractC4787b, C4105a c4105a);

    /* renamed from: E */
    public abstract int mo317E(AbstractC4787b abstractC4787b);

    /* renamed from: F */
    public void m318F(Object obj, String name) {
        AbstractC4154l.m8923f(name, "name");
        List listM342v = m342v(1, name);
        listM342v.clear();
        listM342v.add(obj);
    }

    /* renamed from: G */
    public abstract void mo319G(Object obj);

    /* renamed from: H */
    public void m320H(String str) {
        if (((Map) this.f482a).containsKey(ObjectMetadata.CONTENT_TYPE)) {
            return;
        }
        m318F(str, ObjectMetadata.CONTENT_TYPE);
    }

    /* renamed from: I */
    public LinkedHashMap m321I() {
        C4802m c4802m = (C4802m) this.f482a;
        return AbstractC6674x.m12779g(new C6361k("DCC", String.valueOf(c4802m.f23897i)), new C6361k("employeeNumber", String.valueOf(c4802m.f23891c)), new C6361k("employeeId", c4802m.f23908t));
    }

    /* renamed from: J */
    public abstract void mo322J(s1 s1Var);

    /* renamed from: K */
    public abstract void mo323K();

    /* renamed from: L */
    public abstract void mo324L(AbstractC1374a abstractC1374a);

    /* renamed from: M */
    public void mo325M() {
        m1 m1Var = ((n1) this.f482a).f35670g;
        n1.m14085m(m1Var);
        m1Var.mo325M();
    }

    @Override // ug.u1
    /* renamed from: a */
    public v0 mo326a() {
        throw null;
    }

    @Override // ug.u1
    /* renamed from: b */
    public m1 mo327b() {
        throw null;
    }

    @Override // ug.u1
    /* renamed from: c */
    public C8687a mo328c() {
        throw null;
    }

    @Override // nd.InterfaceC5016g
    /* renamed from: f */
    public void mo329f(Throwable th2, InterfaceC2137a msg) {
        InterfaceC2173b interfaceC2173b = (InterfaceC2173b) this.f482a;
        AbstractC4154l.m8923f(msg, "msg");
        if (mo331h(EnumC5011b.Warning)) {
            if (th2 != null) {
                interfaceC2173b.warn((String) msg.invoke(), th2);
            } else {
                interfaceC2173b.warn((String) msg.invoke());
            }
        }
    }

    @Override // nd.InterfaceC5016g
    /* renamed from: g */
    public void mo330g(Throwable th2, InterfaceC2137a msg) {
        InterfaceC2173b interfaceC2173b = (InterfaceC2173b) this.f482a;
        AbstractC4154l.m8923f(msg, "msg");
        if (mo331h(EnumC5011b.Trace)) {
            if (th2 != null) {
                interfaceC2173b.mo5842r((String) msg.invoke(), th2);
            } else {
                interfaceC2173b.mo5846v((String) msg.invoke());
            }
        }
    }

    @Override // nd.InterfaceC5016g
    /* renamed from: h */
    public boolean mo331h(EnumC5011b level) {
        InterfaceC2173b interfaceC2173b = (InterfaceC2173b) this.f482a;
        AbstractC4154l.m8923f(level, "level");
        int i10 = AbstractC5337a.f26253a[level.ordinal()];
        if (i10 == 1) {
            return interfaceC2173b.mo5836l();
        }
        if (i10 == 2) {
            return interfaceC2173b.mo5829e();
        }
        if (i10 == 3) {
            return interfaceC2173b.mo5835k();
        }
        if (i10 == 4) {
            return interfaceC2173b.mo5827c();
        }
        if (i10 == 5) {
            return interfaceC2173b.mo5832h();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // nd.InterfaceC5016g
    /* renamed from: i */
    public void mo332i(Throwable th2, InterfaceC2137a msg) {
        InterfaceC2173b interfaceC2173b = (InterfaceC2173b) this.f482a;
        AbstractC4154l.m8923f(msg, "msg");
        if (mo331h(EnumC5011b.Debug)) {
            if (th2 != null) {
                interfaceC2173b.mo5844t((String) msg.invoke(), th2);
            } else {
                interfaceC2173b.debug((String) msg.invoke());
            }
        }
    }

    @Override // ug.u1
    /* renamed from: j */
    public Context mo333j() {
        throw null;
    }

    @Override // ug.u1
    /* renamed from: l */
    public C8946a mo334l() {
        throw null;
    }

    /* renamed from: o */
    public void m335o(q0 q0Var, ArrayList arrayList) {
        int i10 = n0.f25795a[((m0) this.f482a).ordinal()];
    }

    /* renamed from: p */
    public void m336p(Object obj, String name) {
        AbstractC4154l.m8923f(name, "name");
        m342v(1, name).add(obj);
    }

    /* renamed from: q */
    public void m337q(InterfaceC2023u valuesMap) {
        AbstractC4154l.m8923f(valuesMap, "valuesMap");
        valuesMap.m5748b(new C1230b(4, this));
    }

    /* renamed from: r */
    public void m338r(String name, List values) {
        AbstractC4154l.m8923f(name, "name");
        AbstractC4154l.m8923f(values, "values");
        List listM342v = m342v(values.size(), name);
        Iterator it = values.iterator();
        while (it.hasNext()) {
            listM342v.add(it.next());
        }
    }

    /* renamed from: s */
    public boolean m339s(String name) {
        AbstractC4154l.m8923f(name, "name");
        return ((Map) this.f482a).containsKey(name);
    }

    /* renamed from: t */
    public abstract Object mo340t(Object obj);

    /* renamed from: u */
    public abstract Object mo341u(AbstractC1374a abstractC1374a);

    /* renamed from: v */
    public List m342v(int i10, String str) {
        Map map = (Map) this.f482a;
        List list = (List) map.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList(i10);
        map.put(str, arrayList);
        return arrayList;
    }

    /* renamed from: w */
    public Object m343w(Object obj) {
        synchronized (((HashMap) this.f482a)) {
            try {
                if (((HashMap) this.f482a).containsKey(obj)) {
                    return ((HashMap) this.f482a).get(obj);
                }
                Object objMo340t = mo340t(obj);
                ((HashMap) this.f482a).put(obj, objMo340t);
                return objMo340t;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: x */
    public Object m344x(String str) {
        List list = (List) ((Map) this.f482a).get(str);
        if (list != null) {
            return AbstractC6663m.m12743G(list);
        }
        return null;
    }

    /* renamed from: y */
    public abstract Object mo345y();

    /* renamed from: z */
    public abstract InterfaceC2137a mo346z();

    public AbstractC0151h(int i10) {
        switch (i10) {
            case 2:
                this.f482a = new C2007e();
                break;
            case 3:
                this.f482a = C3953b.m8517t(Boolean.FALSE);
                break;
            default:
                this.f482a = new HashMap();
                break;
        }
    }

    public AbstractC0151h(n1 n1Var) {
        AbstractC6840z.m13036g(n1Var);
        this.f482a = n1Var;
    }

    public AbstractC0151h(C4802m userSimDetails) {
        AbstractC4154l.m8923f(userSimDetails, "userSimDetails");
        this.f482a = userSimDetails;
    }

    public AbstractC0151h(EnumC7093d algorithm, InterfaceC2137a interfaceC2137a) {
        AbstractC4154l.m8923f(algorithm, "algorithm");
        this.f482a = algorithm;
        Set setM12710M = AbstractC6662l.m12710M(new EnumC7093d[]{EnumC7093d.SIGV4, EnumC7093d.SIGV4_ASYMMETRIC});
        if (setM12710M.contains(algorithm)) {
            return;
        }
        throw new IllegalStateException(("This class should only be used for " + AbstractC6663m.m12748L(setM12710M, null, null, null, null, 63) + ", got " + algorithm).toString());
    }
}
