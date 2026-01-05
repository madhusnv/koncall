package p001o;

import ai.salesmax.model.WorkingHours;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;

/* loaded from: classes.dex */
public class x59 extends w59 implements jbc.InterfaceC14485a {
    public static final ewi.C13274i H0 = null;
    public static final SparseIntArray I0;
    public final View.OnClickListener A0;
    public final View.OnClickListener B0;
    public final View.OnClickListener C0;
    public nv8 D0;
    public nv8 E0;
    public nv8 F0;
    public long G0;
    public final ConstraintLayout x0;
    public final MaterialTextView y0;
    public final View.OnClickListener z0;

    /* renamed from: o.x59$a */
    public class C18058a implements nv8 {
        public C18058a() {
        }

        @Override // p001o.nv8
        /* renamed from: a */
        public void mo41180a() {
            boolean zIsChecked = x59.this.n0.isChecked();
            WorkingHours workingHours = x59.this.u0;
            if (workingHours != null) {
                workingHours.setIsSelected(zIsChecked);
            }
        }
    }

    /* renamed from: o.x59$b */
    public class C18059b implements nv8 {
        public C18059b() {
        }

        @Override // p001o.nv8
        /* renamed from: a */
        public void mo41180a() {
            String strM26936a = fjh.m26936a(x59.this.o0);
            WorkingHours workingHours = x59.this.u0;
            if (workingHours != null) {
                workingHours.setEndTime(strM26936a);
            }
        }
    }

    /* renamed from: o.x59$c */
    public class C18060c implements nv8 {
        public C18060c() {
        }

        @Override // p001o.nv8
        /* renamed from: a */
        public void mo41180a() {
            String strM26936a = fjh.m26936a(x59.this.q0);
            WorkingHours workingHours = x59.this.u0;
            if (workingHours != null) {
                workingHours.setStartTime(strM26936a);
            }
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I0 = sparseIntArray;
        sparseIntArray.put(z8e.whGuideline1, 7);
        sparseIntArray.put(z8e.whGuideline2, 8);
    }

    public x59(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 9, H0, I0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.G0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.G0 = 8L;
        }
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        return false;
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (73 == i) {
            j0((Integer) obj);
        } else if (33 == i) {
            h0((ck6) obj);
        } else {
            if (67 != i) {
                return false;
            }
            i0((WorkingHours) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        if (i == 1) {
            ck6 ck6Var = this.w0;
            WorkingHours workingHours = this.u0;
            Integer num = this.v0;
            if (ck6Var != null) {
                ck6Var.mo708b(view, num.intValue(), workingHours);
                return;
            }
            return;
        }
        if (i == 2) {
            ck6 ck6Var2 = this.w0;
            WorkingHours workingHours2 = this.u0;
            Integer num2 = this.v0;
            if (ck6Var2 != null) {
                ck6Var2.mo708b(view, num2.intValue(), workingHours2);
                return;
            }
            return;
        }
        if (i == 3) {
            ck6 ck6Var3 = this.w0;
            WorkingHours workingHours3 = this.u0;
            Integer num3 = this.v0;
            if (ck6Var3 != null) {
                ck6Var3.mo708b(view, num3.intValue(), workingHours3);
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        ck6 ck6Var4 = this.w0;
        WorkingHours workingHours4 = this.u0;
        Integer num4 = this.v0;
        if (ck6Var4 != null) {
            ck6Var4.mo708b(view, num4.intValue(), workingHours4);
        }
    }

    public void h0(ck6 ck6Var) {
        this.w0 = ck6Var;
        synchronized (this) {
            this.G0 |= 2;
        }
        m28509h(33);
        super.m25692R();
    }

    public void i0(WorkingHours workingHours) {
        this.u0 = workingHours;
        synchronized (this) {
            this.G0 |= 4;
        }
        m28509h(67);
        super.m25692R();
    }

    public void j0(Integer num) {
        this.v0 = num;
        synchronized (this) {
            this.G0 |= 1;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        boolean isSelected;
        String endTime;
        String day;
        String startTime;
        synchronized (this) {
            j = this.G0;
            this.G0 = 0L;
        }
        WorkingHours workingHours = this.u0;
        long j2 = 12 & j;
        if (j2 == 0 || workingHours == null) {
            isSelected = false;
            endTime = null;
            day = null;
            startTime = null;
        } else {
            day = workingHours.getDay();
            startTime = workingHours.getStartTime();
            isSelected = workingHours.getIsSelected();
            endTime = workingHours.getEndTime();
        }
        if (j2 != 0) {
            np3.m40895a(this.n0, isSelected);
            fjh.m26938c(this.o0, endTime);
            fjh.m26938c(this.y0, day);
            fjh.m26938c(this.q0, startTime);
        }
        if ((j & 8) != 0) {
            np3.m40896b(this.n0, null, this.D0);
            this.o0.setOnClickListener(this.B0);
            fjh.m26939d(this.o0, null, null, null, this.E0);
            this.p0.setOnClickListener(this.A0);
            this.q0.setOnClickListener(this.C0);
            fjh.m26939d(this.q0, null, null, null, this.F0);
            this.r0.setOnClickListener(this.z0);
        }
    }

    public x59(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialSwitch) objArr[2], (MaterialTextView) objArr[6], (MaterialTextView) objArr[5], (MaterialTextView) objArr[4], (MaterialTextView) objArr[3], (Guideline) objArr[7], (Guideline) objArr[8]);
        this.D0 = new C18058a();
        this.E0 = new C18059b();
        this.F0 = new C18060c();
        this.G0 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.p0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.x0 = constraintLayout;
        constraintLayout.setTag(null);
        MaterialTextView materialTextView = (MaterialTextView) objArr[1];
        this.y0 = materialTextView;
        materialTextView.setTag(null);
        this.q0.setTag(null);
        this.r0.setTag(null);
        a0(view);
        this.z0 = new jbc(this, 1);
        this.A0 = new jbc(this, 3);
        this.B0 = new jbc(this, 4);
        this.C0 = new jbc(this, 2);
        mo16291G();
    }
}
