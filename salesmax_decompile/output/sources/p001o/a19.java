package p001o;

import ai.salesmax.custom.CustomFormDataObservable;
import ai.salesmax.model.LeadsUser;
import ai.salesmax.model.Tasks;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.HorizontalScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;
import p001o.sbc;

/* loaded from: classes.dex */
public class a19 extends z09 implements jbc.InterfaceC14485a, sbc.InterfaceC16795a {
    public static final ewi.C13274i M0;
    public static final SparseIntArray N0;
    public final ConstraintLayout B0;
    public final View.OnClickListener C0;
    public final View.OnClickListener D0;
    public final View.OnClickListener E0;
    public final View.OnClickListener F0;
    public final View.OnClickListener G0;
    public final View.OnLongClickListener H0;
    public final View.OnClickListener I0;
    public final View.OnLongClickListener J0;
    public final View.OnLongClickListener K0;
    public long L0;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(12);
        M0 = c13274i;
        c13274i.m25699a(1, new String[]{"content_custom_form_value"}, new int[]{11}, new int[]{p9e.content_custom_form_value});
        N0 = null;
    }

    public a19(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 12, M0, N0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.L0 != 0) {
                return true;
            }
            return this.o0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.L0 = 32L;
        }
        this.o0.mo16291G();
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        if (i == 0) {
            return i0((CustomFormDataObservable) obj, i2);
        }
        if (i != 1) {
            return false;
        }
        return h0((t14) obj, i2);
    }

    @Override // p001o.sbc.InterfaceC16795a
    /* renamed from: a */
    public final boolean mo16293a(int i, View view) {
        if (i == 2) {
            ck6 ck6Var = this.A0;
            Tasks tasks = this.y0;
            Integer num = this.z0;
            if (ck6Var != null) {
                return ck6Var.mo707a(view, num.intValue(), tasks);
            }
            return false;
        }
        if (i == 4) {
            ck6 ck6Var2 = this.A0;
            Tasks tasks2 = this.y0;
            Integer num2 = this.z0;
            if (ck6Var2 != null) {
                return ck6Var2.mo707a(view, num2.intValue(), tasks2);
            }
            return false;
        }
        if (i != 6) {
            return false;
        }
        ck6 ck6Var3 = this.A0;
        Tasks tasks3 = this.y0;
        Integer num3 = this.z0;
        if (ck6Var3 != null) {
            return ck6Var3.mo707a(view, num3.intValue(), tasks3);
        }
        return false;
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (73 == i) {
            l0((Integer) obj);
        } else if (33 == i) {
            j0((ck6) obj);
        } else {
            if (67 != i) {
                return false;
            }
            k0((Tasks) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        if (i == 1) {
            ck6 ck6Var = this.A0;
            Tasks tasks = this.y0;
            Integer num = this.z0;
            if (ck6Var != null) {
                ck6Var.mo708b(view, num.intValue(), tasks);
                return;
            }
            return;
        }
        if (i == 3) {
            ck6 ck6Var2 = this.A0;
            Tasks tasks2 = this.y0;
            Integer num2 = this.z0;
            if (ck6Var2 != null) {
                ck6Var2.mo708b(view, num2.intValue(), tasks2);
                return;
            }
            return;
        }
        if (i == 5) {
            ck6 ck6Var3 = this.A0;
            Tasks tasks3 = this.y0;
            Integer num3 = this.z0;
            if (ck6Var3 != null) {
                ck6Var3.mo708b(view, num3.intValue(), tasks3);
                return;
            }
            return;
        }
        if (i == 7) {
            ck6 ck6Var4 = this.A0;
            Tasks tasks4 = this.y0;
            Integer num4 = this.z0;
            if (ck6Var4 != null) {
                ck6Var4.mo708b(view, num4.intValue(), tasks4);
                return;
            }
            return;
        }
        if (i == 8) {
            ck6 ck6Var5 = this.A0;
            Tasks tasks5 = this.y0;
            Integer num5 = this.z0;
            if (ck6Var5 != null) {
                ck6Var5.mo708b(view, num5.intValue(), tasks5);
                return;
            }
            return;
        }
        if (i != 9) {
            return;
        }
        ck6 ck6Var6 = this.A0;
        Tasks tasks6 = this.y0;
        Integer num6 = this.z0;
        if (ck6Var6 != null) {
            ck6Var6.mo708b(view, num6.intValue(), tasks6);
        }
    }

    public final boolean h0(t14 t14Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.L0 |= 2;
        }
        return true;
    }

    public final boolean i0(CustomFormDataObservable customFormDataObservable, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.L0 |= 1;
        }
        return true;
    }

    public void j0(ck6 ck6Var) {
        this.A0 = ck6Var;
        synchronized (this) {
            this.L0 |= 8;
        }
        m28509h(33);
        super.m25692R();
    }

    public void k0(Tasks tasks) {
        this.y0 = tasks;
        synchronized (this) {
            this.L0 |= 16;
        }
        m28509h(67);
        super.m25692R();
    }

    public void l0(Integer num) {
        this.z0 = num;
        synchronized (this) {
            this.L0 |= 4;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        long taskDateTimeInMillis;
        int i;
        int i2;
        String str;
        CustomFormDataObservable customFormDataObservable;
        String str2;
        int i3;
        int i4;
        String name;
        String taskTitle;
        boolean showBottom;
        String videoCallOutcome;
        LeadsUser taskOwner;
        String customVideoCallInputData;
        synchronized (this) {
            j = this.L0;
            this.L0 = 0L;
        }
        Integer num = this.z0;
        ck6 ck6Var = this.A0;
        Tasks tasks = this.y0;
        int i5 = 0;
        if ((j & 49) != 0) {
            long j2 = j & 48;
            if (j2 != 0) {
                if (tasks != null) {
                    taskOwner = tasks.getTaskOwner();
                    taskTitle = tasks.getTaskTitle();
                    showBottom = tasks.getShowBottom();
                    customVideoCallInputData = tasks.getCustomVideoCallInputData();
                    taskDateTimeInMillis = tasks.getTaskDateTimeInMillis();
                    videoCallOutcome = tasks.getVideoCallOutcome();
                } else {
                    taskDateTimeInMillis = 0;
                    showBottom = false;
                    videoCallOutcome = null;
                    taskOwner = null;
                    taskTitle = null;
                    customVideoCallInputData = null;
                }
                if (j2 != 0) {
                    j |= showBottom ? MediaStatus.COMMAND_QUEUE_REPEAT_ONE : MediaStatus.COMMAND_QUEUE_REPEAT_ALL;
                }
                name = taskOwner != null ? taskOwner.getName() : null;
                i3 = showBottom ? 0 : 8;
                boolean z = customVideoCallInputData == null;
                if ((j & 48) != 0) {
                    j |= z ? 512L : 256L;
                }
                boolean zEquals = videoCallOutcome != null ? videoCallOutcome.equals("COMPLETED") : false;
                i2 = z ? 8 : 0;
                boolean z2 = !zEquals;
                if ((j & 48) != 0) {
                    j |= z2 ? 128L : 64L;
                }
                i4 = z2 ? 0 : 8;
            } else {
                taskDateTimeInMillis = 0;
                i2 = 0;
                i3 = 0;
                i4 = 0;
                name = null;
                taskTitle = null;
            }
            CustomFormDataObservable customVideoCallInputObservable = tasks != null ? tasks.getCustomVideoCallInputObservable() : null;
            g0(0, customVideoCallInputObservable);
            str = taskTitle;
            i5 = i3;
            i = i4;
            CustomFormDataObservable customFormDataObservable2 = customVideoCallInputObservable;
            str2 = name;
            customFormDataObservable = customFormDataObservable2;
        } else {
            taskDateTimeInMillis = 0;
            i = 0;
            i2 = 0;
            str = null;
            customFormDataObservable = null;
            str2 = null;
        }
        if ((48 & j) != 0) {
            this.n0.setVisibility(i5);
            this.o0.m25689B().setVisibility(i2);
            this.r0.setVisibility(i);
            nr1.f1(this.v0, str2);
            nr1.k0(this.w0, Long.valueOf(taskDateTimeInMillis));
            nr1.f1(this.x0, str);
        }
        if ((49 & j) != 0) {
            this.o0.i0(customFormDataObservable);
        }
        if ((40 & j) != 0) {
            this.o0.h0(ck6Var);
        }
        if ((36 & j) != 0) {
            this.o0.j0(num);
        }
        if ((j & 32) != 0) {
            this.p0.setOnClickListener(this.D0);
            this.p0.setOnLongClickListener(this.K0);
            this.q0.setOnClickListener(this.G0);
            this.q0.setOnLongClickListener(this.J0);
            this.r0.setOnClickListener(this.E0);
            this.r0.setOnLongClickListener(this.H0);
            this.s0.setOnClickListener(this.F0);
            this.t0.setOnClickListener(this.C0);
            this.u0.setOnClickListener(this.I0);
        }
        ewi.m25683r(this.o0);
    }

    public a19(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 2, (HorizontalScrollView) objArr[7], (t14) objArr[11], (MaterialCardView) objArr[0], (ShapeableImageView) objArr[2], (Chip) objArr[6], (MaterialButton) objArr[8], (MaterialButton) objArr[10], (MaterialButton) objArr[9], (MaterialTextView) objArr[3], (MaterialTextView) objArr[5], (MaterialTextView) objArr[4]);
        this.L0 = -1L;
        this.n0.setTag(null);
        m25693Z(this.o0);
        this.p0.setTag(null);
        this.q0.setTag(null);
        this.r0.setTag(null);
        this.s0.setTag(null);
        this.t0.setTag(null);
        this.u0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.B0 = constraintLayout;
        constraintLayout.setTag(null);
        this.v0.setTag(null);
        this.w0.setTag(null);
        this.x0.setTag(null);
        a0(view);
        this.C0 = new jbc(this, 9);
        this.D0 = new jbc(this, 1);
        this.E0 = new jbc(this, 5);
        this.F0 = new jbc(this, 7);
        this.G0 = new jbc(this, 3);
        this.H0 = new sbc(this, 6);
        this.I0 = new jbc(this, 8);
        this.J0 = new sbc(this, 4);
        this.K0 = new sbc(this, 2);
        mo16291G();
    }
}
