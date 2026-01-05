package a9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import bk.RunnableC0683n;
import com.google.android.gms.internal.measurement.p8;
import java.util.Objects;
import kotlin.jvm.internal.AbstractC4154l;
import mt.C4882k;
import pt.C6032f;
import t8.C7077w;
import tx.c0;
import ug.f0;
import ug.m1;
import ug.n1;
import ug.v0;
import xm.q4;
import xv.C8489p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: a9.d */
/* loaded from: classes.dex */
public final class C0065d extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ int f248a;

    /* renamed from: b */
    public final Object f249b;

    public /* synthetic */ C0065d(int i10, Object obj) {
        this.f248a = i10;
        this.f249b = obj;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i10 = this.f248a;
        Object obj = this.f249b;
        switch (i10) {
            case 0:
                AbstractC4154l.m8923f(context, "context");
                AbstractC4154l.m8923f(intent, "intent");
                C0062a c0062a = (C0062a) obj;
                switch (c0062a.f245g) {
                    case 0:
                        String action = intent.getAction();
                        if (action != null) {
                            C7077w c7077wM13371a = C7077w.m13371a();
                            int i11 = AbstractC0063b.f246a;
                            c7077wM13371a.getClass();
                            switch (action.hashCode()) {
                                case -1886648615:
                                    if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                                        c0062a.m188d(Boolean.FALSE);
                                        break;
                                    }
                                    break;
                                case -54942926:
                                    if (action.equals("android.os.action.DISCHARGING")) {
                                        c0062a.m188d(Boolean.FALSE);
                                        break;
                                    }
                                    break;
                                case 948344062:
                                    if (action.equals("android.os.action.CHARGING")) {
                                        c0062a.m188d(Boolean.TRUE);
                                        break;
                                    }
                                    break;
                                case 1019184907:
                                    if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                                        c0062a.m188d(Boolean.TRUE);
                                        break;
                                    }
                                    break;
                            }
                        }
                        break;
                    case 1:
                        if (intent.getAction() != null) {
                            C7077w c7077wM13371a2 = C7077w.m13371a();
                            int i12 = AbstractC0064c.f247a;
                            intent.getAction();
                            c7077wM13371a2.getClass();
                            String action2 = intent.getAction();
                            if (action2 != null) {
                                int iHashCode = action2.hashCode();
                                if (iHashCode == -1980154005) {
                                    if (action2.equals("android.intent.action.BATTERY_OKAY")) {
                                        c0062a.m188d(Boolean.TRUE);
                                        break;
                                    }
                                } else if (iHashCode == 490310653 && action2.equals("android.intent.action.BATTERY_LOW")) {
                                    c0062a.m188d(Boolean.FALSE);
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        if (intent.getAction() != null) {
                            C7077w c7077wM13371a3 = C7077w.m13371a();
                            int i13 = AbstractC0072k.f263a;
                            intent.getAction();
                            c7077wM13371a3.getClass();
                            String action3 = intent.getAction();
                            if (action3 != null) {
                                int iHashCode2 = action3.hashCode();
                                if (iHashCode2 == -1181163412) {
                                    if (action3.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                                        c0062a.m188d(Boolean.FALSE);
                                        break;
                                    }
                                } else if (iHashCode2 == -730838620 && action3.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                                    c0062a.m188d(Boolean.TRUE);
                                    break;
                                }
                            }
                        }
                        break;
                }
            case 1:
                if (AbstractC4154l.m8918a(intent != null ? intent.getAction() : null, "android.intent.action.DOWNLOAD_COMPLETE")) {
                    ((C6032f) obj).m12048h(new C4882k(intent.getLongExtra("extra_download_id", -1L)));
                    break;
                }
                break;
            case 2:
                n1 n1Var = (n1) obj;
                if (intent != null) {
                    String action4 = intent.getAction();
                    if (action4 != null) {
                        int iHashCode3 = action4.hashCode();
                        if (iHashCode3 == -1928239649) {
                            if (action4.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
                                p8.m3595a();
                                if (n1Var.f35667d.m13889W(null, f0.Q0)) {
                                    v0 v0Var = n1Var.f35669f;
                                    n1.m14085m(v0Var);
                                    v0Var.f35870p.m14140a("App receiver notified triggers are available");
                                    m1 m1Var = n1Var.f35670g;
                                    n1.m14085m(m1Var);
                                    m1Var.m14047V(new RunnableC0683n(21, n1Var));
                                    break;
                                }
                            }
                        } else if (iHashCode3 == 1279883384 && action4.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) {
                            v0 v0Var2 = n1Var.f35669f;
                            n1.m14085m(v0Var2);
                            v0Var2.f35870p.m14140a("[sgtm] App Receiver notified batches are available");
                            m1 m1Var2 = n1Var.f35670g;
                            n1.m14085m(m1Var2);
                            m1Var2.m14047V(new RunnableC0683n(20, this));
                            break;
                        }
                        v0 v0Var3 = n1Var.f35669f;
                        n1.m14085m(v0Var3);
                        v0Var3.f35865j.m14140a("App receiver called with unknown action");
                        break;
                    } else {
                        v0 v0Var4 = n1Var.f35669f;
                        n1.m14085m(v0Var4);
                        v0Var4.f35865j.m14140a("App receiver called with null action");
                        break;
                    }
                } else {
                    v0 v0Var5 = n1Var.f35669f;
                    n1.m14085m(v0Var5);
                    v0Var5.f35865j.m14140a("App receiver called with null intent");
                    break;
                }
                break;
            default:
                Objects.toString(intent);
                long longExtra = intent != null ? intent.getLongExtra("extra_download_id", -1L) : -1L;
                q4 q4Var = ((C8489p) obj).f41345A.f22367a;
                c0.m13502y(q4Var.f40743c, null, null, new k1.n1(q4Var, longExtra, null), 3);
                break;
        }
    }

    public C0065d(n1 n1Var) {
        this.f248a = 2;
        this.f249b = n1Var;
    }
}
