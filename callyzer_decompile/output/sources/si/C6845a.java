package si;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import l4.d0;
import ng.C5070u;
import ni.C5074c;
import ni.InterfaceC5073b;
import qj.InterfaceC6236a;
import qj.InterfaceC6237b;
import tb.C7105p;
import ug.C7439j;
import ug.g1;
import ui.InterfaceC7470a;
import vi.C7713b;
import vi.InterfaceC7712a;
import wi.C8065o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: si.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C6845a implements InterfaceC7712a, InterfaceC7470a, InterfaceC6236a {

    /* renamed from: a */
    public final /* synthetic */ C6846b f32508a;

    public /* synthetic */ C6845a(C6846b c6846b) {
        this.f32508a = c6846b;
    }

    @Override // qj.InterfaceC6236a
    /* renamed from: e */
    public void mo19e(InterfaceC6237b interfaceC6237b) {
        C6846b c6846b = this.f32508a;
        Log.isLoggable("FirebaseCrashlytics", 3);
        InterfaceC5073b interfaceC5073b = (InterfaceC5073b) interfaceC6237b.get();
        d0 d0Var = new d0(28, interfaceC5073b);
        C7105p c7105p = new C7105p(12, (char) 0);
        C5074c c5074c = (C5074c) interfaceC5073b;
        C5070u c5070uM10008b = c5074c.m10008b("clx", c7105p);
        if (c5070uM10008b == null) {
            Log.isLoggable("FirebaseCrashlytics", 3);
            c5070uM10008b = c5074c.m10008b("crash", c7105p);
        }
        if (c5070uM10008b != null) {
            Log.isLoggable("FirebaseCrashlytics", 3);
            g1 g1Var = new g1();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            C7439j c7439j = new C7439j(d0Var);
            synchronized (c6846b) {
                try {
                    ArrayList arrayList = c6846b.f32511c;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        g1Var.mo13043f((C8065o) obj);
                    }
                    c7105p.f34291c = g1Var;
                    c7105p.f34290b = c7439j;
                    c6846b.f32510b = g1Var;
                    c6846b.f32509a = c7439j;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // vi.InterfaceC7712a
    /* renamed from: f */
    public void mo13043f(C8065o c8065o) {
        C6846b c6846b = this.f32508a;
        synchronized (c6846b) {
            try {
                if (c6846b.f32510b instanceof C7713b) {
                    c6846b.f32511c.add(c8065o);
                }
                c6846b.f32510b.mo13043f(c8065o);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ui.InterfaceC7470a
    /* renamed from: l */
    public void mo9084l(Bundle bundle) {
        this.f32508a.f32509a.mo9084l(bundle);
    }
}
