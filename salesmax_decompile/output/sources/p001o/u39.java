package p001o;

import ai.salesmax.model.ChatMessages;
import ai.salesmax.model.FileData;
import ai.salesmax.model.Leads;
import ai.salesmax.model.WaButton;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import com.google.api.Service;
import java.util.List;
import lombok.javac.Javac;
import p001o.ewi;
import p001o.jbc;
import p001o.sbc;

/* loaded from: classes.dex */
public class u39 extends t39 implements sbc.InterfaceC16795a, jbc.InterfaceC14485a {
    public static final ewi.C13274i V1 = null;
    public static final SparseIntArray W1;
    public final View.OnClickListener A1;
    public final View.OnClickListener B1;
    public final View.OnClickListener C1;
    public final View.OnLongClickListener D1;
    public final View.OnLongClickListener E1;
    public final View.OnClickListener F1;
    public final View.OnLongClickListener G1;
    public final View.OnLongClickListener H1;
    public final View.OnLongClickListener I1;
    public final View.OnClickListener J1;
    public final View.OnClickListener K1;
    public final View.OnClickListener L1;
    public final View.OnLongClickListener M1;
    public final View.OnClickListener N1;
    public final View.OnLongClickListener O1;
    public final View.OnClickListener P1;
    public final View.OnLongClickListener Q1;
    public final View.OnClickListener R1;
    public final View.OnClickListener S1;
    public final View.OnClickListener T1;
    public long U1;
    public final ConstraintLayout f1;
    public final LinearLayout g1;
    public final ProgressBar h1;
    public final LinearLayout i1;
    public final TextView j1;
    public final View k1;
    public final View.OnLongClickListener l1;
    public final View.OnLongClickListener m1;
    public final View.OnLongClickListener n1;
    public final View.OnClickListener o1;
    public final View.OnClickListener p1;
    public final View.OnClickListener q1;
    public final View.OnLongClickListener r1;
    public final View.OnClickListener s1;
    public final View.OnClickListener t1;
    public final View.OnLongClickListener u1;
    public final View.OnClickListener v1;
    public final View.OnLongClickListener w1;
    public final View.OnLongClickListener x1;
    public final View.OnClickListener y1;
    public final View.OnLongClickListener z1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        W1 = sparseIntArray;
        sparseIntArray.put(z8e.layoutMessageWithImage, 41);
        sparseIntArray.put(z8e.image_line, 42);
        sparseIntArray.put(z8e.seekBar, 43);
        sparseIntArray.put(z8e.tvDuration, 44);
        sparseIntArray.put(z8e.threeButtonsContainerFirstPart, 45);
    }

    public u39(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 46, V1, W1));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.U1 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.U1 = 16L;
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
        switch (i) {
            case 2:
                ck6 ck6Var = this.d1;
                ChatMessages chatMessages = this.b1;
                Integer num = this.c1;
                if (ck6Var != null) {
                    return ck6Var.mo707a(view, num.intValue(), chatMessages);
                }
                return false;
            case 4:
                ck6 ck6Var2 = this.d1;
                ChatMessages chatMessages2 = this.b1;
                Integer num2 = this.c1;
                if (ck6Var2 != null) {
                    return ck6Var2.mo707a(view, num2.intValue(), chatMessages2);
                }
                return false;
            case 6:
                ck6 ck6Var3 = this.d1;
                ChatMessages chatMessages3 = this.b1;
                Integer num3 = this.c1;
                if (ck6Var3 != null) {
                    return ck6Var3.mo707a(view, num3.intValue(), chatMessages3);
                }
                return false;
            case 8:
                ck6 ck6Var4 = this.d1;
                ChatMessages chatMessages4 = this.b1;
                Integer num4 = this.c1;
                if (ck6Var4 != null) {
                    return ck6Var4.mo707a(view, num4.intValue(), chatMessages4);
                }
                return false;
            case 10:
                ck6 ck6Var5 = this.d1;
                ChatMessages chatMessages5 = this.b1;
                Integer num5 = this.c1;
                if (ck6Var5 != null) {
                    return ck6Var5.mo707a(view, num5.intValue(), chatMessages5);
                }
                return false;
            case 12:
                ck6 ck6Var6 = this.d1;
                ChatMessages chatMessages6 = this.b1;
                Integer num6 = this.c1;
                if (ck6Var6 != null) {
                    return ck6Var6.mo707a(view, num6.intValue(), chatMessages6);
                }
                return false;
            case 14:
                ck6 ck6Var7 = this.d1;
                ChatMessages chatMessages7 = this.b1;
                Integer num7 = this.c1;
                if (ck6Var7 != null) {
                    return ck6Var7.mo707a(view, num7.intValue(), chatMessages7);
                }
                return false;
            case 17:
                ck6 ck6Var8 = this.d1;
                ChatMessages chatMessages8 = this.b1;
                Integer num8 = this.c1;
                if (ck6Var8 != null) {
                    return ck6Var8.mo707a(view, num8.intValue(), chatMessages8);
                }
                return false;
            case 19:
                ck6 ck6Var9 = this.d1;
                ChatMessages chatMessages9 = this.b1;
                Integer num9 = this.c1;
                if (ck6Var9 != null) {
                    return ck6Var9.mo707a(view, num9.intValue(), chatMessages9);
                }
                return false;
            case 21:
                ck6 ck6Var10 = this.d1;
                ChatMessages chatMessages10 = this.b1;
                Integer num10 = this.c1;
                if (ck6Var10 != null) {
                    return ck6Var10.mo707a(view, num10.intValue(), chatMessages10);
                }
                return false;
            case 23:
                ck6 ck6Var11 = this.d1;
                ChatMessages chatMessages11 = this.b1;
                Integer num11 = this.c1;
                if (ck6Var11 != null) {
                    return ck6Var11.mo707a(view, num11.intValue(), chatMessages11);
                }
                return false;
            case 25:
                ck6 ck6Var12 = this.d1;
                ChatMessages chatMessages12 = this.b1;
                Integer num12 = this.c1;
                if (ck6Var12 != null) {
                    return ck6Var12.mo707a(view, num12.intValue(), chatMessages12);
                }
                return false;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                ck6 ck6Var13 = this.d1;
                ChatMessages chatMessages13 = this.b1;
                Integer num13 = this.c1;
                if (ck6Var13 != null) {
                    return ck6Var13.mo707a(view, num13.intValue(), chatMessages13);
                }
                return false;
            case 30:
                ck6 ck6Var14 = this.d1;
                ChatMessages chatMessages14 = this.b1;
                Integer num14 = this.c1;
                if (ck6Var14 != null) {
                    return ck6Var14.mo707a(view, num14.intValue(), chatMessages14);
                }
                return false;
            case 32:
                ck6 ck6Var15 = this.d1;
                ChatMessages chatMessages15 = this.b1;
                Integer num15 = this.c1;
                if (ck6Var15 != null) {
                    return ck6Var15.mo707a(view, num15.intValue(), chatMessages15);
                }
                return false;
            case 33:
                ck6 ck6Var16 = this.d1;
                ChatMessages chatMessages16 = this.b1;
                Integer num16 = this.c1;
                if (ck6Var16 != null) {
                    return ck6Var16.mo707a(view, num16.intValue(), chatMessages16);
                }
                return false;
            default:
                return false;
        }
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (33 == i) {
            i0((ck6) obj);
        } else if (7 == i) {
            h0((rog) obj);
        } else if (73 == i) {
            k0((Integer) obj);
        } else {
            if (67 != i) {
                return false;
            }
            j0((ChatMessages) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        switch (i) {
            case 1:
                ck6 ck6Var = this.d1;
                ChatMessages chatMessages = this.b1;
                Integer num = this.c1;
                if (ck6Var != null) {
                    ck6Var.mo708b(view, num.intValue(), chatMessages);
                    break;
                }
                break;
            case 3:
                ck6 ck6Var2 = this.d1;
                ChatMessages chatMessages2 = this.b1;
                Integer num2 = this.c1;
                if (ck6Var2 != null) {
                    ck6Var2.mo708b(view, num2.intValue(), chatMessages2);
                    break;
                }
                break;
            case 5:
                ck6 ck6Var3 = this.d1;
                ChatMessages chatMessages3 = this.b1;
                Integer num3 = this.c1;
                if (ck6Var3 != null) {
                    ck6Var3.mo708b(view, num3.intValue(), chatMessages3);
                    break;
                }
                break;
            case 7:
                ck6 ck6Var4 = this.d1;
                ChatMessages chatMessages4 = this.b1;
                Integer num4 = this.c1;
                if (ck6Var4 != null) {
                    ck6Var4.mo708b(view, num4.intValue(), chatMessages4);
                    break;
                }
                break;
            case 9:
                ck6 ck6Var5 = this.d1;
                ChatMessages chatMessages5 = this.b1;
                Integer num5 = this.c1;
                if (ck6Var5 != null) {
                    ck6Var5.mo708b(view, num5.intValue(), chatMessages5);
                    break;
                }
                break;
            case 11:
                ck6 ck6Var6 = this.d1;
                ChatMessages chatMessages6 = this.b1;
                Integer num6 = this.c1;
                if (ck6Var6 != null) {
                    ck6Var6.mo708b(view, num6.intValue(), chatMessages6);
                    break;
                }
                break;
            case 13:
                ck6 ck6Var7 = this.d1;
                ChatMessages chatMessages7 = this.b1;
                Integer num7 = this.c1;
                if (ck6Var7 != null) {
                    ck6Var7.mo708b(view, num7.intValue(), chatMessages7);
                    break;
                }
                break;
            case 15:
                ck6 ck6Var8 = this.d1;
                ChatMessages chatMessages8 = this.b1;
                Integer num8 = this.c1;
                if (ck6Var8 != null) {
                    ck6Var8.mo708b(view, num8.intValue(), chatMessages8);
                    break;
                }
                break;
            case 16:
                ck6 ck6Var9 = this.d1;
                ChatMessages chatMessages9 = this.b1;
                Integer num9 = this.c1;
                if (ck6Var9 != null) {
                    ck6Var9.mo708b(view, num9.intValue(), chatMessages9);
                    break;
                }
                break;
            case 18:
                ck6 ck6Var10 = this.d1;
                ChatMessages chatMessages10 = this.b1;
                Integer num10 = this.c1;
                if (ck6Var10 != null) {
                    ck6Var10.mo708b(view, num10.intValue(), chatMessages10);
                    break;
                }
                break;
            case 20:
                ck6 ck6Var11 = this.d1;
                ChatMessages chatMessages11 = this.b1;
                Integer num11 = this.c1;
                if (ck6Var11 != null) {
                    ck6Var11.mo708b(view, num11.intValue(), chatMessages11);
                    break;
                }
                break;
            case 22:
                ck6 ck6Var12 = this.d1;
                ChatMessages chatMessages12 = this.b1;
                Integer num12 = this.c1;
                if (ck6Var12 != null) {
                    ck6Var12.mo708b(view, num12.intValue(), chatMessages12);
                    break;
                }
                break;
            case 24:
                ck6 ck6Var13 = this.d1;
                ChatMessages chatMessages13 = this.b1;
                Integer num13 = this.c1;
                if (ck6Var13 != null) {
                    ck6Var13.mo708b(view, num13.intValue(), chatMessages13);
                    break;
                }
                break;
            case 26:
                ck6 ck6Var14 = this.d1;
                ChatMessages chatMessages14 = this.b1;
                Integer num14 = this.c1;
                if (ck6Var14 != null) {
                    ck6Var14.mo708b(view, num14.intValue(), chatMessages14);
                    break;
                }
                break;
            case 27:
                ck6 ck6Var15 = this.d1;
                ChatMessages chatMessages15 = this.b1;
                Integer num15 = this.c1;
                if (ck6Var15 != null) {
                    ck6Var15.mo708b(view, num15.intValue(), chatMessages15);
                    break;
                }
                break;
            case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                ck6 ck6Var16 = this.d1;
                ChatMessages chatMessages16 = this.b1;
                Integer num16 = this.c1;
                if (ck6Var16 != null) {
                    ck6Var16.mo708b(view, num16.intValue(), chatMessages16);
                    break;
                }
                break;
            case um5.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                ck6 ck6Var17 = this.d1;
                ChatMessages chatMessages17 = this.b1;
                Integer num17 = this.c1;
                if (ck6Var17 != null) {
                    ck6Var17.mo708b(view, num17.intValue(), chatMessages17);
                    break;
                }
                break;
            case wm5.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                ck6 ck6Var18 = this.d1;
                ChatMessages chatMessages18 = this.b1;
                Integer num18 = this.c1;
                if (ck6Var18 != null) {
                    ck6Var18.mo708b(view, num18.intValue(), chatMessages18);
                    break;
                }
                break;
            case 35:
                ck6 ck6Var19 = this.d1;
                ChatMessages chatMessages19 = this.b1;
                Integer num19 = this.c1;
                if (ck6Var19 != null) {
                    ck6Var19.mo708b(view, num19.intValue(), chatMessages19);
                    break;
                }
                break;
        }
    }

    public void h0(rog rogVar) {
        this.e1 = rogVar;
    }

    public void i0(ck6 ck6Var) {
        this.d1 = ck6Var;
        synchronized (this) {
            this.U1 |= 1;
        }
        m28509h(33);
        super.m25692R();
    }

    public void j0(ChatMessages chatMessages) {
        this.b1 = chatMessages;
        synchronized (this) {
            this.U1 |= 8;
        }
        m28509h(67);
        super.m25692R();
    }

    public void k0(Integer num) {
        this.c1 = num;
        synchronized (this) {
            this.U1 |= 4;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        long messageTime;
        int i;
        int i2;
        int i3;
        FileData fileData;
        String str;
        String str2;
        boolean zIsUploaded;
        int i4;
        String str3;
        String str4;
        Leads leads;
        String str5;
        String str6;
        String str7;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean showDateText;
        boolean zIsSelected;
        List<WaButton> list;
        Leads referredContact;
        FileData messageFile;
        Boolean boolIsStarred;
        ChatMessages replyingToMessage;
        WaButton waButton;
        WaButton waButton2;
        WaButton waButton3;
        String fileName;
        String mimeType;
        String messageUserName;
        String messageText;
        synchronized (this) {
            j = this.U1;
            this.U1 = 0L;
        }
        ChatMessages chatMessages = this.b1;
        long j2 = j & 24;
        int i10 = 0;
        if (j2 != 0) {
            if (chatMessages != null) {
                showDateText = chatMessages.getShowDateText();
                zIsSelected = chatMessages.isSelected();
                List<WaButton> buttons = chatMessages.getButtons();
                referredContact = chatMessages.getReferredContact();
                messageTime = chatMessages.getMessageTime();
                messageFile = chatMessages.getMessageFile();
                boolIsStarred = chatMessages.isStarred();
                replyingToMessage = chatMessages.getReplyingToMessage();
                list = buttons;
            } else {
                messageTime = 0;
                showDateText = false;
                zIsSelected = false;
                list = null;
                referredContact = null;
                messageFile = null;
                boolIsStarred = null;
                replyingToMessage = null;
            }
            if (j2 != 0) {
                j |= showDateText ? Javac.GENERATED_MEMBER : 8388608L;
            }
            if ((j & 24) != 0) {
                j |= zIsSelected ? MediaStatus.COMMAND_LIKE : MediaStatus.COMMAND_PLAYBACK_RATE;
            }
            i = showDateText ? 0 : 8;
            int i11 = zIsSelected ? 0 : 8;
            boolean z = referredContact == null;
            boolean zM25676W = ewi.m25676W(boolIsStarred);
            boolean z2 = replyingToMessage == null;
            if ((j & 24) != 0) {
                j |= z ? MediaStatus.COMMAND_STREAM_TRANSFER : MediaStatus.COMMAND_UNFOLLOW;
            }
            if ((j & 24) != 0) {
                j |= zM25676W ? 256L : 128L;
            }
            if ((j & 24) != 0) {
                j |= z2 ? 1048576L : 524288L;
            }
            if (list != null) {
                int size = list.size();
                waButton2 = (WaButton) ewi.m25667A(list, 2);
                waButton3 = (WaButton) ewi.m25667A(list, 1);
                waButton = (WaButton) ewi.m25667A(list, 0);
                i10 = size;
            } else {
                waButton = null;
                waButton2 = null;
                waButton3 = null;
            }
            if (messageFile != null) {
                fileName = messageFile.getFileName();
                zIsUploaded = messageFile.isUploaded();
                mimeType = messageFile.getMimeType();
            } else {
                fileName = null;
                zIsUploaded = false;
                mimeType = null;
            }
            if ((j & 24) != 0) {
                j = zIsUploaded ? j | MediaStatus.COMMAND_EDIT_TRACKS : j | MediaStatus.COMMAND_QUEUE_REPEAT_ONE;
            }
            if (replyingToMessage != null) {
                messageText = replyingToMessage.getMessageText();
                messageUserName = replyingToMessage.getMessageUserName();
            } else {
                messageUserName = null;
                messageText = null;
            }
            int i12 = z ? 8 : 0;
            int i13 = zM25676W ? 0 : 8;
            int i14 = z2 ? 8 : 0;
            boolean z3 = i10 == 1;
            boolean z4 = i10 == 2;
            boolean z5 = i10 == 3;
            if ((j & 24) != 0) {
                j |= z3 ? 4194304L : 2097152L;
            }
            if ((j & 24) != 0) {
                j |= z4 ? 64L : 32L;
            }
            if ((j & 24) != 0) {
                j |= z5 ? MediaStatus.COMMAND_FOLLOW : MediaStatus.COMMAND_DISLIKE;
            }
            String waText = waButton2 != null ? waButton2.getWaText() : null;
            String waText2 = waButton3 != null ? waButton3.getWaText() : null;
            String waText3 = waButton != null ? waButton.getWaText() : null;
            i3 = z3 ? 0 : 8;
            int i15 = z4 ? 0 : 8;
            i2 = z5 ? 0 : 8;
            i4 = i15;
            str7 = waText;
            i5 = i11;
            i6 = i12;
            leads = referredContact;
            fileData = messageFile;
            i7 = i13;
            str = messageUserName;
            i8 = i14;
            str3 = waText3;
            str4 = waText2;
            str5 = fileName;
            str2 = mimeType;
            str6 = messageText;
        } else {
            messageTime = 0;
            i = 0;
            i2 = 0;
            i3 = 0;
            fileData = null;
            str = null;
            str2 = null;
            zIsUploaded = false;
            i4 = 0;
            str3 = null;
            str4 = null;
            leads = null;
            str5 = null;
            str6 = null;
            str7 = null;
            i5 = 0;
            i6 = 0;
            i7 = 0;
            i8 = 0;
        }
        boolean viewOnly = ((MediaStatus.COMMAND_QUEUE_REPEAT_ONE & j) == 0 || fileData == null) ? false : fileData.getViewOnly();
        long j3 = j & 24;
        if (j3 != 0) {
            boolean z6 = zIsUploaded ? true : viewOnly;
            if (j3 != 0) {
                j |= z6 ? MediaStatus.COMMAND_QUEUE_REPEAT_ALL : 512L;
            }
            i9 = z6 ? 8 : 0;
        } else {
            i9 = 0;
        }
        if ((j & 16) != 0) {
            this.n0.setOnClickListener(this.q1);
            this.o0.setOnClickListener(this.L1);
            this.x0.setOnClickListener(this.N1);
            this.z0.setOnClickListener(this.K1);
            this.z0.setOnLongClickListener(this.w1);
            this.A0.setOnClickListener(this.F1);
            this.A0.setOnLongClickListener(this.I1);
            this.B0.setOnClickListener(this.C1);
            this.B0.setOnLongClickListener(this.n1);
            this.C0.setOnClickListener(this.P1);
            this.C0.setOnLongClickListener(this.u1);
            this.D0.setOnClickListener(this.R1);
            this.D0.setOnLongClickListener(this.H1);
            this.E0.setOnClickListener(this.B1);
            this.F0.setOnClickListener(this.A1);
            this.F0.setOnLongClickListener(this.m1);
            this.G0.setOnClickListener(this.p1);
            this.G0.setOnLongClickListener(this.M1);
            this.H0.setOnClickListener(this.J1);
            this.H0.setOnLongClickListener(this.x1);
            this.I0.setOnClickListener(this.y1);
            this.I0.setOnLongClickListener(this.D1);
            this.J0.setOnClickListener(this.o1);
            this.J0.setOnLongClickListener(this.r1);
            this.P0.setOnClickListener(this.S1);
            this.P0.setOnLongClickListener(this.E1);
            this.R0.setOnClickListener(this.v1);
            this.R0.setOnLongClickListener(this.z1);
            this.S0.setOnClickListener(this.T1);
            this.S0.setOnLongClickListener(this.G1);
            this.U0.setOnClickListener(this.t1);
            this.U0.setOnLongClickListener(this.Q1);
            this.V0.setOnLongClickListener(this.l1);
            this.Y0.setOnClickListener(this.s1);
            this.Y0.setOnLongClickListener(this.O1);
        }
        if ((j & 24) != 0) {
            nr1.m40963h(this.n0, chatMessages);
            String str8 = str3;
            fjh.m26938c(this.p0, str8);
            fjh.m26938c(this.q0, str8);
            fjh.m26938c(this.r0, str8);
            String str9 = str4;
            fjh.m26938c(this.s0, str9);
            fjh.m26938c(this.t0, str9);
            fjh.m26938c(this.u0, str7);
            this.v0.setVisibility(i);
            this.w0.setVisibility(i6);
            this.x0.setVisibility(i5);
            nr1.O1(this.A0, fileData);
            Leads leads2 = leads;
            nr1.X0(this.B0, leads2);
            nr1.n2(this.C0, fileData);
            fjh.m26938c(this.D0, str5);
            nr1.x2(this.E0, chatMessages);
            nr1.q2(this.G0, str2);
            nr1.U1(this.I0, chatMessages);
            nr1.T2(this.J0, chatMessages);
            nr1.n2(this.g1, fileData);
            this.h1.setVisibility(i9);
            nr1.I0(this.i1, chatMessages);
            nr1.h0(this.j1, Long.valueOf(messageTime));
            nr1.m40961f(this.k1, fileData);
            nr1.A2(this.L0, chatMessages);
            nr1.c1(this.M0, chatMessages);
            this.N0.setVisibility(i7);
            this.O0.setVisibility(i3);
            this.P0.setVisibility(i8);
            nr1.m40965j(this.R0, chatMessages);
            String str10 = str6;
            fjh.m26938c(this.S0, str10);
            fjh.m26938c(this.T0, str10);
            fjh.m26938c(this.U0, str);
            fjh.m26938c(this.V0, str);
            this.W0.setVisibility(i2);
            nr1.d1(this.Y0, leads2);
            this.a1.setVisibility(i4);
        }
    }

    public u39(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialButton) objArr[27], (ImageButton) objArr[20], (Button) objArr[34], (Button) objArr[29], (Button) objArr[31], (Button) objArr[35], (Button) objArr[32], (Button) objArr[36], (FrameLayout) objArr[1], (ConstraintLayout) objArr[4], (RelativeLayout) objArr[37], (View) objArr[42], (CardView) objArr[3], (ShapeableImageView) objArr[23], (ShapeableImageView) objArr[5], (LinearLayout) objArr[14], (MaterialTextView) objArr[17], (ShapeableImageView) objArr[12], (MaterialCardView) objArr[15], (ShapeableImageView) objArr[16], (MaterialCardView) objArr[10], (ShapeableImageView) objArr[21], (ShapeableImageView) objArr[13], (LinearLayout) objArr[41], (TextView) objArr[39], (ShapeableImageView) objArr[40], (ShapeableImageView) objArr[38], (LinearLayout) objArr[28], (ConstraintLayout) objArr[7], (SeekBar) objArr[43], (MaterialTextView) objArr[24], (MaterialTextView) objArr[9], (MaterialTextView) objArr[25], (MaterialTextView) objArr[8], (MaterialTextView) objArr[26], (LinearLayout) objArr[33], (LinearLayout) objArr[45], (MaterialTextView) objArr[6], (TextView) objArr[44], (LinearLayout) objArr[30]);
        this.U1 = -1L;
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
        this.x0.setTag(null);
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
        this.J0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f1 = constraintLayout;
        constraintLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[11];
        this.g1 = linearLayout;
        linearLayout.setTag(null);
        ProgressBar progressBar = (ProgressBar) objArr[18];
        this.h1 = progressBar;
        progressBar.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[19];
        this.i1 = linearLayout2;
        linearLayout2.setTag(null);
        TextView textView = (TextView) objArr[2];
        this.j1 = textView;
        textView.setTag(null);
        View view2 = (View) objArr[22];
        this.k1 = view2;
        view2.setTag(null);
        this.L0.setTag(null);
        this.M0.setTag(null);
        this.N0.setTag(null);
        this.O0.setTag(null);
        this.P0.setTag(null);
        this.R0.setTag(null);
        this.S0.setTag(null);
        this.T0.setTag(null);
        this.U0.setTag(null);
        this.V0.setTag(null);
        this.W0.setTag(null);
        this.Y0.setTag(null);
        this.a1.setTag(null);
        a0(view);
        this.l1 = new sbc(this, 33);
        this.m1 = new sbc(this, 21);
        this.n1 = new sbc(this, 4);
        this.o1 = new jbc(this, 16);
        this.p1 = new jbc(this, 22);
        this.q1 = new jbc(this, 34);
        this.r1 = new sbc(this, 17);
        this.s1 = new jbc(this, 5);
        this.t1 = new jbc(this, 9);
        this.u1 = new sbc(this, 19);
        this.v1 = new jbc(this, 31);
        this.w1 = new sbc(this, 2);
        this.x1 = new sbc(this, 14);
        this.y1 = new jbc(this, 27);
        this.z1 = new sbc(this, 32);
        this.A1 = new jbc(this, 20);
        this.B1 = new jbc(this, 15);
        this.C1 = new jbc(this, 3);
        this.D1 = new sbc(this, 28);
        this.E1 = new sbc(this, 8);
        this.F1 = new jbc(this, 29);
        this.G1 = new sbc(this, 12);
        this.H1 = new sbc(this, 25);
        this.I1 = new sbc(this, 30);
        this.J1 = new jbc(this, 13);
        this.K1 = new jbc(this, 1);
        this.L1 = new jbc(this, 26);
        this.M1 = new sbc(this, 23);
        this.N1 = new jbc(this, 35);
        this.O1 = new sbc(this, 6);
        this.P1 = new jbc(this, 18);
        this.Q1 = new sbc(this, 10);
        this.R1 = new jbc(this, 24);
        this.S1 = new jbc(this, 7);
        this.T1 = new jbc(this, 11);
        mo16291G();
    }
}
