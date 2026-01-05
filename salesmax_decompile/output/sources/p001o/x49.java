package p001o;

import ai.salesmax.model.LeadsUser;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import java.util.Optional;
import lombok.javac.Javac;
import p001o.ewi;
import p001o.jbc;
import p001o.sbc;

/* loaded from: classes.dex */
public class x49 extends w49 implements jbc.InterfaceC14485a, sbc.InterfaceC16795a {
    public static final ewi.C13274i J0 = null;
    public static final SparseIntArray K0 = null;
    public final View.OnClickListener B0;
    public final View.OnLongClickListener C0;
    public final View.OnClickListener D0;
    public final View.OnClickListener E0;
    public final View.OnClickListener F0;
    public final View.OnClickListener G0;
    public final View.OnClickListener H0;
    public long I0;

    public x49(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 10, J0, K0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.I0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.I0 = 16L;
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
        ck6 ck6Var = this.z0;
        LeadsUser leadsUser = this.x0;
        Integer num = this.y0;
        if (ck6Var != null) {
            return ck6Var.mo707a(view, num.intValue(), leadsUser);
        }
        return false;
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (7 == i) {
            h0((String) obj);
        } else if (73 == i) {
            k0((Integer) obj);
        } else if (33 == i) {
            i0((ck6) obj);
        } else {
            if (67 != i) {
                return false;
            }
            j0((LeadsUser) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        if (i == 1) {
            ck6 ck6Var = this.z0;
            LeadsUser leadsUser = this.x0;
            Integer num = this.y0;
            if (ck6Var != null) {
                ck6Var.mo708b(view, num.intValue(), leadsUser);
                return;
            }
            return;
        }
        if (i == 3) {
            ck6 ck6Var2 = this.z0;
            LeadsUser leadsUser2 = this.x0;
            Integer num2 = this.y0;
            if (ck6Var2 != null) {
                ck6Var2.mo708b(view, num2.intValue(), leadsUser2);
                return;
            }
            return;
        }
        if (i == 4) {
            ck6 ck6Var3 = this.z0;
            LeadsUser leadsUser3 = this.x0;
            Integer num3 = this.y0;
            if (ck6Var3 != null) {
                ck6Var3.mo708b(view, num3.intValue(), leadsUser3);
                return;
            }
            return;
        }
        if (i == 5) {
            ck6 ck6Var4 = this.z0;
            LeadsUser leadsUser4 = this.x0;
            Integer num4 = this.y0;
            if (ck6Var4 != null) {
                ck6Var4.mo708b(view, num4.intValue(), leadsUser4);
                return;
            }
            return;
        }
        if (i == 6) {
            ck6 ck6Var5 = this.z0;
            LeadsUser leadsUser5 = this.x0;
            Integer num5 = this.y0;
            if (ck6Var5 != null) {
                ck6Var5.mo708b(view, num5.intValue(), leadsUser5);
                return;
            }
            return;
        }
        if (i != 7) {
            return;
        }
        ck6 ck6Var6 = this.z0;
        LeadsUser leadsUser6 = this.x0;
        Integer num6 = this.y0;
        if (ck6Var6 != null) {
            ck6Var6.mo708b(view, num6.intValue(), leadsUser6);
        }
    }

    public void h0(String str) {
        this.A0 = str;
        synchronized (this) {
            this.I0 |= 1;
        }
        m28509h(7);
        super.m25692R();
    }

    public void i0(ck6 ck6Var) {
        this.z0 = ck6Var;
        synchronized (this) {
            this.I0 |= 4;
        }
        m28509h(33);
        super.m25692R();
    }

    public void j0(LeadsUser leadsUser) {
        this.x0 = leadsUser;
        synchronized (this) {
            this.I0 |= 8;
        }
        m28509h(67);
        super.m25692R();
    }

    public void k0(Integer num) {
        this.y0 = num;
        synchronized (this) {
            this.I0 |= 2;
        }
        m28509h(73);
        super.m25692R();
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0280 A[PHI: r2
      0x0280: PHI (r2v7 long) = (r2v6 long), (r2v22 long) binds: [B:168:0x0265, B:177:0x027a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02fd A[PHI: r2
      0x02fd: PHI (r2v10 long) = (r2v9 long), (r2v16 long) binds: [B:213:0x02e0, B:221:0x02f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:262:? A[RETURN, SYNTHETIC] */
    @Override // p001o.ewi
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo16295p() {
        long j;
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        boolean zIsSelected;
        String str;
        String str2;
        String str3;
        long j2;
        boolean z4;
        boolean z5;
        boolean z6;
        long j3;
        int i2;
        long j4;
        int i3;
        long j5;
        long j6;
        long j7;
        int i4;
        long j8;
        String str4;
        String str5;
        Optional<String> optional;
        String name;
        synchronized (this) {
            j = this.I0;
            this.I0 = 0L;
        }
        String str6 = this.A0;
        LeadsUser leadsUser = this.x0;
        int i5 = 0;
        if ((j & 25) != 0) {
            long j9 = j & 17;
            if (j9 != 0) {
                z2 = str6 == "select to modify role";
                z3 = str6 != "select for team";
                if (j9 != 0) {
                    j = z2 ? j | 268435456 : j | 134217728;
                }
                if ((j & 17) != 0) {
                    j = z3 ? j | MediaStatus.COMMAND_QUEUE_REPEAT_ALL : j | 512;
                }
            } else {
                z2 = false;
                z3 = false;
            }
            z = str6 == "select for team";
            if ((j & 17) != 0) {
                j = z ? j | MediaStatus.COMMAND_LIKE : j | MediaStatus.COMMAND_PLAYBACK_RATE;
            }
            if ((j & 25) != 0) {
                j = z ? j | MediaStatus.COMMAND_STREAM_TRANSFER : j | MediaStatus.COMMAND_UNFOLLOW;
            }
        } else {
            z = false;
            z2 = false;
            z3 = false;
        }
        long j10 = j & 24;
        if (j10 != 0) {
            if (leadsUser != null) {
                String authorizationLevel = leadsUser.getAuthorizationLevel();
                boolean zIsSelected2 = leadsUser.isSelected();
                String userAccountStatus = leadsUser.getUserAccountStatus();
                Optional<String> teamRole = leadsUser.getTeamRole();
                name = leadsUser.getName();
                str4 = authorizationLevel;
                zIsSelected = zIsSelected2;
                str5 = userAccountStatus;
                optional = teamRole;
            } else {
                zIsSelected = false;
                str4 = null;
                str5 = null;
                optional = null;
                name = null;
            }
            String str7 = str4 + " - ";
            boolean z7 = str4 == "MEMBER";
            if (j10 != 0) {
                j |= z7 ? 1048576L : 524288L;
            }
            String strOrElse = optional != null ? optional.orElse("") : null;
            String str8 = str7 + str5;
            i = z7 ? 8 : 0;
            str2 = "Role : " + strOrElse;
            str = str8;
            str3 = name;
        } else {
            i = 0;
            zIsSelected = false;
            str = null;
            str2 = null;
            str3 = null;
        }
        boolean z8 = (j & MediaStatus.COMMAND_PLAYBACK_RATE) != 0 && str6 == "select for chat";
        if ((j & MediaStatus.COMMAND_UNFOLLOW) != 0) {
            z2 = str6 == "select to modify role";
            if ((j & 17) != 0) {
                j = z2 ? j | 268435456 : j | 134217728;
            }
        }
        boolean z9 = ((j & MediaStatus.COMMAND_QUEUE_REPEAT_ALL) == 0 || str6 == "remove from chat") ? false : true;
        long j11 = j & 17;
        if (j11 != 0) {
            if (!z3) {
                z9 = false;
            }
            if (z) {
                z8 = true;
            }
            if (j11 != 0) {
                j = z9 ? j | MediaStatus.COMMAND_EDIT_TRACKS : j | MediaStatus.COMMAND_QUEUE_REPEAT_ONE;
            }
            j2 = 0;
            if ((j & 17) != 0) {
                j = z8 ? j | MediaStatus.COMMAND_FOLLOW : j | MediaStatus.COMMAND_DISLIKE;
            }
        } else {
            j2 = 0;
            z9 = false;
            z8 = false;
        }
        long j12 = j & 25;
        if (j12 != j2) {
            z4 = z ? true : z2;
            if (j12 != j2) {
                j = z4 ? j | 1073741824 : j | 536870912;
            }
        } else {
            z4 = false;
        }
        boolean z10 = (j & 134217728) != 0 && str6 == "select to remove";
        boolean z11 = (j & MediaStatus.COMMAND_DISLIKE) != 0 && str6 == "remove from chat";
        if ((j & 1073741824) != 0 && leadsUser != null) {
            zIsSelected = leadsUser.isSelected();
        }
        if ((j & MediaStatus.COMMAND_EDIT_TRACKS) != 0) {
            z5 = z10;
            if (str6 != "select for chat") {
                z6 = true;
            }
            j3 = j & 17;
            if (j3 == 0) {
                if (!z9) {
                    z6 = false;
                }
                if (z8) {
                    z11 = true;
                }
                boolean z12 = z2 ? true : z5;
                if (j3 != 0) {
                    j = z6 ? j | 17179869184L : j | 8589934592L;
                }
                if ((j & 17) != 0) {
                    j = z11 ? j | 64 : j | 32;
                }
                if ((j & 17) != 0) {
                    j |= z12 ? 68719476736L : 34359738368L;
                }
                i2 = z12 ? 0 : 8;
            } else {
                i2 = 0;
                z6 = false;
                z11 = false;
            }
            j4 = j & 25;
            if (j4 == 0) {
                i3 = 0;
            } else {
                boolean z13 = z4 ? zIsSelected : false;
                if (j4 != 0) {
                    j |= z13 ? 4194304L : 2097152L;
                }
                if (!z13) {
                    i3 = 8;
                }
            }
            if ((j & 32) != 0) {
                z5 = str6 == "select to remove";
            }
            boolean z14 = (j & 17179869184L) == 0 && str6 != "select to remove";
            j5 = j & 17;
            if (j5 == 0) {
                if (z11) {
                    z5 = true;
                }
                if (!z6) {
                    z14 = false;
                }
                if (j5 != 0) {
                    j |= z5 ? 67108864L : 33554432L;
                }
                j6 = 0;
                if ((j & 17) != 0) {
                    j = z14 ? j | Javac.GENERATED_MEMBER : j | 8388608;
                }
            } else {
                j6 = 0;
                z14 = false;
                z5 = false;
            }
            j7 = j & 17;
            if (j7 == j6) {
                i4 = 0;
            } else {
                if (z5) {
                    z2 = true;
                }
                if (j7 != j6) {
                    j |= z2 ? 4294967296L : 2147483648L;
                }
                if (!z2) {
                    i4 = 8;
                }
            }
            boolean z15 = (j & Javac.GENERATED_MEMBER) == 0 && str6 != "select to modify role";
            j8 = j & 17;
            if (j8 != 0) {
                if (!z14) {
                    z15 = false;
                }
                if (j8 != 0) {
                    j |= z15 ? 256L : 128L;
                }
                if (!z15) {
                    i5 = 8;
                }
            }
            int i6 = i5;
            if ((16 & j) != 0) {
                this.n0.setOnClickListener(this.F0);
                this.o0.setOnClickListener(this.G0);
                this.p0.setOnClickListener(this.E0);
                this.q0.setOnClickListener(this.H0);
                this.q0.setOnLongClickListener(this.C0);
                this.r0.setOnClickListener(this.D0);
                this.s0.setOnClickListener(this.B0);
            }
            if ((j & 24) != 0) {
                this.n0.setVisibility(i);
                np3.m40895a(this.p0, zIsSelected);
                nr1.V0(this.r0, leadsUser);
                nr1.f1(this.u0, str3);
                nr1.f1(this.v0, str);
                nr1.f1(this.w0, str2);
            }
            if ((j & 17) != 0) {
                this.p0.setVisibility(i4);
                this.s0.setVisibility(i6);
                fjh.m26938c(this.s0, str6);
                this.w0.setVisibility(i2);
            }
            if ((j & 25) == 0) {
                this.t0.setVisibility(i3);
                return;
            }
            return;
        }
        z5 = z10;
        z6 = false;
        j3 = j & 17;
        if (j3 == 0) {
        }
        j4 = j & 25;
        if (j4 == 0) {
        }
        if ((j & 32) != 0) {
        }
        if ((j & 17179869184L) == 0) {
        }
        j5 = j & 17;
        if (j5 == 0) {
        }
        j7 = j & 17;
        if (j7 == j6) {
        }
        if ((j & Javac.GENERATED_MEMBER) == 0) {
        }
        j8 = j & 17;
        if (j8 != 0) {
        }
        int i62 = i5;
        if ((16 & j) != 0) {
        }
        if ((j & 24) != 0) {
        }
        if ((j & 17) != 0) {
        }
        if ((j & 25) == 0) {
        }
    }

    public x49(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialButton) objArr[6], (MaterialButton) objArr[7], (CheckBox) objArr[9], (MaterialCardView) objArr[0], (ShapeableImageView) objArr[1], (MaterialButton) objArr[8], (MaterialButtonToggleGroup) objArr[5], (MaterialTextView) objArr[2], (MaterialTextView) objArr[3], (MaterialTextView) objArr[4]);
        this.I0 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        this.r0.setTag(null);
        this.s0.setTag(null);
        this.t0.setTag(null);
        this.u0.setTag(null);
        this.v0.setTag(null);
        this.w0.setTag(null);
        a0(view);
        this.B0 = new jbc(this, 6);
        this.C0 = new sbc(this, 2);
        this.D0 = new jbc(this, 3);
        this.E0 = new jbc(this, 7);
        this.F0 = new jbc(this, 4);
        this.G0 = new jbc(this, 5);
        this.H0 = new jbc(this, 1);
        mo16291G();
    }
}
