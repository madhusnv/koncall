package com.amplifyframework.devmenu;

import a1.c0;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.o0;
import c6.AbstractC0879i;
import com.amplifyframework.core.C1183R;
import hq.d0;
import java.util.HashSet;
import kotlin.jvm.internal.AbstractC4154l;
import l7.C4409i;
import l7.C4423w;
import l7.a0;
import mx.AbstractC4913i;
import q7.C6138e;
import r7.C6483a;
import rw.C6661k;
import zh.AbstractC8955b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class DeveloperMenuActivity extends o0 {
    @Override // androidx.fragment.app.o0, p004e.AbstractActivityC1878m, q5.AbstractActivityC6110c, android.app.Activity
    public void onCreate(Bundle bundle) {
        View viewFindViewById;
        super.onCreate(bundle);
        setContentView(C1183R.layout.activity_dev_menu);
        findViewById(C1183R.id.dev_layout).setFocusable(true);
        int i10 = C1183R.id.nav_host_fragment;
        if (Build.VERSION.SDK_INT >= 28) {
            viewFindViewById = AbstractC0879i.m2406r(this, i10);
        } else {
            viewFindViewById = findViewById(i10);
            if (viewFindViewById == null) {
                throw new IllegalArgumentException("ID does not reference a View inside this Activity");
            }
        }
        AbstractC4154l.m8922e(viewFindViewById, "requireViewById(...)");
        int i11 = 13;
        a0 a0Var = (a0) AbstractC4913i.m9808d(AbstractC4913i.m9812h(AbstractC4913i.m9809e(new d0(i11), viewFindViewById), new d0(14)));
        if (a0Var == null) {
            throw new IllegalStateException("Activity " + this + " does not have a NavController set on " + i10);
        }
        C6138e c6138e = a0Var.f21996b;
        Toolbar toolbar = (Toolbar) findViewById(C1183R.id.toolbar);
        C4423w c4423wM12174i = c6138e.m12174i();
        HashSet hashSet = new HashSet();
        int i12 = C4423w.f22139h;
        hashSet.add(Integer.valueOf(AbstractC8955b.m16437a(c4423wM12174i).f22135b.f29939e));
        l4.d0 d0Var = new l4.d0(i11, hashSet);
        AbstractC4154l.m8923f(toolbar, "toolbar");
        C6483a c6483a = new C6483a(toolbar, d0Var);
        c6138e.f29922p.add(c6483a);
        C6661k c6661k = c6138e.f29912f;
        if (!c6661k.isEmpty()) {
            C4409i c4409i = (C4409i) c6661k.last();
            c6483a.m12483a(c6138e.f29907a, c4409i.f22046b, c4409i.f22052h.m12163a());
        }
        toolbar.setNavigationOnClickListener(new ViewOnClickListenerC1188a(a0Var, d0Var));
        DeveloperMenu.singletonInstance(getApplicationContext()).setOnHideAction(new c0(5, this));
    }

    @Override // androidx.fragment.app.o0, android.app.Activity
    public void onStart() {
        DeveloperMenu.singletonInstance(getApplicationContext()).setVisible(true);
        super.onStart();
    }

    @Override // androidx.fragment.app.o0, android.app.Activity
    public void onStop() {
        DeveloperMenu.singletonInstance(getApplicationContext()).setVisible(false);
        super.onStop();
    }
}
