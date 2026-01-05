package p001o;

import ai.salesmax.custom.CustomFormDataObservable;
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
public class y09 extends x09 implements jbc.InterfaceC14485a, sbc.InterfaceC16795a {
    public static final ewi.C13274i O0;
    public static final SparseIntArray P0;
    public final ConstraintLayout B0;
    public final View.OnClickListener C0;
    public final View.OnClickListener D0;
    public final View.OnClickListener E0;
    public final View.OnClickListener F0;
    public final View.OnClickListener G0;
    public final View.OnClickListener H0;
    public final View.OnLongClickListener I0;
    public final View.OnLongClickListener J0;
    public final View.OnLongClickListener K0;
    public final View.OnLongClickListener L0;
    public final View.OnClickListener M0;
    public long N0;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(12);
        O0 = c13274i;
        c13274i.m25699a(1, new String[]{"content_custom_form_value"}, new int[]{11}, new int[]{p9e.content_custom_form_value});
        P0 = null;
    }

    public y09(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 12, O0, P0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.N0 != 0) {
                return true;
            }
            return this.o0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.N0 = 32L;
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
        if (i == 6) {
            ck6 ck6Var3 = this.A0;
            Tasks tasks3 = this.y0;
            Integer num3 = this.z0;
            if (ck6Var3 != null) {
                return ck6Var3.mo707a(view, num3.intValue(), tasks3);
            }
            return false;
        }
        if (i != 8) {
            return false;
        }
        ck6 ck6Var4 = this.A0;
        Tasks tasks4 = this.y0;
        Integer num4 = this.z0;
        if (ck6Var4 != null) {
            return ck6Var4.mo707a(view, num4.intValue(), tasks4);
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
        switch (i) {
            case 9:
                ck6 ck6Var5 = this.A0;
                Tasks tasks5 = this.y0;
                Integer num5 = this.z0;
                if (ck6Var5 != null) {
                    ck6Var5.mo708b(view, num5.intValue(), tasks5);
                    break;
                }
                break;
            case 10:
                ck6 ck6Var6 = this.A0;
                Tasks tasks6 = this.y0;
                Integer num6 = this.z0;
                if (ck6Var6 != null) {
                    ck6Var6.mo708b(view, num6.intValue(), tasks6);
                    break;
                }
                break;
            case 11:
                ck6 ck6Var7 = this.A0;
                Tasks tasks7 = this.y0;
                Integer num7 = this.z0;
                if (ck6Var7 != null) {
                    ck6Var7.mo708b(view, num7.intValue(), tasks7);
                    break;
                }
                break;
        }
    }

    public final boolean h0(t14 t14Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.N0 |= 2;
        }
        return true;
    }

    public final boolean i0(CustomFormDataObservable customFormDataObservable, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.N0 |= 1;
        }
        return true;
    }

    public void j0(ck6 ck6Var) {
        this.A0 = ck6Var;
        synchronized (this) {
            this.N0 |= 8;
        }
        m28509h(33);
        super.m25692R();
    }

    public void k0(Tasks tasks) {
        this.y0 = tasks;
        synchronized (this) {
            this.N0 |= 16;
        }
        m28509h(67);
        super.m25692R();
    }

    public void l0(Integer num) {
        this.z0 = num;
        synchronized (this) {
            this.N0 |= 4;
        }
        m28509h(73);
        super.m25692R();
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0115  */
    @Override // p001o.ewi
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo16295p() {
        long j;
        long taskDateTimeInMillis;
        String str;
        CustomFormDataObservable customVideoCallInputObservable;
        int i;
        int i2;
        int i3;
        String videoCallOutcome;
        String str2;
        String str3;
        boolean z;
        synchronized (this) {
            j = this.N0;
            this.N0 = 0L;
        }
        Integer num = this.z0;
        ck6 ck6Var = this.A0;
        Tasks tasks = this.y0;
        String str4 = null;
        if ((j & 49) != 0) {
            customVideoCallInputObservable = tasks != null ? tasks.getCustomVideoCallInputObservable() : null;
            g0(0, customVideoCallInputObservable);
            long j2 = j & 48;
            if (j2 != 0) {
                if (tasks != null) {
                    String taskTitle = tasks.getTaskTitle();
                    String clientName = tasks.getClientName();
                    boolean showBottom = tasks.getShowBottom();
                    String customVideoCallInputData = tasks.getCustomVideoCallInputData();
                    taskDateTimeInMillis = tasks.getTaskDateTimeInMillis();
                    videoCallOutcome = tasks.getVideoCallOutcome();
                    str2 = taskTitle;
                    str4 = customVideoCallInputData;
                    z = showBottom;
                    str3 = clientName;
                } else {
                    taskDateTimeInMillis = 0;
                    videoCallOutcome = null;
                    str2 = null;
                    str3 = null;
                    z = false;
                }
                if (j2 != 0) {
                    j |= z ? MediaStatus.COMMAND_QUEUE_REPEAT_ONE : MediaStatus.COMMAND_QUEUE_REPEAT_ALL;
                }
                int i4 = z ? 0 : 8;
                boolean z2 = str4 == null;
                if ((j & 48) != 0) {
                    j |= z2 ? 512L : 256L;
                }
                boolean zEquals = videoCallOutcome != null ? videoCallOutcome.equals("COMPLETED") : false;
                int i5 = z2 ? 8 : 0;
                boolean z3 = !zEquals;
                if ((j & 48) != 0) {
                    j |= z3 ? 128L : 64L;
                }
                i3 = i5;
                i = z3 ? 0 : 8;
                str = str2;
                str4 = str3;
                i2 = i4;
                if ((48 & j) != 0) {
                    this.n0.setVisibility(i2);
                    this.o0.m25689B().setVisibility(i3);
                    this.r0.setVisibility(i);
                    nr1.f1(this.v0, str4);
                    nr1.k0(this.w0, Long.valueOf(taskDateTimeInMillis));
                    nr1.f1(this.x0, str);
                }
                if ((49 & j) != 0) {
                    this.o0.i0(customVideoCallInputObservable);
                }
                if ((40 & j) != 0) {
                    this.o0.h0(ck6Var);
                }
                if ((36 & j) != 0) {
                    this.o0.j0(num);
                }
                if ((j & 32) != 0) {
                    this.p0.setOnClickListener(this.H0);
                    this.p0.setOnLongClickListener(this.L0);
                    this.q0.setOnClickListener(this.E0);
                    this.q0.setOnLongClickListener(this.K0);
                    this.r0.setOnClickListener(this.D0);
                    this.r0.setOnLongClickListener(this.J0);
                    this.s0.setOnClickListener(this.F0);
                    this.t0.setOnClickListener(this.G0);
                    this.u0.setOnClickListener(this.M0);
                    this.v0.setOnClickListener(this.C0);
                    this.v0.setOnLongClickListener(this.I0);
                }
                ewi.m25683r(this.o0);
            }
            taskDateTimeInMillis = 0;
            str = null;
        } else {
            taskDateTimeInMillis = 0;
            str = null;
            customVideoCallInputObservable = null;
        }
        i = 0;
        i2 = 0;
        i3 = 0;
        if ((48 & j) != 0) {
        }
        if ((49 & j) != 0) {
        }
        if ((40 & j) != 0) {
        }
        if ((36 & j) != 0) {
        }
        if ((j & 32) != 0) {
        }
        ewi.m25683r(this.o0);
    }

    public y09(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 2, (HorizontalScrollView) objArr[7], (t14) objArr[11], (MaterialCardView) objArr[0], (ShapeableImageView) objArr[2], (Chip) objArr[6], (MaterialButton) objArr[8], (MaterialButton) objArr[10], (MaterialButton) objArr[9], (MaterialTextView) objArr[3], (MaterialTextView) objArr[5], (MaterialTextView) objArr[4]);
        this.N0 = -1L;
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
        this.C0 = new jbc(this, 5);
        this.D0 = new jbc(this, 7);
        this.E0 = new jbc(this, 3);
        this.F0 = new jbc(this, 9);
        this.G0 = new jbc(this, 11);
        this.H0 = new jbc(this, 1);
        this.I0 = new sbc(this, 6);
        this.J0 = new sbc(this, 8);
        this.K0 = new sbc(this, 4);
        this.L0 = new sbc(this, 2);
        this.M0 = new jbc(this, 10);
        mo16291G();
    }
}
