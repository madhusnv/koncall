package p001o;

import ai.salesmax.model.PaginatedDataModel;
import ai.salesmax.model.event.ResultsChangeListener;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC2145n;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

/* loaded from: classes.dex */
public class lpc extends iuf {

    /* renamed from: g */
    public PaginatedDataModel f34187g;

    /* renamed from: h */
    public iuf f34188h;

    /* renamed from: o.lpc$a */
    public class C15124a extends iuf {

        /* renamed from: g */
        public final /* synthetic */ ll7 f34189g;

        /* renamed from: h */
        public final /* synthetic */ PaginatedDataModel f34190h;

        /* renamed from: i */
        public final /* synthetic */ ll7 f34191i;

        /* renamed from: j */
        public final /* synthetic */ Function f34192j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15124a(Object obj, String str, boolean z, Object obj2, ll7 ll7Var, PaginatedDataModel paginatedDataModel, ll7 ll7Var2, Function function) {
            super(obj, str, z, obj2);
            this.f34189g = ll7Var;
            this.f34190h = paginatedDataModel;
            this.f34191i = ll7Var2;
            this.f34192j = function;
        }

        @Override // p001o.wqb
        /* renamed from: f */
        public int mo705f(int i) {
            return ((Integer) this.f34191i.apply(this.f34190h, Integer.valueOf(i))).intValue();
        }

        @Override // p001o.wqb
        /* renamed from: g */
        public Object mo706g(int i) {
            return this.f34189g.apply(this.f34190h, Integer.valueOf(i));
        }

        @Override // p001o.wqb, androidx.recyclerview.widget.RecyclerView.AbstractC2371h
        public int getItemCount() {
            return ((Integer) this.f34192j.apply(this.f34190h)).intValue();
        }
    }

    public lpc(final xca xcaVar, AbstractC2145n abstractC2145n, final Function function, final String str, final boolean z, final Object obj, final ll7 ll7Var, final ll7 ll7Var2, final Function function2, final ll7 ll7Var3) {
        super(0, str, z, obj);
        PaginatedDataModel paginatedDataModelEmpty = PaginatedDataModel.empty();
        this.f34187g = paginatedDataModelEmpty;
        this.f34188h = m37598p(xcaVar, paginatedDataModelEmpty, function, str, z, obj, ll7Var, ll7Var2, function2, ll7Var3);
        abstractC2145n.observe(xcaVar, new n9c() { // from class: o.jpc
            @Override // p001o.n9c
            public final void onChanged(Object obj2) {
                this.f30912a.m37593m(xcaVar, function, str, z, obj, ll7Var, ll7Var2, function2, ll7Var3, (PaginatedDataModel) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m37593m(xca xcaVar, Function function, String str, boolean z, Object obj, ll7 ll7Var, ll7 ll7Var2, Function function2, ll7 ll7Var3, PaginatedDataModel paginatedDataModel) {
        this.f34187g.reset();
        this.f34187g = paginatedDataModel;
        this.f34188h = m37598p(xcaVar, paginatedDataModel, function, str, z, obj, ll7Var, ll7Var2, function2, ll7Var3);
        notifyDataSetChanged();
    }

    @Override // p001o.wqb
    /* renamed from: f */
    public int mo705f(int i) {
        return this.f34188h.mo705f(i);
    }

    @Override // p001o.wqb
    /* renamed from: g */
    public Object mo706g(int i) {
        return this.f34188h.mo706g(i);
    }

    @Override // p001o.wqb, androidx.recyclerview.widget.RecyclerView.AbstractC2371h
    public int getItemCount() {
        return ((Integer) Optional.ofNullable(this.f34188h).map(new Function() { // from class: o.kpc
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((iuf) obj).getItemCount());
            }
        }).orElse(0)).intValue();
    }

    @Override // p001o.wqb, androidx.recyclerview.widget.RecyclerView.AbstractC2371h
    /* renamed from: i */
    public void onBindViewHolder(final arb arbVar, final int i) {
        Optional.ofNullable(this.f34188h).ifPresent(new Consumer() { // from class: o.ipc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((iuf) obj).onBindViewHolder(arbVar, i);
            }
        });
    }

    @Override // p001o.wqb, androidx.recyclerview.widget.RecyclerView.AbstractC2371h
    /* renamed from: j */
    public arb onCreateViewHolder(ViewGroup viewGroup, int i) {
        return this.f34188h.onCreateViewHolder(viewGroup, i);
    }

    /* renamed from: o */
    public void m37597o() {
    }

    /* renamed from: p */
    public final iuf m37598p(xca xcaVar, PaginatedDataModel paginatedDataModel, Function function, String str, boolean z, Object obj, ll7 ll7Var, ll7 ll7Var2, Function function2, ll7 ll7Var3) {
        C15124a c15124a = new C15124a(function.apply(paginatedDataModel), str, z, obj, ll7Var, paginatedDataModel, ll7Var2, function2);
        paginatedDataModel.addResultsChangedListener(xcaVar, (ResultsChangeListener) ll7Var3.apply(paginatedDataModel, this));
        return c15124a;
    }
}
