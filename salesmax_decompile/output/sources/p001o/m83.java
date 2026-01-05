package p001o;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p001o.aua;

/* loaded from: classes3.dex */
public class m83 {

    /* renamed from: a */
    public final Map f34947a = new HashMap();

    /* renamed from: b */
    public final Set f34948b = new HashSet();

    /* renamed from: c */
    public InterfaceC15248b f34949c;

    /* renamed from: d */
    public boolean f34950d;

    /* renamed from: e */
    public boolean f34951e;

    /* renamed from: o.m83$a */
    public class C15247a implements aua.InterfaceC12251a {
        public C15247a() {
        }

        @Override // p001o.aua.InterfaceC12251a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo17841a(aua auaVar, boolean z) {
            if (!z) {
                m83 m83Var = m83.this;
                if (!m83Var.m38547r(auaVar, m83Var.f34951e)) {
                    return;
                }
            } else if (!m83.this.m38536g(auaVar)) {
                return;
            }
            m83.this.m38542m();
        }
    }

    /* renamed from: o.m83$b */
    public interface InterfaceC15248b {
        /* renamed from: a */
        void mo14412a(Set set);
    }

    /* renamed from: e */
    public void m38534e(aua auaVar) {
        this.f34947a.put(Integer.valueOf(auaVar.getId()), auaVar);
        if (auaVar.isChecked()) {
            m38536g(auaVar);
        }
        auaVar.setInternalOnCheckedChangeListener(new C15247a());
    }

    /* renamed from: f */
    public void m38535f(int i) {
        aua auaVar = (aua) this.f34947a.get(Integer.valueOf(i));
        if (auaVar != null && m38536g(auaVar)) {
            m38542m();
        }
    }

    /* renamed from: g */
    public final boolean m38536g(aua auaVar) {
        int id = auaVar.getId();
        if (this.f34948b.contains(Integer.valueOf(id))) {
            return false;
        }
        aua auaVar2 = (aua) this.f34947a.get(Integer.valueOf(m38540k()));
        if (auaVar2 != null) {
            m38547r(auaVar2, false);
        }
        boolean zAdd = this.f34948b.add(Integer.valueOf(id));
        if (!auaVar.isChecked()) {
            auaVar.setChecked(true);
        }
        return zAdd;
    }

    /* renamed from: h */
    public void m38537h() {
        boolean z = !this.f34948b.isEmpty();
        Iterator it = this.f34947a.values().iterator();
        while (it.hasNext()) {
            m38547r((aua) it.next(), false);
        }
        if (z) {
            m38542m();
        }
    }

    /* renamed from: i */
    public Set m38538i() {
        return new HashSet(this.f34948b);
    }

    /* renamed from: j */
    public List m38539j(ViewGroup viewGroup) {
        Set setM38538i = m38538i();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof aua) && setM38538i.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    /* renamed from: k */
    public int m38540k() {
        if (!this.f34950d || this.f34948b.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f34948b.iterator().next()).intValue();
    }

    /* renamed from: l */
    public boolean m38541l() {
        return this.f34950d;
    }

    /* renamed from: m */
    public final void m38542m() {
        InterfaceC15248b interfaceC15248b = this.f34949c;
        if (interfaceC15248b != null) {
            interfaceC15248b.mo14412a(m38538i());
        }
    }

    /* renamed from: n */
    public void m38543n(aua auaVar) {
        auaVar.setInternalOnCheckedChangeListener(null);
        this.f34947a.remove(Integer.valueOf(auaVar.getId()));
        this.f34948b.remove(Integer.valueOf(auaVar.getId()));
    }

    /* renamed from: o */
    public void m38544o(InterfaceC15248b interfaceC15248b) {
        this.f34949c = interfaceC15248b;
    }

    /* renamed from: p */
    public void m38545p(boolean z) {
        this.f34951e = z;
    }

    /* renamed from: q */
    public void m38546q(boolean z) {
        if (this.f34950d != z) {
            this.f34950d = z;
            m38537h();
        }
    }

    /* renamed from: r */
    public final boolean m38547r(aua auaVar, boolean z) {
        int id = auaVar.getId();
        if (!this.f34948b.contains(Integer.valueOf(id))) {
            return false;
        }
        if (z && this.f34948b.size() == 1 && this.f34948b.contains(Integer.valueOf(id))) {
            auaVar.setChecked(true);
            return false;
        }
        boolean zRemove = this.f34948b.remove(Integer.valueOf(id));
        if (auaVar.isChecked()) {
            auaVar.setChecked(false);
        }
        return zRemove;
    }
}
