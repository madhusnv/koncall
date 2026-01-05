package androidx.core.app;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.AbstractC2139h;
import androidx.lifecycle.C2144m;
import androidx.lifecycle.FragmentC2150s;
import p001o.ktf;
import p001o.pc9;
import p001o.sq8;
import p001o.tq;
import p001o.xca;

/* loaded from: classes2.dex */
public class ComponentActivity extends Activity implements xca, pc9.InterfaceC16053a {
    private final ktf extraDataMap = new ktf();
    private final C2144m lifecycleRegistry = new C2144m(this);

    /* renamed from: androidx.core.app.ComponentActivity$a */
    public static class C2015a {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0046, code lost:
    
        if (r4.equals("--list-dumpables") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x004f, code lost:
    
        if (r4.equals("--dump-dumpable") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0056, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 33) goto L41;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:11:0x000f  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m5814b(String[] strArr) {
        boolean z;
        if (strArr == null) {
            z = true;
        } else {
            if (!(strArr.length == 0)) {
                z = false;
            }
        }
        if (!z) {
            String str = strArr[0];
            switch (str.hashCode()) {
                case -645125871:
                    if (str.equals("--translation") && Build.VERSION.SDK_INT >= 31) {
                    }
                    break;
                case 100470631:
                    break;
                case 472614934:
                    break;
                case 1159329357:
                    if (str.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29) {
                    }
                    break;
                case 1455016274:
                    if (str.equals("--autofill") && Build.VERSION.SDK_INT >= 26) {
                    }
                    break;
            }
            return false;
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        sq8.m48649h(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        sq8.m48648g(decorView, "window.decorView");
        if (pc9.m43339d(decorView, keyEvent)) {
            return true;
        }
        return pc9.m43340e(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        sq8.m48649h(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        sq8.m48648g(decorView, "window.decorView");
        if (pc9.m43339d(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    public <T extends C2015a> T getExtraData(Class<T> cls) {
        sq8.m48649h(cls, "extraDataClass");
        tq.m50332a(this.extraDataMap.get(cls));
        return null;
    }

    public AbstractC2139h getLifecycle() {
        return this.lifecycleRegistry;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentC2150s.f7747b.m6578c(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        sq8.m48649h(bundle, "outState");
        this.lifecycleRegistry.m6543n(AbstractC2139h.b.CREATED);
        super.onSaveInstanceState(bundle);
    }

    public void putExtraData(C2015a c2015a) {
        sq8.m48649h(c2015a, "extraData");
        throw null;
    }

    public final boolean shouldDumpInternalState(String[] strArr) {
        return !m5814b(strArr);
    }

    @Override // p001o.pc9.InterfaceC16053a
    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        sq8.m48649h(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }
}
