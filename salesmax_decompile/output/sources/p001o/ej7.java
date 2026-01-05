package p001o;

import ai.salesmax.model.LeadsUser;
import ai.salesmax.view.ViewProfileData;
import android.util.SparseIntArray;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.card.MaterialCardView;
import lombok.javac.Javac;
import p001o.ewi;
import p001o.jbc;

/* loaded from: classes.dex */
public class ej7 extends dj7 implements jbc.InterfaceC14485a {
    public static final ewi.C13274i B0 = null;
    public static final SparseIntArray C0;
    public long A0;
    public final NestedScrollView r0;
    public final MaterialCardView s0;
    public final ViewProfileData t0;
    public final ViewProfileData u0;
    public final ViewProfileData v0;
    public final ViewProfileData w0;
    public final ViewProfileData x0;
    public final ViewProfileData y0;
    public final View.OnClickListener z0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C0 = sparseIntArray;
        sparseIntArray.put(z8e.listMemberships, 8);
    }

    public ej7(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 9, B0, C0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.A0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.A0 = 8L;
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
            l0((Integer) obj);
        } else if (33 == i) {
            k0((ck6) obj);
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
        ck6 ck6Var = this.q0;
        LeadsUser leadsUser = this.o0;
        Integer num = this.p0;
        if (ck6Var != null) {
            ck6Var.mo708b(view, num.intValue(), leadsUser);
        }
    }

    @Override // p001o.dj7
    public void j0(LeadsUser leadsUser) {
        this.o0 = leadsUser;
        synchronized (this) {
            this.A0 |= 4;
        }
        m28509h(67);
        super.m25692R();
    }

    public void k0(ck6 ck6Var) {
        this.q0 = ck6Var;
        synchronized (this) {
            this.A0 |= 2;
        }
        m28509h(33);
        super.m25692R();
    }

    public void l0(Integer num) {
        this.p0 = num;
        synchronized (this) {
            this.A0 |= 1;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        String userAccountStatus;
        String designation;
        String registeredNumber;
        String email;
        String authorizationLevel;
        synchronized (this) {
            j = this.A0;
            this.A0 = 0L;
        }
        LeadsUser leadsUser = this.o0;
        long j2 = j & 12;
        String secondaryNumber = null;
        if (j2 != 0) {
            if (leadsUser != null) {
                secondaryNumber = leadsUser.getSecondaryNumber();
                designation = leadsUser.getDesignation();
                registeredNumber = leadsUser.getRegisteredNumber();
                email = leadsUser.getEmail();
                authorizationLevel = leadsUser.getAuthorizationLevel();
                userAccountStatus = leadsUser.getUserAccountStatus();
            } else {
                userAccountStatus = null;
                designation = null;
                registeredNumber = null;
                email = null;
                authorizationLevel = null;
            }
            z = secondaryNumber == null;
            z2 = designation == null;
            z3 = registeredNumber == null;
            z4 = email == null;
            z5 = authorizationLevel == null;
            z6 = userAccountStatus == null;
            if (j2 != 0) {
                j = z ? j | 32 : j | 16;
            }
            if ((j & 12) != 0) {
                j = z2 ? j | 524288 : j | MediaStatus.COMMAND_STREAM_TRANSFER;
            }
            if ((j & 12) != 0) {
                j = z3 ? j | MediaStatus.COMMAND_DISLIKE : j | MediaStatus.COMMAND_LIKE;
            }
            if ((j & 12) != 0) {
                j = z4 ? j | 8388608 : j | 4194304;
            }
            if ((j & 12) != 0) {
                j = z5 ? j | 128 : j | 64;
            }
            if ((j & 12) != 0) {
                j = z6 ? j | MediaStatus.COMMAND_QUEUE_REPEAT_ONE : j | MediaStatus.COMMAND_QUEUE_REPEAT_ALL;
            }
            str6 = userAccountStatus;
            str = secondaryNumber;
            str5 = designation;
            str2 = registeredNumber;
            str4 = email;
            str3 = authorizationLevel;
        } else {
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
            z = false;
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
            z6 = false;
        }
        boolean zIsEmpty = ((j & 16) == 0 || str == null) ? false : str.isEmpty();
        boolean zIsEmpty2 = ((j & 4194304) == 0 || str4 == null) ? false : str4.isEmpty();
        boolean zIsEmpty3 = ((MediaStatus.COMMAND_LIKE & j) == 0 || str2 == null) ? false : str2.isEmpty();
        boolean zIsEmpty4 = ((64 & j) == 0 || str3 == null) ? false : str3.isEmpty();
        boolean zIsEmpty5 = ((MediaStatus.COMMAND_STREAM_TRANSFER & j) == 0 || str5 == null) ? false : str5.isEmpty();
        boolean zIsEmpty6 = ((j & MediaStatus.COMMAND_QUEUE_REPEAT_ALL) == 0 || str6 == null) ? false : str6.isEmpty();
        long j3 = j & 12;
        if (j3 != 0) {
            if (z) {
                zIsEmpty = true;
            }
            if (z5) {
                zIsEmpty4 = true;
            }
            if (z6) {
                zIsEmpty6 = true;
            }
            if (z3) {
                zIsEmpty3 = true;
            }
            if (z2) {
                zIsEmpty5 = true;
            }
            boolean z7 = z4 ? true : zIsEmpty2;
            if (j3 != 0) {
                j |= zIsEmpty ? 134217728L : 67108864L;
            }
            if ((j & 12) != 0) {
                j |= zIsEmpty4 ? 2097152L : 1048576L;
            }
            if ((j & 12) != 0) {
                j |= zIsEmpty6 ? 512L : 256L;
            }
            if ((j & 12) != 0) {
                j |= zIsEmpty3 ? MediaStatus.COMMAND_PLAYBACK_RATE : MediaStatus.COMMAND_EDIT_TRACKS;
            }
            if ((j & 12) != 0) {
                j |= zIsEmpty5 ? 33554432L : Javac.GENERATED_MEMBER;
            }
            if ((j & 12) != 0) {
                j |= z7 ? MediaStatus.COMMAND_UNFOLLOW : MediaStatus.COMMAND_FOLLOW;
            }
            int i7 = zIsEmpty ? 8 : 0;
            i3 = zIsEmpty4 ? 8 : 0;
            int i8 = zIsEmpty6 ? 8 : 0;
            i5 = zIsEmpty3 ? 8 : 0;
            i = zIsEmpty5 ? 8 : 0;
            i6 = i8;
            i2 = i7;
            i4 = z7 ? 8 : 0;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
        }
        if ((j & 8) != 0) {
            this.s0.setOnClickListener(this.z0);
        }
        if ((j & 12) != 0) {
            this.t0.setVisibility(i);
            nr1.W1(this.t0, str5);
            this.u0.setVisibility(i3);
            nr1.W1(this.u0, str3);
            this.v0.setVisibility(i5);
            nr1.W1(this.v0, str2);
            this.w0.setVisibility(i2);
            nr1.W1(this.w0, str);
            this.x0.setVisibility(i4);
            nr1.W1(this.x0, str4);
            this.y0.setVisibility(i6);
            nr1.W1(this.y0, str6);
        }
    }

    public ej7(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (RecyclerView) objArr[8]);
        this.A0 = -1L;
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[0];
        this.r0 = nestedScrollView;
        nestedScrollView.setTag(null);
        MaterialCardView materialCardView = (MaterialCardView) objArr[1];
        this.s0 = materialCardView;
        materialCardView.setTag(null);
        ViewProfileData viewProfileData = (ViewProfileData) objArr[2];
        this.t0 = viewProfileData;
        viewProfileData.setTag(null);
        ViewProfileData viewProfileData2 = (ViewProfileData) objArr[3];
        this.u0 = viewProfileData2;
        viewProfileData2.setTag(null);
        ViewProfileData viewProfileData3 = (ViewProfileData) objArr[4];
        this.v0 = viewProfileData3;
        viewProfileData3.setTag(null);
        ViewProfileData viewProfileData4 = (ViewProfileData) objArr[5];
        this.w0 = viewProfileData4;
        viewProfileData4.setTag(null);
        ViewProfileData viewProfileData5 = (ViewProfileData) objArr[6];
        this.x0 = viewProfileData5;
        viewProfileData5.setTag(null);
        ViewProfileData viewProfileData6 = (ViewProfileData) objArr[7];
        this.y0 = viewProfileData6;
        viewProfileData6.setTag(null);
        a0(view);
        this.z0 = new jbc(this, 1);
        mo16291G();
    }
}
