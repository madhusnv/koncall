package androidx.compose.ui.platform;

import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import androidx.compose.ui.platform.C1965f;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p001o.bb;
import p001o.hue;
import p001o.idc;
import p001o.jcf;
import p001o.jdc;
import p001o.kcf;
import p001o.kf9;
import p001o.kh3;
import p001o.lcf;
import p001o.lza;
import p001o.mfe;
import p001o.pcf;
import p001o.q6f;
import p001o.qh9;
import p001o.rcf;
import p001o.scf;
import p001o.sq8;
import p001o.tcf;
import p001o.th9;
import p001o.xcf;
import p001o.xk7;
import p001o.zh9;

/* renamed from: androidx.compose.ui.platform.g */
/* loaded from: classes2.dex */
public abstract class AbstractC1966g {

    /* renamed from: androidx.compose.ui.platform.g$a */
    public static final class a extends kf9 implements xk7 {

        /* renamed from: a */
        public static final a f6480a = new a();

        public a() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(zh9 zh9Var) {
            sq8.m48649h(zh9Var, "it");
            kcf kcfVarM59446x = zh9Var.m59446x();
            return Boolean.valueOf((kcfVarM59446x != null && kcfVarM59446x.m35420v()) && kcfVarM59446x.m35414e(jcf.f30155a.m33553t()));
        }
    }

    /* renamed from: A */
    public static final boolean m5213A(pcf pcfVar) {
        return pcfVar.m43362n().getLayoutDirection() == qh9.Rtl;
    }

    /* renamed from: B */
    public static final boolean m5214B(pcf pcfVar) {
        return pcfVar.m43369u().m35414e(jcf.f30155a.m33553t());
    }

    /* renamed from: C */
    public static final Boolean m5215C(pcf pcfVar) {
        return (Boolean) lcf.m36963a(pcfVar.m43360l(), tcf.f46841a.m49725l());
    }

    /* renamed from: D */
    public static final boolean m5216D(pcf pcfVar) {
        return (pcfVar.m43372x() || pcfVar.m43369u().m35414e(tcf.f46841a.m49724k())) ? false : true;
    }

    /* renamed from: E */
    public static final boolean m5217E(jdc jdcVar, jdc jdcVar2) {
        return (jdcVar.isEmpty() || jdcVar2.isEmpty() || Math.max(((Number) jdcVar.getStart()).floatValue(), ((Number) jdcVar2.getStart()).floatValue()) >= Math.min(((Number) jdcVar.mo31936a()).floatValue(), ((Number) jdcVar2.mo31936a()).floatValue())) ? false : true;
    }

