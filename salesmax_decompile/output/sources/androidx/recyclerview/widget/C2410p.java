package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;
import p001o.cc;
import p001o.db;
import p001o.hc;
import p001o.wvi;

/* renamed from: androidx.recyclerview.widget.p */
/* loaded from: classes2.dex */
public class C2410p extends db {

    /* renamed from: d */
    public final RecyclerView f10186d;

    /* renamed from: e */
    public final a f10187e;

    /* renamed from: androidx.recyclerview.widget.p$a */
    public static class a extends db {

        /* renamed from: d */
        public final C2410p f10188d;

        /* renamed from: e */
        public Map f10189e = new WeakHashMap();

        public a(C2410p c2410p) {
            this.f10188d = c2410p;
        }

        @Override // p001o.db
        /* renamed from: a */
        public boolean mo6031a(View view, AccessibilityEvent accessibilityEvent) {
            db dbVar = (db) this.f10189e.get(view);
            return dbVar != null ? dbVar.mo6031a(view, accessibilityEvent) : super.mo6031a(view, accessibilityEvent);
        }

        @Override // p001o.db
        /* renamed from: b */
        public hc mo5184b(View view) {
            db dbVar = (db) this.f10189e.get(view);
            return dbVar != null ? dbVar.mo5184b(view) : super.mo5184b(view);
        }

        @Override // p001o.db
        /* renamed from: f */
        public void mo5937f(View view, AccessibilityEvent accessibilityEvent) {
            db dbVar = (db) this.f10189e.get(view);
            if (dbVar != null) {
                dbVar.mo5937f(view, accessibilityEvent);
            } else {
                super.mo5937f(view, accessibilityEvent);
            }
        }

        @Override // p001o.db
        /* renamed from: g */
        public void mo5938g(View view, cc ccVar) {
            if (this.f10188d.m9656o() || this.f10188d.f10186d.getLayoutManager() == null) {
                super.mo5938g(view, ccVar);
                return;
            }
            this.f10188d.f10186d.getLayoutManager().a1(view, ccVar);
            db dbVar = (db) this.f10189e.get(view);
            if (dbVar != null) {
                dbVar.mo5938g(view, ccVar);
            } else {
                super.mo5938g(view, ccVar);
            }
        }

        @Override // p001o.db
        /* renamed from: h */
        public void mo9657h(View view, AccessibilityEvent accessibilityEvent) {
            db dbVar = (db) this.f10189e.get(view);
            if (dbVar != null) {
                dbVar.mo9657h(view, accessibilityEvent);
            } else {
                super.mo9657h(view, accessibilityEvent);
            }
        }

        @Override // p001o.db
        /* renamed from: i */
        public boolean mo6032i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            db dbVar = (db) this.f10189e.get(viewGroup);
            return dbVar != null ? dbVar.mo6032i(viewGroup, view, accessibilityEvent) : super.mo6032i(viewGroup, view, accessibilityEvent);
        }

        @Override // p001o.db
        /* renamed from: j */
        public boolean mo5939j(View view, int i, Bundle bundle) {
            if (this.f10188d.m9656o() || this.f10188d.f10186d.getLayoutManager() == null) {
                return super.mo5939j(view, i, bundle);
            }
            db dbVar = (db) this.f10189e.get(view);
            if (dbVar != null) {
                if (dbVar.mo5939j(view, i, bundle)) {
                    return true;
                }
            } else if (super.mo5939j(view, i, bundle)) {
                return true;
            }
            return this.f10188d.f10186d.getLayoutManager().u1(view, i, bundle);
        }

        @Override // p001o.db
        /* renamed from: l */
        public void mo9658l(View view, int i) {
            db dbVar = (db) this.f10189e.get(view);
            if (dbVar != null) {
                dbVar.mo9658l(view, i);
            } else {
                super.mo9658l(view, i);
            }
        }

        @Override // p001o.db
        /* renamed from: m */
        public void mo9659m(View view, AccessibilityEvent accessibilityEvent) {
            db dbVar = (db) this.f10189e.get(view);
            if (dbVar != null) {
                dbVar.mo9659m(view, accessibilityEvent);
            } else {
                super.mo9659m(view, accessibilityEvent);
            }
        }

        /* renamed from: n */
        public db m9660n(View view) {
            return (db) this.f10189e.remove(view);
        }

        /* renamed from: o */
        public void m9661o(View view) {
            db dbVarM55125l = wvi.m55125l(view);
            if (dbVarM55125l == null || dbVarM55125l == this) {
                return;
            }
            this.f10189e.put(view, dbVarM55125l);
        }
    }

    public C2410p(RecyclerView recyclerView) {
        this.f10186d = recyclerView;
        db dbVarM9655n = m9655n();
        if (dbVarM9655n == null || !(dbVarM9655n instanceof a)) {
            this.f10187e = new a(this);
        } else {
            this.f10187e = (a) dbVarM9655n;
        }
    }

    @Override // p001o.db
    /* renamed from: f */
    public void mo5937f(View view, AccessibilityEvent accessibilityEvent) {
        super.mo5937f(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || m9656o()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().W0(accessibilityEvent);
        }
    }

    @Override // p001o.db
    /* renamed from: g */
    public void mo5938g(View view, cc ccVar) {
        super.mo5938g(view, ccVar);
        if (m9656o() || this.f10186d.getLayoutManager() == null) {
            return;
        }
        this.f10186d.getLayoutManager().Z0(ccVar);
    }

    @Override // p001o.db
    /* renamed from: j */
    public boolean mo5939j(View view, int i, Bundle bundle) {
        if (super.mo5939j(view, i, bundle)) {
            return true;
        }
        if (m9656o() || this.f10186d.getLayoutManager() == null) {
            return false;
        }
        return this.f10186d.getLayoutManager().s1(i, bundle);
    }

    /* renamed from: n */
    public db m9655n() {
        return this.f10187e;
    }

    /* renamed from: o */
    public boolean m9656o() {
        return this.f10186d.s0();
    }
}
