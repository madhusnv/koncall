package j7;

import c9.C0914i;
import d7.InterfaceC1649u;
import d7.b1;
import g7.C2536a;
import java.io.PrintWriter;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4147e;
import kotlin.jvm.internal.a0;
import nf.C5042d;
import og.v0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j7.e */
/* loaded from: classes.dex */
public final class C3598e extends AbstractC3594a {

    /* renamed from: a */
    public final Object f19222a;

    /* renamed from: b */
    public final C3597d f19223b;

    public C3598e(InterfaceC1649u interfaceC1649u, b1 store) {
        this.f19222a = interfaceC1649u;
        AbstractC4154l.m8923f(store, "store");
        C2536a defaultCreationExtras = C2536a.f13867b;
        AbstractC4154l.m8923f(defaultCreationExtras, "defaultCreationExtras");
        C0914i c0914i = new C0914i(store, C3597d.f19219d, defaultCreationExtras);
        C4147e c4147eM8901a = a0.m8901a(C3597d.class);
        String strM8913b = c4147eM8901a.m8913b();
        if (strM8913b == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        this.f19223b = (C3597d) c0914i.m2630j(c4147eM8901a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strM8913b));
    }

    /* renamed from: b */
    public final void m8160b(String str, PrintWriter printWriter) {
        C3597d c3597d = this.f19223b;
        if (c3597d.f19220b.m5649f() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            for (int i10 = 0; i10 < c3597d.f19220b.m5649f(); i10++) {
                C3595b c3595b = (C3595b) c3597d.f19220b.m5650g(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(c3597d.f19220b.m5647d(i10));
                printWriter.print(": ");
                printWriter.println(c3595b.toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                printWriter.println(c3595b.f19214l);
                C5042d c5042d = c3595b.f19214l;
                String str3 = str2 + "  ";
                c5042d.getClass();
                printWriter.print(str3);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mListener=");
                printWriter.println(c5042d.f24806a);
                if (c5042d.f24807b || c5042d.f24810e) {
                    printWriter.print(str3);
                    printWriter.print("mStarted=");
                    printWriter.print(c5042d.f24807b);
                    printWriter.print(" mContentChanged=");
                    printWriter.print(c5042d.f24810e);
                    printWriter.print(" mProcessingChange=");
                    printWriter.println(false);
                }
                if (c5042d.f24808c || c5042d.f24809d) {
                    printWriter.print(str3);
                    printWriter.print("mAbandoned=");
                    printWriter.print(c5042d.f24808c);
                    printWriter.print(" mReset=");
                    printWriter.println(c5042d.f24809d);
                }
                if (c5042d.f24812g != null) {
                    printWriter.print(str3);
                    printWriter.print("mTask=");
                    printWriter.print(c5042d.f24812g);
                    printWriter.print(" waiting=");
                    c5042d.f24812g.getClass();
                    printWriter.println(false);
                }
                if (c5042d.f24813h != null) {
                    printWriter.print(str3);
                    printWriter.print("mCancellingTask=");
                    printWriter.print(c5042d.f24813h);
                    printWriter.print(" waiting=");
                    c5042d.f24813h.getClass();
                    printWriter.println(false);
                }
                if (c3595b.f19216n != null) {
                    printWriter.print(str2);
                    printWriter.print("mCallbacks=");
                    printWriter.println(c3595b.f19216n);
                    C3596c c3596c = c3595b.f19216n;
                    c3596c.getClass();
                    printWriter.print(str2 + "  ");
                    printWriter.print("mDeliveredData=");
                    printWriter.println(c3596c.f19218b);
                }
                printWriter.print(str2);
                printWriter.print("mData=");
                C5042d c5042d2 = c3595b.f19214l;
                Object objMo5314d = c3595b.mo5314d();
                c5042d2.getClass();
                StringBuilder sb2 = new StringBuilder(64);
                v0.m11008a(objMo5314d, sb2);
                sb2.append("}");
                printWriter.println(sb2.toString());
                printWriter.print(str2);
                printWriter.print("mStarted=");
                printWriter.println(c3595b.f8085c > 0);
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        v0.m11008a(this.f19222a, sb2);
        sb2.append("}}");
        return sb2.toString();
    }
}