    /* renamed from: F */
    public static final boolean m5218F(pcf pcfVar, C1965f.g gVar) {
        Iterator it = gVar.m5198c().iterator();
        while (it.hasNext()) {
            if (!pcfVar.m43360l().m35414e((xcf) ((Map.Entry) it.next()).getKey())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: G */
    public static final jdc m5219G(float f, float f2) {
        return new idc(f, f2);
    }

    /* renamed from: H */
    public static final View m5220H(AndroidViewsHandler androidViewsHandler, int i) {
        Object next;
        sq8.m48649h(androidViewsHandler, "<this>");
        Set<Map.Entry<zh9, AndroidViewHolder>> setEntrySet = androidViewsHandler.getLayoutNodeToHolder().entrySet();
        sq8.m48648g(setEntrySet, "layoutNodeToHolder.entries");
        Iterator<T> it = setEntrySet.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((zh9) ((Map.Entry) next).getKey()).m59433Z() == i) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (AndroidViewHolder) entry.getValue();
        }
        return null;
    }

    /* renamed from: I */
    public static final String m5221I(int i) {
        hue.C14080a c14080a = hue.f27559b;
        if (hue.m31147k(i, c14080a.m31151a())) {
            return "android.widget.Button";
        }
        if (hue.m31147k(i, c14080a.m31152b())) {
            return "android.widget.CheckBox";
        }
        if (hue.m31147k(i, c14080a.m31155e())) {
            return "android.widget.RadioButton";
        }
        if (hue.m31147k(i, c14080a.m31154d())) {
            return "android.widget.ImageView";
        }
        if (hue.m31147k(i, c14080a.m31153c())) {
            return "android.widget.Spinner";
        }
        return null;
    }

    /* renamed from: p */
    public static final boolean m5237p(bb bbVar, Object obj) {
        if (bbVar == obj) {
            return true;
        }
        if (!(obj instanceof bb)) {
            return false;
        }
        bb bbVar2 = (bb) obj;
        if (!sq8.m48644c(bbVar.m18512b(), bbVar2.m18512b())) {
            return false;
        }
        if (bbVar.m18511a() != null || bbVar2.m18511a() == null) {
            return bbVar.m18511a() == null || bbVar2.m18511a() != null;
        }
        return false;
    }

    /* renamed from: q */
    public static final boolean m5238q(pcf pcfVar) {
        return lcf.m36963a(pcfVar.m43360l(), tcf.f46841a.m49717d()) == null;
    }

    /* renamed from: r */
    public static final boolean m5239r(pcf pcfVar) {
        if (m5214B(pcfVar) && !sq8.m48644c(lcf.m36963a(pcfVar.m43369u(), tcf.f46841a.m49720g()), Boolean.TRUE)) {
            return true;
        }
        zh9 zh9VarM5241t = m5241t(pcfVar.m43363o(), a.f6480a);
        if (zh9VarM5241t != null) {
            kcf kcfVarM59446x = zh9VarM5241t.m59446x();
            if (!(kcfVarM59446x != null ? sq8.m48644c(lcf.m36963a(kcfVarM59446x, tcf.f46841a.m49720g()), Boolean.TRUE) : false)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: s */
    public static final q6f m5240s(List list, int i) {
        sq8.m48649h(list, "<this>");
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((q6f) list.get(i2)).m44870d() == i) {
                return (q6f) list.get(i2);
            }
        }
        return null;
    }

    /* renamed from: t */
    public static final zh9 m5241t(zh9 zh9Var, xk7 xk7Var) {
        for (zh9 zh9VarM59431X = zh9Var.m59431X(); zh9VarM59431X != null; zh9VarM59431X = zh9VarM59431X.m59431X()) {
            if (((Boolean) xk7Var.invoke(zh9VarM59431X)).booleanValue()) {
                return zh9VarM59431X;
            }
        }
        return null;
    }

    /* renamed from: u */
    public static final Map m5242u(scf scfVar) {
        sq8.m48649h(scfVar, "<this>");
        pcf pcfVarM48206a = scfVar.m48206a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (pcfVarM48206a.m43363o().mo49883a() && pcfVarM48206a.m43363o().s0()) {
            Region region = new Region();
            mfe mfeVarM43356h = pcfVarM48206a.m43356h();
            region.set(new Rect(lza.m38121d(mfeVarM43356h.m38945f()), lza.m38121d(mfeVarM43356h.m38948i()), lza.m38121d(mfeVarM43356h.m38946g()), lza.m38121d(mfeVarM43356h.m38942c())));
            m5243v(region, pcfVarM48206a, linkedHashMap, pcfVarM48206a);
        }
        return linkedHashMap;
    }

    /* renamed from: v */
    public static final void m5243v(Region region, pcf pcfVar, Map map, pcf pcfVar2) {
        th9 th9VarM43362n;
        boolean z = false;
        boolean z2 = (pcfVar2.m43363o().mo49883a() && pcfVar2.m43363o().s0()) ? false : true;
        if (!region.isEmpty() || pcfVar2.m43361m() == pcfVar.m43361m()) {
            if (!z2 || pcfVar2.m43370v()) {
                mfe mfeVarM43368t = pcfVar2.m43368t();
                Rect rect = new Rect(lza.m38121d(mfeVarM43368t.m38945f()), lza.m38121d(mfeVarM43368t.m38948i()), lza.m38121d(mfeVarM43368t.m38946g()), lza.m38121d(mfeVarM43368t.m38942c()));
                Region region2 = new Region();
                region2.set(rect);
                int iM43361m = pcfVar2.m43361m() == pcfVar.m43361m() ? -1 : pcfVar2.m43361m();
                if (region2.op(region, region2, Region.Op.INTERSECT)) {
                    Integer numValueOf = Integer.valueOf(iM43361m);
                    Rect bounds = region2.getBounds();
                    sq8.m48648g(bounds, "region.bounds");
                    map.put(numValueOf, new rcf(pcfVar2, bounds));
                    List listM43366r = pcfVar2.m43366r();
                    for (int size = listM43366r.size() - 1; -1 < size; size--) {
                        m5243v(region, pcfVar, map, (pcf) listM43366r.get(size));
                    }
                    region.op(rect, region, Region.Op.REVERSE_DIFFERENCE);
                    return;
                }
                if (!pcfVar2.m43370v()) {
                    if (iM43361m == -1) {
                        Integer numValueOf2 = Integer.valueOf(iM43361m);
                        Rect bounds2 = region2.getBounds();
                        sq8.m48648g(bounds2, "region.bounds");
                        map.put(numValueOf2, new rcf(pcfVar2, bounds2));
                        return;
                    }
                    return;
                }
                pcf pcfVarM43364p = pcfVar2.m43364p();
                if (pcfVarM43364p != null && (th9VarM43362n = pcfVarM43364p.m43362n()) != null && th9VarM43362n.mo49883a()) {
                    z = true;
                }
                mfe mfeVarM43356h = z ? pcfVarM43364p.m43356h() : new mfe(0.0f, 0.0f, 10.0f, 10.0f);
                map.put(Integer.valueOf(iM43361m), new rcf(pcfVar2, new Rect(lza.m38121d(mfeVarM43356h.m38945f()), lza.m38121d(mfeVarM43356h.m38948i()), lza.m38121d(mfeVarM43356h.m38946g()), lza.m38121d(mfeVarM43356h.m38942c()))));
            }
        }
    }

    /* renamed from: w */
    public static final float m5244w(pcf pcfVar) {
        kcf kcfVarM43360l = pcfVar.m43360l();
        tcf tcfVar = tcf.f46841a;
        if (kcfVarM43360l.m35414e(tcfVar.m49738y())) {
            return ((Number) pcfVar.m43360l().m35416n(tcfVar.m49738y())).floatValue();
        }
        return 0.0f;
    }

    /* renamed from: x */
    public static final String m5245x(pcf pcfVar) {
        List list = (List) lcf.m36963a(pcfVar.m43369u(), tcf.f46841a.m49716c());
        if (list != null) {
            return (String) kh3.h0(list);
        }
        return null;
    }

    /* renamed from: y */
    public static final boolean m5246y(pcf pcfVar) {
        return pcfVar.m43360l().m35414e(tcf.f46841a.m49727n());
    }

    /* renamed from: z */
    public static final boolean m5247z(pcf pcfVar) {
        return pcfVar.m43360l().m35414e(tcf.f46841a.m49728o());
    }
}
