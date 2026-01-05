package p001o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes2.dex */
public abstract class bh7 extends qg7 {

    /* renamed from: a */
    public final Activity f16207a;

    /* renamed from: b */
    public final Context f16208b;

    /* renamed from: c */
    public final Handler f16209c;

    /* renamed from: d */
    public final int f16210d;

    /* renamed from: e */
    public final FragmentManager f16211e;

    public bh7(Activity activity, Context context, Handler handler, int i) {
        sq8.m48649h(context, "context");
        sq8.m48649h(handler, "handler");
        this.f16207a = activity;
        this.f16208b = context;
        this.f16209c = handler;
        this.f16210d = i;
        this.f16211e = new oh7();
    }

    /* renamed from: e */
    public final Activity m18965e() {
        return this.f16207a;
    }

    /* renamed from: f */
    public final Context m18966f() {
        return this.f16208b;
    }

    /* renamed from: g */
    public final FragmentManager m18967g() {
        return this.f16211e;
    }

    /* renamed from: h */
    public final Handler m18968h() {
        return this.f16209c;
    }

    /* renamed from: i */
    public abstract void mo6154i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: j */
    public abstract Object mo6155j();

    /* renamed from: k */
    public abstract LayoutInflater mo6156k();

    /* renamed from: l */
    public void m18969l(Fragment fragment, String[] strArr, int i) {
        sq8.m48649h(fragment, "fragment");
        sq8.m48649h(strArr, "permissions");
    }

    /* renamed from: m */
    public abstract boolean mo6157m(String str);

    /* renamed from: n */
    public void m18970n(Fragment fragment, Intent intent, int i, Bundle bundle) {
        sq8.m48649h(fragment, "fragment");
        sq8.m48649h(intent, "intent");
        if (!(i == -1)) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host".toString());
        }
        c64.startActivity(this.f16208b, intent, bundle);
    }

    /* renamed from: o */
    public void m18971o(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        sq8.m48649h(fragment, "fragment");
        sq8.m48649h(intentSender, "intent");
        if (!(i == -1)) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host".toString());
        }
        Activity activity = this.f16207a;
        if (activity == null) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host".toString());
        }
        mn.m39373m(activity, intentSender, i, intent, i2, i3, i4, bundle);
    }

    /* renamed from: p */
    public abstract void mo6158p();

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bh7(FragmentActivity fragmentActivity) {
        this(fragmentActivity, fragmentActivity, new Handler(), 0);
        sq8.m48649h(fragmentActivity, "activity");
    }
}
