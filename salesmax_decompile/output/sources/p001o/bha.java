package p001o;

import android.os.Bundle;
import android.os.Looper;
import androidx.lifecycle.b0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import p001o.aha;
import p001o.wga;

/* loaded from: classes2.dex */
public class bha extends aha {

    /* renamed from: c */
    public static boolean f16241c = false;

    /* renamed from: a */
    public final xca f16242a;

    /* renamed from: b */
    public final C12400c f16243b;

    /* renamed from: o.bha$a */
    public static class C12398a extends hpb implements wga.InterfaceC17847b {

        /* renamed from: a */
        public final int f16244a;

        /* renamed from: b */
        public final Bundle f16245b;

        /* renamed from: c */
        public final wga f16246c;

        /* renamed from: d */
        public xca f16247d;

        /* renamed from: e */
        public C12399b f16248e;

        /* renamed from: f */
        public wga f16249f;

        public C12398a(int i, Bundle bundle, wga wgaVar, wga wgaVar2) {
            this.f16244a = i;
            this.f16245b = bundle;
            this.f16246c = wgaVar;
            this.f16249f = wgaVar2;
            wgaVar.registerListener(i, this);
        }

        @Override // p001o.wga.InterfaceC17847b
        /* renamed from: a */
        public void mo19003a(wga wgaVar, Object obj) {
            if (bha.f16241c) {
                StringBuilder sb = new StringBuilder();
                sb.append("onLoadComplete: ");
                sb.append(this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                setValue(obj);
            } else {
                boolean z = bha.f16241c;
                postValue(obj);
            }
        }

        /* renamed from: c */
        public wga m19004c(boolean z) {
            if (bha.f16241c) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Destroying: ");
                sb.append(this);
            }
            this.f16246c.cancelLoad();
            this.f16246c.abandon();
            C12399b c12399b = this.f16248e;
            if (c12399b != null) {
                removeObserver(c12399b);
                if (z) {
                    c12399b.m19011c();
                }
            }
            this.f16246c.unregisterListener(this);
            if ((c12399b == null || c12399b.m19010b()) && !z) {
                return this.f16246c;
            }
            this.f16246c.reset();
            return this.f16249f;
        }

