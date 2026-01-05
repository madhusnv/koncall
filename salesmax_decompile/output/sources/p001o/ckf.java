package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.textview.MaterialTextView;
import lombok.javac.Javac;
import p001o.ewi;

/* loaded from: classes.dex */
public class ckf extends bkf {
    public static final ewi.C13274i H1 = null;
    public static final SparseIntArray I1;
    public final NestedScrollView C1;
    public final ConstraintLayout D1;
    public final MaterialTextView E1;
    public boolean F1;
    public long G1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I1 = sparseIntArray;
        sparseIntArray.put(z8e.settingsToolbar, 23);
        sparseIntArray.put(z8e.settingsBack, 24);
        sparseIntArray.put(z8e.notificationSettings, 25);
        sparseIntArray.put(z8e.blockedCalls, 26);
        sparseIntArray.put(z8e.callScreeningRole, 27);
        sparseIntArray.put(z8e.screenPopMessage, 28);
        sparseIntArray.put(z8e.saveCallLogMessage, 29);
        sparseIntArray.put(z8e.postCallLogMessage, 30);
        sparseIntArray.put(z8e.missedCallLogMessage, 31);
        sparseIntArray.put(z8e.syncCallMessage, 32);
        sparseIntArray.put(z8e.selectRecordingPath, 33);
        sparseIntArray.put(z8e.pickedRecordingPath, 34);
        sparseIntArray.put(z8e.recordingProviderList, 35);
        sparseIntArray.put(z8e.trackLocationMessage, 36);
        sparseIntArray.put(z8e.trackLocationPeriodicMessage, 37);
        sparseIntArray.put(z8e.defaultSimSelection, 38);
        sparseIntArray.put(z8e.toggleGroup, 39);
        sparseIntArray.put(z8e.simOne, 40);
        sparseIntArray.put(z8e.simTwo, 41);
        sparseIntArray.put(z8e.defaultCallingSimMessage, 42);
        sparseIntArray.put(z8e.businessWhatsappMessage, 43);
        sparseIntArray.put(z8e.allCallSimSelection, 44);
        sparseIntArray.put(z8e.toggleGroupAllCall, 45);
        sparseIntArray.put(z8e.simOneAllCall, 46);
        sparseIntArray.put(z8e.simTwoAllCall, 47);
        sparseIntArray.put(z8e.trackAllCallMessage, 48);
        sparseIntArray.put(z8e.trackAllCallMessageDisabled, 49);
        sparseIntArray.put(z8e.showInAppNotificationMessage, 50);
        sparseIntArray.put(z8e.keepUnassignedMessage, 51);
        sparseIntArray.put(z8e.preferredLanguageMessage, 52);
        sparseIntArray.put(z8e.supportedLanguages, 53);
        sparseIntArray.put(z8e.supportedLanguagesGroup, 54);
    }

    public ckf(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 55, H1, I1));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.G1 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.G1 = MediaStatus.COMMAND_DISLIKE;
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
        if (22 == i) {
            m0(((Boolean) obj).booleanValue());
        } else if (64 == i) {
            t0(((Boolean) obj).booleanValue());
        } else if (78 == i) {
            x0(((Boolean) obj).booleanValue());
        } else if (23 == i) {
            n0(((Boolean) obj).booleanValue());
        } else if (77 == i) {
            w0(((Boolean) obj).booleanValue());
        } else if (3 == i) {
            j0(((Boolean) obj).booleanValue());
        } else if (59 == i) {
            s0(((Boolean) obj).booleanValue());
        } else if (84 == i) {
            y0(((Boolean) obj).booleanValue());
        } else if (11 == i) {
            l0(((Boolean) obj).booleanValue());
        } else if (34 == i) {
            q0(((Boolean) obj).booleanValue());
        } else if (12 == i) {
            z0((String) obj);
        } else if (74 == i) {
            u0(((Boolean) obj).booleanValue());
        } else if (4 == i) {
            k0(((Boolean) obj).booleanValue());
        } else if (75 == i) {
            v0((String) obj);
        } else {
            if (25 != i) {
                return false;
            }
            p0(((Boolean) obj).booleanValue());
        }
        return true;
    }

    @Override // p001o.bkf
    public void j0(boolean z) {
        this.v1 = z;
        synchronized (this) {
            this.G1 |= 32;
        }
        m28509h(3);
        super.m25692R();
    }

    @Override // p001o.bkf
    public void k0(boolean z) {
        this.w1 = z;
        synchronized (this) {
            this.G1 |= MediaStatus.COMMAND_EDIT_TRACKS;
        }
        m28509h(4);
        super.m25692R();
    }

    @Override // p001o.bkf
    public void l0(boolean z) {
        this.r1 = z;
        synchronized (this) {
            this.G1 |= 256;
        }
        m28509h(11);
        super.m25692R();
    }

    @Override // p001o.bkf
    public void m0(boolean z) {
        this.x1 = z;
        synchronized (this) {
            this.G1 |= 1;
        }
        m28509h(22);
        super.m25692R();
    }

    @Override // p001o.bkf
    public void n0(boolean z) {
        this.y1 = z;
        synchronized (this) {
            this.G1 |= 8;
        }
        m28509h(23);
        super.m25692R();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0044 A[PHI: r2
      0x0044: PHI (r2v1 long) = (r2v0 long), (r2v21 long) binds: [B:7:0x0033, B:13:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p001o.ewi
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo16295p() {
        long j;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean zEqualsIgnoreCase;
        boolean zEqualsIgnoreCase2;
        boolean zEqualsIgnoreCase3;
        boolean zEqualsIgnoreCase4;
        boolean zEqualsIgnoreCase5;
        boolean zEqualsIgnoreCase6;
        synchronized (this) {
            j = this.G1;
            this.G1 = 0L;
        }
        boolean z15 = this.x1;
        boolean z16 = this.q1;
        boolean z17 = this.n1;
        boolean z18 = this.y1;
        boolean z19 = this.o1;
        boolean z20 = this.v1;
        boolean z21 = this.z1;
        boolean z22 = this.A1;
        boolean z23 = this.r1;
        boolean z24 = this.s1;
        boolean z25 = this.p1;
        boolean z26 = this.w1;
        String str = this.u1;
        boolean z27 = this.B1;
        long j2 = j & 33280;
        boolean zEqualsIgnoreCase7 = false;
        if (j2 == 0) {
            i = 0;
        } else {
            if (j2 != 0) {
                j |= z24 ? 134217728L : 67108864L;
            }
            if (!z24) {
                i = 8;
            }
        }
        long j3 = j & 40960;
        if (j3 != 0) {
            if (str != null) {
                z2 = z22;
                z = z17;
                zEqualsIgnoreCase7 = str.equalsIgnoreCase(this.y0.getResources().getString(hae.lang_marathi));
                zEqualsIgnoreCase2 = str.equalsIgnoreCase(this.w0.getResources().getString(hae.lang_hindi));
                zEqualsIgnoreCase3 = str.equalsIgnoreCase(this.z0.getResources().getString(hae.lang_tamil));
                zEqualsIgnoreCase4 = str.equalsIgnoreCase(this.x0.getResources().getString(hae.lang_kannada));
                zEqualsIgnoreCase5 = str.equalsIgnoreCase(this.A0.getResources().getString(hae.lang_telugu));
                zEqualsIgnoreCase6 = str.equalsIgnoreCase(this.u0.getResources().getString(hae.lang_bengali));
                zEqualsIgnoreCase = str.equalsIgnoreCase(this.v0.getResources().getString(hae.lang_english));
            } else {
                z = z17;
                z2 = z22;
                zEqualsIgnoreCase = false;
                zEqualsIgnoreCase2 = false;
                zEqualsIgnoreCase3 = false;
                zEqualsIgnoreCase4 = false;
                zEqualsIgnoreCase5 = false;
                zEqualsIgnoreCase6 = false;
            }
            if (j3 != 0) {
                j |= zEqualsIgnoreCase7 ? 33554432L : Javac.GENERATED_MEMBER;
            }
            if ((j & 40960) != 0) {
                j |= zEqualsIgnoreCase2 ? 524288L : MediaStatus.COMMAND_STREAM_TRANSFER;
            }
            if ((j & 40960) != 0) {
                j |= zEqualsIgnoreCase3 ? 8388608L : 4194304L;
            }
            if ((j & 40960) != 0) {
                j |= zEqualsIgnoreCase4 ? 2147483648L : 1073741824L;
            }
            if ((j & 40960) != 0) {
                j |= zEqualsIgnoreCase5 ? 536870912L : 268435456L;
            }
            if ((j & 40960) != 0) {
                j |= zEqualsIgnoreCase6 ? 2097152L : 1048576L;
            }
            if ((j & 40960) != 0) {
                j |= zEqualsIgnoreCase ? MediaStatus.COMMAND_UNFOLLOW : MediaStatus.COMMAND_FOLLOW;
            }
            z8 = zEqualsIgnoreCase;
            z4 = z19;
            z11 = zEqualsIgnoreCase2;
            z9 = zEqualsIgnoreCase4;
            z6 = zEqualsIgnoreCase6;
            z3 = z16;
            z7 = zEqualsIgnoreCase3;
            z5 = z21;
            z10 = zEqualsIgnoreCase5;
            boolean z28 = zEqualsIgnoreCase7;
            z12 = z25;
            z13 = z28;
        } else {
            z = z17;
            z2 = z22;
            z3 = z16;
            z4 = z19;
            z5 = z21;
            z6 = false;
            z7 = false;
            z8 = false;
            z9 = false;
            z10 = false;
            z11 = false;
            z12 = z25;
            z13 = false;
        }
        long j4 = j & 49152;
        if ((j & 36864) != 0) {
            z14 = z27;
            np3.m40895a(this.n0, z26);
        } else {
            z14 = z27;
        }
        if ((j & 32800) != 0) {
            np3.m40895a(this.o0, z20);
        }
        if ((j & 33024) != 0) {
            np3.m40895a(this.s0, z23);
        }
        if ((j & 40960) != 0) {
            np3.m40895a(this.u0, z6);
            np3.m40895a(this.v0, z8);
            np3.m40895a(this.w0, z11);
            np3.m40895a(this.x0, z9);
            np3.m40895a(this.y0, z13);
            np3.m40895a(this.z0, z7);
            np3.m40895a(this.A0, z10);
        }
        if ((j & 33280) != 0) {
            this.B0.setVisibility(i);
            this.E1.setVisibility(i);
        }
        if ((32769 & j) != 0) {
            np3.m40895a(this.C0, z15);
        }
        if (j4 != 0) {
            np3.m40895a(this.F0, z14);
        }
        if ((32832 & j) != 0) {
            np3.m40895a(this.H0, z5);
        }
        long j5 = MediaStatus.COMMAND_DISLIKE & j;
        if (j5 != 0) {
            ConstraintLayout constraintLayout = this.D1;
            boolean z29 = this.F1;
            wh1.m54388b(constraintLayout, z29, z29, z29, z29, true, true, true, true);
        }
        if ((32770 & j) != 0) {
            np3.m40895a(this.J0, z3);
        }
        if ((34816 & j) != 0) {
            np3.m40895a(this.N0, z12);
        }
        if ((32784 & j) != 0) {
            np3.m40895a(this.R0, z4);
        }
        if ((32772 & j) != 0) {
            np3.m40895a(this.S0, z);
        }
        if ((32896 & j) != 0) {
            np3.m40895a(this.Y0, z2);
        }
        if ((j & 32776) != 0) {
            np3.m40895a(this.m1, z18);
        }
        if (j5 != 0) {
            this.F1 = true;
        }
    }

    @Override // p001o.bkf
    public void p0(boolean z) {
        this.B1 = z;
        synchronized (this) {
            this.G1 |= MediaStatus.COMMAND_LIKE;
        }
        m28509h(25);
        super.m25692R();
    }

    @Override // p001o.bkf
    public void q0(boolean z) {
        this.s1 = z;
        synchronized (this) {
            this.G1 |= 512;
        }
        m28509h(34);
        super.m25692R();
    }

    @Override // p001o.bkf
    public void s0(boolean z) {
        this.z1 = z;
        synchronized (this) {
            this.G1 |= 64;
        }
        m28509h(59);
        super.m25692R();
    }

    @Override // p001o.bkf
    public void t0(boolean z) {
        this.q1 = z;
        synchronized (this) {
            this.G1 |= 2;
        }
        m28509h(64);
        super.m25692R();
    }

    @Override // p001o.bkf
    public void u0(boolean z) {
        this.p1 = z;
        synchronized (this) {
            this.G1 |= MediaStatus.COMMAND_QUEUE_REPEAT_ONE;
        }
        m28509h(74);
        super.m25692R();
    }

    @Override // p001o.bkf
    public void v0(String str) {
        this.u1 = str;
        synchronized (this) {
            this.G1 |= MediaStatus.COMMAND_PLAYBACK_RATE;
        }
        m28509h(75);
        super.m25692R();
    }

    @Override // p001o.bkf
    public void w0(boolean z) {
        this.o1 = z;
        synchronized (this) {
            this.G1 |= 16;
        }
        m28509h(77);
        super.m25692R();
    }

    @Override // p001o.bkf
    public void x0(boolean z) {
        this.n1 = z;
        synchronized (this) {
            this.G1 |= 4;
        }
        m28509h(78);
        super.m25692R();
    }

    @Override // p001o.bkf
    public void y0(boolean z) {
        this.A1 = z;
        synchronized (this) {
            this.G1 |= 128;
        }
        m28509h(84);
        super.m25692R();
    }

    public void z0(String str) {
        this.t1 = str;
    }

    public ckf(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialSwitch) objArr[10], (MaterialSwitch) objArr[9], (ConstraintLayout) objArr[44], (MaterialButton) objArr[26], (MaterialTextView) objArr[43], (MaterialSwitch) objArr[6], (MaterialButton) objArr[27], (Chip) objArr[21], (Chip) objArr[15], (Chip) objArr[16], (Chip) objArr[17], (Chip) objArr[19], (Chip) objArr[18], (Chip) objArr[20], (RecyclerView) objArr[8], (MaterialSwitch) objArr[11], (MaterialTextView) objArr[42], (ConstraintLayout) objArr[38], (MaterialSwitch) objArr[22], (MaterialTextView) objArr[51], (MaterialSwitch) objArr[14], (MaterialTextView) objArr[31], (MaterialSwitch) objArr[5], (MaterialButton) objArr[25], (MaterialTextView) objArr[34], (MaterialTextView) objArr[30], (MaterialSwitch) objArr[4], (MaterialTextView) objArr[52], (RecyclerView) objArr[35], (MaterialTextView) objArr[29], (MaterialSwitch) objArr[3], (MaterialSwitch) objArr[2], (MaterialTextView) objArr[28], (MaterialButton) objArr[33], (ShapeableImageView) objArr[24], (MaterialCardView) objArr[23], (MaterialTextView) objArr[50], (MaterialSwitch) objArr[13], (Button) objArr[40], (Button) objArr[46], (Button) objArr[41], (Button) objArr[47], (HorizontalScrollView) objArr[53], (ChipGroup) objArr[54], (MaterialTextView) objArr[32], (MaterialButtonToggleGroup) objArr[39], (MaterialButtonToggleGroup) objArr[45], (MaterialTextView) objArr[48], (MaterialTextView) objArr[49], (MaterialTextView) objArr[36], (MaterialTextView) objArr[37], (MaterialSwitch) objArr[12]);
        this.G1 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.s0.setTag(null);
        this.u0.setTag(null);
        this.v0.setTag(null);
        this.w0.setTag(null);
        this.x0.setTag(null);
        this.y0.setTag(null);
        this.z0.setTag(null);
        this.A0.setTag(null);
        this.B0.setTag(null);
        this.C0.setTag(null);
        this.F0.setTag(null);
        this.H0.setTag(null);
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[0];
        this.C1 = nestedScrollView;
        nestedScrollView.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.D1 = constraintLayout;
        constraintLayout.setTag(null);
        MaterialTextView materialTextView = (MaterialTextView) objArr[7];
        this.E1 = materialTextView;
        materialTextView.setTag(null);
        this.J0.setTag(null);
        this.N0.setTag(null);
        this.R0.setTag(null);
        this.S0.setTag(null);
        this.Y0.setTag(null);
        this.m1.setTag(null);
        a0(view);
        mo16291G();
    }
}
