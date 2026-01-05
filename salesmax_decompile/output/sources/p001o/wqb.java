package p001o;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC2401g;
import androidx.recyclerview.widget.C2398d;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes.dex */
public abstract class wqb extends RecyclerView.AbstractC2371h {

    /* renamed from: a */
    public final Object f52503a;

    /* renamed from: b */
    public final String f52504b;

    /* renamed from: c */
    public final boolean f52505c;

    /* renamed from: d */
    public final Object f52506d;

    /* renamed from: e */
    public final C17948a f52507e;

    /* renamed from: f */
    public final C2398d f52508f;

    /* renamed from: o.wqb$a */
    public static final class C17948a extends AbstractC2401g.f {
        @Override // androidx.recyclerview.widget.AbstractC2401g.f
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean mo9502a(String str, String str2) {
            sq8.m48649h(str, "oldItem");
            sq8.m48649h(str2, "newItem");
            return str.contentEquals(str2);
        }

        @Override // androidx.recyclerview.widget.AbstractC2401g.f
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean mo9503b(String str, String str2) {
            sq8.m48649h(str, "oldItem");
            sq8.m48649h(str2, "newItem");
            return str.contentEquals(str2);
        }
    }

    /* renamed from: o.wqb$b */
    public static final class C17949b extends kf9 implements nl7 {
        public C17949b() {
            super(2);
        }

        /* renamed from: a */
        public final void m54859a(ewi ewiVar, Object obj) {
            sq8.m48649h(ewiVar, "a");
            wqb.this.mo1288d(ewiVar, obj);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m54859a((ewi) obj, obj2);
            return y3i.f54824a;
        }
    }

    public wqb(Object obj, String str, boolean z, Object obj2) {
        sq8.m48649h(obj, "handler");
        this.f52503a = obj;
        this.f52504b = str;
        this.f52505c = z;
        this.f52506d = obj2;
        C17948a c17948a = new C17948a();
        this.f52507e = c17948a;
        this.f52508f = new C2398d(this, c17948a);
    }

    /* renamed from: d */
    public void mo1288d(ewi ewiVar, Object obj) {
        sq8.m48649h(ewiVar, "binding");
    }

    /* renamed from: e */
    public final C2398d m54855e() {
        return this.f52508f;
    }

    /* renamed from: f */
    public abstract int mo705f(int i);

    /* renamed from: g */
    public abstract Object mo706g(int i);

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
    public abstract int getItemCount();

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
    public int getItemViewType(int i) {
        return mo705f(i);
    }

    /* renamed from: h */
    public final void m54856h(int i, int i2) {
        List listM9434a = this.f52508f.m9434a();
        sq8.m48648g(listM9434a, "getCurrentList(...)");
        List listT0 = kh3.T0(listM9434a);
        String str = (String) listT0.get(i);
        listT0.remove(i);
        if (i2 < i) {
            listT0.add(i2 + 1, str);
        } else {
            listT0.add(i2 - 1, str);
        }
        this.f52508f.m9437d(listT0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(arb arbVar, int i) {
        sq8.m48649h(arbVar, "holder");
        arbVar.m17704O(mo706g(i), i, this.f52503a, this.f52504b, this.f52505c, this.f52506d, new C17949b());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public arb onCreateViewHolder(ViewGroup viewGroup, int i) {
        sq8.m48649h(viewGroup, "parent");
        long jCurrentTimeMillis = System.currentTimeMillis();
        ewi ewiVarM59874h = zt4.m59874h(LayoutInflater.from(viewGroup.getContext()), i, viewGroup, false);
        String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
        sq8.m48646e(ewiVarM59874h);
        return new arb(ewiVarM59874h);
    }
}
