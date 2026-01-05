package p001o;

import ai.salesmax.model.ChatChannel;
import ai.salesmax.model.ChatMessages;
import ai.salesmax.model.Leads;
import ai.salesmax.model.RecentAction;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import java.util.List;
import p001o.ewi;
import p001o.jbc;
import p001o.sbc;

/* loaded from: classes.dex */
public class a09 extends zz8 implements jbc.InterfaceC14485a, sbc.InterfaceC16795a {
    public static final ewi.C13274i l1;
    public static final SparseIntArray m1;
    public final ConstraintLayout T0;
    public final View.OnClickListener U0;
    public final View.OnLongClickListener V0;
    public final View.OnClickListener W0;
    public final View.OnLongClickListener X0;
    public final View.OnClickListener Y0;
    public final View.OnClickListener Z0;
    public final View.OnClickListener a1;
    public final View.OnClickListener b1;
    public final View.OnLongClickListener c1;
    public final View.OnClickListener d1;
    public final View.OnClickListener e1;
    public final View.OnClickListener f1;
    public final View.OnClickListener g1;
    public final View.OnClickListener h1;
    public final View.OnClickListener i1;
    public final View.OnClickListener j1;
    public long k1;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(29);
        l1 = c13274i;
        c13274i.m25699a(14, new String[]{"content_recent_actions_linear"}, new int[]{25}, new int[]{p9e.content_recent_actions_linear});
        SparseIntArray sparseIntArray = new SparseIntArray();
        m1 = sparseIntArray;
        sparseIntArray.put(z8e.frame_container_ivContactProfilePicInLead, 26);
        sparseIntArray.put(z8e.callTimeBlock, 27);
        sparseIntArray.put(z8e.callTime, 28);
    }

    public a09(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 29, l1, m1));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.k1 != 0) {
                return true;
            }
            return this.K0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.k1 = 32L;
        }
        this.K0.mo16291G();
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return h0((r44) obj, i2);
    }

    @Override // p001o.sbc.InterfaceC16795a
    /* renamed from: a */
    public final boolean mo16293a(int i, View view) {
        if (i == 2) {
            ck6 ck6Var = this.R0;
            ChatChannel chatChannel = this.P0;
            Integer num = this.Q0;
            if (ck6Var != null) {
                return ck6Var.mo707a(view, num.intValue(), chatChannel);
            }
            return false;
        }
        if (i == 4) {
            ck6 ck6Var2 = this.R0;
            ChatChannel chatChannel2 = this.P0;
            Integer num2 = this.Q0;
            if (ck6Var2 != null) {
                return ck6Var2.mo707a(view, num2.intValue(), chatChannel2);
            }
            return false;
        }
        if (i != 6) {
            return false;
        }
        ck6 ck6Var3 = this.R0;
        ChatChannel chatChannel3 = this.P0;
        Integer num3 = this.Q0;
        if (ck6Var3 != null) {
            return ck6Var3.mo707a(view, num3.intValue(), chatChannel3);
        }
        return false;
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (7 == i) {
            i0((rog) obj);
        } else if (73 == i) {
            l0((Integer) obj);
        } else if (33 == i) {
            j0((ck6) obj);
        } else {
            if (67 != i) {
                return false;
            }
            k0((ChatChannel) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        if (i == 1) {
            ck6 ck6Var = this.R0;
            ChatChannel chatChannel = this.P0;
            Integer num = this.Q0;
            if (ck6Var != null) {
                ck6Var.mo708b(view, num.intValue(), chatChannel);
            }
            return;
        }
        if (i == 3) {
            ck6 ck6Var2 = this.R0;
            ChatChannel chatChannel2 = this.P0;
            Integer num2 = this.Q0;
            if (ck6Var2 != null) {
                ck6Var2.mo708b(view, num2.intValue(), chatChannel2);
                return;
            }
            return;
        }
        if (i == 5) {
            ck6 ck6Var3 = this.R0;
            ChatChannel chatChannel3 = this.P0;
            Integer num3 = this.Q0;
            if (ck6Var3 != null) {
                ck6Var3.mo708b(view, num3.intValue(), chatChannel3);
                return;
            }
            return;
        }
        switch (i) {
            case 7:
                ck6 ck6Var4 = this.R0;
                ChatChannel chatChannel4 = this.P0;
                Integer num4 = this.Q0;
                if (ck6Var4 != null) {
                    ck6Var4.mo708b(view, num4.intValue(), chatChannel4);
                    break;
                }
                break;
            case 8:
                ck6 ck6Var5 = this.R0;
                ChatChannel chatChannel5 = this.P0;
                Integer num5 = this.Q0;
                if (ck6Var5 != null) {
                    ck6Var5.mo708b(view, num5.intValue(), chatChannel5);
                    break;
                }
                break;
            case 9:
                ck6 ck6Var6 = this.R0;
                ChatChannel chatChannel6 = this.P0;
                Integer num6 = this.Q0;
                if (ck6Var6 != null) {
                    ck6Var6.mo708b(view, num6.intValue(), chatChannel6);
                    break;
                }
                break;
            case 10:
                ck6 ck6Var7 = this.R0;
                ChatChannel chatChannel7 = this.P0;
                Integer num7 = this.Q0;
                if (ck6Var7 != null) {
                    ck6Var7.mo708b(view, num7.intValue(), chatChannel7);
                    break;
                }
                break;
            case 11:
                ck6 ck6Var8 = this.R0;
                ChatChannel chatChannel8 = this.P0;
                Integer num8 = this.Q0;
                if (ck6Var8 != null) {
                    ck6Var8.mo708b(view, num8.intValue(), chatChannel8);
                    break;
                }
                break;
            case 12:
                ck6 ck6Var9 = this.R0;
                ChatChannel chatChannel9 = this.P0;
                Integer num9 = this.Q0;
                if (ck6Var9 != null) {
                    ck6Var9.mo708b(view, num9.intValue(), chatChannel9);
                    break;
                }
                break;
            case 13:
                ck6 ck6Var10 = this.R0;
                ChatChannel chatChannel10 = this.P0;
                Integer num10 = this.Q0;
                if (ck6Var10 != null) {
                    ck6Var10.mo708b(view, num10.intValue(), chatChannel10);
                    break;
                }
                break;
            case 14:
                ck6 ck6Var11 = this.R0;
                ChatChannel chatChannel11 = this.P0;
                Integer num11 = this.Q0;
                if (ck6Var11 != null) {
                    ck6Var11.mo708b(view, num11.intValue(), chatChannel11);
                    break;
                }
                break;
            case 15:
                ck6 ck6Var12 = this.R0;
                ChatChannel chatChannel12 = this.P0;
                Integer num12 = this.Q0;
                if (ck6Var12 != null) {
                    ck6Var12.mo708b(view, num12.intValue(), chatChannel12);
                    break;
                }
                break;
            case 16:
                ck6 ck6Var13 = this.R0;
                ChatChannel chatChannel13 = this.P0;
                Integer num13 = this.Q0;
                if (ck6Var13 != null) {
                    ck6Var13.mo708b(view, num13.intValue(), chatChannel13);
                    break;
                }
                break;
        }
    }

    public final boolean h0(r44 r44Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.k1 |= 1;
        }
        return true;
    }

    public void i0(rog rogVar) {
        this.S0 = rogVar;
    }

    public void j0(ck6 ck6Var) {
        this.R0 = ck6Var;
        synchronized (this) {
            this.k1 |= 8;
        }
        m28509h(33);
        super.m25692R();
    }

    public void k0(ChatChannel chatChannel) {
        this.P0 = chatChannel;
        synchronized (this) {
            this.k1 |= 16;
        }
        m28509h(67);
        super.m25692R();
    }

    public void l0(Integer num) {
        this.Q0 = num;
        synchronized (this) {
            this.k1 |= 4;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        List<RecentAction> list;
        Long l;
        ChatMessages chatMessages;
        String str;
        Leads leads;
        int i;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6;
        String chatUserName;
        Long channelWillBeChargedNext;
        ChatMessages lastMessage;
        Leads contact;
        boolean z4;
        boolean zIsSelected;
        boolean showBottom;
        int unreadMessageCount;
        boolean showSelection;
        synchronized (this) {
            j = this.k1;
            this.k1 = 0L;
        }
        Integer num = this.Q0;
        ck6 ck6Var = this.R0;
        ChatChannel chatChannel = this.P0;
        long j2 = j & 48;
        String str2 = null;
        int i7 = 0;
        if (j2 != 0) {
            if (chatChannel != null) {
                chatUserName = chatChannel.getChatUserName();
                zIsSelected = chatChannel.isSelected();
                channelWillBeChargedNext = chatChannel.getChannelWillBeChargedNext();
                showBottom = chatChannel.getShowBottom();
                lastMessage = chatChannel.getLastMessage();
                boolean zIsStarred = chatChannel.isStarred();
                contact = chatChannel.getContact();
                unreadMessageCount = chatChannel.getUnreadMessageCount();
                showSelection = chatChannel.getShowSelection();
                z4 = zIsStarred;
            } else {
                chatUserName = null;
                channelWillBeChargedNext = null;
                lastMessage = null;
                contact = null;
                z4 = false;
                zIsSelected = false;
                showBottom = false;
                unreadMessageCount = 0;
                showSelection = false;
            }
            if (j2 != 0) {
                j |= showBottom ? 128L : 64L;
            }
            if ((j & 48) != 0) {
                j |= showSelection ? MediaStatus.COMMAND_UNFOLLOW : MediaStatus.COMMAND_FOLLOW;
            }
            i = showBottom ? 0 : 8;
            boolean z5 = z4;
            String string = Integer.toString(unreadMessageCount);
            boolean z6 = unreadMessageCount > 0;
            z2 = !showSelection;
            int i8 = showSelection ? 0 : 8;
            if ((j & 48) != 0) {
                j |= z5 ? 2097152L : 1048576L;
            }
            if ((j & 48) != 0) {
                j |= z6 ? MediaStatus.COMMAND_DISLIKE : MediaStatus.COMMAND_LIKE;
            }
            if ((j & 48) != 0) {
                j = z2 ? j | MediaStatus.COMMAND_QUEUE_REPEAT_ONE | 8388608 : j | MediaStatus.COMMAND_QUEUE_REPEAT_ALL | 4194304;
            }
            List<RecentAction> recentEngagements = contact != null ? contact.getRecentEngagements() : null;
            i2 = z5 ? 0 : 8;
            int i9 = z2 ? 0 : 8;
            boolean zIsEmpty = recentEngagements != null ? recentEngagements.isEmpty() : false;
            if ((j & 48) != 0) {
                j |= zIsEmpty ? 512L : 256L;
            }
            list = recentEngagements;
            str2 = chatUserName;
            z3 = zIsSelected;
            l = channelWillBeChargedNext;
            str = string;
            chatMessages = lastMessage;
            leads = contact;
            i3 = i8;
            i4 = i9;
            i5 = zIsEmpty ? 8 : 0;
            z = z6;
        } else {
            list = null;
            l = null;
            chatMessages = null;
            str = null;
            leads = null;
            i = 0;
            i2 = 0;
            z = false;
            z2 = false;
            z3 = false;
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        boolean z7 = ((8388608 & j) == 0 || str2 == null) ? false : true;
        long j3 = j & 48;
        if (j3 != 0) {
            boolean z8 = z ? z2 : false;
            if (j3 != 0) {
                j |= z8 ? MediaStatus.COMMAND_PLAYBACK_RATE : MediaStatus.COMMAND_EDIT_TRACKS;
            }
            i6 = z8 ? 0 : 8;
        } else {
            i6 = 0;
        }
        long j4 = j & 48;
        if (j4 != 0) {
            if (!z2) {
                z7 = false;
            }
            if (j4 != 0) {
                j |= z7 ? 524288L : MediaStatus.COMMAND_STREAM_TRANSFER;
            }
            if (!z7) {
                i7 = 4;
            }
        }
        int i10 = i7;
        if ((48 & j) != 0) {
            this.n0.setVisibility(i);
            nr1.B2(this.o0, l);
            this.p0.setVisibility(i2);
            this.q0.setVisibility(i6);
            fjh.m26938c(this.q0, str);
            np3.m40895a(this.u0, z3);
            this.u0.setVisibility(i3);
            nr1.D0(this.v0, chatChannel);
            nr1.Y0(this.w0, chatChannel);
            nr1.g0(this.x0, chatChannel);
            Leads leads2 = leads;
            nr1.u0(this.D0, leads2);
            this.F0.setVisibility(i10);
            nr1.m40943N(this.F0, chatChannel);
            nr1.g1(this.F0, str2);
            nr1.c1(this.I0, chatMessages);
            this.J0.setVisibility(i4);
            this.K0.m25689B().setVisibility(i5);
            this.K0.i0(list);
            nr1.i1(this.L0, chatChannel);
            nr1.R1(this.M0, chatChannel);
            fu5.m27486a(this.N0, chatChannel);
            nr1.T0(this.O0, leads2);
        }
        if ((32 & j) != 0) {
            this.u0.setOnClickListener(this.b1);
            this.v0.setOnClickListener(this.h1);
            this.v0.setOnLongClickListener(this.V0);
            this.w0.setOnClickListener(this.Y0);
            this.w0.setOnLongClickListener(this.c1);
            this.y0.setOnClickListener(this.d1);
            this.z0.setOnClickListener(this.W0);
            this.A0.setOnClickListener(this.j1);
            this.B0.setOnClickListener(this.f1);
            this.C0.setOnClickListener(this.Z0);
            this.E0.setOnClickListener(this.i1);
            this.F0.setOnClickListener(this.g1);
            this.F0.setOnLongClickListener(this.X0);
            this.G0.setOnClickListener(this.U0);
            this.H0.setOnClickListener(this.a1);
            this.J0.setOnClickListener(this.e1);
        }
        if ((40 & j) != 0) {
            this.K0.h0(ck6Var);
        }
        if ((j & 36) != 0) {
            this.K0.j0(num);
        }
        ewi.m25683r(this.K0);
    }

    public a09(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 1, (HorizontalScrollView) objArr[16], (TextView) objArr[3], (ShapeableImageView) objArr[10], (MaterialTextView) objArr[11], (MaterialTextView) objArr[28], (LinearLayout) objArr[27], (FrameLayout) objArr[26], (CheckBox) objArr[12], (MaterialCardView) objArr[0], (ShapeableImageView) objArr[2], (MaterialTextView) objArr[4], (MaterialButton) objArr[20], (MaterialButton) objArr[18], (MaterialButton) objArr[17], (MaterialButton) objArr[24], (MaterialButton) objArr[23], (MaterialTextView) objArr[5], (MaterialButton) objArr[21], (Chip) objArr[9], (MaterialButton) objArr[22], (MaterialButton) objArr[19], (ShapeableImageView) objArr[7], (MaterialCardView) objArr[13], (r44) objArr[25], (MaterialTextView) objArr[6], (MaterialTextView) objArr[8], (MaterialTextView) objArr[1], (MaterialTextView) objArr[15]);
        this.k1 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        this.u0.setTag(null);
        this.v0.setTag(null);
        this.w0.setTag(null);
        this.x0.setTag(null);
        this.y0.setTag(null);
        this.z0.setTag(null);
        this.A0.setTag(null);
        this.B0.setTag(null);
        this.C0.setTag(null);
        this.D0.setTag(null);
        this.E0.setTag(null);
        this.F0.setTag(null);
        this.G0.setTag(null);
        this.H0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[14];
        this.T0 = constraintLayout;
        constraintLayout.setTag(null);
        this.I0.setTag(null);
        this.J0.setTag(null);
        m25693Z(this.K0);
        this.L0.setTag(null);
        this.M0.setTag(null);
        this.N0.setTag(null);
        this.O0.setTag(null);
        a0(view);
        this.U0 = new jbc(this, 14);
        this.V0 = new sbc(this, 2);
        this.W0 = new jbc(this, 10);
        this.X0 = new sbc(this, 6);
        this.Y0 = new jbc(this, 3);
        this.Z0 = new jbc(this, 15);
        this.a1 = new jbc(this, 11);
        this.b1 = new jbc(this, 7);
        this.c1 = new sbc(this, 4);
        this.d1 = new jbc(this, 12);
        this.e1 = new jbc(this, 8);
        this.f1 = new jbc(this, 16);
        this.g1 = new jbc(this, 5);
        this.h1 = new jbc(this, 1);
        this.i1 = new jbc(this, 13);
        this.j1 = new jbc(this, 9);
        mo16291G();
    }
}
