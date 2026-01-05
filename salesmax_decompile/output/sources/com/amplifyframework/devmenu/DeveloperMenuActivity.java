package com.amplifyframework.devmenu;

import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.AbstractC2333d;
import com.amplifyframework.core.C10546R;
import com.amplifyframework.devmenu.DeveloperMenu;
import p001o.fsb;
import p001o.jj0;
import p001o.ssb;

/* loaded from: classes5.dex */
public final class DeveloperMenuActivity extends FragmentActivity {
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C10546R.layout.activity_dev_menu);
        findViewById(C10546R.id.dev_layout).setFocusable(true);
        AbstractC2333d abstractC2333dM27447b = fsb.m27447b(this, C10546R.id.nav_host_fragment);
        ssb.m48876f((Toolbar) findViewById(C10546R.id.toolbar), abstractC2333dM27447b, new jj0.C14548a(abstractC2333dM27447b.m8593I()).m33874a());
        DeveloperMenu.singletonInstance(getApplicationContext()).setOnHideAction(new DeveloperMenu.HideAction() { // from class: o.iq5
            @Override // com.amplifyframework.devmenu.DeveloperMenu.HideAction
            public final void hideDeveloperMenu() {
                this.f29081a.finish();
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        DeveloperMenu.singletonInstance(getApplicationContext()).setVisible(true);
        super.onStart();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        DeveloperMenu.singletonInstance(getApplicationContext()).setVisible(false);
        super.onStop();
    }
}
