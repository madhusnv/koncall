package com.amplifyframework.devmenu;

import a9.C0073l;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.j0;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4154l;
import l4.C4367l;
import l4.d0;
import l7.AbstractC4422v;
import l7.C4420t;
import l7.C4421u;
import l7.C4423w;
import l7.a0;
import og.fg;
import og.pe;
import pg.n7;
import q7.C6138e;
import q7.C6140g;
import qw.C6361k;
import rw.AbstractC6662l;
import rw.AbstractC6663m;
import zh.AbstractC8955b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.amplifyframework.devmenu.a */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC1188a implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f5878a;

    /* renamed from: b */
    public final /* synthetic */ Object f5879b;

    public /* synthetic */ ViewOnClickListenerC1188a(j0 j0Var, int i10) {
        this.f5878a = i10;
        this.f5879b = j0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Bundle bundleM9246h;
        Intent intent;
        int i10 = this.f5878a;
        Object obj = this.f5879b;
        switch (i10) {
            case 0:
                ((DevMenuFileIssueFragment) obj).lambda$onCreateView$0(view);
                return;
            case 1:
                ((DevMenuLogsFragment) obj).lambda$onCreateView$0(view);
                return;
            default:
                a0 a0Var = (a0) obj;
                C6138e c6138e = a0Var.f21996b;
                c6138e.m12173h();
                Activity activity = a0Var.f21998d;
                if (a0Var.m9184b() != 1) {
                    a0Var.m9188g();
                    return;
                }
                Bundle extras = (activity == null || (intent = activity.getIntent()) == null) ? null : intent.getExtras();
                int i11 = 2;
                int i12 = 0;
                if ((extras != null ? extras.getIntArray("android-support-nav:controller:deepLinkIds") : null) == null) {
                    AbstractC4422v abstractC4422vM12173h = c6138e.m12173h();
                    AbstractC4154l.m8920c(abstractC4422vM12173h);
                    int i13 = abstractC4422vM12173h.f22135b.f29939e;
                    for (C4423w c4423w = abstractC4422vM12173h.f22136c; c4423w != null; c4423w = c4423w.f22136c) {
                        C6140g c6140g = c4423w.f22135b;
                        if (c4423w.f22140g.f22763b != i13) {
                            Bundle bundleM11799a = n7.m11799a((C6361k[]) Arrays.copyOf(new C6361k[0], 0));
                            if (activity != null && activity.getIntent() != null && activity.getIntent().getData() != null) {
                                Intent intent2 = activity.getIntent();
                                AbstractC4154l.m8922e(intent2, "getIntent(...)");
                                fg.m10657c(intent2, bundleM11799a);
                                C4423w c4423wM12176k = c6138e.m12176k();
                                Intent intent3 = activity.getIntent();
                                AbstractC4154l.m8922e(intent3, "getIntent(...)");
                                C4421u c4421uM9254x = c4423wM12176k.m9254x(new C4367l(i11, intent3.getData(), intent3.getAction(), intent3.getType()), c4423wM12176k);
                                if ((c4421uM9254x != null ? c4421uM9254x.f22128b : null) != null && (bundleM9246h = c4421uM9254x.f22127a.m9246h(c4421uM9254x.f22128b)) != null) {
                                    bundleM11799a.putAll(bundleM9246h);
                                }
                            }
                            C0073l c0073l = new C0073l(a0Var);
                            int i14 = c6140g.f29939e;
                            ArrayList arrayList = (ArrayList) c0073l.f268e;
                            arrayList.clear();
                            arrayList.add(new C4420t(i14, null));
                            if (((C4423w) c0073l.f267d) != null) {
                                c0073l.m207Q();
                            }
                            ((Intent) c0073l.f266c).putExtra("android-support-nav:controller:deepLinkExtras", bundleM11799a);
                            c0073l.m225r().m12160c();
                            if (activity != null) {
                                activity.finish();
                                return;
                            }
                            return;
                        }
                        i13 = c6140g.f29939e;
                    }
                    return;
                }
                if (a0Var.f21999e) {
                    AbstractC4154l.m8920c(activity);
                    Intent intent4 = activity.getIntent();
                    Bundle extras2 = intent4.getExtras();
                    AbstractC4154l.m8920c(extras2);
                    int[] intArray = extras2.getIntArray("android-support-nav:controller:deepLinkIds");
                    AbstractC4154l.m8920c(intArray);
                    ArrayList arrayListM12709L = AbstractC6662l.m12709L(intArray);
                    ArrayList parcelableArrayList = extras2.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
                    if (arrayListM12709L.size() < 2) {
                        return;
                    }
                    int iIntValue = ((Number) AbstractC6663m.m12757U(arrayListM12709L)).intValue();
                    if (parcelableArrayList != null) {
                    }
                    AbstractC4422v abstractC4422vM12165e = C6138e.m12165e(iIntValue, c6138e.m12174i(), null, false);
                    if (abstractC4422vM12165e instanceof C4423w) {
                        int i15 = C4423w.f22139h;
                        iIntValue = AbstractC8955b.m16437a((C4423w) abstractC4422vM12165e).f22135b.f29939e;
                    }
                    AbstractC4422v abstractC4422vM12173h2 = c6138e.m12173h();
                    if (abstractC4422vM12173h2 == null || iIntValue != abstractC4422vM12173h2.f22135b.f29939e) {
                        return;
                    }
                    C0073l c0073l2 = new C0073l(a0Var);
                    Bundle bundleM11799a2 = n7.m11799a((C6361k[]) Arrays.copyOf(new C6361k[0], 0));
                    fg.m10657c(intent4, bundleM11799a2);
                    Bundle bundle = extras2.getBundle("android-support-nav:controller:deepLinkExtras");
                    if (bundle != null) {
                        bundleM11799a2.putAll(bundle);
                    }
                    ((Intent) c0073l2.f266c).putExtra("android-support-nav:controller:deepLinkExtras", bundleM11799a2);
                    int size = arrayListM12709L.size();
                    int i16 = 0;
                    while (i16 < size) {
                        Object obj2 = arrayListM12709L.get(i16);
                        i16++;
                        int i17 = i12 + 1;
                        if (i12 < 0) {
                            pe.m10842q();
                            throw null;
                        }
                        ((ArrayList) c0073l2.f268e).add(new C4420t(((Number) obj2).intValue(), parcelableArrayList != null ? (Bundle) parcelableArrayList.get(i12) : null));
                        if (((C4423w) c0073l2.f267d) != null) {
                            c0073l2.m207Q();
                        }
                        i12 = i17;
                    }
                    c0073l2.m225r().m12160c();
                    activity.finish();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ ViewOnClickListenerC1188a(a0 a0Var, d0 d0Var) {
        this.f5878a = 2;
        this.f5879b = a0Var;
    }
}