        /* renamed from: d */
        public void m19005d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f16244a);
            printWriter.print(" mArgs=");
            printWriter.println(this.f16245b);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f16246c);
            this.f16246c.dump(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f16248e != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f16248e);
                this.f16248e.m19009a(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(m19006e().dataToString(getValue()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(hasActiveObservers());
        }

        /* renamed from: e */
        public wga m19006e() {
            return this.f16246c;
        }

        /* renamed from: f */
        public void m19007f() {
            xca xcaVar = this.f16247d;
            C12399b c12399b = this.f16248e;
            if (xcaVar == null || c12399b == null) {
                return;
            }
            super.removeObserver(c12399b);
            observe(xcaVar, c12399b);
        }

        /* renamed from: g */
        public wga m19008g(xca xcaVar, aha.InterfaceC12172a interfaceC12172a) {
            C12399b c12399b = new C12399b(this.f16246c, interfaceC12172a);
            observe(xcaVar, c12399b);
            n9c n9cVar = this.f16248e;
            if (n9cVar != null) {
                removeObserver(n9cVar);
            }
            this.f16247d = xcaVar;
            this.f16248e = c12399b;
            return this.f16246c;
        }

        @Override // androidx.lifecycle.AbstractC2145n
        public void onActive() {
            if (bha.f16241c) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Starting: ");
                sb.append(this);
            }
            this.f16246c.startLoading();
        }

        @Override // androidx.lifecycle.AbstractC2145n
        public void onInactive() {
            if (bha.f16241c) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Stopping: ");
                sb.append(this);
            }
            this.f16246c.stopLoading();
        }

        @Override // androidx.lifecycle.AbstractC2145n
        public void removeObserver(n9c n9cVar) {
            super.removeObserver(n9cVar);
            this.f16247d = null;
            this.f16248e = null;
        }

        @Override // p001o.hpb, androidx.lifecycle.AbstractC2145n
        public void setValue(Object obj) {
            super.setValue(obj);
            wga wgaVar = this.f16249f;
            if (wgaVar != null) {
                wgaVar.reset();
                this.f16249f = null;
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f16244a);
            sb.append(" : ");
            p75.m43084a(this.f16246c, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: o.bha$b */
    public static class C12399b implements n9c {

        /* renamed from: a */
        public final wga f16250a;

        /* renamed from: b */
        public final aha.InterfaceC12172a f16251b;

        /* renamed from: c */
        public boolean f16252c = false;

        public C12399b(wga wgaVar, aha.InterfaceC12172a interfaceC12172a) {
            this.f16250a = wgaVar;
            this.f16251b = interfaceC12172a;
        }

        /* renamed from: a */
        public void m19009a(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f16252c);
        }

        /* renamed from: b */
        public boolean m19010b() {
            return this.f16252c;
        }

        /* renamed from: c */
        public void m19011c() {
            if (this.f16252c) {
                if (bha.f16241c) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("  Resetting: ");
                    sb.append(this.f16250a);
                }
                this.f16251b.onLoaderReset(this.f16250a);
            }
        }

        @Override // p001o.n9c
        public void onChanged(Object obj) {
            if (bha.f16241c) {
                StringBuilder sb = new StringBuilder();
                sb.append("  onLoadFinished in ");
                sb.append(this.f16250a);
                sb.append(": ");
                sb.append(this.f16250a.dataToString(obj));
            }
            this.f16251b.onLoadFinished(this.f16250a, obj);
            this.f16252c = true;
        }

        public String toString() {
            return this.f16251b.toString();
        }
    }

    /* renamed from: o.bha$c */
    public static class C12400c extends dxi {

        /* renamed from: d */
        public static final b0.InterfaceC2131c f16253d = new a();

        /* renamed from: b */
        public d0g f16254b = new d0g();

        /* renamed from: c */
        public boolean f16255c = false;

        /* renamed from: o.bha$c$a */
        public static class a implements b0.InterfaceC2131c {
            @Override // androidx.lifecycle.b0.InterfaceC2131c
            /* renamed from: c */
            public dxi mo6367c(Class cls) {
                return new C12400c();
            }
        }

        /* renamed from: h */
        public static C12400c m19012h(kxi kxiVar) {
            return (C12400c) new b0(kxiVar, f16253d).m6505a(C12400c.class);
        }

        @Override // p001o.dxi
        /* renamed from: e */
        public void mo6354e() {
            super.mo6354e();
            int iM22193p = this.f16254b.m22193p();
            for (int i = 0; i < iM22193p; i++) {
                ((C12398a) this.f16254b.m22194q(i)).m19004c(true);
            }
            this.f16254b.clear();
        }

        /* renamed from: f */
        public void m19013f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f16254b.m22193p() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i = 0; i < this.f16254b.m22193p(); i++) {
                    C12398a c12398a = (C12398a) this.f16254b.m22194q(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f16254b.m22189k(i));
                    printWriter.print(": ");
                    printWriter.println(c12398a.toString());
                    c12398a.m19005d(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        /* renamed from: g */
        public void m19014g() {
            this.f16255c = false;
        }

        /* renamed from: i */
        public C12398a m19015i(int i) {
            return (C12398a) this.f16254b.m22184f(i);
        }

        /* renamed from: j */
        public boolean m19016j() {
            return this.f16255c;
        }

        /* renamed from: k */
        public void m19017k() {
            int iM22193p = this.f16254b.m22193p();
            for (int i = 0; i < iM22193p; i++) {
                ((C12398a) this.f16254b.m22194q(i)).m19007f();
            }
        }

        /* renamed from: l */
        public void m19018l(int i, C12398a c12398a) {
            this.f16254b.m22190l(i, c12398a);
        }

        /* renamed from: m */
        public void m19019m() {
            this.f16255c = true;
        }
    }

    public bha(xca xcaVar, kxi kxiVar) {
        this.f16242a = xcaVar;
        this.f16243b = C12400c.m19012h(kxiVar);
    }

    @Override // p001o.aha
    /* renamed from: a */
    public void mo17057a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f16243b.m19013f(str, fileDescriptor, printWriter, strArr);
    }

    @Override // p001o.aha
    /* renamed from: c */
    public wga mo17058c(int i, Bundle bundle, aha.InterfaceC12172a interfaceC12172a) {
        if (this.f16243b.m19016j()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        C12398a c12398aM19015i = this.f16243b.m19015i(i);
        if (f16241c) {
            StringBuilder sb = new StringBuilder();
            sb.append("initLoader in ");
            sb.append(this);
            sb.append(": args=");
            sb.append(bundle);
        }
        if (c12398aM19015i == null) {
            return m19002e(i, bundle, interfaceC12172a, null);
        }
        if (f16241c) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("  Re-using existing loader ");
            sb2.append(c12398aM19015i);
        }
        return c12398aM19015i.m19008g(this.f16242a, interfaceC12172a);
    }

    @Override // p001o.aha
    /* renamed from: d */
    public void mo17059d() {
        this.f16243b.m19017k();
    }

    /* renamed from: e */
    public final wga m19002e(int i, Bundle bundle, aha.InterfaceC12172a interfaceC12172a, wga wgaVar) {
        try {
            this.f16243b.m19019m();
            wga wgaVarOnCreateLoader = interfaceC12172a.onCreateLoader(i, bundle);
            if (wgaVarOnCreateLoader == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (wgaVarOnCreateLoader.getClass().isMemberClass() && !Modifier.isStatic(wgaVarOnCreateLoader.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + wgaVarOnCreateLoader);
            }
            C12398a c12398a = new C12398a(i, bundle, wgaVarOnCreateLoader, wgaVar);
            if (f16241c) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Created new loader ");
                sb.append(c12398a);
            }
            this.f16243b.m19018l(i, c12398a);
            this.f16243b.m19014g();
            return c12398a.m19008g(this.f16242a, interfaceC12172a);
        } catch (Throwable th) {
            this.f16243b.m19014g();
            throw th;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        p75.m43084a(this.f16242a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
