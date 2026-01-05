package d7;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import d7.m0;
import kotlin.jvm.internal.AbstractC4154l;
import q5.AbstractActivityC6110c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class k0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m5323a(Activity activity, EnumC1644p event) {
        AbstractC4154l.m8923f(event, "event");
        if (activity instanceof InterfaceC1649u) {
            AbstractC1646r lifecycle = ((InterfaceC1649u) activity).getLifecycle();
            if (lifecycle instanceof C1651w) {
                ((C1651w) lifecycle).m5355g(event);
            }
        }
    }

    /* renamed from: b */
    public static void m5324b(AbstractActivityC6110c abstractActivityC6110c) {
        if (Build.VERSION.SDK_INT >= 29) {
            m0.C1641a.Companion.getClass();
            l0.m5325a(abstractActivityC6110c);
        }
        FragmentManager fragmentManager = abstractActivityC6110c.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new m0(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
