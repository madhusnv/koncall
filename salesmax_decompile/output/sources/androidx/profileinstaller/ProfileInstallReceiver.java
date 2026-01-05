package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Process;
import androidx.profileinstaller.AbstractC2355c;
import java.io.IOException;
import p001o.ab4;

/* loaded from: classes2.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {

    /* renamed from: androidx.profileinstaller.ProfileInstallReceiver$a */
    public class C2350a implements AbstractC2355c.c {
        public C2350a() {
        }

        @Override // androidx.profileinstaller.AbstractC2355c.c
        /* renamed from: a */
        public void mo8961a(int i, Object obj) {
            AbstractC2355c.f9718b.mo8961a(i, obj);
            ProfileInstallReceiver.this.setResultCode(i);
        }

        @Override // androidx.profileinstaller.AbstractC2355c.c
        /* renamed from: b */
        public void mo8962b(int i, Object obj) {
            AbstractC2355c.f9718b.mo8962b(i, obj);
        }
    }

    /* renamed from: a */
    public static void m8960a(AbstractC2355c.c cVar) {
        Process.sendSignal(Process.myPid(), 10);
        cVar.mo8961a(12, null);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) throws PackageManager.NameNotFoundException, IOException {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            AbstractC2355c.m9001k(context, new ab4(), new C2350a(), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if ("WRITE_SKIP_FILE".equals(string)) {
                    AbstractC2355c.m9002l(context, new ab4(), new C2350a());
                    return;
                } else {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        AbstractC2355c.m8993c(context, new ab4(), new C2350a());
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            m8960a(new C2350a());
            return;
        }
        if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
        C2350a c2350a = new C2350a();
        if ("DROP_SHADER_CACHE".equals(string2)) {
            AbstractC2353a.m8974b(context, c2350a);
        } else {
            c2350a.mo8961a(16, null);
        }
    }
}
