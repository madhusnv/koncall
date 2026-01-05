package p001o;

import ai.salesmax.model.AutoCallConfig;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ObservableBoolean;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class o31 extends n31 {
    public static final ewi.C13274i q1 = null;
    public static final SparseIntArray r1;
    public final ConstraintLayout n1;
    public boolean o1;
    public long p1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        r1 = sparseIntArray;
        sparseIntArray.put(z8e.autoCallToolbar, 6);
        sparseIntArray.put(z8e.settingsBack, 7);
        sparseIntArray.put(z8e.pageHeading, 8);
        sparseIntArray.put(z8e.autoCallExplanation, 9);
        sparseIntArray.put(z8e.autoCallExplanationText, 10);
        sparseIntArray.put(z8e.viewedAutoCallExplanationButton, 11);
        sparseIntArray.put(z8e.lastCalledMessage, 12);
        sparseIntArray.put(z8e.lastCalledBtnGroup, 13);
        sparseIntArray.put(z8e.btnSkipToday, 14);
        sparseIntArray.put(z8e.btnSkipThisWeek, 15);
        sparseIntArray.put(z8e.btnSkipThisMonth, 16);
        sparseIntArray.put(z8e.btnSkipCustomDays, 17);
        sparseIntArray.put(z8e.textCustomDaysToSkipHint, 18);
        sparseIntArray.put(z8e.textCustomDaysToSkip, 19);
        sparseIntArray.put(z8e.dispositionMessage, 20);
        sparseIntArray.put(z8e.toggleDispositionTypeBtnGroup, 21);
        sparseIntArray.put(z8e.btnAllCalls, 22);
        sparseIntArray.put(z8e.btnConnectedCalls, 23);
        sparseIntArray.put(z8e.btnOverThirtySecCalls, 24);
        sparseIntArray.put(z8e.nextCallIntervalMessage, 25);
        sparseIntArray.put(z8e.toggleGroupNexCallInterval, 26);
        sparseIntArray.put(z8e.btnTwoSec, 27);
        sparseIntArray.put(z8e.btnFiveSec, 28);
        sparseIntArray.put(z8e.btnTenSec, 29);
        sparseIntArray.put(z8e.btnTwentySec, 30);
        sparseIntArray.put(z8e.btnManually, 31);
        sparseIntArray.put(z8e.selectCallingScript, 32);
        sparseIntArray.put(z8e.cardCallScriptAction, 33);
        sparseIntArray.put(z8e.callScriptTitle, 34);
        sparseIntArray.put(z8e.cardCreateNewAction, 35);
        sparseIntArray.put(z8e.cardCreateNewTitle, 36);
        sparseIntArray.put(z8e.maxRetriesMessage, 37);
        sparseIntArray.put(z8e.toggleMaxRetries, 38);
        sparseIntArray.put(z8e.btnOneTime, 39);
        sparseIntArray.put(z8e.btnTwoTimes, 40);
        sparseIntArray.put(z8e.btnThreeTimes, 41);
        sparseIntArray.put(z8e.minGapMessage, 42);
        sparseIntArray.put(z8e.toggleMinGap, 43);
        sparseIntArray.put(z8e.btnOneHour, 44);
        sparseIntArray.put(z8e.btnTwoHours, 45);
        sparseIntArray.put(z8e.btnThreeHours, 46);
        sparseIntArray.put(z8e.btnFourHours, 47);
        sparseIntArray.put(z8e.buttonStartAutocall, 48);
    }

    public o31(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 49, q1, r1));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.p1 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.p1 = 32L;
        }
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return m0((ObservableBoolean) obj, i2);
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (100 == i) {
            l0(((Boolean) obj).booleanValue());
        } else if (73 == i) {
            p0((Integer) obj);
        } else if (33 == i) {
            n0((ck6) obj);
        } else {
            if (67 != i) {
                return false;
            }
            k0((AutoCallConfig) obj);
        }
        return true;
    }

    @Override // p001o.n31
    public void k0(AutoCallConfig autoCallConfig) {
        this.k1 = autoCallConfig;
        synchronized (this) {
            this.p1 |= 16;
        }
        m28509h(67);
        super.m25692R();
    }

    @Override // p001o.n31
    public void l0(boolean z) {
        this.j1 = z;
        synchronized (this) {
            this.p1 |= 2;
        }
        m28509h(100);
        super.m25692R();
    }

    public final boolean m0(ObservableBoolean observableBoolean, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.p1 |= 1;
        }
        return true;
    }

    public void n0(ck6 ck6Var) {
        this.m1 = ck6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0078 A[PHI: r2
      0x0078: PHI (r2v3 long) = (r2v2 long), (r2v8 long) binds: [B:33:0x0061, B:42:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p001o.ewi
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo16295p() {
        long j;
        boolean z;
        int i;
        synchronized (this) {
            j = this.p1;
            this.p1 = 0L;
        }
        boolean z2 = this.j1;
        AutoCallConfig autoCallConfig = this.k1;
        long j2 = j & 32;
        if (j2 != 0 && j2 != 0) {
            j |= od3.m42022H().m5959i() ? 512L : 256L;
        }
        long j3 = j & 48;
        if (j3 != 0) {
            script = autoCallConfig != null ? autoCallConfig.getScript() : null;
            z = script != null;
            if (j3 != 0) {
                j = z ? j | 128 : j | 64;
            }
        } else {
            z = false;
        }
        String str = script;
        boolean z3 = ((128 & j) == 0 || str == "") ? false : true;
        long j4 = j & 48;
        if (j4 == 0) {
            i = 0;
        } else {
            if (!z) {
                z3 = false;
            }
            if (j4 != 0) {
                j |= z3 ? MediaStatus.COMMAND_QUEUE_REPEAT_ONE : MediaStatus.COMMAND_QUEUE_REPEAT_ALL;
            }
            if (!z3) {
                i = 8;
            }
        }
        if ((48 & j) != 0) {
            this.n0.setVisibility(i);
            this.a1.setVisibility(i);
            fjh.m26938c(this.h1, str);
        }
        long j5 = j & 32;
        if (j5 != 0) {
            ConstraintLayout constraintLayout = this.n1;
            boolean z4 = this.o1;
            wh1.m54388b(constraintLayout, z4, z4, z4, z4, true, true, true, true);
            this.X0.setVisibility(!od3.m42022H().m5959i() ? 8 : 0);
        }
        if ((j & 34) != 0) {
            np3.m40895a(this.X0, z2);
        }
        if (j5 != 0) {
            this.o1 = true;
        }
    }

    public void p0(Integer num) {
        this.l1 = num;
    }

    public o31(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 1, (MaterialCardView) objArr[3], (MaterialCardView) objArr[9], (MaterialTextView) objArr[10], (ConstraintLayout) objArr[6], (Button) objArr[22], (Button) objArr[23], (Button) objArr[28], (Button) objArr[47], (Button) objArr[31], (Button) objArr[44], (Button) objArr[39], (Button) objArr[24], (Button) objArr[17], (Button) objArr[16], (Button) objArr[15], (Button) objArr[14], (Button) objArr[29], (Button) objArr[46], (Button) objArr[41], (Button) objArr[30], (Button) objArr[45], (Button) objArr[27], (Button) objArr[40], (MaterialButton) objArr[48], (MaterialTextView) objArr[34], (MaterialCardView) objArr[33], (MaterialCardView) objArr[35], (MaterialTextView) objArr[36], (MaterialCardView) objArr[0], (MaterialTextView) objArr[20], (MaterialButtonToggleGroup) objArr[13], (MaterialTextView) objArr[12], (MaterialTextView) objArr[37], (MaterialTextView) objArr[42], (MaterialTextView) objArr[25], (MaterialTextView) objArr[8], (MaterialSwitch) objArr[2], (MaterialTextView) objArr[32], (ShapeableImageView) objArr[7], (MaterialSwitch) objArr[5], (TextInputEditText) objArr[19], (TextInputLayout) objArr[18], (MaterialButtonToggleGroup) objArr[21], (MaterialButtonToggleGroup) objArr[26], (MaterialButtonToggleGroup) objArr[38], (MaterialButtonToggleGroup) objArr[43], (MaterialTextView) objArr[4], (MaterialButton) objArr[11]);
        this.p1 = -1L;
        this.n0.setTag(null);
        this.P0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.n1 = constraintLayout;
        constraintLayout.setTag(null);
        this.X0.setTag(null);
        this.a1.setTag(null);
        this.h1.setTag(null);
        a0(view);
        mo16291G();
    }
}
