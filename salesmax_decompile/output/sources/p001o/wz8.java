package p001o;

import ai.salesmax.model.Activities;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import lombok.javac.Javac;
import nl.dionsegijn.konfetti.xml.KonfettiView;
import p001o.ewi;
import p001o.jbc;
import p001o.sbc;

/* loaded from: classes.dex */
public class wz8 extends vz8 implements jbc.InterfaceC14485a, sbc.InterfaceC16795a {
    public static final ewi.C13274i U0 = null;
    public static final SparseIntArray V0;
    public final View.OnClickListener K0;
    public final View.OnLongClickListener L0;
    public final View.OnClickListener M0;
    public final View.OnClickListener N0;
    public final View.OnClickListener O0;
    public final View.OnLongClickListener P0;
    public final View.OnLongClickListener Q0;
    public final View.OnClickListener R0;
    public final View.OnClickListener S0;
    public long T0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        V0 = sparseIntArray;
        sparseIntArray.put(z8e.konfettiView, 13);
        sparseIntArray.put(z8e.seekBar, 14);
        sparseIntArray.put(z8e.tvDuration, 15);
        sparseIntArray.put(z8e.activityMore, 16);
        sparseIntArray.put(z8e.frame_container, 17);
        sparseIntArray.put(z8e.callTypeIcon, 18);
    }

    public wz8(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 19, U0, V0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.T0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.T0 = 16L;
        }
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        return false;
    }

    @Override // p001o.sbc.InterfaceC16795a
    /* renamed from: a */
    public final boolean mo16293a(int i, View view) {
        if (i == 3) {
            ck6 ck6Var = this.I0;
            Activities activities = this.G0;
            Integer num = this.H0;
            if (ck6Var != null) {
                return ck6Var.mo707a(view, num.intValue(), activities);
            }
            return false;
        }
        if (i == 7) {
            ck6 ck6Var2 = this.I0;
            Activities activities2 = this.G0;
            Integer num2 = this.H0;
            if (ck6Var2 != null) {
                return ck6Var2.mo707a(view, num2.intValue(), activities2);
            }
            return false;
        }
        if (i != 9) {
            return false;
        }
        ck6 ck6Var3 = this.I0;
        Activities activities3 = this.G0;
        Integer num3 = this.H0;
        if (ck6Var3 != null) {
            return ck6Var3.mo707a(view, num3.intValue(), activities3);
        }
        return false;
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (7 == i) {
            h0((rog) obj);
        } else if (73 == i) {
            k0((Integer) obj);
        } else if (33 == i) {
            i0((ck6) obj);
        } else {
            if (67 != i) {
                return false;
            }
            j0((Activities) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        if (i == 1) {
            ck6 ck6Var = this.I0;
            Activities activities = this.G0;
            Integer num = this.H0;
            if (ck6Var != null) {
                ck6Var.mo708b(view, num.intValue(), activities);
                return;
            }
            return;
        }
        if (i == 2) {
            ck6 ck6Var2 = this.I0;
            Activities activities2 = this.G0;
            Integer num2 = this.H0;
            if (ck6Var2 != null) {
                ck6Var2.mo708b(view, num2.intValue(), activities2);
                return;
            }
            return;
        }
        if (i == 4) {
            ck6 ck6Var3 = this.I0;
            Activities activities3 = this.G0;
            Integer num3 = this.H0;
            if (ck6Var3 != null) {
                ck6Var3.mo708b(view, num3.intValue(), activities3);
                return;
            }
            return;
        }
        if (i == 5) {
            ck6 ck6Var4 = this.I0;
            Activities activities4 = this.G0;
            Integer num4 = this.H0;
            if (ck6Var4 != null) {
                ck6Var4.mo708b(view, num4.intValue(), activities4);
                return;
            }
            return;
        }
        if (i == 6) {
            ck6 ck6Var5 = this.I0;
            Activities activities5 = this.G0;
            Integer num5 = this.H0;
            if (ck6Var5 != null) {
                ck6Var5.mo708b(view, num5.intValue(), activities5);
                return;
            }
            return;
        }
        if (i != 8) {
            return;
        }
        ck6 ck6Var6 = this.I0;
        Activities activities6 = this.G0;
        Integer num6 = this.H0;
        if (ck6Var6 != null) {
            ck6Var6.mo708b(view, num6.intValue(), activities6);
        }
    }

    public void h0(rog rogVar) {
        this.J0 = rogVar;
        synchronized (this) {
            this.T0 |= 1;
        }
        m28509h(7);
        super.m25692R();
    }

    public void i0(ck6 ck6Var) {
        this.I0 = ck6Var;
        synchronized (this) {
            this.T0 |= 4;
        }
        m28509h(33);
        super.m25692R();
    }

    public void j0(Activities activities) {
        this.G0 = activities;
        synchronized (this) {
            this.T0 |= 8;
        }
        m28509h(67);
        super.m25692R();
    }

    public void k0(Integer num) {
        this.H0 = num;
        synchronized (this) {
            this.T0 |= 2;
        }
        m28509h(73);
        super.m25692R();
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    @Override // p001o.ewi
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo16295p() {
        long j;
        boolean z;
        long j2;
        String str;
        String str2;
        String str3;
        boolean z2;
        int i;
        boolean z3;
        int i2;
        int i3;
        int i4;
        long j3;
        long j4;
        String str4;
        boolean z4;
        long j5;
        long j6;
        int i5;
        String str5;
        String str6;
        String activityDoneByName;
        boolean z5;
        synchronized (this) {
            j = this.T0;
            this.T0 = 0L;
        }
        rog rogVar = this.J0;
        Activities activities = this.G0;
        long j7 = j & 25;
        if (j7 != 0) {
            z = rogVar != null;
            if (j7 != 0) {
                j = z ? j | MediaStatus.COMMAND_FOLLOW : j | MediaStatus.COMMAND_DISLIKE;
            }
        } else {
            z = false;
        }
        long j8 = j & 24;
        String toPersonName = null;
        if (j8 != 0) {
            if (activities != null) {
                String toPersonName2 = activities.getToPersonName();
                String note = activities.getNote();
                boolean zIsNewItem = activities.isNewItem();
                long duration = activities.getDuration();
                String activityType = activities.getActivityType();
                activityDoneByName = activities.getActivityDoneByName();
                str5 = activityType;
                j2 = duration;
                z5 = zIsNewItem;
                str6 = toPersonName2;
                toPersonName = note;
            } else {
                j2 = 0;
                str5 = null;
                str6 = null;
                activityDoneByName = null;
                z5 = false;
            }
            if (j8 != 0) {
                j |= z5 ? MediaStatus.COMMAND_EDIT_TRACKS : MediaStatus.COMMAND_QUEUE_REPEAT_ONE;
            }
            z2 = toPersonName != null;
            int i6 = z5 ? 0 : 8;
            boolean z6 = str5 != "CALL_RECORD_AVAILABLE";
            z3 = activityDoneByName == null;
            if ((j & 24) != 0) {
                j = z2 ? j | MediaStatus.COMMAND_QUEUE_REPEAT_ALL : j | 512;
            }
            if ((j & 24) != 0) {
                j |= z6 ? Javac.GENERATED_MEMBER : 8388608L;
            }
            if ((j & 24) != 0) {
                j = z3 ? j | 64 : j | 32;
            }
            i = z6 ? 8 : 0;
            str2 = str5;
            str3 = toPersonName;
            toPersonName = str6;
            i2 = i6;
            str = activityDoneByName;
        } else {
            j2 = 0;
            str = null;
            str2 = null;
            str3 = null;
            z2 = false;
            i = 0;
            z3 = false;
            i2 = 0;
        }
        boolean z7 = ((j & MediaStatus.COMMAND_QUEUE_REPEAT_ALL) == 0 || str3 == "") ? false : true;
        boolean zIsEmpty = ((j & 32) == 0 || str == null) ? false : str.isEmpty();
        boolean zM47035a = ((MediaStatus.COMMAND_FOLLOW & j) == 0 || rogVar == null) ? false : rogVar.m47035a();
        long j9 = j & 24;
        if (j9 != 0) {
            if (z3) {
                zIsEmpty = true;
            }
            if (!z2) {
                z7 = false;
            }
            if (j9 != 0) {
                j |= zIsEmpty ? 4194304L : 2097152L;
            }
            if ((j & 24) != 0) {
                j |= z7 ? 1048576L : 524288L;
            }
            i3 = zIsEmpty ? 8 : 0;
            if (!z7) {
                i4 = 8;
            }
            j3 = j & 25;
            if (j3 == 0) {
                if (!z) {
                    zM47035a = false;
                }
                if (j3 != 0) {
                    j = zM47035a ? j | MediaStatus.COMMAND_STREAM_TRANSFER : j | MediaStatus.COMMAND_UNFOLLOW;
                }
            } else {
                zM47035a = false;
            }
            j4 = j & MediaStatus.COMMAND_UNFOLLOW;
            if (j4 == 0) {
                if (activities != null) {
                    toPersonName = activities.getToPersonName();
                }
                z4 = toPersonName == null;
                if (j4 != 0) {
                    j = z4 ? j | 256 : j | 128;
                }
                str4 = toPersonName;
            } else {
                str4 = toPersonName;
                z4 = false;
            }
            boolean zIsEmpty2 = ((j & 128) != 0 || str4 == null) ? false : str4.isEmpty();
            if ((MediaStatus.COMMAND_UNFOLLOW & j) == 0) {
                if (z4) {
                    zIsEmpty2 = true;
                }
                j5 = 25;
            } else {
                j5 = 25;
                zIsEmpty2 = false;
            }
            j6 = j & j5;
            if (j6 == 0) {
                if (zM47035a) {
                    zIsEmpty2 = true;
                }
                if (j6 != 0) {
                    j |= zIsEmpty2 ? MediaStatus.COMMAND_LIKE : MediaStatus.COMMAND_PLAYBACK_RATE;
                }
                i5 = zIsEmpty2 ? 8 : 0;
            } else {
                i5 = 0;
            }
            if ((24 & j) != 0) {
                this.n0.setVisibility(i2);
                this.p0.setVisibility(i4);
                nr1.B0(this.p0, str3);
                nr1.m40964i(this.q0, activities);
                nr1.Z2(this.q0, str2);
                nr1.s2(this.s0, Long.valueOf(j2));
                nr1.g1(this.u0, str4);
                nr1.m40941L(this.u0, activities);
                nr1.g1(this.v0, str);
                this.v0.setVisibility(i3);
                nr1.m40942M(this.v0, activities);
                nr1.t1(this.y0, activities);
                this.z0.setVisibility(i);
                nr1.j3(this.B0, str2);
                nr1.o1(this.C0, activities);
                nr1.p1(this.D0, activities);
                fu5.m27486a(this.E0, activities);
            }
            if ((16 & j) != 0) {
                this.r0.setOnClickListener(this.M0);
                this.u0.setOnClickListener(this.R0);
                this.u0.setOnLongClickListener(this.L0);
                this.v0.setOnClickListener(this.O0);
                this.v0.setOnLongClickListener(this.Q0);
                this.y0.setOnClickListener(this.N0);
                this.y0.setOnLongClickListener(this.P0);
                this.z0.setOnClickListener(this.S0);
                this.B0.setOnClickListener(this.K0);
            }
            if ((j & 25) == 0) {
                this.u0.setVisibility(i5);
                return;
            }
            return;
        }
        i3 = 0;
        i4 = 0;
        j3 = j & 25;
        if (j3 == 0) {
        }
        j4 = j & MediaStatus.COMMAND_UNFOLLOW;
        if (j4 == 0) {
        }
        if ((j & 128) != 0) {
        }
        if ((MediaStatus.COMMAND_UNFOLLOW & j) == 0) {
        }
        j6 = j & j5;
        if (j6 == 0) {
        }
        if ((24 & j) != 0) {
        }
        if ((16 & j) != 0) {
        }
        if ((j & 25) == 0) {
        }
    }

    public wz8(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (TextView) objArr[10], (MaterialButton) objArr[16], (MaterialTextView) objArr[4], (ShapeableImageView) objArr[9], (ShapeableImageView) objArr[7], (MaterialTextView) objArr[12], (ShapeableImageView) objArr[18], (Chip) objArr[11], (Chip) objArr[8], (FrameLayout) objArr[17], (KonfettiView) objArr[13], (ShapeableImageView) objArr[5], (LinearLayout) objArr[6], (SeekBar) objArr[14], (MaterialCardView) objArr[0], (MaterialTextView) objArr[2], (MaterialTextView) objArr[3], (MaterialTextView) objArr[1], (TextView) objArr[15]);
        this.T0 = -1L;
        this.n0.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        this.r0.setTag(null);
        this.s0.setTag(null);
        this.u0.setTag(null);
        this.v0.setTag(null);
        this.y0.setTag(null);
        this.z0.setTag(null);
        this.B0.setTag(null);
        this.C0.setTag(null);
        this.D0.setTag(null);
        this.E0.setTag(null);
        a0(view);
        this.K0 = new jbc(this, 1);
        this.L0 = new sbc(this, 9);
        this.M0 = new jbc(this, 5);
        this.N0 = new jbc(this, 2);
        this.O0 = new jbc(this, 6);
        this.P0 = new sbc(this, 3);
        this.Q0 = new sbc(this, 7);
        this.R0 = new jbc(this, 8);
        this.S0 = new jbc(this, 4);
        mo16291G();
    }
}
