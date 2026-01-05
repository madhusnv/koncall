package p001o;

import ai.salesmax.model.ChatChannel;
import ai.salesmax.model.ChatMessages;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;
import p001o.sbc;

/* loaded from: classes.dex */
public class z49 extends y49 implements jbc.InterfaceC14485a, sbc.InterfaceC16795a {
    public static final ewi.C13274i b1 = null;
    public static final SparseIntArray c1;
    public final View.OnClickListener N0;
    public final View.OnClickListener O0;
    public final View.OnClickListener P0;
    public final View.OnClickListener Q0;
    public final View.OnClickListener R0;
    public final View.OnClickListener S0;
    public final View.OnLongClickListener T0;
    public final View.OnClickListener U0;
    public final View.OnClickListener V0;
    public final View.OnClickListener W0;
    public final View.OnClickListener X0;
    public final View.OnClickListener Y0;
    public final View.OnLongClickListener Z0;
    public long a1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        c1 = sparseIntArray;
        sparseIntArray.put(z8e.frame_container_ivContactProfilePicInLead, 20);
        sparseIntArray.put(z8e.callTimeBlock, 21);
    }

    public z49(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 22, b1, c1));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.a1 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.a1 = 16L;
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
        if (i == 2) {
            ck6 ck6Var = this.L0;
            ChatChannel chatChannel = this.J0;
            Integer num = this.K0;
            if (ck6Var != null) {
                return ck6Var.mo707a(view, num.intValue(), chatChannel);
            }
            return false;
        }
        if (i != 4) {
            return false;
        }
        ck6 ck6Var2 = this.L0;
        ChatChannel chatChannel2 = this.J0;
        Integer num2 = this.K0;
        if (ck6Var2 != null) {
            return ck6Var2.mo707a(view, num2.intValue(), chatChannel2);
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
            j0((ChatChannel) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        if (i == 1) {
            ck6 ck6Var = this.L0;
            ChatChannel chatChannel = this.J0;
            Integer num = this.K0;
            if (ck6Var != null) {
                ck6Var.mo708b(view, num.intValue(), chatChannel);
            }
            return;
        }
        if (i == 3) {
            ck6 ck6Var2 = this.L0;
            ChatChannel chatChannel2 = this.J0;
            Integer num2 = this.K0;
            if (ck6Var2 != null) {
                ck6Var2.mo708b(view, num2.intValue(), chatChannel2);
                return;
            }
            return;
        }
        switch (i) {
            case 5:
                ck6 ck6Var3 = this.L0;
                ChatChannel chatChannel3 = this.J0;
                Integer num3 = this.K0;
                if (ck6Var3 != null) {
                    ck6Var3.mo708b(view, num3.intValue(), chatChannel3);
                    break;
                }
                break;
            case 6:
                ck6 ck6Var4 = this.L0;
                ChatChannel chatChannel4 = this.J0;
                Integer num4 = this.K0;
                if (ck6Var4 != null) {
                    ck6Var4.mo708b(view, num4.intValue(), chatChannel4);
                    break;
                }
                break;
            case 7:
                ck6 ck6Var5 = this.L0;
                ChatChannel chatChannel5 = this.J0;
                Integer num5 = this.K0;
                if (ck6Var5 != null) {
                    ck6Var5.mo708b(view, num5.intValue(), chatChannel5);
                    break;
                }
                break;
            case 8:
                ck6 ck6Var6 = this.L0;
                ChatChannel chatChannel6 = this.J0;
                Integer num6 = this.K0;
                if (ck6Var6 != null) {
                    ck6Var6.mo708b(view, num6.intValue(), chatChannel6);
                    break;
                }
                break;
            case 9:
                ck6 ck6Var7 = this.L0;
                ChatChannel chatChannel7 = this.J0;
                Integer num7 = this.K0;
                if (ck6Var7 != null) {
                    ck6Var7.mo708b(view, num7.intValue(), chatChannel7);
                    break;
                }
                break;
            case 10:
                ck6 ck6Var8 = this.L0;
                ChatChannel chatChannel8 = this.J0;
                Integer num8 = this.K0;
                if (ck6Var8 != null) {
                    ck6Var8.mo708b(view, num8.intValue(), chatChannel8);
                    break;
                }
                break;
            case 11:
                ck6 ck6Var9 = this.L0;
                ChatChannel chatChannel9 = this.J0;
                Integer num9 = this.K0;
                if (ck6Var9 != null) {
                    ck6Var9.mo708b(view, num9.intValue(), chatChannel9);
                    break;
                }
                break;
            case 12:
                ck6 ck6Var10 = this.L0;
                ChatChannel chatChannel10 = this.J0;
                Integer num10 = this.K0;
                if (ck6Var10 != null) {
                    ck6Var10.mo708b(view, num10.intValue(), chatChannel10);
                    break;
                }
                break;
            case 13:
                ck6 ck6Var11 = this.L0;
                ChatChannel chatChannel11 = this.J0;
                Integer num11 = this.K0;
                if (ck6Var11 != null) {
                    ck6Var11.mo708b(view, num11.intValue(), chatChannel11);
                    break;
                }
                break;
        }
    }

    public void h0(rog rogVar) {
        this.M0 = rogVar;
    }

    public void i0(ck6 ck6Var) {
        this.L0 = ck6Var;
        synchronized (this) {
            this.a1 |= 4;
        }
        m28509h(33);
        super.m25692R();
    }

    public void j0(ChatChannel chatChannel) {
        this.J0 = chatChannel;
        synchronized (this) {
            this.a1 |= 8;
        }
        m28509h(67);
        super.m25692R();
    }

    public void k0(Integer num) {
        this.K0 = num;
        synchronized (this) {
            this.a1 |= 2;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        int i;
        int i2;
        boolean z;
        boolean showBottom;
        boolean z2;
        boolean showSelection;
        int i3;
        int i4;
        ChatMessages chatMessages;
        String str;
        boolean z3;
        int i5;
        int i6;
        boolean z4;
        boolean zIsSelected;
        boolean zIsNewItem;
        int unreadMessageCount;
        ChatMessages lastMessage;
        long j2;
        long j3;
        synchronized (this) {
            j = this.a1;
            this.a1 = 0L;
        }
        ChatChannel chatChannel = this.J0;
        long j4 = j & 24;
        if (j4 != 0) {
            if (chatChannel != null) {
                zIsSelected = chatChannel.isSelected();
                showBottom = chatChannel.getShowBottom();
                lastMessage = chatChannel.getLastMessage();
                zIsNewItem = chatChannel.isNewItem();
                boolean zIsStarred = chatChannel.isStarred();
                unreadMessageCount = chatChannel.getUnreadMessageCount();
                showSelection = chatChannel.getShowSelection();
                z4 = zIsStarred;
            } else {
                z4 = false;
                zIsSelected = false;
                showBottom = false;
                zIsNewItem = false;
                unreadMessageCount = 0;
                showSelection = false;
                lastMessage = null;
            }
            if (j4 != 0) {
                j = showBottom ? j | MediaStatus.COMMAND_LIKE : j | MediaStatus.COMMAND_PLAYBACK_RATE;
            }
            if ((j & 24) != 0) {
                j |= zIsNewItem ? MediaStatus.COMMAND_QUEUE_REPEAT_ALL : 512L;
            }
            if ((j & 24) != 0) {
                if (showSelection) {
                    j2 = j | 64;
                    j3 = MediaStatus.COMMAND_STREAM_TRANSFER;
                } else {
                    j2 = j | 32;
                    j3 = MediaStatus.COMMAND_UNFOLLOW;
                }
                j = j2 | j3;
            }
            i = zIsNewItem ? 0 : 8;
            boolean z5 = z4;
            String string = Integer.toString(unreadMessageCount);
            z2 = unreadMessageCount > 0;
            int i7 = showSelection ? 8 : 0;
            int i8 = showSelection ? 0 : 8;
            if ((j & 24) != 0) {
                j |= z5 ? 1048576L : 524288L;
            }
            if ((j & 24) != 0) {
                j = z2 ? j | MediaStatus.COMMAND_FOLLOW : j | MediaStatus.COMMAND_DISLIKE;
            }
            i2 = z5 ? 0 : 8;
            z = zIsSelected;
            chatMessages = lastMessage;
            str = string;
            i3 = i7;
            i4 = i8;
        } else {
            i = 0;
            i2 = 0;
            z = false;
            showBottom = false;
            z2 = false;
            showSelection = false;
            i3 = 0;
            i4 = 0;
            chatMessages = null;
            str = null;
        }
        boolean z6 = (MediaStatus.COMMAND_FOLLOW & j) != 0 ? !showSelection : false;
        if ((MediaStatus.COMMAND_LIKE & j) != 0) {
            String participantScopeIfInternal = chatChannel != null ? chatChannel.getParticipantScopeIfInternal() : null;
            z3 = !(participantScopeIfInternal != null ? participantScopeIfInternal.equalsIgnoreCase("GROUP") : false);
        } else {
            z3 = false;
        }
        long j5 = j & 24;
        if (j5 != 0) {
            if (!showBottom) {
                z3 = false;
            }
            if (!z2) {
                z6 = false;
            }
            if (j5 != 0) {
                j |= z3 ? 256L : 128L;
            }
            if ((j & 24) != 0) {
                j |= z6 ? MediaStatus.COMMAND_EDIT_TRACKS : MediaStatus.COMMAND_QUEUE_REPEAT_ONE;
            }
            i5 = z3 ? 0 : 8;
            i6 = z6 ? 0 : 8;
        } else {
            i5 = 0;
            i6 = 0;
        }
        if ((24 & j) != 0) {
            this.n0.setVisibility(i5);
            this.o0.setVisibility(i);
            this.p0.setVisibility(i2);
            this.q0.setVisibility(i6);
            fjh.m26938c(this.q0, str);
            this.r0.setVisibility(i3);
            nr1.g0(this.r0, chatChannel);
            np3.m40895a(this.u0, z);
            this.u0.setVisibility(i4);
            nr1.D0(this.v0, chatChannel);
            nr1.m40932C(this.w0, chatChannel);
            nr1.c1(this.F0, chatMessages);
            nr1.m40931B(this.G0, chatChannel);
            nr1.R1(this.H0, chatChannel);
            fu5.m27486a(this.I0, chatChannel);
        }
        if ((j & 16) != 0) {
            this.u0.setOnClickListener(this.P0);
            this.v0.setOnClickListener(this.O0);
            this.v0.setOnLongClickListener(this.T0);
            this.w0.setOnClickListener(this.W0);
            this.w0.setOnLongClickListener(this.Z0);
            this.x0.setOnClickListener(this.N0);
            this.y0.setOnClickListener(this.V0);
            this.z0.setOnClickListener(this.S0);
            this.A0.setOnClickListener(this.Q0);
            this.B0.setOnClickListener(this.X0);
            this.C0.setOnClickListener(this.R0);
            this.D0.setOnClickListener(this.U0);
            this.E0.setOnClickListener(this.Y0);
        }
    }

    public z49(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (HorizontalScrollView) objArr[11], (TextView) objArr[3], (ShapeableImageView) objArr[7], (MaterialTextView) objArr[8], (MaterialTextView) objArr[9], (LinearLayout) objArr[21], (FrameLayout) objArr[20], (CheckBox) objArr[10], (MaterialCardView) objArr[0], (ShapeableImageView) objArr[2], (MaterialButton) objArr[15], (MaterialButton) objArr[13], (MaterialButton) objArr[12], (MaterialButton) objArr[19], (MaterialButton) objArr[18], (MaterialButton) objArr[16], (MaterialButton) objArr[17], (MaterialButton) objArr[14], (ShapeableImageView) objArr[5], (MaterialTextView) objArr[4], (MaterialTextView) objArr[6], (MaterialTextView) objArr[1]);
        this.a1 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        this.r0.setTag(null);
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
        this.I0.setTag(null);
        a0(view);
        this.N0 = new jbc(this, 9);
        this.O0 = new jbc(this, 1);
        this.P0 = new jbc(this, 5);
        this.Q0 = new jbc(this, 13);
        this.R0 = new jbc(this, 10);
        this.S0 = new jbc(this, 6);
        this.T0 = new sbc(this, 2);
        this.U0 = new jbc(this, 11);
        this.V0 = new jbc(this, 7);
        this.W0 = new jbc(this, 3);
        this.X0 = new jbc(this, 12);
        this.Y0 = new jbc(this, 8);
        this.Z0 = new sbc(this, 4);
        mo16291G();
    }
}
