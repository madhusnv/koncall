package p001o;

import ai.salesmax.model.RecentAction;
import ai.salesmax.model.Tasks;
import android.content.res.Resources;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import java.util.List;
import lombok.javac.Javac;
import p001o.ewi;
import p001o.jbc;
import p001o.sbc;

/* loaded from: classes.dex */
public class o39 extends n39 implements jbc.InterfaceC14485a, sbc.InterfaceC16795a {
    public static final ewi.C13274i j1;
    public static final SparseIntArray k1;
    public final MaterialCardView H0;
    public final LinearLayout I0;
    public final ConstraintLayout J0;
    public final ConstraintLayout K0;
    public final View.OnClickListener L0;
    public final View.OnClickListener M0;
    public final View.OnLongClickListener N0;
    public final View.OnClickListener O0;
    public final View.OnLongClickListener P0;
    public final View.OnClickListener Q0;
    public final View.OnLongClickListener R0;
    public final View.OnLongClickListener S0;
    public final View.OnClickListener T0;
    public final View.OnLongClickListener U0;
    public final View.OnLongClickListener V0;
    public final View.OnClickListener W0;
    public final View.OnLongClickListener X0;
    public final View.OnLongClickListener Y0;
    public final View.OnClickListener Z0;
    public final View.OnClickListener a1;
    public final View.OnClickListener b1;
    public final View.OnClickListener c1;
    public final View.OnClickListener d1;
    public final View.OnLongClickListener e1;
    public final View.OnClickListener f1;
    public final View.OnLongClickListener g1;
    public final View.OnLongClickListener h1;
    public long i1;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(20);
        j1 = c13274i;
        c13274i.m25699a(15, new String[]{"content_recent_actions"}, new int[]{17}, new int[]{p9e.content_recent_actions});
        SparseIntArray sparseIntArray = new SparseIntArray();
        k1 = sparseIntArray;
        sparseIntArray.put(z8e.clientDetailMore, 18);
        sparseIntArray.put(z8e.taskDetailLayout, 19);
    }

    public o39(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 20, j1, k1));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.i1 != 0) {
                return true;
            }
            return this.s0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.i1 = 32L;
        }
        this.s0.mo16291G();
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return h0((p44) obj, i2);
    }

    @Override // p001o.sbc.InterfaceC16795a
    /* renamed from: a */
    public final boolean mo16293a(int i, View view) {
        if (i == 2) {
            ck6 ck6Var = this.F0;
            Tasks tasks = this.D0;
            Integer num = this.E0;
            if (ck6Var != null) {
                return ck6Var.mo707a(view, num.intValue(), tasks);
            }
            return false;
        }
        if (i == 4) {
            ck6 ck6Var2 = this.F0;
            Tasks tasks2 = this.D0;
            Integer num2 = this.E0;
            if (ck6Var2 != null) {
                return ck6Var2.mo707a(view, num2.intValue(), tasks2);
            }
            return false;
        }
        if (i == 6) {
            ck6 ck6Var3 = this.F0;
            Tasks tasks3 = this.D0;
            Integer num3 = this.E0;
            if (ck6Var3 != null) {
                return ck6Var3.mo707a(view, num3.intValue(), tasks3);
            }
            return false;
        }
        if (i == 13) {
            ck6 ck6Var4 = this.F0;
            Tasks tasks4 = this.D0;
            Integer num4 = this.E0;
            if (ck6Var4 != null) {
                return ck6Var4.mo707a(view, num4.intValue(), tasks4);
            }
            return false;
        }
        if (i == 15) {
            ck6 ck6Var5 = this.F0;
            Tasks tasks5 = this.D0;
            Integer num5 = this.E0;
            if (ck6Var5 != null) {
                return ck6Var5.mo707a(view, num5.intValue(), tasks5);
            }
            return false;
        }
        if (i == 18) {
            ck6 ck6Var6 = this.F0;
            Tasks tasks6 = this.D0;
            Integer num6 = this.E0;
            if (ck6Var6 != null) {
                return ck6Var6.mo707a(view, num6.intValue(), tasks6);
            }
            return false;
        }
        if (i == 20) {
            ck6 ck6Var7 = this.F0;
            Tasks tasks7 = this.D0;
            Integer num7 = this.E0;
            if (ck6Var7 != null) {
                return ck6Var7.mo707a(view, num7.intValue(), tasks7);
            }
            return false;
        }
        if (i == 8) {
            ck6 ck6Var8 = this.F0;
            Tasks tasks8 = this.D0;
            Integer num8 = this.E0;
            if (ck6Var8 != null) {
                return ck6Var8.mo707a(view, num8.intValue(), tasks8);
            }
            return false;
        }
        if (i == 9) {
            ck6 ck6Var9 = this.F0;
            Tasks tasks9 = this.D0;
            Integer num9 = this.E0;
            if (ck6Var9 != null) {
                return ck6Var9.mo707a(view, num9.intValue(), tasks9);
            }
            return false;
        }
        if (i == 22) {
            ck6 ck6Var10 = this.F0;
            Tasks tasks10 = this.D0;
            Integer num10 = this.E0;
            if (ck6Var10 != null) {
                return ck6Var10.mo707a(view, num10.intValue(), tasks10);
            }
            return false;
        }
        if (i != 23) {
            return false;
        }
        ck6 ck6Var11 = this.F0;
        Tasks tasks11 = this.D0;
        Integer num11 = this.E0;
        if (ck6Var11 != null) {
            return ck6Var11.mo707a(view, num11.intValue(), tasks11);
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
            k0((Tasks) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        if (i == 1) {
            ck6 ck6Var = this.F0;
            Tasks tasks = this.D0;
            Integer num = this.E0;
            if (ck6Var != null) {
                ck6Var.mo708b(view, num.intValue(), tasks);
            }
            return;
        }
        if (i == 3) {
            ck6 ck6Var2 = this.F0;
            Tasks tasks2 = this.D0;
            Integer num2 = this.E0;
            if (ck6Var2 != null) {
                ck6Var2.mo708b(view, num2.intValue(), tasks2);
                return;
            }
            return;
        }
        if (i == 5) {
            ck6 ck6Var3 = this.F0;
            Tasks tasks3 = this.D0;
            Integer num3 = this.E0;
            if (ck6Var3 != null) {
                ck6Var3.mo708b(view, num3.intValue(), tasks3);
                return;
            }
            return;
        }
        if (i == 7) {
            ck6 ck6Var4 = this.F0;
            Tasks tasks4 = this.D0;
            Integer num4 = this.E0;
            if (ck6Var4 != null) {
                ck6Var4.mo708b(view, num4.intValue(), tasks4);
                return;
            }
            return;
        }
        if (i == 14) {
            ck6 ck6Var5 = this.F0;
            Tasks tasks5 = this.D0;
            Integer num5 = this.E0;
            if (ck6Var5 != null) {
                ck6Var5.mo708b(view, num5.intValue(), tasks5);
                return;
            }
            return;
        }
        if (i == 19) {
            ck6 ck6Var6 = this.F0;
            Tasks tasks6 = this.D0;
            Integer num6 = this.E0;
            if (ck6Var6 != null) {
                ck6Var6.mo708b(view, num6.intValue(), tasks6);
                return;
            }
            return;
        }
        if (i == 21) {
            ck6 ck6Var7 = this.F0;
            Tasks tasks7 = this.D0;
            Integer num7 = this.E0;
            if (ck6Var7 != null) {
                ck6Var7.mo708b(view, num7.intValue(), tasks7);
                return;
            }
            return;
        }
        if (i == 16) {
            ck6 ck6Var8 = this.F0;
            Tasks tasks8 = this.D0;
            Integer num8 = this.E0;
            if (ck6Var8 != null) {
                ck6Var8.mo708b(view, num8.intValue(), tasks8);
                return;
            }
            return;
        }
        if (i == 17) {
            ck6 ck6Var9 = this.F0;
            Tasks tasks9 = this.D0;
            Integer num9 = this.E0;
            if (ck6Var9 != null) {
                ck6Var9.mo708b(view, num9.intValue(), tasks9);
                return;
            }
            return;
        }
        switch (i) {
            case 10:
                ck6 ck6Var10 = this.F0;
                Tasks tasks10 = this.D0;
                Integer num10 = this.E0;
                if (ck6Var10 != null) {
                    ck6Var10.mo708b(view, num10.intValue(), tasks10);
                    break;
                }
                break;
            case 11:
                ck6 ck6Var11 = this.F0;
                Tasks tasks11 = this.D0;
                Integer num11 = this.E0;
                if (ck6Var11 != null) {
                    ck6Var11.mo708b(view, num11.intValue(), tasks11);
                    break;
                }
                break;
            case 12:
                ck6 ck6Var12 = this.F0;
                Tasks tasks12 = this.D0;
                Integer num12 = this.E0;
                if (ck6Var12 != null) {
                    ck6Var12.mo708b(view, num12.intValue(), tasks12);
                    break;
                }
                break;
        }
    }

    public final boolean h0(p44 p44Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.i1 |= 1;
        }
        return true;
    }

    public void i0(rog rogVar) {
        this.G0 = rogVar;
        synchronized (this) {
            this.i1 |= 2;
        }
        m28509h(7);
        super.m25692R();
    }

    public void j0(ck6 ck6Var) {
        this.F0 = ck6Var;
        synchronized (this) {
            this.i1 |= 8;
        }
        m28509h(33);
        super.m25692R();
    }

    public void k0(Tasks tasks) {
        this.D0 = tasks;
        synchronized (this) {
            this.i1 |= 16;
        }
        m28509h(67);
        super.m25692R();
    }

    public void l0(Integer num) {
        this.E0 = num;
        synchronized (this) {
            this.i1 |= 4;
        }
        m28509h(73);
        super.m25692R();
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02d6 A[PHI: r2
      0x02d6: PHI (r2v6 long) = (r2v5 long), (r2v18 long) binds: [B:193:0x02bb, B:201:0x02d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0309 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0175  */
    @Override // p001o.ewi
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo16295p() throws Resources.NotFoundException {
        long j;
        boolean z;
        String str;
        List<RecentAction> list;
        String str2;
        String clientSecondaryTitle;
        String taskContent;
        String str3;
        boolean z2;
        boolean z3;
        boolean showSelection;
        boolean z4;
        int i;
        int i2;
        int i3;
        String taskStatus;
        long j2;
        int i4;
        int i5;
        long j3;
        long j4;
        String str4;
        int i6;
        boolean z5;
        Integer num;
        boolean z6;
        String str5;
        boolean z7;
        boolean z8;
        long j5;
        int i7;
        long j6;
        ck6 ck6Var;
        int i8;
        long j7;
        int i9;
        int i10;
        int i11;
        long j8;
        long j9;
        long j10;
        String taskAssignedTo;
        String taskCompletionNote;
        String taskTag;
        List<RecentAction> taskEngagementActions;
        boolean zIsSelected;
        long j11;
        long j12;
        synchronized (this) {
            j = this.i1;
            this.i1 = 0L;
        }
        rog rogVar = this.G0;
        Integer num2 = this.E0;
        ck6 ck6Var2 = this.F0;
        Tasks tasks = this.D0;
        long j13 = j & 50;
        if (j13 != 0) {
            z = rogVar != null;
            if (j13 != 0) {
                j = z ? j | 33554432 : j | Javac.GENERATED_MEMBER;
            }
        } else {
            z = false;
        }
        long j14 = j & 48;
        if (j14 != 0) {
            if (tasks != null) {
                zIsSelected = tasks.isSelected();
                taskAssignedTo = tasks.getTaskAssignedTo();
                clientSecondaryTitle = tasks.getClientSecondaryTitle();
                taskContent = tasks.getTaskContent();
                taskCompletionNote = tasks.getTaskCompletionNote();
                taskTag = tasks.getTaskTag();
                taskEngagementActions = tasks.getTaskEngagementActions();
                showSelection = tasks.getShowSelection();
            } else {
                taskAssignedTo = null;
                clientSecondaryTitle = null;
                taskContent = null;
                taskCompletionNote = null;
                taskTag = null;
                taskEngagementActions = null;
                zIsSelected = false;
                showSelection = false;
            }
            if (j14 != 0) {
                if (showSelection) {
                    j11 = j | MediaStatus.COMMAND_UNFOLLOW;
                    j12 = 134217728;
                } else {
                    j11 = j | MediaStatus.COMMAND_FOLLOW;
                    j12 = 67108864;
                }
                j = j11 | j12;
            }
            z2 = taskContent == null;
            z4 = taskTag == null;
            boolean z9 = !showSelection;
            int i12 = showSelection ? 0 : 8;
            if ((j & 48) != 0) {
                j = z2 ? j | 512 : j | 256;
            }
            if ((j & 48) != 0) {
                j = z4 ? j | MediaStatus.COMMAND_PLAYBACK_RATE : j | MediaStatus.COMMAND_EDIT_TRACKS;
            }
            if ((j & 48) != 0) {
                j |= z9 ? 8388608L : 4194304L;
            }
            boolean zIsEmpty = taskCompletionNote != null ? taskCompletionNote.isEmpty() : false;
            if ((j & 48) != 0) {
                j |= zIsEmpty ? 8589934592L : 4294967296L;
            }
            z3 = zIsSelected;
            str2 = taskAssignedTo;
            str3 = taskCompletionNote;
            str = taskTag;
            list = taskEngagementActions;
            i = z9 ? 0 : 8;
            i2 = i12;
            i3 = zIsEmpty ? 8 : 0;
        } else {
            str = null;
            list = null;
            str2 = null;
            clientSecondaryTitle = null;
            taskContent = null;
            str3 = null;
            z2 = false;
            z3 = false;
            showSelection = false;
            z4 = false;
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        boolean zIsEmpty2 = ((j & MediaStatus.COMMAND_EDIT_TRACKS) == 0 || str == null) ? false : str.isEmpty();
        boolean zIsEmpty3 = ((j & 256) == 0 || taskContent == null) ? false : taskContent.isEmpty();
        if ((j & MediaStatus.COMMAND_FOLLOW) != 0) {
            taskStatus = tasks != null ? tasks.getTaskStatus() : null;
            boolean z10 = taskStatus == "COMPLETED";
            boolean zM47035a = ((33554432 & j) != 0 || rogVar == null) ? false : rogVar.m47035a();
            j2 = j & 48;
            if (j2 == 0) {
                if (z2) {
                    zIsEmpty3 = true;
                }
                if (z4) {
                    zIsEmpty2 = true;
                }
                boolean z11 = showSelection ? true : z10;
                if (j2 != 0) {
                    j = zIsEmpty3 ? j | 2199023255552L : j | 1099511627776L;
                }
                if ((j & 48) != 0) {
                    j |= zIsEmpty2 ? MediaStatus.COMMAND_QUEUE_REPEAT_ONE : MediaStatus.COMMAND_QUEUE_REPEAT_ALL;
                }
                if ((j & 48) != 0) {
                    j |= z11 ? 536870912L : 268435456L;
                }
                i5 = zIsEmpty2 ? 4 : 0;
                i4 = z11 ? 8 : 0;
            } else {
                i4 = 0;
                i5 = 0;
                zIsEmpty3 = false;
            }
            j3 = j & 50;
            if (j3 == 0) {
                if (!z) {
                    zM47035a = false;
                }
                if (j3 != 0) {
                    if (zM47035a) {
                        j9 = j | 2097152;
                        j10 = 549755813888L;
                    } else {
                        j9 = j | 1048576;
                        j10 = 274877906944L;
                    }
                    j = j9 | j10;
                }
                if ((j & 34) != 0) {
                    j |= zM47035a ? 8796093022208L : 4398046511104L;
                }
                z5 = !zM47035a;
                j4 = 0;
                if ((j & 50) != 0) {
                    j |= z5 ? MediaStatus.COMMAND_DISLIKE : MediaStatus.COMMAND_LIKE;
                }
                if ((j & 34) != 0) {
                    str4 = taskStatus;
                    i6 = zM47035a ? 8 : 0;
                } else {
                    str4 = taskStatus;
                    i6 = 0;
                }
            } else {
                j4 = 0;
                str4 = taskStatus;
                zM47035a = false;
                i6 = 0;
                z5 = false;
            }
            if ((j & 1374390616064L) == j4) {
                if ((j & 1099511627776L) != j4) {
                    String taskStatus2 = tasks != null ? tasks.getTaskStatus() : str4;
                    num = num2;
                    z10 = taskStatus2 == "COMPLETED";
                } else {
                    num = num2;
                }
                if ((j & 1048576) != 0) {
                    z6 = z10;
                    z7 = (tasks != null ? tasks.getClientID() : null) == "";
                    j8 = j & 274877939712L;
                    if (j8 == 0) {
                        if (tasks != null) {
                            clientSecondaryTitle = tasks.getClientSecondaryTitle();
                        }
                        z8 = clientSecondaryTitle == null;
                        if (j8 != 0) {
                            j = z8 ? j | 137438953472L : j | 68719476736L;
                        }
                        str5 = clientSecondaryTitle;
                        j5 = j & 50;
                        if (j5 == 0) {
                            i7 = 0;
                        } else {
                            if (zM47035a) {
                                z7 = true;
                            }
                            if (j5 != 0) {
                                j |= z7 ? 34359738368L : 17179869184L;
                            }
                            if (z7) {
                                i7 = 8;
                            }
                        }
                        j6 = j & 48;
                        if (j6 != 0) {
                            if (zIsEmpty3) {
                                z6 = true;
                            }
                            if (j6 != 0) {
                                j |= z6 ? 524288L : MediaStatus.COMMAND_STREAM_TRANSFER;
                            }
                            ck6Var = ck6Var2;
                            i8 = z6 ? 8 : 0;
                        } else {
                            ck6Var = ck6Var2;
                            i8 = 0;
                        }
                        boolean zIsEmpty4 = ((j & 68719476736L) == 0 || str5 == null) ? false : str5.isEmpty();
                        if ((j & 274877939712L) == 0) {
                            zIsEmpty4 = false;
                        } else if (z8) {
                            zIsEmpty4 = true;
                        }
                        j7 = j & 50;
                        if (j7 != 0) {
                            boolean z12 = z5 ? zIsEmpty4 : false;
                            if (zM47035a) {
                                zIsEmpty4 = true;
                            }
                            if (j7 != 0) {
                                j |= z12 ? 128L : 64L;
                            }
                            if ((j & 50) != 0) {
                                j |= zIsEmpty4 ? 2147483648L : 1073741824L;
                            }
                            i10 = z12 ? 0 : 8;
                            i9 = zIsEmpty4 ? 8 : 0;
                        } else {
                            i9 = 0;
                            i10 = 0;
                        }
                        if ((j & 48) != 0) {
                            i11 = i6;
                            np3.m40895a(this.n0, z3);
                            this.n0.setVisibility(i2);
                            fjh.m26938c(this.o0, str2);
                            nr1.m40947R(this.o0, tasks);
                            nr1.z0(this.q0, tasks);
                            nr1.o3(this.I0, tasks);
                            this.s0.i0(list);
                            this.t0.setVisibility(i4);
                            fjh.m26938c(this.u0, str3);
                            this.u0.setVisibility(i3);
                            this.w0.setVisibility(i);
                            nr1.L1(this.w0, tasks);
                            fjh.m26938c(this.x0, str5);
                            nr1.e1(this.y0, tasks);
                            nr1.e1(this.z0, tasks);
                            nr1.k1(this.A0, tasks);
                            nr1.J1(this.B0, tasks);
                            this.B0.setVisibility(i8);
                            fjh.m26938c(this.C0, str);
                            this.C0.setVisibility(i5);
                        } else {
                            i11 = i6;
                        }
                        if ((32 & j) != 0) {
                            this.n0.setOnClickListener(this.Z0);
                            this.o0.setOnClickListener(this.d1);
                            this.q0.setOnClickListener(this.a1);
                            this.q0.setOnLongClickListener(this.e1);
                            this.H0.setOnClickListener(this.M0);
                            this.H0.setOnLongClickListener(this.U0);
                            this.K0.setOnClickListener(this.f1);
                            this.K0.setOnLongClickListener(this.N0);
                            this.t0.setOnClickListener(this.W0);
                            this.u0.setOnClickListener(this.b1);
                            this.u0.setOnLongClickListener(this.h1);
                            this.w0.setOnLongClickListener(this.Y0);
                            this.x0.setOnLongClickListener(this.P0);
                            this.y0.setOnClickListener(this.L0);
                            this.y0.setOnLongClickListener(this.R0);
                            this.z0.setOnClickListener(this.c1);
                            this.z0.setOnLongClickListener(this.g1);
                            this.A0.setOnClickListener(this.Q0);
                            this.A0.setOnLongClickListener(this.V0);
                            this.B0.setOnClickListener(this.O0);
                            this.B0.setOnLongClickListener(this.S0);
                            this.C0.setOnClickListener(this.T0);
                            this.C0.setOnLongClickListener(this.X0);
                        }
                        if ((50 & j) != 0) {
                            this.q0.setVisibility(i7);
                            this.x0.setVisibility(i9);
                            this.y0.setVisibility(i9);
                            this.z0.setVisibility(i10);
                        }
                        if ((j & 34) != 0) {
                            this.J0.setVisibility(i11);
                        }
                        if ((40 & j) != 0) {
                            this.s0.h0(ck6Var);
                        }
                        if ((j & 36) != 0) {
                            this.s0.j0(num);
                        }
                        ewi.m25683r(this.s0);
                    }
                    str5 = clientSecondaryTitle;
                } else {
                    z6 = z10;
                }
                j8 = j & 274877939712L;
                if (j8 == 0) {
                }
            } else {
                num = num2;
                z6 = z10;
                str5 = clientSecondaryTitle;
                z7 = false;
            }
            z8 = false;
            j5 = j & 50;
            if (j5 == 0) {
            }
            j6 = j & 48;
            if (j6 != 0) {
            }
            if ((j & 68719476736L) == 0) {
            }
            if ((j & 274877939712L) == 0) {
            }
            j7 = j & 50;
            if (j7 != 0) {
            }
            if ((j & 48) != 0) {
            }
            if ((32 & j) != 0) {
            }
            if ((50 & j) != 0) {
            }
            if ((j & 34) != 0) {
            }
            if ((40 & j) != 0) {
            }
            if ((j & 36) != 0) {
            }
            ewi.m25683r(this.s0);
        }
        taskStatus = null;
        if ((33554432 & j) != 0) {
        }
        j2 = j & 48;
        if (j2 == 0) {
        }
        j3 = j & 50;
        if (j3 == 0) {
        }
        if ((j & 1374390616064L) == j4) {
        }
        z8 = false;
        j5 = j & 50;
        if (j5 == 0) {
        }
        j6 = j & 48;
        if (j6 != 0) {
        }
        if ((j & 68719476736L) == 0) {
        }
        if ((j & 274877939712L) == 0) {
        }
        j7 = j & 50;
        if (j7 != 0) {
        }
        if ((j & 48) != 0) {
        }
        if ((32 & j) != 0) {
        }
        if ((50 & j) != 0) {
        }
        if ((j & 34) != 0) {
        }
        if ((40 & j) != 0) {
        }
        if ((j & 36) != 0) {
        }
        ewi.m25683r(this.s0);
    }

    public o39(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 1, (CheckBox) objArr[8], (Chip) objArr[11], (MaterialButton) objArr[18], (ShapeableImageView) objArr[3], (ConstraintLayout) objArr[15], (p44) objArr[17], (MaterialButton) objArr[7], (MaterialButton) objArr[13], (ConstraintLayout) objArr[19], (MaterialTextView) objArr[16], (MaterialTextView) objArr[6], (MaterialTextView) objArr[4], (MaterialTextView) objArr[5], (MaterialTextView) objArr[12], (MaterialTextView) objArr[14], (Chip) objArr[10]);
        this.i1 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.q0.setTag(null);
        MaterialCardView materialCardView = (MaterialCardView) objArr[0];
        this.H0 = materialCardView;
        materialCardView.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.I0 = linearLayout;
        linearLayout.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[2];
        this.J0 = constraintLayout;
        constraintLayout.setTag(null);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) objArr[9];
        this.K0 = constraintLayout2;
        constraintLayout2.setTag(null);
        this.r0.setTag(null);
        m25693Z(this.s0);
        this.t0.setTag(null);
        this.u0.setTag(null);
        this.w0.setTag(null);
        this.x0.setTag(null);
        this.y0.setTag(null);
        this.z0.setTag(null);
        this.A0.setTag(null);
        this.B0.setTag(null);
        this.C0.setTag(null);
        a0(view);
        this.L0 = new jbc(this, 5);
        this.M0 = new jbc(this, 1);
        this.N0 = new sbc(this, 13);
        this.O0 = new jbc(this, 21);
        this.P0 = new sbc(this, 9);
        this.Q0 = new jbc(this, 17);
        this.R0 = new sbc(this, 6);
        this.S0 = new sbc(this, 22);
        this.T0 = new jbc(this, 14);
        this.U0 = new sbc(this, 2);
        this.V0 = new sbc(this, 18);
        this.W0 = new jbc(this, 10);
        this.X0 = new sbc(this, 15);
        this.Y0 = new sbc(this, 23);
        this.Z0 = new jbc(this, 11);
        this.a1 = new jbc(this, 3);
        this.b1 = new jbc(this, 19);
        this.c1 = new jbc(this, 7);
        this.d1 = new jbc(this, 16);
        this.e1 = new sbc(this, 4);
        this.f1 = new jbc(this, 12);
        this.g1 = new sbc(this, 8);
        this.h1 = new sbc(this, 20);
        mo16291G();
    }
}
