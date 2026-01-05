package androidx.databinding;

import android.view.View;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import p001o.ewi;
import p001o.xt4;
import p001o.yt4;

/* loaded from: classes2.dex */
public class MergedDataBinderMapper extends xt4 {

    /* renamed from: a */
    public Set f7203a = new HashSet();

    /* renamed from: b */
    public List f7204b = new CopyOnWriteArrayList();

    /* renamed from: c */
    public List f7205c = new CopyOnWriteArrayList();

    @Override // p001o.xt4
    /* renamed from: b */
    public ewi mo4b(yt4 yt4Var, View view, int i) {
        Iterator it = this.f7204b.iterator();
        while (it.hasNext()) {
            ewi ewiVarMo4b = ((xt4) it.next()).mo4b(yt4Var, view, i);
            if (ewiVarMo4b != null) {
                return ewiVarMo4b;
            }
        }
        if (m5958f()) {
            return mo4b(yt4Var, view, i);
        }
        return null;
    }

    @Override // p001o.xt4
    /* renamed from: c */
    public ewi mo5c(yt4 yt4Var, View[] viewArr, int i) {
        Iterator it = this.f7204b.iterator();
        while (it.hasNext()) {
            ewi ewiVarMo5c = ((xt4) it.next()).mo5c(yt4Var, viewArr, i);
            if (ewiVarMo5c != null) {
                return ewiVarMo5c;
            }
        }
        if (m5958f()) {
            return mo5c(yt4Var, viewArr, i);
        }
        return null;
    }

    @Override // p001o.xt4
    /* renamed from: d */
    public int mo6d(String str) {
        Iterator it = this.f7204b.iterator();
        while (it.hasNext()) {
            int iMo6d = ((xt4) it.next()).mo6d(str);
            if (iMo6d != 0) {
                return iMo6d;
            }
        }
        if (m5958f()) {
            return mo6d(str);
        }
        return 0;
    }

    /* renamed from: e */
    public void m5957e(xt4 xt4Var) {
        if (this.f7203a.add(xt4Var.getClass())) {
            this.f7204b.add(xt4Var);
            Iterator it = xt4Var.mo3a().iterator();
            while (it.hasNext()) {
                m5957e((xt4) it.next());
            }
        }
    }

    /* renamed from: f */
    public final boolean m5958f() throws ClassNotFoundException {
        boolean z = false;
        for (String str : this.f7205c) {
            try {
                Class<?> cls = Class.forName(str);
                if (xt4.class.isAssignableFrom(cls)) {
                    m5957e((xt4) cls.newInstance());
                    this.f7205c.remove(str);
                    z = true;
                }
            } catch (ClassNotFoundException unused) {
            } catch (IllegalAccessException unused2) {
                StringBuilder sb = new StringBuilder();
                sb.append("unable to add feature mapper for ");
                sb.append(str);
            } catch (InstantiationException unused3) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("unable to add feature mapper for ");
                sb2.append(str);
            }
        }
        return z;
    }
}
