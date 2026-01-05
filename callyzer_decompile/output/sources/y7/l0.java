package y7;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import b2.C0558p;
import c6.C0872b;
import com.sun.mail.util.AbstractC1452a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a */
    public final ArrayList f41704a;

    /* renamed from: b */
    public ArrayList f41705b;

    /* renamed from: c */
    public final ArrayList f41706c;

    /* renamed from: d */
    public final List f41707d;

    /* renamed from: e */
    public int f41708e;

    /* renamed from: f */
    public int f41709f;

    /* renamed from: g */
    public k0 f41710g;

    /* renamed from: h */
    public final /* synthetic */ RecyclerView f41711h;

    public l0(RecyclerView recyclerView) {
        this.f41711h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f41704a = arrayList;
        this.f41705b = null;
        this.f41706c = new ArrayList();
        this.f41707d = Collections.unmodifiableList(arrayList);
        this.f41708e = 2;
        this.f41709f = 2;
    }

    /* renamed from: a */
    public final void m15875a(t0 t0Var, boolean z6) {
        RecyclerView.m1318i(t0Var);
        View view = t0Var.f41792a;
        RecyclerView recyclerView = this.f41711h;
        v0 v0Var = recyclerView.f43706p1;
        if (v0Var != null) {
            u0 u0Var = v0Var.f41817e;
            c6.v0.m2528j(view, u0Var != null ? (C0872b) u0Var.f41814e.remove(view) : null);
        }
        if (z6 && recyclerView.f43699i1 != null) {
            recyclerView.f2818f.m2651r(t0Var);
        }
        t0Var.f41809r = null;
        k0 k0VarM15877c = m15877c();
        k0VarM15877c.getClass();
        int i10 = t0Var.f41797f;
        ArrayList arrayList = k0VarM15877c.m15871a(i10).f41687a;
        if (((j0) k0VarM15877c.f41696a.get(i10)).f41688b <= arrayList.size()) {
            return;
        }
        t0Var.m15928m();
        arrayList.add(t0Var);
    }

    /* renamed from: b */
    public final int m15876b(int i10) {
        RecyclerView recyclerView = this.f41711h;
        if (i10 >= 0 && i10 < recyclerView.f43699i1.m15894b()) {
            return !recyclerView.f43699i1.f41757g ? i10 : recyclerView.f2816d.m15563i(i10, 0);
        }
        StringBuilder sbM4567n = AbstractC1452a.m4567n(i10, "invalid position ", ". State item count is ");
        sbM4567n.append(recyclerView.f43699i1.m15894b());
        sbM4567n.append(recyclerView.m1361x());
        throw new IndexOutOfBoundsException(sbM4567n.toString());
    }

    /* renamed from: c */
    public final k0 m15877c() {
        if (this.f41710g == null) {
            k0 k0Var = new k0();
            k0Var.f41696a = new SparseArray();
            k0Var.f41697b = 0;
            this.f41710g = k0Var;
        }
        return this.f41710g;
    }

    /* renamed from: d */
    public final void m15878d() {
        ArrayList arrayList = this.f41706c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            m15879e(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.f43688y1;
        C0558p c0558p = this.f41711h.f43698h1;
        int[] iArr2 = (int[]) c0558p.f3798e;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        c0558p.f3797d = 0;
    }

    /* renamed from: e */
    public final void m15879e(int i10) {
        ArrayList arrayList = this.f41706c;
        m15875a((t0) arrayList.get(i10), true);
        arrayList.remove(i10);
    }

    /* renamed from: f */
    public final void m15880f(View view) {
        t0 t0VarM1313H = RecyclerView.m1313H(view);
        boolean zM15925j = t0VarM1313H.m15925j();
        RecyclerView recyclerView = this.f41711h;
        if (zM15925j) {
            recyclerView.removeDetachedView(view, false);
        }
        if (t0VarM1313H.m15924i()) {
            t0VarM1313H.f41805n.m15884j(t0VarM1313H);
        } else if (t0VarM1313H.m15931p()) {
            t0VarM1313H.f41801j &= -33;
        }
        m15881g(t0VarM1313H);
        if (recyclerView.f2808M == null || t0VarM1313H.m15922g()) {
            return;
        }
        recyclerView.f2808M.mo15838d(t0VarM1313H);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0095, code lost:
    
        r6 = r6 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0078  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m15881g(y7.t0 r12) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y7.l0.m15881g(y7.t0):void");
    }

    /* renamed from: h */
    public final void m15882h(View view) {
        c0 c0Var;
        t0 t0VarM1313H = RecyclerView.m1313H(view);
        int i10 = t0VarM1313H.f41801j & 12;
        RecyclerView recyclerView = this.f41711h;
        if (i10 == 0 && t0VarM1313H.m15926k() && (c0Var = recyclerView.f2808M) != null) {
            C8573h c8573h = (C8573h) c0Var;
            if (t0VarM1313H.m15918c().isEmpty() && c8573h.f41644g && !t0VarM1313H.m15921f()) {
                if (this.f41705b == null) {
                    this.f41705b = new ArrayList();
                }
                t0VarM1313H.f41805n = this;
                t0VarM1313H.f41806o = true;
                this.f41705b.add(t0VarM1313H);
                return;
            }
        }
        if (t0VarM1313H.m15921f() && !t0VarM1313H.m15923h() && !recyclerView.f2823l.f41833b) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.m1361x());
        }
        t0VarM1313H.f41805n = this;
        t0VarM1313H.f41806o = false;
        this.f41704a.add(t0VarM1313H);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    /* JADX WARN: Type inference failed for: r11v4, types: [c6.b] */
    /* JADX WARN: Type inference failed for: r9v13, types: [c6.b] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final y7.t0 m15883i(int r28, long r29) {
        /*
            Method dump skipped, instructions count: 1376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y7.l0.m15883i(int, long):y7.t0");
    }

    /* renamed from: j */
    public final void m15884j(t0 t0Var) {
        if (t0Var.f41806o) {
            this.f41705b.remove(t0Var);
        } else {
            this.f41704a.remove(t0Var);
        }
        t0Var.f41805n = null;
        t0Var.f41806o = false;
        t0Var.f41801j &= -33;
    }

    /* renamed from: k */
    public final void m15885k() {
        f0 f0Var = this.f41711h.f2824m;
        this.f41709f = this.f41708e + (f0Var != null ? f0Var.f41628j : 0);
        ArrayList arrayList = this.f41706c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f41709f; size--) {
            m15879e(size);
        }
    }
}
