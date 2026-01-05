package q5;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import c6.InterfaceC0882l;
import d7.AbstractC1646r;
import d7.C1651w;
import d7.EnumC1645q;
import d7.InterfaceC1649u;
import d7.k0;
import d7.m0;
import e1.u0;
import kotlin.jvm.internal.AbstractC4154l;
import og.f2;
import qw.InterfaceC6353c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: q5.c */
/* loaded from: classes.dex */
public abstract class AbstractActivityC6110c extends Activity implements InterfaceC1649u, InterfaceC0882l {
    private final u0 extraDataMap = new u0(0);
    private final C1651w lifecycleRegistry = new C1651w(this);

    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    @Override // android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchKeyEvent(android.view.KeyEvent r12) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.AbstractActivityC6110c.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent event) {
        AbstractC4154l.m8923f(event, "event");
        View decorView = getWindow().getDecorView();
        AbstractC4154l.m8922e(decorView, "window.decorView");
        if (f2.m10641b(decorView, event)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(event);
    }

    @InterfaceC6353c
    public <T extends AbstractC6109b> T getExtraData(Class<T> extraDataClass) {
        AbstractC4154l.m8923f(extraDataClass, "extraDataClass");
        if (this.extraDataMap.get(extraDataClass) == null) {
            return null;
        }
        throw new ClassCastException();
    }

    public AbstractC1646r getLifecycle() {
        return this.lifecycleRegistry;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i10 = m0.f8117a;
        k0.m5324b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        AbstractC4154l.m8923f(outState, "outState");
        this.lifecycleRegistry.m5357i(EnumC1645q.CREATED);
        super.onSaveInstanceState(outState);
    }

    @InterfaceC6353c
    public void putExtraData(AbstractC6109b extraData) {
        AbstractC4154l.m8923f(extraData, "extraData");
        throw null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean shouldDumpInternalState(java.lang.String[] r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            if (r4 == 0) goto L5c
            int r2 = r4.length
            if (r2 != 0) goto L8
            goto L5c
        L8:
            r4 = r4[r1]
            int r2 = r4.hashCode()
            switch(r2) {
                case -645125871: goto L4c;
                case 100470631: goto L3c;
                case 472614934: goto L33;
                case 1159329357: goto L23;
                case 1455016274: goto L12;
                default: goto L11;
            }
        L11:
            goto L5c
        L12:
            java.lang.String r2 = "--autofill"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L1b
            goto L5c
        L1b:
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r4 < r2) goto L5c
        L21:
            r1 = r0
            goto L5c
        L23:
            java.lang.String r2 = "--contentcapture"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L2c
            goto L5c
        L2c:
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r4 < r2) goto L5c
            goto L21
        L33:
            java.lang.String r2 = "--list-dumpables"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L45
            goto L5c
        L3c:
            java.lang.String r2 = "--dump-dumpable"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L45
            goto L5c
        L45:
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r4 < r2) goto L5c
            goto L21
        L4c:
            java.lang.String r2 = "--translation"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L55
            goto L5c
        L55:
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r4 < r2) goto L5c
            goto L21
        L5c:
            r4 = r1 ^ 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.AbstractActivityC6110c.shouldDumpInternalState(java.lang.String[]):boolean");
    }

    @Override // c6.InterfaceC0882l
    public boolean superDispatchKeyEvent(KeyEvent event) {
        AbstractC4154l.m8923f(event, "event");
        return super.dispatchKeyEvent(event);
    }
}
